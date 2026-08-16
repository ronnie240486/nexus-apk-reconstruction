package org.apache.commons.p013io.filefilter;

import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class CanReadFileFilter extends AbstractFileFilter implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final long f15719a = 3179904805251622989L;

    /* JADX INFO: renamed from: b */
    public static final IOFileFilter f15720b;

    /* JADX INFO: renamed from: c */
    public static final IOFileFilter f15721c;

    /* JADX INFO: renamed from: d */
    public static final IOFileFilter f15722d;

    static {
        CanReadFileFilter canReadFileFilter = new CanReadFileFilter();
        f15720b = canReadFileFilter;
        f15721c = new NotFileFilter(canReadFileFilter);
        f15722d = new AndFileFilter(canReadFileFilter, CanWriteFileFilter.f15725c);
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.filefilter.AbstractFileFilter, org.apache.commons.p013io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return false;
    }
}
