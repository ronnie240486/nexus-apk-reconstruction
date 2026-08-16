package org.xutils.common.task;

import android.os.Handler;
import java.util.concurrent.Executor;
import org.xutils.common.Callback;

/* JADX INFO: loaded from: classes.dex */
class TaskProxy<ResultType> extends AbsTask<ResultType> {

    /* JADX INFO: renamed from: j */
    public static final InternalHandler f17991j = new InternalHandler(null);

    /* JADX INFO: renamed from: k */
    public static final PriorityExecutor f17992k = new PriorityExecutor(5, true);

    /* JADX INFO: renamed from: l */
    public static final int f17993l = 1000000000;

    /* JADX INFO: renamed from: m */
    public static final int f17994m = 1000000001;

    /* JADX INFO: renamed from: n */
    public static final int f17995n = 1000000002;

    /* JADX INFO: renamed from: o */
    public static final int f17996o = 1000000003;

    /* JADX INFO: renamed from: p */
    public static final int f17997p = 1000000004;

    /* JADX INFO: renamed from: q */
    public static final int f17998q = 1000000005;

    /* JADX INFO: renamed from: r */
    public static final int f17999r = 1000000006;

    /* JADX INFO: renamed from: s */
    public static final int f18000s = 1000000007;

    /* JADX INFO: renamed from: f */
    public final AbsTask<ResultType> f18001f;

    /* JADX INFO: renamed from: g */
    public final Executor f18002g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f18003h;

    /* JADX INFO: renamed from: i */
    public volatile boolean f18004i;

    /* JADX INFO: renamed from: org.xutils.common.task.TaskProxy$1 */
    public class RunnableC51191 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TaskProxy f18005a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC51191(TaskProxy taskProxy) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x0048
            	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
            */
        @Override // java.lang.Runnable
        public void run() {
            /*
                r3 = this;
                return
            L46:
            L48:
            L63:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.xutils.common.task.TaskProxy.RunnableC51191.run():void");
        }
    }

    public static class ArgsObj {

        /* JADX INFO: renamed from: a */
        public final TaskProxy f18006a;

        /* JADX INFO: renamed from: b */
        public final Object[] f18007b;

        /* JADX WARN: Invalid debug info offset */
        public ArgsObj(TaskProxy taskProxy, Object... objArr) {
        }
    }

    public static final class InternalHandler extends Handler {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ boolean f18008a = false;

        /* JADX WARN: Invalid debug info offset */
        private InternalHandler() {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ InternalHandler(RunnableC51191 runnableC51191) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x001e
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // android.os.Handler
        public void handleMessage(android.os.Message r7) {
            /*
                r6 = this;
                return
            L35:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.xutils.common.task.TaskProxy.InternalHandler.handleMessage(android.os.Message):void");
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public TaskProxy(AbsTask<ResultType> absTask) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public static /* synthetic */ boolean m26764u(TaskProxy taskProxy) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public static /* synthetic */ boolean m26765v(TaskProxy taskProxy, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public static /* synthetic */ AbsTask m26766w(TaskProxy taskProxy) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public static /* synthetic */ boolean m26767x(TaskProxy taskProxy) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public static /* synthetic */ boolean m26768y(TaskProxy taskProxy, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.task.AbsTask
    /* JADX INFO: renamed from: c */
    public final ResultType mo26739c() throws Throwable {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.task.AbsTask
    /* JADX INFO: renamed from: d */
    public final Executor mo26740d() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.task.AbsTask
    /* JADX INFO: renamed from: e */
    public final Priority mo26741e() {
        return null;
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
    @Override // org.xutils.common.task.AbsTask
    /* JADX INFO: renamed from: o */
    public void mo26751o(int i, Object... objArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.task.AbsTask
    /* JADX INFO: renamed from: p */
    public void mo26752p() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.task.AbsTask
    /* JADX INFO: renamed from: r */
    public final void mo26754r(AbsTask.State state) {
    }
}
