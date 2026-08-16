package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.FrameworkMediaCrypto;
import com.google.android.exoplayer2.mediacodec.MediaCodecInfo;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecSelector;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.MediaFormatUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MediaClock;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.C4615jV;
import p000.C5516uN;

/* JADX INFO: loaded from: classes2.dex */
public class MediaCodecAudioRenderer extends MediaCodecRenderer implements MediaClock {
    private static final int MAX_PENDING_STREAM_CHANGE_COUNT = 10;
    private static final String TAG = "MediaCodecAudioRenderer";
    private static final String VIVO_BITS_PER_SAMPLE_KEY = "v-bits-per-sample";
    private boolean allowFirstBufferPositionDiscontinuity;
    private boolean allowPositionDiscontinuity;
    private final AudioSink audioSink;
    private int codecMaxInputSize;
    private boolean codecNeedsDiscardChannelsWorkaround;
    private boolean codecNeedsEosBufferTimestampWorkaround;
    private final Context context;
    private long currentPositionUs;
    private final AudioRendererEventListener.EventDispatcher eventDispatcher;

    @Nullable
    private Format inputFormat;
    private long lastInputTimeUs;
    private boolean passthroughEnabled;
    private MediaFormat passthroughMediaFormat;
    private int pendingStreamChangeCount;
    private final long[] pendingStreamChangeTimesUs;

    public final class AudioSinkListener implements AudioSink.Listener {
        private AudioSinkListener() {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onAudioSessionId(int i) {
            MediaCodecAudioRenderer.this.eventDispatcher.audioSessionId(i);
            MediaCodecAudioRenderer.this.onAudioSessionId(i);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onPositionDiscontinuity() {
            MediaCodecAudioRenderer.this.onAudioTrackPositionDiscontinuity();
            MediaCodecAudioRenderer.this.allowPositionDiscontinuity = true;
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onUnderrun(int i, long j, long j2) {
            MediaCodecAudioRenderer.this.eventDispatcher.audioTrackUnderrun(i, j, j2);
            MediaCodecAudioRenderer.this.onAudioTrackUnderrun(i, j, j2);
        }
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector) {
        this(context, mediaCodecSelector, (DrmSessionManager<FrameworkMediaCrypto>) null, false);
    }

    private static boolean codecNeedsDiscardChannelsWorkaround(String str) {
        if (Util.SDK_INT < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(Util.MANUFACTURER)) {
            String str2 = Util.DEVICE;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    private static boolean codecNeedsEosBufferTimestampWorkaround(String str) {
        if (Util.SDK_INT < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(Util.MANUFACTURER)) {
            String str2 = Util.DEVICE;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    private static boolean deviceDoesntSupportOperatingRate() {
        if (Util.SDK_INT == 23) {
            String str = Util.MODEL;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private int getCodecMaxInputSize(MediaCodecInfo mediaCodecInfo, Format format) {
        int i;
        if (!"OMX.google.raw.decoder".equals(mediaCodecInfo.name) || (i = Util.SDK_INT) >= 24 || (i == 23 && Util.isTv(this.context))) {
            return format.maxInputSize;
        }
        return -1;
    }

    private static int getPcmEncoding(Format format) {
        if (MimeTypes.AUDIO_RAW.equals(format.sampleMimeType)) {
            return format.pcmEncoding;
        }
        return 2;
    }

    private void updateCurrentPosition() {
        long currentPositionUs = this.audioSink.getCurrentPositionUs(isEnded());
        if (currentPositionUs != Long.MIN_VALUE) {
            if (!this.allowPositionDiscontinuity) {
                currentPositionUs = Math.max(this.currentPositionUs, currentPositionUs);
            }
            this.currentPositionUs = currentPositionUs;
            this.allowPositionDiscontinuity = false;
        }
    }

    public boolean allowPassthrough(int i, String str) {
        return getPassthroughEncoding(i, str) != 0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public int canKeepCodec(MediaCodec mediaCodec, MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        if (getCodecMaxInputSize(mediaCodecInfo, format2) <= this.codecMaxInputSize && format.encoderDelay == 0 && format.encoderPadding == 0 && format2.encoderDelay == 0 && format2.encoderPadding == 0) {
            if (mediaCodecInfo.isSeamlessAdaptationSupported(format, format2, true)) {
                return 3;
            }
            if (canKeepCodecWithFlush(format, format2)) {
                return 1;
            }
        }
        return 0;
    }

    public boolean canKeepCodecWithFlush(Format format, Format format2) {
        return Util.areEqual(format.sampleMimeType, format2.sampleMimeType) && format.channelCount == format2.channelCount && format.sampleRate == format2.sampleRate && format.pcmEncoding == format2.pcmEncoding && format.initializationDataEquals(format2) && !MimeTypes.AUDIO_OPUS.equals(format.sampleMimeType);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void configureCodec(MediaCodecInfo mediaCodecInfo, MediaCodec mediaCodec, Format format, @Nullable MediaCrypto mediaCrypto, float f) {
        this.codecMaxInputSize = getCodecMaxInputSize(mediaCodecInfo, format, getStreamFormats());
        this.codecNeedsDiscardChannelsWorkaround = codecNeedsDiscardChannelsWorkaround(mediaCodecInfo.name);
        this.codecNeedsEosBufferTimestampWorkaround = codecNeedsEosBufferTimestampWorkaround(mediaCodecInfo.name);
        boolean z = mediaCodecInfo.passthrough;
        this.passthroughEnabled = z;
        MediaFormat mediaFormat = getMediaFormat(format, z ? MimeTypes.AUDIO_RAW : mediaCodecInfo.codecMimeType, this.codecMaxInputSize, f);
        mediaCodec.configure(mediaFormat, (Surface) null, mediaCrypto, 0);
        if (!this.passthroughEnabled) {
            this.passthroughMediaFormat = null;
        } else {
            this.passthroughMediaFormat = mediaFormat;
            mediaFormat.setString("mime", format.sampleMimeType);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public float getCodecOperatingRateV23(float f, Format format, Format[] formatArr) {
        int iMax = -1;
        for (Format format2 : formatArr) {
            int i = format2.sampleRate;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f * iMax;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean z) throws MediaCodecUtil.DecoderQueryException {
        MediaCodecInfo passthroughDecoderInfo;
        String str = format.sampleMimeType;
        if (str == null) {
            return Collections.emptyList();
        }
        if (allowPassthrough(format.channelCount, str) && (passthroughDecoderInfo = mediaCodecSelector.getPassthroughDecoderInfo()) != null) {
            return Collections.singletonList(passthroughDecoderInfo);
        }
        List<MediaCodecInfo> decoderInfosSortedByFormatSupport = MediaCodecUtil.getDecoderInfosSortedByFormatSupport(mediaCodecSelector.getDecoderInfos(str, z, false), format);
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(str)) {
            ArrayList arrayList = new ArrayList(decoderInfosSortedByFormatSupport);
            arrayList.addAll(mediaCodecSelector.getDecoderInfos(MimeTypes.AUDIO_E_AC3, z, false));
            decoderInfosSortedByFormatSupport = arrayList;
        }
        return Collections.unmodifiableList(decoderInfosSortedByFormatSupport);
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    @Nullable
    public MediaClock getMediaClock() {
        return this;
    }

    @SuppressLint({"InlinedApi"})
    public MediaFormat getMediaFormat(Format format, String str, int i, float f) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", format.channelCount);
        mediaFormat.setInteger("sample-rate", format.sampleRate);
        MediaFormatUtil.setCsdBuffers(mediaFormat, format.initializationData);
        MediaFormatUtil.maybeSetInteger(mediaFormat, "max-input-size", i);
        int i2 = Util.SDK_INT;
        if (i2 >= 23) {
            mediaFormat.setInteger(C4615jV.f14798l, 0);
            if (f != -1.0f && !deviceDoesntSupportOperatingRate()) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (i2 <= 28 && MimeTypes.AUDIO_AC4.equals(format.sampleMimeType)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        return mediaFormat;
    }

    public int getPassthroughEncoding(int i, String str) {
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(str)) {
            if (this.audioSink.supportsOutput(-1, 18)) {
                return MimeTypes.getEncoding(MimeTypes.AUDIO_E_AC3_JOC);
            }
            str = MimeTypes.AUDIO_E_AC3;
        }
        int encoding = MimeTypes.getEncoding(str);
        if (this.audioSink.supportsOutput(i, encoding)) {
            return encoding;
        }
        return 0;
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public PlaybackParameters getPlaybackParameters() {
        return this.audioSink.getPlaybackParameters();
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public long getPositionUs() {
        if (getState() == 2) {
            updateCurrentPosition();
        }
        return this.currentPositionUs;
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.PlayerMessage.Target
    public void handleMessage(int i, @Nullable Object obj) throws ExoPlaybackException {
        if (i == 2) {
            this.audioSink.setVolume(((Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            this.audioSink.setAudioAttributes((AudioAttributes) obj);
        } else if (i != 5) {
            super.handleMessage(i, obj);
        } else {
            this.audioSink.setAuxEffectInfo((AuxEffectInfo) obj);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
        return super.isEnded() && this.audioSink.isEnded();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.Renderer
    public boolean isReady() {
        return this.audioSink.hasPendingData() || super.isReady();
    }

    public void onAudioSessionId(int i) {
    }

    public void onAudioTrackPositionDiscontinuity() {
    }

    public void onAudioTrackUnderrun(int i, long j, long j2) {
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void onCodecInitialized(String str, long j, long j2) {
        this.eventDispatcher.decoderInitialized(str, j, j2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public void onDisabled() {
        try {
            this.lastInputTimeUs = C3219C.TIME_UNSET;
            this.pendingStreamChangeCount = 0;
            this.audioSink.flush();
            try {
                super.onDisabled();
            } finally {
                this.eventDispatcher.disabled(this.decoderCounters);
            }
        } catch (Throwable th) {
            try {
                super.onDisabled();
                throw th;
            } finally {
                this.eventDispatcher.disabled(this.decoderCounters);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public void onEnabled(boolean z) throws ExoPlaybackException {
        super.onEnabled(z);
        this.eventDispatcher.enabled(this.decoderCounters);
        int i = getConfiguration().tunnelingAudioSessionId;
        if (i != 0) {
            this.audioSink.enableTunnelingV21(i);
        } else {
            this.audioSink.disableTunneling();
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void onInputFormatChanged(FormatHolder formatHolder) throws ExoPlaybackException {
        super.onInputFormatChanged(formatHolder);
        Format format = formatHolder.format;
        this.inputFormat = format;
        this.eventDispatcher.inputFormatChanged(format);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) throws ExoPlaybackException {
        int pcmEncoding;
        int[] iArr;
        int i;
        MediaFormat mediaFormat2 = this.passthroughMediaFormat;
        if (mediaFormat2 != null) {
            pcmEncoding = getPassthroughEncoding(mediaFormat2.getInteger("channel-count"), mediaFormat2.getString("mime"));
            mediaFormat = mediaFormat2;
        } else {
            pcmEncoding = mediaFormat.containsKey(VIVO_BITS_PER_SAMPLE_KEY) ? Util.getPcmEncoding(mediaFormat.getInteger(VIVO_BITS_PER_SAMPLE_KEY)) : getPcmEncoding(this.inputFormat);
        }
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.codecNeedsDiscardChannelsWorkaround && integer == 6 && (i = this.inputFormat.channelCount) < 6) {
            iArr = new int[i];
            for (int i2 = 0; i2 < this.inputFormat.channelCount; i2++) {
                iArr[i2] = i2;
            }
        } else {
            iArr = null;
        }
        int[] iArr2 = iArr;
        try {
            AudioSink audioSink = this.audioSink;
            Format format = this.inputFormat;
            audioSink.configure(pcmEncoding, integer, integer2, 0, iArr2, format.encoderDelay, format.encoderPadding);
        } catch (AudioSink.ConfigurationException e) {
            throw createRendererException(e, this.inputFormat);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public void onPositionReset(long j, boolean z) throws ExoPlaybackException {
        super.onPositionReset(j, z);
        this.audioSink.flush();
        this.currentPositionUs = j;
        this.allowFirstBufferPositionDiscontinuity = true;
        this.allowPositionDiscontinuity = true;
        this.lastInputTimeUs = C3219C.TIME_UNSET;
        this.pendingStreamChangeCount = 0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    public void onProcessedOutputBuffer(long j) {
        while (this.pendingStreamChangeCount != 0 && j >= this.pendingStreamChangeTimesUs[0]) {
            this.audioSink.handleDiscontinuity();
            int i = this.pendingStreamChangeCount - 1;
            this.pendingStreamChangeCount = i;
            long[] jArr = this.pendingStreamChangeTimesUs;
            System.arraycopy(jArr, 1, jArr, 0, i);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        if (this.allowFirstBufferPositionDiscontinuity && !decoderInputBuffer.isDecodeOnly()) {
            if (Math.abs(decoderInputBuffer.timeUs - this.currentPositionUs) > 500000) {
                this.currentPositionUs = decoderInputBuffer.timeUs;
            }
            this.allowFirstBufferPositionDiscontinuity = false;
        }
        this.lastInputTimeUs = Math.max(decoderInputBuffer.timeUs, this.lastInputTimeUs);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public void onReset() {
        try {
            super.onReset();
        } finally {
            this.audioSink.reset();
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public void onStarted() {
        super.onStarted();
        this.audioSink.play();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public void onStopped() {
        updateCurrentPosition();
        this.audioSink.pause();
        super.onStopped();
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onStreamChanged(Format[] formatArr, long j) throws ExoPlaybackException {
        super.onStreamChanged(formatArr, j);
        if (this.lastInputTimeUs != C3219C.TIME_UNSET) {
            int i = this.pendingStreamChangeCount;
            if (i == this.pendingStreamChangeTimesUs.length) {
                Log.m17586w(TAG, "Too many stream changes, so dropping change at " + this.pendingStreamChangeTimesUs[this.pendingStreamChangeCount - 1]);
            } else {
                this.pendingStreamChangeCount = i + 1;
            }
            this.pendingStreamChangeTimesUs[this.pendingStreamChangeCount - 1] = this.lastInputTimeUs;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean processOutputBuffer(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, boolean z2, Format format) throws ExoPlaybackException {
        if (this.codecNeedsEosBufferTimestampWorkaround && j3 == 0 && (i2 & 4) != 0) {
            long j4 = this.lastInputTimeUs;
            if (j4 != C3219C.TIME_UNSET) {
                j3 = j4;
            }
        }
        if (this.passthroughEnabled && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        }
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.decoderCounters.skippedOutputBufferCount++;
            this.audioSink.handleDiscontinuity();
            return true;
        }
        try {
            if (!this.audioSink.handleBuffer(byteBuffer, j3)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.decoderCounters.renderedOutputBufferCount++;
            return true;
        } catch (AudioSink.InitializationException | AudioSink.WriteException e) {
            throw createRendererException(e, this.inputFormat);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void renderToEndOfStream() throws ExoPlaybackException {
        try {
            this.audioSink.playToEndOfStream();
        } catch (AudioSink.WriteException e) {
            throw createRendererException(e, this.inputFormat);
        }
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.audioSink.setPlaybackParameters(playbackParameters);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public int supportsFormat(MediaCodecSelector mediaCodecSelector, @Nullable DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, Format format) throws MediaCodecUtil.DecoderQueryException {
        String str = format.sampleMimeType;
        if (!MimeTypes.isAudio(str)) {
            return C5516uN.m28604a(0);
        }
        int i = Util.SDK_INT >= 21 ? 32 : 0;
        boolean z = format.drmInitData == null || FrameworkMediaCrypto.class.equals(format.exoMediaCryptoType) || (format.exoMediaCryptoType == null && BaseRenderer.supportsFormatDrm(drmSessionManager, format.drmInitData));
        int i2 = 8;
        if (z && allowPassthrough(format.channelCount, str) && mediaCodecSelector.getPassthroughDecoderInfo() != null) {
            return C5516uN.m28605b(4, 8, i);
        }
        if ((MimeTypes.AUDIO_RAW.equals(str) && !this.audioSink.supportsOutput(format.channelCount, format.pcmEncoding)) || !this.audioSink.supportsOutput(format.channelCount, 2)) {
            return C5516uN.m28604a(1);
        }
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(mediaCodecSelector, format, false);
        if (decoderInfos.isEmpty()) {
            return C5516uN.m28604a(1);
        }
        if (!z) {
            return C5516uN.m28604a(2);
        }
        MediaCodecInfo mediaCodecInfo = decoderInfos.get(0);
        boolean zIsFormatSupported = mediaCodecInfo.isFormatSupported(format);
        if (zIsFormatSupported && mediaCodecInfo.isSeamlessAdaptationSupported(format)) {
            i2 = 16;
        }
        return C5516uN.m28605b(zIsFormatSupported ? 4 : 3, i2, i);
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, @Nullable Handler handler, @Nullable AudioRendererEventListener audioRendererEventListener) {
        this(context, mediaCodecSelector, (DrmSessionManager<FrameworkMediaCrypto>) null, false, handler, audioRendererEventListener);
    }

    public int getCodecMaxInputSize(MediaCodecInfo mediaCodecInfo, Format format, Format[] formatArr) {
        int codecMaxInputSize = getCodecMaxInputSize(mediaCodecInfo, format);
        if (formatArr.length == 1) {
            return codecMaxInputSize;
        }
        for (Format format2 : formatArr) {
            if (mediaCodecInfo.isSeamlessAdaptationSupported(format, format2, false)) {
                codecMaxInputSize = Math.max(codecMaxInputSize, getCodecMaxInputSize(mediaCodecInfo, format2));
            }
        }
        return codecMaxInputSize;
    }

    @Deprecated
    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, @Nullable DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, boolean z) {
        this(context, mediaCodecSelector, drmSessionManager, z, (Handler) null, (AudioRendererEventListener) null);
    }

    @Deprecated
    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, @Nullable DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, boolean z, @Nullable Handler handler, @Nullable AudioRendererEventListener audioRendererEventListener) {
        this(context, mediaCodecSelector, drmSessionManager, z, handler, audioRendererEventListener, (AudioCapabilities) null, new AudioProcessor[0]);
    }

    @Deprecated
    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, @Nullable DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, boolean z, @Nullable Handler handler, @Nullable AudioRendererEventListener audioRendererEventListener, @Nullable AudioCapabilities audioCapabilities, AudioProcessor... audioProcessorArr) {
        this(context, mediaCodecSelector, drmSessionManager, z, handler, audioRendererEventListener, new DefaultAudioSink(audioCapabilities, audioProcessorArr));
    }

    @Deprecated
    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, @Nullable DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, boolean z, @Nullable Handler handler, @Nullable AudioRendererEventListener audioRendererEventListener, AudioSink audioSink) {
        this(context, mediaCodecSelector, drmSessionManager, z, false, handler, audioRendererEventListener, audioSink);
    }

    @Deprecated
    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, @Nullable DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, boolean z, boolean z2, @Nullable Handler handler, @Nullable AudioRendererEventListener audioRendererEventListener, AudioSink audioSink) {
        super(1, mediaCodecSelector, drmSessionManager, z, z2, 44100.0f);
        this.context = context.getApplicationContext();
        this.audioSink = audioSink;
        this.lastInputTimeUs = C3219C.TIME_UNSET;
        this.pendingStreamChangeTimesUs = new long[10];
        this.eventDispatcher = new AudioRendererEventListener.EventDispatcher(handler, audioRendererEventListener);
        audioSink.setListener(new AudioSinkListener());
    }

    public MediaCodecAudioRenderer(Context context, MediaCodecSelector mediaCodecSelector, boolean z, @Nullable Handler handler, @Nullable AudioRendererEventListener audioRendererEventListener, AudioSink audioSink) {
        this(context, mediaCodecSelector, (DrmSessionManager<FrameworkMediaCrypto>) null, false, z, handler, audioRendererEventListener, audioSink);
    }
}
