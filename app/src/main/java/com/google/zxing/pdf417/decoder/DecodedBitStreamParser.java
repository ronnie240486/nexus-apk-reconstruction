package com.google.zxing.pdf417.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.pdf417.PDF417ResultMetadata;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class DecodedBitStreamParser {

    /* JADX INFO: renamed from: AL */
    private static final int f11210AL = 28;

    /* JADX INFO: renamed from: AS */
    private static final int f11211AS = 27;
    private static final int BEGIN_MACRO_PDF417_CONTROL_BLOCK = 928;
    private static final int BEGIN_MACRO_PDF417_OPTIONAL_FIELD = 923;
    private static final int BYTE_COMPACTION_MODE_LATCH = 901;
    private static final int BYTE_COMPACTION_MODE_LATCH_6 = 924;
    private static final int ECI_CHARSET = 927;
    private static final int ECI_GENERAL_PURPOSE = 926;
    private static final int ECI_USER_DEFINED = 925;
    private static final BigInteger[] EXP900;

    /* JADX INFO: renamed from: LL */
    private static final int f11212LL = 27;
    private static final int MACRO_PDF417_TERMINATOR = 922;
    private static final int MAX_NUMERIC_CODEWORDS = 15;

    /* JADX INFO: renamed from: ML */
    private static final int f11213ML = 28;
    private static final int MODE_SHIFT_TO_BYTE_COMPACTION_MODE = 913;
    private static final int NUMBER_OF_SEQUENCE_CODEWORDS = 2;
    private static final int NUMERIC_COMPACTION_MODE_LATCH = 902;
    private static final int PAL = 29;

    /* JADX INFO: renamed from: PL */
    private static final int f11214PL = 25;

    /* JADX INFO: renamed from: PS */
    private static final int f11215PS = 29;
    private static final int TEXT_COMPACTION_MODE_LATCH = 900;
    private static final char[] PUNCT_CHARS = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();
    private static final char[] MIXED_CHARS = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();
    private static final Charset DEFAULT_ENCODING = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: com.google.zxing.pdf417.decoder.DecodedBitStreamParser$1 */
    public static /* synthetic */ class C38531 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode */
        static final /* synthetic */ int[] f11216x45bba1d;

        static {
            int[] iArr = new int[Mode.values().length];
            f11216x45bba1d = iArr;
            try {
                iArr[Mode.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11216x45bba1d[Mode.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11216x45bba1d[Mode.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11216x45bba1d[Mode.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11216x45bba1d[Mode.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11216x45bba1d[Mode.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum Mode {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        EXP900 = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = bigIntegerValueOf;
        int i = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = EXP900;
            if (i >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i] = bigIntegerArr2[i - 1].multiply(bigIntegerValueOf);
            i++;
        }
    }

    private DecodedBitStreamParser() {
    }

    private static int byteCompaction(int i, int[] iArr, Charset charset, int i2, StringBuilder sb) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i8 = MACRO_PDF417_TERMINATOR;
        int i9 = BEGIN_MACRO_PDF417_OPTIONAL_FIELD;
        int i10 = 928;
        long j = 900;
        if (i == 901) {
            int[] iArr2 = new int[6];
            i3 = i2 + 1;
            int i11 = iArr[i2];
            boolean z = false;
            loop0: while (true) {
                i4 = 0;
                long j2 = 0;
                while (true) {
                    i5 = iArr[0];
                    if (i3 >= i5 || z) {
                        break loop0;
                    }
                    i4++;
                    iArr2[i4] = i11;
                    j2 = (j2 * j) + ((long) i11);
                    i7 = i3 + 1;
                    i11 = iArr[i3];
                    if (i11 == 900 || i11 == 901 || i11 == 902 || i11 == BYTE_COMPACTION_MODE_LATCH_6 || i11 == 928 || i11 == i9 || i11 == i8) {
                        i8 = MACRO_PDF417_TERMINATOR;
                        i9 = BEGIN_MACRO_PDF417_OPTIONAL_FIELD;
                        j = 900;
                        z = true;
                    } else if (i4 % 5 != 0 || i4 <= 0) {
                        i3 = i7;
                        i8 = MACRO_PDF417_TERMINATOR;
                        i9 = BEGIN_MACRO_PDF417_OPTIONAL_FIELD;
                        j = 900;
                    }
                }
                int i12 = 0;
                while (i12 < 6) {
                    byteArrayOutputStream.write((byte) (j2 >> ((5 - i12) * 8)));
                    i12++;
                    i8 = MACRO_PDF417_TERMINATOR;
                    i9 = BEGIN_MACRO_PDF417_OPTIONAL_FIELD;
                }
                i3 = i7;
                j = 900;
            }
            if (i3 != i5 || i11 >= 900) {
                i6 = i4;
            } else {
                i6 = i4 + 1;
                iArr2[i4] = i11;
            }
            for (int i13 = 0; i13 < i6; i13++) {
                byteArrayOutputStream.write((byte) iArr2[i13]);
            }
        } else if (i == BYTE_COMPACTION_MODE_LATCH_6) {
            int i14 = i2;
            boolean z2 = false;
            int i15 = 0;
            long j3 = 0;
            while (i14 < iArr[0] && !z2) {
                int i16 = i14 + 1;
                int i17 = iArr[i14];
                if (i17 < 900) {
                    i15++;
                    j3 = (j3 * 900) + ((long) i17);
                    i14 = i16;
                } else {
                    if (i17 != 900 && i17 != 901 && i17 != 902 && i17 != BYTE_COMPACTION_MODE_LATCH_6 && i17 != i10) {
                        if (i17 != BEGIN_MACRO_PDF417_OPTIONAL_FIELD && i17 != MACRO_PDF417_TERMINATOR) {
                            i14 = i16;
                        }
                    }
                    z2 = true;
                }
                if (i15 % 5 == 0 && i15 > 0) {
                    for (int i18 = 0; i18 < 6; i18++) {
                        byteArrayOutputStream.write((byte) (j3 >> ((5 - i18) * 8)));
                    }
                    i15 = 0;
                    j3 = 0;
                }
                i10 = 928;
            }
            i3 = i14;
        } else {
            i3 = i2;
        }
        sb.append(new String(byteArrayOutputStream.toByteArray(), charset));
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    public static DecoderResult decode(int[] iArr, String str) throws FormatException {
        int iByteCompaction;
        StringBuilder sb = new StringBuilder(iArr.length << 1);
        Charset charsetForName = DEFAULT_ENCODING;
        int i = iArr[1];
        PDF417ResultMetadata pDF417ResultMetadata = new PDF417ResultMetadata();
        int i2 = 2;
        while (i2 < iArr[0]) {
            if (i != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                switch (i) {
                    case 900:
                        iByteCompaction = textCompaction(iArr, i2, sb);
                        break;
                    case 901:
                        iByteCompaction = byteCompaction(i, iArr, charsetForName, i2, sb);
                        break;
                    case 902:
                        iByteCompaction = numericCompaction(iArr, i2, sb);
                        break;
                    default:
                        switch (i) {
                            case MACRO_PDF417_TERMINATOR /* 922 */:
                            case BEGIN_MACRO_PDF417_OPTIONAL_FIELD /* 923 */:
                                throw FormatException.getFormatInstance();
                            case BYTE_COMPACTION_MODE_LATCH_6 /* 924 */:
                                iByteCompaction = byteCompaction(i, iArr, charsetForName, i2, sb);
                                break;
                            case ECI_USER_DEFINED /* 925 */:
                                iByteCompaction = i2 + 1;
                                break;
                            case ECI_GENERAL_PURPOSE /* 926 */:
                                iByteCompaction = i2 + 2;
                                break;
                            case ECI_CHARSET /* 927 */:
                                iByteCompaction = i2 + 1;
                                charsetForName = Charset.forName(CharacterSetECI.getCharacterSetECIByValue(iArr[i2]).name());
                                break;
                            case 928:
                                iByteCompaction = decodeMacroBlock(iArr, i2, pDF417ResultMetadata);
                                break;
                            default:
                                i2--;
                                iByteCompaction = textCompaction(iArr, i2, sb);
                                break;
                        }
                        break;
                }
            } else {
                iByteCompaction = i2 + 1;
                sb.append((char) iArr[i2]);
            }
            if (iByteCompaction >= iArr.length) {
                throw FormatException.getFormatInstance();
            }
            i2 = iByteCompaction + 1;
            i = iArr[iByteCompaction];
        }
        if (sb.length() == 0) {
            throw FormatException.getFormatInstance();
        }
        DecoderResult decoderResult = new DecoderResult(null, sb.toString(), null, str);
        decoderResult.setOther(pDF417ResultMetadata);
        return decoderResult;
    }

    private static String decodeBase900toBase10(int[] iArr, int i) throws FormatException {
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        for (int i2 = 0; i2 < i; i2++) {
            bigIntegerAdd = bigIntegerAdd.add(EXP900[(i - i2) - 1].multiply(BigInteger.valueOf(iArr[i2])));
        }
        String string = bigIntegerAdd.toString();
        if (string.charAt(0) == '1') {
            return string.substring(1);
        }
        throw FormatException.getFormatInstance();
    }

    private static int decodeMacroBlock(int[] iArr, int i, PDF417ResultMetadata pDF417ResultMetadata) throws FormatException {
        if (i + 2 > iArr[0]) {
            throw FormatException.getFormatInstance();
        }
        int[] iArr2 = new int[2];
        int i2 = 0;
        while (i2 < 2) {
            iArr2[i2] = iArr[i];
            i2++;
            i++;
        }
        pDF417ResultMetadata.setSegmentIndex(Integer.parseInt(decodeBase900toBase10(iArr2, 2)));
        StringBuilder sb = new StringBuilder();
        int iTextCompaction = textCompaction(iArr, i, sb);
        pDF417ResultMetadata.setFileId(sb.toString());
        int i3 = iArr[iTextCompaction];
        if (i3 != BEGIN_MACRO_PDF417_OPTIONAL_FIELD) {
            if (i3 != MACRO_PDF417_TERMINATOR) {
                return iTextCompaction;
            }
            pDF417ResultMetadata.setLastSegment(true);
            return iTextCompaction + 1;
        }
        int i4 = iTextCompaction + 1;
        int[] iArr3 = new int[iArr[0] - i4];
        boolean z = false;
        int i5 = 0;
        while (i4 < iArr[0] && !z) {
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            if (i7 < 900) {
                iArr3[i5] = i7;
                i5++;
                i4 = i6;
            } else {
                if (i7 != MACRO_PDF417_TERMINATOR) {
                    throw FormatException.getFormatInstance();
                }
                pDF417ResultMetadata.setLastSegment(true);
                i4 += 2;
                z = true;
            }
        }
        pDF417ResultMetadata.setOptionalData(Arrays.copyOf(iArr3, i5));
        return i4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    private static void decodeTextCompaction(int[] iArr, int[] iArr2, int i, StringBuilder sb) {
        int i2;
        int i3;
        Mode mode;
        Mode mode2 = Mode.ALPHA;
        Mode mode3 = mode2;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = iArr[i4];
            char c = ' ';
            switch (C38531.f11216x45bba1d[mode2.ordinal()]) {
                case 1:
                    if (i5 < 26) {
                        i3 = i5 + 65;
                        c = (char) i3;
                    } else if (i5 != 26) {
                        if (i5 == 27) {
                            mode2 = Mode.LOWER;
                        } else if (i5 != 28) {
                            if (i5 != 29) {
                                if (i5 == MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                                    i2 = iArr2[i4];
                                    sb.append((char) i2);
                                } else if (i5 == 900) {
                                    mode2 = Mode.ALPHA;
                                }
                            }
                            mode = Mode.PUNCT_SHIFT;
                            c = 0;
                            Mode mode4 = mode;
                            mode3 = mode2;
                            mode2 = mode4;
                        } else {
                            mode2 = Mode.MIXED;
                        }
                        c = 0;
                    }
                    break;
                case 2:
                    if (i5 < 26) {
                        i3 = i5 + 97;
                        c = (char) i3;
                    } else if (i5 != 26) {
                        if (i5 != 27) {
                            if (i5 == 28) {
                                mode2 = Mode.MIXED;
                            } else {
                                if (i5 != 29) {
                                    if (i5 == MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                                        i2 = iArr2[i4];
                                        sb.append((char) i2);
                                    } else if (i5 == 900) {
                                        mode2 = Mode.ALPHA;
                                    }
                                }
                                mode = Mode.PUNCT_SHIFT;
                            }
                            c = 0;
                        } else {
                            mode = Mode.ALPHA_SHIFT;
                        }
                        c = 0;
                        Mode mode5 = mode;
                        mode3 = mode2;
                        mode2 = mode5;
                    }
                    break;
                case 3:
                    if (i5 < 25) {
                        c = MIXED_CHARS[i5];
                    } else {
                        if (i5 == 25) {
                            mode2 = Mode.PUNCT;
                        } else if (i5 != 26) {
                            if (i5 == 27) {
                                mode2 = Mode.LOWER;
                            } else if (i5 != 28) {
                                if (i5 != 29) {
                                    if (i5 == MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                                        i2 = iArr2[i4];
                                        sb.append((char) i2);
                                    } else if (i5 == 900) {
                                        mode2 = Mode.ALPHA;
                                    }
                                }
                                mode = Mode.PUNCT_SHIFT;
                                c = 0;
                                Mode mode6 = mode;
                                mode3 = mode2;
                                mode2 = mode6;
                            } else {
                                mode2 = Mode.ALPHA;
                            }
                        }
                        c = 0;
                    }
                    break;
                case 4:
                    if (i5 < 29) {
                        c = PUNCT_CHARS[i5];
                    } else {
                        if (i5 == 29) {
                            mode2 = Mode.ALPHA;
                        } else if (i5 == MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                            i2 = iArr2[i4];
                            sb.append((char) i2);
                        } else if (i5 == 900) {
                            mode2 = Mode.ALPHA;
                        }
                        c = 0;
                    }
                    break;
                case 5:
                    if (i5 < 26) {
                        c = (char) (i5 + 65);
                    } else if (i5 != 26) {
                        if (i5 == 900) {
                            mode2 = Mode.ALPHA;
                        } else {
                            mode2 = mode3;
                        }
                        c = 0;
                        break;
                    }
                    mode2 = mode3;
                    break;
                case 6:
                    if (i5 < 29) {
                        c = PUNCT_CHARS[i5];
                        mode2 = mode3;
                    } else {
                        if (i5 != 29) {
                            if (i5 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                                if (i5 == 900) {
                                }
                                c = 0;
                            } else {
                                sb.append((char) iArr2[i4]);
                            }
                            mode2 = mode3;
                            c = 0;
                        }
                        mode2 = Mode.ALPHA;
                        c = 0;
                    }
                    break;
                default:
                    c = 0;
                    break;
            }
            if (c != 0) {
                sb.append(c);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0007 A[SYNTHETIC] */
    private static int numericCompaction(int[] iArr, int i, StringBuilder sb) throws FormatException {
        int[] iArr2 = new int[15];
        boolean z = false;
        loop0: while (true) {
            int i2 = 0;
            while (true) {
                int i3 = iArr[0];
                if (i >= i3 || z) {
                    break loop0;
                }
                int i4 = i + 1;
                int i5 = iArr[i];
                if (i4 == i3) {
                    z = true;
                }
                if (i5 < 900) {
                    iArr2[i2] = i5;
                    i2++;
                } else {
                    if (i5 == 900 || i5 == 901 || i5 == BYTE_COMPACTION_MODE_LATCH_6 || i5 == 928 || i5 == BEGIN_MACRO_PDF417_OPTIONAL_FIELD || i5 == MACRO_PDF417_TERMINATOR) {
                        z = true;
                    }
                    if (i2 % 15 != 0 || i5 == 902 || z) {
                        if (i2 > 0) {
                            break;
                        }
                    }
                }
                i = i4;
                if (i2 % 15 != 0) {
                }
                if (i2 > 0) {
                    break;
                }
            }
            sb.append(decodeBase900toBase10(iArr2, i2));
        }
        return i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0033. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0036. Please report as an issue. */
    private static int textCompaction(int[] iArr, int i, StringBuilder sb) {
        int i2 = iArr[0];
        int[] iArr2 = new int[(i2 - i) << 1];
        int[] iArr3 = new int[(i2 - i) << 1];
        boolean z = false;
        int i3 = 0;
        while (i < iArr[0] && !z) {
            int i4 = i + 1;
            int i5 = iArr[i];
            if (i5 < 900) {
                iArr2[i3] = i5 / 30;
                iArr2[i3 + 1] = i5 % 30;
                i3 += 2;
            } else if (i5 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                if (i5 != 928) {
                    switch (i5) {
                        case 900:
                            iArr2[i3] = 900;
                            i3++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i5) {
                                case MACRO_PDF417_TERMINATOR /* 922 */:
                                case BEGIN_MACRO_PDF417_OPTIONAL_FIELD /* 923 */:
                                case BYTE_COMPACTION_MODE_LATCH_6 /* 924 */:
                                    break;
                                default:
                                    break;
                            }
                            break;
                    }
                }
                z = true;
            } else {
                iArr2[i3] = MODE_SHIFT_TO_BYTE_COMPACTION_MODE;
                i += 2;
                iArr3[i3] = iArr[i4];
                i3++;
            }
            i = i4;
        }
        decodeTextCompaction(iArr2, iArr3, i3, sb);
        return i;
    }
}
