package com.google.zxing.aztec.decoder;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.zxing.FormatException;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.tencent.smtt.sdk.TbsListener;
import java.util.Arrays;
import org.apache.commons.p013io.IOUtils;
import org.apache.commons.p013io.input.Tailer;
import org.slf4j.Marker;
import p000.AbstractC4717l6;
import p000.C1023Ps;
import p000.C1262Tc;
import p000.C1275Tp;
import p000.C1313UP;
import p000.C4331f8;
import p000.C5713xI;
import p000.C6027p10;

/* JADX INFO: loaded from: classes2.dex */
public final class Decoder {
    private AztecDetectorResult ddata;
    private static final String[] UPPER_TABLE = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", C1023Ps.f2628k, "I", "J", "K", C5713xI.f19432g, "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", C1023Ps.f2627j, "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final String[] LOWER_TABLE = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", C5713xI.f19431f, "m", "n", "o", TtmlNode.TAG_P, "q", Tailer.f15848j, "s", C5713xI.f19433h, "u", "v", "w", "x", C6027p10.f18368d, "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final String[] MIXED_TABLE = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", IOUtils.f15646e, "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
    private static final String[] PUNCT_TABLE = {"", "\r", IOUtils.f15647f, ". ", ", ", ": ", "!", "\"", "#", "$", "%", C1275Tp.f3334j, C1313UP.f3457j, C1313UP.f3458k, C1313UP.f3459l, "*", Marker.f17179z0, C1262Tc.f3278g, "-", ".", "/", ":", ";", "<", "=", ">", AbstractC4717l6.f14991e, "[", "]", "{", "}", "CTRL_UL"};
    private static final String[] DIGIT_TABLE = {"CTRL_PS", " ", "0", "1", "2", C4331f8.f13908k, "4", "5", "6", "7", "8", "9", C1262Tc.f3278g, ".", "CTRL_UL", "CTRL_US"};

    /* JADX INFO: renamed from: com.google.zxing.aztec.decoder.Decoder$1 */
    public static /* synthetic */ class C38461 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table;

        static {
            int[] iArr = new int[Table.values().length];
            $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table = iArr;
            try {
                iArr[Table.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[Table.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[Table.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[Table.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[Table.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum Table {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    public static byte[] convertBoolArrayToByteArray(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = readByte(zArr, i << 3);
        }
        return bArr;
    }

    private boolean[] correctBits(boolean[] zArr) throws FormatException {
        int i;
        GenericGF genericGF;
        if (this.ddata.getNbLayers() <= 2) {
            genericGF = GenericGF.AZTEC_DATA_6;
            i = 6;
        } else {
            i = 8;
            if (this.ddata.getNbLayers() <= 8) {
                genericGF = GenericGF.AZTEC_DATA_8;
            } else if (this.ddata.getNbLayers() <= 22) {
                genericGF = GenericGF.AZTEC_DATA_10;
                i = 10;
            } else {
                genericGF = GenericGF.AZTEC_DATA_12;
                i = 12;
            }
        }
        int nbDatablocks = this.ddata.getNbDatablocks();
        int length = zArr.length / i;
        if (length < nbDatablocks) {
            throw FormatException.getFormatInstance();
        }
        int length2 = zArr.length % i;
        int[] iArr = new int[length];
        int i2 = 0;
        while (i2 < length) {
            iArr[i2] = readCode(zArr, length2, i);
            i2++;
            length2 += i;
        }
        try {
            new ReedSolomonDecoder(genericGF).decode(iArr, length - nbDatablocks);
            int i3 = 1 << i;
            int i4 = i3 - 1;
            int i5 = 0;
            for (int i6 = 0; i6 < nbDatablocks; i6++) {
                int i7 = iArr[i6];
                if (i7 == 0 || i7 == i4) {
                    throw FormatException.getFormatInstance();
                }
                if (i7 == 1 || i7 == i3 - 2) {
                    i5++;
                }
            }
            boolean[] zArr2 = new boolean[(nbDatablocks * i) - i5];
            int i8 = 0;
            for (int i9 = 0; i9 < nbDatablocks; i9++) {
                int i10 = iArr[i9];
                if (i10 == 1 || i10 == i3 - 2) {
                    Arrays.fill(zArr2, i8, (i8 + i) - 1, i10 > 1);
                    i8 = (i - 1) + i8;
                } else {
                    int i11 = i - 1;
                    while (i11 >= 0) {
                        int i12 = i8 + 1;
                        zArr2[i8] = ((1 << i11) & i10) != 0;
                        i11--;
                        i8 = i12;
                    }
                }
            }
            return zArr2;
        } catch (ReedSolomonException e) {
            throw FormatException.getFormatInstance(e);
        }
    }

    private boolean[] extractBits(BitMatrix bitMatrix) {
        boolean zIsCompact = this.ddata.isCompact();
        int nbLayers = this.ddata.getNbLayers();
        int i = (zIsCompact ? 11 : 14) + (nbLayers << 2);
        int[] iArr = new int[i];
        boolean[] zArr = new boolean[totalBitsInLayer(nbLayers, zIsCompact)];
        int i2 = 2;
        if (zIsCompact) {
            for (int i3 = 0; i3 < i; i3++) {
                iArr[i3] = i3;
            }
        } else {
            int i4 = i / 2;
            int i5 = ((((i4 - 1) / 15) * 2) + (i + 1)) / 2;
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = (i6 / 15) + i6;
                iArr[(i4 - i6) - 1] = (i5 - i7) - 1;
                iArr[i4 + i6] = i7 + i5 + 1;
            }
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < nbLayers) {
            int i10 = ((nbLayers - i8) << i2) + (zIsCompact ? 9 : 12);
            int i11 = i8 << 1;
            int i12 = (i - 1) - i11;
            int i13 = 0;
            while (i13 < i10) {
                int i14 = i13 << 1;
                int i15 = 0;
                while (i15 < i2) {
                    int i16 = i11 + i15;
                    int i17 = i11 + i13;
                    zArr[i9 + i14 + i15] = bitMatrix.get(iArr[i16], iArr[i17]);
                    int i18 = iArr[i17];
                    int i19 = i12 - i15;
                    zArr[(i10 * 2) + i9 + i14 + i15] = bitMatrix.get(i18, iArr[i19]);
                    int i20 = i12 - i13;
                    zArr[(i10 * 4) + i9 + i14 + i15] = bitMatrix.get(iArr[i19], iArr[i20]);
                    zArr[(i10 * 6) + i9 + i14 + i15] = bitMatrix.get(iArr[i20], iArr[i16]);
                    i15++;
                    nbLayers = nbLayers;
                    zIsCompact = zIsCompact;
                    i2 = 2;
                }
                i13++;
                i2 = 2;
            }
            i9 += i10 << 3;
            i8++;
            i2 = 2;
        }
        return zArr;
    }

    private static String getCharacter(Table table, int i) {
        int i2 = C38461.$SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[table.ordinal()];
        if (i2 == 1) {
            return UPPER_TABLE[i];
        }
        if (i2 == 2) {
            return LOWER_TABLE[i];
        }
        if (i2 == 3) {
            return MIXED_TABLE[i];
        }
        if (i2 == 4) {
            return PUNCT_TABLE[i];
        }
        if (i2 == 5) {
            return DIGIT_TABLE[i];
        }
        throw new IllegalStateException("Bad table");
    }

    private static String getEncodedData(boolean[] zArr) {
        int length = zArr.length;
        Table table = Table.UPPER;
        StringBuilder sb = new StringBuilder(20);
        Table table2 = table;
        int i = 0;
        while (i < length) {
            if (table != Table.BINARY) {
                int i2 = table == Table.DIGIT ? 4 : 5;
                if (length - i < i2) {
                    break;
                }
                int code = readCode(zArr, i, i2);
                i += i2;
                String character = getCharacter(table, code);
                if (character.startsWith("CTRL_")) {
                    table2 = getTable(character.charAt(5));
                    if (character.charAt(6) != 'L') {
                        table2 = table;
                        table = table2;
                    }
                } else {
                    sb.append(character);
                }
                table = table2;
            } else {
                if (length - i < 5) {
                    break;
                }
                int code2 = readCode(zArr, i, 5);
                int i3 = i + 5;
                if (code2 == 0) {
                    if (length - i3 < 11) {
                        break;
                    }
                    code2 = readCode(zArr, i3, 11) + 31;
                    i3 = i + 16;
                }
                int i4 = 0;
                while (true) {
                    if (i4 >= code2) {
                        i = i3;
                        break;
                    }
                    if (length - i3 < 8) {
                        i = length;
                        break;
                    }
                    sb.append((char) readCode(zArr, i3, 8));
                    i3 += 8;
                    i4++;
                }
                table = table2;
            }
        }
        return sb.toString();
    }

    private static Table getTable(char c) {
        if (c == 'B') {
            return Table.BINARY;
        }
        if (c == 'D') {
            return Table.DIGIT;
        }
        if (c == 'P') {
            return Table.PUNCT;
        }
        if (c != 'L') {
            return c != 'M' ? Table.UPPER : Table.MIXED;
        }
        return Table.LOWER;
    }

    public static String highLevelDecode(boolean[] zArr) {
        return getEncodedData(zArr);
    }

    private static byte readByte(boolean[] zArr, int i) {
        int length = zArr.length - i;
        return (byte) (length >= 8 ? readCode(zArr, i, 8) : readCode(zArr, i, length) << (8 - length));
    }

    private static int readCode(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    private static int totalBitsInLayer(int i, boolean z) {
        return ((z ? 88 : TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW) + (i << 4)) * i;
    }

    public DecoderResult decode(AztecDetectorResult aztecDetectorResult) throws FormatException {
        this.ddata = aztecDetectorResult;
        boolean[] zArrCorrectBits = correctBits(extractBits(aztecDetectorResult.getBits()));
        DecoderResult decoderResult = new DecoderResult(convertBoolArrayToByteArray(zArrCorrectBits), getEncodedData(zArrCorrectBits), null, null);
        decoderResult.setNumBits(zArrCorrectBits.length);
        return decoderResult;
    }
}
