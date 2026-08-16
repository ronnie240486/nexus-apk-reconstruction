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
public class IndeterminateCircularProgressDrawable extends BaseIndeterminateProgressDrawable implements MaterialProgressDrawable {
    private static final int PADDED_INTRINSIC_SIZE_DP = 48;
    private static final int PROGRESS_INTRINSIC_SIZE_DP = 42;
    private static final RectF RECT_BOUND = new RectF(-21.0f, -21.0f, 21.0f, 21.0f);
    private static final RectF RECT_PADDED_BOUND = new RectF(-24.0f, -24.0f, 24.0f, 24.0f);
    private static final RectF RECT_PROGRESS = new RectF(-19.0f, -19.0f, 19.0f, 19.0f);
    private int mPaddedIntrinsicSize;
    private int mProgressIntrinsicSize;
    private RingPathTransform mRingPathTransform;
    private RingRotation mRingRotation;

    public static class RingPathTransform {
        public float mTrimPathEnd;
        public float mTrimPathOffset;
        public float mTrimPathStart;

        /* JADX WARN: Invalid debug info offset */
        private RingPathTransform() {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ RingPathTransform(C48201 c48201) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Keep
        public void setTrimPathEnd(float f) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Keep
        public void setTrimPathOffset(float f) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Keep
        public void setTrimPathStart(float f) {
        }
    }

    public static class RingRotation {
        private float mRotation;

        /* JADX WARN: Invalid debug info offset */
        private RingRotation() {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ RingRotation(C48201 c48201) {
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ float access$200(RingRotation ringRotation) {
            return 0.0f;
        }

        /* JADX WARN: Invalid debug info offset */
        @Keep
        public void setRotation(float f) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public IndeterminateCircularProgressDrawable(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void drawRing(Canvas canvas, Paint paint) {
    }

    /* JADX WARN: Invalid debug info offset */
    private int getIntrinsicSize() {
        return 0;
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
    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.BaseDrawable, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return 0;
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
