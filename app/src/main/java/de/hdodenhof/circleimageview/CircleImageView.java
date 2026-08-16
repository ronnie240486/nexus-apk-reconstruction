package de.hdodenhof.circleimageview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
public class CircleImageView extends ImageView {

    /* JADX INFO: renamed from: A */
    public static final boolean f13612A = false;

    /* JADX INFO: renamed from: u */
    public static final ImageView.ScaleType f13613u = ImageView.ScaleType.CENTER_CROP;

    /* JADX INFO: renamed from: v */
    public static final Bitmap.Config f13614v = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: w */
    public static final int f13615w = 2;

    /* JADX INFO: renamed from: x */
    public static final int f13616x = 0;

    /* JADX INFO: renamed from: y */
    public static final int f13617y = -16777216;

    /* JADX INFO: renamed from: z */
    public static final int f13618z = 0;

    /* JADX INFO: renamed from: a */
    public final RectF f13619a;

    /* JADX INFO: renamed from: b */
    public final RectF f13620b;

    /* JADX INFO: renamed from: c */
    public final Matrix f13621c;

    /* JADX INFO: renamed from: d */
    public final Paint f13622d;

    /* JADX INFO: renamed from: e */
    public final Paint f13623e;

    /* JADX INFO: renamed from: f */
    public final Paint f13624f;

    /* JADX INFO: renamed from: g */
    public int f13625g;

    /* JADX INFO: renamed from: h */
    public int f13626h;

    /* JADX INFO: renamed from: i */
    public int f13627i;

    /* JADX INFO: renamed from: j */
    public Bitmap f13628j;

    /* JADX INFO: renamed from: k */
    public BitmapShader f13629k;

    /* JADX INFO: renamed from: l */
    public int f13630l;

    /* JADX INFO: renamed from: m */
    public int f13631m;

    /* JADX INFO: renamed from: n */
    public float f13632n;

    /* JADX INFO: renamed from: o */
    public float f13633o;

    /* JADX INFO: renamed from: p */
    public ColorFilter f13634p;

    /* JADX INFO: renamed from: q */
    public boolean f13635q;

    /* JADX INFO: renamed from: r */
    public boolean f13636r;

    /* JADX INFO: renamed from: s */
    public boolean f13637s;

    /* JADX INFO: renamed from: t */
    public boolean f13638t;

    /* JADX INFO: renamed from: de.hdodenhof.circleimageview.CircleImageView$b */
    @RequiresApi(api = 21)
    public class C4236b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CircleImageView f13639a;

        /* JADX WARN: Invalid debug info offset */
        public C4236b(CircleImageView circleImageView) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ C4236b(CircleImageView circleImageView, C4235a c4235a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
        }
    }

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
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ RectF m19944a(CircleImageView circleImageView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final void m19945b() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public final RectF m19946c() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: d */
    public final android.graphics.Bitmap m19947d(android.graphics.drawable.Drawable r7) {
        /*
            r6 = this;
            r0 = 0
            return r0
        L1b:
        */
        throw new UnsupportedOperationException("Method not decompiled: de.hdodenhof.circleimageview.CircleImageView.m19947d(android.graphics.drawable.Drawable):android.graphics.Bitmap");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public int m19948e() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public int m19949f() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public int m19950g() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ImageView
    public ColorFilter getColorFilter() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public final boolean m19951h(float f, float f2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public final void m19952i() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public final void m19953j() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public boolean m19954k() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public boolean m19955l() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public final void m19956m() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public final void m19957n() {
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
    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setBorderColor(@ColorInt int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setBorderOverlay(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setBorderWidth(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCircleBackgroundColor(@ColorInt int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCircleBackgroundColorResource(@ColorRes int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setDisableCircularTransformation(boolean z) {
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
    public void setImageResource(@DrawableRes int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
    }
}
