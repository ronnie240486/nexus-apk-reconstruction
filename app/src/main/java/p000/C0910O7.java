package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: O7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0910O7 implements InterfaceC1166S7, InterfaceC1103R7, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: c */
    public static final byte[] f2332c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: d */
    public static final int f2333d = 65533;

    /* JADX INFO: renamed from: a */
    @Nullable
    public C1059QP f2334a;

    /* JADX INFO: renamed from: b */
    public long f2335b;

    /* JADX INFO: renamed from: O7$c */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class c implements Closeable {

        /* JADX INFO: renamed from: a */
        public C0910O7 f2338a;

        /* JADX INFO: renamed from: b */
        public boolean f2339b;

        /* JADX INFO: renamed from: c */
        public C1059QP f2340c;

        /* JADX INFO: renamed from: d */
        public long f2341d;

        /* JADX INFO: renamed from: e */
        public byte[] f2342e;

        /* JADX INFO: renamed from: f */
        public int f2343f;

        /* JADX INFO: renamed from: g */
        public int f2344g;

        /* JADX WARN: Invalid debug info offset */
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: j */
        public final long m4224j(int i) {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k */
        public final int m4225k() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: p */
        public final long m4226p(long j) {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: w */
        public final int m4227w(long j) {
            return 0;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: B */
    public long mo1332B() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: B0 */
    public long mo1333B0(C5222q8 c5222q8) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B1 */
    public final C5222q8 m4173B1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1103R7
    /* JADX INFO: renamed from: C */
    public InterfaceC1103R7 mo936C(InterfaceC5858zS interfaceC5858zS, long j) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: C0 */
    public long mo1334C0(C5222q8 c5222q8, long j) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C1 */
    public final C5222q8 m4174C1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0012
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: D0 */
    public int mo1335D0(p000.C0665KH r4) {
        /*
            r3 = this;
            r0 = 0
            return r0
        L16:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0910O7.mo1335D0(KH):int");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: E */
    public String mo1336E(long j) throws EOFException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E1 */
    public final C5222q8 m4175E1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F1 */
    public final long m4176F1() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1103R7
    /* JADX INFO: renamed from: G */
    public /* bridge */ /* synthetic */ InterfaceC1103R7 mo937G(int i) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G1 */
    public final C5222q8 m4177G1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1103R7
    /* JADX INFO: renamed from: H0 */
    public /* bridge */ /* synthetic */ InterfaceC1103R7 mo938H0(String str, int i, int i2, Charset charset) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H1 */
    public final C5222q8 m4178H1(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1103R7
    /* JADX INFO: renamed from: I */
    public /* bridge */ /* synthetic */ InterfaceC1103R7 mo939I(String str) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I1 */
    public C1059QP m4179I1(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: J */
    public long mo1337J(InterfaceC4803mS interfaceC4803mS) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J1 */
    public C0910O7 m4180J1(C5222q8 c5222q8) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: K */
    public void mo1338K(C0910O7 c0910o7, long j) throws EOFException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K1 */
    public C0910O7 m4181K1(byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1103R7
    /* JADX INFO: renamed from: L */
    public /* bridge */ /* synthetic */ InterfaceC1103R7 mo940L(C5222q8 c5222q8) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L1 */
    public C0910O7 m4182L1(byte[] bArr, int i, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: M */
    public String mo1339M(Charset charset) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: M0 */
    public void mo1340M0(long j) throws EOFException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M1 */
    public C0910O7 m4183M1(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1103R7
    /* JADX INFO: renamed from: N0 */
    public /* bridge */ /* synthetic */ InterfaceC1103R7 mo941N0(long j) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N1 */
    public C0910O7 m4184N1(long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: O */
    public long mo1341O(C5222q8 c5222q8, long j) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1103R7
    /* JADX INFO: renamed from: O0 */
    public OutputStream mo942O0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O1 */
    public C0910O7 m4185O1(long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: Q0 */
    public long mo1342Q0(byte b2) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q1 */
    public C0910O7 m4186Q1(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: R0 */
    public long mo1343R0() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R1 */
    public C0910O7 m4187R1(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: S0 */
    public InputStream mo1344S0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: T */
    public long mo1345T(C5222q8 c5222q8) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public final void m4188T0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T1 */
    public C0910O7 m4189T1(long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: U */
    public int mo1346U() throws EOFException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public C0910O7 m4190U0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U1 */
    public C0910O7 m4191U1(long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public final long m4192V0() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public final C0910O7 m4193W0(C0910O7 c0910o7, long j, long j2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W1 */
    public C0910O7 m4194W1(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4803mS
    /* JADX INFO: renamed from: X */
    public void mo943X(C0910O7 c0910o7, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public final C0910O7 m4195X0(OutputStream outputStream) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X1 */
    public C0910O7 m4196X1(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1103R7
    /* JADX INFO: renamed from: Y */
    public /* bridge */ /* synthetic */ InterfaceC1103R7 mo944Y(String str, int i, int i2) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public final C0910O7 m4197Y0(OutputStream outputStream, long j, long j2) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1103R7
    /* JADX INFO: renamed from: Z */
    public /* bridge */ /* synthetic */ InterfaceC1103R7 mo945Z(long j) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public final C5222q8 m4198a1(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a2 */
    public C0910O7 m4199a2(String str, int i, int i2, Charset charset) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: b */
    public String mo1347b(long j) throws EOFException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: c0 */
    public C5222q8 mo1348c0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c1 */
    public final byte m4201c1(long j) {
        return (byte) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c2 */
    public C0910O7 m4202c2(String str, Charset charset) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1103R7
    /* JADX INFO: renamed from: d0 */
    public /* bridge */ /* synthetic */ InterfaceC1103R7 mo946d0(String str, Charset charset) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d2 */
    public final C0910O7 m4203d2(OutputStream outputStream) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: e0 */
    public boolean mo1349e0(long j) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x0042
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    /* JADX INFO: renamed from: e1 */
    public final p000.C5222q8 m4204e1(java.lang.String r4, p000.C5222q8 r5) {
        /*
            r3 = this;
            r0 = 0
            return r0
        L31:
        L42:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0910O7.m4204e1(java.lang.String, q8):q8");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e2 */
    public final C0910O7 m4205e2(OutputStream outputStream, long j) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: f */
    public C5222q8 mo1350f(long j) throws EOFException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f1 */
    public final C5222q8 m4206f1(C5222q8 c5222q8) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: h0 */
    public String mo1351h0() throws EOFException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h1 */
    public final C5222q8 m4207h1(C5222q8 c5222q8) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h2 */
    public C0910O7 m4208h2(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: i0 */
    public int mo1353i0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i1 */
    public final C5222q8 m4209i1(C5222q8 c5222q8) {
        return null;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j1 */
    public final C5222q8 m4210j1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j2 */
    public C0910O7 m4211j2(String str, int i, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k1 */
    public final boolean m4212k1(C1059QP c1059qp, int i, C5222q8 c5222q8, int i2, int i3) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k2 */
    public C0910O7 m4213k2(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l1 */
    public final c m4214l1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1103R7
    /* JADX INFO: renamed from: m */
    public /* bridge */ /* synthetic */ InterfaceC1103R7 mo949m(int i) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: m0 */
    public byte[] mo1354m0(long j) throws EOFException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1103R7
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ InterfaceC1103R7 mo950n(long j) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n1 */
    public final c m4215n1(c cVar) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1103R7
    /* JADX INFO: renamed from: o */
    public long mo951o(InterfaceC5858zS interfaceC5858zS) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: o0 */
    public String mo1355o0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: p0 */
    public String mo1356p0(long j, Charset charset) throws EOFException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p1 */
    public final C0910O7 m4216p1(InputStream inputStream) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: q */
    public byte[] mo1357q() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: q0 */
    public short mo1358q0() {
        return (short) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q1 */
    public final C0910O7 m4217q1(InputStream inputStream, long j) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1103R7
    /* JADX INFO: renamed from: r */
    public /* bridge */ /* synthetic */ InterfaceC1103R7 mo952r(int i) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r1 */
    public final void m4218r1(InputStream inputStream, long j, boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    public int read(byte[] bArr) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    public int read(byte[] bArr, int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC5858zS
    public long read(C0910O7 c0910o7, long j) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    public byte readByte() {
        return (byte) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    public void readFully(byte[] bArr) throws EOFException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    public int readInt() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    public long readLong() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    public short readShort() {
        return (short) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: s */
    public boolean mo1359s() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: s0 */
    public boolean mo1360s0(long j, C5222q8 c5222q8) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s1 */
    public final c m4219s1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    public void skip(long j) throws EOFException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: t0 */
    public boolean mo1361t0(long j, C5222q8 c5222q8, int i, int i2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC5858zS
    public C5660wW timeout() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u1 */
    public final c m4220u1(c cVar) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v1 */
    public String m4221v1(long j) throws EOFException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1103R7
    public /* bridge */ /* synthetic */ InterfaceC1103R7 write(byte[] bArr) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1103R7
    public /* bridge */ /* synthetic */ InterfaceC1103R7 write(byte[] bArr, int i, int i2) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1103R7
    public /* bridge */ /* synthetic */ InterfaceC1103R7 writeByte(int i) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1103R7
    public /* bridge */ /* synthetic */ InterfaceC1103R7 writeInt(int i) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1103R7
    public /* bridge */ /* synthetic */ InterfaceC1103R7 writeLong(long j) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1103R7
    public /* bridge */ /* synthetic */ InterfaceC1103R7 writeShort(int i) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: x */
    public long mo1362x(byte b2, long j) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: x0 */
    public long mo1363x0() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x1 */
    public List<Integer> m4222x1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: y */
    public long mo1364y(byte b2, long j, long j2) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y1 */
    public int m4223y1(C0665KH c0665kh, boolean z) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC1166S7
    @Nullable
    /* JADX INFO: renamed from: z */
    public String mo1365z() throws EOFException {
        return null;
    }

    @Override // p000.InterfaceC1103R7
    /* JADX INFO: renamed from: A */
    public InterfaceC1103R7 mo935A() throws IOException {
        return this;
    }

    /* JADX INFO: renamed from: b1 */
    public C0910O7 m4200b1() {
        return this;
    }

    @Override // p000.InterfaceC5858zS, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    @Override // p000.InterfaceC1103R7, p000.InterfaceC4803mS, java.io.Flushable
    public void flush() {
    }

    @Override // p000.InterfaceC1166S7
    /* JADX INFO: renamed from: i */
    public C0910O7 mo1352i() {
        return this;
    }

    @Override // p000.InterfaceC1103R7
    /* JADX INFO: renamed from: l */
    public InterfaceC1103R7 mo948l() {
        return this;
    }

    /* JADX INFO: renamed from: O7$a */
    /* JADX INFO: loaded from: classes2.dex */
    public class a extends OutputStream {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0910O7 f2336a;

        /* JADX WARN: Invalid debug info offset */
        public a(C0910O7 c0910o7) {
        }

        /* JADX WARN: Invalid debug info offset */
        public String toString() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.io.OutputStream
        public void write(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }
    }

    /* JADX INFO: renamed from: O7$b */
    /* JADX INFO: loaded from: classes2.dex */
    public class b extends InputStream {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0910O7 f2337a;

        /* JADX WARN: Invalid debug info offset */
        public b(C0910O7 c0910o7) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.io.InputStream
        public int available() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.io.InputStream
        public int read() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public String toString() {
            return null;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
