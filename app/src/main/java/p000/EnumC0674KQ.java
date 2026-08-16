package p000;

import android.content.Context;
import android.media.ViviTV.C1756R;
import android.media.ViviTV.MainApp;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: KQ */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0674KQ {
    LD("LD", 0),
    SD("SD", 1),
    HD("HD", 2),
    UD("UD", 3),
    P_1080("1080P", 4),
    P_1080_PLUS("1080P+", 5),
    H265_SD("H265_SD", 10),
    H265_HD("H265_HD", 20),
    AUTO("AUTO", 90);

    private static final int INDEX_1080 = 4;
    private static final int INDEX_1080_PLUS = 5;
    private static final int INDEX_AUTO = 90;
    private static final int INDEX_H265_HD = 20;
    private static final int INDEX_H265_SD = 10;
    private static final int INDEX_HD = 2;
    private static final int INDEX_LD = 0;
    private static final int INDEX_SD = 1;
    private static final int INDEX_UD = 3;
    private int index;
    private String name;

    EnumC0674KQ(String str, int i) {
        this.name = str;
        this.index = i;
    }

    public static EnumC0674KQ getSharp(int i) {
        if (i == 0) {
            return LD;
        }
        if (i == 1) {
            return SD;
        }
        if (i == 2) {
            return HD;
        }
        if (i == 3) {
            return UD;
        }
        if (i == 4) {
            return P_1080;
        }
        if (i == 5) {
            return P_1080_PLUS;
        }
        if (i == 10) {
            return H265_SD;
        }
        if (i != 20) {
            return i != 90 ? SD : AUTO;
        }
        return H265_HD;
    }

    public static EnumC0674KQ getSuitSharp(EnumC0674KQ enumC0674KQ, List<EnumC0674KQ> list) {
        if (list.contains(enumC0674KQ)) {
            return enumC0674KQ;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(Integer.valueOf(Math.abs(list.get(i).index - enumC0674KQ.index)));
        }
        ArrayList arrayList2 = (ArrayList) arrayList.clone();
        Collections.sort(arrayList2);
        Integer num = (Integer) arrayList2.get(0);
        num.intValue();
        return list.get(arrayList.indexOf(num));
    }

    private static String matchSharpTag(int i) {
        int i2;
        Context contextM9239c0 = MainApp.m9239c0();
        MainApp.m9281m(contextM9239c0);
        if (i == 0) {
            i2 = C1756R.string.f4747LD;
        } else if (i == 1) {
            i2 = C1756R.string.f4748SD;
        } else if (i == 2) {
            i2 = C1756R.string.f4746HD;
        } else if (i == 3) {
            i2 = C1756R.string.f4749UD;
        } else if (i == 4) {
            i2 = C1756R.string.P_1080;
        } else if (i == 5) {
            i2 = C1756R.string.P_1080_PLUS;
        } else if (i == 10) {
            i2 = C1756R.string.H265_SD;
        } else if (i == 20) {
            i2 = C1756R.string.H265_HD;
        } else {
            if (i != 90) {
                return null;
            }
            i2 = C1756R.string.auto;
        }
        return contextM9239c0.getString(i2);
    }

    public int getIndex() {
        return this.index;
    }

    public String getName() {
        return matchSharpTag(this.index);
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public static String getName(int i) {
        for (EnumC0674KQ enumC0674KQ : values()) {
            if (enumC0674KQ.getIndex() == i) {
                return matchSharpTag(i);
            }
        }
        return null;
    }

    public static final EnumC0674KQ getSharp(String str) {
        return getSharp(str, SD);
    }

    public static final EnumC0674KQ getSharp(String str, EnumC0674KQ enumC0674KQ) {
        if (TextUtils.isEmpty(str)) {
            return SD;
        }
        if ("Mobile-MP4-720P".equalsIgnoreCase(str)) {
            return UD;
        }
        if ("Mobile-MP4-SD".equalsIgnoreCase(str)) {
            return SD;
        }
        if ("Mobile-MP4-Speed".equalsIgnoreCase(str)) {
            return LD;
        }
        if ("SuperHD".equalsIgnoreCase(str)) {
            return UD;
        }
        if ("SD".equalsIgnoreCase(str)) {
            return SD;
        }
        if ("HD".equalsIgnoreCase(str)) {
            return HD;
        }
        if ("Speed".equalsIgnoreCase(str)) {
            return LD;
        }
        if ("1080P".equalsIgnoreCase(str)) {
            return P_1080;
        }
        if ("720P".equalsIgnoreCase(str)) {
            return UD;
        }
        if ("small".equalsIgnoreCase(str)) {
            return LD;
        }
        if (FirebaseAnalytics.Param.MEDIUM.equalsIgnoreCase(str)) {
            return SD;
        }
        if ("large".equalsIgnoreCase(str)) {
            return HD;
        }
        if ("hd720".equalsIgnoreCase(str)) {
            return UD;
        }
        if ("hd1080".equalsIgnoreCase(str)) {
            return P_1080;
        }
        return "highres".equalsIgnoreCase(str) ? P_1080_PLUS : enumC0674KQ;
    }
}
