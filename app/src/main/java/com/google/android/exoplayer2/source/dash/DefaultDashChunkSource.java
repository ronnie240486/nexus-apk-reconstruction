package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.rawcc.RawCcExtractor;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.chunk.BaseMediaChunkIterator;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.ChunkExtractorWrapper;
import com.google.android.exoplayer2.source.chunk.ChunkHolder;
import com.google.android.exoplayer2.source.chunk.ContainerMediaChunk;
import com.google.android.exoplayer2.source.chunk.InitializationChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.source.chunk.SingleSampleMediaChunk;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p000.C2935ap;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultDashChunkSource implements DashChunkSource {
    private final int[] adaptationSetIndices;
    private final DataSource dataSource;
    private final long elapsedRealtimeOffsetMs;
    private IOException fatalError;
    private long liveEdgeTimeUs;
    private DashManifest manifest;
    private final LoaderErrorThrower manifestLoaderErrorThrower;
    private final int maxSegmentsPerLoad;
    private boolean missingLastSegment;
    private int periodIndex;

    @Nullable
    private final PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler;
    protected final RepresentationHolder[] representationHolders;
    private TrackSelection trackSelection;
    private final int trackType;

    public static final class Factory implements DashChunkSource.Factory {
        private final DataSource.Factory dataSourceFactory;
        private final int maxSegmentsPerLoad;

        public Factory(DataSource.Factory factory) {
            this(factory, 1);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashChunkSource.Factory
        public DashChunkSource createDashChunkSource(LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, int i, int[] iArr, TrackSelection trackSelection, int i2, long j, boolean z, List<Format> list, @Nullable PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler, @Nullable TransferListener transferListener) {
            DataSource dataSourceCreateDataSource = this.dataSourceFactory.createDataSource();
            if (transferListener != null) {
                dataSourceCreateDataSource.addTransferListener(transferListener);
            }
            return new DefaultDashChunkSource(loaderErrorThrower, dashManifest, i, iArr, trackSelection, i2, dataSourceCreateDataSource, j, this.maxSegmentsPerLoad, z, list, playerTrackEmsgHandler);
        }

        public Factory(DataSource.Factory factory, int i) {
            this.dataSourceFactory = factory;
            this.maxSegmentsPerLoad = i;
        }
    }

    public static final class RepresentationHolder {

        @Nullable
        final ChunkExtractorWrapper extractorWrapper;
        private final long periodDurationUs;
        public final Representation representation;

        @Nullable
        public final DashSegmentIndex segmentIndex;
        private final long segmentNumShift;

        public RepresentationHolder(long j, int i, Representation representation, boolean z, List<Format> list, @Nullable TrackOutput trackOutput) {
            this(j, representation, createExtractorWrapper(i, representation, z, list, trackOutput), 0L, representation.getIndex());
        }

        @Nullable
        private static ChunkExtractorWrapper createExtractorWrapper(int i, Representation representation, boolean z, List<Format> list, @Nullable TrackOutput trackOutput) {
            Extractor fragmentedMp4Extractor;
            String str = representation.format.containerMimeType;
            if (mimeTypeIsRawText(str)) {
                return null;
            }
            if (MimeTypes.APPLICATION_RAWCC.equals(str)) {
                fragmentedMp4Extractor = new RawCcExtractor(representation.format);
            } else if (mimeTypeIsWebm(str)) {
                fragmentedMp4Extractor = new MatroskaExtractor(1);
            } else {
                fragmentedMp4Extractor = new FragmentedMp4Extractor(z ? 4 : 0, null, null, list, trackOutput);
            }
            return new ChunkExtractorWrapper(fragmentedMp4Extractor, i, representation.format);
        }

        private static boolean mimeTypeIsRawText(String str) {
            return MimeTypes.isText(str) || MimeTypes.APPLICATION_TTML.equals(str);
        }

        private static boolean mimeTypeIsWebm(String str) {
            return str.startsWith(MimeTypes.VIDEO_WEBM) || str.startsWith(MimeTypes.AUDIO_WEBM) || str.startsWith(MimeTypes.APPLICATION_WEBM);
        }

        @CheckResult
        public RepresentationHolder copyWithNewRepresentation(long j, Representation representation) throws BehindLiveWindowException {
            int segmentCount;
            long segmentNum;
            DashSegmentIndex index = this.representation.getIndex();
            DashSegmentIndex index2 = representation.getIndex();
            if (index == null) {
                return new RepresentationHolder(j, representation, this.extractorWrapper, this.segmentNumShift, index);
            }
            if (index.isExplicit() && (segmentCount = index.getSegmentCount(j)) != 0) {
                long firstSegmentNum = index.getFirstSegmentNum();
                long timeUs = index.getTimeUs(firstSegmentNum);
                long j2 = ((long) segmentCount) + firstSegmentNum;
                long j3 = j2 - 1;
                long durationUs = index.getDurationUs(j3, j) + index.getTimeUs(j3);
                long firstSegmentNum2 = index2.getFirstSegmentNum();
                long timeUs2 = index2.getTimeUs(firstSegmentNum2);
                long j4 = this.segmentNumShift;
                if (durationUs == timeUs2) {
                    segmentNum = (j2 - firstSegmentNum2) + j4;
                } else {
                    if (durationUs < timeUs2) {
                        throw new BehindLiveWindowException();
                    }
                    segmentNum = timeUs2 < timeUs ? j4 - (index2.getSegmentNum(timeUs, j) - firstSegmentNum) : (index.getSegmentNum(timeUs2, j) - firstSegmentNum2) + j4;
                }
                return new RepresentationHolder(j, representation, this.extractorWrapper, segmentNum, index2);
            }
            return new RepresentationHolder(j, representation, this.extractorWrapper, this.segmentNumShift, index2);
        }

        @CheckResult
        public RepresentationHolder copyWithNewSegmentIndex(DashSegmentIndex dashSegmentIndex) {
            return new RepresentationHolder(this.periodDurationUs, this.representation, this.extractorWrapper, this.segmentNumShift, dashSegmentIndex);
        }

        public long getFirstAvailableSegmentNum(DashManifest dashManifest, int i, long j) {
            if (getSegmentCount() != -1 || dashManifest.timeShiftBufferDepthMs == C3219C.TIME_UNSET) {
                return getFirstSegmentNum();
            }
            return Math.max(getFirstSegmentNum(), getSegmentNum(((j - C3219C.msToUs(dashManifest.availabilityStartTimeMs)) - C3219C.msToUs(dashManifest.getPeriod(i).startMs)) - C3219C.msToUs(dashManifest.timeShiftBufferDepthMs)));
        }

        public long getFirstSegmentNum() {
            return this.segmentIndex.getFirstSegmentNum() + this.segmentNumShift;
        }

        public long getLastAvailableSegmentNum(DashManifest dashManifest, int i, long j) {
            int segmentCount = getSegmentCount();
            return (segmentCount == -1 ? getSegmentNum((j - C3219C.msToUs(dashManifest.availabilityStartTimeMs)) - C3219C.msToUs(dashManifest.getPeriod(i).startMs)) : getFirstSegmentNum() + ((long) segmentCount)) - 1;
        }

        public int getSegmentCount() {
            return this.segmentIndex.getSegmentCount(this.periodDurationUs);
        }

        public long getSegmentEndTimeUs(long j) {
            return this.segmentIndex.getDurationUs(j - this.segmentNumShift, this.periodDurationUs) + getSegmentStartTimeUs(j);
        }

        public long getSegmentNum(long j) {
            return this.segmentIndex.getSegmentNum(j, this.periodDurationUs) + this.segmentNumShift;
        }

        public long getSegmentStartTimeUs(long j) {
            return this.segmentIndex.getTimeUs(j - this.segmentNumShift);
        }

        public RangedUri getSegmentUrl(long j) {
            return this.segmentIndex.getSegmentUrl(j - this.segmentNumShift);
        }

        private RepresentationHolder(long j, Representation representation, @Nullable ChunkExtractorWrapper chunkExtractorWrapper, long j2, @Nullable DashSegmentIndex dashSegmentIndex) {
            this.periodDurationUs = j;
            this.representation = representation;
            this.segmentNumShift = j2;
            this.extractorWrapper = chunkExtractorWrapper;
            this.segmentIndex = dashSegmentIndex;
        }
    }

    public static final class RepresentationSegmentIterator extends BaseMediaChunkIterator {
        private final RepresentationHolder representationHolder;

        public RepresentationSegmentIterator(RepresentationHolder representationHolder, long j, long j2) {
            super(j, j2);
            this.representationHolder = representationHolder;
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public long getChunkEndTimeUs() {
            checkInBounds();
            return this.representationHolder.getSegmentEndTimeUs(getCurrentIndex());
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public long getChunkStartTimeUs() {
            checkInBounds();
            return this.representationHolder.getSegmentStartTimeUs(getCurrentIndex());
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public DataSpec getDataSpec() {
            checkInBounds();
            RepresentationHolder representationHolder = this.representationHolder;
            Representation representation = representationHolder.representation;
            RangedUri segmentUrl = representationHolder.getSegmentUrl(getCurrentIndex());
            return new DataSpec(segmentUrl.resolveUri(representation.baseUrl), segmentUrl.start, segmentUrl.length, representation.getCacheKey());
        }
    }

    public DefaultDashChunkSource(LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, int i, int[] iArr, TrackSelection trackSelection, int i2, DataSource dataSource, long j, int i3, boolean z, List<Format> list, @Nullable PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler) {
        this.manifestLoaderErrorThrower = loaderErrorThrower;
        this.manifest = dashManifest;
        this.adaptationSetIndices = iArr;
        this.trackSelection = trackSelection;
        this.trackType = i2;
        this.dataSource = dataSource;
        this.periodIndex = i;
        this.elapsedRealtimeOffsetMs = j;
        this.maxSegmentsPerLoad = i3;
        this.playerTrackEmsgHandler = playerTrackEmsgHandler;
        long periodDurationUs = dashManifest.getPeriodDurationUs(i);
        this.liveEdgeTimeUs = C3219C.TIME_UNSET;
        ArrayList<Representation> representations = getRepresentations();
        this.representationHolders = new RepresentationHolder[trackSelection.length()];
        for (int i4 = 0; i4 < this.representationHolders.length; i4++) {
            this.representationHolders[i4] = new RepresentationHolder(periodDurationUs, i2, representations.get(trackSelection.getIndexInTrackGroup(i4)), z, list, playerTrackEmsgHandler);
        }
    }

    private long getNowUnixTimeUs() {
        return (this.elapsedRealtimeOffsetMs != 0 ? SystemClock.elapsedRealtime() + this.elapsedRealtimeOffsetMs : System.currentTimeMillis()) * 1000;
    }

    private ArrayList<Representation> getRepresentations() {
        List<AdaptationSet> list = this.manifest.getPeriod(this.periodIndex).adaptationSets;
        ArrayList<Representation> arrayList = new ArrayList<>();
        for (int i : this.adaptationSetIndices) {
            arrayList.addAll(list.get(i).representations);
        }
        return arrayList;
    }

    private long getSegmentNum(RepresentationHolder representationHolder, @Nullable MediaChunk mediaChunk, long j, long j2, long j3) {
        return mediaChunk != null ? mediaChunk.getNextChunkIndex() : Util.constrainValue(representationHolder.getSegmentNum(j), j2, j3);
    }

    private long resolveTimeToLiveEdgeUs(long j) {
        if (!this.manifest.dynamic) {
            return C3219C.TIME_UNSET;
        }
        long j2 = this.liveEdgeTimeUs;
        return j2 != C3219C.TIME_UNSET ? j2 - j : C3219C.TIME_UNSET;
    }

    private void updateLiveEdgeTimeUs(RepresentationHolder representationHolder, long j) {
        this.liveEdgeTimeUs = this.manifest.dynamic ? representationHolder.getSegmentEndTimeUs(j) : C3219C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        for (RepresentationHolder representationHolder : this.representationHolders) {
            if (representationHolder.segmentIndex != null) {
                long segmentNum = representationHolder.getSegmentNum(j);
                long segmentStartTimeUs = representationHolder.getSegmentStartTimeUs(segmentNum);
                return Util.resolveSeekPositionUs(j, seekParameters, segmentStartTimeUs, (segmentStartTimeUs >= j || segmentNum >= ((long) (representationHolder.getSegmentCount() + (-1)))) ? segmentStartTimeUs : representationHolder.getSegmentStartTimeUs(segmentNum + 1));
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public void getNextChunk(long j, long j2, List<? extends MediaChunk> list, ChunkHolder chunkHolder) {
        int i;
        int i2;
        MediaChunkIterator[] mediaChunkIteratorArr;
        long j3;
        if (this.fatalError != null) {
            return;
        }
        long j4 = j2 - j;
        long jResolveTimeToLiveEdgeUs = resolveTimeToLiveEdgeUs(j);
        long jMsToUs = C3219C.msToUs(this.manifest.getPeriod(this.periodIndex).startMs) + C3219C.msToUs(this.manifest.availabilityStartTimeMs) + j2;
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = this.playerTrackEmsgHandler;
        if (playerTrackEmsgHandler == null || !playerTrackEmsgHandler.maybeRefreshManifestBeforeLoadingNextChunk(jMsToUs)) {
            long nowUnixTimeUs = getNowUnixTimeUs();
            MediaChunk mediaChunk = list.isEmpty() ? null : (MediaChunk) C2935ap.m14540a(list, 1);
            int length = this.trackSelection.length();
            MediaChunkIterator[] mediaChunkIteratorArr2 = new MediaChunkIterator[length];
            int i3 = 0;
            while (i3 < length) {
                RepresentationHolder representationHolder = this.representationHolders[i3];
                if (representationHolder.segmentIndex == null) {
                    mediaChunkIteratorArr2[i3] = MediaChunkIterator.EMPTY;
                    i = i3;
                    i2 = length;
                    mediaChunkIteratorArr = mediaChunkIteratorArr2;
                    j3 = nowUnixTimeUs;
                } else {
                    long firstAvailableSegmentNum = representationHolder.getFirstAvailableSegmentNum(this.manifest, this.periodIndex, nowUnixTimeUs);
                    long lastAvailableSegmentNum = representationHolder.getLastAvailableSegmentNum(this.manifest, this.periodIndex, nowUnixTimeUs);
                    i = i3;
                    i2 = length;
                    mediaChunkIteratorArr = mediaChunkIteratorArr2;
                    j3 = nowUnixTimeUs;
                    long segmentNum = getSegmentNum(representationHolder, mediaChunk, j2, firstAvailableSegmentNum, lastAvailableSegmentNum);
                    if (segmentNum < firstAvailableSegmentNum) {
                        mediaChunkIteratorArr[i] = MediaChunkIterator.EMPTY;
                    } else {
                        mediaChunkIteratorArr[i] = new RepresentationSegmentIterator(representationHolder, segmentNum, lastAvailableSegmentNum);
                    }
                }
                i3 = i + 1;
                length = i2;
                mediaChunkIteratorArr2 = mediaChunkIteratorArr;
                nowUnixTimeUs = j3;
            }
            long j5 = nowUnixTimeUs;
            this.trackSelection.updateSelectedTrack(j, j4, jResolveTimeToLiveEdgeUs, list, mediaChunkIteratorArr2);
            RepresentationHolder representationHolder2 = this.representationHolders[this.trackSelection.getSelectedIndex()];
            ChunkExtractorWrapper chunkExtractorWrapper = representationHolder2.extractorWrapper;
            if (chunkExtractorWrapper != null) {
                Representation representation = representationHolder2.representation;
                RangedUri initializationUri = chunkExtractorWrapper.getSampleFormats() == null ? representation.getInitializationUri() : null;
                RangedUri indexUri = representationHolder2.segmentIndex == null ? representation.getIndexUri() : null;
                if (initializationUri != null || indexUri != null) {
                    chunkHolder.chunk = newInitializationChunk(representationHolder2, this.dataSource, this.trackSelection.getSelectedFormat(), this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), initializationUri, indexUri);
                    return;
                }
            }
            long j6 = representationHolder2.periodDurationUs;
            long j7 = C3219C.TIME_UNSET;
            boolean z = j6 != C3219C.TIME_UNSET;
            if (representationHolder2.getSegmentCount() == 0) {
                chunkHolder.endOfStream = z;
                return;
            }
            long firstAvailableSegmentNum2 = representationHolder2.getFirstAvailableSegmentNum(this.manifest, this.periodIndex, j5);
            long lastAvailableSegmentNum2 = representationHolder2.getLastAvailableSegmentNum(this.manifest, this.periodIndex, j5);
            updateLiveEdgeTimeUs(representationHolder2, lastAvailableSegmentNum2);
            long segmentNum2 = getSegmentNum(representationHolder2, mediaChunk, j2, firstAvailableSegmentNum2, lastAvailableSegmentNum2);
            if (segmentNum2 < firstAvailableSegmentNum2) {
                this.fatalError = new BehindLiveWindowException();
                return;
            }
            if (segmentNum2 > lastAvailableSegmentNum2 || (this.missingLastSegment && segmentNum2 >= lastAvailableSegmentNum2)) {
                chunkHolder.endOfStream = z;
                return;
            }
            if (z && representationHolder2.getSegmentStartTimeUs(segmentNum2) >= j6) {
                chunkHolder.endOfStream = true;
                return;
            }
            int iMin = (int) Math.min(this.maxSegmentsPerLoad, (lastAvailableSegmentNum2 - segmentNum2) + 1);
            if (j6 != C3219C.TIME_UNSET) {
                while (iMin > 1 && representationHolder2.getSegmentStartTimeUs((((long) iMin) + segmentNum2) - 1) >= j6) {
                    iMin--;
                }
            }
            int i4 = iMin;
            if (list.isEmpty()) {
                j7 = j2;
            }
            chunkHolder.chunk = newMediaChunk(representationHolder2, this.dataSource, this.trackType, this.trackSelection.getSelectedFormat(), this.trackSelection.getSelectionReason(), this.trackSelection.getSelectionData(), segmentNum2, i4, j7);
        }
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

    public Chunk newInitializationChunk(RepresentationHolder representationHolder, DataSource dataSource, Format format, int i, Object obj, RangedUri rangedUri, RangedUri rangedUri2) {
        String str = representationHolder.representation.baseUrl;
        if (rangedUri == null || (rangedUri2 = rangedUri.attemptMerge(rangedUri2, str)) != null) {
            rangedUri = rangedUri2;
        }
        return new InitializationChunk(dataSource, new DataSpec(rangedUri.resolveUri(str), rangedUri.start, rangedUri.length, representationHolder.representation.getCacheKey()), format, i, obj, representationHolder.extractorWrapper);
    }

    public Chunk newMediaChunk(RepresentationHolder representationHolder, DataSource dataSource, int i, Format format, int i2, Object obj, long j, int i3, long j2) {
        Representation representation = representationHolder.representation;
        long segmentStartTimeUs = representationHolder.getSegmentStartTimeUs(j);
        RangedUri segmentUrl = representationHolder.getSegmentUrl(j);
        String str = representation.baseUrl;
        if (representationHolder.extractorWrapper == null) {
            return new SingleSampleMediaChunk(dataSource, new DataSpec(segmentUrl.resolveUri(str), segmentUrl.start, segmentUrl.length, representation.getCacheKey()), format, i2, obj, segmentStartTimeUs, representationHolder.getSegmentEndTimeUs(j), j, i, format);
        }
        int i4 = 1;
        int i5 = 1;
        while (i4 < i3) {
            RangedUri rangedUriAttemptMerge = segmentUrl.attemptMerge(representationHolder.getSegmentUrl(((long) i4) + j), str);
            if (rangedUriAttemptMerge == null) {
                break;
            }
            i5++;
            i4++;
            segmentUrl = rangedUriAttemptMerge;
        }
        long segmentEndTimeUs = representationHolder.getSegmentEndTimeUs((((long) i5) + j) - 1);
        long j3 = representationHolder.periodDurationUs;
        return new ContainerMediaChunk(dataSource, new DataSpec(segmentUrl.resolveUri(str), segmentUrl.start, segmentUrl.length, representation.getCacheKey()), format, i2, obj, segmentStartTimeUs, segmentEndTimeUs, j2, (j3 == C3219C.TIME_UNSET || j3 > segmentEndTimeUs) ? -9223372036854775807L : j3, j, i5, -representation.presentationTimeOffsetUs, representationHolder.extractorWrapper);
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public void onChunkLoadCompleted(Chunk chunk) {
        SeekMap seekMap;
        if (chunk instanceof InitializationChunk) {
            int iIndexOf = this.trackSelection.indexOf(((InitializationChunk) chunk).trackFormat);
            RepresentationHolder representationHolder = this.representationHolders[iIndexOf];
            if (representationHolder.segmentIndex == null && (seekMap = representationHolder.extractorWrapper.getSeekMap()) != null) {
                this.representationHolders[iIndexOf] = representationHolder.copyWithNewSegmentIndex(new DashWrappingSegmentIndex((ChunkIndex) seekMap, representationHolder.representation.presentationTimeOffsetUs));
            }
        }
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = this.playerTrackEmsgHandler;
        if (playerTrackEmsgHandler != null) {
            playerTrackEmsgHandler.onChunkLoadCompleted(chunk);
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public boolean onChunkLoadError(Chunk chunk, boolean z, Exception exc, long j) {
        RepresentationHolder representationHolder;
        int segmentCount;
        if (!z) {
            return false;
        }
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = this.playerTrackEmsgHandler;
        if (playerTrackEmsgHandler != null && playerTrackEmsgHandler.maybeRefreshManifestOnLoadingError(chunk)) {
            return true;
        }
        if (!this.manifest.dynamic && (chunk instanceof MediaChunk) && (exc instanceof HttpDataSource.InvalidResponseCodeException) && ((HttpDataSource.InvalidResponseCodeException) exc).responseCode == 404 && (segmentCount = (representationHolder = this.representationHolders[this.trackSelection.indexOf(chunk.trackFormat)]).getSegmentCount()) != -1 && segmentCount != 0) {
            if (((MediaChunk) chunk).getNextChunkIndex() > (representationHolder.getFirstSegmentNum() + ((long) segmentCount)) - 1) {
                this.missingLastSegment = true;
                return true;
            }
        }
        if (j == C3219C.TIME_UNSET) {
            return false;
        }
        TrackSelection trackSelection = this.trackSelection;
        return trackSelection.blacklist(trackSelection.indexOf(chunk.trackFormat), j);
    }

    @Override // com.google.android.exoplayer2.source.dash.DashChunkSource
    public void updateManifest(DashManifest dashManifest, int i) {
        try {
            this.manifest = dashManifest;
            this.periodIndex = i;
            long periodDurationUs = dashManifest.getPeriodDurationUs(i);
            ArrayList<Representation> representations = getRepresentations();
            for (int i2 = 0; i2 < this.representationHolders.length; i2++) {
                Representation representation = representations.get(this.trackSelection.getIndexInTrackGroup(i2));
                RepresentationHolder[] representationHolderArr = this.representationHolders;
                representationHolderArr[i2] = representationHolderArr[i2].copyWithNewRepresentation(periodDurationUs, representation);
            }
        } catch (BehindLiveWindowException e) {
            this.fatalError = e;
        }
    }

    @Override // com.google.android.exoplayer2.source.dash.DashChunkSource
    public void updateTrackSelection(TrackSelection trackSelection) {
        this.trackSelection = trackSelection;
    }
}
