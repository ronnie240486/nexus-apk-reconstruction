package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p000.C1262Tc;
import p000.C5532ud;

/* JADX INFO: loaded from: classes2.dex */
public final class HlsPlaylistParser implements ParsingLoadable.Parser<HlsPlaylist> {
    private static final String ATTR_CLOSED_CAPTIONS_NONE = "CLOSED-CAPTIONS=NONE";
    private static final String BOOLEAN_FALSE = "NO";
    private static final String BOOLEAN_TRUE = "YES";
    private static final String KEYFORMAT_IDENTITY = "identity";
    private static final String KEYFORMAT_PLAYREADY = "com.microsoft.playready";
    private static final String KEYFORMAT_WIDEVINE_PSSH_BINARY = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed";
    private static final String KEYFORMAT_WIDEVINE_PSSH_JSON = "com.widevine";
    private static final String METHOD_AES_128 = "AES-128";
    private static final String METHOD_NONE = "NONE";
    private static final String METHOD_SAMPLE_AES = "SAMPLE-AES";
    private static final String METHOD_SAMPLE_AES_CENC = "SAMPLE-AES-CENC";
    private static final String METHOD_SAMPLE_AES_CTR = "SAMPLE-AES-CTR";
    private static final String PLAYLIST_HEADER = "#EXTM3U";
    private static final String TAG_BYTERANGE = "#EXT-X-BYTERANGE";
    private static final String TAG_DEFINE = "#EXT-X-DEFINE";
    private static final String TAG_DISCONTINUITY = "#EXT-X-DISCONTINUITY";
    private static final String TAG_DISCONTINUITY_SEQUENCE = "#EXT-X-DISCONTINUITY-SEQUENCE";
    private static final String TAG_ENDLIST = "#EXT-X-ENDLIST";
    private static final String TAG_GAP = "#EXT-X-GAP";
    private static final String TAG_INDEPENDENT_SEGMENTS = "#EXT-X-INDEPENDENT-SEGMENTS";
    private static final String TAG_INIT_SEGMENT = "#EXT-X-MAP";
    private static final String TAG_KEY = "#EXT-X-KEY";
    private static final String TAG_MEDIA = "#EXT-X-MEDIA";
    private static final String TAG_MEDIA_DURATION = "#EXTINF";
    private static final String TAG_MEDIA_SEQUENCE = "#EXT-X-MEDIA-SEQUENCE";
    private static final String TAG_PLAYLIST_TYPE = "#EXT-X-PLAYLIST-TYPE";
    private static final String TAG_PREFIX = "#EXT";
    private static final String TAG_PROGRAM_DATE_TIME = "#EXT-X-PROGRAM-DATE-TIME";
    private static final String TAG_SESSION_KEY = "#EXT-X-SESSION-KEY";
    private static final String TAG_START = "#EXT-X-START";
    private static final String TAG_STREAM_INF = "#EXT-X-STREAM-INF";
    private static final String TAG_TARGET_DURATION = "#EXT-X-TARGETDURATION";
    private static final String TAG_VERSION = "#EXT-X-VERSION";
    private static final String TYPE_AUDIO = "AUDIO";
    private static final String TYPE_CLOSED_CAPTIONS = "CLOSED-CAPTIONS";
    private static final String TYPE_SUBTITLES = "SUBTITLES";
    private static final String TYPE_VIDEO = "VIDEO";
    private final HlsMasterPlaylist masterPlaylist;
    private static final Pattern REGEX_AVERAGE_BANDWIDTH = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_VIDEO = Pattern.compile("VIDEO=\"(.+?)\"");
    private static final Pattern REGEX_AUDIO = Pattern.compile("AUDIO=\"(.+?)\"");
    private static final Pattern REGEX_SUBTITLES = Pattern.compile("SUBTITLES=\"(.+?)\"");
    private static final Pattern REGEX_CLOSED_CAPTIONS = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    private static final Pattern REGEX_BANDWIDTH = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_CHANNELS = Pattern.compile("CHANNELS=\"(.+?)\"");
    private static final Pattern REGEX_CODECS = Pattern.compile("CODECS=\"(.+?)\"");
    private static final Pattern REGEX_RESOLUTION = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    private static final Pattern REGEX_FRAME_RATE = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    private static final Pattern REGEX_TARGET_DURATION = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    private static final Pattern REGEX_VERSION = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final Pattern REGEX_PLAYLIST_TYPE = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final Pattern REGEX_MEDIA_SEQUENCE = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern REGEX_MEDIA_DURATION = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern REGEX_MEDIA_TITLE = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern REGEX_TIME_OFFSET = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern REGEX_BYTERANGE = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern REGEX_ATTR_BYTERANGE = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern REGEX_METHOD = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern REGEX_KEYFORMAT = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern REGEX_KEYFORMATVERSIONS = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern REGEX_URI = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern REGEX_IV = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern REGEX_TYPE = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern REGEX_LANGUAGE = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern REGEX_NAME = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern REGEX_GROUP_ID = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern REGEX_CHARACTERISTICS = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    private static final Pattern REGEX_INSTREAM_ID = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern REGEX_AUTOSELECT = compileBooleanAttrPattern("AUTOSELECT");
    private static final Pattern REGEX_DEFAULT = compileBooleanAttrPattern("DEFAULT");
    private static final Pattern REGEX_FORCED = compileBooleanAttrPattern("FORCED");
    private static final Pattern REGEX_VALUE = Pattern.compile("VALUE=\"(.+?)\"");
    private static final Pattern REGEX_IMPORT = Pattern.compile("IMPORT=\"(.+?)\"");
    private static final Pattern REGEX_VARIABLE_REFERENCE = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* JADX INFO: loaded from: classes.dex */
    public static class LineIterator {
        private final Queue<String> extraLines;

        @Nullable
        private String next;
        private final BufferedReader reader;

        public LineIterator(Queue<String> queue, BufferedReader bufferedReader) {
            this.extraLines = queue;
            this.reader = bufferedReader;
        }

        @EnsuresNonNullIf(expression = {"next"}, result = true)
        public boolean hasNext() throws IOException {
            String strTrim;
            if (this.next != null) {
                return true;
            }
            if (!this.extraLines.isEmpty()) {
                this.next = (String) Assertions.checkNotNull(this.extraLines.poll());
                return true;
            }
            do {
                String line = this.reader.readLine();
                this.next = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.next = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        public String next() throws IOException {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.next;
            this.next = null;
            return str;
        }
    }

    public HlsPlaylistParser() {
        this(HlsMasterPlaylist.EMPTY);
    }

    private static boolean checkPlaylistHeader(BufferedReader bufferedReader) throws IOException {
        int i = bufferedReader.read();
        if (i == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            i = bufferedReader.read();
        }
        int iSkipIgnorableWhitespace = skipIgnorableWhitespace(bufferedReader, true, i);
        for (int i2 = 0; i2 < 7; i2++) {
            if (iSkipIgnorableWhitespace != PLAYLIST_HEADER.charAt(i2)) {
                return false;
            }
            iSkipIgnorableWhitespace = bufferedReader.read();
        }
        return Util.isLinebreak(skipIgnorableWhitespace(bufferedReader, false, iSkipIgnorableWhitespace));
    }

    private static Pattern compileBooleanAttrPattern(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    @Nullable
    private static HlsMasterPlaylist.Variant getVariantWithAudioGroup(ArrayList<HlsMasterPlaylist.Variant> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            HlsMasterPlaylist.Variant variant = arrayList.get(i);
            if (str.equals(variant.audioGroupId)) {
                return variant;
            }
        }
        return null;
    }

    @Nullable
    private static HlsMasterPlaylist.Variant getVariantWithSubtitleGroup(ArrayList<HlsMasterPlaylist.Variant> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            HlsMasterPlaylist.Variant variant = arrayList.get(i);
            if (str.equals(variant.subtitleGroupId)) {
                return variant;
            }
        }
        return null;
    }

    @Nullable
    private static HlsMasterPlaylist.Variant getVariantWithVideoGroup(ArrayList<HlsMasterPlaylist.Variant> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            HlsMasterPlaylist.Variant variant = arrayList.get(i);
            if (str.equals(variant.videoGroupId)) {
                return variant;
            }
        }
        return null;
    }

    private static double parseDoubleAttr(String str, Pattern pattern) throws ParserException {
        return Double.parseDouble(parseStringAttr(str, pattern, Collections.emptyMap()));
    }

    @Nullable
    private static DrmInitData.SchemeData parseDrmSchemeData(String str, String str2, Map<String, String> map) throws ParserException {
        String optionalStringAttr = parseOptionalStringAttr(str, REGEX_KEYFORMATVERSIONS, "1", map);
        if (KEYFORMAT_WIDEVINE_PSSH_BINARY.equals(str2)) {
            String stringAttr = parseStringAttr(str, REGEX_URI, map);
            return new DrmInitData.SchemeData(C3219C.WIDEVINE_UUID, MimeTypes.VIDEO_MP4, Base64.decode(stringAttr.substring(stringAttr.indexOf(44)), 0));
        }
        if (KEYFORMAT_WIDEVINE_PSSH_JSON.equals(str2)) {
            return new DrmInitData.SchemeData(C3219C.WIDEVINE_UUID, DownloadRequest.TYPE_HLS, Util.getUtf8Bytes(str));
        }
        if (!KEYFORMAT_PLAYREADY.equals(str2) || !"1".equals(optionalStringAttr)) {
            return null;
        }
        String stringAttr2 = parseStringAttr(str, REGEX_URI, map);
        byte[] bArrDecode = Base64.decode(stringAttr2.substring(stringAttr2.indexOf(44)), 0);
        UUID uuid = C3219C.PLAYREADY_UUID;
        return new DrmInitData.SchemeData(uuid, MimeTypes.VIDEO_MP4, PsshAtomUtil.buildPsshAtom(uuid, bArrDecode));
    }

    private static String parseEncryptionScheme(String str) {
        return (METHOD_SAMPLE_AES_CENC.equals(str) || METHOD_SAMPLE_AES_CTR.equals(str)) ? C3219C.CENC_TYPE_cenc : C3219C.CENC_TYPE_cbcs;
    }

    private static int parseIntAttr(String str, Pattern pattern) throws ParserException {
        return Integer.parseInt(parseStringAttr(str, pattern, Collections.emptyMap()));
    }

    private static long parseLongAttr(String str, Pattern pattern) throws ParserException {
        return Long.parseLong(parseStringAttr(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:70:0x027d  */
    /* JADX WARN: Failed to find 'out' block for switch in B:87:0x02aa. Please report as an issue. */
    private static HlsMasterPlaylist parseMasterPlaylist(LineIterator lineIterator, String str) throws IOException {
        Uri uri;
        String mediaMimeType;
        String str2;
        int i;
        String str3;
        int i2;
        String str4;
        int i3;
        String str5;
        int i4;
        int i5;
        float f;
        int i6;
        ArrayList arrayList;
        int i7;
        int i8;
        String str6 = str;
        int i9 = 1;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        char c = 0;
        boolean z = false;
        boolean zContains = false;
        while (lineIterator.hasNext()) {
            String next = lineIterator.next();
            if (next.startsWith(TAG_PREFIX)) {
                arrayList9.add(next);
            }
            if (next.startsWith(TAG_DEFINE)) {
                map2.put(parseStringAttr(next, REGEX_NAME, map2), parseStringAttr(next, REGEX_VALUE, map2));
            } else if (next.equals(TAG_INDEPENDENT_SEGMENTS)) {
                z = true;
            } else {
                if (next.startsWith(TAG_MEDIA)) {
                    arrayList7.add(next);
                } else if (next.startsWith(TAG_SESSION_KEY)) {
                    DrmInitData.SchemeData drmSchemeData = parseDrmSchemeData(next, parseOptionalStringAttr(next, REGEX_KEYFORMAT, "identity", map2), map2);
                    if (drmSchemeData != null) {
                        String encryptionScheme = parseEncryptionScheme(parseStringAttr(next, REGEX_METHOD, map2));
                        arrayList = arrayList6;
                        DrmInitData.SchemeData[] schemeDataArr = new DrmInitData.SchemeData[i9];
                        schemeDataArr[c] = drmSchemeData;
                        arrayList8.add(new DrmInitData(encryptionScheme, schemeDataArr));
                    } else {
                        arrayList = arrayList6;
                    }
                } else {
                    arrayList = arrayList6;
                    if (next.startsWith(TAG_STREAM_INF)) {
                        zContains |= next.contains(ATTR_CLOSED_CAPTIONS_NONE);
                        int intAttr = parseIntAttr(next, REGEX_BANDWIDTH);
                        parseOptionalIntAttr(next, REGEX_AVERAGE_BANDWIDTH, -1);
                        String optionalStringAttr = parseOptionalStringAttr(next, REGEX_CODECS, map2);
                        String optionalStringAttr2 = parseOptionalStringAttr(next, REGEX_RESOLUTION, map2);
                        if (optionalStringAttr2 != null) {
                            String[] strArrSplit = optionalStringAttr2.split("x");
                            int i10 = Integer.parseInt(strArrSplit[c]);
                            int i11 = Integer.parseInt(strArrSplit[i9]);
                            if (i10 <= 0 || i11 <= 0) {
                                i11 = -1;
                                i10 = -1;
                            }
                            i8 = i11;
                            i7 = i10;
                        } else {
                            i7 = -1;
                            i8 = -1;
                        }
                        String optionalStringAttr3 = parseOptionalStringAttr(next, REGEX_FRAME_RATE, map2);
                        float f2 = optionalStringAttr3 != null ? Float.parseFloat(optionalStringAttr3) : -1.0f;
                        String optionalStringAttr4 = parseOptionalStringAttr(next, REGEX_VIDEO, map2);
                        String optionalStringAttr5 = parseOptionalStringAttr(next, REGEX_AUDIO, map2);
                        String optionalStringAttr6 = parseOptionalStringAttr(next, REGEX_SUBTITLES, map2);
                        String optionalStringAttr7 = parseOptionalStringAttr(next, REGEX_CLOSED_CAPTIONS, map2);
                        if (!lineIterator.hasNext()) {
                            throw new ParserException("#EXT-X-STREAM-INF tag must be followed by another line");
                        }
                        Uri uriResolveToUri = UriUtil.resolveToUri(str6, replaceVariableReferences(lineIterator.next(), map2));
                        arrayList2.add(new HlsMasterPlaylist.Variant(uriResolveToUri, Format.createVideoContainerFormat(Integer.toString(arrayList2.size()), null, MimeTypes.APPLICATION_M3U8, null, optionalStringAttr, null, intAttr, i7, i8, f2, null, 0, 0), optionalStringAttr4, optionalStringAttr5, optionalStringAttr6, optionalStringAttr7));
                        ArrayList arrayList10 = (ArrayList) map.get(uriResolveToUri);
                        if (arrayList10 == null) {
                            arrayList10 = new ArrayList();
                            map.put(uriResolveToUri, arrayList10);
                        }
                        arrayList4 = arrayList4;
                        arrayList5 = arrayList5;
                        arrayList10.add(new HlsTrackMetadataEntry.VariantInfo(intAttr, optionalStringAttr4, optionalStringAttr5, optionalStringAttr6, optionalStringAttr7));
                    }
                }
                arrayList6 = arrayList;
                arrayList8 = arrayList8;
                arrayList4 = arrayList4;
                arrayList5 = arrayList5;
                i9 = 1;
                c = 0;
            }
            arrayList = arrayList6;
            arrayList6 = arrayList;
            arrayList8 = arrayList8;
            arrayList4 = arrayList4;
            arrayList5 = arrayList5;
            i9 = 1;
            c = 0;
        }
        ArrayList arrayList11 = arrayList4;
        ArrayList arrayList12 = arrayList5;
        ArrayList arrayList13 = arrayList6;
        ArrayList arrayList14 = arrayList8;
        ArrayList arrayList15 = new ArrayList();
        HashSet hashSet = new HashSet();
        int i12 = 0;
        while (true) {
            uri = null;
            if (i12 >= arrayList2.size()) {
                break;
            }
            HlsMasterPlaylist.Variant variant = (HlsMasterPlaylist.Variant) arrayList2.get(i12);
            if (hashSet.add(variant.url)) {
                Assertions.checkState(variant.format.metadata == null);
                i6 = 1;
                arrayList15.add(variant.copyWithFormat(variant.format.copyWithMetadata(new Metadata(new HlsTrackMetadataEntry(null, null, (List) Assertions.checkNotNull(map.get(variant.url)))))));
            } else {
                i6 = 1;
            }
            i12 += i6;
        }
        ArrayList arrayList16 = null;
        Format format = null;
        int i13 = 0;
        while (i13 < arrayList7.size()) {
            String str7 = (String) arrayList7.get(i13);
            String stringAttr = parseStringAttr(str7, REGEX_GROUP_ID, map2);
            String stringAttr2 = parseStringAttr(str7, REGEX_NAME, map2);
            String optionalStringAttr8 = parseOptionalStringAttr(str7, REGEX_URI, map2);
            Uri uriResolveToUri2 = optionalStringAttr8 == null ? uri : UriUtil.resolveToUri(str6, optionalStringAttr8);
            String optionalStringAttr9 = parseOptionalStringAttr(str7, REGEX_LANGUAGE, map2);
            int selectionFlags = parseSelectionFlags(str7);
            int roleFlags = parseRoleFlags(str7, map2);
            String strM28671a = C5532ud.m28671a(stringAttr, ":", stringAttr2);
            ArrayList arrayList17 = arrayList7;
            Format format2 = format;
            Metadata metadata = new Metadata(new HlsTrackMetadataEntry(stringAttr, stringAttr2, Collections.emptyList()));
            String stringAttr3 = parseStringAttr(str7, REGEX_TYPE, map2);
            stringAttr3.getClass();
            switch (stringAttr3) {
                case "SUBTITLES":
                    arrayList11 = arrayList11;
                    HlsMasterPlaylist.Variant variantWithSubtitleGroup = getVariantWithSubtitleGroup(arrayList2, stringAttr);
                    if (variantWithSubtitleGroup != null) {
                        String codecsOfType = Util.getCodecsOfType(variantWithSubtitleGroup.format.codecs, 3);
                        mediaMimeType = MimeTypes.getMediaMimeType(codecsOfType);
                        str2 = codecsOfType;
                    } else {
                        mediaMimeType = null;
                        str2 = null;
                    }
                    HlsMasterPlaylist.Rendition rendition = new HlsMasterPlaylist.Rendition(uriResolveToUri2, Format.createTextContainerFormat(strM28671a, stringAttr2, MimeTypes.APPLICATION_M3U8, mediaMimeType == null ? MimeTypes.TEXT_VTT : mediaMimeType, str2, -1, selectionFlags, roleFlags, optionalStringAttr9).copyWithMetadata(metadata), stringAttr, stringAttr2);
                    arrayList12 = arrayList12;
                    arrayList12.add(rendition);
                    i2 = 1;
                    break;
                case "CLOSED-CAPTIONS":
                    String stringAttr4 = parseStringAttr(str7, REGEX_INSTREAM_ID, map2);
                    if (stringAttr4.startsWith("CC")) {
                        i = Integer.parseInt(stringAttr4.substring(2));
                        str3 = MimeTypes.APPLICATION_CEA608;
                    } else {
                        i = Integer.parseInt(stringAttr4.substring(7));
                        str3 = MimeTypes.APPLICATION_CEA708;
                    }
                    int i14 = i;
                    String str8 = str3;
                    if (arrayList16 == null) {
                        arrayList16 = new ArrayList();
                    }
                    arrayList16.add(Format.createTextContainerFormat(strM28671a, stringAttr2, null, str8, null, -1, selectionFlags, roleFlags, optionalStringAttr9, i14));
                    i2 = 1;
                    break;
                case "AUDIO":
                    HlsMasterPlaylist.Variant variantWithAudioGroup = getVariantWithAudioGroup(arrayList2, stringAttr);
                    String codecsOfType2 = variantWithAudioGroup != null ? Util.getCodecsOfType(variantWithAudioGroup.format.codecs, 1) : null;
                    String mediaMimeType2 = codecsOfType2 != null ? MimeTypes.getMediaMimeType(codecsOfType2) : null;
                    String optionalStringAttr10 = parseOptionalStringAttr(str7, REGEX_CHANNELS, map2);
                    if (optionalStringAttr10 != null) {
                        int i15 = Integer.parseInt(Util.splitAtFirst(optionalStringAttr10, "/")[0]);
                        if (MimeTypes.AUDIO_E_AC3.equals(mediaMimeType2) && optionalStringAttr10.endsWith("/JOC")) {
                            mediaMimeType2 = MimeTypes.AUDIO_E_AC3_JOC;
                        }
                        str4 = mediaMimeType2;
                        i3 = i15;
                    } else {
                        str4 = mediaMimeType2;
                        i3 = -1;
                    }
                    Format formatCreateAudioContainerFormat = Format.createAudioContainerFormat(strM28671a, stringAttr2, MimeTypes.APPLICATION_M3U8, str4, codecsOfType2, null, -1, i3, -1, null, selectionFlags, roleFlags, optionalStringAttr9);
                    if (uriResolveToUri2 != null) {
                        arrayList11 = arrayList11;
                        arrayList11.add(new HlsMasterPlaylist.Rendition(uriResolveToUri2, formatCreateAudioContainerFormat.copyWithMetadata(metadata), stringAttr, stringAttr2));
                        arrayList12 = arrayList12;
                        i2 = 1;
                        break;
                    } else {
                        format2 = formatCreateAudioContainerFormat;
                        i2 = 1;
                        break;
                    }
                    break;
                case "VIDEO":
                    HlsMasterPlaylist.Variant variantWithVideoGroup = getVariantWithVideoGroup(arrayList2, stringAttr);
                    if (variantWithVideoGroup != null) {
                        Format format3 = variantWithVideoGroup.format;
                        String codecsOfType3 = Util.getCodecsOfType(format3.codecs, 2);
                        int i16 = format3.width;
                        int i17 = format3.height;
                        f = format3.frameRate;
                        str5 = codecsOfType3;
                        i4 = i16;
                        i5 = i17;
                    } else {
                        str5 = null;
                        i4 = -1;
                        i5 = -1;
                        f = -1.0f;
                    }
                    Format formatCopyWithMetadata = Format.createVideoContainerFormat(strM28671a, stringAttr2, MimeTypes.APPLICATION_M3U8, str5 != null ? MimeTypes.getMediaMimeType(str5) : null, str5, null, -1, i4, i5, f, null, selectionFlags, roleFlags).copyWithMetadata(metadata);
                    if (uriResolveToUri2 != null) {
                        arrayList3.add(new HlsMasterPlaylist.Rendition(uriResolveToUri2, formatCopyWithMetadata, stringAttr, stringAttr2));
                        break;
                    }
                default:
                    arrayList11 = arrayList11;
                    arrayList12 = arrayList12;
                    i2 = 1;
                    break;
            }
            i13 += i2;
            str6 = str;
            arrayList11 = arrayList11;
            arrayList12 = arrayList12;
            arrayList7 = arrayList17;
            format = format2;
            uri = null;
        }
        return new HlsMasterPlaylist(str, arrayList9, arrayList15, arrayList3, arrayList11, arrayList12, arrayList13, format, zContains ? Collections.emptyList() : arrayList16, z, map2, arrayList14);
    }

    private static HlsMediaPlaylist parseMediaPlaylist(HlsMasterPlaylist hlsMasterPlaylist, LineIterator lineIterator, String str) throws IOException {
        String next;
        long j;
        long j2;
        String stringAttr;
        DrmInitData drmInitData;
        HlsMasterPlaylist hlsMasterPlaylist2 = hlsMasterPlaylist;
        boolean z = hlsMasterPlaylist2.hasIndependentSegments;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TreeMap treeMap = new TreeMap();
        char c = 0;
        long doubleAttr = C3219C.TIME_UNSET;
        int i = 1;
        String optionalStringAttr = "";
        boolean z2 = z;
        long intAttr = -9223372036854775807L;
        int i2 = 0;
        String encryptionScheme = null;
        long jMsToUs = 0;
        boolean z3 = false;
        int i3 = 0;
        long j3 = 0;
        int intAttr2 = 1;
        boolean z4 = false;
        DrmInitData drmInitData2 = null;
        long j4 = 0;
        long longAttr = 0;
        DrmInitData drmInitData3 = null;
        boolean z5 = false;
        String stringAttr2 = null;
        String optionalStringAttr2 = null;
        long j5 = -1;
        int i4 = 0;
        long j6 = 0;
        HlsMediaPlaylist.Segment segment = null;
        while (true) {
            long j7 = 0;
            while (true) {
                if (!lineIterator.hasNext()) {
                    return new HlsMediaPlaylist(i2, str, arrayList2, doubleAttr, jMsToUs, z3, i3, j3, intAttr2, intAttr, z2, z4, jMsToUs != 0, drmInitData2, arrayList);
                }
                next = lineIterator.next();
                if (next.startsWith(TAG_PREFIX)) {
                    arrayList2.add(next);
                }
                if (next.startsWith(TAG_PLAYLIST_TYPE)) {
                    String stringAttr3 = parseStringAttr(next, REGEX_PLAYLIST_TYPE, map);
                    if ("VOD".equals(stringAttr3)) {
                        i2 = 1;
                    } else if ("EVENT".equals(stringAttr3)) {
                        i2 = 2;
                    }
                } else if (next.startsWith(TAG_START)) {
                    doubleAttr = (long) (parseDoubleAttr(next, REGEX_TIME_OFFSET) * 1000000.0d);
                } else if (next.startsWith(TAG_INIT_SEGMENT)) {
                    String stringAttr4 = parseStringAttr(next, REGEX_URI, map);
                    String optionalStringAttr3 = parseOptionalStringAttr(next, REGEX_ATTR_BYTERANGE, map);
                    if (optionalStringAttr3 != null) {
                        String[] strArrSplit = optionalStringAttr3.split("@");
                        long j8 = Long.parseLong(strArrSplit[c]);
                        if (strArrSplit.length > i) {
                            j4 = Long.parseLong(strArrSplit[i]);
                        }
                        j2 = j8;
                        j = j4;
                    } else {
                        j = j4;
                        j2 = j5;
                    }
                    if (stringAttr2 != null && optionalStringAttr2 == null) {
                        throw new ParserException("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                    }
                    segment = new HlsMediaPlaylist.Segment(stringAttr4, j, j2, stringAttr2, optionalStringAttr2);
                    c = 0;
                    j4 = 0;
                    j5 = -1;
                } else {
                    if (next.startsWith(TAG_TARGET_DURATION)) {
                        intAttr = ((long) parseIntAttr(next, REGEX_TARGET_DURATION)) * 1000000;
                    } else if (next.startsWith(TAG_MEDIA_SEQUENCE)) {
                        longAttr = parseLongAttr(next, REGEX_MEDIA_SEQUENCE);
                        j3 = longAttr;
                    } else if (next.startsWith(TAG_VERSION)) {
                        intAttr2 = parseIntAttr(next, REGEX_VERSION);
                    } else {
                        if (next.startsWith(TAG_DEFINE)) {
                            String optionalStringAttr4 = parseOptionalStringAttr(next, REGEX_IMPORT, map);
                            if (optionalStringAttr4 != null) {
                                stringAttr = hlsMasterPlaylist2.variableDefinitions.get(optionalStringAttr4);
                                if (stringAttr != null) {
                                }
                            } else {
                                optionalStringAttr4 = parseStringAttr(next, REGEX_NAME, map);
                                stringAttr = parseStringAttr(next, REGEX_VALUE, map);
                            }
                            map.put(optionalStringAttr4, stringAttr);
                        } else if (next.startsWith(TAG_MEDIA_DURATION)) {
                            long doubleAttr2 = (long) (parseDoubleAttr(next, REGEX_MEDIA_DURATION) * 1000000.0d);
                            optionalStringAttr = parseOptionalStringAttr(next, REGEX_MEDIA_TITLE, "", map);
                            j7 = doubleAttr2;
                        } else if (next.startsWith(TAG_KEY)) {
                            String stringAttr5 = parseStringAttr(next, REGEX_METHOD, map);
                            String optionalStringAttr5 = parseOptionalStringAttr(next, REGEX_KEYFORMAT, "identity", map);
                            if (METHOD_NONE.equals(stringAttr5)) {
                                treeMap.clear();
                                drmInitData3 = null;
                                stringAttr2 = null;
                                optionalStringAttr2 = null;
                            } else {
                                optionalStringAttr2 = parseOptionalStringAttr(next, REGEX_IV, map);
                                if (!"identity".equals(optionalStringAttr5)) {
                                    if (encryptionScheme == null) {
                                        encryptionScheme = parseEncryptionScheme(stringAttr5);
                                    }
                                    DrmInitData.SchemeData drmSchemeData = parseDrmSchemeData(next, optionalStringAttr5, map);
                                    if (drmSchemeData != null) {
                                        treeMap.put(optionalStringAttr5, drmSchemeData);
                                        drmInitData3 = null;
                                    }
                                    stringAttr2 = null;
                                } else if (METHOD_AES_128.equals(stringAttr5)) {
                                    stringAttr2 = parseStringAttr(next, REGEX_URI, map);
                                    optionalStringAttr2 = optionalStringAttr2;
                                }
                                stringAttr2 = null;
                            }
                        } else if (next.startsWith(TAG_BYTERANGE)) {
                            String[] strArrSplit2 = parseStringAttr(next, REGEX_BYTERANGE, map).split("@");
                            j5 = Long.parseLong(strArrSplit2[0]);
                            if (strArrSplit2.length > i) {
                                j4 = Long.parseLong(strArrSplit2[i]);
                            }
                        } else if (next.startsWith(TAG_DISCONTINUITY_SEQUENCE)) {
                            i3 = Integer.parseInt(next.substring(next.indexOf(58) + i));
                            c = 0;
                            z3 = true;
                        } else if (next.equals(TAG_DISCONTINUITY)) {
                            i4++;
                        } else if (!next.startsWith(TAG_PROGRAM_DATE_TIME)) {
                            if (next.equals(TAG_GAP)) {
                                c = 0;
                                z5 = true;
                            } else if (next.equals(TAG_INDEPENDENT_SEGMENTS)) {
                                c = 0;
                                z2 = true;
                            } else if (next.equals(TAG_ENDLIST)) {
                                c = 0;
                                z4 = true;
                            } else if (!next.startsWith("#")) {
                                break;
                            }
                        } else if (jMsToUs == 0) {
                            jMsToUs = C3219C.msToUs(Util.parseXsDateTime(next.substring(next.indexOf(58) + i))) - j6;
                        }
                        hlsMasterPlaylist2 = hlsMasterPlaylist;
                        treeMap = treeMap;
                        c = 0;
                        i = 1;
                    }
                    c = 0;
                }
            }
            String hexString = stringAttr2 == null ? null : optionalStringAttr2 != null ? optionalStringAttr2 : Long.toHexString(longAttr);
            long j9 = longAttr + 1;
            long j10 = j5 == -1 ? 0L : j4;
            if (drmInitData3 != null || treeMap.isEmpty()) {
                drmInitData = drmInitData3;
            } else {
                DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                drmInitData = new DrmInitData(encryptionScheme, schemeDataArr);
                if (drmInitData2 == null) {
                    DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
                    for (int i5 = 0; i5 < schemeDataArr.length; i5++) {
                        schemeDataArr2[i5] = schemeDataArr[i5].copyWithData(null);
                    }
                    drmInitData2 = new DrmInitData(encryptionScheme, schemeDataArr2);
                }
            }
            arrayList.add(new HlsMediaPlaylist.Segment(replaceVariableReferences(next, map), segment, optionalStringAttr, j7, i4, j6, drmInitData, stringAttr2, hexString, j10, j5, z5));
            j6 += j7;
            if (j5 != -1) {
                j10 += j5;
            }
            j4 = j10;
            hlsMasterPlaylist2 = hlsMasterPlaylist;
            j5 = -1;
            drmInitData3 = drmInitData;
            treeMap = treeMap;
            longAttr = j9;
            c = 0;
            i = 1;
            z5 = false;
        }
    }

    private static boolean parseOptionalBooleanAttribute(String str, Pattern pattern, boolean z) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(1).equals(BOOLEAN_TRUE) : z;
    }

    private static int parseOptionalIntAttr(String str, Pattern pattern, int i) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt(matcher.group(1)) : i;
    }

    private static String parseOptionalStringAttr(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
        }
        return (map.isEmpty() || str2 == null) ? str2 : replaceVariableReferences(str2, map);
    }

    private static int parseRoleFlags(String str, Map<String, String> map) {
        String optionalStringAttr = parseOptionalStringAttr(str, REGEX_CHARACTERISTICS, map);
        if (TextUtils.isEmpty(optionalStringAttr)) {
            return 0;
        }
        String[] strArrSplit = Util.split(optionalStringAttr, C1262Tc.f3278g);
        int i = Util.contains(strArrSplit, "public.accessibility.describes-video") ? 512 : 0;
        if (Util.contains(strArrSplit, "public.accessibility.transcribes-spoken-dialog")) {
            i |= 4096;
        }
        if (Util.contains(strArrSplit, "public.accessibility.describes-music-and-sound")) {
            i |= 1024;
        }
        return Util.contains(strArrSplit, "public.easy-to-read") ? i | 8192 : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static int parseSelectionFlags(String str) {
        boolean optionalBooleanAttribute = parseOptionalBooleanAttribute(str, REGEX_DEFAULT, false);
        ?? r0 = optionalBooleanAttribute;
        if (parseOptionalBooleanAttribute(str, REGEX_FORCED, false)) {
            r0 = (optionalBooleanAttribute ? 1 : 0) | 2;
        }
        return parseOptionalBooleanAttribute(str, REGEX_AUTOSELECT, false) ? r0 | 4 : r0;
    }

    private static String parseStringAttr(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        String optionalStringAttr = parseOptionalStringAttr(str, pattern, map);
        if (optionalStringAttr != null) {
            return optionalStringAttr;
        }
        throw new ParserException("Couldn't match " + pattern.pattern() + " in " + str);
    }

    private static String replaceVariableReferences(String str, Map<String, String> map) {
        Matcher matcher = REGEX_VARIABLE_REFERENCE.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static int skipIgnorableWhitespace(BufferedReader bufferedReader, boolean z, int i) throws IOException {
        while (i != -1 && Character.isWhitespace(i) && (z || !Util.isLinebreak(i))) {
            i = bufferedReader.read();
        }
        return i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
    public HlsPlaylist parse(Uri uri, InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!checkPlaylistHeader(bufferedReader)) {
                throw new UnrecognizedInputFormatException("Input does not start with the #EXTM3U header.", uri);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    Util.closeQuietly(bufferedReader);
                    throw new ParserException("Failed to parse the playlist, could not identify any tags.");
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith(TAG_STREAM_INF)) {
                        arrayDeque.add(strTrim);
                        HlsMasterPlaylist masterPlaylist = parseMasterPlaylist(new LineIterator(arrayDeque, bufferedReader), uri.toString());
                        Util.closeQuietly(bufferedReader);
                        return masterPlaylist;
                    }
                    if (!strTrim.startsWith(TAG_TARGET_DURATION) && !strTrim.startsWith(TAG_MEDIA_SEQUENCE) && !strTrim.startsWith(TAG_MEDIA_DURATION) && !strTrim.startsWith(TAG_KEY) && !strTrim.startsWith(TAG_BYTERANGE) && !strTrim.equals(TAG_DISCONTINUITY) && !strTrim.equals(TAG_DISCONTINUITY_SEQUENCE) && !strTrim.equals(TAG_ENDLIST)) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    HlsMediaPlaylist mediaPlaylist = parseMediaPlaylist(this.masterPlaylist, new LineIterator(arrayDeque, bufferedReader), uri.toString());
                    Util.closeQuietly(bufferedReader);
                    return mediaPlaylist;
                }
            }
        } catch (Throwable th) {
            Util.closeQuietly(bufferedReader);
            throw th;
        }
    }

    public HlsPlaylistParser(HlsMasterPlaylist hlsMasterPlaylist) {
        this.masterPlaylist = hlsMasterPlaylist;
    }

    @Nullable
    private static String parseOptionalStringAttr(String str, Pattern pattern, Map<String, String> map) {
        return parseOptionalStringAttr(str, pattern, null, map);
    }
}
