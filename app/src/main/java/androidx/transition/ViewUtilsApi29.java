package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import p000.C5987j30;
import p000.C5994k30;
import p000.C6001l30;
import p000.C6008m30;
import p000.C6015n30;
import p000.C6022o30;
import p000.C6029p30;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
class ViewUtilsApi29 extends ViewUtilsApi23 {
    @Override // androidx.transition.ViewUtilsApi19, androidx.transition.ViewUtilsBase
    public float getTransitionAlpha(@NonNull View view) {
        return C5994k30.m21695a(view);
    }

    @Override // androidx.transition.ViewUtilsApi21, androidx.transition.ViewUtilsBase
    public void setAnimationMatrix(@NonNull View view, @Nullable Matrix matrix) {
        C6001l30.m21896a(view, matrix);
    }

    @Override // androidx.transition.ViewUtilsApi22, androidx.transition.ViewUtilsBase
    public void setLeftTopRightBottom(@NonNull View view, int i, int i2, int i3, int i4) {
        C6022o30.m22579a(view, i, i2, i3, i4);
    }

    @Override // androidx.transition.ViewUtilsApi19, androidx.transition.ViewUtilsBase
    public void setTransitionAlpha(@NonNull View view, float f) {
        C5987j30.m21485a(view, f);
    }

    @Override // androidx.transition.ViewUtilsApi23, androidx.transition.ViewUtilsBase
    public void setTransitionVisibility(@NonNull View view, int i) {
        C6029p30.m27364a(view, i);
    }

    @Override // androidx.transition.ViewUtilsApi21, androidx.transition.ViewUtilsBase
    public void transformMatrixToGlobal(@NonNull View view, @NonNull Matrix matrix) {
        C6008m30.m22043a(view, matrix);
    }

    @Override // androidx.transition.ViewUtilsApi21, androidx.transition.ViewUtilsBase
    public void transformMatrixToLocal(@NonNull View view, @NonNull Matrix matrix) {
        C6015n30.m22276a(view, matrix);
    }
}
