package org.apache.commons.p013io.input;

import java.io.IOException;
import java.io.InputStream;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.p013io.ByteOrderMark;

/* JADX INFO: loaded from: classes2.dex */
public class BOMInputStream extends ProxyInputStream {

    /* JADX INFO: renamed from: i */
    public static final Comparator<ByteOrderMark> f15774i = new Comparator<ByteOrderMark>() { // from class: org.apache.commons.io.input.BOMInputStream.1
        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public int m23258a(ByteOrderMark byteOrderMark, ByteOrderMark byteOrderMark2) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(ByteOrderMark byteOrderMark, ByteOrderMark byteOrderMark2) {
            return 0;
        }
    };

    /* JADX INFO: renamed from: a */
    public final boolean f15775a;

    /* JADX INFO: renamed from: b */
    public final List<ByteOrderMark> f15776b;

    /* JADX INFO: renamed from: c */
    public ByteOrderMark f15777c;

    /* JADX INFO: renamed from: d */
    public int[] f15778d;

    /* JADX INFO: renamed from: e */
    public int f15779e;

    /* JADX INFO: renamed from: f */
    public int f15780f;

    /* JADX INFO: renamed from: g */
    public int f15781g;

    /* JADX INFO: renamed from: h */
    public boolean f15782h;

    /* JADX WARN: Invalid debug info offset */
    public BOMInputStream(InputStream inputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    public BOMInputStream(InputStream inputStream, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public BOMInputStream(InputStream inputStream, boolean z, ByteOrderMark... byteOrderMarkArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public BOMInputStream(InputStream inputStream, ByteOrderMark... byteOrderMarkArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public ByteOrderMark m23251P() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public String m23252R() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public boolean m23253S() throws IOException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V */
    public boolean m23254V(ByteOrderMark byteOrderMark) throws IOException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b0 */
    public final boolean m23255b0(ByteOrderMark byteOrderMark) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g0 */
    public final int m23256g0() throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.apache.commons.p013io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int r2) {
        /*
            r1 = this;
            return
        L15:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.input.BOMInputStream.mark(int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.apache.commons.p013io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws java.io.IOException {
        /*
            r1 = this;
            return
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.input.BOMInputStream.reset():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.apache.commons.p013io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public final ByteOrderMark m23257w() {
        return null;
    }
}
