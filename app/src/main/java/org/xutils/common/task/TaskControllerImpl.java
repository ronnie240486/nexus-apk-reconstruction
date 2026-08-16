package org.xutils.common.task;

import java.util.concurrent.atomic.AtomicInteger;
import org.xutils.common.Callback;
import org.xutils.common.TaskController;

/* JADX INFO: loaded from: classes.dex */
public final class TaskControllerImpl implements TaskController {

    /* JADX INFO: renamed from: a */
    public static volatile TaskController f17972a;

    /* JADX INFO: renamed from: org.xutils.common.task.TaskControllerImpl$1 */
    public class RunnableC51161 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final int f17973a;

        /* JADX INFO: renamed from: b */
        public final AtomicInteger f17974b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbsTask[] f17975c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Callback.GroupCallback f17976d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ TaskControllerImpl f17977e;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC51161(TaskControllerImpl taskControllerImpl, AbsTask[] absTaskArr, Callback.GroupCallback groupCallback) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000e
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.lang.Runnable
        public void run() {
            /*
                r4 = this;
                return
            L12:
            L1b:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.xutils.common.task.TaskControllerImpl.RunnableC51161.run():void");
        }
    }

    /* JADX INFO: renamed from: org.xutils.common.task.TaskControllerImpl$2 */
    public class C51172 extends TaskProxy {

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ Callback.GroupCallback f17978t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ AbsTask f17979u;

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ Runnable f17980v;

        /* JADX INFO: renamed from: w */
        public final /* synthetic */ TaskControllerImpl f17981w;

        /* JADX INFO: renamed from: org.xutils.common.task.TaskControllerImpl$2$1, reason: invalid class name */
        public class AnonymousClass1 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C51172 f17982a;

            /* JADX WARN: Invalid debug info offset */
            public AnonymousClass1(C51172 c51172) {
            }

            /* JADX WARN: Invalid debug info offset */
            /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
                jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0006
                	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
                	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
                */
            @Override // java.lang.Runnable
            public void run() {
                /*
                    r4 = this;
                    return
                Lc:
                L18:
                */
                throw new UnsupportedOperationException("Method not decompiled: org.xutils.common.task.TaskControllerImpl.C51172.AnonymousClass1.run():void");
            }
        }

        /* JADX INFO: renamed from: org.xutils.common.task.TaskControllerImpl$2$2, reason: invalid class name */
        public class AnonymousClass2 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Callback.CancelledException f17983a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C51172 f17984b;

            /* JADX WARN: Invalid debug info offset */
            public AnonymousClass2(C51172 c51172, Callback.CancelledException cancelledException) {
            }

            /* JADX WARN: Invalid debug info offset */
            /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
                jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0006
                	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
                	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
                */
            @Override // java.lang.Runnable
            public void run() {
                /*
                    r4 = this;
                    return
                Le:
                L1a:
                */
                throw new UnsupportedOperationException("Method not decompiled: org.xutils.common.task.TaskControllerImpl.C51172.AnonymousClass2.run():void");
            }
        }

        /* JADX INFO: renamed from: org.xutils.common.task.TaskControllerImpl$2$3, reason: invalid class name */
        public class AnonymousClass3 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Throwable f17985a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ boolean f17986b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ C51172 f17987c;

            /* JADX WARN: Invalid debug info offset */
            public AnonymousClass3(C51172 c51172, Throwable th, boolean z) {
            }

            /* JADX WARN: Invalid debug info offset */
            /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
                jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0006
                	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
                	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
                */
            @Override // java.lang.Runnable
            public void run() {
                /*
                    r4 = this;
                    return
                L10:
                */
                throw new UnsupportedOperationException("Method not decompiled: org.xutils.common.task.TaskControllerImpl.C51172.AnonymousClass3.run():void");
            }
        }

        /* JADX INFO: renamed from: org.xutils.common.task.TaskControllerImpl$2$4, reason: invalid class name */
        public class AnonymousClass4 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C51172 f17988a;

            /* JADX WARN: Invalid debug info offset */
            public AnonymousClass4(C51172 c51172) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public C51172(TaskControllerImpl taskControllerImpl, AbsTask absTask, Callback.GroupCallback groupCallback, AbsTask absTask2, Runnable runnable) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xutils.common.task.TaskProxy, org.xutils.common.task.AbsTask
        /* JADX INFO: renamed from: j */
        public void mo26746j(Callback.CancelledException cancelledException) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xutils.common.task.TaskProxy, org.xutils.common.task.AbsTask
        /* JADX INFO: renamed from: k */
        public void mo26747k(Throwable th, boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xutils.common.task.TaskProxy, org.xutils.common.task.AbsTask
        /* JADX INFO: renamed from: l */
        public void mo26748l() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xutils.common.task.TaskProxy, org.xutils.common.task.AbsTask
        /* JADX INFO: renamed from: n */
        public void mo26750n(Object obj) {
        }
    }

    /* JADX INFO: renamed from: org.xutils.common.task.TaskControllerImpl$3 */
    public class C51183 implements Callback.Cancelable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbsTask[] f17989a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TaskControllerImpl f17990b;

        /* JADX WARN: Invalid debug info offset */
        public C51183(TaskControllerImpl taskControllerImpl, AbsTask[] absTaskArr) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xutils.common.Callback.Cancelable
        public void cancel() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xutils.common.Callback.Cancelable
        public boolean isCancelled() {
            return false;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    private TaskControllerImpl() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: g */
    public static void m26763g() {
        /*
            return
        L13:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.common.task.TaskControllerImpl.m26763g():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.TaskController
    /* JADX INFO: renamed from: a */
    public void mo26732a(Runnable runnable) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.TaskController
    /* JADX INFO: renamed from: b */
    public <T extends AbsTask<?>> Callback.Cancelable mo26733b(Callback.GroupCallback<T> groupCallback, T... tArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.TaskController
    /* JADX INFO: renamed from: c */
    public void mo26734c(Runnable runnable) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.TaskController
    /* JADX INFO: renamed from: d */
    public void mo26735d(Runnable runnable) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x0014
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @Override // org.xutils.common.TaskController
    /* JADX INFO: renamed from: e */
    public <T> T mo26736e(org.xutils.common.task.AbsTask<T> r3) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            return r0
        L12:
        L14:
        L1b:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.common.task.TaskControllerImpl.mo26736e(org.xutils.common.task.AbsTask):java.lang.Object");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.xutils.common.TaskController
    /* JADX INFO: renamed from: f */
    public <T> org.xutils.common.task.AbsTask<T> mo26737f(org.xutils.common.task.AbsTask<T> r3) {
        /*
            r2 = this;
            r0 = 0
            return r0
        L11:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.common.task.TaskControllerImpl.mo26737f(org.xutils.common.task.AbsTask):org.xutils.common.task.AbsTask");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.TaskController
    public void post(Runnable runnable) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.TaskController
    public void postDelayed(Runnable runnable, long j) {
    }
}
