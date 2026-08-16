package org.xutils.http.request;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import org.xutils.http.ProgressHandler;
import org.xutils.http.RequestParams;
import org.xutils.http.app.RequestInterceptListener;
import org.xutils.http.app.ResponseParser;
import org.xutils.http.loader.Loader;

/* JADX INFO: loaded from: classes.dex */
public abstract class UriRequest implements Closeable {

    /* JADX INFO: renamed from: a */
    public final String f18235a;

    /* JADX INFO: renamed from: b */
    public final RequestParams f18236b;

    /* JADX INFO: renamed from: c */
    public final Loader<?> f18237c;

    /* JADX INFO: renamed from: d */
    public ProgressHandler f18238d;

    /* JADX INFO: renamed from: e */
    public ResponseParser f18239e;

    /* JADX INFO: renamed from: f */
    public RequestInterceptListener f18240f;

    /* JADX INFO: renamed from: org.xutils.http.request.UriRequest$1 */
    public class RunnableC51321 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UriRequest f18241a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC51321(UriRequest uriRequest) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public UriRequest(RequestParams requestParams, Type type) throws Throwable {
    }

    /* JADX INFO: renamed from: A0 */
    public abstract String mo27164A0() throws IOException;

    /* JADX INFO: renamed from: J0 */
    public abstract boolean mo27165J0();

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L0 */
    public Object mo27166L0() throws Throwable {
        return null;
    }

    /* JADX INFO: renamed from: P */
    public abstract String mo27167P();

    /* JADX INFO: renamed from: P0 */
    public abstract Object mo27168P0() throws Throwable;

    /* JADX INFO: renamed from: R */
    public abstract long mo27169R();

    /* JADX INFO: renamed from: S */
    public abstract long mo27170S(String str, long j);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public void mo27181T0() {
    }

    /* JADX INFO: renamed from: U0 */
    public abstract void mo27171U0() throws Throwable;

    /* JADX INFO: renamed from: V */
    public abstract InputStream mo27162V() throws IOException;

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public void m27184V0(ProgressHandler progressHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public void m27185W0(RequestInterceptListener requestInterceptListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public void m27186X0(ResponseParser responseParser) {
    }

    /* JADX INFO: renamed from: b0 */
    public abstract long mo27172b0();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g0 */
    public RequestParams m27187g0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public String mo27173j(RequestParams requestParams) throws IOException {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo27174k();

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k0 */
    public String mo27175k0() {
        return null;
    }

    /* JADX INFO: renamed from: l0 */
    public abstract int mo27176l0() throws IOException;

    /* JADX INFO: renamed from: p */
    public abstract String mo27177p();

    /* JADX INFO: renamed from: r0 */
    public abstract String mo27178r0(String str);

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }

    /* JADX INFO: renamed from: u0 */
    public abstract Map<String, List<String>> mo27179u0();

    /* JADX INFO: renamed from: w */
    public abstract long mo27180w();
}
