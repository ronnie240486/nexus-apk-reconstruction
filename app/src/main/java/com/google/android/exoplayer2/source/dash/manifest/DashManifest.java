package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.offline.FilterableManifest;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class DashManifest implements FilterableManifest<DashManifest> {
    public final long availabilityStartTimeMs;
    public final long durationMs;
    public final boolean dynamic;

    @Nullable
    public final Uri location;
    public final long minBufferTimeMs;
    public final long minUpdatePeriodMs;
    private final List<Period> periods;

    @Nullable
    public final ProgramInformation programInformation;
    public final long publishTimeMs;
    public final long suggestedPresentationDelayMs;
    public final long timeShiftBufferDepthMs;

    @Nullable
    public final UtcTimingElement utcTiming;

    public DashManifest(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, @Nullable ProgramInformation programInformation, @Nullable UtcTimingElement utcTimingElement, @Nullable Uri uri, List<Period> list) {
        this.availabilityStartTimeMs = j;
        this.durationMs = j2;
        this.minBufferTimeMs = j3;
        this.dynamic = z;
        this.minUpdatePeriodMs = j4;
        this.timeShiftBufferDepthMs = j5;
        this.suggestedPresentationDelayMs = j6;
        this.publishTimeMs = j7;
        this.programInformation = programInformation;
        this.utcTiming = utcTimingElement;
        this.location = uri;
        this.periods = list == null ? Collections.emptyList() : list;
    }

    private static ArrayList<AdaptationSet> copyAdaptationSets(List<AdaptationSet> list, LinkedList<StreamKey> linkedList) {
        StreamKey streamKeyPoll = linkedList.poll();
        int i = streamKeyPoll.periodIndex;
        ArrayList<AdaptationSet> arrayList = new ArrayList<>();
        do {
            int i2 = streamKeyPoll.groupIndex;
            AdaptationSet adaptationSet = list.get(i2);
            List<Representation> list2 = adaptationSet.representations;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(streamKeyPoll.trackIndex));
                streamKeyPoll = linkedList.poll();
                if (streamKeyPoll.periodIndex != i) {
                    break;
                }
            } while (streamKeyPoll.groupIndex == i2);
            arrayList.add(new AdaptationSet(adaptationSet.f11120id, adaptationSet.type, arrayList2, adaptationSet.accessibilityDescriptors, adaptationSet.essentialProperties, adaptationSet.supplementalProperties));
        } while (streamKeyPoll.periodIndex == i);
        linkedList.addFirst(streamKeyPoll);
        return arrayList;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    public final DashManifest copy(List<StreamKey> list) {
        long j;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i = 0;
        while (true) {
            int periodCount = getPeriodCount();
            j = C3219C.TIME_UNSET;
            if (i >= periodCount) {
                break;
            }
            if (((StreamKey) linkedList.peek()).periodIndex != i) {
                long periodDurationMs = getPeriodDurationMs(i);
                if (periodDurationMs != C3219C.TIME_UNSET) {
                    j2 += periodDurationMs;
                }
            } else {
                Period period = getPeriod(i);
                arrayList.add(new Period(period.f11122id, period.startMs - j2, copyAdaptationSets(period.adaptationSets, linkedList), period.eventStreams));
            }
            i++;
        }
        long j3 = this.durationMs;
        if (j3 != C3219C.TIME_UNSET) {
            j = j3 - j2;
        }
        return new DashManifest(this.availabilityStartTimeMs, j, this.minBufferTimeMs, this.dynamic, this.minUpdatePeriodMs, this.timeShiftBufferDepthMs, this.suggestedPresentationDelayMs, this.publishTimeMs, this.programInformation, this.utcTiming, this.location, arrayList);
    }

    public final Period getPeriod(int i) {
        return this.periods.get(i);
    }

    public final int getPeriodCount() {
        return this.periods.size();
    }

    public final long getPeriodDurationMs(int i) {
        long j;
        if (i == this.periods.size() - 1) {
            j = this.durationMs;
            if (j == C3219C.TIME_UNSET) {
                return C3219C.TIME_UNSET;
            }
        } else {
            j = this.periods.get(i + 1).startMs;
        }
        return j - this.periods.get(i).startMs;
    }

    public final long getPeriodDurationUs(int i) {
        return C3219C.msToUs(getPeriodDurationMs(i));
    }

    @Deprecated
    public DashManifest(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, @Nullable UtcTimingElement utcTimingElement, @Nullable Uri uri, List<Period> list) {
        this(j, j2, j3, z, j4, j5, j6, j7, null, utcTimingElement, uri, list);
    }

    @Override // com.google.android.exoplayer2.offline.FilterableManifest
    public /* bridge */ /* synthetic */ DashManifest copy(List list) {
        return copy((List<StreamKey>) list);
    }
}
