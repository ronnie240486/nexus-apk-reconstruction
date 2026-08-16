package com.yanzhenjie.permission;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public interface Request {
    Request callback(Object obj);

    @NonNull
    Request permission(String... strArr);

    @NonNull
    Request permission(String[]... strArr);

    @NonNull
    Request rationale(RationaleListener rationaleListener);

    @NonNull
    Request requestCode(int i);

    @Deprecated
    void send();

    void start();
}
