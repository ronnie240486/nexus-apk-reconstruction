package org.apache.commons.p013io.filefilter;

import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class EmptyFileFilter extends AbstractFileFilter implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final long f15732a = 3631422087512832211L;

    /* JADX INFO: renamed from: b */
    public static final IOFileFilter f15733b;

    /* JADX INFO: renamed from: c */
    public static final IOFileFilter f15734c;

    static {
        EmptyFileFilter emptyFileFilter = new EmptyFileFilter();
        f15733b = emptyFileFilter;
        f15734c = new NotFileFilter(emptyFileFilter);
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.filefilter.AbstractFileFilter, org.apache.commons.p013io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return false;
    }
}
