package com.google.gson.stream;

import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.bind.JsonTreeReader;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import org.apache.commons.p013io.FilenameUtils;
import org.slf4j.impl.AndroidLoggerFactory;
import p000.C0305Ec;
import p000.C1002PX;
import p000.C1469Wn;

/* JADX INFO: loaded from: classes2.dex */
public class JsonReader implements Closeable {
    private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
    private static final char[] NON_EXECUTE_PREFIX = ")]}'\n".toCharArray();
    private static final int NUMBER_CHAR_DECIMAL = 3;
    private static final int NUMBER_CHAR_DIGIT = 2;
    private static final int NUMBER_CHAR_EXP_DIGIT = 7;
    private static final int NUMBER_CHAR_EXP_E = 5;
    private static final int NUMBER_CHAR_EXP_SIGN = 6;
    private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
    private static final int NUMBER_CHAR_NONE = 0;
    private static final int NUMBER_CHAR_SIGN = 1;
    private static final int PEEKED_BEGIN_ARRAY = 3;
    private static final int PEEKED_BEGIN_OBJECT = 1;
    private static final int PEEKED_BUFFERED = 11;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 17;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 15;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 16;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;

    /* JADX INFO: renamed from: in */
    private final Reader f11197in;
    private int[] pathIndices;
    private String[] pathNames;
    private long peekedLong;
    private int peekedNumberLength;
    private String peekedString;
    private int[] stack;
    private boolean lenient = false;
    private final char[] buffer = new char[1024];
    private int pos = 0;
    private int limit = 0;
    private int lineNumber = 0;
    private int lineStart = 0;
    int peeked = 0;
    private int stackSize = 1;

    static {
        JsonReaderInternalAccess.INSTANCE = new JsonReaderInternalAccess() { // from class: com.google.gson.stream.JsonReader.1
            @Override // com.google.gson.internal.JsonReaderInternalAccess
            public void promoteNameToValue(JsonReader jsonReader) throws IOException {
                int i;
                if (jsonReader instanceof JsonTreeReader) {
                    ((JsonTreeReader) jsonReader).promoteNameToValue();
                    return;
                }
                int iDoPeek = jsonReader.peeked;
                if (iDoPeek == 0) {
                    iDoPeek = jsonReader.doPeek();
                }
                if (iDoPeek == 13) {
                    i = 9;
                } else if (iDoPeek == 12) {
                    i = 8;
                } else {
                    if (iDoPeek != 14) {
                        throw new IllegalStateException("Expected a name but was " + jsonReader.peek() + jsonReader.locationString());
                    }
                    i = 10;
                }
                jsonReader.peeked = i;
            }
        };
    }

    public JsonReader(Reader reader) {
        int[] iArr = new int[32];
        this.stack = iArr;
        iArr[0] = 6;
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f11197in = reader;
    }

    private void checkLenient() throws IOException {
        if (!this.lenient) {
            throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void consumeNonExecutePrefix() throws IOException {
        nextNonWhitespace(true);
        int i = this.pos - 1;
        this.pos = i;
        char[] cArr = NON_EXECUTE_PREFIX;
        if (i + cArr.length > this.limit && !fillBuffer(cArr.length)) {
            return;
        }
        int i2 = 0;
        while (true) {
            char[] cArr2 = NON_EXECUTE_PREFIX;
            if (i2 >= cArr2.length) {
                this.pos += cArr2.length;
                return;
            } else if (this.buffer[this.pos + i2] != cArr2[i2]) {
                return;
            } else {
                i2++;
            }
        }
    }

    private boolean fillBuffer(int i) throws IOException {
        int i2;
        int i3;
        char[] cArr = this.buffer;
        int i4 = this.lineStart;
        int i5 = this.pos;
        this.lineStart = i4 - i5;
        int i6 = this.limit;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.limit = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.limit = 0;
        }
        this.pos = 0;
        do {
            Reader reader = this.f11197in;
            int i8 = this.limit;
            int i9 = reader.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.limit + i9;
            this.limit = i2;
            if (this.lineNumber == 0 && (i3 = this.lineStart) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.pos++;
                this.lineStart = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    private boolean isLiteral(char c) throws IOException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        checkLenient();
        return false;
    }

    private int nextNonWhitespace(boolean z) throws IOException {
        int i;
        char c;
        char[] cArr = this.buffer;
        while (true) {
            int i2 = this.pos;
            while (true) {
                int i3 = this.limit;
                while (true) {
                    if (i2 == i3) {
                        this.pos = i2;
                        if (!fillBuffer(1)) {
                            if (!z) {
                                return -1;
                            }
                            throw new EOFException("End of input" + locationString());
                        }
                        i2 = this.pos;
                        i3 = this.limit;
                    }
                    i = i2 + 1;
                    c = cArr[i2];
                    if (c == '\n') {
                        this.lineNumber++;
                        this.lineStart = i;
                    } else if (c == ' ' || c == '\r' || c == '\t') {
                    }
                    i2 = i;
                }
                if (c != '/') {
                    this.pos = i;
                    if (c != '#') {
                        return c;
                    }
                    checkLenient();
                    break;
                }
                this.pos = i;
                if (i == i3) {
                    this.pos = i2;
                    boolean zFillBuffer = fillBuffer(2);
                    this.pos++;
                    if (!zFillBuffer) {
                        return c;
                    }
                }
                checkLenient();
                int i4 = this.pos;
                char c2 = cArr[i4];
                if (c2 != '*') {
                    if (c2 == '/') {
                        this.pos = i4 + 1;
                        break;
                    }
                    return c;
                }
                this.pos = i4 + 1;
                if (!skipTo("*/")) {
                    throw syntaxError("Unterminated comment");
                }
                i2 = this.pos + 2;
            }
            skipToEndOfLine();
        }
    }

    private String nextQuotedValue(char c) throws IOException {
        char[] cArr = this.buffer;
        StringBuilder sb = null;
        while (true) {
            int i = this.pos;
            int i2 = this.limit;
            while (true) {
                if (i >= i2) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i - i) * 2, 16));
                    }
                    sb.append(cArr, i, i - i);
                    this.pos = i;
                    if (fillBuffer(1)) {
                        break;
                    }
                    throw syntaxError("Unterminated string");
                }
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.pos = i3;
                    int i4 = (i3 - i) - 1;
                    if (sb == null) {
                        return new String(cArr, i, i4);
                    }
                    sb.append(cArr, i, i4);
                    return sb.toString();
                }
                if (c2 == '\\') {
                    this.pos = i3;
                    int i5 = i3 - i;
                    int i6 = i5 - 1;
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i5 * 2, 16));
                    }
                    sb.append(cArr, i, i6);
                    sb.append(readEscapeCharacter());
                    break;
                }
                if (c2 == '\n') {
                    this.lineNumber++;
                    this.lineStart = i3;
                }
                i = i3;
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    private String nextUnquotedValue() throws IOException {
        String string;
        StringBuilder sb = null;
        int i = 0;
        while (true) {
            int i2 = 0;
            while (true) {
                int i3 = this.pos;
                if (i3 + i2 < this.limit) {
                    char c = this.buffer[i3 + i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        checkLenient();
                    }
                    i = i2;
                } else if (i2 >= this.buffer.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i2, 16));
                    }
                    sb.append(this.buffer, this.pos, i2);
                    this.pos += i2;
                    if (!fillBuffer(1)) {
                    }
                } else if (!fillBuffer(i2 + 1)) {
                    i = i2;
                }
                if (sb == null) {
                    string = new String(this.buffer, this.pos, i);
                } else {
                    sb.append(this.buffer, this.pos, i);
                    string = sb.toString();
                }
                this.pos += i;
                return string;
            }
        }
    }

    private int peekKeyword() throws IOException {
        String str;
        String str2;
        int i;
        char c = this.buffer[this.pos];
        if (c == 't' || c == 'T') {
            str = "true";
            str2 = "TRUE";
            i = 5;
        } else if (c == 'f' || c == 'F') {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else {
            if (c != 'n' && c != 'N') {
                return 0;
            }
            str = AndroidLoggerFactory.f17234b;
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.pos + i2 >= this.limit && !fillBuffer(i2 + 1)) {
                return 0;
            }
            char c2 = this.buffer[this.pos + i2];
            if (c2 != str.charAt(i2) && c2 != str2.charAt(i2)) {
                return 0;
            }
        }
        if ((this.pos + length < this.limit || fillBuffer(length + 1)) && isLiteral(this.buffer[this.pos + length])) {
            return 0;
        }
        this.pos += length;
        this.peeked = i;
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0030  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:93:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:98:0x00ef  */
    private int peekNumber() throws IOException {
        char c;
        int i;
        char[] cArr = this.buffer;
        int i2 = this.pos;
        int i3 = this.limit;
        int i4 = 0;
        int i5 = 0;
        char c2 = 0;
        boolean z = true;
        long j = 0;
        boolean z2 = false;
        while (true) {
            if (i2 + i5 != i3) {
                c = cArr[i2 + i5];
                if (c != '+') {
                    if (c != 'E' || c == 'e') {
                        i4 = 0;
                        if (c2 == 2 && c2 != 4) {
                            return 0;
                        }
                        c2 = 5;
                    } else if (c == '-') {
                        i4 = 0;
                        if (c2 == 0) {
                            c2 = 1;
                            z2 = true;
                        } else if (c2 != 5) {
                            return 0;
                        }
                    } else if (c == '.') {
                        i4 = 0;
                        if (c2 != 2) {
                            return 0;
                        }
                        c2 = 3;
                    } else {
                        if (c < '0' || c > '9') {
                            if (!isLiteral(c)) {
                                break;
                            }
                            return 0;
                        }
                        if (c2 == 1 || c2 == 0) {
                            j = -(c - '0');
                            i4 = 0;
                            c2 = 2;
                        } else {
                            if (c2 == 2) {
                                if (j == 0) {
                                    return 0;
                                }
                                long j2 = (10 * j) - ((long) (c - '0'));
                                z &= j > MIN_INCOMPLETE_INTEGER || (j == MIN_INCOMPLETE_INTEGER && j2 < j);
                                j = j2;
                            } else if (c2 == 3) {
                                i4 = 0;
                                c2 = 4;
                            } else if (c2 == 5 || c2 == 6) {
                                i4 = 0;
                                c2 = 7;
                            }
                            i4 = 0;
                        }
                    }
                    i5++;
                } else {
                    i4 = 0;
                    if (c2 != 5) {
                        return 0;
                    }
                }
                c2 = 6;
                i5++;
            } else {
                if (i5 == cArr.length) {
                    return i4;
                }
                if (!fillBuffer(i5 + 1)) {
                    break;
                }
                i2 = this.pos;
                i3 = this.limit;
                c = cArr[i2 + i5];
                if (c != '+') {
                    if (c != 'E') {
                        i4 = 0;
                        if (c2 == 2) {
                        }
                        c2 = 5;
                    } else {
                        i4 = 0;
                        if (c2 == 2) {
                        }
                        c2 = 5;
                    }
                    i5++;
                } else {
                    i4 = 0;
                    if (c2 != 5) {
                        return 0;
                    }
                }
                c2 = 6;
                i5++;
            }
        }
        if (c2 == 2 && z && ((j != Long.MIN_VALUE || z2) && (j != 0 || !z2))) {
            if (!z2) {
                j = -j;
            }
            this.peekedLong = j;
            this.pos += i5;
            i = 15;
        } else {
            if (c2 != 2 && c2 != 4 && c2 != 7) {
                return 0;
            }
            this.peekedNumberLength = i5;
            i = 16;
        }
        this.peeked = i;
        return i;
    }

    private void push(int i) {
        int i2 = this.stackSize;
        int[] iArr = this.stack;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[i2 * 2];
            int[] iArr3 = new int[i2 * 2];
            String[] strArr = new String[i2 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.pathIndices, 0, iArr3, 0, this.stackSize);
            System.arraycopy(this.pathNames, 0, strArr, 0, this.stackSize);
            this.stack = iArr2;
            this.pathIndices = iArr3;
            this.pathNames = strArr;
        }
        int[] iArr4 = this.stack;
        int i3 = this.stackSize;
        this.stackSize = i3 + 1;
        iArr4[i3] = i;
    }

    private char readEscapeCharacter() throws IOException {
        int i;
        if (this.pos == this.limit && !fillBuffer(1)) {
            throw syntaxError("Unterminated escape sequence");
        }
        char[] cArr = this.buffer;
        int i2 = this.pos;
        int i3 = i2 + 1;
        this.pos = i3;
        char c = cArr[i2];
        if (c == '\n') {
            this.lineNumber++;
            this.lineStart = i3;
        } else if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
            if (c == 'b') {
                return '\b';
            }
            if (c == 'f') {
                return '\f';
            }
            if (c == 'n') {
                return '\n';
            }
            if (c == 'r') {
                return '\r';
            }
            if (c == 't') {
                return '\t';
            }
            if (c != 'u') {
                throw syntaxError("Invalid escape sequence");
            }
            if (i2 + 5 > this.limit && !fillBuffer(4)) {
                throw syntaxError("Unterminated escape sequence");
            }
            int i4 = this.pos;
            int i5 = i4 + 4;
            char c2 = 0;
            while (i4 < i5) {
                char c3 = this.buffer[i4];
                char c4 = (char) (c2 << 4);
                if (c3 >= '0' && c3 <= '9') {
                    i = c3 - '0';
                } else if (c3 >= 'a' && c3 <= 'f') {
                    i = c3 - 'W';
                } else {
                    if (c3 < 'A' || c3 > 'F') {
                        throw new NumberFormatException("\\u".concat(new String(this.buffer, this.pos, 4)));
                    }
                    i = c3 - '7';
                }
                c2 = (char) (i + c4);
                i4++;
            }
            this.pos += 4;
            return c2;
        }
        return c;
    }

    private void skipQuotedValue(char c) throws IOException {
        char[] cArr = this.buffer;
        while (true) {
            int i = this.pos;
            int i2 = this.limit;
            while (true) {
                if (i >= i2) {
                    this.pos = i;
                    if (!fillBuffer(1)) {
                        throw syntaxError("Unterminated string");
                    }
                    break;
                }
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.pos = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.pos = i3;
                    readEscapeCharacter();
                    break;
                } else {
                    if (c2 == '\n') {
                        this.lineNumber++;
                        this.lineStart = i3;
                    }
                    i = i3;
                }
            }
        }
    }

    private boolean skipTo(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.pos + length > this.limit && !fillBuffer(length)) {
                return false;
            }
            char[] cArr = this.buffer;
            int i = this.pos;
            if (cArr[i] != '\n') {
                for (int i2 = 0; i2 < length; i2++) {
                    if (this.buffer[this.pos + i2] == str.charAt(i2)) {
                    }
                }
                return true;
            }
            this.lineNumber++;
            this.lineStart = i + 1;
            this.pos++;
        }
    }

    private void skipToEndOfLine() throws IOException {
        char c;
        do {
            if (this.pos >= this.limit && !fillBuffer(1)) {
                return;
            }
            char[] cArr = this.buffer;
            int i = this.pos;
            int i2 = i + 1;
            this.pos = i2;
            c = cArr[i];
            if (c == '\n') {
                this.lineNumber++;
                this.lineStart = i2;
                return;
            }
        } while (c != '\r');
    }

    private void skipUnquotedValue() throws IOException {
        do {
            int i = 0;
            while (true) {
                int i2 = this.pos;
                if (i2 + i < this.limit) {
                    char c = this.buffer[i2 + i];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        checkLenient();
                    }
                    this.pos += i;
                    return;
                }
                this.pos = i2 + i;
            }
        } while (fillBuffer(1));
    }

    private IOException syntaxError(String str) throws IOException {
        StringBuilder sbM1657a = C0305Ec.m1657a(str);
        sbM1657a.append(locationString());
        throw new MalformedJsonException(sbM1657a.toString());
    }

    public void beginArray() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 3) {
            push(1);
            this.pathIndices[this.stackSize - 1] = 0;
            this.peeked = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + peek() + locationString());
        }
    }

    public void beginObject() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 1) {
            push(3);
            this.peeked = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + peek() + locationString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.peeked = 0;
        this.stack[0] = 8;
        this.stackSize = 1;
        this.f11197in.close();
    }

    public int doPeek() throws IOException {
        int i;
        int iNextNonWhitespace;
        int[] iArr = this.stack;
        int i2 = this.stackSize;
        int i3 = iArr[i2 - 1];
        if (i3 == 1) {
            iArr[i2 - 1] = 2;
        } else {
            if (i3 != 2) {
                if (i3 == 3 || i3 == 5) {
                    iArr[i2 - 1] = 4;
                    if (i3 == 5 && (iNextNonWhitespace = nextNonWhitespace(true)) != 44) {
                        if (iNextNonWhitespace != 59) {
                            if (iNextNonWhitespace != 125) {
                                throw syntaxError("Unterminated object");
                            }
                            this.peeked = 2;
                            return 2;
                        }
                        checkLenient();
                    }
                    int iNextNonWhitespace2 = nextNonWhitespace(true);
                    if (iNextNonWhitespace2 == 34) {
                        i = 13;
                    } else if (iNextNonWhitespace2 == 39) {
                        checkLenient();
                        i = 12;
                    } else {
                        if (iNextNonWhitespace2 == 125) {
                            if (i3 == 5) {
                                throw syntaxError("Expected name");
                            }
                            this.peeked = 2;
                            return 2;
                        }
                        checkLenient();
                        this.pos--;
                        if (!isLiteral((char) iNextNonWhitespace2)) {
                            throw syntaxError("Expected name");
                        }
                        i = 14;
                    }
                } else if (i3 == 4) {
                    iArr[i2 - 1] = 5;
                    int iNextNonWhitespace3 = nextNonWhitespace(true);
                    if (iNextNonWhitespace3 != 58) {
                        if (iNextNonWhitespace3 != 61) {
                            throw syntaxError("Expected ':'");
                        }
                        checkLenient();
                        if (this.pos < this.limit || fillBuffer(1)) {
                            char[] cArr = this.buffer;
                            int i4 = this.pos;
                            if (cArr[i4] == '>') {
                                this.pos = i4 + 1;
                            }
                        }
                    }
                } else if (i3 == 6) {
                    if (this.lenient) {
                        consumeNonExecutePrefix();
                    }
                    this.stack[this.stackSize - 1] = 7;
                } else if (i3 == 7) {
                    if (nextNonWhitespace(false) == -1) {
                        i = 17;
                    } else {
                        checkLenient();
                        this.pos--;
                    }
                } else if (i3 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                this.peeked = i;
                return i;
            }
            int iNextNonWhitespace4 = nextNonWhitespace(true);
            if (iNextNonWhitespace4 != 44) {
                if (iNextNonWhitespace4 != 59) {
                    if (iNextNonWhitespace4 != 93) {
                        throw syntaxError("Unterminated array");
                    }
                    this.peeked = 4;
                    return 4;
                }
                checkLenient();
            }
        }
        int iNextNonWhitespace5 = nextNonWhitespace(true);
        if (iNextNonWhitespace5 != 34) {
            if (iNextNonWhitespace5 == 39) {
                checkLenient();
                this.peeked = 8;
                return 8;
            }
            if (iNextNonWhitespace5 != 44 && iNextNonWhitespace5 != 59) {
                if (iNextNonWhitespace5 == 91) {
                    this.peeked = 3;
                    return 3;
                }
                if (iNextNonWhitespace5 != 93) {
                    if (iNextNonWhitespace5 == 123) {
                        this.peeked = 1;
                        return 1;
                    }
                    this.pos--;
                    int iPeekKeyword = peekKeyword();
                    if (iPeekKeyword != 0) {
                        return iPeekKeyword;
                    }
                    int iPeekNumber = peekNumber();
                    if (iPeekNumber != 0) {
                        return iPeekNumber;
                    }
                    if (!isLiteral(this.buffer[this.pos])) {
                        throw syntaxError("Expected value");
                    }
                    checkLenient();
                    i = 10;
                } else if (i3 == 1) {
                    this.peeked = 4;
                    return 4;
                }
            }
            if (i3 != 1 && i3 != 2) {
                throw syntaxError("Unexpected value");
            }
            checkLenient();
            this.pos--;
            this.peeked = 7;
            return 7;
        }
        i = 9;
        this.peeked = i;
        return i;
    }

    public void endArray() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + peek() + locationString());
        }
        int i = this.stackSize;
        this.stackSize = i - 1;
        int[] iArr = this.pathIndices;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.peeked = 0;
    }

    public void endObject() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + peek() + locationString());
        }
        int i = this.stackSize;
        int i2 = i - 1;
        this.stackSize = i2;
        this.pathNames[i2] = null;
        int[] iArr = this.pathIndices;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.peeked = 0;
    }

    public String getPath() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.stackSize;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.stack[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.pathIndices[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append(FilenameUtils.f15632b);
                String str = this.pathNames[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public boolean hasNext() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        return (iDoPeek == 2 || iDoPeek == 4) ? false : true;
    }

    public final boolean isLenient() {
        return this.lenient;
    }

    public String locationString() {
        StringBuilder sbM6925a = C1469Wn.m6925a(" at line ", this.lineNumber + 1, " column ", (this.pos - this.lineStart) + 1, " path ");
        sbM6925a.append(getPath());
        return sbM6925a.toString();
    }

    public boolean nextBoolean() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 5) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i = this.stackSize - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iDoPeek != 6) {
            throw new IllegalStateException("Expected a boolean but was " + peek() + locationString());
        }
        this.peeked = 0;
        int[] iArr2 = this.pathIndices;
        int i2 = this.stackSize - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    public double nextDouble() throws IOException {
        String strNextQuotedValue;
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i = this.stackSize - 1;
            iArr[i] = iArr[i] + 1;
            return this.peekedLong;
        }
        if (iDoPeek == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            if (iDoPeek == 8 || iDoPeek == 9) {
                strNextQuotedValue = nextQuotedValue(iDoPeek == 8 ? '\'' : C1002PX.f2511b);
            } else if (iDoPeek == 10) {
                strNextQuotedValue = nextUnquotedValue();
            } else if (iDoPeek != 11) {
                throw new IllegalStateException("Expected a double but was " + peek() + locationString());
            }
            this.peekedString = strNextQuotedValue;
        }
        this.peeked = 11;
        double d = Double.parseDouble(this.peekedString);
        if (!this.lenient && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + d + locationString());
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr2 = this.pathIndices;
        int i2 = this.stackSize - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    public int nextInt() throws IOException {
        String strNextQuotedValue;
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 15) {
            long j = this.peekedLong;
            int i = (int) j;
            if (j != i) {
                throw new NumberFormatException("Expected an int but was " + this.peekedLong + locationString());
            }
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (iDoPeek == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            if (iDoPeek != 8 && iDoPeek != 9 && iDoPeek != 10) {
                throw new IllegalStateException("Expected an int but was " + peek() + locationString());
            }
            if (iDoPeek == 10) {
                strNextQuotedValue = nextUnquotedValue();
            } else {
                strNextQuotedValue = nextQuotedValue(iDoPeek == 8 ? '\'' : C1002PX.f2511b);
            }
            this.peekedString = strNextQuotedValue;
            try {
                int i3 = Integer.parseInt(this.peekedString);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i4 = this.stackSize - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.peeked = 11;
        double d = Double.parseDouble(this.peekedString);
        int i5 = (int) d;
        if (i5 != d) {
            throw new NumberFormatException("Expected an int but was " + this.peekedString + locationString());
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr3 = this.pathIndices;
        int i6 = this.stackSize - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    public long nextLong() throws IOException {
        String strNextQuotedValue;
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i = this.stackSize - 1;
            iArr[i] = iArr[i] + 1;
            return this.peekedLong;
        }
        if (iDoPeek == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            if (iDoPeek != 8 && iDoPeek != 9 && iDoPeek != 10) {
                throw new IllegalStateException("Expected a long but was " + peek() + locationString());
            }
            if (iDoPeek == 10) {
                strNextQuotedValue = nextUnquotedValue();
            } else {
                strNextQuotedValue = nextQuotedValue(iDoPeek == 8 ? '\'' : C1002PX.f2511b);
            }
            this.peekedString = strNextQuotedValue;
            try {
                long j = Long.parseLong(this.peekedString);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i2 = this.stackSize - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.peeked = 11;
        double d = Double.parseDouble(this.peekedString);
        long j2 = (long) d;
        if (j2 != d) {
            throw new NumberFormatException("Expected a long but was " + this.peekedString + locationString());
        }
        this.peekedString = null;
        this.peeked = 0;
        int[] iArr3 = this.pathIndices;
        int i3 = this.stackSize - 1;
        iArr3[i3] = iArr3[i3] + 1;
        return j2;
    }

    public String nextName() throws IOException {
        char c;
        String strNextQuotedValue;
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 14) {
            strNextQuotedValue = nextUnquotedValue();
        } else {
            if (iDoPeek == 12) {
                c = '\'';
            } else {
                if (iDoPeek != 13) {
                    throw new IllegalStateException("Expected a name but was " + peek() + locationString());
                }
                c = C1002PX.f2511b;
            }
            strNextQuotedValue = nextQuotedValue(c);
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = strNextQuotedValue;
        return strNextQuotedValue;
    }

    public void nextNull() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek != 7) {
            throw new IllegalStateException("Expected null but was " + peek() + locationString());
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i = this.stackSize - 1;
        iArr[i] = iArr[i] + 1;
    }

    public String nextString() throws IOException {
        String str;
        char c;
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 10) {
            str = nextUnquotedValue();
        } else {
            if (iDoPeek == 8) {
                c = '\'';
            } else if (iDoPeek == 9) {
                c = C1002PX.f2511b;
            } else if (iDoPeek == 11) {
                str = this.peekedString;
                this.peekedString = null;
            } else if (iDoPeek == 15) {
                str = Long.toString(this.peekedLong);
            } else {
                if (iDoPeek != 16) {
                    throw new IllegalStateException("Expected a string but was " + peek() + locationString());
                }
                str = new String(this.buffer, this.pos, this.peekedNumberLength);
                this.pos += this.peekedNumberLength;
            }
            str = nextQuotedValue(c);
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i = this.stackSize - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    public JsonToken peek() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        switch (iDoPeek) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void setLenient(boolean z) {
        this.lenient = z;
    }

    public void skipValue() throws IOException {
        char c;
        int i = 0;
        do {
            int iDoPeek = this.peeked;
            if (iDoPeek == 0) {
                iDoPeek = doPeek();
            }
            if (iDoPeek == 3) {
                push(1);
            } else {
                if (iDoPeek == 1) {
                    push(3);
                } else if (iDoPeek == 4 || iDoPeek == 2) {
                    this.stackSize--;
                    i--;
                } else if (iDoPeek == 14 || iDoPeek == 10) {
                    skipUnquotedValue();
                } else {
                    if (iDoPeek == 8 || iDoPeek == 12) {
                        c = '\'';
                    } else if (iDoPeek == 9 || iDoPeek == 13) {
                        c = C1002PX.f2511b;
                    } else if (iDoPeek == 16) {
                        this.pos += this.peekedNumberLength;
                    }
                    skipQuotedValue(c);
                }
                this.peeked = 0;
            }
            i++;
            this.peeked = 0;
        } while (i != 0);
        int[] iArr = this.pathIndices;
        int i2 = this.stackSize;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.pathNames[i2 - 1] = AndroidLoggerFactory.f17234b;
    }

    public String toString() {
        return getClass().getSimpleName() + locationString();
    }
}
