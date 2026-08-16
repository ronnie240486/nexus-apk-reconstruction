package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;
import java.util.Arrays;
import org.bouncycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes2.dex */
public final class HighLevelEncoder {
    static final int ASCII_ENCODATION = 0;
    static final int BASE256_ENCODATION = 5;
    static final int C40_ENCODATION = 1;
    static final char C40_UNLATCH = 254;
    static final int EDIFACT_ENCODATION = 4;
    static final char LATCH_TO_ANSIX12 = 238;
    static final char LATCH_TO_BASE256 = 231;
    static final char LATCH_TO_C40 = 230;
    static final char LATCH_TO_EDIFACT = 240;
    static final char LATCH_TO_TEXT = 239;
    private static final char MACRO_05 = 236;
    private static final String MACRO_05_HEADER = "[)>\u001e05\u001d";
    private static final char MACRO_06 = 237;
    private static final String MACRO_06_HEADER = "[)>\u001e06\u001d";
    private static final String MACRO_TRAILER = "\u001e\u0004";
    private static final char PAD = 129;
    static final int TEXT_ENCODATION = 2;
    static final char UPPER_SHIFT = 235;
    static final int X12_ENCODATION = 3;
    static final char X12_UNLATCH = 254;

    private HighLevelEncoder() {
    }

    public static int determineConsecutiveDigitCount(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            loop0: while (true) {
                char cCharAt = charSequence.charAt(i);
                while (isDigit(cCharAt) && i < length) {
                    i2++;
                    i++;
                    if (i < length) {
                    }
                }
                break loop0;
            }
        }
        return i2;
    }

    public static String encodeHighLevel(String str) {
        return encodeHighLevel(str, SymbolShapeHint.FORCE_NONE, null, null);
    }

    private static int findMinimums(float[] fArr, int[] iArr, int i, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i2 = 0; i2 < 6; i2++) {
            int iCeil = (int) Math.ceil(fArr[i2]);
            iArr[i2] = iCeil;
            if (i > iCeil) {
                Arrays.fill(bArr, (byte) 0);
                i = iCeil;
            }
            if (i == iCeil) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    private static int getMinimumCount(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i += bArr[i2];
        }
        return i;
    }

    public static void illegalCharacter(char c) {
        String hexString = Integer.toHexString(c);
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    public static boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean isExtendedASCII(char c) {
        return c >= 128 && c <= 255;
    }

    private static boolean isNativeC40(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    private static boolean isNativeEDIFACT(char c) {
        return c >= ' ' && c <= '^';
    }

    private static boolean isNativeText(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    private static boolean isNativeX12(char c) {
        if (isX12TermSep(c) || c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    private static boolean isSpecialB256(char c) {
        return false;
    }

    private static boolean isX12TermSep(char c) {
        return c == '\r' || c == '*' || c == '>';
    }

    /* JADX WARN: Code duplicated, block: B:122:0x01da  */
    public static int lookAheadTest(CharSequence charSequence, int i, int i2) {
        if (i >= charSequence.length()) {
            return i2;
        }
        float f = 2.0f;
        int i3 = 6;
        int i4 = 4;
        int i5 = 3;
        float[] fArr = new float[6];
        if (i2 == 0) {
            fArr[0] = 0.0f;
            fArr[1] = 1.0f;
            fArr[2] = 1.0f;
            fArr[3] = 1.0f;
            fArr[4] = 1.0f;
            fArr[5] = 1.25f;
        } else {
            fArr[0] = 1.0f;
            fArr[1] = 2.0f;
            fArr[2] = 2.0f;
            fArr[3] = 2.0f;
            fArr[4] = 2.0f;
            fArr[5] = 2.25f;
            fArr[i2] = 0.0f;
        }
        int i6 = 0;
        while (true) {
            int i7 = i + i6;
            if (i7 == charSequence.length()) {
                byte[] bArr = new byte[i3];
                int[] iArr = new int[i3];
                int iFindMinimums = findMinimums(fArr, iArr, Integer.MAX_VALUE, bArr);
                int minimumCount = getMinimumCount(bArr);
                if (iArr[0] == iFindMinimums) {
                    return 0;
                }
                if (minimumCount == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (minimumCount == 1 && bArr[i4] > 0) {
                    return i4;
                }
                if (minimumCount == 1 && bArr[2] > 0) {
                    return 2;
                }
                if (minimumCount != 1 || bArr[i5] <= 0) {
                    return 1;
                }
                return i5;
            }
            char cCharAt = charSequence.charAt(i7);
            i6++;
            if (isDigit(cCharAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (isExtendedASCII(cCharAt)) {
                float fCeil = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil;
                fArr[0] = fCeil + f;
            } else {
                float fCeil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil2;
                fArr[0] = fCeil2 + 1.0f;
            }
            if (isNativeC40(cCharAt)) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (isExtendedASCII(cCharAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (isNativeText(cCharAt)) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (isExtendedASCII(cCharAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (isNativeX12(cCharAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (isExtendedASCII(cCharAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (isNativeEDIFACT(cCharAt)) {
                fArr[4] = fArr[4] + 0.75f;
            } else if (isExtendedASCII(cCharAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            if (isSpecialB256(cCharAt)) {
                fArr[5] = fArr[5] + 4.0f;
            } else {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (i6 >= 4) {
                int[] iArr2 = new int[i3];
                byte[] bArr2 = new byte[i3];
                findMinimums(fArr, iArr2, Integer.MAX_VALUE, bArr2);
                int minimumCount2 = getMinimumCount(bArr2);
                int i8 = iArr2[0];
                int i9 = iArr2[5];
                if (i8 < i9 && i8 < iArr2[1] && i8 < iArr2[2] && i8 < iArr2[3] && i8 < iArr2[4]) {
                    return 0;
                }
                if (i9 >= i8) {
                    byte b = bArr2[1];
                    byte b2 = bArr2[2];
                    byte b3 = bArr2[3];
                    byte b4 = bArr2[4];
                    if (b + b2 + b3 + b4 != 0) {
                        if (minimumCount2 == 1 && b4 > 0) {
                            return 4;
                        }
                        if (minimumCount2 == 1 && b2 > 0) {
                            return 2;
                        }
                        if (minimumCount2 == 1 && b3 > 0) {
                            return 3;
                        }
                        int i10 = iArr2[1];
                        if (i10 + 1 < i8 && i10 + 1 < i9) {
                            if (i10 + 1 < iArr2[4] && i10 + 1 < iArr2[2]) {
                                int i11 = iArr2[3];
                                if (i10 < i11) {
                                    return 1;
                                }
                                if (i10 == i11) {
                                    for (int i12 = i + i6 + 1; i12 < charSequence.length(); i12++) {
                                        char cCharAt2 = charSequence.charAt(i12);
                                        if (isX12TermSep(cCharAt2)) {
                                            return 3;
                                        }
                                        if (!isNativeX12(cCharAt2)) {
                                            break;
                                        }
                                    }
                                    return 1;
                                }
                            }
                        }
                    }
                }
                return 5;
            }
            f = 2.0f;
            i3 = 6;
            i4 = 4;
            i5 = 3;
        }
    }

    private static char randomize253State(char c, int i) {
        int i2 = ((i * CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA) % 253) + 1 + c;
        if (i2 > 254) {
            i2 -= 254;
        }
        return (char) i2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0074  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b6 A[LOOP:1: B:26:0x00b0->B:28:0x00b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x006e A[SYNTHETIC] */
    public static String encodeHighLevel(String str, SymbolShapeHint symbolShapeHint, Dimension dimension, Dimension dimension2) {
        char c;
        int codewordCount;
        int dataCapacity;
        StringBuilder codewords;
        int newEncoding = 0;
        Encoder[] encoderArr = {new ASCIIEncoder(), new C40Encoder(), new TextEncoder(), new X12Encoder(), new EdifactEncoder(), new Base256Encoder()};
        EncoderContext encoderContext = new EncoderContext(str);
        encoderContext.setSymbolShape(symbolShapeHint);
        encoderContext.setSizeConstraints(dimension, dimension2);
        if (!str.startsWith(MACRO_05_HEADER) || !str.endsWith(MACRO_TRAILER)) {
            if (str.startsWith(MACRO_06_HEADER) && str.endsWith(MACRO_TRAILER)) {
                c = MACRO_06;
            }
            while (encoderContext.hasMoreCharacters()) {
                encoderArr[newEncoding].encode(encoderContext);
                if (encoderContext.getNewEncoding() >= 0) {
                    newEncoding = encoderContext.getNewEncoding();
                    encoderContext.resetEncoderSignal();
                }
            }
            codewordCount = encoderContext.getCodewordCount();
            encoderContext.updateSymbolInfo();
            dataCapacity = encoderContext.getSymbolInfo().getDataCapacity();
            if (codewordCount < dataCapacity && newEncoding != 0 && newEncoding != 5) {
                encoderContext.writeCodeword((char) 254);
            }
            codewords = encoderContext.getCodewords();
            if (codewords.length() < dataCapacity) {
                codewords.append(PAD);
            }
            while (codewords.length() < dataCapacity) {
                codewords.append(randomize253State(PAD, codewords.length() + 1));
            }
            return encoderContext.getCodewords().toString();
        }
        c = MACRO_05;
        encoderContext.writeCodeword(c);
        encoderContext.setSkipAtEnd(2);
        encoderContext.pos += 7;
        while (encoderContext.hasMoreCharacters()) {
            encoderArr[newEncoding].encode(encoderContext);
            if (encoderContext.getNewEncoding() >= 0) {
                newEncoding = encoderContext.getNewEncoding();
                encoderContext.resetEncoderSignal();
            }
        }
        codewordCount = encoderContext.getCodewordCount();
        encoderContext.updateSymbolInfo();
        dataCapacity = encoderContext.getSymbolInfo().getDataCapacity();
        if (codewordCount < dataCapacity) {
            encoderContext.writeCodeword((char) 254);
        }
        codewords = encoderContext.getCodewords();
        if (codewords.length() < dataCapacity) {
            codewords.append(PAD);
        }
        while (codewords.length() < dataCapacity) {
            codewords.append(randomize253State(PAD, codewords.length() + 1));
        }
        return encoderContext.getCodewords().toString();
    }
}
