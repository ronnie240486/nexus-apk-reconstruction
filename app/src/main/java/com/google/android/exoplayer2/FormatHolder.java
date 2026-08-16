package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmSession;

/* JADX INFO: loaded from: classes2.dex */
public final class FormatHolder {

    @Nullable
    public DrmSession<?> drmSession;

    @Nullable
    public Format format;
    public boolean includesDrmSession;

    public void clear() {
        this.includesDrmSession = false;
        this.drmSession = null;
        this.format = null;
    }
}
