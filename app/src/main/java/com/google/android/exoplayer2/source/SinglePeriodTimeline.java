package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Assertions;

/* JADX INFO: loaded from: classes2.dex */
public final class SinglePeriodTimeline extends Timeline {
    private static final Object UID = new Object();
    private final boolean isDynamic;
    private final boolean isLive;
    private final boolean isSeekable;

    @Nullable
    private final Object manifest;
    private final long periodDurationUs;
    private final long presentationStartTimeMs;

    @Nullable
    private final Object tag;
    private final long windowDefaultStartPositionUs;
    private final long windowDurationUs;
    private final long windowPositionInPeriodUs;
    private final long windowStartTimeMs;

    public SinglePeriodTimeline(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, @Nullable Object obj, @Nullable Object obj2) {
        this.presentationStartTimeMs = j;
        this.windowStartTimeMs = j2;
        this.periodDurationUs = j3;
        this.windowDurationUs = j4;
        this.windowPositionInPeriodUs = j5;
        this.windowDefaultStartPositionUs = j6;
        this.isSeekable = z;
        this.isDynamic = z2;
        this.isLive = z3;
        this.manifest = obj;
        this.tag = obj2;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getIndexOfPeriod(Object obj) {
        return UID.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
        Assertions.checkIndex(i, 0, 1);
        return period.set(null, z ? UID : null, 0, this.periodDurationUs, -this.windowPositionInPeriodUs);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getPeriodCount() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Object getUidOfPeriod(int i) {
        Assertions.checkIndex(i, 0, 1);
        return UID;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0029 A[PHI: r1
      0x0029: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000d, B:5:0x0013, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.exoplayer2.Timeline
    public Timeline.Window getWindow(int i, Timeline.Window window, long j) {
        long j2;
        Assertions.checkIndex(i, 0, 1);
        long j3 = this.windowDefaultStartPositionUs;
        boolean z = this.isDynamic;
        if (!z || j == 0) {
            j2 = j3;
        } else {
            long j4 = this.windowDurationUs;
            if (j4 != C3219C.TIME_UNSET) {
                j3 += j;
                if (j3 <= j4) {
                    j2 = j3;
                }
            }
            j2 = -9223372036854775807L;
        }
        return window.set(Timeline.Window.SINGLE_WINDOW_UID, this.tag, this.manifest, this.presentationStartTimeMs, this.windowStartTimeMs, this.isSeekable, z, this.isLive, j2, this.windowDurationUs, 0, 0, this.windowPositionInPeriodUs);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getWindowCount() {
        return 1;
    }

    public SinglePeriodTimeline(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, @Nullable Object obj, @Nullable Object obj2) {
        this(C3219C.TIME_UNSET, C3219C.TIME_UNSET, j, j2, j3, j4, z, z2, z3, obj, obj2);
    }

    public SinglePeriodTimeline(long j, boolean z, boolean z2, boolean z3) {
        this(j, z, z2, z3, null, null);
    }

    public SinglePeriodTimeline(long j, boolean z, boolean z2, boolean z3, @Nullable Object obj, @Nullable Object obj2) {
        this(j, j, 0L, 0L, z, z2, z3, obj, obj2);
    }
}
