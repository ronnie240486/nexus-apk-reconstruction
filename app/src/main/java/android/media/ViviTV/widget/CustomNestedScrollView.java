package android.media.ViviTV.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public class CustomNestedScrollView extends ScrollView {

    /* JADX INFO: renamed from: a */
    public boolean f9914a;

    /* JADX WARN: Invalid debug info offset */
    public CustomNestedScrollView(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CustomNestedScrollView(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CustomNestedScrollView(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @RequiresApi(api = 21)
    public CustomNestedScrollView(Context context, AttributeSet attributeSet, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public boolean m14395a() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setDisabledIfChildScrollNotNeeded(boolean z) {
    }
}
