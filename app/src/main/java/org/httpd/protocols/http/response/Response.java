package org.httpd.protocols.http.response;

import java.io.Closeable;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.httpd.protocols.http.request.Method;

/* JADX INFO: loaded from: classes2.dex */
public class Response implements Closeable {

    /* JADX INFO: renamed from: a */
    public IStatus f16983a;

    /* JADX INFO: renamed from: b */
    public String f16984b;

    /* JADX INFO: renamed from: c */
    public InputStream f16985c;

    /* JADX INFO: renamed from: d */
    public long f16986d;

    /* JADX INFO: renamed from: e */
    public final Map<String, String> f16987e;

    /* JADX INFO: renamed from: f */
    public final Map<String, String> f16988f;

    /* JADX INFO: renamed from: g */
    public Method f16989g;

    /* JADX INFO: renamed from: h */
    public boolean f16990h;

    /* JADX INFO: renamed from: i */
    public boolean f16991i;

    /* JADX INFO: renamed from: j */
    public List<String> f16992j;

    /* JADX INFO: renamed from: k */
    public GzipUsage f16993k;

    /* JADX INFO: renamed from: org.httpd.protocols.http.response.Response$1 */
    public class C50661 extends HashMap<String, String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Response f16994a;

        /* JADX WARN: Invalid debug info offset */
        public C50661(Response response) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public String m24920b(String str, String str2) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return null;
        }
    }

    public enum GzipUsage {
        DEFAULT,
        ALWAYS,
        NEVER
    }

    /* JADX WARN: Invalid debug info offset */
    public Response(IStatus iStatus, String str, InputStream inputStream, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: k */
    public static org.httpd.protocols.http.response.Response m24909k(org.httpd.protocols.http.response.IStatus r8, java.lang.String r9, java.lang.String r10) {
        /*
            r0 = 0
            return r0
        L48:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.httpd.protocols.http.response.Response.m24909k(org.httpd.protocols.http.response.IStatus, java.lang.String, java.lang.String):org.httpd.protocols.http.response.Response");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public void m24910P(PrintWriter printWriter, String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public void m24911R(Method method) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public void m24912S(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V */
    public boolean m24913V() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b0 */
    public Response m24914b0(boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: g0 */
    public final void m24915g0(java.io.OutputStream r3, long r4) {
        /*
            r2 = this;
            return
        Lc:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.httpd.protocols.http.response.Response.m24915g0(java.io.OutputStream, long):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0010
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: j */
    public long m24916j(java.io.PrintWriter r3, long r4) {
        /*
            r2 = this;
            r0 = 0
            return r0
        L15:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.httpd.protocols.http.response.Response.m24916j(java.io.PrintWriter, long):long");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k0 */
    public boolean m24917k0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0012
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: p */
    public void m24918p(java.io.OutputStream r9) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.httpd.protocols.http.response.Response.m24918p(java.io.OutputStream):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0029
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: w */
    public final void m24919w(java.io.OutputStream r9, long r10) {
        /*
            r8 = this;
            return
        L2d:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.httpd.protocols.http.response.Response.m24919w(java.io.OutputStream, long):void");
    }
}
