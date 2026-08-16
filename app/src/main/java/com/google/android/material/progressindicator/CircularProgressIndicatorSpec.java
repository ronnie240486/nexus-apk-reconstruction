package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import com.google.android.material.C3387R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import p000.C0978P9;

/* JADX INFO: loaded from: classes2.dex */
public final class CircularProgressIndicatorSpec extends BaseProgressIndicatorSpec {
    public int indicatorDirection;

    @Px
    public int indicatorInset;

    @Px
    public int indicatorSize;

    public CircularProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C3387R.attr.circularProgressIndicatorStyle);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicatorSpec
    public void validateSpec() {
        if (this.indicatorSize >= this.trackThickness * 2) {
            return;
        }
        StringBuilder sb = new StringBuilder("The indicatorSize (");
        sb.append(this.indicatorSize);
        sb.append(" px) cannot be less than twice of the trackThickness (");
        throw new IllegalArgumentException(C0978P9.m4377a(sb, this.trackThickness, " px)."));
    }

    public CircularProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        this(context, attributeSet, i, CircularProgressIndicator.DEF_STYLE_RES);
    }

    public CircularProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C3387R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C3387R.dimen.mtrl_progress_circular_inset_medium);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C3387R.styleable.CircularProgressIndicator, i, i2, new int[0]);
        this.indicatorSize = MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, C3387R.styleable.CircularProgressIndicator_indicatorSize, dimensionPixelSize);
        this.indicatorInset = MaterialResources.getDimensionPixelSize(context, typedArrayObtainStyledAttributes, C3387R.styleable.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        this.indicatorDirection = typedArrayObtainStyledAttributes.getInt(C3387R.styleable.CircularProgressIndicator_indicatorDirectionCircular, 0);
        typedArrayObtainStyledAttributes.recycle();
        validateSpec();
    }
}
