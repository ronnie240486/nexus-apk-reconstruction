package p000;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: Kr */
/* JADX INFO: loaded from: classes.dex */
public class C0701Kr implements InterfaceC4284eO<C0956Or, Bitmap> {

    /* JADX INFO: renamed from: c */
    public static final String f1684c = "ImageVideoDecoder";

    /* JADX INFO: renamed from: a */
    public final InterfaceC4284eO<InputStream, Bitmap> f1685a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4284eO<ParcelFileDescriptor, Bitmap> f1686b;

    /* JADX WARN: Invalid debug info offset */
    public C0701Kr(InterfaceC4284eO<InputStream, Bitmap> interfaceC4284eO, InterfaceC4284eO<ParcelFileDescriptor, Bitmap> interfaceC4284eO2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4284eO
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC3034cO<Bitmap> mo648a(C0956Or c0956Or, int i, int i2) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    public p000.InterfaceC3034cO<android.graphics.Bitmap> m3294b(p000.C0956Or r4, int r5, int r6) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 0
            return r0
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0701Kr.m3294b(Or, int, int):cO");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4284eO
    public String getId() {
        return null;
    }
}
