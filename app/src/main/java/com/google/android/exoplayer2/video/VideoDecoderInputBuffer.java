package com.google.android.exoplayer2.video;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class VideoDecoderInputBuffer extends DecoderInputBuffer {

    @Nullable
    public ColorInfo colorInfo;

    public VideoDecoderInputBuffer() {
        super(2);
    }
}
