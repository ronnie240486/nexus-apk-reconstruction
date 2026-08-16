package org.videolan.libvlc;

import android.content.Context;
import java.util.List;
import org.videolan.libvlc.interfaces.ILibVLC;
import org.videolan.libvlc.interfaces.ILibVLCFactory;

/* JADX INFO: loaded from: classes.dex */
public class LibVLCFactory implements ILibVLCFactory {
    static {
        FactoryManager.m25251b(ILibVLCFactory.f17489a, new LibVLCFactory());
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.ILibVLCFactory
    /* JADX INFO: renamed from: e */
    public ILibVLC mo25260e(Context context, List<String> list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.ILibVLCFactory
    /* JADX INFO: renamed from: f */
    public ILibVLC mo25261f(Context context) {
        return null;
    }
}
