package org.lucasr.twowayview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import org.lucasr.twowayview.TwoWayLayoutManager;

/* JADX INFO: loaded from: classes2.dex */
public class ListLayoutManager extends BaseLayoutManager {
    private static final String LOGTAG = "ListLayoutManager";

    /* JADX WARN: Invalid debug info offset */
    public ListLayoutManager(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ListLayoutManager(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ListLayoutManager(Context context, TwoWayLayoutManager.Orientation orientation) {
    }

    /* JADX WARN: Invalid debug info offset */
    private View searchFocusForFocusLeft(View view, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private View searchFocusForFocusRight(View view, int i) {
        return null;
    }

    @Override // org.lucasr.twowayview.widget.BaseLayoutManager
    public int getLaneCount() {
        return 1;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.widget.BaseLayoutManager
    public void getLaneForPosition(Lanes.LaneInfo laneInfo, int i, TwoWayLayoutManager.Direction direction) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.lucasr.twowayview.widget.BaseLayoutManager
    public void moveLayoutToPosition(int i, int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @Nullable
    public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View onInterceptFocusSearch(View view, int i) {
        return null;
    }
}
