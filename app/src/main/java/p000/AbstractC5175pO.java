package p000;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: pO */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5175pO implements Closeable {

    @Nullable
    private Reader reader;

    /* JADX INFO: renamed from: pO$a */
    public class a extends AbstractC5175pO {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C4596jC f18405d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ long f18406e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InterfaceC1166S7 f18407f;

        /* JADX WARN: Invalid debug info offset */
        public a(C4596jC c4596jC, long j, InterfaceC1166S7 interfaceC1166S7) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC5175pO
        public long contentLength() {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC5175pO
        @Nullable
        public C4596jC contentType() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractC5175pO
        public InterfaceC1166S7 source() {
            return null;
        }
    }

    /* JADX INFO: renamed from: pO$b */
    public static final class b extends Reader {

        /* JADX INFO: renamed from: a */
        public final InterfaceC1166S7 f18408a;

        /* JADX INFO: renamed from: b */
        public final Charset f18409b;

        /* JADX INFO: renamed from: c */
        public boolean f18410c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public Reader f18411d;

        /* JADX WARN: Invalid debug info offset */
        public b(InterfaceC1166S7 interfaceC1166S7, Charset charset) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            return 0;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public static AbstractC5175pO create(@Nullable C4596jC c4596jC, long j, InterfaceC1166S7 interfaceC1166S7) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static AbstractC5175pO create(@Nullable C4596jC c4596jC, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static AbstractC5175pO create(@Nullable C4596jC c4596jC, C5222q8 c5222q8) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static AbstractC5175pO create(@Nullable C4596jC c4596jC, byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public final InputStream byteStream() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public final byte[] bytes() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            return r0
        L39:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC5175pO.bytes():byte[]");
    }

    /* JADX WARN: Invalid debug info offset */
    public final Reader charStream() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public abstract long contentLength();

    @Nullable
    public abstract C4596jC contentType();

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public final Charset m27428j() {
        return null;
    }

    public abstract InterfaceC1166S7 source();

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public final java.lang.String string() throws java.io.IOException {
        /*
            r2 = this;
            r0 = 0
            return r0
        L14:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC5175pO.string():java.lang.String");
    }
}
