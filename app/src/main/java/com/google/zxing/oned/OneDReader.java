package com.google.zxing.oned;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;
import org.videolan.libvlc.MediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OneDReader implements Reader {
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        r3 = r22.getBlackRow(r11, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e0, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Result doDecode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException {
        int i;
        int i2;
        int i3;
        Map<DecodeHintType, ?> map2;
        int i4;
        Map<DecodeHintType, ?> map3 = map;
        int width = binaryBitmap.getWidth();
        int height = binaryBitmap.getHeight();
        BitArray bitArray = new BitArray(width);
        int i5 = height >> 1;
        char c = 0;
        int i6 = 1;
        boolean z = map3 != null && map3.containsKey(DecodeHintType.TRY_HARDER);
        int iMax = Math.max(1, height >> (z ? 8 : 5));
        int i7 = z ? height : 15;
        int i8 = 0;
        while (i8 < i7) {
            i = i8 + 1;
            int i9 = i / 2;
            if ((i8 & 1) != 0) {
                i9 = -i9;
            }
            i2 = (i9 * iMax) + i5;
            if (i2 < 0 || i2 >= height) {
                break;
            }
            i8 = i;
            width = width;
            c = 0;
            i6 = 1;
        }
        throw NotFoundException.getNotFoundInstance();
        while (i3 < 2) {
            if (i3 == i6) {
                bitArray.reverse();
                if (map3 != null) {
                    DecodeHintType decodeHintType = DecodeHintType.NEED_RESULT_POINT_CALLBACK;
                    if (map3.containsKey(decodeHintType)) {
                        EnumMap enumMap = new EnumMap(DecodeHintType.class);
                        enumMap.putAll(map3);
                        enumMap.remove(decodeHintType);
                        map3 = enumMap;
                    }
                }
            }
            try {
                Result resultDecodeRow = decodeRow(i2, bitArray, map3);
                if (i3 == i6) {
                    resultDecodeRow.putMetadata(ResultMetadataType.ORIENTATION, 180);
                    ResultPoint[] resultPoints = resultDecodeRow.getResultPoints();
                    if (resultPoints != null) {
                        map2 = map3;
                        float f = width;
                        try {
                            i4 = width;
                            try {
                                resultPoints[0] = new ResultPoint((f - resultPoints[c].getX()) - 1.0f, resultPoints[c].getY());
                                try {
                                    resultPoints[1] = new ResultPoint((f - resultPoints[1].getX()) - 1.0f, resultPoints[1].getY());
                                } catch (ReaderException unused) {
                                    continue;
                                    i3++;
                                    map3 = map2;
                                    width = i4;
                                    c = 0;
                                    i6 = 1;
                                }
                            } catch (ReaderException unused2) {
                                i3++;
                                map3 = map2;
                                width = i4;
                                c = 0;
                                i6 = 1;
                            }
                        } catch (ReaderException unused3) {
                            i4 = width;
                            i3++;
                            map3 = map2;
                            width = i4;
                            c = 0;
                            i6 = 1;
                        }
                    }
                }
                return resultDecodeRow;
            } catch (ReaderException unused4) {
                map2 = map3;
            }
        }
        continue;
        i8 = i;
        width = width;
        c = 0;
        i6 = 1;
    }

    public static float patternMatchVariance(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = i;
        float f3 = f2 / i2;
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f6 = iArr2[i4] * f3;
            float f7 = i5;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }

    public static void recordPattern(BitArray bitArray, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int size = bitArray.getSize();
        if (i >= size) {
            throw NotFoundException.getNotFoundInstance();
        }
        boolean z = !bitArray.get(i);
        while (i < size) {
            if (!(bitArray.get(i) ^ z)) {
                i2++;
                if (i2 == length) {
                    break;
                }
                iArr[i2] = 1;
                z = !z;
            } else {
                iArr[i2] = iArr[i2] + 1;
            }
            i++;
        }
        if (i2 != length) {
            if (i2 != length - 1 || i != size) {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }

    public static void recordPatternInReverse(BitArray bitArray, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        boolean z = bitArray.get(i);
        while (i > 0 && length >= 0) {
            i--;
            if (bitArray.get(i) != z) {
                length--;
                z = !z;
            }
        }
        if (length >= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        recordPattern(bitArray, i + 1, iArr);
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap) throws NotFoundException, FormatException {
        return decode(binaryBitmap, null);
    }

    public abstract Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException;

    @Override // com.google.zxing.Reader
    public void reset() {
    }

    @Override // com.google.zxing.Reader
    public Result decode(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        try {
            return doDecode(binaryBitmap, map);
        } catch (NotFoundException e) {
            if (map == null || !map.containsKey(DecodeHintType.TRY_HARDER) || !binaryBitmap.isRotateSupported()) {
                throw e;
            }
            BinaryBitmap binaryBitmapRotateCounterClockwise = binaryBitmap.rotateCounterClockwise();
            Result resultDoDecode = doDecode(binaryBitmapRotateCounterClockwise, map);
            Map<ResultMetadataType, Object> resultMetadata = resultDoDecode.getResultMetadata();
            int iIntValue = MediaPlayer.Event.f17411q;
            if (resultMetadata != null) {
                ResultMetadataType resultMetadataType = ResultMetadataType.ORIENTATION;
                if (resultMetadata.containsKey(resultMetadataType)) {
                    iIntValue = (((Integer) resultMetadata.get(resultMetadataType)).intValue() + MediaPlayer.Event.f17411q) % 360;
                }
            }
            resultDoDecode.putMetadata(ResultMetadataType.ORIENTATION, Integer.valueOf(iIntValue));
            ResultPoint[] resultPoints = resultDoDecode.getResultPoints();
            if (resultPoints != null) {
                int height = binaryBitmapRotateCounterClockwise.getHeight();
                for (int i = 0; i < resultPoints.length; i++) {
                    resultPoints[i] = new ResultPoint((height - resultPoints[i].getY()) - 1.0f, resultPoints[i].getX());
                }
            }
            return resultDoDecode;
        }
    }
}
