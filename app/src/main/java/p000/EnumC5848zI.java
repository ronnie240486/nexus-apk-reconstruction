package p000;

/* JADX INFO: renamed from: zI */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5848zI {
    WX_PAY(1, "wechat"),
    ALI_PAY(2, "alipay");

    private String strValue;
    private int value;

    EnumC5848zI(int i, String str) {
        this.value = i;
        this.strValue = str;
    }

    public int intVal() {
        return this.value;
    }

    public String strVal() {
        return this.strValue;
    }
}
