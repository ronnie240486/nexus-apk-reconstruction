package com.google.zxing.oned;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* JADX INFO: loaded from: classes2.dex */
public final class Code128Reader extends OneDReader {
    private static final int CODE_CODE_A = 101;
    private static final int CODE_CODE_B = 100;
    private static final int CODE_CODE_C = 99;
    private static final int CODE_FNC_1 = 102;
    private static final int CODE_FNC_2 = 97;
    private static final int CODE_FNC_3 = 96;
    private static final int CODE_FNC_4_A = 101;
    private static final int CODE_FNC_4_B = 100;
    static final int[][] CODE_PATTERNS = {new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};
    private static final int CODE_SHIFT = 98;
    private static final int CODE_START_A = 103;
    private static final int CODE_START_B = 104;
    private static final int CODE_START_C = 105;
    private static final int CODE_STOP = 106;
    private static final float MAX_AVG_VARIANCE = 0.25f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.7f;

    private static int decodeCode(BitArray bitArray, int[] iArr, int i) throws NotFoundException {
        OneDReader.recordPattern(bitArray, i, iArr);
        float f = MAX_AVG_VARIANCE;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[][] iArr2 = CODE_PATTERNS;
            if (i3 >= iArr2.length) {
                break;
            }
            float fPatternMatchVariance = OneDReader.patternMatchVariance(iArr, iArr2[i3], 0.7f);
            if (fPatternMatchVariance < f) {
                i2 = i3;
                f = fPatternMatchVariance;
            }
            i3++;
        }
        if (i2 >= 0) {
            return i2;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int[] findStartPattern(BitArray bitArray) throws NotFoundException {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        int[] iArr = new int[6];
        int i = nextSet;
        boolean z = false;
        int i2 = 0;
        while (nextSet < size) {
            if (bitArray.get(nextSet) ^ z) {
                iArr[i2] = iArr[i2] + 1;
            } else {
                if (i2 == 5) {
                    int i3 = -1;
                    float f = MAX_AVG_VARIANCE;
                    for (int i4 = 103; i4 <= 105; i4++) {
                        float fPatternMatchVariance = OneDReader.patternMatchVariance(iArr, CODE_PATTERNS[i4], 0.7f);
                        if (fPatternMatchVariance < f) {
                            i3 = i4;
                            f = fPatternMatchVariance;
                        }
                    }
                    if (i3 >= 0 && bitArray.isRange(Math.max(0, i - ((nextSet - i) / 2)), i, false)) {
                        return new int[]{i, nextSet, i3};
                    }
                    i += iArr[0] + iArr[1];
                    System.arraycopy(iArr, 2, iArr, 0, 4);
                    iArr[4] = 0;
                    iArr[5] = 0;
                    i2--;
                } else {
                    i2++;
                }
                iArr[i2] = 1;
                z = !z;
            }
            nextSet++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0141  */
    /* JADX WARN: Code duplicated, block: B:102:0x0145  */
    /* JADX WARN: Code duplicated, block: B:103:0x0147  */
    /* JADX WARN: Code duplicated, block: B:105:0x014d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0151  */
    /* JADX WARN: Code duplicated, block: B:107:0x0155  */
    /* JADX WARN: Code duplicated, block: B:108:0x0157  */
    /* JADX WARN: Code duplicated, block: B:109:0x0159  */
    /* JADX WARN: Code duplicated, block: B:112:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0162  */
    /* JADX WARN: Code duplicated, block: B:114:0x0165  */
    /* JADX WARN: Code duplicated, block: B:145:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0071  */
    /* JADX WARN: Code duplicated, block: B:24:0x007e A[LOOP:1: B:23:0x007c->B:24:0x007e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:28:0x0090  */
    /* JADX WARN: Code duplicated, block: B:29:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0098  */
    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:39:0x00af  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:46:0x00be  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c6 A[PHI: r21
      0x00c6: PHI (r21v16 boolean) = (r21v6 boolean), (r21v18 boolean) binds: [B:77:0x0112, B:48:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ca A[PHI: r21
      0x00ca: PHI (r21v15 boolean) = (r21v6 boolean), (r21v18 boolean) binds: [B:77:0x0112, B:48:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d2 A[PHI: r21
      0x00d2: PHI (r21v14 boolean) = (r21v6 boolean), (r21v18 boolean) binds: [B:83:0x011d, B:52:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x00da A[PHI: r21
      0x00da: PHI (r21v13 boolean) = (r21v6 boolean), (r21v18 boolean) binds: [B:86:0x0122, B:55:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00de A[PHI: r21
      0x00de: PHI (r21v12 boolean) = (r21v6 boolean), (r21v6 boolean), (r21v18 boolean), (r21v18 boolean) binds: [B:85:0x0120, B:86:0x0122, B:54:0x00d6, B:55:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e8 A[PHI: r21
      0x00e8: PHI (r21v10 boolean) = (r21v6 boolean), (r21v18 boolean) binds: [B:73:0x0108, B:44:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f3 A[PHI: r21
      0x00f3: PHI (r21v8 boolean) = (r21v6 boolean), (r21v18 boolean) binds: [B:72:0x0106, B:43:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:69:0x0100  */
    /* JADX WARN: Code duplicated, block: B:71:0x0104  */
    /* JADX WARN: Code duplicated, block: B:73:0x0108  */
    /* JADX WARN: Code duplicated, block: B:75:0x010c  */
    /* JADX WARN: Code duplicated, block: B:76:0x010e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0115  */
    /* JADX WARN: Code duplicated, block: B:82:0x011b  */
    /* JADX WARN: Code duplicated, block: B:83:0x011d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x0122 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x0125  */
    /* JADX WARN: Code duplicated, block: B:89:0x0127  */
    /* JADX WARN: Code duplicated, block: B:91:0x012b  */
    /* JADX WARN: Code duplicated, block: B:93:0x012f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0137 A[FALL_THROUGH, PHI: r21
      0x0137: PHI (r21v21 boolean) = (r21v3 boolean), (r21v3 boolean), (r21v3 boolean), (r21v3 boolean), (r21v2 boolean), (r21v2 boolean) binds: [B:100:0x0141, B:102:0x0145, B:106:0x0151, B:105:0x014d, B:94:0x0134, B:28:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x0139  */
    /* JADX WARN: Code duplicated, block: B:98:0x013d  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:69:0x0100
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.google.zxing.oned.OneDReader
    public com.google.zxing.Result decodeRow(int r26, com.google.zxing.common.BitArray r27, java.util.Map<com.google.zxing.DecodeHintType, ?> r28) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException, com.google.zxing.ChecksumException {
        /*
            Method dump skipped, instruction units count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.Code128Reader.decodeRow(int, com.google.zxing.common.BitArray, java.util.Map):com.google.zxing.Result");
    }
}
