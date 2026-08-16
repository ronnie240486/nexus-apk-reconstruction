package com.google.android.exoplayer2.util.rtp.rtcp;

import p000.C0978P9;
import p000.C1579YX;
import p000.C2998bp;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RtcpPacket {
    private static final int RTCP_HDR_SIZE = 8;
    private static final int RTCP_VERSION = 2;
    private int length;
    private int packetSize;
    private byte[] payload;
    private int payloadType;
    private int version = 2;
    private boolean padding = true;
    private int receptionCount = 0;
    private long ssrc = 0;

    public static final class RtcpPacketException extends Exception {
        public RtcpPacketException(String str) {
            super(str);
        }

        public RtcpPacketException(String str, Throwable th) {
            super(str, th);
        }

        public RtcpPacketException(Throwable th) {
            super(th);
        }
    }

    public abstract void decodePayload(byte[] bArr, int i);

    public void fromBytes(byte[] bArr, int i) throws RtcpPacketException {
        if (bArr.length < 8) {
            throw new RtcpPacketException(C0978P9.m4377a(new StringBuilder("Inappropriate length=["), bArr.length, "] of RTCP packet"));
        }
        byte b = bArr[0];
        int i2 = (b & 192) >> 6;
        this.version = i2;
        if (2 != i2) {
            throw new RtcpPacketException(C0978P9.m4377a(new StringBuilder("Wrong RTCP version "), this.version, ", must be 2"));
        }
        boolean z = ((b & 32) >> 5) == 1;
        this.padding = z;
        this.receptionCount = b & 31;
        this.payloadType = bArr[1] & C1579YX.f3960d;
        int i3 = ((bArr[2] & C1579YX.f3960d) * 256) + (bArr[3] & C1579YX.f3960d);
        this.length = i3;
        this.ssrc = ((bArr[6] & C1579YX.f3960d) << 8) | ((bArr[5] & C1579YX.f3960d) << 16) | ((bArr[4] & C1579YX.f3960d) << 24) | (bArr[7] & C1579YX.f3960d);
        int i4 = (z ? bArr[i - 1] : 0) + 8;
        if (i < i4) {
            throw new RtcpPacketException(C2998bp.m14684a("Invalid header (skip ", i4, " exceeds packet length ", i));
        }
        int iMin = Math.min(((i3 + 1) * 4) - 8, i - 8);
        byte[] bArr2 = new byte[iMin];
        this.payload = bArr2;
        System.arraycopy(bArr, 8, bArr2, 0, iMin);
        decodePayload(this.payload, iMin);
        this.packetSize = i;
    }

    public int getLength() {
        return this.length;
    }

    public int getPacketSize() {
        return this.packetSize;
    }

    public byte[] getPayload() {
        return this.payload;
    }

    public int getPayloadType() {
        return this.payloadType;
    }

    public int getReceptionCount() {
        return this.receptionCount;
    }

    public long getSsrc() {
        return this.ssrc;
    }

    public int getVersion() {
        return this.version;
    }

    public boolean isPadding() {
        return this.padding;
    }

    public byte[] toBytes() {
        return null;
    }
}
