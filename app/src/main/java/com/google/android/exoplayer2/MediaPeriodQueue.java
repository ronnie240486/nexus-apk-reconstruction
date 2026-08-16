package com.google.android.exoplayer2;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;

/* JADX INFO: loaded from: classes2.dex */
final class MediaPeriodQueue {
    private static final int MAXIMUM_BUFFER_AHEAD_PERIODS = 100;
    private int length;

    @Nullable
    private MediaPeriodHolder loading;
    private long nextWindowSequenceNumber;

    @Nullable
    private Object oldFrontPeriodUid;
    private long oldFrontPeriodWindowSequenceNumber;

    @Nullable
    private MediaPeriodHolder playing;

    @Nullable
    private MediaPeriodHolder reading;
    private int repeatMode;
    private boolean shuffleModeEnabled;
    private final Timeline.Period period = new Timeline.Period();
    private final Timeline.Window window = new Timeline.Window();
    private Timeline timeline = Timeline.EMPTY;

    private boolean areDurationsCompatible(long j, long j2) {
        return j == C3219C.TIME_UNSET || j == j2;
    }

    private boolean canKeepMediaPeriodHolder(MediaPeriodInfo mediaPeriodInfo, MediaPeriodInfo mediaPeriodInfo2) {
        return mediaPeriodInfo.startPositionUs == mediaPeriodInfo2.startPositionUs && mediaPeriodInfo.f11056id.equals(mediaPeriodInfo2.f11056id);
    }

    private MediaPeriodInfo getFirstMediaPeriodInfo(PlaybackInfo playbackInfo) {
        return getMediaPeriodInfo(playbackInfo.periodId, playbackInfo.contentPositionUs, playbackInfo.startPositionUs);
    }

    @Nullable
    private MediaPeriodInfo getFollowingMediaPeriodInfo(MediaPeriodHolder mediaPeriodHolder, long j) {
        long jLongValue;
        Object obj;
        long j2;
        long j3;
        long j4;
        MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.f19778info;
        long rendererOffset = (mediaPeriodHolder.getRendererOffset() + mediaPeriodInfo.durationUs) - j;
        long j5 = 0;
        if (mediaPeriodInfo.isLastInTimelinePeriod) {
            int nextPeriodIndex = this.timeline.getNextPeriodIndex(this.timeline.getIndexOfPeriod(mediaPeriodInfo.f11056id.periodUid), this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
            if (nextPeriodIndex == -1) {
                return null;
            }
            int i = this.timeline.getPeriod(nextPeriodIndex, this.period, true).windowIndex;
            Object obj2 = this.period.uid;
            long j6 = mediaPeriodInfo.f11056id.windowSequenceNumber;
            if (this.timeline.getWindow(i, this.window).firstPeriodIndex == nextPeriodIndex) {
                Pair<Object, Long> periodPosition = this.timeline.getPeriodPosition(this.window, this.period, i, C3219C.TIME_UNSET, Math.max(0L, rendererOffset));
                if (periodPosition == null) {
                    return null;
                }
                Object obj3 = periodPosition.first;
                long jLongValue2 = ((Long) periodPosition.second).longValue();
                MediaPeriodHolder next = mediaPeriodHolder.getNext();
                if (next == null || !next.uid.equals(obj3)) {
                    j4 = this.nextWindowSequenceNumber;
                    this.nextWindowSequenceNumber = 1 + j4;
                } else {
                    j4 = next.f19778info.f11056id.windowSequenceNumber;
                }
                j3 = jLongValue2;
                j5 = C3219C.TIME_UNSET;
                j2 = j4;
                obj = obj3;
            } else {
                obj = obj2;
                j2 = j6;
                j3 = 0;
            }
            return getMediaPeriodInfo(resolveMediaPeriodIdForAds(obj, j3, j2), j5, j3);
        }
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.f11056id;
        this.timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        if (!mediaPeriodId.isAd()) {
            int adGroupIndexForPositionUs = this.period.getAdGroupIndexForPositionUs(mediaPeriodInfo.endPositionUs);
            if (adGroupIndexForPositionUs == -1) {
                return getMediaPeriodInfoForContent(mediaPeriodId.periodUid, mediaPeriodInfo.durationUs, mediaPeriodId.windowSequenceNumber);
            }
            int firstAdIndexToPlay = this.period.getFirstAdIndexToPlay(adGroupIndexForPositionUs);
            if (this.period.isAdAvailable(adGroupIndexForPositionUs, firstAdIndexToPlay)) {
                return getMediaPeriodInfoForAd(mediaPeriodId.periodUid, adGroupIndexForPositionUs, firstAdIndexToPlay, mediaPeriodInfo.durationUs, mediaPeriodId.windowSequenceNumber);
            }
            return null;
        }
        int i2 = mediaPeriodId.adGroupIndex;
        int adCountInAdGroup = this.period.getAdCountInAdGroup(i2);
        if (adCountInAdGroup == -1) {
            return null;
        }
        int nextAdIndexToPlay = this.period.getNextAdIndexToPlay(i2, mediaPeriodId.adIndexInAdGroup);
        if (nextAdIndexToPlay < adCountInAdGroup) {
            if (this.period.isAdAvailable(i2, nextAdIndexToPlay)) {
                return getMediaPeriodInfoForAd(mediaPeriodId.periodUid, i2, nextAdIndexToPlay, mediaPeriodInfo.contentPositionUs, mediaPeriodId.windowSequenceNumber);
            }
            return null;
        }
        long j7 = mediaPeriodInfo.contentPositionUs;
        if (j7 == C3219C.TIME_UNSET) {
            Timeline timeline = this.timeline;
            Timeline.Window window = this.window;
            Timeline.Period period = this.period;
            Pair<Object, Long> periodPosition2 = timeline.getPeriodPosition(window, period, period.windowIndex, C3219C.TIME_UNSET, Math.max(0L, rendererOffset));
            if (periodPosition2 == null) {
                return null;
            }
            jLongValue = ((Long) periodPosition2.second).longValue();
        } else {
            jLongValue = j7;
        }
        return getMediaPeriodInfoForContent(mediaPeriodId.periodUid, jLongValue, mediaPeriodId.windowSequenceNumber);
    }

    private MediaPeriodInfo getMediaPeriodInfo(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2) {
        this.timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period);
        if (!mediaPeriodId.isAd()) {
            return getMediaPeriodInfoForContent(mediaPeriodId.periodUid, j2, mediaPeriodId.windowSequenceNumber);
        }
        if (this.period.isAdAvailable(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup)) {
            return getMediaPeriodInfoForAd(mediaPeriodId.periodUid, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup, j, mediaPeriodId.windowSequenceNumber);
        }
        return null;
    }

    private MediaPeriodInfo getMediaPeriodInfoForAd(Object obj, int i, int i2, long j, long j2) {
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(obj, i, i2, j2);
        return new MediaPeriodInfo(mediaPeriodId, i2 == this.period.getFirstAdIndexToPlay(i) ? this.period.getAdResumePositionUs() : 0L, j, C3219C.TIME_UNSET, this.timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup), false, false);
    }

    private MediaPeriodInfo getMediaPeriodInfoForContent(Object obj, long j, long j2) {
        int adGroupIndexAfterPositionUs = this.period.getAdGroupIndexAfterPositionUs(j);
        MediaSource.MediaPeriodId mediaPeriodId = new MediaSource.MediaPeriodId(obj, j2, adGroupIndexAfterPositionUs);
        boolean zIsLastInPeriod = isLastInPeriod(mediaPeriodId);
        boolean zIsLastInTimeline = isLastInTimeline(mediaPeriodId, zIsLastInPeriod);
        long adGroupTimeUs = adGroupIndexAfterPositionUs != -1 ? this.period.getAdGroupTimeUs(adGroupIndexAfterPositionUs) : -9223372036854775807L;
        return new MediaPeriodInfo(mediaPeriodId, j, C3219C.TIME_UNSET, adGroupTimeUs, (adGroupTimeUs == C3219C.TIME_UNSET || adGroupTimeUs == Long.MIN_VALUE) ? this.period.durationUs : adGroupTimeUs, zIsLastInPeriod, zIsLastInTimeline);
    }

    private boolean isLastInPeriod(MediaSource.MediaPeriodId mediaPeriodId) {
        return !mediaPeriodId.isAd() && mediaPeriodId.nextAdGroupIndex == -1;
    }

    private boolean isLastInTimeline(MediaSource.MediaPeriodId mediaPeriodId, boolean z) {
        int indexOfPeriod = this.timeline.getIndexOfPeriod(mediaPeriodId.periodUid);
        return !this.timeline.getWindow(this.timeline.getPeriod(indexOfPeriod, this.period).windowIndex, this.window).isDynamic && this.timeline.isLastPeriod(indexOfPeriod, this.period, this.window, this.repeatMode, this.shuffleModeEnabled) && z;
    }

    private long resolvePeriodIndexToWindowSequenceNumber(Object obj) {
        int indexOfPeriod;
        int i = this.timeline.getPeriodByUid(obj, this.period).windowIndex;
        Object obj2 = this.oldFrontPeriodUid;
        if (obj2 != null && (indexOfPeriod = this.timeline.getIndexOfPeriod(obj2)) != -1 && this.timeline.getPeriod(indexOfPeriod, this.period).windowIndex == i) {
            return this.oldFrontPeriodWindowSequenceNumber;
        }
        MediaPeriodHolder next = this.playing;
        while (next != null) {
            if (next.uid.equals(obj)) {
                return next.f19778info.f11056id.windowSequenceNumber;
            }
            next = next.getNext();
        }
        next = this.playing;
        while (next != null) {
            int indexOfPeriod2 = this.timeline.getIndexOfPeriod(next.uid);
            if (indexOfPeriod2 != -1 && this.timeline.getPeriod(indexOfPeriod2, this.period).windowIndex == i) {
                return next.f19778info.f11056id.windowSequenceNumber;
            }
            next = next.getNext();
        }
        long j = this.nextWindowSequenceNumber;
        this.nextWindowSequenceNumber = 1 + j;
        if (this.playing == null) {
            this.oldFrontPeriodUid = obj;
            this.oldFrontPeriodWindowSequenceNumber = j;
        }
        return j;
    }

    private boolean updateForPlaybackModeChange() {
        MediaPeriodHolder next = this.playing;
        if (next == null) {
            return true;
        }
        int indexOfPeriod = this.timeline.getIndexOfPeriod(next.uid);
        while (true) {
            indexOfPeriod = this.timeline.getNextPeriodIndex(indexOfPeriod, this.period, this.window, this.repeatMode, this.shuffleModeEnabled);
            while (next.getNext() != null && !next.f19778info.isLastInTimelinePeriod) {
                next = next.getNext();
            }
            MediaPeriodHolder next2 = next.getNext();
            if (indexOfPeriod == -1 || next2 == null || this.timeline.getIndexOfPeriod(next2.uid) != indexOfPeriod) {
                break;
            }
            next = next2;
        }
        boolean zRemoveAfter = removeAfter(next);
        next.f19778info = getUpdatedMediaPeriodInfo(next.f19778info);
        return !zRemoveAfter;
    }

    @Nullable
    public MediaPeriodHolder advancePlayingPeriod() {
        MediaPeriodHolder mediaPeriodHolder = this.playing;
        if (mediaPeriodHolder == null) {
            return null;
        }
        if (mediaPeriodHolder == this.reading) {
            this.reading = mediaPeriodHolder.getNext();
        }
        this.playing.release();
        int i = this.length - 1;
        this.length = i;
        if (i == 0) {
            this.loading = null;
            MediaPeriodHolder mediaPeriodHolder2 = this.playing;
            this.oldFrontPeriodUid = mediaPeriodHolder2.uid;
            this.oldFrontPeriodWindowSequenceNumber = mediaPeriodHolder2.f19778info.f11056id.windowSequenceNumber;
        }
        MediaPeriodHolder next = this.playing.getNext();
        this.playing = next;
        return next;
    }

    public MediaPeriodHolder advanceReadingPeriod() {
        MediaPeriodHolder mediaPeriodHolder = this.reading;
        Assertions.checkState((mediaPeriodHolder == null || mediaPeriodHolder.getNext() == null) ? false : true);
        MediaPeriodHolder next = this.reading.getNext();
        this.reading = next;
        return next;
    }

    public void clear(boolean z) {
        MediaPeriodHolder mediaPeriodHolder = this.playing;
        if (mediaPeriodHolder != null) {
            this.oldFrontPeriodUid = z ? mediaPeriodHolder.uid : null;
            this.oldFrontPeriodWindowSequenceNumber = mediaPeriodHolder.f19778info.f11056id.windowSequenceNumber;
            removeAfter(mediaPeriodHolder);
            mediaPeriodHolder.release();
        } else if (!z) {
            this.oldFrontPeriodUid = null;
        }
        this.playing = null;
        this.loading = null;
        this.reading = null;
        this.length = 0;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public MediaPeriodHolder enqueueNextMediaPeriodHolder(RendererCapabilities[] rendererCapabilitiesArr, TrackSelector trackSelector, Allocator allocator, MediaSource mediaSource, MediaPeriodInfo mediaPeriodInfo, TrackSelectorResult trackSelectorResult) {
        long rendererOffset;
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        if (mediaPeriodHolder != null) {
            rendererOffset = (mediaPeriodHolder.getRendererOffset() + this.loading.f19778info.durationUs) - mediaPeriodInfo.startPositionUs;
        } else if (mediaPeriodInfo.f11056id.isAd()) {
            rendererOffset = mediaPeriodInfo.contentPositionUs;
            if (rendererOffset == C3219C.TIME_UNSET) {
                rendererOffset = 0;
            }
        } else {
            rendererOffset = 0;
        }
        MediaPeriodHolder mediaPeriodHolder2 = new MediaPeriodHolder(rendererCapabilitiesArr, rendererOffset, trackSelector, allocator, mediaSource, mediaPeriodInfo, trackSelectorResult);
        MediaPeriodHolder mediaPeriodHolder3 = this.loading;
        if (mediaPeriodHolder3 != null) {
            mediaPeriodHolder3.setNext(mediaPeriodHolder2);
        } else {
            this.playing = mediaPeriodHolder2;
            this.reading = mediaPeriodHolder2;
        }
        this.oldFrontPeriodUid = null;
        this.loading = mediaPeriodHolder2;
        this.length++;
        return mediaPeriodHolder2;
    }

    @Nullable
    public MediaPeriodHolder getLoadingPeriod() {
        return this.loading;
    }

    @Nullable
    public MediaPeriodInfo getNextMediaPeriodInfo(long j, PlaybackInfo playbackInfo) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        return mediaPeriodHolder == null ? getFirstMediaPeriodInfo(playbackInfo) : getFollowingMediaPeriodInfo(mediaPeriodHolder, j);
    }

    @Nullable
    public MediaPeriodHolder getPlayingPeriod() {
        return this.playing;
    }

    @Nullable
    public MediaPeriodHolder getReadingPeriod() {
        return this.reading;
    }

    public MediaPeriodInfo getUpdatedMediaPeriodInfo(MediaPeriodInfo mediaPeriodInfo) {
        long durationUs;
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.f11056id;
        boolean zIsLastInPeriod = isLastInPeriod(mediaPeriodId);
        boolean zIsLastInTimeline = isLastInTimeline(mediaPeriodId, zIsLastInPeriod);
        this.timeline.getPeriodByUid(mediaPeriodInfo.f11056id.periodUid, this.period);
        if (mediaPeriodId.isAd()) {
            durationUs = this.period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
        } else {
            durationUs = mediaPeriodInfo.endPositionUs;
            if (durationUs == C3219C.TIME_UNSET || durationUs == Long.MIN_VALUE) {
                durationUs = this.period.getDurationUs();
            }
        }
        return new MediaPeriodInfo(mediaPeriodId, mediaPeriodInfo.startPositionUs, mediaPeriodInfo.contentPositionUs, mediaPeriodInfo.endPositionUs, durationUs, zIsLastInPeriod, zIsLastInTimeline);
    }

    public boolean isLoading(MediaPeriod mediaPeriod) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        return mediaPeriodHolder != null && mediaPeriodHolder.mediaPeriod == mediaPeriod;
    }

    public void reevaluateBuffer(long j) {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        if (mediaPeriodHolder != null) {
            mediaPeriodHolder.reevaluateBuffer(j);
        }
    }

    public boolean removeAfter(MediaPeriodHolder mediaPeriodHolder) {
        boolean z = false;
        Assertions.checkState(mediaPeriodHolder != null);
        this.loading = mediaPeriodHolder;
        while (mediaPeriodHolder.getNext() != null) {
            mediaPeriodHolder = mediaPeriodHolder.getNext();
            if (mediaPeriodHolder == this.reading) {
                this.reading = this.playing;
                z = true;
            }
            mediaPeriodHolder.release();
            this.length--;
        }
        this.loading.setNext(null);
        return z;
    }

    public MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(Object obj, long j) {
        return resolveMediaPeriodIdForAds(obj, j, resolvePeriodIndexToWindowSequenceNumber(obj));
    }

    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    public boolean shouldLoadNextMediaPeriod() {
        MediaPeriodHolder mediaPeriodHolder = this.loading;
        return mediaPeriodHolder == null || (!mediaPeriodHolder.f19778info.isFinal && mediaPeriodHolder.isFullyBuffered() && this.loading.f19778info.durationUs != C3219C.TIME_UNSET && this.length < 100);
    }

    public boolean updateQueuedPeriods(long j, long j2) {
        MediaPeriodInfo updatedMediaPeriodInfo;
        MediaPeriodHolder next = this.playing;
        MediaPeriodHolder mediaPeriodHolder = null;
        while (next != null) {
            MediaPeriodInfo mediaPeriodInfo = next.f19778info;
            if (mediaPeriodHolder != null) {
                MediaPeriodInfo followingMediaPeriodInfo = getFollowingMediaPeriodInfo(mediaPeriodHolder, j);
                if (followingMediaPeriodInfo != null && canKeepMediaPeriodHolder(mediaPeriodInfo, followingMediaPeriodInfo)) {
                    updatedMediaPeriodInfo = followingMediaPeriodInfo;
                }
                return !removeAfter(mediaPeriodHolder);
            }
            updatedMediaPeriodInfo = getUpdatedMediaPeriodInfo(mediaPeriodInfo);
            next.f19778info = updatedMediaPeriodInfo.copyWithContentPositionUs(mediaPeriodInfo.contentPositionUs);
            if (!areDurationsCompatible(mediaPeriodInfo.durationUs, updatedMediaPeriodInfo.durationUs)) {
                long j3 = updatedMediaPeriodInfo.durationUs;
                return (removeAfter(next) || (next == this.reading && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > ((j3 > C3219C.TIME_UNSET ? 1 : (j3 == C3219C.TIME_UNSET ? 0 : -1)) == 0 ? Long.MAX_VALUE : next.toRendererTime(j3)) ? 1 : (j2 == ((j3 > C3219C.TIME_UNSET ? 1 : (j3 == C3219C.TIME_UNSET ? 0 : -1)) == 0 ? Long.MAX_VALUE : next.toRendererTime(j3)) ? 0 : -1)) >= 0))) ? false : true;
            }
            mediaPeriodHolder = next;
            next = next.getNext();
        }
        return true;
    }

    public boolean updateRepeatMode(int i) {
        this.repeatMode = i;
        return updateForPlaybackModeChange();
    }

    public boolean updateShuffleModeEnabled(boolean z) {
        this.shuffleModeEnabled = z;
        return updateForPlaybackModeChange();
    }

    private MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(Object obj, long j, long j2) {
        this.timeline.getPeriodByUid(obj, this.period);
        int adGroupIndexForPositionUs = this.period.getAdGroupIndexForPositionUs(j);
        return adGroupIndexForPositionUs == -1 ? new MediaSource.MediaPeriodId(obj, j2, this.period.getAdGroupIndexAfterPositionUs(j)) : new MediaSource.MediaPeriodId(obj, adGroupIndexForPositionUs, this.period.getFirstAdIndexToPlay(adGroupIndexForPositionUs), j2);
    }
}
