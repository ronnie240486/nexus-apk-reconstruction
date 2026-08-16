package com.google.android.exoplayer2.source.dash.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.offline.DownloadException;
import com.google.android.exoplayer2.offline.DownloaderConstructorHelper;
import com.google.android.exoplayer2.offline.SegmentDownloader;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import com.google.android.exoplayer2.source.dash.DashUtil;
import com.google.android.exoplayer2.source.dash.DashWrappingSegmentIndex;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.DashManifestParser;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class DashDownloader extends SegmentDownloader<DashManifest> {
    public DashDownloader(Uri uri, List<StreamKey> list, DownloaderConstructorHelper downloaderConstructorHelper) {
        super(uri, list, downloaderConstructorHelper);
    }

    private static void addSegment(long j, String str, RangedUri rangedUri, ArrayList<SegmentDownloader.Segment> arrayList) {
        arrayList.add(new SegmentDownloader.Segment(j, new DataSpec(rangedUri.resolveUri(str), rangedUri.start, rangedUri.length, null)));
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x007d A[SYNTHETIC] */
    private static void addSegmentsForAdaptationSet(DataSource dataSource, AdaptationSet adaptationSet, long j, long j2, boolean z, ArrayList<SegmentDownloader.Segment> arrayList) throws InterruptedException, IOException {
        for (int i = 0; i < adaptationSet.representations.size(); i++) {
            Representation representation = adaptationSet.representations.get(i);
            try {
                try {
                    DashSegmentIndex segmentIndex = getSegmentIndex(dataSource, adaptationSet.type, representation);
                    if (segmentIndex != null) {
                        int segmentCount = segmentIndex.getSegmentCount(j2);
                        if (segmentCount == -1) {
                            throw new DownloadException("Unbounded segment index");
                        }
                        String str = representation.baseUrl;
                        RangedUri initializationUri = representation.getInitializationUri();
                        if (initializationUri != null) {
                            addSegment(j, str, initializationUri, arrayList);
                        }
                        RangedUri indexUri = representation.getIndexUri();
                        if (indexUri != null) {
                            addSegment(j, str, indexUri, arrayList);
                        }
                        long firstSegmentNum = segmentIndex.getFirstSegmentNum();
                        long j3 = (((long) segmentCount) + firstSegmentNum) - 1;
                        while (firstSegmentNum <= j3) {
                            addSegment(segmentIndex.getTimeUs(firstSegmentNum) + j, str, segmentIndex.getSegmentUrl(firstSegmentNum), arrayList);
                            firstSegmentNum++;
                        }
                    } else {
                        try {
                            throw new DownloadException("Missing segment index");
                        } catch (IOException e) {
                            e = e;
                            if (z) {
                                throw e;
                            }
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    if (z) {
                        throw e;
                    }
                }
            } catch (IOException e3) {
                e = e3;
            }
        }
    }

    @Nullable
    private static DashSegmentIndex getSegmentIndex(DataSource dataSource, int i, Representation representation) throws InterruptedException, IOException {
        DashSegmentIndex index = representation.getIndex();
        if (index != null) {
            return index;
        }
        ChunkIndex chunkIndexLoadChunkIndex = DashUtil.loadChunkIndex(dataSource, i, representation);
        if (chunkIndexLoadChunkIndex == null) {
            return null;
        }
        return new DashWrappingSegmentIndex(chunkIndexLoadChunkIndex, representation.presentationTimeOffsetUs);
    }

    @Override // com.google.android.exoplayer2.offline.SegmentDownloader
    public DashManifest getManifest(DataSource dataSource, DataSpec dataSpec) throws IOException {
        return (DashManifest) ParsingLoadable.load(dataSource, new DashManifestParser(), dataSpec, 4);
    }

    @Override // com.google.android.exoplayer2.offline.SegmentDownloader
    public List<SegmentDownloader.Segment> getSegments(DataSource dataSource, DashManifest dashManifest, boolean z) throws InterruptedException, IOException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < dashManifest.getPeriodCount(); i++) {
            Period period = dashManifest.getPeriod(i);
            long jMsToUs = C3219C.msToUs(period.startMs);
            long periodDurationUs = dashManifest.getPeriodDurationUs(i);
            int i2 = 0;
            for (List<AdaptationSet> list = period.adaptationSets; i2 < list.size(); list = list) {
                addSegmentsForAdaptationSet(dataSource, list.get(i2), jMsToUs, periodDurationUs, z, arrayList);
                i2++;
            }
        }
        return arrayList;
    }
}
