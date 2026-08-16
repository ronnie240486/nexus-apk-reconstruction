package com.google.android.exoplayer2.drm;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface DrmSession<T extends ExoMediaCrypto> {
    public static final int STATE_ERROR = 1;
    public static final int STATE_OPENED = 3;
    public static final int STATE_OPENED_WITH_KEYS = 4;
    public static final int STATE_OPENING = 2;
    public static final int STATE_RELEASED = 0;

    public static class DrmSessionException extends IOException {
        public DrmSessionException(Throwable th) {
            super(th);
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    void acquire();

    @Nullable
    DrmSessionException getError();

    @Nullable
    T getMediaCrypto();

    @Nullable
    byte[] getOfflineLicenseKeySetId();

    int getState();

    boolean playClearSamplesWithoutKeys();

    @Nullable
    Map<String, String> queryKeyStatus();

    void release();
}
