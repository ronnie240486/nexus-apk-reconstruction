package com.google.android.exoplayer2.audio;

import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.SimpleDecoder;
import com.google.android.exoplayer2.decoder.SimpleOutputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MediaClock;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import p000.C0435Gg;
import p000.C5516uN;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SimpleDecoderAudioRenderer extends BaseRenderer implements MediaClock {
    private static final int REINITIALIZATION_STATE_NONE = 0;
    private static final int REINITIALIZATION_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int REINITIALIZATION_STATE_WAIT_END_OF_STREAM = 2;
    private boolean allowFirstBufferPositionDiscontinuity;
    private boolean allowPositionDiscontinuity;
    private final AudioSink audioSink;
    private boolean audioTrackNeedsConfigure;
    private long currentPositionUs;
    private SimpleDecoder<DecoderInputBuffer, ? extends SimpleOutputBuffer, ? extends AudioDecoderException> decoder;
    private DecoderCounters decoderCounters;

    @Nullable
    private DrmSession<ExoMediaCrypto> decoderDrmSession;
    private boolean decoderReceivedBuffers;
    private int decoderReinitializationState;
    private boolean drmResourcesAcquired;
    private final DrmSessionManager<ExoMediaCrypto> drmSessionManager;
    private int encoderDelay;
    private int encoderPadding;
    private final AudioRendererEventListener.EventDispatcher eventDispatcher;
    private final DecoderInputBuffer flagsOnlyBuffer;
    private DecoderInputBuffer inputBuffer;
    private Format inputFormat;
    private boolean inputStreamEnded;
    private SimpleOutputBuffer outputBuffer;
    private boolean outputStreamEnded;
    private final boolean playClearSamplesWithoutKeys;

    @Nullable
    private DrmSession<ExoMediaCrypto> sourceDrmSession;
    private boolean waitingForKeys;

    public final class AudioSinkListener implements AudioSink.Listener {
        private AudioSinkListener() {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onAudioSessionId(int i) {
            SimpleDecoderAudioRenderer.this.eventDispatcher.audioSessionId(i);
            SimpleDecoderAudioRenderer.this.onAudioSessionId(i);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onPositionDiscontinuity() {
            SimpleDecoderAudioRenderer.this.onAudioTrackPositionDiscontinuity();
            SimpleDecoderAudioRenderer.this.allowPositionDiscontinuity = true;
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.Listener
        public void onUnderrun(int i, long j, long j2) {
            SimpleDecoderAudioRenderer.this.eventDispatcher.audioTrackUnderrun(i, j, j2);
            SimpleDecoderAudioRenderer.this.onAudioTrackUnderrun(i, j, j2);
        }
    }

    public SimpleDecoderAudioRenderer() {
        this((Handler) null, (AudioRendererEventListener) null, new AudioProcessor[0]);
    }

    private boolean drainOutputBuffer() throws ExoPlaybackException, AudioSink.WriteException, AudioDecoderException, AudioSink.InitializationException, AudioSink.ConfigurationException {
        if (this.outputBuffer == null) {
            SimpleOutputBuffer simpleOutputBuffer = (SimpleOutputBuffer) this.decoder.dequeueOutputBuffer();
            this.outputBuffer = simpleOutputBuffer;
            if (simpleOutputBuffer == null) {
                return false;
            }
            int i = simpleOutputBuffer.skippedOutputBufferCount;
            if (i > 0) {
                this.decoderCounters.skippedOutputBufferCount += i;
                this.audioSink.handleDiscontinuity();
            }
        }
        if (this.outputBuffer.isEndOfStream()) {
            if (this.decoderReinitializationState == 2) {
                releaseDecoder();
                maybeInitDecoder();
                this.audioTrackNeedsConfigure = true;
            } else {
                this.outputBuffer.release();
                this.outputBuffer = null;
                processEndOfStream();
            }
            return false;
        }
        if (this.audioTrackNeedsConfigure) {
            Format outputFormat = getOutputFormat();
            this.audioSink.configure(outputFormat.pcmEncoding, outputFormat.channelCount, outputFormat.sampleRate, 0, null, this.encoderDelay, this.encoderPadding);
            this.audioTrackNeedsConfigure = false;
        }
        AudioSink audioSink = this.audioSink;
        SimpleOutputBuffer simpleOutputBuffer2 = this.outputBuffer;
        if (!audioSink.handleBuffer(simpleOutputBuffer2.data, simpleOutputBuffer2.timeUs)) {
            return false;
        }
        this.decoderCounters.renderedOutputBufferCount++;
        this.outputBuffer.release();
        this.outputBuffer = null;
        return true;
    }

    private boolean feedInputBuffer() throws Exception {
        SimpleDecoder<DecoderInputBuffer, ? extends SimpleOutputBuffer, ? extends AudioDecoderException> simpleDecoder = this.decoder;
        if (simpleDecoder == null || this.decoderReinitializationState == 2 || this.inputStreamEnded) {
            return false;
        }
        if (this.inputBuffer == null) {
            DecoderInputBuffer decoderInputBufferDequeueInputBuffer = simpleDecoder.dequeueInputBuffer();
            this.inputBuffer = decoderInputBufferDequeueInputBuffer;
            if (decoderInputBufferDequeueInputBuffer == null) {
                return false;
            }
        }
        if (this.decoderReinitializationState == 1) {
            this.inputBuffer.setFlags(4);
            this.decoder.queueInputBuffer(this.inputBuffer);
            this.inputBuffer = null;
            this.decoderReinitializationState = 2;
            return false;
        }
        FormatHolder formatHolder = getFormatHolder();
        int source = this.waitingForKeys ? -4 : readSource(formatHolder, this.inputBuffer, false);
        if (source == -3) {
            return false;
        }
        if (source == -5) {
            onInputFormatChanged(formatHolder);
            return true;
        }
        if (this.inputBuffer.isEndOfStream()) {
            this.inputStreamEnded = true;
            this.decoder.queueInputBuffer(this.inputBuffer);
            this.inputBuffer = null;
            return false;
        }
        boolean zShouldWaitForKeys = shouldWaitForKeys(this.inputBuffer.isEncrypted());
        this.waitingForKeys = zShouldWaitForKeys;
        if (zShouldWaitForKeys) {
            return false;
        }
        this.inputBuffer.flip();
        onQueueInputBuffer(this.inputBuffer);
        this.decoder.queueInputBuffer(this.inputBuffer);
        this.decoderReceivedBuffers = true;
        this.decoderCounters.inputBufferCount++;
        this.inputBuffer = null;
        return true;
    }

    private void flushDecoder() throws ExoPlaybackException {
        this.waitingForKeys = false;
        if (this.decoderReinitializationState != 0) {
            releaseDecoder();
            maybeInitDecoder();
            return;
        }
        this.inputBuffer = null;
        SimpleOutputBuffer simpleOutputBuffer = this.outputBuffer;
        if (simpleOutputBuffer != null) {
            simpleOutputBuffer.release();
            this.outputBuffer = null;
        }
        this.decoder.flush();
        this.decoderReceivedBuffers = false;
    }

    private void maybeInitDecoder() throws ExoPlaybackException {
        ExoMediaCrypto mediaCrypto;
        if (this.decoder != null) {
            return;
        }
        setDecoderDrmSession(this.sourceDrmSession);
        DrmSession<ExoMediaCrypto> drmSession = this.decoderDrmSession;
        if (drmSession != null) {
            mediaCrypto = drmSession.getMediaCrypto();
            if (mediaCrypto == null && this.decoderDrmSession.getError() == null) {
                return;
            }
        } else {
            mediaCrypto = null;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            TraceUtil.beginSection("createAudioDecoder");
            this.decoder = createDecoder(this.inputFormat, mediaCrypto);
            TraceUtil.endSection();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.eventDispatcher.decoderInitialized(this.decoder.getName(), jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
            this.decoderCounters.decoderInitCount++;
        } catch (AudioDecoderException e) {
            throw createRendererException(e, this.inputFormat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void onInputFormatChanged(FormatHolder formatHolder) throws ExoPlaybackException {
        Format format = (Format) Assertions.checkNotNull(formatHolder.format);
        if (formatHolder.includesDrmSession) {
            setSourceDrmSession(formatHolder.drmSession);
        } else {
            this.sourceDrmSession = getUpdatedSourceDrmSession(this.inputFormat, format, this.drmSessionManager, this.sourceDrmSession);
        }
        Format format2 = this.inputFormat;
        this.inputFormat = format;
        if (!canKeepCodec(format2, format)) {
            if (this.decoderReceivedBuffers) {
                this.decoderReinitializationState = 1;
            } else {
                releaseDecoder();
                maybeInitDecoder();
                this.audioTrackNeedsConfigure = true;
            }
        }
        Format format3 = this.inputFormat;
        this.encoderDelay = format3.encoderDelay;
        this.encoderPadding = format3.encoderPadding;
        this.eventDispatcher.inputFormatChanged(format3);
    }

    private void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        if (!this.allowFirstBufferPositionDiscontinuity || decoderInputBuffer.isDecodeOnly()) {
            return;
        }
        if (Math.abs(decoderInputBuffer.timeUs - this.currentPositionUs) > 500000) {
            this.currentPositionUs = decoderInputBuffer.timeUs;
        }
        this.allowFirstBufferPositionDiscontinuity = false;
    }

    private void processEndOfStream() throws ExoPlaybackException {
        this.outputStreamEnded = true;
        try {
            this.audioSink.playToEndOfStream();
        } catch (AudioSink.WriteException e) {
            throw createRendererException(e, this.inputFormat);
        }
    }

    private void releaseDecoder() {
        this.inputBuffer = null;
        this.outputBuffer = null;
        this.decoderReinitializationState = 0;
        this.decoderReceivedBuffers = false;
        SimpleDecoder<DecoderInputBuffer, ? extends SimpleOutputBuffer, ? extends AudioDecoderException> simpleDecoder = this.decoder;
        if (simpleDecoder != null) {
            simpleDecoder.release();
            this.decoder = null;
            this.decoderCounters.decoderReleaseCount++;
        }
        setDecoderDrmSession(null);
    }

    private void setDecoderDrmSession(@Nullable DrmSession<ExoMediaCrypto> drmSession) {
        C0435Gg.m2122b(this.decoderDrmSession, drmSession);
        this.decoderDrmSession = drmSession;
    }

    private void setSourceDrmSession(@Nullable DrmSession<ExoMediaCrypto> drmSession) {
        C0435Gg.m2122b(this.sourceDrmSession, drmSession);
        this.sourceDrmSession = drmSession;
    }

    private boolean shouldWaitForKeys(boolean z) throws ExoPlaybackException {
        DrmSession<ExoMediaCrypto> drmSession = this.decoderDrmSession;
        if (drmSession == null || (!z && (this.playClearSamplesWithoutKeys || drmSession.playClearSamplesWithoutKeys()))) {
            return false;
        }
        int state = this.decoderDrmSession.getState();
        if (state != 1) {
            return state != 4;
        }
        throw createRendererException(this.decoderDrmSession.getError(), this.inputFormat);
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

    public boolean canKeepCodec(Format format, Format format2) {
        return false;
    }

    public abstract SimpleDecoder<DecoderInputBuffer, ? extends SimpleOutputBuffer, ? extends AudioDecoderException> createDecoder(Format format, @Nullable ExoMediaCrypto exoMediaCrypto) throws AudioDecoderException;

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    @Nullable
    public MediaClock getMediaClock() {
        return this;
    }

    public abstract Format getOutputFormat();

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

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded && this.audioSink.isEnded();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isReady() {
        return this.audioSink.hasPendingData() || !(this.inputFormat == null || this.waitingForKeys || (!isSourceReady() && this.outputBuffer == null));
    }

    public void onAudioSessionId(int i) {
    }

    public void onAudioTrackPositionDiscontinuity() {
    }

    public void onAudioTrackUnderrun(int i, long j, long j2) {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onDisabled() {
        this.inputFormat = null;
        this.audioTrackNeedsConfigure = true;
        this.waitingForKeys = false;
        try {
            setSourceDrmSession(null);
            releaseDecoder();
            this.audioSink.reset();
        } finally {
            this.eventDispatcher.disabled(this.decoderCounters);
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onEnabled(boolean z) throws ExoPlaybackException {
        DrmSessionManager<ExoMediaCrypto> drmSessionManager = this.drmSessionManager;
        if (drmSessionManager != null && !this.drmResourcesAcquired) {
            this.drmResourcesAcquired = true;
            drmSessionManager.prepare();
        }
        DecoderCounters decoderCounters = new DecoderCounters();
        this.decoderCounters = decoderCounters;
        this.eventDispatcher.enabled(decoderCounters);
        int i = getConfiguration().tunnelingAudioSessionId;
        if (i != 0) {
            this.audioSink.enableTunnelingV21(i);
        } else {
            this.audioSink.disableTunneling();
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onPositionReset(long j, boolean z) throws ExoPlaybackException {
        this.audioSink.flush();
        this.currentPositionUs = j;
        this.allowFirstBufferPositionDiscontinuity = true;
        this.allowPositionDiscontinuity = true;
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        if (this.decoder != null) {
            flushDecoder();
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onReset() {
        DrmSessionManager<ExoMediaCrypto> drmSessionManager = this.drmSessionManager;
        if (drmSessionManager == null || !this.drmResourcesAcquired) {
            return;
        }
        this.drmResourcesAcquired = false;
        drmSessionManager.release();
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onStarted() {
        this.audioSink.play();
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onStopped() {
        updateCurrentPosition();
        this.audioSink.pause();
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void render(long j, long j2) throws ExoPlaybackException {
        if (this.outputStreamEnded) {
            try {
                this.audioSink.playToEndOfStream();
                return;
            } catch (AudioSink.WriteException e) {
                throw createRendererException(e, this.inputFormat);
            }
        }
        if (this.inputFormat == null) {
            FormatHolder formatHolder = getFormatHolder();
            this.flagsOnlyBuffer.clear();
            int source = readSource(formatHolder, this.flagsOnlyBuffer, true);
            if (source != -5) {
                if (source == -4) {
                    Assertions.checkState(this.flagsOnlyBuffer.isEndOfStream());
                    this.inputStreamEnded = true;
                    processEndOfStream();
                    return;
                }
                return;
            }
            onInputFormatChanged(formatHolder);
        }
        maybeInitDecoder();
        if (this.decoder != null) {
            try {
                TraceUtil.beginSection("drainAndFeed");
                while (drainOutputBuffer()) {
                }
                while (feedInputBuffer()) {
                }
                TraceUtil.endSection();
                this.decoderCounters.ensureUpdated();
            } catch (AudioDecoderException | AudioSink.ConfigurationException | AudioSink.InitializationException | AudioSink.WriteException e2) {
                throw createRendererException(e2, this.inputFormat);
            }
        }
    }

    @Override // com.google.android.exoplayer2.util.MediaClock
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.audioSink.setPlaybackParameters(playbackParameters);
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int supportsFormat(Format format) {
        if (!MimeTypes.isAudio(format.sampleMimeType)) {
            return C5516uN.m28604a(0);
        }
        int iSupportsFormatInternal = supportsFormatInternal(this.drmSessionManager, format);
        if (iSupportsFormatInternal <= 2) {
            return C5516uN.m28604a(iSupportsFormatInternal);
        }
        return C5516uN.m28605b(iSupportsFormatInternal, 8, Util.SDK_INT >= 21 ? 32 : 0);
    }

    public abstract int supportsFormatInternal(@Nullable DrmSessionManager<ExoMediaCrypto> drmSessionManager, Format format);

    public final boolean supportsOutput(int i, int i2) {
        return this.audioSink.supportsOutput(i, i2);
    }

    public SimpleDecoderAudioRenderer(@Nullable Handler handler, @Nullable AudioRendererEventListener audioRendererEventListener, @Nullable AudioCapabilities audioCapabilities) {
        this(handler, audioRendererEventListener, audioCapabilities, null, false, new AudioProcessor[0]);
    }

    public SimpleDecoderAudioRenderer(@Nullable Handler handler, @Nullable AudioRendererEventListener audioRendererEventListener, @Nullable AudioCapabilities audioCapabilities, @Nullable DrmSessionManager<ExoMediaCrypto> drmSessionManager, boolean z, AudioProcessor... audioProcessorArr) {
        this(handler, audioRendererEventListener, drmSessionManager, z, new DefaultAudioSink(audioCapabilities, audioProcessorArr));
    }

    public SimpleDecoderAudioRenderer(@Nullable Handler handler, @Nullable AudioRendererEventListener audioRendererEventListener, @Nullable DrmSessionManager<ExoMediaCrypto> drmSessionManager, boolean z, AudioSink audioSink) {
        super(1);
        this.drmSessionManager = drmSessionManager;
        this.playClearSamplesWithoutKeys = z;
        this.eventDispatcher = new AudioRendererEventListener.EventDispatcher(handler, audioRendererEventListener);
        this.audioSink = audioSink;
        audioSink.setListener(new AudioSinkListener());
        this.flagsOnlyBuffer = DecoderInputBuffer.newFlagsOnlyInstance();
        this.decoderReinitializationState = 0;
        this.audioTrackNeedsConfigure = true;
    }

    public SimpleDecoderAudioRenderer(@Nullable Handler handler, @Nullable AudioRendererEventListener audioRendererEventListener, AudioProcessor... audioProcessorArr) {
        this(handler, audioRendererEventListener, null, null, false, audioProcessorArr);
    }
}
