package org.videolan.libvlc;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.FileDescriptor;
import org.videolan.libvlc.interfaces.AbstractVLCEvent;
import org.videolan.libvlc.interfaces.ILibVLC;
import org.videolan.libvlc.interfaces.IMedia;
import org.videolan.libvlc.interfaces.IMediaList;

/* JADX INFO: loaded from: classes.dex */
public class Media extends VLCObject<IMedia.Event> implements IMedia {

    /* JADX INFO: renamed from: q */
    public static final String f17341q = "LibVLC/Media";

    /* JADX INFO: renamed from: r */
    public static final int f17342r = 0;

    /* JADX INFO: renamed from: s */
    public static final int f17343s = 1;

    /* JADX INFO: renamed from: t */
    public static final int f17344t = 2;

    /* JADX INFO: renamed from: f */
    public Uri f17345f;

    /* JADX INFO: renamed from: g */
    public MediaList f17346g;

    /* JADX INFO: renamed from: h */
    public int f17347h;

    /* JADX INFO: renamed from: i */
    public final String[] f17348i;

    /* JADX INFO: renamed from: j */
    public IMedia.Track[] f17349j;

    /* JADX INFO: renamed from: k */
    public long f17350k;

    /* JADX INFO: renamed from: l */
    public int f17351l;

    /* JADX INFO: renamed from: m */
    public int f17352m;

    /* JADX INFO: renamed from: n */
    public boolean f17353n;

    /* JADX INFO: renamed from: o */
    public boolean f17354o;

    /* JADX INFO: renamed from: p */
    public boolean f17355p;

    /* JADX WARN: Invalid debug info offset */
    public Media(ILibVLC iLibVLC, AssetFileDescriptor assetFileDescriptor) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Media(ILibVLC iLibVLC, Uri uri) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Media(ILibVLC iLibVLC, FileDescriptor fileDescriptor) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Media(ILibVLC iLibVLC, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Media(IMediaList iMediaList, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public static IMedia.Track m25262H(String str, String str2, int i, int i2, int i3, int i4, String str3, String str4, int i5, int i6) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public static IMedia.Slave m25263I(int i, int i2, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public static IMedia.Stats m25264J(int i, float f, int i2, float f2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, float f3) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public static IMedia.Track m25265K(String str, String str2, int i, int i2, int i3, int i4, String str3, String str4, String str5) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L */
    public static IMedia.Track m25266L(String str, String str2, int i, int i2, int i3, int i4, String str3, String str4) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public static IMedia.Track m25267M(String str, String str2, int i, int i2, int i3, int i4, String str3, String str4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N */
    public static String m25268N() {
        return null;
    }

    private native void nativeAddOption(String str);

    private native void nativeAddSlave(int i, int i2, String str);

    private native void nativeClearSlaves();

    private native long nativeGetDuration();

    private native String nativeGetMeta(int i);

    private native String nativeGetMrl();

    private native IMedia.Slave[] nativeGetSlaves();

    private native int nativeGetState();

    private native IMedia.Stats nativeGetStats();

    private native IMedia.Track[] nativeGetTracks();

    private native int nativeGetType();

    private native void nativeNewFromFd(ILibVLC iLibVLC, FileDescriptor fileDescriptor);

    private native void nativeNewFromFdWithOffsetLength(ILibVLC iLibVLC, FileDescriptor fileDescriptor, long j, long j2);

    private native void nativeNewFromLocation(ILibVLC iLibVLC, String str);

    private native void nativeNewFromMediaList(IMediaList iMediaList, int i);

    private native void nativeNewFromPath(ILibVLC iLibVLC, String str);

    private native boolean nativeParse(int i);

    private native boolean nativeParseAsync(int i, int i2);

    private native void nativeRelease();

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
    /* JADX INFO: renamed from: O */
    public final IMedia.Track[] m25269O() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: P */
    public synchronized org.videolan.libvlc.interfaces.IMedia.Event m25270P(int r1, long r2, long r4, float r6, @androidx.annotation.Nullable java.lang.String r7) {
        /*
            r0 = this;
            r0 = 0
            return r0
        L17:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.Media.m25270P(int, long, long, float, java.lang.String):org.videolan.libvlc.interfaces.IMedia$Event");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: Q */
    public final synchronized void m25271Q() {
        /*
            r2 = this;
            return
        L1d:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.Media.m25271Q():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public MediaList m25272R() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: a */
    public int mo25273a() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: b */
    public void mo25274b(java.lang.String r3) {
        /*
            r2 = this;
            return
        L11:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.Media.mo25274b(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: c */
    public boolean mo25275c(int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: f */
    public void mo25276f() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: g */
    public void mo25277g(IMedia.EventListener eventListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMedia
    public long getDuration() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMedia
    public int getState() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMedia
    public synchronized Uri getUri() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: h */
    public void mo25278h(boolean z, boolean z2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: i */
    public int mo25279i() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: k */
    public void mo25280k(IMedia.Slave slave) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: m */
    public boolean mo25281m(int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMedia
    @Nullable
    /* JADX INFO: renamed from: n */
    public IMedia.Stats mo25282n() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: o */
    public boolean mo25283o() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: p */
    public synchronized boolean mo25284p() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: q */
    public boolean mo25285q() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.VLCObject, org.videolan.libvlc.interfaces.IVLCObject
    /* JADX INFO: renamed from: r */
    public ILibVLC mo25258r() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: s */
    public java.lang.String mo25286s(int r3) {
        /*
            r2 = this;
            r0 = 0
            return r0
        L11:
        L27:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.Media.mo25286s(int):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0008
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: t */
    public void mo25287t() {
        /*
            r2 = this;
            return
        L15:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.Media.mo25287t():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: v */
    public /* bridge */ /* synthetic */ IMediaList mo25288v() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: w */
    public boolean mo25289w(int i, int i2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.VLCObject, org.videolan.libvlc.interfaces.IVLCObject
    /* JADX INFO: renamed from: x */
    public /* bridge */ /* synthetic */ boolean mo25259x() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: y */
    public IMedia.Track mo25290y(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMedia
    @Nullable
    /* JADX INFO: renamed from: z */
    public IMedia.Slave[] mo25291z() {
        return null;
    }
}
