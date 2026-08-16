package com.tencent.smtt.export.external;

import android.content.Context;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class DexLoader {
    private static final String TAG = "DexLoader";
    private static final String TBS_FUSION_DEX = "tbs_jars_fusion_dex";
    private static final String TBS_WEBVIEW_DEX = "webview_dex";
    private static final String TENCENT_PACKAGE_PREFIX = "com.tencent";
    static boolean mCanUseDexLoaderProviderService = true;
    private static boolean mUseSpeedyClassLoader;
    private static boolean mUseTbsCorePrivateClassLoader;
    private DexClassLoader mClassLoader;
    private static final String CHROMIUM_PREFIX = "org.chromium";
    private static final String ANDROIDX_PREFIX = "androidx";
    private static final String TAF_PREFIX = "com.taf";
    private static final String CHROMIUM_J_N = "J.N";
    private static String[] mPrivatePrefix = {CHROMIUM_PREFIX, ANDROIDX_PREFIX, TAF_PREFIX, CHROMIUM_J_N};

    public static class TbsCorePrivateClassLoader extends DexClassLoader {
        /* JADX WARN: Invalid debug info offset */
        public TbsCorePrivateClassLoader(String str, String str2, String str3, ClassLoader classLoader) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0018
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.lang.ClassLoader
        public java.lang.Class<?> loadClass(java.lang.String r5, boolean r6) throws java.lang.ClassNotFoundException {
            /*
                r4 = this;
                r0 = 0
                return r0
            L1d:
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.export.external.DexLoader.TbsCorePrivateClassLoader.loadClass(java.lang.String, boolean):java.lang.Class");
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public DexLoader(Context context, String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DexLoader(Context context, String[] strArr, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DexLoader(Context context, String[] strArr, String str, DexLoader dexLoader) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DexLoader(Context context, String[] strArr, String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DexLoader(String str, Context context, String[] strArr, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DexLoader(String str, Context context, String[] strArr, String str2, Map<String, Object> map) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ String[] access$000() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private void closeStream(java.io.Closeable r1) {
        /*
            r0 = this;
            return
        L6:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.export.external.DexLoader.closeStream(java.io.Closeable):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0044
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private dalvik.system.DexClassLoader createDexClassLoader(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.ClassLoader r21, android.content.Context r22) {
        /*
            Method dump skipped, instruction units count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.export.external.DexLoader.createDexClassLoader(java.lang.String, java.lang.String, java.lang.String, java.lang.ClassLoader, android.content.Context):dalvik.system.DexClassLoader");
    }

    /* JADX WARN: Invalid debug info offset */
    public static void delete(File file) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getFileNameNoEx(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x003c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private java.lang.String getPrivateDexFilePath(java.lang.String r6, int r7) {
        /*
            r5 = this;
            r0 = 0
            return r0
        L73:
        L76:
        L79:
        L96:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.export.external.DexLoader.getPrivateDexFilePath(java.lang.String, int):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0017
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void initTbsSettings(java.util.Map<java.lang.String, java.lang.Object> r4) {
        /*
            return
        L2a:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.export.external.DexLoader.initTbsSettings(java.util.Map):void");
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean shouldUseTbsCorePrivateClassLoader(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public DexClassLoader getClassLoader() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Object getStaticField(String str, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Object invokeMethod(Object obj, String str, String str2, Class<?>[] clsArr, Object... objArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Object invokeStaticMethod(String str, String str2, Class<?>[] clsArr, Object... objArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Class<?> loadClass(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Object newInstance(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Object newInstance(String str, Class<?>[] clsArr, Object... objArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setStaticField(String str, String str2, Object obj) {
    }
}
