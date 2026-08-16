package me.zhanghai.android.materialprogressbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import me.zhanghai.android.materialprogressbar.IntrinsicPaddingDrawable;
import me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable;
import me.zhanghai.android.materialprogressbar.TintableDrawable;

/* JADX INFO: loaded from: classes2.dex */
class BaseProgressLayerDrawable<ProgressDrawableType extends IntrinsicPaddingDrawable & ShowBackgroundDrawable & TintableDrawable, BackgroundDrawableType extends IntrinsicPaddingDrawable & ShowBackgroundDrawable & TintableDrawable> extends LayerDrawable implements IntrinsicPaddingDrawable, MaterialProgressDrawable, ShowBackgroundDrawable, TintableDrawable {
    private float mBackgroundAlpha;
    private BackgroundDrawableType mBackgroundDrawable;
    private ProgressDrawableType mProgressDrawable;
    private ProgressDrawableType mSecondaryProgressDrawable;

    /* JADX WARN: Invalid debug info offset */
    public BaseProgressLayerDrawable(Drawable[] drawableArr, Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
    public boolean getShowBackground() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.IntrinsicPaddingDrawable
    public boolean getUseIntrinsicPadding() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
    public void setShowBackground(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable, me.zhanghai.android.materialprogressbar.TintableDrawable
    @SuppressLint({"NewApi"})
    public void setTint(@ColorInt int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable, me.zhanghai.android.materialprogressbar.TintableDrawable
    @SuppressLint({"NewApi"})
    public void setTintList(@Nullable ColorStateList colorStateList) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable, me.zhanghai.android.materialprogressbar.TintableDrawable
    @SuppressLint({"NewApi"})
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.IntrinsicPaddingDrawable
    public void setUseIntrinsicPadding(boolean z) {
    }
}
