package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.mp4.Track;
import com.google.android.exoplayer2.extractor.mp4.TrackEncryptionBox;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.chunk.BaseMediaChunkIterator;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.ChunkExtractorWrapper;
import com.google.android.exoplayer2.source.chunk.ChunkHolder;
import com.google.android.exoplayer2.source.chunk.ContainerMediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.List;
import p000.C2935ap;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultSsChunkSource implements SsChunkSource {
    private int currentManifestChunkOffset;
    private final DataSource dataSource;
    private final ChunkExtractorWrapper[] extractorWrappers;
    private IOException fatalError;
    private SsManifest manifest;
    private final LoaderErrorThrower manifestLoaderErrorThrower;
    private final int streamElementIndex;
    private TrackSelection trackSelection;

    public static final class Factory implements SsChunkSource.Factory {
        private final DataSource.Factory dataSourceFactory;

        public Factory(DataSource.Factory factory) {
            this.dataSourceFactory = factory;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.SsChunkSource.Factory
        public SsChunkSource createChunkSource(LoaderErrorThrower loaderErrorThrower, SsManifest ssManifest, int i, TrackSelection trackSelection, @Nullable TransferListener transferListener) {
            DataSource dataSourceCreateDataSource = this.dataSourceFactory.createDataSource();
            if (transferListener != null) {
                dataSourceCreateDataSource.addTransferListener(transferListener);
            }
            return new DefaultSsChunkSource(loaderErrorThrower, ssManifest, i, trackSelection, dataSourceCreateDataSource);
        }
    }

    public static final class StreamElementIterator extends BaseMediaChunkIterator {
        private final SsManifest.StreamElement streamElement;
        private final int trackIndex;

        public StreamElementIterator(SsManifest.StreamElement streamElement, int i, int i2) {
            super(i2, streamElement.chunkCount - 1);
            this.streamElement = streamElement;
            this.trackIndex = i;
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public long getChunkEndTimeUs() {
            return this.streamElement.getChunkDurationUs((int) getCurrentIndex()) + getChunkStartTimeUs();
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public long getChunkStartTimeUs() {
            checkInBounds();
            return this.streamElement.getStartTimeUs((int) getCurrentIndex());
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public DataSpec getDataSpec() {
            checkInBounds();
            return new DataSpec(this.streamElement.buildRequestUri(this.trackIndex, (int) getCurrentIndex()));
        }
    }

    public DefaultSsChunkSource(LoaderErrorThrower loaderErrorThrower, SsManifest ssManifest, int i, TrackSelection trackSelection, DataSource dataSource) {
        this.manifestLoaderErrorThrower = loaderErrorThrower;
        this.manifest = ssManifest;
        this.streamElementIndex = i;
        this.trackSelection = trackSelection;
        this.dataSource = dataSource;
        SsManifest.StreamElement streamElement = ssManifest.streamElements[i];
        this.extractorWrappers = new ChunkExtractorWrapper[trackSelection.length()];
        for (int i2 = 0; i2 < this.extractorWrappers.length; i2++) {
            int indexInTrackGroup = trackSelection.getIndexInTrackGroup(i2);
            Format format = streamElement.formats[indexInTrackGroup];
            TrackEncryptionBox[] trackEncryptionBoxArr = format.drmInitData != null ? ssManifest.protectionElement.trackEncryptionBoxes : null;
            int i3 = streamElement.type;
            this.extractorWrappers[i2] = new ChunkExtractorWrapper(new FragmentedMp4Extractor(3, null, new Track(indexInTrackGroup, i3, streamElement.timescale, C3219C.TIME_UNSET, ssManifest.durationUs, format, 0, trackEncryptionBoxArr, i3 == 2 ? 4 : 0, null, null)), streamElement.type, format);
        }
    }

    private static MediaChunk newMediaChunk(Format format, DataSource dataSource, Uri uri, String str, int i, long j, long j2, long j3, int i2, Object obj, ChunkExtractorWrapper chunkExtractorWrapper) {
        return new ContainerMediaChunk(dataSource, new DataSpec(uri, 0L, -1L, str), format, i2, obj, j, j2, j3, C3219C.TIME_UNSET, i, 1, j, chunkExtractorWrapper);
    }

    private long resolveTimeToLiveEdgeUs(long j) {
        SsManifest ssManifest = this.manifest;
        if (!ssManifest.isLive) {
            return C3219C.TIME_UNSET;
        }
        SsManifest.StreamElement streamElement = ssManifest.streamElements[this.streamElementIndex];
        int i = streamElement.chunkCount - 1;
        return (streamElement.getChunkDurationUs(i) + streamElement.getStartTimeUs(i)) - j;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        SsManifest.StreamElement streamElement = this.manifest.streamElements[this.streamElementIndex];
        int chunkIndex = streamElement.getChunkIndex(j);
        long startTimeUs = streamElement.getStartTimeUs(chunkIndex);
        return Util.resolveSeekPositionUs(j, seekParameters, startTimeUs, (startTimeUs >= j || chunkIndex >= streamElement.chunkCount + (-1)) ? startTimeUs : streamElement.getStartTimeUs(chunkIndex + 1));
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public final void getNextChunk(long j, long j2, List<? extends MediaChunk> list, ChunkHolder chunkHolder) {
        int nextChunkIndex;
        long j3 = j2;
        if (this.fatalError != null) {
            return;
        }
        SsManifest ssManifest = this.manifest;
        SsManifest.StreamElement streamElement = ssManifest.streamElements[this.streamElementIndex];
        if (streamElement.chunkCount == 0) {
            chunkHolder.endOfStream = !ssManifest.isLive;
            return;
        }
        if (list.isEmpty()) {
            nextChunkIndex = streamElement.getChunkIndex(j3);
        } else {
            nextChunkIndex = (int) (((MediaChunk) C2935ap.m14540a(list, 1)).getNextChunkIndex() - ((long) this.currentManifestChunkOffset));
            if (nextChunkIndex < 0) {
                this.fatalError = new BehindLiveWindowException();
                return;
            }
        }
        if (nextChunkIndex >= streamElement.chunkCount) {
            chunkHolder.endOfStream = !this.manifest.isLive;
            return;
        }
        long j4 = j3 - j;
        long jResolveTimeToLiveEdgeUs = resolveTimeToLiveEdgeUs(j);
        int length = this.trackSelection.length();
        MediaChunkIterator[] mediaChunkIteratorArr = new MediaChunkIterator[length];
        for (int i = 0; i < length; i++) {
            mediaChunkIteratorArr[i] = new StreamElementIterator(streamElement, this.trackSelection.getIndexInTrackGroup(i), nextChunkIndex);
        }
        this.trackSelection.updateSelectedTrack(j, j4, jResolveTimeToLiveEdgeUs, list, mediaChunkIteratorArr);
        long startTimeUs = streamElement.getStartTimeUs(nextChunkIndex);
        long chunkDurationUs = streamElement.getChunkDurationUs(nextChunkIndex) + startTimeUs;
        if (!list.isEmpty()) {
            j3 = C3219C.TIME_UNSET;
        }
        long j5 = j3;
        int i2 = nextChunkIndex + this.currentManifestChunkOffset;
        int selectedIndex = this.trackSelection.getSelectedIndex();
        chunkHolder.chunk = newMediaChunk(this.trackSelection.getSelectedFormat(), this.dataSource, streamElement.buildRequestUri(this.trackSelection.getIndexInTrackGroup(selectedIndex), nextChunkIndex), null, i2, startTimeUs, chunkDurationUs, j5, this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), this.extractorWrappers[selectedIndex]);
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public int getPreferredQueueSize(long j, List<? extends MediaChunk> list) {
        return (this.fatalError != null || this.trackSelection.length() < 2) ? list.size() : this.trackSelection.evaluateQueueSize(j, list);
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public void maybeThrowError() throws IOException {
        IOException iOException = this.fatalError;
        if (iOException != null) {
            throw iOException;
        }
        this.manifestLoaderErrorThrower.maybeThrowError();
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public void onChunkLoadCompleted(Chunk chunk) {
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public boolean onChunkLoadError(Chunk chunk, boolean z, Exception exc, long j) {
        if (z && j != C3219C.TIME_UNSET) {
            TrackSelection trackSelection = this.trackSelection;
            if (trackSelection.blacklist(trackSelection.indexOf(chunk.trackFormat), j)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    @Override // com.google.android.exoplayer2.source.smoothstreaming.SsChunkSource
    public void updateManifest(SsManifest ssManifest) {
        int chunkIndex;
        SsManifest.StreamElement[] streamElementArr = this.manifest.streamElements;
        int i = this.streamElementIndex;
        SsManifest.StreamElement streamElement = streamElementArr[i];
        int i2 = streamElement.chunkCount;
        SsManifest.StreamElement streamElement2 = ssManifest.streamElements[i];
        if (i2 == 0 || streamElement2.chunkCount == 0) {
            chunkIndex = this.currentManifestChunkOffset + i2;
        } else {
            int i3 = i2 - 1;
            long chunkDurationUs = streamElement.getChunkDurationUs(i3) + streamElement.getStartTimeUs(i3);
            long startTimeUs = streamElement2.getStartTimeUs(0);
            if (chunkDurationUs <= startTimeUs) {
                chunkIndex = this.currentManifestChunkOffset + i2;
            } else {
                chunkIndex = streamElement.getChunkIndex(startTimeUs) + this.currentManifestChunkOffset;
            }
        }
        this.currentManifestChunkOffset = chunkIndex;
        this.manifest = ssManifest;
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.SsChunkSource
    public void updateTrackSelection(TrackSelection trackSelection) {
        this.trackSelection = trackSelection;
    }
}
