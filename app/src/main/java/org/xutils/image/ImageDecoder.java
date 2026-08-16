package org.xutils.image;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.xutils.cache.LruDiskCache;
import org.xutils.common.task.PriorityExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class ImageDecoder {

    /* JADX INFO: renamed from: a */
    public static final int f18253a;

    /* JADX INFO: renamed from: b */
    public static final AtomicInteger f18254b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public static final Object f18255c = new Object();

    /* JADX INFO: renamed from: d */
    public static final Object f18256d = new Object();

    /* JADX INFO: renamed from: e */
    public static final byte[] f18257e = {71, 73, 70};

    /* JADX INFO: renamed from: f */
    public static final Executor f18258f = new PriorityExecutor(1, true);

    /* JADX INFO: renamed from: g */
    public static final LruDiskCache f18259g = LruDiskCache.m26711p("xUtils_img_thumb");

    /* JADX INFO: renamed from: org.xutils.image.ImageDecoder$1 */
    public static class RunnableC51331 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ File f18260a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ImageOptions f18261b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Bitmap f18262c;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC51331(File file, ImageOptions imageOptions, Bitmap bitmap) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    static {
        f18253a = Runtime.getRuntime().availableProcessors() > 4 ? 2 : 1;
    }

    /* JADX WARN: Invalid debug info offset */
    private ImageDecoder() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m27202a(File file, ImageOptions imageOptions, Bitmap bitmap) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static int m27203b(int i, int i2, int i3, int i4) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static void m27204c() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static Bitmap m27205d(Bitmap bitmap, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static Bitmap m27206e(Bitmap bitmap, int i, boolean z, boolean z2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static Bitmap m27207f(Bitmap bitmap, int i, int i2, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static Bitmap m27208g(Bitmap bitmap, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x002c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: h */
    public static android.graphics.Bitmap m27209h(java.io.File r11, org.xutils.image.ImageOptions r12, org.xutils.common.Callback.Cancelable r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.image.ImageDecoder.m27209h(java.io.File, org.xutils.image.ImageOptions, org.xutils.common.Callback$Cancelable):android.graphics.Bitmap");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0035
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: i */
    public static android.graphics.drawable.Drawable m27210i(java.io.File r6, org.xutils.image.ImageOptions r7, org.xutils.common.Callback.Cancelable r8) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.image.ImageDecoder.m27210i(java.io.File, org.xutils.image.ImageOptions, org.xutils.common.Callback$Cancelable):android.graphics.drawable.Drawable");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0016
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: j */
    public static android.graphics.Movie m27211j(java.io.File r5, org.xutils.image.ImageOptions r6, org.xutils.common.Callback.Cancelable r7) throws java.io.IOException {
        /*
            r0 = 0
            return r0
        L25:
        L27:
        L29:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.image.ImageDecoder.m27211j(java.io.File, org.xutils.image.ImageOptions, org.xutils.common.Callback$Cancelable):android.graphics.Movie");
    }

    /* JADX WARN: Invalid debug info offset */
    @SuppressLint({"ExifInterface"})
    /* JADX INFO: renamed from: k */
    public static int m27212k(String str) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x002c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: l */
    public static android.graphics.Bitmap m27213l(java.io.File r5, org.xutils.image.ImageOptions r6) {
        /*
            r0 = 0
            return r0
        L4f:
        L55:
        L60:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.image.ImageDecoder.m27213l(java.io.File, org.xutils.image.ImageOptions):android.graphics.Bitmap");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: m */
    public static boolean m27214m(java.io.File r4) {
        /*
            r0 = 0
            return r0
        L17:
        L1a:
        L27:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.image.ImageDecoder.m27214m(java.io.File):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: n */
    public static android.graphics.Bitmap m27215n(android.graphics.Bitmap r7, int r8, boolean r9) {
        /*
            r0 = 0
            return r0
        L1c:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.image.ImageDecoder.m27215n(android.graphics.Bitmap, int, boolean):android.graphics.Bitmap");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x002b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: o */
    public static void m27216o(java.io.File r4, org.xutils.image.ImageOptions r5, android.graphics.Bitmap r6) {
        /*
            return
        L48:
        L4a:
        L55:
        L6a:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.image.ImageDecoder.m27216o(java.io.File, org.xutils.image.ImageOptions, android.graphics.Bitmap):void");
    }
}
