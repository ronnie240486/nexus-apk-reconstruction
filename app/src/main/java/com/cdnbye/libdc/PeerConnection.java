package com.cdnbye.libdc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class PeerConnection {

    public static final class CppProxy extends PeerConnection {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        /* JADX WARN: Invalid debug info offset */
        private CppProxy(long j) {
        }

        public static native void nativeDestroy(long j);

        private native void native_addRemoteCandidate(long j, String str, String str2);

        private native int native_bytesReceived(long j);

        private native int native_bytesSent(long j);

        private native void native_clearStats(long j);

        private native void native_close(long j);

        private native DataChannel native_createDataChannel(long j, String str, DataChannelInit dataChannelInit);

        private native GatheringState native_gatheringState(long j);

        private native void native_onDataChannel(long j, DcCallback dcCallback);

        private native void native_onGatheringStateChange(long j, GatheringStateCallback gatheringStateCallback);

        private native void native_onLocalCandidate(long j, CandidateCallback candidateCallback);

        private native void native_onLocalDescription(long j, SdpCallback sdpCallback);

        private native void native_onSignalingStateChange(long j, SignalingStateCallback signalingStateCallback);

        private native void native_onStateChange(long j, IceStateCallback iceStateCallback);

        private native long native_rtt(long j);

        private native void native_setRemoteDescription(long j, String str);

        private native SignalingState native_signalingState(long j);

        private native IceState native_state(long j);

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.PeerConnection
        public void addRemoteCandidate(String str, String str2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.PeerConnection
        public int bytesReceived() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.PeerConnection
        public int bytesSent() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.PeerConnection
        public void clearStats() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.PeerConnection
        public void close() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.PeerConnection
        public DataChannel createDataChannel(String str, DataChannelInit dataChannelInit) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.PeerConnection
        public GatheringState gatheringState() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.PeerConnection
        public void onDataChannel(DcCallback dcCallback) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.PeerConnection
        public void onGatheringStateChange(GatheringStateCallback gatheringStateCallback) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.PeerConnection
        public void onLocalCandidate(CandidateCallback candidateCallback) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.PeerConnection
        public void onLocalDescription(SdpCallback sdpCallback) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.PeerConnection
        public void onSignalingStateChange(SignalingStateCallback signalingStateCallback) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.PeerConnection
        public void onStateChange(IceStateCallback iceStateCallback) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.PeerConnection
        public long rtt() {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.PeerConnection
        public void setRemoteDescription(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.PeerConnection
        public SignalingState signalingState() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.PeerConnection
        public IceState state() {
            return null;
        }
    }

    @Nullable
    public static native PeerConnection create(@NonNull Configuration configuration);

    public static native void initLogger(@NonNull LogLevel logLevel, @Nullable LogCallback logCallback);

    public abstract void addRemoteCandidate(@NonNull String str, @NonNull String str2);

    public abstract int bytesReceived();

    public abstract int bytesSent();

    public abstract void clearStats();

    public abstract void close();

    @Nullable
    public abstract DataChannel createDataChannel(@NonNull String str, @NonNull DataChannelInit dataChannelInit);

    @NonNull
    public abstract GatheringState gatheringState();

    public abstract void onDataChannel(@Nullable DcCallback dcCallback);

    public abstract void onGatheringStateChange(@Nullable GatheringStateCallback gatheringStateCallback);

    public abstract void onLocalCandidate(@Nullable CandidateCallback candidateCallback);

    public abstract void onLocalDescription(@Nullable SdpCallback sdpCallback);

    public abstract void onSignalingStateChange(@Nullable SignalingStateCallback signalingStateCallback);

    public abstract void onStateChange(@Nullable IceStateCallback iceStateCallback);

    public abstract long rtt();

    public abstract void setRemoteDescription(@NonNull String str);

    @NonNull
    public abstract SignalingState signalingState();

    @NonNull
    public abstract IceState state();
}
