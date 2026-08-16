package android.media.HttpSrv;

import android.content.Context;
import android.media.ViviTV.MainApp;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class MediaEncHelper {
    private static final String KEY1 = "kEB1PkMW0DmgltTMRoR68upPIt2RZkST";
    private static MediaHttpSrv SERVER;
    private static MediaEncHelper instance;
    private Context context;
    private boolean initialized;
    private static final String KEY2 = MainApp.f4338B6;
    private static String LIVE_KEY = "4AuGzOCtwlo7z2EUX4Ce+w==";
    private static final Map<String, String> EMPTY_HEADERS = new HashMap();
    private static String BASE_URL = "";
    private static String IDENTITY = "video__";
    private static String CURRENT_TASK_ID = "";
    private static String LOCAL_PREFIX = "LocalFile://";

    /* JADX WARN: Invalid debug info offset */
    private MediaEncHelper(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static MediaEncHelper get(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static MediaEncHelper getInstance(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setLiveKey(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public String decrypt(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String decryptPro(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String encrypt(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String encryptPro(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public java.util.Map<java.lang.String, java.lang.String> getHeaders(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            return r0
        L3c:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.HttpSrv.MediaEncHelper.getHeaders(java.lang.String):java.util.Map");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public final java.lang.String getLocalDownUrlWithParallelForLocalVod(java.lang.String r5, int r6) {
        /*
            r4 = this;
            r0 = 0
            return r0
        L18:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.HttpSrv.MediaEncHelper.getLocalDownUrlWithParallelForLocalVod(java.lang.String, int):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    public final String getLocalDownUrlWithParallelForVod(String str, int i, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0017
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public final java.lang.String getLocalDownUrlWithParallelForVod(java.lang.String r12, int r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.HttpSrv.MediaEncHelper.getLocalDownUrlWithParallelForVod(java.lang.String, int, boolean, boolean):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    public void initEncHttp(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void shutdown() {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void shutdownCurrentTask() {
    }
}
