package com.google.android.exoplayer2.decoder;

import androidx.annotation.Nullable;
import java.lang.Exception;

/* JADX INFO: loaded from: classes2.dex */
public interface Decoder<I, O, E extends Exception> {
    @Nullable
    I dequeueInputBuffer() throws Exception;

    @Nullable
    O dequeueOutputBuffer() throws Exception;

    void flush();

    String getName();

    void queueInputBuffer(I i) throws Exception;

    void release();
}
