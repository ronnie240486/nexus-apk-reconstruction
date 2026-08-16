package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.source.chunk.ChunkExtractorWrapper;
import com.google.android.exoplayer2.source.chunk.InitializationChunk;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.DashManifestParser;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class DashUtil {
    private DashUtil() {
    }

    @Nullable
    private static Representation getFirstRepresentation(Period period, int i) {
        int adaptationSetIndex = period.getAdaptationSetIndex(i);
        if (adaptationSetIndex == -1) {
            return null;
        }
        List<Representation> list = period.adaptationSets.get(adaptationSetIndex).representations;
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Nullable
    public static ChunkIndex loadChunkIndex(DataSource dataSource, int i, Representation representation) throws InterruptedException, IOException {
        ChunkExtractorWrapper chunkExtractorWrapperLoadInitializationData = loadInitializationData(dataSource, i, representation, true);
        if (chunkExtractorWrapperLoadInitializationData == null) {
            return null;
        }
        return (ChunkIndex) chunkExtractorWrapperLoadInitializationData.getSeekMap();
    }

    @Nullable
    public static DrmInitData loadDrmInitData(DataSource dataSource, Period period) throws InterruptedException, IOException {
        int i = 2;
        Representation firstRepresentation = getFirstRepresentation(period, 2);
        if (firstRepresentation == null) {
            i = 1;
            firstRepresentation = getFirstRepresentation(period, 1);
            if (firstRepresentation == null) {
                return null;
            }
        }
        Format format = firstRepresentation.format;
        Format formatLoadSampleFormat = loadSampleFormat(dataSource, i, firstRepresentation);
        return formatLoadSampleFormat == null ? format.drmInitData : formatLoadSampleFormat.copyWithManifestFormatInfo(format).drmInitData;
    }

    @Nullable
    private static ChunkExtractorWrapper loadInitializationData(DataSource dataSource, int i, Representation representation, boolean z) throws InterruptedException, IOException {
        RangedUri initializationUri = representation.getInitializationUri();
        if (initializationUri == null) {
            return null;
        }
        ChunkExtractorWrapper chunkExtractorWrapperNewWrappedExtractor = newWrappedExtractor(i, representation.format);
        if (z) {
            RangedUri indexUri = representation.getIndexUri();
            if (indexUri == null) {
                return null;
            }
            RangedUri rangedUriAttemptMerge = initializationUri.attemptMerge(indexUri, representation.baseUrl);
            if (rangedUriAttemptMerge == null) {
                loadInitializationData(dataSource, representation, chunkExtractorWrapperNewWrappedExtractor, initializationUri);
                initializationUri = indexUri;
            } else {
                initializationUri = rangedUriAttemptMerge;
            }
        }
        loadInitializationData(dataSource, representation, chunkExtractorWrapperNewWrappedExtractor, initializationUri);
        return chunkExtractorWrapperNewWrappedExtractor;
    }

    public static DashManifest loadManifest(DataSource dataSource, Uri uri) throws IOException {
        return (DashManifest) ParsingLoadable.load(dataSource, new DashManifestParser(), uri, 4);
    }

    @Nullable
    public static Format loadSampleFormat(DataSource dataSource, int i, Representation representation) throws InterruptedException, IOException {
        ChunkExtractorWrapper chunkExtractorWrapperLoadInitializationData = loadInitializationData(dataSource, i, representation, false);
        if (chunkExtractorWrapperLoadInitializationData == null) {
            return null;
        }
        return chunkExtractorWrapperLoadInitializationData.getSampleFormats()[0];
    }

    private static ChunkExtractorWrapper newWrappedExtractor(int i, Format format) {
        String str = format.containerMimeType;
        return new ChunkExtractorWrapper((str == null || !(str.startsWith(MimeTypes.VIDEO_WEBM) || str.startsWith(MimeTypes.AUDIO_WEBM))) ? new FragmentedMp4Extractor() : new MatroskaExtractor(), i, format);
    }

    private static void loadInitializationData(DataSource dataSource, Representation representation, ChunkExtractorWrapper chunkExtractorWrapper, RangedUri rangedUri) throws InterruptedException, IOException {
        new InitializationChunk(dataSource, new DataSpec(rangedUri.resolveUri(representation.baseUrl), rangedUri.start, rangedUri.length, representation.getCacheKey()), representation.format, 0, null, chunkExtractorWrapper).load();
    }
}
