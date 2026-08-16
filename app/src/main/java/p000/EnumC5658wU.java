package p000;

/* JADX INFO: renamed from: wU */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC5658wU {
    TOP(0),
    BOTTOM(1),
    BOTH(2);

    private int mValue;

    EnumC5658wU(int i) {
        this.mValue = i;
    }

    public static EnumC5658wU getFromInt(int i) {
        for (EnumC5658wU enumC5658wU : values()) {
            if (enumC5658wU.mValue == i) {
                return enumC5658wU;
            }
        }
        return BOTH;
    }
}
