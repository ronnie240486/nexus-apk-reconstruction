package p000;

import android.text.TextUtils;

/* JADX INFO: renamed from: y2 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC5761y2 {
    ALBUM(F00.ALBUM, "videoL"),
    ALBUM_WITH_INTRO(F00.ALBUM_WITH_INTRO, "videoLIntro"),
    ALBUM_SET(F00.ALBUM_SET, "videoR");

    private Class<?> activityCls;
    private int intVal;
    private String value;

    EnumC5761y2(F00 f00, String str) {
        this.value = str;
        this.intVal = f00.intVal();
        this.activityCls = f00.activityClass();
    }

    public static EnumC5761y2 from(String str) {
        if (TextUtils.isEmpty(str)) {
            return ALBUM;
        }
        for (EnumC5761y2 enumC5761y2 : values()) {
            if (str.equals(enumC5761y2.value)) {
                return enumC5761y2;
            }
        }
        return ALBUM;
    }

    public Class<?> activityCls() {
        return this.activityCls;
    }

    public int intVal() {
        return this.intVal;
    }
}
