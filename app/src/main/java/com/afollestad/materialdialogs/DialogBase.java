package com.afollestad.materialdialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.afollestad.materialdialogs.internal.MDRootLayout;

/* JADX INFO: loaded from: classes.dex */
class DialogBase extends Dialog implements DialogInterface.OnShowListener {

    /* JADX INFO: renamed from: a */
    public MDRootLayout f10545a;

    /* JADX INFO: renamed from: b */
    public DialogInterface.OnShowListener f10546b;

    /* JADX WARN: Invalid debug info offset */
    public DialogBase(Context context, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final void m16828b() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public final void m16829c(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Dialog
    public View findViewById(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Dialog
    @Deprecated
    public void setContentView(int i) throws IllegalAccessError {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Dialog
    @Deprecated
    public void setContentView(@NonNull View view) throws IllegalAccessError {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Dialog
    @Deprecated
    public void setContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessError {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
    }
}
