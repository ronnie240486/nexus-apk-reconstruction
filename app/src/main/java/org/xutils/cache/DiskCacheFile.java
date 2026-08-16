package org.xutils.cache;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import org.xutils.common.util.ProcessLock;

/* JADX INFO: loaded from: classes.dex */
public final class DiskCacheFile extends File implements Closeable {

    /* JADX INFO: renamed from: a */
    public final DiskCacheEntity f17928a;

    /* JADX INFO: renamed from: b */
    public final ProcessLock f17929b;

    /* JADX WARN: Invalid debug info offset */
    public DiskCacheFile(String str, DiskCacheEntity diskCacheEntity, ProcessLock processLock) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void finalize() throws Throwable {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public DiskCacheFile m26682j() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public DiskCacheEntity m26683k() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public LruDiskCache m26684p() {
        return null;
    }
}
