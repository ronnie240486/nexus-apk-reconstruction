package com.google.zxing.oned.rss;

import p000.C00;
import p000.C1313UP;

/* JADX INFO: loaded from: classes2.dex */
public class DataCharacter {
    private final int checksumPortion;
    private final int value;

    public DataCharacter(int i, int i2) {
        this.value = i;
        this.checksumPortion = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DataCharacter)) {
            return false;
        }
        DataCharacter dataCharacter = (DataCharacter) obj;
        return this.value == dataCharacter.value && this.checksumPortion == dataCharacter.checksumPortion;
    }

    public final int getChecksumPortion() {
        return this.checksumPortion;
    }

    public final int getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value ^ this.checksumPortion;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.value);
        sb.append(C1313UP.f3458k);
        return C00.m823a(sb, this.checksumPortion, ')');
    }
}
