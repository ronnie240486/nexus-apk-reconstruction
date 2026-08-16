package org.videolan.libvlc;

import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import java.util.List;
import org.videolan.libvlc.interfaces.AbstractVLCEvent;
import org.videolan.libvlc.interfaces.ILibVLC;

/* JADX INFO: loaded from: classes.dex */
public class RendererDiscoverer extends VLCObject<Event> {

    /* JADX INFO: renamed from: h */
    public static final String f17440h = "LibVLC/RendererDiscoverer";

    /* JADX INFO: renamed from: f */
    public final List<RendererItem> f17441f;

    /* JADX INFO: renamed from: g */
    public final LongSparseArray<RendererItem> f17442g;

    public static class Description {

        /* JADX INFO: renamed from: a */
        public final String f17443a;

        /* JADX INFO: renamed from: b */
        public final String f17444b;

        /* JADX WARN: Invalid debug info offset */
        public Description(String str, String str2) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ Description(String str, String str2, C50981 c50981) {
        }
    }

    public static class Event extends AbstractVLCEvent {

        /* JADX INFO: renamed from: g */
        public static final int f17445g = 1282;

        /* JADX INFO: renamed from: h */
        public static final int f17446h = 1283;

        /* JADX INFO: renamed from: f */
        public final RendererItem f17447f;

        /* JADX WARN: Invalid debug info offset */
        public Event(int i, long j, RendererItem rendererItem) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.videolan.libvlc.interfaces.AbstractVLCEvent
        /* JADX INFO: renamed from: a */
        public void mo25417a() {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public RendererItem m25418b() {
            return null;
        }
    }

    public interface EventListener extends AbstractVLCEvent.Listener<Event> {
    }

    /* JADX WARN: Invalid debug info offset */
    public RendererDiscoverer(ILibVLC iLibVLC, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public static Description m25408H(String str, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public static RendererItem m25409I(String str, String str2, String str3, int i, long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public static Description[] m25410K(ILibVLC iLibVLC) {
        return null;
    }

    private static native Description[] nativeList(ILibVLC iLibVLC);

    private native void nativeNew(ILibVLC iLibVLC, String str);

    private native RendererItem nativeNewItem(long j);

    private native void nativeRelease();

    private native boolean nativeStart();

    private native void nativeStop();

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
    /* JADX INFO: renamed from: J */
    public final synchronized RendererItem m25411J(long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L */
    public Event m25412L(int i, long j, long j2, float f, @Nullable String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public final synchronized RendererItem m25413M(long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N */
    public void m25414N(EventListener eventListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O */
    public boolean m25415O() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public void m25416P() {
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
