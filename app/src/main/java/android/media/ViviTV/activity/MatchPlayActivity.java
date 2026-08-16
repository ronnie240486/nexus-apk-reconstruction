package android.media.ViviTV.activity;

import android.content.Context;
import android.media.ViviTV.databinding.ActivityMatchPlayBinding;
import android.media.ViviTV.fragmens.BaseSlaveFragment;
import android.media.ViviTV.fragmens.LeagueTableFragment;
import android.media.ViviTV.fragmens.MatchGoalCardUpLeaveFragment;
import android.media.ViviTV.fragmens.MatchLineUpFragment;
import android.media.ViviTV.fragmens.MatchListFragment;
import android.media.ViviTV.model.persistent.LiveChannelInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import androidx.viewpager.widget.ViewPager;
import p000.AbstractAsyncTaskC4518i5;
import p000.C0452Gx;
import p000.C0772Lx;
import p000.C1091Qv;
import p000.C1218Sx;

/* JADX INFO: loaded from: classes4.dex */
public class MatchPlayActivity extends BaseActivity implements View.OnFocusChangeListener, CompoundButton.OnCheckedChangeListener, RadioGroup.OnCheckedChangeListener, View.OnKeyListener, ViewPager.OnPageChangeListener {

    /* JADX INFO: renamed from: G */
    public static final int f5118G = 5000;

    /* JADX INFO: renamed from: A */
    public ImageButton f5119A;

    /* JADX INFO: renamed from: B */
    public ImageButton f5120B;

    /* JADX INFO: renamed from: C */
    public MatchGoalCardUpLeaveFragment f5121C;

    /* JADX INFO: renamed from: D */
    public MatchLineUpFragment f5122D;

    /* JADX INFO: renamed from: E */
    public MatchListFragment f5123E;

    /* JADX INFO: renamed from: F */
    public LeagueTableFragment f5124F;

    /* JADX INFO: renamed from: u */
    public ActivityMatchPlayBinding f5125u;

    /* JADX INFO: renamed from: v */
    public C0772Lx f5126v;

    /* JADX INFO: renamed from: w */
    public Handler f5127w;

    /* JADX INFO: renamed from: x */
    public Runnable f5128x;

    /* JADX INFO: renamed from: y */
    public boolean f5129y;

    /* JADX INFO: renamed from: z */
    public boolean f5130z;

    /* JADX INFO: renamed from: android.media.ViviTV.activity.MatchPlayActivity$a */
    public class ViewOnClickListenerC1847a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MatchPlayActivity f5131a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC1847a(MatchPlayActivity matchPlayActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.MatchPlayActivity$b */
    public class ViewOnFocusChangeListenerC1848b implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MatchPlayActivity f5132a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnFocusChangeListenerC1848b(MatchPlayActivity matchPlayActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.MatchPlayActivity$c */
    public class ViewOnFocusChangeListenerC1849c implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MatchPlayActivity f5133a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnFocusChangeListenerC1849c(MatchPlayActivity matchPlayActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.MatchPlayActivity$d */
    public class RunnableC1850d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f5134a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MatchPlayActivity f5135b;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC1850d(MatchPlayActivity matchPlayActivity, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.MatchPlayActivity$e */
    public class AsyncTaskC1851e extends AbstractAsyncTaskC4518i5<String, Integer, LiveChannelInfo> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ MatchPlayActivity f5136c;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1851e(MatchPlayActivity matchPlayActivity, Context context) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000a
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public android.media.ViviTV.model.persistent.LiveChannelInfo m9989a(java.lang.String... r3) {
            /*
                r2 = this;
                r0 = 0
                return r0
            L19:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.MatchPlayActivity.AsyncTaskC1851e.m9989a(java.lang.String[]):android.media.ViviTV.model.persistent.LiveChannelInfo");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m9990b(LiveChannelInfo liveChannelInfo) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.AbstractAsyncTaskC4518i5, android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.MatchPlayActivity$f */
    public class AsyncTaskC1852f extends AsyncTask<Void, Integer, C1218Sx.b<C0452Gx>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MatchPlayActivity f5137a;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC1852f(MatchPlayActivity matchPlayActivity) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public C1218Sx.b<C0452Gx> m9991a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m9992b(C1218Sx.b<C0452Gx> bVar) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ C1218Sx.b<C0452Gx> doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(C1218Sx.b<C0452Gx> bVar) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.activity.MatchPlayActivity$g */
    public static class C1853g {

        /* JADX INFO: renamed from: a */
        public final String f5138a;

        /* JADX INFO: renamed from: b */
        public final boolean f5139b;

        /* JADX WARN: Invalid debug info offset */
        public C1853g(String str, boolean z) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m9965P0(MatchPlayActivity matchPlayActivity, View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ C0772Lx m9966Q0(MatchPlayActivity matchPlayActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ ActivityMatchPlayBinding m9967R0(MatchPlayActivity matchPlayActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ boolean m9968S0(MatchPlayActivity matchPlayActivity, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public static /* synthetic */ void m9969T0(MatchPlayActivity matchPlayActivity) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ Runnable m9970U0(MatchPlayActivity matchPlayActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ Handler m9971V0(MatchPlayActivity matchPlayActivity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m9972W0(MatchPlayActivity matchPlayActivity, C1091Qv[] c1091QvArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ void m9973X0(MatchPlayActivity matchPlayActivity, C0452Gx c0452Gx) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c1 */
    private void m9974c1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g1 */
    public static void m9975g1(BaseSlaveFragment baseSlaveFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j1 */
    private void m9976j1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public final void m9977Y0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0019
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @androidx.annotation.Nullable
    /* JADX INFO: renamed from: Z0 */
    public final android.media.ViviTV.activity.MatchPlayActivity.C1853g m9978Z0(boolean r4) {
        /*
            r3 = this;
            r0 = 0
            return r0
        L2c:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.activity.MatchPlayActivity.m9978Z0(boolean):android.media.ViviTV.activity.MatchPlayActivity$g");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public final void m9979a1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    public final void m9980b1(C0452Gx c0452Gx) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m9981d1(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e1 */
    public final void m9982e1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f1 */
    public final void m9983f1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h1 */
    public final void m9984h1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i1 */
    public final void m9985i1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k1 */
    public final void m9986k1(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l1 */
    public final void m9987l1(C1091Qv[] c1091QvArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m1 */
    public void m9988m1() {
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.activity.BaseActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
    }
}
