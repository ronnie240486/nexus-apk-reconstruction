package p000;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: HT */
/* JADX INFO: loaded from: classes.dex */
public class C0486HT implements Closeable {

    /* JADX INFO: renamed from: f */
    public static final byte f1086f = 13;

    /* JADX INFO: renamed from: g */
    public static final byte f1087g = 10;

    /* JADX INFO: renamed from: a */
    public final InputStream f1088a;

    /* JADX INFO: renamed from: b */
    public final Charset f1089b;

    /* JADX INFO: renamed from: c */
    public byte[] f1090c;

    /* JADX INFO: renamed from: d */
    public int f1091d;

    /* JADX INFO: renamed from: e */
    public int f1092e;

    /* JADX INFO: renamed from: HT$a */
    public class a extends ByteArrayOutputStream {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0486HT f1093a;

        /* JADX WARN: Invalid debug info offset */
        public a(C0486HT c0486ht, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0010
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.io.ByteArrayOutputStream
        public java.lang.String toString() {
            /*
                r5 = this;
                r0 = 0
                return r0
            L21:
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.C0486HT.a.toString():java.lang.String");
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C0486HT(InputStream inputStream, int i, Charset charset) {
    }

    /* JADX WARN: Invalid debug info offset */
    public C0486HT(InputStream inputStream, Charset charset) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Charset m2315j(C0486HT c0486ht) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        /*
            r2 = this;
            return
        L10:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0486HT.close():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public final void m2316k() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public boolean m2317p() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: w */
    public java.lang.String m2318w() throws java.io.IOException {
        /*
            r7 = this;
            r0 = 0
            return r0
        L11:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0486HT.m2318w():java.lang.String");
    }
}
