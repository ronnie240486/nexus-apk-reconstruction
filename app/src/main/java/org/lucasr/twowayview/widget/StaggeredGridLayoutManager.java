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
public class StaggeredGridLayoutManager extends GridLayoutManager {
    private static final int DEFAULT_NUM_COLS = 2;
    private static final int DEFAULT_NUM_ROWS = 2;
    private static final String LOGTAG = "StaggeredGridLayoutManager";

    public static class LayoutParams extends RecyclerView.LayoutParams {
        private static final int DEFAULT_SPAN = 1;
        public int span;

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

    public static class StaggeredItemEntry extends BaseLayoutManager.ItemEntry {
        public static final Parcelable.Creator<StaggeredItemEntry> CREATOR = new Parcelable.Creator<StaggeredItemEntry>() { // from class: org.lucasr.twowayview.widget.StaggeredGridLayoutManager.StaggeredItemEntry.1
            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ StaggeredItemEntry createFromParcel(Parcel parcel) {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: createFromParcel, reason: avoid collision after fix types in other method */
            public StaggeredItemEntry createFromParcel2(Parcel parcel) {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ StaggeredItemEntry[] newArray(int i) {
                return null;
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: newArray, reason: avoid collision after fix types in other method */
            public StaggeredItemEntry[] newArray2(int i) {
                return null;
            }
        };
        private float height;
        private final int span;
        private float width;

        /* JADX WARN: Invalid debug info offset */
        public StaggeredItemEntry(int i, int i2, int i3) {
        }

        /* JADX WARN: Invalid debug info offset */
        public StaggeredItemEntry(Parcel parcel) {
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ int access$000(StaggeredItemEntry staggeredItemEntry) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ float access$100(StaggeredItemEntry staggeredItemEntry) {
            return 0.0f;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ float access$102(StaggeredItemEntry staggeredItemEntry, float f) {
            return 0.0f;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ float access$200(StaggeredItemEntry staggeredItemEntry) {
            return 0.0f;
        }

        /* JADX WARN: Invalid debug info offset */
        public static /* synthetic */ float access$202(StaggeredItemEntry staggeredItemEntry, float f) {
            return 0.0f;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.lucasr.twowayview.widget.BaseLayoutManager.ItemEntry, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public StaggeredGridLayoutManager(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public StaggeredGridLayoutManager(TwoWayLayoutManager.Orientation orientation, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.widget.BaseLayoutManager
    public BaseLayoutManager.ItemEntry cacheChildFrame(View view, RectF rectF) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.widget.BaseLayoutManager
    public BaseLayoutManager.ItemEntry cacheChildLaneAndSpan(View view, TwoWayLayoutManager.Direction direction) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void cacheItemFrame(StaggeredItemEntry staggeredItemEntry, RectF rectF) {
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
    @Override // org.lucasr.twowayview.widget.GridLayoutManager, org.lucasr.twowayview.widget.BaseLayoutManager
    public void moveLayoutToPosition(int i, int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
    }
}
