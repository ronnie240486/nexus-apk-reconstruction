package cn.dolit.p2ptrans;

/* JADX INFO: loaded from: classes.dex */
public class P2PTrans {

    @Deprecated
    public static final String AVAILABLE_SPACE = "available_space";
    private static int EXTRA_WAIT = 8;
    private static final String LOCAL_HOST = "http://127.0.0.1";
    private static final int PLL_DEBUG = 3;
    private static final int PLL_ERROR = 0;
    private static final int PLL_INFO = 2;
    private static final int PLL_NONE = -1;
    private static final int PLL_VERBOSE_DEBUG = 4;
    private static final int PLL_WARN = 1;
    private static final String TAG = "p2ptrans";
    public static final String UTF_8 = "UTF-8";
    private static Module module = new Module();

    /* JADX WARN: Invalid debug info offset */
    public static boolean enableStream(int i, String str, String str2, String str3) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static java.lang.String getEncodedUrl(java.lang.String r1) {
        /*
            r0 = 0
            return r0
        L10:
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.dolit.p2ptrans.P2PTrans.getEncodedUrl(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getHelpUrl(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final long getSDCardAvailableSize() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getTorrentPlayUrl(int i, String str, boolean z, boolean z2, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private static java.lang.String httpGet(java.lang.String r6) {
        /*
            r0 = 0
            return r0
        L3e:
        L41:
        L4b:
        L4f:
        L51:
        L64:
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.dolit.p2ptrans.P2PTrans.httpGet(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    public static int run(String str, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setExtraWait(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean setFileSavePath(int i, String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void setPgString(java.lang.String r1) {
        /*
            return
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.dolit.p2ptrans.P2PTrans.setPgString(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean setTorrentSavePath(int i, String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static int shutdown(int r3) {
        /*
            r0 = 0
            return r0
        L2a:
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.dolit.p2ptrans.P2PTrans.shutdown(int):int");
    }

    public static int startBTStream(int i, String str, String str2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static String stopAllStream(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean testStream(int i) {
        return false;
    }
}
