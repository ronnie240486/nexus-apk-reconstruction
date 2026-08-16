package org.lucasr.twowayview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.lucasr.twowayview.TwoWayLayoutManager;

/* JADX INFO: loaded from: classes2.dex */
public class TwoWayView extends RecyclerView {
    private static final String LOGTAG = "TwoWayView";
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private RecyclerView.ChildDrawingOrderCallback drawOrderCallback;
    private boolean focusedChildFront;
    private boolean forceMaintainOldFocus;
    final Object[] sConstructorArgs;

    /* JADX INFO: renamed from: org.lucasr.twowayview.widget.TwoWayView$1 */
    public class C50781 implements RecyclerView.ChildDrawingOrderCallback {
        final /* synthetic */ TwoWayView this$0;

        /* JADX WARN: Invalid debug info offset */
        public C50781(TwoWayView twoWayView) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback
        public int onGetChildDrawingOrder(int i, int i2) {
            return 0;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public TwoWayView(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public TwoWayView(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public TwoWayView(Context context, AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void initView() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private void loadLayoutManagerFromName(android.content.Context r4, android.util.AttributeSet r5, java.lang.String r6) {
        /*
            r3 = this;
            return
        L10:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.lucasr.twowayview.widget.TwoWayView.loadLayoutManagerFromName(android.content.Context, android.util.AttributeSet, java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public View focusSearch(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        return null;
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
    public TwoWayLayoutManager.Orientation getOrientation() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isFocusedChildFront() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setFocusedChildBringFront(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setForceMaintainOldFocus(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOrientation(TwoWayLayoutManager.Orientation orientation) {
    }
}
