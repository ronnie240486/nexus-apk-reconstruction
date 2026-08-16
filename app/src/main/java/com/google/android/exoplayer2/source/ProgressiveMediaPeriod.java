package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ConditionVariable;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.C0786MA;
import p000.C4205dB;

/* JADX INFO: loaded from: classes2.dex */
final class ProgressiveMediaPeriod implements MediaPeriod, ExtractorOutput, Loader.Callback<ExtractingLoadable>, Loader.ReleaseCallback, SampleQueue.UpstreamFormatChangedListener {
    private static final long DEFAULT_LAST_SAMPLE_DURATION_US = 10000;
    private final Allocator allocator;

    @Nullable
    private MediaPeriod.Callback callback;
    private final long continueLoadingCheckIntervalBytes;

    @Nullable
    private final String customCacheKey;
    private final DataSource dataSource;
    private final DrmSessionManager<?> drmSessionManager;
    private int enabledTrackCount;
    private final MediaSourceEventListener.EventDispatcher eventDispatcher;
    private int extractedSamplesCountAtStartOfLoad;
    private final ExtractorHolder extractorHolder;
    private boolean haveAudioVideoTracks;

    @Nullable
    private IcyHeaders icyHeaders;
    private boolean isLive;
    private long lastSeekPositionUs;
    private final Listener listener;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private boolean loadingFinished;
    private boolean notifiedReadingStarted;
    private boolean notifyDiscontinuity;
    private boolean pendingDeferredRetry;
    private boolean prepared;

    @Nullable
    private PreparedState preparedState;
    private boolean released;
    private boolean sampleQueuesBuilt;

    @Nullable
    private SeekMap seekMap;
    private boolean seenFirstTrackSelection;
    private final Uri uri;
    private static final Map<String, String> ICY_METADATA_HEADERS = createIcyMetadataHeaders();
    private static final Format ICY_FORMAT = Format.createSampleFormat("icy", MimeTypes.APPLICATION_ICY, Long.MAX_VALUE);
    private final Loader loader = new Loader("Loader:ProgressiveMediaPeriod");
    private final ConditionVariable loadCondition = new ConditionVariable();
    private final Runnable maybeFinishPrepareRunnable = new Runnable() { // from class: com.google.android.exoplayer2.source.a
        @Override // java.lang.Runnable
        public final void run() {
            this.f11110a.maybeFinishPrepare();
        }
    };
    private final Runnable onContinueLoadingRequestedRunnable = new Runnable() { // from class: com.google.android.exoplayer2.source.b
        @Override // java.lang.Runnable
        public final void run() {
            this.f11117a.lambda$new$0();
        }
    };
    private final Handler handler = new Handler();
    private TrackId[] sampleQueueTrackIds = new TrackId[0];
    private SampleQueue[] sampleQueues = new SampleQueue[0];
    private long pendingResetPositionUs = C3219C.TIME_UNSET;
    private long length = -1;
    private long durationUs = C3219C.TIME_UNSET;
    private int dataType = 1;

    public final class ExtractingLoadable implements Loader.Loadable, IcyDataSource.Listener {
        private final StatsDataSource dataSource;
        private final ExtractorHolder extractorHolder;
        private final ExtractorOutput extractorOutput;

        @Nullable
        private TrackOutput icyTrackOutput;
        private volatile boolean loadCanceled;
        private final ConditionVariable loadCondition;
        private long seekTimeUs;
        private boolean seenIcyMetadata;
        private final Uri uri;
        private final PositionHolder positionHolder = new PositionHolder();
        private boolean pendingExtractorSeek = true;
        private long length = -1;
        private DataSpec dataSpec = buildDataSpec(0);

        public ExtractingLoadable(Uri uri, DataSource dataSource, ExtractorHolder extractorHolder, ExtractorOutput extractorOutput, ConditionVariable conditionVariable) {
            this.uri = uri;
            this.dataSource = new StatsDataSource(dataSource);
            this.extractorHolder = extractorHolder;
            this.extractorOutput = extractorOutput;
            this.loadCondition = conditionVariable;
        }

        private DataSpec buildDataSpec(long j) {
            return new DataSpec(this.uri, j, -1L, ProgressiveMediaPeriod.this.customCacheKey, 6, (Map<String, String>) ProgressiveMediaPeriod.ICY_METADATA_HEADERS);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLoadPosition(long j, long j2) {
            this.positionHolder.position = j;
            this.seekTimeUs = j2;
            this.pendingExtractorSeek = true;
            this.seenIcyMetadata = false;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void cancelLoad() {
            this.loadCanceled = true;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
        public void load() throws Throwable {
            int i = 0;
            while (i == 0 && !this.loadCanceled) {
                DefaultExtractorInput defaultExtractorInput = null;
                try {
                    long position = this.positionHolder.position;
                    DataSpec dataSpecBuildDataSpec = buildDataSpec(position);
                    this.dataSpec = dataSpecBuildDataSpec;
                    long jOpen = this.dataSource.open(dataSpecBuildDataSpec);
                    this.length = jOpen;
                    if (jOpen != -1) {
                        this.length = jOpen + position;
                    }
                    Uri uri = (Uri) Assertions.checkNotNull(this.dataSource.getUri());
                    ProgressiveMediaPeriod.this.icyHeaders = IcyHeaders.parse(this.dataSource.getResponseHeaders());
                    DataSource icyDataSource = this.dataSource;
                    if (ProgressiveMediaPeriod.this.icyHeaders != null && ProgressiveMediaPeriod.this.icyHeaders.metadataInterval != -1) {
                        icyDataSource = new IcyDataSource(this.dataSource, ProgressiveMediaPeriod.this.icyHeaders.metadataInterval, this);
                        TrackOutput trackOutputIcyTrack = ProgressiveMediaPeriod.this.icyTrack();
                        this.icyTrackOutput = trackOutputIcyTrack;
                        trackOutputIcyTrack.format(ProgressiveMediaPeriod.ICY_FORMAT);
                    }
                    DefaultExtractorInput defaultExtractorInput2 = new DefaultExtractorInput(icyDataSource, position, this.length);
                    try {
                        Extractor extractorSelectExtractor = this.extractorHolder.selectExtractor(defaultExtractorInput2, this.extractorOutput, uri);
                        if (ProgressiveMediaPeriod.this.icyHeaders != null && (extractorSelectExtractor instanceof Mp3Extractor)) {
                            ((Mp3Extractor) extractorSelectExtractor).disableSeeking();
                        }
                        if (this.pendingExtractorSeek) {
                            extractorSelectExtractor.seek(position, this.seekTimeUs);
                            this.pendingExtractorSeek = false;
                        }
                        while (i == 0 && !this.loadCanceled) {
                            this.loadCondition.block();
                            i = extractorSelectExtractor.read(defaultExtractorInput2, this.positionHolder);
                            if (defaultExtractorInput2.getPosition() > ProgressiveMediaPeriod.this.continueLoadingCheckIntervalBytes + position) {
                                position = defaultExtractorInput2.getPosition();
                                this.loadCondition.close();
                                ProgressiveMediaPeriod.this.handler.post(ProgressiveMediaPeriod.this.onContinueLoadingRequestedRunnable);
                            }
                        }
                        if (i == 1) {
                            i = 0;
                        } else {
                            this.positionHolder.position = defaultExtractorInput2.getPosition();
                        }
                        Util.closeQuietly(this.dataSource);
                    } catch (Throwable th) {
                        th = th;
                        defaultExtractorInput = defaultExtractorInput2;
                        if (i != 1 && defaultExtractorInput != null) {
                            this.positionHolder.position = defaultExtractorInput.getPosition();
                        }
                        Util.closeQuietly(this.dataSource);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }

        @Override // com.google.android.exoplayer2.source.IcyDataSource.Listener
        public void onIcyMetadata(ParsableByteArray parsableByteArray) {
            long jMax = !this.seenIcyMetadata ? this.seekTimeUs : Math.max(ProgressiveMediaPeriod.this.getLargestQueuedTimestampUs(), this.seekTimeUs);
            int iBytesLeft = parsableByteArray.bytesLeft();
            TrackOutput trackOutput = (TrackOutput) Assertions.checkNotNull(this.icyTrackOutput);
            trackOutput.sampleData(parsableByteArray, iBytesLeft);
            trackOutput.sampleMetadata(jMax, 1, iBytesLeft, 0, null);
            this.seenIcyMetadata = true;
        }
    }

    public static final class ExtractorHolder {

        @Nullable
        private Extractor extractor;
        private final Extractor[] extractors;

        public ExtractorHolder(Extractor[] extractorArr) {
            this.extractors = extractorArr;
        }

        public void release() {
            Extractor extractor = this.extractor;
            if (extractor != null) {
                extractor.release();
                this.extractor = null;
            }
        }

        public Extractor selectExtractor(ExtractorInput extractorInput, ExtractorOutput extractorOutput, Uri uri) throws InterruptedException, IOException {
            Extractor extractor = this.extractor;
            if (extractor != null) {
                return extractor;
            }
            Extractor[] extractorArr = this.extractors;
            if (extractorArr.length == 1) {
                this.extractor = extractorArr[0];
            } else {
                for (Extractor extractor2 : extractorArr) {
                    try {
                        if (extractor2.sniff(extractorInput)) {
                            this.extractor = extractor2;
                            extractorInput.resetPeekPosition();
                            break;
                        }
                    } catch (EOFException unused) {
                    } catch (Throwable th) {
                        extractorInput.resetPeekPosition();
                        throw th;
                    }
                    extractorInput.resetPeekPosition();
                }
                if (this.extractor == null) {
                    throw new UnrecognizedInputFormatException(C0786MA.m3668a(new StringBuilder("None of the available extractors ("), Util.getCommaDelimitedSimpleClassNames(this.extractors), ") could read the stream."), uri);
                }
            }
            this.extractor.init(extractorOutput);
            return this.extractor;
        }
    }

    public interface Listener {
        void onSourceInfoRefreshed(long j, boolean z, boolean z2);
    }

    public static final class PreparedState {
        public final SeekMap seekMap;
        public final boolean[] trackEnabledStates;
        public final boolean[] trackIsAudioVideoFlags;
        public final boolean[] trackNotifiedDownstreamFormats;
        public final TrackGroupArray tracks;

        public PreparedState(SeekMap seekMap, TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.seekMap = seekMap;
            this.tracks = trackGroupArray;
            this.trackIsAudioVideoFlags = zArr;
            int i = trackGroupArray.length;
            this.trackEnabledStates = new boolean[i];
            this.trackNotifiedDownstreamFormats = new boolean[i];
        }
    }

    public final class SampleStreamImpl implements SampleStream {
        private final int track;

        public SampleStreamImpl(int i) {
            this.track = i;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return ProgressiveMediaPeriod.this.isReady(this.track);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() throws IOException {
            ProgressiveMediaPeriod.this.maybeThrowError(this.track);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z) {
            return ProgressiveMediaPeriod.this.readData(this.track, formatHolder, decoderInputBuffer, z);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long j) {
            return ProgressiveMediaPeriod.this.skipData(this.track, j);
        }
    }

    public static final class TrackId {

        /* JADX INFO: renamed from: id */
        public final int f11109id;
        public final boolean isIcyTrack;

        public TrackId(int i, boolean z) {
            this.f11109id = i;
            this.isIcyTrack = z;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || TrackId.class != obj.getClass()) {
                return false;
            }
            TrackId trackId = (TrackId) obj;
            return this.f11109id == trackId.f11109id && this.isIcyTrack == trackId.isIcyTrack;
        }

        public int hashCode() {
            return (this.f11109id * 31) + (this.isIcyTrack ? 1 : 0);
        }
    }

    public ProgressiveMediaPeriod(Uri uri, DataSource dataSource, Extractor[] extractorArr, DrmSessionManager<?> drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher, Listener listener, Allocator allocator, @Nullable String str, int i) {
        this.uri = uri;
        this.dataSource = dataSource;
        this.drmSessionManager = drmSessionManager;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.eventDispatcher = eventDispatcher;
        this.listener = listener;
        this.allocator = allocator;
        this.customCacheKey = str;
        this.continueLoadingCheckIntervalBytes = i;
        this.extractorHolder = new ExtractorHolder(extractorArr);
        eventDispatcher.mediaPeriodCreated();
    }

    private boolean configureRetry(ExtractingLoadable extractingLoadable, int i) {
        SeekMap seekMap;
        if (this.length != -1 || ((seekMap = this.seekMap) != null && seekMap.getDurationUs() != C3219C.TIME_UNSET)) {
            this.extractedSamplesCountAtStartOfLoad = i;
            return true;
        }
        if (this.prepared && !suppressRead()) {
            this.pendingDeferredRetry = true;
            return false;
        }
        this.notifyDiscontinuity = this.prepared;
        this.lastSeekPositionUs = 0L;
        this.extractedSamplesCountAtStartOfLoad = 0;
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.reset();
        }
        extractingLoadable.setLoadPosition(0L, 0L);
        return true;
    }

    private void copyLengthFromLoader(ExtractingLoadable extractingLoadable) {
        if (this.length == -1) {
            this.length = extractingLoadable.length;
        }
    }

    private static Map<String, String> createIcyMetadataHeaders() {
        HashMap map = new HashMap();
        map.put(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, "1");
        return Collections.unmodifiableMap(map);
    }

    private int getExtractedSamplesCount() {
        int writeIndex = 0;
        for (SampleQueue sampleQueue : this.sampleQueues) {
            writeIndex += sampleQueue.getWriteIndex();
        }
        return writeIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getLargestQueuedTimestampUs() {
        long jMax = Long.MIN_VALUE;
        for (SampleQueue sampleQueue : this.sampleQueues) {
            jMax = Math.max(jMax, sampleQueue.getLargestQueuedTimestampUs());
        }
        return jMax;
    }

    private PreparedState getPreparedState() {
        return (PreparedState) Assertions.checkNotNull(this.preparedState);
    }

    private boolean isPendingReset() {
        return this.pendingResetPositionUs != C3219C.TIME_UNSET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        if (this.released) {
            return;
        }
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFinishPrepare() {
        int i;
        boolean z = false;
        SeekMap seekMap = this.seekMap;
        if (this.released || this.prepared || !this.sampleQueuesBuilt || seekMap == null) {
            return;
        }
        for (SampleQueue sampleQueue : this.sampleQueues) {
            if (sampleQueue.getUpstreamFormat() == null) {
                return;
            }
        }
        this.loadCondition.close();
        int length = this.sampleQueues.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        boolean[] zArr = new boolean[length];
        this.durationUs = seekMap.getDurationUs();
        for (int i2 = 0; i2 < length; i2++) {
            Format upstreamFormat = this.sampleQueues[i2].getUpstreamFormat();
            String str = upstreamFormat.sampleMimeType;
            boolean zIsAudio = MimeTypes.isAudio(str);
            boolean z2 = zIsAudio || MimeTypes.isVideo(str);
            zArr[i2] = z2;
            this.haveAudioVideoTracks = z2 | this.haveAudioVideoTracks;
            IcyHeaders icyHeaders = this.icyHeaders;
            if (icyHeaders != null) {
                if (zIsAudio || this.sampleQueueTrackIds[i2].isIcyTrack) {
                    Metadata metadata = upstreamFormat.metadata;
                    upstreamFormat = upstreamFormat.copyWithMetadata(metadata == null ? new Metadata(icyHeaders) : metadata.copyWithAppendedEntries(icyHeaders));
                }
                if (zIsAudio && upstreamFormat.bitrate == -1 && (i = icyHeaders.bitrate) != -1) {
                    upstreamFormat = upstreamFormat.copyWithBitrate(i);
                }
            }
            DrmInitData drmInitData = upstreamFormat.drmInitData;
            if (drmInitData != null) {
                upstreamFormat = upstreamFormat.copyWithExoMediaCryptoType(this.drmSessionManager.getExoMediaCryptoType(drmInitData));
            }
            trackGroupArr[i2] = new TrackGroup(upstreamFormat);
        }
        if (this.length == -1 && seekMap.getDurationUs() == C3219C.TIME_UNSET) {
            z = true;
        }
        this.isLive = z;
        this.dataType = z ? 7 : 1;
        this.preparedState = new PreparedState(seekMap, new TrackGroupArray(trackGroupArr), zArr);
        this.prepared = true;
        this.listener.onSourceInfoRefreshed(this.durationUs, seekMap.isSeekable(), this.isLive);
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onPrepared(this);
    }

    private void maybeNotifyDownstreamFormat(int i) {
        PreparedState preparedState = getPreparedState();
        boolean[] zArr = preparedState.trackNotifiedDownstreamFormats;
        if (zArr[i]) {
            return;
        }
        Format format = preparedState.tracks.get(i).getFormat(0);
        this.eventDispatcher.downstreamFormatChanged(MimeTypes.getTrackType(format.sampleMimeType), format, 0, null, this.lastSeekPositionUs);
        zArr[i] = true;
    }

    private void maybeStartDeferredRetry(int i) {
        boolean[] zArr = getPreparedState().trackIsAudioVideoFlags;
        if (this.pendingDeferredRetry && zArr[i]) {
            if (this.sampleQueues[i].isReady(false)) {
                return;
            }
            this.pendingResetPositionUs = 0L;
            this.pendingDeferredRetry = false;
            this.notifyDiscontinuity = true;
            this.lastSeekPositionUs = 0L;
            this.extractedSamplesCountAtStartOfLoad = 0;
            for (SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.reset();
            }
            ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
        }
    }

    private TrackOutput prepareTrackOutput(TrackId trackId) {
        int length = this.sampleQueues.length;
        for (int i = 0; i < length; i++) {
            if (trackId.equals(this.sampleQueueTrackIds[i])) {
                return this.sampleQueues[i];
            }
        }
        SampleQueue sampleQueue = new SampleQueue(this.allocator, this.handler.getLooper(), this.drmSessionManager);
        sampleQueue.setUpstreamFormatChangeListener(this);
        int i2 = length + 1;
        TrackId[] trackIdArr = (TrackId[]) Arrays.copyOf(this.sampleQueueTrackIds, i2);
        trackIdArr[length] = trackId;
        this.sampleQueueTrackIds = (TrackId[]) Util.castNonNullTypeArray(trackIdArr);
        SampleQueue[] sampleQueueArr = (SampleQueue[]) Arrays.copyOf(this.sampleQueues, i2);
        sampleQueueArr[length] = sampleQueue;
        this.sampleQueues = (SampleQueue[]) Util.castNonNullTypeArray(sampleQueueArr);
        return sampleQueue;
    }

    private boolean seekInsideBufferUs(boolean[] zArr, long j) {
        int length = this.sampleQueues.length;
        for (int i = 0; i < length; i++) {
            if (!this.sampleQueues[i].seekTo(j, false) && (zArr[i] || !this.haveAudioVideoTracks)) {
                return false;
            }
        }
        return true;
    }

    private void startLoading() {
        ExtractingLoadable extractingLoadable = new ExtractingLoadable(this.uri, this.dataSource, this.extractorHolder, this, this.loadCondition);
        if (this.prepared) {
            SeekMap seekMap = getPreparedState().seekMap;
            Assertions.checkState(isPendingReset());
            long j = this.durationUs;
            if (j != C3219C.TIME_UNSET && this.pendingResetPositionUs > j) {
                this.loadingFinished = true;
                this.pendingResetPositionUs = C3219C.TIME_UNSET;
                return;
            } else {
                extractingLoadable.setLoadPosition(seekMap.getSeekPoints(this.pendingResetPositionUs).first.position, this.pendingResetPositionUs);
                this.pendingResetPositionUs = C3219C.TIME_UNSET;
            }
        }
        this.extractedSamplesCountAtStartOfLoad = getExtractedSamplesCount();
        this.eventDispatcher.loadStarted(extractingLoadable.dataSpec, 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs, this.loader.startLoading(extractingLoadable, this, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(this.dataType)));
    }

    private boolean suppressRead() {
        return this.notifyDiscontinuity || isPendingReset();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j) {
        if (this.loadingFinished || this.loader.hasFatalError() || this.pendingDeferredRetry) {
            return false;
        }
        if (this.prepared && this.enabledTrackCount == 0) {
            return false;
        }
        boolean zOpen = this.loadCondition.open();
        if (this.loader.isLoading()) {
            return zOpen;
        }
        startLoading();
        return true;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long j, boolean z) {
        if (isPendingReset()) {
            return;
        }
        boolean[] zArr = getPreparedState().trackEnabledStates;
        int length = this.sampleQueues.length;
        for (int i = 0; i < length; i++) {
            this.sampleQueues[i].discardTo(j, z, zArr[i]);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void endTracks() {
        this.sampleQueuesBuilt = true;
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        SeekMap seekMap = getPreparedState().seekMap;
        if (!seekMap.isSeekable()) {
            return 0L;
        }
        SeekMap.SeekPoints seekPoints = seekMap.getSeekPoints(j);
        return Util.resolveSeekPositionUs(j, seekParameters, seekPoints.first.timeUs, seekPoints.second.timeUs);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        long largestQueuedTimestampUs;
        boolean[] zArr = getPreparedState().trackIsAudioVideoFlags;
        if (this.loadingFinished) {
            return Long.MIN_VALUE;
        }
        if (isPendingReset()) {
            return this.pendingResetPositionUs;
        }
        if (this.haveAudioVideoTracks) {
            int length = this.sampleQueues.length;
            largestQueuedTimestampUs = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.sampleQueues[i].isLastSampleQueued()) {
                    largestQueuedTimestampUs = Math.min(largestQueuedTimestampUs, this.sampleQueues[i].getLargestQueuedTimestampUs());
                }
            }
        } else {
            largestQueuedTimestampUs = Long.MAX_VALUE;
        }
        if (largestQueuedTimestampUs == Long.MAX_VALUE) {
            largestQueuedTimestampUs = getLargestQueuedTimestampUs();
        }
        return largestQueuedTimestampUs == Long.MIN_VALUE ? this.lastSeekPositionUs : largestQueuedTimestampUs;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        if (this.enabledTrackCount == 0) {
            return Long.MIN_VALUE;
        }
        return getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public /* synthetic */ List getStreamKeys(List list) {
        return C4205dB.m19885a(this, list);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return getPreparedState().tracks;
    }

    public TrackOutput icyTrack() {
        return prepareTrackOutput(new TrackId(0, true));
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.loader.isLoading() && this.loadCondition.isOpen();
    }

    public boolean isReady(int i) {
        return !suppressRead() && this.sampleQueues[i].isReady(this.loadingFinished);
    }

    public void maybeThrowError() throws IOException {
        this.loader.maybeThrowError(this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(this.dataType));
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        maybeThrowError();
        if (this.loadingFinished && !this.prepared) {
            throw new ParserException("Loading finished before preparation is complete.");
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public void onLoadCanceled(ExtractingLoadable extractingLoadable, long j, long j2, boolean z) {
        this.eventDispatcher.loadCanceled(extractingLoadable.dataSpec, extractingLoadable.dataSource.getLastOpenedUri(), extractingLoadable.dataSource.getLastResponseHeaders(), 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs, j, j2, extractingLoadable.dataSource.getBytesRead());
        if (z) {
            return;
        }
        copyLengthFromLoader(extractingLoadable);
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.reset();
        }
        if (this.enabledTrackCount > 0) {
            ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public void onLoadCompleted(ExtractingLoadable extractingLoadable, long j, long j2) {
        SeekMap seekMap;
        if (this.durationUs == C3219C.TIME_UNSET && (seekMap = this.seekMap) != null) {
            boolean zIsSeekable = seekMap.isSeekable();
            long largestQueuedTimestampUs = getLargestQueuedTimestampUs();
            long j3 = largestQueuedTimestampUs == Long.MIN_VALUE ? 0L : largestQueuedTimestampUs + DEFAULT_LAST_SAMPLE_DURATION_US;
            this.durationUs = j3;
            this.listener.onSourceInfoRefreshed(j3, zIsSeekable, this.isLive);
        }
        this.eventDispatcher.loadCompleted(extractingLoadable.dataSpec, extractingLoadable.dataSource.getLastOpenedUri(), extractingLoadable.dataSource.getLastResponseHeaders(), 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs, j, j2, extractingLoadable.dataSource.getBytesRead());
        copyLengthFromLoader(extractingLoadable);
        this.loadingFinished = true;
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.callback)).onContinueLoadingRequested(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    public Loader.LoadErrorAction onLoadError(ExtractingLoadable extractingLoadable, long j, long j2, IOException iOException, int i) {
        Loader.LoadErrorAction loadErrorActionCreateRetryAction;
        copyLengthFromLoader(extractingLoadable);
        long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(this.dataType, j2, iOException, i);
        if (retryDelayMsFor == C3219C.TIME_UNSET) {
            loadErrorActionCreateRetryAction = Loader.DONT_RETRY_FATAL;
        } else {
            int extractedSamplesCount = getExtractedSamplesCount();
            loadErrorActionCreateRetryAction = configureRetry(extractingLoadable, extractedSamplesCount) ? Loader.createRetryAction(extractedSamplesCount > this.extractedSamplesCountAtStartOfLoad, retryDelayMsFor) : Loader.DONT_RETRY;
        }
        this.eventDispatcher.loadError(extractingLoadable.dataSpec, extractingLoadable.dataSource.getLastOpenedUri(), extractingLoadable.dataSource.getLastResponseHeaders(), 1, -1, null, 0, null, extractingLoadable.seekTimeUs, this.durationUs, j, j2, extractingLoadable.dataSource.getBytesRead(), iOException, !loadErrorActionCreateRetryAction.isRetry());
        return loadErrorActionCreateRetryAction;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.release();
        }
        this.extractorHolder.release();
    }

    @Override // com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener
    public void onUpstreamFormatChanged(Format format) {
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        this.loadCondition.open();
        startLoading();
    }

    public int readData(int i, FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, boolean z) {
        if (suppressRead()) {
            return -3;
        }
        maybeNotifyDownstreamFormat(i);
        int i2 = this.sampleQueues[i].read(formatHolder, decoderInputBuffer, z, this.loadingFinished, this.lastSeekPositionUs);
        if (i2 == -3) {
            maybeStartDeferredRetry(i);
        }
        return i2;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        if (!this.notifiedReadingStarted) {
            this.eventDispatcher.readingStarted();
            this.notifiedReadingStarted = true;
        }
        if (!this.notifyDiscontinuity) {
            return C3219C.TIME_UNSET;
        }
        if (!this.loadingFinished && getExtractedSamplesCount() <= this.extractedSamplesCountAtStartOfLoad) {
            return C3219C.TIME_UNSET;
        }
        this.notifyDiscontinuity = false;
        return this.lastSeekPositionUs;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
    }

    public void release() {
        if (this.prepared) {
            for (SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.preRelease();
            }
        }
        this.loader.release(this);
        this.handler.removeCallbacksAndMessages(null);
        this.callback = null;
        this.released = true;
        this.eventDispatcher.mediaPeriodReleased();
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
        if (this.icyHeaders != null) {
            seekMap = new SeekMap.Unseekable(C3219C.TIME_UNSET);
        }
        this.seekMap = seekMap;
        this.handler.post(this.maybeFinishPrepareRunnable);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long j) {
        PreparedState preparedState = getPreparedState();
        SeekMap seekMap = preparedState.seekMap;
        boolean[] zArr = preparedState.trackIsAudioVideoFlags;
        if (!seekMap.isSeekable()) {
            j = 0;
        }
        this.notifyDiscontinuity = false;
        this.lastSeekPositionUs = j;
        if (isPendingReset()) {
            this.pendingResetPositionUs = j;
            return j;
        }
        if (this.dataType != 7 && seekInsideBufferUs(zArr, j)) {
            return j;
        }
        this.pendingDeferredRetry = false;
        this.pendingResetPositionUs = j;
        this.loadingFinished = false;
        if (this.loader.isLoading()) {
            this.loader.cancelLoading();
        } else {
            this.loader.clearFatalError();
            for (SampleQueue sampleQueue : this.sampleQueues) {
                sampleQueue.reset();
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(TrackSelection[] trackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        TrackSelection trackSelection;
        PreparedState preparedState = getPreparedState();
        TrackGroupArray trackGroupArray = preparedState.tracks;
        boolean[] zArr3 = preparedState.trackEnabledStates;
        int i = this.enabledTrackCount;
        int i2 = 0;
        for (int i3 = 0; i3 < trackSelectionArr.length; i3++) {
            SampleStream sampleStream = sampleStreamArr[i3];
            if (sampleStream != null && (trackSelectionArr[i3] == null || !zArr[i3])) {
                int i4 = ((SampleStreamImpl) sampleStream).track;
                Assertions.checkState(zArr3[i4]);
                this.enabledTrackCount--;
                zArr3[i4] = false;
                sampleStreamArr[i3] = null;
            }
        }
        boolean z = !this.seenFirstTrackSelection ? j == 0 : i != 0;
        for (int i5 = 0; i5 < trackSelectionArr.length; i5++) {
            if (sampleStreamArr[i5] == null && (trackSelection = trackSelectionArr[i5]) != null) {
                Assertions.checkState(trackSelection.length() == 1);
                Assertions.checkState(trackSelection.getIndexInTrackGroup(0) == 0);
                int iIndexOf = trackGroupArray.indexOf(trackSelection.getTrackGroup());
                Assertions.checkState(!zArr3[iIndexOf]);
                this.enabledTrackCount++;
                zArr3[iIndexOf] = true;
                sampleStreamArr[i5] = new SampleStreamImpl(iIndexOf);
                zArr2[i5] = true;
                if (!z) {
                    SampleQueue sampleQueue = this.sampleQueues[iIndexOf];
                    z = (sampleQueue.seekTo(j, true) || sampleQueue.getReadIndex() == 0) ? false : true;
                }
            }
        }
        if (this.enabledTrackCount == 0) {
            this.pendingDeferredRetry = false;
            this.notifyDiscontinuity = false;
            if (this.loader.isLoading()) {
                SampleQueue[] sampleQueueArr = this.sampleQueues;
                int length = sampleQueueArr.length;
                while (i2 < length) {
                    sampleQueueArr[i2].discardToEnd();
                    i2++;
                }
                this.loader.cancelLoading();
            } else {
                SampleQueue[] sampleQueueArr2 = this.sampleQueues;
                int length2 = sampleQueueArr2.length;
                while (i2 < length2) {
                    sampleQueueArr2[i2].reset();
                    i2++;
                }
            }
        } else if (z) {
            j = seekToUs(j);
            while (i2 < sampleStreamArr.length) {
                if (sampleStreamArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.seenFirstTrackSelection = true;
        return j;
    }

    public int skipData(int i, long j) {
        if (suppressRead()) {
            return 0;
        }
        maybeNotifyDownstreamFormat(i);
        SampleQueue sampleQueue = this.sampleQueues[i];
        int iAdvanceTo = (!this.loadingFinished || j <= sampleQueue.getLargestQueuedTimestampUs()) ? sampleQueue.advanceTo(j) : sampleQueue.advanceToEnd();
        if (iAdvanceTo == 0) {
            maybeStartDeferredRetry(i);
        }
        return iAdvanceTo;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public TrackOutput track(int i, int i2) {
        return prepareTrackOutput(new TrackId(i, false));
    }

    public void maybeThrowError(int i) throws IOException {
        this.sampleQueues[i].maybeThrowError();
        maybeThrowError();
    }
}
