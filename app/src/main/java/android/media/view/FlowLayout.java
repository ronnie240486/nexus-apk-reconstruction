package android.media.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(14)
public class FlowLayout extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public int f10023a;

    /* JADX INFO: renamed from: b */
    public final List<List<View>> f10024b;

    /* JADX INFO: renamed from: c */
    public final List<Integer> f10025c;

    /* JADX INFO: renamed from: d */
    public final List<Integer> f10026d;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public int f10027a;

        /* JADX WARN: Invalid debug info offset */
        public LayoutParams(int i, int i2) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000c
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        public LayoutParams(android.content.Context r3, android.util.AttributeSet r4) {
            /*
                r2 = this;
                return
            L18:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.view.FlowLayout.LayoutParams.<init>(android.content.Context, android.util.AttributeSet):void");
        }

        /* JADX WARN: Invalid debug info offset */
        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public FlowLayout(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public FlowLayout(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0024
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public FlowLayout(android.content.Context r3, android.util.AttributeSet r4, int r5) {
        /*
            r2 = this;
            return
        L31:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.view.FlowLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m14490e() {
        return true;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public LayoutParams m14491a() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public LayoutParams m14492b(AttributeSet attributeSet) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public LayoutParams m14493c(ViewGroup.LayoutParams layoutParams) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public int m14494d() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(14)
    public void setGravity(int i) {
    }
}
