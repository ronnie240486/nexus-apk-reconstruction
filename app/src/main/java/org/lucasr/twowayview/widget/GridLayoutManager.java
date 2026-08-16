package org.lucasr.twowayview.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import org.lucasr.twowayview.TwoWayLayoutManager;

/* JADX INFO: loaded from: classes2.dex */
public class GridLayoutManager extends BaseLayoutManager {
    private static final int DEFAULT_NUM_COLS = 2;
    private static final int DEFAULT_NUM_ROWS = 2;
    private static final String LOGTAG = "GridLayoutManager";
    private int mNumColumns;
    private int mNumRows;

    /* JADX WARN: Invalid debug info offset */
    public GridLayoutManager(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public GridLayoutManager(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
    }

    /* JADX WARN: Invalid debug info offset */
    public GridLayoutManager(TwoWayLayoutManager.Orientation orientation, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.widget.BaseLayoutManager
    public int getLaneCount() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.widget.BaseLayoutManager
    public void getLaneForPosition(Lanes.LaneInfo laneInfo, int i, TwoWayLayoutManager.Direction direction) {
    }

    /* JADX WARN: Invalid debug info offset */
    public int getNumColumns() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getNumRows() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.widget.BaseLayoutManager
    public void moveLayoutToPosition(int i, int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setNumColumns(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setNumRows(int i) {
    }
}
