package org.xutils.common;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public interface Callback {

    public interface CacheCallback<ResultType> extends CommonCallback<ResultType> {
        /* JADX INFO: renamed from: k */
        boolean mo26723k(ResultType resulttype);
    }

    public interface Callable<ResultType> {
        /* JADX INFO: renamed from: a */
        void m26724a(ResultType resulttype);
    }

    public interface Cancelable {
        void cancel();

        boolean isCancelled();
    }

    public static class CancelledException extends RuntimeException {
        /* JADX WARN: Invalid debug info offset */
        public CancelledException(String str) {
        }
    }

    public interface CommonCallback<ResultType> extends Callback {
        /* JADX INFO: renamed from: a */
        void mo16802a(CancelledException cancelledException);

        /* JADX INFO: renamed from: f */
        void mo16804f(Throwable th, boolean z);

        void onFinished();

        void onSuccess(ResultType resulttype);
    }

    public interface GroupCallback<ItemType> extends Callback {
        /* JADX INFO: renamed from: c */
        void m26725c();

        /* JADX INFO: renamed from: d */
        void m26726d(ItemType itemtype);

        /* JADX INFO: renamed from: g */
        void m26727g(ItemType itemtype, CancelledException cancelledException);

        /* JADX INFO: renamed from: l */
        void m26728l(ItemType itemtype, Throwable th, boolean z);

        void onSuccess(ItemType itemtype);
    }

    public interface PrepareCallback<PrepareType, ResultType> extends CommonCallback<ResultType> {
        /* JADX INFO: renamed from: i */
        ResultType mo26729i(PrepareType preparetype) throws Throwable;
    }

    public interface ProgressCallback<ResultType> extends CommonCallback<ResultType> {
        /* JADX INFO: renamed from: e */
        void mo16803e();

        /* JADX INFO: renamed from: h */
        void mo16805h();

        /* JADX INFO: renamed from: j */
        void mo16806j(long j, long j2, boolean z);
    }

    public interface ProxyCacheCallback<ResultType> extends CacheCallback<ResultType> {
        /* JADX INFO: renamed from: m */
        boolean m26730m();
    }

    public interface TypedCallback<ResultType> extends CommonCallback<ResultType> {
        /* JADX INFO: renamed from: b */
        Type mo26731b();
    }
}
