package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes.dex */
final class HlsMediaChunk extends MediaChunk {
    public static final String PRIV_TIMESTAMP_FRAME_OWNER = "com.apple.streaming.transportStreamTimestamp";
    public final int discontinuitySequenceNumber;

    @Nullable
    private final DrmInitData drmInitData;
    private Extractor extractor;
    private final HlsExtractorFactory extractorFactory;
    private final boolean hasGapTag;
    private final Id3Decoder id3Decoder;
    private boolean initDataLoadRequired;

    @Nullable
    private final DataSource initDataSource;

    @Nullable
    private final DataSpec initDataSpec;
    private final boolean initSegmentEncrypted;
    private boolean isExtractorReusable;
    private final boolean isMasterTimestampSource;
    private volatile boolean loadCanceled;
    private boolean loadCompleted;
    private final boolean mediaSegmentEncrypted;

    @Nullable
    private final List<Format> muxedCaptionFormats;
    private int nextLoadPosition;
    private HlsSampleStreamWrapper output;
    public final Uri playlistUrl;

    @Nullable
    private final Extractor previousExtractor;
    private final ParsableByteArray scratchId3Data;
    private final boolean shouldSpliceIn;
    private final TimestampAdjuster timestampAdjuster;
    public final int uid;
    private static final PositionHolder DUMMY_POSITION_HOLDER = new PositionHolder();
    private static final AtomicInteger uidSource = new AtomicInteger();

    private HlsMediaChunk(HlsExtractorFactory hlsExtractorFactory, DataSource dataSource, DataSpec dataSpec, Format format, boolean z, @Nullable DataSource dataSource2, @Nullable DataSpec dataSpec2, boolean z2, Uri uri, @Nullable List<Format> list, int i, @Nullable Object obj, long j, long j2, long j3, int i2, boolean z3, boolean z4, TimestampAdjuster timestampAdjuster, @Nullable DrmInitData drmInitData, @Nullable Extractor extractor, Id3Decoder id3Decoder, ParsableByteArray parsableByteArray, boolean z5) {
        super(dataSource, dataSpec, format, i, obj, j, j2, j3);
        this.mediaSegmentEncrypted = z;
        this.discontinuitySequenceNumber = i2;
        this.initDataSpec = dataSpec2;
        this.initDataSource = dataSource2;
        this.initDataLoadRequired = dataSpec2 != null;
        this.initSegmentEncrypted = z2;
        this.playlistUrl = uri;
        this.isMasterTimestampSource = z4;
        this.timestampAdjuster = timestampAdjuster;
        this.hasGapTag = z3;
        this.extractorFactory = hlsExtractorFactory;
        this.muxedCaptionFormats = list;
        this.drmInitData = drmInitData;
        this.previousExtractor = extractor;
        this.id3Decoder = id3Decoder;
        this.scratchId3Data = parsableByteArray;
        this.shouldSpliceIn = z5;
        this.uid = uidSource.getAndIncrement();
    }

    private static DataSource buildDataSource(DataSource dataSource, @Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null) {
            return dataSource;
        }
        Assertions.checkNotNull(bArr2);
        return new Aes128DataSource(dataSource, bArr, bArr2);
    }

    public static HlsMediaChunk createInstance(HlsExtractorFactory hlsExtractorFactory, DataSource dataSource, Format format, long j, HlsMediaPlaylist hlsMediaPlaylist, int i, Uri uri, @Nullable List<Format> list, int i2, @Nullable Object obj, boolean z, TimestampAdjusterProvider timestampAdjusterProvider, @Nullable HlsMediaChunk hlsMediaChunk, @Nullable byte[] bArr, @Nullable byte[] bArr2) {
        DataSpec dataSpec;
        boolean z2;
        DataSource dataSourceBuildDataSource;
        Id3Decoder id3Decoder;
        ParsableByteArray parsableByteArray;
        Extractor extractor;
        boolean z3;
        HlsMediaPlaylist.Segment segment = hlsMediaPlaylist.segments.get(i);
        DataSpec dataSpec2 = new DataSpec(UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, segment.url), segment.byterangeOffset, segment.byterangeLength, null);
        boolean z4 = bArr != null;
        DataSource dataSourceBuildDataSource2 = buildDataSource(dataSource, bArr, z4 ? getEncryptionIvArray((String) Assertions.checkNotNull(segment.encryptionIV)) : null);
        HlsMediaPlaylist.Segment segment2 = segment.initializationSegment;
        if (segment2 != null) {
            boolean z5 = bArr2 != null;
            byte[] encryptionIvArray = z5 ? getEncryptionIvArray((String) Assertions.checkNotNull(segment2.encryptionIV)) : null;
            DataSpec dataSpec3 = new DataSpec(UriUtil.resolveToUri(hlsMediaPlaylist.baseUri, segment2.url), segment2.byterangeOffset, segment2.byterangeLength, null);
            z2 = z5;
            dataSourceBuildDataSource = buildDataSource(dataSource, bArr2, encryptionIvArray);
            dataSpec = dataSpec3;
        } else {
            dataSpec = null;
            z2 = false;
            dataSourceBuildDataSource = null;
        }
        long j2 = j + segment.relativeStartTimeUs;
        long j3 = j2 + segment.durationUs;
        int i3 = hlsMediaPlaylist.discontinuitySequence + segment.relativeDiscontinuitySequence;
        if (hlsMediaChunk != null) {
            Id3Decoder id3Decoder2 = hlsMediaChunk.id3Decoder;
            ParsableByteArray parsableByteArray2 = hlsMediaChunk.scratchId3Data;
            boolean z6 = (uri.equals(hlsMediaChunk.playlistUrl) && hlsMediaChunk.loadCompleted) ? false : true;
            id3Decoder = id3Decoder2;
            parsableByteArray = parsableByteArray2;
            extractor = (hlsMediaChunk.isExtractorReusable && hlsMediaChunk.discontinuitySequenceNumber == i3 && !z6) ? hlsMediaChunk.extractor : null;
            z3 = z6;
        } else {
            id3Decoder = new Id3Decoder();
            parsableByteArray = new ParsableByteArray(10);
            extractor = null;
            z3 = false;
        }
        return new HlsMediaChunk(hlsExtractorFactory, dataSourceBuildDataSource2, dataSpec2, format, z4, dataSourceBuildDataSource, dataSpec, z2, uri, list, i2, obj, j2, j3, hlsMediaPlaylist.mediaSequence + ((long) i), i3, segment.hasGapTag, z, timestampAdjusterProvider.getAdjuster(i3), segment.drmInitData, extractor, id3Decoder, parsableByteArray, z3);
    }

    @RequiresNonNull({"output"})
    private void feedDataToExtractor(DataSource dataSource, DataSpec dataSpec, boolean z) throws InterruptedException, IOException {
        DataSpec dataSpecSubrange;
        boolean z2;
        int i = 0;
        if (z) {
            z2 = this.nextLoadPosition != 0;
            dataSpecSubrange = dataSpec;
        } else {
            dataSpecSubrange = dataSpec.subrange(this.nextLoadPosition);
            z2 = false;
        }
        try {
            DefaultExtractorInput defaultExtractorInputPrepareExtraction = prepareExtraction(dataSource, dataSpecSubrange);
            if (z2) {
                defaultExtractorInputPrepareExtraction.skipFully(this.nextLoadPosition);
            }
            while (i == 0) {
                try {
                    if (this.loadCanceled) {
                        break;
                    } else {
                        i = this.extractor.read(defaultExtractorInputPrepareExtraction, DUMMY_POSITION_HOLDER);
                    }
                } catch (Throwable th) {
                    this.nextLoadPosition = (int) (defaultExtractorInputPrepareExtraction.getPosition() - dataSpec.absoluteStreamPosition);
                    throw th;
                }
            }
            this.nextLoadPosition = (int) (defaultExtractorInputPrepareExtraction.getPosition() - dataSpec.absoluteStreamPosition);
            Util.closeQuietly(dataSource);
        } catch (Throwable th2) {
            Util.closeQuietly(dataSource);
            throw th2;
        }
    }

    private static byte[] getEncryptionIvArray(String str) {
        if (Util.toLowerInvariant(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @RequiresNonNull({"output"})
    private void loadMedia() throws InterruptedException, IOException {
        if (!this.isMasterTimestampSource) {
            this.timestampAdjuster.waitUntilInitialized();
        } else if (this.timestampAdjuster.getFirstSampleTimestampUs() == Long.MAX_VALUE) {
            this.timestampAdjuster.setFirstSampleTimestampUs(this.startTimeUs);
        }
        feedDataToExtractor(this.dataSource, this.dataSpec, this.mediaSegmentEncrypted);
    }

    @RequiresNonNull({"output"})
    private void maybeLoadInitData() throws InterruptedException, IOException {
        if (this.initDataLoadRequired) {
            Assertions.checkNotNull(this.initDataSource);
            Assertions.checkNotNull(this.initDataSpec);
            feedDataToExtractor(this.initDataSource, this.initDataSpec, this.initSegmentEncrypted);
            this.nextLoadPosition = 0;
            this.initDataLoadRequired = false;
        }
    }

    private long peekId3PrivTimestamp(ExtractorInput extractorInput) throws InterruptedException, IOException {
        extractorInput.resetPeekPosition();
        try {
            extractorInput.peekFully(this.scratchId3Data.data, 0, 10);
            this.scratchId3Data.reset(10);
            if (this.scratchId3Data.readUnsignedInt24() != 4801587) {
                return C3219C.TIME_UNSET;
            }
            this.scratchId3Data.skipBytes(3);
            int synchSafeInt = this.scratchId3Data.readSynchSafeInt();
            int i = synchSafeInt + 10;
            if (i > this.scratchId3Data.capacity()) {
                ParsableByteArray parsableByteArray = this.scratchId3Data;
                byte[] bArr = parsableByteArray.data;
                parsableByteArray.reset(i);
                System.arraycopy(bArr, 0, this.scratchId3Data.data, 0, 10);
            }
            extractorInput.peekFully(this.scratchId3Data.data, 10, synchSafeInt);
            Metadata metadataDecode = this.id3Decoder.decode(this.scratchId3Data.data, synchSafeInt);
            if (metadataDecode == null) {
                return C3219C.TIME_UNSET;
            }
            int length = metadataDecode.length();
            for (int i2 = 0; i2 < length; i2++) {
                Metadata.Entry entry = metadataDecode.get(i2);
                if (entry instanceof PrivFrame) {
                    PrivFrame privFrame = (PrivFrame) entry;
                    if (PRIV_TIMESTAMP_FRAME_OWNER.equals(privFrame.owner)) {
                        System.arraycopy(privFrame.privateData, 0, this.scratchId3Data.data, 0, 8);
                        this.scratchId3Data.reset(8);
                        return this.scratchId3Data.readLong() & 8589934591L;
                    }
                }
            }
            return C3219C.TIME_UNSET;
        } catch (EOFException unused) {
        }
    }

    @EnsuresNonNull({"extractor"})
    @RequiresNonNull({"output"})
    private DefaultExtractorInput prepareExtraction(DataSource dataSource, DataSpec dataSpec) throws InterruptedException, IOException {
        DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(dataSource, dataSpec.absoluteStreamPosition, dataSource.open(dataSpec));
        if (this.extractor == null) {
            long jPeekId3PrivTimestamp = peekId3PrivTimestamp(defaultExtractorInput);
            defaultExtractorInput.resetPeekPosition();
            HlsExtractorFactory.Result resultCreateExtractor = this.extractorFactory.createExtractor(this.previousExtractor, dataSpec.uri, this.trackFormat, this.muxedCaptionFormats, this.timestampAdjuster, dataSource.getResponseHeaders(), defaultExtractorInput);
            this.extractor = resultCreateExtractor.extractor;
            this.isExtractorReusable = resultCreateExtractor.isReusable;
            if (resultCreateExtractor.isPackedAudioExtractor) {
                this.output.setSampleOffsetUs(jPeekId3PrivTimestamp != C3219C.TIME_UNSET ? this.timestampAdjuster.adjustTsTimestamp(jPeekId3PrivTimestamp) : this.startTimeUs);
            } else {
                this.output.setSampleOffsetUs(0L);
            }
            this.output.onNewExtractor();
            this.extractor.init(this.output);
        }
        this.output.setDrmInitData(this.drmInitData);
        return defaultExtractorInput;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void cancelLoad() {
        this.loadCanceled = true;
    }

    public void init(HlsSampleStreamWrapper hlsSampleStreamWrapper) {
        this.output = hlsSampleStreamWrapper;
        hlsSampleStreamWrapper.init(this.uid, this.shouldSpliceIn);
    }

    @Override // com.google.android.exoplayer2.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public void load() throws InterruptedException, IOException {
        Extractor extractor;
        Assertions.checkNotNull(this.output);
        if (this.extractor == null && (extractor = this.previousExtractor) != null) {
            this.extractor = extractor;
            this.isExtractorReusable = true;
            this.initDataLoadRequired = false;
        }
        maybeLoadInitData();
        if (this.loadCanceled) {
            return;
        }
        if (!this.hasGapTag) {
            loadMedia();
        }
        this.loadCompleted = true;
    }
}
