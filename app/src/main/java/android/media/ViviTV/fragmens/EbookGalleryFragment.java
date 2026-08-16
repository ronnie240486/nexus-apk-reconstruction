package android.media.ViviTV.fragmens;

import android.content.DialogInterface;
import android.media.ViviTV.adapters.EbookGalleryRecycleAdapter;
import android.media.dialog.CommonDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p000.C1619Z5;
import p000.C1725aj;
import p000.C3053ch;
import p000.DialogC1413Vv;

/* JADX INFO: loaded from: classes.dex */
public class EbookGalleryFragment extends Fragment implements EbookGalleryRecycleAdapter.InterfaceC1945a, C1725aj.e {

    /* JADX INFO: renamed from: m */
    public static final String f8076m = "EBOOK_LIST_DATA";

    /* JADX INFO: renamed from: a */
    public View f8077a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f8078b;

    /* JADX INFO: renamed from: c */
    public CommonDialog f8079c;

    /* JADX INFO: renamed from: d */
    public DialogC1413Vv f8080d;

    /* JADX INFO: renamed from: e */
    public boolean f8081e;

    /* JADX INFO: renamed from: f */
    public String f8082f;

    /* JADX INFO: renamed from: g */
    public int f8083g;

    /* JADX INFO: renamed from: h */
    public int f8084h;

    /* JADX INFO: renamed from: i */
    public boolean f8085i;

    /* JADX INFO: renamed from: j */
    public ArrayList<C3053ch> f8086j;

    /* JADX INFO: renamed from: k */
    public EbookGalleryRecycleAdapter f8087k;

    /* JADX INFO: renamed from: l */
    public RecyclerView.OnScrollListener f8088l;

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.EbookGalleryFragment$a */
    public class ViewOnKeyListenerC2036a implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ EbookGalleryFragment f8089a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC2036a(EbookGalleryFragment ebookGalleryFragment) {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.EbookGalleryFragment$b */
    public class AsyncTaskC2037b extends AsyncTask<Void, Integer, List<C3053ch>> {

        /* JADX INFO: renamed from: a */
        public int f8090a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ EbookGalleryFragment f8091b;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2037b(EbookGalleryFragment ebookGalleryFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0007
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public java.util.List<p000.C3053ch> m12231a(java.lang.Void... r6) {
            /*
                r5 = this;
                r0 = 0
                return r0
            L55:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.fragmens.EbookGalleryFragment.AsyncTaskC2037b.m12231a(java.lang.Void[]):java.util.List");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m12232b(List<C3053ch> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ List<C3053ch> doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(List<C3053ch> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.EbookGalleryFragment$c */
    public class C2038c implements CommonDialog.InterfaceC2374a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C3053ch f8092a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ EbookGalleryFragment f8093b;

        /* JADX WARN: Invalid debug info offset */
        public C2038c(EbookGalleryFragment ebookGalleryFragment, C3053ch c3053ch) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.dialog.CommonDialog.InterfaceC2374a
        /* JADX INFO: renamed from: a */
        public void mo9533a() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.dialog.CommonDialog.InterfaceC2374a
        /* JADX INFO: renamed from: b */
        public void mo9534b() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.EbookGalleryFragment$d */
    public class C2039d extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ EbookGalleryFragment f8094a;

        /* JADX WARN: Invalid debug info offset */
        public C2039d(EbookGalleryFragment ebookGalleryFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.fragmens.EbookGalleryFragment$e */
    public class DialogInterfaceOnKeyListenerC2040e implements DialogInterface.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ EbookGalleryFragment f8095a;

        /* JADX WARN: Invalid debug info offset */
        public DialogInterfaceOnKeyListenerC2040e(EbookGalleryFragment ebookGalleryFragment) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m12205D0(EbookGalleryFragment ebookGalleryFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E0 */
    public static /* synthetic */ boolean m12206E0(EbookGalleryFragment ebookGalleryFragment) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ void m12207F0(EbookGalleryFragment ebookGalleryFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G0 */
    public static /* synthetic */ boolean m12208G0(EbookGalleryFragment ebookGalleryFragment, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ DialogC1413Vv m12209H0(EbookGalleryFragment ebookGalleryFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I0 */
    public static boolean m12210I0(EbookGalleryFragment ebookGalleryFragment, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ String m12211J0(EbookGalleryFragment ebookGalleryFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ int m12212K0(EbookGalleryFragment ebookGalleryFragment) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ int m12213L0(EbookGalleryFragment ebookGalleryFragment) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ int m12214M0(EbookGalleryFragment ebookGalleryFragment) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m12215N0(EbookGalleryFragment ebookGalleryFragment) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ ArrayList m12216O0(EbookGalleryFragment ebookGalleryFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ EbookGalleryRecycleAdapter m12217P0(EbookGalleryFragment ebookGalleryFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ CommonDialog m12218Q0(EbookGalleryFragment ebookGalleryFragment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m12219R0(EbookGalleryFragment ebookGalleryFragment, C3053ch c3053ch) {
    }

    /* JADX INFO: renamed from: V0 */
    private boolean m12220V0(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    private void m12221W0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    private boolean m12222X0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    public static EbookGalleryFragment m12223Z0(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b1 */
    private void m12224b1() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c1 */
    private void m12225c1() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.C1725aj.e
    /* JADX INFO: renamed from: B */
    public void mo9158B(C1619Z5 c1619z5, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.C1725aj.e
    /* JADX INFO: renamed from: F */
    public void mo9159F(C1619Z5 c1619z5) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0040
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: S0 */
    public final void m12226S0(p000.C3053ch r5) {
        /*
            r4 = this;
            return
        L4c:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.fragmens.EbookGalleryFragment.m12226S0(ch):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public final EbookGalleryRecycleAdapter.ebookRecycleViewHolder m12227T0(C1619Z5 c1619z5) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.adapters.EbookGalleryRecycleAdapter.InterfaceC1945a
    /* JADX INFO: renamed from: U */
    public void mo10466U(View view, C3053ch c3053ch) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public final void m12228U0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public void m12229Y0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public final void m12230a1(String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.C1725aj.e
    /* JADX INFO: renamed from: r0 */
    public void mo9161r0(C1619Z5 c1619z5, double d, long j) {
    }

    @Override // p000.C1725aj.e
    /* JADX INFO: renamed from: n */
    public void mo9160n(C1619Z5 c1619z5) {
    }
}
