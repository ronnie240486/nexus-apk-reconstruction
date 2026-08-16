package p000;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: h60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5976h60 extends InputStream {

    /* JADX INFO: renamed from: a */
    public PushbackInputStream f14279a;

    /* JADX INFO: renamed from: b */
    public AbstractC0496Hd f14280b;

    /* JADX INFO: renamed from: c */
    public C5398so f14281c;

    /* JADX INFO: renamed from: d */
    public char[] f14282d;

    /* JADX INFO: renamed from: e */
    public C1540Xv f14283e;

    /* JADX INFO: renamed from: f */
    public CRC32 f14284f;

    /* JADX INFO: renamed from: g */
    public byte[] f14285g;

    /* JADX INFO: renamed from: h */
    public boolean f14286h;

    /* JADX INFO: renamed from: i */
    public Charset f14287i;

    /* JADX WARN: Invalid debug info offset */
    public C5976h60(InputStream inputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    public C5976h60(InputStream inputStream, Charset charset) {
    }

    /* JADX WARN: Invalid debug info offset */
    public C5976h60(InputStream inputStream, char[] cArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public C5976h60(InputStream inputStream, char[] cArr, Charset charset) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A0 */
    public final void m20951A0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J0 */
    public final void m20952J0() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L0 */
    public final void m20953L0(C1540Xv c1540Xv) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public final int m20954P(C1540Xv c1540Xv) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public C1540Xv m20955R() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public C1540Xv m20956S(C2992bj c2992bj) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V */
    public final AbstractC0657K9 m20957V(C5939c60 c5939c60, C1540Xv c1540Xv) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b0 */
    public final AbstractC0496Hd m20958b0(AbstractC0657K9 abstractC0657K9, C1540Xv c1540Xv) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g0 */
    public final AbstractC0496Hd m20959g0(C1540Xv c1540Xv) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public final boolean m20960j(List<C5672wi> list) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public final void m20961k() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k0 */
    public final boolean m20962k0(C1540Xv c1540Xv) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l0 */
    public final boolean m20963l0(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public int m20964p() throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r0 */
    public final void m20965r0() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream
    public int read() throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.InputStream
    public int read(byte[] r3, int r4, int r5) throws java.io.IOException {
        /*
            r2 = this;
            r0 = 0
            return r0
        L18:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C5976h60.read(byte[], int, int):int");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u0 */
    public final void m20966u0() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public final long m20967w(C1540Xv c1540Xv) {
        return 0L;
    }
}
