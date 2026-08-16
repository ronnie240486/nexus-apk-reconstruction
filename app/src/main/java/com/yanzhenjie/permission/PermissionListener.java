package com.yanzhenjie.permission;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface PermissionListener {
    void onFailed(int i, @NonNull List<String> list);

    void onSucceed(int i, @NonNull List<String> list);
}
