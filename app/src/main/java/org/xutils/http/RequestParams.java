package org.xutils.http;

import android.content.Context;
import java.net.Proxy;
import java.util.concurrent.Executor;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import org.xutils.common.task.Priority;
import org.xutils.http.annotation.HttpRequest;
import org.xutils.http.app.DefaultRedirectHandler;
import org.xutils.http.app.HttpRetryHandler;
import org.xutils.http.app.ParamsBuilder;
import org.xutils.http.app.RedirectHandler;
import org.xutils.http.app.RequestTracker;

/* JADX INFO: loaded from: classes.dex */
public class RequestParams extends BaseParams {

    /* JADX INFO: renamed from: N */
    public static final int f18124N = 10;

    /* JADX INFO: renamed from: O */
    public static final DefaultRedirectHandler f18125O = new DefaultRedirectHandler();

    /* JADX INFO: renamed from: A */
    public Priority f18126A;

    /* JADX INFO: renamed from: B */
    public int f18127B;

    /* JADX INFO: renamed from: C */
    public int f18128C;

    /* JADX INFO: renamed from: D */
    public boolean f18129D;

    /* JADX INFO: renamed from: E */
    public boolean f18130E;

    /* JADX INFO: renamed from: F */
    public int f18131F;

    /* JADX INFO: renamed from: G */
    public String f18132G;

    /* JADX INFO: renamed from: H */
    public boolean f18133H;

    /* JADX INFO: renamed from: I */
    public int f18134I;

    /* JADX INFO: renamed from: J */
    public HttpRetryHandler f18135J;

    /* JADX INFO: renamed from: K */
    public RequestTracker f18136K;

    /* JADX INFO: renamed from: L */
    public RedirectHandler f18137L;

    /* JADX INFO: renamed from: M */
    public boolean f18138M;

    /* JADX INFO: renamed from: k */
    public HttpRequest f18139k;

    /* JADX INFO: renamed from: l */
    public String f18140l;

    /* JADX INFO: renamed from: m */
    public final String[] f18141m;

    /* JADX INFO: renamed from: n */
    public final String[] f18142n;

    /* JADX INFO: renamed from: o */
    public ParamsBuilder f18143o;

    /* JADX INFO: renamed from: p */
    public String f18144p;

    /* JADX INFO: renamed from: q */
    public String f18145q;

    /* JADX INFO: renamed from: r */
    public SSLSocketFactory f18146r;

    /* JADX INFO: renamed from: s */
    public Context f18147s;

    /* JADX INFO: renamed from: t */
    public Proxy f18148t;

    /* JADX INFO: renamed from: u */
    public HostnameVerifier f18149u;

    /* JADX INFO: renamed from: v */
    public boolean f18150v;

    /* JADX INFO: renamed from: w */
    public String f18151w;

    /* JADX INFO: renamed from: x */
    public long f18152x;

    /* JADX INFO: renamed from: y */
    public long f18153y;

    /* JADX INFO: renamed from: z */
    public Executor f18154z;

    /* JADX INFO: renamed from: org.xutils.http.RequestParams$1 */
    public class C51271 implements RequestParamsHelper.ParseKVListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RequestParams f18155a;

        /* JADX WARN: Invalid debug info offset */
        public C51271(RequestParams requestParams) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xutils.http.RequestParamsHelper.ParseKVListener
        /* JADX INFO: renamed from: a */
        public void mo27086a(String str, Object obj) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public RequestParams() {
    }

    /* JADX WARN: Invalid debug info offset */
    public RequestParams(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RequestParams(String str, ParamsBuilder paramsBuilder, String[] strArr, String[] strArr2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public String m27038D() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public String m27039E() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F */
    public long m27040F() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public long m27041G() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public int m27042H() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public Context m27043I() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public Executor m27044J() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public HostnameVerifier m27045K() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L */
    public final HttpRequest m27046L() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public HttpRetryHandler m27047M() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N */
    public int m27048N() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O */
    public int m27049O() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public Priority m27050P() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q */
    public Proxy m27051Q() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public int m27052R() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public RedirectHandler m27053S() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T */
    public RequestTracker m27054T() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U */
    public String m27055U() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V */
    public SSLSocketFactory m27056V() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W */
    public String m27057W() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X */
    public void m27058X() throws Throwable {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y */
    public final void m27059Y() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z */
    public boolean m27060Z() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a0 */
    public boolean m27061a0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b0 */
    public boolean m27062b0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c0 */
    public boolean m27063c0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d0 */
    public void m27064d0(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e0 */
    public void m27065e0(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f0 */
    public void m27066f0(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g0 */
    public void m27067g0(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h0 */
    public void m27068h0(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i0 */
    public void m27069i0(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j0 */
    public void m27070j0(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k0 */
    public void m27071k0(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l0 */
    public void m27072l0(Executor executor) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m0 */
    public void m27073m0(HostnameVerifier hostnameVerifier) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n0 */
    public void m27074n0(HttpRetryHandler httpRetryHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o0 */
    public void m27075o0(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p0 */
    public void m27076p0(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q0 */
    public void m27077q0(Priority priority) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r0 */
    public void m27078r0(Proxy proxy) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s0 */
    public void m27079s0(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t0 */
    public void m27080t0(RedirectHandler redirectHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.BaseParams
    public String toString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u0 */
    public void m27081u0(RequestTracker requestTracker) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v0 */
    public void m27082v0(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w0 */
    public void m27083w0(SSLSocketFactory sSLSocketFactory) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x0 */
    public void m27084x0(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y0 */
    public void m27085y0(boolean z) {
    }
}
