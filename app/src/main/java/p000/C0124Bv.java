package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.media.ViviTV.model.persistent.EpgItemInfo;
import android.media.ViviTV.model.persistent.LiveChannelInfo;
import android.media.ViviTV.model.persistent.LiveRecode;
import android.os.AsyncTask;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: Bv */
/* JADX INFO: loaded from: classes.dex */
public class C0124Bv {

    /* JADX INFO: renamed from: b */
    public static final String f350b = "LiveDataHelper";

    /* JADX INFO: renamed from: c */
    public static final boolean f351c = true;

    /* JADX INFO: renamed from: d */
    public static final ReentrantLock f352d = new ReentrantLock();

    /* JADX INFO: renamed from: e */
    public static C0124Bv f353e = null;

    /* JADX INFO: renamed from: f */
    public static int f354f = 0;

    /* JADX INFO: renamed from: g */
    public static HashMap<String, SparseArray<Integer>> f355g = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public SQLiteDatabase f356a;

    /* JADX INFO: renamed from: Bv$a */
    public class a extends TypeToken<List<EpgItemInfo>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0124Bv f357a;

        /* JADX WARN: Invalid debug info offset */
        public a(C0124Bv c0124Bv) {
        }
    }

    /* JADX INFO: renamed from: Bv$b */
    public class b extends AsyncTask<Void, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f358a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f359b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C0124Bv f360c;

        /* JADX WARN: Invalid debug info offset */
        public b(C0124Bv c0124Bv, int i, int i2) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Boolean m770a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Boolean doInBackground(Void[] voidArr) {
            return null;
        }
    }

    /* JADX INFO: renamed from: Bv$c */
    public class c extends AsyncTask<Void, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f361a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f362b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C0124Bv f363c;

        /* JADX WARN: Invalid debug info offset */
        public c(C0124Bv c0124Bv, int i, long j) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Boolean m771a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Boolean doInBackground(Void[] voidArr) {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C0124Bv(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m739a(C0124Bv c0124Bv, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static int m740i(String str, List<LiveChannelInfo> list, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: q */
    public static synchronized p000.C0124Bv m741q(android.content.Context r2) {
        /*
            r0 = 0
            return r0
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0124Bv.m741q(android.content.Context):Bv");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public static int m742r() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public void m743A(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public final void m744B(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public void m745C(int i, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public void m746D(int i, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public void m747E(int i, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final void m748b(List<LiveChannelInfo> list, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public void m749c(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    /* JADX INFO: renamed from: d */
    public final LiveChannelInfo m750d(LiveChannelInfo liveChannelInfo) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public final List<LiveChannelInfo> m751e(List<LiveChannelInfo> list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public final Map<String, LiveRecode> m752f() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public LiveChannelInfo m753g(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public LiveChannelInfo m754h() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public LiveChannelInfo m755j(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0029
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: k */
    public final java.util.List<android.media.ViviTV.model.persistent.LiveChannelInfo> m756k(java.lang.String r6, java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0124Bv.m756k(java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: l */
    public final java.util.List<android.media.ViviTV.model.persistent.LiveChannelInfo> m757l() {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0124Bv.m757l():java.util.List");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: m */
    public java.util.List<android.media.ViviTV.model.persistent.LiveChannelInfo> m758m(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            return r0
        L25:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0124Bv.m758m(java.lang.String):java.util.List");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: n */
    public java.util.List<android.media.ViviTV.model.persistent.EpgItemInfo> m759n(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            r0 = 0
            return r0
        L2c:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0124Bv.m759n(java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: o */
    public java.util.List<android.media.ViviTV.model.persistent.EpgItemInfo> m760o(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 0
            return r0
        L24:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0124Bv.m760o(java.lang.String):java.util.List");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0012
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: p */
    public java.util.List<android.media.ViviTV.model.persistent.EpgItemInfo> m761p(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            r0 = 0
            return r0
        L39:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0124Bv.m761p(java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public long m762s() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: t */
    public java.util.List<android.media.ViviTV.model.persistent.LiveTypeInfo> m763t(android.content.Context r8) {
        /*
            r7 = this;
            r0 = 0
            return r0
        L3d:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0124Bv.m763t(android.content.Context):java.util.List");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: u */
    public final java.util.List<android.media.ViviTV.model.persistent.LiveTypeInfo> m764u() {
        /*
            r5 = this;
            r0 = 0
            return r0
        L80:
        L82:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0124Bv.m764u():java.util.List");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: v */
    public boolean m765v(p000.C0196Cv r13) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0124Bv.m765v(Cv):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public int m766w(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: x */
    public final p000.C1091Qv[] m767x(java.lang.String r7, android.media.ViviTV.model.persistent.LiveChannelInfo r8) {
        /*
            r6 = this;
            r0 = 0
            return r0
        L4d:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0124Bv.m767x(java.lang.String, android.media.ViviTV.model.persistent.LiveChannelInfo):Qv[]");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public void m768y(int i, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: z */
    public boolean m769z(org.json.JSONObject r8) {
        /*
            r7 = this;
            r0 = 0
            return r0
        L61:
        L70:
        L95:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0124Bv.m769z(org.json.JSONObject):boolean");
    }
}
