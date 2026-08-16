package org.apache.commons.p013io.output;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes2.dex */
public class ProxyWriter extends FilterWriter {
    /* JADX WARN: Invalid debug info offset */
    public ProxyWriter(Writer writer) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(java.lang.CharSequence r3) throws java.io.IOException {
        /*
            r2 = this;
            r0 = 0
            return r0
        L7:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.output.ProxyWriter.append(java.lang.CharSequence):java.io.Writer");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(java.lang.CharSequence r3, int r4, int r5) throws java.io.IOException {
        /*
            r2 = this;
            r0 = 0
            return r0
        Le:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.output.ProxyWriter.append(java.lang.CharSequence, int, int):java.io.Writer");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(char c) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterWriter, java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
    }

    /* JADX INFO: renamed from: j */
    public void m23413j(int i) throws IOException {
    }

    /* JADX INFO: renamed from: k */
    public void m23414k(int i) throws IOException {
    }

    /* JADX INFO: renamed from: p */
    public void m23415p(IOException iOException) throws IOException {
        throw iOException;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.FilterWriter, java.io.Writer
    public void write(int r3) throws java.io.IOException {
        /*
            r2 = this;
            return
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.output.ProxyWriter.write(int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.Writer
    public void write(java.lang.String r3) throws java.io.IOException {
        /*
            r2 = this;
            return
        L7:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.output.ProxyWriter.write(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterWriter, java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.io.Writer
    public void write(char[] r3) throws java.io.IOException {
        /*
            r2 = this;
            return
        L4:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.output.ProxyWriter.write(char[]):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
    }
}
