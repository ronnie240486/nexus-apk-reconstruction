package com.google.android.exoplayer2.util.rtp.rtcp;

/* JADX INFO: loaded from: classes2.dex */
public class RtcpPacketUtils {
    public static synchronized byte[] append(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        try {
            bArr3 = new byte[bArr.length + bArr2.length];
            for (int i = 0; i < bArr.length; i++) {
                bArr3[i] = bArr[i];
            }
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                bArr3[bArr.length + i2] = bArr2[i2];
            }
        } catch (Throwable th) {
            throw th;
        }
        return bArr3;
    }

    public static synchronized int calculate64PadLength(int i) {
        int iAbs;
        int iIEEEremainder = (int) Math.IEEEremainder(i, 16.0d);
        if (iIEEEremainder < 0) {
            iAbs = Math.abs(iIEEEremainder);
        } else {
            iAbs = iIEEEremainder > 0 ? 16 - iIEEEremainder : 0;
        }
        return iAbs;
    }

    public static synchronized int calculatePadLength(int i) {
        int iAbs;
        int iIEEEremainder = (int) Math.IEEEremainder(i, 4.0d);
        if (iIEEEremainder < 0) {
            iAbs = Math.abs(iIEEEremainder);
        } else {
            iAbs = iIEEEremainder > 0 ? 4 - iIEEEremainder : 0;
        }
        return iAbs;
    }

    public static synchronized long convertSignedIntToLong(int i) {
        return ((long) ((i << 1) >> 1)) + 2147483647L;
    }

    public static synchronized byte[] longToBytes(long j, int i) {
        byte[] bArr;
        bArr = new byte[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            bArr[i2] = (byte) j;
            j >>= 8;
        }
        return bArr;
    }

    public static synchronized byte[] swapBytes(byte[] bArr) {
        byte[] bArr2;
        bArr2 = new byte[bArr.length];
        for (int length = bArr.length - 1; length >= 0; length--) {
            bArr2[length] = bArr[(bArr.length - 1) - length];
        }
        return bArr2;
    }
}
