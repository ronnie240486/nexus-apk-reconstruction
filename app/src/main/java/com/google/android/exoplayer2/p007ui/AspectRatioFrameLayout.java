package com.google.android.exoplayer2.p007ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    private static final float MAX_ASPECT_RATIO_DEFORMATION_FRACTION = 0.01f;
    public static final int RESIZE_MODE_FILL = 3;
    public static final int RESIZE_MODE_FIT = 0;
    public static final int RESIZE_MODE_FIXED_HEIGHT = 2;
    public static final int RESIZE_MODE_FIXED_WIDTH = 1;
    public static final int RESIZE_MODE_ZOOM = 4;

    @Nullable
    private AspectRatioListener aspectRatioListener;
    private final AspectRatioUpdateDispatcher aspectRatioUpdateDispatcher;
    private int resizeMode;
    private float videoAspectRatio;

    public interface AspectRatioListener {
        void onAspectRatioUpdated(float f, float f2, boolean z);
    }

    public final class AspectRatioUpdateDispatcher implements Runnable {
        private boolean aspectRatioMismatch;
        private boolean isScheduled;
        private float naturalAspectRatio;
        private float targetAspectRatio;

        private AspectRatioUpdateDispatcher() {
        }

        @Override // java.lang.Runnable
        public void run() {
            this.isScheduled = false;
            if (AspectRatioFrameLayout.this.aspectRatioListener == null) {
                return;
            }
            AspectRatioFrameLayout.this.aspectRatioListener.onAspectRatioUpdated(this.targetAspectRatio, this.naturalAspectRatio, this.aspectRatioMismatch);
        }

        public void scheduleUpdate(float f, float f2, boolean z) {
            this.targetAspectRatio = f;
            this.naturalAspectRatio = f2;
            this.aspectRatioMismatch = z;
            if (this.isScheduled) {
                return;
            }
            this.isScheduled = true;
            AspectRatioFrameLayout.this.post(this);
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ResizeMode {
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public int getResizeMode() {
        return this.resizeMode;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.videoAspectRatio <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = measuredWidth;
        float f2 = measuredHeight;
        float f3 = f / f2;
        float f4 = (this.videoAspectRatio / f3) - 1.0f;
        if (Math.abs(f4) <= MAX_ASPECT_RATIO_DEFORMATION_FRACTION) {
            this.aspectRatioUpdateDispatcher.scheduleUpdate(this.videoAspectRatio, f3, false);
            return;
        }
        int i3 = this.resizeMode;
        if (i3 != 0) {
            if (i3 == 1) {
                measuredHeight = (int) (f / this.videoAspectRatio);
            } else if (i3 == 2) {
                measuredWidth = (int) (f2 * this.videoAspectRatio);
            } else if (i3 == 4) {
                if (f4 > 0.0f) {
                    measuredWidth = (int) (f2 * this.videoAspectRatio);
                } else {
                    measuredHeight = (int) (f / this.videoAspectRatio);
                }
            }
        } else if (f4 > 0.0f) {
            measuredHeight = (int) (f / this.videoAspectRatio);
        } else {
            measuredWidth = (int) (f2 * this.videoAspectRatio);
        }
        this.aspectRatioUpdateDispatcher.scheduleUpdate(this.videoAspectRatio, f3, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.videoAspectRatio != f) {
            this.videoAspectRatio = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@Nullable AspectRatioListener aspectRatioListener) {
        this.aspectRatioListener = aspectRatioListener;
    }

    public void setResizeMode(int i) {
        if (this.resizeMode != i) {
            this.resizeMode = i;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.resizeMode = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C3355R.styleable.AspectRatioFrameLayout, 0, 0);
            try {
                this.resizeMode = typedArrayObtainStyledAttributes.getInt(C3355R.styleable.AspectRatioFrameLayout_resize_mode, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.aspectRatioUpdateDispatcher = new AspectRatioUpdateDispatcher();
    }
}
