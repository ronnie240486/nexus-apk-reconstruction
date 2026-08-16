package p000;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: renamed from: gq */
/* JADX INFO: loaded from: classes.dex */
public class C4439gq implements InterfaceC4750ld<InputStream> {

    /* JADX INFO: renamed from: f */
    public static final String f14220f = "HttpUrlFetcher";

    /* JADX INFO: renamed from: g */
    public static final int f14221g = 5;

    /* JADX INFO: renamed from: h */
    public static final c f14222h = new b(null);

    /* JADX INFO: renamed from: a */
    public final C5744xn f14223a;

    /* JADX INFO: renamed from: b */
    public final c f14224b;

    /* JADX INFO: renamed from: c */
    public HttpURLConnection f14225c;

    /* JADX INFO: renamed from: d */
    public InputStream f14226d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f14227e;

    /* JADX INFO: renamed from: gq$b */
    public static class b implements c {
        /* JADX WARN: Invalid debug info offset */
        public b() {
        }

        /* JADX WARN: Invalid debug info offset */
        public b(a aVar) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C4439gq.c
        /* JADX INFO: renamed from: a */
        public HttpURLConnection mo20874a(URL url) throws IOException {
            return null;
        }
    }

    /* JADX INFO: renamed from: gq$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        HttpURLConnection mo20874a(URL url) throws IOException;
    }

    /* JADX WARN: Invalid debug info offset */
    public C4439gq(C5744xn c5744xn) {
    }

    /* JADX WARN: Invalid debug info offset */
    public C4439gq(C5744xn c5744xn, c cVar) {
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
        L8:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4439gq.mo4049b():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public final InputStream m20871c(HttpURLConnection httpURLConnection) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4750ld
    public void cancel() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public InputStream m20872d(EnumC5369sL enumC5369sL) throws Exception {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: e */
    public final java.io.InputStream m20873e(java.net.URL r4, int r5, java.net.URL r6, java.util.Map<java.lang.String, java.lang.String> r7) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4439gq.m20873e(java.net.URL, int, java.net.URL, java.util.Map):java.io.InputStream");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4750ld
    public String getId() {
        return null;
    }
}
