package org.apache.commons.p013io.filefilter;

import java.io.File;
import java.io.Serializable;
import java.util.regex.Pattern;
import org.apache.commons.p013io.IOCase;

/* JADX INFO: loaded from: classes2.dex */
public class RegexFileFilter extends AbstractFileFilter implements Serializable {

    /* JADX INFO: renamed from: b */
    public static final long f15758b = 4269646126155225062L;

    /* JADX INFO: renamed from: a */
    public final Pattern f15759a;

    /* JADX WARN: Invalid debug info offset */
    public RegexFileFilter(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RegexFileFilter(String str, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RegexFileFilter(String str, IOCase iOCase) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RegexFileFilter(Pattern pattern) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.filefilter.AbstractFileFilter, org.apache.commons.p013io.filefilter.IOFileFilter, java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return false;
    }
}
