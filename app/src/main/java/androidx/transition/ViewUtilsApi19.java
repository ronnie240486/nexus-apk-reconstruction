package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import p000.C5987j30;
import p000.C5994k30;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
class ViewUtilsApi19 extends ViewUtilsBase {
    private static boolean sTryHiddenTransitionAlpha = true;

    @Override // androidx.transition.ViewUtilsBase
    public void clearNonTransitionAlpha(@NonNull View view) {
    }

    @Override // androidx.transition.ViewUtilsBase
    @SuppressLint({"NewApi"})
    public float getTransitionAlpha(@NonNull View view) {
        if (sTryHiddenTransitionAlpha) {
            try {
                return C5994k30.m21695a(view);
            } catch (NoSuchMethodError unused) {
                sTryHiddenTransitionAlpha = false;
            }
        }
        return view.getAlpha();
    }

    @Override // androidx.transition.ViewUtilsBase
    public void saveNonTransitionAlpha(@NonNull View view) {
    }

    @Override // androidx.transition.ViewUtilsBase
    @SuppressLint({"NewApi"})
    public void setTransitionAlpha(@NonNull View view, float f) {
        if (sTryHiddenTransitionAlpha) {
            try {
                C5987j30.m21485a(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                sTryHiddenTransitionAlpha = false;
            }
        }
        view.setAlpha(f);
    }
}
