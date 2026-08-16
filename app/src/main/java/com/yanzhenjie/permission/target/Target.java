package com.yanzhenjie.permission.target;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public interface Target {
    Context getContext();

    void startActivity(Intent intent);

    void startActivityForResult(Intent intent, int i);
}
