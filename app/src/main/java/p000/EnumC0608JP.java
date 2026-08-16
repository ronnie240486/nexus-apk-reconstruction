package p000;

import android.text.TextUtils;

/* JADX INFO: renamed from: JP */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0608JP {
    ALL("all", 2),
    LITE("lite", 1);

    private int intVal;
    private String val;

    EnumC0608JP(String str, int i) {
        this.val = str;
        this.intVal = i;
    }

    public static EnumC0608JP from(String str) {
        return from(str, LITE);
    }

    public int intVal() {
        return this.intVal;
    }

    public String val() {
        return this.val;
    }

    public static EnumC0608JP from(String str, EnumC0608JP enumC0608JP) {
        if (TextUtils.isEmpty(str)) {
            return enumC0608JP;
        }
        for (EnumC0608JP enumC0608JP2 : values()) {
            if (str.equals(enumC0608JP2.val())) {
                return enumC0608JP2;
            }
        }
        return enumC0608JP;
    }
}
