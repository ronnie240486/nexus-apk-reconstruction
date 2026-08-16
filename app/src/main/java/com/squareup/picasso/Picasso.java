package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.ImageView;
import android.widget.RemoteViews;
import androidx.core.internal.view.SupportMenu;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class Picasso {

    /* JADX INFO: renamed from: p */
    public static final String f12463p = "Picasso";

    /* JADX INFO: renamed from: q */
    public static final Handler f12464q = new Handler(Looper.getMainLooper()) { // from class: com.squareup.picasso.Picasso.1
        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    };

    /* JADX INFO: renamed from: r */
    public static volatile Picasso f12465r = null;

    /* JADX INFO: renamed from: a */
    public final Listener f12466a;

    /* JADX INFO: renamed from: b */
    public final RequestTransformer f12467b;

    /* JADX INFO: renamed from: c */
    public final CleanupThread f12468c;

    /* JADX INFO: renamed from: d */
    public final List<RequestHandler> f12469d;

    /* JADX INFO: renamed from: e */
    public final Context f12470e;

    /* JADX INFO: renamed from: f */
    public final Dispatcher f12471f;

    /* JADX INFO: renamed from: g */
    public final Cache f12472g;

    /* JADX INFO: renamed from: h */
    public final Stats f12473h;

    /* JADX INFO: renamed from: i */
    public final Map<Object, Action> f12474i;

    /* JADX INFO: renamed from: j */
    public final Map<ImageView, DeferredRequestCreator> f12475j;

    /* JADX INFO: renamed from: k */
    public final ReferenceQueue<Object> f12476k;

    /* JADX INFO: renamed from: l */
    public final Bitmap.Config f12477l;

    /* JADX INFO: renamed from: m */
    public boolean f12478m;

    /* JADX INFO: renamed from: n */
    public volatile boolean f12479n;

    /* JADX INFO: renamed from: o */
    public boolean f12480o;

    public static class Builder {

        /* JADX INFO: renamed from: a */
        public final Context f12481a;

        /* JADX INFO: renamed from: b */
        public Downloader f12482b;

        /* JADX INFO: renamed from: c */
        public ExecutorService f12483c;

        /* JADX INFO: renamed from: d */
        public Cache f12484d;

        /* JADX INFO: renamed from: e */
        public Listener f12485e;

        /* JADX INFO: renamed from: f */
        public RequestTransformer f12486f;

        /* JADX INFO: renamed from: g */
        public List<RequestHandler> f12487g;

        /* JADX INFO: renamed from: h */
        public Bitmap.Config f12488h;

        /* JADX INFO: renamed from: i */
        public boolean f12489i;

        /* JADX INFO: renamed from: j */
        public boolean f12490j;

        /* JADX WARN: Invalid debug info offset */
        public Builder(Context context) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Builder m18699a(RequestHandler requestHandler) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public Picasso m18700b() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Deprecated
        /* JADX INFO: renamed from: c */
        public Builder m18701c(boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public Builder m18702d(Bitmap.Config config) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public Builder m18703e(Downloader downloader) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: f */
        public Builder m18704f(ExecutorService executorService) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: g */
        public Builder m18705g(boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: h */
        public Builder m18706h(Listener listener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: i */
        public Builder m18707i(boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: j */
        public Builder m18708j(Cache cache) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k */
        public Builder m18709k(RequestTransformer requestTransformer) {
            return null;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class CleanupThread extends Thread {

        /* JADX INFO: renamed from: a */
        public final ReferenceQueue<Object> f12491a;

        /* JADX INFO: renamed from: b */
        public final Handler f12492b;

        /* JADX INFO: renamed from: com.squareup.picasso.Picasso$CleanupThread$1 */
        public class RunnableC40451 implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ Exception f12493a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ CleanupThread f12494b;

            /* JADX WARN: Invalid debug info offset */
            public RunnableC40451(CleanupThread cleanupThread, Exception exc) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public CleanupThread(ReferenceQueue<Object> referenceQueue, Handler handler) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public void m18710a() {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            /*
                r3 = this;
                return
            L24:
            L34:
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.Picasso.CleanupThread.run():void");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface Listener {
        /* JADX INFO: renamed from: a */
        void m18711a(Picasso picasso, Uri uri, Exception exc);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public enum LoadedFrom {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(SupportMenu.CATEGORY_MASK);

        final int debugColor;

        LoadedFrom(int i) {
            this.debugColor = i;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public enum Priority {
        LOW,
        NORMAL,
        HIGH
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface RequestTransformer {

        /* JADX INFO: renamed from: a */
        public static final RequestTransformer f12495a = new RequestTransformer() { // from class: com.squareup.picasso.Picasso.RequestTransformer.1
            @Override // com.squareup.picasso.Picasso.RequestTransformer
            /* JADX INFO: renamed from: a */
            public Request mo18712a(Request request) {
                return request;
            }
        };

        /* JADX INFO: renamed from: a */
        Request mo18712a(Request request);
    }

    /* JADX WARN: Invalid debug info offset */
    public Picasso(Context context, Dispatcher dispatcher, Cache cache, Listener listener, RequestTransformer requestTransformer, List<RequestHandler> list, Stats stats, Bitmap.Config config, boolean z, boolean z2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: D */
    public static void m18665D(com.squareup.picasso.Picasso r2) {
        /*
            return
        Lb:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.Picasso.m18665D(com.squareup.picasso.Picasso):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: H */
    public static com.squareup.picasso.Picasso m18666H(android.content.Context r2) {
        /*
            r0 = 0
            return r0
        L17:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.Picasso.m18666H(android.content.Context):com.squareup.picasso.Picasso");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18667a(Picasso picasso, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: A */
    public void m18668A(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public void m18669B(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public void m18670C(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public void m18671E() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F */
    public void m18672F(Action action) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public Request m18673G(Request request) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public boolean m18674b() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public final void m18675c(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public void m18676d(ImageView imageView) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public void m18677e(RemoteViews remoteViews, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public void m18678f(Target target) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public void m18679g(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public void m18680h(BitmapHunter bitmapHunter) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public void m18681i(ImageView imageView, DeferredRequestCreator deferredRequestCreator) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public final void m18682j(Bitmap bitmap, LoadedFrom loadedFrom, Action action) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public void m18683k(Action action) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public List<RequestHandler> m18684l() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public StatsSnapshot m18685m() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public void m18686n(Uri uri) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public void m18687o(File file) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public void m18688p(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: q */
    public boolean m18689q() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public boolean m18690r() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public RequestCreator m18691s(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public RequestCreator m18692t(Uri uri) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public RequestCreator m18693u(File file) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public RequestCreator m18694v(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public void m18695w(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public Bitmap m18696x(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public void m18697y(Action action) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public void m18698z(Object obj) {
    }
}
