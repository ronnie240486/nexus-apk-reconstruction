package android.media.ViviTV.player.widget;

import android.content.Context;
import android.os.Handler;
import com.google.android.exoplayer2.SimpleExoPlayer;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: android.media.ViviTV.player.widget.c */
/* JADX INFO: loaded from: classes.dex */
public class C2310c {

    /* JADX INFO: renamed from: e */
    public static final String f9521e = "P2P";

    /* JADX INFO: renamed from: f */
    public static final int f9522f = 5;

    /* JADX INFO: renamed from: a */
    public final WeakReference<SimpleExoPlayer> f9523a;

    /* JADX INFO: renamed from: b */
    public final Handler f9524b;

    /* JADX INFO: renamed from: c */
    public final long[] f9525c;

    /* JADX INFO: renamed from: d */
    public Timer f9526d;

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.c$a */
    public class a extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b f9527a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2310c f9528b;

        /* JADX INFO: renamed from: android.media.ViviTV.player.widget.c$a$a, reason: collision with other inner class name */
        public class RunnableC5898a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ a f9529a;

            /* JADX INFO: renamed from: android.media.ViviTV.player.widget.c$a$a$a, reason: collision with other inner class name */
            public class RunnableC5899a implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ RunnableC5898a f9530a;

                /* JADX WARN: Invalid debug info offset */
                public RunnableC5899a(RunnableC5898a runnableC5898a) {
                }

                /* JADX WARN: Invalid debug info offset */
                @Override // java.lang.Runnable
                public void run() {
                }
            }

            /* JADX WARN: Invalid debug info offset */
            public RunnableC5898a(a aVar) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public a(C2310c c2310c, b bVar) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.c$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo14039a();
    }

    /* JADX WARN: Invalid debug info offset */
    public C2310c(Context context, SimpleExoPlayer simpleExoPlayer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ WeakReference m14041a(C2310c c2310c) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m14042b(C2310c c2310c, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ long[] m14043c(C2310c c2310c) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Handler m14044d(C2310c c2310c) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m14045e(C2310c c2310c) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public final void m14046f(long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public final void m14047g() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public final void m14048h() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public void m14049i(b bVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public void m14050j() {
    }
}
