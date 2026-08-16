package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import org.apache.commons.p013io.IOUtils;
import org.dom4j.p020io.OutputFormat;
import p000.AbstractC4717l6;
import p000.C0305Ec;
import p000.C0835Mx;
import p000.C0849NA;
import p000.C1026Pv;
import p000.C1262Tc;
import p000.C4280eK;
import p000.C4375fq;
import p000.C4515i2;
import p000.C5516uN;
import p000.C5532ud;

/* JADX INFO: loaded from: classes2.dex */
public class EventLogger implements AnalyticsListener {
    private static final String DEFAULT_TAG = "EventLogger";
    private static final int MAX_TIMELINE_ITEM_LINES = 3;
    private static final NumberFormat TIME_FORMAT;
    private final Timeline.Period period;
    private final long startTimeMs;
    private final String tag;

    @Nullable
    private final MappingTrackSelector trackSelector;
    private final Timeline.Window window;

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        TIME_FORMAT = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public EventLogger(@Nullable MappingTrackSelector mappingTrackSelector) {
        this(mappingTrackSelector, DEFAULT_TAG);
    }

    private static String getAdaptiveSupportString(int i, int i2) {
        if (i < 2) {
            return "N/A";
        }
        if (i2 == 0) {
            return "NO";
        }
        if (i2 == 8) {
            return "YES_NOT_SEAMLESS";
        }
        if (i2 == 16) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    private static String getDiscontinuityReasonString(int i) {
        if (i == 0) {
            return "PERIOD_TRANSITION";
        }
        if (i == 1) {
            return "SEEK";
        }
        if (i == 2) {
            return "SEEK_ADJUSTMENT";
        }
        if (i != 3) {
            return i != 4 ? AbstractC4717l6.f14991e : "INTERNAL";
        }
        return "AD_INSERTION";
    }

    private String getEventString(AnalyticsListener.EventTime eventTime, String str, @Nullable String str2, @Nullable Throwable th) {
        StringBuilder sbM3902a = C0835Mx.m3902a(str, " [");
        sbM3902a.append(getEventTimeString(eventTime));
        String string = sbM3902a.toString();
        if (str2 != null) {
            string = C5532ud.m28671a(string, ", ", str2);
        }
        String throwableString = Log.getThrowableString(th);
        if (!TextUtils.isEmpty(throwableString)) {
            StringBuilder sbM3902a2 = C0835Mx.m3902a(string, "\n  ");
            sbM3902a2.append(throwableString.replace(IOUtils.f15646e, "\n  "));
            sbM3902a2.append('\n');
            string = sbM3902a2.toString();
        }
        return C4515i2.m21289a(string, "]");
    }

    private String getEventTimeString(AnalyticsListener.EventTime eventTime) {
        String string = "window=" + eventTime.windowIndex;
        if (eventTime.mediaPeriodId != null) {
            StringBuilder sbM3902a = C0835Mx.m3902a(string, ", period=");
            sbM3902a.append(eventTime.timeline.getIndexOfPeriod(eventTime.mediaPeriodId.periodUid));
            string = sbM3902a.toString();
            if (eventTime.mediaPeriodId.isAd()) {
                StringBuilder sbM3902a2 = C0835Mx.m3902a(string, ", adGroup=");
                sbM3902a2.append(eventTime.mediaPeriodId.adGroupIndex);
                StringBuilder sbM3902a3 = C0835Mx.m3902a(sbM3902a2.toString(), ", ad=");
                sbM3902a3.append(eventTime.mediaPeriodId.adIndexInAdGroup);
                string = sbM3902a3.toString();
            }
        }
        StringBuilder sb = new StringBuilder("eventTime=");
        sb.append(getTimeString(eventTime.realtimeMs - this.startTimeMs));
        sb.append(", mediaPos=");
        return C0849NA.m3929a(sb, getTimeString(eventTime.currentPlaybackPositionMs), ", ", string);
    }

    private static String getPlaybackSuppressionReasonString(int i) {
        if (i != 0) {
            return i != 1 ? AbstractC4717l6.f14991e : "TRANSIENT_AUDIO_FOCUS_LOSS";
        }
        return "NONE";
    }

    private static String getRepeatModeString(int i) {
        if (i == 0) {
            return "OFF";
        }
        if (i != 1) {
            return i != 2 ? AbstractC4717l6.f14991e : "ALL";
        }
        return "ONE";
    }

    private static String getStateString(int i) {
        if (i == 1) {
            return "IDLE";
        }
        if (i == 2) {
            return "BUFFERING";
        }
        if (i != 3) {
            return i != 4 ? AbstractC4717l6.f14991e : "ENDED";
        }
        return "READY";
    }

    private static String getTimeString(long j) {
        return j == C3219C.TIME_UNSET ? AbstractC4717l6.f14991e : TIME_FORMAT.format(j / 1000.0f);
    }

    private static String getTimelineChangeReasonString(int i) {
        if (i == 0) {
            return "PREPARED";
        }
        if (i != 1) {
            return i != 2 ? AbstractC4717l6.f14991e : "DYNAMIC";
        }
        return "RESET";
    }

    private static String getTrackStatusString(@Nullable TrackSelection trackSelection, TrackGroup trackGroup, int i) {
        return getTrackStatusString((trackSelection == null || trackSelection.getTrackGroup() != trackGroup || trackSelection.indexOf(i) == -1) ? false : true);
    }

    private void logd(AnalyticsListener.EventTime eventTime, String str) {
        logd(getEventString(eventTime, str, null, null));
    }

    private void loge(AnalyticsListener.EventTime eventTime, String str, String str2, @Nullable Throwable th) {
        loge(getEventString(eventTime, str, str2, th));
    }

    private void printInternalError(AnalyticsListener.EventTime eventTime, String str, Exception exc) {
        loge(eventTime, "internalError", str, exc);
    }

    private void printMetadata(Metadata metadata, String str) {
        for (int i = 0; i < metadata.length(); i++) {
            StringBuilder sbM1657a = C0305Ec.m1657a(str);
            sbM1657a.append(metadata.get(i));
            logd(sbM1657a.toString());
        }
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioAttributesChanged(AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes) {
        logd(eventTime, "audioAttributes", audioAttributes.contentType + C1262Tc.f3278g + audioAttributes.flags + C1262Tc.f3278g + audioAttributes.usage + C1262Tc.f3278g + audioAttributes.allowedCapturePolicy);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioSessionId(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "audioSessionId", Integer.toString(i));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onAudioUnderrun(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        loge(eventTime, "audioTrackUnderrun", C1026Pv.m4564a(sb, j2, "]"), null);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDecoderDisabled(AnalyticsListener.EventTime eventTime, int i, DecoderCounters decoderCounters) {
        logd(eventTime, "decoderDisabled", Util.getTrackTypeString(i));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDecoderEnabled(AnalyticsListener.EventTime eventTime, int i, DecoderCounters decoderCounters) {
        logd(eventTime, "decoderEnabled", Util.getTrackTypeString(i));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDecoderInitialized(AnalyticsListener.EventTime eventTime, int i, String str, long j) {
        logd(eventTime, "decoderInitialized", Util.getTrackTypeString(i) + ", " + str);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDecoderInputFormatChanged(AnalyticsListener.EventTime eventTime, int i, Format format) {
        logd(eventTime, "decoderInputFormat", Util.getTrackTypeString(i) + ", " + Format.toLogString(format));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        logd(eventTime, "downstreamFormat", Format.toLogString(mediaLoadData.trackFormat));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysLoaded");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmKeysRemoved(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysRemoved");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmKeysRestored(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysRestored");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmSessionAcquired");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) {
        printInternalError(eventTime, "drmSessionManagerError", exc);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmSessionReleased(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmSessionReleased");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i, long j) {
        logd(eventTime, "droppedFrames", Integer.toString(i));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onIsPlayingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        logd(eventTime, "isPlaying", Boolean.toString(z));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadCanceled(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadCompleted(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadError(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        printInternalError(eventTime, C4280eK.f13732h, iOException);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadStarted(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.LoadEventInfo loadEventInfo, MediaSourceEventListener.MediaLoadData mediaLoadData) {
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        logd(eventTime, "loading", Boolean.toString(z));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onMediaPeriodCreated(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "mediaPeriodCreated");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onMediaPeriodReleased(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "mediaPeriodReleased");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onMetadata(AnalyticsListener.EventTime eventTime, Metadata metadata) {
        logd("metadata [" + getEventTimeString(eventTime));
        printMetadata(metadata, OutputFormat.f16582n);
        logd("]");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlaybackParametersChanged(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
        logd(eventTime, "playbackParameters", Util.formatInvariant("speed=%.2f, pitch=%.2f, skipSilence=%s", Float.valueOf(playbackParameters.speed), Float.valueOf(playbackParameters.pitch), Boolean.valueOf(playbackParameters.skipSilence)));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlaybackSuppressionReasonChanged(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "playbackSuppressionReason", getPlaybackSuppressionReasonString(i));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlayerError(AnalyticsListener.EventTime eventTime, ExoPlaybackException exoPlaybackException) {
        loge(eventTime, "playerFailed", exoPlaybackException);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPlayerStateChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
        logd(eventTime, "state", z + ", " + getStateString(i));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "positionDiscontinuity", getDiscontinuityReasonString(i));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onReadingStarted(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "mediaPeriodReadingStarted");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime, @Nullable Surface surface) {
        logd(eventTime, "renderedFirstFrame", String.valueOf(surface));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onRepeatModeChanged(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "repeatMode", getRepeatModeString(i));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onSeekProcessed(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "seekProcessed");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onSeekStarted(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "seekStarted");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onShuffleModeChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        logd(eventTime, "shuffleModeEnabled", Boolean.toString(z));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onSurfaceSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2) {
        logd(eventTime, "surfaceSize", i + ", " + i2);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onTimelineChanged(AnalyticsListener.EventTime eventTime, int i) {
        int periodCount = eventTime.timeline.getPeriodCount();
        int windowCount = eventTime.timeline.getWindowCount();
        logd("timeline [" + getEventTimeString(eventTime) + ", periodCount=" + periodCount + ", windowCount=" + windowCount + ", reason=" + getTimelineChangeReasonString(i));
        for (int i2 = 0; i2 < Math.min(periodCount, 3); i2++) {
            eventTime.timeline.getPeriod(i2, this.period);
            logd("  period [" + getTimeString(this.period.getDurationMs()) + "]");
        }
        if (periodCount > 3) {
            logd("  ...");
        }
        for (int i3 = 0; i3 < Math.min(windowCount, 3); i3++) {
            eventTime.timeline.getWindow(i3, this.window);
            logd("  window [" + getTimeString(this.window.getDurationMs()) + ", " + this.window.isSeekable + ", " + this.window.isDynamic + "]");
        }
        if (windowCount > 3) {
            logd("  ...");
        }
        logd("]");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onTracksChanged(AnalyticsListener.EventTime eventTime, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        MappingTrackSelector mappingTrackSelector = this.trackSelector;
        MappingTrackSelector.MappedTrackInfo currentMappedTrackInfo = mappingTrackSelector != null ? mappingTrackSelector.getCurrentMappedTrackInfo() : null;
        if (currentMappedTrackInfo == null) {
            logd(eventTime, "tracks", C4375fq.f14035n);
            return;
        }
        logd("tracks [" + getEventTimeString(eventTime));
        int rendererCount = currentMappedTrackInfo.getRendererCount();
        int i = 0;
        while (true) {
            String str = "  ]";
            String str2 = " [";
            if (i >= rendererCount) {
                break;
            }
            TrackGroupArray trackGroups = currentMappedTrackInfo.getTrackGroups(i);
            TrackSelection trackSelection = trackSelectionArray.get(i);
            if (trackGroups.length > 0) {
                logd("  Renderer:" + i + " [");
                int i2 = 0;
                while (i2 < trackGroups.length) {
                    TrackGroup trackGroup = trackGroups.get(i2);
                    TrackGroupArray trackGroupArray2 = trackGroups;
                    String str3 = str;
                    logd("    Group:" + i2 + ", adaptive_supported=" + getAdaptiveSupportString(trackGroup.length, currentMappedTrackInfo.getAdaptiveSupport(i, i2, false)) + str2);
                    int i3 = 0;
                    while (i3 < trackGroup.length) {
                        logd("      " + getTrackStatusString(trackSelection, trackGroup, i3) + " Track:" + i3 + ", " + Format.toLogString(trackGroup.getFormat(i3)) + ", supported=" + C5516uN.m28608e(currentMappedTrackInfo.getTrackSupport(i, i2, i3)));
                        i3++;
                        str2 = str2;
                    }
                    logd("    ]");
                    i2++;
                    trackGroups = trackGroupArray2;
                    str = str3;
                }
                String str4 = str;
                if (trackSelection != null) {
                    for (int i4 = 0; i4 < trackSelection.length(); i4++) {
                        Metadata metadata = trackSelection.getFormat(i4).metadata;
                        if (metadata != null) {
                            logd("    Metadata [");
                            printMetadata(metadata, "      ");
                            logd("    ]");
                            break;
                        }
                    }
                }
                logd(str4);
            }
            i++;
            rendererCount = rendererCount;
        }
        String str5 = " [";
        TrackGroupArray unmappedTrackGroups = currentMappedTrackInfo.getUnmappedTrackGroups();
        if (unmappedTrackGroups.length > 0) {
            logd("  Renderer:None [");
            int i5 = 0;
            while (i5 < unmappedTrackGroups.length) {
                StringBuilder sb = new StringBuilder("    Group:");
                sb.append(i5);
                String str6 = str5;
                sb.append(str6);
                logd(sb.toString());
                TrackGroup trackGroup2 = unmappedTrackGroups.get(i5);
                for (int i6 = 0; i6 < trackGroup2.length; i6++) {
                    logd("      " + getTrackStatusString(false) + " Track:" + i6 + ", " + Format.toLogString(trackGroup2.getFormat(i6)) + ", supported=" + C5516uN.m28608e(0));
                }
                logd("    ]");
                i5++;
                str5 = str6;
            }
            logd("  ]");
        }
        logd("]");
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onUpstreamDiscarded(AnalyticsListener.EventTime eventTime, MediaSourceEventListener.MediaLoadData mediaLoadData) {
        logd(eventTime, "upstreamDiscarded", Format.toLogString(mediaLoadData.trackFormat));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2, int i3, float f) {
        logd(eventTime, "videoSize", i + ", " + i2);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVolumeChanged(AnalyticsListener.EventTime eventTime, float f) {
        logd(eventTime, "volume", Float.toString(f));
    }

    public EventLogger(@Nullable MappingTrackSelector mappingTrackSelector, String str) {
        this.trackSelector = mappingTrackSelector;
        this.tag = str;
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        this.startTimeMs = android.os.SystemClock.elapsedRealtime();
    }

    private static String getTrackStatusString(boolean z) {
        return z ? "[X]" : "[ ]";
    }

    private void logd(AnalyticsListener.EventTime eventTime, String str, String str2) {
        logd(getEventString(eventTime, str, str2, null));
    }

    private void loge(AnalyticsListener.EventTime eventTime, String str, @Nullable Throwable th) {
        loge(getEventString(eventTime, str, null, th));
    }

    public void logd(String str) {
        Log.m17580d(this.tag, str);
    }

    public void loge(String str) {
        Log.m17582e(this.tag, str);
    }
}
