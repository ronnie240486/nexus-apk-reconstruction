package android.media.ViviTV.p001ad.model;

import p000.InterfaceC0445Gq;

/* JADX INFO: loaded from: classes.dex */
public class SubtitleAdInfo extends IntervalAdInfo implements InterfaceC0445Gq {
    private int textColor;
    private int textSize;
    private float textSpeed;
    private String typeface;

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // android.media.ViviTV.p001ad.model.IntervalAdInfo
    public void assignFromJson(org.json.JSONObject r3) {
        /*
            r2 = this;
            return
        L40:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.p001ad.model.SubtitleAdInfo.assignFromJson(org.json.JSONObject):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public int getTextColor() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getTextSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public float getTextSpeed() {
        return 0.0f;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getTypeface() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setTextColor(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setTextSize(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setTextSpeed(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setTypeface(String str) {
    }
}
