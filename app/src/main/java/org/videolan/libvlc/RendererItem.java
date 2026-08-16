package org.videolan.libvlc;

import androidx.annotation.Nullable;
import org.videolan.libvlc.interfaces.AbstractVLCEvent;
import org.videolan.libvlc.interfaces.ILibVLC;

/* JADX INFO: loaded from: classes.dex */
public class RendererItem extends VLCObject<Event> {

    /* JADX INFO: renamed from: l */
    public static final int f17448l = 1;

    /* JADX INFO: renamed from: m */
    public static final int f17449m = 2;

    /* JADX INFO: renamed from: f */
    public final String f17450f;

    /* JADX INFO: renamed from: g */
    public final String f17451g;

    /* JADX INFO: renamed from: h */
    public final String f17452h;

    /* JADX INFO: renamed from: i */
    public final String f17453i;

    /* JADX INFO: renamed from: j */
    public final int f17454j;

    /* JADX INFO: renamed from: k */
    public final long f17455k;

    public static class Event extends AbstractVLCEvent {
        /* JADX WARN: Invalid debug info offset */
        public Event(int i) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public RendererItem(String str, String str2, String str3, int i, long j) {
    }

    private native void nativeReleaseItem();

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
    public Event m25419H(int i, long j, long j2, float f, @Nullable String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean equals(Object obj) {
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
