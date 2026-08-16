package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.NetworkInfo;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
class BitmapHunter implements Runnable {

    /* JADX INFO: renamed from: t */
    public static final Object f12355t = new Object();

    /* JADX INFO: renamed from: u */
    public static final ThreadLocal<StringBuilder> f12356u = new ThreadLocal<StringBuilder>() { // from class: com.squareup.picasso.BitmapHunter.1
        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public StringBuilder m18607a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ StringBuilder initialValue() {
            return null;
        }
    };

    /* JADX INFO: renamed from: v */
    public static final AtomicInteger f12357v = new AtomicInteger();

    /* JADX INFO: renamed from: w */
    public static final RequestHandler f12358w = new RequestHandler() { // from class: com.squareup.picasso.BitmapHunter.2
        @Override // com.squareup.picasso.RequestHandler
        /* JADX INFO: renamed from: c */
        public boolean mo9413c(Request request) {
            return true;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.squareup.picasso.RequestHandler
        /* JADX INFO: renamed from: f */
        public RequestHandler.Result mo9414f(Request request, int i) throws IOException {
            return null;
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f12359a;

    /* JADX INFO: renamed from: b */
    public final Picasso f12360b;

    /* JADX INFO: renamed from: c */
    public final Dispatcher f12361c;

    /* JADX INFO: renamed from: d */
    public final Cache f12362d;

    /* JADX INFO: renamed from: e */
    public final Stats f12363e;

    /* JADX INFO: renamed from: f */
    public final String f12364f;

    /* JADX INFO: renamed from: g */
    public final Request f12365g;

    /* JADX INFO: renamed from: h */
    public final int f12366h;

    /* JADX INFO: renamed from: i */
    public int f12367i;

    /* JADX INFO: renamed from: j */
    public final RequestHandler f12368j;

    /* JADX INFO: renamed from: k */
    public Action f12369k;

    /* JADX INFO: renamed from: l */
    public List<Action> f12370l;

    /* JADX INFO: renamed from: m */
    public Bitmap f12371m;

    /* JADX INFO: renamed from: n */
    public Future<?> f12372n;

    /* JADX INFO: renamed from: o */
    public Picasso.LoadedFrom f12373o;

    /* JADX INFO: renamed from: p */
    public Exception f12374p;

    /* JADX INFO: renamed from: q */
    public int f12375q;

    /* JADX INFO: renamed from: r */
    public int f12376r;

    /* JADX INFO: renamed from: s */
    public Picasso.Priority f12377s;

    /* JADX INFO: renamed from: com.squareup.picasso.BitmapHunter$3 */
    public static class RunnableC40373 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Transformation f12378a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RuntimeException f12379b;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC40373(Transformation transformation, RuntimeException runtimeException) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: com.squareup.picasso.BitmapHunter$4 */
    public static class RunnableC40384 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ StringBuilder f12380a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC40384(StringBuilder sb) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: com.squareup.picasso.BitmapHunter$5 */
    public static class RunnableC40395 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Transformation f12381a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC40395(Transformation transformation) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: com.squareup.picasso.BitmapHunter$6 */
    public static class RunnableC40406 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Transformation f12382a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC40406(Transformation transformation) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public BitmapHunter(Picasso picasso, Dispatcher dispatcher, Cache cache, Stats stats, Action action, RequestHandler requestHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public static android.graphics.Bitmap m18583a(java.util.List<com.squareup.picasso.Transformation> r6, android.graphics.Bitmap r7) {
        /*
            r0 = 0
            return r0
        L80:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.BitmapHunter.m18583a(java.util.List, android.graphics.Bitmap):android.graphics.Bitmap");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static Bitmap m18584e(InputStream inputStream, Request request) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static BitmapHunter m18585g(Picasso picasso, Dispatcher dispatcher, Cache cache, Stats stats, Action action) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public static boolean m18586t(boolean z, int i, int i2, int i3, int i4) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public static Bitmap m18587w(Request request, Bitmap bitmap, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public static void m18588x(Request request) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public void m18589b(Action action) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public boolean m18590c() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public final Picasso.Priority m18591d() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public void m18592f(Action action) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public Action m18593h() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public List<Action> m18594i() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public Request m18595j() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public Exception m18596k() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public String m18597l() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public Picasso.LoadedFrom m18598m() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public int m18599n() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public Picasso m18600o() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public Picasso.Priority m18601p() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public Bitmap m18602q() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0059
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: r */
    public android.graphics.Bitmap m18603r() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.BitmapHunter.m18603r():android.graphics.Bitmap");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.lang.Runnable
    public void run() {
        /*
            r5 = this;
            return
        L19:
        L1c:
        L1e:
        L20:
        L22:
        L24:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.BitmapHunter.run():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public boolean m18604s() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public boolean m18605u(boolean z, NetworkInfo networkInfo) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public boolean m18606v() {
        return false;
    }
}
