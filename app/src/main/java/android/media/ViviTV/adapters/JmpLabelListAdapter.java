package android.media.ViviTV.adapters;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class JmpLabelListAdapter extends RecyclerView.Adapter<ViewHolderJmpLabel> implements View.OnClickListener, View.OnKeyListener, View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public Context f5671a;

    /* JADX INFO: renamed from: b */
    public List<String> f5672b;

    /* JADX INFO: renamed from: c */
    public InterfaceC1955a f5673c;

    /* JADX INFO: renamed from: d */
    public View f5674d;

    /* JADX INFO: renamed from: e */
    public int f5675e;

    /* JADX INFO: renamed from: f */
    public boolean f5676f;

    public static class ViewHolderJmpLabel extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a */
        public TextView f5677a;

        /* JADX WARN: Invalid debug info offset */
        public ViewHolderJmpLabel(View view) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k */
        public void m10576k(String str) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.adapters.JmpLabelListAdapter$a */
    public interface InterfaceC1955a {
        /* JADX INFO: renamed from: a0 */
        void mo10577a0(int i);
    }

    /* JADX WARN: Invalid debug info offset */
    public JmpLabelListAdapter(Context context, int i, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x001c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public JmpLabelListAdapter(android.content.Context r11, java.util.ArrayList<p000.C6020o10> r12, boolean r13) {
        /*
            r10 = this;
            return
        L25:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.adapters.JmpLabelListAdapter.<init>(android.content.Context, java.util.ArrayList, boolean):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public View m10569d() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public int m10570h() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public List<String> m10571i() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public void m10572j(ViewHolderJmpLabel viewHolderJmpLabel, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public ViewHolderJmpLabel m10573k(ViewGroup viewGroup, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public void m10574l(InterfaceC1955a interfaceC1955a) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public void m10575m(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
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
}
