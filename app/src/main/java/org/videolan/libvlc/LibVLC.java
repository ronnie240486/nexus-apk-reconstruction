package org.videolan.libvlc;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.List;
import org.videolan.libvlc.interfaces.AbstractVLCEvent;
import org.videolan.libvlc.interfaces.ILibVLC;

/* JADX INFO: loaded from: classes.dex */
public class LibVLC extends VLCObject<ILibVLC.Event> implements ILibVLC {

    /* JADX INFO: renamed from: g */
    public static final String f17338g = "VLC/LibVLC";

    /* JADX INFO: renamed from: h */
    public static boolean f17339h;

    /* JADX INFO: renamed from: f */
    public final Context f17340f;

    public static class Event extends AbstractVLCEvent {
        /* JADX WARN: Invalid debug info offset */
        public Event(int i) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public LibVLC(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public LibVLC(Context context, List<String> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: H */
    public static synchronized void m25252H() {
        /*
            return
        L20:
        L22:
        L24:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.LibVLC.m25252H():void");
    }

    public static native String changeset();

    public static native String compiler();

    public static native int majorVersion();

    private native void nativeNew(String[] strArr, String str);

    private native void nativeRelease();

    private native void nativeSetUserAgent(String str, String str2);

    public static native String version();

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

    /* JADX INFO: renamed from: I */
    public ILibVLC.Event m25255I(int i, long j, long j2, float f, @Nullable String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public void m25256J(String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.ILibVLC
    /* JADX INFO: renamed from: j */
    public Context mo25257j() {
        return null;
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
