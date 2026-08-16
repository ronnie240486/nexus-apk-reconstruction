package com.tencent.smtt.export.external;

import android.app.Service;
import android.content.Context;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes2.dex */
public class DexClassLoaderProvider extends DexClassLoader {
    private static final String IS_FIRST_LOAD_DEX_FLAG_FILE = "is_first_load_dex_flag_file";
    private static final String LAST_DEX_NAME = "tbs_jars_fusion_dex.jar";
    private static final long LOAD_DEX_DELAY = 3000;
    private static final String LOGTAG = "dexloader";
    protected static DexClassLoader mClassLoaderOriginal;
    private static Context mContext;
    private static boolean mForceLoadDexFlag;
    private static DexClassLoaderProvider mInstance;
    private static String mRealDexPath;
    protected static Service mService;
    private SpeedyDexClassLoader mClassLoader;

    /* JADX INFO: renamed from: com.tencent.smtt.export.external.DexClassLoaderProvider$1 */
    public static class C40561 extends TimerTask {
        final /* synthetic */ String val$dexName;
        final /* synthetic */ String val$dexPath;
        final /* synthetic */ String val$libraryPath;
        final /* synthetic */ String val$optimizedDirectory;

        /* JADX WARN: Invalid debug info offset */
        public C40561(String str, String str2, String str3, String str4) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            /*
                r6 = this;
                return
            L58:
            L5a:
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.export.external.DexClassLoaderProvider.C40561.run():void");
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.export.external.DexClassLoaderProvider$2 */
    public static class C40572 extends TimerTask {
        final /* synthetic */ String val$dexName;
        final /* synthetic */ String val$dexPath;
        final /* synthetic */ String val$libraryPath;
        final /* synthetic */ String val$optimizedDirectory;
        final /* synthetic */ ClassLoader val$parent;

        /* JADX WARN: Invalid debug info offset */
        public C40572(String str, String str2, String str3, ClassLoader classLoader, String str4) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000a
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            /*
                Method dump skipped, instruction units count: 267
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.export.external.DexClassLoaderProvider.C40572.run():void");
        }
    }

    public static class SpeedyDexClassLoader extends BaseDexClassLoader {
        /* JADX WARN: Invalid debug info offset */
        public SpeedyDexClassLoader(String str, File file, String str2, ClassLoader classLoader) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.ClassLoader
        public Package definePackage(String str, String str2, String str3, String str4, String str5, String str6, String str7, URL url) throws IllegalArgumentException {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
        public Class<?> findClass(String str) throws ClassNotFoundException {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
        public URL findResource(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
        public Enumeration<URL> findResources(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
        public synchronized Package getPackage(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.ClassLoader
        public Package[] getPackages() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.ClassLoader
        public Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    private DexClassLoaderProvider(String str, String str2, String str3, ClassLoader classLoader, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ Context access$000() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ boolean access$100() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static DexClassLoader createDexClassLoader(String str, String str2, String str3, ClassLoader classLoader, Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static void doAsyncDexLoad(String str, String str2, String str3, String str4, ClassLoader classLoader) {
    }

    /* JADX WARN: Invalid debug info offset */
    private static boolean is_first_load_tbs_dex(String str, String str2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setForceLoadDexFlag(boolean z, Service service) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0011
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private static void set_first_load_tbs_dex(java.lang.String r1, java.lang.String r2) {
        /*
            return
        L15:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.export.external.DexClassLoaderProvider.set_first_load_tbs_dex(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    private static boolean shouldUseDexLoaderService() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private static boolean supportSpeedyClassLoader() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean useSelfClassloader() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.lang.ClassLoader
    public void clearAssertionStatus() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.lang.ClassLoader
    public Package definePackage(String str, String str2, String str3, String str4, String str5, String str6, String str7, URL url) throws IllegalArgumentException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Class<?> findClass(String str) throws ClassNotFoundException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public String findLibrary(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public URL findResource(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Enumeration<URL> findResources(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public synchronized Package getPackage(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.lang.ClassLoader
    public Package[] getPackages() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.lang.ClassLoader
    public URL getResource(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.lang.ClassLoader
    public InputStream getResourceAsStream(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.lang.ClassLoader
    public Enumeration<URL> getResources(String str) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str) throws ClassNotFoundException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.lang.ClassLoader
    public void setClassAssertionStatus(String str, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.lang.ClassLoader
    public void setDefaultAssertionStatus(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.lang.ClassLoader
    public void setPackageAssertionStatus(String str, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // dalvik.system.BaseDexClassLoader
    public String toString() {
        return null;
    }
}
