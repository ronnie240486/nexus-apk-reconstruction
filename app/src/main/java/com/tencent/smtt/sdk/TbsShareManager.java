package com.tencent.smtt.sdk;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class TbsShareManager {

    /* JADX INFO: renamed from: a */
    private static Context f12891a;

    /* JADX INFO: renamed from: b */
    private static boolean f12892b;
    public static boolean mHasQueried;

    @Deprecated
    public static int findCoreForThirdPartyApp(Context context) {
        return -1;
    }

    @Deprecated
    public static File getBackupCoreFile(Context context, String str) {
        return null;
    }

    @Deprecated
    public static int getBackupCoreVersion(Context context, String str) {
        return 0;
    }

    @Deprecated
    public static File getBackupDecoupleCoreFile(Context context, String str) {
        return null;
    }

    @Deprecated
    public static int getBackupDecoupleCoreVersion(Context context, String str) {
        return 0;
    }

    @Deprecated
    public static boolean getCoreDisabled() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public static String[] getCoreProviderAppList() {
        return null;
    }

    @Deprecated
    public static int getCoreShareDecoupleCoreVersion(Context context, String str) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public static String getHostCorePathAppDefined() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static android.content.Context getPackageContext(android.content.Context r2, java.lang.String r3, boolean r4) {
        /*
            r0 = 0
            return r0
        L3b:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsShareManager.getPackageContext(android.content.Context, java.lang.String, boolean):android.content.Context");
    }

    @Deprecated
    public static File getSDCoreFile(Context context, String str, int i) {
        return null;
    }

    @Deprecated
    public static int getSharedTbsCoreVersion(Context context, String str) {
        return 0;
    }

    @Deprecated
    public static File getStableCoreFile(Context context, String str) {
        return null;
    }

    @Deprecated
    public static int getStableCoreVersion(Context context, String str) {
        return 0;
    }

    @Deprecated
    public static int getTbsStableCoreVersion(Context context, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isThirdPartyApp(Context context) {
        return false;
    }

    @Deprecated
    public static void setHostCorePathAppDefined(String str) {
    }
}
