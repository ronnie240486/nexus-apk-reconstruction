package com.yanzhenjie.permission;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.yanzhenjie.permission.target.Target;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class DefaultRequest implements Request, Rationale, PermissionActivity.RationaleListener, PermissionActivity.PermissionListener {
    private static final String TAG = "AndPermission";
    private Object mCallback;
    private String[] mDeniedPermissions;
    private String[] mPermissions;
    private RationaleListener mRationaleListener;
    private int mRequestCode;
    private Target target;

    /* JADX WARN: Invalid debug info offset */
    public DefaultRequest(Target target) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0015
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private static void callbackAnnotation(java.lang.Object r5, int r6, java.lang.Class<? extends java.lang.annotation.Annotation> r7, java.util.List<java.lang.String> r8) {
        /*
            return
        L25:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yanzhenjie.permission.DefaultRequest.callbackAnnotation(java.lang.Object, int, java.lang.Class, java.util.List):void");
    }

    /* JADX WARN: Invalid debug info offset */
    private void callbackFailed(List<String> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void callbackSucceed() {
    }

    /* JADX WARN: Invalid debug info offset */
    private static Method[] findMethodForRequestCode(@NonNull Class<?> cls, @NonNull Class<? extends Annotation> cls2, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @RequiresApi(api = 23)
    private static String[] getDeniedPermissions(Context context, @NonNull String... strArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static boolean isSameRequestCode(@NonNull Method method, @NonNull Class<? extends Annotation> cls, int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.yanzhenjie.permission.Request
    public Request callback(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.yanzhenjie.permission.Cancelable
    public void cancel() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.yanzhenjie.permission.PermissionActivity.RationaleListener
    @RequiresApi(api = 23)
    public void onRationaleResult(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.yanzhenjie.permission.PermissionActivity.PermissionListener
    public void onRequestPermissionsResult(@NonNull String[] strArr, @NonNull int[] iArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.yanzhenjie.permission.Request
    @NonNull
    public Request permission(String... strArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.yanzhenjie.permission.Request
    @NonNull
    public Request permission(String[]... strArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.yanzhenjie.permission.Request
    @NonNull
    public Request rationale(RationaleListener rationaleListener) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.yanzhenjie.permission.Request
    @NonNull
    public Request requestCode(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.yanzhenjie.permission.Rationale
    @RequiresApi(api = 23)
    public void resume() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.yanzhenjie.permission.Request
    @Deprecated
    public void send() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.yanzhenjie.permission.Request
    public void start() {
    }
}
