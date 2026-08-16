package net.soulwolf.widget.ratiolayout.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import net.soulwolf.widget.ratiolayout.RatioDatumMode;
import net.soulwolf.widget.ratiolayout.RatioLayoutDelegate;
import net.soulwolf.widget.ratiolayout.RatioMeasureDelegate;

/* JADX INFO: loaded from: classes2.dex */
public class RatioCheckBox extends CheckBox implements RatioMeasureDelegate {
    private RatioLayoutDelegate mRatioLayoutDelegate;

    /* JADX WARN: Invalid debug info offset */
    public RatioCheckBox(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RatioCheckBox(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RatioCheckBox(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(21)
    public RatioCheckBox(Context context, AttributeSet attributeSet, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // net.soulwolf.widget.ratiolayout.RatioMeasureDelegate
    public void setAspectRatio(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // net.soulwolf.widget.ratiolayout.RatioMeasureDelegate
    public void setRatio(RatioDatumMode ratioDatumMode, float f, float f2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // net.soulwolf.widget.ratiolayout.RatioMeasureDelegate
    public void setSquare(boolean z) {
    }
}
