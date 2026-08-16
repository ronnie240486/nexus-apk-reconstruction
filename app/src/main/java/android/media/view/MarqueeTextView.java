package android.media.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class MarqueeTextView extends TextView {
    /* JADX WARN: Invalid debug info offset */
    public MarqueeTextView(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public MarqueeTextView(Context context, AttributeSet attributeSet) {
    }

    @Override // android.view.View
    public boolean isFocused() {
        return true;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
    }
}
