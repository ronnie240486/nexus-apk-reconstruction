package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import p000.C6029p30;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
class ViewUtilsApi23 extends ViewUtilsApi22 {
    private static boolean sTryHiddenSetTransitionVisibility = true;

    @Override // androidx.transition.ViewUtilsBase
    @SuppressLint({"NewApi"})
    public void setTransitionVisibility(@NonNull View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.setTransitionVisibility(view, i);
        } else if (sTryHiddenSetTransitionVisibility) {
            try {
                C6029p30.m27364a(view, i);
            } catch (NoSuchMethodError unused) {
                sTryHiddenSetTransitionVisibility = false;
            }
        }
    }
}
