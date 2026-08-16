package com.google.android.exoplayer2.scheduler;

/* JADX INFO: loaded from: classes2.dex */
public interface Scheduler {
    boolean cancel();

    boolean schedule(Requirements requirements, String str, String str2);
}
