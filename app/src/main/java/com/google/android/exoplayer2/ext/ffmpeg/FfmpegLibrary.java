package com.google.android.exoplayer2.ext.ffmpeg;

import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.util.LibraryLoader;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import org.dom4j.p020io.SAXEventRecorder;

/* JADX INFO: loaded from: classes2.dex */
public final class FfmpegLibrary {
    private static final LibraryLoader LOADER;
    private static final String TAG = "FfmpegLibrary";

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.ffmpeg");
        LOADER = new LibraryLoader("ijkffmpeg", "ffmpeg");
    }

    private FfmpegLibrary() {
    }

    private static native String ffmpegGetVersion();

    private static native boolean ffmpegHasDecoder(String str);

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String getCodecName(String str) {
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    b = 0;
                }
                break;
            case -1606874997:
                if (str.equals(MimeTypes.AUDIO_AMR_WB)) {
                    b = 1;
                }
                break;
            case -1095064472:
                if (str.equals(MimeTypes.AUDIO_DTS)) {
                    b = 2;
                }
                break;
            case -1003765268:
                if (str.equals(MimeTypes.AUDIO_VORBIS)) {
                    b = 3;
                }
                break;
            case -432837260:
                if (str.equals(MimeTypes.AUDIO_MPEG_L1)) {
                    b = 4;
                }
                break;
            case -432837259:
                if (str.equals(MimeTypes.AUDIO_MPEG_L2)) {
                    b = 5;
                }
                break;
            case -53558318:
                if (str.equals(MimeTypes.AUDIO_AAC)) {
                    b = 6;
                }
                break;
            case 187078296:
                if (str.equals(MimeTypes.AUDIO_AC3)) {
                    b = 7;
                }
                break;
            case 1503095341:
                if (str.equals(MimeTypes.AUDIO_AMR_NB)) {
                    b = 8;
                }
                break;
            case 1504470054:
                if (str.equals(MimeTypes.AUDIO_ALAC)) {
                    b = 9;
                }
                break;
            case 1504578661:
                if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                    b = 10;
                }
                break;
            case 1504619009:
                if (str.equals(MimeTypes.AUDIO_FLAC)) {
                    b = SAXEventRecorder.SAXEvent.f16645n;
                }
                break;
            case 1504831518:
                if (str.equals(MimeTypes.AUDIO_MPEG)) {
                    b = SAXEventRecorder.SAXEvent.f16646o;
                }
                break;
            case 1504891608:
                if (str.equals(MimeTypes.AUDIO_OPUS)) {
                    b = 13;
                }
                break;
            case 1505942594:
                if (str.equals(MimeTypes.AUDIO_DTS_HD)) {
                    b = SAXEventRecorder.SAXEvent.f16648q;
                }
                break;
            case 1556697186:
                if (str.equals(MimeTypes.AUDIO_TRUEHD)) {
                    b = SAXEventRecorder.SAXEvent.f16649r;
                }
                break;
            case 1903231877:
                if (str.equals(MimeTypes.AUDIO_ALAW)) {
                    b = 16;
                }
                break;
            case 1903589369:
                if (str.equals(MimeTypes.AUDIO_MLAW)) {
                    b = SAXEventRecorder.SAXEvent.f16651t;
                }
                break;
        }
        switch (b) {
            case 0:
            case 10:
                return "eac3";
            case 1:
                return "amrwb";
            case 2:
            case 14:
                return "dca";
            case 3:
                return "vorbis";
            case 4:
            case 5:
            case 12:
                return "mp3";
            case 6:
                return "aac";
            case 7:
                return "ac3";
            case 8:
                return "amrnb";
            case 9:
                return "alac";
            case 11:
                return "flac";
            case 13:
                return "opus";
            case 15:
                return "truehd";
            case 16:
                return "pcm_alaw";
            case 17:
                return "pcm_mulaw";
            default:
                return null;
        }
    }

    public static String getVersion() {
        if (isAvailable()) {
            return ffmpegGetVersion();
        }
        return null;
    }

    public static boolean isAvailable() {
        return LOADER.isAvailable();
    }

    public static void setLibraries(String... strArr) {
        LOADER.setLibraries(strArr);
    }

    public static boolean supportsFormat(String str) {
        String codecName;
        if (!isAvailable() || (codecName = getCodecName(str)) == null) {
            return false;
        }
        if (ffmpegHasDecoder(codecName)) {
            return true;
        }
        Log.m17586w(TAG, "No " + codecName + " decoder available. Check the FFmpeg build configuration.");
        return false;
    }
}
