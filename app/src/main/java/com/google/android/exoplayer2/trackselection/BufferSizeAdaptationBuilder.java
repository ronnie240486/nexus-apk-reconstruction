package com.google.android.exoplayer2.trackselection;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultAllocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class BufferSizeAdaptationBuilder {
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = 5000;
    public static final int DEFAULT_BUFFER_FOR_PLAYBACK_MS = 2500;
    public static final int DEFAULT_HYSTERESIS_BUFFER_MS = 5000;
    public static final int DEFAULT_MAX_BUFFER_MS = 50000;
    public static final int DEFAULT_MIN_BUFFER_MS = 15000;
    public static final float DEFAULT_START_UP_BANDWIDTH_FRACTION = 0.7f;
    public static final int DEFAULT_START_UP_MIN_BUFFER_FOR_QUALITY_INCREASE_MS = 10000;

    @Nullable
    private DefaultAllocator allocator;
    private boolean buildCalled;
    private Clock clock = Clock.DEFAULT;
    private int minBufferMs = 15000;
    private int maxBufferMs = 50000;
    private int bufferForPlaybackMs = 2500;
    private int bufferForPlaybackAfterRebufferMs = 5000;
    private int hysteresisBufferMs = 5000;
    private float startUpBandwidthFraction = 0.7f;
    private int startUpMinBufferForQualityIncreaseMs = 10000;
    private DynamicFormatFilter dynamicFormatFilter = DynamicFormatFilter.NO_FILTER;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.BufferSizeAdaptationBuilder$1 */
    public class C33451 implements TrackSelection.Factory {
        public C33451() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ TrackSelection lambda$createTrackSelections$0(BandwidthMeter bandwidthMeter, TrackSelection.Definition definition) {
            return new BufferSizeAdaptiveTrackSelection(definition.group, definition.tracks, bandwidthMeter, BufferSizeAdaptationBuilder.this.minBufferMs, BufferSizeAdaptationBuilder.this.maxBufferMs, BufferSizeAdaptationBuilder.this.hysteresisBufferMs, BufferSizeAdaptationBuilder.this.startUpBandwidthFraction, BufferSizeAdaptationBuilder.this.startUpMinBufferForQualityIncreaseMs, BufferSizeAdaptationBuilder.this.dynamicFormatFilter, BufferSizeAdaptationBuilder.this.clock, null);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection.Factory
        public TrackSelection[] createTrackSelections(TrackSelection.Definition[] definitionArr, final BandwidthMeter bandwidthMeter) {
            return TrackSelectionUtil.createTrackSelectionsForDefinitions(definitionArr, new TrackSelectionUtil.AdaptiveTrackSelectionFactory() { // from class: com.google.android.exoplayer2.trackselection.a
                @Override // com.google.android.exoplayer2.trackselection.TrackSelectionUtil.AdaptiveTrackSelectionFactory
                public final TrackSelection createAdaptiveTrackSelection(TrackSelection.Definition definition) {
                    return this.f11132a.lambda$createTrackSelections$0(bandwidthMeter, definition);
                }
            });
        }
    }

    public static final class BufferSizeAdaptiveTrackSelection extends BaseTrackSelection {
        private static final int BITRATE_BLACKLISTED = -1;
        private final BandwidthMeter bandwidthMeter;
        private final double bitrateToBufferFunctionIntercept;
        private final double bitrateToBufferFunctionSlope;
        private final Clock clock;
        private final DynamicFormatFilter dynamicFormatFilter;
        private final int[] formatBitrates;
        private final long hysteresisBufferUs;
        private boolean isInSteadyState;
        private final int maxBitrate;
        private final long maxBufferUs;
        private final int minBitrate;
        private final long minBufferUs;
        private float playbackSpeed;
        private int selectedIndex;
        private int selectionReason;
        private final float startUpBandwidthFraction;
        private final long startUpMinBufferForQualityIncreaseUs;

        private BufferSizeAdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, BandwidthMeter bandwidthMeter, int i, int i2, int i3, float f, int i4, DynamicFormatFilter dynamicFormatFilter, Clock clock) {
            super(trackGroup, iArr);
            this.bandwidthMeter = bandwidthMeter;
            long jMsToUs = C3219C.msToUs(i);
            this.minBufferUs = jMsToUs;
            long jMsToUs2 = C3219C.msToUs(i2);
            this.maxBufferUs = jMsToUs2;
            long jMsToUs3 = C3219C.msToUs(i3);
            this.hysteresisBufferUs = jMsToUs3;
            this.startUpBandwidthFraction = f;
            this.startUpMinBufferForQualityIncreaseUs = C3219C.msToUs(i4);
            this.dynamicFormatFilter = dynamicFormatFilter;
            this.clock = clock;
            this.formatBitrates = new int[this.length];
            int i5 = getFormat(0).bitrate;
            this.maxBitrate = i5;
            int i6 = getFormat(this.length - 1).bitrate;
            this.minBitrate = i6;
            this.selectionReason = 0;
            this.playbackSpeed = 1.0f;
            double d = (jMsToUs2 - jMsToUs3) - jMsToUs;
            double d2 = i5;
            double d3 = i6;
            Double.isNaN(d2);
            Double.isNaN(d3);
            double dLog = Math.log(d2 / d3);
            Double.isNaN(d);
            double d4 = d / dLog;
            this.bitrateToBufferFunctionSlope = d4;
            double d5 = jMsToUs;
            double dLog2 = Math.log(i6) * d4;
            Double.isNaN(d5);
            this.bitrateToBufferFunctionIntercept = d5 - dLog2;
        }

        private static long getCurrentPeriodBufferedDurationUs(long j, long j2) {
            return j >= 0 ? j2 : j2 + j;
        }

        private long getTargetBufferForBitrateUs(int i) {
            if (i <= this.minBitrate) {
                return this.minBufferUs;
            }
            if (i >= this.maxBitrate) {
                return this.maxBufferUs - this.hysteresisBufferUs;
            }
            return (int) ((Math.log(i) * this.bitrateToBufferFunctionSlope) + this.bitrateToBufferFunctionIntercept);
        }

        private boolean isOutsideHysteresis(long j) {
            int i = this.formatBitrates[this.selectedIndex];
            return i == -1 || Math.abs(j - getTargetBufferForBitrateUs(i)) > this.hysteresisBufferUs;
        }

        private int selectIdealIndexUsingBandwidth(boolean z) {
            long bitrateEstimate = (long) (this.bandwidthMeter.getBitrateEstimate() * this.startUpBandwidthFraction);
            int i = 0;
            int i2 = 0;
            while (true) {
                int[] iArr = this.formatBitrates;
                if (i >= iArr.length) {
                    return i2;
                }
                int i3 = iArr[i];
                if (i3 != -1) {
                    if (Math.round(i3 * this.playbackSpeed) <= bitrateEstimate && this.dynamicFormatFilter.isFormatAllowed(getFormat(i), this.formatBitrates[i], z)) {
                        return i;
                    }
                    i2 = i;
                }
                i++;
            }
        }

        private int selectIdealIndexUsingBufferSize(long j) {
            int i = 0;
            int i2 = 0;
            while (true) {
                int[] iArr = this.formatBitrates;
                if (i >= iArr.length) {
                    return i2;
                }
                int i3 = iArr[i];
                if (i3 != -1) {
                    if (getTargetBufferForBitrateUs(i3) <= j && this.dynamicFormatFilter.isFormatAllowed(getFormat(i), this.formatBitrates[i], false)) {
                        return i;
                    }
                    i2 = i;
                }
                i++;
            }
        }

        private void selectIndexStartUpPhase(long j) {
            int iSelectIdealIndexUsingBandwidth = selectIdealIndexUsingBandwidth(false);
            int iSelectIdealIndexUsingBufferSize = selectIdealIndexUsingBufferSize(j);
            int i = this.selectedIndex;
            if (iSelectIdealIndexUsingBufferSize <= i) {
                this.selectedIndex = iSelectIdealIndexUsingBufferSize;
                this.isInSteadyState = true;
            } else if (j >= this.startUpMinBufferForQualityIncreaseUs || iSelectIdealIndexUsingBandwidth >= i || this.formatBitrates[i] == -1) {
                this.selectedIndex = iSelectIdealIndexUsingBandwidth;
            }
        }

        private void selectIndexSteadyState(long j) {
            if (isOutsideHysteresis(j)) {
                this.selectedIndex = selectIdealIndexUsingBufferSize(j);
            }
        }

        private void updateFormatBitrates(long j) {
            for (int i = 0; i < this.length; i++) {
                if (j == Long.MIN_VALUE || !isBlacklisted(i, j)) {
                    this.formatBitrates[i] = getFormat(i).bitrate;
                } else {
                    this.formatBitrates[i] = -1;
                }
            }
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public int getSelectedIndex() {
            return this.selectedIndex;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        @Nullable
        public Object getSelectionData() {
            return null;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public int getSelectionReason() {
            return this.selectionReason;
        }

        @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.TrackSelection
        public void onDiscontinuity() {
            this.isInSteadyState = false;
        }

        @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.TrackSelection
        public void onPlaybackSpeed(float f) {
            this.playbackSpeed = f;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public void updateSelectedTrack(long j, long j2, long j3, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
            updateFormatBitrates(this.clock.elapsedRealtime());
            if (this.selectionReason == 0) {
                this.selectionReason = 1;
                this.selectedIndex = selectIdealIndexUsingBandwidth(true);
                return;
            }
            long currentPeriodBufferedDurationUs = getCurrentPeriodBufferedDurationUs(j, j2);
            int i = this.selectedIndex;
            if (this.isInSteadyState) {
                selectIndexSteadyState(currentPeriodBufferedDurationUs);
            } else {
                selectIndexStartUpPhase(currentPeriodBufferedDurationUs);
            }
            if (this.selectedIndex != i) {
                this.selectionReason = 3;
            }
        }

        public /* synthetic */ BufferSizeAdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, BandwidthMeter bandwidthMeter, int i, int i2, int i3, float f, int i4, DynamicFormatFilter dynamicFormatFilter, Clock clock, C33451 c33451) {
            this(trackGroup, iArr, bandwidthMeter, i, i2, i3, f, i4, dynamicFormatFilter, clock);
        }
    }

    public interface DynamicFormatFilter {
        public static final DynamicFormatFilter NO_FILTER = new DynamicFormatFilter() { // from class: P7
            /* JADX WARN: Invalid debug info offset */
            @Override // com.google.android.exoplayer2.trackselection.BufferSizeAdaptationBuilder.DynamicFormatFilter
            public final boolean isFormatAllowed(Format format, int i, boolean z) {
                return false;
            }
        };

        boolean isFormatAllowed(Format format, int i, boolean z);
    }

    public Pair<TrackSelection.Factory, LoadControl> buildPlayerComponents() {
        Assertions.checkArgument(this.hysteresisBufferMs < this.maxBufferMs - this.minBufferMs);
        Assertions.checkState(!this.buildCalled);
        this.buildCalled = true;
        DefaultLoadControl.Builder targetBufferBytes = new DefaultLoadControl.Builder().setTargetBufferBytes(Integer.MAX_VALUE);
        int i = this.maxBufferMs;
        DefaultLoadControl.Builder bufferDurationsMs = targetBufferBytes.setBufferDurationsMs(i, i, this.bufferForPlaybackMs, this.bufferForPlaybackAfterRebufferMs);
        DefaultAllocator defaultAllocator = this.allocator;
        if (defaultAllocator != null) {
            bufferDurationsMs.setAllocator(defaultAllocator);
        }
        return Pair.create(new C33451(), bufferDurationsMs.createDefaultLoadControl());
    }

    public BufferSizeAdaptationBuilder setAllocator(DefaultAllocator defaultAllocator) {
        Assertions.checkState(!this.buildCalled);
        this.allocator = defaultAllocator;
        return this;
    }

    public BufferSizeAdaptationBuilder setBufferDurationsMs(int i, int i2, int i3, int i4) {
        Assertions.checkState(!this.buildCalled);
        this.minBufferMs = i;
        this.maxBufferMs = i2;
        this.bufferForPlaybackMs = i3;
        this.bufferForPlaybackAfterRebufferMs = i4;
        return this;
    }

    public BufferSizeAdaptationBuilder setClock(Clock clock) {
        Assertions.checkState(!this.buildCalled);
        this.clock = clock;
        return this;
    }

    public BufferSizeAdaptationBuilder setDynamicFormatFilter(DynamicFormatFilter dynamicFormatFilter) {
        Assertions.checkState(!this.buildCalled);
        this.dynamicFormatFilter = dynamicFormatFilter;
        return this;
    }

    public BufferSizeAdaptationBuilder setHysteresisBufferMs(int i) {
        Assertions.checkState(!this.buildCalled);
        this.hysteresisBufferMs = i;
        return this;
    }

    public BufferSizeAdaptationBuilder setStartUpTrackSelectionParameters(float f, int i) {
        Assertions.checkState(!this.buildCalled);
        this.startUpBandwidthFraction = f;
        this.startUpMinBufferForQualityIncreaseMs = i;
        return this;
    }
}
