package org.apache.commons.p013io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class LastModifiedFileComparator extends AbstractFileComparator implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final long f15687a = 7372168004395734046L;

    /* JADX INFO: renamed from: b */
    public static final Comparator<File> f15688b;

    /* JADX INFO: renamed from: c */
    public static final Comparator<File> f15689c;

    static {
        LastModifiedFileComparator lastModifiedFileComparator = new LastModifiedFileComparator();
        f15688b = lastModifiedFileComparator;
        f15689c = new ReverseComparator(lastModifiedFileComparator);
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
    public int m23199c(File file, File file2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(File file, File file2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.comparator.AbstractFileComparator
    public /* bridge */ /* synthetic */ String toString() {
        return null;
    }
}
