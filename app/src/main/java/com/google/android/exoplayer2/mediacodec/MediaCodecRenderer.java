package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.FrameworkMediaCrypto;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.TimedValueQueue;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import org.dom4j.p020io.SAXEventRecorder;
import p000.C0435Gg;
import p000.C3007bz;
import p000.C4192cz;
import p000.C4257dz;
import p000.C4321ez;
import p000.C4384fz;
import p000.C4448gz;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MediaCodecRenderer extends BaseRenderer {
    private static final byte[] ADAPTATION_WORKAROUND_BUFFER = {0, 0, 1, 103, 66, -64, SAXEventRecorder.SAXEvent.f16645n, -38, 37, -112, 0, 0, 1, 104, -50, SAXEventRecorder.SAXEvent.f16649r, SAXEventRecorder.SAXEvent.f16653v, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private static final int ADAPTATION_WORKAROUND_MODE_ALWAYS = 2;
    private static final int ADAPTATION_WORKAROUND_MODE_NEVER = 0;
    private static final int ADAPTATION_WORKAROUND_MODE_SAME_RESOLUTION = 1;
    private static final int ADAPTATION_WORKAROUND_SLICE_WIDTH_HEIGHT = 32;
    protected static final float CODEC_OPERATING_RATE_UNSET = -1.0f;
    private static final int DRAIN_ACTION_FLUSH = 1;
    private static final int DRAIN_ACTION_NONE = 0;
    private static final int DRAIN_ACTION_REINITIALIZE = 3;
    private static final int DRAIN_ACTION_UPDATE_DRM_SESSION = 2;
    private static final int DRAIN_STATE_NONE = 0;
    private static final int DRAIN_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int DRAIN_STATE_WAIT_END_OF_STREAM = 2;
    protected static final int KEEP_CODEC_RESULT_NO = 0;
    protected static final int KEEP_CODEC_RESULT_YES_WITHOUT_RECONFIGURATION = 3;
    protected static final int KEEP_CODEC_RESULT_YES_WITH_FLUSH = 1;
    protected static final int KEEP_CODEC_RESULT_YES_WITH_RECONFIGURATION = 2;
    private static final long MAX_CODEC_HOTSWAP_TIME_MS = 1000;
    private static final int RECONFIGURATION_STATE_NONE = 0;
    private static final int RECONFIGURATION_STATE_QUEUE_PENDING = 2;
    private static final int RECONFIGURATION_STATE_WRITE_PENDING = 1;
    private static final String TAG = "MediaCodecRenderer";
    private final float assumedMinimumCodecOperatingRate;

    @Nullable
    private ArrayDeque<MediaCodecInfo> availableCodecInfos;
    private final DecoderInputBuffer buffer;

    @Nullable
    private MediaCodec codec;
    private int codecAdaptationWorkaroundMode;
    private int codecDrainAction;
    private int codecDrainState;

    @Nullable
    private DrmSession<FrameworkMediaCrypto> codecDrmSession;

    @Nullable
    private Format codecFormat;
    private boolean codecHasOutputMediaFormat;
    private long codecHotswapDeadlineMs;

    @Nullable
    private MediaCodecInfo codecInfo;
    private boolean codecNeedsAdaptationWorkaroundBuffer;
    private boolean codecNeedsDiscardToSpsWorkaround;
    private boolean codecNeedsEosFlushWorkaround;
    private boolean codecNeedsEosOutputExceptionWorkaround;
    private boolean codecNeedsEosPropagation;
    private boolean codecNeedsFlushWorkaround;
    private boolean codecNeedsMonoChannelCountWorkaround;
    private boolean codecNeedsReconfigureWorkaround;
    private boolean codecNeedsSosFlushWorkaround;
    private float codecOperatingRate;
    private boolean codecReceivedBuffers;
    private boolean codecReceivedEos;
    private int codecReconfigurationState;
    private boolean codecReconfigured;
    private final ArrayList<Long> decodeOnlyPresentationTimestamps;
    protected DecoderCounters decoderCounters;
    private boolean drmResourcesAcquired;

    @Nullable
    private final DrmSessionManager<FrameworkMediaCrypto> drmSessionManager;
    private final boolean enableDecoderFallback;
    private final DecoderInputBuffer flagsOnlyBuffer;
    private final TimedValueQueue<Format> formatQueue;
    private ByteBuffer[] inputBuffers;

    @Nullable
    private Format inputFormat;
    private int inputIndex;
    private boolean inputStreamEnded;
    private boolean isDecodeOnlyOutputBuffer;
    private boolean isLastOutputBuffer;
    private long largestQueuedPresentationTimeUs;
    private long lastBufferInStreamPresentationTimeUs;
    private final MediaCodecSelector mediaCodecSelector;

    @Nullable
    private MediaCrypto mediaCrypto;
    private boolean mediaCryptoRequiresSecureDecoder;
    private ByteBuffer outputBuffer;
    private final MediaCodec.BufferInfo outputBufferInfo;
    private ByteBuffer[] outputBuffers;
    private Format outputFormat;
    private int outputIndex;
    private boolean outputStreamEnded;
    private boolean pendingOutputEndOfStream;
    private final boolean playClearSamplesWithoutKeys;

    @Nullable
    private DecoderInitializationException preferredDecoderInitializationException;
    private long renderTimeLimitMs;
    private float rendererOperatingRate;
    private boolean shouldSkipAdaptationWorkaroundOutputBuffer;
    private boolean skipMediaCodecStopOnRelease;

    @Nullable
    private DrmSession<FrameworkMediaCrypto> sourceDrmSession;
    private boolean waitingForFirstSampleInFormat;
    private boolean waitingForFirstSyncSample;
    private boolean waitingForKeys;

    public static class DecoderException extends Exception {

        @Nullable
        public final MediaCodecInfo codecInfo;

        @Nullable
        public final String diagnosticInfo;

        public DecoderException(Throwable th, @Nullable MediaCodecInfo mediaCodecInfo) {
            StringBuilder sb = new StringBuilder("Decoder failed: ");
            sb.append(mediaCodecInfo == null ? null : mediaCodecInfo.name);
            super(sb.toString(), th);
            this.codecInfo = mediaCodecInfo;
            this.diagnosticInfo = Util.SDK_INT >= 21 ? getDiagnosticInfoV21(th) : null;
        }

        @TargetApi(21)
        private static String getDiagnosticInfoV21(Throwable th) {
            if (C4192cz.m19779a(th)) {
                return C4448gz.m20883a(C4384fz.m20695a(th));
            }
            return null;
        }
    }

    public static class DecoderInitializationException extends Exception {
        private static final int CUSTOM_ERROR_CODE_BASE = -50000;
        private static final int DECODER_QUERY_ERROR = -49998;
        private static final int NO_SUITABLE_DECODER_ERROR = -49999;

        @Nullable
        public final MediaCodecInfo codecInfo;

        @Nullable
        public final String diagnosticInfo;

        @Nullable
        public final DecoderInitializationException fallbackDecoderInitializationException;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(Format format, Throwable th, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + format, th, format.sampleMimeType, z, null, buildCustomDiagnosticInfo(i), null);
        }

        private static String buildCustomDiagnosticInfo(int i) {
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @CheckResult
        public DecoderInitializationException copyWithFallbackException(DecoderInitializationException decoderInitializationException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.mimeType, this.secureDecoderRequired, this.codecInfo, this.diagnosticInfo, decoderInitializationException);
        }

        @TargetApi(21)
        private static String getDiagnosticInfoV21(Throwable th) {
            if (C4192cz.m19779a(th)) {
                return C4448gz.m20883a(C4384fz.m20695a(th));
            }
            return null;
        }

        public DecoderInitializationException(Format format, Throwable th, boolean z, MediaCodecInfo mediaCodecInfo) {
            this("Decoder init failed: " + mediaCodecInfo.name + ", " + format, th, format.sampleMimeType, z, mediaCodecInfo, Util.SDK_INT >= 21 ? getDiagnosticInfoV21(th) : null, null);
        }

        private DecoderInitializationException(String str, Throwable th, String str2, boolean z, @Nullable MediaCodecInfo mediaCodecInfo, @Nullable String str3, @Nullable DecoderInitializationException decoderInitializationException) {
            super(str, th);
            this.mimeType = str2;
            this.secureDecoderRequired = z;
            this.codecInfo = mediaCodecInfo;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = decoderInitializationException;
        }
    }

    public MediaCodecRenderer(int i, MediaCodecSelector mediaCodecSelector, @Nullable DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, boolean z, boolean z2, float f) {
        super(i);
        this.mediaCodecSelector = (MediaCodecSelector) Assertions.checkNotNull(mediaCodecSelector);
        this.drmSessionManager = drmSessionManager;
        this.playClearSamplesWithoutKeys = z;
        this.enableDecoderFallback = z2;
        this.assumedMinimumCodecOperatingRate = f;
        this.buffer = new DecoderInputBuffer(0);
        this.flagsOnlyBuffer = DecoderInputBuffer.newFlagsOnlyInstance();
        this.formatQueue = new TimedValueQueue<>();
        this.decodeOnlyPresentationTimestamps = new ArrayList<>();
        this.outputBufferInfo = new MediaCodec.BufferInfo();
        this.codecReconfigurationState = 0;
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
        this.codecOperatingRate = CODEC_OPERATING_RATE_UNSET;
        this.rendererOperatingRate = 1.0f;
        this.renderTimeLimitMs = C3219C.TIME_UNSET;
    }

    private int codecAdaptationWorkaroundMode(String str) {
        int i = Util.SDK_INT;
        if (i <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = Util.MODEL;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = Util.DEVICE;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private static boolean codecNeedsDiscardToSpsWorkaround(String str, Format format) {
        return Util.SDK_INT < 21 && format.initializationData.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private static boolean codecNeedsEosFlushWorkaround(String str) {
        int i = Util.SDK_INT;
        if (i > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i <= 19) {
                String str2 = Util.DEVICE;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    private static boolean codecNeedsEosOutputExceptionWorkaround(String str) {
        return Util.SDK_INT == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean codecNeedsEosPropagationWorkaround(MediaCodecInfo mediaCodecInfo) {
        String str = mediaCodecInfo.name;
        int i = Util.SDK_INT;
        return (i <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || ("Amazon".equals(Util.MANUFACTURER) && "AFTS".equals(Util.MODEL) && mediaCodecInfo.secure));
    }

    private static boolean codecNeedsFlushWorkaround(String str) {
        int i = Util.SDK_INT;
        return i < 18 || (i == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i == 19 && Util.MODEL.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    private static boolean codecNeedsMonoChannelCountWorkaround(String str, Format format) {
        return Util.SDK_INT <= 18 && format.channelCount == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    private static boolean codecNeedsReconfigureWorkaround(String str) {
        return Util.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean codecNeedsSosFlushWorkaround(String str) {
        return Util.SDK_INT == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void drainAndFlushCodec() {
        if (this.codecReceivedBuffers) {
            this.codecDrainState = 1;
            this.codecDrainAction = 1;
        }
    }

    private void drainAndReinitializeCodec() throws ExoPlaybackException {
        if (!this.codecReceivedBuffers) {
            reinitializeCodec();
        } else {
            this.codecDrainState = 1;
            this.codecDrainAction = 3;
        }
    }

    private void drainAndUpdateCodecDrmSession() throws ExoPlaybackException {
        if (Util.SDK_INT < 23) {
            drainAndReinitializeCodec();
        } else if (!this.codecReceivedBuffers) {
            updateDrmSessionOrReinitializeCodecV23();
        } else {
            this.codecDrainState = 1;
            this.codecDrainAction = 2;
        }
    }

    private boolean drainOutputBuffer(long j, long j2) throws ExoPlaybackException {
        boolean z;
        boolean zProcessOutputBuffer;
        int iDequeueOutputBuffer;
        if (!hasOutputBuffer()) {
            if (this.codecNeedsEosOutputExceptionWorkaround && this.codecReceivedEos) {
                try {
                    iDequeueOutputBuffer = this.codec.dequeueOutputBuffer(this.outputBufferInfo, getDequeueOutputBufferTimeoutUs());
                } catch (IllegalStateException unused) {
                    processEndOfStream();
                    if (this.outputStreamEnded) {
                        releaseCodec();
                    }
                    return false;
                }
            } else {
                iDequeueOutputBuffer = this.codec.dequeueOutputBuffer(this.outputBufferInfo, getDequeueOutputBufferTimeoutUs());
            }
            if (iDequeueOutputBuffer < 0) {
                if (iDequeueOutputBuffer == -2) {
                    processOutputFormat();
                    return true;
                }
                if (iDequeueOutputBuffer == -3) {
                    processOutputBuffersChanged();
                    return true;
                }
                if (this.codecNeedsEosPropagation && (this.inputStreamEnded || this.codecDrainState == 2)) {
                    processEndOfStream();
                }
                return false;
            }
            if (this.shouldSkipAdaptationWorkaroundOutputBuffer) {
                this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
                this.codec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.outputBufferInfo;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                processEndOfStream();
                return false;
            }
            this.outputIndex = iDequeueOutputBuffer;
            ByteBuffer outputBuffer = getOutputBuffer(iDequeueOutputBuffer);
            this.outputBuffer = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(this.outputBufferInfo.offset);
                ByteBuffer byteBuffer = this.outputBuffer;
                MediaCodec.BufferInfo bufferInfo2 = this.outputBufferInfo;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            this.isDecodeOnlyOutputBuffer = isDecodeOnlyBuffer(this.outputBufferInfo.presentationTimeUs);
            long j3 = this.lastBufferInStreamPresentationTimeUs;
            long j4 = this.outputBufferInfo.presentationTimeUs;
            this.isLastOutputBuffer = j3 == j4;
            updateOutputFormatForTime(j4);
        }
        if (this.codecNeedsEosOutputExceptionWorkaround && this.codecReceivedEos) {
            try {
                MediaCodec mediaCodec = this.codec;
                ByteBuffer byteBuffer2 = this.outputBuffer;
                int i = this.outputIndex;
                MediaCodec.BufferInfo bufferInfo3 = this.outputBufferInfo;
                z = false;
                try {
                    zProcessOutputBuffer = processOutputBuffer(j, j2, mediaCodec, byteBuffer2, i, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.isDecodeOnlyOutputBuffer, this.isLastOutputBuffer, this.outputFormat);
                } catch (IllegalStateException unused2) {
                    processEndOfStream();
                    if (this.outputStreamEnded) {
                        releaseCodec();
                    }
                    return z;
                }
            } catch (IllegalStateException unused3) {
                z = false;
            }
        } else {
            z = false;
            MediaCodec mediaCodec2 = this.codec;
            ByteBuffer byteBuffer3 = this.outputBuffer;
            int i2 = this.outputIndex;
            MediaCodec.BufferInfo bufferInfo4 = this.outputBufferInfo;
            zProcessOutputBuffer = processOutputBuffer(j, j2, mediaCodec2, byteBuffer3, i2, bufferInfo4.flags, bufferInfo4.presentationTimeUs, this.isDecodeOnlyOutputBuffer, this.isLastOutputBuffer, this.outputFormat);
        }
        if (zProcessOutputBuffer) {
            onProcessedOutputBuffer(this.outputBufferInfo.presentationTimeUs);
            boolean z2 = (this.outputBufferInfo.flags & 4) != 0;
            resetOutputBuffer();
            if (!z2) {
                return true;
            }
            processEndOfStream();
        }
        return z;
    }

    private boolean feedInputBuffer() throws ExoPlaybackException {
        int iPosition;
        int source;
        MediaCodec mediaCodec = this.codec;
        if (mediaCodec == null || this.codecDrainState == 2 || this.inputStreamEnded) {
            return false;
        }
        if (this.inputIndex < 0) {
            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.inputIndex = iDequeueInputBuffer;
            if (iDequeueInputBuffer < 0) {
                return false;
            }
            this.buffer.data = getInputBuffer(iDequeueInputBuffer);
            this.buffer.clear();
        }
        if (this.codecDrainState == 1) {
            if (!this.codecNeedsEosPropagation) {
                this.codecReceivedEos = true;
                this.codec.queueInputBuffer(this.inputIndex, 0, 0, 0L, 4);
                resetInputBuffer();
            }
            this.codecDrainState = 2;
            return false;
        }
        if (this.codecNeedsAdaptationWorkaroundBuffer) {
            this.codecNeedsAdaptationWorkaroundBuffer = false;
            ByteBuffer byteBuffer = this.buffer.data;
            byte[] bArr = ADAPTATION_WORKAROUND_BUFFER;
            byteBuffer.put(bArr);
            this.codec.queueInputBuffer(this.inputIndex, 0, bArr.length, 0L, 0);
            resetInputBuffer();
            this.codecReceivedBuffers = true;
            return true;
        }
        FormatHolder formatHolder = getFormatHolder();
        if (this.waitingForKeys) {
            source = -4;
            iPosition = 0;
        } else {
            if (this.codecReconfigurationState == 1) {
                for (int i = 0; i < this.codecFormat.initializationData.size(); i++) {
                    this.buffer.data.put(this.codecFormat.initializationData.get(i));
                }
                this.codecReconfigurationState = 2;
            }
            iPosition = this.buffer.data.position();
            source = readSource(formatHolder, this.buffer, false);
        }
        if (hasReadStreamToEnd()) {
            this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
        }
        if (source == -3) {
            return false;
        }
        if (source == -5) {
            if (this.codecReconfigurationState == 2) {
                this.buffer.clear();
                this.codecReconfigurationState = 1;
            }
            onInputFormatChanged(formatHolder);
            return true;
        }
        if (this.buffer.isEndOfStream()) {
            if (this.codecReconfigurationState == 2) {
                this.buffer.clear();
                this.codecReconfigurationState = 1;
            }
            this.inputStreamEnded = true;
            if (!this.codecReceivedBuffers) {
                processEndOfStream();
                return false;
            }
            try {
                if (!this.codecNeedsEosPropagation) {
                    this.codecReceivedEos = true;
                    this.codec.queueInputBuffer(this.inputIndex, 0, 0, 0L, 4);
                    resetInputBuffer();
                }
                return false;
            } catch (MediaCodec.CryptoException e) {
                throw createRendererException(e, this.inputFormat);
            }
        }
        if (this.waitingForFirstSyncSample && !this.buffer.isKeyFrame()) {
            this.buffer.clear();
            if (this.codecReconfigurationState == 2) {
                this.codecReconfigurationState = 1;
            }
            return true;
        }
        this.waitingForFirstSyncSample = false;
        boolean zIsEncrypted = this.buffer.isEncrypted();
        boolean zShouldWaitForKeys = shouldWaitForKeys(zIsEncrypted);
        this.waitingForKeys = zShouldWaitForKeys;
        if (zShouldWaitForKeys) {
            return false;
        }
        if (this.codecNeedsDiscardToSpsWorkaround && !zIsEncrypted) {
            NalUnitUtil.discardToSps(this.buffer.data);
            if (this.buffer.data.position() == 0) {
                return true;
            }
            this.codecNeedsDiscardToSpsWorkaround = false;
        }
        try {
            DecoderInputBuffer decoderInputBuffer = this.buffer;
            long j = decoderInputBuffer.timeUs;
            if (decoderInputBuffer.isDecodeOnly()) {
                this.decodeOnlyPresentationTimestamps.add(Long.valueOf(j));
            }
            if (this.waitingForFirstSampleInFormat) {
                this.formatQueue.add(j, this.inputFormat);
                this.waitingForFirstSampleInFormat = false;
            }
            this.largestQueuedPresentationTimeUs = Math.max(this.largestQueuedPresentationTimeUs, j);
            this.buffer.flip();
            if (this.buffer.hasSupplementalData()) {
                handleInputBufferSupplementalData(this.buffer);
            }
            onQueueInputBuffer(this.buffer);
            if (zIsEncrypted) {
                this.codec.queueSecureInputBuffer(this.inputIndex, 0, getFrameworkCryptoInfo(this.buffer, iPosition), j, 0);
            } else {
                this.codec.queueInputBuffer(this.inputIndex, 0, this.buffer.data.limit(), j, 0);
            }
            resetInputBuffer();
            this.codecReceivedBuffers = true;
            this.codecReconfigurationState = 0;
            this.decoderCounters.inputBufferCount++;
            return true;
        } catch (MediaCodec.CryptoException e2) {
            throw createRendererException(e2, this.inputFormat);
        }
    }

    private List<MediaCodecInfo> getAvailableCodecInfos(boolean z) throws MediaCodecUtil.DecoderQueryException {
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(this.mediaCodecSelector, this.inputFormat, z);
        if (decoderInfos.isEmpty() && z) {
            decoderInfos = getDecoderInfos(this.mediaCodecSelector, this.inputFormat, false);
            if (!decoderInfos.isEmpty()) {
                Log.m17586w(TAG, "Drm session requires secure decoder for " + this.inputFormat.sampleMimeType + ", but no secure decoder available. Trying to proceed with " + decoderInfos + ".");
            }
        }
        return decoderInfos;
    }

    private void getCodecBuffers(MediaCodec mediaCodec) {
        if (Util.SDK_INT < 21) {
            this.inputBuffers = mediaCodec.getInputBuffers();
            this.outputBuffers = mediaCodec.getOutputBuffers();
        }
    }

    private static MediaCodec.CryptoInfo getFrameworkCryptoInfo(DecoderInputBuffer decoderInputBuffer, int i) {
        MediaCodec.CryptoInfo frameworkCryptoInfo = decoderInputBuffer.cryptoInfo.getFrameworkCryptoInfo();
        if (i == 0) {
            return frameworkCryptoInfo;
        }
        if (frameworkCryptoInfo.numBytesOfClearData == null) {
            frameworkCryptoInfo.numBytesOfClearData = new int[1];
        }
        int[] iArr = frameworkCryptoInfo.numBytesOfClearData;
        iArr[0] = iArr[0] + i;
        return frameworkCryptoInfo;
    }

    private ByteBuffer getInputBuffer(int i) {
        return Util.SDK_INT >= 21 ? C4257dz.m19998a(this.codec, i) : this.inputBuffers[i];
    }

    private ByteBuffer getOutputBuffer(int i) {
        return Util.SDK_INT >= 21 ? C3007bz.m14711a(this.codec, i) : this.outputBuffers[i];
    }

    private boolean hasOutputBuffer() {
        return this.outputIndex >= 0;
    }

    private void initCodec(MediaCodecInfo mediaCodecInfo, MediaCrypto mediaCrypto) throws Exception {
        String str = mediaCodecInfo.name;
        int i = Util.SDK_INT;
        float f = CODEC_OPERATING_RATE_UNSET;
        float codecOperatingRateV23 = i < 23 ? CODEC_OPERATING_RATE_UNSET : getCodecOperatingRateV23(this.rendererOperatingRate, this.inputFormat, getStreamFormats());
        if (codecOperatingRateV23 > this.assumedMinimumCodecOperatingRate) {
            f = codecOperatingRateV23;
        }
        MediaCodec mediaCodecCreateByCodecName = null;
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            TraceUtil.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            TraceUtil.endSection();
            TraceUtil.beginSection("configureCodec");
            configureCodec(mediaCodecInfo, mediaCodecCreateByCodecName, this.inputFormat, mediaCrypto, f);
            TraceUtil.endSection();
            TraceUtil.beginSection("startCodec");
            mediaCodecCreateByCodecName.start();
            TraceUtil.endSection();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            getCodecBuffers(mediaCodecCreateByCodecName);
            this.codec = mediaCodecCreateByCodecName;
            this.codecInfo = mediaCodecInfo;
            this.codecOperatingRate = f;
            this.codecFormat = this.inputFormat;
            this.codecAdaptationWorkaroundMode = codecAdaptationWorkaroundMode(str);
            this.codecNeedsReconfigureWorkaround = codecNeedsReconfigureWorkaround(str);
            this.codecNeedsDiscardToSpsWorkaround = codecNeedsDiscardToSpsWorkaround(str, this.codecFormat);
            this.codecNeedsFlushWorkaround = codecNeedsFlushWorkaround(str);
            this.codecNeedsSosFlushWorkaround = codecNeedsSosFlushWorkaround(str);
            this.codecNeedsEosFlushWorkaround = codecNeedsEosFlushWorkaround(str);
            this.codecNeedsEosOutputExceptionWorkaround = codecNeedsEosOutputExceptionWorkaround(str);
            this.codecNeedsMonoChannelCountWorkaround = codecNeedsMonoChannelCountWorkaround(str, this.codecFormat);
            this.codecNeedsEosPropagation = codecNeedsEosPropagationWorkaround(mediaCodecInfo) || getCodecNeedsEosPropagation();
            resetInputBuffer();
            resetOutputBuffer();
            this.codecHotswapDeadlineMs = getState() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
            this.codecReconfigured = false;
            this.codecReconfigurationState = 0;
            this.codecReceivedEos = false;
            this.codecReceivedBuffers = false;
            this.largestQueuedPresentationTimeUs = C3219C.TIME_UNSET;
            this.lastBufferInStreamPresentationTimeUs = C3219C.TIME_UNSET;
            this.codecDrainState = 0;
            this.codecDrainAction = 0;
            this.codecNeedsAdaptationWorkaroundBuffer = false;
            this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
            this.isDecodeOnlyOutputBuffer = false;
            this.isLastOutputBuffer = false;
            this.waitingForFirstSyncSample = true;
            this.decoderCounters.decoderInitCount++;
            onCodecInitialized(str, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Exception e) {
            if (mediaCodecCreateByCodecName != null) {
                resetCodecBuffers();
                mediaCodecCreateByCodecName.release();
            }
            throw e;
        }
    }

    private boolean isDecodeOnlyBuffer(long j) {
        int size = this.decodeOnlyPresentationTimestamps.size();
        for (int i = 0; i < size; i++) {
            if (this.decodeOnlyPresentationTimestamps.get(i).longValue() == j) {
                this.decodeOnlyPresentationTimestamps.remove(i);
                return true;
            }
        }
        return false;
    }

    private static boolean isMediaCodecException(IllegalStateException illegalStateException) {
        if (Util.SDK_INT >= 21 && isMediaCodecExceptionV21(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    @TargetApi(21)
    private static boolean isMediaCodecExceptionV21(IllegalStateException illegalStateException) {
        return C4192cz.m19779a(illegalStateException);
    }

    private void maybeInitCodecWithFallback(MediaCrypto mediaCrypto, boolean z) throws DecoderInitializationException {
        if (this.availableCodecInfos == null) {
            try {
                List<MediaCodecInfo> availableCodecInfos = getAvailableCodecInfos(z);
                ArrayDeque<MediaCodecInfo> arrayDeque = new ArrayDeque<>();
                this.availableCodecInfos = arrayDeque;
                if (this.enableDecoderFallback) {
                    arrayDeque.addAll(availableCodecInfos);
                } else if (!availableCodecInfos.isEmpty()) {
                    this.availableCodecInfos.add(availableCodecInfos.get(0));
                }
                this.preferredDecoderInitializationException = null;
            } catch (MediaCodecUtil.DecoderQueryException e) {
                throw new DecoderInitializationException(this.inputFormat, e, z, -49998);
            }
        }
        if (this.availableCodecInfos.isEmpty()) {
            throw new DecoderInitializationException(this.inputFormat, (Throwable) null, z, -49999);
        }
        while (this.codec == null) {
            MediaCodecInfo mediaCodecInfoPeekFirst = this.availableCodecInfos.peekFirst();
            if (!shouldInitCodec(mediaCodecInfoPeekFirst)) {
                return;
            }
            try {
                initCodec(mediaCodecInfoPeekFirst, mediaCrypto);
            } catch (Exception e2) {
                Log.m17587w(TAG, "Failed to initialize decoder: " + mediaCodecInfoPeekFirst, e2);
                this.availableCodecInfos.removeFirst();
                DecoderInitializationException decoderInitializationException = new DecoderInitializationException(this.inputFormat, e2, z, mediaCodecInfoPeekFirst);
                if (this.preferredDecoderInitializationException == null) {
                    this.preferredDecoderInitializationException = decoderInitializationException;
                } else {
                    this.preferredDecoderInitializationException = this.preferredDecoderInitializationException.copyWithFallbackException(decoderInitializationException);
                }
                if (this.availableCodecInfos.isEmpty()) {
                    throw this.preferredDecoderInitializationException;
                }
            }
        }
        this.availableCodecInfos = null;
    }

    private static boolean maybeRequiresSecureDecoder(DrmSession<FrameworkMediaCrypto> drmSession, Format format) {
        FrameworkMediaCrypto frameworkMediaCrypto = (FrameworkMediaCrypto) drmSession.getMediaCrypto();
        if (frameworkMediaCrypto == null) {
            return true;
        }
        if (frameworkMediaCrypto.forceAllowInsecureDecoderComponents) {
            return false;
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(frameworkMediaCrypto.uuid, frameworkMediaCrypto.sessionId);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(format.sampleMimeType);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    private void processEndOfStream() throws ExoPlaybackException {
        int i = this.codecDrainAction;
        if (i == 1) {
            flushOrReinitializeCodec();
            return;
        }
        if (i == 2) {
            updateDrmSessionOrReinitializeCodecV23();
        } else if (i == 3) {
            reinitializeCodec();
        } else {
            this.outputStreamEnded = true;
            renderToEndOfStream();
        }
    }

    private void processOutputBuffersChanged() {
        if (Util.SDK_INT < 21) {
            this.outputBuffers = this.codec.getOutputBuffers();
        }
    }

    private void processOutputFormat() throws ExoPlaybackException {
        this.codecHasOutputMediaFormat = true;
        MediaFormat outputFormat = this.codec.getOutputFormat();
        if (this.codecAdaptationWorkaroundMode != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.shouldSkipAdaptationWorkaroundOutputBuffer = true;
            return;
        }
        if (this.codecNeedsMonoChannelCountWorkaround) {
            outputFormat.setInteger("channel-count", 1);
        }
        onOutputFormatChanged(this.codec, outputFormat);
    }

    private boolean readToFlagsOnlyBuffer(boolean z) throws ExoPlaybackException {
        FormatHolder formatHolder = getFormatHolder();
        this.flagsOnlyBuffer.clear();
        int source = readSource(formatHolder, this.flagsOnlyBuffer, z);
        if (source == -5) {
            onInputFormatChanged(formatHolder);
            return true;
        }
        if (source != -4 || !this.flagsOnlyBuffer.isEndOfStream()) {
            return false;
        }
        this.inputStreamEnded = true;
        processEndOfStream();
        return false;
    }

    private void reinitializeCodec() throws ExoPlaybackException {
        releaseCodec();
        maybeInitCodec();
    }

    private void resetCodecBuffers() {
        if (Util.SDK_INT < 21) {
            this.inputBuffers = null;
            this.outputBuffers = null;
        }
    }

    private void resetInputBuffer() {
        this.inputIndex = -1;
        this.buffer.data = null;
    }

    private void resetOutputBuffer() {
        this.outputIndex = -1;
        this.outputBuffer = null;
    }

    private void setCodecDrmSession(@Nullable DrmSession<FrameworkMediaCrypto> drmSession) {
        C0435Gg.m2122b(this.codecDrmSession, drmSession);
        this.codecDrmSession = drmSession;
    }

    private void setSourceDrmSession(@Nullable DrmSession<FrameworkMediaCrypto> drmSession) {
        C0435Gg.m2122b(this.sourceDrmSession, drmSession);
        this.sourceDrmSession = drmSession;
    }

    private boolean shouldContinueFeeding(long j) {
        return this.renderTimeLimitMs == C3219C.TIME_UNSET || SystemClock.elapsedRealtime() - j < this.renderTimeLimitMs;
    }

    private boolean shouldWaitForKeys(boolean z) throws ExoPlaybackException {
        DrmSession<FrameworkMediaCrypto> drmSession = this.codecDrmSession;
        if (drmSession == null || (!z && (this.playClearSamplesWithoutKeys || drmSession.playClearSamplesWithoutKeys()))) {
            return false;
        }
        int state = this.codecDrmSession.getState();
        if (state != 1) {
            return state != 4;
        }
        throw createRendererException(this.codecDrmSession.getError(), this.inputFormat);
    }

    private void updateCodecOperatingRate() throws ExoPlaybackException {
        if (Util.SDK_INT < 23) {
            return;
        }
        float codecOperatingRateV23 = getCodecOperatingRateV23(this.rendererOperatingRate, this.codecFormat, getStreamFormats());
        float f = this.codecOperatingRate;
        if (f == codecOperatingRateV23) {
            return;
        }
        if (codecOperatingRateV23 == CODEC_OPERATING_RATE_UNSET) {
            drainAndReinitializeCodec();
            return;
        }
        if (f != CODEC_OPERATING_RATE_UNSET || codecOperatingRateV23 > this.assumedMinimumCodecOperatingRate) {
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", codecOperatingRateV23);
            this.codec.setParameters(bundle);
            this.codecOperatingRate = codecOperatingRateV23;
        }
    }

    @TargetApi(23)
    private void updateDrmSessionOrReinitializeCodecV23() throws ExoPlaybackException {
        FrameworkMediaCrypto frameworkMediaCrypto = (FrameworkMediaCrypto) this.sourceDrmSession.getMediaCrypto();
        if (frameworkMediaCrypto == null) {
            reinitializeCodec();
            return;
        }
        if (C3219C.PLAYREADY_UUID.equals(frameworkMediaCrypto.uuid)) {
            reinitializeCodec();
            return;
        }
        if (flushOrReinitializeCodec()) {
            return;
        }
        try {
            C4321ez.m20213a(this.mediaCrypto, frameworkMediaCrypto.sessionId);
            setCodecDrmSession(this.sourceDrmSession);
            this.codecDrainState = 0;
            this.codecDrainAction = 0;
        } catch (MediaCryptoException e) {
            throw createRendererException(e, this.inputFormat);
        }
    }

    public int canKeepCodec(MediaCodec mediaCodec, MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        return 0;
    }

    public abstract void configureCodec(MediaCodecInfo mediaCodecInfo, MediaCodec mediaCodec, Format format, @Nullable MediaCrypto mediaCrypto, float f);

    public DecoderException createDecoderException(Throwable th, @Nullable MediaCodecInfo mediaCodecInfo) {
        return new DecoderException(th, mediaCodecInfo);
    }

    public void experimental_setRenderTimeLimitMs(long j) {
        this.renderTimeLimitMs = j;
    }

    public void experimental_setSkipMediaCodecStopOnRelease(boolean z) {
        this.skipMediaCodecStopOnRelease = z;
    }

    public final boolean flushOrReinitializeCodec() throws ExoPlaybackException {
        boolean zFlushOrReleaseCodec = flushOrReleaseCodec();
        if (zFlushOrReleaseCodec) {
            maybeInitCodec();
        }
        return zFlushOrReleaseCodec;
    }

    public boolean flushOrReleaseCodec() {
        MediaCodec mediaCodec = this.codec;
        if (mediaCodec == null) {
            return false;
        }
        if (this.codecDrainAction == 3 || this.codecNeedsFlushWorkaround || ((this.codecNeedsSosFlushWorkaround && !this.codecHasOutputMediaFormat) || (this.codecNeedsEosFlushWorkaround && this.codecReceivedEos))) {
            releaseCodec();
            return true;
        }
        mediaCodec.flush();
        resetInputBuffer();
        resetOutputBuffer();
        this.codecHotswapDeadlineMs = C3219C.TIME_UNSET;
        this.codecReceivedEos = false;
        this.codecReceivedBuffers = false;
        this.waitingForFirstSyncSample = true;
        this.codecNeedsAdaptationWorkaroundBuffer = false;
        this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
        this.isDecodeOnlyOutputBuffer = false;
        this.isLastOutputBuffer = false;
        this.waitingForKeys = false;
        this.decodeOnlyPresentationTimestamps.clear();
        this.largestQueuedPresentationTimeUs = C3219C.TIME_UNSET;
        this.lastBufferInStreamPresentationTimeUs = C3219C.TIME_UNSET;
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
        this.codecReconfigurationState = this.codecReconfigured ? 1 : 0;
        return false;
    }

    public final MediaCodec getCodec() {
        return this.codec;
    }

    @Nullable
    public final MediaCodecInfo getCodecInfo() {
        return this.codecInfo;
    }

    public boolean getCodecNeedsEosPropagation() {
        return false;
    }

    public float getCodecOperatingRateV23(float f, Format format, Format[] formatArr) {
        return CODEC_OPERATING_RATE_UNSET;
    }

    public abstract List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean z) throws MediaCodecUtil.DecoderQueryException;

    public long getDequeueOutputBufferTimeoutUs() {
        return 0L;
    }

    public void handleInputBufferSupplementalData(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    @Override // com.google.android.exoplayer2.Renderer
    public boolean isReady() {
        return (this.inputFormat == null || this.waitingForKeys || (!isSourceReady() && !hasOutputBuffer() && (this.codecHotswapDeadlineMs == C3219C.TIME_UNSET || SystemClock.elapsedRealtime() >= this.codecHotswapDeadlineMs))) ? false : true;
    }

    public final void maybeInitCodec() throws ExoPlaybackException {
        if (this.codec != null || this.inputFormat == null) {
            return;
        }
        setCodecDrmSession(this.sourceDrmSession);
        String str = this.inputFormat.sampleMimeType;
        DrmSession<FrameworkMediaCrypto> drmSession = this.codecDrmSession;
        if (drmSession != null) {
            if (this.mediaCrypto == null) {
                FrameworkMediaCrypto frameworkMediaCrypto = (FrameworkMediaCrypto) drmSession.getMediaCrypto();
                if (frameworkMediaCrypto != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(frameworkMediaCrypto.uuid, frameworkMediaCrypto.sessionId);
                        this.mediaCrypto = mediaCrypto;
                        this.mediaCryptoRequiresSecureDecoder = !frameworkMediaCrypto.forceAllowInsecureDecoderComponents && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e) {
                        throw createRendererException(e, this.inputFormat);
                    }
                } else if (this.codecDrmSession.getError() == null) {
                    return;
                }
            }
            if (FrameworkMediaCrypto.WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC) {
                int state = this.codecDrmSession.getState();
                if (state == 1) {
                    throw createRendererException(this.codecDrmSession.getError(), this.inputFormat);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            maybeInitCodecWithFallback(this.mediaCrypto, this.mediaCryptoRequiresSecureDecoder);
        } catch (DecoderInitializationException e2) {
            throw createRendererException(e2, this.inputFormat);
        }
    }

    public void onCodecInitialized(String str, long j, long j2) {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onDisabled() {
        this.inputFormat = null;
        if (this.sourceDrmSession == null && this.codecDrmSession == null) {
            flushOrReleaseCodec();
        } else {
            onReset();
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onEnabled(boolean z) throws ExoPlaybackException {
        DrmSessionManager<FrameworkMediaCrypto> drmSessionManager = this.drmSessionManager;
        if (drmSessionManager != null && !this.drmResourcesAcquired) {
            this.drmResourcesAcquired = true;
            drmSessionManager.prepare();
        }
        this.decoderCounters = new DecoderCounters();
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00a3  */
    /* JADX WARN: Multi-variable type inference failed */
    public void onInputFormatChanged(FormatHolder formatHolder) throws ExoPlaybackException {
        boolean z = true;
        this.waitingForFirstSampleInFormat = true;
        Format format = (Format) Assertions.checkNotNull(formatHolder.format);
        if (formatHolder.includesDrmSession) {
            setSourceDrmSession(formatHolder.drmSession);
        } else {
            this.sourceDrmSession = getUpdatedSourceDrmSession(this.inputFormat, format, this.drmSessionManager, this.sourceDrmSession);
        }
        this.inputFormat = format;
        if (this.codec == null) {
            maybeInitCodec();
            return;
        }
        DrmSession<FrameworkMediaCrypto> drmSession = this.sourceDrmSession;
        if ((drmSession == null && this.codecDrmSession != null) || ((drmSession != null && this.codecDrmSession == null) || ((drmSession != this.codecDrmSession && !this.codecInfo.secure && maybeRequiresSecureDecoder(drmSession, format)) || (Util.SDK_INT < 23 && this.sourceDrmSession != this.codecDrmSession)))) {
            drainAndReinitializeCodec();
            return;
        }
        int iCanKeepCodec = canKeepCodec(this.codec, this.codecInfo, this.codecFormat, format);
        if (iCanKeepCodec != 0) {
            if (iCanKeepCodec == 1) {
                this.codecFormat = format;
                updateCodecOperatingRate();
                if (this.sourceDrmSession == this.codecDrmSession) {
                    drainAndFlushCodec();
                    return;
                }
            } else if (iCanKeepCodec != 2) {
                if (iCanKeepCodec != 3) {
                    throw new IllegalStateException();
                }
                this.codecFormat = format;
                updateCodecOperatingRate();
                if (this.sourceDrmSession == this.codecDrmSession) {
                    return;
                }
            } else if (!this.codecNeedsReconfigureWorkaround) {
                this.codecReconfigured = true;
                this.codecReconfigurationState = 1;
                int i = this.codecAdaptationWorkaroundMode;
                if (i != 2) {
                    if (i == 1) {
                        int i2 = format.width;
                        Format format2 = this.codecFormat;
                        if (i2 != format2.width || format.height != format2.height) {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                }
                this.codecNeedsAdaptationWorkaroundBuffer = z;
                this.codecFormat = format;
                updateCodecOperatingRate();
                if (this.sourceDrmSession == this.codecDrmSession) {
                    return;
                }
            }
            drainAndUpdateCodecDrmSession();
            return;
        }
        drainAndReinitializeCodec();
    }

    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onPositionReset(long j, boolean z) throws ExoPlaybackException {
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        this.pendingOutputEndOfStream = false;
        flushOrReinitializeCodec();
        this.formatQueue.clear();
    }

    public void onProcessedOutputBuffer(long j) {
    }

    public void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onReset() {
        try {
            releaseCodec();
            setSourceDrmSession(null);
            DrmSessionManager<FrameworkMediaCrypto> drmSessionManager = this.drmSessionManager;
            if (drmSessionManager == null || !this.drmResourcesAcquired) {
                return;
            }
            this.drmResourcesAcquired = false;
            drmSessionManager.release();
        } catch (Throwable th) {
            setSourceDrmSession(null);
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onStarted() {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onStopped() {
    }

    public abstract boolean processOutputBuffer(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, boolean z2, Format format) throws ExoPlaybackException;

    /* JADX WARN: Multi-variable type inference failed */
    public void releaseCodec() {
        this.availableCodecInfos = null;
        this.codecInfo = null;
        this.codecFormat = null;
        this.codecHasOutputMediaFormat = false;
        resetInputBuffer();
        resetOutputBuffer();
        resetCodecBuffers();
        this.waitingForKeys = false;
        this.codecHotswapDeadlineMs = C3219C.TIME_UNSET;
        this.decodeOnlyPresentationTimestamps.clear();
        this.largestQueuedPresentationTimeUs = C3219C.TIME_UNSET;
        this.lastBufferInStreamPresentationTimeUs = C3219C.TIME_UNSET;
        try {
            MediaCodec mediaCodec = this.codec;
            if (mediaCodec != null) {
                this.decoderCounters.decoderReleaseCount++;
                try {
                    if (!this.skipMediaCodecStopOnRelease) {
                        mediaCodec.stop();
                    }
                    this.codec.release();
                } catch (Throwable th) {
                    this.codec.release();
                    throw th;
                }
            }
            this.codec = null;
            try {
                MediaCrypto mediaCrypto = this.mediaCrypto;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.mediaCrypto = null;
                this.mediaCryptoRequiresSecureDecoder = false;
                setCodecDrmSession(null);
            }
        } catch (Throwable th2) {
            this.codec = null;
            try {
                MediaCrypto mediaCrypto2 = this.mediaCrypto;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
                this.mediaCrypto = null;
                this.mediaCryptoRequiresSecureDecoder = false;
                setCodecDrmSession(null);
            }
        }
    }

    @Override // com.google.android.exoplayer2.Renderer
    public void render(long j, long j2) throws ExoPlaybackException {
        if (this.pendingOutputEndOfStream) {
            this.pendingOutputEndOfStream = false;
            processEndOfStream();
        }
        try {
            if (this.outputStreamEnded) {
                renderToEndOfStream();
                return;
            }
            if (this.inputFormat != null || readToFlagsOnlyBuffer(true)) {
                maybeInitCodec();
                if (this.codec != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    TraceUtil.beginSection("drainAndFeed");
                    while (drainOutputBuffer(j, j2)) {
                    }
                    while (feedInputBuffer() && shouldContinueFeeding(jElapsedRealtime)) {
                    }
                    TraceUtil.endSection();
                } else {
                    this.decoderCounters.skippedInputBufferCount += skipSource(j);
                    readToFlagsOnlyBuffer(false);
                }
                this.decoderCounters.ensureUpdated();
            }
        } catch (IllegalStateException e) {
            if (!isMediaCodecException(e)) {
                throw e;
            }
            throw createRendererException(e, this.inputFormat);
        }
    }

    public void renderToEndOfStream() throws ExoPlaybackException {
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.Renderer
    public final void setOperatingRate(float f) throws ExoPlaybackException {
        this.rendererOperatingRate = f;
        if (this.codec == null || this.codecDrainAction == 3 || getState() == 0) {
            return;
        }
        updateCodecOperatingRate();
    }

    public final void setPendingOutputEndOfStream() {
        this.pendingOutputEndOfStream = true;
    }

    public boolean shouldInitCodec(MediaCodecInfo mediaCodecInfo) {
        return true;
    }

    @Override // com.google.android.exoplayer2.RendererCapabilities
    public final int supportsFormat(Format format) throws ExoPlaybackException {
        try {
            return supportsFormat(this.mediaCodecSelector, this.drmSessionManager, format);
        } catch (MediaCodecUtil.DecoderQueryException e) {
            throw createRendererException(e, format);
        }
    }

    public abstract int supportsFormat(MediaCodecSelector mediaCodecSelector, @Nullable DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, Format format) throws MediaCodecUtil.DecoderQueryException;

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.RendererCapabilities
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    @Nullable
    public final Format updateOutputFormatForTime(long j) {
        Format formatPollFloor = this.formatQueue.pollFloor(j);
        if (formatPollFloor != null) {
            this.outputFormat = formatPollFloor;
        }
        return formatPollFloor;
    }
}
