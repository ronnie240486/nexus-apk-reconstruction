package cn.dolit.p2ptrans;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p000.C4615jV;

/* JADX INFO: loaded from: classes.dex */
public class PPTransUtils {
    private static final String HOST = "http://127.0.0.1";
    private static int PORT = 8777;
    private static final String TAG = "PPTransUtils";
    public static final String UTF_8 = "UTF-8";
    private static ConcurrentHashMap<String, StreamInfo> URL_CACHE = new ConcurrentHashMap<>();
    private static String TORRENT_DIR = "";
    private static String DOWNLOAD_DIR = "";
    private static boolean TORR_DIR_SET_UP = false;
    private static boolean DOWN_DIR_SET_UP = false;

    /* JADX INFO: renamed from: cn.dolit.p2ptrans.PPTransUtils$1 */
    public class RunnableC30631 implements Runnable {
        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: cn.dolit.p2ptrans.PPTransUtils$2 */
    public class RunnableC30642 implements Runnable {
        final /* synthetic */ String val$auth;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC30642(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static class CmModel {
        private int code;
        private String message;

        /* JADX WARN: Invalid debug info offset */
        public CmModel() {
        }

        /* JADX WARN: Invalid debug info offset */
        public CmModel(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public int getCode() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public String getMessage() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public void setCode(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setMessage(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        public boolean succeed() {
            return false;
        }
    }

    public static final class StartStreamResult extends CmModel {

        @JSONField(name = "data")
        private StreamInfo stream;

        /* JADX WARN: Invalid debug info offset */
        public StartStreamResult() {
        }

        /* JADX WARN: Invalid debug info offset */
        public StartStreamResult(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public StreamInfo getStream() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public void setStream(StreamInfo streamInfo) {
        }
    }

    public static final class StreamInfo {

        @JSONField(name = "btStatus")
        private int btStatus;

        @JSONField(name = "seedConnected")
        private int countSeedConnected;

        @JSONField(name = "totalCurrentSeedCount")
        private int countSeedTotal;

        @JSONField(name = "downloadSpeed")
        private int downloadSpeed;

        @JSONField(name = "downloadedBytes")
        private long downloadedBytes;

        /* JADX INFO: renamed from: id */
        @JSONField(name = "id")
        private String f10429id;

        @JSONField(name = C4615jV.f14792f)
        private int percent;

        @JSONField(name = "pieceCount")
        private int pieceCount;

        @JSONField(name = "pieceSize")
        private int pieceSize;

        @JSONField(name = "selectedFilePath")
        private String selectedFilePath;

        @JSONField(name = "selectedFileSize")
        private long selectedFileSize;

        @JSONField(name = "totalBytes")
        private long totalBytes;

        /* JADX WARN: Invalid debug info offset */
        public int getBtStatus() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public int getCountSeedConnected() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public int getCountSeedTotal() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public int getDownloadSpeed() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public long getDownloadedBytes() {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        public String getId() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public int getPercent() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public int getPieceCount() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public int getPieceSize() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public String getSelectedFilePath() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public long getSelectedFileSize() {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        public long getTotalBytes() {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        public void setBtStatus(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setCountSeedConnected(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setCountSeedTotal(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setDownloadSpeed(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setDownloadedBytes(long j) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setId(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setPercent(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setPieceCount(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setPieceSize(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setSelectedFilePath(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setSelectedFileSize(long j) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setTotalBytes(long j) {
        }
    }

    public static final class StreamsResult extends CmModel {
        private List<StreamInfo> streams;

        /* JADX WARN: Invalid debug info offset */
        public StreamsResult() {
        }

        /* JADX WARN: Invalid debug info offset */
        public StreamsResult(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public List<StreamInfo> getStreams() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public HashMap<String, StreamInfo> getStreamsMap() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public void setStreams(List<StreamInfo> list) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ int access$000() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ int access$008() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ boolean access$100() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ boolean access$102(boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ String access$200() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ boolean access$300() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ boolean access$302(boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ String access$400() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static java.lang.String fetch(java.lang.String r4) {
        /*
            r0 = 0
            return r0
        L42:
        L45:
        L4f:
        L51:
        L58:
        L5e:
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.dolit.p2ptrans.PPTransUtils.fetch(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getDownloadDir() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static StreamsResult getStreams() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getTorrentDir() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getTorrentPlayUrl(String str, boolean z, boolean z2, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static final void removeTorrentUrl(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void resume(java.lang.String r6) {
        /*
            return
        L2b:
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.dolit.p2ptrans.PPTransUtils.resume(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public static void shutdown() {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void start(String str, String str2, String str3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static synchronized cn.dolit.p2ptrans.PPTransUtils.StartStreamResult startStream(java.lang.String r17, java.lang.String r18, java.lang.String r19, int r20, boolean r21, java.lang.String r22) {
        /*
            r0 = 0
            return r0
        L18:
        La4:
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.dolit.p2ptrans.PPTransUtils.startStream(java.lang.String, java.lang.String, java.lang.String, int, boolean, java.lang.String):cn.dolit.p2ptrans.PPTransUtils$StartStreamResult");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static synchronized cn.dolit.p2ptrans.PPTransUtils.StartStreamResult startStreamFromTorrentUrl(java.lang.String r8, java.lang.String r9, int r10, boolean r11, java.lang.String r12) {
        /*
            r0 = 0
            return r0
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.dolit.p2ptrans.PPTransUtils.startStreamFromTorrentUrl(java.lang.String, java.lang.String, int, boolean, java.lang.String):cn.dolit.p2ptrans.PPTransUtils$StartStreamResult");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void stop(java.lang.String r7) {
        /*
            return
        L2f:
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.dolit.p2ptrans.PPTransUtils.stop(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static synchronized void stopAll() {
        /*
            return
        L25:
        L28:
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.dolit.p2ptrans.PPTransUtils.stopAll():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static synchronized void stopStream(java.lang.String r8) {
        /*
            return
        L34:
        L36:
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.dolit.p2ptrans.PPTransUtils.stopStream(java.lang.String):void");
    }
}
