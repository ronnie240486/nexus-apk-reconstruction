package org.xutils.view;

import android.app.Activity;
import android.app.Fragment;
import android.view.View;
import java.util.HashSet;
import org.xutils.ViewInjector;
import org.xutils.view.annotation.ContentView;

/* JADX INFO: loaded from: classes.dex */
public final class ViewInjectorImpl implements ViewInjector {

    /* JADX INFO: renamed from: a */
    public static final HashSet<Class<?>> f18349a;

    /* JADX INFO: renamed from: b */
    public static final Object f18350b;

    /* JADX INFO: renamed from: c */
    public static volatile ViewInjectorImpl f18351c;

    static {
        HashSet<Class<?>> hashSet = new HashSet<>();
        f18349a = hashSet;
        hashSet.add(Object.class);
        hashSet.add(Activity.class);
        hashSet.add(Fragment.class);
        try {
            hashSet.add(Class.forName("androidx.fragment.app.Fragment"));
            hashSet.add(Class.forName("androidx.fragment.app.FragmentActivity"));
        } catch (Throwable unused) {
        }
        f18350b = new Object();
    }

    /* JADX WARN: Invalid debug info offset */
    private ViewInjectorImpl() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static ContentView m27311e(Class<?> cls) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x005f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: f */
    public static void m27312f(java.lang.Object r12, java.lang.Class<?> r13, org.xutils.view.ViewFinder r14) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.view.ViewInjectorImpl.m27312f(java.lang.Object, java.lang.Class, org.xutils.view.ViewFinder):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: g */
    public static void m27313g() {
        /*
            return
        L13:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.view.ViewInjectorImpl.m27313g():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.xutils.ViewInjector
    /* JADX INFO: renamed from: a */
    public android.view.View mo26658a(java.lang.Object r5, android.view.LayoutInflater r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            r0 = 0
            return r0
        L17:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.view.ViewInjectorImpl.mo26658a(java.lang.Object, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.ViewInjector
    /* JADX INFO: renamed from: b */
    public void mo26659b(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.xutils.ViewInjector
    /* JADX INFO: renamed from: c */
    public void mo26660c(android.app.Activity r4) {
        /*
            r3 = this;
            return
        L14:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.view.ViewInjectorImpl.mo26660c(android.app.Activity):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.ViewInjector
    /* JADX INFO: renamed from: d */
    public void mo26661d(Object obj, View view) {
    }
}
