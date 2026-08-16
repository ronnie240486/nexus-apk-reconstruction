package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C2439R;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;
import java.lang.ref.WeakReference;
import p000.C0206D3;
import p000.C0269E3;
import p000.C0333F3;
import p000.C0396G3;
import p000.C0460H3;
import p000.C0523I3;
import p000.C0586J3;
import p000.C0649K3;

/* JADX INFO: loaded from: classes.dex */
class AppCompatTextHelper {
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int TEXT_FONT_WEIGHT_UNSPECIFIED = -1;
    private boolean mAsyncFontPending;

    @NonNull
    private final AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper;
    private TintInfo mDrawableBottomTint;
    private TintInfo mDrawableEndTint;
    private TintInfo mDrawableLeftTint;
    private TintInfo mDrawableRightTint;
    private TintInfo mDrawableStartTint;
    private TintInfo mDrawableTint;
    private TintInfo mDrawableTopTint;
    private Typeface mFontTypeface;

    @NonNull
    private final TextView mView;
    private int mStyle = 0;
    private int mFontWeight = -1;

    public AppCompatTextHelper(@NonNull TextView textView) {
        this.mView = textView;
        this.mAutoSizeTextHelper = new AppCompatTextViewAutoSizeHelper(textView);
    }

    private void applyCompoundDrawableTint(Drawable drawable, TintInfo tintInfo) {
        if (drawable == null || tintInfo == null) {
            return;
        }
        AppCompatDrawableManager.tintDrawable(drawable, tintInfo, this.mView.getDrawableState());
    }

    private static TintInfo createTintInfo(Context context, AppCompatDrawableManager appCompatDrawableManager, int i) {
        ColorStateList tintList = appCompatDrawableManager.getTintList(context, i);
        if (tintList == null) {
            return null;
        }
        TintInfo tintInfo = new TintInfo();
        tintInfo.mHasTintList = true;
        tintInfo.mTintList = tintList;
        return tintInfo;
    }

    private void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.mView.getCompoundDrawablesRelative();
            TextView textView = this.mView;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.mView.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            TextView textView2 = this.mView;
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            Drawable drawable8 = compoundDrawablesRelative2[2];
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
        TextView textView3 = this.mView;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void setCompoundTints() {
        TintInfo tintInfo = this.mDrawableTint;
        this.mDrawableLeftTint = tintInfo;
        this.mDrawableTopTint = tintInfo;
        this.mDrawableRightTint = tintInfo;
        this.mDrawableBottomTint = tintInfo;
        this.mDrawableStartTint = tintInfo;
        this.mDrawableEndTint = tintInfo;
    }

    private void setTextSizeInternal(int i, float f) {
        this.mAutoSizeTextHelper.setTextSizeInternal(i, f);
    }

    private void updateTypefaceAndStyle(Context context, TintTypedArray tintTypedArray) {
        String string;
        Typeface typefaceCreate;
        Typeface typeface;
        this.mStyle = tintTypedArray.getInt(C2439R.styleable.TextAppearance_android_textStyle, this.mStyle);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int i2 = tintTypedArray.getInt(C2439R.styleable.TextAppearance_android_textFontWeight, -1);
            this.mFontWeight = i2;
            if (i2 != -1) {
                this.mStyle &= 2;
            }
        }
        if (!tintTypedArray.hasValue(C2439R.styleable.TextAppearance_android_fontFamily) && !tintTypedArray.hasValue(C2439R.styleable.TextAppearance_fontFamily)) {
            if (tintTypedArray.hasValue(C2439R.styleable.TextAppearance_android_typeface)) {
                this.mAsyncFontPending = false;
                int i3 = tintTypedArray.getInt(C2439R.styleable.TextAppearance_android_typeface, 1);
                if (i3 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (i3 == 2) {
                    typeface = Typeface.SERIF;
                } else if (i3 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.mFontTypeface = typeface;
                return;
            }
            return;
        }
        this.mFontTypeface = null;
        int i4 = tintTypedArray.hasValue(C2439R.styleable.TextAppearance_fontFamily) ? C2439R.styleable.TextAppearance_fontFamily : C2439R.styleable.TextAppearance_android_fontFamily;
        final int i5 = this.mFontWeight;
        final int i6 = this.mStyle;
        if (!context.isRestricted()) {
            final WeakReference weakReference = new WeakReference(this.mView);
            try {
                Typeface font = tintTypedArray.getFont(i4, this.mStyle, new ResourcesCompat.FontCallback() { // from class: androidx.appcompat.widget.AppCompatTextHelper.1
                    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                    public void onFontRetrievalFailed(int i7) {
                    }

                    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                    public void onFontRetrieved(@NonNull Typeface typeface2) {
                        int i7;
                        if (Build.VERSION.SDK_INT >= 28 && (i7 = i5) != -1) {
                            typeface2 = C0649K3.m3076a(typeface2, i7, (i6 & 2) != 0);
                        }
                        AppCompatTextHelper.this.onAsyncTypefaceReceived(weakReference, typeface2);
                    }
                });
                if (font != null) {
                    if (i >= 28 && this.mFontWeight != -1) {
                        font = C0649K3.m3076a(Typeface.create(font, 0), this.mFontWeight, (this.mStyle & 2) != 0);
                    }
                    this.mFontTypeface = font;
                }
                this.mAsyncFontPending = this.mFontTypeface == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.mFontTypeface != null || (string = tintTypedArray.getString(i4)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.mFontWeight == -1) {
            typefaceCreate = Typeface.create(string, this.mStyle);
        } else {
            typefaceCreate = C0649K3.m3076a(Typeface.create(string, 0), this.mFontWeight, (this.mStyle & 2) != 0);
        }
        this.mFontTypeface = typefaceCreate;
    }

    public void applyCompoundDrawablesTints() {
        if (this.mDrawableLeftTint != null || this.mDrawableTopTint != null || this.mDrawableRightTint != null || this.mDrawableBottomTint != null) {
            Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
            applyCompoundDrawableTint(compoundDrawables[0], this.mDrawableLeftTint);
            applyCompoundDrawableTint(compoundDrawables[1], this.mDrawableTopTint);
            applyCompoundDrawableTint(compoundDrawables[2], this.mDrawableRightTint);
            applyCompoundDrawableTint(compoundDrawables[3], this.mDrawableBottomTint);
        }
        if (this.mDrawableStartTint == null && this.mDrawableEndTint == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.mView.getCompoundDrawablesRelative();
        applyCompoundDrawableTint(compoundDrawablesRelative[0], this.mDrawableStartTint);
        applyCompoundDrawableTint(compoundDrawablesRelative[2], this.mDrawableEndTint);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void autoSizeText() {
        this.mAutoSizeTextHelper.autoSizeText();
    }

    public int getAutoSizeMaxTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMaxTextSize();
    }

    public int getAutoSizeMinTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMinTextSize();
    }

    public int getAutoSizeStepGranularity() {
        return this.mAutoSizeTextHelper.getAutoSizeStepGranularity();
    }

    public int[] getAutoSizeTextAvailableSizes() {
        return this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
    }

    public int getAutoSizeTextType() {
        return this.mAutoSizeTextHelper.getAutoSizeTextType();
    }

    @Nullable
    public ColorStateList getCompoundDrawableTintList() {
        TintInfo tintInfo = this.mDrawableTint;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getCompoundDrawableTintMode() {
        TintInfo tintInfo = this.mDrawableTint;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isAutoSizeEnabled() {
        return this.mAutoSizeTextHelper.isAutoSizeEnabled();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0118  */
    /* JADX WARN: Code duplicated, block: B:46:0x011f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0131  */
    @SuppressLint({"NewApi"})
    public void loadFromAttributes(@Nullable AttributeSet attributeSet, int i) {
        String string;
        String string2;
        ColorStateList colorStateList;
        boolean z;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        boolean z2;
        int i2;
        AppCompatDrawableManager appCompatDrawableManager;
        int i3;
        Context context = this.mView.getContext();
        AppCompatDrawableManager appCompatDrawableManager2 = AppCompatDrawableManager.get();
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C2439R.styleable.AppCompatTextHelper, i, 0);
        TextView textView = this.mView;
        ViewCompat.saveAttributeDataForStyleable(textView, textView.getContext(), C2439R.styleable.AppCompatTextHelper, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i, 0);
        int resourceId = tintTypedArrayObtainStyledAttributes.getResourceId(C2439R.styleable.AppCompatTextHelper_android_textAppearance, -1);
        if (tintTypedArrayObtainStyledAttributes.hasValue(C2439R.styleable.AppCompatTextHelper_android_drawableLeft)) {
            this.mDrawableLeftTint = createTintInfo(context, appCompatDrawableManager2, tintTypedArrayObtainStyledAttributes.getResourceId(C2439R.styleable.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(C2439R.styleable.AppCompatTextHelper_android_drawableTop)) {
            this.mDrawableTopTint = createTintInfo(context, appCompatDrawableManager2, tintTypedArrayObtainStyledAttributes.getResourceId(C2439R.styleable.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(C2439R.styleable.AppCompatTextHelper_android_drawableRight)) {
            this.mDrawableRightTint = createTintInfo(context, appCompatDrawableManager2, tintTypedArrayObtainStyledAttributes.getResourceId(C2439R.styleable.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(C2439R.styleable.AppCompatTextHelper_android_drawableBottom)) {
            this.mDrawableBottomTint = createTintInfo(context, appCompatDrawableManager2, tintTypedArrayObtainStyledAttributes.getResourceId(C2439R.styleable.AppCompatTextHelper_android_drawableBottom, 0));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (tintTypedArrayObtainStyledAttributes.hasValue(C2439R.styleable.AppCompatTextHelper_android_drawableStart)) {
            this.mDrawableStartTint = createTintInfo(context, appCompatDrawableManager2, tintTypedArrayObtainStyledAttributes.getResourceId(C2439R.styleable.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(C2439R.styleable.AppCompatTextHelper_android_drawableEnd)) {
            this.mDrawableEndTint = createTintInfo(context, appCompatDrawableManager2, tintTypedArrayObtainStyledAttributes.getResourceId(C2439R.styleable.AppCompatTextHelper_android_drawableEnd, 0));
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        boolean z3 = this.mView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId != -1) {
            TintTypedArray tintTypedArrayObtainStyledAttributes2 = TintTypedArray.obtainStyledAttributes(context, resourceId, C2439R.styleable.TextAppearance);
            if (z3 || !tintTypedArrayObtainStyledAttributes2.hasValue(C2439R.styleable.TextAppearance_textAllCaps)) {
                z = false;
                z2 = false;
            } else {
                z = tintTypedArrayObtainStyledAttributes2.getBoolean(C2439R.styleable.TextAppearance_textAllCaps, false);
                z2 = true;
            }
            updateTypefaceAndStyle(context, tintTypedArrayObtainStyledAttributes2);
            if (i4 < 23) {
                colorStateList = tintTypedArrayObtainStyledAttributes2.hasValue(C2439R.styleable.TextAppearance_android_textColor) ? tintTypedArrayObtainStyledAttributes2.getColorStateList(C2439R.styleable.TextAppearance_android_textColor) : null;
                colorStateList2 = tintTypedArrayObtainStyledAttributes2.hasValue(C2439R.styleable.TextAppearance_android_textColorHint) ? tintTypedArrayObtainStyledAttributes2.getColorStateList(C2439R.styleable.TextAppearance_android_textColorHint) : null;
                colorStateList3 = tintTypedArrayObtainStyledAttributes2.hasValue(C2439R.styleable.TextAppearance_android_textColorLink) ? tintTypedArrayObtainStyledAttributes2.getColorStateList(C2439R.styleable.TextAppearance_android_textColorLink) : null;
                if (tintTypedArrayObtainStyledAttributes2.hasValue(C2439R.styleable.TextAppearance_textLocale)) {
                    string2 = tintTypedArrayObtainStyledAttributes2.getString(C2439R.styleable.TextAppearance_textLocale);
                } else {
                    string2 = null;
                }
                if (i4 >= 26 || !tintTypedArrayObtainStyledAttributes2.hasValue(C2439R.styleable.TextAppearance_fontVariationSettings)) {
                    string = null;
                } else {
                    string = tintTypedArrayObtainStyledAttributes2.getString(C2439R.styleable.TextAppearance_fontVariationSettings);
                }
                tintTypedArrayObtainStyledAttributes2.recycle();
            } else {
                colorStateList = null;
                colorStateList2 = null;
            }
            if (tintTypedArrayObtainStyledAttributes2.hasValue(C2439R.styleable.TextAppearance_textLocale)) {
                string2 = tintTypedArrayObtainStyledAttributes2.getString(C2439R.styleable.TextAppearance_textLocale);
            } else {
                string2 = null;
            }
            if (i4 >= 26) {
                string = null;
            } else {
                string = null;
            }
            tintTypedArrayObtainStyledAttributes2.recycle();
        } else {
            string = null;
            string2 = null;
            colorStateList = null;
            z = false;
            colorStateList2 = null;
            colorStateList3 = null;
            z2 = false;
        }
        TintTypedArray tintTypedArrayObtainStyledAttributes3 = TintTypedArray.obtainStyledAttributes(context, attributeSet, C2439R.styleable.TextAppearance, i, 0);
        if (z3 || !tintTypedArrayObtainStyledAttributes3.hasValue(C2439R.styleable.TextAppearance_textAllCaps)) {
            i2 = 23;
        } else {
            z = tintTypedArrayObtainStyledAttributes3.getBoolean(C2439R.styleable.TextAppearance_textAllCaps, false);
            i2 = 23;
            z2 = true;
        }
        if (i4 < i2) {
            if (tintTypedArrayObtainStyledAttributes3.hasValue(C2439R.styleable.TextAppearance_android_textColor)) {
                colorStateList = tintTypedArrayObtainStyledAttributes3.getColorStateList(C2439R.styleable.TextAppearance_android_textColor);
            }
            if (tintTypedArrayObtainStyledAttributes3.hasValue(C2439R.styleable.TextAppearance_android_textColorHint)) {
                colorStateList2 = tintTypedArrayObtainStyledAttributes3.getColorStateList(C2439R.styleable.TextAppearance_android_textColorHint);
            }
            if (tintTypedArrayObtainStyledAttributes3.hasValue(C2439R.styleable.TextAppearance_android_textColorLink)) {
                colorStateList3 = tintTypedArrayObtainStyledAttributes3.getColorStateList(C2439R.styleable.TextAppearance_android_textColorLink);
            }
        }
        if (tintTypedArrayObtainStyledAttributes3.hasValue(C2439R.styleable.TextAppearance_textLocale)) {
            string2 = tintTypedArrayObtainStyledAttributes3.getString(C2439R.styleable.TextAppearance_textLocale);
        }
        if (i4 >= 26 && tintTypedArrayObtainStyledAttributes3.hasValue(C2439R.styleable.TextAppearance_fontVariationSettings)) {
            string = tintTypedArrayObtainStyledAttributes3.getString(C2439R.styleable.TextAppearance_fontVariationSettings);
        }
        if (i4 < 28 || !tintTypedArrayObtainStyledAttributes3.hasValue(C2439R.styleable.TextAppearance_android_textSize)) {
            appCompatDrawableManager = appCompatDrawableManager2;
        } else {
            appCompatDrawableManager = appCompatDrawableManager2;
            if (tintTypedArrayObtainStyledAttributes3.getDimensionPixelSize(C2439R.styleable.TextAppearance_android_textSize, -1) == 0) {
                this.mView.setTextSize(0, 0.0f);
            }
        }
        updateTypefaceAndStyle(context, tintTypedArrayObtainStyledAttributes3);
        tintTypedArrayObtainStyledAttributes3.recycle();
        if (colorStateList != null) {
            this.mView.setTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            this.mView.setHintTextColor(colorStateList2);
        }
        if (colorStateList3 != null) {
            this.mView.setLinkTextColor(colorStateList3);
        }
        if (!z3 && z2) {
            setAllCaps(z);
        }
        Typeface typeface = this.mFontTypeface;
        if (typeface != null) {
            if (this.mFontWeight == -1) {
                this.mView.setTypeface(typeface, this.mStyle);
            } else {
                this.mView.setTypeface(typeface);
            }
        }
        if (string != null) {
            C0206D3.m1299a(this.mView, string);
        }
        if (string2 != null) {
            if (i4 >= 24) {
                C0333F3.m1768a(this.mView, C0269E3.m1506a(string2));
            } else if (i4 >= 21) {
                this.mView.setTextLocale(C0396G3.m1985a(string2.substring(0, string2.indexOf(44))));
            }
        }
        this.mAutoSizeTextHelper.loadFromAttributes(attributeSet, i);
        if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE && this.mAutoSizeTextHelper.getAutoSizeTextType() != 0) {
            int[] autoSizeTextAvailableSizes = this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
            if (autoSizeTextAvailableSizes.length > 0) {
                if (C0460H3.m2250a(this.mView) != -1.0f) {
                    C0523I3.m2459a(this.mView, this.mAutoSizeTextHelper.getAutoSizeMinTextSize(), this.mAutoSizeTextHelper.getAutoSizeMaxTextSize(), this.mAutoSizeTextHelper.getAutoSizeStepGranularity(), 0);
                } else {
                    C0586J3.m2897a(this.mView, autoSizeTextAvailableSizes, 0);
                }
            }
        }
        TintTypedArray tintTypedArrayObtainStyledAttributes4 = TintTypedArray.obtainStyledAttributes(context, attributeSet, C2439R.styleable.AppCompatTextView);
        int resourceId2 = tintTypedArrayObtainStyledAttributes4.getResourceId(C2439R.styleable.AppCompatTextView_drawableLeftCompat, -1);
        AppCompatDrawableManager appCompatDrawableManager3 = appCompatDrawableManager;
        Drawable drawable = resourceId2 != -1 ? appCompatDrawableManager3.getDrawable(context, resourceId2) : null;
        int resourceId3 = tintTypedArrayObtainStyledAttributes4.getResourceId(C2439R.styleable.AppCompatTextView_drawableTopCompat, -1);
        Drawable drawable2 = resourceId3 != -1 ? appCompatDrawableManager3.getDrawable(context, resourceId3) : null;
        int resourceId4 = tintTypedArrayObtainStyledAttributes4.getResourceId(C2439R.styleable.AppCompatTextView_drawableRightCompat, -1);
        Drawable drawable3 = resourceId4 != -1 ? appCompatDrawableManager3.getDrawable(context, resourceId4) : null;
        int resourceId5 = tintTypedArrayObtainStyledAttributes4.getResourceId(C2439R.styleable.AppCompatTextView_drawableBottomCompat, -1);
        Drawable drawable4 = resourceId5 != -1 ? appCompatDrawableManager3.getDrawable(context, resourceId5) : null;
        int resourceId6 = tintTypedArrayObtainStyledAttributes4.getResourceId(C2439R.styleable.AppCompatTextView_drawableStartCompat, -1);
        Drawable drawable5 = resourceId6 != -1 ? appCompatDrawableManager3.getDrawable(context, resourceId6) : null;
        int resourceId7 = tintTypedArrayObtainStyledAttributes4.getResourceId(C2439R.styleable.AppCompatTextView_drawableEndCompat, -1);
        setCompoundDrawables(drawable, drawable2, drawable3, drawable4, drawable5, resourceId7 != -1 ? appCompatDrawableManager3.getDrawable(context, resourceId7) : null);
        if (tintTypedArrayObtainStyledAttributes4.hasValue(C2439R.styleable.AppCompatTextView_drawableTint)) {
            TextViewCompat.setCompoundDrawableTintList(this.mView, tintTypedArrayObtainStyledAttributes4.getColorStateList(C2439R.styleable.AppCompatTextView_drawableTint));
        }
        if (tintTypedArrayObtainStyledAttributes4.hasValue(C2439R.styleable.AppCompatTextView_drawableTintMode)) {
            i3 = -1;
            TextViewCompat.setCompoundDrawableTintMode(this.mView, DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes4.getInt(C2439R.styleable.AppCompatTextView_drawableTintMode, -1), null));
        } else {
            i3 = -1;
        }
        int dimensionPixelSize = tintTypedArrayObtainStyledAttributes4.getDimensionPixelSize(C2439R.styleable.AppCompatTextView_firstBaselineToTopHeight, i3);
        int dimensionPixelSize2 = tintTypedArrayObtainStyledAttributes4.getDimensionPixelSize(C2439R.styleable.AppCompatTextView_lastBaselineToBottomHeight, i3);
        int dimensionPixelSize3 = tintTypedArrayObtainStyledAttributes4.getDimensionPixelSize(C2439R.styleable.AppCompatTextView_lineHeight, i3);
        tintTypedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i3) {
            TextViewCompat.setFirstBaselineToTopHeight(this.mView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i3) {
            TextViewCompat.setLastBaselineToBottomHeight(this.mView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i3) {
            TextViewCompat.setLineHeight(this.mView, dimensionPixelSize3);
        }
    }

    public void onAsyncTypefaceReceived(WeakReference<TextView> weakReference, final Typeface typeface) {
        if (this.mAsyncFontPending) {
            this.mFontTypeface = typeface;
            final TextView textView = weakReference.get();
            if (textView != null) {
                if (!ViewCompat.isAttachedToWindow(textView)) {
                    textView.setTypeface(typeface, this.mStyle);
                } else {
                    final int i = this.mStyle;
                    textView.post(new Runnable() { // from class: androidx.appcompat.widget.AppCompatTextHelper.2
                        @Override // java.lang.Runnable
                        public void run() {
                            textView.setTypeface(typeface, i);
                        }
                    });
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
            return;
        }
        autoSizeText();
    }

    public void onSetCompoundDrawables() {
        applyCompoundDrawablesTints();
    }

    public void onSetTextAppearance(Context context, int i) {
        String string;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i, C2439R.styleable.TextAppearance);
        if (tintTypedArrayObtainStyledAttributes.hasValue(C2439R.styleable.TextAppearance_textAllCaps)) {
            setAllCaps(tintTypedArrayObtainStyledAttributes.getBoolean(C2439R.styleable.TextAppearance_textAllCaps, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            if (tintTypedArrayObtainStyledAttributes.hasValue(C2439R.styleable.TextAppearance_android_textColor) && (colorStateList3 = tintTypedArrayObtainStyledAttributes.getColorStateList(C2439R.styleable.TextAppearance_android_textColor)) != null) {
                this.mView.setTextColor(colorStateList3);
            }
            if (tintTypedArrayObtainStyledAttributes.hasValue(C2439R.styleable.TextAppearance_android_textColorLink) && (colorStateList2 = tintTypedArrayObtainStyledAttributes.getColorStateList(C2439R.styleable.TextAppearance_android_textColorLink)) != null) {
                this.mView.setLinkTextColor(colorStateList2);
            }
            if (tintTypedArrayObtainStyledAttributes.hasValue(C2439R.styleable.TextAppearance_android_textColorHint) && (colorStateList = tintTypedArrayObtainStyledAttributes.getColorStateList(C2439R.styleable.TextAppearance_android_textColorHint)) != null) {
                this.mView.setHintTextColor(colorStateList);
            }
        }
        if (tintTypedArrayObtainStyledAttributes.hasValue(C2439R.styleable.TextAppearance_android_textSize) && tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(C2439R.styleable.TextAppearance_android_textSize, -1) == 0) {
            this.mView.setTextSize(0, 0.0f);
        }
        updateTypefaceAndStyle(context, tintTypedArrayObtainStyledAttributes);
        if (i2 >= 26 && tintTypedArrayObtainStyledAttributes.hasValue(C2439R.styleable.TextAppearance_fontVariationSettings) && (string = tintTypedArrayObtainStyledAttributes.getString(C2439R.styleable.TextAppearance_fontVariationSettings)) != null) {
            C0206D3.m1299a(this.mView, string);
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        Typeface typeface = this.mFontTypeface;
        if (typeface != null) {
            this.mView.setTypeface(typeface, this.mStyle);
        }
    }

    public void populateSurroundingTextIfNeeded(@NonNull TextView textView, @Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textView.getText());
    }

    public void setAllCaps(boolean z) {
        this.mView.setAllCaps(z);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i) throws IllegalArgumentException {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeWithDefaults(i);
    }

    public void setCompoundDrawableTintList(@Nullable ColorStateList colorStateList) {
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        TintInfo tintInfo = this.mDrawableTint;
        tintInfo.mTintList = colorStateList;
        tintInfo.mHasTintList = colorStateList != null;
        setCompoundTints();
    }

    public void setCompoundDrawableTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        TintInfo tintInfo = this.mDrawableTint;
        tintInfo.mTintMode = mode;
        tintInfo.mHasTintMode = mode != null;
        setCompoundTints();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setTextSize(int i, float f) {
        if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE || isAutoSizeEnabled()) {
            return;
        }
        setTextSizeInternal(i, f);
    }
}
