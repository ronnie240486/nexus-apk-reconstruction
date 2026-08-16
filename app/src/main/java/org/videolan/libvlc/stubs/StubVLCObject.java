package org.videolan.libvlc.stubs;

import org.videolan.libvlc.interfaces.AbstractVLCEvent;
import org.videolan.libvlc.interfaces.ILibVLC;
import org.videolan.libvlc.interfaces.IVLCObject;

/* JADX INFO: loaded from: classes.dex */
public class StubVLCObject<T extends AbstractVLCEvent> implements IVLCObject<T> {
    @Override // org.videolan.libvlc.interfaces.IVLCObject
    /* JADX INFO: renamed from: r */
    public ILibVLC mo25258r() {
        return null;
    }

    @Override // org.videolan.libvlc.interfaces.IVLCObject
    public void release() {
    }

    @Override // org.videolan.libvlc.interfaces.IVLCObject
    /* JADX INFO: renamed from: u */
    public boolean mo25425u() {
        return false;
    }

    @Override // org.videolan.libvlc.interfaces.IVLCObject
    /* JADX INFO: renamed from: x */
    public boolean mo25259x() {
        return false;
    }
}
