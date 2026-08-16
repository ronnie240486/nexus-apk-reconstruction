package com.google.zxing.pdf417.encoder;

import android.media.ViviTV.fragmens.VodPlayFragment;
import androidx.constraintlayout.solver.widgets.Optimizer;
import androidx.core.view.InputDeviceCompat;
import com.google.android.exoplayer2.extractor.p006ts.PsExtractor;
import com.google.android.exoplayer2.extractor.p006ts.TsExtractor;
import com.google.zxing.WriterException;
import com.google.zxing.pdf417.PDF417Common;
import com.tencent.smtt.sdk.TbsListener;
import com.tencent.smtt.sdk.TbsMediaPlayer;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.videolan.libvlc.MediaPlayer;
import org.videolan.libvlc.interfaces.IMediaList;
import org.videolan.libvlc.util.VLCUtil;
import p000.AbstractC1356V5;
import p000.C0727LD;
import p000.C4525iC;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes2.dex */
final class PDF417ErrorCorrection {
    private static final int[][] EC_COEFFICIENTS = {new int[]{27, 917}, new int[]{522, 568, 723, 809}, new int[]{TbsListener.ErrorCode.DECOUPLE_TPATCH_INSTALL_SUCCESS, 308, 436, 284, 646, 653, 428, 379}, new int[]{274, 562, TbsListener.ErrorCode.INSTALL_SUCCESS_AND_RELEASE_LOCK, 755, 599, 524, 801, TbsListener.ErrorCode.DOWNLOAD_CDN_URL_IS_NULL, 295, 116, 442, 428, 295, 42, 176, 65}, new int[]{361, 575, 922, 525, 176, 586, TbsListener.ErrorCode.STATIC_TBS_INSTALL_MAKE_SYMBOLIC_LINK_ERR, TbsListener.ErrorCode.THROWABLE_INITTESRUNTIMEENVIRONMENT, 536, 742, 677, 742, 687, 284, 193, 517, MediaPlayer.Event.f17412r, 494, Optimizer.OPTIMIZATION_STANDARD, CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA, 593, 800, 571, TbsListener.ErrorCode.ERROR_SDKENGINE_INIT_THROWABLE, 803, 133, TbsListener.ErrorCode.RENAME_FAIL, 390, 685, 330, 63, TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_TBS_NOTAVAILABLE}, new int[]{539, 422, 6, 93, 862, 771, 453, TbsListener.ErrorCode.FILE_DELETED, TbsListener.ErrorCode.STATIC_TBS_INSTALL_SMART_INSTALL_TBS_FINAL_EXCEPTION, 287, TbsListener.ErrorCode.UNKNOWN_ERROR, TbsListener.ErrorCode.INFO_CODE_FILEREADER_OPENFILEREADER_COUNTS, 733, 877, 381, 612, 723, 476, 462, TsExtractor.TS_STREAM_TYPE_AC4, 430, 609, 858, 822, 543, 376, 511, TbsListener.ErrorCode.INFO_CODE_BASE, 672, 762, 283, 184, 440, 35, 519, 31, 460, 594, 225, 535, 517, 352, 605, 158, 651, 201, 488, TbsListener.ErrorCode.INFO_CODE_MINIQB_STARTMINIQBTOLOADURL_ISNOTX5CORE, 648, 733, 717, 83, TbsListener.ErrorCode.INFO_CORE_NOT_EXIST, 97, 280, 771, 840, 629, 4, 381, 843, 623, 264, 543}, new int[]{521, TbsListener.ErrorCode.ERROR_NEW_EXTENSION_INSTANCE_FAILED, 864, 547, 858, 580, 296, 379, 53, 779, 897, 444, TbsListener.ErrorCode.INFO_CODE_BASE, 925, 749, TbsListener.ErrorCode.INFO_INITX5_FALSE_DEFAULT, 822, 93, 217, TbsListener.ErrorCode.EXCEED_DEXOPT_RETRY_NUM, PDF417Common.MAX_CODEWORDS_IN_BARCODE, 244, 583, TbsListener.ErrorCode.STATIC_TBS_INSTALL_MAKE_TMP_FAILURE, 246, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA, 447, 631, 292, 908, 490, TbsListener.ErrorCode.INFO_COOKIE_SWITCH_TRANSFER, IMediaList.Event.f17603k, MediaPlayer.Event.f17401g, 457, 907, 594, 723, 674, 292, 272, 96, 684, 432, 686, 606, 860, 569, 193, TbsListener.ErrorCode.RENAME_EXCEPTION, 129, 186, TbsListener.ErrorCode.TPATCH_INSTALL_SUCCESS, 287, PsExtractor.AUDIO_STREAM, 775, MediaPlayer.Event.f17416v, 173, 40, 379, 712, 463, 646, 776, 171, C0727LD.f1761l, 297, 763, 156, 732, 95, MediaPlayer.Event.f17411q, 447, 90, TbsListener.ErrorCode.INFO_CODE_FILEREADER_OPENFILEREADER_NOTSUPPORT, 48, TbsListener.ErrorCode.INCR_ERROR_DETAIL, 821, 808, 898, 784, 663, 627, 378, 382, MediaPlayer.Event.f17405k, 380, 602, 754, 336, 89, 614, 87, 432, TbsListener.ErrorCode.STATIC_TBS_INSTALL_TMP_RENAME_ERR, 616, 157, 374, TbsListener.ErrorCode.TPATCH_ENABLE_EXCEPTION, 726, 600, MediaPlayer.Event.f17410p, 375, 898, 845, 454, 354, 130, 814, 587, 804, 34, TbsListener.ErrorCode.EXCEED_COPY_RETRY_NUM, 330, 539, 297, 827, 865, 37, 517, 834, 315, 550, 86, 801, 4, 108, 539}, new int[]{524, 894, 75, 766, 882, 857, 74, 204, 82, 586, 708, 250, 905, 786, 138, 720, 858, 194, 311, 913, 275, 190, 375, 850, 438, 733, 194, 280, 201, 280, 828, 757, 710, 814, 919, 89, 68, 569, 11, 204, 796, 605, 540, 913, 801, 700, 799, 137, 439, TbsListener.ErrorCode.INFO_CORE_EXIST_NOT_LOAD, 592, 668, 353, 859, 370, 694, TbsListener.ErrorCode.THROWABLE_INITX5CORE, 240, TbsListener.ErrorCode.INCR_UPDATE_ERROR, InputDeviceCompat.SOURCE_KEYBOARD, 284, 549, TbsListener.ErrorCode.DEXOPT_EXCEPTION, 884, 315, 70, 329, 793, 490, 274, 877, 162, 749, 812, 684, 461, 334, 376, 849, 521, 307, 291, 803, 712, 19, 358, 399, 908, 103, 511, 51, 8, 517, 225, 289, 470, 637, 731, 66, 255, 917, MediaPlayer.Event.f17410p, 463, 830, 730, 433, 848, 585, 136, 538, 906, 90, 2, 290, 743, 199, 655, 903, 329, 49, 802, 580, 355, 588, 188, 462, 10, 134, 628, TbsListener.ErrorCode.ERROR_SDKENGINE_INIT_THROWABLE, 479, 130, 739, 71, Optimizer.OPTIMIZATION_STANDARD, TbsListener.ErrorCode.ERROR_QBSDK_INIT_ISSUPPORT, 374, 601, PsExtractor.AUDIO_STREAM, 605, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, 673, 687, TbsListener.ErrorCode.DECOUPLE_INCURUPDATE_SUCCESS, 722, C4525iC.f14486j, TbsListener.ErrorCode.NONEEDDOWNLOAD_OTHER_PROCESS_DOWNLOADING, TbsMediaPlayer.TbsMediaPlayerListener.MEDIA_INFO_HAVE_VIDEO_DATA, 607, TbsListener.ErrorCode.STATIC_TBS_INSTALL_MAKE_SYMBOLIC_LINK_ERR, 455, 193, 689, 707, 805, 641, 48, 60, 732, 621, 895, 544, MediaPlayer.Event.f17404j, 852, 655, TbsListener.ErrorCode.WARNING_REMOTE_SWITCH_DISABLE, 697, 755, 756, 60, TbsListener.ErrorCode.RENAME_FAIL, 773, 434, 421, 726, 528, 503, 118, 49, 795, 32, 144, 500, TbsListener.ErrorCode.TPATCH_FAIL, 836, 394, 280, 566, TbsListener.ErrorCode.ERROR_QBSDK_INIT_RETCODE_ERROR, 9, 647, 550, 73, 914, 342, 126, 32, 681, 331, 792, TbsListener.ErrorCode.STATIC_TBS_INSTALL_MAKE_TMP_FAILURE, 60, 609, 441, 180, 791, 893, 754, 605, 383, TbsListener.ErrorCode.INCR_ERROR_DETAIL, 749, 760, TbsListener.ErrorCode.COPY_SRCDIR_ERROR, 54, 297, 134, 54, 834, 299, 922, 191, 910, 532, 609, 829, PsExtractor.PRIVATE_STREAM_1, 20, 167, 29, 872, 449, 83, TbsListener.ErrorCode.INFO_FORCE_SYSTEM_WEBVIEW_OUTER, 41, 656, TbsListener.ErrorCode.INFO_CODE_FILEREADER_OPENFILEREADER_COUNTS, 579, 481, 173, TbsListener.ErrorCode.INFO_CORE_NOT_EXIST, 251, 688, 95, 497, 555, 642, 543, 307, 159, 924, 558, 648, 55, 497, 10}, new int[]{352, 77, 373, TbsListener.ErrorCode.INFO_CODE_MINIQB_STARTMINIQBTOLOADURL_FAILED, 35, 599, 428, TbsListener.ErrorCode.UNZIP_OTHER_ERROR, TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_TBS_AVAILABLE, 574, 118, 498, 285, 380, AbstractC1356V5.f3556d, 492, 197, MediaPlayer.Event.f17406l, 920, TbsListener.ErrorCode.NO_NEED_STARTDOWNLOAD, 914, 299, TbsListener.ErrorCode.INSTALL_FROM_UNZIP, 643, 294, 871, TbsListener.ErrorCode.THROWABLE_QBSDK_INIT, 88, 87, 193, 352, 781, 846, 75, TbsListener.ErrorCode.ERROR_CORE_LOAD_CRASH_PROTECT, 520, 435, 543, 203, 666, 249, 346, 781, 621, TbsListener.ErrorCode.STATIC_TBS_INSTALL_MAKE_SYMBOLIC_LINK_ERR, MediaPlayer.Event.f17409o, 794, 534, 539, 781, TbsListener.ErrorCode.INFO_CAN_NOT_DISABLED_BY_CRASH, 390, 644, 102, 476, C0727LD.f1760k, 290, 632, 545, 37, 858, 916, 552, 41, 542, 289, 122, 272, 383, 800, 485, 98, TbsMediaPlayer.TbsMediaPlayerListener.MEDIA_INFO_HAVE_VIDEO_DATA, 472, 761, TbsListener.ErrorCode.UNKNOWN_ERROR, 784, 860, 658, 741, 290, 204, 681, TbsListener.ErrorCode.INFO_CAN_NOT_LOAD_X5, 855, 85, 99, 62, 482, 180, 20, 297, 451, 593, 913, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, 808, 684, 287, 536, 561, 76, 653, 899, 729, 567, 744, 390, InputDeviceCompat.SOURCE_DPAD, PsExtractor.AUDIO_STREAM, IMediaList.Event.f17603k, MediaPlayer.Event.f17401g, 240, 518, 794, 395, 768, 848, 51, TbsListener.ErrorCode.STATIC_TBS_INSTALL_SMART_INSTALL_TBS_FINAL_EXCEPTION, C4525iC.f14486j, 168, 190, 826, 328, 596, 786, TbsListener.ErrorCode.ERROR_UNMATCH_TBSCORE_VER, 570, 381, TbsListener.ErrorCode.INFO_INITX5_FALSE_DEFAULT, 641, 156, TbsListener.ErrorCode.DECOUPLE_TPATCH_INSTALL_SUCCESS, TbsListener.ErrorCode.NEEDDOWNLOAD_STATIC_INSTALLING, 429, 531, TbsListener.ErrorCode.UNZIP_OTHER_ERROR, 676, 710, 89, 168, VodPlayFragment.f8485n3, TbsListener.ErrorCode.INFO_FORCE_SYSTEM_WEBVIEW_OUTER, 40, 708, 575, 162, 864, TbsListener.ErrorCode.INSTALL_FROM_UNZIP, 65, 861, 841, 512, 164, 477, TbsListener.ErrorCode.INCRUPDATE_INSTALL_SUCCESS, 92, 358, 785, 288, 357, 850, 836, 827, 736, 707, 94, 8, 494, TbsListener.ErrorCode.DOWNLOAD_NOT_WIFI_ERROR, 521, 2, C0727LD.f1760k, 851, 543, TbsListener.ErrorCode.NEEDDOWNLOAD_TMPCORE_PREPARING, 729, 771, 95, 248, 361, IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED_BASELINE, TbsListener.ErrorCode.ERROR_QBSDK_INIT_ERROR_RET_TYPE_NOT_BUNDLE, 856, 797, 289, 51, 684, 466, 533, 820, 669, 45, 902, 452, 167, 342, 244, 173, 35, 463, 651, 51, 699, 591, 452, IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED_BASELINE, 37, TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY, 298, 332, 552, 43, 427, 119, 662, 777, 475, 850, 764, 364, IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED_BASELINE, 911, 283, 711, 472, 420, 245, 288, 594, 394, 511, TbsListener.ErrorCode.ERROR_CORE_LOAD_CRASH_PROTECT, 589, 777, 699, 688, 43, TbsListener.ErrorCode.INFO_CAN_NOT_DISABLED_BY_CRASH, 842, 383, 721, 521, 560, 644, 714, 559, 62, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA, 873, 663, 713, 159, 672, 729, 624, 59, 193, TbsListener.ErrorCode.INFO_TEMP_CORE_EXIST_CONF_ERROR, 158, TbsListener.ErrorCode.DEXOPT_EXCEPTION, 563, 564, 343, 693, 109, 608, 563, 365, 181, 772, 677, TbsListener.ErrorCode.ERROR_NEW_EXTENSION_INSTANCE_FAILED, 248, 353, 708, TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_TBS_NOTAVAILABLE, 579, 870, 617, 841, 632, 860, 289, 536, 35, 777, 618, 586, 424, 833, 77, 597, 346, MediaPlayer.Event.f17410p, 757, 632, 695, TbsMediaPlayer.TbsMediaPlayerListener.MEDIA_INFO_NO_VIDEO_DATA, 331, 247, 184, 45, 787, TbsListener.ErrorCode.STATIC_TBS_INSTALL_MAX_TRIED_ERR, 18, 66, TbsListener.ErrorCode.INFO_CAN_NOT_LOAD_X5, 369, 54, 492, TbsListener.ErrorCode.INCR_ERROR_DETAIL, 613, 830, 922, 437, 519, 644, 905, 789, 420, VodPlayFragment.f8486o3, 441, TbsListener.ErrorCode.UNZIP_OTHER_ERROR, 300, 892, 827, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA, 537, 381, 662, InputDeviceCompat.SOURCE_DPAD, 56, 252, 341, TbsListener.ErrorCode.TPATCH_ENABLE_EXCEPTION, 797, 838, 837, 720, 224, 307, 631, 61, 87, 560, TbsListener.ErrorCode.ERROR_NEW_EXTENSION_INSTANCE_FAILED, 756, 665, 397, 808, 851, TbsListener.ErrorCode.WARNING_REMOTE_SWITCH_DISABLE, 473, 795, 378, 31, 647, 915, 459, 806, 590, 731, 425, TbsListener.ErrorCode.INCR_UPDATE_ERROR, 548, 249, TbsListener.ErrorCode.THROWABLE_INITTESRUNTIMEENVIRONMENT, 881, 699, 535, 673, 782, 210, 815, 905, TbsListener.ErrorCode.ERROR_UNMATCH_TBSCORE_VER, 843, 922, 281, 73, 469, 791, TbsListener.ErrorCode.STATIC_TBS_INSTALL_HAS_INSTALLED_EXCEPTION, 162, 498, 308, TbsListener.ErrorCode.NO_NEED_STARTDOWNLOAD, 422, 907, 817, 187, 62, 16, 425, 535, 336, MediaPlayer.Event.f17417w, 437, 375, MediaPlayer.Event.f17412r, TbsListener.ErrorCode.STATIC_TBS_INSTALL_SMART_INSTALL_TBS_FINAL_EXCEPTION, 296, VLCUtil.f17717i, 923, 116, 667, TbsMediaPlayer.TbsMediaPlayerListener.MEDIA_INFO_NO_VIDEO_DATA, 353, 62, 366, 691, 379, 687, 842, 37, 357, 720, 742, 330, 5, 39, 923, 311, 424, TbsListener.ErrorCode.TPATCH_ENABLE_EXCEPTION, 749, TbsListener.ErrorCode.THROWABLE_INITTESRUNTIMEENVIRONMENT, 54, 669, 316, 342, 299, 534, TbsListener.ErrorCode.DISK_FULL, 667, 488, TbsListener.ErrorCode.STATIC_TBS_INSTALL_MAKE_SYMBOLIC_LINK_ERR, 672, 576, 540, 316, 486, 721, TbsListener.ErrorCode.STATIC_TBS_INSTALL_SMART_INSTALL_TBS_FINAL_EXCEPTION, 46, 656, 447, 171, 616, 464, 190, 531, 297, TbsListener.ErrorCode.THROWABLE_INITTESRUNTIMEENVIRONMENT, 762, TbsMediaPlayer.TbsMediaPlayerListener.MEDIA_INFO_HAVE_VIDEO_DATA, 533, 175, 134, 14, 381, 433, 717, 45, 111, 20, 596, 284, 736, 138, 646, TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_FINAL_REASON, 877, 669, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA, 919, 45, 780, TbsListener.ErrorCode.INFO_CAN_NOT_LOAD_X5, 164, 332, 899, 165, 726, 600, TbsListener.ErrorCode.THROWABLE_INITX5CORE, 498, 655, 357, TbsMediaPlayer.TbsMediaPlayerListener.MEDIA_INFO_HAVE_VIDEO_DATA, 768, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM, 849, 647, 63, TbsListener.ErrorCode.ERROR_NEW_EXTENSION_INSTANCE_FAILED, 863, 251, 366, VodPlayFragment.f8485n3, 282, 738, 675, TbsListener.ErrorCode.INFO_CAN_NOT_USE_X5_TBS_NOTAVAILABLE, 389, 244, 31, TbsListener.ErrorCode.THREAD_INIT_ERROR, TbsListener.ErrorCode.ERROR_UNMATCH_TBSCORE_VER, Optimizer.OPTIMIZATION_STANDARD}};

    private PDF417ErrorCorrection() {
    }

    public static String generateErrorCorrection(CharSequence charSequence, int i) {
        int errorCorrectionCodewordCount = getErrorCorrectionCodewordCount(i);
        char[] cArr = new char[errorCorrectionCodewordCount];
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = errorCorrectionCodewordCount - 1;
            int iCharAt = (charSequence.charAt(i2) + cArr[i3]) % PDF417Common.NUMBER_OF_CODEWORDS;
            while (i3 > 0) {
                cArr[i3] = (char) ((cArr[i3 - 1] + (929 - ((EC_COEFFICIENTS[i][i3] * iCharAt) % PDF417Common.NUMBER_OF_CODEWORDS))) % PDF417Common.NUMBER_OF_CODEWORDS);
                i3--;
            }
            cArr[0] = (char) ((929 - ((iCharAt * EC_COEFFICIENTS[i][0]) % PDF417Common.NUMBER_OF_CODEWORDS)) % PDF417Common.NUMBER_OF_CODEWORDS);
        }
        StringBuilder sb = new StringBuilder(errorCorrectionCodewordCount);
        for (int i4 = errorCorrectionCodewordCount - 1; i4 >= 0; i4--) {
            char c = cArr[i4];
            if (c != 0) {
                cArr[i4] = (char) (929 - c);
            }
            sb.append(cArr[i4]);
        }
        return sb.toString();
    }

    public static int getErrorCorrectionCodewordCount(int i) {
        if (i < 0 || i > 8) {
            throw new IllegalArgumentException("Error correction level must be between 0 and 8!");
        }
        return 1 << (i + 1);
    }

    public static int getRecommendedMinimumErrorCorrectionLevel(int i) throws WriterException {
        if (i <= 0) {
            throw new IllegalArgumentException("n must be > 0");
        }
        if (i <= 40) {
            return 2;
        }
        if (i <= 160) {
            return 3;
        }
        if (i <= 320) {
            return 4;
        }
        if (i <= 863) {
            return 5;
        }
        throw new WriterException("No recommendation possible");
    }
}
