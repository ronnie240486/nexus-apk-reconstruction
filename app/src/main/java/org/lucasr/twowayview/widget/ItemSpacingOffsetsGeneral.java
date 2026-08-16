package org.lucasr.twowayview.widget;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
class ItemSpacingOffsetsGeneral {
    private boolean mAddSpacingAtEnd;
    private final int mHorizontalSpacing;
    private final Lanes.LaneInfo mTempLaneInfo;
    private final int mVerticalSpacing;

    /* JADX WARN: Invalid debug info offset */
    public ItemSpacingOffsetsGeneral(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private static boolean isFirstChildInLane(BaseLayoutManager baseLayoutManager, int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private static boolean isLastChildInLane(BaseLayoutManager baseLayoutManager, int i, int i2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean isSecondLane(BaseLayoutManager baseLayoutManager, int i, int i2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setAddSpacingAtEnd(boolean z) {
    }
}
