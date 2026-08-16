package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import p000.C6022o30;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(22)
class ViewUtilsApi22 extends ViewUtilsApi21 {
    private static boolean sTryHiddenSetLeftTopRightBottom = true;

    @Override // androidx.transition.ViewUtilsBase
    @SuppressLint({"NewApi"})
    public void setLeftTopRightBottom(@NonNull View view, int i, int i2, int i3, int i4) {
        if (sTryHiddenSetLeftTopRightBottom) {
            try {
                C6022o30.m22579a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                sTryHiddenSetLeftTopRightBottom = false;
            }
        }
    }
}
