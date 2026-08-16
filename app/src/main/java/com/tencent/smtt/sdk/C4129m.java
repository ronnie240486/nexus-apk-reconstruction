package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: com.tencent.smtt.sdk.m */
/* JADX INFO: loaded from: classes2.dex */
class C4129m {

    /* JADX INFO: renamed from: c */
    private static C4129m f13094c;

    /* JADX INFO: renamed from: d */
    private int f13101d;

    /* JADX INFO: renamed from: e */
    private FileLock f13102e;

    /* JADX INFO: renamed from: f */
    private FileOutputStream f13103f;

    /* JADX INFO: renamed from: g */
    private boolean f13104g;

    /* JADX INFO: renamed from: j */
    private boolean f13105j;

    /* JADX INFO: renamed from: o */
    private QbSdk.InterfaceC4072a f13106o;

    /* JADX INFO: renamed from: p */
    private int f13107p;

    /* JADX INFO: renamed from: h */
    private static final ReentrantLock f13095h = new ReentrantLock();

    /* JADX INFO: renamed from: i */
    private static final Lock f13096i = new ReentrantLock();

    /* JADX INFO: renamed from: k */
    private static FileLock f13097k = null;

    /* JADX INFO: renamed from: l */
    private static final ThreadLocal<Integer> f13098l = new ThreadLocal<Integer>() { // from class: com.tencent.smtt.sdk.m.1
        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Integer m19174a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.ThreadLocal
        public /* synthetic */ Integer initialValue() {
            return null;
        }
    };

    /* JADX INFO: renamed from: m */
    private static Handler f13099m = null;

    /* JADX INFO: renamed from: a */
    static boolean f13092a = false;

    /* JADX INFO: renamed from: b */
    static final FileFilter f13093b = new FileFilter() { // from class: com.tencent.smtt.sdk.m.2
        /* JADX WARN: Invalid debug info offset */
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return false;
        }
    };

    /* JADX INFO: renamed from: n */
    private static int f13100n = 0;

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.m$3, reason: invalid class name */
    public class AnonymousClass3 extends Handler {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C4129m f13108a;

        /* JADX WARN: Invalid debug info offset */
        public AnonymousClass3(C4129m c4129m, Looper looper) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.m$4, reason: invalid class name */
    public class AnonymousClass4 implements FileFilter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C4129m f13109a;

        /* JADX WARN: Invalid debug info offset */
        public AnonymousClass4(C4129m c4129m) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.m$5, reason: invalid class name */
    public class AnonymousClass5 implements FileFilter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C4129m f13110a;

        /* JADX WARN: Invalid debug info offset */
        public AnonymousClass5(C4129m c4129m) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.m$6, reason: invalid class name */
    public class AnonymousClass6 implements FileFilter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C4129m f13111a;

        /* JADX WARN: Invalid debug info offset */
        public AnonymousClass6(C4129m c4129m) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.m$7, reason: invalid class name */
    public class AnonymousClass7 implements FileFilter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C4129m f13112a;

        /* JADX WARN: Invalid debug info offset */
        public AnonymousClass7(C4129m c4129m) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return false;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    private C4129m() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public static synchronized com.tencent.smtt.sdk.C4129m m19113a() {
        /*
            r0 = 0
            return r0
        L16:
        L1c:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C4129m.m19113a():com.tencent.smtt.sdk.m");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x003f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    private void m19114a(int r6, java.lang.String r7, android.content.Context r8) {
        /*
            r5 = this;
            return
        L69:
        L71:
        L76:
        L79:
        L7b:
        L86:
        L90:
        L97:
        La1:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C4129m.m19114a(int, java.lang.String, android.content.Context):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static void m19115a(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0099
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @android.annotation.TargetApi(11)
    /* JADX INFO: renamed from: a */
    private void m19116a(android.content.Context r25, android.content.Context r26, int r27) {
        /*
            Method dump skipped, instruction units count: 1264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C4129m.m19116a(android.content.Context, android.content.Context, int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m19117a(C4129m c4129m, Context context, Context context2, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0035
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    private boolean m19118a(android.content.Context r13, java.io.File r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C4129m.m19118a(android.content.Context, java.io.File, boolean):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static boolean m19119a(Context context, String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0020
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    private boolean m19120a(java.io.File r12, android.content.Context r13) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C4129m.m19120a(java.io.File, android.content.Context):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static void m19121b() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    private boolean m19122b(Context context, File file) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: c */
    private int m19123c(android.content.Context r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C4129m.m19123c(android.content.Context, android.os.Bundle):int");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: c */
    private boolean m19124c(android.content.Context r11, java.io.File r12) {
        /*
            r10 = this;
            r0 = 0
            return r0
        L41:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C4129m.m19124c(android.content.Context, java.io.File):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: c */
    private synchronized boolean m19125c(android.content.Context r10, boolean r11) {
        /*
            r9 = this;
            r0 = 0
            return r0
        L73:
        L83:
        Lb1:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C4129m.m19125c(android.content.Context, boolean):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: d */
    private boolean m19126d(android.content.Context r10, java.io.File r11) {
        /*
            r9 = this;
            r0 = 0
            return r0
        L3b:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C4129m.m19126d(android.content.Context, java.io.File):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: d */
    private synchronized boolean m19127d(android.content.Context r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C4129m.m19127d(android.content.Context, boolean):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0015
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: e */
    private void m19128e(android.content.Context r6, boolean r7) {
        /*
            r5 = this;
            return
        L2e:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C4129m.m19128e(android.content.Context, boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    private void m19129f(Context context, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: g */
    private boolean m19130g(android.content.Context r8, int r9) {
        /*
            r7 = this;
            r0 = 0
            return r0
        L2e:
        L58:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C4129m.m19130g(android.content.Context, int):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public static File m19131o(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    private int m19132q(Context context) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: r */
    private static boolean m19133r(android.content.Context r5) {
        /*
            r0 = 0
            return r0
        L2b:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C4129m.m19133r(android.content.Context):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    private boolean m19134s(Context context) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0013
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: t */
    private void m19135t(android.content.Context r6) {
        /*
            r5 = this;
            return
        L70:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C4129m.m19135t(android.content.Context):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0013
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: u */
    private void m19136u(android.content.Context r5) {
        /*
            r4 = this;
            return
        L35:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C4129m.m19136u(android.content.Context):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    private void m19137v(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    private void m19138w(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    private void m19139x(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    private void m19140y(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public int m19141a(java.io.File r6) {
        /*
            r5 = this;
            r0 = 0
            return r0
        L43:
        L4b:
        L4c:
        L4f:
        L52:
        L54:
        L5b:
        L61:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C4129m.m19141a(java.io.File):int");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public int m19142a(boolean z, Context context) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public File m19143a(Context context, int i, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public File m19144a(Context context, File file) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void m19145a(Context context, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void m19146a(Context context, Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void m19147a(Context context, File file, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void m19148a(Context context, String str, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x005d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public void m19149a(android.content.Context r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C4129m.m19149a(android.content.Context, boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m19150a(QbSdk.InterfaceC4072a interfaceC4072a) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public int m19151b(Context context) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public int m19152b(Context context, String str) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x00c1
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    public void m19153b(android.content.Context r17, android.os.Bundle r18) {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C4129m.m19153b(android.content.Context, android.os.Bundle):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x016e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @android.annotation.TargetApi(11)
    /* JADX INFO: renamed from: b */
    public void m19154b(android.content.Context r22, java.lang.String r23, int r24) {
        /*
            Method dump skipped, instruction units count: 1508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C4129m.m19154b(android.content.Context, java.lang.String, int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public void m19155b(Context context, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public boolean m19156b(Context context, int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: c */
    public synchronized void m19158c() {
        /*
            r3 = this;
            return
        L2d:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C4129m.m19158c():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: c */
    public boolean m19159c(android.content.Context r11) {
        /*
            r10 = this;
            r0 = 0
            return r0
        L4d:
        L71:
        L76:
        L78:
        L82:
        L88:
        L8f:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C4129m.m19159c(android.content.Context):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public int m19160d(Context context, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0011
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: d */
    public void m19161d(android.content.Context r6) {
        /*
            r5 = this;
            return
        L35:
        L39:
        L3c:
        L3e:
        L46:
        L4a:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C4129m.m19161d(android.content.Context):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public File m19162e(Context context, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public void m19163e(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: f */
    public int m19164f(android.content.Context r5) {
        /*
            r4 = this;
            r0 = 0
            return r0
        L34:
        L3c:
        L3d:
        L40:
        L43:
        L45:
        L4c:
        L52:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C4129m.m19164f(android.content.Context):int");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: g */
    public int m19165g(android.content.Context r9) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C4129m.m19165g(android.content.Context):int");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public int m19166h(Context context) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public void m19167i(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public boolean m19168j(Context context) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x002b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: k */
    public int m19169k(android.content.Context r10) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.C4129m.m19169k(android.content.Context):int");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public void m19170l(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public File m19171m(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public File m19172n(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public synchronized boolean m19173p(Context context) {
        return false;
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public Context m19157c(Context context, int i) {
        return null;
    }
}
