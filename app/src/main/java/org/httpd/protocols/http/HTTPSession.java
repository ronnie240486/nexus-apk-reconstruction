package org.httpd.protocols.http;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.util.List;
import java.util.Map;
import org.httpd.protocols.http.content.CookieHandler;
import org.httpd.protocols.http.request.Method;
import org.httpd.protocols.http.tempfiles.ITempFileManager;

/* JADX INFO: loaded from: classes2.dex */
public class HTTPSession implements IHTTPSession {

    /* JADX INFO: renamed from: a */
    public final NanoHTTPD f16954a;

    /* JADX INFO: renamed from: b */
    public final ITempFileManager f16955b;

    /* JADX INFO: renamed from: c */
    public final OutputStream f16956c;

    /* JADX INFO: renamed from: d */
    public final BufferedInputStream f16957d;

    /* JADX INFO: renamed from: e */
    public int f16958e;

    /* JADX INFO: renamed from: f */
    public int f16959f;

    /* JADX INFO: renamed from: g */
    public String f16960g;

    /* JADX INFO: renamed from: h */
    public Method f16961h;

    /* JADX INFO: renamed from: i */
    public Map<String, List<String>> f16962i;

    /* JADX INFO: renamed from: j */
    public Map<String, String> f16963j;

    /* JADX INFO: renamed from: k */
    public CookieHandler f16964k;

    /* JADX INFO: renamed from: l */
    public String f16965l;

    /* JADX INFO: renamed from: m */
    public String f16966m;

    /* JADX WARN: Invalid debug info offset */
    public HTTPSession(NanoHTTPD nanoHTTPD, ITempFileManager iTempFileManager, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final int m24895a(byte[] bArr, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.httpd.protocols.http.IHTTPSession
    /* JADX INFO: renamed from: a */
    public final Map<String, List<String>> mo24896a() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.httpd.protocols.http.IHTTPSession
    /* JADX INFO: renamed from: b */
    public final String mo24897b() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.httpd.protocols.http.IHTTPSession
    /* JADX INFO: renamed from: c */
    public final Map<String, String> mo24898c() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public final void m24899c(BufferedReader bufferedReader, Map<String, String> map, Map<String, List<String>> map2, Map<String, String> map3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public final void m24900d(String str, Map<String, List<String>> map) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: e */
    public void m24901e() {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.httpd.protocols.http.HTTPSession.m24901e():void");
    }
}
