package com.cdnbye.libdc;

import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class LibVersion {

    public static final class CppProxy extends LibVersion {
        private final AtomicBoolean destroyed;
        private final long nativeRef;

        /* JADX WARN: Invalid debug info offset */
        private CppProxy(long j) {
        }

        public static native void nativeDestroy(long j);
    }

    @NonNull
    public static native String version();
}
