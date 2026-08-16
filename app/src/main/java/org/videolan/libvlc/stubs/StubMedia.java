package org.videolan.libvlc.stubs;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileDescriptor;
import org.videolan.libvlc.interfaces.ILibVLC;
import org.videolan.libvlc.interfaces.IMedia;
import org.videolan.libvlc.interfaces.IMediaList;

/* JADX INFO: loaded from: classes.dex */
public class StubMedia extends StubVLCObject<IMedia.Event> implements IMedia {

    /* JADX INFO: renamed from: a */
    public Uri f17640a;

    /* JADX INFO: renamed from: b */
    public ILibVLC f17641b;

    /* JADX INFO: renamed from: c */
    public int f17642c;

    /* JADX WARN: Invalid debug info offset */
    public StubMedia(ILibVLC iLibVLC, AssetFileDescriptor assetFileDescriptor) {
    }

    /* JADX WARN: Invalid debug info offset */
    public StubMedia(ILibVLC iLibVLC, Uri uri) {
    }

    /* JADX WARN: Invalid debug info offset */
    public StubMedia(ILibVLC iLibVLC, FileDescriptor fileDescriptor) {
    }

    /* JADX WARN: Invalid debug info offset */
    public StubMedia(ILibVLC iLibVLC, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public final String m25511A() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public void m25512B(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: a */
    public int mo25273a() {
        return 0;
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: b */
    public void mo25274b(String str) {
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: c */
    public boolean mo25275c(int i) {
        return false;
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: f */
    public void mo25276f() {
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: g */
    public void mo25277g(IMedia.EventListener eventListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMedia
    public long getDuration() {
        return 0L;
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    public int getState() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMedia
    public Uri getUri() {
        return null;
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: h */
    public void mo25278h(boolean z, boolean z2) {
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: i */
    public int mo25279i() {
        return 0;
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: k */
    public void mo25280k(IMedia.Slave slave) {
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: m */
    public boolean mo25281m(int i) {
        return false;
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: n */
    public IMedia.Stats mo25282n() {
        return null;
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: o */
    public boolean mo25283o() {
        return false;
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: p */
    public boolean mo25284p() {
        return false;
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: q */
    public boolean mo25285q() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.stubs.StubVLCObject, org.videolan.libvlc.interfaces.IVLCObject
    /* JADX INFO: renamed from: r */
    public ILibVLC mo25258r() {
        return null;
    }

    @Override // org.videolan.libvlc.stubs.StubVLCObject, org.videolan.libvlc.interfaces.IVLCObject
    public void release() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: s */
    public String mo25286s(int i) {
        return null;
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: t */
    public void mo25287t() {
    }

    @Override // org.videolan.libvlc.stubs.StubVLCObject, org.videolan.libvlc.interfaces.IVLCObject
    /* JADX INFO: renamed from: u */
    public boolean mo25425u() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: v */
    public IMediaList mo25288v() {
        return null;
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: w */
    public boolean mo25289w(int i, int i2) {
        return false;
    }

    @Override // org.videolan.libvlc.stubs.StubVLCObject, org.videolan.libvlc.interfaces.IVLCObject
    /* JADX INFO: renamed from: x */
    public boolean mo25259x() {
        return false;
    }

    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: y */
    public IMedia.Track mo25290y(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMedia
    /* JADX INFO: renamed from: z */
    public IMedia.Slave[] mo25291z() {
        return null;
    }
}
