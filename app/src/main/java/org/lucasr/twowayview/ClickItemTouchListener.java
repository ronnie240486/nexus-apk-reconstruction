package org.lucasr.twowayview;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
abstract class ClickItemTouchListener implements RecyclerView.OnItemTouchListener {
    private static final String LOGTAG = "ClickItemTouchListener";
    private final GestureDetector mGestureDetector;

    public class ItemClickGestureDetector extends GestureDetector {
        private final ItemClickGestureListener mGestureListener;
        final /* synthetic */ ClickItemTouchListener this$0;

        /* JADX WARN: Invalid debug info offset */
        public ItemClickGestureDetector(ClickItemTouchListener clickItemTouchListener, Context context, ItemClickGestureListener itemClickGestureListener) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.GestureDetector
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return false;
        }
    }

    public class ItemClickGestureListener extends GestureDetector.SimpleOnGestureListener {
        private final RecyclerView mHostView;
        private View mTargetChild;
        final /* synthetic */ ClickItemTouchListener this$0;

        /* JADX WARN: Invalid debug info offset */
        public ItemClickGestureListener(ClickItemTouchListener clickItemTouchListener, RecyclerView recyclerView) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void dispatchSingleTapUpIfNeeded(MotionEvent motionEvent) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void onCancel(MotionEvent motionEvent) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        public void onUp(MotionEvent motionEvent) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public ClickItemTouchListener(RecyclerView recyclerView) {
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean hasAdapter(RecyclerView recyclerView) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean isAttachedToWindow(RecyclerView recyclerView) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
    }

    public abstract boolean performItemClick(RecyclerView recyclerView, View view, int i, long j);

    public abstract void performItemDown(RecyclerView recyclerView, View view, int i, long j);

    public abstract boolean performItemLongClick(RecyclerView recyclerView, View view, int i, long j);

    public abstract void performItemTouchCancel(RecyclerView recyclerView);

    public abstract void performItemUp(RecyclerView recyclerView, View view, int i, long j);
}
