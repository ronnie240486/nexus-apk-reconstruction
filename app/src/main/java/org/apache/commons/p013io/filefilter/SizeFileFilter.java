package org.apache.commons.p013io.filefilter;

import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class SizeFileFilter extends AbstractFileFilter implements Serializable {

    /* JADX INFO: renamed from: c */
    public static final long f15760c = 7388077430788600069L;

    /* JADX INFO: renamed from: a */
    public final long f15761a;

    /* JADX INFO: renamed from: b */
    public final boolean f15762b;

    /* JADX WARN: Invalid debug info offset */
    public SizeFileFilter(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SizeFileFilter(long j, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.filefilter.AbstractFileFilter, org.apache.commons.p013io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.filefilter.AbstractFileFilter
    public String toString() {
        return null;
    }
}
