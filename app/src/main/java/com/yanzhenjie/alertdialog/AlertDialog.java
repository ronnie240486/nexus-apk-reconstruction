package com.yanzhenjie.alertdialog;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.ArrayRes;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AlertDialog {

    public static class APi21Builder implements Builder {
        private android.app.AlertDialog.Builder builder;

        /* JADX WARN: Invalid debug info offset */
        private APi21Builder(@NonNull Context context) {
        }

        /* JADX WARN: Invalid debug info offset */
        private APi21Builder(@NonNull Context context, @StyleRes int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ APi21Builder(Context context, int i, C41741 c41741) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ APi21Builder(Context context, C41741 c41741) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public AlertDialog create() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        @NonNull
        public Context getContext() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setCancelable(boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setCustomTitle(View view) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setIcon(@DrawableRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setIcon(Drawable drawable) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setIconAttribute(@AttrRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setItems(@ArrayRes int i, DialogInterface.OnClickListener onClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setMessage(@StringRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setMessage(CharSequence charSequence) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setMultiChoiceItems(@ArrayRes int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setNegativeButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setNeutralButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setPositiveButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setSingleChoiceItems(@ArrayRes int i, int i2, DialogInterface.OnClickListener onClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setSingleChoiceItems(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setTitle(@StringRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setTitle(CharSequence charSequence) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setView(int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setView(View view) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public AlertDialog show() {
            return null;
        }
    }

    public static class Api20Builder implements Builder {
        private androidx.appcompat.app.AlertDialog.Builder builder;

        /* JADX WARN: Invalid debug info offset */
        private Api20Builder(@NonNull Context context) {
        }

        /* JADX WARN: Invalid debug info offset */
        private Api20Builder(@NonNull Context context, @StyleRes int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ Api20Builder(Context context, int i, C41741 c41741) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ Api20Builder(Context context, C41741 c41741) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public AlertDialog create() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        @NonNull
        public Context getContext() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setCancelable(boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setCustomTitle(View view) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setIcon(@DrawableRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setIcon(Drawable drawable) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setIconAttribute(@AttrRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setItems(@ArrayRes int i, DialogInterface.OnClickListener onClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setMessage(@StringRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setMessage(CharSequence charSequence) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setMultiChoiceItems(@ArrayRes int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setNegativeButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setNeutralButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setPositiveButton(@StringRes int i, DialogInterface.OnClickListener onClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setSingleChoiceItems(@ArrayRes int i, int i2, DialogInterface.OnClickListener onClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setSingleChoiceItems(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setTitle(@StringRes int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setTitle(CharSequence charSequence) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setView(int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public Builder setView(View view) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog.Builder
        public AlertDialog show() {
            return null;
        }
    }

    public static class Api20Dialog extends AlertDialog {
        private androidx.appcompat.app.AlertDialog alertDialog;

        /* JADX WARN: Invalid debug info offset */
        private Api20Dialog(androidx.appcompat.app.AlertDialog alertDialog) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ Api20Dialog(androidx.appcompat.app.AlertDialog alertDialog, C41741 c41741) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog
        public void cancel() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog
        public void dismiss() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog
        public Button getButton(int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog
        @NonNull
        public Context getContext() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog
        @Nullable
        public View getCurrentFocus() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog
        @NonNull
        public LayoutInflater getLayoutInflater() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog
        @Nullable
        public ListView getListView() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog
        @Nullable
        public Activity getOwnerActivity() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog
        public int getVolumeControlStream() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog
        @Nullable
        public Window getWindow() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog
        public boolean isShowing() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog
        public void show() {
        }
    }

    public static class Api21Dialog extends AlertDialog {
        private android.app.AlertDialog alertDialogApp;

        /* JADX WARN: Invalid debug info offset */
        private Api21Dialog(android.app.AlertDialog alertDialog) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ Api21Dialog(android.app.AlertDialog alertDialog, C41741 c41741) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog
        public void cancel() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog
        public void dismiss() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog
        public Button getButton(int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog
        @NonNull
        public Context getContext() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog
        @Nullable
        public View getCurrentFocus() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog
        @NonNull
        public LayoutInflater getLayoutInflater() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog
        @Nullable
        public ListView getListView() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog
        @Nullable
        public Activity getOwnerActivity() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog
        public int getVolumeControlStream() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog
        @Nullable
        public Window getWindow() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog
        public boolean isShowing() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.yanzhenjie.alertdialog.AlertDialog
        public void show() {
        }
    }

    public interface Builder {
        AlertDialog create();

        @NonNull
        Context getContext();

        Builder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener);

        Builder setCancelable(boolean z);

        Builder setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str);

        Builder setCustomTitle(View view);

        Builder setIcon(@DrawableRes int i);

        Builder setIcon(Drawable drawable);

        Builder setIconAttribute(@AttrRes int i);

        Builder setItems(@ArrayRes int i, DialogInterface.OnClickListener onClickListener);

        Builder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener);

        Builder setMessage(@StringRes int i);

        Builder setMessage(CharSequence charSequence);

        Builder setMultiChoiceItems(@ArrayRes int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener);

        Builder setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener);

        Builder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener);

        Builder setNegativeButton(@StringRes int i, DialogInterface.OnClickListener onClickListener);

        Builder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener);

        Builder setNeutralButton(@StringRes int i, DialogInterface.OnClickListener onClickListener);

        Builder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener);

        Builder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener);

        Builder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener);

        Builder setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener);

        Builder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener);

        Builder setPositiveButton(@StringRes int i, DialogInterface.OnClickListener onClickListener);

        Builder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener);

        Builder setSingleChoiceItems(@ArrayRes int i, int i2, DialogInterface.OnClickListener onClickListener);

        Builder setSingleChoiceItems(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener);

        Builder setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener);

        Builder setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener);

        Builder setTitle(@StringRes int i);

        Builder setTitle(CharSequence charSequence);

        Builder setView(int i);

        Builder setView(View view);

        AlertDialog show();
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public static Builder build(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Builder build(Context context, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Builder newBuilder(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Builder newBuilder(Context context, int i) {
        return null;
    }

    public abstract void cancel();

    public abstract void dismiss();

    public abstract Button getButton(int i);

    @NonNull
    public abstract Context getContext();

    @Nullable
    public abstract View getCurrentFocus();

    @NonNull
    public abstract LayoutInflater getLayoutInflater();

    @Nullable
    public abstract ListView getListView();

    @Nullable
    public abstract Activity getOwnerActivity();

    public abstract int getVolumeControlStream();

    @Nullable
    public abstract Window getWindow();

    public abstract boolean isShowing();

    public abstract void show();
}
