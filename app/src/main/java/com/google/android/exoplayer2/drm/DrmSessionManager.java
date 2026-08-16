package com.google.android.exoplayer2.drm;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import p000.C0499Hg;

/* JADX INFO: loaded from: classes2.dex */
public interface DrmSessionManager<T extends ExoMediaCrypto> {
    public static final DrmSessionManager<ExoMediaCrypto> DUMMY = new DrmSessionManager<ExoMediaCrypto>() { // from class: com.google.android.exoplayer2.drm.DrmSessionManager.1
        @Override // com.google.android.exoplayer2.drm.DrmSessionManager
        public /* synthetic */ DrmSession acquirePlaceholderSession(Looper looper, int i) {
            return C0499Hg.m2388a(this, looper, i);
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionManager
        public DrmSession<ExoMediaCrypto> acquireSession(Looper looper, DrmInitData drmInitData) {
            return new ErrorStateDrmSession(new DrmSession.DrmSessionException(new UnsupportedDrmException(1)));
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionManager
        public boolean canAcquireSession(DrmInitData drmInitData) {
            return false;
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionManager
        @Nullable
        public Class<ExoMediaCrypto> getExoMediaCryptoType(DrmInitData drmInitData) {
            return null;
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionManager
        public /* synthetic */ void prepare() {
            C0499Hg.m2389b(this);
        }

        @Override // com.google.android.exoplayer2.drm.DrmSessionManager
        public /* synthetic */ void release() {
            C0499Hg.m2390c(this);
        }
    };

    @Nullable
    DrmSession<T> acquirePlaceholderSession(Looper looper, int i);

    DrmSession<T> acquireSession(Looper looper, DrmInitData drmInitData);

    boolean canAcquireSession(DrmInitData drmInitData);

    @Nullable
    Class<? extends ExoMediaCrypto> getExoMediaCryptoType(DrmInitData drmInitData);

    void prepare();

    void release();
}
