package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.trackselection.RandomTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class RandomTrackSelection extends BaseTrackSelection {
    private final Random random;
    private int selectedIndex;

    public static final class Factory implements TrackSelection.Factory {
        private final Random random;

        public Factory() {
            this.random = new Random();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ TrackSelection lambda$createTrackSelections$0(TrackSelection.Definition definition) {
            return new RandomTrackSelection(definition.group, definition.tracks, this.random);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection.Factory
        public TrackSelection[] createTrackSelections(TrackSelection.Definition[] definitionArr, BandwidthMeter bandwidthMeter) {
            return TrackSelectionUtil.createTrackSelectionsForDefinitions(definitionArr, new TrackSelectionUtil.AdaptiveTrackSelectionFactory(this) { // from class: uM

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ RandomTrackSelection.Factory f18963a;

                /* JADX WARN: Invalid debug info offset */
                @Override // com.google.android.exoplayer2.trackselection.TrackSelectionUtil.AdaptiveTrackSelectionFactory
                public final TrackSelection createAdaptiveTrackSelection(TrackSelection.Definition definition) {
                    return null;
                }
            });
        }

        public Factory(int i) {
            this.random = new Random(i);
        }
    }

    public RandomTrackSelection(TrackGroup trackGroup, int... iArr) {
        super(trackGroup, iArr);
        Random random = new Random();
        this.random = random;
        this.selectedIndex = random.nextInt(this.length);
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    @Nullable
    public Object getSelectionData() {
        return null;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public int getSelectionReason() {
        return 3;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public void updateSelectedTrack(long j, long j2, long j3, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = 0;
        for (int i2 = 0; i2 < this.length; i2++) {
            if (!isBlacklisted(i2, jElapsedRealtime)) {
                i++;
            }
        }
        this.selectedIndex = this.random.nextInt(i);
        if (i != this.length) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.length; i4++) {
                if (!isBlacklisted(i4, jElapsedRealtime)) {
                    int i5 = i3 + 1;
                    if (this.selectedIndex == i3) {
                        this.selectedIndex = i4;
                        return;
                    }
                    i3 = i5;
                }
            }
        }
    }

    public RandomTrackSelection(TrackGroup trackGroup, int[] iArr, long j) {
        this(trackGroup, iArr, new Random(j));
    }

    public RandomTrackSelection(TrackGroup trackGroup, int[] iArr, Random random) {
        super(trackGroup, iArr);
        this.random = random;
        this.selectedIndex = random.nextInt(this.length);
    }
}
