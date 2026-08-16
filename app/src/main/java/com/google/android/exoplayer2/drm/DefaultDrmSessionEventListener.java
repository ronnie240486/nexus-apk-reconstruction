package com.google.android.exoplayer2.drm;

/* JADX INFO: loaded from: classes2.dex */
public interface DefaultDrmSessionEventListener {
    void onDrmKeysLoaded();

    void onDrmKeysRemoved();

    void onDrmKeysRestored();

    void onDrmSessionAcquired();

    void onDrmSessionManagerError(Exception exc);

    void onDrmSessionReleased();
}
