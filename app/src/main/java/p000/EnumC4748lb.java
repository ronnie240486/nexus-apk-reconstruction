package p000;

/* JADX INFO: renamed from: lb */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC4748lb {
    FASTEST(1),
    FAST(3),
    NORMAL(5),
    MAXIMUM(7),
    ULTRA(9);

    private int level;

    EnumC4748lb(int i) {
        this.level = i;
    }

    public int getLevel() {
        return this.level;
    }
}
