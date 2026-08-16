package org.apache.commons.p013io.filefilter;

import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class HiddenFileFilter extends AbstractFileFilter implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final long f15742a = 8930842316112759062L;

    /* JADX INFO: renamed from: b */
    public static final IOFileFilter f15743b;

    /* JADX INFO: renamed from: c */
    public static final IOFileFilter f15744c;

    static {
        HiddenFileFilter hiddenFileFilter = new HiddenFileFilter();
        f15743b = hiddenFileFilter;
        f15744c = new NotFileFilter(hiddenFileFilter);
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.filefilter.AbstractFileFilter, org.apache.commons.p013io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return false;
    }
}
