package org.apache.commons.p013io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.p013io.IOCase;

/* JADX INFO: loaded from: classes2.dex */
public class ExtensionFileComparator extends AbstractFileComparator implements Serializable {

    /* JADX INFO: renamed from: b */
    public static final long f15679b = 1928235200184222815L;

    /* JADX INFO: renamed from: c */
    public static final Comparator<File> f15680c;

    /* JADX INFO: renamed from: d */
    public static final Comparator<File> f15681d;

    /* JADX INFO: renamed from: e */
    public static final Comparator<File> f15682e;

    /* JADX INFO: renamed from: f */
    public static final Comparator<File> f15683f;

    /* JADX INFO: renamed from: g */
    public static final Comparator<File> f15684g;

    /* JADX INFO: renamed from: h */
    public static final Comparator<File> f15685h;

    /* JADX INFO: renamed from: a */
    public final IOCase f15686a;

    static {
        ExtensionFileComparator extensionFileComparator = new ExtensionFileComparator();
        f15680c = extensionFileComparator;
        f15681d = new ReverseComparator(extensionFileComparator);
        ExtensionFileComparator extensionFileComparator2 = new ExtensionFileComparator(IOCase.INSENSITIVE);
        f15682e = extensionFileComparator2;
        f15683f = new ReverseComparator(extensionFileComparator2);
        ExtensionFileComparator extensionFileComparator3 = new ExtensionFileComparator(IOCase.SYSTEM);
        f15684g = extensionFileComparator3;
        f15685h = new ReverseComparator(extensionFileComparator3);
    }

    /* JADX WARN: Invalid debug info offset */
    public ExtensionFileComparator() {
    }

    /* JADX WARN: Invalid debug info offset */
    public ExtensionFileComparator(IOCase iOCase) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.comparator.AbstractFileComparator
    /* JADX INFO: renamed from: a */
    public List mo23192a(List list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.comparator.AbstractFileComparator
    /* JADX INFO: renamed from: b */
    public File[] mo23193b(File[] fileArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public int m23198c(File file, File file2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(File file, File file2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.comparator.AbstractFileComparator
    public String toString() {
        return null;
    }
}
