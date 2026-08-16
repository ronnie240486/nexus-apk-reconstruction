package org.apache.commons.p013io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class AgeFileFilter extends AbstractFileFilter implements Serializable {

    /* JADX INFO: renamed from: c */
    public static final long f15714c = -2132740084016138541L;

    /* JADX INFO: renamed from: a */
    public final long f15715a;

    /* JADX INFO: renamed from: b */
    public final boolean f15716b;

    /* JADX WARN: Invalid debug info offset */
    public AgeFileFilter(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AgeFileFilter(long j, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AgeFileFilter(File file) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AgeFileFilter(File file, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AgeFileFilter(Date date) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AgeFileFilter(Date date, boolean z) {
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
