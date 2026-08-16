package org.apache.commons.p013io;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class LineIterator implements Iterator<String> {

    /* JADX INFO: renamed from: a */
    public final BufferedReader f15663a;

    /* JADX INFO: renamed from: b */
    public String f15664b;

    /* JADX INFO: renamed from: c */
    public boolean f15665c;

    /* JADX WARN: Invalid debug info offset */
    public LineIterator(Reader reader) throws IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static void m23179b(LineIterator lineIterator) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void m23180a() {
    }

    /* JADX INFO: renamed from: c */
    public boolean m23181c(String str) {
        return true;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public String m23182d() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public String m23183e() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.util.Iterator
    public boolean hasNext() {
        /*
            r4 = this;
            r0 = 0
            return r0
        L17:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.LineIterator.hasNext():boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ String next() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.util.Iterator
    public void remove() {
    }
}
