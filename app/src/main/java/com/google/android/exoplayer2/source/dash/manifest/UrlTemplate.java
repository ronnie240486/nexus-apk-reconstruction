package com.google.android.exoplayer2.source.dash.manifest;

import java.util.Locale;
import p000.C0786MA;

/* JADX INFO: loaded from: classes2.dex */
public final class UrlTemplate {
    private static final String BANDWIDTH = "Bandwidth";
    private static final int BANDWIDTH_ID = 3;
    private static final String DEFAULT_FORMAT_TAG = "%01d";
    private static final String ESCAPED_DOLLAR = "$$";
    private static final String NUMBER = "Number";
    private static final int NUMBER_ID = 2;
    private static final String REPRESENTATION = "RepresentationID";
    private static final int REPRESENTATION_ID = 1;
    private static final String TIME = "Time";
    private static final int TIME_ID = 4;
    private final int identifierCount;
    private final String[] identifierFormatTags;
    private final int[] identifiers;
    private final String[] urlPieces;

    private UrlTemplate(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.urlPieces = strArr;
        this.identifiers = iArr;
        this.identifierFormatTags = strArr2;
        this.identifierCount = i;
    }

    public static UrlTemplate compile(String str) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new UrlTemplate(strArr, iArr, strArr2, parseTemplate(str, strArr, iArr, strArr2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x00ac  */
    private static int parseTemplate(String str, String[] strArr, int[] iArr, String[] strArr2) {
        String strSubstring;
        strArr[0] = "";
        int length = 0;
        int i = 0;
        while (length < str.length()) {
            int iIndexOf = str.indexOf("$", length);
            if (iIndexOf == -1) {
                strArr[i] = strArr[i] + str.substring(length);
                length = str.length();
            } else if (iIndexOf != length) {
                strArr[i] = strArr[i] + str.substring(length, iIndexOf);
                length = iIndexOf;
            } else if (str.startsWith(ESCAPED_DOLLAR, length)) {
                strArr[i] = C0786MA.m3668a(new StringBuilder(), strArr[i], "$");
                length += 2;
            } else {
                int i2 = length + 1;
                int iIndexOf2 = str.indexOf("$", i2);
                String strSubstring2 = str.substring(i2, iIndexOf2);
                if (strSubstring2.equals(REPRESENTATION)) {
                    iArr[i] = 1;
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x")) {
                            strSubstring = strSubstring.concat("d");
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = DEFAULT_FORMAT_TAG;
                    }
                    strSubstring2.getClass();
                    switch (strSubstring2) {
                        case "Number":
                            iArr[i] = 2;
                            break;
                        case "Time":
                            iArr[i] = 4;
                            break;
                        case "Bandwidth":
                            iArr[i] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: ".concat(str));
                    }
                    strArr2[i] = strSubstring;
                }
                i++;
                strArr[i] = "";
                length = iIndexOf2 + 1;
            }
        }
        return i;
    }

    public String buildUri(String str, long j, int i, long j2) {
        String str2;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = this.identifierCount;
            if (i2 >= i3) {
                sb.append(this.urlPieces[i3]);
                return sb.toString();
            }
            sb.append(this.urlPieces[i2]);
            int i4 = this.identifiers[i2];
            if (i4 == 1) {
                sb.append(str);
            } else {
                if (i4 == 2) {
                    str2 = String.format(Locale.US, this.identifierFormatTags[i2], Long.valueOf(j));
                } else if (i4 == 3) {
                    str2 = String.format(Locale.US, this.identifierFormatTags[i2], Integer.valueOf(i));
                } else if (i4 == 4) {
                    str2 = String.format(Locale.US, this.identifierFormatTags[i2], Long.valueOf(j2));
                }
                sb.append(str2);
            }
            i2++;
        }
    }
}
