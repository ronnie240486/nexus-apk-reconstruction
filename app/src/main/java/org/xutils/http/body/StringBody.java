package org.xutils.http.body;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public class StringBody implements RequestBody {

    /* JADX INFO: renamed from: a */
    public byte[] f18181a;

    /* JADX INFO: renamed from: b */
    public String f18182b;

    /* JADX INFO: renamed from: c */
    public String f18183c;

    /* JADX WARN: Invalid debug info offset */
    public StringBody(String str, String str2) throws UnsupportedEncodingException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.body.RequestBody
    /* JADX INFO: renamed from: a */
    public void mo27112a(OutputStream outputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.body.RequestBody
    /* JADX INFO: renamed from: b */
    public void mo27110b(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.body.RequestBody
    /* JADX INFO: renamed from: d */
    public long mo27114d() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.body.RequestBody
    public String getContentType() {
        return null;
    }
}
