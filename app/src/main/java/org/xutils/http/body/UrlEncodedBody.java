package org.xutils.http.body;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import org.xutils.common.util.KeyValue;

/* JADX INFO: loaded from: classes.dex */
public class UrlEncodedBody implements RequestBody {

    /* JADX INFO: renamed from: a */
    public byte[] f18184a;

    /* JADX INFO: renamed from: b */
    public String f18185b;

    /* JADX WARN: Invalid debug info offset */
    public UrlEncodedBody(List<KeyValue> list, String str) throws IOException {
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
