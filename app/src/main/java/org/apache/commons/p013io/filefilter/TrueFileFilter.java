package org.apache.commons.p013io.filefilter;

import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class TrueFileFilter implements IOFileFilter, Serializable {

    /* JADX INFO: renamed from: a */
    public static final long f15766a = 8782512160909720199L;

    /* JADX INFO: renamed from: b */
    public static final IOFileFilter f15767b;

    /* JADX INFO: renamed from: c */
    public static final IOFileFilter f15768c;

    static {
        TrueFileFilter trueFileFilter = new TrueFileFilter();
        f15767b = trueFileFilter;
        f15768c = trueFileFilter;
    }

    @Override // org.apache.commons.p013io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return true;
    }

    @Override // org.apache.commons.p013io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return true;
    }
}
