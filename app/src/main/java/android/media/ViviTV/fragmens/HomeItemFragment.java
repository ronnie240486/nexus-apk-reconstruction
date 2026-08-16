package android.media.ViviTV.fragmens;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import cn.dolit.twowayviewlib.adapters.BaseSpannableRecyclerViewAdapter;
import java.util.List;
import p000.AbstractC5157p6;

/* JADX INFO: loaded from: classes.dex */
public class HomeItemFragment extends BaseHomeItemFragment {

    /* JADX INFO: renamed from: o */
    public int f8140o;

    /* JADX INFO: renamed from: p */
    public boolean f8141p;

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.HomeItemFragment$a */
    public class AsyncTaskC2047a extends AsyncTask<Void, Integer, List<AbstractC5157p6>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseSpannableRecyclerViewAdapter f8142a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HomeItemFragment f8143b;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2047a(HomeItemFragment homeItemFragment, BaseSpannableRecyclerViewAdapter baseSpannableRecyclerViewAdapter) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0041
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public java.util.List<p000.AbstractC5157p6> m12294a(java.lang.Void... r7) {
            /*
                r6 = this;
                r0 = 0
                return r0
            L59:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.fragmens.HomeItemFragment.AsyncTaskC2047a.m12294a(java.lang.Void[]):java.util.List");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m12295b(List<AbstractC5157p6> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ List<AbstractC5157p6> doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(List<AbstractC5157p6> list) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C1 */
    public static /* synthetic */ int m12291C1(HomeItemFragment homeItemFragment) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D1 */
    public static /* synthetic */ int m12292D1(HomeItemFragment homeItemFragment) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E1 */
    public static /* synthetic */ boolean m12293E1(HomeItemFragment homeItemFragment, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseHomeItemFragment
    /* JADX INFO: renamed from: V0 */
    public void mo12016V0(BaseSpannableRecyclerViewAdapter baseSpannableRecyclerViewAdapter) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseHomeItemFragment
    /* JADX INFO: renamed from: X0 */
    public View mo11991X0(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseHomeItemFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
    }
}
