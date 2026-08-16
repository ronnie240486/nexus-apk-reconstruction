package com.tencent.smtt.sdk;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class TbsExtensionFunctionManager {
    public static final String BUGLY_SWITCH_FILE_NAME = "bugly_switch.txt";
    public static final String COOKIE_SWITCH_FILE_NAME = "cookie_switch.txt";
    public static final String DISABLE_GET_APK_VERSION_SWITCH_FILE_NAME = "disable_get_apk_version_switch.txt";
    public static final String DISABLE_UNPREINIT = "disable_unpreinit.txt";
    public static final String DISABLE_USE_HOST_BACKUP_CORE = "disable_use_host_backup_core.txt";
    public static final String SP_KEY_COOKIE_DB_VERSION = "cookie_db_version";
    public static final String SP_NAME_FOR_COOKIE = "cookie_compatiable";
    public static final int SWITCH_BYTE_COOKIE = 1;
    public static final int SWITCH_BYTE_DISABLE_GET_APK_VERSION = 2;
    public static final int SWITCH_BYTE_DISABLE_UNPREINIT = 4;
    public static final int SWITCH_BYTE_DISABLE_USE_HOST_BACKUPCORE = 8;
    public static final String USEX5_FILE_NAME = "usex5.txt";

    /* JADX INFO: renamed from: b */
    private static TbsExtensionFunctionManager f12833b;

    /* JADX INFO: renamed from: a */
    private boolean f12834a;

    /* JADX WARN: Invalid debug info offset */
    private TbsExtensionFunctionManager() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static com.tencent.smtt.sdk.TbsExtensionFunctionManager getInstance() {
        /*
            r0 = 0
            return r0
        L13:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsExtensionFunctionManager.getInstance():com.tencent.smtt.sdk.TbsExtensionFunctionManager");
    }

    /* JADX WARN: Invalid debug info offset */
    public synchronized boolean canUseFunction(Context context, String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public synchronized int getRomCookieDBVersion(Context context) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized void initTbsBuglyIfNeed(android.content.Context r17) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsExtensionFunctionManager.initTbsBuglyIfNeed(android.content.Context):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized boolean setFunctionEnable(android.content.Context r5, java.lang.String r6, boolean r7) {
        /*
            r4 = this;
            r0 = 0
            return r0
        L24:
        L26:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsExtensionFunctionManager.setFunctionEnable(android.content.Context, java.lang.String, boolean):boolean");
    }
}
