package org.httpd.protocols.http;

import java.io.InputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes2.dex */
public class ClientHandler implements Runnable {

    /* JADX INFO: renamed from: a */
    public final NanoHTTPD f16951a;

    /* JADX INFO: renamed from: b */
    public final InputStream f16952b;

    /* JADX INFO: renamed from: c */
    public final Socket f16953c;

    /* JADX WARN: Invalid debug info offset */
    public ClientHandler(NanoHTTPD nanoHTTPD, InputStream inputStream, Socket socket) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.lang.Runnable
    public void run() {
        /*
            r8 = this;
            return
        L31:
        L33:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.httpd.protocols.http.ClientHandler.run():void");
    }
}
