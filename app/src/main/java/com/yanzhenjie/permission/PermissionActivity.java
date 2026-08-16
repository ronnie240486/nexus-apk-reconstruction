package com.yanzhenjie.permission;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(api = 23)
public final class PermissionActivity extends Activity {
    static final String KEY_INPUT_PERMISSIONS = "KEY_INPUT_PERMISSIONS";
    private static PermissionListener sPermissionListener;
    private static RationaleListener sRationaleListener;

    public interface PermissionListener {
        void onRequestPermissionsResult(@NonNull String[] strArr, @NonNull int[] iArr);
    }

    public interface RationaleListener {
        void onRationaleResult(boolean z);
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setPermissionListener(PermissionListener permissionListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setRationaleListener(RationaleListener rationaleListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
    }
}
