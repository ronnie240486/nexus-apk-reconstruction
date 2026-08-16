package android.media.ViviTV.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.RelativeLayout;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public class ExtendedRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public InterfaceC2364a f9933a;

    /* JADX INFO: renamed from: android.media.ViviTV.widget.ExtendedRelativeLayout$a */
    public interface InterfaceC2364a {
        boolean dispatchKeyEvent(KeyEvent keyEvent);
    }

    /* JADX WARN: Invalid debug info offset */
    public ExtendedRelativeLayout(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ExtendedRelativeLayout(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ExtendedRelativeLayout(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @RequiresApi(api = 21)
    public ExtendedRelativeLayout(Context context, AttributeSet attributeSet, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setKeyEventDispatcher(InterfaceC2364a interfaceC2364a) {
    }
}
