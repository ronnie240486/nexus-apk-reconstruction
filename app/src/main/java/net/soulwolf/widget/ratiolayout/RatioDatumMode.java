package net.soulwolf.widget.ratiolayout;

/* JADX INFO: loaded from: classes2.dex */
public enum RatioDatumMode {
    DATUM_AUTO(0),
    DATUM_WIDTH(1),
    DATUM_HEIGHT(2);

    final int mode;

    RatioDatumMode(int i) {
        this.mode = i;
    }

    public static RatioDatumMode valueOf(int i) {
        RatioDatumMode ratioDatumMode = DATUM_WIDTH;
        if (i == ratioDatumMode.mode) {
            return ratioDatumMode;
        }
        RatioDatumMode ratioDatumMode2 = DATUM_HEIGHT;
        return i == ratioDatumMode2.mode ? ratioDatumMode2 : DATUM_AUTO;
    }
}
