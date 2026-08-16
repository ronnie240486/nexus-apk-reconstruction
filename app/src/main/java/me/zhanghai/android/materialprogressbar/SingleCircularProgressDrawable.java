package me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes2.dex */
class SingleCircularProgressDrawable extends BaseSingleCircularProgressDrawable implements ShowBackgroundDrawable {
    private static final int LEVEL_MAX = 10000;
    private static final float START_ANGLE_MAX_DYNAMIC = 360.0f;
    private static final float START_ANGLE_MAX_NORMAL = 0.0f;
    private static final float SWEEP_ANGLE_MAX = 360.0f;
    private boolean mShowBackground;
    private final float mStartAngleMax;

    /* JADX WARN: Invalid debug info offset */
    public SingleCircularProgressDrawable(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
    public boolean getShowBackground() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.BaseSingleCircularProgressDrawable
    public void onDrawRing(Canvas canvas, Paint paint) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
    public void setShowBackground(boolean z) {
    }
}
