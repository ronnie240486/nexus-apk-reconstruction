package org.lucasr.twowayview;

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TwoWayLayoutManager extends RecyclerView.LayoutManager {
    private static final String LOGTAG = "TwoWayLayoutManager";
    private boolean hasChildBefore;
    protected int mFirstChildTopBeforeDetach;
    private boolean mIsVertical;
    private int mLayoutEnd;
    private int mLayoutStart;
    private int mLayoutStartBeforeDetach;
    private SavedState mPendingSavedState;
    private int mPendingScrollOffset;
    private int mPendingScrollPosition;
    private RecyclerView mRecyclerView;

    /* JADX INFO: renamed from: org.lucasr.twowayview.TwoWayLayoutManager$1 */
    public class C50701 extends LinearSmoothScroller {
        final /* synthetic */ TwoWayLayoutManager this$0;

        /* JADX WARN: Invalid debug info offset */
        public C50701(TwoWayLayoutManager twoWayLayoutManager, Context context) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public PointF computeScrollVectorForPosition(int i) {
            return null;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int getHorizontalSnapPreference() {
            return -1;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int getVerticalSnapPreference() {
            return -1;
        }
    }

    public enum Direction {
        START,
        END
    }

    public enum Orientation {
        HORIZONTAL,
        VERTICAL
    }

    public static class SavedState implements Parcelable {
        private int anchorItemPosition;
        private Bundle itemSelectionState;
        private final Parcelable superState;
        protected static final SavedState EMPTY_STATE = new SavedState();
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: org.lucasr.twowayview.TwoWayLayoutManager.SavedState.1
            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: createFromParcel, reason: avoid collision after fix types in other method */
            public SavedState createFromParcel2(Parcel parcel) {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: newArray, reason: avoid collision after fix types in other method */
            public SavedState[] newArray2(int i) {
                return null;
            }
        };

        /* JADX WARN: Invalid debug info offset */
        private SavedState() {
        }

        /* JADX WARN: Invalid debug info offset */
        public SavedState(Parcel parcel) {
        }

        /* JADX WARN: Invalid debug info offset */
        public SavedState(Parcelable parcelable) {
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ Bundle access$000(SavedState savedState) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ Bundle access$002(SavedState savedState, Bundle bundle) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ int access$100(SavedState savedState) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ int access$102(SavedState savedState, int i) {
            return 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public Parcelable getSuperState() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public TwoWayLayoutManager(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public TwoWayLayoutManager(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public TwoWayLayoutManager(Orientation orientation) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ boolean access$200(TwoWayLayoutManager twoWayLayoutManager) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private void adjustViewsStartOrEnd() {
    }

    /* JADX WARN: Invalid debug info offset */
    private void correctTooHigh(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void correctTooLow(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void fillAfter(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void fillAfter(int i, RecyclerView.Recycler recycler, RecyclerView.State state, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void fillBefore(int i, RecyclerView.Recycler recycler) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void fillBefore(int i, RecyclerView.Recycler recycler, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void fillFromScrapList(List<RecyclerView.ViewHolder> list, Direction direction) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void fillGap(Direction direction, RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void fillSpecific(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    /* JADX WARN: Invalid debug info offset */
    private int findFirstValidChildPosition(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private static View findNextScrapView(List<RecyclerView.ViewHolder> list, Direction direction, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private Bundle getPendingItemSelectionState() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private int getTotalSpace() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private void handleUpdate() {
    }

    /* JADX WARN: Invalid debug info offset */
    private View makeAndAddView(int i, Direction direction, RecyclerView.Recycler recycler) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private void offsetChildren(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void recycleChildrenFromEnd(Direction direction, RecyclerView.Recycler recycler) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void recycleChildrenFromStart(Direction direction, RecyclerView.Recycler recycler) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void recycleChildrenOutOfBounds(Direction direction, RecyclerView.Recycler recycler) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void resetLayoutEdges() {
    }

    /* JADX WARN: Invalid debug info offset */
    private int scrollBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0013
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private void setupChild(android.view.View r3, org.lucasr.twowayview.TwoWayLayoutManager.Direction r4) {
        /*
            r2 = this;
            return
        L1a:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.lucasr.twowayview.TwoWayLayoutManager.setupChild(android.view.View, org.lucasr.twowayview.TwoWayLayoutManager$Direction):void");
    }

    /* JADX WARN: Invalid debug info offset */
    private void updateLayoutEdgesFromNewChild(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void updateLayoutEdgesFromRemovedChild(View view, Direction direction) {
    }

    public abstract boolean canAddMoreViews(Direction direction, int i);

    /* JADX WARN: Invalid debug info offset */
    public boolean canScrollBackward() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean canScrollForward() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(RecyclerView.State state) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(RecyclerView.State state) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(RecyclerView.State state) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(RecyclerView.State state) {
        return 0;
    }

    public void detachChild(View view, Direction direction) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public RecyclerView.Adapter getAdapter() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getAnchorItemPosition(RecyclerView.State state) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getChildEnd(View view) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getChildStart(View view) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getDecoratedBottom(View view) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getDecoratedLeft(View view) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getDecoratedMeasuredHeight(View view) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getDecoratedMeasuredWidth(View view) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getDecoratedRight(View view) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int getDecoratedTop(View view) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getEndWithPadding() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getExtraLayoutSpace(RecyclerView.State state) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getFirstVisiblePosition() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getLastVisiblePosition() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public Orientation getOrientation() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getPendingScrollOffset() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getPendingScrollPosition() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getStartWithPadding() {
        return 0;
    }

    public abstract void layoutChild(View view, Direction direction);

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void layoutDecorated(View view, int i, int i2, int i3, int i4) {
    }

    public abstract void measureChild(View view, Direction direction);

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void onLayoutScrapList(RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onMeasure(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void scrollToPositionWithOffset(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOrientation(Orientation orientation) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPendingScrollPositionWithOffset(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return true;
    }
}
