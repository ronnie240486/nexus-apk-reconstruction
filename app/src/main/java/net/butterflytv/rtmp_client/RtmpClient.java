package net.butterflytv.rtmp_client;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class RtmpClient {
    public static final int RTMP_READ_DONE = -1;
    private static final int RTMP_SUCCESS = 0;
    private static final int TIMEOUT_IN_MS = 10000;
    private int receiveTimeoutInMs;
    private long rtmpPointer;
    private int sendTimeoutInMs;

    public static class RtmpIOException extends IOException {
        public static final int CONNECTION_LOST = -14;
        public static final int DNS_NOT_REACHABLE = -6;
        public static final int HANDSHAKE_CONNECT_FAIL = -11;
        public static final int HANDSHAKE_FAIL = -12;
        public static final int NO_SSL_TLS_SUPP = -10;
        public static final int OPEN_ALLOC = -2;
        public static final int OPEN_CONNECT_STREAM = -3;
        public static final int RTMP_AMF_ENCODE_FAIL = -21;
        public static final int RTMP_CONNECT_FAIL = -13;
        public static final int RTMP_GENERIC_ERROR = -26;
        public static final int RTMP_IGNORED = -25;
        public static final int RTMP_KEYFRAME_TS_MISMATCH = -15;
        public static final int RTMP_MEM_ALLOC_FAIL = -17;
        public static final int RTMP_PACKET_TOO_SMALL = -19;
        public static final int RTMP_READ_CORRUPT_STREAM = -16;
        public static final int RTMP_SANITY_FAIL = -27;
        public static final int RTMP_SEND_PACKET_FAIL = -20;
        public static final int RTMP_STREAM_BAD_DATASIZE = -18;
        public static final int SOCKET_CONNECT_FAIL = -7;
        public static final int SOCKET_CREATE_FAIL = -9;
        public static final int SOCKS_NEGOTIATION_FAIL = -8;
        public static final int UNKNOWN_RTMP_AMF_TYPE = -5;
        public static final int UNKNOWN_RTMP_OPTION = -4;
        public static final int URL_INCORRECT_PORT = -24;
        public static final int URL_MISSING_HOSTNAME = -23;
        public static final int URL_MISSING_PROTOCOL = -22;
        public final int errorCode;

        /* JADX WARN: Invalid debug info offset */
        public RtmpIOException(int i) {
        }
    }

    static {
        System.loadLibrary("rtmp-jni");
    }

    private native long nativeAlloc();

    private native void nativeClose(long j);

    private native boolean nativeIsConnected(long j);

    private native int nativeOpen(String str, boolean z, long j, int i, int i2);

    private native int nativePause(boolean z, long j) throws IllegalStateException;

    private native int nativeRead(byte[] bArr, int i, int i2, long j) throws IllegalStateException;

    private native int nativeWrite(byte[] bArr, int i, int i2, long j) throws IllegalStateException;

    /* JADX WARN: Invalid debug info offset */
    public void close() {
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isConnected() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void open(String str, boolean z) throws RtmpIOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean pause(boolean z) throws IllegalStateException, RtmpIOException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public int read(byte[] bArr, int i, int i2) throws IllegalStateException, RtmpIOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setReceiveTimeout(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSendTimeout(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public int write(byte[] bArr) throws IllegalStateException, RtmpIOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int write(byte[] bArr, int i, int i2) throws IllegalStateException, RtmpIOException {
        return 0;
    }
}
