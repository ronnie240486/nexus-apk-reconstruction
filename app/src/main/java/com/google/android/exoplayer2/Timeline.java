package com.google.android.exoplayer2;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Timeline {
    public static final Timeline EMPTY = new Timeline() { // from class: com.google.android.exoplayer2.Timeline.1
        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(Object obj) {
            return -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Period getPeriod(int i, Period period, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Object getUidOfPeriod(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Window getWindow(int i, Window window, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
            return 0;
        }
    };

    public static final class Period {
        private AdPlaybackState adPlaybackState = AdPlaybackState.NONE;
        public long durationUs;

        /* JADX INFO: renamed from: id */
        @Nullable
        public Object f11057id;
        private long positionInWindowUs;

        @Nullable
        public Object uid;
        public int windowIndex;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Period.class.equals(obj.getClass())) {
                return false;
            }
            Period period = (Period) obj;
            return Util.areEqual(this.f11057id, period.f11057id) && Util.areEqual(this.uid, period.uid) && this.windowIndex == period.windowIndex && this.durationUs == period.durationUs && this.positionInWindowUs == period.positionInWindowUs && Util.areEqual(this.adPlaybackState, period.adPlaybackState);
        }

        public int getAdCountInAdGroup(int i) {
            return this.adPlaybackState.adGroups[i].count;
        }

        public long getAdDurationUs(int i, int i2) {
            AdPlaybackState.AdGroup adGroup = this.adPlaybackState.adGroups[i];
            return adGroup.count != -1 ? adGroup.durationsUs[i2] : C3219C.TIME_UNSET;
        }

        public int getAdGroupCount() {
            return this.adPlaybackState.adGroupCount;
        }

        public int getAdGroupIndexAfterPositionUs(long j) {
            return this.adPlaybackState.getAdGroupIndexAfterPositionUs(j, this.durationUs);
        }

        public int getAdGroupIndexForPositionUs(long j) {
            return this.adPlaybackState.getAdGroupIndexForPositionUs(j, this.durationUs);
        }

        public long getAdGroupTimeUs(int i) {
            return this.adPlaybackState.adGroupTimesUs[i];
        }

        public long getAdResumePositionUs() {
            return this.adPlaybackState.adResumePositionUs;
        }

        public long getDurationMs() {
            return C3219C.usToMs(this.durationUs);
        }

        public long getDurationUs() {
            return this.durationUs;
        }

        public int getFirstAdIndexToPlay(int i) {
            return this.adPlaybackState.adGroups[i].getFirstAdIndexToPlay();
        }

        public int getNextAdIndexToPlay(int i, int i2) {
            return this.adPlaybackState.adGroups[i].getNextAdIndexToPlay(i2);
        }

        public long getPositionInWindowMs() {
            return C3219C.usToMs(this.positionInWindowUs);
        }

        public long getPositionInWindowUs() {
            return this.positionInWindowUs;
        }

        public boolean hasPlayedAdGroup(int i) {
            return !this.adPlaybackState.adGroups[i].hasUnplayedAds();
        }

        public int hashCode() {
            Object obj = this.f11057id;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.uid;
            int iHashCode2 = (((iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31) + this.windowIndex) * 31;
            long j = this.durationUs;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.positionInWindowUs;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            AdPlaybackState adPlaybackState = this.adPlaybackState;
            return i2 + (adPlaybackState != null ? adPlaybackState.hashCode() : 0);
        }

        public boolean isAdAvailable(int i, int i2) {
            AdPlaybackState.AdGroup adGroup = this.adPlaybackState.adGroups[i];
            return (adGroup.count == -1 || adGroup.states[i2] == 0) ? false : true;
        }

        public Period set(@Nullable Object obj, @Nullable Object obj2, int i, long j, long j2) {
            return set(obj, obj2, i, j, j2, AdPlaybackState.NONE);
        }

        public Period set(@Nullable Object obj, @Nullable Object obj2, int i, long j, long j2, AdPlaybackState adPlaybackState) {
            this.f11057id = obj;
            this.uid = obj2;
            this.windowIndex = i;
            this.durationUs = j;
            this.positionInWindowUs = j2;
            this.adPlaybackState = adPlaybackState;
            return this;
        }
    }

    public static final class Window {
        public static final Object SINGLE_WINDOW_UID = new Object();
        public long defaultPositionUs;
        public long durationUs;
        public int firstPeriodIndex;
        public boolean isDynamic;
        public boolean isLive;
        public boolean isSeekable;
        public int lastPeriodIndex;

        @Nullable
        public Object manifest;
        public long positionInFirstPeriodUs;
        public long presentationStartTimeMs;

        @Nullable
        public Object tag;
        public Object uid = SINGLE_WINDOW_UID;
        public long windowStartTimeMs;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Window.class.equals(obj.getClass())) {
                return false;
            }
            Window window = (Window) obj;
            return Util.areEqual(this.uid, window.uid) && Util.areEqual(this.tag, window.tag) && Util.areEqual(this.manifest, window.manifest) && this.presentationStartTimeMs == window.presentationStartTimeMs && this.windowStartTimeMs == window.windowStartTimeMs && this.isSeekable == window.isSeekable && this.isDynamic == window.isDynamic && this.isLive == window.isLive && this.defaultPositionUs == window.defaultPositionUs && this.durationUs == window.durationUs && this.firstPeriodIndex == window.firstPeriodIndex && this.lastPeriodIndex == window.lastPeriodIndex && this.positionInFirstPeriodUs == window.positionInFirstPeriodUs;
        }

        public long getDefaultPositionMs() {
            return C3219C.usToMs(this.defaultPositionUs);
        }

        public long getDefaultPositionUs() {
            return this.defaultPositionUs;
        }

        public long getDurationMs() {
            return C3219C.usToMs(this.durationUs);
        }

        public long getDurationUs() {
            return this.durationUs;
        }

        public long getPositionInFirstPeriodMs() {
            return C3219C.usToMs(this.positionInFirstPeriodUs);
        }

        public long getPositionInFirstPeriodUs() {
            return this.positionInFirstPeriodUs;
        }

        public int hashCode() {
            int iHashCode = (this.uid.hashCode() + 217) * 31;
            Object obj = this.tag;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.manifest;
            int iHashCode3 = obj2 != null ? obj2.hashCode() : 0;
            long j = this.presentationStartTimeMs;
            int i = (((iHashCode2 + iHashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.windowStartTimeMs;
            int i2 = (((((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.isSeekable ? 1 : 0)) * 31) + (this.isDynamic ? 1 : 0)) * 31) + (this.isLive ? 1 : 0)) * 31;
            long j3 = this.defaultPositionUs;
            int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.durationUs;
            int i4 = (((((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.firstPeriodIndex) * 31) + this.lastPeriodIndex) * 31;
            long j5 = this.positionInFirstPeriodUs;
            return i4 + ((int) (j5 ^ (j5 >>> 32)));
        }

        public Window set(Object obj, @Nullable Object obj2, @Nullable Object obj3, long j, long j2, boolean z, boolean z2, boolean z3, long j3, long j4, int i, int i2, long j5) {
            this.uid = obj;
            this.tag = obj2;
            this.manifest = obj3;
            this.presentationStartTimeMs = j;
            this.windowStartTimeMs = j2;
            this.isSeekable = z;
            this.isDynamic = z2;
            this.isLive = z3;
            this.defaultPositionUs = j3;
            this.durationUs = j4;
            this.firstPeriodIndex = i;
            this.lastPeriodIndex = i2;
            this.positionInFirstPeriodUs = j5;
            return this;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Timeline)) {
            return false;
        }
        Timeline timeline = (Timeline) obj;
        if (timeline.getWindowCount() != getWindowCount() || timeline.getPeriodCount() != getPeriodCount()) {
            return false;
        }
        Window window = new Window();
        Period period = new Period();
        Window window2 = new Window();
        Period period2 = new Period();
        for (int i = 0; i < getWindowCount(); i++) {
            if (!getWindow(i, window).equals(timeline.getWindow(i, window2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < getPeriodCount(); i2++) {
            if (!getPeriod(i2, period, true).equals(timeline.getPeriod(i2, period2, true))) {
                return false;
            }
        }
        return true;
    }

    public int getFirstWindowIndex(boolean z) {
        return isEmpty() ? -1 : 0;
    }

    public abstract int getIndexOfPeriod(Object obj);

    public int getLastWindowIndex(boolean z) {
        if (isEmpty()) {
            return -1;
        }
        return getWindowCount() - 1;
    }

    public final int getNextPeriodIndex(int i, Period period, Window window, int i2, boolean z) {
        int i3 = getPeriod(i, period).windowIndex;
        if (getWindow(i3, window).lastPeriodIndex != i) {
            return i + 1;
        }
        int nextWindowIndex = getNextWindowIndex(i3, i2, z);
        if (nextWindowIndex == -1) {
            return -1;
        }
        return getWindow(nextWindowIndex, window).firstPeriodIndex;
    }

    public int getNextWindowIndex(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == getLastWindowIndex(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == getLastWindowIndex(z) ? getFirstWindowIndex(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public final Period getPeriod(int i, Period period) {
        return getPeriod(i, period, false);
    }

    public abstract Period getPeriod(int i, Period period, boolean z);

    public Period getPeriodByUid(Object obj, Period period) {
        return getPeriod(getIndexOfPeriod(obj), period, true);
    }

    public abstract int getPeriodCount();

    public final Pair<Object, Long> getPeriodPosition(Window window, Period period, int i, long j) {
        return (Pair) Assertions.checkNotNull(getPeriodPosition(window, period, i, j, 0L));
    }

    public int getPreviousWindowIndex(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == getFirstWindowIndex(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == getFirstWindowIndex(z) ? getLastWindowIndex(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object getUidOfPeriod(int i);

    public final Window getWindow(int i, Window window) {
        return getWindow(i, window, 0L);
    }

    public abstract Window getWindow(int i, Window window, long j);

    public abstract int getWindowCount();

    public int hashCode() {
        int i;
        Window window = new Window();
        Period period = new Period();
        int windowCount = getWindowCount() + 217;
        int i2 = 0;
        while (true) {
            i = windowCount * 31;
            if (i2 >= getWindowCount()) {
                break;
            }
            windowCount = i + getWindow(i2, window).hashCode();
            i2++;
        }
        int periodCount = getPeriodCount() + i;
        for (int i3 = 0; i3 < getPeriodCount(); i3++) {
            periodCount = (periodCount * 31) + getPeriod(i3, period, true).hashCode();
        }
        return periodCount;
    }

    public final boolean isEmpty() {
        return getWindowCount() == 0;
    }

    public final boolean isLastPeriod(int i, Period period, Window window, int i2, boolean z) {
        return getNextPeriodIndex(i, period, window, i2, z) == -1;
    }

    @Nullable
    public final Pair<Object, Long> getPeriodPosition(Window window, Period period, int i, long j, long j2) {
        Assertions.checkIndex(i, 0, getWindowCount());
        getWindow(i, window, j2);
        if (j == C3219C.TIME_UNSET) {
            j = window.getDefaultPositionUs();
            if (j == C3219C.TIME_UNSET) {
                return null;
            }
        }
        int i2 = window.firstPeriodIndex;
        long positionInFirstPeriodUs = window.getPositionInFirstPeriodUs() + j;
        while (true) {
            long durationUs = getPeriod(i2, period, true).getDurationUs();
            if (durationUs == C3219C.TIME_UNSET || positionInFirstPeriodUs < durationUs || i2 >= window.lastPeriodIndex) {
                break;
            }
            positionInFirstPeriodUs -= durationUs;
            i2++;
        }
        return Pair.create(Assertions.checkNotNull(period.uid), Long.valueOf(positionInFirstPeriodUs));
    }

    @Deprecated
    public final Window getWindow(int i, Window window, boolean z) {
        return getWindow(i, window, 0L);
    }
}
