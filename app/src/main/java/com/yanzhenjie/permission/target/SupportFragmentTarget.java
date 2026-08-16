package com.yanzhenjie.permission.target;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes2.dex */
public class SupportFragmentTarget implements Target {
    private Fragment mFragment;

    /* JADX WARN: Invalid debug info offset */
    public SupportFragmentTarget(Fragment fragment) {
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
