package com.google.android.exoplayer2.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.afollestad.materialdialogs.BuildConfig;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.RenderersFactory;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.extractor.p006ts.PsExtractor;
import com.google.android.exoplayer2.extractor.p006ts.TsExtractor;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.squareup.picasso.NetworkRequestHandler;
import com.tencent.smtt.sdk.TbsListener;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.videolan.libvlc.util.VLCUtil;
import p000.AbstractC4717l6;
import p000.C0143C4;
import p000.C0305Ec;
import p000.C0321Es;
import p000.C0335F5;
import p000.C0428GZ;
import p000.C0748LZ;
import p000.C0786MA;
import p000.C0811MZ;
import p000.C0874NZ;
import p000.C0938OZ;
import p000.C1262Tc;
import p000.C1313UP;
import p000.C1393Vb;
import p000.C4508hw;
import p000.C4771ly;
import p000.C4905nw;
import p000.C4951of;
import p000.C5192pf;
import p000.C5312rZ;
import p000.C5948e10;
import p000.C5954f00;

/* JADX INFO: loaded from: classes.dex */
public final class Util {
    private static final int[] CRC32_BYTES_MSBF;
    private static final int[] CRC8_BYTES_MSBF;
    public static final String DEVICE;
    public static final String DEVICE_DEBUG_INFO;
    public static final byte[] EMPTY_BYTE_ARRAY;
    private static final Pattern ESCAPED_CHARACTER_PATTERN;
    private static final String ISM_DASH_FORMAT_EXTENSION = "format=mpd-time-csf";
    private static final String ISM_HLS_FORMAT_EXTENSION = "format=m3u8-aapl";
    private static final Pattern ISM_URL_PATTERN;
    public static final String MANUFACTURER;
    public static final String MODEL;
    public static final int SDK_INT;
    private static final String TAG = "Util";
    private static final Pattern XS_DATE_TIME_PATTERN;
    private static final Pattern XS_DURATION_PATTERN;
    private static final String[] additionalIsoLanguageReplacements;
    private static final String[] isoGrandfatheredTagReplacements;

    @Nullable
    private static HashMap<String, String> languageTagReplacementMap;

    static {
        int i = Build.VERSION.SDK_INT;
        SDK_INT = i;
        String str = Build.DEVICE;
        DEVICE = str;
        String str2 = Build.MANUFACTURER;
        MANUFACTURER = str2;
        String str3 = Build.MODEL;
        MODEL = str3;
        DEVICE_DEBUG_INFO = str + ", " + str3 + ", " + str2 + ", " + i;
        EMPTY_BYTE_ARRAY = new byte[0];
        XS_DATE_TIME_PATTERN = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        XS_DURATION_PATTERN = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        ESCAPED_CHARACTER_PATTERN = Pattern.compile("%([A-Fa-f0-9]{2})");
        ISM_URL_PATTERN = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        additionalIsoLanguageReplacements = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        isoGrandfatheredTagReplacements = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        CRC32_BYTES_MSBF = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        CRC8_BYTES_MSBF = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW, 119, 126, TbsListener.ErrorCode.THREAD_INIT_ERROR, 108, TbsListener.ErrorCode.UNKNOWN_ERROR, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, TbsListener.ErrorCode.RENAME_FAIL, TbsListener.ErrorCode.TPATCH_FAIL, 233, 252, 251, TbsListener.ErrorCode.TPATCH_ENABLE_EXCEPTION, 245, TbsListener.ErrorCode.INCR_UPDATE_ERROR, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM, TbsListener.ErrorCode.COPY_TMPDIR_ERROR, TbsListener.ErrorCode.DEXOPT_EXCEPTION, 196, 195, 202, 205, 144, TbsListener.ErrorCode.NEEDDOWNLOAD_STATIC_INSTALLING, 158, TbsListener.ErrorCode.STARTDOWNLOAD_LOCKED_IO_FAILED, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, 130, 133, 168, 175, 166, 161, 180, BuildConfig.f10535e, 186, PsExtractor.PRIVATE_STREAM_1, 199, PsExtractor.AUDIO_STREAM, 201, 206, TbsListener.ErrorCode.RENAME_EXCEPTION, TbsListener.ErrorCode.COPY_INSTALL_SUCCESS, TbsListener.ErrorCode.COPY_SRCDIR_ERROR, 210, 255, 248, TbsListener.ErrorCode.TPATCH_BACKUP_NOT_VALID, 246, TbsListener.ErrorCode.HOST_CONTEXT_IS_NULL, TbsListener.ErrorCode.INCR_ERROR_DETAIL, TbsListener.ErrorCode.DECOUPLE_TPATCH_INSTALL_SUCCESS, TbsListener.ErrorCode.DECOUPLE_INCURUPDATE_SUCCESS, VLCUtil.f17717i, 176, 185, 190, 171, TsExtractor.TS_STREAM_TYPE_AC4, 165, 162, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, 136, 129, 134, CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA, 157, TbsListener.ErrorCode.STARTDOWNLOAD_NEEDDOWNLOAD_KEY_ERROR, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, TbsListener.ErrorCode.DOWNLOAD_THROWABLE, 122, 137, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, 135, 128, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA, TbsListener.ErrorCode.NO_NEED_STARTDOWNLOAD, 156, TbsListener.ErrorCode.NONEEDDOWNLOAD_OTHER_PROCESS_DOWNLOADING, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, TbsListener.ErrorCode.INSTALL_FROM_UNZIP, TbsListener.ErrorCode.DEXOAT_EXCEPTION, TbsListener.ErrorCode.DECOUPLE_INCURUPDATE_FAIL, TbsListener.ErrorCode.TPATCH_INSTALL_SUCCESS, 193, 198, TbsListener.ErrorCode.UNZIP_OTHER_ERROR, 200, TbsListener.ErrorCode.INCRUPDATE_INSTALL_SUCCESS, 218, TbsListener.ErrorCode.EXCEED_COPY_RETRY_NUM, 212, TbsListener.ErrorCode.DISK_FULL, 110, 103, 96, 117, TbsListener.ErrorCode.DOWNLOAD_NOT_WIFI_ERROR, TbsListener.ErrorCode.DOWNLOAD_RETRYTIMES302_EXCEED, TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, TbsListener.ErrorCode.DOWNLOAD_FILE_CONTENTLENGTH_NOT_MATCH, 120, 127, TbsListener.ErrorCode.FILE_DELETED, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, TbsListener.ErrorCode.APP_SET_MIN_CORE_VER, 181, 188, 187, 150, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA, TbsListener.ErrorCode.NEEDDOWNLOAD_TMPCORE_PREPARING, 159, 138, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA, TbsListener.ErrorCode.DOWNLOAD_CDN_URL_IS_NULL, TbsListener.ErrorCode.DOWNLOAD_USER_CANCEL, TbsListener.ErrorCode.UNLZMA_FAIURE, 217, TbsListener.ErrorCode.EXCEED_DEXOPT_RETRY_NUM, TbsListener.ErrorCode.COPY_EXCEPTION, 194, 197, 204, 203, TbsListener.ErrorCode.RENAME_SUCCESS, 225, TbsListener.ErrorCode.INSTALL_SUCCESS_AND_RELEASE_LOCK, TbsListener.ErrorCode.DECOUPLE_TPATCH_FAIL, 250, 253, 244, 243};
    }

    private Util() {
    }

    public static long addWithOverflowDefault(long j, long j2, long j3) {
        long j4 = j + j2;
        return ((j ^ j4) & (j2 ^ j4)) < 0 ? j3 : j4;
    }

    public static boolean areEqual(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static <T extends Comparable<? super T>> int binarySearchCeil(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i;
        int i2;
        int iBinarySearch = Collections.binarySearch(list, t);
        if (iBinarySearch < 0) {
            i2 = iBinarySearch ^ (-1);
        } else {
            int size = list.size();
            while (true) {
                i = iBinarySearch + 1;
                if (i >= size || list.get(i).compareTo(t) != 0) {
                    break;
                }
                iBinarySearch = i;
            }
            i2 = z ? iBinarySearch : i;
        }
        return z2 ? Math.min(list.size() - 1, i2) : i2;
    }

    public static <T extends Comparable<? super T>> int binarySearchFloor(List<? extends Comparable<? super T>> list, T t, boolean z, boolean z2) {
        int i;
        int i2;
        int iBinarySearch = Collections.binarySearch(list, t);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i = iBinarySearch - 1;
                if (i < 0 || list.get(i).compareTo(t) != 0) {
                    break;
                }
                iBinarySearch = i;
            }
            i2 = z ? iBinarySearch : i;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    @EnsuresNonNull({"#1"})
    public static <T> T castNonNull(@Nullable T t) {
        return t;
    }

    @EnsuresNonNull({"#1"})
    public static <T> T[] castNonNullTypeArray(T[] tArr) {
        return tArr;
    }

    public static int ceilDivide(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    @TargetApi(24)
    public static boolean checkCleartextTrafficPermitted(Uri... uriArr) {
        if (SDK_INT < 24) {
            return true;
        }
        for (Uri uri : uriArr) {
            if (NetworkRequestHandler.f12458d.equals(uri.getScheme()) && !C0811MZ.m3769a(C0748LZ.m3543a(), (String) Assertions.checkNotNull(uri.getHost()))) {
                return false;
            }
        }
        return true;
    }

    public static void closeQuietly(@Nullable DataSource dataSource) {
        if (dataSource != null) {
            try {
                dataSource.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int compareLong(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static float constrainValue(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    public static boolean contains(Object[] objArr, @Nullable Object obj) {
        for (Object obj2 : objArr) {
            if (areEqual(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static int crc32(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = CRC32_BYTES_MSBF[((i3 >>> 24) ^ (bArr[i] & 255)) & 255] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    public static int crc8(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = CRC8_BYTES_MSBF[i3 ^ (bArr[i] & 255)];
            i++;
        }
        return i3;
    }

    public static Handler createHandler(Handler.Callback callback) {
        return createHandler(getLooper(), callback);
    }

    private static HashMap<String, String> createIsoLanguageReplacementMap() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> map = new HashMap<>(iSOLanguages.length + additionalIsoLanguageReplacements.length);
        int i = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = additionalIsoLanguageReplacements;
            if (i >= strArr.length) {
                return map;
            }
            map.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    public static File createTempDirectory(Context context, String str) throws IOException {
        File fileCreateTempFile = createTempFile(context, str);
        fileCreateTempFile.delete();
        fileCreateTempFile.mkdir();
        return fileCreateTempFile;
    }

    public static File createTempFile(Context context, String str) throws IOException {
        return File.createTempFile(str, null, context.getCacheDir());
    }

    public static String escapeFileName(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (shouldEscapeCharacter(str.charAt(i3))) {
                i2++;
            }
        }
        if (i2 == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder((i2 * 2) + length);
        while (i2 > 0) {
            int i4 = i + 1;
            char cCharAt = str.charAt(i);
            if (shouldEscapeCharacter(cCharAt)) {
                sb.append('%');
                sb.append(Integer.toHexString(cCharAt));
                i2--;
            } else {
                sb.append(cCharAt);
            }
            i = i4;
        }
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        return sb.toString();
    }

    public static Uri fixSmoothStreamingIsmManifestUri(Uri uri) {
        String lowerInvariant = toLowerInvariant(uri.getPath());
        if (lowerInvariant == null) {
            return uri;
        }
        Matcher matcher = ISM_URL_PATTERN.matcher(lowerInvariant);
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    public static String formatInvariant(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String fromUtf8Bytes(byte[] bArr) {
        return new String(bArr, Charset.forName("UTF-8"));
    }

    public static int getAudioContentTypeForStreamType(int i) {
        if (i != 0) {
            return (i == 1 || i == 2 || i == 4 || i == 5 || i == 8) ? 4 : 2;
        }
        return 1;
    }

    public static int getAudioTrackChannelConfig(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return TbsListener.ErrorCode.COPY_INSTALL_SUCCESS;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i2 = SDK_INT;
                return (i2 < 23 && i2 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    public static int getAudioUsageForStreamType(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 13;
        }
        if (i == 2) {
            return 6;
        }
        int i2 = 4;
        if (i != 4) {
            i2 = 5;
            if (i != 5) {
                return i != 8 ? 1 : 3;
            }
        }
        return i2;
    }

    public static byte[] getBytesFromHexString(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (Character.digit(str.charAt(i2 + 1), 16) + (Character.digit(str.charAt(i2), 16) << 4));
        }
        return bArr;
    }

    @Nullable
    public static String getCodecsOfType(@Nullable String str, int i) {
        String[] strArrSplitCodecs = splitCodecs(str);
        if (strArrSplitCodecs.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrSplitCodecs) {
            if (i == MimeTypes.getTrackTypeOfCodec(str2)) {
                if (sb.length() > 0) {
                    sb.append(C1262Tc.f3278g);
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static String getCommaDelimitedSimpleClassNames(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            sb.append(objArr[i].getClass().getSimpleName());
            if (i < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static String getCountryCode(@Nullable Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return toUpperInvariant(networkCountryIso);
            }
        }
        return toUpperInvariant(Locale.getDefault().getCountry());
    }

    public static Point getCurrentDisplayModeSize(Context context) {
        return getCurrentDisplayModeSize(context, ((WindowManager) context.getSystemService("window")).getDefaultDisplay());
    }

    private static void getDisplaySizeV16(Display display, Point point) {
        display.getSize(point);
    }

    @TargetApi(17)
    private static void getDisplaySizeV17(Display display, Point point) {
        display.getRealSize(point);
    }

    @TargetApi(23)
    private static void getDisplaySizeV23(Display display, Point point) {
        Display.Mode modeM4311a = C0938OZ.m4311a(display);
        point.x = C4951of.m22760a(modeM4311a);
        point.y = C5192pf.m27531a(modeM4311a);
    }

    @Nullable
    public static UUID getDrmUuid(String str) {
        String lowerInvariant = toLowerInvariant(str);
        lowerInvariant.getClass();
        switch (lowerInvariant) {
            case "playready":
                return C3219C.PLAYREADY_UUID;
            case "widevine":
                return C3219C.WIDEVINE_UUID;
            case "clearkey":
                return C3219C.CLEARKEY_UUID;
            default:
                try {
                    return UUID.fromString(str);
                } catch (RuntimeException unused) {
                    return null;
                }
        }
    }

    public static int getIntegerCodeForString(String str) {
        int length = str.length();
        Assertions.checkArgument(length <= 4);
        int iCharAt = 0;
        for (int i = 0; i < length; i++) {
            iCharAt = (iCharAt << 8) | str.charAt(i);
        }
        return iCharAt;
    }

    public static String getLocaleLanguageTag(Locale locale) {
        return SDK_INT >= 21 ? getLocaleLanguageTagV21(locale) : locale.toString();
    }

    @TargetApi(21)
    private static String getLocaleLanguageTagV21(Locale locale) {
        return C4771ly.m22020a(locale);
    }

    public static Looper getLooper() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static long getMediaDurationForPlayoutDuration(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        double d = j;
        double d2 = f;
        Double.isNaN(d);
        Double.isNaN(d2);
        return Math.round(d * d2);
    }

    private static int getMobileNetworkType(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
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
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return 9;
        }
    }

    public static int getNetworkType(Context context) {
        ConnectivityManager connectivityManager;
        int i = 0;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return getMobileNetworkType(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i;
    }

    public static int getPcmEncoding(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i == 24) {
            return 536870912;
        }
        if (i != 32) {
            return 0;
        }
        return C3219C.ENCODING_PCM_32BIT;
    }

    public static int getPcmFrameSize(int i, int i2) {
        if (i != 2) {
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                if (i != 268435456) {
                    if (i == 536870912) {
                        return i2 * 3;
                    }
                    if (i != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i2 * 4;
        }
        return i2 * 2;
    }

    public static long getPlayoutDurationForMediaDuration(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        double d = j;
        double d2 = f;
        Double.isNaN(d);
        Double.isNaN(d2);
        return Math.round(d / d2);
    }

    public static RendererCapabilities[] getRendererCapabilities(RenderersFactory renderersFactory) {
        Renderer[] rendererArrCreateRenderers = renderersFactory.createRenderers(new Handler(), new VideoRendererEventListener() { // from class: com.google.android.exoplayer2.util.Util.1
            @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
            public /* synthetic */ void onDroppedFrames(int i, long j) {
                C5948e10.m20010a(this, i, j);
            }

            @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
            public /* synthetic */ void onRenderedFirstFrame(Surface surface) {
                C5948e10.m20011b(this, surface);
            }

            @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
            public /* synthetic */ void onVideoDecoderInitialized(String str, long j, long j2) {
                C5948e10.m20012c(this, str, j, j2);
            }

            @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
            public /* synthetic */ void onVideoDisabled(DecoderCounters decoderCounters) {
                C5948e10.m20013d(this, decoderCounters);
            }

            @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
            public /* synthetic */ void onVideoEnabled(DecoderCounters decoderCounters) {
                C5948e10.m20014e(this, decoderCounters);
            }

            @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
            public /* synthetic */ void onVideoInputFormatChanged(Format format) {
                C5948e10.m20015f(this, format);
            }

            @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
            public /* synthetic */ void onVideoSizeChanged(int i, int i2, int i3, float f) {
                C5948e10.m20016g(this, i, i2, i3, f);
            }
        }, new AudioRendererEventListener() { // from class: com.google.android.exoplayer2.util.Util.2
            @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
            public /* synthetic */ void onAudioDecoderInitialized(String str, long j, long j2) {
                C0335F5.m1774a(this, str, j, j2);
            }

            @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
            public /* synthetic */ void onAudioDisabled(DecoderCounters decoderCounters) {
                C0335F5.m1775b(this, decoderCounters);
            }

            @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
            public /* synthetic */ void onAudioEnabled(DecoderCounters decoderCounters) {
                C0335F5.m1776c(this, decoderCounters);
            }

            @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
            public /* synthetic */ void onAudioInputFormatChanged(Format format) {
                C0335F5.m1777d(this, format);
            }

            @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
            public /* synthetic */ void onAudioSessionId(int i) {
                C0335F5.m1778e(this, i);
            }

            @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
            public /* synthetic */ void onAudioSinkUnderrun(int i, long j, long j2) {
                C0335F5.m1779f(this, i, j, j2);
            }
        }, new TextOutput() { // from class: PZ
            /* JADX WARN: Invalid debug info offset */
            @Override // com.google.android.exoplayer2.text.TextOutput
            public final void onCues(List list) {
            }
        }, new MetadataOutput() { // from class: QZ
            /* JADX WARN: Invalid debug info offset */
            @Override // com.google.android.exoplayer2.metadata.MetadataOutput
            public final void onMetadata(Metadata metadata) {
            }
        }, null);
        RendererCapabilities[] rendererCapabilitiesArr = new RendererCapabilities[rendererArrCreateRenderers.length];
        for (int i = 0; i < rendererArrCreateRenderers.length; i++) {
            rendererCapabilitiesArr[i] = rendererArrCreateRenderers[i].getCapabilities();
        }
        return rendererCapabilitiesArr;
    }

    public static int getStreamTypeForAudioUsage(int i) {
        if (i == 13) {
            return 1;
        }
        switch (i) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static String getStringForTime(StringBuilder sb, Formatter formatter, long j) {
        if (j == C3219C.TIME_UNSET) {
            j = 0;
        }
        long j2 = (j + 500) / 1000;
        long j3 = j2 % 60;
        long j4 = (j2 / 60) % 60;
        long j5 = j2 / 3600;
        sb.setLength(0);
        return (j5 > 0 ? formatter.format("%d:%02d:%02d", Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)) : formatter.format("%02d:%02d", Long.valueOf(j4), Long.valueOf(j3))).toString();
    }

    public static String[] getSystemLanguageCodes() {
        String[] systemLocales = getSystemLocales();
        for (int i = 0; i < systemLocales.length; i++) {
            systemLocales[i] = normalizeLanguageCode(systemLocales[i]);
        }
        return systemLocales;
    }

    private static String[] getSystemLocales() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        return SDK_INT >= 24 ? getSystemLocalesV24(configuration) : new String[]{getLocaleLanguageTag(configuration.locale)};
    }

    @TargetApi(24)
    private static String[] getSystemLocalesV24(Configuration configuration) {
        return split(C4508hw.m21177a(C4905nw.m22540a(configuration)), C1262Tc.f3278g);
    }

    @Nullable
    private static String getSystemProperty(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            Log.m17583e(TAG, "Failed to read system property " + str, e);
            return null;
        }
    }

    public static String getTrackTypeString(int i) {
        switch (i) {
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return TtmlNode.TAG_METADATA;
            case 5:
                return "camera motion";
            case 6:
                return "none";
            default:
                return i >= 10000 ? C5954f00.m20225a("custom (", i, C1313UP.f3459l) : AbstractC4717l6.f14991e;
        }
    }

    public static String getUserAgent(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = AbstractC4717l6.f14991e;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append(" (Linux;Android ");
        return C0786MA.m3668a(sb, Build.VERSION.RELEASE, ") ExoPlayerLib/2.11.8");
    }

    public static byte[] getUtf8Bytes(String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    public static int inferContentType(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return 3;
        }
        return inferContentType(path);
    }

    public static boolean inflate(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, @Nullable Inflater inflater) {
        if (parsableByteArray.bytesLeft() <= 0) {
            return false;
        }
        byte[] bArrCopyOf = parsableByteArray2.data;
        if (bArrCopyOf.length < parsableByteArray.bytesLeft()) {
            bArrCopyOf = new byte[parsableByteArray.bytesLeft() * 2];
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(parsableByteArray.data, parsableByteArray.getPosition(), parsableByteArray.bytesLeft());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(bArrCopyOf, iInflate, bArrCopyOf.length - iInflate);
                if (inflater.finished()) {
                    parsableByteArray2.reset(bArrCopyOf, iInflate);
                    inflater.reset();
                    return true;
                }
                if (!inflater.needsDictionary() && !inflater.needsInput()) {
                    if (iInflate == bArrCopyOf.length) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
                    }
                }
                inflater.reset();
                return false;
            } catch (DataFormatException unused) {
                inflater.reset();
                return false;
            } catch (Throwable th) {
                inflater.reset();
                throw th;
            }
        }
    }

    public static boolean isEncodingHighResolutionPcm(int i) {
        return i == 536870912 || i == 805306368 || i == 4;
    }

    public static boolean isEncodingLinearPcm(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4;
    }

    public static boolean isLinebreak(int i) {
        return i == 10 || i == 13;
    }

    public static boolean isLocalFileUri(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    public static boolean isTv(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getRendererCapabilities$1(List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getRendererCapabilities$2(Metadata metadata) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$newSingleThreadExecutor$0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static int linearSearch(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    private static String maybeReplaceGrandfatheredLanguageTags(String str) {
        int i = 0;
        while (true) {
            String[] strArr = isoGrandfatheredTagReplacements;
            if (i >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i])) {
                return strArr[i + 1] + str.substring(strArr[i].length());
            }
            i += 2;
        }
    }

    @TargetApi(23)
    public static boolean maybeRequestReadExternalStoragePermission(Activity activity, Uri... uriArr) {
        if (SDK_INT < 23) {
            return false;
        }
        for (Uri uri : uriArr) {
            if (isLocalFileUri(uri)) {
                if (C0874NZ.m4016a(activity, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
                    break;
                }
                C0143C4.m902a(activity, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 0);
                return true;
            }
        }
        return false;
    }

    public static ExecutorService newSingleThreadExecutor(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory(str) { // from class: RZ

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f2965a;

            /* JADX WARN: Invalid debug info offset */
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return null;
            }
        });
    }

    public static String normalizeLanguageCode(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !C3219C.LANGUAGE_UNDETERMINED.equals(strReplace)) {
            str = strReplace;
        }
        String lowerInvariant = toLowerInvariant(str);
        String str2 = splitAtFirst(lowerInvariant, "-")[0];
        if (languageTagReplacementMap == null) {
            languageTagReplacementMap = createIsoLanguageReplacementMap();
        }
        String str3 = languageTagReplacementMap.get(str2);
        if (str3 != null) {
            StringBuilder sbM1657a = C0305Ec.m1657a(str3);
            sbM1657a.append(lowerInvariant.substring(str2.length()));
            lowerInvariant = sbM1657a.toString();
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? maybeReplaceGrandfatheredLanguageTags(lowerInvariant) : lowerInvariant;
    }

    public static <T> T[] nullSafeArrayAppend(T[] tArr, T t) {
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length + 1);
        objArrCopyOf[tArr.length] = t;
        return (T[]) castNonNullTypeArray(objArrCopyOf);
    }

    public static <T> T[] nullSafeArrayConcatenation(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    public static <T> T[] nullSafeArrayCopy(T[] tArr, int i) {
        Assertions.checkArgument(i <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i);
    }

    public static <T> T[] nullSafeArrayCopyOfRange(T[] tArr, int i, int i2) {
        Assertions.checkArgument(i >= 0);
        Assertions.checkArgument(i2 <= tArr.length);
        return (T[]) Arrays.copyOfRange(tArr, i, i2);
    }

    public static long parseXsDateTime(String str) throws ParserException {
        Matcher matcher = XS_DATE_TIME_PATTERN.matcher(str);
        if (!matcher.matches()) {
            throw new ParserException(C5312rZ.m27869a("Invalid date/time format: ", str));
        }
        int i = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
            if ("-".equals(matcher.group(11))) {
                i *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i != 0 ? timeInMillis - ((long) (i * C0428GZ.f911c)) : timeInMillis;
    }

    public static long parseXsDuration(String str) {
        Matcher matcher = XS_DURATION_PATTERN.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d2 = d + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d3 = d2 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d4 = d3 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d5 = d4 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j = (long) ((d5 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return zIsEmpty ? -j : j;
    }

    public static boolean readBoolean(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void recursiveDelete(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                recursiveDelete(file2);
            }
        }
        file.delete();
    }

    public static <T> void removeRange(List<T> list, int i, int i2) {
        if (i < 0 || i2 > list.size() || i > i2) {
            throw new IllegalArgumentException();
        }
        if (i != i2) {
            list.subList(i, i2).clear();
        }
    }

    public static long resolveSeekPositionUs(long j, SeekParameters seekParameters, long j2, long j3) {
        if (SeekParameters.EXACT.equals(seekParameters)) {
            return j;
        }
        long jSubtractWithOverflowDefault = subtractWithOverflowDefault(j, seekParameters.toleranceBeforeUs, Long.MIN_VALUE);
        long jAddWithOverflowDefault = addWithOverflowDefault(j, seekParameters.toleranceAfterUs, Long.MAX_VALUE);
        boolean z = false;
        boolean z2 = jSubtractWithOverflowDefault <= j2 && j2 <= jAddWithOverflowDefault;
        if (jSubtractWithOverflowDefault <= j3 && j3 <= jAddWithOverflowDefault) {
            z = true;
        }
        if (z2 && z) {
            return Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3;
        }
        if (z2) {
            return j2;
        }
        return z ? j3 : jSubtractWithOverflowDefault;
    }

    public static long scaleLargeTimestamp(long j, long j2, long j3) {
        if (j3 >= j2 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return (j2 / j3) * j;
        }
        double d = j2;
        double d2 = j3;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = j;
        Double.isNaN(d3);
        return (long) (d3 * (d / d2));
    }

    public static long[] scaleLargeTimestamps(List<Long> list, long j, long j2) {
        int size = list.size();
        long[] jArr = new long[size];
        int i = 0;
        if (j2 >= j && j2 % j == 0) {
            long j3 = j2 / j;
            while (i < size) {
                jArr[i] = list.get(i).longValue() / j3;
                i++;
            }
        } else if (j2 >= j || j % j2 != 0) {
            double d = j;
            double d2 = j2;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            while (i < size) {
                double dLongValue = list.get(i).longValue();
                Double.isNaN(dLongValue);
                jArr[i] = (long) (dLongValue * d3);
                i++;
            }
        } else {
            long j4 = j / j2;
            while (i < size) {
                jArr[i] = list.get(i).longValue() * j4;
                i++;
            }
        }
        return jArr;
    }

    public static void scaleLargeTimestampsInPlace(long[] jArr, long j, long j2) {
        int i = 0;
        if (j2 >= j && j2 % j == 0) {
            long j3 = j2 / j;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j3;
                i++;
            }
            return;
        }
        if (j2 < j && j % j2 == 0) {
            long j4 = j / j2;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j4;
                i++;
            }
            return;
        }
        double d = j;
        double d2 = j2;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        while (i < jArr.length) {
            double d4 = jArr[i];
            Double.isNaN(d4);
            jArr[i] = (long) (d4 * d3);
            i++;
        }
    }

    private static boolean shouldEscapeCharacter(char c) {
        return c == '\"' || c == '%' || c == '*' || c == '/' || c == ':' || c == '<' || c == '\\' || c == '|' || c == '>' || c == '?';
    }

    public static void sneakyThrow(Throwable th) throws Throwable {
        sneakyThrowInternal(th);
    }

    private static <T extends Throwable> void sneakyThrowInternal(Throwable th) throws Throwable {
        throw th;
    }

    public static String[] split(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] splitAtFirst(String str, String str2) {
        return str.split(str2, 2);
    }

    public static String[] splitCodecs(@Nullable String str) {
        return TextUtils.isEmpty(str) ? new String[0] : split(str.trim(), "(\\s*,\\s*)");
    }

    @Nullable
    public static ComponentName startForegroundService(Context context, Intent intent) {
        return SDK_INT >= 26 ? C1393Vb.m6596a(context, intent) : context.startService(intent);
    }

    public static long subtractWithOverflowDefault(long j, long j2, long j3) {
        long j4 = j - j2;
        return ((j ^ j4) & (j2 ^ j)) < 0 ? j3 : j4;
    }

    public static int[] toArray(List<Integer> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = list.get(i).intValue();
        }
        return iArr;
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static long toLong(int i, int i2) {
        return toUnsignedLong(i2) | (toUnsignedLong(i) << 32);
    }

    public static String toLowerInvariant(String str) {
        return str == null ? str : str.toLowerCase(Locale.US);
    }

    public static long toUnsignedLong(int i) {
        return ((long) i) & C0321Es.f727k;
    }

    public static String toUpperInvariant(String str) {
        return str == null ? str : str.toUpperCase(Locale.US);
    }

    @Nullable
    public static String unescapeFileName(String str) {
        int length = str.length();
        int iEnd = 0;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) == '%') {
                i++;
            }
        }
        if (i == 0) {
            return str;
        }
        int i3 = length - (i * 2);
        StringBuilder sb = new StringBuilder(i3);
        Matcher matcher = ESCAPED_CHARACTER_PATTERN.matcher(str);
        while (i > 0 && matcher.find()) {
            char c = (char) Integer.parseInt(matcher.group(1), 16);
            sb.append((CharSequence) str, iEnd, matcher.start());
            sb.append(c);
            iEnd = matcher.end();
            i--;
        }
        if (iEnd < length) {
            sb.append((CharSequence) str, iEnd, length);
        }
        if (sb.length() != i3) {
            return null;
        }
        return sb.toString();
    }

    public static void writeBoolean(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static int binarySearchCeil(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            i3 = iBinarySearch ^ (-1);
        } else {
            while (true) {
                i2 = iBinarySearch + 1;
                if (i2 >= iArr.length || iArr[i2] != i) {
                    break;
                }
                iBinarySearch = i2;
            }
            i3 = z ? iBinarySearch : i2;
        }
        return z2 ? Math.min(iArr.length - 1, i3) : i3;
    }

    public static int binarySearchFloor(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            i3 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i2 = iBinarySearch - 1;
                if (i2 < 0 || iArr[i2] != i) {
                    break;
                }
                iBinarySearch = i2;
            }
            i3 = z ? iBinarySearch : i2;
        }
        return z2 ? Math.max(0, i3) : i3;
    }

    public static long ceilDivide(long j, long j2) {
        return ((j + j2) - 1) / j2;
    }

    public static void closeQuietly(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int constrainValue(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    public static Handler createHandler(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static String fromUtf8Bytes(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, Charset.forName("UTF-8"));
    }

    public static Point getCurrentDisplayModeSize(Context context, Display display) {
        int i = SDK_INT;
        if (i <= 29 && display.getDisplayId() == 0 && isTv(context)) {
            if ("Sony".equals(MANUFACTURER) && MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
            String systemProperty = getSystemProperty(i < 28 ? "sys.display-size" : "vendor.display-size");
            if (!TextUtils.isEmpty(systemProperty)) {
                try {
                    String[] strArrSplit = split(systemProperty.trim(), "x");
                    if (strArrSplit.length == 2) {
                        int i2 = Integer.parseInt(strArrSplit[0]);
                        int i3 = Integer.parseInt(strArrSplit[1]);
                        if (i2 > 0 && i3 > 0) {
                            return new Point(i2, i3);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                Log.m17582e(TAG, "Invalid display size: " + systemProperty);
            }
        }
        Point point = new Point();
        int i4 = SDK_INT;
        if (i4 >= 23) {
            getDisplaySizeV23(display, point);
        } else if (i4 >= 17) {
            getDisplaySizeV17(display, point);
        } else {
            getDisplaySizeV16(display, point);
        }
        return point;
    }

    public static int inferContentType(Uri uri, @Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return inferContentType(uri);
        }
        return inferContentType("." + str);
    }

    public static int linearSearch(long[] jArr, long j) {
        for (int i = 0; i < jArr.length; i++) {
            if (jArr[i] == j) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearchCeil(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int i2;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i2 = iBinarySearch ^ (-1);
        } else {
            while (true) {
                i = iBinarySearch + 1;
                if (i >= jArr.length || jArr[i] != j) {
                    break;
                }
                iBinarySearch = i;
            }
            i2 = z ? iBinarySearch : i;
        }
        return z2 ? Math.min(jArr.length - 1, i2) : i2;
    }

    public static int binarySearchFloor(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int i2;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i = iBinarySearch - 1;
                if (i < 0 || jArr[i] != j) {
                    break;
                }
                iBinarySearch = i;
            }
            i2 = z ? iBinarySearch : i;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    public static long constrainValue(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    public static int inferContentType(String str) {
        String lowerInvariant = toLowerInvariant(str);
        if (lowerInvariant.endsWith(".mpd")) {
            return 0;
        }
        if (lowerInvariant.endsWith(".m3u8")) {
            return 2;
        }
        Matcher matcher = ISM_URL_PATTERN.matcher(lowerInvariant);
        if (!matcher.matches()) {
            return 3;
        }
        String strGroup = matcher.group(2);
        if (strGroup == null) {
            return 1;
        }
        if (strGroup.contains(ISM_DASH_FORMAT_EXTENSION)) {
            return 0;
        }
        return strGroup.contains(ISM_HLS_FORMAT_EXTENSION) ? 2 : 1;
    }
}
