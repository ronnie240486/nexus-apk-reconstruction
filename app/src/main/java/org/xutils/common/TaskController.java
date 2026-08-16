package org.xutils.common;

import org.xutils.common.task.AbsTask;

/* JADX INFO: loaded from: classes.dex */
public interface TaskController {
    /* JADX INFO: renamed from: a */
    void mo26732a(Runnable runnable);

    /* JADX INFO: renamed from: b */
    <T extends AbsTask<?>> Callback.Cancelable mo26733b(Callback.GroupCallback<T> groupCallback, T... tArr);

    /* JADX INFO: renamed from: c */
    void mo26734c(Runnable runnable);

    /* JADX INFO: renamed from: d */
    void mo26735d(Runnable runnable);

    /* JADX INFO: renamed from: e */
    <T> T mo26736e(AbsTask<T> absTask) throws Throwable;

    /* JADX INFO: renamed from: f */
    <T> AbsTask<T> mo26737f(AbsTask<T> absTask);

    void post(Runnable runnable);

    void postDelayed(Runnable runnable, long j);
}
