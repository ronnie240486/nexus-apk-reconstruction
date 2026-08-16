package org.apache.commons.p013io;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.p013io.filefilter.IOFileFilter;

/* JADX INFO: loaded from: classes.dex */
public class FileUtils {

    /* JADX INFO: renamed from: a */
    public static final long f15614a = 1024;

    /* JADX INFO: renamed from: b */
    public static final BigInteger f15615b;

    /* JADX INFO: renamed from: c */
    public static final long f15616c = 1048576;

    /* JADX INFO: renamed from: d */
    public static final BigInteger f15617d;

    /* JADX INFO: renamed from: e */
    public static final long f15618e = 31457280;

    /* JADX INFO: renamed from: f */
    public static final long f15619f = 1073741824;

    /* JADX INFO: renamed from: g */
    public static final BigInteger f15620g;

    /* JADX INFO: renamed from: h */
    public static final long f15621h = 1099511627776L;

    /* JADX INFO: renamed from: i */
    public static final BigInteger f15622i;

    /* JADX INFO: renamed from: j */
    public static final long f15623j = 1125899906842624L;

    /* JADX INFO: renamed from: k */
    public static final BigInteger f15624k;

    /* JADX INFO: renamed from: l */
    public static final long f15625l = 1152921504606846976L;

    /* JADX INFO: renamed from: m */
    public static final BigInteger f15626m;

    /* JADX INFO: renamed from: n */
    public static final BigInteger f15627n;

    /* JADX INFO: renamed from: o */
    public static final BigInteger f15628o;

    /* JADX INFO: renamed from: p */
    public static final File[] f15629p;

    /* JADX INFO: renamed from: org.apache.commons.io.FileUtils$1 */
    /* JADX INFO: loaded from: classes2.dex */
    public static class C49641 implements FileFilter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ File f15630a;

        /* JADX WARN: Invalid debug info offset */
        public C49641(File file) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return false;
        }
    }

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1024L);
        f15615b = bigIntegerValueOf;
        BigInteger bigIntegerMultiply = bigIntegerValueOf.multiply(bigIntegerValueOf);
        f15617d = bigIntegerMultiply;
        BigInteger bigIntegerMultiply2 = bigIntegerValueOf.multiply(bigIntegerMultiply);
        f15620g = bigIntegerMultiply2;
        BigInteger bigIntegerMultiply3 = bigIntegerValueOf.multiply(bigIntegerMultiply2);
        f15622i = bigIntegerMultiply3;
        BigInteger bigIntegerMultiply4 = bigIntegerValueOf.multiply(bigIntegerMultiply3);
        f15624k = bigIntegerMultiply4;
        f15626m = bigIntegerValueOf.multiply(bigIntegerMultiply4);
        BigInteger bigIntegerMultiply5 = BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(f15625l));
        f15627n = bigIntegerMultiply5;
        f15628o = bigIntegerValueOf.multiply(bigIntegerMultiply5);
        f15629p = new File[0];
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public static void m22892A(File file) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A0 */
    public static BigInteger m22893A0(File file) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public static void m22894B(File file) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B0 */
    public static BigInteger m22895B0(File file) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: C */
    public static boolean m22896C(java.io.File r2) {
        /*
            r0 = 0
            return r0
        Ld:
        L12:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.FileUtils.m22896C(java.io.File):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C0 */
    public static long m22897C0(File file) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public static boolean m22898D(File file, File file2) throws IOException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0010
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: D0 */
    public static long m22899D0(java.io.File r8) {
        /*
            r0 = 0
            return r0
        L20:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.FileUtils.m22899D0(java.io.File):long");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public static void m22900E(File file, File file2, FileFilter fileFilter, boolean z, List<String> list) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E0 */
    public static BigInteger m22901E0(File file) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0025
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: F */
    public static void m22902F(java.io.File r23, java.io.File r24, boolean r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.FileUtils.m22902F(java.io.File, java.io.File, boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0011
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: F0 */
    public static java.math.BigInteger m22903F0(java.io.File r5) {
        /*
            r0 = 0
            return r0
        L1f:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.FileUtils.m22903F0(java.io.File):java.math.BigInteger");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public static void m22904G(File file) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G0 */
    public static File m22905G0(URL url) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public static void m22906H(File file) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H0 */
    public static File[] m22907H0(URL[] urlArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public static void m22908I(File file) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I0 */
    public static String[] m22909I0(String[] strArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public static void m22910J(File file) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J0 */
    public static URL[] m22911J0(File[] fileArr) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public static File m22912K(File file, String... strArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K0 */
    public static void m22913K0(File file) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L */
    public static File m22914L(String... strArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L0 */
    public static void m22915L0(File file, IOFileFilter iOFileFilter) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public static File m22916M() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M0 */
    public static File[] m22917M0(File file) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N */
    public static String m22918N() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: N0 */
    public static boolean m22919N0(java.io.File r9, int r10) {
        /*
            r0 = 0
            return r0
        L33:
        L35:
        L37:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.FileUtils.m22919N0(java.io.File, int):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O */
    public static File m22920O() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: O0 */
    public static void m22921O0(File file, CharSequence charSequence) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public static String m22922P() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static void m22923P0(File file, CharSequence charSequence, String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q */
    public static void m22924Q(Collection<File> collection, File file, IOFileFilter iOFileFilter, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static void m22925Q0(File file, CharSequence charSequence, String str, boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public static boolean m22926R(File file) throws IOException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static void m22927R0(File file, CharSequence charSequence, Charset charset) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public static boolean m22928S(File file, long j) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public static void m22929S0(File file, CharSequence charSequence, Charset charset, boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T */
    public static boolean m22930T(File file, File file2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: T0 */
    public static void m22931T0(File file, CharSequence charSequence, boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U */
    public static boolean m22932U(File file, Date date) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public static void m22933U0(File file, byte[] bArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V */
    public static boolean m22934V(File file, long j) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public static void m22935V0(File file, byte[] bArr, int i, int i2) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W */
    public static boolean m22936W(File file, File file2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: W0 */
    public static void m22937W0(java.io.File r0, byte[] r1, int r2, int r3, boolean r4) throws java.io.IOException {
        /*
            return
        Le:
        L10:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.FileUtils.m22937W0(java.io.File, byte[], int, int, boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X */
    public static boolean m22938X(File file, Date date) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public static void m22939X0(File file, byte[] bArr, boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y */
    public static boolean m22940Y(File file) throws IOException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public static void m22941Y0(File file, String str, Collection<?> collection) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z */
    public static Iterator<File> m22942Z(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    public static void m22943Z0(File file, String str, Collection<?> collection, String str2) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static String m22944a(long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a0 */
    public static Iterator<File> m22945a0(File file, String[] strArr, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a1 */
    public static void m22946a1(java.io.File r0, java.lang.String r1, java.util.Collection<?> r2, java.lang.String r3, boolean r4) throws java.io.IOException {
        /*
            return
        L16:
        L18:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.FileUtils.m22946a1(java.io.File, java.lang.String, java.util.Collection, java.lang.String, boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static String m22947b(BigInteger bigInteger) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b0 */
    public static Iterator<File> m22948b0(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    public static void m22949b1(File file, String str, Collection<?> collection, boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static void m22950c(File file) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c0 */
    public static LineIterator m22951c0(File file) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c1 */
    public static void m22952c1(File file, Collection<?> collection) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static void m22953d(File file, File file2) throws FileNotFoundException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x000c
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    /* JADX INFO: renamed from: d0 */
    public static org.apache.commons.p013io.LineIterator m22954d0(java.io.File r1, java.lang.String r2) throws java.io.IOException {
        /*
            r0 = 0
            return r0
        La:
        Lc:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.FileUtils.m22954d0(java.io.File, java.lang.String):org.apache.commons.io.LineIterator");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d1 */
    public static void m22955d1(File file, Collection<?> collection, String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: e */
    public static java.util.zip.Checksum m22956e(java.io.File r3, java.util.zip.Checksum r4) throws java.io.IOException {
        /*
            r0 = 0
            return r0
        L1d:
        L20:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.FileUtils.m22956e(java.io.File, java.util.zip.Checksum):java.util.zip.Checksum");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e0 */
    public static Collection<File> m22957e0(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e1 */
    public static void m22958e1(File file, Collection<?> collection, String str, boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static long m22959f(File file) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f0 */
    public static Collection<File> m22960f0(File file, String[] strArr, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f1 */
    public static void m22961f1(File file, Collection<?> collection, boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: g */
    public static void m22962g(java.io.File r4) throws java.io.IOException {
        /*
            return
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.FileUtils.m22962g(java.io.File):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g0 */
    public static Collection<File> m22963g0(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: g1 */
    public static void m22964g1(File file, String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: h */
    public static void m22965h(java.io.File r4) throws java.io.IOException {
        /*
            return
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.FileUtils.m22965h(java.io.File):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h0 */
    public static void m22966h0(File file, File file2) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h1 */
    public static void m22967h1(File file, String str, String str2) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0039
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: i */
    public static boolean m22968i(java.io.File r7, java.io.File r8) throws java.io.IOException {
        /*
            r0 = 0
            return r0
        L4e:
        L51:
        L54:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.FileUtils.m22968i(java.io.File, java.io.File):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i0 */
    public static void m22969i0(File file, File file2, boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i1 */
    public static void m22970i1(File file, String str, String str2, boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x002e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: j */
    public static boolean m22971j(java.io.File r4, java.io.File r5, java.lang.String r6) throws java.io.IOException {
        /*
            r0 = 0
            return r0
        L4c:
        L50:
        L73:
        L78:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.FileUtils.m22971j(java.io.File, java.io.File, java.lang.String):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j0 */
    public static void m22972j0(File file, File file2) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j1 */
    public static void m22973j1(File file, String str, Charset charset) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static File[] m22974k(Collection<File> collection) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k0 */
    public static void m22975k0(File file, File file2, boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: k1 */
    public static void m22976k1(java.io.File r0, java.lang.String r1, java.nio.charset.Charset r2, boolean r3) throws java.io.IOException {
        /*
            return
        Le:
        L10:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.FileUtils.m22976k1(java.io.File, java.lang.String, java.nio.charset.Charset, boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static void m22977l(File file, File file2) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l0 */
    public static void m22978l0(File file, File file2, boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: l1 */
    public static void m22979l1(File file, String str, boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public static void m22980m(File file, File file2, FileFilter fileFilter) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m0 */
    public static FileInputStream m22981m0(File file) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public static void m22982n(File file, File file2, FileFilter fileFilter, boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n0 */
    public static FileOutputStream m22983n0(File file) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public static void m22984o(File file, File file2, boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o0 */
    public static FileOutputStream m22985o0(File file, boolean z) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public static void m22986p(File file, File file2) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: p0 */
    public static byte[] m22987p0(java.io.File r1) throws java.io.IOException {
        /*
            r0 = 0
            return r0
        Lc:
        Le:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.FileUtils.m22987p0(java.io.File):byte[]");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: q */
    public static long m22988q(java.io.File r1, java.io.OutputStream r2) throws java.io.IOException {
        /*
            r0 = 0
            return r0
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.FileUtils.m22988q(java.io.File, java.io.OutputStream):long");
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: q0 */
    public static String m22989q0(File file) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public static void m22990r(File file, File file2) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r0 */
    public static String m22991r0(File file, String str) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public static void m22992s(File file, File file2, boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: s0 */
    public static java.lang.String m22993s0(java.io.File r0, java.nio.charset.Charset r1) throws java.io.IOException {
        /*
            r0 = 0
            return r0
        L10:
        L12:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.FileUtils.m22993s0(java.io.File, java.nio.charset.Charset):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public static void m22994t(File file, File file2) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: t0 */
    public static List<String> m22995t0(File file) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public static void m22996u(File file, File file2, boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u0 */
    public static List<String> m22997u0(File file, String str) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public static void m22998v(InputStream inputStream, File file) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: v0 */
    public static java.util.List<java.lang.String> m22999v0(java.io.File r0, java.nio.charset.Charset r1) throws java.io.IOException {
        /*
            r0 = 0
            return r0
        L10:
        L12:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.FileUtils.m22999v0(java.io.File, java.nio.charset.Charset):java.util.List");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: w */
    public static void m23000w(java.io.InputStream r1, java.io.File r2) throws java.io.IOException {
        /*
            return
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.FileUtils.m23000w(java.io.InputStream, java.io.File):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w0 */
    public static IOFileFilter m23001w0(IOFileFilter iOFileFilter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public static void m23002x(URL url, File file) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x0 */
    public static IOFileFilter m23003x0(IOFileFilter iOFileFilter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public static void m23004y(URL url, File file, int i, int i2) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y0 */
    public static long m23005y0(File file) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0024
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: z */
    public static java.lang.String m23006z(java.lang.String r8) {
        /*
            r0 = 0
            return r0
        L3d:
        L3f:
        L5d:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.FileUtils.m23006z(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z0 */
    public static long m23007z0(File file) {
        return 0L;
    }
}
