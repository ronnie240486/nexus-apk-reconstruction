package com.p2pengine.core.utils.libcore.p009io;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.p2pengine.core.utils.libcore.io.b */
/* JADX INFO: loaded from: classes2.dex */
public class C4020b implements Closeable {

    /* JADX INFO: renamed from: a */
    public final InputStream f12286a;

    /* JADX INFO: renamed from: b */
    public final Charset f12287b;

    /* JADX INFO: renamed from: c */
    public byte[] f12288c;

    /* JADX INFO: renamed from: d */
    public int f12289d;

    /* JADX INFO: renamed from: e */
    public int f12290e;

    /* JADX INFO: renamed from: com.p2pengine.core.utils.libcore.io.b$a */
    public class a extends ByteArrayOutputStream {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C4020b f12291a;

        /* JADX WARN: Invalid debug info offset */
        public a(C4020b c4020b, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000f
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.io.ByteArrayOutputStream
        public java.lang.String toString() {
            /*
                r5 = this;
                r0 = 0
                return r0
            L20:
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.utils.libcore.p009io.C4020b.a.toString():java.lang.String");
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C4020b(InputStream inputStream, int i, Charset charset) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m18479a() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    public java.lang.String m18480b() {
        /*
            r7 = this;
            r0 = 0
            return r0
        L11:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.utils.libcore.p009io.C4020b.m18480b():java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        /*
            r2 = this;
            return
        L10:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.utils.libcore.p009io.C4020b.close():void");
    }
}
