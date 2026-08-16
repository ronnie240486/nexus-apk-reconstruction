package com.snapchat.djinni;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import p000.C0152CD;

/* JADX INFO: loaded from: classes2.dex */
public class NativeObjectManager {
    private final ReferenceQueue<Object> mReferenceQueue;
    private final ConcurrentHashMap<NativeObjectWrapper, Boolean> mReferences;
    private final Thread mThread;

    /* JADX INFO: renamed from: com.snapchat.djinni.NativeObjectManager$1 */
    public class C40341 extends Thread {
        final /* synthetic */ NativeObjectManager this$0;

        /* JADX WARN: Invalid debug info offset */
        public C40341(NativeObjectManager nativeObjectManager, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0020
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            /*
                r4 = this;
                return
            L24:
            L40:
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snapchat.djinni.NativeObjectManager.C40341.run():void");
        }
    }

    public static class Holder {
        static final NativeObjectManager instance = new NativeObjectManager(null);

        /* JADX WARN: Invalid debug info offset */
        private Holder() {
        }
    }

    public static class NativeObjectWrapper extends PhantomReference<Object> {
        private final Method mDestroyMethod;
        private final long mNativeRef;

        /* JADX WARN: Invalid debug info offset */
        public NativeObjectWrapper(Object obj, Class<?> cls, long j, ReferenceQueue<? super Object> referenceQueue) throws NoSuchMethodException {
        }

        /* JADX WARN: Invalid debug info offset */
        public void cleanup() throws Exception {
        }

        /* JADX WARN: Invalid debug info offset */
        public String getClassName() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    private NativeObjectManager() {
    }

    /* JADX WARN: Invalid debug info offset */
    public /* synthetic */ NativeObjectManager(C0152CD c0152cd) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ ReferenceQueue m18567a(NativeObjectManager nativeObjectManager) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ ConcurrentHashMap m18568b(NativeObjectManager nativeObjectManager) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static void register(Object obj, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void register(Object obj, Class<?> cls, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void stop() {
    }
}
