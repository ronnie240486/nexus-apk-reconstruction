package android.media.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes.dex */
public class NonSwipeableViewPager extends ViewPager {
    /* JADX WARN: Invalid debug info offset */
    public NonSwipeableViewPager(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public NonSwipeableViewPager(Context context, AttributeSet attributeSet) {
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
