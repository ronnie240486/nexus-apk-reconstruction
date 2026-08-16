package org.apache.commons.p013io.filefilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.apache.commons.p013io.IOCase;

/* JADX INFO: loaded from: classes.dex */
public class FileFilterUtils {

    /* JADX INFO: renamed from: a */
    public static final IOFileFilter f15740a;

    /* JADX INFO: renamed from: b */
    public static final IOFileFilter f15741b;

    static {
        IOFileFilter iOFileFilter = DirectoryFileFilter.f15730b;
        f15740a = new NotFileFilter(m23230g(iOFileFilter, m23210C("CVS")));
        f15741b = new NotFileFilter(m23230g(iOFileFilter, m23210C(".svn")));
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public static IOFileFilter m23208A(IOFileFilter iOFileFilter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public static IOFileFilter m23209B(IOFileFilter iOFileFilter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public static IOFileFilter m23210C(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public static IOFileFilter m23211D(String str, IOCase iOCase) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public static IOFileFilter m23212E(IOFileFilter iOFileFilter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F */
    public static IOFileFilter m23213F(IOFileFilter... iOFileFilterArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: G */
    public static IOFileFilter m23214G(IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public static IOFileFilter m23215H(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public static IOFileFilter m23216I(String str, IOCase iOCase) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public static IOFileFilter m23217J(long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public static IOFileFilter m23218K(long j, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L */
    public static IOFileFilter m23219L(long j, long j2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public static IOFileFilter m23220M(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N */
    public static IOFileFilter m23221N(String str, IOCase iOCase) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O */
    public static List<IOFileFilter> m23222O(IOFileFilter... iOFileFilterArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public static IOFileFilter m23223P() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static IOFileFilter m23224a(long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static IOFileFilter m23225b(long j, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static IOFileFilter m23226c(File file) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static IOFileFilter m23227d(File file, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static IOFileFilter m23228e(Date date) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static IOFileFilter m23229f(Date date, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static IOFileFilter m23230g(IOFileFilter... iOFileFilterArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: h */
    public static IOFileFilter m23231h(IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static IOFileFilter m23232i(FileFilter fileFilter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static IOFileFilter m23233j(FilenameFilter filenameFilter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static IOFileFilter m23234k() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static IOFileFilter m23235l() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public static IOFileFilter m23236m() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public static <T extends Collection<File>> T m23237n(IOFileFilter iOFileFilter, Iterable<File> iterable, T t) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public static File[] m23238o(IOFileFilter iOFileFilter, Iterable<File> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public static File[] m23239p(IOFileFilter iOFileFilter, File... fileArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public static List<File> m23240q(IOFileFilter iOFileFilter, Iterable<File> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public static List<File> m23241r(IOFileFilter iOFileFilter, File... fileArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public static Set<File> m23242s(IOFileFilter iOFileFilter, Iterable<File> iterable) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public static Set<File> m23243t(IOFileFilter iOFileFilter, File... fileArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public static IOFileFilter m23244u(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public static IOFileFilter m23245v(String str, long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public static IOFileFilter m23246w(byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public static IOFileFilter m23247x(byte[] bArr, long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public static IOFileFilter m23248y(IOFileFilter iOFileFilter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public static IOFileFilter m23249z(IOFileFilter iOFileFilter) {
        return null;
    }
}
