package com.google.android.exoplayer2.drm;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ErrorStateDrmSession<T extends ExoMediaCrypto> implements DrmSession<T> {
    private final DrmSession.DrmSessionException error;

    public ErrorStateDrmSession(DrmSession.DrmSessionException drmSessionException) {
        this.error = (DrmSession.DrmSessionException) Assertions.checkNotNull(drmSessionException);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void acquire() {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public DrmSession.DrmSessionException getError() {
        return this.error;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public T getMediaCrypto() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public byte[] getOfflineLicenseKeySetId() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public int getState() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean playClearSamplesWithoutKeys() {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @Nullable
    public Map<String, String> queryKeyStatus() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void release() {
    }
}
