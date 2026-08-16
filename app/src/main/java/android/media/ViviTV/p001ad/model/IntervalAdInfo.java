package android.media.ViviTV.p001ad.model;

import p000.InterfaceC0445Gq;

/* JADX INFO: loaded from: classes.dex */
public class IntervalAdInfo extends BaseAdInfo implements InterfaceC0445Gq {
    private static final int INTERVAL_DEFAULT = 60;
    private int interval;

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public void assignFromJson(org.json.JSONObject r2) {
        /*
            r1 = this;
            return
        L2e:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.p001ad.model.IntervalAdInfo.assignFromJson(org.json.JSONObject):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public int getInterval() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // p000.InterfaceC0445Gq
    public int getIntervalSeconds() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setInterval(int i) {
    }
}
