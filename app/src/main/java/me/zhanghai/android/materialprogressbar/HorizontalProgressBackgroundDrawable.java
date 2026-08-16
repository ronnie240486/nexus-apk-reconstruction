package me.zhanghai.android.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;

/* JADX INFO: loaded from: classes2.dex */
class HorizontalProgressBackgroundDrawable extends BaseSingleHorizontalProgressDrawable implements ShowBackgroundDrawable {
    private boolean mShow;

    /* JADX WARN: Invalid debug info offset */
    public HorizontalProgressBackgroundDrawable(Context context) {
    }

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
    @Override // me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
    public void setShowBackground(boolean z) {
    }
}
