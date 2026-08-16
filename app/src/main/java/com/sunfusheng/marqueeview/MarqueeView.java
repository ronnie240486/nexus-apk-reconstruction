package com.sunfusheng.marqueeview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.annotation.AnimRes;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MarqueeView extends ViewFlipper {
    private static final int DIRECTION_BOTTOM_TO_TOP = 0;
    private static final int DIRECTION_LEFT_TO_RIGHT = 3;
    private static final int DIRECTION_RIGHT_TO_LEFT = 2;
    private static final int DIRECTION_TOP_TO_BOTTOM = 1;
    private static final int GRAVITY_CENTER = 1;
    private static final int GRAVITY_LEFT = 0;
    private static final int GRAVITY_RIGHT = 2;
    private int animDuration;
    private int direction;
    private int gravity;
    private boolean hasSetAnimDuration;
    private boolean hasSetDirection;

    @AnimRes
    private int inAnimResId;
    private int interval;
    private List<? extends CharSequence> notices;
    private OnItemClickListener onItemClickListener;

    @AnimRes
    private int outAnimResId;
    private int position;
    private boolean singleLine;
    private int textColor;
    private int textSize;

    /* JADX INFO: renamed from: com.sunfusheng.marqueeview.MarqueeView$1 */
    public class ViewTreeObserverOnGlobalLayoutListenerC40511 implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ MarqueeView this$0;
        final /* synthetic */ int val$inAnimResId;
        final /* synthetic */ String val$notice;
        final /* synthetic */ int val$outAnimResID;

        /* JADX WARN: Invalid debug info offset */
        public ViewTreeObserverOnGlobalLayoutListenerC40511(MarqueeView marqueeView, String str, int i, int i2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }
    }

    /* JADX INFO: renamed from: com.sunfusheng.marqueeview.MarqueeView$2 */
    public class RunnableC40522 implements Runnable {
        final /* synthetic */ MarqueeView this$0;
        final /* synthetic */ int val$inAnimResId;
        final /* synthetic */ int val$outAnimResID;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC40522(MarqueeView marqueeView, int i, int i2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: com.sunfusheng.marqueeview.MarqueeView$3 */
    public class AnimationAnimationListenerC40533 implements Animation.AnimationListener {
        final /* synthetic */ MarqueeView this$0;

        /* JADX WARN: Invalid debug info offset */
        public AnimationAnimationListenerC40533(MarqueeView marqueeView) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: com.sunfusheng.marqueeview.MarqueeView$4 */
    public class ViewOnClickListenerC40544 implements View.OnClickListener {
        final /* synthetic */ MarqueeView this$0;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC40544(MarqueeView marqueeView) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public interface OnItemClickListener {
        void onItemClick(int i, TextView textView);
    }

    /* JADX WARN: Invalid debug info offset */
    public MarqueeView(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ void access$000(MarqueeView marqueeView, String str, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ void access$100(MarqueeView marqueeView, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ int access$200(MarqueeView marqueeView) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ int access$202(MarqueeView marqueeView, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ int access$208(MarqueeView marqueeView) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ List access$300(MarqueeView marqueeView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ TextView access$400(MarqueeView marqueeView, CharSequence charSequence) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ OnItemClickListener access$500(MarqueeView marqueeView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private TextView createTextView(CharSequence charSequence) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private void init(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void postStart(@AnimRes int i, @AnimRes int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void setInAndOutAnimation(@AnimRes int i, @AnimRes int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void start(@AnimRes int i, @AnimRes int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void startWithFixedWidth(String str, @AnimRes int i, @AnimRes int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public List<? extends CharSequence> getNotices() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getPosition() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setNotices(List<? extends CharSequence> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void startWithList(List<? extends CharSequence> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void startWithList(List<? extends CharSequence> list, @AnimRes int i, @AnimRes int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void startWithText(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void startWithText(String str, @AnimRes int i, @AnimRes int i2) {
    }
}
