package p000;

import android.content.res.AssetManager;
import java.io.IOException;

/* JADX INFO: renamed from: e5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4264e5<T> implements InterfaceC4750ld<T> {

    /* JADX INFO: renamed from: d */
    public static final String f13702d = "AssetUriFetcher";

    /* JADX INFO: renamed from: a */
    public final String f13703a;

    /* JADX INFO: renamed from: b */
    public final AssetManager f13704b;

    /* JADX INFO: renamed from: c */
    public T f13705c;

    /* JADX WARN: Invalid debug info offset */
    public AbstractC4264e5(AssetManager assetManager, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4750ld
    /* JADX INFO: renamed from: a */
    public T mo4048a(EnumC5369sL enumC5369sL) throws Exception {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // p000.InterfaceC4750ld
    /* JADX INFO: renamed from: b */
    public void mo4049b() {
        /*
            r3 = this;
            return
        L9:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC4264e5.mo4049b():void");
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo5345c(T t) throws IOException;

    /* JADX INFO: renamed from: d */
    public abstract T mo5346d(AssetManager assetManager, String str) throws IOException;

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4750ld
    public String getId() {
        return null;
    }

    @Override // p000.InterfaceC4750ld
    public void cancel() {
    }
}
