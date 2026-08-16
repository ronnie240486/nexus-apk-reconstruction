package me.zhanghai.android.materialprogressbar;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialProgressBar extends ProgressBar {
    public static final int DETERMINATE_CIRCULAR_PROGRESS_STYLE_DYNAMIC = 1;
    public static final int DETERMINATE_CIRCULAR_PROGRESS_STYLE_NORMAL = 0;
    public static final int PROGRESS_STYLE_CIRCULAR = 0;
    public static final int PROGRESS_STYLE_HORIZONTAL = 1;
    private static final String TAG = "MaterialProgressBar";
    private int mProgressStyle;
    private TintInfo mProgressTintInfo;
    private boolean mSuperInitialized;

    public static class TintInfo {
        public boolean mHasIndeterminateTint;
        public boolean mHasIndeterminateTintMode;
        public boolean mHasProgressBackgroundTint;
        public boolean mHasProgressBackgroundTintMode;
        public boolean mHasProgressTint;
        public boolean mHasProgressTintMode;
        public boolean mHasSecondaryProgressTint;
        public boolean mHasSecondaryProgressTintMode;
        public ColorStateList mIndeterminateTint;
        public PorterDuff.Mode mIndeterminateTintMode;
        public ColorStateList mProgressBackgroundTint;
        public PorterDuff.Mode mProgressBackgroundTintMode;
        public ColorStateList mProgressTint;
        public PorterDuff.Mode mProgressTintMode;
        public ColorStateList mSecondaryProgressTint;
        public PorterDuff.Mode mSecondaryProgressTintMode;

        /* JADX WARN: Invalid debug info offset */
        private TintInfo() {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ TintInfo(C48211 c48211) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public MaterialProgressBar(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public MaterialProgressBar(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public MaterialProgressBar(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(21)
    public MaterialProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void applyIndeterminateTint() {
    }

    /* JADX WARN: Invalid debug info offset */
    private void applyPrimaryProgressTint() {
    }

    /* JADX WARN: Invalid debug info offset */
    private void applyProgressBackgroundTint() {
    }

    /* JADX WARN: Invalid debug info offset */
    private void applyProgressTints() {
    }

    /* JADX WARN: Invalid debug info offset */
    private void applySecondaryProgressTint() {
    }

    /* JADX WARN: Invalid debug info offset */
    @SuppressLint({"NewApi"})
    private void applyTintForDrawable(Drawable drawable, ColorStateList colorStateList, boolean z, PorterDuff.Mode mode, boolean z2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void fixCanvasScalingAndColorFilterWhenHardwareAccelerated() {
    }

    /* JADX WARN: Invalid debug info offset */
    private Drawable getTintTargetFromProgressDrawable(int i, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private void init(AttributeSet attributeSet, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getIndeterminateTintList() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getIndeterminateTintMode() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getProgressBackgroundTintList() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getProgressBackgroundTintMode() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getProgressStyle() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getProgressTintList() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getProgressTintMode() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ProgressBar
    @Nullable
    public ColorStateList getSecondaryProgressTintList() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ProgressBar
    @Nullable
    public PorterDuff.Mode getSecondaryProgressTintMode() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean getShowProgressBackground() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean getUseIntrinsicPadding() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean r2) {
        /*
            r1 = this;
            return
        L18:
        */
        throw new UnsupportedOperationException("Method not decompiled: me.zhanghai.android.materialprogressbar.MaterialProgressBar.setIndeterminate(boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ProgressBar
    public void setIndeterminateTintList(@Nullable ColorStateList colorStateList) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ProgressBar
    public void setIndeterminateTintMode(@Nullable PorterDuff.Mode mode) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ProgressBar
    public void setProgressBackgroundTintList(@Nullable ColorStateList colorStateList) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ProgressBar
    public void setProgressBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ProgressBar
    public void setProgressTintList(@Nullable ColorStateList colorStateList) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ProgressBar
    public void setProgressTintMode(@Nullable PorterDuff.Mode mode) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ProgressBar
    public void setSecondaryProgressTintList(@Nullable ColorStateList colorStateList) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ProgressBar
    public void setSecondaryProgressTintMode(@Nullable PorterDuff.Mode mode) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setShowProgressBackground(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setUseIntrinsicPadding(boolean z) {
    }
}
