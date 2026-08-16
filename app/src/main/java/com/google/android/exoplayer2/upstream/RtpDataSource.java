package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.google.android.exoplayer2.util.rtp.AluRtpDistributionFeedbackFactory;
import com.google.android.exoplayer2.util.rtp.DefaultRtpDistributionFeedbackFactory;
import com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback;
import com.google.android.exoplayer2.util.rtp.RtpPacket;
import com.google.android.exoplayer2.util.rtp.RtpPacketQueue;
import com.google.android.exoplayer2.util.rtp.rtcp.RtcpSessionUtils;
import java.io.IOException;
import java.util.Map;
import p000.C4949od;

/* JADX INFO: loaded from: classes2.dex */
public final class RtpDataSource implements DataSource {
    public static final int MTU_SIZE = 1500;
    private RtpAuthTokenSourceHolder authTokenSourceHolder;
    private RtpBurstSourceHolder burstSourceHolder;
    private DataSpec dataSpec;
    private RtpDistributionFeedback distributionFeedback;
    private RtpDistributionSourceHolder distributionSourceHolder;
    private final RtpDistributionFeedback.RtpFeedbackProperties feedbackProperties;
    private long lastTimeStampBytesReaded;
    private final TransferListener listener;
    private boolean opened;
    private RtpRetransmissionSourceHolder retransmissionSourceHolder;

    public class RtpAuthTokenSourceHolder implements RtpDistributionFeedback.RtpFeedbackTargetSource.AuthTokenEventListener, Handler.Callback {
        private static final int MSG_SOURCE_RELEASE = 4;
        private RtpDistributionFeedback.RtpAuthTokenSource authTokenSource;
        private final Handler mediaHandler;
        private final Loader mediaLoader;
        private final HandlerThread mediaThread;
        private boolean opened;
        private boolean released;

        public RtpAuthTokenSourceHolder(RtpDistributionFeedback rtpDistributionFeedback) {
            HandlerThread handlerThread = new HandlerThread("Handler:RtpBurstSource", -16);
            this.mediaThread = handlerThread;
            handlerThread.start();
            this.mediaHandler = new Handler(handlerThread.getLooper(), this);
            this.mediaLoader = new Loader("Loader:RtpBurstSource");
            this.opened = false;
            this.released = true;
            try {
                this.authTokenSource = rtpDistributionFeedback.createAuthTokenSource(this);
            } catch (RtpDistributionFeedback.UnsupportedRtpDistributionFeedbackSourceException unused) {
                this.mediaHandler.sendEmptyMessage(4);
            }
        }

        public void close() {
            if (this.opened) {
                if (!this.authTokenSource.isLoadCanceled()) {
                    this.authTokenSource.cancelLoad();
                    this.authTokenSource.close();
                }
                this.opened = false;
            }
            release();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 4) {
                throw new IllegalStateException();
            }
            release();
            return true;
        }

        public boolean isOpened() {
            return this.opened;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTargetSource.AuthTokenEventListener
        public void onAuthTokenResponse() {
            try {
                if (RtpDataSource.this.burstSourceHolder != null) {
                    RtpDataSource.this.burstSourceHolder.open(Uri.parse((String) RtpDataSource.this.feedbackProperties.getSnapshot().get(3)));
                }
            } catch (IOException unused) {
            }
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTargetSource.AuthTokenEventListener
        public void onAuthTokenResponseBeforeError() {
            close();
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTargetSource.AuthTokenEventListener
        public void onAuthTokenResponseBeforeTimeout() {
            close();
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTargetSource.AuthTokenEventListener
        public void onAuthTokenResponseUnexpected() {
            close();
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTargetSource.AuthTokenEventListener
        public void onRtpAuthTokenSourceCanceled() {
            close();
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTargetSource.AuthTokenEventListener
        public void onRtpAuthTokenSourceError() {
            close();
        }

        public void open(Uri uri) throws IOException {
            if (this.opened) {
                return;
            }
            this.authTokenSource.open(uri);
            this.mediaHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.upstream.RtpDataSource.RtpAuthTokenSourceHolder.1
                @Override // java.lang.Runnable
                public void run() {
                    RtpAuthTokenSourceHolder.this.mediaLoader.startLoading(RtpAuthTokenSourceHolder.this.authTokenSource, RtpAuthTokenSourceHolder.this.authTokenSource, 0);
                }
            });
            this.authTokenSource.sendAuthTokenRequest();
            this.opened = true;
            this.released = false;
        }

        public void release() {
            if (this.released) {
                return;
            }
            this.mediaHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.upstream.RtpDataSource.RtpAuthTokenSourceHolder.2
                @Override // java.lang.Runnable
                public void run() {
                    RtpAuthTokenSourceHolder.this.mediaLoader.release();
                }
            });
            this.mediaThread.quit();
            this.released = true;
        }
    }

    public class RtpBurstSourceHolder implements RtpDistributionFeedback.RtpFeedbackTargetSource.BurstEventListener, Handler.Callback {
        private static final int MSG_SOURCE_RELEASE = 1;
        private RtpDistributionFeedback.RtpBurstSource burstSource;
        private boolean error;
        private final ConditionVariable loadCondition;
        private final Handler mediaHandler;
        private final Loader mediaLoader;
        private final HandlerThread mediaThread;
        private boolean opened;
        private RtpPacketQueue packetQueue;
        private boolean released;

        public RtpBurstSourceHolder(RtpDistributionFeedback rtpDistributionFeedback) {
            HandlerThread handlerThread = new HandlerThread("Handler:RtpBurstSource", -16);
            this.mediaThread = handlerThread;
            handlerThread.start();
            this.mediaHandler = new Handler(handlerThread.getLooper(), this);
            this.mediaLoader = new Loader("Loader:RtpBurstSource");
            this.loadCondition = new ConditionVariable();
            this.opened = false;
            this.error = false;
            this.released = true;
            try {
                RtpDistributionFeedback.RtpBurstSource rtpBurstSourceCreateBurstSource = rtpDistributionFeedback.createBurstSource(this);
                this.burstSource = rtpBurstSourceCreateBurstSource;
                this.packetQueue = new RtpPacketQueue(rtpBurstSourceCreateBurstSource.getMaxBufferCapacity());
            } catch (RtpDistributionFeedback.UnsupportedRtpDistributionFeedbackSourceException unused) {
                this.mediaHandler.sendEmptyMessage(1);
            }
        }

        public void close() {
            if (this.opened) {
                if (!this.burstSource.isLoadCanceled()) {
                    this.burstSource.cancelLoad();
                    this.burstSource.close();
                }
                this.opened = false;
                this.loadCondition.open();
            }
            release();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                throw new IllegalStateException();
            }
            release();
            return true;
        }

        public boolean isDataAvailable() {
            RtpPacketQueue rtpPacketQueue = this.packetQueue;
            return rtpPacketQueue != null && rtpPacketQueue.isDataAvailable();
        }

        public boolean isError() {
            return this.error;
        }

        public boolean isOpened() {
            return this.opened;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTargetSource.BurstEventListener
        public void oBurstRapidAcquisitionResponseBeforeTimeout() {
            close();
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTargetSource.BurstEventListener
        public void onBurstRapidAcquisitionAccepted() {
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTargetSource.BurstEventListener
        public void onBurstRapidAcquisitionCompleted() {
            try {
                this.burstSource.sendBurstTerminationRequest();
            } catch (IOException unused) {
            } finally {
                close();
            }
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTargetSource.BurstEventListener
        public void onBurstRapidAcquisitionRejected() {
            try {
                this.burstSource.sendBurstTerminationRequest();
            } catch (IOException unused) {
            } finally {
                close();
            }
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTargetSource.BurstEventListener
        public void onInvalidToken() {
            close();
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTargetSource.BurstEventListener
        public void onMulticastJoinSignal() {
            try {
                RtpDataSource.this.distributionSourceHolder.open(RtpDataSource.this.dataSpec.uri);
            } catch (IOException unused) {
                close();
            }
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTargetSource.BurstEventListener
        public void onRtpBurstSourceCanceled() {
            close();
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTargetSource.BurstEventListener
        public void onRtpBurstSourceError() {
            try {
                if (!RtpDataSource.this.distributionSourceHolder.isOpened()) {
                    RtpDataSource.this.distributionSourceHolder.open(RtpDataSource.this.dataSpec.uri);
                }
            } catch (IOException unused) {
            } finally {
                this.error = true;
                close();
            }
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTargetSource.BurstEventListener
        public void onRtpPacketBurstReceived(RtpPacket rtpPacket) {
            this.packetQueue.push(rtpPacket);
            this.loadCondition.open();
        }

        public void open(Uri uri) throws IOException {
            if (this.opened) {
                return;
            }
            this.burstSource.open(uri);
            this.mediaHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.upstream.RtpDataSource.RtpBurstSourceHolder.1
                @Override // java.lang.Runnable
                public void run() {
                    RtpBurstSourceHolder.this.mediaLoader.startLoading(RtpBurstSourceHolder.this.burstSource, RtpBurstSourceHolder.this.burstSource, 0);
                }
            });
            this.burstSource.sendBurstRapidAcquisitionRequest(RtpDataSource.this.dataSpec.uri);
            this.opened = true;
            this.released = false;
        }

        public int read(byte[] bArr, int i, int i2) throws RtpDataSourceException {
            if (this.error && !this.packetQueue.isDataAvailable()) {
                throw new RtpDataSourceException("RtpBurstSource is closed");
            }
            if (!this.packetQueue.isDataAvailable()) {
                this.loadCondition.block();
            }
            int i3 = this.packetQueue.get(bArr, i, i2);
            this.loadCondition.close();
            return i3;
        }

        public void release() {
            if (this.released) {
                return;
            }
            this.mediaHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.upstream.RtpDataSource.RtpBurstSourceHolder.2
                @Override // java.lang.Runnable
                public void run() {
                    RtpBurstSourceHolder.this.mediaLoader.release();
                }
            });
            this.mediaThread.quit();
            this.released = true;
        }
    }

    public static final class RtpDataSourceException extends IOException {
        public RtpDataSourceException(Exception exc) {
            super(exc);
        }

        public RtpDataSourceException(String str) {
            super(str);
        }
    }

    public class RtpDistributionSourceHolder implements RtpDistributionFeedback.RtpDistributionEventListener, Handler.Callback {
        private static final int MSG_SOURCE_RELEASE = 1;
        private RtpDistributionFeedback.RtpDistributionSource distributionSource;
        private boolean error;
        private final ConditionVariable loadCondition;
        private final Handler mediaHandler;
        private final Loader mediaLoader;
        private final HandlerThread mediaThread;
        private boolean opened;
        private RtpPacketQueue packetQueue;
        private boolean released;

        public RtpDistributionSourceHolder(RtpDistributionFeedback rtpDistributionFeedback) {
            HandlerThread handlerThread = new HandlerThread("Handler:RtpDistributionSource", -16);
            this.mediaThread = handlerThread;
            handlerThread.start();
            this.mediaHandler = new Handler(handlerThread.getLooper(), this);
            this.mediaLoader = new Loader("Loader:RtpDistributionSource");
            this.loadCondition = new ConditionVariable();
            this.opened = false;
            this.released = true;
            try {
                RtpDistributionFeedback.RtpDistributionSource rtpDistributionSourceCreateDistributionSource = rtpDistributionFeedback.createDistributionSource(this);
                this.distributionSource = rtpDistributionSourceCreateDistributionSource;
                this.packetQueue = new RtpPacketQueue(rtpDistributionSourceCreateDistributionSource.getMaxBufferCapacity());
            } catch (RtpDistributionFeedback.UnsupportedRtpDistributionFeedbackSourceException unused) {
                this.mediaHandler.sendEmptyMessage(1);
            }
        }

        public void close() {
            if (this.opened) {
                if (!this.distributionSource.isLoadCanceled()) {
                    this.distributionSource.cancelLoad();
                    this.distributionSource.close();
                }
                this.opened = false;
                this.loadCondition.open();
            }
            release();
        }

        public int getFirstSequenceNumberAvailable() {
            return this.packetQueue.front().getSequenceNumber();
        }

        public long getFirstTimeStampAvailable() {
            return this.packetQueue.front().getTimeStamp();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                throw new IllegalStateException();
            }
            release();
            return true;
        }

        public boolean isError() {
            return this.error;
        }

        public boolean isOpened() {
            return this.opened;
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpDistributionEventListener
        public void onRtpDistributionSourceCanceled() {
            close();
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpDistributionEventListener
        public void onRtpDistributionSourceError() {
            this.error = true;
            close();
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpDistributionEventListener
        public void onRtpLostPacketDetected(int i, int i2) {
            if (RtpDataSource.this.retransmissionSourceHolder == null || !RtpDataSource.this.retransmissionSourceHolder.isOpened()) {
                return;
            }
            RtpDataSource.this.retransmissionSourceHolder.lostPacketEvent(i, i2);
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpDistributionEventListener
        public void onRtpPacketReceived(RtpPacket rtpPacket) {
            this.packetQueue.push(rtpPacket);
            this.loadCondition.open();
        }

        public void open(Uri uri) throws IOException {
            if (this.opened) {
                return;
            }
            this.distributionSource.open(uri);
            Runnable runnable = new Runnable() { // from class: com.google.android.exoplayer2.upstream.RtpDataSource.RtpDistributionSourceHolder.1
                @Override // java.lang.Runnable
                public void run() {
                    RtpDistributionSourceHolder.this.mediaLoader.startLoading(RtpDistributionSourceHolder.this.distributionSource, RtpDistributionSourceHolder.this.distributionSource, 0);
                }
            };
            this.opened = true;
            this.released = false;
            this.mediaHandler.post(runnable);
        }

        public int read(byte[] bArr, int i, int i2) throws RtpDataSourceException {
            if (!this.opened || this.error) {
                throw new RtpDataSourceException("RtpDistributionSource is closed");
            }
            if (!this.packetQueue.isDataAvailable()) {
                this.loadCondition.block();
            }
            int i3 = this.packetQueue.get(bArr, i, i2);
            this.loadCondition.close();
            return i3;
        }

        public void release() {
            if (this.released) {
                return;
            }
            this.mediaHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.upstream.RtpDataSource.RtpDistributionSourceHolder.2
                @Override // java.lang.Runnable
                public void run() {
                    RtpDistributionSourceHolder.this.mediaLoader.release();
                }
            });
            this.mediaThread.quit();
            this.released = true;
        }
    }

    public class RtpRetransmissionSourceHolder implements RtpDistributionFeedback.RtpFeedbackTargetSource.RetransmissionEventListener, Handler.Callback {
        private static final int MSG_SOURCE_RELEASE = 1;
        private boolean error;
        private final ConditionVariable loadCondition;
        private final Handler mediaHandler;
        private final Loader mediaLoader;
        private final HandlerThread mediaThread;
        private boolean opened;
        private RtpPacketQueue packetQueue;
        private boolean released;
        private RtpDistributionFeedback.RtpRetransmissionSource retransmissionSource;

        public RtpRetransmissionSourceHolder(RtpDistributionFeedback rtpDistributionFeedback) {
            HandlerThread handlerThread = new HandlerThread("Handler:RtpRetransmissionSource", -16);
            this.mediaThread = handlerThread;
            handlerThread.start();
            this.mediaHandler = new Handler(handlerThread.getLooper(), this);
            this.mediaLoader = new Loader("Loader:RtpRetransmissionSource");
            this.loadCondition = new ConditionVariable();
            this.opened = false;
            this.released = true;
            try {
                RtpDistributionFeedback.RtpRetransmissionSource rtpRetransmissionSourceCreateRetransmissionSource = rtpDistributionFeedback.createRetransmissionSource(this);
                this.retransmissionSource = rtpRetransmissionSourceCreateRetransmissionSource;
                this.packetQueue = new RtpPacketQueue(rtpRetransmissionSourceCreateRetransmissionSource.getMaxBufferCapacity());
            } catch (RtpDistributionFeedback.UnsupportedRtpDistributionFeedbackSourceException unused) {
                this.mediaHandler.sendEmptyMessage(1);
            }
        }

        public void close() {
            if (this.opened) {
                if (!this.retransmissionSource.isLoadCanceled()) {
                    try {
                        this.retransmissionSource.sendRetransmissionTerminationRequest();
                    } catch (IOException unused) {
                    }
                    this.retransmissionSource.cancelLoad();
                    this.retransmissionSource.close();
                }
                this.opened = false;
                this.loadCondition.open();
            }
            release();
        }

        public int getFirstSequenceNumberAvailable() {
            return this.packetQueue.front().getSequenceNumber();
        }

        public long getFirstTimeStampAvailable() {
            return this.packetQueue.front().getTimeStamp();
        }

        public long getMaxDelayTimeForPending() {
            return this.retransmissionSource.getMaxDelayTimeForPending();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                throw new IllegalStateException();
            }
            release();
            return true;
        }

        public boolean isDataAvailable() {
            RtpPacketQueue rtpPacketQueue = this.packetQueue;
            return rtpPacketQueue != null && rtpPacketQueue.isDataAvailable();
        }

        public boolean isDataPending() {
            return this.retransmissionSource.getPacketsRecoveryPending() > 0;
        }

        public boolean isError() {
            return this.error;
        }

        public boolean isOpened() {
            return this.opened;
        }

        public void lostPacketEvent(int i, int i2) {
            if (this.retransmissionSource.getPacketsRecoveryPending() + i2 >= this.retransmissionSource.getMaxPacketsRecoveryPending()) {
                this.retransmissionSource.resetAllPacketsRecoveryPending(0L);
            } else {
                try {
                    this.retransmissionSource.sendRetransmissionPacketRequest(i, i2);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTargetSource.RetransmissionEventListener
        public void onInvalidToken() {
            close();
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTargetSource.RetransmissionEventListener
        public void onRtpPacketLossReceived(RtpPacket rtpPacket) {
            this.packetQueue.push(rtpPacket);
            this.loadCondition.open();
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTargetSource.RetransmissionEventListener
        public void onRtpRetransmissionSourceCanceled() {
            close();
        }

        @Override // com.google.android.exoplayer2.util.rtp.RtpDistributionFeedback.RtpFeedbackTargetSource.RetransmissionEventListener
        public void onRtpRetransmissionSourceError() {
            this.error = true;
            close();
        }

        public void open(Uri uri) throws IOException {
            if (this.opened) {
                return;
            }
            this.retransmissionSource.open(uri);
            this.mediaHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.upstream.RtpDataSource.RtpRetransmissionSourceHolder.1
                @Override // java.lang.Runnable
                public void run() {
                    RtpRetransmissionSourceHolder.this.mediaLoader.startLoading(RtpRetransmissionSourceHolder.this.retransmissionSource, RtpRetransmissionSourceHolder.this.retransmissionSource, 0);
                }
            });
            this.opened = true;
            this.released = false;
        }

        public int read(byte[] bArr, int i, int i2) throws RtpDataSourceException {
            if (this.error && !this.packetQueue.isDataAvailable()) {
                throw new RtpDataSourceException("RtpRetransmissionSource is closed");
            }
            if (!this.packetQueue.isDataAvailable()) {
                this.loadCondition.block();
            }
            int i3 = this.packetQueue.get(bArr, i, i2);
            this.loadCondition.close();
            return i3;
        }

        public void release() {
            if (this.released) {
                return;
            }
            this.mediaHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.upstream.RtpDataSource.RtpRetransmissionSourceHolder.2
                @Override // java.lang.Runnable
                public void run() {
                    RtpRetransmissionSourceHolder.this.mediaLoader.release();
                }
            });
            this.mediaThread.quit();
            this.released = true;
        }

        public void resetAllPacketsRecoveryPending(long j) {
            this.retransmissionSource.resetAllPacketsRecoveryPending(j);
        }
    }

    public RtpDataSource(TransferListener transferListener) {
        this(transferListener, new RtpDistributionFeedback.RtpFeedbackProperties());
    }

    private RtpDistributionFeedback buildRtpDistributionFeedback() {
        if (this.feedbackProperties.getSnapshot().containsKey(2) && ((Integer) this.feedbackProperties.getSnapshot().get(2)).intValue() == 3) {
            return new AluRtpDistributionFeedbackFactory(RtcpSessionUtils.SSRC(), RtcpSessionUtils.CNAME()).createDistributionFeedback();
        }
        return new DefaultRtpDistributionFeedbackFactory(RtcpSessionUtils.SSRC(), RtcpSessionUtils.CNAME()).createDistributionFeedback();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener transferListener) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        RtpBurstSourceHolder rtpBurstSourceHolder = this.burstSourceHolder;
        if (rtpBurstSourceHolder != null && rtpBurstSourceHolder.isOpened()) {
            this.burstSourceHolder.close();
        }
        RtpRetransmissionSourceHolder rtpRetransmissionSourceHolder = this.retransmissionSourceHolder;
        if (rtpRetransmissionSourceHolder != null && rtpRetransmissionSourceHolder.isOpened()) {
            this.retransmissionSourceHolder.close();
        }
        RtpDistributionSourceHolder rtpDistributionSourceHolder = this.distributionSourceHolder;
        if (rtpDistributionSourceHolder != null && rtpDistributionSourceHolder.isOpened()) {
            this.distributionSourceHolder.close();
        }
        if (this.opened) {
            this.opened = false;
            TransferListener transferListener = this.listener;
            if (transferListener != null) {
                transferListener.onTransferEnd(this, this.dataSpec, true);
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public /* synthetic */ Map getResponseHeaders() {
        return C4949od.m22759a(this);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Uri getUri() {
        return this.dataSpec.uri;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws RtpDataSourceException {
        this.dataSpec = dataSpec;
        RtpDistributionFeedback rtpDistributionFeedbackBuildRtpDistributionFeedback = buildRtpDistributionFeedback();
        this.distributionFeedback = rtpDistributionFeedbackBuildRtpDistributionFeedback;
        this.distributionSourceHolder = new RtpDistributionSourceHolder(rtpDistributionFeedbackBuildRtpDistributionFeedback);
        if (this.feedbackProperties.getSnapshot().containsKey(6)) {
            this.distributionFeedback.setFeedbackEventListener((RtpDistributionFeedback.RtpFeedbackEventListener) this.feedbackProperties.getSnapshot().get(6));
        }
        if (this.feedbackProperties.getSnapshot().containsKey(1)) {
            int iIntValue = ((Integer) this.feedbackProperties.getSnapshot().get(1)).intValue();
            if ((iIntValue & 8) == 8) {
                this.authTokenSourceHolder = new RtpAuthTokenSourceHolder(this.distributionFeedback);
                if (this.feedbackProperties.getSnapshot().containsKey(5)) {
                    try {
                        this.authTokenSourceHolder.open(Uri.parse((String) this.feedbackProperties.getSnapshot().get(5)));
                    } catch (IOException unused) {
                    }
                }
            }
            if ((iIntValue & 2) == 2) {
                this.burstSourceHolder = new RtpBurstSourceHolder(this.distributionFeedback);
                if (this.feedbackProperties.getSnapshot().containsKey(3)) {
                    try {
                        try {
                            RtpAuthTokenSourceHolder rtpAuthTokenSourceHolder = this.authTokenSourceHolder;
                            if (rtpAuthTokenSourceHolder == null || !rtpAuthTokenSourceHolder.isOpened()) {
                                this.burstSourceHolder.open(Uri.parse((String) this.feedbackProperties.getSnapshot().get(3)));
                            }
                        } catch (IOException unused2) {
                            this.distributionSourceHolder.open(dataSpec.uri);
                        }
                    } catch (IOException e) {
                        throw new RtpDataSourceException(e);
                    }
                }
            }
            RtpBurstSourceHolder rtpBurstSourceHolder = this.burstSourceHolder;
            if (rtpBurstSourceHolder == null || !rtpBurstSourceHolder.isOpened()) {
                try {
                    if (!this.distributionSourceHolder.isOpened()) {
                        this.distributionSourceHolder.open(dataSpec.uri);
                    }
                } catch (IOException e2) {
                    throw new RtpDataSourceException(e2);
                }
            }
            if ((iIntValue & 4) == 4) {
                this.retransmissionSourceHolder = new RtpRetransmissionSourceHolder(this.distributionFeedback);
                if (this.feedbackProperties.getSnapshot().containsKey(4)) {
                    try {
                        this.retransmissionSourceHolder.open(Uri.parse((String) this.feedbackProperties.getSnapshot().get(4)));
                    } catch (IOException unused3) {
                    }
                }
            }
        } else {
            try {
                this.distributionSourceHolder.open(dataSpec.uri);
            } catch (IOException e3) {
                throw new RtpDataSourceException(e3);
            }
        }
        TransferListener transferListener = this.listener;
        if (transferListener != null) {
            transferListener.onTransferStart(this, dataSpec, true);
        }
        this.opened = true;
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        r1 = r6.retransmissionSourceHolder.read(r7, r8, r9);
     */
    @Override // com.google.android.exoplayer2.upstream.DataSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int read(byte[] bArr, int i, int i2) throws RtpDataSourceException {
        RtpBurstSourceHolder rtpBurstSourceHolder;
        int i3 = 0;
        if (this.distributionSourceHolder.isOpened()) {
            RtpBurstSourceHolder rtpBurstSourceHolder2 = this.burstSourceHolder;
            if (rtpBurstSourceHolder2 == null || !(rtpBurstSourceHolder2.isOpened() || this.burstSourceHolder.isDataAvailable())) {
                RtpRetransmissionSourceHolder rtpRetransmissionSourceHolder = this.retransmissionSourceHolder;
                if (rtpRetransmissionSourceHolder == null) {
                    i3 = this.distributionSourceHolder.read(bArr, i, i2);
                } else if (rtpRetransmissionSourceHolder.isDataAvailable()) {
                    if (this.retransmissionSourceHolder.getFirstSequenceNumberAvailable() < this.distributionSourceHolder.getFirstSequenceNumberAvailable()) {
                        i3 = this.distributionSourceHolder.read(bArr, i, i2);
                    } else {
                        i3 = this.distributionSourceHolder.read(bArr, i, i2);
                    }
                } else if (!this.retransmissionSourceHolder.isDataPending()) {
                    i3 = this.distributionSourceHolder.read(bArr, i, i2);
                } else if (((int) (System.currentTimeMillis() - this.lastTimeStampBytesReaded)) > this.retransmissionSourceHolder.getMaxDelayTimeForPending()) {
                    this.retransmissionSourceHolder.resetAllPacketsRecoveryPending(this.distributionSourceHolder.getFirstTimeStampAvailable());
                    i3 = this.distributionSourceHolder.read(bArr, i, i2);
                }
            } else {
                rtpBurstSourceHolder = this.burstSourceHolder;
                i3 = rtpBurstSourceHolder.read(bArr, i, i2);
            }
        } else {
            rtpBurstSourceHolder = this.burstSourceHolder;
            if (rtpBurstSourceHolder != null) {
                i3 = rtpBurstSourceHolder.read(bArr, i, i2);
            }
        }
        if (i3 > 0) {
            this.listener.onBytesTransferred(this, this.dataSpec, true, i3);
            this.lastTimeStampBytesReaded = System.currentTimeMillis();
        }
        return i3;
    }

    public void setFeedbackProperty(int i, Object obj) {
        this.feedbackProperties.set(Integer.valueOf(i), obj);
    }

    public RtpDataSource(TransferListener transferListener, RtpDistributionFeedback.RtpFeedbackProperties rtpFeedbackProperties) {
        this.listener = transferListener;
        this.feedbackProperties = rtpFeedbackProperties == null ? new RtpDistributionFeedback.RtpFeedbackProperties() : rtpFeedbackProperties;
    }
}
