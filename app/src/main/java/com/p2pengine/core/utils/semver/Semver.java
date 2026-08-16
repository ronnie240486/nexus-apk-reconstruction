package com.p2pengine.core.utils.semver;

import java.math.BigDecimal;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.InterfaceC0595JC;

/* JADX INFO: loaded from: classes2.dex */
public final class Semver implements Comparable<Semver> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f12293a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final String f12294b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final String f12295c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final List<String> f12296d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final List<String> f12297e;

    @InterfaceC0595JC(m2918bv = {1, 0, 3}, m2919d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m2920d2 = {"Lcom/p2pengine/core/utils/semver/Semver$Style;", "", "<init>", "(Ljava/lang/String;I)V", "COMPACT", "COMPARABLE", "FULL", "sdk_release"}, m2921k = 1, m2922mv = {1, 5, 1})
    public enum Style {
        COMPACT,
        COMPARABLE,
        FULL
    }

    /* JADX INFO: renamed from: com.p2pengine.core.utils.semver.Semver$a */
    public /* synthetic */ class C4022a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f12299a;

        static {
            int[] iArr = new int[Style.values().length];
            iArr[Style.COMPACT.ordinal()] = 1;
            iArr[Style.COMPARABLE.ordinal()] = 2;
            iArr[Style.FULL.ordinal()] = 3;
            f12299a = iArr;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public Semver(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<String> list, @NotNull List<String> list2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static final List<BigDecimal> m18483b(Semver semver) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public int m18484a(@NotNull Semver semver) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Semver semver) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean equals(@Nullable Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @NotNull
    public String toString() {
        return null;
    }
}
