package com.google.android.exoplayer2.util.rtp;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.rtp.rtcp.RtcpFeedbackPacket;
import com.google.android.exoplayer2.util.rtp.rtcp.RtcpPacketBuilder;
import com.google.android.exoplayer2.util.rtp.rtcp.RtcpTokenPacket;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultRtpDistributionFeedback implements RtpDistributionFeedback {
    private static final int BURST_SOURCE_TIMEOUT = 50;
    private static final int DISTRIBUTION_SOURCE_TIMEOUT = 2000;
    private final String cname;
    private final long ssrc;
    private long ssrcSender;
    private boolean ssrcSenderReceived;

    public final class DefaultRtpAuthTokenSource extends RtpDistributionFeedback.RtpAuthTokenSource {
        private final byte[] nonce;

        public DefaultRtpAuthTokenSource(int i, RtpDistributionFeedback.RtpFeedbackTargetSource.AuthTokenEventListener authTokenEventListener) {
            super(i, authTokenEventListener);
            byte[] bArr = new byte[32];
            this.nonce = bArr;
            new SecureRandom().nextBytes(bArr);
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpAuthTokenSource
        public byte[] getRandomNonce() {
            return this.nonce;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTarget.AuthTokenMessages
        public synchronized void sendAuthTokenRequest() throws IOException {
            byte[] bArrBuildPortMappingRequestPacket = RtcpPacketBuilder.buildPortMappingRequestPacket(DefaultRtpDistributionFeedback.this.ssrc, DefaultRtpDistributionFeedback.this.cname, getRandomNonce());
            sendMessageFromBytes(bArrBuildPortMappingRequestPacket, bArrBuildPortMappingRequestPacket.length);
            setAuthTokenResponsePending(true);
        }
    }

    public final class DefaultRtpBurstSource extends RtpDistributionFeedback.RtpBurstSource {
        private static final int MAX_BUFFER_CAPACITY = 2048;

        public DefaultRtpBurstSource(int i, RtpDistributionFeedback.RtpFeedbackTargetSource.BurstEventListener burstEventListener) {
            super(i, burstEventListener);
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpBurstSource
        public int getMaxBufferCapacity() {
            return 2048;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpBurstSource
        public boolean isAuthTokenRejected(RtcpTokenPacket rtcpTokenPacket) {
            return rtcpTokenPacket.getPayloadType() == 210 && rtcpTokenPacket.getSmt() == 4;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpBurstSource
        public boolean isRapidAcquisitionAccepted(RtcpFeedbackPacket rtcpFeedbackPacket) {
            return true;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpBurstSource
        public boolean isRapidAcquisitionResponse(RtcpFeedbackPacket rtcpFeedbackPacket) {
            return rtcpFeedbackPacket.getPayloadType() == 205 && rtcpFeedbackPacket.getFmt() == 2;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpBurstSource
        public boolean processRtpPacket(RtpPacket rtpPacket) {
            if (!DefaultRtpDistributionFeedback.this.ssrcSenderReceived) {
                DefaultRtpDistributionFeedback.this.ssrcSender = rtpPacket.getSsrc();
                DefaultRtpDistributionFeedback.this.ssrcSenderReceived = true;
            }
            return true;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTarget.BurstMessages
        public void sendBurstRapidAcquisitionRequest(Uri uri) throws IOException {
            byte[] bArrBuildRamsRequestPacket = RtcpPacketBuilder.buildRamsRequestPacket(DefaultRtpDistributionFeedback.this.ssrc, DefaultRtpDistributionFeedback.this.cname, DefaultRtpDistributionFeedback.this.ssrcSender, new ArrayList(), new ArrayList());
            sendMessageFromBytes(bArrBuildRamsRequestPacket, bArrBuildRamsRequestPacket.length);
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTarget.BurstMessages
        public void sendBurstTerminationRequest() throws IOException {
            byte[] bArrBuildRamsTerminationPacket = RtcpPacketBuilder.buildRamsTerminationPacket(DefaultRtpDistributionFeedback.this.ssrc, DefaultRtpDistributionFeedback.this.cname, DefaultRtpDistributionFeedback.this.ssrcSender, new ArrayList(), new ArrayList());
            sendMessageFromBytes(bArrBuildRamsTerminationPacket, bArrBuildRamsTerminationPacket.length);
        }
    }

    public final class DefaultRtpDistributionSource extends RtpDistributionFeedback.RtpDistributionSource {
        private static final int MAX_BUFFER_CAPACITY = 2048;
        private final RtpDistributionFeedback.RtpDistributionEventListener eventListener;

        public DefaultRtpDistributionSource(int i, RtpDistributionFeedback.RtpDistributionEventListener rtpDistributionEventListener) {
            super(i, rtpDistributionEventListener);
            this.eventListener = rtpDistributionEventListener;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpDistributionSource
        public int getMaxBufferCapacity() {
            return 2048;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpDistributionSource
        public int onLoadError(RtpDistributionFeedback.RtpDistributionSource rtpDistributionSource, long j, long j2, IOException iOException) {
            this.eventListener.onRtpDistributionSourceError();
            return RtpDistributionFeedback.ERROR_NO_RETRY;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpDistributionSource
        public boolean processRtpPacket(RtpPacket rtpPacket) {
            if (!DefaultRtpDistributionFeedback.this.ssrcSenderReceived) {
                DefaultRtpDistributionFeedback.this.ssrcSender = rtpPacket.getSsrc();
                DefaultRtpDistributionFeedback.this.ssrcSenderReceived = true;
            }
            return true;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpDistributionSource, com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCanceled(RtpDistributionFeedback.RtpDistributionSource rtpDistributionSource, long j, long j2, boolean z) {
            this.eventListener.onRtpDistributionSourceCanceled();
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpDistributionSource, com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCompleted(RtpDistributionFeedback.RtpDistributionSource rtpDistributionSource, long j, long j2) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(RtpDistributionFeedback.RtpDistributionSource rtpDistributionSource, long j, long j2, IOException iOException, int i) {
            this.eventListener.onRtpDistributionSourceError();
            return Loader.DONT_RETRY;
        }
    }

    public final class DefaultRtpRetransmissionSource extends RtpDistributionFeedback.RtpRetransmissionSource {
        private static final int MAX_BUFFER_CAPACITY = 512;
        private final RtpDistributionFeedback.RtpFeedbackTargetSource.RetransmissionEventListener eventListener;

        public DefaultRtpRetransmissionSource(RtpDistributionFeedback.RtpFeedbackTargetSource.RetransmissionEventListener retransmissionEventListener) {
            super(retransmissionEventListener);
            this.eventListener = retransmissionEventListener;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpRetransmissionSource
        public int getMaxBufferCapacity() {
            return 512;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpRetransmissionSource
        public long getMaxDelayTimeForPending() {
            return 0L;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpRetransmissionSource
        public int getMaxPacketsRecoveryPending() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpRetransmissionSource
        public int getPacketsRecoveryPending() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpRetransmissionSource
        public boolean isAuthTokenRejected(RtcpTokenPacket rtcpTokenPacket) {
            return rtcpTokenPacket.getPayloadType() == 210 && rtcpTokenPacket.getSmt() == 4;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpRetransmissionSource
        public int onLoadError(RtpDistributionFeedback.RtpRetransmissionSource rtpRetransmissionSource, long j, long j2, IOException iOException) {
            this.eventListener.onRtpRetransmissionSourceError();
            return RtpDistributionFeedback.ERROR_NO_RETRY;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpRetransmissionSource
        public boolean processRtpPacket(RtpPacket rtpPacket) {
            return true;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpRetransmissionSource
        public void resetAllPacketsRecoveryPending(long j) {
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTarget.RetransmissionMessages
        public void sendRetransmissionPacketRequest(int i, int i2) throws IOException {
            ArrayList arrayList = new ArrayList();
            System.currentTimeMillis();
            int i3 = 0;
            while (i2 > 0) {
                i3++;
                int i4 = i + i3;
                if (i4 >= 65536) {
                    i4 -= 65536;
                }
                i2--;
                int i5 = 0;
                int i6 = 0;
                while (i5 < 16 && i2 > 0) {
                    i6 |= 65535 & (1 << i5);
                    i5++;
                    i3++;
                    i2--;
                }
                arrayList.add(new RtcpPacketBuilder.NackFbElement(i4, i6));
            }
            if (arrayList.size() > 0) {
                byte[] bArrBuildNackPacket = RtcpPacketBuilder.buildNackPacket(DefaultRtpDistributionFeedback.this.ssrc, DefaultRtpDistributionFeedback.this.cname, DefaultRtpDistributionFeedback.this.ssrcSender, arrayList);
                sendMessageFromBytes(bArrBuildNackPacket, bArrBuildNackPacket.length);
            }
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTarget.RetransmissionMessages
        public void sendRetransmissionTerminationRequest() throws IOException {
            byte[] bArrBuildByePacket = RtcpPacketBuilder.buildByePacket(DefaultRtpDistributionFeedback.this.ssrc, DefaultRtpDistributionFeedback.this.cname);
            sendMessageFromBytes(bArrBuildByePacket, bArrBuildByePacket.length);
            cancelLoad();
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpRetransmissionSource, com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCanceled(RtpDistributionFeedback.RtpRetransmissionSource rtpRetransmissionSource, long j, long j2, boolean z) {
            this.eventListener.onRtpRetransmissionSourceCanceled();
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpRetransmissionSource, com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCompleted(RtpDistributionFeedback.RtpRetransmissionSource rtpRetransmissionSource, long j, long j2) {
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpRetransmissionSource, com.google.android.exoplayer2.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(RtpDistributionFeedback.RtpRetransmissionSource rtpRetransmissionSource, long j, long j2, IOException iOException, int i) {
            this.eventListener.onRtpRetransmissionSourceError();
            return Loader.DONT_RETRY;
        }
    }

    public DefaultRtpDistributionFeedback(long j, String str) {
        this.ssrc = j;
        this.cname = str;
    }

    @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback
    public RtpDistributionFeedback.RtpAuthTokenSource createAuthTokenSource(RtpDistributionFeedback.RtpFeedbackTargetSource.AuthTokenEventListener authTokenEventListener) throws RtpDistributionFeedback.UnsupportedRtpDistributionFeedbackSourceException {
        return new DefaultRtpAuthTokenSource(0, authTokenEventListener);
    }

    @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback
    public RtpDistributionFeedback.RtpBurstSource createBurstSource(RtpDistributionFeedback.RtpFeedbackTargetSource.BurstEventListener burstEventListener) throws RtpDistributionFeedback.UnsupportedRtpDistributionFeedbackSourceException {
        return new DefaultRtpBurstSource(50, burstEventListener);
    }

    @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback
    public RtpDistributionFeedback.RtpDistributionSource createDistributionSource(RtpDistributionFeedback.RtpDistributionEventListener rtpDistributionEventListener) throws RtpDistributionFeedback.UnsupportedRtpDistributionFeedbackSourceException {
        return new DefaultRtpDistributionSource(2000, rtpDistributionEventListener);
    }

    @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback
    public RtpDistributionFeedback.RtpRetransmissionSource createRetransmissionSource(RtpDistributionFeedback.RtpFeedbackTargetSource.RetransmissionEventListener retransmissionEventListener) throws RtpDistributionFeedback.UnsupportedRtpDistributionFeedbackSourceException {
        return new DefaultRtpRetransmissionSource(retransmissionEventListener);
    }

    @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback
    public void setFeedbackEventListener(RtpDistributionFeedback.RtpFeedbackEventListener rtpFeedbackEventListener) {
    }
}
