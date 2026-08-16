package com.google.android.exoplayer2.source.dash.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.XmlPullParserUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.p013io.input.Tailer;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import p000.C1023Ps;
import p000.C4331f8;
import p000.C5713xI;
import p000.C5984j00;

/* JADX INFO: loaded from: classes2.dex */
public class DashManifestParser extends DefaultHandler implements ParsingLoadable.Parser<DashManifest> {
    private static final String TAG = "MpdParser";
    private final XmlPullParserFactory xmlParserFactory;
    private static final Pattern FRAME_RATE_PATTERN = Pattern.compile("(\\d+)(?:/(\\d+))?");
    private static final Pattern CEA_608_ACCESSIBILITY_PATTERN = Pattern.compile("CC([1-4])=.*");
    private static final Pattern CEA_708_ACCESSIBILITY_PATTERN = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    public static final class RepresentationInfo {
        public final String baseUrl;
        public final ArrayList<DrmInitData.SchemeData> drmSchemeDatas;

        @Nullable
        public final String drmSchemeType;
        public final Format format;
        public final ArrayList<Descriptor> inbandEventStreams;
        public final long revisionId;
        public final SegmentBase segmentBase;

        public RepresentationInfo(Format format, String str, SegmentBase segmentBase, @Nullable String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<Descriptor> arrayList2, long j) {
            this.format = format;
            this.baseUrl = str;
            this.segmentBase = segmentBase;
            this.drmSchemeType = str2;
            this.drmSchemeDatas = arrayList;
            this.inbandEventStreams = arrayList2;
            this.revisionId = j;
        }
    }

    public DashManifestParser() {
        try {
            this.xmlParserFactory = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    private long addSegmentTimelineElementsToList(List<SegmentBase.SegmentTimelineElement> list, long j, long j2, int i, long j3) {
        int iCeilDivide = i >= 0 ? i + 1 : (int) Util.ceilDivide(j3 - j, j2);
        for (int i2 = 0; i2 < iCeilDivide; i2++) {
            list.add(buildSegmentTimelineElement(j, j2));
            j += j2;
        }
        return j;
    }

    private static int checkContentTypeConsistency(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        Assertions.checkState(i == i2);
        return i;
    }

    @Nullable
    private static String checkLanguageConsistency(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        Assertions.checkState(str.equals(str2));
        return str;
    }

    private static void filterRedundantIncompleteSchemeDatas(ArrayList<DrmInitData.SchemeData> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = arrayList.get(size);
            if (!schemeData.hasData()) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (arrayList.get(i).canReplace(schemeData)) {
                        arrayList.remove(size);
                        break;
                    }
                }
            }
        }
    }

    @Nullable
    private static String getSampleMimeType(@Nullable String str, @Nullable String str2) {
        if (MimeTypes.isAudio(str)) {
            return MimeTypes.getAudioMediaMimeType(str2);
        }
        if (MimeTypes.isVideo(str)) {
            return MimeTypes.getVideoMediaMimeType(str2);
        }
        if (mimeTypeIsRawText(str)) {
            return str;
        }
        if (MimeTypes.APPLICATION_MP4.equals(str)) {
            if (str2 != null) {
                if (str2.startsWith("stpp")) {
                    return MimeTypes.APPLICATION_TTML;
                }
                if (str2.startsWith("wvtt")) {
                    return MimeTypes.APPLICATION_MP4VTT;
                }
            }
        } else if (MimeTypes.APPLICATION_RAWCC.equals(str) && str2 != null) {
            if (str2.contains("cea708")) {
                return MimeTypes.APPLICATION_CEA708;
            }
            if (str2.contains("eia608") || str2.contains("cea608")) {
                return MimeTypes.APPLICATION_CEA608;
            }
        }
        return null;
    }

    public static void maybeSkipTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (XmlPullParserUtil.isStartTag(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (XmlPullParserUtil.isStartTag(xmlPullParser)) {
                    i++;
                } else if (XmlPullParserUtil.isEndTag(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    private static boolean mimeTypeIsRawText(@Nullable String str) {
        return MimeTypes.isText(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_CEA608.equals(str);
    }

    public static int parseCea608AccessibilityChannel(List<Descriptor> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(descriptor.schemeIdUri) && (str = descriptor.value) != null) {
                Matcher matcher = CEA_608_ACCESSIBILITY_PATTERN.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                Log.m17586w(TAG, "Unable to parse CEA-608 channel number from: " + descriptor.value);
            }
        }
        return -1;
    }

    public static int parseCea708AccessibilityChannel(List<Descriptor> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(descriptor.schemeIdUri) && (str = descriptor.value) != null) {
                Matcher matcher = CEA_708_ACCESSIBILITY_PATTERN.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                Log.m17586w(TAG, "Unable to parse CEA-708 service block number from: " + descriptor.value);
            }
        }
        return -1;
    }

    public static long parseDateTime(XmlPullParser xmlPullParser, String str, long j) throws ParserException {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Util.parseXsDateTime(attributeValue);
    }

    public static Descriptor parseDescriptor(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String string = parseString(xmlPullParser, "schemeIdUri", "");
        String string2 = parseString(xmlPullParser, "value", null);
        String string3 = parseString(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, str));
        return new Descriptor(string, string2, string3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static int parseDolbyChannelConfiguration(XmlPullParser xmlPullParser) {
        String lowerInvariant = Util.toLowerInvariant(xmlPullParser.getAttributeValue(null, "value"));
        if (lowerInvariant == null) {
            return -1;
        }
        switch (lowerInvariant) {
            case "4000":
                return 1;
            case "a000":
                return 2;
            case "f801":
                return 6;
            case "fa01":
                return 8;
            default:
                return -1;
        }
    }

    public static long parseDuration(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Util.parseXsDuration(attributeValue);
    }

    public static String parseEac3SupplementalProperties(List<Descriptor> list) {
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            String str = descriptor.schemeIdUri;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(descriptor.value)) {
                return MimeTypes.AUDIO_E_AC3_JOC;
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(descriptor.value)) {
                return MimeTypes.AUDIO_E_AC3_JOC;
            }
        }
        return MimeTypes.AUDIO_E_AC3;
    }

    public static float parseFrameRate(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = FRAME_RATE_PATTERN.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int i = Integer.parseInt(matcher.group(1));
        String strGroup = matcher.group(2);
        float f2 = i;
        return !TextUtils.isEmpty(strGroup) ? f2 / Integer.parseInt(strGroup) : f2;
    }

    public static int parseInt(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    public static long parseLastSegmentNumberSupplementalProperty(List<Descriptor> list) {
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if ("http://dashif.org/guidelines/last-segment-number".equalsIgnoreCase(descriptor.schemeIdUri)) {
                return Long.parseLong(descriptor.value);
            }
        }
        return -1L;
    }

    public static long parseLong(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    public static String parseString(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    public static String parseText(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, str));
        return text;
    }

    public AdaptationSet buildAdaptationSet(int i, int i2, List<Representation> list, List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4) {
        return new AdaptationSet(i, i2, list, list2, list3, list4);
    }

    public EventMessage buildEvent(String str, String str2, long j, long j2, byte[] bArr) {
        return new EventMessage(str, str2, j2, j, bArr);
    }

    public EventStream buildEventStream(String str, String str2, long j, long[] jArr, EventMessage[] eventMessageArr) {
        return new EventStream(str, str2, j, jArr, eventMessageArr);
    }

    public Format buildFormat(@Nullable String str, @Nullable String str2, int i, int i2, float f, int i3, int i4, int i5, @Nullable String str3, List<Descriptor> list, List<Descriptor> list2, @Nullable String str4, List<Descriptor> list3, List<Descriptor> list4) {
        String str5;
        int i6;
        int cea708AccessibilityChannel;
        String sampleMimeType = getSampleMimeType(str2, str4);
        int selectionFlagsFromRoleDescriptors = parseSelectionFlagsFromRoleDescriptors(list);
        int roleFlagsFromRoleDescriptors = parseRoleFlagsFromRoleDescriptors(list) | parseRoleFlagsFromAccessibilityDescriptors(list2) | parseRoleFlagsFromProperties(list3) | parseRoleFlagsFromProperties(list4);
        if (sampleMimeType != null) {
            String eac3SupplementalProperties = MimeTypes.AUDIO_E_AC3.equals(sampleMimeType) ? parseEac3SupplementalProperties(list4) : sampleMimeType;
            if (MimeTypes.isVideo(eac3SupplementalProperties)) {
                return Format.createVideoContainerFormat(str, null, str2, eac3SupplementalProperties, str4, null, i5, i, i2, f, null, selectionFlagsFromRoleDescriptors, roleFlagsFromRoleDescriptors);
            }
            if (MimeTypes.isAudio(eac3SupplementalProperties)) {
                return Format.createAudioContainerFormat(str, null, str2, eac3SupplementalProperties, str4, null, i5, i3, i4, null, selectionFlagsFromRoleDescriptors, roleFlagsFromRoleDescriptors, str3);
            }
            if (mimeTypeIsRawText(eac3SupplementalProperties)) {
                if (!MimeTypes.APPLICATION_CEA608.equals(eac3SupplementalProperties)) {
                    if (MimeTypes.APPLICATION_CEA708.equals(eac3SupplementalProperties)) {
                        cea708AccessibilityChannel = parseCea708AccessibilityChannel(list2);
                    } else {
                        i6 = -1;
                    }
                    return Format.createTextContainerFormat(str, null, str2, eac3SupplementalProperties, str4, i5, selectionFlagsFromRoleDescriptors, roleFlagsFromRoleDescriptors, str3, i6);
                }
                cea708AccessibilityChannel = parseCea608AccessibilityChannel(list2);
                i6 = cea708AccessibilityChannel;
                return Format.createTextContainerFormat(str, null, str2, eac3SupplementalProperties, str4, i5, selectionFlagsFromRoleDescriptors, roleFlagsFromRoleDescriptors, str3, i6);
            }
            str5 = eac3SupplementalProperties;
        } else {
            str5 = sampleMimeType;
        }
        return Format.createContainerFormat(str, null, str2, str5, str4, i5, selectionFlagsFromRoleDescriptors, roleFlagsFromRoleDescriptors, str3);
    }

    public DashManifest buildMediaPresentationDescription(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, @Nullable ProgramInformation programInformation, @Nullable UtcTimingElement utcTimingElement, @Nullable Uri uri, List<Period> list) {
        return new DashManifest(j, j2, j3, z, j4, j5, j6, j7, programInformation, utcTimingElement, uri, list);
    }

    public Period buildPeriod(@Nullable String str, long j, List<AdaptationSet> list, List<EventStream> list2, @Nullable Descriptor descriptor) {
        return new Period(str, j, list, list2, descriptor);
    }

    public RangedUri buildRangedUri(String str, long j, long j2) {
        return new RangedUri(str, j, j2);
    }

    public Representation buildRepresentation(RepresentationInfo representationInfo, @Nullable String str, @Nullable String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<Descriptor> arrayList2) {
        Format formatCopyWithDrmInitData = representationInfo.format;
        if (str != null) {
            formatCopyWithDrmInitData = formatCopyWithDrmInitData.copyWithLabel(str);
        }
        String str3 = representationInfo.drmSchemeType;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<DrmInitData.SchemeData> arrayList3 = representationInfo.drmSchemeDatas;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            filterRedundantIncompleteSchemeDatas(arrayList3);
            formatCopyWithDrmInitData = formatCopyWithDrmInitData.copyWithDrmInitData(new DrmInitData(str2, arrayList3));
        }
        ArrayList<Descriptor> arrayList4 = representationInfo.inbandEventStreams;
        arrayList4.addAll(arrayList2);
        return Representation.newInstance(representationInfo.revisionId, formatCopyWithDrmInitData, representationInfo.baseUrl, representationInfo.segmentBase, arrayList4);
    }

    public SegmentBase.SegmentList buildSegmentList(RangedUri rangedUri, long j, long j2, long j3, long j4, @Nullable List<SegmentBase.SegmentTimelineElement> list, @Nullable List<RangedUri> list2) {
        return new SegmentBase.SegmentList(rangedUri, j, j2, j3, j4, list, list2);
    }

    public SegmentBase.SegmentTemplate buildSegmentTemplate(RangedUri rangedUri, long j, long j2, long j3, long j4, long j5, List<SegmentBase.SegmentTimelineElement> list, @Nullable UrlTemplate urlTemplate, @Nullable UrlTemplate urlTemplate2) {
        return new SegmentBase.SegmentTemplate(rangedUri, j, j2, j3, j4, j5, list, urlTemplate, urlTemplate2);
    }

    public SegmentBase.SegmentTimelineElement buildSegmentTimelineElement(long j, long j2) {
        return new SegmentBase.SegmentTimelineElement(j, j2);
    }

    public SegmentBase.SingleSegmentBase buildSingleSegmentBase(RangedUri rangedUri, long j, long j2, long j3, long j4) {
        return new SegmentBase.SingleSegmentBase(rangedUri, j, j2, j3, j4);
    }

    public UtcTimingElement buildUtcTimingElement(String str, String str2) {
        return new UtcTimingElement(str, str2);
    }

    public int getContentType(Format format) {
        String str = format.sampleMimeType;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (MimeTypes.isVideo(str)) {
            return 2;
        }
        if (MimeTypes.isAudio(str)) {
            return 1;
        }
        return mimeTypeIsRawText(str) ? 3 : -1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
    public DashManifest parse(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.xmlParserFactory.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return parseMediaPresentationDescription(xmlPullParserNewPullParser, uri.toString());
            }
            throw new ParserException("inputStream does not contain a valid media presentation description");
        } catch (XmlPullParserException e) {
            throw new ParserException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.google.android.exoplayer2.source.dash.manifest.DashManifestParser] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r43v0, types: [com.google.android.exoplayer2.source.dash.manifest.DashManifestParser] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.google.android.exoplayer2.source.dash.manifest.DashManifestParser] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.google.android.exoplayer2.source.dash.manifest.DashManifestParser] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public AdaptationSet parseAdaptationSet(XmlPullParser xmlPullParser, String str, @Nullable SegmentBase segmentBase, long j) throws XmlPullParserException, IOException {
        String str2;
        String str3;
        ArrayList arrayList;
        ?? r7;
        int iCheckContentTypeConsistency;
        ArrayList arrayList2;
        ArrayList arrayList3;
        SegmentBase segmentTemplate;
        ?? r8;
        ?? r9;
        ?? r10;
        ?? r15 = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int i = parseInt(xmlPullParser2, "id", -1);
        int contentType = parseContentType(xmlPullParser);
        String str4 = null;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser2.getAttributeValue(null, "codecs");
        int i2 = parseInt(xmlPullParser2, "width", -1);
        int i3 = parseInt(xmlPullParser2, "height", -1);
        float frameRate = parseFrameRate(xmlPullParser2, -1.0f);
        int i4 = parseInt(xmlPullParser2, "audioSamplingRate", -1);
        String str5 = "lang";
        String attributeValue3 = xmlPullParser2.getAttributeValue(null, "lang");
        String attributeValue4 = xmlPullParser2.getAttributeValue(null, "label");
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        String baseUrl = str;
        SegmentBase segmentBase2 = segmentBase;
        String label = attributeValue4;
        String str6 = null;
        int audioChannelConfiguration = -1;
        boolean z = false;
        int i5 = contentType;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "BaseURL")) {
                if (!z) {
                    z = true;
                    baseUrl = r15.parseBaseUrl(xmlPullParser2, baseUrl);
                    iCheckContentTypeConsistency = i5;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList5;
                    r10 = r15;
                }
                str2 = attributeValue3;
                str3 = baseUrl;
                arrayList9 = arrayList9;
                arrayList8 = arrayList8;
                arrayList7 = arrayList7;
                arrayList6 = arrayList6;
                arrayList4 = arrayList4;
                str5 = str5;
                str4 = str4;
                xmlPullParser2 = xmlPullParser2;
                r9 = r15;
                iCheckContentTypeConsistency = i5;
                arrayList2 = arrayList10;
                arrayList3 = arrayList5;
                r9 = r7;
                attributeValue3 = str2;
                baseUrl = str3;
                r10 = r9;
            } else {
                if (XmlPullParserUtil.isStartTag(xmlPullParser2, "ContentProtection")) {
                    Pair<String, DrmInitData.SchemeData> contentProtection = parseContentProtection(xmlPullParser);
                    Object obj = contentProtection.first;
                    if (obj != null) {
                        str6 = (String) obj;
                    }
                    Object obj2 = contentProtection.second;
                    if (obj2 != null) {
                        arrayList4.add(obj2);
                    }
                } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "ContentComponent")) {
                    attributeValue3 = checkLanguageConsistency(attributeValue3, xmlPullParser2.getAttributeValue(str4, str5));
                    iCheckContentTypeConsistency = checkContentTypeConsistency(i5, parseContentType(xmlPullParser));
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList5;
                    r10 = r15;
                } else {
                    if (XmlPullParserUtil.isStartTag(xmlPullParser2, "Role")) {
                        arrayList7.add(parseDescriptor(xmlPullParser2, "Role"));
                    } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "AudioChannelConfiguration")) {
                        audioChannelConfiguration = parseAudioChannelConfiguration(xmlPullParser);
                    } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "Accessibility")) {
                        arrayList6.add(parseDescriptor(xmlPullParser2, "Accessibility"));
                    } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "EssentialProperty")) {
                        arrayList8.add(parseDescriptor(xmlPullParser2, "EssentialProperty"));
                    } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SupplementalProperty")) {
                        arrayList9.add(parseDescriptor(xmlPullParser2, "SupplementalProperty"));
                    } else {
                        if (XmlPullParserUtil.isStartTag(xmlPullParser2, "Representation")) {
                            str2 = attributeValue3;
                            str3 = baseUrl;
                            arrayList9 = arrayList9;
                            arrayList8 = arrayList8;
                            arrayList7 = arrayList7;
                            arrayList6 = arrayList6;
                            arrayList = arrayList5;
                            arrayList4 = arrayList4;
                            str5 = str5;
                            str4 = str4;
                            RepresentationInfo representation = parseRepresentation(xmlPullParser, baseUrl, attributeValue, attributeValue2, i2, i3, frameRate, audioChannelConfiguration, i4, str2, arrayList7, arrayList6, arrayList8, arrayList9, segmentBase2, j);
                            ?? r11 = this;
                            int iCheckContentTypeConsistency2 = checkContentTypeConsistency(i5, r11.getContentType(representation.format));
                            arrayList2 = arrayList10;
                            arrayList2.add(representation);
                            xmlPullParser2 = xmlPullParser;
                            iCheckContentTypeConsistency = iCheckContentTypeConsistency2;
                            r8 = r11;
                        } else {
                            str2 = attributeValue3;
                            str3 = baseUrl;
                            arrayList9 = arrayList9;
                            arrayList8 = arrayList8;
                            arrayList7 = arrayList7;
                            arrayList6 = arrayList6;
                            arrayList = arrayList5;
                            arrayList4 = arrayList4;
                            str5 = str5;
                            str4 = str4;
                            r7 = r15;
                            iCheckContentTypeConsistency = i5;
                            arrayList2 = arrayList10;
                            xmlPullParser2 = xmlPullParser;
                            if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentBase")) {
                                segmentTemplate = r7.parseSegmentBase(xmlPullParser2, (SegmentBase.SingleSegmentBase) segmentBase2);
                            } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentList")) {
                                segmentTemplate = r7.parseSegmentList(xmlPullParser2, (SegmentBase.SegmentList) segmentBase2, j);
                            } else if (XmlPullParserUtil.isStartTag(xmlPullParser2, "SegmentTemplate")) {
                                segmentTemplate = parseSegmentTemplate(xmlPullParser, (SegmentBase.SegmentTemplate) segmentBase2, arrayList9, j);
                            } else {
                                if (XmlPullParserUtil.isStartTag(xmlPullParser2, "InbandEventStream")) {
                                    arrayList3 = arrayList;
                                    arrayList3.add(parseDescriptor(xmlPullParser2, "InbandEventStream"));
                                    r9 = r7;
                                } else {
                                    arrayList3 = arrayList;
                                    if (XmlPullParserUtil.isStartTag(xmlPullParser2, "Label")) {
                                        label = parseLabel(xmlPullParser);
                                        r9 = r7;
                                    } else if (XmlPullParserUtil.isStartTag(xmlPullParser)) {
                                        r9 = r7;
                                        parseAdaptationSetChild(xmlPullParser);
                                        r9 = r7;
                                    }
                                }
                                r9 = r7;
                                attributeValue3 = str2;
                                baseUrl = str3;
                                r10 = r9;
                            }
                            segmentBase2 = segmentTemplate;
                            r8 = r7;
                        }
                        attributeValue3 = str2;
                        baseUrl = str3;
                        arrayList3 = arrayList;
                        r10 = r8;
                    }
                    str2 = attributeValue3;
                    str3 = baseUrl;
                    arrayList9 = arrayList9;
                    arrayList8 = arrayList8;
                    arrayList7 = arrayList7;
                    arrayList6 = arrayList6;
                    arrayList4 = arrayList4;
                    str5 = str5;
                    str4 = str4;
                    xmlPullParser2 = xmlPullParser2;
                    r9 = r15;
                    iCheckContentTypeConsistency = i5;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList5;
                    r9 = r7;
                    attributeValue3 = str2;
                    baseUrl = str3;
                    r10 = r9;
                }
                iCheckContentTypeConsistency = i5;
                arrayList2 = arrayList10;
                arrayList3 = arrayList5;
                r10 = r15;
            }
            if (XmlPullParserUtil.isEndTag(xmlPullParser2, "AdaptationSet")) {
                break;
            }
            i5 = iCheckContentTypeConsistency;
            r15 = r10;
            arrayList10 = arrayList2;
            xmlPullParser2 = xmlPullParser2;
            arrayList5 = arrayList3;
            arrayList9 = arrayList9;
            arrayList8 = arrayList8;
            arrayList7 = arrayList7;
            arrayList6 = arrayList6;
            arrayList4 = arrayList4;
            str5 = str5;
            str4 = str4;
        }
        ArrayList arrayList11 = new ArrayList(arrayList2.size());
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            arrayList11.add(buildRepresentation((RepresentationInfo) arrayList2.get(i6), label, str6, arrayList4, arrayList3));
        }
        return buildAdaptationSet(i, iCheckContentTypeConsistency, arrayList11, arrayList6, arrayList8, arrayList9);
    }

    public void parseAdaptationSetChild(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        maybeSkipTag(xmlPullParser);
    }

    public int parseAudioChannelConfiguration(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String string = parseString(xmlPullParser, "schemeIdUri", null);
        int dolbyChannelConfiguration = -1;
        if ("urn:mpeg:dash:23003:3:audio_channel_configuration:2011".equals(string)) {
            dolbyChannelConfiguration = parseInt(xmlPullParser, "value", -1);
        } else if ("tag:dolby.com,2014:dash:audio_channel_configuration:2011".equals(string) || "urn:dolby:dash:audio_channel_configuration:2011".equals(string)) {
            dolbyChannelConfiguration = parseDolbyChannelConfiguration(xmlPullParser);
        }
        do {
            xmlPullParser.next();
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "AudioChannelConfiguration"));
        return dolbyChannelConfiguration;
    }

    public String parseBaseUrl(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        return UriUtil.resolve(str, parseText(xmlPullParser, "BaseURL"));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0084  */
    /* JADX WARN: Code duplicated, block: B:58:0x00eb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public Pair<String, DrmInitData.SchemeData> parseContentProtection(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        UUID uuid;
        String attributeValue;
        String str;
        String attributeValue2;
        ?? BuildPsshAtom;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue3 != null) {
            String lowerInvariant = Util.toLowerInvariant(attributeValue3);
            lowerInvariant.getClass();
            switch (lowerInvariant) {
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid = C3219C.PLAYREADY_UUID;
                    attributeValue = null;
                    str = attributeValue;
                    attributeValue2 = str;
                    BuildPsshAtom = str;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid = C3219C.WIDEVINE_UUID;
                    attributeValue = null;
                    str = attributeValue;
                    attributeValue2 = str;
                    BuildPsshAtom = str;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    attributeValue = xmlPullParser.getAttributeValue(null, "value");
                    String attributeValueIgnorePrefix = XmlPullParserUtil.getAttributeValueIgnorePrefix(xmlPullParser, "default_KID");
                    if (!TextUtils.isEmpty(attributeValueIgnorePrefix) && !"00000000-0000-0000-0000-000000000000".equals(attributeValueIgnorePrefix)) {
                        String[] strArrSplit = attributeValueIgnorePrefix.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i = 0; i < strArrSplit.length; i++) {
                            uuidArr[i] = UUID.fromString(strArrSplit[i]);
                        }
                        uuid = C3219C.COMMON_PSSH_UUID;
                        byte[] bArrBuildPsshAtom = PsshAtomUtil.buildPsshAtom(uuid, uuidArr, null);
                        attributeValue2 = null;
                        BuildPsshAtom = bArrBuildPsshAtom;
                        break;
                    } else {
                        uuid = null;
                        str = null;
                        attributeValue2 = str;
                        BuildPsshAtom = str;
                        break;
                    }
                    break;
                default:
                    uuid = null;
                    attributeValue = null;
                    str = attributeValue;
                    attributeValue2 = str;
                    BuildPsshAtom = str;
                    break;
            }
        } else {
            uuid = null;
            attributeValue = null;
            str = attributeValue;
            attributeValue2 = str;
            BuildPsshAtom = str;
        }
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "ms:laurl")) {
                BuildPsshAtom = BuildPsshAtom;
                attributeValue2 = xmlPullParser.getAttributeValue(null, "licenseUrl");
            } else if (BuildPsshAtom == 0 && XmlPullParserUtil.isStartTagIgnorePrefix(xmlPullParser, "pssh") && xmlPullParser.next() == 4) {
                byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                UUID uuid2 = PsshAtomUtil.parseUuid(bArrDecode);
                if (uuid2 == null) {
                    Log.m17586w(TAG, "Skipping malformed cenc:pssh data");
                    uuid = uuid2;
                    BuildPsshAtom = 0;
                    attributeValue2 = attributeValue2;
                } else {
                    BuildPsshAtom = bArrDecode;
                    uuid = uuid2;
                    attributeValue2 = attributeValue2;
                }
            } else if (BuildPsshAtom == 0) {
                UUID uuid3 = C3219C.PLAYREADY_UUID;
                if (uuid3.equals(uuid) && XmlPullParserUtil.isStartTag(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    BuildPsshAtom = PsshAtomUtil.buildPsshAtom(uuid3, Base64.decode(xmlPullParser.getText(), 0));
                    attributeValue2 = attributeValue2;
                } else {
                    maybeSkipTag(xmlPullParser);
                    BuildPsshAtom = BuildPsshAtom;
                    attributeValue2 = attributeValue2;
                }
            } else {
                maybeSkipTag(xmlPullParser);
                BuildPsshAtom = BuildPsshAtom;
                attributeValue2 = attributeValue2;
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "ContentProtection"));
        return Pair.create(attributeValue, uuid != null ? new DrmInitData.SchemeData(uuid, attributeValue2, MimeTypes.VIDEO_MP4, BuildPsshAtom) : null);
    }

    public int parseContentType(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        return "text".equals(attributeValue) ? 3 : -1;
    }

    public int parseDashRoleSchemeValue(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "subtitle":
                return 128;
            case "description":
                return 512;
            case "enhanced-audio-intelligibility":
                return 2048;
            case "alternate":
                return 2;
            case "dub":
                return 16;
            case "main":
                return 1;
            case "sign":
                return 256;
            case "caption":
                return 64;
            case "commentary":
                return 8;
            case "emergency":
                return 32;
            case "supplementary":
                return 4;
            default:
                return 0;
        }
    }

    public Pair<Long, EventMessage> parseEvent(XmlPullParser xmlPullParser, String str, String str2, long j, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        long j2 = parseLong(xmlPullParser, "id", 0L);
        long j3 = parseLong(xmlPullParser, C5984j00.f14672z, C3219C.TIME_UNSET);
        long j4 = parseLong(xmlPullParser, "presentationTime", 0L);
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(j3, 1000L, j);
        long jScaleLargeTimestamp2 = Util.scaleLargeTimestamp(j4, 1000000L, j);
        String string = parseString(xmlPullParser, "messageData", null);
        byte[] eventObject = parseEventObject(xmlPullParser, byteArrayOutputStream);
        Long lValueOf = Long.valueOf(jScaleLargeTimestamp2);
        if (string != null) {
            eventObject = Util.getUtf8Bytes(string);
        }
        return Pair.create(lValueOf, buildEvent(str, str2, j2, jScaleLargeTimestamp, eventObject));
    }

    public byte[] parseEventObject(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, "UTF-8");
        while (true) {
            xmlPullParser.nextToken();
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "Event")) {
                xmlSerializerNewSerializer.flush();
                return byteArrayOutputStream.toByteArray();
            }
            switch (xmlPullParser.getEventType()) {
                case 0:
                    xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    xmlSerializerNewSerializer.endDocument();
                    break;
                case 2:
                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                        xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                    }
                    break;
                case 3:
                    xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
        }
    }

    public EventStream parseEventStream(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String string = parseString(xmlPullParser, "schemeIdUri", "");
        String string2 = parseString(xmlPullParser, "value", "");
        long j = parseLong(xmlPullParser, "timescale", 1L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Event")) {
                arrayList.add(parseEvent(xmlPullParser, string, string2, j, byteArrayOutputStream));
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "EventStream"));
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            Pair pair = (Pair) arrayList.get(i);
            jArr[i] = ((Long) pair.first).longValue();
            eventMessageArr[i] = (EventMessage) pair.second;
        }
        return buildEventStream(string, string2, j, jArr, eventMessageArr);
    }

    public RangedUri parseInitialization(XmlPullParser xmlPullParser) {
        return parseRangedUrl(xmlPullParser, "sourceURL", "range");
    }

    public String parseLabel(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return parseText(xmlPullParser, "Label");
    }

    public DashManifest parseMediaPresentationDescription(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        long dateTime = parseDateTime(xmlPullParser, "availabilityStartTime", C3219C.TIME_UNSET);
        long duration = parseDuration(xmlPullParser, "mediaPresentationDuration", C3219C.TIME_UNSET);
        long duration2 = parseDuration(xmlPullParser, "minBufferTime", C3219C.TIME_UNSET);
        boolean zEquals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long duration3 = zEquals ? parseDuration(xmlPullParser, "minimumUpdatePeriod", C3219C.TIME_UNSET) : -9223372036854775807L;
        long duration4 = zEquals ? parseDuration(xmlPullParser, "timeShiftBufferDepth", C3219C.TIME_UNSET) : -9223372036854775807L;
        long duration5 = zEquals ? parseDuration(xmlPullParser, "suggestedPresentationDelay", C3219C.TIME_UNSET) : -9223372036854775807L;
        long dateTime2 = parseDateTime(xmlPullParser, "publishTime", C3219C.TIME_UNSET);
        ArrayList arrayList = new ArrayList();
        Uri uri = null;
        long j = zEquals ? -9223372036854775807L : 0L;
        boolean z = false;
        boolean z2 = false;
        String baseUrl = str;
        ProgramInformation programInformation = null;
        UtcTimingElement utcTiming = null;
        while (true) {
            xmlPullParser.next();
            long j2 = duration4;
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "BaseURL")) {
                if (z) {
                    j = j;
                } else {
                    baseUrl = parseBaseUrl(xmlPullParser, baseUrl);
                    duration3 = duration3;
                    z = true;
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "ProgramInformation")) {
                duration3 = duration3;
                programInformation = parseProgramInformation(xmlPullParser);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "UTCTiming")) {
                duration3 = duration3;
                utcTiming = parseUtcTiming(xmlPullParser);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "Location")) {
                duration3 = duration3;
                uri = Uri.parse(xmlPullParser.nextText());
            } else if (!XmlPullParserUtil.isStartTag(xmlPullParser, "Period") || z2) {
                maybeSkipTag(xmlPullParser);
                j = j;
            } else {
                Pair<Period, Long> period = parsePeriod(xmlPullParser, baseUrl, j);
                long j3 = j;
                Period period2 = (Period) period.first;
                duration3 = duration3;
                if (period2.startMs != C3219C.TIME_UNSET) {
                    long jLongValue = ((Long) period.second).longValue();
                    long j4 = jLongValue == C3219C.TIME_UNSET ? C3219C.TIME_UNSET : period2.startMs + jLongValue;
                    arrayList.add(period2);
                    j = j4;
                } else {
                    if (!zEquals) {
                        throw new ParserException("Unable to determine start of period " + arrayList.size());
                    }
                    j = j3;
                    z2 = true;
                }
            }
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "MPD")) {
                if (duration == C3219C.TIME_UNSET) {
                    if (j != C3219C.TIME_UNSET) {
                        duration = j;
                    } else if (!zEquals) {
                        throw new ParserException("Unable to determine duration of static manifest.");
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new ParserException("No periods found.");
                }
                return buildMediaPresentationDescription(dateTime, duration, duration2, zEquals, duration3, j2, duration5, dateTime2, programInformation, utcTiming, uri, arrayList);
            }
            duration4 = j2;
            duration3 = duration3;
        }
    }

    public Pair<Period, Long> parsePeriod(XmlPullParser xmlPullParser, String str, long j) throws XmlPullParserException, IOException {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        long duration = parseDuration(xmlPullParser, "start", j);
        long duration2 = parseDuration(xmlPullParser, C5984j00.f14672z, C3219C.TIME_UNSET);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String baseUrl = str;
        SegmentBase segmentTemplate = null;
        Descriptor descriptor = null;
        boolean z = false;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "BaseURL")) {
                if (z) {
                    str2 = baseUrl;
                } else {
                    baseUrl = parseBaseUrl(xmlPullParser, baseUrl);
                    z = true;
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "AdaptationSet")) {
                str2 = baseUrl;
                arrayList.add(parseAdaptationSet(xmlPullParser, baseUrl, segmentTemplate, duration2));
            } else {
                str2 = baseUrl;
                if (XmlPullParserUtil.isStartTag(xmlPullParser, "EventStream")) {
                    arrayList2.add(parseEventStream(xmlPullParser));
                } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentBase")) {
                    segmentTemplate = parseSegmentBase(xmlPullParser, null);
                } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentList")) {
                    segmentTemplate = parseSegmentList(xmlPullParser, null, duration2);
                } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTemplate")) {
                    segmentTemplate = parseSegmentTemplate(xmlPullParser, null, Collections.emptyList(), duration2);
                } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "AssetIdentifier")) {
                    descriptor = parseDescriptor(xmlPullParser, "AssetIdentifier");
                } else {
                    maybeSkipTag(xmlPullParser);
                }
            }
            baseUrl = str2;
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "Period"));
        return Pair.create(buildPeriod(attributeValue, duration, arrayList, arrayList2, descriptor), Long.valueOf(duration2));
    }

    public ProgramInformation parseProgramInformation(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = null;
        String string = parseString(xmlPullParser, "moreInformationURL", null);
        String string2 = parseString(xmlPullParser, "lang", null);
        String strNextText2 = null;
        String strNextText3 = null;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, C1023Ps.f2619b)) {
                strNextText = xmlPullParser.nextText();
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "Source")) {
                strNextText2 = xmlPullParser.nextText();
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "Copyright")) {
                strNextText3 = xmlPullParser.nextText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
            String str = strNextText3;
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "ProgramInformation")) {
                return new ProgramInformation(strNextText, strNextText2, str, string, string2);
            }
            strNextText3 = str;
        }
    }

    public RangedUri parseRangedUrl(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
            }
            return buildRangedUri(attributeValue, j, j2);
        }
        j = 0;
        j2 = -1;
        return buildRangedUri(attributeValue, j, j2);
    }

    public RepresentationInfo parseRepresentation(XmlPullParser xmlPullParser, String str, @Nullable String str2, @Nullable String str3, int i, int i2, float f, int i3, int i4, @Nullable String str4, List<Descriptor> list, List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4, @Nullable SegmentBase segmentBase, long j) throws XmlPullParserException, IOException {
        String str5;
        SegmentBase segmentTemplate;
        String str6;
        String attributeValue = xmlPullParser.getAttributeValue(null, "id");
        int i5 = parseInt(xmlPullParser, "bandwidth", -1);
        String string = parseString(xmlPullParser, "mimeType", str2);
        String string2 = parseString(xmlPullParser, "codecs", str3);
        int i6 = parseInt(xmlPullParser, "width", i);
        int i7 = parseInt(xmlPullParser, "height", i2);
        float frameRate = parseFrameRate(xmlPullParser, f);
        int i8 = parseInt(xmlPullParser, "audioSamplingRate", i4);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(list3);
        ArrayList arrayList4 = new ArrayList(list4);
        int audioChannelConfiguration = i3;
        SegmentBase segmentBase2 = segmentBase;
        String str7 = null;
        boolean z = false;
        String baseUrl = str;
        while (true) {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "BaseURL")) {
                if (z) {
                    str5 = baseUrl;
                    i8 = i8;
                    i5 = i5;
                    audioChannelConfiguration = audioChannelConfiguration;
                    str6 = str5;
                } else {
                    baseUrl = parseBaseUrl(xmlPullParser, baseUrl);
                    z = true;
                    str6 = baseUrl;
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "AudioChannelConfiguration")) {
                audioChannelConfiguration = parseAudioChannelConfiguration(xmlPullParser);
                str6 = baseUrl;
                i8 = i8;
                i5 = i5;
            } else {
                if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentBase")) {
                    segmentBase2 = parseSegmentBase(xmlPullParser, (SegmentBase.SingleSegmentBase) segmentBase2);
                } else {
                    if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentList")) {
                        i8 = i8;
                        i5 = i5;
                        segmentTemplate = parseSegmentList(xmlPullParser, (SegmentBase.SegmentList) segmentBase2, j);
                    } else {
                        i8 = i8;
                        i5 = i5;
                        if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTemplate")) {
                            segmentTemplate = parseSegmentTemplate(xmlPullParser, (SegmentBase.SegmentTemplate) segmentBase2, list4, j);
                        } else {
                            if (XmlPullParserUtil.isStartTag(xmlPullParser, "ContentProtection")) {
                                Pair<String, DrmInitData.SchemeData> contentProtection = parseContentProtection(xmlPullParser);
                                str5 = baseUrl;
                                Object obj = contentProtection.first;
                                if (obj != null) {
                                    str7 = (String) obj;
                                }
                                Object obj2 = contentProtection.second;
                                if (obj2 != null) {
                                    arrayList.add(obj2);
                                }
                            } else {
                                str5 = baseUrl;
                                if (XmlPullParserUtil.isStartTag(xmlPullParser, "InbandEventStream")) {
                                    arrayList2.add(parseDescriptor(xmlPullParser, "InbandEventStream"));
                                } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "EssentialProperty")) {
                                    arrayList3.add(parseDescriptor(xmlPullParser, "EssentialProperty"));
                                } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SupplementalProperty")) {
                                    arrayList4.add(parseDescriptor(xmlPullParser, "SupplementalProperty"));
                                } else {
                                    maybeSkipTag(xmlPullParser);
                                }
                            }
                            audioChannelConfiguration = audioChannelConfiguration;
                            str6 = str5;
                        }
                    }
                    segmentBase2 = segmentTemplate;
                    audioChannelConfiguration = audioChannelConfiguration;
                }
                str6 = baseUrl;
            }
            if (XmlPullParserUtil.isEndTag(xmlPullParser, "Representation")) {
                break;
            }
            i8 = i8;
            baseUrl = str6;
            i5 = i5;
            audioChannelConfiguration = audioChannelConfiguration;
        }
        Format formatBuildFormat = buildFormat(attributeValue, string, i6, i7, frameRate, audioChannelConfiguration, i8, i5, str4, list, list2, string2, arrayList3, arrayList4);
        if (segmentBase2 == null) {
            segmentBase2 = new SegmentBase.SingleSegmentBase();
        }
        return new RepresentationInfo(formatBuildFormat, str6, segmentBase2, str7, arrayList, arrayList2, -1L);
    }

    public int parseRoleFlagsFromAccessibilityDescriptors(List<Descriptor> list) {
        int tvaAudioPurposeCsValue;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Descriptor descriptor = list.get(i2);
            if ("urn:mpeg:dash:role:2011".equalsIgnoreCase(descriptor.schemeIdUri)) {
                tvaAudioPurposeCsValue = parseDashRoleSchemeValue(descriptor.value);
            } else {
                if ("urn:tva:metadata:cs:AudioPurposeCS:2007".equalsIgnoreCase(descriptor.schemeIdUri)) {
                    tvaAudioPurposeCsValue = parseTvaAudioPurposeCsValue(descriptor.value);
                }
            }
            i |= tvaAudioPurposeCsValue;
        }
        return i;
    }

    public int parseRoleFlagsFromProperties(List<Descriptor> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if ("http://dashif.org/guidelines/trickmode".equalsIgnoreCase(list.get(i2).schemeIdUri)) {
                i = 16384;
            }
        }
        return i;
    }

    public int parseRoleFlagsFromRoleDescriptors(List<Descriptor> list) {
        int dashRoleSchemeValue = 0;
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if ("urn:mpeg:dash:role:2011".equalsIgnoreCase(descriptor.schemeIdUri)) {
                dashRoleSchemeValue |= parseDashRoleSchemeValue(descriptor.value);
            }
        }
        return dashRoleSchemeValue;
    }

    public SegmentBase.SingleSegmentBase parseSegmentBase(XmlPullParser xmlPullParser, @Nullable SegmentBase.SingleSegmentBase singleSegmentBase) throws XmlPullParserException, IOException {
        long j;
        long j2;
        long j3 = parseLong(xmlPullParser, "timescale", singleSegmentBase != null ? singleSegmentBase.timescale : 1L);
        long j4 = parseLong(xmlPullParser, "presentationTimeOffset", singleSegmentBase != null ? singleSegmentBase.presentationTimeOffset : 0L);
        long j5 = singleSegmentBase != null ? singleSegmentBase.indexStart : 0L;
        long j6 = singleSegmentBase != null ? singleSegmentBase.indexLength : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            j2 = Long.parseLong(strArrSplit[0]);
            j = (Long.parseLong(strArrSplit[1]) - j2) + 1;
        } else {
            j = j6;
            j2 = j5;
        }
        RangedUri initialization = singleSegmentBase != null ? singleSegmentBase.initialization : null;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                initialization = parseInitialization(xmlPullParser);
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentBase"));
        return buildSingleSegmentBase(initialization, j3, j4, j2, j);
    }

    public SegmentBase.SegmentList parseSegmentList(XmlPullParser xmlPullParser, @Nullable SegmentBase.SegmentList segmentList, long j) throws XmlPullParserException, IOException {
        long j2 = parseLong(xmlPullParser, "timescale", segmentList != null ? segmentList.timescale : 1L);
        long j3 = parseLong(xmlPullParser, "presentationTimeOffset", segmentList != null ? segmentList.presentationTimeOffset : 0L);
        long j4 = parseLong(xmlPullParser, C5984j00.f14672z, segmentList != null ? segmentList.duration : C3219C.TIME_UNSET);
        long j5 = parseLong(xmlPullParser, "startNumber", segmentList != null ? segmentList.startNumber : 1L);
        List<SegmentBase.SegmentTimelineElement> segmentTimeline = null;
        List<RangedUri> arrayList = null;
        RangedUri initialization = null;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                initialization = parseInitialization(xmlPullParser);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTimeline")) {
                segmentTimeline = parseSegmentTimeline(xmlPullParser, j2, j);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(parseSegmentUrl(xmlPullParser));
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentList"));
        if (segmentList != null) {
            if (initialization == null) {
                initialization = segmentList.initialization;
            }
            if (segmentTimeline == null) {
                segmentTimeline = segmentList.segmentTimeline;
            }
            if (arrayList == null) {
                arrayList = segmentList.mediaSegments;
            }
        }
        return buildSegmentList(initialization, j2, j3, j5, j4, segmentTimeline, arrayList);
    }

    public SegmentBase.SegmentTemplate parseSegmentTemplate(XmlPullParser xmlPullParser, @Nullable SegmentBase.SegmentTemplate segmentTemplate, List<Descriptor> list, long j) throws XmlPullParserException, IOException {
        long j2 = parseLong(xmlPullParser, "timescale", segmentTemplate != null ? segmentTemplate.timescale : 1L);
        long j3 = parseLong(xmlPullParser, "presentationTimeOffset", segmentTemplate != null ? segmentTemplate.presentationTimeOffset : 0L);
        long j4 = parseLong(xmlPullParser, C5984j00.f14672z, segmentTemplate != null ? segmentTemplate.duration : C3219C.TIME_UNSET);
        long j5 = parseLong(xmlPullParser, "startNumber", segmentTemplate != null ? segmentTemplate.startNumber : 1L);
        long lastSegmentNumberSupplementalProperty = parseLastSegmentNumberSupplementalProperty(list);
        List<SegmentBase.SegmentTimelineElement> segmentTimeline = null;
        UrlTemplate urlTemplate = parseUrlTemplate(xmlPullParser, "media", segmentTemplate != null ? segmentTemplate.mediaTemplate : null);
        UrlTemplate urlTemplate2 = parseUrlTemplate(xmlPullParser, "initialization", segmentTemplate != null ? segmentTemplate.initializationTemplate : null);
        RangedUri initialization = null;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "Initialization")) {
                initialization = parseInitialization(xmlPullParser);
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "SegmentTimeline")) {
                segmentTimeline = parseSegmentTimeline(xmlPullParser, j2, j);
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentTemplate"));
        if (segmentTemplate != null) {
            if (initialization == null) {
                initialization = segmentTemplate.initialization;
            }
            if (segmentTimeline == null) {
                segmentTimeline = segmentTemplate.segmentTimeline;
            }
        }
        return buildSegmentTemplate(initialization, j2, j3, j5, lastSegmentNumberSupplementalProperty, j4, segmentTimeline, urlTemplate2, urlTemplate);
    }

    public List<SegmentBase.SegmentTimelineElement> parseSegmentTimeline(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jAddSegmentTimelineElementsToList = 0;
        long j3 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "S")) {
                long j4 = parseLong(xmlPullParser, C5713xI.f19433h, C3219C.TIME_UNSET);
                if (z) {
                    jAddSegmentTimelineElementsToList = addSegmentTimelineElementsToList(arrayList, jAddSegmentTimelineElementsToList, j3, i, j4);
                }
                if (j4 == C3219C.TIME_UNSET) {
                    j4 = jAddSegmentTimelineElementsToList;
                }
                j3 = parseLong(xmlPullParser, "d", C3219C.TIME_UNSET);
                i = parseInt(xmlPullParser, Tailer.f15848j, 0);
                jAddSegmentTimelineElementsToList = j4;
                z = true;
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, "SegmentTimeline"));
        if (z) {
            addSegmentTimelineElementsToList(arrayList, jAddSegmentTimelineElementsToList, j3, i, Util.scaleLargeTimestamp(j2, j, 1000L));
        }
        return arrayList;
    }

    public RangedUri parseSegmentUrl(XmlPullParser xmlPullParser) {
        return parseRangedUrl(xmlPullParser, "media", "mediaRange");
    }

    public int parseSelectionFlagsFromRoleDescriptors(List<Descriptor> list) {
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if ("urn:mpeg:dash:role:2011".equalsIgnoreCase(descriptor.schemeIdUri) && "main".equals(descriptor.value)) {
                return 1;
            }
        }
        return 0;
    }

    public int parseTvaAudioPurposeCsValue(@Nullable String str) {
        if (str == null) {
            return 0;
        }
        byte b = -1;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    b = 0;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    b = 1;
                }
                break;
            case 51:
                if (str.equals(C4331f8.f13908k)) {
                    b = 2;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    b = 3;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    b = 4;
                }
                break;
        }
        switch (b) {
            case 0:
                return 512;
            case 1:
                return 2048;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    @Nullable
    public UrlTemplate parseUrlTemplate(XmlPullParser xmlPullParser, String str, @Nullable UrlTemplate urlTemplate) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? UrlTemplate.compile(attributeValue) : urlTemplate;
    }

    public UtcTimingElement parseUtcTiming(XmlPullParser xmlPullParser) {
        return buildUtcTimingElement(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }
}
