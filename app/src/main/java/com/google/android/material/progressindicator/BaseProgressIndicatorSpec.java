package com.google.android.material.progressindicator;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import com.google.android.material.C3387R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseProgressIndicatorSpec {
    public int hideAnimationBehavior;

    @NonNull
    public int[] indicatorColors = new int[0];
    public int showAnimationBehavior;

    @ColorInt
    public int trackColor;

    @Px
    public int trackCornerRadius;

    @Px
    public int trackThickness;

    public BaseProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C3387R.dimen.mtrl_progress_track_thickness);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C3387R.styleable.BaseProgressIndicator, i, i2, new int[0]);
        this.trackThickness = MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, C3387R.styleable.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        this.trackCornerRadius = Math.min(MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, C3387R.styleable.BaseProgressIndicator_trackCornerRadius, 0), this.trackThickness / 2);
        this.showAnimationBehavior = typedArrayObtainStyledAttributes.getInt(C3387R.styleable.BaseProgressIndicator_showAnimationBehavior, 0);
        this.hideAnimationBehavior = typedArrayObtainStyledAttributes.getInt(C3387R.styleable.BaseProgressIndicator_hideAnimationBehavior, 0);
        loadIndicatorColors(context, typedArrayObtainStyledAttributes);
        loadTrackColor(context, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void loadIndicatorColors(@NonNull Context context, @NonNull TypedArray typedArray) {
        if (!typedArray.hasValue(C3387R.styleable.BaseProgressIndicator_indicatorColor)) {
            this.indicatorColors = new int[]{MaterialColors.getColor(context, C3387R.attr.colorPrimary, -1)};
            return;
        }
        if (typedArray.peekValue(C3387R.styleable.BaseProgressIndicator_indicatorColor).type != 1) {
            this.indicatorColors = new int[]{typedArray.getColor(C3387R.styleable.BaseProgressIndicator_indicatorColor, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(C3387R.styleable.BaseProgressIndicator_indicatorColor, -1));
        this.indicatorColors = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    private void loadTrackColor(@NonNull Context context, @NonNull TypedArray typedArray) {
        int iCompositeARGBWithAlpha;
        if (typedArray.hasValue(C3387R.styleable.BaseProgressIndicator_trackColor)) {
            iCompositeARGBWithAlpha = typedArray.getColor(C3387R.styleable.BaseProgressIndicator_trackColor, -1);
        } else {
            this.trackColor = this.indicatorColors[0];
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
            float f = typedArrayObtainStyledAttributes.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes.recycle();
            iCompositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(this.trackColor, (int) (f * 255.0f));
        }
        this.trackColor = iCompositeARGBWithAlpha;
    }

    public boolean isHideAnimationEnabled() {
        return this.hideAnimationBehavior != 0;
    }

    public boolean isShowAnimationEnabled() {
        return this.showAnimationBehavior != 0;
    }

    public abstract void validateSpec();
}
