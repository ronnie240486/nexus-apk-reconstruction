package p000;

/* JADX INFO: renamed from: p2 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC5153p2 {
    KEY_STRENGTH_128(1, 8, 16, 16),
    KEY_STRENGTH_192(2, 12, 24, 24),
    KEY_STRENGTH_256(3, 16, 32, 32);

    private int keyLength;
    private int macLength;
    private int rawCode;
    private int saltLength;

    EnumC5153p2(int i, int i2, int i3, int i4) {
        this.rawCode = i;
        this.saltLength = i2;
        this.macLength = i3;
        this.keyLength = i4;
    }

    public static EnumC5153p2 getAesKeyStrengthFromRawCode(int i) {
        for (EnumC5153p2 enumC5153p2 : values()) {
            if (enumC5153p2.getRawCode() == i) {
                return enumC5153p2;
            }
        }
        return null;
    }

    public int getKeyLength() {
        return this.keyLength;
    }

    public int getMacLength() {
        return this.macLength;
    }

    public int getRawCode() {
        return this.rawCode;
    }

    public int getSaltLength() {
        return this.saltLength;
    }
}
