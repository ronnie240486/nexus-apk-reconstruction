package org.xutils.http.request;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.xutils.http.RequestParams;
import org.xutils.http.cookie.DbCookieStore;

/* JADX INFO: loaded from: classes.dex */
public class HttpRequest extends UriRequest {

    /* JADX INFO: renamed from: l */
    public static final CookieManager f18225l = new CookieManager(DbCookieStore.INSTANCE, CookiePolicy.ACCEPT_ALL);

    /* JADX INFO: renamed from: g */
    public String f18226g;

    /* JADX INFO: renamed from: h */
    public boolean f18227h;

    /* JADX INFO: renamed from: i */
    public InputStream f18228i;

    /* JADX INFO: renamed from: j */
    public HttpURLConnection f18229j;

    /* JADX INFO: renamed from: k */
    public int f18230k;

    /* JADX WARN: Invalid debug info offset */
    public HttpRequest(RequestParams requestParams, Type type) throws Throwable {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public static String m27163Y0(Date date) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.request.UriRequest
    /* JADX INFO: renamed from: A0 */
    public String mo27164A0() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.request.UriRequest
    /* JADX INFO: renamed from: J0 */
    public boolean mo27165J0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.request.UriRequest
    /* JADX INFO: renamed from: L0 */
    public Object mo27166L0() throws Throwable {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
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
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0040
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.xutils.http.request.UriRequest
    /* JADX INFO: renamed from: R */
    public long mo27169R() {
        /*
            r8 = this;
            r0 = 0
            return r0
        L5b:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.http.request.HttpRequest.mo27169R():long");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.request.UriRequest
    /* JADX INFO: renamed from: S */
    public long mo27170S(String str, long j) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0077
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.xutils.http.request.UriRequest
    @android.annotation.TargetApi(19)
    /* JADX INFO: renamed from: U0 */
    public void mo27171U0() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.http.request.HttpRequest.mo27171U0():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.request.UriRequest
    /* JADX INFO: renamed from: V */
    public InputStream mo27162V() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.request.UriRequest
    /* JADX INFO: renamed from: b0 */
    public long mo27172b0() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.request.UriRequest, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.request.UriRequest
    /* JADX INFO: renamed from: j */
    public String mo27173j(RequestParams requestParams) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.request.UriRequest
    /* JADX INFO: renamed from: k */
    public void mo27174k() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.request.UriRequest
    /* JADX INFO: renamed from: k0 */
    public String mo27175k0() {
        return null;
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

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.request.UriRequest
    /* JADX INFO: renamed from: r0 */
    public String mo27178r0(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.request.UriRequest
    /* JADX INFO: renamed from: u0 */
    public Map<String, List<String>> mo27179u0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.xutils.http.request.UriRequest
    /* JADX INFO: renamed from: w */
    public long mo27180w() {
        /*
            r5 = this;
            r0 = 0
            return r0
        L13:
        L2a:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.http.request.HttpRequest.mo27180w():long");
    }
}
