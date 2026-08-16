package com.google.android.exoplayer2.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.dash.offline.DashDownloader;
import com.google.android.exoplayer2.source.hls.offline.HlsDownloader;
import com.google.android.exoplayer2.source.smoothstreaming.offline.SsDownloader;
import java.lang.reflect.Constructor;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultDownloaderFactory implements DownloaderFactory {

    @Nullable
    private static final Constructor<? extends Downloader> DASH_DOWNLOADER_CONSTRUCTOR;

    @Nullable
    private static final Constructor<? extends Downloader> HLS_DOWNLOADER_CONSTRUCTOR;

    @Nullable
    private static final Constructor<? extends Downloader> SS_DOWNLOADER_CONSTRUCTOR;
    private final DownloaderConstructorHelper downloaderConstructorHelper;

    static {
        Constructor<? extends Downloader> downloaderConstructor;
        Constructor<? extends Downloader> downloaderConstructor2;
        Constructor<? extends Downloader> downloaderConstructor3 = null;
        try {
            downloaderConstructor = getDownloaderConstructor(DashDownloader.class);
        } catch (ClassNotFoundException unused) {
            downloaderConstructor = null;
        }
        DASH_DOWNLOADER_CONSTRUCTOR = downloaderConstructor;
        try {
            downloaderConstructor2 = getDownloaderConstructor(HlsDownloader.class);
        } catch (ClassNotFoundException unused2) {
            downloaderConstructor2 = null;
        }
        HLS_DOWNLOADER_CONSTRUCTOR = downloaderConstructor2;
        try {
            downloaderConstructor3 = getDownloaderConstructor(SsDownloader.class);
        } catch (ClassNotFoundException unused3) {
        }
        SS_DOWNLOADER_CONSTRUCTOR = downloaderConstructor3;
    }

    public DefaultDownloaderFactory(DownloaderConstructorHelper downloaderConstructorHelper) {
        this.downloaderConstructorHelper = downloaderConstructorHelper;
    }

    private static Constructor<? extends Downloader> getDownloaderConstructor(Class<?> cls) {
        try {
            return cls.asSubclass(Downloader.class).getConstructor(Uri.class, List.class, DownloaderConstructorHelper.class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Downloader constructor missing", e);
        }
    }

    @Override // com.google.android.exoplayer2.offline.DownloaderFactory
    public Downloader createDownloader(DownloadRequest downloadRequest) {
        Constructor<? extends Downloader> constructor;
        String str = downloadRequest.type;
        str.getClass();
        switch (str) {
            case "ss":
                constructor = SS_DOWNLOADER_CONSTRUCTOR;
                break;
            case "hls":
                constructor = HLS_DOWNLOADER_CONSTRUCTOR;
                break;
            case "dash":
                constructor = DASH_DOWNLOADER_CONSTRUCTOR;
                break;
            case "progressive":
                return new ProgressiveDownloader(downloadRequest.uri, downloadRequest.customCacheKey, this.downloaderConstructorHelper);
            default:
                throw new IllegalArgumentException("Unsupported type: " + downloadRequest.type);
        }
        return createDownloader(downloadRequest, constructor);
    }

    private Downloader createDownloader(DownloadRequest downloadRequest, @Nullable Constructor<? extends Downloader> constructor) {
        if (constructor == null) {
            throw new IllegalStateException("Module missing for: " + downloadRequest.type);
        }
        try {
            return constructor.newInstance(downloadRequest.uri, downloadRequest.streamKeys, this.downloaderConstructorHelper);
        } catch (Exception e) {
            throw new RuntimeException("Failed to instantiate downloader for: " + downloadRequest.type, e);
        }
    }
}
