package com.p2pengine.core.abs.mpd;

import com.p2pengine.core.abs.mpd.manifest.C3915f;

/* JADX INFO: loaded from: classes2.dex */
public interface DashSegmentIndex {
    public static final int INDEX_UNBOUNDED = -1;

    long getDurationUs(long j, long j2);

    long getFirstSegmentNum();

    int getSegmentCount(long j);

    long getSegmentNum(long j, long j2);

    C3915f getSegmentUrl(long j);

    long getTimeUs(long j);

    boolean isExplicit();
}
