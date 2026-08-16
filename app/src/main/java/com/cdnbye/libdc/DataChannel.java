package com.cdnbye.libdc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class DataChannel {

    public static final class CppProxy extends DataChannel {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        /* JADX WARN: Invalid debug info offset */
        private CppProxy(long j) {
        }

        public static native void nativeDestroy(long j);

        private native int native_bufferedAmount(long j);

        private native void native_close(long j);

        private native boolean native_isClosed(long j);

        private native boolean native_isOpen(long j);

        private native int native_maxMessageSize(long j);

        private native void native_onBufferedAmountLow(long j, DcEventCallback dcEventCallback);

        private native void native_onClosed(long j, DcEventCallback dcEventCallback);

        private native void native_onError(long j, DcErrorCallback dcErrorCallback);

        private native void native_onMessage(long j, DcMessageCallback dcMessageCallback);

        private native void native_onOpen(long j, DcEventCallback dcEventCallback);

        private native boolean native_sendBinary(long j, byte[] bArr);

        private native boolean native_sendText(long j, String str);

        private native void native_setBufferedAmountLowThreshold(long j, int i);

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.DataChannel
        public int bufferedAmount() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.DataChannel
        public void close() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.DataChannel
        public boolean isClosed() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.DataChannel
        public boolean isOpen() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.DataChannel
        public int maxMessageSize() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.DataChannel
        public void onBufferedAmountLow(DcEventCallback dcEventCallback) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.DataChannel
        public void onClosed(DcEventCallback dcEventCallback) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.DataChannel
        public void onError(DcErrorCallback dcErrorCallback) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.DataChannel
        public void onMessage(DcMessageCallback dcMessageCallback) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.DataChannel
        public void onOpen(DcEventCallback dcEventCallback) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.DataChannel
        public boolean sendBinary(byte[] bArr) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.DataChannel
        public boolean sendText(String str) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.cdnbye.libdc.DataChannel
        public void setBufferedAmountLowThreshold(int i) {
        }
    }

    public abstract int bufferedAmount();

    public abstract void close();

    public abstract boolean isClosed();

    public abstract boolean isOpen();

    public abstract int maxMessageSize();

    public abstract void onBufferedAmountLow(@Nullable DcEventCallback dcEventCallback);

    public abstract void onClosed(@Nullable DcEventCallback dcEventCallback);

    public abstract void onError(@Nullable DcErrorCallback dcErrorCallback);

    public abstract void onMessage(@Nullable DcMessageCallback dcMessageCallback);

    public abstract void onOpen(@Nullable DcEventCallback dcEventCallback);

    public abstract boolean sendBinary(@NonNull byte[] bArr);

    public abstract boolean sendText(@NonNull String str);

    public abstract void setBufferedAmountLowThreshold(int i);
}
