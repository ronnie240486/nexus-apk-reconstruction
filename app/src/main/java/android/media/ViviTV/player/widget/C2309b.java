package android.media.ViviTV.player.widget;

import android.content.Context;
import android.net.Uri;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultAllocator;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSourceFactory;
import com.google.android.exoplayer2.video.VideoListener;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: android.media.ViviTV.player.widget.b */
/* JADX INFO: loaded from: classes.dex */
public class C2309b extends AbstractC2308a {

    /* JADX INFO: renamed from: l0 */
    public static final String f9480l0 = "ExoPlayerProxy";

    /* JADX INFO: renamed from: m0 */
    public static String f9481m0 = "actions";

    /* JADX INFO: renamed from: n0 */
    public static String f9482n0 = "tracked_actions";

    /* JADX INFO: renamed from: o0 */
    public static String f9483o0 = "downloads";

    /* JADX INFO: renamed from: p0 */
    public static String f9484p0 = "ExoDownloads";

    /* JADX INFO: renamed from: q0 */
    public static int f9485q0 = 2;

    /* JADX INFO: renamed from: r0 */
    public static SparseArray<String> f9486r0 = new SparseArray<>();

    /* JADX INFO: renamed from: L */
    public String f9487L;

    /* JADX INFO: renamed from: M */
    public File f9488M;

    /* JADX INFO: renamed from: N */
    public Cache f9489N;

    /* JADX INFO: renamed from: O */
    public Context f9490O;

    /* JADX INFO: renamed from: P */
    public SimpleExoPlayer f9491P;

    /* JADX INFO: renamed from: Q */
    public MediaSource f9492Q;

    /* JADX INFO: renamed from: R */
    public int f9493R;

    /* JADX INFO: renamed from: S */
    public int f9494S;

    /* JADX INFO: renamed from: T */
    public AbstractC2308a.d f9495T;

    /* JADX INFO: renamed from: U */
    public AbstractC2308a.b f9496U;

    /* JADX INFO: renamed from: V */
    public AbstractC2308a.g f9497V;

    /* JADX INFO: renamed from: W */
    public AbstractC2308a.h f9498W;

    /* JADX INFO: renamed from: X */
    public AbstractC2308a.c f9499X;

    /* JADX INFO: renamed from: Y */
    public AbstractC2308a.i f9500Y;

    /* JADX INFO: renamed from: Z */
    public boolean f9501Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f9502a0;

    /* JADX INFO: renamed from: b0 */
    public DataSource.Factory f9503b0;

    /* JADX INFO: renamed from: c0 */
    public Map<String, String> f9504c0;

    /* JADX INFO: renamed from: d0 */
    public C2310c f9505d0;

    /* JADX INFO: renamed from: e0 */
    public String f9506e0;

    /* JADX INFO: renamed from: f0 */
    public VideoListener f9507f0;

    /* JADX INFO: renamed from: g0 */
    public Player.EventListener f9508g0;

    /* JADX INFO: renamed from: h0 */
    public LoadControl f9509h0;

    /* JADX INFO: renamed from: i0 */
    public LoadControl f9510i0;

    /* JADX INFO: renamed from: j0 */
    public LoadControl f9511j0;

    /* JADX INFO: renamed from: k0 */
    public LoadControl f9512k0;

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.b$a */
    public class a implements C2310c.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2309b f9513a;

        /* JADX WARN: Invalid debug info offset */
        public a(C2309b c2309b) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.ViviTV.player.widget.C2310c.b
        /* JADX INFO: renamed from: a */
        public void mo14039a() {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.b$b */
    public class b implements AnalyticsListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2309b f9514a;

        /* JADX WARN: Invalid debug info offset */
        public b(C2309b c2309b) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAudioAttributesChanged(AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onAudioSessionId(AnalyticsListener.EventTime eventTime, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public void onAudioUnderrun(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDecoderDisabled(AnalyticsListener.EventTime eventTime, int i, DecoderCounters decoderCounters) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDecoderEnabled(AnalyticsListener.EventTime eventTime, int i, DecoderCounters decoderCounters) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDecoderInitialized(AnalyticsListener.EventTime eventTime, int i, String str, long j) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDecoderInputFormatChanged(AnalyticsListener.EventTime eventTime, int i, Format format) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDrmKeysRemoved(AnalyticsListener.EventTime eventTime) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDrmKeysRestored(AnalyticsListener.EventTime eventTime) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onDrmSessionReleased(AnalyticsListener.EventTime eventTime) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i, long j) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onIsPlayingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onLoadCanceled(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public void onLoadCompleted(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public void onLoadError(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public void onLoadStarted(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onMediaPeriodCreated(AnalyticsListener.EventTime eventTime) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onMediaPeriodReleased(AnalyticsListener.EventTime eventTime) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onMetadata(AnalyticsListener.EventTime eventTime, Metadata metadata) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onPlaybackParametersChanged(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(AnalyticsListener.EventTime eventTime, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onPlayerError(AnalyticsListener.EventTime eventTime, ExoPlaybackException exoPlaybackException) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public void onPlayerStateChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onReadingStarted(AnalyticsListener.EventTime eventTime) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime, Surface surface) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onRepeatModeChanged(AnalyticsListener.EventTime eventTime, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onSeekProcessed(AnalyticsListener.EventTime eventTime) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onSeekStarted(AnalyticsListener.EventTime eventTime) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onShuffleModeChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onSurfaceSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onTimelineChanged(AnalyticsListener.EventTime eventTime, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onTracksChanged(AnalyticsListener.EventTime eventTime, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onUpstreamDiscarded(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2, int i3, float f) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
        public /* synthetic */ void onVolumeChanged(AnalyticsListener.EventTime eventTime, float f) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.b$c */
    public class c implements VideoListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2309b f9515a;

        /* JADX WARN: Invalid debug info offset */
        public c(C2309b c2309b) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.video.VideoListener
        public void onRenderedFirstFrame() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.video.VideoListener
        public /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.video.VideoListener
        public void onVideoSizeChanged(int i, int i2, int i3, float f) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.b$d */
    public class d implements Player.EventListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2309b f9516a;

        /* JADX WARN: Invalid debug info offset */
        public d(C2309b c2309b) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onIsPlayingChanged(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onLoadingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlayerStateChanged(boolean z, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPositionDiscontinuity(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onRepeatModeChanged(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onSeekProcessed() {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onShuffleModeEnabledChanged(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.Player.EventListener
        public /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onTimelineChanged(Timeline timeline, Object obj, int i) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.b$e */
    public class e extends DefaultLoadControl {

        /* JADX INFO: renamed from: a */
        public final long f9517a;

        /* JADX INFO: renamed from: b */
        public long f9518b;

        /* JADX INFO: renamed from: c */
        public long f9519c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C2309b f9520d;

        /* JADX WARN: Invalid debug info offset */
        public e(C2309b c2309b, DefaultAllocator defaultAllocator, int i, int i2, int i3, int i4, int i5, boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public final boolean m14040a(long j) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0008
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // com.google.android.exoplayer2.DefaultLoadControl, com.google.android.exoplayer2.LoadControl
        public boolean shouldContinueLoading(long r4, float r6) {
            /*
                r3 = this;
                r0 = 0
                return r0
            L22:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.widget.C2309b.e.shouldContinueLoading(long, float):boolean");
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.player.widget.b$f */
    public enum f {
        REAL_TIME_LIVE,
        LIVE,
        VOD,
        LIVE_PLAYBACK_OR_HLS
    }

    /* JADX WARN: Invalid debug info offset */
    public C2309b(Context context, f fVar, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B0 */
    public static CacheDataSourceFactory m13995B0(DefaultDataSourceFactory defaultDataSourceFactory, Cache cache) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0044
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: D0 */
    public static void m13996D0(android.content.Context r5) {
        /*
            return
        L47:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.widget.C2309b.m13996D0(android.content.Context):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K0 */
    public static boolean m13997K0(int i, int i2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N0 */
    public static void m13998N0(LoadControl loadControl) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m13999c0(C2309b c2309b, ExoPlaybackException exoPlaybackException, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m14000d0(C2309b c2309b, int i, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ AbstractC2308a.g m14001e0(C2309b c2309b) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ boolean m14002f0(C2309b c2309b) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ boolean m14003g0(C2309b c2309b, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ AbstractC2308a.d m14004h0(C2309b c2309b) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ boolean m14005i0(C2309b c2309b) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ boolean m14006j0(C2309b c2309b, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ AbstractC2308a.b m14007k0(C2309b c2309b) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m14008l0(C2309b c2309b, ExoPlaybackException exoPlaybackException) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ AbstractC2308a.h m14009m0(C2309b c2309b) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ LoadControl m14010n0(C2309b c2309b) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m14011o0(C2309b c2309b, int i, long j, long j2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m14012p0(C2309b c2309b, int i, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m14013q0(C2309b c2309b, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m14014r0(C2309b c2309b, String str, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ AbstractC2308a.i m14015s0(C2309b c2309b) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ SimpleExoPlayer m14016t0(C2309b c2309b) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ int m14017u0(C2309b c2309b) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v0 */
    public static /* synthetic */ int m14018v0(C2309b c2309b, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ int m14019w0(C2309b c2309b) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ int m14020x0(C2309b c2309b, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: A */
    public void mo13946A(Context context, String str, Map<String, String> map) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A0 */
    public final MediaSource m14021A0(Uri uri, @Nullable String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: B */
    public void mo13947B(SurfaceHolder surfaceHolder) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C0 */
    public DataSource.Factory m14022C0(DefaultBandwidthMeter defaultBandwidthMeter, String str, boolean z, String str2, String str3) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E0 */
    public final void m14023E0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F0 */
    public final synchronized Cache m14024F0(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G0 */
    public final File m14025G0(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H0 */
    public final LoadControl m14026H0(f fVar) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: I0 */
    public final void m14027I0(int r9, long r10) {
        /*
            r8 = this;
            return
        L48:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.widget.C2309b.m14027I0(int, long):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J0 */
    public final void m14028J0(SimpleExoPlayer simpleExoPlayer) {
    }

    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: L */
    public void mo13956L(AbstractC2308a.a aVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: L0 */
    public final void m14029L0(com.google.android.exoplayer2.ExoPlaybackException r9, int r10) {
        /*
            r8 = this;
            return
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.widget.C2309b.m14029L0(com.google.android.exoplayer2.ExoPlaybackException, int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: M */
    public void mo13957M(AbstractC2308a.b bVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M0 */
    public void m14030M0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: N */
    public void mo13958N(AbstractC2308a.c cVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: O */
    public void mo13959O(AbstractC2308a.d dVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O0 */
    public final void m14031O0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: P0 */
    public final void m14032P0(int r3, long r4, long r6) {
        /*
            r2 = this;
            return
        L2d:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.widget.C2309b.m14032P0(int, long, long):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: Q */
    public void mo13961Q(AbstractC2308a.g gVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: Q0 */
    public final void m14033Q0(int r4, long r5) {
        /*
            r3 = this;
            return
        L26:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.widget.C2309b.m14033Q0(int, long):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: R */
    public void mo13962R(AbstractC2308a.h hVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: R0 */
    public final void m14034R0(java.lang.String r7, com.google.android.exoplayer2.source.MediaSourceEventListener.LoadEventInfo r8, com.google.android.exoplayer2.source.MediaSourceEventListener.MediaLoadData r9) {
        /*
            r6 = this;
            return
        L67:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.widget.C2309b.m14034R0(java.lang.String, com.google.android.exoplayer2.source.MediaSourceEventListener$LoadEventInfo, com.google.android.exoplayer2.source.MediaSourceEventListener$MediaLoadData):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: S */
    public void mo13963S(AbstractC2308a.i iVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: S0 */
    public final void m14035S0(com.google.android.exoplayer2.ExoPlaybackException r4) {
        /*
            r3 = this;
            return
        L42:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.widget.C2309b.m14035S0(com.google.android.exoplayer2.ExoPlaybackException):void");
    }

    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: T */
    public void mo13964T(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: T0 */
    public final void m14036T0(int r4) {
        /*
            r3 = this;
            return
        L41:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.widget.C2309b.m14036T0(int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: U */
    public void mo13965U(float f2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: V */
    public void mo13966V(Surface surface) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: W */
    public void mo13967W(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: Y */
    public void mo13969Y(float f2, float f3) {
    }

    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: Z */
    public void mo13970Z(Context context, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: a0 */
    public void mo13971a0() throws IllegalStateException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: b0 */
    public void mo13973b0() throws IllegalStateException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: d */
    public long mo13975d() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: e */
    public long mo13976e() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: f */
    public String mo13977f() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: g */
    public long mo13978g() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: k */
    public Object mo13981k() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: m */
    public int mo13983m() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: n */
    public int mo13984n() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: o */
    public boolean mo13985o(Context context) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: r */
    public boolean mo13987r() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: t */
    public void mo13988t() throws IllegalStateException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: u */
    public void mo13989u() throws IllegalStateException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x002c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: v */
    public void mo13990v() {
        /*
            r3 = this;
            return
        L3a:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.player.widget.C2309b.mo13990v():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: w */
    public void mo13991w() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: x */
    public void mo13992x(long j) throws IllegalStateException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y0 */
    public final DataSource.Factory m14037y0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.media.ViviTV.player.widget.AbstractC2308a
    /* JADX INFO: renamed from: z */
    public void mo13994z(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z0 */
    public final HttpDataSource.Factory m14038z0() {
        return null;
    }
}
