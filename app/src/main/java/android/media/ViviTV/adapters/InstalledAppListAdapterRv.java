package android.media.ViviTV.adapters;

import android.content.Context;
import android.content.pm.PackageManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import me.itangqi.waveloadingview.WaveLoadingView;
import p000.C0736LM;
import p000.C4650k3;

/* JADX INFO: loaded from: classes.dex */
public class InstalledAppListAdapterRv extends RecyclerAdapterPTR<AppViewHolder, C4650k3> implements View.OnFocusChangeListener, View.OnClickListener {

    /* JADX INFO: renamed from: v */
    public Context f5659v;

    /* JADX INFO: renamed from: w */
    public PackageManager f5660w;

    /* JADX INFO: renamed from: x */
    public boolean f5661x;

    /* JADX INFO: renamed from: y */
    public InterfaceC1954b f5662y;

    /* JADX INFO: renamed from: z */
    public int f5663z;

    public class AppViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public C4650k3 f5664a;

        /* JADX INFO: renamed from: b */
        public ImageView f5665b;

        /* JADX INFO: renamed from: c */
        public TextView f5666c;

        /* JADX INFO: renamed from: d */
        public ImageView f5667d;

        /* JADX INFO: renamed from: e */
        public WaveLoadingView f5668e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InstalledAppListAdapterRv f5669f;

        /* JADX WARN: Invalid debug info offset */
        public AppViewHolder(InstalledAppListAdapterRv installedAppListAdapterRv, View view) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k */
        public static /* synthetic */ C4650k3 m10564k(AppViewHolder appViewHolder) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: l */
        public void m10565l(C4650k3 c4650k3) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: m */
        public C4650k3 m10566m() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: n */
        public void m10567n() {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: o */
        public void m10568o(double d) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.InstalledAppListAdapterRv$a */
    public class C1953a extends TypeToken<List<C0736LM>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InstalledAppListAdapterRv f5670a;

        /* JADX WARN: Invalid debug info offset */
        public C1953a(InstalledAppListAdapterRv installedAppListAdapterRv) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.InstalledAppListAdapterRv$b */
    public interface InterfaceC1954b {
        /* JADX INFO: renamed from: a */
        void mo10056a(int i, C4650k3 c4650k3);

        /* JADX INFO: renamed from: b */
        void mo10057b(int i, C4650k3 c4650k3);
    }

    /* JADX WARN: Invalid debug info offset */
    public InstalledAppListAdapterRv(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public InstalledAppListAdapterRv(Context context, List<? extends C4650k3> list) {
    }

    /* JADX WARN: Invalid debug info offset */
    public InstalledAppListAdapterRv(Context context, List<? extends C4650k3> list, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ Context m10557a0(InstalledAppListAdapterRv installedAppListAdapterRv) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ boolean m10558b0(InstalledAppListAdapterRv installedAppListAdapterRv) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x003e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // android.media.ViviTV.adapters.RecyclerAdapterPTR
    /* JADX INFO: renamed from: Z */
    public java.util.List<p000.C4650k3> mo10524Z(int r4, int r5) {
        /*
            r3 = this;
            r0 = 0
            return r0
        L53:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.adapters.InstalledAppListAdapterRv.mo10524Z(int, int):java.util.List");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c0 */
    public void m10559c0(AppViewHolder appViewHolder, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d0 */
    public void m10560d0(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e0 */
    public void m10561e0(InterfaceC1954b interfaceC1954b) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f0 */
    public void m10562f0(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g0 */
    public void m10563g0(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.adapters.RecyclerAdapterPTR, android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.adapters.RecyclerAdapterPTR
    /* JADX INFO: renamed from: u */
    public /* bridge */ /* synthetic */ void mo10529u(RecyclerView.ViewHolder viewHolder, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.adapters.RecyclerAdapterPTR
    /* JADX INFO: renamed from: v */
    public RecyclerView.ViewHolder mo10530v(View view) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.adapters.RecyclerAdapterPTR
    /* JADX INFO: renamed from: z */
    public int mo10531z() {
        return 0;
    }
}
