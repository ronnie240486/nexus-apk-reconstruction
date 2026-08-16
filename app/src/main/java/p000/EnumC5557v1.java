package p000;

/* JADX INFO: renamed from: v1 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5557v1 {
    ALLOW_NO_ACCOUNT(1, "allowNoAccount"),
    NEED_ACCOUNT(2, "hasAccount"),
    NEED_ACCOUNT_ACTIVE(3, "validAccount");

    private int intValue;
    private String strValue;

    EnumC5557v1(int i, String str) {
        this.intValue = i;
        this.strValue = str;
    }

    public static EnumC5557v1 from(String str, EnumC5557v1 enumC5557v1) {
        if (str == null) {
            return enumC5557v1;
        }
        for (EnumC5557v1 enumC5557v2 : values()) {
            if (str.equals(enumC5557v2.strValue)) {
                return enumC5557v2;
            }
        }
        return enumC5557v1;
    }
}
