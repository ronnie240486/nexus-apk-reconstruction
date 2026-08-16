package org.apache.commons.p013io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class AndFileFilter extends AbstractFileFilter implements ConditionalFileFilter, Serializable {

    /* JADX INFO: renamed from: b */
    public static final long f15717b = 7215974688563965257L;

    /* JADX INFO: renamed from: a */
    public final List<IOFileFilter> f15718a;

    /* JADX WARN: Invalid debug info offset */
    public AndFileFilter() {
    }

    /* JADX WARN: Invalid debug info offset */
    public AndFileFilter(List<IOFileFilter> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AndFileFilter(IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.filefilter.ConditionalFileFilter
    /* JADX INFO: renamed from: a */
    public void mo23204a(IOFileFilter iOFileFilter) {
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
    @Override // org.apache.commons.p013io.filefilter.ConditionalFileFilter
    /* JADX INFO: renamed from: b */
    public boolean mo23205b(IOFileFilter iOFileFilter) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.filefilter.ConditionalFileFilter
    /* JADX INFO: renamed from: c */
    public void mo23206c(List<IOFileFilter> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.filefilter.ConditionalFileFilter
    /* JADX INFO: renamed from: d */
    public List<IOFileFilter> mo23207d() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.filefilter.AbstractFileFilter
    public String toString() {
        return null;
    }
}
