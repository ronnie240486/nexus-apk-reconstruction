package org.xutils.http.body;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class FileBody extends InputStreamBody {

    /* JADX INFO: renamed from: f */
    public File f18162f;

    /* JADX INFO: renamed from: g */
    public String f18163g;

    /* JADX WARN: Invalid debug info offset */
    public FileBody(File file) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public FileBody(File file, String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: f */
    public static java.lang.String m27109f(java.io.File r2) {
        /*
            r0 = 0
            return r0
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.http.body.FileBody.m27109f(java.io.File):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.body.InputStreamBody, org.xutils.http.body.RequestBody
    /* JADX INFO: renamed from: b */
    public void mo27110b(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.body.InputStreamBody, org.xutils.http.body.RequestBody
    public String getContentType() {
        return null;
    }
}
