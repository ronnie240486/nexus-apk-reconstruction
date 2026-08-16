package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: Yv */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1603Yv<T> implements InterfaceC4750ld<T> {

    /* JADX INFO: renamed from: d */
    public static final String f4027d = "LocalUriFetcher";

    /* JADX INFO: renamed from: a */
    public final Uri f4028a;

    /* JADX INFO: renamed from: b */
    public final Context f4029b;

    /* JADX INFO: renamed from: c */
    public T f4030c;

    /* JADX WARN: Invalid debug info offset */
    public AbstractC1603Yv(Context context, Uri uri) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4750ld
    /* JADX INFO: renamed from: a */
    public final T mo4048a(EnumC5369sL enumC5369sL) throws Exception {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // p000.InterfaceC4750ld
    /* JADX INFO: renamed from: b */
    public void mo4049b() {
        /*
            r3 = this;
            return
        L8:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC1603Yv.mo4049b():void");
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo6627c(T t) throws IOException;

    /* JADX INFO: renamed from: d */
    public abstract T mo6628d(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC4750ld
    public String getId() {
        return null;
    }

    @Override // p000.InterfaceC4750ld
    public void cancel() {
    }
}
