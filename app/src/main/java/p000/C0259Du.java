package p000;

import android.media.ViviTV.C1756R;
import android.util.SparseArray;
import androidx.annotation.IdRes;
import java.util.Locale;

/* JADX INFO: renamed from: Du */
/* JADX INFO: loaded from: classes.dex */
public class C0259Du {

    /* JADX INFO: renamed from: i */
    public static a[] f645i;

    /* JADX INFO: renamed from: a */
    public static final int f637a = a.CHS.getLangId();

    /* JADX INFO: renamed from: b */
    public static final int f638b = a.CH_TW.getLangId();

    /* JADX INFO: renamed from: c */
    public static final int f639c = a.EN.getLangId();

    /* JADX INFO: renamed from: d */
    public static final int f640d = a.MALAY.getLangId();

    /* JADX INFO: renamed from: e */
    public static final int f641e = a.FOLLOW_SYS.getLangId();

    /* JADX INFO: renamed from: f */
    public static final int f642f = a.CAMBODIA.getLangId();

    /* JADX INFO: renamed from: g */
    public static final int f643g = a.BRAZIL.getLangId();

    /* JADX INFO: renamed from: h */
    public static final int f644h = a.KOREAN.getLangId();

    /* JADX INFO: renamed from: j */
    public static final SparseArray<Integer> f646j = new SparseArray<>();

    /* JADX INFO: renamed from: k */
    public static final SparseArray<a> f647k = new SparseArray<>();

    /* JADX INFO: renamed from: l */
    public static final SparseArray<a> f648l = new SparseArray<>();

    /* JADX INFO: renamed from: Du$a */
    public enum a {
        CHS(1, 1000, new Locale("zh", "CN"), C1756R.string.language_chs),
        CH_TW(2, 1100, new Locale("zh", "TW"), C1756R.string.language_cht),
        EN(3, 1200, new Locale("en", "US"), C1756R.string.language_english),
        MALAY(11, 1300, new Locale("ms", "MY"), C1756R.string.language_malay),
        FOLLOW_SYS(5, 1400, null, C1756R.string.language_follow_system),
        CAMBODIA(4, 1500, new Locale("km", "KH"), C1756R.string.language_khmer),
        BRAZIL(6, 1600, new Locale("pt", "BR"), C1756R.string.language_brazil),
        KOREAN(7, 1700, new Locale("ko", "KR"), C1756R.string.language_korean);

        private int langId;
        private Locale locale;

        @IdRes
        private int nameResId;
        private int tagId;

        a(int i, int i2, Locale locale, int i3) {
            this.langId = i;
            this.tagId = i2;
            this.locale = locale;
            this.nameResId = i3;
        }

        public int getLangId() {
            return this.langId;
        }

        public Locale getLocale() {
            return this.locale;
        }

        public int getNameResId() {
            return this.nameResId;
        }

        public int getTagId() {
            return this.tagId;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static a m1481a(int i, a aVar) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static a m1482b(int i, a aVar) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static int m1483c(int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static int m1484d(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static int m1485e() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static void m1486f() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static boolean m1487g(int i) {
        return false;
    }
}
