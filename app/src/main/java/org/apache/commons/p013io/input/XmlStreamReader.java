package org.apache.commons.p013io.input;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Pattern;
import org.apache.commons.p013io.ByteOrderMark;
import org.bouncycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes2.dex */
public class XmlStreamReader extends Reader {

    /* JADX INFO: renamed from: d */
    public static final int f15872d = 4096;

    /* JADX INFO: renamed from: e */
    public static final String f15873e = "UTF-8";

    /* JADX INFO: renamed from: f */
    public static final String f15874f = "US-ASCII";

    /* JADX INFO: renamed from: h */
    public static final String f15876h = "UTF-16LE";

    /* JADX INFO: renamed from: k */
    public static final String f15879k = "UTF-16";

    /* JADX INFO: renamed from: l */
    public static final String f15880l = "UTF-32";

    /* JADX INFO: renamed from: r */
    public static final String f15886r = "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] encoding mismatch";

    /* JADX INFO: renamed from: s */
    public static final String f15887s = "Invalid encoding, BOM [{0}] XML guess [{1}] XML prolog [{2}] unknown BOM";

    /* JADX INFO: renamed from: t */
    public static final String f15888t = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], BOM must be NULL";

    /* JADX INFO: renamed from: u */
    public static final String f15889u = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], encoding mismatch";

    /* JADX INFO: renamed from: v */
    public static final String f15890v = "Invalid encoding, CT-MIME [{0}] CT-Enc [{1}] BOM [{2}] XML guess [{3}] XML prolog [{4}], Invalid MIME";

    /* JADX INFO: renamed from: a */
    public final Reader f15891a;

    /* JADX INFO: renamed from: b */
    public final String f15892b;

    /* JADX INFO: renamed from: c */
    public final String f15893c;

    /* JADX INFO: renamed from: n */
    public static final ByteOrderMark[] f15882n = {ByteOrderMark.f15573d, ByteOrderMark.f15574e, ByteOrderMark.f15575f, ByteOrderMark.f15576g, ByteOrderMark.f15577h};

    /* JADX INFO: renamed from: g */
    public static final String f15875g = "UTF-16BE";

    /* JADX INFO: renamed from: i */
    public static final String f15877i = "UTF-32BE";

    /* JADX INFO: renamed from: j */
    public static final String f15878j = "UTF-32LE";

    /* JADX INFO: renamed from: m */
    public static final String f15881m = "CP1047";

    /* JADX INFO: renamed from: o */
    public static final ByteOrderMark[] f15883o = {new ByteOrderMark("UTF-8", 60, 63, 120, 109), new ByteOrderMark(f15875g, 0, 60, 0, 63), new ByteOrderMark("UTF-16LE", 60, 0, 63, 0), new ByteOrderMark(f15877i, 0, 0, 0, 60, 0, 0, 0, 63, 0, 0, 0, 120, 0, 0, 0, 109), new ByteOrderMark(f15878j, 60, 0, 0, 0, 63, 0, 0, 0, 120, 0, 0, 0, 109, 0, 0, 0), new ByteOrderMark(f15881m, 76, 111, 167, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA)};

    /* JADX INFO: renamed from: p */
    public static final Pattern f15884p = Pattern.compile("charset=[\"']?([.[^; \"']]*)[\"']?");

    /* JADX INFO: renamed from: q */
    public static final Pattern f15885q = Pattern.compile("<\\?xml.*encoding[\\s]*=[\\s]*((?:\".[^\"]*\")|(?:'.[^']*'))", 8);

    /* JADX WARN: Invalid debug info offset */
    public XmlStreamReader(File file) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public XmlStreamReader(InputStream inputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public XmlStreamReader(InputStream inputStream, String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public XmlStreamReader(InputStream inputStream, String str, boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public XmlStreamReader(InputStream inputStream, String str, boolean z, String str2) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public XmlStreamReader(InputStream inputStream, boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public XmlStreamReader(InputStream inputStream, boolean z, String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public XmlStreamReader(URL url) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public XmlStreamReader(URLConnection uRLConnection, String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public static String m23320R(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public static String m23321S(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g0 */
    public static String m23322g0(InputStream inputStream, String str) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k0 */
    public static boolean m23323k0(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l0 */
    public static boolean m23324l0(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: P */
    public final java.lang.String m23325P(org.apache.commons.p013io.input.BOMInputStream r2, org.apache.commons.p013io.input.BOMInputStream r3, boolean r4) throws java.io.IOException {
        /*
            r1 = this;
            r0 = 0
            return r0
        L11:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.input.XmlStreamReader.m23325P(org.apache.commons.io.input.BOMInputStream, org.apache.commons.io.input.BOMInputStream, boolean):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V */
    public String m23326V() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b0 */
    public String m23327b0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public String m23328j(String str, String str2, String str3, String str4, boolean z) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public String m23329k(String str, String str2, String str3) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: p */
    public final java.lang.String m23330p(org.apache.commons.p013io.input.BOMInputStream r7, org.apache.commons.p013io.input.BOMInputStream r8, java.lang.String r9, boolean r10) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            return r0
        L14:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.input.XmlStreamReader.m23330p(org.apache.commons.io.input.BOMInputStream, org.apache.commons.io.input.BOMInputStream, java.lang.String, boolean):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0016
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: w */
    public final java.lang.String m23331w(java.lang.String r8, org.apache.commons.p013io.input.XmlStreamReaderException r9) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 0
            return r0
        L29:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.input.XmlStreamReader.m23331w(java.lang.String, org.apache.commons.io.input.XmlStreamReaderException):java.lang.String");
    }
}
