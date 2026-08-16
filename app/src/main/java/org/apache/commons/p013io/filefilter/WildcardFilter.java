package org.apache.commons.p013io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class WildcardFilter extends AbstractFileFilter implements Serializable {

    /* JADX INFO: renamed from: b */
    public static final long f15772b = -5037645902506953517L;

    /* JADX INFO: renamed from: a */
    public final String[] f15773a;

    /* JADX WARN: Invalid debug info offset */
    public WildcardFilter(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public WildcardFilter(List<String> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    public WildcardFilter(String[] strArr) {
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
}
