package org.apache.commons.p013io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
class ReverseComparator extends AbstractFileComparator implements Serializable {

    /* JADX INFO: renamed from: b */
    public static final long f15706b = -4808255005272229056L;

    /* JADX INFO: renamed from: a */
    public final Comparator<File> f15707a;

    /* JADX WARN: Invalid debug info offset */
    public ReverseComparator(Comparator<File> comparator) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public int m23202c(File file, File file2) {
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
