package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.DecoderResult;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.p013io.FilenameUtils;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.slf4j.helpers.MessageFormatter;
import p000.C1002PX;

/* JADX INFO: loaded from: classes2.dex */
final class DecodedBitStreamParser {
    private static final char[] C40_BASIC_SET_CHARS = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private static final char[] C40_SHIFT2_SET_CHARS;
    private static final char[] TEXT_BASIC_SET_CHARS;
    private static final char[] TEXT_SHIFT2_SET_CHARS;
    private static final char[] TEXT_SHIFT3_SET_CHARS;

    /* JADX INFO: renamed from: com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$1 */
    public static /* synthetic */ class C38481 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode */
        static final /* synthetic */ int[] f11202xb73eb560;

        static {
            int[] iArr = new int[Mode.values().length];
            f11202xb73eb560 = iArr;
            try {
                iArr[Mode.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11202xb73eb560[Mode.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11202xb73eb560[Mode.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11202xb73eb560[Mode.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11202xb73eb560[Mode.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum Mode {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE
    }

    static {
        char[] cArr = {'!', C1002PX.f2511b, '#', C1002PX.f2512c, '%', C1002PX.f2513d, '\'', '(', ')', '*', '+', ',', '-', FilenameUtils.f15632b, '/', ':', ';', C1002PX.f2514e, '=', C1002PX.f2515f, '?', '@', '[', '\\', ']', '^', '_'};
        C40_SHIFT2_SET_CHARS = cArr;
        TEXT_BASIC_SET_CHARS = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        TEXT_SHIFT2_SET_CHARS = cArr;
        TEXT_SHIFT3_SET_CHARS = new char[]{'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', MessageFormatter.f17213a, '|', MessageFormatter.f17214b, '~', 127};
    }

    private DecodedBitStreamParser() {
    }

    public static DecoderResult decode(byte[] bArr) throws FormatException {
        BitSource bitSource = new BitSource(bArr);
        StringBuilder sb = new StringBuilder(100);
        StringBuilder sb2 = new StringBuilder(0);
        ArrayList arrayList = new ArrayList(1);
        Mode modeDecodeAsciiSegment = Mode.ASCII_ENCODE;
        do {
            Mode mode = Mode.ASCII_ENCODE;
            if (modeDecodeAsciiSegment == mode) {
                modeDecodeAsciiSegment = decodeAsciiSegment(bitSource, sb, sb2);
            } else {
                int i = C38481.f11202xb73eb560[modeDecodeAsciiSegment.ordinal()];
                if (i == 1) {
                    decodeC40Segment(bitSource, sb);
                } else if (i == 2) {
                    decodeTextSegment(bitSource, sb);
                } else if (i == 3) {
                    decodeAnsiX12Segment(bitSource, sb);
                } else if (i == 4) {
                    decodeEdifactSegment(bitSource, sb);
                } else {
                    if (i != 5) {
                        throw FormatException.getFormatInstance();
                    }
                    decodeBase256Segment(bitSource, sb, arrayList);
                }
                modeDecodeAsciiSegment = mode;
            }
            if (modeDecodeAsciiSegment == Mode.PAD_ENCODE) {
                break;
            }
        } while (bitSource.available() > 0);
        if (sb2.length() > 0) {
            sb.append((CharSequence) sb2);
        }
        String string = sb.toString();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        return new DecoderResult(bArr, string, arrayList, null);
    }

    private static void decodeAnsiX12Segment(BitSource bitSource, StringBuilder sb) throws FormatException {
        int bits;
        int i;
        char c;
        int[] iArr = new int[3];
        while (bitSource.available() != 8 && (bits = bitSource.readBits(8)) != 254) {
            parseTwoBytes(bits, bitSource.readBits(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i3 == 0) {
                    c = '\r';
                } else if (i3 == 1) {
                    c = '*';
                } else if (i3 == 2) {
                    c = C1002PX.f2515f;
                } else if (i3 == 3) {
                    c = ' ';
                } else {
                    if (i3 < 14) {
                        i = i3 + 44;
                    } else {
                        if (i3 >= 40) {
                            throw FormatException.getFormatInstance();
                        }
                        i = i3 + 51;
                    }
                    c = (char) i;
                }
                sb.append(c);
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    private static Mode decodeAsciiSegment(BitSource bitSource, StringBuilder sb, StringBuilder sb2) throws FormatException {
        String str;
        boolean z = false;
        do {
            int bits = bitSource.readBits(8);
            if (bits == 0) {
                throw FormatException.getFormatInstance();
            }
            if (bits <= 128) {
                if (z) {
                    bits += 128;
                }
                sb.append((char) (bits - 1));
                return Mode.ASCII_ENCODE;
            }
            if (bits == 129) {
                return Mode.PAD_ENCODE;
            }
            if (bits <= 229) {
                int i = bits - 130;
                if (i < 10) {
                    sb.append('0');
                }
                sb.append(i);
            } else {
                if (bits == 230) {
                    return Mode.C40_ENCODE;
                }
                if (bits == 231) {
                    return Mode.BASE256_ENCODE;
                }
                if (bits == 232) {
                    sb.append((char) 29);
                } else if (bits != 233 && bits != 234) {
                    if (bits == 235) {
                        z = true;
                    } else {
                        if (bits == 236) {
                            str = "[)>\u001e05\u001d";
                        } else if (bits == 237) {
                            str = "[)>\u001e06\u001d";
                        } else {
                            if (bits == 238) {
                                return Mode.ANSIX12_ENCODE;
                            }
                            if (bits == 239) {
                                return Mode.TEXT_ENCODE;
                            }
                            if (bits == 240) {
                                return Mode.EDIFACT_ENCODE;
                            }
                            if (bits != 241 && bits >= 242 && (bits != 254 || bitSource.available() != 0)) {
                                throw FormatException.getFormatInstance();
                            }
                        }
                        sb.append(str);
                        sb2.insert(0, "\u001e\u0004");
                    }
                }
            }
        } while (bitSource.available() > 0);
        return Mode.ASCII_ENCODE;
    }

    private static void decodeBase256Segment(BitSource bitSource, StringBuilder sb, Collection<byte[]> collection) throws FormatException {
        int byteOffset = bitSource.getByteOffset();
        int i = byteOffset + 2;
        int iUnrandomize255State = unrandomize255State(bitSource.readBits(8), byteOffset + 1);
        if (iUnrandomize255State == 0) {
            iUnrandomize255State = bitSource.available() / 8;
        } else if (iUnrandomize255State >= 250) {
            iUnrandomize255State = ((iUnrandomize255State - 249) * 250) + unrandomize255State(bitSource.readBits(8), i);
            i = byteOffset + 3;
        }
        if (iUnrandomize255State < 0) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[iUnrandomize255State];
        int i2 = 0;
        while (i2 < iUnrandomize255State) {
            if (bitSource.available() < 8) {
                throw FormatException.getFormatInstance();
            }
            bArr[i2] = (byte) unrandomize255State(bitSource.readBits(8), i);
            i2++;
            i++;
        }
        collection.add(bArr);
        try {
            sb.append(new String(bArr, "ISO8859_1"));
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("Platform does not support required encoding: " + e);
        }
    }

    private static void decodeC40Segment(BitSource bitSource, StringBuilder sb) throws FormatException {
        int bits;
        int i;
        char c;
        char c2;
        int[] iArr = new int[3];
        boolean z = false;
        int i2 = 0;
        while (bitSource.available() != 8 && (bits = bitSource.readBits(8)) != 254) {
            parseTwoBytes(bits, bitSource.readBits(8), iArr);
            for (int i3 = 0; i3 < 3; i3++) {
                int i4 = iArr[i3];
                if (i2 != 0) {
                    if (i2 == 1) {
                        if (z) {
                            i = i4 + 128;
                            c2 = (char) i;
                            sb.append(c2);
                            z = false;
                        }
                        c = (char) i4;
                        sb.append(c);
                    } else if (i2 == 2) {
                        char[] cArr = C40_SHIFT2_SET_CHARS;
                        if (i4 < cArr.length) {
                            c = cArr[i4];
                            if (z) {
                                c2 = (char) (c + 128);
                                sb.append(c2);
                                z = false;
                            }
                        } else if (i4 == 27) {
                            c = 29;
                        } else {
                            if (i4 != 30) {
                                throw FormatException.getFormatInstance();
                            }
                            z = true;
                        }
                        sb.append(c);
                    } else {
                        if (i2 != 3) {
                            throw FormatException.getFormatInstance();
                        }
                        if (z) {
                            i = i4 + 224;
                            c2 = (char) i;
                            sb.append(c2);
                            z = false;
                        } else {
                            i4 += 96;
                            c = (char) i4;
                            sb.append(c);
                        }
                    }
                    i2 = 0;
                } else if (i4 < 3) {
                    i2 = i4 + 1;
                } else {
                    char[] cArr2 = C40_BASIC_SET_CHARS;
                    if (i4 >= cArr2.length) {
                        throw FormatException.getFormatInstance();
                    }
                    char c3 = cArr2[i4];
                    if (z) {
                        sb.append((char) (c3 + 128));
                        z = false;
                    } else {
                        sb.append(c3);
                    }
                }
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    private static void decodeEdifactSegment(BitSource bitSource, StringBuilder sb) {
        while (bitSource.available() > 16) {
            for (int i = 0; i < 4; i++) {
                int bits = bitSource.readBits(6);
                if (bits == 31) {
                    int bitOffset = 8 - bitSource.getBitOffset();
                    if (bitOffset != 8) {
                        bitSource.readBits(bitOffset);
                        return;
                    }
                    return;
                }
                if ((bits & 32) == 0) {
                    bits |= 64;
                }
                sb.append((char) bits);
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0037 A[PHI: r4
      0x0037: PHI (r4v12 char) = (r4v11 char), (r4v15 char) binds: [B:33:0x0055, B:21:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    private static void decodeTextSegment(BitSource bitSource, StringBuilder sb) throws FormatException {
        int bits;
        char c;
        char c2;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (bitSource.available() != 8 && (bits = bitSource.readBits(8)) != 254) {
            parseTwoBytes(bits, bitSource.readBits(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            char[] cArr = TEXT_SHIFT2_SET_CHARS;
                            if (i3 < cArr.length) {
                                c = cArr[i3];
                                if (z) {
                                    c2 = (char) (c + 128);
                                    sb.append(c2);
                                    z = false;
                                }
                            } else if (i3 == 27) {
                                c = 29;
                            } else {
                                if (i3 != 30) {
                                    throw FormatException.getFormatInstance();
                                }
                                z = true;
                            }
                            sb.append(c);
                        } else {
                            if (i != 3) {
                                throw FormatException.getFormatInstance();
                            }
                            char[] cArr2 = TEXT_SHIFT3_SET_CHARS;
                            if (i3 >= cArr2.length) {
                                throw FormatException.getFormatInstance();
                            }
                            c = cArr2[i3];
                            if (z) {
                                c2 = (char) (c + 128);
                                sb.append(c2);
                                z = false;
                            } else {
                                sb.append(c);
                            }
                        }
                    } else if (z) {
                        c2 = (char) (i3 + 128);
                        sb.append(c2);
                        z = false;
                    } else {
                        c = (char) i3;
                        sb.append(c);
                    }
                    i = 0;
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr3 = TEXT_BASIC_SET_CHARS;
                    if (i3 >= cArr3.length) {
                        throw FormatException.getFormatInstance();
                    }
                    char c3 = cArr3[i3];
                    if (z) {
                        sb.append((char) (c3 + 128));
                        z = false;
                    } else {
                        sb.append(c3);
                    }
                }
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    private static void parseTwoBytes(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        int i5 = i3 - (i4 * 1600);
        int i6 = i5 / 40;
        iArr[1] = i6;
        iArr[2] = i5 - (i6 * 40);
    }

    private static int unrandomize255State(int i, int i2) {
        int i3 = i - (((i2 * CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA) % 255) + 1);
        return i3 >= 0 ? i3 : i3 + 256;
    }
}
