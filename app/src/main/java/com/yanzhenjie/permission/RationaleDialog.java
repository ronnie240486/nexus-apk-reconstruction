package com.yanzhenjie.permission;

import android.content.Context;
import android.content.DialogInterface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.yanzhenjie.alertdialog.AlertDialog;

/* JADX INFO: loaded from: classes2.dex */
public class RationaleDialog {
    private AlertDialog.Builder mBuilder;
    private DialogInterface.OnClickListener mClickListener;
    private Rationale mRationale;

    /* JADX INFO: renamed from: com.yanzhenjie.permission.RationaleDialog$1 */
    public class DialogInterfaceOnClickListenerC41771 implements DialogInterface.OnClickListener {
        final /* synthetic */ RationaleDialog this$0;

        /* JADX WARN: Invalid debug info offset */
        public DialogInterfaceOnClickListenerC41771(RationaleDialog rationaleDialog) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public RationaleDialog(@NonNull Context context, @NonNull Rationale rationale) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ Rationale access$000(RationaleDialog rationaleDialog) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public RationaleDialog setMessage(@StringRes int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public RationaleDialog setMessage(@NonNull String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public RationaleDialog setNegativeButton(@StringRes int i, @Nullable DialogInterface.OnClickListener onClickListener) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public RationaleDialog setNegativeButton(@NonNull String str, @Nullable DialogInterface.OnClickListener onClickListener) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public RationaleDialog setPositiveButton(@StringRes int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public RationaleDialog setPositiveButton(@NonNull String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public RationaleDialog setTitle(@StringRes int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public RationaleDialog setTitle(@NonNull String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void show() {
    }
}
