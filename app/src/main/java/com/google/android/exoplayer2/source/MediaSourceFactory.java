package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface MediaSourceFactory {
    MediaSource createMediaSource(Uri uri);

    int[] getSupportedTypes();

    MediaSourceFactory setDrmSessionManager(DrmSessionManager<?> drmSessionManager);

    MediaSourceFactory setStreamKeys(List<StreamKey> list);
}
