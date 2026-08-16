package android.media.ViviTV.fragmens;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.annotation.Nullable;
import cn.dolit.twowayviewlib.adapters.BaseSpannableRecyclerViewAdapter;
import com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayout;
import java.util.List;
import p000.C0047Ai;
import p000.C0111Bi;
import p000.EnumC5658wU;

/* JADX INFO: loaded from: classes.dex */
public class FMCheckedBroadcastFragment extends BaseHomeItemFragment implements SwipyRefreshLayout.InterfaceC3899j, C0047Ai.a {

    /* JADX INFO: renamed from: o */
    public View f8096o;

    /* JADX INFO: renamed from: p */
    public ListView f8097p;

    /* JADX INFO: renamed from: q */
    public SwipyRefreshLayout f8098q;

    /* JADX INFO: renamed from: r */
    public C0047Ai f8099r;

    /* JADX INFO: renamed from: s */
    public int f8100s;

    /* JADX INFO: renamed from: t */
    public boolean f8101t;

    /* JADX INFO: renamed from: u */
    public List<C0111Bi> f8102u;

    /* JADX INFO: renamed from: v */
    public MediaPlayer f8103v;

    /* JADX INFO: renamed from: w */
    public String f8104w;

    /* JADX INFO: renamed from: x */
    public C0111Bi f8105x;

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.FMCheckedBroadcastFragment$a */
    public class RunnableC2041a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FMCheckedBroadcastFragment f8106a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC2041a(FMCheckedBroadcastFragment fMCheckedBroadcastFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.FMCheckedBroadcastFragment$b */
    public class C2042b implements MediaPlayer.OnPreparedListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FMCheckedBroadcastFragment f8107a;

        /* JADX WARN: Invalid debug info offset */
        public C2042b(FMCheckedBroadcastFragment fMCheckedBroadcastFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C1 */
    public static /* synthetic */ int m12233C1(FMCheckedBroadcastFragment fMCheckedBroadcastFragment) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D1 */
    public static /* synthetic */ boolean m12234D1(FMCheckedBroadcastFragment fMCheckedBroadcastFragment, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E1 */
    public static /* synthetic */ SwipyRefreshLayout m12235E1(FMCheckedBroadcastFragment fMCheckedBroadcastFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H1 */
    private void m12236H1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F1 */
    public final void m12237F1(C0111Bi c0111Bi) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G1 */
    public final void m12238G1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: I1 */
    public final void m12239I1() {
        /*
            r1 = this;
            return
        Le:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.fragmens.FMCheckedBroadcastFragment.m12239I1():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.C0047Ai.a
    /* JADX INFO: renamed from: T */
    public void mo215T(C0111Bi c0111Bi) {
    }

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
    @Override // com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayout.InterfaceC3899j
    /* JADX INFO: renamed from: l0 */
    public void mo10027l0(EnumC5658wU enumC5658wU) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.fragmens.BaseHomeItemFragment, androidx.fragment.app.Fragment
    public void onPause() {
    }
}
