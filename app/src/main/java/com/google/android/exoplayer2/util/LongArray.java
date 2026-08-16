package com.google.android.exoplayer2.util;

import java.util.Arrays;
import p000.C5274qy;

/* JADX INFO: loaded from: classes2.dex */
public final class LongArray {
    private static final int DEFAULT_INITIAL_CAPACITY = 32;
    private int size;
    private long[] values;

    public LongArray() {
        this(32);
    }

    public void add(long j) {
        int i = this.size;
        long[] jArr = this.values;
        if (i == jArr.length) {
            this.values = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.values;
        int i2 = this.size;
        this.size = i2 + 1;
        jArr2[i2] = j;
    }

    public long get(int i) {
        if (i >= 0 && i < this.size) {
            return this.values[i];
        }
        StringBuilder sbM27771a = C5274qy.m27771a("Invalid index ", i, ", size is ");
        sbM27771a.append(this.size);
        throw new IndexOutOfBoundsException(sbM27771a.toString());
    }

    public int size() {
        return this.size;
    }

    public long[] toArray() {
        return Arrays.copyOf(this.values, this.size);
    }

    public LongArray(int i) {
        this.values = new long[i];
    }
}
