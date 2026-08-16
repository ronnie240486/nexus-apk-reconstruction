package android.media.view;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class HorizontalListView extends AdapterView<ListAdapter> {

    /* JADX INFO: renamed from: a */
    public boolean f10028a;

    /* JADX INFO: renamed from: b */
    public ListAdapter f10029b;

    /* JADX INFO: renamed from: c */
    public int f10030c;

    /* JADX INFO: renamed from: d */
    public int f10031d;

    /* JADX INFO: renamed from: e */
    public int f10032e;

    /* JADX INFO: renamed from: f */
    public int f10033f;

    /* JADX INFO: renamed from: g */
    public int f10034g;

    /* JADX INFO: renamed from: h */
    public int f10035h;

    /* JADX INFO: renamed from: i */
    public Scroller f10036i;

    /* JADX INFO: renamed from: j */
    public GestureDetector f10037j;

    /* JADX INFO: renamed from: k */
    public Queue<View> f10038k;

    /* JADX INFO: renamed from: l */
    public AdapterView.OnItemSelectedListener f10039l;

    /* JADX INFO: renamed from: m */
    public AdapterView.OnItemClickListener f10040m;

    /* JADX INFO: renamed from: n */
    public AdapterView.OnItemLongClickListener f10041n;

    /* JADX INFO: renamed from: o */
    public boolean f10042o;

    /* JADX INFO: renamed from: p */
    public DataSetObserver f10043p;

    /* JADX INFO: renamed from: q */
    public GestureDetector.OnGestureListener f10044q;

    /* JADX INFO: renamed from: android.media.view.HorizontalListView$a */
    public class C2392a extends DataSetObserver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HorizontalListView f10045a;

        /* JADX WARN: Invalid debug info offset */
        public C2392a(HorizontalListView horizontalListView) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // android.database.DataSetObserver
        public void onChanged() {
            /*
                r3 = this;
                return
            L15:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.view.HorizontalListView.C2392a.onChanged():void");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.database.DataSetObserver
        public void onInvalidated() {
        }
    }

    /* JADX INFO: renamed from: android.media.view.HorizontalListView$b */
    public class RunnableC2393b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HorizontalListView f10046a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC2393b(HorizontalListView horizontalListView) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.view.HorizontalListView$c */
    public class C2394c extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ HorizontalListView f10047a;

        /* JADX WARN: Invalid debug info offset */
        public C2394c(HorizontalListView horizontalListView) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public final boolean m14513a(MotionEvent motionEvent, View view) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(android.view.MotionEvent r1, android.view.MotionEvent r2, float r3, float r4) {
            /*
                r0 = this;
                r0 = 0
                return r0
            L11:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.view.HorizontalListView.C2394c.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return false;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public HorizontalListView(Context context, AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m14495a(HorizontalListView horizontalListView, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m14496b(HorizontalListView horizontalListView) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ AdapterView.OnItemClickListener m14497c(HorizontalListView horizontalListView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m14498d(HorizontalListView horizontalListView) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ AdapterView.OnItemSelectedListener m14499e(HorizontalListView horizontalListView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ AdapterView.OnItemLongClickListener m14500f(HorizontalListView horizontalListView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public final void m14501g(View view, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ Adapter getAdapter() {
        return null;
    }

    @Override // android.widget.AdapterView
    public View getSelectedView() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public final void m14502h(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public final void m14503i(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public final void m14504j(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public ListAdapter m14505k() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: l */
    public final synchronized void m14506l() {
        /*
            r3 = this;
            return
        L2c:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.view.HorizontalListView.m14506l():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public boolean m14507m(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public boolean m14508n(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public final void m14509o(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public synchronized void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        /*
            r0 = this;
            return
        L1c:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.view.HorizontalListView.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public final void m14510p(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: q */
    public final synchronized void m14511q() {
        /*
            r1 = this;
            return
        Lc:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.view.HorizontalListView.m14511q():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: r */
    public synchronized void m14512r(int r4) {
        /*
            r3 = this;
            return
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.view.HorizontalListView.m14512r(int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(Adapter adapter) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setAdapter(ListAdapter listAdapter) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.AdapterView
    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.AdapterView
    public void setOnItemLongClickListener(AdapterView.OnItemLongClickListener onItemLongClickListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.AdapterView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i) {
    }
}
