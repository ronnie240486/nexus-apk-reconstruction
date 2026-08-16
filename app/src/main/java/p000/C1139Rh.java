package p000;

import android.content.Context;
import android.media.ViviTV.model.persistent.EpgItemInfo;
import android.media.ViviTV.model.persistent.LiveChannelInfo;
import android.os.AsyncTask;
import android.util.Pair;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: Rh */
/* JADX INFO: loaded from: classes.dex */
public class C1139Rh {

    /* JADX INFO: renamed from: h */
    public static final String f2973h = "EpgGlobalCache";

    /* JADX INFO: renamed from: i */
    public static C1139Rh f2974i;

    /* JADX INFO: renamed from: a */
    public Map<String, c> f2975a;

    /* JADX INFO: renamed from: b */
    public Map<String, EpgItemInfo> f2976b;

    /* JADX INFO: renamed from: c */
    public Map<String, List<EpgItemInfo>> f2977c;

    /* JADX INFO: renamed from: d */
    public Context f2978d;

    /* JADX INFO: renamed from: e */
    public C5176pP f2979e;

    /* JADX INFO: renamed from: f */
    public AtomicBoolean f2980f;

    /* JADX INFO: renamed from: g */
    public List<WeakReference<e>> f2981g;

    /* JADX INFO: renamed from: Rh$a */
    public class a extends AsyncTask<Void, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1139Rh f2982a;

        /* JADX WARN: Invalid debug info offset */
        public a(C1139Rh c1139Rh) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public java.lang.Boolean m5335a(java.lang.Void... r1) {
            /*
                r0 = this;
                r0 = 0
                return r0
            L10:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C1139Rh.a.m5335a(java.lang.Void[]):java.lang.Boolean");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m5336b(Boolean bool) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Boolean doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onCancelled() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX INFO: renamed from: Rh$b */
    public class b extends TimerTask {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1139Rh f2983a;

        /* JADX WARN: Invalid debug info offset */
        public b(C1139Rh c1139Rh) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: Rh$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public String f2984a;

        /* JADX INFO: renamed from: b */
        public List<String> f2985b;

        /* JADX INFO: renamed from: c */
        public HashMap<String, List<EpgItemInfo>> f2986c;

        /* JADX WARN: Invalid debug info offset */
        public c(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ List m5337a(c cVar) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ HashMap m5338b(c cVar) {
            return null;
        }
    }

    /* JADX INFO: renamed from: Rh$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public EpgItemInfo f2987a;

        /* JADX INFO: renamed from: b */
        public int f2988b;

        /* JADX INFO: renamed from: c */
        public List<EpgItemInfo> f2989c;

        /* JADX WARN: Invalid debug info offset */
        public d(EpgItemInfo epgItemInfo, int i, List<EpgItemInfo> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ EpgItemInfo m5339a(d dVar) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ int m5340b(d dVar) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ List m5341c(d dVar) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public boolean m5342d() {
            return false;
        }
    }

    /* JADX INFO: renamed from: Rh$e */
    public interface e {
        /* JADX INFO: renamed from: E */
        void mo5343E();

        /* JADX INFO: renamed from: r */
        void mo5344r();
    }

    /* JADX WARN: Invalid debug info offset */
    public C1139Rh(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m5307a(C1139Rh c1139Rh) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5308b(C1139Rh c1139Rh) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m5309c(C1139Rh c1139Rh) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ AtomicBoolean m5310d(C1139Rh c1139Rh) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m5311e(C1139Rh c1139Rh) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m5312f(C1139Rh c1139Rh) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: k */
    public static synchronized p000.C1139Rh m5313k(android.content.Context r2) {
        /*
            r0 = 0
            return r0
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1139Rh.m5313k(android.content.Context):Rh");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public void m5314A() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public void m5315B() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public void m5316g(e eVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: h */
    public final synchronized void m5317h() {
        /*
            r5 = this;
            return
        L23:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1139Rh.m5317h():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0065
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: i */
    public final void m5318i(java.util.Map<java.lang.String, p000.C1139Rh.c> r5, java.util.HashMap<java.lang.String, java.lang.String> r6, android.media.ViviTV.model.persistent.EpgItemInfo r7) {
        /*
            r4 = this;
            return
        L6e:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1139Rh.m5318i(java.util.Map, java.util.HashMap, android.media.ViviTV.model.persistent.EpgItemInfo):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public final void m5319j() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public List<Pair<String, List<EpgItemInfo>>> m5320l(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: m */
    public java.util.List<android.media.ViviTV.model.persistent.EpgItemInfo> m5321m() {
        /*
            r12 = this;
            r0 = 0
            return r0
        L24:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1139Rh.m5321m():java.util.List");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public EpgItemInfo m5322n(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public final d m5323o(c cVar) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    /* JADX INFO: renamed from: p */
    public final Date m5324p(Date date) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    /* JADX INFO: renamed from: q */
    public final String m5325q() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public List<EpgItemInfo> m5326r(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public final void m5327s() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public boolean m5328t() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0026
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: u */
    public final void m5329u(android.media.ViviTV.model.persistent.LiveChannelInfo r7, p000.C1139Rh.d r8, p000.C1139Rh.c r9, int r10) {
        /*
            r6 = this;
            return
        L86:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1139Rh.m5329u(android.media.ViviTV.model.persistent.LiveChannelInfo, Rh$d, Rh$c, int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public final void m5330v() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public final void m5331w() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public final void m5332x(LiveChannelInfo liveChannelInfo, List<EpgItemInfo> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: y */
    public final synchronized void m5333y() {
        /*
            r9 = this;
            return
        L44:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1139Rh.m5333y():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public void m5334z(e eVar) {
    }
}
