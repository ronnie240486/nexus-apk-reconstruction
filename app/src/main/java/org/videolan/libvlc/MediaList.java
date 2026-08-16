package org.videolan.libvlc;

import android.os.Handler;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import org.videolan.libvlc.interfaces.AbstractVLCEvent;
import org.videolan.libvlc.interfaces.ILibVLC;
import org.videolan.libvlc.interfaces.IMedia;
import org.videolan.libvlc.interfaces.IMediaList;

/* JADX INFO: loaded from: classes.dex */
public class MediaList extends VLCObject<IMediaList.Event> implements IMediaList {

    /* JADX INFO: renamed from: i */
    public static final String f17367i = "LibVLC/MediaList";

    /* JADX INFO: renamed from: f */
    public int f17368f;

    /* JADX INFO: renamed from: g */
    public final SparseArray<IMedia> f17369g;

    /* JADX INFO: renamed from: h */
    public boolean f17370h;

    /* JADX WARN: Invalid debug info offset */
    public MediaList(MediaDiscoverer mediaDiscoverer) {
    }

    /* JADX WARN: Invalid debug info offset */
    public MediaList(ILibVLC iLibVLC) {
    }

    /* JADX WARN: Invalid debug info offset */
    public MediaList(IMedia iMedia) {
    }

    private native int nativeGetCount();

    private native void nativeLock();

    private native void nativeNewFromLibVlc(ILibVLC iLibVLC);

    private native void nativeNewFromMedia(IMedia iMedia);

    private native void nativeNewFromMediaDiscoverer(MediaDiscoverer mediaDiscoverer);

    private native void nativeRelease();

    private native void nativeUnlock();

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.VLCObject
    /* JADX INFO: renamed from: D */
    public /* bridge */ /* synthetic */ AbstractVLCEvent mo25253D(int i, long j, long j2, float f, @Nullable String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.VLCObject
    /* JADX INFO: renamed from: E */
    public void mo25254E() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public final void m25303H() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public final synchronized IMedia m25304I(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: J */
    public final synchronized void m25305J() {
        /*
            r2 = this;
            return
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.MediaList.m25305J():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public synchronized IMediaList.Event m25306K(int i, long j, long j2, float f, @Nullable String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L */
    public final synchronized IMedia m25307L(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: M */
    public final synchronized void m25308M() {
        /*
            r2 = this;
            return
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.MediaList.m25308M():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMediaList
    /* JADX INFO: renamed from: d */
    public void mo25309d(IMediaList.EventListener eventListener, Handler handler) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.videolan.libvlc.interfaces.IMediaList
    /* JADX INFO: renamed from: e */
    public synchronized org.videolan.libvlc.interfaces.IMedia mo25310e(int r2) {
        /*
            r1 = this;
            r0 = 0
            return r0
        L16:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.MediaList.mo25310e(int):org.videolan.libvlc.interfaces.IMedia");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMediaList
    public synchronized int getCount() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMediaList
    /* JADX INFO: renamed from: l */
    public synchronized boolean mo25311l() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.VLCObject, org.videolan.libvlc.interfaces.IVLCObject
    /* JADX INFO: renamed from: r */
    public ILibVLC mo25258r() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.VLCObject, org.videolan.libvlc.interfaces.IVLCObject
    /* JADX INFO: renamed from: x */
    public /* bridge */ /* synthetic */ boolean mo25259x() {
        return false;
    }
}
