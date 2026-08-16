package org.apache.commons.p013io.output;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ByteArrayOutputStream extends OutputStream {

    /* JADX INFO: renamed from: g */
    public static final byte[] f15922g = new byte[0];

    /* JADX INFO: renamed from: a */
    public final List<byte[]> f15923a;

    /* JADX INFO: renamed from: b */
    public int f15924b;

    /* JADX INFO: renamed from: c */
    public int f15925c;

    /* JADX INFO: renamed from: d */
    public byte[] f15926d;

    /* JADX INFO: renamed from: e */
    public int f15927e;

    /* JADX INFO: renamed from: f */
    public boolean f15928f;

    /* JADX WARN: Invalid debug info offset */
    public ByteArrayOutputStream() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0010
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public ByteArrayOutputStream(int r3) {
        /*
            r2 = this;
            return
        L15:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.output.ByteArrayOutputStream.<init>(int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public static InputStream m23385P(InputStream inputStream, int i) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public static InputStream m23386w(InputStream inputStream) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public synchronized byte[] m23387R() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public synchronized InputStream m23388S() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V */
    public String m23389V(String str) throws UnsupportedEncodingException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b0 */
    public String m23390b0(Charset charset) {
        return null;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g0 */
    public synchronized int m23391g0(InputStream inputStream) throws IOException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public final void m23392j(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: k */
    public synchronized void m23393k() {
        /*
            r2 = this;
            return
        L17:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.output.ByteArrayOutputStream.m23393k():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: k0 */
    public synchronized void m23394k0(java.io.OutputStream r6) throws java.io.IOException {
        /*
            r5 = this;
            return
        L22:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.output.ByteArrayOutputStream.m23394k0(java.io.OutputStream):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public synchronized int m23395p() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public String toString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.OutputStream
    public synchronized void write(int r4) {
        /*
            r3 = this;
            return
        L13:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.output.ByteArrayOutputStream.write(int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0011
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.OutputStream
    public void write(byte[] r6, int r7, int r8) {
        /*
            r5 = this;
            return
        L31:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.output.ByteArrayOutputStream.write(byte[], int, int):void");
    }
}
