package android.media.ViviTV.player;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.media.ViviTV.model.persistent.EpgItemInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.LruCache;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import p000.AsyncTaskC4636jq;

/* JADX INFO: loaded from: classes.dex */
public class LiveControl extends LinearLayout {

    /* JADX INFO: renamed from: E */
    public static final List<EpgItemInfo> f8893E = new ArrayList();

    /* JADX INFO: renamed from: F */
    public static final boolean f8894F = true;

    /* JADX INFO: renamed from: G */
    public static final int f8895G = 10000;

    /* JADX INFO: renamed from: H */
    public static final int f8896H = 1;

    /* JADX INFO: renamed from: I */
    public static final int f8897I = 0;

    /* JADX INFO: renamed from: A */
    public String f8898A;

    /* JADX INFO: renamed from: B */
    public int f8899B;

    /* JADX INFO: renamed from: C */
    public Runnable f8900C;

    /* JADX INFO: renamed from: D */
    public Runnable f8901D;

    /* JADX INFO: renamed from: a */
    public Context f8902a;

    /* JADX INFO: renamed from: b */
    public Handler f8903b;

    /* JADX INFO: renamed from: c */
    public WindowManager f8904c;

    /* JADX INFO: renamed from: d */
    public TextView f8905d;

    /* JADX INFO: renamed from: e */
    public TextView f8906e;

    /* JADX INFO: renamed from: f */
    public TextView f8907f;

    /* JADX INFO: renamed from: g */
    public TextView f8908g;

    /* JADX INFO: renamed from: h */
    public TextView f8909h;

    /* JADX INFO: renamed from: i */
    public TextView f8910i;

    /* JADX INFO: renamed from: j */
    public TextView f8911j;

    /* JADX INFO: renamed from: k */
    public TextView f8912k;

    /* JADX INFO: renamed from: l */
    public ImageView f8913l;

    /* JADX INFO: renamed from: m */
    public View f8914m;

    /* JADX INFO: renamed from: n */
    public AnimationDrawable f8915n;

    /* JADX INFO: renamed from: o */
    public int f8916o;

    /* JADX INFO: renamed from: p */
    public String f8917p;

    /* JADX INFO: renamed from: q */
    public LruCache<String, List<EpgItemInfo>> f8918q;

    /* JADX INFO: renamed from: r */
    public long f8919r;

    /* JADX INFO: renamed from: s */
    public int f8920s;

    /* JADX INFO: renamed from: t */
    public WindowManager.LayoutParams f8921t;

    /* JADX INFO: renamed from: u */
    public ImageView f8922u;

    /* JADX INFO: renamed from: v */
    public WindowManager.LayoutParams f8923v;

    /* JADX INFO: renamed from: w */
    public long f8924w;

    /* JADX INFO: renamed from: x */
    public long f8925x;

    /* JADX INFO: renamed from: y */
    public Runnable f8926y;

    /* JADX INFO: renamed from: z */
    public int f8927z;

    /* JADX INFO: renamed from: android.media.ViviTV.player.LiveControl$a */
    public class AsyncTaskC2232a extends AsyncTask<Void, Integer, List<EpgItemInfo>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LiveControl f8928a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2232a(LiveControl liveControl) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public List<EpgItemInfo> m13368a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m13369b(List<EpgItemInfo> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ List<EpgItemInfo> doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(List<EpgItemInfo> list) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LiveControl$b */
    public class RunnableC2233b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LiveControl f8929a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC2233b(LiveControl liveControl) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LiveControl$c */
    public class RunnableC2234c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LiveControl f8930a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC2234c(LiveControl liveControl) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LiveControl$d */
    public class C2235d implements AsyncTaskC4636jq.a<Bundle> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LiveControl f8931a;

        /* JADX WARN: Invalid debug info offset */
        public C2235d(LiveControl liveControl) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AsyncTaskC4636jq.a
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ Bundle mo3494a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000e
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: b */
        public android.os.Bundle m13370b() {
            /*
                r3 = this;
                r0 = 0
                return r0
            L19:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.LiveControl.C2235d.m13370b():android.os.Bundle");
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LiveControl$e */
    public class C2236e implements AsyncTaskC4636jq.b<Bundle> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LiveControl f8932a;

        /* JADX WARN: Invalid debug info offset */
        public C2236e(LiveControl liveControl) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AsyncTaskC4636jq.b
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ void mo3496a(Bundle bundle) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m13371b(Bundle bundle) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LiveControl$f */
    public class RunnableC2237f implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LiveControl f8933a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC2237f(LiveControl liveControl) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LiveControl$g */
    public static class C2238g {

        /* JADX INFO: renamed from: a */
        public EpgItemInfo f8934a;

        /* JADX INFO: renamed from: b */
        public EpgItemInfo f8935b;
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.LiveControl$h */
    public interface InterfaceC2239h {
        /* JADX INFO: renamed from: a */
        void m13372a();

        /* JADX INFO: renamed from: b */
        void m13373b();
    }

    /* JADX WARN: Invalid debug info offset */
    public LiveControl(Context context, Handler handler) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m13338a(LiveControl liveControl) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Context m13339b(LiveControl liveControl) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static void m13340c(LiveControl liveControl) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m13341d(LiveControl liveControl) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ TextView m13342e(LiveControl liveControl) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ TextView m13343f(LiveControl liveControl) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m13344g(LiveControl liveControl) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Runnable m13345h(LiveControl liveControl) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ List m13346i() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ LruCache m13347j(LiveControl liveControl) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m13348k(LiveControl liveControl) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ long m13349l(LiveControl liveControl) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ long m13350m(LiveControl liveControl, long j) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ long m13351n(LiveControl liveControl) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ long m13352o(LiveControl liveControl, long j) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ TextView m13353p(LiveControl liveControl) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Runnable m13354q(LiveControl liveControl) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ Handler m13355r(LiveControl liveControl) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public void m13356A() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x003e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: B */
    public void m13357B(boolean r7) {
        /*
            r6 = this;
            return
        L46:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.LiveControl.m13357B(boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public void m13358C() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public final void m13359D() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public final void m13360s() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCWTime(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setChannelId(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setChannelName(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setChannelNum(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setEPG(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSource(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setState(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setStationLogo(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSysTime(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setWindowLayout(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public void m13361t() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public void m13362u(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public final void m13363v() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public final void m13364w() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public final void m13365x() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public void m13366y() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public final void m13367z() {
    }
}
