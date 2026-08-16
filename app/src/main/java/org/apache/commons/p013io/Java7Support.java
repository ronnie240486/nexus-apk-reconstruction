package org.apache.commons.p013io;

import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
class Java7Support {

    /* JADX INFO: renamed from: a */
    public static final boolean f15653a;

    /* JADX INFO: renamed from: b */
    public static Method f15654b;

    /* JADX INFO: renamed from: c */
    public static Method f15655c;

    /* JADX INFO: renamed from: d */
    public static Method f15656d;

    /* JADX INFO: renamed from: e */
    public static Method f15657e;

    /* JADX INFO: renamed from: f */
    public static Method f15658f;

    /* JADX INFO: renamed from: g */
    public static Method f15659g;

    /* JADX INFO: renamed from: h */
    public static Method f15660h;

    /* JADX INFO: renamed from: i */
    public static Object f15661i;

    /* JADX INFO: renamed from: j */
    public static Object f15662j;

    static {
        boolean z = true;
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            Class<?> clsLoadClass = contextClassLoader.loadClass("java.nio.file.Files");
            Class<?> clsLoadClass2 = contextClassLoader.loadClass("java.nio.file.Path");
            Class<?> clsLoadClass3 = contextClassLoader.loadClass("java.nio.file.attribute.FileAttribute");
            Class<?> clsLoadClass4 = contextClassLoader.loadClass("java.nio.file.LinkOption");
            f15654b = clsLoadClass.getMethod("isSymbolicLink", clsLoadClass2);
            f15655c = clsLoadClass.getMethod("delete", clsLoadClass2);
            f15659g = clsLoadClass.getMethod("readSymbolicLink", clsLoadClass2);
            Object objNewInstance = Array.newInstance(clsLoadClass3, 0);
            f15662j = objNewInstance;
            f15660h = clsLoadClass.getMethod("createSymbolicLink", clsLoadClass2, clsLoadClass2, objNewInstance.getClass());
            Object objNewInstance2 = Array.newInstance(clsLoadClass4, 0);
            f15661i = objNewInstance2;
            f15657e = clsLoadClass.getMethod("exists", clsLoadClass2, objNewInstance2.getClass());
            f15656d = File.class.getMethod("toPath", null);
            f15658f = clsLoadClass2.getMethod("toFile", null);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            z = false;
        }
        f15653a = z;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x0032
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    /* JADX INFO: renamed from: a */
    public static java.io.File m23173a(java.io.File r4, java.io.File r5) throws java.io.IOException {
        /*
            r0 = 0
            return r0
        L30:
        L32:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.Java7Support.m23173a(java.io.File, java.io.File):java.io.File");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:4:0x0015
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    /* JADX INFO: renamed from: b */
    public static void m23174b(java.io.File r4) throws java.io.IOException {
        /*
            return
        L13:
        L15:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.Java7Support.m23174b(java.io.File):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x0021
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    /* JADX INFO: renamed from: c */
    public static boolean m23175c(java.io.File r4) throws java.io.IOException {
        /*
            r0 = 0
            return r0
        L1f:
        L21:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.Java7Support.m23175c(java.io.File):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static boolean m23176d() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x001c
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    /* JADX INFO: renamed from: e */
    public static boolean m23177e(java.io.File r4) {
        /*
            r0 = 0
            return r0
        L1a:
        L1c:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.Java7Support.m23177e(java.io.File):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x001e
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    /* JADX INFO: renamed from: f */
    public static java.io.File m23178f(java.io.File r4) throws java.io.IOException {
        /*
            r0 = 0
            return r0
        L1c:
        L1e:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.Java7Support.m23178f(java.io.File):java.io.File");
    }
}
