package android.media.ViviTV.adapters;

import android.media.ViviTV.activity.EPGSingleChannelActivity;
import android.media.ViviTV.model.persistent.EpgItemInfo;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class EpgInfoListAdapter extends RecyclerView.Adapter implements View.OnClickListener, View.OnKeyListener, View.OnFocusChangeListener {

    /* JADX INFO: renamed from: j */
    public static SimpleDateFormat f5592j = new SimpleDateFormat(EPGSingleChannelActivity.f4877F);

    /* JADX INFO: renamed from: k */
    public static int f5593k = 1;

    /* JADX INFO: renamed from: l */
    public static int f5594l = 2;

    /* JADX INFO: renamed from: m */
    public static String[] f5595m;

    /* JADX INFO: renamed from: a */
    public List<EpgItemInfo> f5596a;

    /* JADX INFO: renamed from: b */
    public HashMap<Date, Long> f5597b;

    /* JADX INFO: renamed from: c */
    public boolean f5598c;

    /* JADX INFO: renamed from: d */
    public int f5599d;

    /* JADX INFO: renamed from: e */
    public String f5600e;

    /* JADX INFO: renamed from: f */
    public long f5601f;

    /* JADX INFO: renamed from: g */
    public long f5602g;

    /* JADX INFO: renamed from: h */
    public boolean f5603h;

    /* JADX INFO: renamed from: i */
    public InterfaceC1948c f5604i;

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.EpgInfoListAdapter$a */
    public class C1946a extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public TextView f5605a;

        /* JADX INFO: renamed from: b */
        public TextView f5606b;

        /* JADX INFO: renamed from: c */
        public ImageView f5607c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ EpgInfoListAdapter f5608d;

        /* JADX WARN: Invalid debug info offset */
        public C1946a(@NonNull EpgInfoListAdapter epgInfoListAdapter, View view) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k */
        public void m10488k(EpgItemInfo epgItemInfo, boolean z) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.EpgInfoListAdapter$b */
    public class C1947b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public TextView f5609a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ EpgInfoListAdapter f5610b;

        /* JADX WARN: Invalid debug info offset */
        public C1947b(@NonNull EpgInfoListAdapter epgInfoListAdapter, View view) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k */
        public void m10489k(EpgItemInfo epgItemInfo) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.EpgInfoListAdapter$c */
    public interface InterfaceC1948c {
        /* JADX INFO: renamed from: a */
        void mo10490a(int i);

        /* JADX INFO: renamed from: b */
        boolean mo10491b(int i, EpgItemInfo epgItemInfo, View view, int i2, KeyEvent keyEvent);

        /* JADX INFO: renamed from: c */
        void mo10492c(View view, int i);

        /* JADX INFO: renamed from: d */
        void mo10493d(View view, boolean z, int i, EpgItemInfo epgItemInfo);

        /* JADX INFO: renamed from: e */
        void mo10494e(int i, EpgItemInfo epgItemInfo);

        /* JADX INFO: renamed from: f */
        boolean mo10495f(int i, EpgItemInfo epgItemInfo, View view, int i2, KeyEvent keyEvent);
    }

    /* JADX WARN: Invalid debug info offset */
    public EpgInfoListAdapter(List<EpgItemInfo> list, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ boolean m10473d(EpgInfoListAdapter epgInfoListAdapter) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ String[] m10474h() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ String[] m10475i(String[] strArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public final void m10476j(List<EpgItemInfo> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public int m10477k(int i, int i2, String str) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public int m10478l(int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public void m10479m() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: n */
    public final java.lang.String m10480n() {
        /*
            r2 = this;
            r0 = 0
            return r0
        L1a:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.adapters.EpgInfoListAdapter.m10480n():java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public boolean m10481o(int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
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
    /* JADX INFO: renamed from: p */
    public final boolean m10482p(int i, EpgItemInfo epgItemInfo) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public boolean m10483q() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public void m10484r(List<EpgItemInfo> list, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public void m10485s(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public void m10486t(InterfaceC1948c interfaceC1948c) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public void m10487u(int i) {
    }
}
