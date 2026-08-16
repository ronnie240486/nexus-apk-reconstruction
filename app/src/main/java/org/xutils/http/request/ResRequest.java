package org.xutils.http.request;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import org.xutils.http.RequestParams;

/* JADX INFO: loaded from: classes.dex */
public class ResRequest extends UriRequest {

    /* JADX INFO: renamed from: i */
    public static long f18232i;

    /* JADX INFO: renamed from: g */
    public long f18233g;

    /* JADX INFO: renamed from: h */
    public InputStream f18234h;

    /* JADX WARN: Invalid debug info offset */
    public ResRequest(RequestParams requestParams, Type type) throws Throwable {
    }

    @Override // org.xutils.http.request.UriRequest
    /* JADX INFO: renamed from: A0 */
    public String mo27164A0() throws IOException {
        return null;
    }

    @Override // org.xutils.http.request.UriRequest
    /* JADX INFO: renamed from: J0 */
    public boolean mo27165J0() {
        return true;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.request.UriRequest
    /* JADX INFO: renamed from: L0 */
    public Object mo27166L0() throws Throwable {
        return null;
    }

    @Override // org.xutils.http.request.UriRequest
    /* JADX INFO: renamed from: P */
    public String mo27167P() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.request.UriRequest
    /* JADX INFO: renamed from: P0 */
    public Object mo27168P0() throws Throwable {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.request.UriRequest
    /* JADX INFO: renamed from: R */
    public long mo27169R() {
        return 0L;
    }

    @Override // org.xutils.http.request.UriRequest
    /* JADX INFO: renamed from: S */
    public long mo27170S(String str, long j) {
        return j;
    }

    @Override // org.xutils.http.request.UriRequest
    /* JADX INFO: renamed from: U0 */
    public void mo27171U0() throws Throwable {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.request.UriRequest
    /* JADX INFO: renamed from: V */
    public InputStream mo27162V() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public final int m27183Y0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0008
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.xutils.http.request.UriRequest
    /* JADX INFO: renamed from: b0 */
    public long mo27172b0() {
        /*
            r6 = this;
            r0 = 0
            return r0
        L26:
        L43:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.http.request.ResRequest.mo27172b0():long");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.request.UriRequest, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // org.xutils.http.request.UriRequest
    /* JADX INFO: renamed from: k */
    public void mo27174k() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.request.UriRequest
    /* JADX INFO: renamed from: l0 */
    public int mo27176l0() throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.request.UriRequest
    /* JADX INFO: renamed from: p */
    public String mo27177p() {
        return null;
    }

    @Override // org.xutils.http.request.UriRequest
    /* JADX INFO: renamed from: r0 */
    public String mo27178r0(String str) {
        return null;
    }

    @Override // org.xutils.http.request.UriRequest
    /* JADX INFO: renamed from: u0 */
    public Map<String, List<String>> mo27179u0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.request.UriRequest
    /* JADX INFO: renamed from: w */
    public long mo27180w() {
        return 0L;
    }
}
