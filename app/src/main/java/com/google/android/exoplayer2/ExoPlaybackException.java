package com.google.android.exoplayer2;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlaybackException extends Exception {
    public static final int TYPE_OUT_OF_MEMORY = 4;
    public static final int TYPE_REMOTE = 3;
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;

    @Nullable
    private final Throwable cause;

    @Nullable
    public final Format rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final long timestampMs;
    public final int type;

    /* JADX INFO: loaded from: classes.dex */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    private ExoPlaybackException(int i, String str) {
        super(str);
        this.type = i;
        this.rendererIndex = -1;
        this.rendererFormat = null;
        this.rendererFormatSupport = 0;
        this.cause = null;
        this.timestampMs = SystemClock.elapsedRealtime();
    }

    public static ExoPlaybackException createForOutOfMemoryError(OutOfMemoryError outOfMemoryError) {
        return new ExoPlaybackException(4, outOfMemoryError);
    }

    public static ExoPlaybackException createForRemote(String str) {
        return new ExoPlaybackException(3, str);
    }

    public static ExoPlaybackException createForRenderer(Exception exc, int i, @Nullable Format format, int i2) {
        return new ExoPlaybackException(1, exc, i, format, format == null ? 4 : i2);
    }

    public static ExoPlaybackException createForSource(IOException iOException) {
        return new ExoPlaybackException(0, iOException);
    }

    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException) {
        return new ExoPlaybackException(2, runtimeException);
    }

    public OutOfMemoryError getOutOfMemoryError() {
        Assertions.checkState(this.type == 4);
        return (OutOfMemoryError) Assertions.checkNotNull(this.cause);
    }

    public Exception getRendererException() {
        Assertions.checkState(this.type == 1);
        return (Exception) Assertions.checkNotNull(this.cause);
    }

    public IOException getSourceException() {
        Assertions.checkState(this.type == 0);
        return (IOException) Assertions.checkNotNull(this.cause);
    }

    public RuntimeException getUnexpectedException() {
        Assertions.checkState(this.type == 2);
        return (RuntimeException) Assertions.checkNotNull(this.cause);
    }

    private ExoPlaybackException(int i, Throwable th) {
        this(i, th, -1, null, 4);
    }

    private ExoPlaybackException(int i, Throwable th, int i2, @Nullable Format format, int i3) {
        super(th);
        this.type = i;
        this.cause = th;
        this.rendererIndex = i2;
        this.rendererFormat = format;
        this.rendererFormatSupport = i3;
        this.timestampMs = SystemClock.elapsedRealtime();
    }
}
