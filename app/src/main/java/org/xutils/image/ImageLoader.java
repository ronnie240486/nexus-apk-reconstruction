package org.xutils.image;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.widget.ImageView;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.xutils.C5141x;
import org.xutils.cache.LruCache;
import org.xutils.common.Callback;
import org.xutils.common.task.PriorityExecutor;
import org.xutils.http.RequestParams;

/* JADX INFO: loaded from: classes.dex */
final class ImageLoader implements Callback.PrepareCallback<File, Drawable>, Callback.CacheCallback<Drawable>, Callback.ProgressCallback<Drawable>, Callback.TypedCallback<Drawable>, Callback.Cancelable {

    /* JADX INFO: renamed from: p */
    public static final String f18264p = "xUtils_img";

    /* JADX INFO: renamed from: r */
    public static final int f18266r = 4194304;

    /* JADX INFO: renamed from: s */
    public static final LruCache<MemCacheKey, Drawable> f18267s;

    /* JADX INFO: renamed from: t */
    public static final HashMap<String, FakeImageView> f18268t;

    /* JADX INFO: renamed from: u */
    public static final Type f18269u;

    /* JADX INFO: renamed from: a */
    public MemCacheKey f18270a;

    /* JADX INFO: renamed from: b */
    public ImageOptions f18271b;

    /* JADX INFO: renamed from: c */
    public WeakReference<ImageView> f18272c;

    /* JADX INFO: renamed from: d */
    public final long f18273d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f18274e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f18275f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f18276g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f18277h;

    /* JADX INFO: renamed from: i */
    public Callback.Cancelable f18278i;

    /* JADX INFO: renamed from: j */
    public Callback.CommonCallback<Drawable> f18279j;

    /* JADX INFO: renamed from: k */
    public Callback.PrepareCallback<File, Drawable> f18280k;

    /* JADX INFO: renamed from: l */
    public Callback.CacheCallback<Drawable> f18281l;

    /* JADX INFO: renamed from: m */
    public Callback.ProgressCallback<Drawable> f18282m;

    /* JADX INFO: renamed from: n */
    public boolean f18283n;

    /* JADX INFO: renamed from: o */
    public static final AtomicLong f18263o = new AtomicLong(0);

    /* JADX INFO: renamed from: q */
    public static final Executor f18265q = new PriorityExecutor(10, false);

    /* JADX INFO: renamed from: org.xutils.image.ImageLoader$2 */
    public class RunnableC51352 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ImageLoader f18285a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC51352(ImageLoader imageLoader) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: org.xutils.image.ImageLoader$3 */
    public static class RunnableC51363 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Callback.CommonCallback f18286a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ImageView f18287b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ImageOptions f18288c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f18289d;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC51363(Callback.CommonCallback commonCallback, ImageView imageView, ImageOptions imageOptions, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    @SuppressLint({"ViewConstructor", "AppCompatCustomView"})
    public static final class FakeImageView extends ImageView {

        /* JADX INFO: renamed from: c */
        public static final AtomicInteger f18290c = new AtomicInteger(0);

        /* JADX INFO: renamed from: a */
        public final int f18291a;

        /* JADX INFO: renamed from: b */
        public Drawable f18292b;

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.ImageView
        public Drawable getDrawable() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public int hashCode() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.widget.ImageView
        public void setImageDrawable(Drawable drawable) {
        }

        @Override // android.view.View
        public void setLayerType(int i, Paint paint) {
        }

        @Override // android.widget.ImageView
        public void setScaleType(ImageView.ScaleType scaleType) {
        }

        @Override // android.view.View
        public void startAnimation(Animation animation) {
        }
    }

    static {
        LruCache<MemCacheKey, Drawable> lruCache = new LruCache<MemCacheKey, Drawable>(4194304) { // from class: org.xutils.image.ImageLoader.1

            /* JADX INFO: renamed from: i */
            public boolean f18284i;

            /* JADX WARN: Invalid debug info offset */
            @Override // org.xutils.cache.LruCache
            /* JADX INFO: renamed from: c */
            public /* bridge */ /* synthetic */ void mo26687c(boolean z, MemCacheKey memCacheKey, Drawable drawable, Drawable drawable2) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // org.xutils.cache.LruCache
            /* JADX INFO: renamed from: p */
            public /* bridge */ /* synthetic */ int mo26700p(MemCacheKey memCacheKey, Drawable drawable) {
                return 0;
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // org.xutils.cache.LruCache
            /* JADX INFO: renamed from: r */
            public void mo26702r(int i) {
            }

            /* JADX WARN: Invalid debug info offset */
            /* JADX INFO: renamed from: s */
            public void m27235s(boolean z, MemCacheKey memCacheKey, Drawable drawable, Drawable drawable2) {
            }

            /* JADX WARN: Invalid debug info offset */
            /* JADX INFO: renamed from: t */
            public int m27236t(MemCacheKey memCacheKey, Drawable drawable) {
                return 0;
            }
        };
        f18267s = lruCache;
        int memoryClass = (((ActivityManager) C5141x.m27314a().getSystemService("activity")).getMemoryClass() * 1048576) / 8;
        lruCache.m26697m(memoryClass >= 4194304 ? memoryClass : 4194304);
        f18268t = new HashMap<>();
        f18269u = File.class;
    }

    /* JADX WARN: Invalid debug info offset */
    private ImageLoader() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public static void m27217A(ImageView imageView, ImageOptions imageOptions, String str, Callback.CommonCallback<?> commonCallback) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ WeakReference m27218n(ImageLoader imageLoader) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ MemCacheKey m27219o(ImageLoader imageLoader) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ ImageOptions m27220p(ImageLoader imageLoader) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Callback.CommonCallback m27221q(ImageLoader imageLoader) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public static void m27222r() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public static void m27223s() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public static RequestParams m27224t(Context context, String str, ImageOptions imageOptions) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0080
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: u */
    public static org.xutils.common.Callback.Cancelable m27225u(android.widget.ImageView r6, java.lang.String r7, org.xutils.image.ImageOptions r8, org.xutils.common.Callback.CommonCallback<android.graphics.drawable.Drawable> r9) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.image.ImageLoader.m27225u(android.widget.ImageView, java.lang.String, org.xutils.image.ImageOptions, org.xutils.common.Callback$CommonCallback):org.xutils.common.Callback$Cancelable");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public static Callback.Cancelable m27226w(String str, ImageOptions imageOptions, Callback.CommonCallback<Drawable> commonCallback) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public static Callback.Cancelable m27227x(String str, ImageOptions imageOptions, Callback.CacheCallback<File> cacheCallback) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: B */
    public android.graphics.drawable.Drawable m27228B(java.io.File r4) throws java.lang.Throwable {
        /*
            r3 = this;
            r0 = 0
            return r0
        L1b:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.image.ImageLoader.m27228B(java.io.File):android.graphics.drawable.Drawable");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public final void m27229C() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public final void m27230D(Drawable drawable) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public final boolean m27231E(boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.Callback.CommonCallback
    /* JADX INFO: renamed from: a */
    public void mo16802a(Callback.CancelledException cancelledException) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.Callback.TypedCallback
    /* JADX INFO: renamed from: b */
    public Type mo26731b() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.Callback.Cancelable
    public void cancel() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.Callback.ProgressCallback
    /* JADX INFO: renamed from: e */
    public void mo16803e() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.Callback.CommonCallback
    /* JADX INFO: renamed from: f */
    public void mo16804f(Throwable th, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.Callback.ProgressCallback
    /* JADX INFO: renamed from: h */
    public void mo16805h() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.Callback.PrepareCallback
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ Drawable mo26729i(File file) throws Throwable {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.Callback.Cancelable
    public boolean isCancelled() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.Callback.ProgressCallback
    /* JADX INFO: renamed from: j */
    public void mo16806j(long j, long j2, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.Callback.CacheCallback
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ boolean mo26723k(Drawable drawable) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0017
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.xutils.common.Callback.CommonCallback
    public void onFinished() {
        /*
            r3 = this;
            return
        L33:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.image.ImageLoader.onFinished():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.common.Callback.CommonCallback
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x005a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: v */
    public final org.xutils.common.Callback.Cancelable m27232v(android.widget.ImageView r3, java.lang.String r4, org.xutils.image.ImageOptions r5, org.xutils.common.Callback.CommonCallback<android.graphics.drawable.Drawable> r6) {
        /*
            r2 = this;
            r0 = 0
            return r0
        L74:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.image.ImageLoader.m27232v(android.widget.ImageView, java.lang.String, org.xutils.image.ImageOptions, org.xutils.common.Callback$CommonCallback):org.xutils.common.Callback$Cancelable");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public boolean m27233y(Drawable drawable) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public void m27234z(Drawable drawable) {
    }
}
