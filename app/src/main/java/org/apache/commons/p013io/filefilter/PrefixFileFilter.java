package org.apache.commons.p013io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.List;
import org.apache.commons.p013io.IOCase;

/* JADX INFO: loaded from: classes2.dex */
public class PrefixFileFilter extends AbstractFileFilter implements Serializable {

    /* JADX INFO: renamed from: c */
    public static final long f15755c = 8533897440809599867L;

    /* JADX INFO: renamed from: a */
    public final String[] f15756a;

    /* JADX INFO: renamed from: b */
    public final IOCase f15757b;

    /* JADX WARN: Invalid debug info offset */
    public PrefixFileFilter(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PrefixFileFilter(String str, IOCase iOCase) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PrefixFileFilter(List<String> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PrefixFileFilter(List<String> list, IOCase iOCase) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PrefixFileFilter(String[] strArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PrefixFileFilter(String[] strArr, IOCase iOCase) {
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
