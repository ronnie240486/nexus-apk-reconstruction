package com.google.android.exoplayer2.source;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class MaskingMediaSource extends CompositeMediaSource<Void> {
    private boolean hasStartedPreparing;
    private boolean isPrepared;
    private final MediaSource mediaSource;
    private MaskingTimeline timeline;

    @Nullable
    private MaskingMediaPeriod unpreparedMaskingMediaPeriod;

    @Nullable
    private MediaSourceEventListener.EventDispatcher unpreparedMaskingMediaPeriodEventDispatcher;
    private final boolean useLazyPreparation;
    private final Timeline.Window window = new Timeline.Window();
    private final Timeline.Period period = new Timeline.Period();

    public static final class DummyTimeline extends Timeline {

        @Nullable
        private final Object tag;

        public DummyTimeline(@Nullable Object obj) {
            this.tag = obj;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(Object obj) {
            return obj == MaskingTimeline.DUMMY_EXTERNAL_PERIOD_UID ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
            return period.set(0, MaskingTimeline.DUMMY_EXTERNAL_PERIOD_UID, 0, C3219C.TIME_UNSET, 0L);
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Object getUidOfPeriod(int i) {
            return MaskingTimeline.DUMMY_EXTERNAL_PERIOD_UID;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Timeline.Window getWindow(int i, Timeline.Window window, long j) {
            return window.set(Timeline.Window.SINGLE_WINDOW_UID, this.tag, null, C3219C.TIME_UNSET, C3219C.TIME_UNSET, false, true, false, 0L, C3219C.TIME_UNSET, 0, 0, 0L);
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
            return 1;
        }
    }

    public static final class MaskingTimeline extends ForwardingTimeline {
        public static final Object DUMMY_EXTERNAL_PERIOD_UID = new Object();
        private final Object replacedInternalPeriodUid;
        private final Object replacedInternalWindowUid;

        private MaskingTimeline(Timeline timeline, Object obj, Object obj2) {
            super(timeline);
            this.replacedInternalWindowUid = obj;
            this.replacedInternalPeriodUid = obj2;
        }

        public static MaskingTimeline createWithDummyTimeline(@Nullable Object obj) {
            return new MaskingTimeline(new DummyTimeline(obj), Timeline.Window.SINGLE_WINDOW_UID, DUMMY_EXTERNAL_PERIOD_UID);
        }

        public static MaskingTimeline createWithRealTimeline(Timeline timeline, Object obj, Object obj2) {
            return new MaskingTimeline(timeline, obj, obj2);
        }

        public MaskingTimeline cloneWithUpdatedTimeline(Timeline timeline) {
            return new MaskingTimeline(timeline, this.replacedInternalWindowUid, this.replacedInternalPeriodUid);
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(Object obj) {
            Timeline timeline = this.timeline;
            if (DUMMY_EXTERNAL_PERIOD_UID.equals(obj)) {
                obj = this.replacedInternalPeriodUid;
            }
            return timeline.getIndexOfPeriod(obj);
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
            this.timeline.getPeriod(i, period, z);
            if (Util.areEqual(period.uid, this.replacedInternalPeriodUid)) {
                period.uid = DUMMY_EXTERNAL_PERIOD_UID;
            }
            return period;
        }

        public Timeline getTimeline() {
            return this.timeline;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Object getUidOfPeriod(int i) {
            Object uidOfPeriod = this.timeline.getUidOfPeriod(i);
            return Util.areEqual(uidOfPeriod, this.replacedInternalPeriodUid) ? DUMMY_EXTERNAL_PERIOD_UID : uidOfPeriod;
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Window getWindow(int i, Timeline.Window window, long j) {
            this.timeline.getWindow(i, window, j);
            if (Util.areEqual(window.uid, this.replacedInternalWindowUid)) {
                window.uid = Timeline.Window.SINGLE_WINDOW_UID;
            }
            return window;
        }
    }

    public MaskingMediaSource(MediaSource mediaSource, boolean z) {
        this.mediaSource = mediaSource;
        this.useLazyPreparation = z;
        this.timeline = MaskingTimeline.createWithDummyTimeline(mediaSource.getTag());
    }

    private Object getExternalPeriodUid(Object obj) {
        return this.timeline.replacedInternalPeriodUid.equals(obj) ? MaskingTimeline.DUMMY_EXTERNAL_PERIOD_UID : obj;
    }

    private Object getInternalPeriodUid(Object obj) {
        return obj.equals(MaskingTimeline.DUMMY_EXTERNAL_PERIOD_UID) ? this.timeline.replacedInternalPeriodUid : obj;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MaskingMediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(this.mediaSource, mediaPeriodId, allocator, j);
        if (this.isPrepared) {
            maskingMediaPeriod.createPeriod(mediaPeriodId.copyWithPeriodUid(getInternalPeriodUid(mediaPeriodId.periodUid)));
        } else {
            this.unpreparedMaskingMediaPeriod = maskingMediaPeriod;
            MediaSourceEventListener.EventDispatcher eventDispatcherCreateEventDispatcher = createEventDispatcher(0, mediaPeriodId, 0L);
            this.unpreparedMaskingMediaPeriodEventDispatcher = eventDispatcherCreateEventDispatcher;
            eventDispatcherCreateEventDispatcher.mediaPeriodCreated();
            if (!this.hasStartedPreparing) {
                this.hasStartedPreparing = true;
                prepareChildSource(null, this.mediaSource);
            }
        }
        return maskingMediaPeriod;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    @Nullable
    public Object getTag() {
        return this.mediaSource.getTag();
    }

    public Timeline getTimeline() {
        return this.timeline;
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        if (this.useLazyPreparation) {
            return;
        }
        this.hasStartedPreparing = true;
        prepareChildSource(null, this.mediaSource);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((MaskingMediaPeriod) mediaPeriod).releasePeriod();
        if (mediaPeriod == this.unpreparedMaskingMediaPeriod) {
            ((MediaSourceEventListener.EventDispatcher) Assertions.checkNotNull(this.unpreparedMaskingMediaPeriodEventDispatcher)).mediaPeriodReleased();
            this.unpreparedMaskingMediaPeriodEventDispatcher = null;
            this.unpreparedMaskingMediaPeriod = null;
        }
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
        this.isPrepared = false;
        this.hasStartedPreparing = false;
        super.releaseSourceInternal();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public boolean shouldDispatchCreateOrReleaseEvent(MediaSource.MediaPeriodId mediaPeriodId) {
        MaskingMediaPeriod maskingMediaPeriod = this.unpreparedMaskingMediaPeriod;
        return maskingMediaPeriod == null || !mediaPeriodId.equals(maskingMediaPeriod.f11108id);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    @Nullable
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Void r1, MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId.copyWithPeriodUid(getExternalPeriodUid(mediaPeriodId.periodUid));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    /* JADX INFO: renamed from: onChildSourceInfoRefreshed, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void lambda$prepareChildSource$0(Void r12, MediaSource mediaSource, Timeline timeline) {
        long j;
        MaskingTimeline maskingTimelineCreateWithRealTimeline;
        if (!this.isPrepared) {
            if (timeline.isEmpty()) {
                maskingTimelineCreateWithRealTimeline = MaskingTimeline.createWithRealTimeline(timeline, Timeline.Window.SINGLE_WINDOW_UID, MaskingTimeline.DUMMY_EXTERNAL_PERIOD_UID);
            } else {
                timeline.getWindow(0, this.window);
                long defaultPositionUs = this.window.getDefaultPositionUs();
                MaskingMediaPeriod maskingMediaPeriod = this.unpreparedMaskingMediaPeriod;
                if (maskingMediaPeriod != null) {
                    long preparePositionUs = maskingMediaPeriod.getPreparePositionUs();
                    if (preparePositionUs != 0) {
                        j = preparePositionUs;
                    } else {
                        j = defaultPositionUs;
                    }
                } else {
                    j = defaultPositionUs;
                }
                Timeline.Window window = this.window;
                Object obj = window.uid;
                Pair<Object, Long> periodPosition = timeline.getPeriodPosition(window, this.period, 0, j);
                Object obj2 = periodPosition.first;
                long jLongValue = ((Long) periodPosition.second).longValue();
                this.timeline = MaskingTimeline.createWithRealTimeline(timeline, obj, obj2);
                MaskingMediaPeriod maskingMediaPeriod2 = this.unpreparedMaskingMediaPeriod;
                if (maskingMediaPeriod2 != null) {
                    maskingMediaPeriod2.overridePreparePositionUs(jLongValue);
                    MediaSource.MediaPeriodId mediaPeriodId = maskingMediaPeriod2.f11108id;
                    maskingMediaPeriod2.createPeriod(mediaPeriodId.copyWithPeriodUid(getInternalPeriodUid(mediaPeriodId.periodUid)));
                }
            }
            this.isPrepared = true;
            refreshSourceInfo(this.timeline);
        }
        maskingTimelineCreateWithRealTimeline = this.timeline.cloneWithUpdatedTimeline(timeline);
        this.timeline = maskingTimelineCreateWithRealTimeline;
        this.isPrepared = true;
        refreshSourceInfo(this.timeline);
    }
}
