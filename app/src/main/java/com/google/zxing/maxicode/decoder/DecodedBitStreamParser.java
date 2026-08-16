package com.google.zxing.maxicode.decoder;

import com.google.zxing.common.DecoderResult;
import java.text.DecimalFormat;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.dom4j.p020io.SAXEventRecorder;

/* JADX INFO: loaded from: classes2.dex */
final class DecodedBitStreamParser {
    private static final char ECI = 65530;

    /* JADX INFO: renamed from: FS */
    private static final char f11204FS = 28;

    /* JADX INFO: renamed from: GS */
    private static final char f11205GS = 29;
    private static final char LATCHA = 65527;
    private static final char LATCHB = 65528;
    private static final char LOCK = 65529;

    /* JADX INFO: renamed from: NS */
    private static final char f11206NS = 65531;
    private static final char PAD = 65532;

    /* JADX INFO: renamed from: RS */
    private static final char f11207RS = 30;
    private static final String[] SETS = {"\nABCDEFGHIJKLMNOPQRSTUVWXYZ\ufffa\u001c\u001d\u001e\ufffb ￼\"#$%&'()*+,-./0123456789:\ufff1\ufff2\ufff3\ufff4\ufff8", "`abcdefghijklmnopqrstuvwxyz\ufffa\u001c\u001d\u001e\ufffb{￼}~\u007f;<=>?[\\]^_ ,./:@!|￼\ufff5\ufff6￼\ufff0\ufff2\ufff3\ufff4\ufff7", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ\ufffa\u001c\u001d\u001eÛÜÝÞßª¬±²³µ¹º¼½¾\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\ufff7 \ufff9\ufff3\ufff4\ufff8", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú\ufffa\u001c\u001d\u001e\ufffbûüýþÿ¡¨«¯°´·¸»¿\u008a\u008b\u008c\u008d\u008e\u008f\u0090\u0091\u0092\u0093\u0094\ufff7 \ufff2\ufff9\ufff4\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\ufffa￼￼\u001b\ufffb\u001c\u001d\u001e\u001f\u009f ¢£¤¥¦§©\u00ad®¶\u0095\u0096\u0097\u0098\u0099\u009a\u009b\u009c\u009d\u009e\ufff7 \ufff2\ufff3\ufff9\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};
    private static final char SHIFTA = 65520;
    private static final char SHIFTB = 65521;
    private static final char SHIFTC = 65522;
    private static final char SHIFTD = 65523;
    private static final char SHIFTE = 65524;
    private static final char THREESHIFTA = 65526;
    private static final char TWOSHIFTA = 65525;

    private DecodedBitStreamParser() {
    }

    public static DecoderResult decode(byte[] bArr, int i) {
        String postCode3;
        String str;
        int i2;
        StringBuilder sb = new StringBuilder(144);
        if (i == 2 || i == 3) {
            int i3 = 0;
            if (i == 2) {
                postCode3 = new DecimalFormat("0000000000".substring(0, getPostCode2Length(bArr))).format(getPostCode2(bArr));
            } else {
                postCode3 = getPostCode3(bArr);
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String str2 = decimalFormat.format(getCountry(bArr));
            String str3 = decimalFormat.format(getServiceClass(bArr));
            sb.append(getMessage(bArr, 10, 84));
            if (sb.toString().startsWith("[)>\u001e01\u001d")) {
                str = postCode3 + f11205GS + str2 + f11205GS + str3 + f11205GS;
                i3 = 9;
            } else {
                str = postCode3 + f11205GS + str2 + f11205GS + str3 + f11205GS;
            }
            sb.insert(i3, str);
        } else {
            if (i != 4) {
                i2 = i == 5 ? 77 : 93;
            }
            sb.append(getMessage(bArr, 1, i2));
        }
        return new DecoderResult(bArr, sb.toString(), null, String.valueOf(i));
    }

    private static int getBit(int i, byte[] bArr) {
        int i2 = i - 1;
        return ((1 << (5 - (i2 % 6))) & bArr[i2 / 6]) == 0 ? 0 : 1;
    }

    private static int getCountry(byte[] bArr) {
        return getInt(bArr, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38});
    }

    private static int getInt(byte[] bArr, byte[] bArr2) {
        if (bArr2.length == 0) {
            throw new IllegalArgumentException();
        }
        int bit = 0;
        for (int i = 0; i < bArr2.length; i++) {
            bit += getBit(bArr2[i], bArr) << ((bArr2.length - i) - 1);
        }
        return bit;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static String getMessage(byte[] bArr, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        int i3 = i;
        int i4 = 0;
        int i5 = -1;
        int i6 = 0;
        while (i3 < i + i2) {
            char cCharAt = SETS[i4].charAt(bArr[i3]);
            switch (cCharAt) {
                case 65520:
                case 65521:
                case 65522:
                case 65523:
                case 65524:
                    i6 = i4;
                    i4 = cCharAt - SHIFTA;
                    i5 = 1;
                    break;
                case 65525:
                    i5 = 2;
                    i6 = i4;
                    i4 = 0;
                    break;
                case 65526:
                    i5 = 3;
                    i6 = i4;
                    i4 = 0;
                    break;
                case 65527:
                    i4 = 0;
                    i5 = -1;
                    break;
                case 65528:
                    i4 = 1;
                    i5 = -1;
                    break;
                case 65529:
                    i5 = -1;
                    break;
                case 65530:
                default:
                    sb.append(cCharAt);
                    break;
                case 65531:
                    int i7 = (bArr[i3 + 1] << 24) + (bArr[i3 + 2] << SAXEventRecorder.SAXEvent.f16652u) + (bArr[i3 + 3] << SAXEventRecorder.SAXEvent.f16646o) + (bArr[i3 + 4] << 6);
                    i3 += 5;
                    sb.append(new DecimalFormat("000000000").format(i7 + bArr[i3]));
                    break;
            }
            int i8 = i5 - 1;
            if (i5 == 0) {
                i4 = i6;
            }
            i3++;
            i5 = i8;
        }
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == 65532) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    private static int getPostCode2(byte[] bArr) {
        return getInt(bArr, new byte[]{PublicSuffixDatabase.f15556i, 34, 35, 36, 25, 26, 27, 28, 29, 30, SAXEventRecorder.SAXEvent.f16653v, 20, 21, 22, 23, 24, 13, SAXEventRecorder.SAXEvent.f16648q, SAXEventRecorder.SAXEvent.f16649r, 16, SAXEventRecorder.SAXEvent.f16651t, SAXEventRecorder.SAXEvent.f16652u, 7, 8, 9, 10, SAXEventRecorder.SAXEvent.f16645n, SAXEventRecorder.SAXEvent.f16646o, 1, 2});
    }

    private static int getPostCode2Length(byte[] bArr) {
        return getInt(bArr, new byte[]{39, 40, 41, 42, 31, 32});
    }

    private static String getPostCode3(byte[] bArr) {
        String[] strArr = SETS;
        return String.valueOf(new char[]{strArr[0].charAt(getInt(bArr, new byte[]{39, 40, 41, 42, 31, 32})), strArr[0].charAt(getInt(bArr, new byte[]{PublicSuffixDatabase.f15556i, 34, 35, 36, 25, 26})), strArr[0].charAt(getInt(bArr, new byte[]{27, 28, 29, 30, SAXEventRecorder.SAXEvent.f16653v, 20})), strArr[0].charAt(getInt(bArr, new byte[]{21, 22, 23, 24, 13, SAXEventRecorder.SAXEvent.f16648q})), strArr[0].charAt(getInt(bArr, new byte[]{SAXEventRecorder.SAXEvent.f16649r, 16, SAXEventRecorder.SAXEvent.f16651t, SAXEventRecorder.SAXEvent.f16652u, 7, 8})), strArr[0].charAt(getInt(bArr, new byte[]{9, 10, SAXEventRecorder.SAXEvent.f16645n, SAXEventRecorder.SAXEvent.f16646o, 1, 2}))});
    }

    private static int getServiceClass(byte[] bArr) {
        return getInt(bArr, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52});
    }
}
