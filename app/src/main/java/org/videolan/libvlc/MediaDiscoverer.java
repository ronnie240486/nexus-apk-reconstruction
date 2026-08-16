package org.videolan.libvlc;

import androidx.annotation.Nullable;
import org.videolan.libvlc.interfaces.AbstractVLCEvent;
import org.videolan.libvlc.interfaces.ILibVLC;

/* JADX INFO: loaded from: classes.dex */
public class MediaDiscoverer extends VLCObject<Event> {

    /* JADX INFO: renamed from: g */
    public static final String f17356g = "LibVLC/MediaDiscoverer";

    /* JADX INFO: renamed from: f */
    public MediaList f17357f;

    public static class Description {

        /* JADX INFO: renamed from: a */
        public final String f17358a;

        /* JADX INFO: renamed from: b */
        public final String f17359b;

        /* JADX INFO: renamed from: c */
        public final int f17360c;

        public static class Category {

            /* JADX INFO: renamed from: a */
            public static final int f17361a = 0;

            /* JADX INFO: renamed from: b */
            public static final int f17362b = 1;

            /* JADX INFO: renamed from: c */
            public static final int f17363c = 2;

            /* JADX INFO: renamed from: d */
            public static final int f17364d = 3;
        }

        /* JADX WARN: Invalid debug info offset */
        public Description(String str, String str2, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ Description(String str, String str2, int i, C50931 c50931) {
        }
    }

    public static class Event extends AbstractVLCEvent {

        /* JADX INFO: renamed from: f */
        public static final int f17365f = 1280;

        /* JADX INFO: renamed from: g */
        public static final int f17366g = 1281;

        /* JADX WARN: Invalid debug info offset */
        public Event(int i) {
        }
    }

    public interface EventListener extends AbstractVLCEvent.Listener<Event> {
    }

    /* JADX WARN: Invalid debug info offset */
    public MediaDiscoverer(ILibVLC iLibVLC, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public static Description m25292H(String str, String str2, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: J */
    public static Description[] m25293J(ILibVLC iLibVLC, int i) {
        return null;
    }

    private static native Description[] nativeList(ILibVLC iLibVLC, int i);

    private native void nativeNew(ILibVLC iLibVLC, String str);

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
    /* JADX INFO: renamed from: I */
    public MediaList m25294I() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public Event m25295K(int i, long j, long j2, float f, @Nullable String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L */
    public void m25296L(EventListener eventListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public boolean m25297M() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N */
    public void m25298N() {
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
