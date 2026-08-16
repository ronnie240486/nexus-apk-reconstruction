package org.apache.commons.p013io.filefilter;

import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class FileFileFilter extends AbstractFileFilter implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final long f15738a = 5345244090827540862L;

    /* JADX INFO: renamed from: b */
    public static final IOFileFilter f15739b = new FileFileFilter();

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.filefilter.AbstractFileFilter, org.apache.commons.p013io.filefilter.IOFileFilter, java.io.FileFilter
    public boolean accept(File file) {
        return false;
    }
}
