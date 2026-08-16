package org.apache.commons.p013io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.p013io.IOCase;

/* JADX INFO: loaded from: classes2.dex */
public class PathFileComparator extends AbstractFileComparator implements Serializable {

    /* JADX INFO: renamed from: b */
    public static final long f15698b = 6527501707585768673L;

    /* JADX INFO: renamed from: c */
    public static final Comparator<File> f15699c;

    /* JADX INFO: renamed from: d */
    public static final Comparator<File> f15700d;

    /* JADX INFO: renamed from: e */
    public static final Comparator<File> f15701e;

    /* JADX INFO: renamed from: f */
    public static final Comparator<File> f15702f;

    /* JADX INFO: renamed from: g */
    public static final Comparator<File> f15703g;

    /* JADX INFO: renamed from: h */
    public static final Comparator<File> f15704h;

    /* JADX INFO: renamed from: a */
    public final IOCase f15705a;

    static {
        PathFileComparator pathFileComparator = new PathFileComparator();
        f15699c = pathFileComparator;
        f15700d = new ReverseComparator(pathFileComparator);
        PathFileComparator pathFileComparator2 = new PathFileComparator(IOCase.INSENSITIVE);
        f15701e = pathFileComparator2;
        f15702f = new ReverseComparator(pathFileComparator2);
        PathFileComparator pathFileComparator3 = new PathFileComparator(IOCase.SYSTEM);
        f15703g = pathFileComparator3;
        f15704h = new ReverseComparator(pathFileComparator3);
    }

    /* JADX WARN: Invalid debug info offset */
    public PathFileComparator() {
    }

    /* JADX WARN: Invalid debug info offset */
    public PathFileComparator(IOCase iOCase) {
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
    public int m23201c(File file, File file2) {
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
