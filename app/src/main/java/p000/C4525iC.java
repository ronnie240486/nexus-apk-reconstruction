package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: renamed from: iC */
/* JADX INFO: loaded from: classes.dex */
public class C4525iC implements InterfaceC4750ld<InputStream> {

    /* JADX INFO: renamed from: h */
    public static final String f14484h = "MediaStoreThumbFetcher";

    /* JADX INFO: renamed from: i */
    public static final int f14485i = 512;

    /* JADX INFO: renamed from: j */
    public static final int f14486j = 384;

    /* JADX INFO: renamed from: k */
    public static final e f14487k = new e();

    /* JADX INFO: renamed from: a */
    public final Context f14488a;

    /* JADX INFO: renamed from: b */
    public final Uri f14489b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4750ld<InputStream> f14490c;

    /* JADX INFO: renamed from: d */
    public final int f14491d;

    /* JADX INFO: renamed from: e */
    public final int f14492e;

    /* JADX INFO: renamed from: f */
    public final e f14493f;

    /* JADX INFO: renamed from: g */
    public InputStream f14494g;

    /* JADX INFO: renamed from: iC$a */
    public static class a {
        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public boolean m21343a(File file) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public File m21344b(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public long m21345c(File file) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: iC$b */
    public static class b implements c {

        /* JADX INFO: renamed from: a */
        public static final String[] f14495a = {"_data"};

        /* JADX INFO: renamed from: b */
        public static final String f14496b = "kind = 1 AND image_id = ?";

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C4525iC.c
        /* JADX INFO: renamed from: a */
        public Cursor mo21346a(Context context, Uri uri) {
            return null;
        }
    }

    /* JADX INFO: renamed from: iC$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        Cursor mo21346a(Context context, Uri uri);
    }

    /* JADX INFO: renamed from: iC$d */
    public static class d {

        /* JADX INFO: renamed from: c */
        public static final a f14497c = new a();

        /* JADX INFO: renamed from: a */
        public final a f14498a;

        /* JADX INFO: renamed from: b */
        public c f14499b;

        /* JADX WARN: Invalid debug info offset */
        public d(a aVar, c cVar) {
        }

        /* JADX WARN: Invalid debug info offset */
        public d(c cVar) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public int m21347a(android.content.Context r5, android.net.Uri r6) {
            /*
                r4 = this;
                r0 = 0
                return r0
            L1c:
            L1e:
            L3a:
            L3b:
            L41:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C4525iC.d.m21347a(android.content.Context, android.net.Uri):int");
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0009
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: b */
        public java.io.InputStream m21348b(android.content.Context r3, android.net.Uri r4) throws java.io.FileNotFoundException {
            /*
                r2 = this;
                r0 = 0
                return r0
            L14:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C4525iC.d.m21348b(android.content.Context, android.net.Uri):java.io.InputStream");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public final Uri m21349c(Cursor cursor) {
            return null;
        }
    }

    /* JADX INFO: renamed from: iC$e */
    public static class e {
        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public d m21350a(Uri uri, int i, int i2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: iC$f */
    public static class f implements c {

        /* JADX INFO: renamed from: a */
        public static final String[] f14500a = {"_data"};

        /* JADX INFO: renamed from: b */
        public static final String f14501b = "kind = 1 AND video_id = ?";

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C4525iC.c
        /* JADX INFO: renamed from: a */
        public Cursor mo21346a(Context context, Uri uri) {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C4525iC(Context context, Uri uri, InterfaceC4750ld<InputStream> interfaceC4750ld, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public C4525iC(Context context, Uri uri, InterfaceC4750ld<InputStream> interfaceC4750ld, int i, int i2, e eVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ boolean m21337c(Uri uri) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m21338d(Uri uri) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static boolean m21339e(Uri uri) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static boolean m21340f(Uri uri) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4750ld
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ InputStream mo4048a(EnumC5369sL enumC5369sL) throws Exception {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // p000.InterfaceC4750ld
    /* JADX INFO: renamed from: b */
    public void mo4049b() {
        /*
            r1 = this;
            return
        L7:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4525iC.mo4049b():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public InputStream m21341g(EnumC5369sL enumC5369sL) throws Exception {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4750ld
    public String getId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public final InputStream m21342h(d dVar) {
        return null;
    }

    @Override // p000.InterfaceC4750ld
    public void cancel() {
    }
}
