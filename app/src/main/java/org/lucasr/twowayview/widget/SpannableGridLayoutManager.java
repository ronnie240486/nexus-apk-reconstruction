package org.lucasr.twowayview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.lucasr.twowayview.TwoWayLayoutManager;
import org.lucasr.twowayview.interfaces.ISearchFocusListener;

/* JADX INFO: loaded from: classes2.dex */
public class SpannableGridLayoutManager extends GridLayoutManager {
    private static final int DEFAULT_NUM_COLS = 3;
    private static final int DEFAULT_NUM_ROWS = 3;
    private static final String LOGTAG = "SpannableGridLayoutManager";
    private static final int SMALL_DELTA = 2;
    private int[] locViewFirst;
    private int[] locViewSecond;
    private boolean mMeasuring;
    private Rect rectFocusedView;
    private Rect rectForFocusSel;
    private ISearchFocusListener searchFocusListener;

    public static class LayoutParams extends RecyclerView.LayoutParams {
        private static final int DEFAULT_SPAN = 1;
        public int colSpan;
        public int rowSpan;

        /* JADX WARN: Invalid debug info offset */
        public LayoutParams(int i, int i2) {
        }

        /* JADX WARN: Invalid debug info offset */
        public LayoutParams(Context context, AttributeSet attributeSet) {
        }

        /* JADX WARN: Invalid debug info offset */
        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
        }

        /* JADX WARN: Invalid debug info offset */
        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
        }

        /* JADX WARN: Invalid debug info offset */
        private void init(ViewGroup.LayoutParams layoutParams) {
        }
    }

    public static class SpannableItemEntry extends BaseLayoutManager.ItemEntry {
        public static final Parcelable.Creator<SpannableItemEntry> CREATOR = new Parcelable.Creator<SpannableItemEntry>() { // from class: org.lucasr.twowayview.widget.SpannableGridLayoutManager.SpannableItemEntry.1
            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SpannableItemEntry createFromParcel(Parcel parcel) {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: createFromParcel, reason: avoid collision after fix types in other method */
            public SpannableItemEntry createFromParcel2(Parcel parcel) {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SpannableItemEntry[] newArray(int i) {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: newArray, reason: avoid collision after fix types in other method */
            public SpannableItemEntry[] newArray2(int i) {
                return null;
            }
        };
        private final int colSpan;
        private final int rowSpan;

        /* JADX WARN: Invalid debug info offset */
        public SpannableItemEntry(int i, int i2, int i3, int i4) {
        }

        /* JADX WARN: Invalid debug info offset */
        public SpannableItemEntry(Parcel parcel) {
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ int access$000(SpannableItemEntry spannableItemEntry) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ int access$100(SpannableItemEntry spannableItemEntry) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.lucasr.twowayview.widget.BaseLayoutManager.ItemEntry, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public SpannableGridLayoutManager(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SpannableGridLayoutManager(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SpannableGridLayoutManager(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SpannableGridLayoutManager(TwoWayLayoutManager.Orientation orientation, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private final int getAbsOffsetX(View view, View view2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private float getChildHeight(int i) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    private float getChildWidth(int i) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    private float getHeightUsed(View view) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    private static int getLaneSpan(LayoutParams layoutParams, boolean z) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private static int getLaneSpan(SpannableItemEntry spannableItemEntry, boolean z) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private float getWidthUsed(View view) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean isViewHolderViewBelowTopOfParent(View view) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private View searchFocusForFocusDown(View view, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private View searchFocusForFocusLeft(View view, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private View searchFocusForFocusRight(View view, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private View searchFocusForFocusRightV2(View view, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private android.view.View searchFocusForFocusUp(android.view.View r17, int r18) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.lucasr.twowayview.widget.SpannableGridLayoutManager.searchFocusForFocusUp(android.view.View, int):android.view.View");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.widget.BaseLayoutManager
    public BaseLayoutManager.ItemEntry cacheChildLaneAndSpan(View view, TwoWayLayoutManager.Direction direction) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.TwoWayLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.TwoWayLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.widget.BaseLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.widget.BaseLayoutManager, org.lucasr.twowayview.TwoWayLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public /* bridge */ /* synthetic */ RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.widget.BaseLayoutManager, org.lucasr.twowayview.TwoWayLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public LayoutParams generateDefaultLayoutParams() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.widget.BaseLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public /* bridge */ /* synthetic */ RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.widget.BaseLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public /* bridge */ /* synthetic */ RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.widget.BaseLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.widget.BaseLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.widget.BaseLayoutManager
    public void getLaneForChild(Lanes.LaneInfo laneInfo, View view, TwoWayLayoutManager.Direction direction) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.widget.GridLayoutManager, org.lucasr.twowayview.widget.BaseLayoutManager
    public void getLaneForPosition(Lanes.LaneInfo laneInfo, int i, TwoWayLayoutManager.Direction direction) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.widget.BaseLayoutManager
    public int getLaneSpanForChild(View view) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.widget.BaseLayoutManager
    public int getLaneSpanForPosition(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.widget.BaseLayoutManager
    public void measureChildWithMargins(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.widget.GridLayoutManager, org.lucasr.twowayview.widget.BaseLayoutManager
    public void moveLayoutToPosition(int i, int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View onInterceptFocusSearch(View view, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setSearchFocusListener(ISearchFocusListener iSearchFocusListener) {
    }
}
