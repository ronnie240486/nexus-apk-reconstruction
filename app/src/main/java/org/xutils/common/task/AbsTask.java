package org.xutils.common.task;

import java.util.concurrent.Executor;
import org.xutils.common.Callback;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbsTask<ResultType> implements Callback.Cancelable {

    /* JADX INFO: renamed from: a */
    public TaskProxy f17955a;

    /* JADX INFO: renamed from: b */
    public final Callback.Cancelable f17956b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f17957c;

    /* JADX INFO: renamed from: d */
    public volatile State f17958d;

    /* JADX INFO: renamed from: e */
    public ResultType f17959e;

    public enum State {
        IDLE(0),
        WAITING(1),
        STARTED(2),
        SUCCESS(3),
        CANCELLED(4),
        ERROR(5);

        private final int value;

        State(int i) {
            this.value = i;
        }

        public int value() {
            return this.value;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public AbsTask() {
    }

    /* JADX WARN: Invalid debug info offset */
    public AbsTask(Callback.Cancelable cancelable) {
    }

    /* JADX INFO: renamed from: b */
    public void mo26738b() {
    }

    /* JADX INFO: renamed from: c */
    public abstract ResultType mo26739c() throws Throwable;

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.xutils.common.Callback.Cancelable
    public final void cancel() {
        /*
            r3 = this;
            return
        Lc:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.common.task.AbsTask.cancel():void");
    }

    /* JADX INFO: renamed from: d */
    public Executor mo26740d() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public Priority mo26741e() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public final ResultType m26742f() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public final State m26743g() {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public boolean mo26744h() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public final boolean m26745i() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.Callback.Cancelable
    public final boolean isCancelled() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public void mo26746j(Callback.CancelledException cancelledException) {
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo26747k(Throwable th, boolean z);

    /* JADX INFO: renamed from: l */
    public void mo26748l() {
    }

    /* JADX INFO: renamed from: m */
    public void mo26749m() {
    }

    /* JADX INFO: renamed from: n */
    public abstract void mo26750n(ResultType resulttype);

    /* JADX INFO: renamed from: o */
    public void mo26751o(int i, Object... objArr) {
    }

    /* JADX INFO: renamed from: p */
    public void mo26752p() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public final void m26753q(ResultType resulttype) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public void mo26754r(State state) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public final void m26755s(TaskProxy taskProxy) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public final void m26756t(int i, Object... objArr) {
    }
}
