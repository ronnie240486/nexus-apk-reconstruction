package org.apache.commons.p013io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class CompositeFileComparator extends AbstractFileComparator implements Serializable {

    /* JADX INFO: renamed from: b */
    public static final long f15670b = -2224170307287243428L;

    /* JADX INFO: renamed from: c */
    public static final Comparator<?>[] f15671c = new Comparator[0];

    /* JADX INFO: renamed from: a */
    public final Comparator<File>[] f15672a;

    /* JADX WARN: Invalid debug info offset */
    public CompositeFileComparator(Iterable<Comparator<File>> iterable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CompositeFileComparator(Comparator<File>... comparatorArr) {
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
    public int m23194c(File file, File file2) {
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
