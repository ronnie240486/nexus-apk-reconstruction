package me.zhanghai.android.materialprogressbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class IndeterminateHorizontalProgressDrawable extends BaseIndeterminateProgressDrawable implements MaterialProgressDrawable, ShowBackgroundDrawable {
    private static final int PADDED_INTRINSIC_HEIGHT_DP = 16;
    private static final int PROGRESS_INTRINSIC_HEIGHT_DP = 4;
    private float mBackgroundAlpha;
    private int mPaddedIntrinsicHeight;
    private int mProgressIntrinsicHeight;
    private RectTransformX mRect1TransformX;
    private RectTransformX mRect2TransformX;
    private boolean mShowBackground;
    private static final RectF RECT_BOUND = new RectF(-180.0f, -1.0f, 180.0f, 1.0f);
    private static final RectF RECT_PADDED_BOUND = new RectF(-180.0f, -4.0f, 180.0f, 4.0f);
    private static final RectF RECT_PROGRESS = new RectF(-144.0f, -1.0f, 144.0f, 1.0f);
    private static final RectTransformX RECT_1_TRANSFORM_X = new RectTransformX(-522.6f, 0.1f);
    private static final RectTransformX RECT_2_TRANSFORM_X = new RectTransformX(-197.6f, 0.1f);

    public static class RectTransformX {
        public float mScaleX;
        public float mTranslateX;

        /* JADX WARN: Invalid debug info offset */
        public RectTransformX(float f, float f2) {
        }

        /* JADX WARN: Invalid debug info offset */
        public RectTransformX(RectTransformX rectTransformX) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Keep
        public void setScaleX(float f) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Keep
        public void setTranslateX(float f) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public IndeterminateHorizontalProgressDrawable(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    private static void drawBackgroundRect(Canvas canvas, Paint paint) {
    }

    /* JADX WARN: Invalid debug info offset */
    private static void drawProgressRect(Canvas canvas, RectTransformX rectTransformX, Paint paint) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.BaseIndeterminateProgressDrawable, me.zhanghai.android.materialprogressbar.BaseDrawable, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.BaseDrawable, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.BaseDrawable, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.BaseDrawable, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable.ConstantState getConstantState() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.BaseDrawable, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
    public boolean getShowBackground() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.BaseProgressDrawable, me.zhanghai.android.materialprogressbar.IntrinsicPaddingDrawable
    public /* bridge */ /* synthetic */ boolean getUseIntrinsicPadding() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.BaseIndeterminateProgressDrawable, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.BaseDrawable, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isStateful() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.BasePaintDrawable
    public void onDraw(Canvas canvas, int i, int i2, Paint paint) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.BasePaintDrawable
    public void onPreparePaint(Paint paint) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.BaseDrawable, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.BaseDrawable, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
    public void setShowBackground(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.BaseDrawable, android.graphics.drawable.Drawable, me.zhanghai.android.materialprogressbar.TintableDrawable
    public /* bridge */ /* synthetic */ void setTint(@ColorInt int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.BaseDrawable, android.graphics.drawable.Drawable, me.zhanghai.android.materialprogressbar.TintableDrawable
    public /* bridge */ /* synthetic */ void setTintList(@Nullable ColorStateList colorStateList) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.BaseDrawable, android.graphics.drawable.Drawable, me.zhanghai.android.materialprogressbar.TintableDrawable
    public /* bridge */ /* synthetic */ void setTintMode(@NonNull PorterDuff.Mode mode) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.BaseProgressDrawable, me.zhanghai.android.materialprogressbar.IntrinsicPaddingDrawable
    public /* bridge */ /* synthetic */ void setUseIntrinsicPadding(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.BaseIndeterminateProgressDrawable, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.BaseIndeterminateProgressDrawable, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
    }
}
