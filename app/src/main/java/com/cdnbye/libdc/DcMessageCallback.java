package com.cdnbye.libdc;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface DcMessageCallback {
    void onBinary(@NonNull byte[] bArr);

    void onText(@NonNull String str);
}
