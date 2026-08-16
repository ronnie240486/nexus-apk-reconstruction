package me.zhanghai.android.materialprogressbar;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;

/* JADX INFO: loaded from: classes2.dex */
abstract class BaseIndeterminateProgressDrawable extends BaseProgressDrawable implements Animatable {
    protected Animator[] mAnimators;

    /* JADX WARN: Invalid debug info offset */
    @SuppressLint({"NewApi"})
    public BaseIndeterminateProgressDrawable(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean isStarted() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // me.zhanghai.android.materialprogressbar.BaseDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Animatable
    public void start() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.graphics.drawable.Animatable
    public void stop() {
    }
}
