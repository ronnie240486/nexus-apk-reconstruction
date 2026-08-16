package p000;

/* JADX INFO: renamed from: cf */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC3051cf {
    ALL(true, true),
    NONE(false, false),
    SOURCE(true, false),
    RESULT(false, true);

    private final boolean cacheResult;
    private final boolean cacheSource;

    EnumC3051cf(boolean z, boolean z2) {
        this.cacheSource = z;
        this.cacheResult = z2;
    }

    public boolean cacheResult() {
        return this.cacheResult;
    }

    public boolean cacheSource() {
        return this.cacheSource;
    }
}
