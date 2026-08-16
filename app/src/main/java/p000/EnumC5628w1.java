package p000;

/* JADX INFO: renamed from: w1 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5628w1 {
    CUSTOMER("customer"),
    HOTEL("room");

    private String strVal;

    EnumC5628w1(String str) {
        this.strVal = str;
    }

    public static boolean isHotel(String str) {
        if (str == null) {
            return false;
        }
        return str.equalsIgnoreCase(HOTEL.getStrVal());
    }

    public String getStrVal() {
        return this.strVal;
    }
}
