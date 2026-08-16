package org.apache.commons.p013io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.p013io.IOCase;

/* JADX INFO: loaded from: classes2.dex */
public class NameFileComparator extends AbstractFileComparator implements Serializable {

    /* JADX INFO: renamed from: b */
    public static final long f15690b = 8397947749814525798L;

    /* JADX INFO: renamed from: c */
    public static final Comparator<File> f15691c;

    /* JADX INFO: renamed from: d */
    public static final Comparator<File> f15692d;

    /* JADX INFO: renamed from: e */
    public static final Comparator<File> f15693e;

    /* JADX INFO: renamed from: f */
    public static final Comparator<File> f15694f;

    /* JADX INFO: renamed from: g */
    public static final Comparator<File> f15695g;

    /* JADX INFO: renamed from: h */
    public static final Comparator<File> f15696h;

    /* JADX INFO: renamed from: a */
    public final IOCase f15697a;

    static {
        NameFileComparator nameFileComparator = new NameFileComparator();
        f15691c = nameFileComparator;
        f15692d = new ReverseComparator(nameFileComparator);
        NameFileComparator nameFileComparator2 = new NameFileComparator(IOCase.INSENSITIVE);
        f15693e = nameFileComparator2;
        f15694f = new ReverseComparator(nameFileComparator2);
        NameFileComparator nameFileComparator3 = new NameFileComparator(IOCase.SYSTEM);
        f15695g = nameFileComparator3;
        f15696h = new ReverseComparator(nameFileComparator3);
    }

    /* JADX WARN: Invalid debug info offset */
    public NameFileComparator() {
    }

    /* JADX WARN: Invalid debug info offset */
    public NameFileComparator(IOCase iOCase) {
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
    public int m23200c(File file, File file2) {
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
