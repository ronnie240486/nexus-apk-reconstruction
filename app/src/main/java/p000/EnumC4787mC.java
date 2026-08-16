package p000;

/* JADX INFO: renamed from: mC */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4787mC {
    LOW(0.5f),
    NORMAL(1.0f),
    HIGH(1.5f);

    private float multiplier;

    EnumC4787mC(float f) {
        this.multiplier = f;
    }

    public float getMultiplier() {
        return this.multiplier;
    }
}
