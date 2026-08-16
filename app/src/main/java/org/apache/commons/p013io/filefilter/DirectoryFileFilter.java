package org.apache.commons.p013io.filefilter;

import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class DirectoryFileFilter extends AbstractFileFilter implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final long f15729a = -5148237843784525732L;

    /* JADX INFO: renamed from: b */
    public static final IOFileFilter f15730b;

    /* JADX INFO: renamed from: c */
    public static final IOFileFilter f15731c;

    static {
        DirectoryFileFilter directoryFileFilter = new DirectoryFileFilter();
        f15730b = directoryFileFilter;
        f15731c = directoryFileFilter;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.filefilter.AbstractFileFilter, org.apache.commons.p013io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return false;
    }
}
