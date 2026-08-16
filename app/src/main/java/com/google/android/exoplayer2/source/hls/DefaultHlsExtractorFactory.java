package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.p006ts.Ac3Extractor;
import com.google.android.exoplayer2.extractor.p006ts.Ac4Extractor;
import com.google.android.exoplayer2.extractor.p006ts.AdtsExtractor;
import com.google.android.exoplayer2.extractor.p006ts.DefaultTsPayloadReaderFactory;
import com.google.android.exoplayer2.extractor.p006ts.TsExtractor;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.EOFException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultHlsExtractorFactory implements HlsExtractorFactory {
    public static final String AAC_FILE_EXTENSION = ".aac";
    public static final String AC3_FILE_EXTENSION = ".ac3";
    public static final String AC4_FILE_EXTENSION = ".ac4";
    public static final String CMF_FILE_EXTENSION_PREFIX = ".cmf";
    public static final String EC3_FILE_EXTENSION = ".ec3";
    public static final String M4_FILE_EXTENSION_PREFIX = ".m4";
    public static final String MP3_FILE_EXTENSION = ".mp3";
    public static final String MP4_FILE_EXTENSION = ".mp4";
    public static final String MP4_FILE_EXTENSION_PREFIX = ".mp4";
    public static final String VTT_FILE_EXTENSION = ".vtt";
    public static final String WEBVTT_FILE_EXTENSION = ".webvtt";
    private final boolean exposeCea608WhenMissingDeclarations;
    private final int payloadReaderFactoryFlags;

    public DefaultHlsExtractorFactory() {
        this(0, true);
    }

    private static HlsExtractorFactory.Result buildResult(Extractor extractor) {
        return new HlsExtractorFactory.Result(extractor, (extractor instanceof AdtsExtractor) || (extractor instanceof Ac3Extractor) || (extractor instanceof Ac4Extractor) || (extractor instanceof Mp3Extractor), isReusable(extractor));
    }

    @Nullable
    private static HlsExtractorFactory.Result buildResultForSameExtractorType(Extractor extractor, Format format, TimestampAdjuster timestampAdjuster) {
        Extractor mp3Extractor;
        if (extractor instanceof WebvttExtractor) {
            mp3Extractor = new WebvttExtractor(format.language, timestampAdjuster);
        } else if (extractor instanceof AdtsExtractor) {
            mp3Extractor = new AdtsExtractor();
        } else if (extractor instanceof Ac3Extractor) {
            mp3Extractor = new Ac3Extractor();
        } else if (extractor instanceof Ac4Extractor) {
            mp3Extractor = new Ac4Extractor();
        } else {
            if (!(extractor instanceof Mp3Extractor)) {
                return null;
            }
            mp3Extractor = new Mp3Extractor();
        }
        return buildResult(mp3Extractor);
    }

    private Extractor createExtractorByFileExtension(Uri uri, Format format, @Nullable List<Format> list, TimestampAdjuster timestampAdjuster) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        if (MimeTypes.TEXT_VTT.equals(format.sampleMimeType) || lastPathSegment.endsWith(WEBVTT_FILE_EXTENSION) || lastPathSegment.endsWith(VTT_FILE_EXTENSION)) {
            return new WebvttExtractor(format.language, timestampAdjuster);
        }
        if (lastPathSegment.endsWith(AAC_FILE_EXTENSION)) {
            return new AdtsExtractor();
        }
        if (lastPathSegment.endsWith(AC3_FILE_EXTENSION) || lastPathSegment.endsWith(EC3_FILE_EXTENSION)) {
            return new Ac3Extractor();
        }
        if (lastPathSegment.endsWith(AC4_FILE_EXTENSION)) {
            return new Ac4Extractor();
        }
        if (lastPathSegment.endsWith(MP3_FILE_EXTENSION)) {
            return new Mp3Extractor(0, 0L);
        }
        return (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(M4_FILE_EXTENSION_PREFIX, lastPathSegment.length() + (-4)) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() + (-5)) || lastPathSegment.startsWith(CMF_FILE_EXTENSION_PREFIX, lastPathSegment.length() + (-5))) ? createFragmentedMp4Extractor(timestampAdjuster, format, list) : createTsExtractor(this.payloadReaderFactoryFlags, this.exposeCea608WhenMissingDeclarations, format, list, timestampAdjuster);
    }

    private static FragmentedMp4Extractor createFragmentedMp4Extractor(TimestampAdjuster timestampAdjuster, Format format, @Nullable List<Format> list) {
        int i = isFmp4Variant(format) ? 4 : 0;
        if (list == null) {
            list = Collections.emptyList();
        }
        return new FragmentedMp4Extractor(i, timestampAdjuster, null, list);
    }

    private static TsExtractor createTsExtractor(int i, boolean z, Format format, @Nullable List<Format> list, TimestampAdjuster timestampAdjuster) {
        int i2 = i | 16;
        if (list != null) {
            i2 = i | 48;
        } else {
            list = z ? Collections.singletonList(Format.createTextSampleFormat(null, MimeTypes.APPLICATION_CEA608, 0, null)) : Collections.emptyList();
        }
        String str = format.codecs;
        if (!TextUtils.isEmpty(str)) {
            if (!MimeTypes.AUDIO_AAC.equals(MimeTypes.getAudioMediaMimeType(str))) {
                i2 |= 2;
            }
            if (!MimeTypes.VIDEO_H264.equals(MimeTypes.getVideoMediaMimeType(str))) {
                i2 |= 4;
            }
        }
        return new TsExtractor(2, timestampAdjuster, new DefaultTsPayloadReaderFactory(i2, list));
    }

    private static boolean isFmp4Variant(Format format) {
        Metadata metadata = format.metadata;
        if (metadata == null) {
            return false;
        }
        for (int i = 0; i < metadata.length(); i++) {
            Metadata.Entry entry = metadata.get(i);
            if (entry instanceof HlsTrackMetadataEntry) {
                return !((HlsTrackMetadataEntry) entry).variantInfos.isEmpty();
            }
        }
        return false;
    }

    private static boolean isReusable(Extractor extractor) {
        return (extractor instanceof TsExtractor) || (extractor instanceof FragmentedMp4Extractor);
    }

    private static boolean sniffQuietly(Extractor extractor, ExtractorInput extractorInput) throws InterruptedException, IOException {
        try {
            return extractor.sniff(extractorInput);
        } catch (EOFException unused) {
            return false;
        } finally {
            extractorInput.resetPeekPosition();
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsExtractorFactory
    public HlsExtractorFactory.Result createExtractor(@Nullable Extractor extractor, Uri uri, Format format, @Nullable List<Format> list, TimestampAdjuster timestampAdjuster, Map<String, List<String>> map, ExtractorInput extractorInput) throws InterruptedException, IOException {
        if (extractor != null) {
            if (isReusable(extractor)) {
                return buildResult(extractor);
            }
            if (buildResultForSameExtractorType(extractor, format, timestampAdjuster) == null) {
                throw new IllegalArgumentException("Unexpected previousExtractor type: ".concat(extractor.getClass().getSimpleName()));
            }
        }
        Extractor extractorCreateExtractorByFileExtension = createExtractorByFileExtension(uri, format, list, timestampAdjuster);
        extractorInput.resetPeekPosition();
        if (sniffQuietly(extractorCreateExtractorByFileExtension, extractorInput)) {
            return buildResult(extractorCreateExtractorByFileExtension);
        }
        if (!(extractorCreateExtractorByFileExtension instanceof WebvttExtractor)) {
            WebvttExtractor webvttExtractor = new WebvttExtractor(format.language, timestampAdjuster);
            if (sniffQuietly(webvttExtractor, extractorInput)) {
                return buildResult(webvttExtractor);
            }
        }
        if (!(extractorCreateExtractorByFileExtension instanceof AdtsExtractor)) {
            AdtsExtractor adtsExtractor = new AdtsExtractor();
            if (sniffQuietly(adtsExtractor, extractorInput)) {
                return buildResult(adtsExtractor);
            }
        }
        if (!(extractorCreateExtractorByFileExtension instanceof Ac3Extractor)) {
            Ac3Extractor ac3Extractor = new Ac3Extractor();
            if (sniffQuietly(ac3Extractor, extractorInput)) {
                return buildResult(ac3Extractor);
            }
        }
        if (!(extractorCreateExtractorByFileExtension instanceof Ac4Extractor)) {
            Ac4Extractor ac4Extractor = new Ac4Extractor();
            if (sniffQuietly(ac4Extractor, extractorInput)) {
                return buildResult(ac4Extractor);
            }
        }
        if (!(extractorCreateExtractorByFileExtension instanceof Mp3Extractor)) {
            Mp3Extractor mp3Extractor = new Mp3Extractor(0, 0L);
            if (sniffQuietly(mp3Extractor, extractorInput)) {
                return buildResult(mp3Extractor);
            }
        }
        if (!(extractorCreateExtractorByFileExtension instanceof FragmentedMp4Extractor)) {
            FragmentedMp4Extractor fragmentedMp4ExtractorCreateFragmentedMp4Extractor = createFragmentedMp4Extractor(timestampAdjuster, format, list);
            if (sniffQuietly(fragmentedMp4ExtractorCreateFragmentedMp4Extractor, extractorInput)) {
                return buildResult(fragmentedMp4ExtractorCreateFragmentedMp4Extractor);
            }
        }
        if (!(extractorCreateExtractorByFileExtension instanceof TsExtractor)) {
            TsExtractor tsExtractorCreateTsExtractor = createTsExtractor(this.payloadReaderFactoryFlags, this.exposeCea608WhenMissingDeclarations, format, list, timestampAdjuster);
            if (sniffQuietly(tsExtractorCreateTsExtractor, extractorInput)) {
                return buildResult(tsExtractorCreateTsExtractor);
            }
        }
        return buildResult(extractorCreateExtractorByFileExtension);
    }

    public DefaultHlsExtractorFactory(int i, boolean z) {
        this.payloadReaderFactoryFlags = i;
        this.exposeCea608WhenMissingDeclarations = z;
    }
}
