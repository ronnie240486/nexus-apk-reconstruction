package com.google.zxing.client.result;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import java.util.HashMap;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.dom4j.p020io.SAXEventRecorder;

/* JADX INFO: loaded from: classes2.dex */
public final class ExpandedProductResultParser extends ResultParser {
    private static String findAIvalue(int i, String str) {
        char cCharAt;
        if (str.charAt(i) != '(') {
            return null;
        }
        String strSubstring = str.substring(i + 1);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < strSubstring.length() && (cCharAt = strSubstring.charAt(i2)) != ')'; i2++) {
            if (cCharAt < '0' || cCharAt > '9') {
                return null;
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    private static String findValue(int i, String str) {
        StringBuilder sb = new StringBuilder();
        String strSubstring = str.substring(i);
        for (int i2 = 0; i2 < strSubstring.length(); i2++) {
            char cCharAt = strSubstring.charAt(i2);
            if (cCharAt != '(') {
                sb.append(cCharAt);
            } else {
                if (findAIvalue(i2, strSubstring) != null) {
                    break;
                }
                sb.append('(');
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.zxing.client.result.ResultParser
    public ExpandedProductParsedResult parse(Result result) {
        if (result.getBarcodeFormat() != BarcodeFormat.RSS_EXPANDED) {
            return null;
        }
        String massagedText = ResultParser.getMassagedText(result);
        HashMap map = new HashMap();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String strSubstring = null;
        String strSubstring2 = null;
        String strSubstring3 = null;
        String strSubstring4 = null;
        int length = 0;
        while (length < massagedText.length()) {
            String strFindAIvalue = findAIvalue(length, massagedText);
            if (strFindAIvalue == null) {
                return null;
            }
            int length2 = strFindAIvalue.length() + 2 + length;
            String strFindValue = findValue(length2, massagedText);
            length = strFindValue.length() + length2;
            byte b = -1;
            switch (strFindAIvalue.hashCode()) {
                case 1536:
                    if (strFindAIvalue.equals("00")) {
                        b = 0;
                    }
                    break;
                case 1537:
                    if (strFindAIvalue.equals("01")) {
                        b = 1;
                    }
                    break;
                case 1567:
                    if (strFindAIvalue.equals("10")) {
                        b = 2;
                    }
                    break;
                case 1568:
                    if (strFindAIvalue.equals("11")) {
                        b = 3;
                    }
                    break;
                case 1570:
                    if (strFindAIvalue.equals("13")) {
                        b = 4;
                    }
                    break;
                case 1572:
                    if (strFindAIvalue.equals("15")) {
                        b = 5;
                    }
                    break;
                case 1574:
                    if (strFindAIvalue.equals("17")) {
                        b = 6;
                    }
                    break;
                case 1567966:
                    if (strFindAIvalue.equals("3100")) {
                        b = 7;
                    }
                    break;
                case 1567967:
                    if (strFindAIvalue.equals("3101")) {
                        b = 8;
                    }
                    break;
                case 1567968:
                    if (strFindAIvalue.equals("3102")) {
                        b = 9;
                    }
                    break;
                case 1567969:
                    if (strFindAIvalue.equals("3103")) {
                        b = 10;
                    }
                    break;
                case 1567970:
                    if (strFindAIvalue.equals("3104")) {
                        b = SAXEventRecorder.SAXEvent.f16645n;
                    }
                    break;
                case 1567971:
                    if (strFindAIvalue.equals("3105")) {
                        b = SAXEventRecorder.SAXEvent.f16646o;
                    }
                    break;
                case 1567972:
                    if (strFindAIvalue.equals("3106")) {
                        b = 13;
                    }
                    break;
                case 1567973:
                    if (strFindAIvalue.equals("3107")) {
                        b = SAXEventRecorder.SAXEvent.f16648q;
                    }
                    break;
                case 1567974:
                    if (strFindAIvalue.equals("3108")) {
                        b = SAXEventRecorder.SAXEvent.f16649r;
                    }
                    break;
                case 1567975:
                    if (strFindAIvalue.equals("3109")) {
                        b = 16;
                    }
                    break;
                case 1568927:
                    if (strFindAIvalue.equals("3200")) {
                        b = SAXEventRecorder.SAXEvent.f16651t;
                    }
                    break;
                case 1568928:
                    if (strFindAIvalue.equals("3201")) {
                        b = SAXEventRecorder.SAXEvent.f16652u;
                    }
                    break;
                case 1568929:
                    if (strFindAIvalue.equals("3202")) {
                        b = SAXEventRecorder.SAXEvent.f16653v;
                    }
                    break;
                case 1568930:
                    if (strFindAIvalue.equals("3203")) {
                        b = 20;
                    }
                    break;
                case 1568931:
                    if (strFindAIvalue.equals("3204")) {
                        b = 21;
                    }
                    break;
                case 1568932:
                    if (strFindAIvalue.equals("3205")) {
                        b = 22;
                    }
                    break;
                case 1568933:
                    if (strFindAIvalue.equals("3206")) {
                        b = 23;
                    }
                    break;
                case 1568934:
                    if (strFindAIvalue.equals("3207")) {
                        b = 24;
                    }
                    break;
                case 1568935:
                    if (strFindAIvalue.equals("3208")) {
                        b = 25;
                    }
                    break;
                case 1568936:
                    if (strFindAIvalue.equals("3209")) {
                        b = 26;
                    }
                    break;
                case 1575716:
                    if (strFindAIvalue.equals("3920")) {
                        b = 27;
                    }
                    break;
                case 1575717:
                    if (strFindAIvalue.equals("3921")) {
                        b = 28;
                    }
                    break;
                case 1575718:
                    if (strFindAIvalue.equals("3922")) {
                        b = 29;
                    }
                    break;
                case 1575719:
                    if (strFindAIvalue.equals("3923")) {
                        b = 30;
                    }
                    break;
                case 1575747:
                    if (strFindAIvalue.equals("3930")) {
                        b = 31;
                    }
                    break;
                case 1575748:
                    if (strFindAIvalue.equals("3931")) {
                        b = 32;
                    }
                    break;
                case 1575749:
                    if (strFindAIvalue.equals("3932")) {
                        b = PublicSuffixDatabase.f15556i;
                    }
                    break;
                case 1575750:
                    if (strFindAIvalue.equals("3933")) {
                        b = 34;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    str2 = strFindValue;
                    continue;
                case 1:
                    str = strFindValue;
                    continue;
                case 2:
                    str3 = strFindValue;
                    continue;
                case 3:
                    str4 = strFindValue;
                    continue;
                case 4:
                    str5 = strFindValue;
                    continue;
                case 5:
                    str6 = strFindValue;
                    continue;
                case 6:
                    str7 = strFindValue;
                    continue;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    strSubstring = strFindAIvalue.substring(3);
                    str9 = ExpandedProductParsedResult.KILOGRAM;
                    break;
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    strSubstring = strFindAIvalue.substring(3);
                    str9 = ExpandedProductParsedResult.POUND;
                    break;
                case 27:
                case 28:
                case 29:
                case 30:
                    strSubstring3 = strFindAIvalue.substring(3);
                    strSubstring2 = strFindValue;
                    continue;
                case 31:
                case 32:
                case 33:
                case 34:
                    if (strFindValue.length() < 4) {
                        return null;
                    }
                    strSubstring2 = strFindValue.substring(3);
                    strSubstring4 = strFindValue.substring(0, 3);
                    strSubstring3 = strFindAIvalue.substring(3);
                    continue;
                    break;
                default:
                    map.put(strFindAIvalue, strFindValue);
                    continue;
            }
            str8 = strFindValue;
        }
        return new ExpandedProductParsedResult(massagedText, str, str2, str3, str4, str5, str6, str7, str8, str9, strSubstring, strSubstring2, strSubstring3, strSubstring4, map);
    }
}
