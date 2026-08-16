package me.zhanghai.android.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes2.dex */
class SingleHorizontalProgressDrawable extends BaseSingleHorizontalProgressDrawable implements ShowBackgroundDrawable {
    private static final int LEVEL_MAX = 10000;
    private boolean mShowBackground;

    /* JADX WARN: Invalid debug info offset */
    public SingleHorizontalProgressDrawable(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.ShowBackgroundDrawable
    public boolean getShowBackground() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.BaseSingleHorizontalProgressDrawable
    public void onDrawRect(Canvas canvas, Paint paint) {
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
