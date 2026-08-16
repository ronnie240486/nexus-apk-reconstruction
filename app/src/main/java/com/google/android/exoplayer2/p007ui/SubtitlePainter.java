package com.google.android.exoplayer2.p007ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.CaptionStyleCompat;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes.dex */
final class SubtitlePainter {
    private static final float INNER_PADDING_RATIO = 0.125f;
    private static final String TAG = "SubtitlePainter";
    private boolean applyEmbeddedFontSizes;
    private boolean applyEmbeddedStyles;
    private int backgroundColor;
    private final Paint bitmapPaint;
    private Rect bitmapRect;
    private float bottomPaddingFraction;

    @Nullable
    private Bitmap cueBitmap;
    private float cueBitmapHeight;
    private float cueLine;
    private int cueLineAnchor;
    private int cueLineType;
    private float cuePosition;
    private int cuePositionAnchor;
    private float cueSize;

    @Nullable
    private CharSequence cueText;

    @Nullable
    private Layout.Alignment cueTextAlignment;
    private float cueTextSizePx;
    private float defaultTextSizePx;
    private int edgeColor;
    private StaticLayout edgeLayout;
    private int edgeType;
    private int foregroundColor;
    private final float outlineWidth;
    private int parentBottom;
    private int parentLeft;
    private int parentRight;
    private int parentTop;
    private final float shadowOffset;
    private final float shadowRadius;
    private final float spacingAdd;
    private final float spacingMult;
    private StaticLayout textLayout;
    private int textLeft;
    private int textPaddingX;
    private final TextPaint textPaint;
    private int textTop;
    private int windowColor;
    private final Paint windowPaint;

    public SubtitlePainter(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.spacingAdd = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.spacingMult = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.outlineWidth = fRound;
        this.shadowRadius = fRound;
        this.shadowOffset = fRound;
        TextPaint textPaint = new TextPaint();
        this.textPaint = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.windowPaint = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.bitmapPaint = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    private static boolean areCharSequencesEqual(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    @RequiresNonNull({"cueBitmap", "bitmapRect"})
    private void drawBitmapLayout(Canvas canvas) {
        canvas.drawBitmap(this.cueBitmap, (Rect) null, this.bitmapRect, this.bitmapPaint);
    }

    private void drawLayout(Canvas canvas, boolean z) {
        if (z) {
            drawTextLayout(canvas);
            return;
        }
        Assertions.checkNotNull(this.bitmapRect);
        Assertions.checkNotNull(this.cueBitmap);
        drawBitmapLayout(canvas);
    }

    private void drawTextLayout(Canvas canvas) {
        StaticLayout staticLayout = this.textLayout;
        StaticLayout staticLayout2 = this.edgeLayout;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.textLeft, this.textTop);
        if (Color.alpha(this.windowColor) > 0) {
            this.windowPaint.setColor(this.windowColor);
            canvas.drawRect(-this.textPaddingX, 0.0f, staticLayout.getWidth() + this.textPaddingX, staticLayout.getHeight(), this.windowPaint);
        }
        int i = this.edgeType;
        if (i == 1) {
            this.textPaint.setStrokeJoin(Paint.Join.ROUND);
            this.textPaint.setStrokeWidth(this.outlineWidth);
            this.textPaint.setColor(this.edgeColor);
            this.textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i == 2) {
            TextPaint textPaint = this.textPaint;
            float f = this.shadowRadius;
            float f2 = this.shadowOffset;
            textPaint.setShadowLayer(f, f2, f2, this.edgeColor);
        } else if (i == 3 || i == 4) {
            boolean z = i == 3;
            int i2 = z ? -1 : this.edgeColor;
            int i3 = z ? this.edgeColor : -1;
            float f3 = this.shadowRadius / 2.0f;
            this.textPaint.setColor(this.foregroundColor);
            this.textPaint.setStyle(Paint.Style.FILL);
            float f4 = -f3;
            this.textPaint.setShadowLayer(this.shadowRadius, f4, f4, i2);
            staticLayout2.draw(canvas);
            this.textPaint.setShadowLayer(this.shadowRadius, f3, f3, i3);
        }
        this.textPaint.setColor(this.foregroundColor);
        this.textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    /* JADX WARN: Code duplicated, block: B:16:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    @RequiresNonNull({"cueBitmap"})
    private void setupBitmapLayout() {
        float f;
        int i;
        float f2;
        Bitmap bitmap = this.cueBitmap;
        int i2 = this.parentRight;
        int i3 = this.parentLeft;
        int i4 = this.parentBottom;
        int i5 = this.parentTop;
        float f3 = i2 - i3;
        float f4 = (this.cuePosition * f3) + i3;
        float height = i4 - i5;
        float f5 = (this.cueLine * height) + i5;
        int iRound = Math.round(f3 * this.cueSize);
        float f6 = this.cueBitmapHeight;
        if (f6 == -3.4028235E38f) {
            f6 = iRound;
            height = bitmap.getHeight() / bitmap.getWidth();
        }
        int iRound2 = Math.round(height * f6);
        int i6 = this.cuePositionAnchor;
        if (i6 != 2) {
            if (i6 == 1) {
                f = iRound / 2;
            }
            int iRound3 = Math.round(f4);
            i = this.cueLineAnchor;
            if (i == 2) {
                if (i == 1) {
                    f2 = iRound2 / 2;
                }
                int iRound4 = Math.round(f5);
                this.bitmapRect = new Rect(iRound3, iRound4, iRound + iRound3, iRound2 + iRound4);
            }
            f2 = iRound2;
            f5 -= f2;
            int iRound5 = Math.round(f5);
            this.bitmapRect = new Rect(iRound3, iRound5, iRound + iRound3, iRound2 + iRound5);
        }
        f = iRound;
        f4 -= f;
        int iRound6 = Math.round(f4);
        i = this.cueLineAnchor;
        if (i == 2) {
            if (i == 1) {
                f2 = iRound2 / 2;
            }
            int iRound7 = Math.round(f5);
            this.bitmapRect = new Rect(iRound6, iRound7, iRound + iRound6, iRound2 + iRound7);
        }
        f2 = iRound2;
        f5 -= f2;
        int iRound8 = Math.round(f5);
        this.bitmapRect = new Rect(iRound6, iRound8, iRound + iRound6, iRound2 + iRound8);
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x01cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:81:0x01db  */
    /* JADX WARN: Code duplicated, block: B:82:0x01de  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e2  */
    @RequiresNonNull({"cueText"})
    private void setupTextLayout() {
        SpannableStringBuilder spannableStringBuilder;
        CharSequence charSequence;
        int i;
        int iMax;
        int iMin;
        int i2;
        int iRound;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        CharSequence string = this.cueText;
        int i8 = this.parentRight - this.parentLeft;
        int i9 = this.parentBottom - this.parentTop;
        this.textPaint.setTextSize(this.defaultTextSizePx);
        int i10 = (int) ((this.defaultTextSizePx * INNER_PADDING_RATIO) + 0.5f);
        int i11 = i10 * 2;
        int i12 = i8 - i11;
        float f = this.cueSize;
        if (f != -3.4028235E38f) {
            i12 = (int) (i12 * f);
        }
        if (i12 <= 0) {
            Log.m17586w(TAG, "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.applyEmbeddedStyles) {
            if (!this.applyEmbeddedFontSizes) {
                spannableStringBuilder = new SpannableStringBuilder(string);
                int length = spannableStringBuilder.length();
                AbsoluteSizeSpan[] absoluteSizeSpanArr = (AbsoluteSizeSpan[]) spannableStringBuilder.getSpans(0, length, AbsoluteSizeSpan.class);
                RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(0, length, RelativeSizeSpan.class);
                for (AbsoluteSizeSpan absoluteSizeSpan : absoluteSizeSpanArr) {
                    spannableStringBuilder.removeSpan(absoluteSizeSpan);
                }
                for (RelativeSizeSpan relativeSizeSpan : relativeSizeSpanArr) {
                    spannableStringBuilder.removeSpan(relativeSizeSpan);
                }
            } else if (this.cueTextSizePx > 0.0f) {
                spannableStringBuilder = new SpannableStringBuilder(string);
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.cueTextSizePx), 0, spannableStringBuilder.length(), 16711680);
            }
            string = spannableStringBuilder;
        } else {
            string = string.toString();
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string);
        if (this.edgeType == 1) {
            for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ForegroundColorSpan.class)) {
                spannableStringBuilder2.removeSpan(foregroundColorSpan);
            }
        }
        if (Color.alpha(this.backgroundColor) <= 0) {
            charSequence = string;
        } else {
            int i13 = this.edgeType;
            if (i13 == 0 || i13 == 2) {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(string);
                spannableStringBuilder3.setSpan(new BackgroundColorSpan(this.backgroundColor), 0, spannableStringBuilder3.length(), 16711680);
                charSequence = spannableStringBuilder3;
            } else {
                spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.backgroundColor), 0, spannableStringBuilder2.length(), 16711680);
                charSequence = string;
            }
        }
        Layout.Alignment alignment = this.cueTextAlignment;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        StaticLayout staticLayout = new StaticLayout(charSequence, this.textPaint, i12, alignment, this.spacingMult, this.spacingAdd, true);
        this.textLayout = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.textLayout.getLineCount();
        int iMax2 = 0;
        for (int i14 = 0; i14 < lineCount; i14++) {
            iMax2 = Math.max((int) Math.ceil(this.textLayout.getLineWidth(i14)), iMax2);
        }
        if (this.cueSize == -3.4028235E38f || iMax2 >= i12) {
            i12 = iMax2;
        }
        int i15 = i12 + i11;
        float f2 = this.cuePosition;
        if (f2 != -3.4028235E38f) {
            int iRound2 = Math.round(i8 * f2);
            int i16 = this.parentLeft;
            int i17 = iRound2 + i16;
            int i18 = this.cuePositionAnchor;
            i = 2;
            if (i18 == 1) {
                i17 = ((i17 * 2) - i15) / 2;
            } else if (i18 == 2) {
                i17 -= i15;
            }
            iMax = Math.max(i17, i16);
            iMin = Math.min(i15 + iMax, this.parentRight);
        } else {
            i = 2;
            iMax = ((i8 - i15) / 2) + this.parentLeft;
            iMin = iMax + i15;
        }
        int i19 = iMin - iMax;
        if (i19 <= 0) {
            Log.m17586w(TAG, "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f3 = this.cueLine;
        if (f3 != -3.4028235E38f) {
            if (this.cueLineType == 0) {
                iRound = Math.round(i9 * f3);
            } else {
                int lineBottom = this.textLayout.getLineBottom(0) - this.textLayout.getLineTop(0);
                float f4 = this.cueLine;
                if (f4 >= 0.0f) {
                    iRound = Math.round(f4 * lineBottom);
                } else {
                    iRound = Math.round((f4 + 1.0f) * lineBottom);
                    i3 = this.parentBottom;
                }
                i2 = iRound + i3;
                i4 = this.cueLineAnchor;
                if (i4 == i) {
                    i2 -= height;
                } else if (i4 == 1) {
                    i2 = ((i2 * 2) - height) / i;
                }
                i5 = i2 + height;
                i6 = this.parentBottom;
                if (i5 > i6) {
                    i2 = i6 - height;
                } else {
                    i7 = this.parentTop;
                    if (i2 < i7) {
                        i2 = i7;
                    }
                }
            }
            i3 = this.parentTop;
            i2 = iRound + i3;
            i4 = this.cueLineAnchor;
            if (i4 == i) {
                i2 -= height;
            } else if (i4 == 1) {
                i2 = ((i2 * 2) - height) / i;
            }
            i5 = i2 + height;
            i6 = this.parentBottom;
            if (i5 > i6) {
                i2 = i6 - height;
            } else {
                i7 = this.parentTop;
                if (i2 < i7) {
                    i2 = i7;
                }
            }
        } else {
            i2 = (this.parentBottom - height) - ((int) (i9 * this.bottomPaddingFraction));
        }
        Layout.Alignment alignment2 = alignment;
        this.textLayout = new StaticLayout(charSequence, this.textPaint, i19, alignment2, this.spacingMult, this.spacingAdd, true);
        this.edgeLayout = new StaticLayout(spannableStringBuilder2, this.textPaint, i19, alignment2, this.spacingMult, this.spacingAdd, true);
        this.textLeft = iMax;
        this.textTop = i2;
        this.textPaddingX = i10;
    }

    public void draw(Cue cue, boolean z, boolean z2, CaptionStyleCompat captionStyleCompat, float f, float f2, float f3, Canvas canvas, int i, int i2, int i3, int i4) {
        int i5;
        boolean z3 = cue.bitmap == null;
        if (!z3) {
            i5 = -16777216;
        } else if (TextUtils.isEmpty(cue.text)) {
            return;
        } else {
            i5 = (cue.windowColorSet && z) ? cue.windowColor : captionStyleCompat.windowColor;
        }
        if (areCharSequencesEqual(this.cueText, cue.text) && Util.areEqual(this.cueTextAlignment, cue.textAlignment) && this.cueBitmap == cue.bitmap && this.cueLine == cue.line && this.cueLineType == cue.lineType && Util.areEqual(Integer.valueOf(this.cueLineAnchor), Integer.valueOf(cue.lineAnchor)) && this.cuePosition == cue.position && Util.areEqual(Integer.valueOf(this.cuePositionAnchor), Integer.valueOf(cue.positionAnchor)) && this.cueSize == cue.size && this.cueBitmapHeight == cue.bitmapHeight && this.applyEmbeddedStyles == z && this.applyEmbeddedFontSizes == z2 && this.foregroundColor == captionStyleCompat.foregroundColor && this.backgroundColor == captionStyleCompat.backgroundColor && this.windowColor == i5 && this.edgeType == captionStyleCompat.edgeType && this.edgeColor == captionStyleCompat.edgeColor && Util.areEqual(this.textPaint.getTypeface(), captionStyleCompat.typeface) && this.defaultTextSizePx == f && this.cueTextSizePx == f2 && this.bottomPaddingFraction == f3 && this.parentLeft == i && this.parentTop == i2 && this.parentRight == i3 && this.parentBottom == i4) {
            drawLayout(canvas, z3);
            return;
        }
        this.cueText = cue.text;
        this.cueTextAlignment = cue.textAlignment;
        this.cueBitmap = cue.bitmap;
        this.cueLine = cue.line;
        this.cueLineType = cue.lineType;
        this.cueLineAnchor = cue.lineAnchor;
        this.cuePosition = cue.position;
        this.cuePositionAnchor = cue.positionAnchor;
        this.cueSize = cue.size;
        this.cueBitmapHeight = cue.bitmapHeight;
        this.applyEmbeddedStyles = z;
        this.applyEmbeddedFontSizes = z2;
        this.foregroundColor = captionStyleCompat.foregroundColor;
        this.backgroundColor = captionStyleCompat.backgroundColor;
        this.windowColor = i5;
        this.edgeType = captionStyleCompat.edgeType;
        this.edgeColor = captionStyleCompat.edgeColor;
        this.textPaint.setTypeface(captionStyleCompat.typeface);
        this.defaultTextSizePx = f;
        this.cueTextSizePx = f2;
        this.bottomPaddingFraction = f3;
        this.parentLeft = i;
        this.parentTop = i2;
        this.parentRight = i3;
        this.parentBottom = i4;
        if (z3) {
            Assertions.checkNotNull(this.cueText);
            setupTextLayout();
        } else {
            Assertions.checkNotNull(this.cueBitmap);
            setupBitmapLayout();
        }
        drawLayout(canvas, z3);
    }
}
