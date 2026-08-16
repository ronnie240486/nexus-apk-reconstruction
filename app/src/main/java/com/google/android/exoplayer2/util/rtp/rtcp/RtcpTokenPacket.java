package com.google.android.exoplayer2.util.rtp.rtcp;

/* JADX INFO: loaded from: classes2.dex */
public class RtcpTokenPacket extends RtcpPacket {
    @Override // com.google.android.exoplayer2.util.rtp.rtcp.RtcpPacket
    public void decodePayload(byte[] bArr, int i) {
    }

    public long getRelativeExpirationTime() {
        return 0L;
    }

    public int getSmt() {
        return 0;
    }

    public byte[] getTokenElement() {
        return null;
    }
}
