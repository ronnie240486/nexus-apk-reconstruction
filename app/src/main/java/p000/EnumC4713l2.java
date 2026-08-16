package p000;

import android.text.TextUtils;

/* JADX INFO: renamed from: l2 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC4713l2 {
    NONE(-1, "none"),
    ALL(1, "liveVod"),
    LIVE(2, C1153Rv.f3034m),
    VOD(3, "vod");

    private int intVal;
    private String value;

    EnumC4713l2(int i, String str) {
        this.intVal = i;
        this.value = str;
    }

    public static EnumC4713l2 from(String str) {
        if (TextUtils.isEmpty(str)) {
            return NONE;
        }
        for (EnumC4713l2 enumC4713l2 : values()) {
            if (str.equalsIgnoreCase(enumC4713l2.value())) {
                return enumC4713l2;
            }
        }
        return NONE;
    }

    public int intVal() {
        return this.intVal;
    }

    public boolean isLiveAdEnabled() {
        return this == ALL || this == LIVE;
    }

    public boolean isVodAdEnabled() {
        return this == ALL || this == VOD;
    }

    public String value() {
        return this.value;
    }
}
