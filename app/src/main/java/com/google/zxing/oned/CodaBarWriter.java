package com.google.zxing.oned;

import org.apache.commons.p013io.FilenameUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class CodaBarWriter extends OneDimensionalCodeWriter {
    private static final char[] ALT_START_END_CHARS = {'T', 'N', '*', 'E'};
    private static final char[] CHARS_WHICH_ARE_TEN_LENGTH_EACH_AFTER_DECODED = {'/', ':', '+', FilenameUtils.f15632b};
    private static final char DEFAULT_GUARD;
    private static final char[] START_END_CHARS;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        START_END_CHARS = cArr;
        DEFAULT_GUARD = cArr[0];
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007b  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:56:0x0102  */
    /* JADX WARN: Code duplicated, block: B:60:0x010a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0113 A[LOOP:2: B:58:0x0105->B:63:0x0113, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x013a  */
    /* JADX WARN: Code duplicated, block: B:89:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x010e A[SYNTHETIC] */
    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        StringBuilder sb;
        int i;
        int i2;
        boolean[] zArr;
        int i3;
        int i4;
        char upperCase;
        int i5;
        char[] cArr;
        int i6;
        int i7;
        boolean z;
        int i8;
        if (str.length() >= 2) {
            char upperCase2 = Character.toUpperCase(str.charAt(0));
            char upperCase3 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr2 = START_END_CHARS;
            boolean zArrayContains = CodaBarReader.arrayContains(cArr2, upperCase2);
            boolean zArrayContains2 = CodaBarReader.arrayContains(cArr2, upperCase3);
            char[] cArr3 = ALT_START_END_CHARS;
            boolean zArrayContains3 = CodaBarReader.arrayContains(cArr3, upperCase2);
            boolean zArrayContains4 = CodaBarReader.arrayContains(cArr3, upperCase3);
            if (zArrayContains) {
                if (!zArrayContains2) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!zArrayContains3) {
                if (zArrayContains2 || zArrayContains4) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
                sb = new StringBuilder();
            } else if (!zArrayContains4) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
            i = 20;
            for (i2 = 1; i2 < str.length() - 1; i2++) {
                if (!Character.isDigit(str.charAt(i2)) || str.charAt(i2) == '-' || str.charAt(i2) == '$') {
                    i += 9;
                } else {
                    if (!CodaBarReader.arrayContains(CHARS_WHICH_ARE_TEN_LENGTH_EACH_AFTER_DECODED, str.charAt(i2))) {
                        throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i2) + '\'');
                    }
                    i += 10;
                }
            }
            zArr = new boolean[(str.length() - 1) + i];
            i4 = 0;
            for (i3 = 0; i3 < str.length(); i3++) {
                upperCase = Character.toUpperCase(str.charAt(i3));
                if (i3 != 0 || i3 == str.length() - 1) {
                    if (upperCase == '*') {
                        upperCase = 'C';
                    } else if (upperCase == 'E') {
                        upperCase = 'D';
                    } else if (upperCase == 'N') {
                        upperCase = 'B';
                    } else if (upperCase == 'T') {
                        upperCase = 'A';
                    }
                }
                i5 = 0;
                while (true) {
                    cArr = CodaBarReader.ALPHABET;
                    if (i5 < cArr.length) {
                        i6 = 0;
                        break;
                    }
                    if (upperCase == cArr[i5]) {
                        i6 = CodaBarReader.CHARACTER_ENCODINGS[i5];
                        break;
                    }
                    i5++;
                }
                i7 = 0;
                z = true;
                while (true) {
                    i8 = 0;
                    while (i7 < 7) {
                        zArr[i4] = z;
                        i4++;
                        if (((i6 >> (6 - i7)) & 1) != 0 || i8 == 1) {
                            z = !z;
                            i7++;
                        } else {
                            i8++;
                        }
                    }
                    break;
                }
                if (i3 < str.length() - 1) {
                    zArr[i4] = false;
                    i4++;
                }
            }
            return zArr;
        }
        sb = new StringBuilder();
        char c = DEFAULT_GUARD;
        sb.append(c);
        sb.append(str);
        sb.append(c);
        str = sb.toString();
        i = 20;
        while (i2 < str.length() - 1) {
            if (Character.isDigit(str.charAt(i2))) {
                i += 9;
            } else {
                i += 9;
            }
        }
        zArr = new boolean[(str.length() - 1) + i];
        i4 = 0;
        while (i3 < str.length()) {
            upperCase = Character.toUpperCase(str.charAt(i3));
            if (i3 != 0) {
                if (upperCase == '*') {
                    upperCase = 'C';
                } else if (upperCase == 'E') {
                    upperCase = 'D';
                } else if (upperCase == 'N') {
                    upperCase = 'B';
                } else if (upperCase == 'T') {
                    upperCase = 'A';
                }
            } else if (upperCase == '*') {
                upperCase = 'C';
            } else if (upperCase == 'E') {
                upperCase = 'D';
            } else if (upperCase == 'N') {
                upperCase = 'B';
            } else if (upperCase == 'T') {
                upperCase = 'A';
            }
            i5 = 0;
            while (true) {
                cArr = CodaBarReader.ALPHABET;
                if (i5 < cArr.length) {
                    i6 = 0;
                    break;
                }
                if (upperCase == cArr[i5]) {
                    i6 = CodaBarReader.CHARACTER_ENCODINGS[i5];
                    break;
                }
                i5++;
            }
            i7 = 0;
            z = true;
            while (true) {
                i8 = 0;
                while (true) {
                    zArr[i4] = z;
                    i4++;
                    if (((i6 >> (6 - i7)) & 1) != 0) {
                    }
                    z = !z;
                    i7++;
                    i8++;
                }
            }
            if (i3 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }
}
