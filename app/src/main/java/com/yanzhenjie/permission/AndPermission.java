package com.yanzhenjie.permission;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class AndPermission {
    /* JADX WARN: Invalid debug info offset */
    private AndPermission() {
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public static SettingDialog defaultSettingDialog(@NonNull Activity activity, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public static SettingDialog defaultSettingDialog(@NonNull Fragment fragment, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public static SettingDialog defaultSettingDialog(@NonNull Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public static SettingDialog defaultSettingDialog(@NonNull androidx.fragment.app.Fragment fragment, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public static SettingService defineSettingDialog(@NonNull Activity activity, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public static SettingService defineSettingDialog(@NonNull Fragment fragment, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public static SettingService defineSettingDialog(@NonNull Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public static SettingService defineSettingDialog(@NonNull androidx.fragment.app.Fragment fragment, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean hasAlwaysDeniedPermission(@NonNull Activity activity, @NonNull List<String> list) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean hasAlwaysDeniedPermission(@NonNull Fragment fragment, @NonNull List<String> list) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean hasAlwaysDeniedPermission(@NonNull Context context, @NonNull List<String> list) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean hasAlwaysDeniedPermission(@NonNull androidx.fragment.app.Fragment fragment, @NonNull List<String> list) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean hasPermission(@NonNull Context context, @NonNull List<String> list) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean hasPermission(@NonNull Context context, @NonNull String... strArr) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public static RationaleDialog rationaleDialog(@NonNull Context context, Rationale rationale) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public static Request with(@NonNull Activity activity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public static Request with(@NonNull Fragment fragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public static Request with(@NonNull Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    public static Request with(@NonNull androidx.fragment.app.Fragment fragment) {
        return null;
    }
}
