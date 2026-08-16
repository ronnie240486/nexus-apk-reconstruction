package p000;

/* JADX INFO: renamed from: q2 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC5216q2 {
    ONE(1),
    TWO(2);

    private int versionNumber;

    EnumC5216q2(int i) {
        this.versionNumber = i;
    }

    public static EnumC5216q2 getFromVersionNumber(int i) {
        for (EnumC5216q2 enumC5216q2 : values()) {
            if (enumC5216q2.versionNumber == i) {
                return enumC5216q2;
            }
        }
        throw new IllegalArgumentException("Unsupported Aes version");
    }

    public int getVersionNumber() {
        return this.versionNumber;
    }
}
