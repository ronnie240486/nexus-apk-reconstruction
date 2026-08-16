package org.apache.commons.p013io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class SizeFileComparator extends AbstractFileComparator implements Serializable {

    /* JADX INFO: renamed from: b */
    public static final long f15708b = -1201561106411416190L;

    /* JADX INFO: renamed from: c */
    public static final Comparator<File> f15709c;

    /* JADX INFO: renamed from: d */
    public static final Comparator<File> f15710d;

    /* JADX INFO: renamed from: e */
    public static final Comparator<File> f15711e;

    /* JADX INFO: renamed from: f */
    public static final Comparator<File> f15712f;

    /* JADX INFO: renamed from: a */
    public final boolean f15713a;

    static {
        SizeFileComparator sizeFileComparator = new SizeFileComparator();
        f15709c = sizeFileComparator;
        f15710d = new ReverseComparator(sizeFileComparator);
        SizeFileComparator sizeFileComparator2 = new SizeFileComparator(true);
        f15711e = sizeFileComparator2;
        f15712f = new ReverseComparator(sizeFileComparator2);
    }

    /* JADX WARN: Invalid debug info offset */
    public SizeFileComparator() {
    }

    /* JADX WARN: Invalid debug info offset */
    public SizeFileComparator(boolean z) {
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
    public int m23203c(File file, File file2) {
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
