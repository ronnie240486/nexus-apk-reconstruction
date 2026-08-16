package org.apache.commons.p013io.filefilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class DelegateFileFilter extends AbstractFileFilter implements Serializable {

    /* JADX INFO: renamed from: c */
    public static final long f15726c = -8723373124984771318L;

    /* JADX INFO: renamed from: a */
    public final FilenameFilter f15727a;

    /* JADX INFO: renamed from: b */
    public final FileFilter f15728b;

    /* JADX WARN: Invalid debug info offset */
    public DelegateFileFilter(FileFilter fileFilter) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DelegateFileFilter(FilenameFilter filenameFilter) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.filefilter.AbstractFileFilter, org.apache.commons.p013io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.filefilter.AbstractFileFilter, org.apache.commons.p013io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.filefilter.AbstractFileFilter
    public String toString() {
        return null;
    }
}
