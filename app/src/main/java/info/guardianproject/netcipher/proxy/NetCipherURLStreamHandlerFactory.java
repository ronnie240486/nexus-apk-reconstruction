package info.guardianproject.netcipher.proxy;

import java.net.URLStreamHandlerFactory;

/* JADX INFO: loaded from: classes2.dex */
public class NetCipherURLStreamHandlerFactory implements URLStreamHandlerFactory {
    public static final String TAG = "NetCipherURL...rFactory";

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.net.URLStreamHandlerFactory
    @androidx.annotation.Nullable
    @android.annotation.SuppressLint({"PrivateApi"})
    public java.net.URLStreamHandler createURLStreamHandler(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            return r0
        L22:
        L24:
        L26:
        */
        throw new UnsupportedOperationException("Method not decompiled: info.guardianproject.netcipher.proxy.NetCipherURLStreamHandlerFactory.createURLStreamHandler(java.lang.String):java.net.URLStreamHandler");
    }
}
