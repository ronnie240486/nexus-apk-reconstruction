package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;
import com.tencent.smtt.sdk.TbsListener;
import p000.C5630w2;

/* JADX INFO: loaded from: classes2.dex */
public final class Encoder {
    public static final int DEFAULT_AZTEC_LAYERS = 0;
    public static final int DEFAULT_EC_PERCENT = 33;
    private static final int MAX_NB_BITS = 32;
    private static final int MAX_NB_BITS_COMPACT = 4;
    private static final int[] WORD_SIZE = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private Encoder() {
    }

    private static int[] bitsToWords(BitArray bitArray, int i, int i2) {
        int[] iArr = new int[i2];
        int size = bitArray.getSize() / i;
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4 |= bitArray.get((i3 * i) + i5) ? 1 << ((i - i5) - 1) : 0;
            }
            iArr[i3] = i4;
        }
        return iArr;
    }

    private static void drawBullsEye(BitMatrix bitMatrix, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    bitMatrix.set(i5, i4);
                    bitMatrix.set(i5, i6);
                    bitMatrix.set(i4, i5);
                    bitMatrix.set(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        bitMatrix.set(i7, i7);
        int i8 = i7 + 1;
        bitMatrix.set(i8, i7);
        bitMatrix.set(i7, i8);
        int i9 = i + i2;
        bitMatrix.set(i9, i7);
        bitMatrix.set(i9, i8);
        bitMatrix.set(i9, i9 - 1);
    }

    private static void drawModeMessage(BitMatrix bitMatrix, boolean z, int i, BitArray bitArray) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (bitArray.get(i3)) {
                    bitMatrix.set(i4, i2 - 5);
                }
                if (bitArray.get(i3 + 7)) {
                    bitMatrix.set(i2 + 5, i4);
                }
                if (bitArray.get(20 - i3)) {
                    bitMatrix.set(i4, i2 + 5);
                }
                if (bitArray.get(27 - i3)) {
                    bitMatrix.set(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i3 / 5) + (i2 - 5) + i3;
            if (bitArray.get(i3)) {
                bitMatrix.set(i5, i2 - 7);
            }
            if (bitArray.get(i3 + 10)) {
                bitMatrix.set(i2 + 7, i5);
            }
            if (bitArray.get(29 - i3)) {
                bitMatrix.set(i5, i2 + 7);
            }
            if (bitArray.get(39 - i3)) {
                bitMatrix.set(i2 - 7, i5);
            }
            i3++;
        }
    }

    public static AztecCode encode(byte[] bArr) {
        return encode(bArr, 33, 0);
    }

    private static BitArray generateCheckWords(BitArray bitArray, int i, int i2) {
        int size = bitArray.getSize() / i2;
        ReedSolomonEncoder reedSolomonEncoder = new ReedSolomonEncoder(getGF(i2));
        int i3 = i / i2;
        int[] iArrBitsToWords = bitsToWords(bitArray, i2, i3);
        reedSolomonEncoder.encode(iArrBitsToWords, i3 - size);
        BitArray bitArray2 = new BitArray();
        bitArray2.appendBits(0, i % i2);
        for (int i4 : iArrBitsToWords) {
            bitArray2.appendBits(i4, i2);
        }
        return bitArray2;
    }

    public static BitArray generateModeMessage(boolean z, int i, int i2) {
        int i3;
        BitArray bitArray = new BitArray();
        int i4 = i - 1;
        if (z) {
            bitArray.appendBits(i4, 2);
            bitArray.appendBits(i2 - 1, 6);
            i3 = 28;
        } else {
            bitArray.appendBits(i4, 5);
            bitArray.appendBits(i2 - 1, 11);
            i3 = 40;
        }
        return generateCheckWords(bitArray, i3, 4);
    }

    private static GenericGF getGF(int i) {
        if (i == 4) {
            return GenericGF.AZTEC_PARAM;
        }
        if (i == 6) {
            return GenericGF.AZTEC_DATA_6;
        }
        if (i == 8) {
            return GenericGF.AZTEC_DATA_8;
        }
        if (i == 10) {
            return GenericGF.AZTEC_DATA_10;
        }
        if (i == 12) {
            return GenericGF.AZTEC_DATA_12;
        }
        throw new IllegalArgumentException(C5630w2.m29215a("Unsupported word size ", i));
    }

    public static BitArray stuffBits(BitArray bitArray, int i) {
        BitArray bitArray2 = new BitArray();
        int size = bitArray.getSize();
        int i2 = (1 << i) - 2;
        int i3 = 0;
        while (i3 < size) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i3 + i5;
                if (i6 >= size || bitArray.get(i6)) {
                    i4 |= 1 << ((i - 1) - i5);
                }
            }
            int i7 = i4 & i2;
            if (i7 == i2) {
                bitArray2.appendBits(i7, i);
                i3--;
            } else if (i7 == 0) {
                i7 = i4 | 1;
                bitArray2.appendBits(i7, i);
                i3--;
            } else {
                bitArray2.appendBits(i4, i);
            }
            i3 += i;
        }
        return bitArray2;
    }

    private static int totalBitsInLayer(int i, boolean z) {
        return ((z ? 88 : TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) + (i << 4)) * i;
    }

    public static AztecCode encode(byte[] bArr, int i, int i2) {
        int i3;
        BitArray bitArrayStuffBits;
        boolean z;
        int iAbs;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 2;
        BitArray bitArrayEncode = new HighLevelEncoder(bArr).encode();
        int size = ((bitArrayEncode.getSize() * i) / 100) + 11;
        int size2 = bitArrayEncode.getSize() + size;
        int i9 = 32;
        int i10 = 0;
        int i11 = 1;
        if (i2 != 0) {
            z = i2 < 0;
            iAbs = Math.abs(i2);
            if (iAbs > (z ? 4 : 32)) {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i2)));
            }
            i4 = totalBitsInLayer(iAbs, z);
            i5 = WORD_SIZE[iAbs];
            int i12 = i4 - (i4 % i5);
            bitArrayStuffBits = stuffBits(bitArrayEncode, i5);
            if (bitArrayStuffBits.getSize() + size > i12) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
            if (z && bitArrayStuffBits.getSize() > (i5 << 6)) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
        } else {
            BitArray bitArrayStuffBits2 = null;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (i13 > i9) {
                    throw new IllegalArgumentException("Data too large for an Aztec code");
                }
                boolean z2 = i13 <= 3;
                int i15 = z2 ? i13 + 1 : i13;
                int i16 = totalBitsInLayer(i15, z2);
                if (size2 <= i16) {
                    int i17 = WORD_SIZE[i15];
                    if (i14 != i17) {
                        bitArrayStuffBits2 = stuffBits(bitArrayEncode, i17);
                    } else {
                        i17 = i14;
                    }
                    int i18 = i16 - (i16 % i17);
                    if ((!z2 || bitArrayStuffBits2.getSize() <= (i17 << 6)) && bitArrayStuffBits2.getSize() + size <= i18) {
                        bitArrayStuffBits = bitArrayStuffBits2;
                        z = z2;
                        iAbs = i15;
                        i4 = i16;
                        i5 = i17;
                        break;
                    }
                    i14 = i17;
                    i3 = 1;
                } else {
                    i3 = 1;
                }
                i13 += i3;
                i8 = 2;
                i9 = 32;
                i10 = 0;
                i11 = 1;
            }
        }
        BitArray bitArrayGenerateCheckWords = generateCheckWords(bitArrayStuffBits, i4, i5);
        int size3 = bitArrayStuffBits.getSize() / i5;
        BitArray bitArrayGenerateModeMessage = generateModeMessage(z, iAbs, size3);
        int i19 = (z ? 11 : 14) + (iAbs << 2);
        int[] iArr = new int[i19];
        if (z) {
            for (int i20 = 0; i20 < i19; i20 += i11) {
                iArr[i20] = i20;
            }
            i6 = i19;
        } else {
            int i21 = i19 / 2;
            i6 = (((i21 - 1) / 15) * 2) + i19 + 1;
            int i22 = i6 / 2;
            for (int i23 = 0; i23 < i21; i23 += i11) {
                int i24 = (i23 / 15) + i23;
                iArr[(i21 - i23) - 1] = (i22 - i24) - 1;
                iArr[i21 + i23] = i24 + i22 + i11;
            }
        }
        BitMatrix bitMatrix = new BitMatrix(i6);
        int i25 = 0;
        int i26 = 0;
        while (i25 < iAbs) {
            int i27 = ((iAbs - i25) << i8) + (z ? 9 : 12);
            while (i10 < i27) {
                int i28 = i10 << 1;
                int i29 = 0;
                while (i29 < i8) {
                    if (bitArrayGenerateCheckWords.get(i26 + i28 + i29)) {
                        int i30 = i25 << 1;
                        bitMatrix.set(iArr[i30 + i29], iArr[i30 + i10]);
                    }
                    if (bitArrayGenerateCheckWords.get((i27 << 1) + i26 + i28 + i29)) {
                        int i31 = i25 << 1;
                        bitMatrix.set(iArr[i31 + i10], iArr[((i19 - 1) - i31) - i29]);
                    }
                    if (bitArrayGenerateCheckWords.get((i27 << 2) + i26 + i28 + i29)) {
                        int i32 = (i19 - 1) - (i25 << 1);
                        bitMatrix.set(iArr[i32 - i29], iArr[i32 - i10]);
                    }
                    if (bitArrayGenerateCheckWords.get((i27 * 6) + i26 + i28 + i29)) {
                        i7 = 1;
                        int i33 = i25 << 1;
                        bitMatrix.set(iArr[((i19 - 1) - i33) - i10], iArr[i33 + i29]);
                    } else {
                        i7 = 1;
                    }
                    i29 += i7;
                    size3 = size3;
                    i8 = 2;
                }
                i10++;
                i8 = 2;
            }
            i26 += i27 << 3;
            i25++;
            size3 = size3;
            i8 = 2;
            i10 = 0;
        }
        int i34 = size3;
        drawModeMessage(bitMatrix, z, i6, bitArrayGenerateModeMessage);
        if (z) {
            drawBullsEye(bitMatrix, i6 / 2, 5);
        } else {
            int i35 = i6 / 2;
            drawBullsEye(bitMatrix, i35, 7);
            int i36 = 0;
            int i37 = 0;
            while (i36 < (i19 / 2) - 1) {
                for (int i38 = i35 & 1; i38 < i6; i38 += 2) {
                    int i39 = i35 - i37;
                    bitMatrix.set(i39, i38);
                    int i40 = i35 + i37;
                    bitMatrix.set(i40, i38);
                    bitMatrix.set(i38, i39);
                    bitMatrix.set(i38, i40);
                }
                i36 += 15;
                i37 += 16;
            }
        }
        AztecCode aztecCode = new AztecCode();
        aztecCode.setCompact(z);
        aztecCode.setSize(i6);
        aztecCode.setLayers(iAbs);
        aztecCode.setCodeWords(i34);
        aztecCode.setMatrix(bitMatrix);
        return aztecCode;
    }
}
