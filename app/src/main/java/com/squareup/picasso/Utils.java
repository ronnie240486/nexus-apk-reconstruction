package com.squareup.picasso;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
final class Utils {

    /* JADX INFO: renamed from: A */
    public static final String f12610A = "removed";

    /* JADX INFO: renamed from: B */
    public static final String f12611B = "delivered";

    /* JADX INFO: renamed from: C */
    public static final String f12612C = "replaying";

    /* JADX INFO: renamed from: D */
    public static final String f12613D = "completed";

    /* JADX INFO: renamed from: E */
    public static final String f12614E = "errored";

    /* JADX INFO: renamed from: F */
    public static final String f12615F = "paused";

    /* JADX INFO: renamed from: G */
    public static final String f12616G = "resumed";

    /* JADX INFO: renamed from: H */
    public static final int f12617H = 12;

    /* JADX INFO: renamed from: I */
    public static final String f12618I = "RIFF";

    /* JADX INFO: renamed from: J */
    public static final String f12619J = "WEBP";

    /* JADX INFO: renamed from: a */
    public static final String f12620a = "Picasso-";

    /* JADX INFO: renamed from: b */
    public static final String f12621b = "Picasso-Idle";

    /* JADX INFO: renamed from: c */
    public static final int f12622c = 20000;

    /* JADX INFO: renamed from: d */
    public static final int f12623d = 20000;

    /* JADX INFO: renamed from: e */
    public static final int f12624e = 15000;

    /* JADX INFO: renamed from: f */
    public static final String f12625f = "picasso-cache";

    /* JADX INFO: renamed from: g */
    public static final int f12626g = 50;

    /* JADX INFO: renamed from: h */
    public static final int f12627h = 5242880;

    /* JADX INFO: renamed from: i */
    public static final int f12628i = 52428800;

    /* JADX INFO: renamed from: j */
    public static final int f12629j = 1000;

    /* JADX INFO: renamed from: k */
    public static final char f12630k = '\n';

    /* JADX INFO: renamed from: l */
    public static final StringBuilder f12631l = new StringBuilder();

    /* JADX INFO: renamed from: m */
    public static final String f12632m = "Main";

    /* JADX INFO: renamed from: n */
    public static final String f12633n = "Dispatcher";

    /* JADX INFO: renamed from: o */
    public static final String f12634o = "Hunter";

    /* JADX INFO: renamed from: p */
    public static final String f12635p = "created";

    /* JADX INFO: renamed from: q */
    public static final String f12636q = "changed";

    /* JADX INFO: renamed from: r */
    public static final String f12637r = "ignored";

    /* JADX INFO: renamed from: s */
    public static final String f12638s = "enqueued";

    /* JADX INFO: renamed from: t */
    public static final String f12639t = "canceled";

    /* JADX INFO: renamed from: u */
    public static final String f12640u = "batched";

    /* JADX INFO: renamed from: v */
    public static final String f12641v = "retrying";

    /* JADX INFO: renamed from: w */
    public static final String f12642w = "executing";

    /* JADX INFO: renamed from: x */
    public static final String f12643x = "decoded";

    /* JADX INFO: renamed from: y */
    public static final String f12644y = "transformed";

    /* JADX INFO: renamed from: z */
    public static final String f12645z = "joined";

    /* JADX INFO: renamed from: com.squareup.picasso.Utils$1 */
    public static class HandlerC40501 extends Handler {
        /* JADX WARN: Invalid debug info offset */
        public HandlerC40501(Looper looper) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    @TargetApi(11)
    public static class ActivityManagerHoneycomb {
        /* JADX WARN: Invalid debug info offset */
        private ActivityManagerHoneycomb() {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static int m18846a(ActivityManager activityManager) {
            return 0;
        }
    }

    @TargetApi(12)
    public static class BitmapHoneycombMR1 {
        /* JADX WARN: Invalid debug info offset */
        private BitmapHoneycombMR1() {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static int m18847a(Bitmap bitmap) {
            return 0;
        }
    }

    public static class OkHttpLoaderCreator {
        /* JADX WARN: Invalid debug info offset */
        private OkHttpLoaderCreator() {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static Downloader m18848a(Context context) {
            return null;
        }
    }

    public static class PicassoThread extends Thread {
        /* JADX WARN: Invalid debug info offset */
        public PicassoThread(Runnable runnable) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
        }
    }

    public static class PicassoThreadFactory implements ThreadFactory {
        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    private Utils() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public static long m18821a(java.io.File r7) {
        /*
            r0 = 0
            return r0
        L1c:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.Utils.m18821a(java.io.File):long");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static int m18822b(Context context) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static void m18823c() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static void m18824d() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static <T> T m18825e(T t, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: f */
    public static void m18826f(java.io.InputStream r0) {
        /*
            return
        L6:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.Utils.m18826f(java.io.InputStream):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static File m18827g(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static Downloader m18828h(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static String m18829i(Request request) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static String m18830j(Request request, StringBuilder sb) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static void m18831k(Looper looper) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static int m18832l(Bitmap bitmap) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public static String m18833m(BitmapHunter bitmapHunter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public static String m18834n(BitmapHunter bitmapHunter, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0026
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: o */
    public static int m18835o(android.content.res.Resources r6, com.squareup.picasso.Request r7) throws java.io.FileNotFoundException {
        /*
            r0 = 0
            return r0
        L31:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.Utils.m18835o(android.content.res.Resources, com.squareup.picasso.Request):int");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: p */
    public static android.content.res.Resources m18836p(android.content.Context r2, com.squareup.picasso.Request r3) throws java.io.FileNotFoundException {
        /*
            r0 = 0
            return r0
        L18:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.Utils.m18836p(android.content.Context, com.squareup.picasso.Request):android.content.res.Resources");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public static <T> T m18837q(Context context, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public static boolean m18838r(Context context, String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: s */
    public static boolean m18839s(android.content.Context r2) {
        /*
            r0 = 0
            return r0
        Le:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.Utils.m18839s(android.content.Context):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public static boolean m18840t() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public static boolean m18841u(InputStream inputStream) throws IOException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public static void m18842v(String str, String str2, String str3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public static void m18843w(String str, String str2, String str3, String str4) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: x */
    public static boolean m18844x(java.lang.String r4) {
        /*
            r0 = 0
            return r0
        L30:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.Utils.m18844x(java.lang.String):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public static byte[] m18845y(InputStream inputStream) throws IOException {
        return null;
    }
}
