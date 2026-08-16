package me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes2.dex */
class CircularProgressBackgroundDrawable extends BaseSingleCircularProgressDrawable implements ShowBackgroundDrawable {
    private boolean mShow;

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.BaseDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
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
    @Override // me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
    public void setShowBackground(boolean z) {
    }
}
