package com.p2pengine.core.abs.mpd.manifest;

import com.p2pengine.core.abs.mpd.DashSegmentIndex;

/* JADX INFO: renamed from: com.p2pengine.core.abs.mpd.manifest.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C3918i implements DashSegmentIndex {

    /* JADX INFO: renamed from: a */
    public final C3915f f11705a;

    /* JADX WARN: Invalid debug info offset */
    public C3918i(C3915f c3915f) {
    }

    @Override // com.p2pengine.core.abs.mpd.DashSegmentIndex
    public long getDurationUs(long j, long j2) {
        return j2;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.abs.mpd.DashSegmentIndex
    public long getFirstSegmentNum() {
        return 0L;
    }

    @Override // com.p2pengine.core.abs.mpd.DashSegmentIndex
    public int getSegmentCount(long j) {
        return 1;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.abs.mpd.DashSegmentIndex
    public long getSegmentNum(long j, long j2) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.abs.mpd.DashSegmentIndex
    public C3915f getSegmentUrl(long j) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.p2pengine.core.abs.mpd.DashSegmentIndex
    public long getTimeUs(long j) {
        return 0L;
    }

    @Override // com.p2pengine.core.abs.mpd.DashSegmentIndex
    public boolean isExplicit() {
        return true;
    }
}
