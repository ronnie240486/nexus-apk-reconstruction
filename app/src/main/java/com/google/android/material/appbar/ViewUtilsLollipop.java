package com.google.android.material.appbar;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.material.C3387R;
import com.google.android.material.internal.ThemeEnforcement;
import p000.C6036q30;
import p000.C6043r30;
import p000.C6057t30;
import p000.C6064u30;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(21)
class ViewUtilsLollipop {
    private static final int[] STATE_LIST_ANIM_ATTRS = {R.attr.stateListAnimator};

    public static void setBoundsViewOutlineProvider(@NonNull View view) {
        C6064u30.m28565a(view, C6057t30.m28362a());
    }

    public static void setDefaultAppBarLayoutStateListAnimator(@NonNull View view, float f) {
        int integer = view.getResources().getInteger(C3387R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.enabled, C3387R.attr.state_liftable, -C3387R.attr.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.enabled}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    public static void setStateListAnimatorFromAttrs(@NonNull View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, STATE_LIST_ANIM_ATTRS, i, i2, new int[0]);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                C6043r30.m27789a(view, C6036q30.m27588a(context, typedArrayObtainStyledAttributes.getResourceId(0, 0)));
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
