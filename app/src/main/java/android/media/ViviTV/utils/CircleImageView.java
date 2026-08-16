package android.media.ViviTV.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class CircleImageView extends ImageView {

    /* JADX INFO: renamed from: p */
    public static final ImageView.ScaleType f9634p = ImageView.ScaleType.CENTER_CROP;

    /* JADX INFO: renamed from: q */
    public static final Bitmap.Config f9635q = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: r */
    public static final int f9636r = 1;

    /* JADX INFO: renamed from: s */
    public static final int f9637s = 0;

    /* JADX INFO: renamed from: t */
    public static final int f9638t = -16777216;

    /* JADX INFO: renamed from: a */
    public final RectF f9639a;

    /* JADX INFO: renamed from: b */
    public final RectF f9640b;

    /* JADX INFO: renamed from: c */
    public final Matrix f9641c;

    /* JADX INFO: renamed from: d */
    public final Paint f9642d;

    /* JADX INFO: renamed from: e */
    public final Paint f9643e;

    /* JADX INFO: renamed from: f */
    public int f9644f;

    /* JADX INFO: renamed from: g */
    public int f9645g;

    /* JADX INFO: renamed from: h */
    public Bitmap f9646h;

    /* JADX INFO: renamed from: i */
    public BitmapShader f9647i;

    /* JADX INFO: renamed from: j */
    public int f9648j;

    /* JADX INFO: renamed from: k */
    public int f9649k;

    /* JADX INFO: renamed from: l */
    public float f9650l;

    /* JADX INFO: renamed from: m */
    public float f9651m;

    /* JADX INFO: renamed from: n */
    public boolean f9652n;

    /* JADX INFO: renamed from: o */
    public boolean f9653o;

    /* JADX WARN: Invalid debug info offset */
    public CircleImageView(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CircleImageView(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public final android.graphics.Bitmap m14104a(android.graphics.drawable.Drawable r7) {
        /*
            r6 = this;
            r0 = 0
            return r0
        L3e:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.utils.CircleImageView.m14104a(android.graphics.drawable.Drawable):android.graphics.Bitmap");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public int m14105b() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public int m14106c() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public final void m14107d() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public final void m14108e() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public final void m14109f() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setBorderColor(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setBorderWidth(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ImageView
    public void setImageResource(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
    }
}
