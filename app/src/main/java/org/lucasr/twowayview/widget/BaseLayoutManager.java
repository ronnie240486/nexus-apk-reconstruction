package org.lucasr.twowayview.widget;

import android.content.Context;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import org.lucasr.twowayview.TwoWayLayoutManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseLayoutManager extends TwoWayLayoutManager {
    private static final String LOGTAG = "BaseLayoutManager";
    protected final RectF mChildFrame;
    private ItemEntries mItemEntries;
    private ItemEntries mItemEntriesToRestore;
    private Lanes mLanes;
    private Lanes mLanesToRestore;
    protected final Lanes.LaneInfo mTempLaneInfo;
    protected final RectF mTempRect;

    /* JADX INFO: renamed from: org.lucasr.twowayview.widget.BaseLayoutManager$1 */
    public static /* synthetic */ class C50721 {

        /* JADX INFO: renamed from: $SwitchMap$org$lucasr$twowayview$widget$BaseLayoutManager$UpdateOp */
        static final /* synthetic */ int[] f17015xfc98cd5e;

        static {
            int[] iArr = new int[UpdateOp.values().length];
            f17015xfc98cd5e = iArr;
            try {
                iArr[UpdateOp.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17015xfc98cd5e[UpdateOp.REMOVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17015xfc98cd5e[UpdateOp.MOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class ItemEntry implements Parcelable {
        public static final Parcelable.Creator<ItemEntry> CREATOR = new Parcelable.Creator<ItemEntry>() { // from class: org.lucasr.twowayview.widget.BaseLayoutManager.ItemEntry.1
            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ ItemEntry createFromParcel(Parcel parcel) {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: createFromParcel, reason: avoid collision after fix types in other method */
            public ItemEntry createFromParcel2(Parcel parcel) {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ ItemEntry[] newArray(int i) {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: newArray, reason: avoid collision after fix types in other method */
            public ItemEntry[] newArray2(int i) {
                return null;
            }
        };
        public int anchorLane;
        private float[] spanMargins;
        public int startLane;

        /* JADX WARN: Invalid debug info offset */
        public ItemEntry(int i, int i2) {
        }

        /* JADX WARN: Invalid debug info offset */
        public ItemEntry(Parcel parcel) {
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ boolean access$000(ItemEntry itemEntry) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ float access$100(ItemEntry itemEntry, int i) {
            return 0.0f;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ void access$200(ItemEntry itemEntry, int i, float f, int i2) {
        }

        /* JADX WARN: Invalid debug info offset */
        private float getSpanMargin(int i) {
            return 0.0f;
        }

        /* JADX WARN: Invalid debug info offset */
        private boolean hasSpanMargins() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        private void setSpanMargin(int i, float f, int i2) {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public void invalidateLane() {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setLane(Lanes.LaneInfo laneInfo) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }
    }

    public static class LanedSavedState extends TwoWayLayoutManager.SavedState {
        public static final Parcelable.Creator<LanedSavedState> CREATOR = new Parcelable.Creator<LanedSavedState>() { // from class: org.lucasr.twowayview.widget.BaseLayoutManager.LanedSavedState.1
            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ LanedSavedState createFromParcel(Parcel parcel) {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: createFromParcel, reason: avoid collision after fix types in other method */
            public LanedSavedState createFromParcel2(Parcel parcel) {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ LanedSavedState[] newArray(int i) {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: newArray, reason: avoid collision after fix types in other method */
            public LanedSavedState[] newArray2(int i) {
                return null;
            }
        };
        private ItemEntries itemEntries;
        private float laneSize;
        private RectF[] lanes;
        private TwoWayLayoutManager.Orientation orientation;

        /* JADX WARN: Invalid debug info offset */
        private LanedSavedState(Parcel parcel) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ LanedSavedState(Parcel parcel, C50721 c50721) {
        }

        /* JADX WARN: Invalid debug info offset */
        public LanedSavedState(Parcelable parcelable) {
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ RectF[] access$300(LanedSavedState lanedSavedState) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ RectF[] access$302(LanedSavedState lanedSavedState, RectF[] rectFArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ TwoWayLayoutManager.Orientation access$400(LanedSavedState lanedSavedState) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ TwoWayLayoutManager.Orientation access$402(LanedSavedState lanedSavedState, TwoWayLayoutManager.Orientation orientation) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ float access$500(LanedSavedState lanedSavedState) {
            return 0.0f;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ float access$502(LanedSavedState lanedSavedState, float f) {
            return 0.0f;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ ItemEntries access$600(LanedSavedState lanedSavedState) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ ItemEntries access$602(LanedSavedState lanedSavedState, ItemEntries itemEntries) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.lucasr.twowayview.TwoWayLayoutManager.SavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }
    }

    public enum UpdateOp {
        ADD,
        REMOVE,
        UPDATE,
        MOVE
    }

    /* JADX WARN: Invalid debug info offset */
    public BaseLayoutManager(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public BaseLayoutManager(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public BaseLayoutManager(TwoWayLayoutManager.Orientation orientation) {
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean canUseLanes(Lanes lanes) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean ensureLayoutState() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private float getHeightUsed(View view) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    private float getWidthUsed(View view) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    private void handleUpdate(int i, int i2, UpdateOp updateOp) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void popChildFrame(ItemEntry itemEntry, RectF rectF, int i, int i2, TwoWayLayoutManager.Direction direction) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void requestMoveLayout() {
    }

    public ItemEntry cacheChildFrame(View view, RectF rectF) {
        return null;
    }

    public ItemEntry cacheChildLaneAndSpan(View view, TwoWayLayoutManager.Direction direction) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.TwoWayLayoutManager
    public boolean canAddMoreViews(TwoWayLayoutManager.Direction direction, int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void clearItemEntries() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.TwoWayLayoutManager
    public void detachChild(View view, TwoWayLayoutManager.Direction direction) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.TwoWayLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void getDecoratedChildFrame(View view, RectF rectF) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ItemEntry getItemEntryForPosition(int i) {
        return null;
    }

    public abstract int getLaneCount();

    /* JADX WARN: Invalid debug info offset */
    public void getLaneForChild(Lanes.LaneInfo laneInfo, View view, TwoWayLayoutManager.Direction direction) {
    }

    public abstract void getLaneForPosition(Lanes.LaneInfo laneInfo, int i, TwoWayLayoutManager.Direction direction);

    public int getLaneSpanForChild(View view) {
        return 1;
    }

    public int getLaneSpanForPosition(int i) {
        return 1;
    }

    /* JADX WARN: Invalid debug info offset */
    public Lanes getLanes() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void invalidateItemLanesAfter(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isVertical() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.TwoWayLayoutManager
    public void layoutChild(View view, TwoWayLayoutManager.Direction direction) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.TwoWayLayoutManager
    public void measureChild(View view, TwoWayLayoutManager.Direction direction) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void measureChildWithMargins(View view) {
    }

    public abstract void moveLayoutToPosition(int i, int i2, RecyclerView.Recycler recycler, RecyclerView.State state);

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenHorizontal(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void offsetChildrenVertical(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void offsetForAddition(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void offsetForRemoval(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.TwoWayLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.TwoWayLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsChanged(RecyclerView recyclerView) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.TwoWayLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.TwoWayLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.TwoWayLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.TwoWayLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.TwoWayLayoutManager
    public void onLayoutScrapList(RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.TwoWayLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.TwoWayLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void pushChildFrame(ItemEntry itemEntry, RectF rectF, int i, int i2, TwoWayLayoutManager.Direction direction) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setItemEntryForPosition(int i, ItemEntry itemEntry) {
    }
}
