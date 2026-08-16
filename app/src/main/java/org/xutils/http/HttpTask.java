package org.xutils.http;

import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.xutils.common.Callback;
import org.xutils.common.task.AbsTask;
import org.xutils.common.task.Priority;
import org.xutils.common.task.PriorityExecutor;
import org.xutils.http.app.RequestInterceptListener;
import org.xutils.http.app.RequestTracker;
import org.xutils.http.request.UriRequest;

/* JADX INFO: loaded from: classes.dex */
public class HttpTask<ResultType> extends AbsTask<ResultType> implements ProgressHandler {

    /* JADX INFO: renamed from: A */
    public static final int f18095A = 2;

    /* JADX INFO: renamed from: B */
    public static final int f18096B = 3;

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ boolean f18097C = false;

    /* JADX INFO: renamed from: v */
    public static final AtomicInteger f18098v = new AtomicInteger(0);

    /* JADX INFO: renamed from: w */
    public static final HashMap<String, WeakReference<HttpTask<?>>> f18099w = new HashMap<>(1);

    /* JADX INFO: renamed from: x */
    public static final PriorityExecutor f18100x = new PriorityExecutor(5, true);

    /* JADX INFO: renamed from: y */
    public static final PriorityExecutor f18101y = new PriorityExecutor(5, true);

    /* JADX INFO: renamed from: z */
    public static final int f18102z = 1;

    /* JADX INFO: renamed from: f */
    public RequestParams f18103f;

    /* JADX INFO: renamed from: g */
    public UriRequest f18104g;

    /* JADX INFO: renamed from: h */
    public Type f18105h;

    /* JADX INFO: renamed from: i */
    public volatile boolean f18106i;

    /* JADX INFO: renamed from: j */
    public final Callback.CommonCallback<ResultType> f18107j;

    /* JADX INFO: renamed from: k */
    public Object f18108k;

    /* JADX INFO: renamed from: l */
    public volatile Boolean f18109l;

    /* JADX INFO: renamed from: m */
    public final Object f18110m;

    /* JADX INFO: renamed from: n */
    public Callback.CacheCallback<ResultType> f18111n;

    /* JADX INFO: renamed from: o */
    public Callback.PrepareCallback f18112o;

    /* JADX INFO: renamed from: p */
    public Callback.ProgressCallback f18113p;

    /* JADX INFO: renamed from: q */
    public RequestInterceptListener f18114q;

    /* JADX INFO: renamed from: r */
    public RequestTracker f18115r;

    /* JADX INFO: renamed from: s */
    public final Executor f18116s;

    /* JADX INFO: renamed from: t */
    public long f18117t;

    /* JADX INFO: renamed from: u */
    public long f18118u;

    /* JADX INFO: renamed from: org.xutils.http.HttpTask$1 */
    public class RunnableC51251 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HttpTask f18119a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC51251(HttpTask httpTask) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: org.xutils.http.HttpTask$2 */
    public class RunnableC51262 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HttpTask f18120a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC51262(HttpTask httpTask) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public final class RequestWorker {

        /* JADX INFO: renamed from: a */
        public Object f18121a;

        /* JADX INFO: renamed from: b */
        public Throwable f18122b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ HttpTask f18123c;

        /* JADX WARN: Invalid debug info offset */
        public RequestWorker(HttpTask httpTask) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ RequestWorker(HttpTask httpTask, RunnableC51251 runnableC51251) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000e
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public void m27037a() {
            /*
                Method dump skipped, instruction units count: 288
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.xutils.http.HttpTask.RequestWorker.m27037a():void");
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public HttpTask(RequestParams requestParams, Callback.Cancelable cancelable, Callback.CommonCallback<ResultType> commonCallback) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ RequestParams m27022A(HttpTask httpTask) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public static /* synthetic */ RequestParams m27023B(HttpTask httpTask, RequestParams requestParams) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public static /* synthetic */ UriRequest m27024C(HttpTask httpTask) throws Throwable {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m27025u(HttpTask httpTask) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public static /* synthetic */ Type m27026v(HttpTask httpTask) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public static /* synthetic */ AtomicInteger m27027w() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public static /* synthetic */ RequestInterceptListener m27028x(HttpTask httpTask) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public static /* synthetic */ UriRequest m27029y(HttpTask httpTask) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public static /* synthetic */ UriRequest m27030z(HttpTask httpTask, UriRequest uriRequest) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: D */
    public final void m27031D() {
        /*
            r3 = this;
            return
        L2c:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.http.HttpTask.m27031D():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public final void m27032E() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: F */
    public final void m27033F() {
        /*
            r2 = this;
            return
        Le:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.http.HttpTask.m27033F():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public final UriRequest m27034G() throws Throwable {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public final void m27035H() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.ProgressHandler
    /* JADX INFO: renamed from: a */
    public boolean mo27036a(long j, long j2, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.task.AbsTask
    /* JADX INFO: renamed from: b */
    public void mo26738b() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0043
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.xutils.common.task.AbsTask
    /* JADX INFO: renamed from: c */
    public ResultType mo26739c() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.http.HttpTask.mo26739c():java.lang.Object");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.task.AbsTask
    /* JADX INFO: renamed from: d */
    public Executor mo26740d() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.task.AbsTask
    /* JADX INFO: renamed from: e */
    public Priority mo26741e() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.task.AbsTask
    /* JADX INFO: renamed from: h */
    public boolean mo26744h() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.task.AbsTask
    /* JADX INFO: renamed from: j */
    public void mo26746j(Callback.CancelledException cancelledException) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.task.AbsTask
    /* JADX INFO: renamed from: k */
    public void mo26747k(Throwable th, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.task.AbsTask
    /* JADX INFO: renamed from: l */
    public void mo26748l() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.task.AbsTask
    /* JADX INFO: renamed from: m */
    public void mo26749m() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.task.AbsTask
    /* JADX INFO: renamed from: n */
    public void mo26750n(ResultType resulttype) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0013
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.xutils.common.task.AbsTask
    /* JADX INFO: renamed from: o */
    public void mo26751o(int r11, java.lang.Object... r12) {
        /*
            r10 = this;
            return
        L2f:
        L45:
        L59:
        L69:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.http.HttpTask.mo26751o(int, java.lang.Object[]):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.task.AbsTask
    /* JADX INFO: renamed from: p */
    public void mo26752p() {
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
