package me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes2.dex */
abstract class BasePaintDrawable extends BaseDrawable {
    private Paint mPaint;

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.BaseDrawable
    public final void onDraw(Canvas canvas, int i, int i2) {
    }

    public abstract void onDraw(Canvas canvas, int i, int i2, Paint paint);

    public abstract void onPreparePaint(Paint paint);
}
