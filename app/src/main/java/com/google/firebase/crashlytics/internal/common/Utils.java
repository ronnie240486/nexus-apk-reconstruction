package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class Utils {
    private static final ExecutorService TASK_CONTINUATION_EXECUTOR_SERVICE = ExecutorUtils.buildSingleThreadExecutorService("awaitEvenIfOnMainThread task continuation executor");

    private Utils() {
    }

    public static <T> T awaitEvenIfOnMainThread(Task<T> task) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(TASK_CONTINUATION_EXECUTOR_SERVICE, new Continuation(countDownLatch) { // from class: d00

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ CountDownLatch f13531a;

            /* JADX WARN: Invalid debug info offset */
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return null;
            }
        });
        countDownLatch.await(4L, TimeUnit.SECONDS);
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        }
        throw new TimeoutException();
    }

    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j, TimeUnit timeUnit) {
        boolean zAwait;
        boolean z = false;
        try {
            long nanos = timeUnit.toNanos(j);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    zAwait = countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            return zAwait;
        } catch (Throwable th) {
            if (z) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    public static <T> Task<T> callTask(Executor executor, final Callable<Task<T>> callable) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.Utils.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ((Task) callable.call()).continueWith(new Continuation<T, Void>() { // from class: com.google.firebase.crashlytics.internal.common.Utils.1.1
                        @Override // com.google.android.gms.tasks.Continuation
                        public Void then(@NonNull Task<T> task) throws Exception {
                            if (task.isSuccessful()) {
                                taskCompletionSource.setResult(task.getResult());
                                return null;
                            }
                            taskCompletionSource.setException(task.getException());
                            return null;
                        }
                    });
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$awaitEvenIfOnMainThread$2(CountDownLatch countDownLatch, Task task) throws Exception {
        countDownLatch.countDown();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$race$0(TaskCompletionSource taskCompletionSource, Task task) throws Exception {
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        Exception exception = task.getException();
        Objects.requireNonNull(exception);
        taskCompletionSource.trySetException(exception);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void lambda$race$1(TaskCompletionSource taskCompletionSource, Task task) throws Exception {
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        Exception exception = task.getException();
        Objects.requireNonNull(exception);
        taskCompletionSource.trySetException(exception);
        return null;
    }

    public static <T> Task<T> race(Task<T> task, Task<T> task2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Continuation<T, TContinuationResult> continuation = new Continuation(taskCompletionSource) { // from class: c00

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ TaskCompletionSource f10238a;

            /* JADX WARN: Invalid debug info offset */
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                return null;
            }
        };
        task.continueWith(continuation);
        task2.continueWith(continuation);
        return taskCompletionSource.getTask();
    }

    public static <T> Task<T> race(Executor executor, Task<T> task, Task<T> task2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Continuation<T, TContinuationResult> continuation = new Continuation(taskCompletionSource) { // from class: e00

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ TaskCompletionSource f13689a;

            /* JADX WARN: Invalid debug info offset */
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                return null;
            }
        };
        task.continueWith(executor, continuation);
        task2.continueWith(executor, continuation);
        return taskCompletionSource.getTask();
    }
}
