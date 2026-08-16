package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import p000.C0849NA;
import p000.C1219Sy;
import p000.C1284Ty;
import p000.C1288U1;
import p000.C1348Uy;
import p000.C1416Vy;
import p000.C1469Wn;
import p000.C1480Wy;
import p000.C1543Xy;
import p000.C1606Yy;
import p000.C1674Zy;
import p000.C2945az;
import p000.C5630w2;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaCodecInfo {
    public static final int MAX_SUPPORTED_INSTANCES_UNKNOWN = -1;
    public static final String TAG = "MediaCodecInfo";
    public final boolean adaptive;

    @Nullable
    public final android.media.MediaCodecInfo.CodecCapabilities capabilities;

    @Nullable
    public final String codecMimeType;
    public final boolean hardwareAccelerated;
    private final boolean isVideo;

    @Nullable
    public final String mimeType;
    public final String name;
    public final boolean passthrough;
    public final boolean secure;
    public final boolean softwareOnly;
    public final boolean tunneling;
    public final boolean vendor;

    private MediaCodecInfo(String str, @Nullable String str2, @Nullable String str3, @Nullable android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.name = (String) Assertions.checkNotNull(str);
        this.mimeType = str2;
        this.codecMimeType = str3;
        this.capabilities = codecCapabilities;
        this.passthrough = z;
        this.hardwareAccelerated = z2;
        this.softwareOnly = z3;
        this.vendor = z4;
        boolean z7 = false;
        this.adaptive = (z5 || codecCapabilities == null || !isAdaptive(codecCapabilities)) ? false : true;
        this.tunneling = codecCapabilities != null && isTunneling(codecCapabilities);
        if (z6 || (codecCapabilities != null && isSecure(codecCapabilities))) {
            z7 = true;
        }
        this.secure = z7;
        this.isVideo = MimeTypes.isVideo(str2);
    }

    private static int adjustMaxInputChannelCount(String str, String str2, int i) {
        int i2;
        if (i > 1 || ((Util.SDK_INT >= 26 && i > 0) || MimeTypes.AUDIO_MPEG.equals(str2) || MimeTypes.AUDIO_AMR_NB.equals(str2) || MimeTypes.AUDIO_AMR_WB.equals(str2) || MimeTypes.AUDIO_AAC.equals(str2) || MimeTypes.AUDIO_VORBIS.equals(str2) || MimeTypes.AUDIO_OPUS.equals(str2) || MimeTypes.AUDIO_RAW.equals(str2) || MimeTypes.AUDIO_FLAC.equals(str2) || MimeTypes.AUDIO_ALAW.equals(str2) || MimeTypes.AUDIO_MLAW.equals(str2) || MimeTypes.AUDIO_MSGSM.equals(str2))) {
            return i;
        }
        if (MimeTypes.AUDIO_AC3.equals(str2)) {
            i2 = 6;
        } else {
            i2 = MimeTypes.AUDIO_E_AC3.equals(str2) ? 16 : 30;
        }
        Log.m17586w(TAG, "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i2 + "]");
        return i2;
    }

    @TargetApi(21)
    private static boolean areSizeAndRateSupportedV21(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point pointAlignVideoSizeV21 = alignVideoSizeV21(videoCapabilities, i, i2);
        int i3 = pointAlignVideoSizeV21.x;
        int i4 = pointAlignVideoSizeV21.y;
        return (d == -1.0d || d < 1.0d) ? C1219Sy.m5734a(videoCapabilities, i3, i4) : C1284Ty.m6147a(videoCapabilities, i3, i4, Math.floor(d));
    }

    private static final boolean enableRotatedVerticalResolutionWorkaround(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(Util.DEVICE)) ? false : true;
    }

    @TargetApi(23)
    private static int getMaxSupportedInstancesV23(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C1674Zy.m8830a(codecCapabilities);
    }

    private static boolean isAdaptive(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return Util.SDK_INT >= 19 && isAdaptiveV19(codecCapabilities);
    }

    @TargetApi(19)
    private static boolean isAdaptiveV19(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static boolean isSecure(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return Util.SDK_INT >= 21 && isSecureV21(codecCapabilities);
    }

    @TargetApi(21)
    private static boolean isSecureV21(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean isTunneling(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return Util.SDK_INT >= 21 && isTunnelingV21(codecCapabilities);
    }

    @TargetApi(21)
    private static boolean isTunnelingV21(android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void logAssumedSupport(String str) {
        StringBuilder sbM6151a = C1288U1.m6151a("AssumedSupport [", str, "] [");
        sbM6151a.append(this.name);
        sbM6151a.append(", ");
        sbM6151a.append(this.mimeType);
        sbM6151a.append("] [");
        sbM6151a.append(Util.DEVICE_DEBUG_INFO);
        sbM6151a.append("]");
        Log.m17580d(TAG, sbM6151a.toString());
    }

    private void logNoSupport(String str) {
        StringBuilder sbM6151a = C1288U1.m6151a("NoSupport [", str, "] [");
        sbM6151a.append(this.name);
        sbM6151a.append(", ");
        sbM6151a.append(this.mimeType);
        sbM6151a.append("] [");
        sbM6151a.append(Util.DEVICE_DEBUG_INFO);
        sbM6151a.append("]");
        Log.m17580d(TAG, sbM6151a.toString());
    }

    public static MediaCodecInfo newInstance(String str, String str2, String str3, @Nullable android.media.MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new MediaCodecInfo(str, str2, str3, codecCapabilities, false, z, z2, z3, z4, z5);
    }

    public static MediaCodecInfo newPassthroughInstance(String str) {
        return new MediaCodecInfo(str, null, null, null, true, false, true, false, false, false);
    }

    @TargetApi(21)
    public Point alignVideoSizeV21(int i, int i2) {
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilitiesM6946a;
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null || (videoCapabilitiesM6946a = C1480Wy.m6946a(codecCapabilities)) == null) {
            return null;
        }
        return alignVideoSizeV21(videoCapabilitiesM6946a, i, i2);
    }

    public int getMaxSupportedInstances() {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (Util.SDK_INT < 23 || (codecCapabilities = this.capabilities) == null) {
            return -1;
        }
        return getMaxSupportedInstancesV23(codecCapabilities);
    }

    public android.media.MediaCodecInfo.CodecProfileLevel[] getProfileLevels() {
        android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new android.media.MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    @TargetApi(21)
    public boolean isAudioChannelCountSupportedV21(int i) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("channelCount.caps");
            return false;
        }
        android.media.MediaCodecInfo.AudioCapabilities audioCapabilitiesM8030a = C1543Xy.m8030a(codecCapabilities);
        if (audioCapabilitiesM8030a == null) {
            logNoSupport("channelCount.aCaps");
            return false;
        }
        if (adjustMaxInputChannelCount(this.name, this.mimeType, C2945az.m14574a(audioCapabilitiesM8030a)) >= i) {
            return true;
        }
        logNoSupport(C5630w2.m29215a("channelCount.support, ", i));
        return false;
    }

    @TargetApi(21)
    public boolean isAudioSampleRateSupportedV21(int i) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("sampleRate.caps");
            return false;
        }
        android.media.MediaCodecInfo.AudioCapabilities audioCapabilitiesM8030a = C1543Xy.m8030a(codecCapabilities);
        if (audioCapabilitiesM8030a == null) {
            logNoSupport("sampleRate.aCaps");
            return false;
        }
        if (C1606Yy.m8259a(audioCapabilitiesM8030a, i)) {
            return true;
        }
        logNoSupport(C5630w2.m29215a("sampleRate.support, ", i));
        return false;
    }

    public boolean isCodecSupported(Format format) {
        String mediaMimeType;
        StringBuilder sb;
        String str;
        String str2 = format.codecs;
        if (str2 == null || this.mimeType == null || (mediaMimeType = MimeTypes.getMediaMimeType(str2)) == null) {
            return true;
        }
        if (this.mimeType.equals(mediaMimeType)) {
            Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format);
            if (codecProfileAndLevel == null) {
                return true;
            }
            int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
            int iIntValue2 = ((Integer) codecProfileAndLevel.second).intValue();
            if (!this.isVideo && iIntValue != 42) {
                return true;
            }
            for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : getProfileLevels()) {
                if (codecProfileLevel.profile == iIntValue && codecProfileLevel.level >= iIntValue2) {
                    return true;
                }
            }
            sb = new StringBuilder("codec.profileLevel, ");
            str = format.codecs;
        } else {
            sb = new StringBuilder("codec.mime ");
            str = format.codecs;
        }
        logNoSupport(C0849NA.m3929a(sb, str, ", ", mediaMimeType));
        return false;
    }

    public boolean isFormatSupported(Format format) throws MediaCodecUtil.DecoderQueryException {
        int i;
        if (!isCodecSupported(format)) {
            return false;
        }
        if (!this.isVideo) {
            if (Util.SDK_INT >= 21) {
                int i2 = format.sampleRate;
                if (i2 != -1 && !isAudioSampleRateSupportedV21(i2)) {
                    return false;
                }
                int i3 = format.channelCount;
                if (i3 != -1 && !isAudioChannelCountSupportedV21(i3)) {
                    return false;
                }
            }
            return true;
        }
        int i4 = format.width;
        if (i4 <= 0 || (i = format.height) <= 0) {
            return true;
        }
        if (Util.SDK_INT >= 21) {
            return isVideoSizeAndRateSupportedV21(i4, i, format.frameRate);
        }
        boolean z = i4 * i <= MediaCodecUtil.maxH264DecodableFrameSize();
        if (!z) {
            logNoSupport("legacyFrameSize, " + format.width + "x" + format.height);
        }
        return z;
    }

    public boolean isHdr10PlusOutOfBandMetadataSupported() {
        if (Util.SDK_INT >= 29 && MimeTypes.VIDEO_VP9.equals(this.mimeType)) {
            for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : getProfileLevels()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isSeamlessAdaptationSupported(Format format) {
        if (this.isVideo) {
            return this.adaptive;
        }
        Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format);
        return codecProfileAndLevel != null && ((Integer) codecProfileAndLevel.first).intValue() == 42;
    }

    @TargetApi(21)
    public boolean isVideoSizeAndRateSupportedV21(int i, int i2, double d) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("sizeAndRate.caps");
            return false;
        }
        android.media.MediaCodecInfo.VideoCapabilities videoCapabilitiesM6946a = C1480Wy.m6946a(codecCapabilities);
        if (videoCapabilitiesM6946a == null) {
            logNoSupport("sizeAndRate.vCaps");
            return false;
        }
        if (areSizeAndRateSupportedV21(videoCapabilitiesM6946a, i, i2, d)) {
            return true;
        }
        if (i < i2 && enableRotatedVerticalResolutionWorkaround(this.name) && areSizeAndRateSupportedV21(videoCapabilitiesM6946a, i2, i, d)) {
            StringBuilder sbM6925a = C1469Wn.m6925a("sizeAndRate.rotated, ", i, "x", i2, "x");
            sbM6925a.append(d);
            logAssumedSupport(sbM6925a.toString());
            return true;
        }
        StringBuilder sbM6925a2 = C1469Wn.m6925a("sizeAndRate.support, ", i, "x", i2, "x");
        sbM6925a2.append(d);
        logNoSupport(sbM6925a2.toString());
        return false;
    }

    public String toString() {
        return this.name;
    }

    @TargetApi(21)
    private static Point alignVideoSizeV21(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int iM6431a = C1348Uy.m6431a(videoCapabilities);
        int iM6661a = C1416Vy.m6661a(videoCapabilities);
        return new Point(Util.ceilDivide(i, iM6431a) * iM6431a, Util.ceilDivide(i2, iM6661a) * iM6661a);
    }

    public boolean isSeamlessAdaptationSupported(Format format, Format format2, boolean z) {
        if (this.isVideo) {
            return format.sampleMimeType.equals(format2.sampleMimeType) && format.rotationDegrees == format2.rotationDegrees && (this.adaptive || (format.width == format2.width && format.height == format2.height)) && ((!z && format2.colorInfo == null) || Util.areEqual(format.colorInfo, format2.colorInfo));
        }
        if (MimeTypes.AUDIO_AAC.equals(this.mimeType) && format.sampleMimeType.equals(format2.sampleMimeType) && format.channelCount == format2.channelCount && format.sampleRate == format2.sampleRate) {
            Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(format);
            Pair<Integer, Integer> codecProfileAndLevel2 = MediaCodecUtil.getCodecProfileAndLevel(format2);
            if (codecProfileAndLevel != null && codecProfileAndLevel2 != null) {
                return ((Integer) codecProfileAndLevel.first).intValue() == 42 && ((Integer) codecProfileAndLevel2.first).intValue() == 42;
            }
        }
        return false;
    }
}
