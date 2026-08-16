package org.slf4j.helpers;

/* JADX INFO: loaded from: classes.dex */
public final class Util {

    /* JADX INFO: renamed from: a */
    public static ClassContextSecurityManager f17231a;

    /* JADX INFO: renamed from: b */
    public static boolean f17232b;

    public static final class ClassContextSecurityManager extends SecurityManager {
        /* JADX WARN: Invalid debug info offset */
        private ClassContextSecurityManager() {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ ClassContextSecurityManager(C50821 c50821) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.SecurityManager
        public Class<?>[] getClassContext() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    private Util() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static Class<?> m25125a() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static ClassContextSecurityManager m25126b() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static final void m25127c(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static final void m25128d(String str, Throwable th) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static ClassContextSecurityManager m25129e() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static boolean m25130f(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: g */
    public static java.lang.String m25131g(java.lang.String r1) {
        /*
            r0 = 0
            return r0
        L7:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.slf4j.helpers.Util.m25131g(java.lang.String):java.lang.String");
    }
}
