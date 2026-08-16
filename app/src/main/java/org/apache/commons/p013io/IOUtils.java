package org.apache.commons.p013io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.List;
import org.apache.commons.p013io.output.StringBuilderWriter;

/* JADX INFO: loaded from: classes2.dex */
public class IOUtils {

    /* JADX INFO: renamed from: a */
    public static final int f15642a = -1;

    /* JADX INFO: renamed from: b */
    public static final char f15643b = '/';

    /* JADX INFO: renamed from: c */
    public static final char f15644c = '\\';

    /* JADX INFO: renamed from: d */
    public static final char f15645d = File.separatorChar;

    /* JADX INFO: renamed from: e */
    public static final String f15646e = "\n";

    /* JADX INFO: renamed from: f */
    public static final String f15647f = "\r\n";

    /* JADX INFO: renamed from: g */
    public static final String f15648g;

    /* JADX INFO: renamed from: h */
    public static final int f15649h = 4096;

    /* JADX INFO: renamed from: i */
    public static final int f15650i = 2048;

    /* JADX INFO: renamed from: j */
    public static char[] f15651j;

    /* JADX INFO: renamed from: k */
    public static byte[] f15652k;

    static {
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter(4);
        PrintWriter printWriter = new PrintWriter(stringBuilderWriter);
        printWriter.println();
        f15648g = stringBuilderWriter.f15950a.toString();
        printWriter.close();
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public static void m23050A(InputStream inputStream, Writer writer, Charset charset) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A0 */
    public static char[] m23051A0(InputStream inputStream, Charset charset) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: B */
    public static void m23052B(Reader reader, OutputStream outputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B0 */
    public static char[] m23053B0(Reader reader) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public static void m23054C(Reader reader, OutputStream outputStream, String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: C0 */
    public static InputStream m23055C0(CharSequence charSequence) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public static void m23056D(Reader reader, OutputStream outputStream, Charset charset) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D0 */
    public static InputStream m23057D0(CharSequence charSequence, String str) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public static long m23058E(InputStream inputStream, OutputStream outputStream) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E0 */
    public static InputStream m23059E0(CharSequence charSequence, Charset charset) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F */
    public static long m23060F(InputStream inputStream, OutputStream outputStream, long j, long j2) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: F0 */
    public static InputStream m23061F0(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public static long m23062G(InputStream inputStream, OutputStream outputStream, long j, long j2, byte[] bArr) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G0 */
    public static InputStream m23063G0(String str, String str2) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public static long m23064H(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H0 */
    public static InputStream m23065H0(String str, Charset charset) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public static long m23066I(Reader reader, Writer writer) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: I0 */
    public static String m23067I0(InputStream inputStream) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public static long m23068J(Reader reader, Writer writer, long j, long j2) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J0 */
    public static String m23069J0(InputStream inputStream, String str) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public static long m23070K(Reader reader, Writer writer, long j, long j2, char[] cArr) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K0 */
    public static String m23071K0(InputStream inputStream, Charset charset) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L */
    public static long m23072L(Reader reader, Writer writer, char[] cArr) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L0 */
    public static String m23073L0(Reader reader) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public static LineIterator m23074M(InputStream inputStream, String str) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: M0 */
    public static String m23075M0(URI uri) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N */
    public static LineIterator m23076N(InputStream inputStream, Charset charset) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N0 */
    public static String m23077N0(URI uri, String str) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O */
    public static LineIterator m23078O(Reader reader) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O0 */
    public static String m23079O0(URI uri, Charset charset) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public static int m23080P(InputStream inputStream, byte[] bArr) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: P0 */
    public static String m23081P0(URL url) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q */
    public static int m23082Q(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static String m23083Q0(URL url, String str) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public static int m23084R(Reader reader, char[] cArr) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: R0 */
    public static java.lang.String m23085R0(java.net.URL r0, java.nio.charset.Charset r1) throws java.io.IOException {
        /*
            r0 = 0
            return r0
        Lc:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.IOUtils.m23085R0(java.net.URL, java.nio.charset.Charset):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public static int m23086S(Reader reader, char[] cArr, int i, int i2) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: S0 */
    public static String m23087S0(byte[] bArr) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T */
    public static int m23088T(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static String m23089T0(byte[] bArr, String str) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U */
    public static void m23090U(InputStream inputStream, byte[] bArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: U0 */
    public static void m23091U0(CharSequence charSequence, OutputStream outputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V */
    public static void m23092V(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public static void m23093V0(CharSequence charSequence, OutputStream outputStream, String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W */
    public static void m23094W(Reader reader, char[] cArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public static void m23095W0(CharSequence charSequence, OutputStream outputStream, Charset charset) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X */
    public static void m23096X(Reader reader, char[] cArr, int i, int i2) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public static void m23097X0(CharSequence charSequence, Writer writer) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y */
    public static void m23098Y(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: Y0 */
    public static void m23099Y0(String str, OutputStream outputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z */
    public static byte[] m23100Z(InputStream inputStream, int i) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    public static void m23101Z0(String str, OutputStream outputStream, String str2) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static BufferedInputStream m23102a(InputStream inputStream) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: a0 */
    public static List<String> m23103a0(InputStream inputStream) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public static void m23104a1(String str, OutputStream outputStream, Charset charset) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static BufferedInputStream m23105b(InputStream inputStream, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b0 */
    public static List<String> m23106b0(InputStream inputStream, String str) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    public static void m23107b1(String str, Writer writer) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static BufferedOutputStream m23108c(OutputStream outputStream) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c0 */
    public static List<String> m23109c0(InputStream inputStream, Charset charset) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: c1 */
    public static void m23110c1(StringBuffer stringBuffer, OutputStream outputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static BufferedOutputStream m23111d(OutputStream outputStream, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d0 */
    public static List<String> m23112d0(Reader reader) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: d1 */
    public static void m23113d1(StringBuffer stringBuffer, OutputStream outputStream, String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static BufferedReader m23114e(Reader reader) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e0 */
    public static long m23115e0(InputStream inputStream, long j) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: e1 */
    public static void m23116e1(StringBuffer stringBuffer, Writer writer) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static BufferedReader m23117f(Reader reader, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f0 */
    public static long m23118f0(Reader reader, long j) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f1 */
    public static void m23119f1(byte[] bArr, OutputStream outputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static BufferedWriter m23120g(Writer writer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g0 */
    public static long m23121g0(ReadableByteChannel readableByteChannel, long j) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: g1 */
    public static void m23122g1(byte[] bArr, Writer writer) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static BufferedWriter m23123h(Writer writer, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h0 */
    public static void m23124h0(InputStream inputStream, long j) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h1 */
    public static void m23125h1(byte[] bArr, Writer writer, String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static void m23126i(URLConnection uRLConnection) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i0 */
    public static void m23127i0(Reader reader, long j) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i1 */
    public static void m23128i1(byte[] bArr, Writer writer, Charset charset) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: j */
    public static void m23129j(java.io.Closeable r0) {
        /*
            return
        L5:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.IOUtils.m23129j(java.io.Closeable):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j0 */
    public static void m23130j0(ReadableByteChannel readableByteChannel, long j) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: j1 */
    public static void m23131j1(char[] cArr, OutputStream outputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static void m23132k(InputStream inputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k0 */
    public static InputStream m23133k0(InputStream inputStream) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k1 */
    public static void m23134k1(char[] cArr, OutputStream outputStream, String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static void m23135l(OutputStream outputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l0 */
    public static InputStream m23136l0(InputStream inputStream, int i) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l1 */
    public static void m23137l1(char[] cArr, OutputStream outputStream, Charset charset) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public static void m23138m(Reader reader) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m0 */
    public static BufferedReader m23139m0(Reader reader) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m1 */
    public static void m23140m1(char[] cArr, Writer writer) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public static void m23141n(Writer writer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n0 */
    public static BufferedReader m23142n0(Reader reader, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n1 */
    public static void m23143n1(byte[] bArr, OutputStream outputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: o */
    public static void m23144o(java.net.ServerSocket r0) {
        /*
            return
        L5:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.IOUtils.m23144o(java.net.ServerSocket):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o0 */
    public static byte[] m23145o0(InputStream inputStream) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o1 */
    public static void m23146o1(char[] cArr, Writer writer) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: p */
    public static void m23147p(java.net.Socket r0) {
        /*
            return
        L5:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.IOUtils.m23147p(java.net.Socket):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p0 */
    public static byte[] m23148p0(InputStream inputStream, int i) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: p1 */
    public static void m23149p1(Collection<?> collection, String str, OutputStream outputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: q */
    public static void m23150q(java.nio.channels.Selector r0) {
        /*
            return
        L5:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.IOUtils.m23150q(java.nio.channels.Selector):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q0 */
    public static byte[] m23151q0(InputStream inputStream, long j) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q1 */
    public static void m23152q1(Collection<?> collection, String str, OutputStream outputStream, String str2) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public static void m23153r(Closeable... closeableArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: r0 */
    public static byte[] m23154r0(Reader reader) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r1 */
    public static void m23155r1(Collection<?> collection, String str, OutputStream outputStream, Charset charset) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public static boolean m23156s(InputStream inputStream, InputStream inputStream2) throws IOException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s0 */
    public static byte[] m23157s0(Reader reader, String str) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s1 */
    public static void m23158s1(Collection<?> collection, String str, Writer writer) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public static boolean m23159t(Reader reader, Reader reader2) throws IOException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t0 */
    public static byte[] m23160t0(Reader reader, Charset charset) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public static boolean m23161u(Reader reader, Reader reader2) throws IOException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: u0 */
    public static byte[] m23162u0(String str) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public static int m23163v(InputStream inputStream, OutputStream outputStream) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v0 */
    public static byte[] m23164v0(URI uri) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public static int m23165w(Reader reader, Writer writer) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: w0 */
    public static byte[] m23166w0(java.net.URL r1) throws java.io.IOException {
        /*
            r0 = 0
            return r0
        Lc:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.IOUtils.m23166w0(java.net.URL):byte[]");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public static long m23167x(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: x0 */
    public static byte[] m23168x0(java.net.URLConnection r1) throws java.io.IOException {
        /*
            r0 = 0
            return r0
        Lc:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.IOUtils.m23168x0(java.net.URLConnection):byte[]");
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: y */
    public static void m23169y(InputStream inputStream, Writer writer) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: y0 */
    public static char[] m23170y0(InputStream inputStream) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public static void m23171z(InputStream inputStream, Writer writer, String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z0 */
    public static char[] m23172z0(InputStream inputStream, String str) throws IOException {
        return null;
    }
}
