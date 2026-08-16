package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.CompoundButtonCompat;
import com.google.android.material.C3387R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialRadioButton extends AppCompatRadioButton {
    private static final int DEF_STYLE_RES = C3387R.style.Widget_MaterialComponents_CompoundButton_RadioButton;
    private static final int[][] ENABLED_CHECKED_STATES = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    @Nullable
    private ColorStateList materialThemeColorsTintList;
    private boolean useMaterialThemeColors;

    public MaterialRadioButton(@NonNull Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.materialThemeColorsTintList == null) {
            int color = MaterialColors.getColor(this, C3387R.attr.colorControlActivated);
            int color2 = MaterialColors.getColor(this, C3387R.attr.colorOnSurface);
            int color3 = MaterialColors.getColor(this, C3387R.attr.colorSurface);
            int[][] iArr = ENABLED_CHECKED_STATES;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = MaterialColors.layer(color3, color, 1.0f);
            iArr2[1] = MaterialColors.layer(color3, color2, 0.54f);
            iArr2[2] = MaterialColors.layer(color3, color2, 0.38f);
            iArr2[3] = MaterialColors.layer(color3, color2, 0.38f);
            this.materialThemeColorsTintList = new ColorStateList(iArr, iArr2);
        }
        return this.materialThemeColorsTintList;
    }

    public boolean isUseMaterialThemeColors() {
        return this.useMaterialThemeColors;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.useMaterialThemeColors && CompoundButtonCompat.getButtonTintList(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.useMaterialThemeColors = z;
        CompoundButtonCompat.setButtonTintList(this, z ? getMaterialThemeColorsTintList() : null);
    }

    public MaterialRadioButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C3387R.attr.radioButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialRadioButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C3387R.styleable.MaterialRadioButton, i, i2, new int[0]);
        if (typedArrayObtainStyledAttributes.hasValue(C3387R.styleable.MaterialRadioButton_buttonTint)) {
            CompoundButtonCompat.setButtonTintList(this, MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, C3387R.styleable.MaterialRadioButton_buttonTint));
        }
        this.useMaterialThemeColors = typedArrayObtainStyledAttributes.getBoolean(C3387R.styleable.MaterialRadioButton_useMaterialThemeColors, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
