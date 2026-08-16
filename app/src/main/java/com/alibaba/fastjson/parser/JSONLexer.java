package com.alibaba.fastjson.parser;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class JSONLexer {

    /* JADX INFO: renamed from: CA */
    public static final char[] f10738CA;
    public static final int END = 4;
    public static final char EOI = 26;

    /* JADX INFO: renamed from: IA */
    static final int[] f10739IA;
    public static final int NOT_MATCH = -1;
    public static final int NOT_MATCH_NAME = -2;
    public static final int UNKNOWN = 0;

    /* JADX INFO: renamed from: V6 */
    private static boolean f10740V6 = false;
    public static final int VALUE = 3;
    protected static final int[] digits;
    public static final boolean[] firstIdentifierFlags;
    public static final boolean[] identifierFlags;
    private static final ThreadLocal<char[]> sbufLocal;

    /* JADX INFO: renamed from: bp */
    protected int f10741bp;
    public Calendar calendar;

    /* JADX INFO: renamed from: ch */
    protected char f10742ch;
    public boolean disableCircularReferenceDetect;
    protected int eofPos;
    protected boolean exp;
    public int features;
    protected long fieldHash;
    protected boolean hasSpecial;
    protected boolean isDouble;
    protected final int len;
    public Locale locale;
    public int matchStat;

    /* JADX INFO: renamed from: np */
    protected int f10743np;
    protected int pos;
    protected char[] sbuf;

    /* JADX INFO: renamed from: sp */
    protected int f10744sp;
    protected String stringDefaultValue;
    protected final String text;
    public TimeZone timeZone;
    protected int token;

    static {
        int i;
        char c;
        char c2;
        try {
            i = Class.forName("android.os.Build$VERSION").getField("SDK_INT").getInt(null);
            while (true) {
                boolean[] zArr = firstIdentifierFlags;
                if (c2 >= zArr.length) {
                    break;
                }
                if (c2 >= 'A' && c2 <= 'Z') {
                    zArr[c2] = true;
                } else if (c2 >= 'a' && c2 <= 'z') {
                    zArr[c2] = true;
                } else if (c2 == '_') {
                    zArr[c2] = true;
                }
                c2 = (char) (c2 + 1);
            }
            while (true) {
                boolean[] zArr2 = identifierFlags;
                if (c >= zArr2.length) {
                    return;
                }
                if (c >= 'A' && c <= 'Z') {
                    zArr2[c] = true;
                } else if (c >= 'a' && c <= 'z') {
                    zArr2[c] = true;
                } else if (c == '_') {
                    zArr2[c] = true;
                } else if (c >= '0' && c <= '9') {
                    zArr2[c] = true;
                }
                c = (char) (c + 1);
            }
        } catch (Exception unused) {
            i = -1;
        }
        c = 0;
        f10740V6 = i >= 23;
        sbufLocal = new ThreadLocal<>();
        digits = new int[103];
        for (int i2 = 48; i2 <= 57; i2++) {
            digits[i2] = i2 - 48;
        }
        for (int i3 = 97; i3 <= 102; i3++) {
            digits[i3] = i3 - 87;
        }
        for (int i4 = 65; i4 <= 70; i4++) {
            digits[i4] = i4 - 55;
        }
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f10738CA = charArray;
        int[] iArr = new int[256];
        f10739IA = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i5 = 0; i5 < length; i5++) {
            f10739IA[f10738CA[i5]] = i5;
        }
        f10739IA[61] = 0;
        firstIdentifierFlags = new boolean[256];
        c2 = 0;
        identifierFlags = new boolean[256];
    }

    /* JADX WARN: Invalid debug info offset */
    public JSONLexer(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JSONLexer(String str, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JSONLexer(char[] cArr, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JSONLexer(char[] cArr, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean checkDate(char c, char c2, char c3, char c4, char c5, char c6, int i, int i2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean checkTime(char c, char c2, char c3, char c4, char c5, char c6) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final byte[] decodeFast(String str, int i, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private int matchFieldHash(long j) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private static String readString(char[] cArr, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private void scanIdent() {
    }

    /* JADX WARN: Invalid debug info offset */
    private void setCalendar(char c, char c2, char c3, char c4, char c5, char c6, char c7, char c8) {
    }

    /* JADX WARN: Invalid debug info offset */
    private final String subString(int i, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] bytesValue() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public char charAt(int i) {
        return (char) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void close() {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void config(Feature feature, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0018
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public final java.lang.Number decimalValue(boolean r9) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.decimalValue(boolean):java.lang.Number");
    }

    /* JADX WARN: Invalid debug info offset */
    public final BigDecimal decimalValue() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String info() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final int intValue() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public final Number integerValue() throws NumberFormatException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final boolean isBlankInput() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public final boolean isEnabled(Feature feature) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public final long longValue() throws NumberFormatException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean matchField(long j) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public char next() {
        return (char) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public final void nextIdent() {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void nextToken() {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void nextToken(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void nextTokenWithChar(char c) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final String numberString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean scanBoolean() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean scanFieldBoolean(long j) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public Date scanFieldDate(long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final double scanFieldDouble(long j) {
        return 0.0d;
    }

    /* JADX WARN: Invalid debug info offset */
    public final double[] scanFieldDoubleArray(long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final double[][] scanFieldDoubleArray2(long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final float scanFieldFloat(long j) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    public final float[] scanFieldFloatArray(long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final float[][] scanFieldFloatArray2(long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int scanFieldInt(long j) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public final int[] scanFieldIntArray(long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public long scanFieldLong(long j) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public String scanFieldString(long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public long scanFieldSymbol(long j) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean scanISO8601DateIfMatch(boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean scanISO8601DateIfMatch(boolean z, int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public final long scanLongValue() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public final void scanNumber() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x024f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public final java.lang.Number scanNumberValue() {
        /*
            Method dump skipped, instruction units count: 723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanNumberValue():java.lang.Number");
    }

    /* JADX WARN: Invalid debug info offset */
    public final void scanString() {
    }

    /* JADX WARN: Invalid debug info offset */
    public String scanStringValue(char c) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final String scanSymbol(SymbolTable symbolTable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String scanSymbol(SymbolTable symbolTable, char c) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final String scanSymbolUnQuoted(SymbolTable symbolTable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setTime(char c, char c2, char c3, char c4, char c5, char c6) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setTimeZone(char c, char c2, char c3) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void skipComment() {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void skipWhitespace() {
    }

    /* JADX WARN: Invalid debug info offset */
    public final String stringVal() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final char[] sub_chars(int i, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final int token() {
        return 0;
    }
}
