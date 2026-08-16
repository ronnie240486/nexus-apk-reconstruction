package com.tencent.smtt.sdk;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes2.dex */
public abstract class X5Downloader implements ProgressListener {

    /* JADX INFO: renamed from: A */
    private int f12977A;

    /* JADX INFO: renamed from: B */
    private String f12978B;

    /* JADX INFO: renamed from: a */
    private final Context f12979a;

    /* JADX INFO: renamed from: b */
    private final QbSdk.PrivateCDNMode f12980b;

    /* JADX INFO: renamed from: c */
    private String f12981c;

    /* JADX INFO: renamed from: d */
    private String f12982d;

    /* JADX INFO: renamed from: e */
    private File f12983e;

    /* JADX INFO: renamed from: f */
    private File f12984f;

    /* JADX INFO: renamed from: g */
    private long f12985g;

    /* JADX INFO: renamed from: h */
    private String f12986h;

    /* JADX INFO: renamed from: i */
    private int f12987i;

    /* JADX INFO: renamed from: j */
    private int f12988j;

    /* JADX INFO: renamed from: k */
    private int f12989k;

    /* JADX INFO: renamed from: l */
    private DownloadDelegate f12990l;

    /* JADX INFO: renamed from: m */
    private volatile boolean f12991m;

    /* JADX INFO: renamed from: n */
    private FileLock f12992n;

    /* JADX INFO: renamed from: o */
    private FileOutputStream f12993o;

    /* JADX INFO: renamed from: p */
    private int f12994p;

    /* JADX INFO: renamed from: q */
    private int f12995q;

    /* JADX INFO: renamed from: r */
    private int f12996r;

    /* JADX INFO: renamed from: s */
    private boolean f12997s;

    /* JADX INFO: renamed from: t */
    private HttpURLConnection f12998t;

    /* JADX INFO: renamed from: u */
    private long f12999u;

    /* JADX INFO: renamed from: v */
    private int f13000v;

    /* JADX INFO: renamed from: w */
    private String f13001w;

    /* JADX INFO: renamed from: x */
    private boolean f13002x;

    /* JADX INFO: renamed from: y */
    private boolean f13003y;

    /* JADX INFO: renamed from: z */
    private final StringBuilder f13004z;

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.X5Downloader$1 */
    public class C41151 extends Thread {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ X5Downloader f13005a;

        /* JADX WARN: Invalid debug info offset */
        public C41151(X5Downloader x5Downloader) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    public interface DownloadDelegate {
        void download(X5Downloader x5Downloader, String str, File file);
    }

    /* JADX WARN: Invalid debug info offset */
    public X5Downloader(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ QbSdk.PrivateCDNMode m19011a(X5Downloader x5Downloader) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0084
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    private void m19012a() {
        /*
            Method dump skipped, instruction units count: 978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.X5Downloader.m19012a():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    private void m19013a(int i, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0023
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    private void m19014a(long r6) {
        /*
            r5 = this;
            return
        L27:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.X5Downloader.m19014a(long):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    private void m19015a(QbSdk.PrivateCDNMode privateCDNMode) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    private void m19016a(java.io.Closeable r1) {
        /*
            r0 = this;
            return
        L5:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.X5Downloader.m19016a(java.io.Closeable):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    private void m19017a(java.lang.String r4) throws java.lang.Exception {
        /*
            r3 = this;
            return
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.X5Downloader.m19017a(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x005a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    private boolean m19018a(boolean r8) {
        /*
            r7 = this;
            r0 = 0
            return r0
        L64:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.X5Downloader.m19018a(boolean):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    private long m19019b() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    private void m19020b(int i, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m19021b(X5Downloader x5Downloader) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    private void m19022c() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m19023c(X5Downloader x5Downloader) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    private boolean m19024d() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    private void m19025e() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    private void m19026f() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    private void m19027g() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    private void m19028h() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    private void m19029i() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    private void m19030j() {
    }

    /* JADX WARN: Invalid debug info offset */
    public final void notifyDownloadFinished() {
    }

    @Override // com.tencent.smtt.sdk.ProgressListener
    public void onProgress(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public final X5Downloader setConnectTimesOut(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final X5Downloader setDownloadDelegate(DownloadDelegate downloadDelegate) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final X5Downloader setDownloadUrl(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final X5Downloader setMaxRetryTimes(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final void startDownload() {
    }
}
