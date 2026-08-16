package org.videolan.libvlc.stubs;

import android.os.Handler;
import org.videolan.libvlc.interfaces.IMedia;
import org.videolan.libvlc.interfaces.IMediaList;

/* JADX INFO: loaded from: classes.dex */
public class StubMediaList extends StubVLCObject<IMediaList.Event> implements IMediaList {
    @Override // org.videolan.libvlc.interfaces.IMediaList
    /* JADX INFO: renamed from: d */
    public void mo25309d(IMediaList.EventListener eventListener, Handler handler) {
    }

    @Override // org.videolan.libvlc.interfaces.IMediaList
    /* JADX INFO: renamed from: e */
    public IMedia mo25310e(int i) {
        return null;
    }

    @Override // org.videolan.libvlc.interfaces.IMediaList
    public int getCount() {
        return 0;
    }

    @Override // org.videolan.libvlc.interfaces.IMediaList
    /* JADX INFO: renamed from: l */
    public boolean mo25311l() {
        return false;
    }
}
