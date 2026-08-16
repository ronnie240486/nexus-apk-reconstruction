package org.videolan.libvlc.interfaces;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public interface IMediaFactory extends IComponentFactory {

    /* JADX INFO: renamed from: b */
    public static final String f17600b = "org.videolan.libvlc.interfaces.IMediaFactory";

    /* JADX INFO: renamed from: a */
    IMedia mo25299a(ILibVLC iLibVLC, AssetFileDescriptor assetFileDescriptor);

    /* JADX INFO: renamed from: b */
    IMedia mo25300b(ILibVLC iLibVLC, Uri uri);

    /* JADX INFO: renamed from: c */
    IMedia mo25301c(ILibVLC iLibVLC, String str);

    /* JADX INFO: renamed from: d */
    IMedia mo25302d(ILibVLC iLibVLC, FileDescriptor fileDescriptor);
}
