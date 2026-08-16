package com.google.android.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.trackselection.FixedTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class FixedTrackSelection extends BaseTrackSelection {

    @Nullable
    private final Object data;
    private final int reason;

    @Deprecated
    public static final class Factory implements TrackSelection.Factory {

        @Nullable
        private final Object data;
        private final int reason;

        public Factory() {
            this.reason = 0;
            this.data = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ TrackSelection lambda$createTrackSelections$0(TrackSelection.Definition definition) {
            return new FixedTrackSelection(definition.group, definition.tracks[0], this.reason, this.data);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection.Factory
        public TrackSelection[] createTrackSelections(TrackSelection.Definition[] definitionArr, BandwidthMeter bandwidthMeter) {
            return TrackSelectionUtil.createTrackSelectionsForDefinitions(definitionArr, new TrackSelectionUtil.AdaptiveTrackSelectionFactory(this) { // from class: jl

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ FixedTrackSelection.Factory f14813a;

                /* JADX WARN: Invalid debug info offset */
                @Override // com.google.android.exoplayer2.trackselection.TrackSelectionUtil.AdaptiveTrackSelectionFactory
                public final TrackSelection createAdaptiveTrackSelection(TrackSelection.Definition definition) {
                    return null;
                }
            });
        }

        public Factory(int i, @Nullable Object obj) {
            this.reason = i;
            this.data = obj;
        }
    }

    public FixedTrackSelection(TrackGroup trackGroup, int i) {
        this(trackGroup, i, 0, null);
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public int getSelectedIndex() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    @Nullable
    public Object getSelectionData() {
        return this.data;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public int getSelectionReason() {
        return this.reason;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelection
    public void updateSelectedTrack(long j, long j2, long j3, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
    }

    public FixedTrackSelection(TrackGroup trackGroup, int i, int i2, @Nullable Object obj) {
        super(trackGroup, i);
        this.reason = i2;
        this.data = obj;
    }
}
