package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
final class MediaPeriodInfo {
    public final long contentPositionUs;
    public final long durationUs;
    public final long endPositionUs;

    /* JADX INFO: renamed from: id */
    public final MediaSource.MediaPeriodId f11056id;
    public final boolean isFinal;
    public final boolean isLastInTimelinePeriod;
    public final long startPositionUs;

    public MediaPeriodInfo(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.f11056id = mediaPeriodId;
        this.startPositionUs = j;
        this.contentPositionUs = j2;
        this.endPositionUs = j3;
        this.durationUs = j4;
        this.isLastInTimelinePeriod = z;
        this.isFinal = z2;
    }

    public MediaPeriodInfo copyWithContentPositionUs(long j) {
        return j == this.contentPositionUs ? this : new MediaPeriodInfo(this.f11056id, this.startPositionUs, j, this.endPositionUs, this.durationUs, this.isLastInTimelinePeriod, this.isFinal);
    }

    public MediaPeriodInfo copyWithStartPositionUs(long j) {
        return j == this.startPositionUs ? this : new MediaPeriodInfo(this.f11056id, j, this.contentPositionUs, this.endPositionUs, this.durationUs, this.isLastInTimelinePeriod, this.isFinal);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MediaPeriodInfo.class != obj.getClass()) {
            return false;
        }
        MediaPeriodInfo mediaPeriodInfo = (MediaPeriodInfo) obj;
        return this.startPositionUs == mediaPeriodInfo.startPositionUs && this.contentPositionUs == mediaPeriodInfo.contentPositionUs && this.endPositionUs == mediaPeriodInfo.endPositionUs && this.durationUs == mediaPeriodInfo.durationUs && this.isLastInTimelinePeriod == mediaPeriodInfo.isLastInTimelinePeriod && this.isFinal == mediaPeriodInfo.isFinal && Util.areEqual(this.f11056id, mediaPeriodInfo.f11056id);
    }

    public int hashCode() {
        return ((((((((((((this.f11056id.hashCode() + 527) * 31) + ((int) this.startPositionUs)) * 31) + ((int) this.contentPositionUs)) * 31) + ((int) this.endPositionUs)) * 31) + ((int) this.durationUs)) * 31) + (this.isLastInTimelinePeriod ? 1 : 0)) * 31) + (this.isFinal ? 1 : 0);
    }
}
