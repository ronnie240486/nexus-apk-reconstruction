package com.google.android.exoplayer2.util.rtp;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.p006ts.PsExtractor;
import p000.C0978P9;
import p000.C1579YX;
import p000.C2998bp;
import p000.C4783m8;

/* JADX INFO: loaded from: classes2.dex */
public class RtpPacket {
    private static final int CSRC_SIZE = 4;
    private static final String LOG_TAG = "RtpPacket";
    private static final int MPEG_TS_SIG = 71;
    public static final int RTP_DYN_TYPE = 99;
    private static final int RTP_HDR_SIZE = 12;
    private static final int RTP_MIN_SIZE = 4;
    public static final int RTP_MP2TS_TYPE = 33;
    public static final int RTP_MPA_TYPE = 14;
    public static final int RTP_MPV_TYPE = 32;
    private static final int RTP_VERSION = 2;
    private static final int RTP_XTHDRLEN = 18;
    private static final int XTLEN_OFFSET = 14;
    private static final int XTSIZE = 4;
    private long[] csrc;
    private int csrcCount;
    private boolean extension;
    private byte[] headerExtension;
    private boolean marker;
    private int packetSize;
    private boolean padding;
    private byte[] payload;
    private int payloadType;
    private int sequenceNumber;
    private long ssrc;
    private long timestamp;
    private int version;

    public static final class RtpPacketException extends Exception {
        public RtpPacketException(String str) {
            super(str);
        }

        public RtpPacketException(String str, Throwable th) {
            super(str, th);
        }

        public RtpPacketException(Throwable th) {
            super(th);
        }
    }

    public RtpPacket() {
        this.version = 2;
        this.padding = true;
        this.marker = true;
        this.ssrc = 0L;
        this.csrcCount = 0;
        this.timestamp = 0L;
    }

    public void fromBytes(byte[] bArr, int i) throws RtpPacketException {
        int i2;
        int i3;
        int i4;
        if (bArr.length < 4 || bArr.length < 12) {
            throw new RtpPacketException(C0978P9.m4377a(new StringBuilder("Inappropriate length=["), bArr.length, "] of RTP packet"));
        }
        int i5 = bArr[0];
        int i6 = (i5 & PsExtractor.AUDIO_STREAM) >> 6;
        this.version = i6;
        if (2 != i6) {
            throw new RtpPacketException(C0978P9.m4377a(new StringBuilder("Wrong RTP version "), this.version, ", must be 2"));
        }
        boolean z = ((i5 & 32) >> 5) == 1;
        this.padding = z;
        boolean z2 = ((i5 & 16) >> 4) == 1;
        this.extension = z2;
        int i7 = i5 & 15;
        this.csrcCount = i7;
        int i8 = i7 * 4;
        int i9 = i8 + 12;
        byte b = bArr[1];
        this.marker = ((b & C4783m8.f15110b) >> 7) == 1;
        int i10 = b & C4783m8.f15111c;
        this.payloadType = i10;
        if (14 == i10 || 32 == i10) {
            i9 = i8 + 16;
        } else if (33 != i10 && 99 != i10) {
            throw new RtpPacketException("Unsupported payload type " + this.payloadType);
        }
        int i11 = (z ? bArr[i - 1] : 0) + i9;
        if (i < i11) {
            throw new RtpPacketException(C2998bp.m14684a("Invalid header (skip ", i11, " exceeds packet length ", i));
        }
        if (!z2) {
            i2 = i9;
            i3 = 0;
        } else {
            if (bArr.length < 18) {
                throw new RtpPacketException(C0978P9.m4377a(new StringBuilder("RTP x-header requires 15 bytes, only "), bArr.length, " provided"));
            }
            i3 = (((bArr[14] << 8) + bArr[15]) * 4) + 4;
            i2 = i9 + i3;
        }
        if (i10 == 33) {
            this.sequenceNumber = ((bArr[2] & C1579YX.f3960d) * 256) + (bArr[3] & C1579YX.f3960d);
        } else {
            this.sequenceNumber = ((bArr[i2] & C1579YX.f3960d) * 256) + (bArr[i2 + 1] & C1579YX.f3960d);
            i2 += 2;
        }
        this.timestamp = ((bArr[4] & C1579YX.f3960d) << 24) | ((bArr[5] & C1579YX.f3960d) << 16) | ((bArr[6] & C1579YX.f3960d) << 8) | (bArr[7] & C1579YX.f3960d);
        this.ssrc = ((bArr[8] & C1579YX.f3960d) << 24) | ((bArr[9] & C1579YX.f3960d) << 16) | ((bArr[10] & C1579YX.f3960d) << 8) | (bArr[11] & C1579YX.f3960d);
        if (i7 > 0) {
            this.csrc = new long[i7];
            int i12 = 0;
            int i13 = 12;
            while (i12 < this.csrcCount) {
                this.csrc[i12] = ((bArr[i13] & C1579YX.f3960d) << 24) | ((bArr[i13 + 1] & C1579YX.f3960d) << 16) | ((bArr[i13 + 2] & C1579YX.f3960d) << 8) | (bArr[i13 + 3] & C1579YX.f3960d);
                i12++;
                i13 += 4;
            }
        }
        if (this.extension) {
            byte[] bArr2 = new byte[i3];
            this.headerExtension = bArr2;
            i4 = 0;
            System.arraycopy(bArr, i9, bArr2, 0, i3);
        } else {
            i4 = 0;
        }
        int i14 = i - i2;
        byte[] bArr3 = new byte[i14];
        this.payload = bArr3;
        System.arraycopy(bArr, i2, bArr3, i4, i14);
        this.packetSize = i;
    }

    public int getCsrcCount() {
        return this.csrcCount;
    }

    public byte[] getHeaderExtension() {
        return this.headerExtension;
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

    public int getSequenceNumber() {
        return this.sequenceNumber;
    }

    public long getSsrc() {
        return this.ssrc;
    }

    public long getTimeStamp() {
        return this.timestamp;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public int getVersion() {
        return this.version;
    }

    public boolean isExtension() {
        return this.extension;
    }

    public boolean isMarker() {
        return this.marker;
    }

    public boolean isPadding() {
        return this.padding;
    }

    public void setCsrcCount(int i) {
        this.csrcCount = i;
    }

    public void setExtension(boolean z) {
        this.extension = z;
    }

    public void setHeaderExtension(byte[] bArr) {
        this.headerExtension = bArr;
    }

    public void setMarker(boolean z) {
        this.marker = z;
    }

    public void setPacketSize(int i) {
        this.packetSize = i;
    }

    public void setPadding(boolean z) {
        this.padding = z;
    }

    public void setPayload(byte[] bArr) {
        this.payload = bArr;
    }

    public void setPayloadType(int i) {
        this.payloadType = i;
    }

    public void setSequenceNumber(int i) {
        this.sequenceNumber = i;
    }

    public void setSsrc(long j) {
        this.ssrc = j;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public RtpPacket(int i, int i2, long j, long j2, byte[] bArr, @Nullable byte[] bArr2) {
        this();
        this.payloadType = i;
        this.sequenceNumber = i2;
        this.timestamp = j;
        this.ssrc = j2;
        this.payload = bArr;
        this.extension = bArr2 != null;
        this.headerExtension = bArr2;
    }

    public RtpPacket(byte[] bArr, int i) throws RtpPacketException {
        fromBytes(bArr, i);
    }
}
