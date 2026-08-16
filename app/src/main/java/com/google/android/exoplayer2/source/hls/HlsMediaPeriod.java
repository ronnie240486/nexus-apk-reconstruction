package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class HlsMediaPeriod implements MediaPeriod, HlsSampleStreamWrapper.Callback, HlsPlaylistTracker.PlaylistEventListener {
    private final Allocator allocator;
    private final boolean allowChunklessPreparation;

    @Nullable
    private MediaPeriod.Callback callback;
    private SequenceableLoader compositeSequenceableLoader;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private final HlsDataSourceFactory dataSourceFactory;
    private final DrmSessionManager<?> drmSessionManager;
    private final MediaSourceEventListener.EventDispatcher eventDispatcher;
    private final HlsExtractorFactory extractorFactory;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;

    @Nullable
    private final TransferListener mediaTransferListener;
    private final int metadataType;
    private boolean notifiedReadingStarted;
    private int pendingPrepareCount;
    private final HlsPlaylistTracker playlistTracker;
    private TrackGroupArray trackGroups;
    private final boolean useSessionKeys;
    private final IdentityHashMap<SampleStream, Integer> streamWrapperIndices = new IdentityHashMap<>();
    private final TimestampAdjusterProvider timestampAdjusterProvider = new TimestampAdjusterProvider();
    private HlsSampleStreamWrapper[] sampleStreamWrappers = new HlsSampleStreamWrapper[0];
    private HlsSampleStreamWrapper[] enabledSampleStreamWrappers = new HlsSampleStreamWrapper[0];
    private int[][] manifestUrlIndicesPerWrapper = new int[0][];

    public HlsMediaPeriod(HlsExtractorFactory hlsExtractorFactory, HlsPlaylistTracker hlsPlaylistTracker, HlsDataSourceFactory hlsDataSourceFactory, @Nullable TransferListener transferListener, DrmSessionManager<?> drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher, Allocator allocator, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, boolean z, int i, boolean z2) {
        this.extractorFactory = hlsExtractorFactory;
        this.playlistTracker = hlsPlaylistTracker;
        this.dataSourceFactory = hlsDataSourceFactory;
        this.mediaTransferListener = transferListener;
        this.drmSessionManager = drmSessionManager;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.eventDispatcher = eventDispatcher;
        this.allocator = allocator;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.allowChunklessPreparation = z;
        this.metadataType = i;
        this.useSessionKeys = z2;
        this.compositeSequenceableLoader = compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(new SequenceableLoader[0]);
        eventDispatcher.mediaPeriodCreated();
    }

    private void buildAndPrepareAudioSampleStreamWrappers(long j, List<HlsMasterPlaylist.Rendition> list, List<HlsSampleStreamWrapper> list2, List<int[]> list3, Map<String, DrmInitData> map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i).name;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z = true;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (Util.areEqual(str, list.get(i2).name)) {
                        HlsMasterPlaylist.Rendition rendition = list.get(i2);
                        arrayList3.add(Integer.valueOf(i2));
                        arrayList.add(rendition.url);
                        arrayList2.add(rendition.format);
                        z &= rendition.format.codecs != null;
                    }
                }
                HlsSampleStreamWrapper hlsSampleStreamWrapperBuildSampleStreamWrapper = buildSampleStreamWrapper(1, (Uri[]) arrayList.toArray(Util.castNonNullTypeArray(new Uri[0])), (Format[]) arrayList2.toArray(new Format[0]), null, Collections.emptyList(), map, j);
                list3.add(Util.toArray(arrayList3));
                list2.add(hlsSampleStreamWrapperBuildSampleStreamWrapper);
                if (this.allowChunklessPreparation && z) {
                    hlsSampleStreamWrapperBuildSampleStreamWrapper.prepareWithMasterPlaylistInfo(new TrackGroup[]{new TrackGroup((Format[]) arrayList2.toArray(new Format[0]))}, 0, new int[0]);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    private void buildAndPrepareMainSampleStreamWrapper(HlsMasterPlaylist hlsMasterPlaylist, long j, List<HlsSampleStreamWrapper> list, List<int[]> list2, Map<String, DrmInitData> map) {
        boolean z;
        boolean z2;
        Uri[] uriArr;
        Format[] formatArr;
        int[] iArr;
        int i;
        int i2;
        int size = hlsMasterPlaylist.variants.size();
        int[] iArr2 = new int[size];
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < hlsMasterPlaylist.variants.size(); i5++) {
            Format format = hlsMasterPlaylist.variants.get(i5).format;
            if (format.height > 0 || Util.getCodecsOfType(format.codecs, 2) != null) {
                iArr2[i5] = 2;
                i3++;
            } else if (Util.getCodecsOfType(format.codecs, 1) != null) {
                iArr2[i5] = 1;
                i4++;
            } else {
                iArr2[i5] = -1;
            }
        }
        if (i3 <= 0) {
            if (i4 < size) {
                size -= i4;
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            uriArr = new Uri[size];
            formatArr = new Format[size];
            iArr = new int[size];
            i2 = 0;
            for (i = 0; i < hlsMasterPlaylist.variants.size(); i++) {
                if ((z || iArr2[i] == 2) && (!z2 || iArr2[i] != 1)) {
                    HlsMasterPlaylist.Variant variant = hlsMasterPlaylist.variants.get(i);
                    uriArr[i2] = variant.url;
                    formatArr[i2] = variant.format;
                    iArr[i2] = i;
                    i2++;
                }
            }
            String str = formatArr[0].codecs;
            HlsSampleStreamWrapper hlsSampleStreamWrapperBuildSampleStreamWrapper = buildSampleStreamWrapper(0, uriArr, formatArr, hlsMasterPlaylist.muxedAudioFormat, hlsMasterPlaylist.muxedCaptionFormats, map, j);
            list.add(hlsSampleStreamWrapperBuildSampleStreamWrapper);
            list2.add(iArr);
            if (this.allowChunklessPreparation || str == null) {
            }
            boolean z3 = Util.getCodecsOfType(str, 2) != null;
            boolean z4 = Util.getCodecsOfType(str, 1) != null;
            ArrayList arrayList = new ArrayList();
            if (z3) {
                Format[] formatArr2 = new Format[size];
                for (int i6 = 0; i6 < size; i6++) {
                    formatArr2[i6] = deriveVideoFormat(formatArr[i6]);
                }
                arrayList.add(new TrackGroup(formatArr2));
                if (z4 && (hlsMasterPlaylist.muxedAudioFormat != null || hlsMasterPlaylist.audios.isEmpty())) {
                    arrayList.add(new TrackGroup(deriveAudioFormat(formatArr[0], hlsMasterPlaylist.muxedAudioFormat, false)));
                }
                List<Format> list3 = hlsMasterPlaylist.muxedCaptionFormats;
                if (list3 != null) {
                    for (int i7 = 0; i7 < list3.size(); i7++) {
                        arrayList.add(new TrackGroup(list3.get(i7)));
                    }
                }
            } else {
                if (!z4) {
                    throw new IllegalArgumentException("Unexpected codecs attribute: ".concat(str));
                }
                Format[] formatArr3 = new Format[size];
                for (int i8 = 0; i8 < size; i8++) {
                    formatArr3[i8] = deriveAudioFormat(formatArr[i8], hlsMasterPlaylist.muxedAudioFormat, true);
                }
                arrayList.add(new TrackGroup(formatArr3));
            }
            TrackGroup trackGroup = new TrackGroup(Format.createSampleFormat("ID3", MimeTypes.APPLICATION_ID3, null, -1, null));
            arrayList.add(trackGroup);
            hlsSampleStreamWrapperBuildSampleStreamWrapper.prepareWithMasterPlaylistInfo((TrackGroup[]) arrayList.toArray(new TrackGroup[0]), 0, arrayList.indexOf(trackGroup));
            return;
        }
        size = i3;
        z = true;
        z2 = false;
        uriArr = new Uri[size];
        formatArr = new Format[size];
        iArr = new int[size];
        i2 = 0;
        while (i < hlsMasterPlaylist.variants.size()) {
            if (z) {
                HlsMasterPlaylist.Variant variant2 = hlsMasterPlaylist.variants.get(i);
                uriArr[i2] = variant2.url;
                formatArr[i2] = variant2.format;
                iArr[i2] = i;
                i2++;
            } else {
                HlsMasterPlaylist.Variant variant3 = hlsMasterPlaylist.variants.get(i);
                uriArr[i2] = variant3.url;
                formatArr[i2] = variant3.format;
                iArr[i2] = i;
                i2++;
            }
        }
        String str2 = formatArr[0].codecs;
        HlsSampleStreamWrapper hlsSampleStreamWrapperBuildSampleStreamWrapper2 = buildSampleStreamWrapper(0, uriArr, formatArr, hlsMasterPlaylist.muxedAudioFormat, hlsMasterPlaylist.muxedCaptionFormats, map, j);
        list.add(hlsSampleStreamWrapperBuildSampleStreamWrapper2);
        list2.add(iArr);
        if (this.allowChunklessPreparation) {
        }
    }

    private void buildAndPrepareSampleStreamWrappers(long j) {
        char c = 0;
        HlsMasterPlaylist hlsMasterPlaylist = (HlsMasterPlaylist) Assertions.checkNotNull(this.playlistTracker.getMasterPlaylist());
        Map<String, DrmInitData> mapDeriveOverridingDrmInitData = this.useSessionKeys ? deriveOverridingDrmInitData(hlsMasterPlaylist.sessionKeyDrmInitData) : Collections.emptyMap();
        boolean z = !hlsMasterPlaylist.variants.isEmpty();
        List<HlsMasterPlaylist.Rendition> list = hlsMasterPlaylist.audios;
        List<HlsMasterPlaylist.Rendition> list2 = hlsMasterPlaylist.subtitles;
        this.pendingPrepareCount = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            buildAndPrepareMainSampleStreamWrapper(hlsMasterPlaylist, j, arrayList, arrayList2, mapDeriveOverridingDrmInitData);
        }
        buildAndPrepareAudioSampleStreamWrappers(j, list, arrayList, arrayList2, mapDeriveOverridingDrmInitData);
        int i = 0;
        while (i < list2.size()) {
            HlsMasterPlaylist.Rendition rendition = list2.get(i);
            Uri[] uriArr = new Uri[1];
            uriArr[c] = rendition.url;
            Format[] formatArr = new Format[1];
            formatArr[c] = rendition.format;
            int i2 = i;
            HlsSampleStreamWrapper hlsSampleStreamWrapperBuildSampleStreamWrapper = buildSampleStreamWrapper(3, uriArr, formatArr, null, Collections.emptyList(), mapDeriveOverridingDrmInitData, j);
            arrayList2.add(new int[]{i2});
            arrayList.add(hlsSampleStreamWrapperBuildSampleStreamWrapper);
            hlsSampleStreamWrapperBuildSampleStreamWrapper.prepareWithMasterPlaylistInfo(new TrackGroup[]{new TrackGroup(rendition.format)}, 0, new int[0]);
            i = i2 + 1;
            c = 0;
        }
        this.sampleStreamWrappers = (HlsSampleStreamWrapper[]) arrayList.toArray(new HlsSampleStreamWrapper[0]);
        this.manifestUrlIndicesPerWrapper = (int[][]) arrayList2.toArray(new int[0][]);
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = this.sampleStreamWrappers;
        this.pendingPrepareCount = hlsSampleStreamWrapperArr.length;
        hlsSampleStreamWrapperArr[0].setIsTimestampMaster(true);
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.continuePreparing();
        }
        this.enabledSampleStreamWrappers = this.sampleStreamWrappers;
    }

    private HlsSampleStreamWrapper buildSampleStreamWrapper(int i, Uri[] uriArr, Format[] formatArr, @Nullable Format format, @Nullable List<Format> list, Map<String, DrmInitData> map, long j) {
        return new HlsSampleStreamWrapper(i, this, new HlsChunkSource(this.extractorFactory, this.playlistTracker, uriArr, formatArr, this.dataSourceFactory, this.mediaTransferListener, this.timestampAdjusterProvider, list), map, this.allocator, j, format, this.drmSessionManager, this.loadErrorHandlingPolicy, this.eventDispatcher, this.metadataType);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    /* JADX WARN: Code duplicated, block: B:13:0x004e  */
    private static Format deriveAudioFormat(Format format, @Nullable Format format2, boolean z) {
        String codecsOfType;
        Metadata metadata;
        String str;
        Metadata metadata2;
        String str2;
        String str3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str4;
        String str5;
        int i7;
        if (format2 == null) {
            codecsOfType = Util.getCodecsOfType(format.codecs, 1);
            metadata = format.metadata;
            if (z) {
                i4 = format.channelCount;
                i5 = format.selectionFlags;
                i6 = format.roleFlags;
                str4 = format.language;
                str5 = format.label;
            } else {
                str = codecsOfType;
                metadata2 = metadata;
                str2 = null;
                str3 = null;
                i = -1;
                i2 = 0;
                i3 = 0;
            }
            String mediaMimeType = MimeTypes.getMediaMimeType(str);
            if (z) {
                i7 = format.bitrate;
            } else {
                i7 = -1;
            }
            return Format.createAudioContainerFormat(format.f11055id, str2, format.containerMimeType, mediaMimeType, str, metadata2, i7, i, -1, null, i2, i3, str3);
        }
        codecsOfType = format2.codecs;
        metadata = format2.metadata;
        i4 = format2.channelCount;
        i5 = format2.selectionFlags;
        i6 = format2.roleFlags;
        str4 = format2.language;
        str5 = format2.label;
        str2 = str5;
        str = codecsOfType;
        metadata2 = metadata;
        i = i4;
        i2 = i5;
        i3 = i6;
        str3 = str4;
        String mediaMimeType2 = MimeTypes.getMediaMimeType(str);
        if (z) {
            i7 = format.bitrate;
        } else {
            i7 = -1;
        }
        return Format.createAudioContainerFormat(format.f11055id, str2, format.containerMimeType, mediaMimeType2, str, metadata2, i7, i, -1, null, i2, i3, str3);
    }

    private static Map<String, DrmInitData> deriveOverridingDrmInitData(List<DrmInitData> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap map = new HashMap();
        int i = 0;
        while (i < arrayList.size()) {
            DrmInitData drmInitDataMerge = list.get(i);
            String str = drmInitDataMerge.schemeType;
            i++;
            int i2 = i;
            while (i2 < arrayList.size()) {
                DrmInitData drmInitData = (DrmInitData) arrayList.get(i2);
                if (TextUtils.equals(drmInitData.schemeType, str)) {
                    drmInitDataMerge = drmInitDataMerge.merge(drmInitData);
                    arrayList.remove(i2);
                } else {
                    i2++;
                }
            }
            map.put(str, drmInitDataMerge);
        }
        return map;
    }

    private static Format deriveVideoFormat(Format format) {
        String codecsOfType = Util.getCodecsOfType(format.codecs, 2);
        return Format.createVideoContainerFormat(format.f11055id, format.label, format.containerMimeType, MimeTypes.getMediaMimeType(codecsOfType), codecsOfType, format.metadata, format.bitrate, format.width, format.height, format.frameRate, null, format.selectionFlags, format.roleFlags);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long j) {
        if (this.trackGroups != null) {
            return this.compositeSequenceableLoader.continueLoading(j);
        }
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.continuePreparing();
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long j, boolean z) {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.enabledSampleStreamWrappers) {
            hlsSampleStreamWrapper.discardBuffer(j, z);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        return j;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.compositeSequenceableLoader.getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.compositeSequenceableLoader.getNextLoadPositionUs();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public List<StreamKey> getStreamKeys(List<TrackSelection> list) {
        int[] iArr;
        TrackGroupArray trackGroups;
        int primaryTrackGroupIndex;
        HlsMediaPeriod hlsMediaPeriod = this;
        HlsMasterPlaylist hlsMasterPlaylist = (HlsMasterPlaylist) Assertions.checkNotNull(hlsMediaPeriod.playlistTracker.getMasterPlaylist());
        boolean z = !hlsMasterPlaylist.variants.isEmpty();
        int length = hlsMediaPeriod.sampleStreamWrappers.length - hlsMasterPlaylist.subtitles.size();
        int i = 0;
        if (z) {
            HlsSampleStreamWrapper hlsSampleStreamWrapper = hlsMediaPeriod.sampleStreamWrappers[0];
            iArr = hlsMediaPeriod.manifestUrlIndicesPerWrapper[0];
            trackGroups = hlsSampleStreamWrapper.getTrackGroups();
            primaryTrackGroupIndex = hlsSampleStreamWrapper.getPrimaryTrackGroupIndex();
        } else {
            iArr = new int[0];
            trackGroups = TrackGroupArray.EMPTY;
            primaryTrackGroupIndex = 0;
        }
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        boolean z3 = false;
        for (TrackSelection trackSelection : list) {
            TrackGroup trackGroup = trackSelection.getTrackGroup();
            int iIndexOf = trackGroups.indexOf(trackGroup);
            if (iIndexOf == -1) {
                ?? r15 = z;
                while (true) {
                    HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = hlsMediaPeriod.sampleStreamWrappers;
                    if (r15 >= hlsSampleStreamWrapperArr.length) {
                        break;
                    }
                    if (hlsSampleStreamWrapperArr[r15].getTrackGroups().indexOf(trackGroup) != -1) {
                        int i2 = r15 < length ? 1 : 2;
                        int[] iArr2 = hlsMediaPeriod.manifestUrlIndicesPerWrapper[r15];
                        for (int i3 = 0; i3 < trackSelection.length(); i3++) {
                            arrayList.add(new StreamKey(i2, iArr2[trackSelection.getIndexInTrackGroup(i3)]));
                        }
                        break;
                    }
                    hlsMediaPeriod = this;
                    r15++;
                }
            } else if (iIndexOf == primaryTrackGroupIndex) {
                for (int i4 = 0; i4 < trackSelection.length(); i4++) {
                    arrayList.add(new StreamKey(i, iArr[trackSelection.getIndexInTrackGroup(i4)]));
                }
                z3 = true;
            } else {
                z2 = true;
            }
            hlsMediaPeriod = this;
            i = 0;
        }
        if (z2 && !z3) {
            int i5 = iArr[0];
            int i6 = hlsMasterPlaylist.variants.get(i5).format.bitrate;
            for (int i7 = 1; i7 < iArr.length; i7++) {
                int i8 = hlsMasterPlaylist.variants.get(iArr[i7]).format.bitrate;
                if (i8 < i6) {
                    i5 = iArr[i7];
                    i6 = i8;
                }
            }
            arrayList.add(new StreamKey(0, i5));
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return (TrackGroupArray) Assertions.checkNotNull(this.trackGroups);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.compositeSequenceableLoader.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.maybeThrowPrepareError();
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
    public void onPlaylistChanged() {
        this.callback.onContinueLoadingRequested(this);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
    public boolean onPlaylistError(Uri uri, long j) {
        boolean zOnPlaylistError = true;
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            zOnPlaylistError &= hlsSampleStreamWrapper.onPlaylistError(uri, j);
        }
        this.callback.onContinueLoadingRequested(this);
        return zOnPlaylistError;
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.Callback
    public void onPlaylistRefreshRequired(Uri uri) {
        this.playlistTracker.refreshPlaylist(uri);
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.Callback
    public void onPrepared() {
        int i = this.pendingPrepareCount - 1;
        this.pendingPrepareCount = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            i2 += hlsSampleStreamWrapper.getTrackGroups().length;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[i2];
        int i3 = 0;
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper2 : this.sampleStreamWrappers) {
            int i4 = hlsSampleStreamWrapper2.getTrackGroups().length;
            int i5 = 0;
            while (i5 < i4) {
                trackGroupArr[i3] = hlsSampleStreamWrapper2.getTrackGroups().get(i5);
                i5++;
                i3++;
            }
        }
        this.trackGroups = new TrackGroupArray(trackGroupArr);
        this.callback.onPrepared(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        this.playlistTracker.addListener(this);
        buildAndPrepareSampleStreamWrappers(j);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        if (this.notifiedReadingStarted) {
            return C3219C.TIME_UNSET;
        }
        this.eventDispatcher.readingStarted();
        this.notifiedReadingStarted = true;
        return C3219C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long j) {
        this.compositeSequenceableLoader.reevaluateBuffer(j);
    }

    public void release() {
        this.playlistTracker.removeListener(this);
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.sampleStreamWrappers) {
            hlsSampleStreamWrapper.release();
        }
        this.callback = null;
        this.eventDispatcher.mediaPeriodReleased();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long j) {
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = this.enabledSampleStreamWrappers;
        if (hlsSampleStreamWrapperArr.length > 0) {
            boolean zSeekToUs = hlsSampleStreamWrapperArr[0].seekToUs(j, false);
            int i = 1;
            while (true) {
                HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr2 = this.enabledSampleStreamWrappers;
                if (i >= hlsSampleStreamWrapperArr2.length) {
                    break;
                }
                hlsSampleStreamWrapperArr2[i].seekToUs(j, zSeekToUs);
                i++;
            }
            if (zSeekToUs) {
                this.timestampAdjusterProvider.reset();
            }
        }
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00e0  */
    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(TrackSelection[] trackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        SampleStream[] sampleStreamArr2 = sampleStreamArr;
        int[] iArr = new int[trackSelectionArr.length];
        int[] iArr2 = new int[trackSelectionArr.length];
        for (int i = 0; i < trackSelectionArr.length; i++) {
            SampleStream sampleStream = sampleStreamArr2[i];
            iArr[i] = sampleStream == null ? -1 : this.streamWrapperIndices.get(sampleStream).intValue();
            iArr2[i] = -1;
            TrackSelection trackSelection = trackSelectionArr[i];
            if (trackSelection != null) {
                TrackGroup trackGroup = trackSelection.getTrackGroup();
                int i2 = 0;
                while (true) {
                    HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = this.sampleStreamWrappers;
                    if (i2 >= hlsSampleStreamWrapperArr.length) {
                        break;
                    }
                    if (hlsSampleStreamWrapperArr[i2].getTrackGroups().indexOf(trackGroup) != -1) {
                        iArr2[i] = i2;
                        break;
                    }
                    i2++;
                }
            }
        }
        this.streamWrapperIndices.clear();
        int length = trackSelectionArr.length;
        SampleStream[] sampleStreamArr3 = new SampleStream[length];
        SampleStream[] sampleStreamArr4 = new SampleStream[trackSelectionArr.length];
        TrackSelection[] trackSelectionArr2 = new TrackSelection[trackSelectionArr.length];
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr2 = new HlsSampleStreamWrapper[this.sampleStreamWrappers.length];
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        while (i4 < this.sampleStreamWrappers.length) {
            for (int i5 = 0; i5 < trackSelectionArr.length; i5++) {
                TrackSelection trackSelection2 = null;
                sampleStreamArr4[i5] = iArr[i5] == i4 ? sampleStreamArr2[i5] : null;
                if (iArr2[i5] == i4) {
                    trackSelection2 = trackSelectionArr[i5];
                }
                trackSelectionArr2[i5] = trackSelection2;
            }
            HlsSampleStreamWrapper hlsSampleStreamWrapper = this.sampleStreamWrappers[i4];
            int i6 = i3;
            int i7 = length;
            int i8 = i4;
            TrackSelection[] trackSelectionArr3 = trackSelectionArr2;
            HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr3 = hlsSampleStreamWrapperArr2;
            boolean zSelectTracks = hlsSampleStreamWrapper.selectTracks(trackSelectionArr2, zArr, sampleStreamArr4, zArr2, j, z);
            int i9 = 0;
            boolean z2 = false;
            while (true) {
                if (i9 >= trackSelectionArr.length) {
                    break;
                }
                SampleStream sampleStream2 = sampleStreamArr4[i9];
                if (iArr2[i9] == i8) {
                    Assertions.checkNotNull(sampleStream2);
                    sampleStreamArr3[i9] = sampleStream2;
                    this.streamWrapperIndices.put(sampleStream2, Integer.valueOf(i8));
                    z2 = true;
                } else if (iArr[i9] == i8) {
                    Assertions.checkState(sampleStream2 == null);
                }
                i9++;
            }
            if (z2) {
                hlsSampleStreamWrapperArr3[i6] = hlsSampleStreamWrapper;
                i3 = i6 + 1;
                if (i6 == 0) {
                    hlsSampleStreamWrapper.setIsTimestampMaster(true);
                    if (zSelectTracks) {
                        this.timestampAdjusterProvider.reset();
                        z = true;
                    } else {
                        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr4 = this.enabledSampleStreamWrappers;
                        if (hlsSampleStreamWrapperArr4.length != 0) {
                            if (hlsSampleStreamWrapper != hlsSampleStreamWrapperArr4[0]) {
                            }
                        }
                        this.timestampAdjusterProvider.reset();
                        z = true;
                    }
                } else {
                    hlsSampleStreamWrapper.setIsTimestampMaster(false);
                }
            } else {
                i3 = i6;
            }
            i4 = i8 + 1;
            sampleStreamArr2 = sampleStreamArr;
            hlsSampleStreamWrapperArr2 = hlsSampleStreamWrapperArr3;
            length = i7;
            trackSelectionArr2 = trackSelectionArr3;
        }
        System.arraycopy(sampleStreamArr3, 0, sampleStreamArr2, 0, length);
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr5 = (HlsSampleStreamWrapper[]) Util.nullSafeArrayCopy(hlsSampleStreamWrapperArr2, i3);
        this.enabledSampleStreamWrappers = hlsSampleStreamWrapperArr5;
        this.compositeSequenceableLoader = this.compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(hlsSampleStreamWrapperArr5);
        return j;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(HlsSampleStreamWrapper hlsSampleStreamWrapper) {
        this.callback.onContinueLoadingRequested(this);
    }
}
