package org.apache.commons.p013io.filefilter;

import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class FalseFileFilter implements IOFileFilter, Serializable {

    /* JADX INFO: renamed from: a */
    public static final long f15735a = 6210271677940926200L;

    /* JADX INFO: renamed from: b */
    public static final IOFileFilter f15736b;

    /* JADX INFO: renamed from: c */
    public static final IOFileFilter f15737c;

    static {
        FalseFileFilter falseFileFilter = new FalseFileFilter();
        f15736b = falseFileFilter;
        f15737c = falseFileFilter;
    }

    @Override // org.apache.commons.p013io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return false;
    }

    @Override // org.apache.commons.p013io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return false;
    }
}
