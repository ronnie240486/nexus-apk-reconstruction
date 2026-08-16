package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* JADX INFO: loaded from: classes2.dex */
abstract class DrawingDelegate<S extends BaseProgressIndicatorSpec> {
    protected DrawableWithAnimatedVisibilityChange drawable;
    S spec;

    public DrawingDelegate(S s2) {
        this.spec = s2;
    }

    public abstract void adjustCanvas(@NonNull Canvas canvas, @FloatRange(from = 0.0d, m14515to = 1.0d) float f);

    public abstract void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange(from = 0.0d, m14515to = 1.0d) float f, @FloatRange(from = 0.0d, m14515to = 1.0d) float f2, @ColorInt int i);

    public abstract void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint);

    public abstract int getPreferredHeight();

    public abstract int getPreferredWidth();

    public void registerDrawable(@NonNull DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
        this.drawable = drawableWithAnimatedVisibilityChange;
    }

    public void validateSpecAndAdjustCanvas(@NonNull Canvas canvas, @FloatRange(from = 0.0d, m14515to = 1.0d) float f) {
        this.spec.validateSpec();
        adjustCanvas(canvas, f);
    }
}
