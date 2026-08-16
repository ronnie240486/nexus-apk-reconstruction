package org.xutils.view;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import org.xutils.common.util.DoubleKeyValueMap;

/* JADX INFO: loaded from: classes.dex */
final class EventListenerManager {

    /* JADX INFO: renamed from: a */
    public static final long f18339a = 300;

    /* JADX INFO: renamed from: b */
    public static final HashSet<String> f18340b;

    /* JADX INFO: renamed from: c */
    public static final DoubleKeyValueMap<ViewInfo, Class<?>, Object> f18341c;

    public static class DynamicHandler implements InvocationHandler {

        /* JADX INFO: renamed from: c */
        public static long f18342c;

        /* JADX INFO: renamed from: a */
        public WeakReference<Object> f18343a;

        /* JADX INFO: renamed from: b */
        public final HashMap<String, Method> f18344b;

        /* JADX WARN: Invalid debug info offset */
        public DynamicHandler(Object obj) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public void m27306a(String str, Method method) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public Object m27307b() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x008e
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object r7, java.lang.reflect.Method r8, java.lang.Object[] r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 220
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.xutils.view.EventListenerManager.DynamicHandler.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>(2);
        f18340b = hashSet;
        hashSet.add("onClick");
        hashSet.add("onItemClick");
        f18341c = new DoubleKeyValueMap<>();
    }

    /* JADX WARN: Invalid debug info offset */
    private EventListenerManager() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ HashSet m27304a() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    public static void m27305b(org.xutils.view.ViewFinder r8, org.xutils.view.ViewInfo r9, org.xutils.view.annotation.Event r10, java.lang.Object r11, java.lang.reflect.Method r12) {
        /*
            return
        L21:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.view.EventListenerManager.m27305b(org.xutils.view.ViewFinder, org.xutils.view.ViewInfo, org.xutils.view.annotation.Event, java.lang.Object, java.lang.reflect.Method):void");
    }
}
