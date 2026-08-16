package p000;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: Bj */
/* JADX INFO: loaded from: classes.dex */
public class C0112Bj<T> implements InterfaceC4284eO<File, T> {

    /* JADX INFO: renamed from: c */
    public static final a f325c = new a();

    /* JADX INFO: renamed from: a */
    public InterfaceC4284eO<InputStream, T> f326a;

    /* JADX INFO: renamed from: b */
    public final a f327b;

    /* JADX INFO: renamed from: Bj$a */
    public static class a {
        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public InputStream m650a(File file) throws FileNotFoundException {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C0112Bj(InterfaceC4284eO<InputStream, T> interfaceC4284eO) {
    }

    /* JADX WARN: Invalid debug info offset */
    public C0112Bj(InterfaceC4284eO<InputStream, T> interfaceC4284eO, a aVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4284eO
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC3034cO mo648a(File file, int i, int i2) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    public p000.InterfaceC3034cO<T> m649b(java.io.File r3, int r4, int r5) throws java.io.IOException {
        /*
            r2 = this;
            r0 = 0
            return r0
        L12:
        L13:
        L19:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0112Bj.m649b(java.io.File, int, int):cO");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4284eO
    public String getId() {
        return null;
    }
}
