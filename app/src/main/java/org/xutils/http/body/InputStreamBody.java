package org.xutils.http.body;

import java.io.InputStream;
import org.xutils.http.ProgressHandler;

/* JADX INFO: loaded from: classes.dex */
public class InputStreamBody implements ProgressBody {

    /* JADX INFO: renamed from: a */
    public InputStream f18164a;

    /* JADX INFO: renamed from: b */
    public String f18165b;

    /* JADX INFO: renamed from: c */
    public final long f18166c;

    /* JADX INFO: renamed from: d */
    public long f18167d;

    /* JADX INFO: renamed from: e */
    public ProgressHandler f18168e;

    /* JADX WARN: Invalid debug info offset */
    public InputStreamBody(InputStream inputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    public InputStreamBody(InputStream inputStream, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static long m27111e(InputStream inputStream) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x001c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.xutils.http.body.RequestBody
    /* JADX INFO: renamed from: a */
    public void mo27112a(java.io.OutputStream r14) throws java.io.IOException {
        /*
            r13 = this;
            return
        L44:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.http.body.InputStreamBody.mo27112a(java.io.OutputStream):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.body.RequestBody
    /* JADX INFO: renamed from: b */
    public void mo27110b(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.body.ProgressBody
    /* JADX INFO: renamed from: c */
    public void mo27113c(ProgressHandler progressHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.body.RequestBody
    /* JADX INFO: renamed from: d */
    public long mo27114d() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.body.RequestBody
    public String getContentType() {
        return null;
    }
}
