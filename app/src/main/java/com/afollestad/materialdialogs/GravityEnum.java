package com.afollestad.materialdialogs;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import androidx.core.view.GravityCompat;

/* JADX INFO: loaded from: classes.dex */
public enum GravityEnum {
    START,
    CENTER,
    END;

    private static final boolean HAS_RTL = true;

    /* JADX INFO: renamed from: com.afollestad.materialdialogs.GravityEnum$1 */
    public static /* synthetic */ class C30941 {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10547a;

        static {
            int[] iArr = new int[GravityEnum.values().length];
            f10547a = iArr;
            try {
                iArr[GravityEnum.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10547a[GravityEnum.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10547a[GravityEnum.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @SuppressLint({"RtlHardcoded"})
    public int getGravityInt() {
        int i = C30941.f10547a[ordinal()];
        if (i == 1) {
            if (HAS_RTL) {
                return GravityCompat.START;
            }
            return 3;
        }
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            throw new IllegalStateException("Invalid gravity constant");
        }
        if (HAS_RTL) {
            return GravityCompat.END;
        }
        return 5;
    }

    @TargetApi(17)
    public int getTextAlignment() {
        int i = C30941.f10547a[ordinal()];
        if (i != 2) {
            return i != 3 ? 5 : 6;
        }
        return 4;
    }
}
