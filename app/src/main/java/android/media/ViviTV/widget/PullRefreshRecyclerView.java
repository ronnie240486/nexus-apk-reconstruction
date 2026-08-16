package android.media.ViviTV.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p000.InterfaceC1211Sq;

/* JADX INFO: loaded from: classes.dex */
public class PullRefreshRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: h */
    public static Rect f9937h = new Rect();

    /* JADX INFO: renamed from: i */
    public static Rect f9938i = new Rect();

    /* JADX INFO: renamed from: a */
    public LinearLayoutManager f9939a;

    /* JADX INFO: renamed from: b */
    public Rect f9940b;

    /* JADX INFO: renamed from: c */
    public InterfaceC2367b f9941c;

    /* JADX INFO: renamed from: d */
    public InterfaceC1211Sq f9942d;

    /* JADX INFO: renamed from: e */
    public EnumC2369d f9943e;

    /* JADX INFO: renamed from: f */
    public boolean f9944f;

    /* JADX INFO: renamed from: g */
    public boolean f9945g;

    /* JADX INFO: renamed from: android.media.ViviTV.widget.PullRefreshRecyclerView$a */
    public class AsyncTaskC2366a extends AsyncTask<Void, Integer, List<? extends InterfaceC2368c>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PullRefreshRecyclerView f9946a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2366a(PullRefreshRecyclerView pullRefreshRecyclerView) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000a
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public java.util.List<? extends android.media.ViviTV.widget.PullRefreshRecyclerView.InterfaceC2368c> m14415a(java.lang.Void... r3) {
            /*
                r2 = this;
                r0 = 0
                return r0
            L1f:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.widget.PullRefreshRecyclerView.AsyncTaskC2366a.m14415a(java.lang.Void[]):java.util.List");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m14416b(List<? extends InterfaceC2368c> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ List<? extends InterfaceC2368c> doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onCancelled() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(List<? extends InterfaceC2368c> list) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.widget.PullRefreshRecyclerView$b */
    public interface InterfaceC2367b {
        /* JADX INFO: renamed from: a */
        void m14417a(int i);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.widget.PullRefreshRecyclerView$c */
    public interface InterfaceC2368c {
    }

    /* JADX INFO: renamed from: android.media.ViviTV.widget.PullRefreshRecyclerView$d */
    public enum EnumC2369d {
        VERTICAL,
        HORIZONTAL
    }

    /* JADX WARN: Invalid debug info offset */
    public PullRefreshRecyclerView(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PullRefreshRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PullRefreshRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC1211Sq m14407b(PullRefreshRecyclerView pullRefreshRecyclerView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ boolean m14408c(PullRefreshRecyclerView pullRefreshRecyclerView, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC2367b m14409d(PullRefreshRecyclerView pullRefreshRecyclerView) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static final boolean m14410h(RecyclerView recyclerView, View view, int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public void m14411e() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public final void m14412f() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public final void m14413g(AttributeSet attributeSet, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public final void m14414i(EnumC2369d enumC2369d) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCallback(InterfaceC2367b interfaceC2367b) {
    }
}
