package com.google.android.exoplayer2.source.hls;

import androidx.annotation.Nullable;
import java.io.IOException;
import p000.C0060Av;

/* JADX INFO: loaded from: classes2.dex */
public final class SampleQueueMappingException extends IOException {
    public SampleQueueMappingException(@Nullable String str) {
        super(C0060Av.m278a("Unable to bind a sample queue to TrackGroup with mime type ", str, "."));
    }
}
