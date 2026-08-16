package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.tencent.smtt.utils.C4160g;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class TbsLogReport {

    /* JADX INFO: renamed from: a */
    private static TbsLogReport f12836a;

    /* JADX INFO: renamed from: b */
    private Handler f12837b;

    /* JADX INFO: renamed from: c */
    private final Map<EventType, Boolean> f12838c;

    /* JADX INFO: renamed from: d */
    private final Context f12839d;

    /* JADX INFO: renamed from: e */
    private boolean f12840e;

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.TbsLogReport$1 */
    public class HandlerC41001 extends Handler {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ TbsLogReport f12841a;

        /* JADX WARN: Invalid debug info offset */
        public HandlerC41001(TbsLogReport tbsLogReport, Looper looper) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000c
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // android.os.Handler
        public void handleMessage(android.os.Message r3) {
            /*
                r2 = this;
                return
            L16:
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsLogReport.HandlerC41001.handleMessage(android.os.Message):void");
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.TbsLogReport$2 */
    public class C41012 implements C4160g.a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ TbsLogReport f12842a;

        /* JADX WARN: Invalid debug info offset */
        public C41012(TbsLogReport tbsLogReport) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.utils.C4160g.a
        /* JADX INFO: renamed from: a */
        public void mo18920a(int i) {
        }
    }

    public enum EventType {
        TYPE_DOWNLOAD(0),
        TYPE_INSTALL(1),
        TYPE_LOAD(2),
        TYPE_CDN_DOWNLOAD_STAT(3),
        TYPE_COOKIE_DB_SWITCH(4),
        TYPE_PV_UPLOAD_STAT(5),
        TYPE_CORE_LOAD_PERFORMANCE(6),
        TYPE_CORE_PROTECT_RESET(7);


        /* JADX INFO: renamed from: a */
        int f12844a;

        EventType(int i) {
            this.f12844a = i;
        }
    }

    public static class TbsLogInfo implements Cloneable {

        /* JADX INFO: renamed from: a */
        int f12845a;

        /* JADX INFO: renamed from: b */
        private long f12846b;

        /* JADX INFO: renamed from: c */
        private String f12847c;

        /* JADX INFO: renamed from: d */
        private String f12848d;

        /* JADX INFO: renamed from: e */
        private int f12849e;

        /* JADX INFO: renamed from: f */
        private int f12850f;

        /* JADX INFO: renamed from: g */
        private int f12851g;

        /* JADX INFO: renamed from: h */
        private int f12852h;

        /* JADX INFO: renamed from: i */
        private String f12853i;

        /* JADX INFO: renamed from: j */
        private int f12854j;

        /* JADX INFO: renamed from: k */
        private int f12855k;

        /* JADX INFO: renamed from: l */
        private long f12856l;

        /* JADX INFO: renamed from: m */
        private long f12857m;

        /* JADX INFO: renamed from: n */
        private int f12858n;

        /* JADX INFO: renamed from: o */
        private String f12859o;

        /* JADX INFO: renamed from: p */
        private String f12860p;

        /* JADX INFO: renamed from: q */
        private long f12861q;

        /* JADX WARN: Invalid debug info offset */
        private TbsLogInfo() {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ TbsLogInfo(HandlerC41001 handlerC41001) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ long m18935a(TbsLogInfo tbsLogInfo) {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ String m18936b(TbsLogInfo tbsLogInfo) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ String m18937c(TbsLogInfo tbsLogInfo) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public static /* synthetic */ int m18938d(TbsLogInfo tbsLogInfo) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public static /* synthetic */ int m18939e(TbsLogInfo tbsLogInfo) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: f */
        public static /* synthetic */ int m18940f(TbsLogInfo tbsLogInfo) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: g */
        public static /* synthetic */ int m18941g(TbsLogInfo tbsLogInfo) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: h */
        public static /* synthetic */ String m18942h(TbsLogInfo tbsLogInfo) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: i */
        public static /* synthetic */ int m18943i(TbsLogInfo tbsLogInfo) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: j */
        public static /* synthetic */ int m18944j(TbsLogInfo tbsLogInfo) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k */
        public static /* synthetic */ long m18945k(TbsLogInfo tbsLogInfo) {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: l */
        public static /* synthetic */ long m18946l(TbsLogInfo tbsLogInfo) {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: m */
        public static /* synthetic */ long m18947m(TbsLogInfo tbsLogInfo) {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: n */
        public static /* synthetic */ int m18948n(TbsLogInfo tbsLogInfo) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: o */
        public static /* synthetic */ String m18949o(TbsLogInfo tbsLogInfo) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: p */
        public static /* synthetic */ String m18950p(TbsLogInfo tbsLogInfo) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public Object clone() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public int getDownFinalFlag() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public void resetArgs() {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setApn(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setCheckErrorDetail(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setDownConsumeTime(long j) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setDownFinalFlag(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setDownloadCancel(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setDownloadSize(long j) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setDownloadUrl(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setErrorCode(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setEventTime(long j) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setFailDetail(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setFailDetail(Throwable th) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setHttpCode(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setNetworkChange(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setNetworkType(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setPatchUpdateFlag(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setPkgSize(long j) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setResolveIp(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setUnpkgFlag(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public String toString() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    private TbsLogReport(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    private String m18921a(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    private String m18922a(long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    private String m18923a(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    private org.json.JSONArray m18924a() {
        /*
            r5 = this;
            r0 = 0
            return r0
        L19:
        L4f:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsLogReport.m18924a():org.json.JSONArray");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x018f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    private void m18925a(int r4, com.tencent.smtt.sdk.TbsLogReport.TbsLogInfo r5) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsLogReport.m18925a(int, com.tencent.smtt.sdk.TbsLogReport$TbsLogInfo):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    private void m18926a(int i, TbsLogInfo tbsLogInfo, EventType eventType) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    private void m18927a(int i, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18928a(TbsLogReport tbsLogReport) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18929a(TbsLogReport tbsLogReport, int i, TbsLogInfo tbsLogInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    private String m18930b(long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x004b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    private void m18931b() {
        /*
            r7 = this;
            return
        L7c:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsLogReport.m18931b():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m18932b(TbsLogReport tbsLogReport) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    private void m18933c() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    private SharedPreferences m18934d() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static com.tencent.smtt.sdk.TbsLogReport getInstance(android.content.Context r2) {
        /*
            r0 = 0
            return r0
        L13:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsLogReport.getInstance(android.content.Context):com.tencent.smtt.sdk.TbsLogReport");
    }

    /* JADX WARN: Invalid debug info offset */
    public void clear() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void dailyReport() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0031
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public void eventReport(com.tencent.smtt.sdk.TbsLogReport.EventType r4, com.tencent.smtt.sdk.TbsLogReport.TbsLogInfo r5) {
        /*
            r3 = this;
            return
        L4d:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.TbsLogReport.eventReport(com.tencent.smtt.sdk.TbsLogReport$EventType, com.tencent.smtt.sdk.TbsLogReport$TbsLogInfo):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean getShouldUploadEventReport() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setInstallErrorCode(int i, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setInstallErrorCode(int i, String str, EventType eventType) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setInstallErrorCode(int i, Throwable th) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLoadErrorCode(int i, Throwable th) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setShouldUploadEventReport(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public TbsLogInfo tbsLogInfo() {
        return null;
    }
}
