package com.google.android.exoplayer2.util.rtp.rtcp;

/* JADX INFO: loaded from: classes2.dex */
public class RtcpCompoundPacket {
    private final RtcpCompoundPacketEventListener eventListener;
    private RtcpPacket[] packets;

    public interface RtcpCompoundPacketEventListener {
        void onRtpFeedbackPacket(RtcpFeedbackPacket rtcpFeedbackPacket);

        void onSenderReportPacket(RtcpSrPacket rtcpSrPacket);

        void onSourceDescriptionPacket(RtcpSdesPacket rtcpSdesPacket);

        void onTokenPacket(RtcpTokenPacket rtcpTokenPacket);
    }

    public static final class RtcpCompoundPacketException extends Exception {
        public RtcpCompoundPacketException(String str) {
            super(str);
        }

        public RtcpCompoundPacketException(String str, Throwable th) {
            super(str, th);
        }

        public RtcpCompoundPacketException(Throwable th) {
            super(th);
        }
    }

    public RtcpCompoundPacket(RtcpCompoundPacketEventListener rtcpCompoundPacketEventListener) {
        this.eventListener = rtcpCompoundPacketEventListener;
    }

    public void fromBytes(byte[] bArr, int i) throws RtcpCompoundPacketException {
    }

    public RtcpPacket[] getPackets() {
        return this.packets;
    }
}
