package com.cdnbye.libdc;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface LogCallback {
    void onLog(@NonNull LogLevel logLevel, @NonNull String str);
}
