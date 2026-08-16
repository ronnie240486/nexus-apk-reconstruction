package com.google.android.exoplayer2.text.ttml;

import android.text.Layout;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.ColorParser;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.XmlPullParserUtil;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p000.C0060Av;
import p000.C0978P9;
import p000.C4843mz;
import p000.C5312rZ;
import p000.C5713xI;

/* JADX INFO: loaded from: classes2.dex */
public final class TtmlDecoder extends SimpleSubtitleDecoder {
    private static final String ATTR_BEGIN = "begin";
    private static final String ATTR_DURATION = "dur";
    private static final String ATTR_END = "end";
    private static final String ATTR_IMAGE = "backgroundImage";
    private static final String ATTR_REGION = "region";
    private static final String ATTR_STYLE = "style";
    private static final int DEFAULT_FRAME_RATE = 30;
    private static final String TAG = "TtmlDecoder";
    private static final String TTP = "http://www.w3.org/ns/ttml#parameter";
    private final XmlPullParserFactory xmlParserFactory;
    private static final Pattern CLOCK_TIME = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern OFFSET_TIME = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern FONT_SIZE = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    private static final Pattern PERCENTAGE_COORDINATES = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final Pattern PIXEL_COORDINATES = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final Pattern CELL_RESOLUTION = Pattern.compile("^(\\d+) (\\d+)$");
    private static final FrameAndTickRate DEFAULT_FRAME_AND_TICK_RATE = new FrameAndTickRate(30.0f, 1, 1);
    private static final CellResolution DEFAULT_CELL_RESOLUTION = new CellResolution(32, 15);

    public static final class CellResolution {
        final int columns;
        final int rows;

        public CellResolution(int i, int i2) {
            this.columns = i;
            this.rows = i2;
        }
    }

    public static final class FrameAndTickRate {
        final float effectiveFrameRate;
        final int subFrameRate;
        final int tickRate;

        public FrameAndTickRate(float f, int i, int i2) {
            this.effectiveFrameRate = f;
            this.subFrameRate = i;
            this.tickRate = i2;
        }
    }

    public static final class TtsExtent {
        final int height;
        final int width;

        public TtsExtent(int i, int i2) {
            this.width = i;
            this.height = i2;
        }
    }

    public TtmlDecoder() {
        super(TAG);
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.xmlParserFactory = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    private TtmlStyle createIfNull(TtmlStyle ttmlStyle) {
        return ttmlStyle == null ? new TtmlStyle() : ttmlStyle;
    }

    private static boolean isSupportedTag(String str) {
        return str.equals(TtmlNode.TAG_TT) || str.equals(TtmlNode.TAG_HEAD) || str.equals(TtmlNode.TAG_BODY) || str.equals(TtmlNode.TAG_DIV) || str.equals(TtmlNode.TAG_P) || str.equals(TtmlNode.TAG_SPAN) || str.equals(TtmlNode.TAG_BR) || str.equals("style") || str.equals(TtmlNode.TAG_STYLING) || str.equals(TtmlNode.TAG_LAYOUT) || str.equals("region") || str.equals(TtmlNode.TAG_METADATA) || str.equals("image") || str.equals("data") || str.equals(TtmlNode.TAG_INFORMATION);
    }

    private CellResolution parseCellResolution(XmlPullParser xmlPullParser, CellResolution cellResolution) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue(TTP, "cellResolution");
        if (attributeValue == null) {
            return cellResolution;
        }
        Matcher matcher = CELL_RESOLUTION.matcher(attributeValue);
        if (matcher.matches()) {
            try {
                int i = Integer.parseInt(matcher.group(1));
                int i2 = Integer.parseInt(matcher.group(2));
                if (i != 0 && i2 != 0) {
                    return new CellResolution(i, i2);
                }
                throw new SubtitleDecoderException("Invalid cell resolution " + i + " " + i2);
            } catch (NumberFormatException unused) {
            }
        }
        Log.m17586w(TAG, "Ignoring malformed cell resolution: ".concat(attributeValue));
        return cellResolution;
    }

    private static void parseFontSize(String str, TtmlStyle ttmlStyle) throws SubtitleDecoderException {
        Matcher matcher;
        String[] strArrSplit = Util.split(str, "\\s+");
        if (strArrSplit.length == 1) {
            matcher = FONT_SIZE.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException(C0978P9.m4377a(new StringBuilder("Invalid number of entries for fontSize: "), strArrSplit.length, "."));
            }
            matcher = FONT_SIZE.matcher(strArrSplit[1]);
            Log.m17586w(TAG, "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(C0060Av.m278a("Invalid expression for fontSize: '", str, "'."));
        }
        String strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                ttmlStyle.setFontSizeUnit(3);
                break;
            case "em":
                ttmlStyle.setFontSizeUnit(2);
                break;
            case "px":
                ttmlStyle.setFontSizeUnit(1);
                break;
            default:
                throw new SubtitleDecoderException(C0060Av.m278a("Invalid unit for fontSize: '", strGroup, "'."));
        }
        ttmlStyle.setFontSize(Float.valueOf(matcher.group(1)).floatValue());
    }

    private FrameAndTickRate parseFrameAndTickRates(XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue(TTP, "frameRate");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue(TTP, "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] strArrSplit = Util.split(attributeValue2, " ");
            if (strArrSplit.length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
        } else {
            f = 1.0f;
        }
        FrameAndTickRate frameAndTickRate = DEFAULT_FRAME_AND_TICK_RATE;
        int i2 = frameAndTickRate.subFrameRate;
        String attributeValue3 = xmlPullParser.getAttributeValue(TTP, "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = frameAndTickRate.tickRate;
        String attributeValue4 = xmlPullParser.getAttributeValue(TTP, "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new FrameAndTickRate(i * f, i2, i3);
    }

    private Map<String, TtmlStyle> parseHeader(XmlPullParser xmlPullParser, Map<String, TtmlStyle> map, CellResolution cellResolution, TtsExtent ttsExtent, Map<String, TtmlRegion> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "style")) {
                String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "style");
                TtmlStyle styleAttributes = parseStyleAttributes(xmlPullParser, new TtmlStyle());
                if (attributeValue != null) {
                    for (String str : parseStyleIds(attributeValue)) {
                        styleAttributes.chain(map.get(str));
                    }
                }
                if (styleAttributes.getId() != null) {
                    map.put(styleAttributes.getId(), styleAttributes);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "region")) {
                TtmlRegion regionAttributes = parseRegionAttributes(xmlPullParser, cellResolution, ttsExtent);
                if (regionAttributes != null) {
                    map2.put(regionAttributes.f11128id, regionAttributes);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, TtmlNode.TAG_METADATA)) {
                parseMetadata(xmlPullParser, map3);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, TtmlNode.TAG_HEAD));
        return map;
    }

    private void parseMetadata(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String attributeValue;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "image") && (attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "id")) != null) {
                map.put(attributeValue, xmlPullParser.nextText());
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, TtmlNode.TAG_METADATA));
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00e4  */
    private TtmlNode parseNode(XmlPullParser xmlPullParser, TtmlNode ttmlNode, Map<String, TtmlRegion> map, FrameAndTickRate frameAndTickRate) throws SubtitleDecoderException {
        long j;
        int attributeCount = xmlPullParser.getAttributeCount();
        TtmlStyle styleAttributes = parseStyleAttributes(xmlPullParser, null);
        String[] strArr = null;
        String strSubstring = null;
        long timeExpression = -9223372036854775807L;
        long timeExpression2 = -9223372036854775807L;
        long timeExpression3 = -9223372036854775807L;
        String str = "";
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                    break;
                case "dur":
                    timeExpression3 = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case "end":
                    timeExpression2 = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case "begin":
                    timeExpression = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case "style":
                    String[] styleIds = parseStyleIds(attributeValue);
                    if (styleIds.length > 0) {
                        strArr = styleIds;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        strSubstring = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (ttmlNode != null) {
            long j2 = ttmlNode.startTimeUs;
            if (j2 != C3219C.TIME_UNSET) {
                if (timeExpression != C3219C.TIME_UNSET) {
                    timeExpression += j2;
                }
                if (timeExpression2 != C3219C.TIME_UNSET) {
                    timeExpression2 += j2;
                }
            }
        }
        if (timeExpression2 != C3219C.TIME_UNSET) {
            j = timeExpression2;
        } else if (timeExpression3 != C3219C.TIME_UNSET) {
            j = timeExpression + timeExpression3;
        } else if (ttmlNode != null) {
            long j3 = ttmlNode.endTimeUs;
            if (j3 != C3219C.TIME_UNSET) {
                j = j3;
            } else {
                j = timeExpression2;
            }
        } else {
            j = timeExpression2;
        }
        return TtmlNode.buildNode(xmlPullParser.getName(), timeExpression, j, styleAttributes, strArr, str, strSubstring);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00fa  */
    private TtmlRegion parseRegionAttributes(XmlPullParser xmlPullParser, CellResolution cellResolution, TtsExtent ttsExtent) {
        String strConcat;
        String str;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i;
        String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "id");
        if (attributeValue == null) {
            return null;
        }
        String attributeValue2 = XmlPullParserUtil.getAttributeValue(xmlPullParser, "origin");
        if (attributeValue2 != null) {
            Pattern pattern = PERCENTAGE_COORDINATES;
            Matcher matcher = pattern.matcher(attributeValue2);
            Pattern pattern2 = PIXEL_COORDINATES;
            Matcher matcher2 = pattern2.matcher(attributeValue2);
            try {
                if (matcher.matches()) {
                    float f6 = Float.parseFloat(matcher.group(1)) / 100.0f;
                    f2 = Float.parseFloat(matcher.group(2)) / 100.0f;
                    f = f6;
                } else {
                    if (!matcher2.matches()) {
                        str = "Ignoring region with unsupported origin: ";
                    } else if (ttsExtent == null) {
                        strConcat = "Ignoring region with missing tts:extent: ".concat(attributeValue2);
                    } else {
                        int i2 = Integer.parseInt(matcher2.group(1));
                        int i3 = Integer.parseInt(matcher2.group(2));
                        f = i2 / ttsExtent.width;
                        f2 = i3 / ttsExtent.height;
                    }
                    strConcat = str.concat(attributeValue2);
                }
                String attributeValue3 = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
                if (attributeValue3 != null) {
                    Matcher matcher3 = pattern.matcher(attributeValue3);
                    Matcher matcher4 = pattern2.matcher(attributeValue3);
                    if (matcher3.matches()) {
                        f3 = Float.parseFloat(matcher3.group(1)) / 100.0f;
                        f4 = Float.parseFloat(matcher3.group(2)) / 100.0f;
                    } else if (matcher4.matches()) {
                        if (ttsExtent != null) {
                            int i4 = Integer.parseInt(matcher4.group(1));
                            int i5 = Integer.parseInt(matcher4.group(2));
                            f3 = i4 / ttsExtent.width;
                            f4 = i5 / ttsExtent.height;
                        }
                        strConcat = "Ignoring region with missing tts:extent: ".concat(attributeValue2);
                    } else {
                        str = "Ignoring region with unsupported extent: ";
                        strConcat = str.concat(attributeValue2);
                    }
                    String attributeValue4 = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                    if (attributeValue4 != null) {
                        String lowerInvariant = Util.toLowerInvariant(attributeValue4);
                        lowerInvariant.getClass();
                        if (lowerInvariant.equals(TtmlNode.CENTER)) {
                            f5 = (f4 / 2.0f) + f2;
                            i = 1;
                        } else if (lowerInvariant.equals("after")) {
                            f5 = f2 + f4;
                            i = 2;
                        } else {
                            f5 = f2;
                            i = 0;
                        }
                    } else {
                        f5 = f2;
                        i = 0;
                    }
                    return new TtmlRegion(attributeValue, f, f5, 0, i, f3, f4, 1, 1.0f / cellResolution.rows);
                }
                strConcat = "Ignoring region without an extent";
            } catch (NumberFormatException unused) {
                strConcat = "Ignoring region with malformed origin: ".concat(attributeValue2);
            }
        } else {
            strConcat = "Ignoring region without an origin";
        }
        Log.m17586w(TAG, strConcat);
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:6:0x0021  */
    /* JADX WARN: Code duplicated, block: B:88:0x0159  */
    private TtmlStyle parseStyleAttributes(XmlPullParser xmlPullParser, TtmlStyle ttmlStyle) {
        String str;
        TtmlStyle ttmlStyleCreateIfNull;
        Layout.Alignment alignment;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            attributeName.getClass();
            switch (attributeName) {
                case "fontStyle":
                    ttmlStyle = createIfNull(ttmlStyle).setItalic(TtmlNode.ITALIC.equalsIgnoreCase(attributeValue));
                    continue;
                    break;
                case "fontFamily":
                    ttmlStyle = createIfNull(ttmlStyle).setFontFamily(attributeValue);
                    continue;
                    break;
                case "textAlign":
                    String lowerInvariant = Util.toLowerInvariant(attributeValue);
                    lowerInvariant.getClass();
                    switch (lowerInvariant) {
                        case "center":
                            ttmlStyleCreateIfNull = createIfNull(ttmlStyle);
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            ttmlStyleCreateIfNull = createIfNull(ttmlStyle);
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            ttmlStyleCreateIfNull = createIfNull(ttmlStyle);
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                        default:
                            continue;
                            break;
                    }
                    ttmlStyle = ttmlStyleCreateIfNull.setTextAlign(alignment);
                    continue;
                    break;
                case "textDecoration":
                    String lowerInvariant2 = Util.toLowerInvariant(attributeValue);
                    lowerInvariant2.getClass();
                    switch (lowerInvariant2) {
                        case "nounderline":
                            ttmlStyle = createIfNull(ttmlStyle).setUnderline(false);
                            break;
                        case "underline":
                            ttmlStyle = createIfNull(ttmlStyle).setUnderline(true);
                            break;
                        case "nolinethrough":
                            ttmlStyle = createIfNull(ttmlStyle).setLinethrough(false);
                            break;
                        case "linethrough":
                            ttmlStyle = createIfNull(ttmlStyle).setLinethrough(true);
                            continue;
                            break;
                    }
                    break;
                case "fontWeight":
                    ttmlStyle = createIfNull(ttmlStyle).setBold(TtmlNode.BOLD.equalsIgnoreCase(attributeValue));
                    continue;
                    break;
                case "id":
                    if ("style".equals(xmlPullParser.getName())) {
                        ttmlStyle = createIfNull(ttmlStyle).setId(attributeValue);
                    } else {
                        continue;
                    }
                    break;
                case "color":
                    ttmlStyle = createIfNull(ttmlStyle);
                    try {
                        ttmlStyle.setFontColor(ColorParser.parseTtmlColor(attributeValue));
                        continue;
                    } catch (IllegalArgumentException unused) {
                        str = "Failed parsing color value: ";
                        C4843mz.m22258a(str, attributeValue, TAG);
                    }
                    break;
                case "fontSize":
                    try {
                        ttmlStyle = createIfNull(ttmlStyle);
                        parseFontSize(attributeValue, ttmlStyle);
                        continue;
                    } catch (SubtitleDecoderException unused2) {
                        str = "Failed parsing fontSize value: ";
                        C4843mz.m22258a(str, attributeValue, TAG);
                    }
                    break;
                case "backgroundColor":
                    ttmlStyle = createIfNull(ttmlStyle);
                    try {
                        ttmlStyle.setBackgroundColor(ColorParser.parseTtmlColor(attributeValue));
                        continue;
                    } catch (IllegalArgumentException unused3) {
                        str = "Failed parsing background value: ";
                        C4843mz.m22258a(str, attributeValue, TAG);
                    }
                    break;
                default:
                    continue;
                    break;
            }
            C4843mz.m22258a(str, attributeValue, TAG);
        }
        return ttmlStyle;
    }

    private String[] parseStyleIds(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : Util.split(strTrim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x00aa  */
    /* JADX WARN: Failed to find 'out' block for switch in B:41:0x00e0. Please report as an issue. */
    private static long parseTimeExpression(String str, FrameAndTickRate frameAndTickRate) throws SubtitleDecoderException {
        double d;
        double d2;
        byte b = 4;
        Matcher matcher = CLOCK_TIME.matcher(str);
        if (matcher.matches()) {
            double d3 = Long.parseLong(matcher.group(1)) * 3600;
            double d4 = Long.parseLong(matcher.group(2)) * 60;
            Double.isNaN(d3);
            Double.isNaN(d4);
            double d5 = d3 + d4;
            double d6 = Long.parseLong(matcher.group(3));
            Double.isNaN(d6);
            double d7 = d5 + d6;
            String strGroup = matcher.group(4);
            double d8 = 0.0d;
            double d9 = d7 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d);
            String strGroup2 = matcher.group(5);
            double d10 = d9 + (strGroup2 != null ? Long.parseLong(strGroup2) / frameAndTickRate.effectiveFrameRate : 0.0d);
            String strGroup3 = matcher.group(6);
            if (strGroup3 != null) {
                double d11 = Long.parseLong(strGroup3);
                double d12 = frameAndTickRate.subFrameRate;
                Double.isNaN(d11);
                Double.isNaN(d12);
                double d13 = frameAndTickRate.effectiveFrameRate;
                Double.isNaN(d13);
                d8 = (d11 / d12) / d13;
            }
            return (long) ((d10 + d8) * 1000000.0d);
        }
        Matcher matcher2 = OFFSET_TIME.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException(C5312rZ.m27869a("Malformed time expression: ", str));
        }
        double d14 = Double.parseDouble(matcher2.group(1));
        String strGroup4 = matcher2.group(2);
        strGroup4.getClass();
        switch (strGroup4.hashCode()) {
            case 102:
                if (!strGroup4.equals("f")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 104:
                if (!strGroup4.equals("h")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 109:
                if (!strGroup4.equals("m")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 116:
                if (!strGroup4.equals(C5713xI.f19433h)) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 3494:
                if (!strGroup4.equals("ms")) {
                    b = -1;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                d = frameAndTickRate.effectiveFrameRate;
                Double.isNaN(d);
                d14 /= d;
                break;
            case 1:
                d2 = 3600.0d;
                d14 *= d2;
                break;
            case 2:
                d2 = 60.0d;
                d14 *= d2;
                break;
            case 3:
                d = frameAndTickRate.tickRate;
                Double.isNaN(d);
                d14 /= d;
                break;
            case 4:
                d = 1000.0d;
                d14 /= d;
                break;
        }
        return (long) (d14 * 1000000.0d);
    }

    private TtsExtent parseTtsExtent(XmlPullParser xmlPullParser) {
        String str;
        String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (attributeValue == null) {
            return null;
        }
        Matcher matcher = PIXEL_COORDINATES.matcher(attributeValue);
        if (matcher.matches()) {
            try {
                return new TtsExtent(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)));
            } catch (NumberFormatException unused) {
                str = "Ignoring malformed tts extent: ";
            }
        } else {
            str = "Ignoring non-pixel tts extent: ";
        }
        Log.m17586w(TAG, str.concat(attributeValue));
        return null;
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public Subtitle decode(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        TtmlSubtitle ttmlSubtitle;
        FrameAndTickRate frameAndTickRate;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.xmlParserFactory.newPullParser();
            Map<String, TtmlStyle> map = new HashMap<>();
            HashMap map2 = new HashMap();
            Map<String, String> map3 = new HashMap<>();
            TtsExtent ttsExtent = null;
            map2.put("", new TtmlRegion(null));
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            FrameAndTickRate frameAndTickRates = DEFAULT_FRAME_AND_TICK_RATE;
            CellResolution cellResolution = DEFAULT_CELL_RESOLUTION;
            TtmlSubtitle ttmlSubtitle2 = null;
            int i2 = 0;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                TtmlNode ttmlNode = (TtmlNode) arrayDeque.peek();
                if (i2 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if (TtmlNode.TAG_TT.equals(name)) {
                            frameAndTickRates = parseFrameAndTickRates(xmlPullParserNewPullParser);
                            cellResolution = parseCellResolution(xmlPullParserNewPullParser, DEFAULT_CELL_RESOLUTION);
                            ttsExtent = parseTtsExtent(xmlPullParserNewPullParser);
                        }
                        TtsExtent ttsExtent2 = ttsExtent;
                        FrameAndTickRate frameAndTickRate2 = frameAndTickRates;
                        CellResolution cellResolution2 = cellResolution;
                        if (isSupportedTag(name)) {
                            if (TtmlNode.TAG_HEAD.equals(name)) {
                                ttmlSubtitle = ttmlSubtitle2;
                                frameAndTickRate = frameAndTickRate2;
                                parseHeader(xmlPullParserNewPullParser, map, cellResolution2, ttsExtent2, map2, map3);
                            } else {
                                ttmlSubtitle = ttmlSubtitle2;
                                frameAndTickRate = frameAndTickRate2;
                                try {
                                    TtmlNode node = parseNode(xmlPullParserNewPullParser, ttmlNode, map2, frameAndTickRate);
                                    arrayDeque.push(node);
                                    if (ttmlNode != null) {
                                        ttmlNode.addChild(node);
                                    }
                                } catch (SubtitleDecoderException e) {
                                    Log.m17587w(TAG, "Suppressing parser error", e);
                                    i2++;
                                }
                            }
                            frameAndTickRates = frameAndTickRate;
                            ttsExtent = ttsExtent2;
                            cellResolution = cellResolution2;
                        } else {
                            Log.m17584i(TAG, "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            i2++;
                            frameAndTickRates = frameAndTickRate2;
                            ttsExtent = ttsExtent2;
                            cellResolution = cellResolution2;
                        }
                    } else {
                        ttmlSubtitle = ttmlSubtitle2;
                        if (eventType == 4) {
                            ttmlNode.addChild(TtmlNode.buildTextNode(xmlPullParserNewPullParser.getText()));
                        } else if (eventType == 3) {
                            ttmlSubtitle2 = xmlPullParserNewPullParser.getName().equals(TtmlNode.TAG_TT) ? new TtmlSubtitle((TtmlNode) arrayDeque.peek(), map, map2, map3) : ttmlSubtitle;
                            arrayDeque.pop();
                        }
                    }
                    xmlPullParserNewPullParser.next();
                } else {
                    ttmlSubtitle = ttmlSubtitle2;
                    if (eventType == 2) {
                        i2++;
                    } else if (eventType == 3) {
                        i2--;
                    }
                }
                ttmlSubtitle2 = ttmlSubtitle;
                xmlPullParserNewPullParser.next();
            }
            return ttmlSubtitle2;
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new SubtitleDecoderException("Unable to decode source", e3);
        }
    }
}
