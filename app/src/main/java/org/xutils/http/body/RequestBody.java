package org.xutils.http.body;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public interface RequestBody {
    /* JADX INFO: renamed from: a */
    void mo27112a(OutputStream outputStream) throws IOException;

    /* JADX INFO: renamed from: b */
    void mo27110b(String str);

    /* JADX INFO: renamed from: d */
    long mo27114d();

    String getContentType();
}
