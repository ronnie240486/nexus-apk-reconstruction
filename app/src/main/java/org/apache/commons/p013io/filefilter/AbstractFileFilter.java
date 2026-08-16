package org.apache.commons.p013io.filefilter;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractFileFilter implements IOFileFilter {
    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
