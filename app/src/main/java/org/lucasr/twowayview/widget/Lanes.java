package org.lucasr.twowayview.widget;

import android.graphics.RectF;
import org.lucasr.twowayview.TwoWayLayoutManager;

/* JADX INFO: loaded from: classes2.dex */
class Lanes {
    public static final int NO_LANE = -1;
    private Float mInnerEnd;
    private Float mInnerStart;
    private final boolean mIsVertical;
    private final float mLaneSize;
    private final RectF[] mLanes;
    private final BaseLayoutManager mLayout;
    private final RectF[] mSavedLanes;
    private final LaneInfo mTempLaneInfo;
    private final RectF mTempRect;

    public static class LaneInfo {
        public int anchorLane;
        public int startLane;

        /* JADX WARN: Invalid debug info offset */
        public boolean isUndefined() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        public void set(int i, int i2) {
        }

        /* JADX WARN: Invalid debug info offset */
        public void setUndefined() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public Lanes(BaseLayoutManager baseLayoutManager, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Lanes(BaseLayoutManager baseLayoutManager, TwoWayLayoutManager.Orientation orientation, RectF[] rectFArr, float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static float calculateLaneSize(BaseLayoutManager baseLayoutManager, int i) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    private int findLaneThatFitsSpan(int i, int i2, TwoWayLayoutManager.Direction direction) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean intersects(int i, int i2, RectF rectF) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    private void invalidateEdges() {
    }

    /* JADX WARN: Invalid debug info offset */
    private void offsetLane(int i, float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void findLane(LaneInfo laneInfo, int i, TwoWayLayoutManager.Direction direction) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void getChildFrame(RectF rectF, float f, float f2, LaneInfo laneInfo, TwoWayLayoutManager.Direction direction) {
    }

    /* JADX WARN: Invalid debug info offset */
    public int getCount() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public float getInnerEnd() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    public float getInnerStart() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    public void getLane(int i, RectF rectF) {
    }

    /* JADX WARN: Invalid debug info offset */
    public float getLaneSize() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    public TwoWayLayoutManager.Orientation getOrientation() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void offset(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void offset(int i, float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void popChildFrame(RectF rectF, int i, float f, TwoWayLayoutManager.Direction direction) {
    }

    /* JADX WARN: Invalid debug info offset */
    public float pushChildFrame(RectF rectF, int i, float f, TwoWayLayoutManager.Direction direction) {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    public void reset(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void reset(TwoWayLayoutManager.Direction direction) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void restore() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void save() {
    }
}
