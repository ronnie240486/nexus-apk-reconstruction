package com.yanzhenjie.permission.target;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public class AppActivityTarget implements Target {
    private Activity mActivity;

    /* JADX WARN: Invalid debug info offset */
    public AppActivityTarget(Activity activity) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.yanzhenjie.permission.target.Target
    public Context getContext() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.yanzhenjie.permission.target.Target
    public void startActivity(Intent intent) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.yanzhenjie.permission.target.Target
    public void startActivityForResult(Intent intent, int i) {
    }
}
