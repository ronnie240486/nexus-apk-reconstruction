package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.offline.FilteringManifestParser;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.DefaultCompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.DashManifestParser;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.UtcTimingElement;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.Marker;
import p000.C0499Hg;

/* JADX INFO: loaded from: classes2.dex */
public final class DashMediaSource extends BaseMediaSource {

    @Deprecated
    public static final long DEFAULT_LIVE_PRESENTATION_DELAY_FIXED_MS = 30000;
    public static final long DEFAULT_LIVE_PRESENTATION_DELAY_MS = 30000;

    @Deprecated
    public static final long DEFAULT_LIVE_PRESENTATION_DELAY_PREFER_MANIFEST_MS = -1;
    private static final long MIN_LIVE_DEFAULT_START_POSITION_US = 5000000;
    private static final int NOTIFY_MANIFEST_INTERVAL_MS = 5000;
    private static final String TAG = "DashMediaSource";
    private final DashChunkSource.Factory chunkSourceFactory;
    private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
    private DataSource dataSource;
    private final DrmSessionManager<?> drmSessionManager;
    private long elapsedRealtimeOffsetMs;
    private long expiredManifestPublishTimeUs;
    private int firstPeriodId;
    private Handler handler;
    private Uri initialManifestUri;
    private final long livePresentationDelayMs;
    private final boolean livePresentationDelayOverridesManifest;
    private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
    private Loader loader;
    private DashManifest manifest;
    private final ManifestCallback manifestCallback;
    private final DataSource.Factory manifestDataSourceFactory;
    private final MediaSourceEventListener.EventDispatcher manifestEventDispatcher;
    private IOException manifestFatalError;
    private long manifestLoadEndTimestampMs;
    private final LoaderErrorThrower manifestLoadErrorThrower;
    private boolean manifestLoadPending;
    private long manifestLoadStartTimestampMs;
    private final ParsingLoadable.Parser<? extends DashManifest> manifestParser;
    private Uri manifestUri;
    private final Object manifestUriLock;

    @Nullable
    private TransferListener mediaTransferListener;
    private final SparseArray<DashMediaPeriod> periodsById;
    private final PlayerEmsgHandler.PlayerEmsgCallback playerEmsgCallback;
    private final Runnable refreshManifestRunnable;
    private final boolean sideloadedManifest;
    private final Runnable simulateManifestRefreshRunnable;
    private int staleManifestReloadAttempt;

    @Nullable
    private final Object tag;

    public static final class DashTimeline extends Timeline {
        private final int firstPeriodId;
        private final DashManifest manifest;
        private final long offsetInFirstPeriodUs;
        private final long presentationStartTimeMs;
        private final long windowDefaultStartPositionUs;
        private final long windowDurationUs;
        private final long windowStartTimeMs;

        @Nullable
        private final Object windowTag;

        public DashTimeline(long j, long j2, int i, long j3, long j4, long j5, DashManifest dashManifest, @Nullable Object obj) {
            this.presentationStartTimeMs = j;
            this.windowStartTimeMs = j2;
            this.firstPeriodId = i;
            this.offsetInFirstPeriodUs = j3;
            this.windowDurationUs = j4;
            this.windowDefaultStartPositionUs = j5;
            this.manifest = dashManifest;
            this.windowTag = obj;
        }

        private long getAdjustedWindowDefaultStartPositionUs(long j) {
            DashSegmentIndex index;
            long j2 = this.windowDefaultStartPositionUs;
            if (!isMovingLiveWindow(this.manifest)) {
                return j2;
            }
            if (j > 0) {
                j2 += j;
                if (j2 > this.windowDurationUs) {
                    return C3219C.TIME_UNSET;
                }
            }
            long j3 = this.offsetInFirstPeriodUs + j2;
            long periodDurationUs = this.manifest.getPeriodDurationUs(0);
            int i = 0;
            while (i < this.manifest.getPeriodCount() - 1 && j3 >= periodDurationUs) {
                j3 -= periodDurationUs;
                i++;
                periodDurationUs = this.manifest.getPeriodDurationUs(i);
            }
            Period period = this.manifest.getPeriod(i);
            int adaptationSetIndex = period.getAdaptationSetIndex(2);
            return (adaptationSetIndex == -1 || (index = period.adaptationSets.get(adaptationSetIndex).representations.get(0).getIndex()) == null || index.getSegmentCount(periodDurationUs) == 0) ? j2 : (index.getTimeUs(index.getSegmentNum(j3, periodDurationUs)) + j2) - j3;
        }

        private static boolean isMovingLiveWindow(DashManifest dashManifest) {
            return dashManifest.dynamic && dashManifest.minUpdatePeriodMs != C3219C.TIME_UNSET && dashManifest.durationMs == C3219C.TIME_UNSET;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(Object obj) {
            int iIntValue;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.firstPeriodId) >= 0 && iIntValue < getPeriodCount()) {
                return iIntValue;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
            Assertions.checkIndex(i, 0, getPeriodCount());
            return period.set(z ? this.manifest.getPeriod(i).f11122id : null, z ? Integer.valueOf(this.firstPeriodId + i) : null, 0, this.manifest.getPeriodDurationUs(i), C3219C.msToUs(this.manifest.getPeriod(i).startMs - this.manifest.getPeriod(0).startMs) - this.offsetInFirstPeriodUs);
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
            return this.manifest.getPeriodCount();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Object getUidOfPeriod(int i) {
            Assertions.checkIndex(i, 0, getPeriodCount());
            return Integer.valueOf(this.firstPeriodId + i);
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Timeline.Window getWindow(int i, Timeline.Window window, long j) {
            Assertions.checkIndex(i, 0, 1);
            long adjustedWindowDefaultStartPositionUs = getAdjustedWindowDefaultStartPositionUs(j);
            Object obj = Timeline.Window.SINGLE_WINDOW_UID;
            Object obj2 = this.windowTag;
            DashManifest dashManifest = this.manifest;
            return window.set(obj, obj2, dashManifest, this.presentationStartTimeMs, this.windowStartTimeMs, true, isMovingLiveWindow(dashManifest), this.manifest.dynamic, adjustedWindowDefaultStartPositionUs, this.windowDurationUs, 0, getPeriodCount() - 1, this.offsetInFirstPeriodUs);
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
            return 1;
        }
    }

    public final class DefaultPlayerEmsgCallback implements PlayerEmsgHandler.PlayerEmsgCallback {
        private DefaultPlayerEmsgCallback() {
        }

        @Override // com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerEmsgCallback
        public void onDashManifestPublishTimeExpired(long j) {
            DashMediaSource.this.onDashManifestPublishTimeExpired(j);
        }

        @Override // com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerEmsgCallback
        public void onDashManifestRefreshRequested() {
            DashMediaSource.this.onDashManifestRefreshRequested();
        }
    }

    public static final class Factory implements MediaSourceFactory {
        private final DashChunkSource.Factory chunkSourceFactory;
        private CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
        private DrmSessionManager<?> drmSessionManager;
        private boolean isCreateCalled;
        private long livePresentationDelayMs;
        private boolean livePresentationDelayOverridesManifest;
        private LoadErrorHandlingPolicy loadErrorHandlingPolicy;

        @Nullable
        private final DataSource.Factory manifestDataSourceFactory;

        @Nullable
        private ParsingLoadable.Parser<? extends DashManifest> manifestParser;

        @Nullable
        private List<StreamKey> streamKeys;

        @Nullable
        private Object tag;

        public Factory(DashChunkSource.Factory factory, @Nullable DataSource.Factory factory2) {
            this.chunkSourceFactory = (DashChunkSource.Factory) Assertions.checkNotNull(factory);
            this.manifestDataSourceFactory = factory2;
            this.drmSessionManager = C0499Hg.m2391d();
            this.loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            this.livePresentationDelayMs = 30000L;
            this.compositeSequenceableLoaderFactory = new DefaultCompositeSequenceableLoaderFactory();
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public int[] getSupportedTypes() {
            return new int[]{0};
        }

        public Factory setCompositeSequenceableLoaderFactory(CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory) {
            Assertions.checkState(!this.isCreateCalled);
            this.compositeSequenceableLoaderFactory = (CompositeSequenceableLoaderFactory) Assertions.checkNotNull(compositeSequenceableLoaderFactory);
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public /* bridge */ /* synthetic */ MediaSourceFactory setDrmSessionManager(DrmSessionManager drmSessionManager) {
            return setDrmSessionManager((DrmSessionManager<?>) drmSessionManager);
        }

        @Deprecated
        public Factory setLivePresentationDelayMs(long j) {
            boolean z;
            if (j == -1) {
                j = 30000;
                z = false;
            } else {
                z = true;
            }
            return setLivePresentationDelayMs(j, z);
        }

        public Factory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            Assertions.checkState(!this.isCreateCalled);
            this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
            return this;
        }

        public Factory setManifestParser(ParsingLoadable.Parser<? extends DashManifest> parser) {
            Assertions.checkState(!this.isCreateCalled);
            this.manifestParser = (ParsingLoadable.Parser) Assertions.checkNotNull(parser);
            return this;
        }

        @Deprecated
        public Factory setMinLoadableRetryCount(int i) {
            return setLoadErrorHandlingPolicy(new DefaultLoadErrorHandlingPolicy(i));
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public /* bridge */ /* synthetic */ MediaSourceFactory setStreamKeys(List list) {
            return setStreamKeys((List<StreamKey>) list);
        }

        public Factory setTag(@Nullable Object obj) {
            Assertions.checkState(!this.isCreateCalled);
            this.tag = obj;
            return this;
        }

        public Factory(DataSource.Factory factory) {
            this(new DefaultDashChunkSource.Factory(factory), factory);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public DashMediaSource createMediaSource(Uri uri) {
            this.isCreateCalled = true;
            if (this.manifestParser == null) {
                this.manifestParser = new DashManifestParser();
            }
            List<StreamKey> list = this.streamKeys;
            if (list != null) {
                this.manifestParser = new FilteringManifestParser(this.manifestParser, list);
            }
            return new DashMediaSource(null, (Uri) Assertions.checkNotNull(uri), this.manifestDataSourceFactory, this.manifestParser, this.chunkSourceFactory, this.compositeSequenceableLoaderFactory, this.drmSessionManager, this.loadErrorHandlingPolicy, this.livePresentationDelayMs, this.livePresentationDelayOverridesManifest, this.tag);
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setDrmSessionManager(DrmSessionManager<?> drmSessionManager) {
            Assertions.checkState(!this.isCreateCalled);
            if (drmSessionManager == null) {
                drmSessionManager = C0499Hg.m2391d();
            }
            this.drmSessionManager = drmSessionManager;
            return this;
        }

        public Factory setLivePresentationDelayMs(long j, boolean z) {
            Assertions.checkState(!this.isCreateCalled);
            this.livePresentationDelayMs = j;
            this.livePresentationDelayOverridesManifest = z;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        public Factory setStreamKeys(List<StreamKey> list) {
            Assertions.checkState(!this.isCreateCalled);
            this.streamKeys = list;
            return this;
        }

        @Deprecated
        public DashMediaSource createMediaSource(Uri uri, @Nullable Handler handler, @Nullable MediaSourceEventListener mediaSourceEventListener) {
            DashMediaSource dashMediaSourceCreateMediaSource = createMediaSource(uri);
            if (handler != null && mediaSourceEventListener != null) {
                dashMediaSourceCreateMediaSource.addEventListener(handler, mediaSourceEventListener);
            }
            return dashMediaSourceCreateMediaSource;
        }

        public DashMediaSource createMediaSource(DashManifest dashManifest) {
            Assertions.checkArgument(!dashManifest.dynamic);
            this.isCreateCalled = true;
            List<StreamKey> list = this.streamKeys;
            if (list != null && !list.isEmpty()) {
                dashManifest = dashManifest.copy(this.streamKeys);
            }
            return new DashMediaSource(dashManifest, null, null, null, this.chunkSourceFactory, this.compositeSequenceableLoaderFactory, this.drmSessionManager, this.loadErrorHandlingPolicy, this.livePresentationDelayMs, this.livePresentationDelayOverridesManifest, this.tag);
        }

        @Deprecated
        public DashMediaSource createMediaSource(DashManifest dashManifest, @Nullable Handler handler, @Nullable MediaSourceEventListener mediaSourceEventListener) {
            DashMediaSource dashMediaSourceCreateMediaSource = createMediaSource(dashManifest);
            if (handler != null && mediaSourceEventListener != null) {
                dashMediaSourceCreateMediaSource.addEventListener(handler, mediaSourceEventListener);
            }
            return dashMediaSourceCreateMediaSource;
        }
    }

    public static final class Iso8601Parser implements ParsingLoadable.Parser<Long> {
        private static final Pattern TIMESTAMP_WITH_TIMEZONE_PATTERN = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
        public Long parse(Uri uri, InputStream inputStream) throws IOException {
            String line = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8"))).readLine();
            try {
                Matcher matcher = TIMESTAMP_WITH_TIMEZONE_PATTERN.matcher(line);
                if (!matcher.matches()) {
                    throw new ParserException("Couldn't parse timestamp: " + line);
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j = Marker.f17179z0.equals(matcher.group(4)) ? 1L : -1L;
                    long j2 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= (((j2 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000) * j;
                }
                return Long.valueOf(time);
            } catch (ParseException e) {
                throw new ParserException(e);
            }
        }
    }

    public final class ManifestCallback implements Loader.Callback<ParsingLoadable<DashManifest>> {
        private ManifestCallback() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCanceled(ParsingLoadable<DashManifest> parsingLoadable, long j, long j2, boolean z) {
            DashMediaSource.this.onLoadCanceled(parsingLoadable, j, j2);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCompleted(ParsingLoadable<DashManifest> parsingLoadable, long j, long j2) {
            DashMediaSource.this.onManifestLoadCompleted(parsingLoadable, j, j2);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(ParsingLoadable<DashManifest> parsingLoadable, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.onManifestLoadError(parsingLoadable, j, j2, iOException, i);
        }
    }

    public final class ManifestLoadErrorThrower implements LoaderErrorThrower {
        public ManifestLoadErrorThrower() {
        }

        private void maybeThrowManifestError() throws IOException {
            if (DashMediaSource.this.manifestFatalError != null) {
                throw DashMediaSource.this.manifestFatalError;
            }
        }

        @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
        public void maybeThrowError() throws IOException {
            DashMediaSource.this.loader.maybeThrowError();
            maybeThrowManifestError();
        }

        @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
        public void maybeThrowError(int i) throws IOException {
            DashMediaSource.this.loader.maybeThrowError(i);
            maybeThrowManifestError();
        }
    }

    public static final class PeriodSeekInfo {
        public final long availableEndTimeUs;
        public final long availableStartTimeUs;
        public final boolean isIndexExplicit;

        private PeriodSeekInfo(boolean z, long j, long j2) {
            this.isIndexExplicit = z;
            this.availableStartTimeUs = j;
            this.availableEndTimeUs = j2;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0040 A[PHI: r12
          0x0040: PHI (r12v4 boolean) = (r12v2 boolean), (r12v1 boolean) binds: [B:27:0x0071, B:18:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
        public static PeriodSeekInfo createPeriodSeekInfo(Period period, long j) {
            boolean z;
            boolean z2;
            long jMin;
            int size = period.adaptationSets.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z = false;
                    break;
                }
                int i3 = period.adaptationSets.get(i2).type;
                if (i3 == 1 || i3 == 2) {
                    z = true;
                    break;
                }
                i2++;
            }
            long j2 = Long.MAX_VALUE;
            int i4 = 0;
            boolean zIsExplicit = false;
            long jMax = 0;
            boolean z3 = false;
            while (i4 < size) {
                AdaptationSet adaptationSet = period.adaptationSets.get(i4);
                if (z && adaptationSet.type == 3) {
                    z2 = z;
                    jMin = j2;
                } else {
                    DashSegmentIndex index = adaptationSet.representations.get(i).getIndex();
                    if (index == null) {
                        return new PeriodSeekInfo(true, 0L, j);
                    }
                    zIsExplicit |= index.isExplicit();
                    int segmentCount = index.getSegmentCount(j);
                    if (segmentCount == 0) {
                        z2 = z;
                        jMin = 0;
                        jMax = 0;
                        z3 = true;
                    } else if (z3) {
                        z2 = z;
                        jMin = j2;
                    } else {
                        z2 = z;
                        long firstSegmentNum = index.getFirstSegmentNum();
                        long j3 = j2;
                        jMax = Math.max(jMax, index.getTimeUs(firstSegmentNum));
                        if (segmentCount != -1) {
                            long j4 = (firstSegmentNum + ((long) segmentCount)) - 1;
                            jMin = Math.min(j3, index.getDurationUs(j4, j) + index.getTimeUs(j4));
                        } else {
                            jMin = j3;
                        }
                    }
                }
                i4++;
                j2 = jMin;
                z = z2;
                i = 0;
            }
            return new PeriodSeekInfo(zIsExplicit, jMax, j2);
        }
    }

    public final class UtcTimestampCallback implements Loader.Callback<ParsingLoadable<Long>> {
        private UtcTimestampCallback() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCanceled(ParsingLoadable<Long> parsingLoadable, long j, long j2, boolean z) {
            DashMediaSource.this.onLoadCanceled(parsingLoadable, j, j2);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public void onLoadCompleted(ParsingLoadable<Long> parsingLoadable, long j, long j2) {
            DashMediaSource.this.onUtcTimestampLoadCompleted(parsingLoadable, j, j2);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        public Loader.LoadErrorAction onLoadError(ParsingLoadable<Long> parsingLoadable, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.onUtcTimestampLoadError(parsingLoadable, j, j2, iOException);
        }
    }

    public static final class XsDateTimeParser implements ParsingLoadable.Parser<Long> {
        private XsDateTimeParser() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
        public Long parse(Uri uri, InputStream inputStream) throws IOException {
            return Long.valueOf(Util.parseXsDateTime(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.dash");
    }

    @Deprecated
    public DashMediaSource(Uri uri, DataSource.Factory factory, DashChunkSource.Factory factory2, int i, long j, @Nullable Handler handler, @Nullable MediaSourceEventListener mediaSourceEventListener) {
        this(uri, factory, new DashManifestParser(), factory2, i, j, handler, mediaSourceEventListener);
    }

    private long getManifestLoadRetryDelayMillis() {
        return Math.min((this.staleManifestReloadAttempt - 1) * 1000, 5000);
    }

    private long getNowUnixTimeUs() {
        return C3219C.msToUs(this.elapsedRealtimeOffsetMs != 0 ? SystemClock.elapsedRealtime() + this.elapsedRealtimeOffsetMs : System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        processManifest(false);
    }

    private void onUtcTimestampResolutionError(IOException iOException) {
        Log.m17583e(TAG, "Failed to resolve UtcTiming element.", iOException);
        processManifest(true);
    }

    private void onUtcTimestampResolved(long j) {
        this.elapsedRealtimeOffsetMs = j;
        processManifest(true);
    }

    private void processManifest(boolean z) {
        long j;
        boolean z2;
        long j2;
        for (int i = 0; i < this.periodsById.size(); i++) {
            int iKeyAt = this.periodsById.keyAt(i);
            if (iKeyAt >= this.firstPeriodId) {
                this.periodsById.valueAt(i).updateManifest(this.manifest, iKeyAt - this.firstPeriodId);
            }
        }
        int periodCount = this.manifest.getPeriodCount() - 1;
        PeriodSeekInfo periodSeekInfoCreatePeriodSeekInfo = PeriodSeekInfo.createPeriodSeekInfo(this.manifest.getPeriod(0), this.manifest.getPeriodDurationUs(0));
        PeriodSeekInfo periodSeekInfoCreatePeriodSeekInfo2 = PeriodSeekInfo.createPeriodSeekInfo(this.manifest.getPeriod(periodCount), this.manifest.getPeriodDurationUs(periodCount));
        long jMax = periodSeekInfoCreatePeriodSeekInfo.availableStartTimeUs;
        long jMin = periodSeekInfoCreatePeriodSeekInfo2.availableEndTimeUs;
        if (!this.manifest.dynamic || periodSeekInfoCreatePeriodSeekInfo2.isIndexExplicit) {
            j = jMax;
            z2 = false;
        } else {
            jMin = Math.min((getNowUnixTimeUs() - C3219C.msToUs(this.manifest.availabilityStartTimeMs)) - C3219C.msToUs(this.manifest.getPeriod(periodCount).startMs), jMin);
            long j3 = this.manifest.timeShiftBufferDepthMs;
            if (j3 != C3219C.TIME_UNSET) {
                long jMsToUs = jMin - C3219C.msToUs(j3);
                while (jMsToUs < 0 && periodCount > 0) {
                    periodCount--;
                    jMsToUs += this.manifest.getPeriodDurationUs(periodCount);
                }
                jMax = periodCount == 0 ? Math.max(jMax, jMsToUs) : this.manifest.getPeriodDurationUs(0);
            }
            j = jMax;
            z2 = true;
        }
        long periodDurationUs = jMin - j;
        for (int i2 = 0; i2 < this.manifest.getPeriodCount() - 1; i2++) {
            periodDurationUs = this.manifest.getPeriodDurationUs(i2) + periodDurationUs;
        }
        DashManifest dashManifest = this.manifest;
        if (dashManifest.dynamic) {
            long j4 = this.livePresentationDelayMs;
            if (!this.livePresentationDelayOverridesManifest) {
                long j5 = dashManifest.suggestedPresentationDelayMs;
                if (j5 != C3219C.TIME_UNSET) {
                    j4 = j5;
                }
            }
            long jMsToUs2 = periodDurationUs - C3219C.msToUs(j4);
            if (jMsToUs2 < MIN_LIVE_DEFAULT_START_POSITION_US) {
                jMsToUs2 = Math.min(MIN_LIVE_DEFAULT_START_POSITION_US, periodDurationUs / 2);
            }
            j2 = jMsToUs2;
        } else {
            j2 = 0;
        }
        DashManifest dashManifest2 = this.manifest;
        long j6 = dashManifest2.availabilityStartTimeMs;
        long jUsToMs = j6 != C3219C.TIME_UNSET ? C3219C.usToMs(j) + j6 + dashManifest2.getPeriod(0).startMs : -9223372036854775807L;
        DashManifest dashManifest3 = this.manifest;
        refreshSourceInfo(new DashTimeline(dashManifest3.availabilityStartTimeMs, jUsToMs, this.firstPeriodId, j, periodDurationUs, j2, dashManifest3, this.tag));
        if (this.sideloadedManifest) {
            return;
        }
        this.handler.removeCallbacks(this.simulateManifestRefreshRunnable);
        long j7 = DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
        if (z2) {
            this.handler.postDelayed(this.simulateManifestRefreshRunnable, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
        }
        if (this.manifestLoadPending) {
            startLoadingManifest();
            return;
        }
        if (z) {
            DashManifest dashManifest4 = this.manifest;
            if (dashManifest4.dynamic) {
                long j8 = dashManifest4.minUpdatePeriodMs;
                if (j8 != C3219C.TIME_UNSET) {
                    if (j8 != 0) {
                        j7 = j8;
                    }
                    scheduleManifestRefresh(Math.max(0L, (this.manifestLoadStartTimestampMs + j7) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    private void resolveUtcTimingElement(UtcTimingElement utcTimingElement) {
        ParsingLoadable.Parser<Long> iso8601Parser;
        String str = utcTimingElement.schemeIdUri;
        if (Util.areEqual(str, "urn:mpeg:dash:utc:direct:2014") || Util.areEqual(str, "urn:mpeg:dash:utc:direct:2012")) {
            resolveUtcTimingElementDirect(utcTimingElement);
            return;
        }
        if (Util.areEqual(str, "urn:mpeg:dash:utc:http-iso:2014") || Util.areEqual(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            iso8601Parser = new Iso8601Parser();
        } else {
            if (!Util.areEqual(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !Util.areEqual(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                onUtcTimestampResolutionError(new IOException("Unsupported UTC timing scheme"));
                return;
            }
            iso8601Parser = new XsDateTimeParser();
        }
        resolveUtcTimingElementHttp(utcTimingElement, iso8601Parser);
    }

    private void resolveUtcTimingElementDirect(UtcTimingElement utcTimingElement) {
        try {
            onUtcTimestampResolved(Util.parseXsDateTime(utcTimingElement.value) - this.manifestLoadEndTimestampMs);
        } catch (ParserException e) {
            onUtcTimestampResolutionError(e);
        }
    }

    private void resolveUtcTimingElementHttp(UtcTimingElement utcTimingElement, ParsingLoadable.Parser<Long> parser) {
        startLoading(new ParsingLoadable(this.dataSource, Uri.parse(utcTimingElement.value), 5, parser), new UtcTimestampCallback(), 1);
    }

    private void scheduleManifestRefresh(long j) {
        this.handler.postDelayed(this.refreshManifestRunnable, j);
    }

    private <T> void startLoading(ParsingLoadable<T> parsingLoadable, Loader.Callback<ParsingLoadable<T>> callback, int i) {
        this.manifestEventDispatcher.loadStarted(parsingLoadable.dataSpec, parsingLoadable.type, this.loader.startLoading(parsingLoadable, callback, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startLoadingManifest() {
        Uri uri;
        this.handler.removeCallbacks(this.refreshManifestRunnable);
        if (this.loader.hasFatalError()) {
            return;
        }
        if (this.loader.isLoading()) {
            this.manifestLoadPending = true;
            return;
        }
        synchronized (this.manifestUriLock) {
            uri = this.manifestUri;
        }
        this.manifestLoadPending = false;
        startLoading(new ParsingLoadable(this.dataSource, uri, 4, this.manifestParser), this.manifestCallback, this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(4));
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        int iIntValue = ((Integer) mediaPeriodId.periodUid).intValue() - this.firstPeriodId;
        DashMediaPeriod dashMediaPeriod = new DashMediaPeriod(this.firstPeriodId + iIntValue, this.manifest, iIntValue, this.chunkSourceFactory, this.mediaTransferListener, this.drmSessionManager, this.loadErrorHandlingPolicy, createEventDispatcher(mediaPeriodId, this.manifest.getPeriod(iIntValue).startMs), this.elapsedRealtimeOffsetMs, this.manifestLoadErrorThrower, allocator, this.compositeSequenceableLoaderFactory, this.playerEmsgCallback);
        this.periodsById.put(dashMediaPeriod.f11119id, dashMediaPeriod);
        return dashMediaPeriod;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource, com.google.android.exoplayer2.source.MediaSource
    @Nullable
    public Object getTag() {
        return this.tag;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.manifestLoadErrorThrower.maybeThrowError();
    }

    public void onDashManifestPublishTimeExpired(long j) {
        long j2 = this.expiredManifestPublishTimeUs;
        if (j2 == C3219C.TIME_UNSET || j2 < j) {
            this.expiredManifestPublishTimeUs = j;
        }
    }

    public void onDashManifestRefreshRequested() {
        this.handler.removeCallbacks(this.simulateManifestRefreshRunnable);
        startLoadingManifest();
    }

    public void onLoadCanceled(ParsingLoadable<?> parsingLoadable, long j, long j2) {
        this.manifestEventDispatcher.loadCanceled(parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), parsingLoadable.type, j, j2, parsingLoadable.bytesLoaded());
    }

    public void onManifestLoadCompleted(ParsingLoadable<DashManifest> parsingLoadable, long j, long j2) {
        UtcTimingElement utcTimingElement;
        this.manifestEventDispatcher.loadCompleted(parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), parsingLoadable.type, j, j2, parsingLoadable.bytesLoaded());
        DashManifest result = parsingLoadable.getResult();
        DashManifest dashManifest = this.manifest;
        int periodCount = dashManifest == null ? 0 : dashManifest.getPeriodCount();
        long j3 = result.getPeriod(0).startMs;
        int i = 0;
        while (i < periodCount && this.manifest.getPeriod(i).startMs < j3) {
            i++;
        }
        if (result.dynamic) {
            if (periodCount - i > result.getPeriodCount()) {
                Log.m17586w(TAG, "Loaded out of sync manifest");
            } else {
                long j4 = this.expiredManifestPublishTimeUs;
                if (j4 == C3219C.TIME_UNSET || result.publishTimeMs * 1000 > j4) {
                    this.staleManifestReloadAttempt = 0;
                } else {
                    Log.m17586w(TAG, "Loaded stale dynamic manifest: " + result.publishTimeMs + ", " + this.expiredManifestPublishTimeUs);
                }
            }
            int i2 = this.staleManifestReloadAttempt;
            this.staleManifestReloadAttempt = i2 + 1;
            if (i2 < this.loadErrorHandlingPolicy.getMinimumLoadableRetryCount(parsingLoadable.type)) {
                scheduleManifestRefresh(getManifestLoadRetryDelayMillis());
                return;
            } else {
                this.manifestFatalError = new DashManifestStaleException();
                return;
            }
        }
        this.manifest = result;
        this.manifestLoadPending = result.dynamic & this.manifestLoadPending;
        this.manifestLoadStartTimestampMs = j - j2;
        this.manifestLoadEndTimestampMs = j;
        synchronized (this.manifestUriLock) {
            try {
                if (parsingLoadable.dataSpec.uri == this.manifestUri) {
                    Uri uri = this.manifest.location;
                    if (uri == null) {
                        uri = parsingLoadable.getUri();
                    }
                    this.manifestUri = uri;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (periodCount == 0) {
            DashManifest dashManifest2 = this.manifest;
            if (dashManifest2.dynamic && (utcTimingElement = dashManifest2.utcTiming) != null) {
                resolveUtcTimingElement(utcTimingElement);
                return;
            }
        } else {
            this.firstPeriodId += i;
        }
        processManifest(true);
    }

    public Loader.LoadErrorAction onManifestLoadError(ParsingLoadable<DashManifest> parsingLoadable, long j, long j2, IOException iOException, int i) {
        long retryDelayMsFor = this.loadErrorHandlingPolicy.getRetryDelayMsFor(4, j2, iOException, i);
        Loader.LoadErrorAction loadErrorActionCreateRetryAction = retryDelayMsFor == C3219C.TIME_UNSET ? Loader.DONT_RETRY_FATAL : Loader.createRetryAction(false, retryDelayMsFor);
        this.manifestEventDispatcher.loadError(parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), parsingLoadable.type, j, j2, parsingLoadable.bytesLoaded(), iOException, !loadErrorActionCreateRetryAction.isRetry());
        return loadErrorActionCreateRetryAction;
    }

    public void onUtcTimestampLoadCompleted(ParsingLoadable<Long> parsingLoadable, long j, long j2) {
        this.manifestEventDispatcher.loadCompleted(parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), parsingLoadable.type, j, j2, parsingLoadable.bytesLoaded());
        onUtcTimestampResolved(parsingLoadable.getResult().longValue() - j);
    }

    public Loader.LoadErrorAction onUtcTimestampLoadError(ParsingLoadable<Long> parsingLoadable, long j, long j2, IOException iOException) {
        this.manifestEventDispatcher.loadError(parsingLoadable.dataSpec, parsingLoadable.getUri(), parsingLoadable.getResponseHeaders(), parsingLoadable.type, j, j2, parsingLoadable.bytesLoaded(), iOException, true);
        onUtcTimestampResolutionError(iOException);
        return Loader.DONT_RETRY;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void prepareSourceInternal(@Nullable TransferListener transferListener) {
        this.mediaTransferListener = transferListener;
        this.drmSessionManager.prepare();
        if (this.sideloadedManifest) {
            processManifest(false);
            return;
        }
        this.dataSource = this.manifestDataSourceFactory.createDataSource();
        this.loader = new Loader("Loader:DashMediaSource");
        this.handler = new Handler();
        startLoadingManifest();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        DashMediaPeriod dashMediaPeriod = (DashMediaPeriod) mediaPeriod;
        dashMediaPeriod.release();
        this.periodsById.remove(dashMediaPeriod.f11119id);
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    public void releaseSourceInternal() {
        this.manifestLoadPending = false;
        this.dataSource = null;
        Loader loader = this.loader;
        if (loader != null) {
            loader.release();
            this.loader = null;
        }
        this.manifestLoadStartTimestampMs = 0L;
        this.manifestLoadEndTimestampMs = 0L;
        this.manifest = this.sideloadedManifest ? this.manifest : null;
        this.manifestUri = this.initialManifestUri;
        this.manifestFatalError = null;
        Handler handler = this.handler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.handler = null;
        }
        this.elapsedRealtimeOffsetMs = 0L;
        this.staleManifestReloadAttempt = 0;
        this.expiredManifestPublishTimeUs = C3219C.TIME_UNSET;
        this.firstPeriodId = 0;
        this.periodsById.clear();
        this.drmSessionManager.release();
    }

    public void replaceManifestUri(Uri uri) {
        synchronized (this.manifestUriLock) {
            this.manifestUri = uri;
            this.initialManifestUri = uri;
        }
    }

    @Deprecated
    public DashMediaSource(Uri uri, DataSource.Factory factory, DashChunkSource.Factory factory2, @Nullable Handler handler, @Nullable MediaSourceEventListener mediaSourceEventListener) {
        this(uri, factory, factory2, 3, -1L, handler, mediaSourceEventListener);
    }

    @Deprecated
    public DashMediaSource(Uri uri, DataSource.Factory factory, ParsingLoadable.Parser<? extends DashManifest> parser, DashChunkSource.Factory factory2, int i, long j, @Nullable Handler handler, @Nullable MediaSourceEventListener mediaSourceEventListener) {
        this(null, uri, factory, parser, factory2, new DefaultCompositeSequenceableLoaderFactory(), C0499Hg.m2391d(), new DefaultLoadErrorHandlingPolicy(i), j == -1 ? 30000L : j, j != -1, null);
        if (handler == null || mediaSourceEventListener == null) {
            return;
        }
        addEventListener(handler, mediaSourceEventListener);
    }

    private DashMediaSource(@Nullable DashManifest dashManifest, @Nullable Uri uri, @Nullable DataSource.Factory factory, @Nullable ParsingLoadable.Parser<? extends DashManifest> parser, DashChunkSource.Factory factory2, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, DrmSessionManager<?> drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, long j, boolean z, @Nullable Object obj) {
        this.initialManifestUri = uri;
        this.manifest = dashManifest;
        this.manifestUri = uri;
        this.manifestDataSourceFactory = factory;
        this.manifestParser = parser;
        this.chunkSourceFactory = factory2;
        this.drmSessionManager = drmSessionManager;
        this.loadErrorHandlingPolicy = loadErrorHandlingPolicy;
        this.livePresentationDelayMs = j;
        this.livePresentationDelayOverridesManifest = z;
        this.compositeSequenceableLoaderFactory = compositeSequenceableLoaderFactory;
        this.tag = obj;
        boolean z2 = dashManifest != null;
        this.sideloadedManifest = z2;
        this.manifestEventDispatcher = createEventDispatcher(null);
        this.manifestUriLock = new Object();
        this.periodsById = new SparseArray<>();
        this.playerEmsgCallback = new DefaultPlayerEmsgCallback();
        this.expiredManifestPublishTimeUs = C3219C.TIME_UNSET;
        if (!z2) {
            this.manifestCallback = new ManifestCallback();
            this.manifestLoadErrorThrower = new ManifestLoadErrorThrower();
            this.refreshManifestRunnable = new Runnable(this) { // from class: hd

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ DashMediaSource f14338a;

                /* JADX WARN: Invalid debug info offset */
                @Override // java.lang.Runnable
                public final void run() {
                }
            };
            this.simulateManifestRefreshRunnable = new Runnable(this) { // from class: id

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ DashMediaSource f14550a;

                /* JADX WARN: Invalid debug info offset */
                @Override // java.lang.Runnable
                public final void run() {
                }
            };
            return;
        }
        Assertions.checkState(!dashManifest.dynamic);
        this.manifestCallback = null;
        this.refreshManifestRunnable = null;
        this.simulateManifestRefreshRunnable = null;
        this.manifestLoadErrorThrower = new LoaderErrorThrower.Dummy();
    }

    @Deprecated
    public DashMediaSource(DashManifest dashManifest, DashChunkSource.Factory factory, int i, @Nullable Handler handler, @Nullable MediaSourceEventListener mediaSourceEventListener) {
        this(dashManifest, null, null, null, factory, new DefaultCompositeSequenceableLoaderFactory(), C0499Hg.m2391d(), new DefaultLoadErrorHandlingPolicy(i), 30000L, false, null);
        if (handler == null || mediaSourceEventListener == null) {
            return;
        }
        addEventListener(handler, mediaSourceEventListener);
    }

    @Deprecated
    public DashMediaSource(DashManifest dashManifest, DashChunkSource.Factory factory, @Nullable Handler handler, @Nullable MediaSourceEventListener mediaSourceEventListener) {
        this(dashManifest, factory, 3, handler, mediaSourceEventListener);
    }
}
