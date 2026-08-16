package org.httpd.protocols.http.tempfiles;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultTempFileManager implements ITempFileManager {

    /* JADX INFO: renamed from: a */
    public final List<ITempFile> f17000a;

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0012
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.httpd.protocols.http.tempfiles.ITempFileManager
    public void clear() {
        /*
            r5 = this;
            return
        L16:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.httpd.protocols.http.tempfiles.DefaultTempFileManager.clear():void");
    }
}
