package com.yanzhenjie.permission.target;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public class AppFragmentTarget implements Target {
    private Fragment mFragment;

    /* JADX WARN: Invalid debug info offset */
    public AppFragmentTarget(Fragment fragment) {
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
