package com.yanzhenjie.permission;

import android.content.Context;
import android.content.DialogInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.yanzhenjie.alertdialog.AlertDialog;

/* JADX INFO: loaded from: classes2.dex */
public class SettingDialog {
    private AlertDialog.Builder mBuilder;
    private DialogInterface.OnClickListener mClickListener;
    private SettingService mSettingService;

    /* JADX INFO: renamed from: com.yanzhenjie.permission.SettingDialog$1 */
    public class DialogInterfaceOnClickListenerC41781 implements DialogInterface.OnClickListener {
        final /* synthetic */ SettingDialog this$0;

        /* JADX WARN: Invalid debug info offset */
        public DialogInterfaceOnClickListenerC41781(SettingDialog settingDialog) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public SettingDialog(@NonNull Context context, @NonNull SettingService settingService) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ SettingService access$000(SettingDialog settingDialog) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public SettingDialog setMessage(@StringRes int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public SettingDialog setMessage(@NonNull String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public SettingDialog setNegativeButton(@StringRes int i, @Nullable DialogInterface.OnClickListener onClickListener) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public SettingDialog setNegativeButton(@NonNull String str, @Nullable DialogInterface.OnClickListener onClickListener) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public SettingDialog setPositiveButton(@StringRes int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public SettingDialog setPositiveButton(@NonNull String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public SettingDialog setTitle(@StringRes int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public SettingDialog setTitle(@NonNull String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void show() {
    }
}
