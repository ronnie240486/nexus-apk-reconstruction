package com.google.android.exoplayer2.video;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.ViviTV.viewholders.BaseHomeRecyclerViewHolder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.FrameworkMediaCrypto;
import com.google.android.exoplayer2.extractor.p006ts.TsExtractor;
import com.google.android.exoplayer2.mediacodec.MediaCodecInfo;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecSelector;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.MediaFormatUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.omadahealth.github.swipyrefreshlayout.library.SwipyRefreshLayout;
import com.tencent.smtt.sdk.TbsListener;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.dom4j.p020io.SAXEventRecorder;
import org.videolan.libvlc.util.VLCUtil;
import p000.C4615jV;
import p000.C5212pz;
import p000.C5275qz;
import p000.C5338rz;
import p000.C5409sz;
import p000.C5516uN;
import p000.C5941d10;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes2.dex */
public class MediaCodecVideoRenderer extends MediaCodecRenderer {
    private static final float INITIAL_FORMAT_MAX_INPUT_SIZE_SCALE_FACTOR = 1.5f;
    private static final String KEY_CROP_BOTTOM = "crop-bottom";
    private static final String KEY_CROP_LEFT = "crop-left";
    private static final String KEY_CROP_RIGHT = "crop-right";
    private static final String KEY_CROP_TOP = "crop-top";
    private static final int MAX_PENDING_OUTPUT_STREAM_OFFSET_COUNT = 10;
    private static final int[] STANDARD_LONG_EDGE_VIDEO_PX = {1920, 1600, 1440, 1280, 960, 854, TbsListener.ErrorCode.STATIC_TBS_INSTALL_MAKE_SYMBOLIC_LINK_ERR, 540, BaseHomeRecyclerViewHolder.f9761h};
    private static final String TAG = "MediaCodecVideoRenderer";
    private static final long TUNNELING_EOS_PRESENTATION_TIME_US = Long.MAX_VALUE;
    private static boolean deviceNeedsSetOutputSurfaceWorkaround;
    private static boolean evaluatedDeviceNeedsSetOutputSurfaceWorkaround;
    private final long allowedJoiningTimeMs;
    private int buffersInCodecCount;
    private boolean codecHandlesHdr10PlusOutOfBandMetadata;
    private CodecMaxValues codecMaxValues;
    private boolean codecNeedsSetOutputSurfaceWorkaround;
    private int consecutiveDroppedFrameCount;
    private final Context context;
    private int currentHeight;

    @Nullable
    private MediaFormat currentMediaFormat;
    private float currentPixelWidthHeightRatio;
    private int currentUnappliedRotationDegrees;
    private int currentWidth;
    private final boolean deviceNeedsNoPostProcessWorkaround;
    private long droppedFrameAccumulationStartTimeMs;
    private int droppedFrames;
    private Surface dummySurface;
    private final VideoRendererEventListener.EventDispatcher eventDispatcher;

    @Nullable
    private VideoFrameMetadataListener frameMetadataListener;
    private final VideoFrameReleaseTimeHelper frameReleaseTimeHelper;
    private long initialPositionUs;
    private long joiningDeadlineMs;
    private long lastInputTimeUs;
    private long lastRenderTimeUs;
    private final int maxDroppedFramesToNotify;
    private long outputStreamOffsetUs;
    private int pendingOutputStreamOffsetCount;
    private final long[] pendingOutputStreamOffsetsUs;
    private final long[] pendingOutputStreamSwitchTimesUs;
    private float pendingPixelWidthHeightRatio;
    private int pendingRotationDegrees;
    private boolean renderedFirstFrame;
    private int reportedHeight;
    private float reportedPixelWidthHeightRatio;
    private int reportedUnappliedRotationDegrees;
    private int reportedWidth;
    private int scalingMode;
    private Surface surface;
    private boolean tunneling;
    private int tunnelingAudioSessionId;

    @Nullable
    OnFrameRenderedListenerV23 tunnelingOnFrameRenderedListener;

    public static final class CodecMaxValues {
        public final int height;
        public final int inputSize;
        public final int width;

        public CodecMaxValues(int i, int i2, int i3) {
            this.width = i;
            this.height = i2;
            this.inputSize = i3;
        }
    }

    @TargetApi(23)
    public final class OnFrameRenderedListenerV23 implements MediaCodec.OnFrameRenderedListener, Handler.Callback {
        private static final int HANDLE_FRAME_RENDERED = 0;
        private final Handler handler;

        public OnFrameRenderedListenerV23(MediaCodec mediaCodec) {
            Handler handler = new Handler(this);
            this.handler = handler;
            C5409sz.m28317a(mediaCodec, this, handler);
        }

        private void handleFrameRendered(long j) {
            MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
            if (this != mediaCodecVideoRenderer.tunnelingOnFrameRenderedListener) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                mediaCodecVideoRenderer.onProcessedTunneledEndOfStream();
            } else {
                mediaCodecVideoRenderer.onProcessedTunneledBuffer(j);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            handleFrameRendered(Util.toLong(message.arg1, message.arg2));
            return true;
        }

        @Override // android.media.MediaCodec.OnFrameRenderedListener
        public void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
            if (Util.SDK_INT >= 30) {
                handleFrameRendered(j);
            } else {
                this.handler.sendMessageAtFrontOfQueue(Message.obtain(this.handler, 0, (int) (j >> 32), (int) j));
            }
        }
    }

    public static final class VideoDecoderException extends MediaCodecRenderer.DecoderException {
        public final boolean isSurfaceValid;
        public final int surfaceIdentityHashCode;

        public VideoDecoderException(Throwable th, @Nullable MediaCodecInfo mediaCodecInfo, @Nullable Surface surface) {
            super(th, mediaCodecInfo);
            this.surfaceIdentityHashCode = System.identityHashCode(surface);
            this.isSurfaceValid = surface == null || surface.isValid();
        }
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector) {
        this(context, mediaCodecSelector, 0L);
    }

    private void clearRenderedFirstFrame() {
        MediaCodec codec;
        this.renderedFirstFrame = false;
        if (Util.SDK_INT < 23 || !this.tunneling || (codec = getCodec()) == null) {
            return;
        }
        this.tunnelingOnFrameRenderedListener = new OnFrameRenderedListenerV23(codec);
    }

    private void clearReportedVideoSize() {
        this.reportedWidth = -1;
        this.reportedHeight = -1;
        this.reportedPixelWidthHeightRatio = -1.0f;
        this.reportedUnappliedRotationDegrees = -1;
    }

    @TargetApi(21)
    private static void configureTunnelingV21(MediaFormat mediaFormat, int i) {
        C5212pz.m27581a(mediaFormat, "tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    private static boolean deviceNeedsNoPostProcessWorkaround() {
        return "NVIDIA".equals(Util.MANUFACTURER);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    private static int getCodecMaxInputSize(MediaCodecInfo mediaCodecInfo, String str, int i, int i2) {
        int iCeilDivide;
        int i3 = 4;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        str.getClass();
        switch (str) {
            case "video/3gpp":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                iCeilDivide = i * i2;
                i3 = 2;
                return (iCeilDivide * 3) / (i3 * 2);
            case "video/hevc":
            case "video/x-vnd.on2.vp9":
                iCeilDivide = i * i2;
                return (iCeilDivide * 3) / (i3 * 2);
            case "video/avc":
                String str2 = Util.MODEL;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(Util.MANUFACTURER) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && mediaCodecInfo.secure)))) {
                    return -1;
                }
                iCeilDivide = Util.ceilDivide(i2, 16) * Util.ceilDivide(i, 16) * 256;
                i3 = 2;
                return (iCeilDivide * 3) / (i3 * 2);
            default:
                return -1;
        }
    }

    private static Point getCodecMaxSize(MediaCodecInfo mediaCodecInfo, Format format) {
        int i = format.height;
        int i2 = format.width;
        boolean z = i > i2;
        int i3 = z ? i : i2;
        if (z) {
            i = i2;
        }
        float f = i / i3;
        for (int i4 : STANDARD_LONG_EDGE_VIDEO_PX) {
            int i5 = (int) (i4 * f);
            if (i4 <= i3 || i5 <= i) {
                break;
            }
            if (Util.SDK_INT >= 21) {
                int i6 = z ? i5 : i4;
                if (!z) {
                    i4 = i5;
                }
                Point pointAlignVideoSizeV21 = mediaCodecInfo.alignVideoSizeV21(i6, i4);
                if (mediaCodecInfo.isVideoSizeAndRateSupportedV21(pointAlignVideoSizeV21.x, pointAlignVideoSizeV21.y, format.frameRate)) {
                    return pointAlignVideoSizeV21;
                }
            } else {
                try {
                    int iCeilDivide = Util.ceilDivide(i4, 16) * 16;
                    int iCeilDivide2 = Util.ceilDivide(i5, 16) * 16;
                    if (iCeilDivide * iCeilDivide2 <= MediaCodecUtil.maxH264DecodableFrameSize()) {
                        int i7 = z ? iCeilDivide2 : iCeilDivide;
                        if (!z) {
                            iCeilDivide = iCeilDivide2;
                        }
                        return new Point(i7, iCeilDivide);
                    }
                } catch (MediaCodecUtil.DecoderQueryException unused) {
                }
            }
        }
        return null;
    }

    private static int getMaxInputSize(MediaCodecInfo mediaCodecInfo, Format format) {
        if (format.maxInputSize == -1) {
            return getCodecMaxInputSize(mediaCodecInfo, format.sampleMimeType, format.width, format.height);
        }
        int size = format.initializationData.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += format.initializationData.get(i).length;
        }
        return format.maxInputSize + length;
    }

    private static boolean isBufferLate(long j) {
        return j < -30000;
    }

    private static boolean isBufferVeryLate(long j) {
        return j < -500000;
    }

    private void maybeNotifyDroppedFrames() {
        if (this.droppedFrames > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.eventDispatcher.droppedFrames(this.droppedFrames, jElapsedRealtime - this.droppedFrameAccumulationStartTimeMs);
            this.droppedFrames = 0;
            this.droppedFrameAccumulationStartTimeMs = jElapsedRealtime;
        }
    }

    private void maybeNotifyVideoSizeChanged() {
        int i = this.currentWidth;
        if (i == -1 && this.currentHeight == -1) {
            return;
        }
        if (this.reportedWidth == i && this.reportedHeight == this.currentHeight && this.reportedUnappliedRotationDegrees == this.currentUnappliedRotationDegrees && this.reportedPixelWidthHeightRatio == this.currentPixelWidthHeightRatio) {
            return;
        }
        this.eventDispatcher.videoSizeChanged(i, this.currentHeight, this.currentUnappliedRotationDegrees, this.currentPixelWidthHeightRatio);
        this.reportedWidth = this.currentWidth;
        this.reportedHeight = this.currentHeight;
        this.reportedUnappliedRotationDegrees = this.currentUnappliedRotationDegrees;
        this.reportedPixelWidthHeightRatio = this.currentPixelWidthHeightRatio;
    }

    private void maybeRenotifyRenderedFirstFrame() {
        if (this.renderedFirstFrame) {
            this.eventDispatcher.renderedFirstFrame(this.surface);
        }
    }

    private void maybeRenotifyVideoSizeChanged() {
        int i = this.reportedWidth;
        if (i == -1 && this.reportedHeight == -1) {
            return;
        }
        this.eventDispatcher.videoSizeChanged(i, this.reportedHeight, this.reportedUnappliedRotationDegrees, this.reportedPixelWidthHeightRatio);
    }

    private void notifyFrameMetadataListener(long j, long j2, Format format, MediaFormat mediaFormat) {
        VideoFrameMetadataListener videoFrameMetadataListener = this.frameMetadataListener;
        if (videoFrameMetadataListener != null) {
            videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j, j2, format, mediaFormat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProcessedTunneledEndOfStream() {
        setPendingOutputEndOfStream();
    }

    private void processOutputFormat(MediaCodec mediaCodec, int i, int i2) {
        this.currentWidth = i;
        this.currentHeight = i2;
        float f = this.pendingPixelWidthHeightRatio;
        this.currentPixelWidthHeightRatio = f;
        if (Util.SDK_INT >= 21) {
            int i3 = this.pendingRotationDegrees;
            if (i3 == 90 || i3 == 270) {
                this.currentWidth = i2;
                this.currentHeight = i;
                this.currentPixelWidthHeightRatio = 1.0f / f;
            }
        } else {
            this.currentUnappliedRotationDegrees = this.pendingRotationDegrees;
        }
        mediaCodec.setVideoScalingMode(this.scalingMode);
    }

    @TargetApi(29)
    private static void setHdr10PlusInfoV29(MediaCodec mediaCodec, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        mediaCodec.setParameters(bundle);
    }

    private void setJoiningDeadlineMs() {
        this.joiningDeadlineMs = this.allowedJoiningTimeMs > 0 ? SystemClock.elapsedRealtime() + this.allowedJoiningTimeMs : C3219C.TIME_UNSET;
    }

    @TargetApi(23)
    private static void setOutputSurfaceV23(MediaCodec mediaCodec, Surface surface) {
        C5275qz.m27772a(mediaCodec, surface);
    }

    private void setSurface(Surface surface) throws ExoPlaybackException {
        if (surface == null) {
            Surface surface2 = this.dummySurface;
            if (surface2 != null) {
                surface = surface2;
            } else {
                MediaCodecInfo codecInfo = getCodecInfo();
                if (codecInfo != null && shouldUseDummySurface(codecInfo)) {
                    surface = DummySurface.newInstanceV17(this.context, codecInfo.secure);
                    this.dummySurface = surface;
                }
            }
        }
        if (this.surface == surface) {
            if (surface == null || surface == this.dummySurface) {
                return;
            }
            maybeRenotifyVideoSizeChanged();
            maybeRenotifyRenderedFirstFrame();
            return;
        }
        this.surface = surface;
        int state = getState();
        MediaCodec codec = getCodec();
        if (codec != null) {
            if (Util.SDK_INT < 23 || surface == null || this.codecNeedsSetOutputSurfaceWorkaround) {
                releaseCodec();
                maybeInitCodec();
            } else {
                setOutputSurfaceV23(codec, surface);
            }
        }
        if (surface == null || surface == this.dummySurface) {
            clearReportedVideoSize();
            clearRenderedFirstFrame();
            return;
        }
        maybeRenotifyVideoSizeChanged();
        clearRenderedFirstFrame();
        if (state == 2) {
            setJoiningDeadlineMs();
        }
    }

    private boolean shouldUseDummySurface(MediaCodecInfo mediaCodecInfo) {
        return Util.SDK_INT >= 23 && !this.tunneling && !codecNeedsSetOutputSurfaceWorkaround(mediaCodecInfo.name) && (!mediaCodecInfo.secure || DummySurface.isSecureSupported(this.context));
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public int canKeepCodec(MediaCodec mediaCodec, MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        if (!mediaCodecInfo.isSeamlessAdaptationSupported(format, format2, true)) {
            return 0;
        }
        int i = format2.width;
        CodecMaxValues codecMaxValues = this.codecMaxValues;
        if (i > codecMaxValues.width || format2.height > codecMaxValues.height || getMaxInputSize(mediaCodecInfo, format2) > this.codecMaxValues.inputSize) {
            return 0;
        }
        return format.initializationDataEquals(format2) ? 3 : 2;
    }

    /* JADX WARN: Code duplicated, block: B:402:0x0616  */
    /* JADX WARN: Code duplicated, block: B:422:0x0650  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public boolean codecNeedsSetOutputSurfaceWorkaround(String str) {
        byte b = 0;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (MediaCodecVideoRenderer.class) {
            try {
                if (!evaluatedDeviceNeedsSetOutputSurfaceWorkaround) {
                    String str2 = Util.DEVICE;
                    if ("dangal".equals(str2)) {
                        deviceNeedsSetOutputSurfaceWorkaround = true;
                    } else {
                        int i = Util.SDK_INT;
                        byte b2 = 27;
                        if (i > 27 || !"HWEML".equals(str2)) {
                            if (i < 27) {
                                switch (str2.hashCode()) {
                                    case -2144781245:
                                        if (!str2.equals("GIONEE_SWW1609")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 43;
                                        }
                                        break;
                                    case -2144781185:
                                        if (!str2.equals("GIONEE_SWW1627")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 44;
                                        }
                                        break;
                                    case -2144781160:
                                        if (!str2.equals("GIONEE_SWW1631")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 45;
                                        }
                                        break;
                                    case -2097309513:
                                        if (!str2.equals("K50a40")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 63;
                                        }
                                        break;
                                    case -2022874474:
                                        if (!str2.equals("CP8676_I02")) {
                                            b2 = -1;
                                        } else {
                                            b2 = SAXEventRecorder.SAXEvent.f16653v;
                                        }
                                        break;
                                    case -1978993182:
                                        if (!str2.equals("NX541J")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 77;
                                        }
                                        break;
                                    case -1978990237:
                                        if (!str2.equals("NX573J")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 78;
                                        }
                                        break;
                                    case -1936688988:
                                        if (!str2.equals("PGN528")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 88;
                                        }
                                        break;
                                    case -1936688066:
                                        if (!str2.equals("PGN610")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 89;
                                        }
                                        break;
                                    case -1936688065:
                                        if (!str2.equals("PGN611")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 90;
                                        }
                                        break;
                                    case -1931988508:
                                        if (!str2.equals("AquaPowerM")) {
                                            b2 = -1;
                                        } else {
                                            b2 = SAXEventRecorder.SAXEvent.f16645n;
                                        }
                                        break;
                                    case -1696512866:
                                        if (!str2.equals("XT1663")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 123;
                                        }
                                        break;
                                    case -1680025915:
                                        if (!str2.equals("ComioS1")) {
                                            b2 = -1;
                                        } else {
                                            b2 = SAXEventRecorder.SAXEvent.f16652u;
                                        }
                                        break;
                                    case -1615810839:
                                        if (!str2.equals("Phantom6")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 91;
                                        }
                                        break;
                                    case -1554255044:
                                        if (!str2.equals("vernee_M5")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 116;
                                        }
                                        break;
                                    case -1481772737:
                                        if (!str2.equals("panell_dl")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 84;
                                        }
                                        break;
                                    case -1481772730:
                                        if (!str2.equals("panell_ds")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 85;
                                        }
                                        break;
                                    case -1481772729:
                                        if (!str2.equals("panell_dt")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 86;
                                        }
                                        break;
                                    case -1320080169:
                                        if (!str2.equals("GiONEE_GBL7319")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 41;
                                        }
                                        break;
                                    case -1217592143:
                                        if (!str2.equals("BRAVIA_ATV2")) {
                                            b2 = -1;
                                        } else {
                                            b2 = SAXEventRecorder.SAXEvent.f16649r;
                                        }
                                        break;
                                    case -1180384755:
                                        if (!str2.equals("iris60")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 59;
                                        }
                                        break;
                                    case -1139198265:
                                        if (!str2.equals("Slate_Pro")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 104;
                                        }
                                        break;
                                    case -1052835013:
                                        if (!str2.equals("namath")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 75;
                                        }
                                        break;
                                    case -993250464:
                                        if (!str2.equals("A10-70F")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 3;
                                        }
                                        break;
                                    case -993250458:
                                        if (!str2.equals("A10-70L")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 4;
                                        }
                                        break;
                                    case -965403638:
                                        if (!str2.equals("s905x018")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 106;
                                        }
                                        break;
                                    case -958336948:
                                        if (!str2.equals("ELUGA_Ray_X")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 29;
                                        }
                                        break;
                                    case -879245230:
                                        if (!str2.equals("tcl_eu")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 112;
                                        }
                                        break;
                                    case -842500323:
                                        if (!str2.equals("nicklaus_f")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 76;
                                        }
                                        break;
                                    case -821392978:
                                        if (!str2.equals("A7000-a")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 7;
                                        }
                                        break;
                                    case -797483286:
                                        if (!str2.equals("SVP-DTV15")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 105;
                                        }
                                        break;
                                    case -794946968:
                                        if (!str2.equals("watson")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 117;
                                        }
                                        break;
                                    case -788334647:
                                        if (!str2.equals("whyred")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 118;
                                        }
                                        break;
                                    case -782144577:
                                        if (!str2.equals("OnePlus5T")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 79;
                                        }
                                        break;
                                    case -575125681:
                                        if (!str2.equals("GiONEE_CBL7513")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 40;
                                        }
                                        break;
                                    case -521118391:
                                        if (!str2.equals("GIONEE_GBL7360")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 42;
                                        }
                                        break;
                                    case -430914369:
                                        if (!str2.equals("Pixi4-7_3G")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 92;
                                        }
                                        break;
                                    case -290434366:
                                        if (!str2.equals("taido_row")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 107;
                                        }
                                        break;
                                    case -282781963:
                                        if (!str2.equals("BLACK-1X")) {
                                            b2 = -1;
                                        } else {
                                            b2 = SAXEventRecorder.SAXEvent.f16648q;
                                        }
                                        break;
                                    case -277133239:
                                        if (!str2.equals("Z12_PRO")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 124;
                                        }
                                        break;
                                    case -173639913:
                                        if (!str2.equals("ELUGA_A3_Pro")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 26;
                                        }
                                        break;
                                    case -56598463:
                                        if (!str2.equals("woods_fn")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 120;
                                        }
                                        break;
                                    case 2126:
                                        if (!str2.equals("C1")) {
                                            b2 = -1;
                                        } else {
                                            b2 = SAXEventRecorder.SAXEvent.f16651t;
                                        }
                                        break;
                                    case 2564:
                                        if (!str2.equals("Q5")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 100;
                                        }
                                        break;
                                    case 2715:
                                        if (!str2.equals("V1")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 113;
                                        }
                                        break;
                                    case 2719:
                                        if (!str2.equals("V5")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 115;
                                        }
                                        break;
                                    case 3483:
                                        if (!str2.equals("mh")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 72;
                                        }
                                        break;
                                    case 73405:
                                        if (!str2.equals("JGZ")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 62;
                                        }
                                        break;
                                    case 75739:
                                        if (!str2.equals("M5c")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 68;
                                        }
                                        break;
                                    case 76779:
                                        if (!str2.equals("MX6")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 74;
                                        }
                                        break;
                                    case 78669:
                                        if (!str2.equals("P85")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 82;
                                        }
                                        break;
                                    case 79305:
                                        if (!str2.equals("PLE")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 94;
                                        }
                                        break;
                                    case 80618:
                                        if (!str2.equals("QX1")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 102;
                                        }
                                        break;
                                    case 88274:
                                        if (!str2.equals("Z80")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 125;
                                        }
                                        break;
                                    case 98846:
                                        if (!str2.equals("cv1")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 22;
                                        }
                                        break;
                                    case 98848:
                                        if (!str2.equals("cv3")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 23;
                                        }
                                        break;
                                    case 99329:
                                        if (!str2.equals("deb")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 24;
                                        }
                                        break;
                                    case 101481:
                                        if (!str2.equals("flo")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 38;
                                        }
                                        break;
                                    case 1513190:
                                        if (!str2.equals("1601")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 0;
                                        }
                                        break;
                                    case 1514184:
                                        if (!str2.equals("1713")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 1;
                                        }
                                        break;
                                    case 1514185:
                                        if (!str2.equals("1714")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 2;
                                        }
                                        break;
                                    case 2436959:
                                        if (!str2.equals("P681")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 81;
                                        }
                                        break;
                                    case 2463773:
                                        if (!str2.equals("Q350")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 96;
                                        }
                                        break;
                                    case 2464648:
                                        if (!str2.equals("Q427")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 98;
                                        }
                                        break;
                                    case 2689555:
                                        if (!str2.equals("XE2X")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 122;
                                        }
                                        break;
                                    case 3154429:
                                        if (!str2.equals("fugu")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 39;
                                        }
                                        break;
                                    case 3284551:
                                        if (!str2.equals("kate")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 64;
                                        }
                                        break;
                                    case 3351335:
                                        if (!str2.equals("mido")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 73;
                                        }
                                        break;
                                    case 3386211:
                                        if (!str2.equals("p212")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 80;
                                        }
                                        break;
                                    case 41325051:
                                        if (!str2.equals("MEIZU_M5")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 71;
                                        }
                                        break;
                                    case 55178625:
                                        if (!str2.equals("Aura_Note_2")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 13;
                                        }
                                        break;
                                    case 61542055:
                                        if (!str2.equals("A1601")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 5;
                                        }
                                        break;
                                    case 65355429:
                                        if (!str2.equals("E5643")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 25;
                                        }
                                        break;
                                    case 66214468:
                                        if (!str2.equals("F3111")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 31;
                                        }
                                        break;
                                    case 66214470:
                                        if (!str2.equals("F3113")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 32;
                                        }
                                        break;
                                    case 66214473:
                                        if (!str2.equals("F3116")) {
                                            b2 = -1;
                                        } else {
                                            b2 = PublicSuffixDatabase.f15556i;
                                        }
                                        break;
                                    case 66215429:
                                        if (!str2.equals("F3211")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 34;
                                        }
                                        break;
                                    case 66215431:
                                        if (!str2.equals("F3213")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 35;
                                        }
                                        break;
                                    case 66215433:
                                        if (!str2.equals("F3215")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 36;
                                        }
                                        break;
                                    case 66216390:
                                        if (!str2.equals("F3311")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 37;
                                        }
                                        break;
                                    case 76402249:
                                        if (!str2.equals("PRO7S")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 95;
                                        }
                                        break;
                                    case 76404105:
                                        if (!str2.equals("Q4260")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 97;
                                        }
                                        break;
                                    case 76404911:
                                        if (!str2.equals("Q4310")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 99;
                                        }
                                        break;
                                    case 80963634:
                                        if (!str2.equals("V23GB")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 114;
                                        }
                                        break;
                                    case 82882791:
                                        if (!str2.equals("X3_HK")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 121;
                                        }
                                        break;
                                    case 98715550:
                                        if (!str2.equals("i9031")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 56;
                                        }
                                        break;
                                    case 101370885:
                                        if (!str2.equals("l5460")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 65;
                                        }
                                        break;
                                    case 102844228:
                                        if (!str2.equals("le_x6")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 66;
                                        }
                                        break;
                                    case 165221241:
                                        if (!str2.equals("A2016a40")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 6;
                                        }
                                        break;
                                    case 182191441:
                                        if (!str2.equals("CPY83_I00")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 21;
                                        }
                                        break;
                                    case 245388979:
                                        if (!str2.equals("marino_f")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 70;
                                        }
                                        break;
                                    case 287431619:
                                        if (!str2.equals("griffin")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 49;
                                        }
                                        break;
                                    case 307593612:
                                        if (!str2.equals("A7010a48")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 9;
                                        }
                                        break;
                                    case 308517133:
                                        if (!str2.equals("A7020a48")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 10;
                                        }
                                        break;
                                    case 316215098:
                                        if (!str2.equals("TB3-730F")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 108;
                                        }
                                        break;
                                    case 316215116:
                                        if (!str2.equals("TB3-730X")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 109;
                                        }
                                        break;
                                    case 316246811:
                                        if (!str2.equals("TB3-850F")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 110;
                                        }
                                        break;
                                    case 316246818:
                                        if (!str2.equals("TB3-850M")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 111;
                                        }
                                        break;
                                    case 407160593:
                                        if (!str2.equals("Pixi5-10_4G")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 93;
                                        }
                                        break;
                                    case 507412548:
                                        if (!str2.equals("QM16XE_U")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 101;
                                        }
                                        break;
                                    case 793982701:
                                        if (!str2.equals("GIONEE_WBL5708")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 46;
                                        }
                                        break;
                                    case 794038622:
                                        if (!str2.equals("GIONEE_WBL7365")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 47;
                                        }
                                        break;
                                    case 794040393:
                                        if (!str2.equals("GIONEE_WBL7519")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 48;
                                        }
                                        break;
                                    case 835649806:
                                        if (!str2.equals("manning")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 69;
                                        }
                                        break;
                                    case 917340916:
                                        if (!str2.equals("A7000plus")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 8;
                                        }
                                        break;
                                    case 958008161:
                                        if (!str2.equals("j2xlteins")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 61;
                                        }
                                        break;
                                    case 1060579533:
                                        if (!str2.equals("panell_d")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 83;
                                        }
                                        break;
                                    case 1150207623:
                                        if (!str2.equals("LS-5017")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 67;
                                        }
                                        break;
                                    case 1176899427:
                                        if (!str2.equals("itel_S41")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 60;
                                        }
                                        break;
                                    case 1280332038:
                                        if (!str2.equals("hwALE-H")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 51;
                                        }
                                        break;
                                    case 1306947716:
                                        if (!str2.equals("EverStar_S")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 30;
                                        }
                                        break;
                                    case 1349174697:
                                        if (!str2.equals("htc_e56ml_dtul")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 50;
                                        }
                                        break;
                                    case 1522194893:
                                        if (!str2.equals("woods_f")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 119;
                                        }
                                        break;
                                    case 1691543273:
                                        if (!str2.equals("CPH1609")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 20;
                                        }
                                        break;
                                    case 1709443163:
                                        if (!str2.equals("iball8735_9806")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 57;
                                        }
                                        break;
                                    case 1865889110:
                                        if (!str2.equals("santoni")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 103;
                                        }
                                        break;
                                    case 1906253259:
                                        if (!str2.equals("PB2-670M")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 87;
                                        }
                                        break;
                                    case 1977196784:
                                        if (!str2.equals("Infinix-X572")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 58;
                                        }
                                        break;
                                    case 2006372676:
                                        if (!str2.equals("BRAVIA_ATV3_4K")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 16;
                                        }
                                        break;
                                    case 2029784656:
                                        if (!str2.equals("HWBLN-H")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 52;
                                        }
                                        break;
                                    case 2030379515:
                                        if (!str2.equals("HWCAM-H")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 53;
                                        }
                                        break;
                                    case 2033393791:
                                        if (!str2.equals("ASUS_X00AD_2")) {
                                            b2 = -1;
                                        } else {
                                            b2 = SAXEventRecorder.SAXEvent.f16646o;
                                        }
                                        break;
                                    case 2047190025:
                                        if (!str2.equals("ELUGA_Note")) {
                                            b2 = -1;
                                        }
                                        break;
                                    case 2047252157:
                                        if (!str2.equals("ELUGA_Prim")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 28;
                                        }
                                        break;
                                    case 2048319463:
                                        if (!str2.equals("HWVNS-H")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 54;
                                        }
                                        break;
                                    case 2048855701:
                                        if (!str2.equals("HWWAS-H")) {
                                            b2 = -1;
                                        } else {
                                            b2 = 55;
                                        }
                                        break;
                                    default:
                                        b2 = -1;
                                        break;
                                }
                                switch (b2) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 54:
                                    case CipherSuite.TLS_DH_RSA_WITH_AES_256_CBC_SHA /* 55 */:
                                    case 56:
                                    case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CBC_SHA /* 57 */:
                                    case CipherSuite.TLS_DH_anon_WITH_AES_256_CBC_SHA /* 58 */:
                                    case 59:
                                    case 60:
                                    case 61:
                                    case VLCUtil.f17716h /* 62 */:
                                    case 63:
                                    case 64:
                                    case DefaultScrollHandle.f11004h /* 65 */:
                                    case IjkMediaMeta.FF_PROFILE_H264_BASELINE /* 66 */:
                                    case 67:
                                    case 68:
                                    case 69:
                                    case 70:
                                    case TsExtractor.TS_SYNC_BYTE /* 71 */:
                                    case 72:
                                    case 73:
                                    case 74:
                                    case 75:
                                    case SwipyRefreshLayout.f11497R /* 76 */:
                                    case IjkMediaMeta.FF_PROFILE_H264_MAIN /* 77 */:
                                    case 78:
                                    case 79:
                                    case C5941d10.f13537f /* 80 */:
                                    case 81:
                                    case 82:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case ModuleDescriptor.MODULE_VERSION /* 86 */:
                                    case 87:
                                    case IjkMediaMeta.FF_PROFILE_H264_EXTENDED /* 88 */:
                                    case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
                                    case 90:
                                    case 91:
                                    case 92:
                                    case 93:
                                    case 94:
                                    case 95:
                                    case 96:
                                    case 97:
                                    case 98:
                                    case 99:
                                    case 100:
                                    case 101:
                                    case 102:
                                    case 103:
                                    case 104:
                                    case TbsListener.ErrorCode.DISK_FULL /* 105 */:
                                    case TbsListener.ErrorCode.FILE_DELETED /* 106 */:
                                    case TbsListener.ErrorCode.UNKNOWN_ERROR /* 107 */:
                                    case 108:
                                    case 109:
                                    case 110:
                                    case 111:
                                    case TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW /* 112 */:
                                    case TbsListener.ErrorCode.DOWNLOAD_FILE_CONTENTLENGTH_NOT_MATCH /* 113 */:
                                    case TbsListener.ErrorCode.DOWNLOAD_NOT_WIFI_ERROR /* 114 */:
                                    case 115:
                                    case 116:
                                    case 117:
                                    case 118:
                                    case 119:
                                    case 120:
                                    case TbsListener.ErrorCode.THREAD_INIT_ERROR /* 121 */:
                                    case 122:
                                    case TbsListener.ErrorCode.DOWNLOAD_RETRYTIMES302_EXCEED /* 123 */:
                                    case TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY /* 124 */:
                                    case TbsListener.ErrorCode.DOWNLOAD_THROWABLE /* 125 */:
                                        deviceNeedsSetOutputSurfaceWorkaround = true;
                                        break;
                                }
                                String str3 = Util.MODEL;
                                int iHashCode = str3.hashCode();
                                if (iHashCode != -594534941) {
                                    if (iHashCode != 2006354) {
                                        if (iHashCode == 2006367 && str3.equals("AFTN")) {
                                            b = 1;
                                        } else {
                                            b = -1;
                                        }
                                    } else if (!str3.equals("AFTA")) {
                                        b = -1;
                                    }
                                } else if (str3.equals("JSN-L21")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                                if (b == 0 || b == 1 || b == 2) {
                                }
                            }
                        }
                        deviceNeedsSetOutputSurfaceWorkaround = true;
                    }
                    evaluatedDeviceNeedsSetOutputSurfaceWorkaround = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return deviceNeedsSetOutputSurfaceWorkaround;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void configureCodec(MediaCodecInfo mediaCodecInfo, MediaCodec mediaCodec, Format format, @Nullable MediaCrypto mediaCrypto, float f) {
        String str = mediaCodecInfo.codecMimeType;
        CodecMaxValues codecMaxValues = getCodecMaxValues(mediaCodecInfo, format, getStreamFormats());
        this.codecMaxValues = codecMaxValues;
        MediaFormat mediaFormat = getMediaFormat(format, str, codecMaxValues, f, this.deviceNeedsNoPostProcessWorkaround, this.tunnelingAudioSessionId);
        if (this.surface == null) {
            Assertions.checkState(shouldUseDummySurface(mediaCodecInfo));
            if (this.dummySurface == null) {
                this.dummySurface = DummySurface.newInstanceV17(this.context, mediaCodecInfo.secure);
            }
            this.surface = this.dummySurface;
        }
        mediaCodec.configure(mediaFormat, this.surface, mediaCrypto, 0);
        if (Util.SDK_INT < 23 || !this.tunneling) {
            return;
        }
        this.tunnelingOnFrameRenderedListener = new OnFrameRenderedListenerV23(mediaCodec);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public MediaCodecRenderer.DecoderException createDecoderException(Throwable th, @Nullable MediaCodecInfo mediaCodecInfo) {
        return new VideoDecoderException(th, mediaCodecInfo, this.surface);
    }

    public void dropOutputBuffer(MediaCodec mediaCodec, int i, long j) {
        TraceUtil.beginSection("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        TraceUtil.endSection();
        updateDroppedBufferCounters(1);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    public boolean flushOrReleaseCodec() {
        try {
            return super.flushOrReleaseCodec();
        } finally {
            this.buffersInCodecCount = 0;
        }
    }

    public CodecMaxValues getCodecMaxValues(MediaCodecInfo mediaCodecInfo, Format format, Format[] formatArr) {
        int codecMaxInputSize;
        int iMax = format.width;
        int iMax2 = format.height;
        int maxInputSize = getMaxInputSize(mediaCodecInfo, format);
        if (formatArr.length == 1) {
            if (maxInputSize != -1 && (codecMaxInputSize = getCodecMaxInputSize(mediaCodecInfo, format.sampleMimeType, format.width, format.height)) != -1) {
                maxInputSize = Math.min((int) (maxInputSize * INITIAL_FORMAT_MAX_INPUT_SIZE_SCALE_FACTOR), codecMaxInputSize);
            }
            return new CodecMaxValues(iMax, iMax2, maxInputSize);
        }
        boolean z = false;
        for (Format format2 : formatArr) {
            if (mediaCodecInfo.isSeamlessAdaptationSupported(format, format2, false)) {
                int i = format2.width;
                z |= i == -1 || format2.height == -1;
                iMax = Math.max(iMax, i);
                iMax2 = Math.max(iMax2, format2.height);
                maxInputSize = Math.max(maxInputSize, getMaxInputSize(mediaCodecInfo, format2));
            }
        }
        if (z) {
            Log.m17586w(TAG, "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point codecMaxSize = getCodecMaxSize(mediaCodecInfo, format);
            if (codecMaxSize != null) {
                iMax = Math.max(iMax, codecMaxSize.x);
                iMax2 = Math.max(iMax2, codecMaxSize.y);
                maxInputSize = Math.max(maxInputSize, getCodecMaxInputSize(mediaCodecInfo, format.sampleMimeType, iMax, iMax2));
                Log.m17586w(TAG, "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new CodecMaxValues(iMax, iMax2, maxInputSize);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean getCodecNeedsEosPropagation() {
        return this.tunneling && Util.SDK_INT < 23;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public float getCodecOperatingRateV23(float f, Format format, Format[] formatArr) {
        float fMax = -1.0f;
        for (Format format2 : formatArr) {
            float f2 = format2.frameRate;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean z) throws MediaCodecUtil.DecoderQueryException {
        return getDecoderInfos(mediaCodecSelector, format, z, this.tunneling);
    }

    @SuppressLint({"InlinedApi"})
    public MediaFormat getMediaFormat(Format format, String str, CodecMaxValues codecMaxValues, float f, boolean z, int i) {
        Pair<Integer, Integer> codecProfileAndLevel;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", format.width);
        mediaFormat.setInteger("height", format.height);
        MediaFormatUtil.setCsdBuffers(mediaFormat, format.initializationData);
        MediaFormatUtil.maybeSetFloat(mediaFormat, "frame-rate", format.frameRate);
        MediaFormatUtil.maybeSetInteger(mediaFormat, "rotation-degrees", format.rotationDegrees);
        MediaFormatUtil.maybeSetColorInfo(mediaFormat, format.colorInfo);
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType) && (codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format)) != null) {
            MediaFormatUtil.maybeSetInteger(mediaFormat, Scopes.PROFILE, ((Integer) codecProfileAndLevel.first).intValue());
        }
        mediaFormat.setInteger("max-width", codecMaxValues.width);
        mediaFormat.setInteger("max-height", codecMaxValues.height);
        MediaFormatUtil.maybeSetInteger(mediaFormat, "max-input-size", codecMaxValues.inputSize);
        if (Util.SDK_INT >= 23) {
            mediaFormat.setInteger(C4615jV.f14798l, 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            configureTunnelingV21(mediaFormat, i);
        }
        return mediaFormat;
    }

    public long getOutputStreamOffsetUs() {
        return this.outputStreamOffsetUs;
    }

    public Surface getSurface() {
        return this.surface;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void handleInputBufferSupplementalData(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
        if (this.codecHandlesHdr10PlusOutOfBandMetadata) {
            ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(decoderInputBuffer.supplementalData);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s2 = byteBuffer.getShort();
                short s3 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s2 == 60 && s3 == 1 && b2 == 4 && b3 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    setHdr10PlusInfoV29(getCodec(), bArr);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.BaseRenderer, com.google.android.exoplayer2.PlayerMessage.Target
    public void handleMessage(int i, @Nullable Object obj) throws ExoPlaybackException {
        if (i == 1) {
            setSurface((Surface) obj);
            return;
        }
        if (i != 4) {
            if (i == 6) {
                this.frameMetadataListener = (VideoFrameMetadataListener) obj;
                return;
            } else {
                super.handleMessage(i, obj);
                return;
            }
        }
        this.scalingMode = ((Integer) obj).intValue();
        MediaCodec codec = getCodec();
        if (codec != null) {
            codec.setVideoScalingMode(this.scalingMode);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.Renderer
    public boolean isReady() {
        Surface surface;
        if (super.isReady() && (this.renderedFirstFrame || (((surface = this.dummySurface) != null && this.surface == surface) || getCodec() == null || this.tunneling))) {
            this.joiningDeadlineMs = C3219C.TIME_UNSET;
            return true;
        }
        if (this.joiningDeadlineMs == C3219C.TIME_UNSET) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.joiningDeadlineMs) {
            return true;
        }
        this.joiningDeadlineMs = C3219C.TIME_UNSET;
        return false;
    }

    public boolean maybeDropBuffersToKeyframe(MediaCodec mediaCodec, int i, long j, long j2, boolean z) throws ExoPlaybackException {
        int iSkipSource = skipSource(j2);
        if (iSkipSource == 0) {
            return false;
        }
        DecoderCounters decoderCounters = this.decoderCounters;
        decoderCounters.droppedToKeyframeCount++;
        int i2 = this.buffersInCodecCount + iSkipSource;
        if (z) {
            decoderCounters.skippedOutputBufferCount += i2;
        } else {
            updateDroppedBufferCounters(i2);
        }
        flushOrReinitializeCodec();
        return true;
    }

    public void maybeNotifyRenderedFirstFrame() {
        if (this.renderedFirstFrame) {
            return;
        }
        this.renderedFirstFrame = true;
        this.eventDispatcher.renderedFirstFrame(this.surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void onCodecInitialized(String str, long j, long j2) {
        this.eventDispatcher.decoderInitialized(str, j, j2);
        this.codecNeedsSetOutputSurfaceWorkaround = codecNeedsSetOutputSurfaceWorkaround(str);
        this.codecHandlesHdr10PlusOutOfBandMetadata = ((MediaCodecInfo) Assertions.checkNotNull(getCodecInfo())).isHdr10PlusOutOfBandMetadataSupported();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public void onDisabled() {
        this.lastInputTimeUs = C3219C.TIME_UNSET;
        this.outputStreamOffsetUs = C3219C.TIME_UNSET;
        this.pendingOutputStreamOffsetCount = 0;
        this.currentMediaFormat = null;
        clearReportedVideoSize();
        clearRenderedFirstFrame();
        this.frameReleaseTimeHelper.disable();
        this.tunnelingOnFrameRenderedListener = null;
        try {
            super.onDisabled();
        } finally {
            this.eventDispatcher.disabled(this.decoderCounters);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public void onEnabled(boolean z) throws ExoPlaybackException {
        super.onEnabled(z);
        int i = this.tunnelingAudioSessionId;
        int i2 = getConfiguration().tunnelingAudioSessionId;
        this.tunnelingAudioSessionId = i2;
        this.tunneling = i2 != 0;
        if (i2 != i) {
            releaseCodec();
        }
        this.eventDispatcher.enabled(this.decoderCounters);
        this.frameReleaseTimeHelper.enable();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void onInputFormatChanged(FormatHolder formatHolder) throws ExoPlaybackException {
        super.onInputFormatChanged(formatHolder);
        Format format = formatHolder.format;
        this.eventDispatcher.inputFormatChanged(format);
        this.pendingPixelWidthHeightRatio = format.pixelWidthHeightRatio;
        this.pendingRotationDegrees = format.rotationDegrees;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.currentMediaFormat = mediaFormat;
        boolean z = mediaFormat.containsKey(KEY_CROP_RIGHT) && mediaFormat.containsKey(KEY_CROP_LEFT) && mediaFormat.containsKey(KEY_CROP_BOTTOM) && mediaFormat.containsKey(KEY_CROP_TOP);
        processOutputFormat(mediaCodec, z ? (mediaFormat.getInteger(KEY_CROP_RIGHT) - mediaFormat.getInteger(KEY_CROP_LEFT)) + 1 : mediaFormat.getInteger("width"), z ? (mediaFormat.getInteger(KEY_CROP_BOTTOM) - mediaFormat.getInteger(KEY_CROP_TOP)) + 1 : mediaFormat.getInteger("height"));
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public void onPositionReset(long j, boolean z) throws ExoPlaybackException {
        super.onPositionReset(j, z);
        clearRenderedFirstFrame();
        this.initialPositionUs = C3219C.TIME_UNSET;
        this.consecutiveDroppedFrameCount = 0;
        this.lastInputTimeUs = C3219C.TIME_UNSET;
        int i = this.pendingOutputStreamOffsetCount;
        if (i != 0) {
            this.outputStreamOffsetUs = this.pendingOutputStreamOffsetsUs[i - 1];
            this.pendingOutputStreamOffsetCount = 0;
        }
        if (z) {
            setJoiningDeadlineMs();
        } else {
            this.joiningDeadlineMs = C3219C.TIME_UNSET;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    public void onProcessedOutputBuffer(long j) {
        if (!this.tunneling) {
            this.buffersInCodecCount--;
        }
        while (true) {
            int i = this.pendingOutputStreamOffsetCount;
            if (i == 0 || j < this.pendingOutputStreamSwitchTimesUs[0]) {
                return;
            }
            long[] jArr = this.pendingOutputStreamOffsetsUs;
            this.outputStreamOffsetUs = jArr[0];
            int i2 = i - 1;
            this.pendingOutputStreamOffsetCount = i2;
            System.arraycopy(jArr, 1, jArr, 0, i2);
            long[] jArr2 = this.pendingOutputStreamSwitchTimesUs;
            System.arraycopy(jArr2, 1, jArr2, 0, this.pendingOutputStreamOffsetCount);
            clearRenderedFirstFrame();
        }
    }

    public void onProcessedTunneledBuffer(long j) {
        Format formatUpdateOutputFormatForTime = updateOutputFormatForTime(j);
        if (formatUpdateOutputFormatForTime != null) {
            processOutputFormat(getCodec(), formatUpdateOutputFormatForTime.width, formatUpdateOutputFormatForTime.height);
        }
        maybeNotifyVideoSizeChanged();
        this.decoderCounters.renderedOutputBufferCount++;
        maybeNotifyRenderedFirstFrame();
        onProcessedOutputBuffer(j);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    public void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) {
        if (!this.tunneling) {
            this.buffersInCodecCount++;
        }
        this.lastInputTimeUs = Math.max(decoderInputBuffer.timeUs, this.lastInputTimeUs);
        if (Util.SDK_INT >= 23 || !this.tunneling) {
            return;
        }
        onProcessedTunneledBuffer(decoderInputBuffer.timeUs);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public void onReset() {
        Surface surface;
        try {
            super.onReset();
            surface = this.dummySurface;
            if (surface != null) {
                if (this.surface == surface) {
                    this.surface = null;
                }
            }
        } finally {
            if (this.dummySurface != null) {
                Surface surface2 = this.surface;
                surface = this.dummySurface;
                if (surface2 == surface) {
                    this.surface = null;
                }
                surface.release();
                this.dummySurface = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public void onStarted() {
        super.onStarted();
        this.droppedFrames = 0;
        this.droppedFrameAccumulationStartTimeMs = SystemClock.elapsedRealtime();
        this.lastRenderTimeUs = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public void onStopped() {
        this.joiningDeadlineMs = C3219C.TIME_UNSET;
        maybeNotifyDroppedFrames();
        super.onStopped();
    }

    @Override // com.google.android.exoplayer2.BaseRenderer
    public void onStreamChanged(Format[] formatArr, long j) throws ExoPlaybackException {
        if (this.outputStreamOffsetUs == C3219C.TIME_UNSET) {
            this.outputStreamOffsetUs = j;
        } else {
            int i = this.pendingOutputStreamOffsetCount;
            if (i == this.pendingOutputStreamOffsetsUs.length) {
                Log.m17586w(TAG, "Too many stream changes, so dropping offset: " + this.pendingOutputStreamOffsetsUs[this.pendingOutputStreamOffsetCount - 1]);
            } else {
                this.pendingOutputStreamOffsetCount = i + 1;
            }
            long[] jArr = this.pendingOutputStreamOffsetsUs;
            int i2 = this.pendingOutputStreamOffsetCount;
            jArr[i2 - 1] = j;
            this.pendingOutputStreamSwitchTimesUs[i2 - 1] = this.lastInputTimeUs;
        }
        super.onStreamChanged(formatArr, j);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean processOutputBuffer(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, boolean z2, Format format) throws ExoPlaybackException {
        if (this.initialPositionUs == C3219C.TIME_UNSET) {
            this.initialPositionUs = j;
        }
        long j4 = j3 - this.outputStreamOffsetUs;
        if (z && !z2) {
            skipOutputBuffer(mediaCodec, i, j4);
            return true;
        }
        long j5 = j3 - j;
        if (this.surface == this.dummySurface) {
            if (!isBufferLate(j5)) {
                return false;
            }
            skipOutputBuffer(mediaCodec, i, j4);
            return true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j6 = jElapsedRealtime - this.lastRenderTimeUs;
        boolean z3 = getState() == 2;
        if (this.joiningDeadlineMs == C3219C.TIME_UNSET && j >= this.outputStreamOffsetUs && (!this.renderedFirstFrame || (z3 && shouldForceRenderOutputBuffer(j5, j6)))) {
            long jNanoTime = System.nanoTime();
            notifyFrameMetadataListener(j4, jNanoTime, format, this.currentMediaFormat);
            if (Util.SDK_INT >= 21) {
                renderOutputBufferV21(mediaCodec, i, j4, jNanoTime);
                return true;
            }
            renderOutputBuffer(mediaCodec, i, j4);
            return true;
        }
        if (z3 && j != this.initialPositionUs) {
            long jNanoTime2 = System.nanoTime();
            long jAdjustReleaseTime = this.frameReleaseTimeHelper.adjustReleaseTime(j3, ((j5 - (jElapsedRealtime - j2)) * 1000) + jNanoTime2);
            long j7 = (jAdjustReleaseTime - jNanoTime2) / 1000;
            boolean z4 = this.joiningDeadlineMs != C3219C.TIME_UNSET;
            if (shouldDropBuffersToKeyframe(j7, j2, z2) && maybeDropBuffersToKeyframe(mediaCodec, i, j4, j, z4)) {
                return false;
            }
            if (shouldDropOutputBuffer(j7, j2, z2)) {
                if (z4) {
                    skipOutputBuffer(mediaCodec, i, j4);
                    return true;
                }
                dropOutputBuffer(mediaCodec, i, j4);
                return true;
            }
            if (Util.SDK_INT >= 21) {
                if (j7 < 50000) {
                    notifyFrameMetadataListener(j4, jAdjustReleaseTime, format, this.currentMediaFormat);
                    renderOutputBufferV21(mediaCodec, i, j4, jAdjustReleaseTime);
                    return true;
                }
            } else if (j7 < 30000) {
                if (j7 > 11000) {
                    try {
                        Thread.sleep((j7 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                notifyFrameMetadataListener(j4, jAdjustReleaseTime, format, this.currentMediaFormat);
                renderOutputBuffer(mediaCodec, i, j4);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @CallSuper
    public void releaseCodec() {
        try {
            super.releaseCodec();
        } finally {
            this.buffersInCodecCount = 0;
        }
    }

    public void renderOutputBuffer(MediaCodec mediaCodec, int i, long j) {
        maybeNotifyVideoSizeChanged();
        TraceUtil.beginSection("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        TraceUtil.endSection();
        this.lastRenderTimeUs = SystemClock.elapsedRealtime() * 1000;
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        maybeNotifyRenderedFirstFrame();
    }

    @TargetApi(21)
    public void renderOutputBufferV21(MediaCodec mediaCodec, int i, long j, long j2) {
        maybeNotifyVideoSizeChanged();
        TraceUtil.beginSection("releaseOutputBuffer");
        C5338rz.m28064a(mediaCodec, i, j2);
        TraceUtil.endSection();
        this.lastRenderTimeUs = SystemClock.elapsedRealtime() * 1000;
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        maybeNotifyRenderedFirstFrame();
    }

    public boolean shouldDropBuffersToKeyframe(long j, long j2, boolean z) {
        return isBufferVeryLate(j) && !z;
    }

    public boolean shouldDropOutputBuffer(long j, long j2, boolean z) {
        return isBufferLate(j) && !z;
    }

    public boolean shouldForceRenderOutputBuffer(long j, long j2) {
        return isBufferLate(j) && j2 > 100000;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean shouldInitCodec(MediaCodecInfo mediaCodecInfo) {
        return this.surface != null || shouldUseDummySurface(mediaCodecInfo);
    }

    public void skipOutputBuffer(MediaCodec mediaCodec, int i, long j) {
        TraceUtil.beginSection("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        TraceUtil.endSection();
        this.decoderCounters.skippedOutputBufferCount++;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public int supportsFormat(MediaCodecSelector mediaCodecSelector, @Nullable DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, Format format) throws MediaCodecUtil.DecoderQueryException {
        int i = 0;
        if (!MimeTypes.isVideo(format.sampleMimeType)) {
            return C5516uN.m28604a(0);
        }
        DrmInitData drmInitData = format.drmInitData;
        boolean z = drmInitData != null;
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(mediaCodecSelector, format, z, false);
        if (z && decoderInfos.isEmpty()) {
            decoderInfos = getDecoderInfos(mediaCodecSelector, format, false, false);
        }
        if (decoderInfos.isEmpty()) {
            return C5516uN.m28604a(1);
        }
        if (drmInitData != null && !FrameworkMediaCrypto.class.equals(format.exoMediaCryptoType) && (format.exoMediaCryptoType != null || !BaseRenderer.supportsFormatDrm(drmSessionManager, drmInitData))) {
            return C5516uN.m28604a(2);
        }
        MediaCodecInfo mediaCodecInfo = decoderInfos.get(0);
        boolean zIsFormatSupported = mediaCodecInfo.isFormatSupported(format);
        int i2 = mediaCodecInfo.isSeamlessAdaptationSupported(format) ? 16 : 8;
        if (zIsFormatSupported) {
            List<MediaCodecInfo> decoderInfos2 = getDecoderInfos(mediaCodecSelector, format, z, true);
            if (!decoderInfos2.isEmpty()) {
                MediaCodecInfo mediaCodecInfo2 = decoderInfos2.get(0);
                if (mediaCodecInfo2.isFormatSupported(format) && mediaCodecInfo2.isSeamlessAdaptationSupported(format)) {
                    i = 32;
                }
            }
        }
        return C5516uN.m28605b(zIsFormatSupported ? 4 : 3, i2, i);
    }

    public void updateDroppedBufferCounters(int i) {
        DecoderCounters decoderCounters = this.decoderCounters;
        decoderCounters.droppedBufferCount += i;
        this.droppedFrames += i;
        int i2 = this.consecutiveDroppedFrameCount + i;
        this.consecutiveDroppedFrameCount = i2;
        decoderCounters.maxConsecutiveDroppedBufferCount = Math.max(i2, decoderCounters.maxConsecutiveDroppedBufferCount);
        int i3 = this.maxDroppedFramesToNotify;
        if (i3 <= 0 || this.droppedFrames < i3) {
            return;
        }
        maybeNotifyDroppedFrames();
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j) {
        this(context, mediaCodecSelector, j, null, null, -1);
    }

    private static List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector, Format format, boolean z, boolean z2) throws MediaCodecUtil.DecoderQueryException {
        Pair<Integer, Integer> codecProfileAndLevel;
        String str;
        String str2 = format.sampleMimeType;
        if (str2 == null) {
            return Collections.emptyList();
        }
        List<MediaCodecInfo> decoderInfosSortedByFormatSupport = MediaCodecUtil.getDecoderInfosSortedByFormatSupport(mediaCodecSelector.getDecoderInfos(str2, z, z2), format);
        if (MimeTypes.VIDEO_DOLBY_VISION.equals(str2) && (codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format)) != null) {
            int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                str = MimeTypes.VIDEO_H265;
            } else if (iIntValue == 512) {
                str = MimeTypes.VIDEO_H264;
            }
            decoderInfosSortedByFormatSupport.addAll(mediaCodecSelector.getDecoderInfos(str, z, z2));
        }
        return Collections.unmodifiableList(decoderInfosSortedByFormatSupport);
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j, @Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener, int i) {
        this(context, mediaCodecSelector, j, null, false, handler, videoRendererEventListener, i);
    }

    @Deprecated
    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j, @Nullable DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, boolean z, @Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener, int i) {
        this(context, mediaCodecSelector, j, drmSessionManager, z, false, handler, videoRendererEventListener, i);
    }

    @Deprecated
    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j, @Nullable DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, boolean z, boolean z2, @Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener, int i) {
        super(2, mediaCodecSelector, drmSessionManager, z, z2, 30.0f);
        this.allowedJoiningTimeMs = j;
        this.maxDroppedFramesToNotify = i;
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.frameReleaseTimeHelper = new VideoFrameReleaseTimeHelper(applicationContext);
        this.eventDispatcher = new VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        this.deviceNeedsNoPostProcessWorkaround = deviceNeedsNoPostProcessWorkaround();
        this.pendingOutputStreamOffsetsUs = new long[10];
        this.pendingOutputStreamSwitchTimesUs = new long[10];
        this.outputStreamOffsetUs = C3219C.TIME_UNSET;
        this.lastInputTimeUs = C3219C.TIME_UNSET;
        this.joiningDeadlineMs = C3219C.TIME_UNSET;
        this.currentWidth = -1;
        this.currentHeight = -1;
        this.currentPixelWidthHeightRatio = -1.0f;
        this.pendingPixelWidthHeightRatio = -1.0f;
        this.scalingMode = 1;
        clearReportedVideoSize();
    }

    public MediaCodecVideoRenderer(Context context, MediaCodecSelector mediaCodecSelector, long j, boolean z, @Nullable Handler handler, @Nullable VideoRendererEventListener videoRendererEventListener, int i) {
        this(context, mediaCodecSelector, j, null, false, z, handler, videoRendererEventListener, i);
    }
}
