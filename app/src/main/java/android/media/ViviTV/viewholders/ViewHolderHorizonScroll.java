package android.media.ViviTV.viewholders;

import android.annotation.SuppressLint;
import android.media.ViviTV.widget.ExtendedRelativeLayout;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cn.dolit.twowayviewlib.adapters.BaseSpannableRecyclerViewAdapter;
import cn.dolit.twowayviewlib.viewholders.BaseRecyclerViewHolder;
import java.util.List;
import org.lucasr.twowayview.widget.SpannableGridLayoutManager;
import p000.C4182cp;
import p000.InterfaceC5747xq;

/* JADX INFO: loaded from: classes.dex */
public class ViewHolderHorizonScroll extends BaseHomeRecyclerViewHolder implements ExtendedRelativeLayout.InterfaceC2364a {

    /* JADX INFO: renamed from: u */
    public static final float f9804u = 0.75f;

    /* JADX INFO: renamed from: n */
    public List<C4182cp.a> f9805n;

    /* JADX INFO: renamed from: o */
    public ExtendedRelativeLayout f9806o;

    /* JADX INFO: renamed from: p */
    public RecyclerView f9807p;

    /* JADX INFO: renamed from: q */
    public HorizonScrollAdapter f9808q;

    /* JADX INFO: renamed from: r */
    public RelativeLayout f9809r;

    /* JADX INFO: renamed from: s */
    public LinearLayoutManager f9810s;

    /* JADX INFO: renamed from: t */
    public int f9811t;

    /* JADX INFO: renamed from: android.media.ViviTV.viewholders.ViewHolderHorizonScroll$a */
    public class C2351a implements BaseSpannableRecyclerViewAdapter.InterfaceC3068a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C4182cp f9824a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewHolderHorizonScroll f9825b;

        /* JADX WARN: Invalid debug info offset */
        public C2351a(ViewHolderHorizonScroll viewHolderHorizonScroll, C4182cp c4182cp) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // cn.dolit.twowayviewlib.adapters.BaseSpannableRecyclerViewAdapter.InterfaceC3068a
        @SuppressLint({"RestrictedApi"})
        /* JADX INFO: renamed from: a */
        public void mo12046a(View view) {
        }

        @Override // cn.dolit.twowayviewlib.adapters.BaseSpannableRecyclerViewAdapter.InterfaceC3068a
        /* JADX INFO: renamed from: b */
        public void mo12047b(View view) {
        }

        @Override // cn.dolit.twowayviewlib.adapters.BaseSpannableRecyclerViewAdapter.InterfaceC3068a
        /* JADX INFO: renamed from: c */
        public boolean mo12048c(View view) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.viewholders.ViewHolderHorizonScroll$b */
    public class ViewOnKeyListenerC2352b implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewHolderHorizonScroll f9826a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC2352b(ViewHolderHorizonScroll viewHolderHorizonScroll) {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.viewholders.ViewHolderHorizonScroll$c */
    public class ViewOnKeyListenerC2353c implements View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewHolderHorizonScroll f9827a;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnKeyListenerC2353c(ViewHolderHorizonScroll viewHolderHorizonScroll) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public ViewHolderHorizonScroll(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public static /* synthetic */ RelativeLayout m14322I(ViewHolderHorizonScroll viewHolderHorizonScroll) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public static /* synthetic */ RelativeLayout m14323J(ViewHolderHorizonScroll viewHolderHorizonScroll, RelativeLayout relativeLayout) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public static /* synthetic */ RecyclerView m14324K(ViewHolderHorizonScroll viewHolderHorizonScroll) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L */
    public static /* synthetic */ LinearLayoutManager m14325L(ViewHolderHorizonScroll viewHolderHorizonScroll) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public static /* synthetic */ int m14326M(ViewHolderHorizonScroll viewHolderHorizonScroll, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N */
    public static /* synthetic */ List m14327N(ViewHolderHorizonScroll viewHolderHorizonScroll) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.viewholders.BaseHomeRecyclerViewHolder
    /* JADX INFO: renamed from: C */
    public void mo14292C(C4182cp c4182cp) {
    }

    @Override // android.media.ViviTV.widget.ExtendedRelativeLayout.InterfaceC2364a
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return true;
    }

    @Override // cn.dolit.twowayviewlib.viewholders.BaseRecyclerViewHolder
    /* JADX INFO: renamed from: o */
    public boolean mo14302o() {
        return false;
    }

    public class HorizonScrollAdapter extends RecyclerView.Adapter<BaseRecyclerViewHolder> implements View.OnFocusChangeListener, View.OnKeyListener {

        /* JADX INFO: renamed from: a */
        public LayoutInflater f9812a;

        /* JADX INFO: renamed from: b */
        public List<C4182cp.a> f9813b;

        /* JADX INFO: renamed from: c */
        public C4182cp f9814c;

        /* JADX INFO: renamed from: d */
        public SpannableGridLayoutManager.LayoutParams f9815d;

        /* JADX INFO: renamed from: e */
        public ViewGroup f9816e;

        /* JADX INFO: renamed from: f */
        public BaseSpannableRecyclerViewAdapter.InterfaceC3068a f9817f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewHolderHorizonScroll f9818g;

        /* JADX INFO: renamed from: android.media.ViviTV.viewholders.ViewHolderHorizonScroll$HorizonScrollAdapter$a */
        public class ViewOnClickListenerC2350a implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ BaseRecyclerViewHolder f9822a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ HorizonScrollAdapter f9823b;

            /* JADX WARN: Invalid debug info offset */
            public ViewOnClickListenerC2350a(HorizonScrollAdapter horizonScrollAdapter, BaseRecyclerViewHolder baseRecyclerViewHolder) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public HorizonScrollAdapter(ViewHolderHorizonScroll viewHolderHorizonScroll) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public static /* synthetic */ BaseSpannableRecyclerViewAdapter.InterfaceC3068a m14328d(HorizonScrollAdapter horizonScrollAdapter) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: h */
        public void m14329h(@NonNull BaseRecyclerViewHolder baseRecyclerViewHolder, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @NonNull
        /* JADX INFO: renamed from: i */
        public BaseRecyclerViewHolder m14330i(@NonNull ViewGroup viewGroup, int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: j */
        public void m14331j(C4182cp c4182cp) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k */
        public void m14332k(BaseSpannableRecyclerViewAdapter.InterfaceC3068a interfaceC3068a) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: l */
        public void m14333l(SpannableGridLayoutManager.LayoutParams layoutParams) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: m */
        public void m14334m(List<C4182cp.a> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return null;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            return false;
        }

        public class HorizonScrollViewHolder extends BaseHomeRecyclerViewHolder implements InterfaceC5747xq {

            /* JADX INFO: renamed from: n */
            public ImageView f9819n;

            /* JADX INFO: renamed from: o */
            public View f9820o;

            /* JADX INFO: renamed from: p */
            public final /* synthetic */ HorizonScrollAdapter f9821p;

            /* JADX WARN: Invalid debug info offset */
            public HorizonScrollViewHolder(HorizonScrollAdapter horizonScrollAdapter, View view) {
            }

            /* JADX WARN: Invalid debug info offset */
            /* JADX INFO: renamed from: I */
            public void m14335I(C4182cp.a aVar, String str, int i, int i2) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // p000.InterfaceC5747xq
            /* JADX INFO: renamed from: c */
            public String mo14301c() {
                return null;
            }

            @Override // android.media.ViviTV.viewholders.BaseHomeRecyclerViewHolder
            /* JADX INFO: renamed from: C */
            public void mo14292C(C4182cp c4182cp) {
            }
        }
    }
}
