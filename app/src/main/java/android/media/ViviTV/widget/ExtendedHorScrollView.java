package android.media.ViviTV.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public class ExtendedHorScrollView extends HorizontalScrollView {

    /* JADX INFO: renamed from: c */
    public static final String f9930c = "ExtendedHorScrollView";

    /* JADX INFO: renamed from: a */
    public boolean f9931a;

    /* JADX INFO: renamed from: b */
    public int f9932b;

    /* JADX WARN: Invalid debug info offset */
    public ExtendedHorScrollView(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ExtendedHorScrollView(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ExtendedHorScrollView(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @RequiresApi(api = 21)
    public ExtendedHorScrollView(Context context, AttributeSet attributeSet, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public int m14404a() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final boolean m14405b() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLockFocusDownView(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setLockedFocusDownId(int i) {
    }
}
