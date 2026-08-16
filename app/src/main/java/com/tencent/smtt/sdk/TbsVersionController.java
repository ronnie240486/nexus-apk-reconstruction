package com.tencent.smtt.sdk;

import android.content.Context;
import p000.AbstractC1293U5;

/* JADX INFO: loaded from: classes2.dex */
public class TbsVersionController {

    /* JADX INFO: renamed from: a */
    private static IntervalChoice f12893a = IntervalChoice.SIX_HOUR;

    public interface CallBack {
        void canLocalVersionUsed(int i, boolean z);

        void latestVersion(int i);
    }

    public enum IntervalChoice {
        TEN_MINUTE(AbstractC1293U5.f3399g),
        HALF_HOUR(1800000),
        ONE_HOUR(3600000),
        SIX_HOUR(21600000),
        TWELVE_HOUR(43200000);

        public final int value;

        IntervalChoice(int i) {
            this.value = i;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public static void checkVersion(Context context, CallBack callBack) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setCheckInterval(IntervalChoice intervalChoice) {
    }
}
