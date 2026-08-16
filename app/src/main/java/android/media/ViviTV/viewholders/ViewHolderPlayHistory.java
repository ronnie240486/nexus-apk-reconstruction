package android.media.ViviTV.viewholders;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.ViviTV.adapters.RecyclerAdapterPTR;
import android.media.ViviTV.adapters.VideoListAdapterRV;
import java.util.List;
import p000.R00;

/* JADX INFO: loaded from: classes.dex */
public class ViewHolderPlayHistory extends ViewHolderHorizontalLoad<VideoListAdapterRV.VideoInfoViewHolder, R00> {

    /* JADX INFO: renamed from: t */
    public BroadcastReceiver f9867t;

    /* JADX INFO: renamed from: android.media.ViviTV.viewholders.ViewHolderPlayHistory$a */
    public class C2358a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewHolderPlayHistory f9868a;

        /* JADX WARN: Invalid debug info offset */
        public C2358a(ViewHolderPlayHistory viewHolderPlayHistory) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.viewholders.ViewHolderPlayHistory$b */
    public class C2359b extends VideoListAdapterRV {

        /* JADX INFO: renamed from: v */
        public final /* synthetic */ ViewHolderPlayHistory f9869v;

        /* JADX WARN: Invalid debug info offset */
        public C2359b(ViewHolderPlayHistory viewHolderPlayHistory, Context context, List<R00> list) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000e
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // android.media.ViviTV.adapters.RecyclerAdapterPTR
        /* JADX INFO: renamed from: Z */
        public java.util.List<p000.R00> mo10524Z(int r4, int r5) {
            /*
                r3 = this;
                r0 = 0
                return r0
            L5d:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.viewholders.ViewHolderPlayHistory.C2359b.mo10524Z(int, int):java.util.List");
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x002b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public ViewHolderPlayHistory(android.view.View r4) {
        /*
            r3 = this;
            return
        L39:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.viewholders.ViewHolderPlayHistory.<init>(android.view.View):void");
    }

    @Override // android.media.ViviTV.viewholders.ViewHolderHorizontalLoad
    /* JADX INFO: renamed from: M */
    public void mo14317M() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.viewholders.ViewHolderHorizontalLoad
    /* JADX INFO: renamed from: N */
    public RecyclerAdapterPTR<VideoListAdapterRV.VideoInfoViewHolder, R00> mo14318N() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.viewholders.ViewHolderHorizontalLoad
    /* JADX INFO: renamed from: O */
    public int mo14319O() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.viewholders.ViewHolderHorizontalLoad
    /* JADX INFO: renamed from: P */
    public /* bridge */ /* synthetic */ void mo14320P(int i, R00 r00) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public void m14358S(int i, R00 r00) {
    }
}
