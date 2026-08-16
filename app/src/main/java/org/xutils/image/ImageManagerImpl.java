package org.xutils.image;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.io.File;
import org.xutils.ImageManager;
import org.xutils.common.Callback;

/* JADX INFO: loaded from: classes.dex */
public final class ImageManagerImpl implements ImageManager {

    /* JADX INFO: renamed from: a */
    public static final Object f18293a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile ImageManagerImpl f18294b;

    /* JADX INFO: renamed from: org.xutils.image.ImageManagerImpl$1 */
    public class RunnableC51371 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ImageView f18295a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f18296b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ImageManagerImpl f18297c;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC51371(ImageManagerImpl imageManagerImpl, ImageView imageView, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: org.xutils.image.ImageManagerImpl$2 */
    public class RunnableC51382 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ImageView f18298a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f18299b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ImageOptions f18300c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ImageManagerImpl f18301d;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC51382(ImageManagerImpl imageManagerImpl, ImageView imageView, String str, ImageOptions imageOptions) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: org.xutils.image.ImageManagerImpl$3 */
    public class RunnableC51393 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ImageView f18302a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f18303b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Callback.CommonCallback f18304c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ImageManagerImpl f18305d;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC51393(ImageManagerImpl imageManagerImpl, ImageView imageView, String str, Callback.CommonCallback commonCallback) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: org.xutils.image.ImageManagerImpl$4 */
    public class RunnableC51404 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ImageView f18306a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f18307b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ImageOptions f18308c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Callback.CommonCallback f18309d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ImageManagerImpl f18310e;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC51404(ImageManagerImpl imageManagerImpl, ImageView imageView, String str, ImageOptions imageOptions, Callback.CommonCallback commonCallback) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    private ImageManagerImpl() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: i */
    public static void m27237i() {
        /*
            return
        L13:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.image.ImageManagerImpl.m27237i():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.ImageManager
    /* JADX INFO: renamed from: a */
    public void mo26650a(ImageView imageView, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.ImageManager
    /* JADX INFO: renamed from: b */
    public Callback.Cancelable mo26651b(String str, ImageOptions imageOptions, Callback.CommonCallback<Drawable> commonCallback) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.ImageManager
    /* JADX INFO: renamed from: c */
    public Callback.Cancelable mo26652c(String str, ImageOptions imageOptions, Callback.CacheCallback<File> cacheCallback) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.ImageManager
    /* JADX INFO: renamed from: d */
    public void mo26653d() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.ImageManager
    /* JADX INFO: renamed from: e */
    public void mo26654e(ImageView imageView, String str, ImageOptions imageOptions) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.ImageManager
    /* JADX INFO: renamed from: f */
    public void mo26655f(ImageView imageView, String str, ImageOptions imageOptions, Callback.CommonCallback<Drawable> commonCallback) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.ImageManager
    /* JADX INFO: renamed from: g */
    public void mo26656g(ImageView imageView, String str, Callback.CommonCallback<Drawable> commonCallback) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.ImageManager
    /* JADX INFO: renamed from: h */
    public void mo26657h() {
    }
}
