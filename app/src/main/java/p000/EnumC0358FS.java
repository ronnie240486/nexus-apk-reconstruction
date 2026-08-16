package p000;

/* JADX INFO: renamed from: FS */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0358FS {
    SPEED_ONE("1.0"),
    SPEED_ONE_POINT_FIVE("1.5"),
    SPEED_ONE_POINT_SEVEN_FIVE("1.75"),
    SPEED_TWO("2.0");

    private final String _value;

    EnumC0358FS(String str) {
        this._value = str;
    }

    public static EnumC0358FS convert(String str) {
        for (EnumC0358FS enumC0358FS : values()) {
            if (enumC0358FS._value.equals(str)) {
                return enumC0358FS;
            }
        }
        return null;
    }

    public Float getFloatValue() {
        return Float.valueOf(Float.parseFloat(this._value));
    }

    public String getValue() {
        return this._value;
    }
}
