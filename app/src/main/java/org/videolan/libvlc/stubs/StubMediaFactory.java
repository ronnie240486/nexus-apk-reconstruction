package org.videolan.libvlc.stubs;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileDescriptor;
import org.videolan.libvlc.interfaces.ILibVLC;
import org.videolan.libvlc.interfaces.IMedia;
import org.videolan.libvlc.interfaces.IMediaFactory;

/* JADX INFO: loaded from: classes.dex */
public class StubMediaFactory implements IMediaFactory {
    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMediaFactory
    /* JADX INFO: renamed from: a */
    public IMedia mo25299a(ILibVLC iLibVLC, AssetFileDescriptor assetFileDescriptor) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMediaFactory
    /* JADX INFO: renamed from: b */
    public IMedia mo25300b(ILibVLC iLibVLC, Uri uri) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMediaFactory
    /* JADX INFO: renamed from: c */
    public IMedia mo25301c(ILibVLC iLibVLC, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IMediaFactory
    /* JADX INFO: renamed from: d */
    public IMedia mo25302d(ILibVLC iLibVLC, FileDescriptor fileDescriptor) {
        return null;
    }
}
