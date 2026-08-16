package com.google.android.exoplayer2.util.rtp;

import android.net.Uri;
import android.util.SparseArray;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.net.NetworkUtils;
import com.google.android.exoplayer2.util.rtp.rtcp.RtcpFeedbackPacket;
import com.google.android.exoplayer2.util.rtp.rtcp.RtcpPacketBuilder;
import com.google.android.exoplayer2.util.rtp.rtcp.RtcpPacketUtils;
import com.google.android.exoplayer2.util.rtp.rtcp.RtcpTokenPacket;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.LinkedList;
import org.dom4j.p020io.SAXEventRecorder;
import p000.C1579YX;

/* JADX INFO: loaded from: classes2.dex */
public final class AluRtpDistributionFeedback implements RtpDistributionFeedback {
    private static final int BURST_SOURCE_TIMEOUT = 50;
    private static final int DISTRIBUTION_SOURCE_TIMEOUT = 2000;
    private final String cname;
    private RtpDistributionFeedback.RtpFeedbackEventListener feedbackListener;
    private final long ssrc;
    private long ssrcSender = 0;
    private boolean multicastSwitched = false;
    private boolean ssrcSenderReceived = false;
    private int firstAudioSequence = -1;
    private int firstVideoSequence = -1;
    private int lastSequenceReceived = -1;
    private final AluRtpHeaderExtensionParser rtpHeadExtParser = new AluRtpHeaderExtensionParser();

    public final class AluDefaultRtpBurstServerEvent implements RtpDistributionFeedback.RtpFeedbackEvent {
        private final String burstServer;

        public AluDefaultRtpBurstServerEvent(String str) {
            this.burstServer = str;
        }

        public String getBurstServer() {
            return this.burstServer;
        }
    }

    public final class AluDefaultRtpRetransmissionServerEvent implements RtpDistributionFeedback.RtpFeedbackEvent {
        private final String retransmissionServer;

        public AluDefaultRtpRetransmissionServerEvent(String str) {
            this.retransmissionServer = str;
        }

        public String getRetransmissionServer() {
            return this.retransmissionServer;
        }
    }

    public final class AluRtpBurstSource extends RtpDistributionFeedback.RtpBurstSource {
        private static final int MAX_BUFFER_CAPACITY = 1024;
        private boolean audioSynch;
        private final RtpDistributionFeedback.RtpFeedbackTargetSource.BurstEventListener eventListener;
        private boolean multicastJoinSignal;
        private boolean videoSynch;

        public AluRtpBurstSource(int i, RtpDistributionFeedback.RtpFeedbackTargetSource.BurstEventListener burstEventListener) {
            super(i, burstEventListener);
            this.eventListener = burstEventListener;
            this.audioSynch = false;
            this.videoSynch = false;
            this.multicastJoinSignal = false;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpBurstSource
        public int getMaxBufferCapacity() {
            return 1024;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpBurstSource
        public boolean isAuthTokenRejected(RtcpTokenPacket rtcpTokenPacket) {
            return false;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpBurstSource
        public boolean isRapidAcquisitionAccepted(RtcpFeedbackPacket rtcpFeedbackPacket) {
            return true;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpBurstSource
        public boolean isRapidAcquisitionResponse(RtcpFeedbackPacket rtcpFeedbackPacket) {
            return true;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpBurstSource
        public boolean processRtpPacket(RtpPacket rtpPacket) {
            if (!this.multicastJoinSignal && AluRtpDistributionFeedback.isMulticastJoinSignal(rtpPacket)) {
                this.eventListener.onMulticastJoinSignal();
                this.multicastJoinSignal = true;
            }
            if (!AluRtpDistributionFeedback.this.ssrcSenderReceived) {
                AluRtpDistributionFeedback.this.ssrcSender = rtpPacket.getSsrc();
                AluRtpDistributionFeedback.this.ssrcSenderReceived = true;
            }
            if (AluRtpDistributionFeedback.isAudioPacket(rtpPacket)) {
                if (this.audioSynch) {
                    return false;
                }
                if (AluRtpDistributionFeedback.this.firstAudioSequence == rtpPacket.getSequenceNumber()) {
                    this.audioSynch = true;
                    if (this.videoSynch) {
                        AluRtpDistributionFeedback.this.multicastSwitched = true;
                        this.eventListener.onBurstRapidAcquisitionCompleted();
                    }
                    return false;
                }
                if (this.videoSynch) {
                    this.audioSynch = true;
                    AluRtpDistributionFeedback.this.multicastSwitched = true;
                    this.eventListener.onBurstRapidAcquisitionCompleted();
                    return false;
                }
            } else {
                if (this.videoSynch) {
                    return false;
                }
                if (AluRtpDistributionFeedback.this.firstVideoSequence == rtpPacket.getSequenceNumber()) {
                    this.videoSynch = true;
                    if (this.audioSynch) {
                        AluRtpDistributionFeedback.this.multicastSwitched = true;
                        this.eventListener.onBurstRapidAcquisitionCompleted();
                    }
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTarget.BurstMessages
        public void sendBurstRapidAcquisitionRequest(Uri uri) throws IOException {
            byte[] bArr = new byte[0];
            try {
                InetAddress byName = InetAddress.getByName(uri.getHost());
                InetAddress byName2 = InetAddress.getByName(NetworkUtils.getLocalAddress());
                byte[] bArrLongToBytes = RtcpPacketUtils.longToBytes(300L, 2);
                byte[] bArrBuildAppPacket = RtcpPacketBuilder.buildAppPacket(AluRtpDistributionFeedback.this.ssrc, AluRtpDistributionFeedback.this.cname, "FCCR", RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(RtcpPacketUtils.append(bArr, bArrLongToBytes), RtcpPacketUtils.longToBytes(uri.getPort(), 2)), byName.getAddress()), new byte[2]), RtcpPacketUtils.swapBytes(RtcpPacketUtils.longToBytes(0L, 2))), RtcpPacketUtils.swapBytes(byName2.getAddress())));
                sendMessageFromBytes(bArrBuildAppPacket, bArrBuildAppPacket.length);
                this.eventListener.onBurstRapidAcquisitionAccepted();
            } catch (UnknownHostException e) {
                throw new IOException(e);
            }
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTarget.BurstMessages
        public void sendBurstTerminationRequest() throws IOException {
            byte[] bArrBuildByePacket = RtcpPacketBuilder.buildByePacket(AluRtpDistributionFeedback.this.ssrc, AluRtpDistributionFeedback.this.cname);
            sendMessageFromBytes(bArrBuildByePacket, bArrBuildByePacket.length);
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpBurstSource, com.google.android.exoplayer2.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(RtpDistributionFeedback.RtpBurstSource rtpBurstSource, long j, long j2, IOException iOException, int i) {
            this.eventListener.onRtpBurstSourceError();
            return Loader.DONT_RETRY;
        }
    }

    public final class AluRtpDistributionSource extends RtpDistributionFeedback.RtpDistributionSource {
        private static final int MAX_BUFFER_CAPACITY = 2048;
        private final RtpDistributionFeedback.RtpDistributionEventListener eventListener;

        public AluRtpDistributionSource(int i, RtpDistributionFeedback.RtpDistributionEventListener rtpDistributionEventListener) {
            super(i, rtpDistributionEventListener);
            this.eventListener = rtpDistributionEventListener;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpDistributionSource
        public int getMaxBufferCapacity() {
            return 2048;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpDistributionSource
        public boolean processRtpPacket(RtpPacket rtpPacket) {
            int sequenceNumber;
            if (AluRtpDistributionFeedback.this.feedbackListener != null && rtpPacket.isExtension() && AluRtpDistributionFeedback.isAluExtension(rtpPacket) && !AluRtpDistributionFeedback.this.rtpHeadExtParser.isLoaded()) {
                AluRtpDistributionFeedback.this.rtpHeadExtParser.parseHeader(rtpPacket.getHeaderExtension());
            }
            if (!AluRtpDistributionFeedback.this.ssrcSenderReceived) {
                AluRtpDistributionFeedback.this.ssrcSender = rtpPacket.getSsrc();
                AluRtpDistributionFeedback.this.ssrcSenderReceived = true;
            }
            if (AluRtpDistributionFeedback.this.lastSequenceReceived != -1) {
                if ((AluRtpDistributionFeedback.this.lastSequenceReceived + 1 < 65536 ? AluRtpDistributionFeedback.this.lastSequenceReceived + 1 : AluRtpDistributionFeedback.this.lastSequenceReceived - 65535) != rtpPacket.getSequenceNumber()) {
                    if (rtpPacket.getSequenceNumber() > AluRtpDistributionFeedback.this.lastSequenceReceived) {
                        sequenceNumber = rtpPacket.getSequenceNumber() - AluRtpDistributionFeedback.this.lastSequenceReceived;
                    } else {
                        sequenceNumber = rtpPacket.getSequenceNumber() + (65536 - AluRtpDistributionFeedback.this.lastSequenceReceived) + 1;
                    }
                    this.eventListener.onRtpLostPacketDetected(AluRtpDistributionFeedback.this.lastSequenceReceived, sequenceNumber);
                }
            }
            if (!AluRtpDistributionFeedback.this.multicastSwitched) {
                if (AluRtpDistributionFeedback.isAudioPacket(rtpPacket)) {
                    if (AluRtpDistributionFeedback.this.firstAudioSequence == -1) {
                        AluRtpDistributionFeedback.this.firstAudioSequence = rtpPacket.getSequenceNumber();
                    }
                } else if (AluRtpDistributionFeedback.this.firstVideoSequence == -1) {
                    AluRtpDistributionFeedback.this.firstVideoSequence = rtpPacket.getSequenceNumber();
                }
            }
            rtpPacket.setTimestamp(System.currentTimeMillis());
            AluRtpDistributionFeedback.this.lastSequenceReceived = rtpPacket.getSequenceNumber();
            return true;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(RtpDistributionFeedback.RtpDistributionSource rtpDistributionSource, long j, long j2, IOException iOException, int i) {
            this.eventListener.onRtpDistributionSourceError();
            return Loader.DONT_RETRY;
        }
    }

    public final class AluRtpFeedbackConfigDiscoveryEnded implements RtpDistributionFeedback.RtpFeedbackEvent {
        public AluRtpFeedbackConfigDiscoveryEnded() {
        }
    }

    public final class AluRtpFeedbackConfigDiscoveryStarted implements RtpDistributionFeedback.RtpFeedbackEvent {
        public AluRtpFeedbackConfigDiscoveryStarted() {
        }
    }

    public final class AluRtpHeaderExtensionParser {
        private static final int INFO_SIZE = 32;
        private int skip;
        private int state;
        private final int NONE_SEEK = 0;
        private final int TYPE_SEEK = 1;
        private final int SIZE_SEEK = 2;
        private final int CHECKSUM_SEEK = 3;
        private final int INFO_SEEK = 4;

        /* JADX INFO: renamed from: info, reason: collision with root package name */
        private final byte[] f19782info = new byte[32];
        private boolean loaded = false;
        private boolean begin = false;

        public AluRtpHeaderExtensionParser() {
            reset();
        }

        private void parseId4(byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            byte b = bArr[i];
            int i5 = (b & 240) >> 4;
            int i6 = (b & SAXEventRecorder.SAXEvent.f16649r) * 256;
            byte b2 = bArr[i + 1];
            int i7 = (((b2 & 240) >> 4) * 16) + i6 + (b2 & SAXEventRecorder.SAXEvent.f16649r);
            int i8 = i + 2;
            int i9 = i + i2;
            if (i5 == 1) {
                if (i7 == 0) {
                    if (this.begin) {
                        this.loaded = true;
                        AluRtpDistributionFeedback.this.feedbackListener.onRtpFeedbackEvent(AluRtpDistributionFeedback.this.new AluRtpFeedbackConfigDiscoveryEnded());
                        return;
                    } else {
                        this.begin = true;
                        AluRtpDistributionFeedback.this.feedbackListener.onRtpFeedbackEvent(AluRtpDistributionFeedback.this.new AluRtpFeedbackConfigDiscoveryStarted());
                    }
                }
                if (this.begin) {
                    while (i8 < i9) {
                        int i10 = this.state;
                        if (i10 != 0) {
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    i3 = this.skip;
                                    if (i3 != 1) {
                                        if (i3 == 2) {
                                            if ((bArr[i8] & C1579YX.f3960d) == 0) {
                                                i4 = i3 - 1;
                                                this.skip = i4;
                                            } else {
                                                this.state = 1;
                                            }
                                        }
                                    } else if ((bArr[i8] & C1579YX.f3960d) == 32) {
                                        this.state = 3;
                                        this.skip = 2;
                                    }
                                    reset();
                                } else if (i10 == 3) {
                                    i3 = this.skip;
                                    if (i3 == 1) {
                                        this.state = 4;
                                        i4 = 0;
                                    } else if (i3 != 2) {
                                        reset();
                                    } else {
                                        i4 = i3 - 1;
                                    }
                                    this.skip = i4;
                                } else if (i10 != 4) {
                                    continue;
                                } else {
                                    int i11 = this.skip;
                                    if (i11 + 1 >= 32) {
                                        byte[] bArr2 = this.f19782info;
                                        this.skip = i11 + 1;
                                        bArr2[i11] = bArr[i8];
                                        parseInfo();
                                        reset();
                                        return;
                                    }
                                    byte[] bArr3 = this.f19782info;
                                    this.skip = i11 + 1;
                                    bArr3[i11] = bArr[i8];
                                    i8++;
                                }
                            } else if ((bArr[i8] & C1579YX.f3960d) == 2) {
                                this.state = 2;
                                this.skip = 2;
                            } else {
                                reset();
                            }
                        } else if ((bArr[i8] & C1579YX.f3960d) == 2) {
                            this.state = 1;
                        }
                        i8++;
                    }
                }
            }
        }

        private void parseId5(byte[] bArr, int i) {
            RtpDistributionFeedback.RtpFeedbackEventListener rtpFeedbackEventListener;
            RtpDistributionFeedback.RtpFeedbackEvent aluDefaultRtpBurstServerEvent;
            int i2 = bArr[i] & SAXEventRecorder.SAXEvent.f16649r;
            if (this.begin) {
                String ipAddress = toIpAddress(bArr, i + 1);
                int portNumber = toPortNumber(bArr, i + 5);
                if (i2 == 1) {
                    rtpFeedbackEventListener = AluRtpDistributionFeedback.this.feedbackListener;
                    aluDefaultRtpBurstServerEvent = AluRtpDistributionFeedback.this.new AluDefaultRtpRetransmissionServerEvent(ipAddress + ":" + portNumber);
                } else {
                    if (i2 != 3) {
                        return;
                    }
                    rtpFeedbackEventListener = AluRtpDistributionFeedback.this.feedbackListener;
                    aluDefaultRtpBurstServerEvent = AluRtpDistributionFeedback.this.new AluDefaultRtpBurstServerEvent(ipAddress + ":" + portNumber);
                }
                rtpFeedbackEventListener.onRtpFeedbackEvent(aluDefaultRtpBurstServerEvent);
            }
        }

        private void parseInfo() {
            String ipAddress = toIpAddress(this.f19782info, 0);
            int portNumber = toPortNumber(this.f19782info, 4);
            String ipAddress2 = toIpAddress(this.f19782info, 6);
            int portNumber2 = toPortNumber(this.f19782info, 10);
            String ipAddress3 = toIpAddress(this.f19782info, 12);
            int portNumber3 = toPortNumber(this.f19782info, 16);
            String ipAddress4 = toIpAddress(this.f19782info, 18);
            int portNumber4 = toPortNumber(this.f19782info, 22);
            String ipAddress5 = toIpAddress(this.f19782info, 24);
            int portNumber5 = toPortNumber(this.f19782info, 28);
            AluRtpDistributionFeedback.this.feedbackListener.onRtpFeedbackEvent(AluRtpDistributionFeedback.this.new AluRtpMulticastGroupInfoEvent(ipAddress + ":" + portNumber, ipAddress2 + ":" + portNumber2, ipAddress3 + ":" + portNumber3, ipAddress4 + ":" + portNumber4, ipAddress5 + ":" + portNumber5));
        }

        private void reset() {
            this.skip = 0;
            this.state = 0;
        }

        private String toIpAddress(byte[] bArr, int i) {
            StringBuilder sb = new StringBuilder();
            byte b = bArr[i];
            sb.append((((b & 240) >> 4) * 16) + (b & SAXEventRecorder.SAXEvent.f16649r));
            sb.append(".");
            byte b2 = bArr[i + 1];
            sb.append((((b2 & 240) >> 4) * 16) + (b2 & SAXEventRecorder.SAXEvent.f16649r));
            sb.append(".");
            byte b3 = bArr[i + 2];
            sb.append((((b3 & 240) >> 4) * 16) + (b3 & SAXEventRecorder.SAXEvent.f16649r));
            sb.append(".");
            byte b4 = bArr[i + 3];
            sb.append((((b4 & 240) >> 4) * 16) + (b4 & SAXEventRecorder.SAXEvent.f16649r));
            return sb.toString();
        }

        private int toPortNumber(byte[] bArr, int i) {
            return ((bArr[i] & C1579YX.f3960d) * 256) + bArr[i + 1];
        }

        public boolean isLoaded() {
            return this.loaded;
        }

        public boolean parseHeader(byte[] bArr) {
            int i = 4;
            while (i < bArr.length && !this.loaded) {
                byte b = bArr[i];
                int i2 = (b >> 4) & 15;
                int i3 = b & SAXEventRecorder.SAXEvent.f16649r;
                int i4 = i + 1;
                if (i2 != 1) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            parseId5(bArr, i4);
                        }
                        i = i3 + 1 + i4;
                    } else {
                        i3++;
                        parseId4(bArr, i4, i3);
                    }
                }
                i = i4 + i3;
            }
            return true;
        }
    }

    public final class AluRtpMulticastGroupInfoEvent implements RtpDistributionFeedback.RtpFeedbackEvent {
        private final String firstBurstServer;
        private final String firstRetransmissionServer;
        private final String multicastGroup;
        private final String secondBurstServer;
        private final String secondRetransmissionServer;

        public AluRtpMulticastGroupInfoEvent(String str, String str2, String str3, String str4, String str5) {
            this.multicastGroup = str;
            this.firstBurstServer = str2;
            this.secondBurstServer = str3;
            this.firstRetransmissionServer = str4;
            this.secondRetransmissionServer = str5;
        }

        public String getFirstBurstServer() {
            return this.firstBurstServer;
        }

        public String getFirstRetransmissionServer() {
            return this.firstRetransmissionServer;
        }

        public String getMulticastGroup() {
            return this.multicastGroup;
        }

        public String getSecondBurstServer() {
            return this.secondBurstServer;
        }

        public String getSecondRetransmissionServer() {
            return this.secondRetransmissionServer;
        }
    }

    public final class AluRtpRetransmissionSource extends RtpDistributionFeedback.RtpRetransmissionSource {
        private static final int MAX_BUFFER_CAPACITY = 512;
        private static final int MAX_TIMEOUT_DELAY = 1000;
        private static final double PACKET_LOSS_ACCEPTABLE = 358.4d;
        private static final int PACKET_LOSS_CAPACITY = 512;
        private static final double PACKET_LOSS_PERCENT = 0.7d;
        private final LinkedList<Integer> keys;
        private int lostPacketPending;
        private final SparseArray<Long> timestamps;

        public AluRtpRetransmissionSource(RtpDistributionFeedback.RtpFeedbackTargetSource.RetransmissionEventListener retransmissionEventListener) {
            super(retransmissionEventListener);
            this.timestamps = new SparseArray<>(512);
            this.keys = new LinkedList<>();
            this.lostPacketPending = 0;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpRetransmissionSource
        public int getMaxBufferCapacity() {
            return 512;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpRetransmissionSource
        public long getMaxDelayTimeForPending() {
            return 1000L;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpRetransmissionSource
        public int getMaxPacketsRecoveryPending() {
            return 358;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpRetransmissionSource
        public int getPacketsRecoveryPending() {
            return this.lostPacketPending;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpRetransmissionSource
        public boolean isAuthTokenRejected(RtcpTokenPacket rtcpTokenPacket) {
            return false;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpRetransmissionSource
        public boolean processRtpPacket(RtpPacket rtpPacket) {
            Long l = this.timestamps.get(rtpPacket.getSequenceNumber());
            if (l == null) {
                return false;
            }
            rtpPacket.setTimestamp(l.longValue());
            this.timestamps.remove(rtpPacket.getSequenceNumber());
            this.keys.remove(Integer.valueOf(rtpPacket.getSequenceNumber()));
            this.lostPacketPending--;
            return true;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpRetransmissionSource
        public void resetAllPacketsRecoveryPending(long j) {
            if (j <= 0) {
                this.keys.clear();
                this.timestamps.clear();
                this.lostPacketPending = 0;
                return;
            }
            for (int i = 0; i < this.keys.size(); i++) {
                int iIntValue = this.keys.get(i).intValue();
                if (this.timestamps.get(iIntValue).longValue() > j) {
                    return;
                }
                this.keys.remove(i);
                this.timestamps.remove(iIntValue);
                this.lostPacketPending--;
            }
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTarget.RetransmissionMessages
        public void sendRetransmissionPacketRequest(int i, int i2) throws IOException {
            ArrayList arrayList = new ArrayList();
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i3 = 0;
            while (i2 > 0) {
                i3++;
                int i4 = i + i3;
                if (i4 >= 65536) {
                    i4 -= 65536;
                }
                i2--;
                this.timestamps.put(i4, Long.valueOf(jCurrentTimeMillis));
                this.keys.add(Integer.valueOf(i4));
                int i5 = 0;
                int i6 = 0;
                while (i5 < 16 && i2 > 0) {
                    i6 |= 65535 & (1 << i5);
                    int i7 = i4 + i5;
                    int i8 = i7 + 1;
                    if (i8 >= 65536) {
                        i8 = (-65535) + i7;
                    }
                    this.timestamps.put(i8, Long.valueOf(jCurrentTimeMillis));
                    this.keys.add(Integer.valueOf(i8));
                    i5++;
                    i3++;
                    i2--;
                }
                arrayList.add(new RtcpPacketBuilder.NackFbElement(i4, i6));
            }
            if (arrayList.size() > 0) {
                byte[] bArrBuildNackPacket = RtcpPacketBuilder.buildNackPacket(AluRtpDistributionFeedback.this.ssrc, AluRtpDistributionFeedback.this.cname, AluRtpDistributionFeedback.this.ssrcSender, arrayList);
                sendMessageFromBytes(bArrBuildNackPacket, bArrBuildNackPacket.length);
                this.lostPacketPending += i3;
            }
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTarget.RetransmissionMessages
        public void sendRetransmissionTerminationRequest() throws IOException {
            byte[] bArrBuildByePacket = RtcpPacketBuilder.buildByePacket(AluRtpDistributionFeedback.this.ssrc, AluRtpDistributionFeedback.this.cname);
            sendMessageFromBytes(bArrBuildByePacket, bArrBuildByePacket.length);
            this.lostPacketPending = 0;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpRetransmissionSource, com.google.android.exoplayer2.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(RtpDistributionFeedback.RtpRetransmissionSource rtpRetransmissionSource, long j, long j2, IOException iOException, int i) {
            getEventListener().onRtpRetransmissionSourceError();
            return Loader.DONT_RETRY;
        }
    }

    public AluRtpDistributionFeedback(long j, String str) {
        this.ssrc = j;
        this.cname = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isAluExtension(RtpPacket rtpPacket) {
        return (rtpPacket.getHeaderExtension()[0] & C1579YX.f3960d) == 190 && (rtpPacket.getHeaderExtension()[1] & C1579YX.f3960d) == 222;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isAudioPacket(RtpPacket rtpPacket) {
        return ((rtpPacket.getHeaderExtension()[5] & 63) >> 4) == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isMulticastJoinSignal(RtpPacket rtpPacket) {
        return ((rtpPacket.getHeaderExtension()[5] & SAXEventRecorder.SAXEvent.f16649r) >> 3) == 1;
    }

    @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback
    public RtpDistributionFeedback.RtpAuthTokenSource createAuthTokenSource(RtpDistributionFeedback.RtpFeedbackTargetSource.AuthTokenEventListener authTokenEventListener) throws RtpDistributionFeedback.UnsupportedRtpDistributionFeedbackSourceException {
        throw new RtpDistributionFeedback.UnsupportedRtpDistributionFeedbackSourceException("Authentication Token Source unsupported");
    }

    @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback
    public RtpDistributionFeedback.RtpBurstSource createBurstSource(RtpDistributionFeedback.RtpFeedbackTargetSource.BurstEventListener burstEventListener) throws RtpDistributionFeedback.UnsupportedRtpDistributionFeedbackSourceException {
        return new AluRtpBurstSource(50, burstEventListener);
    }

    @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback
    public RtpDistributionFeedback.RtpDistributionSource createDistributionSource(RtpDistributionFeedback.RtpDistributionEventListener rtpDistributionEventListener) throws RtpDistributionFeedback.UnsupportedRtpDistributionFeedbackSourceException {
        return new AluRtpDistributionSource(2000, rtpDistributionEventListener);
    }

    @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback
    public RtpDistributionFeedback.RtpRetransmissionSource createRetransmissionSource(RtpDistributionFeedback.RtpFeedbackTargetSource.RetransmissionEventListener retransmissionEventListener) throws RtpDistributionFeedback.UnsupportedRtpDistributionFeedbackSourceException {
        return new AluRtpRetransmissionSource(retransmissionEventListener);
    }

    @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback
    public void setFeedbackEventListener(RtpDistributionFeedback.RtpFeedbackEventListener rtpFeedbackEventListener) {
        this.feedbackListener = rtpFeedbackEventListener;
    }
}
