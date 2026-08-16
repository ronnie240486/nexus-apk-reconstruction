package com.google.android.exoplayer2.text.webvtt;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.p013io.IOUtils;
import p000.C4615jV;
import p000.C5984j00;

/* JADX INFO: loaded from: classes2.dex */
public final class WebvttCueParser {
    private static final char CHAR_AMPERSAND = '&';
    private static final char CHAR_GREATER_THAN = '>';
    private static final char CHAR_LESS_THAN = '<';
    private static final char CHAR_SEMI_COLON = ';';
    private static final char CHAR_SLASH = '/';
    private static final char CHAR_SPACE = ' ';
    public static final Pattern CUE_HEADER_PATTERN = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern CUE_SETTING_PATTERN = Pattern.compile("(\\S+?):(\\S+)");
    private static final String ENTITY_AMPERSAND = "amp";
    private static final String ENTITY_GREATER_THAN = "gt";
    private static final String ENTITY_LESS_THAN = "lt";
    private static final String ENTITY_NON_BREAK_SPACE = "nbsp";
    private static final int STYLE_BOLD = 1;
    private static final int STYLE_ITALIC = 2;
    private static final String TAG = "WebvttCueParser";
    private static final String TAG_BOLD = "b";
    private static final String TAG_CLASS = "c";
    private static final String TAG_ITALIC = "i";
    private static final String TAG_LANG = "lang";
    private static final String TAG_UNDERLINE = "u";
    private static final String TAG_VOICE = "v";
    private final StringBuilder textBuilder = new StringBuilder();

    public static final class StartTag {
        private static final String[] NO_CLASSES = new String[0];
        public final String[] classes;
        public final String name;
        public final int position;
        public final String voice;

        private StartTag(String str, int i, String str2, String[] strArr) {
            this.position = i;
            this.name = str;
            this.voice = str2;
            this.classes = strArr;
        }

        public static StartTag buildStartTag(String str, int i) {
            String str2;
            String strTrim = str.trim();
            Assertions.checkArgument(!strTrim.isEmpty());
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf == -1) {
                str2 = "";
            } else {
                String strTrim2 = strTrim.substring(iIndexOf).trim();
                strTrim = strTrim.substring(0, iIndexOf);
                str2 = strTrim2;
            }
            String[] strArrSplit = Util.split(strTrim, "\\.");
            return new StartTag(strArrSplit[0], i, str2, strArrSplit.length > 1 ? (String[]) Util.nullSafeArrayCopyOfRange(strArrSplit, 1, strArrSplit.length) : NO_CLASSES);
        }

        public static StartTag buildWholeCueVirtualTag() {
            return new StartTag("", 0, "", new String[0]);
        }
    }

    public static final class StyleMatch implements Comparable<StyleMatch> {
        public final int score;
        public final WebvttCssStyle style;

        public StyleMatch(int i, WebvttCssStyle webvttCssStyle) {
            this.score = i;
            this.style = webvttCssStyle;
        }

        @Override // java.lang.Comparable
        public int compareTo(@NonNull StyleMatch styleMatch) {
            return this.score - styleMatch.score;
        }
    }

    private static void applyEntity(String str, SpannableStringBuilder spannableStringBuilder) {
        char c;
        str.getClass();
        switch (str) {
            case "gt":
                c = '>';
                break;
            case "lt":
                c = '<';
                break;
            case "amp":
                c = '&';
                break;
            case "nbsp":
                c = CHAR_SPACE;
                break;
            default:
                Log.m17586w(TAG, "ignoring unsupported entity: '&" + str + ";'");
                return;
        }
        spannableStringBuilder.append(c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x008d A[LOOP:0: B:40:0x008b->B:41:0x008d, LOOP_END] */
    private static void applySpansForTag(@Nullable String str, StartTag startTag, SpannableStringBuilder spannableStringBuilder, List<WebvttCssStyle> list, List<StyleMatch> list2) {
        int size;
        Object styleSpan;
        int i = startTag.position;
        int length = spannableStringBuilder.length();
        String str2 = startTag.name;
        str2.getClass();
        switch (str2) {
            case "":
            case "c":
            case "v":
            case "lang":
                list2.clear();
                getApplicableStyles(list, str, startTag, list2);
                size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    applyStyleToText(spannableStringBuilder, list2.get(i2).style, i, length);
                }
                break;
            case "b":
                styleSpan = new StyleSpan(1);
                spannableStringBuilder.setSpan(styleSpan, i, length, 33);
                list2.clear();
                getApplicableStyles(list, str, startTag, list2);
                size = list2.size();
                while (i2 < size) {
                    applyStyleToText(spannableStringBuilder, list2.get(i2).style, i, length);
                }
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                list2.clear();
                getApplicableStyles(list, str, startTag, list2);
                size = list2.size();
                while (i2 < size) {
                    applyStyleToText(spannableStringBuilder, list2.get(i2).style, i, length);
                }
                break;
            case "u":
                styleSpan = new UnderlineSpan();
                spannableStringBuilder.setSpan(styleSpan, i, length, 33);
                list2.clear();
                getApplicableStyles(list, str, startTag, list2);
                size = list2.size();
                while (i2 < size) {
                    applyStyleToText(spannableStringBuilder, list2.get(i2).style, i, length);
                }
                break;
        }
    }

    private static void applyStyleToText(SpannableStringBuilder spannableStringBuilder, WebvttCssStyle webvttCssStyle, int i, int i2) {
        Object absoluteSizeSpan;
        if (webvttCssStyle == null) {
            return;
        }
        if (webvttCssStyle.getStyle() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(webvttCssStyle.getStyle()), i, i2, 33);
        }
        if (webvttCssStyle.isLinethrough()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (webvttCssStyle.isUnderline()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (webvttCssStyle.hasFontColor()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(webvttCssStyle.getFontColor()), i, i2, 33);
        }
        if (webvttCssStyle.hasBackgroundColor()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(webvttCssStyle.getBackgroundColor()), i, i2, 33);
        }
        if (webvttCssStyle.getFontFamily() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(webvttCssStyle.getFontFamily()), i, i2, 33);
        }
        Layout.Alignment textAlign = webvttCssStyle.getTextAlign();
        if (textAlign != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(textAlign), i, i2, 33);
        }
        int fontSizeUnit = webvttCssStyle.getFontSizeUnit();
        if (fontSizeUnit == 1) {
            absoluteSizeSpan = new AbsoluteSizeSpan((int) webvttCssStyle.getFontSize(), true);
        } else if (fontSizeUnit == 2) {
            absoluteSizeSpan = new RelativeSizeSpan(webvttCssStyle.getFontSize());
        } else if (fontSizeUnit != 3) {
            return;
        } else {
            absoluteSizeSpan = new RelativeSizeSpan(webvttCssStyle.getFontSize() / 100.0f);
        }
        spannableStringBuilder.setSpan(absoluteSizeSpan, i, i2, 33);
    }

    private static int findEndOfTag(String str, int i) {
        int iIndexOf = str.indexOf(62, i);
        return iIndexOf == -1 ? str.length() : iIndexOf + 1;
    }

    private static void getApplicableStyles(List<WebvttCssStyle> list, @Nullable String str, StartTag startTag, List<StyleMatch> list2) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            WebvttCssStyle webvttCssStyle = list.get(i);
            int specificityScore = webvttCssStyle.getSpecificityScore(str, startTag.name, startTag.classes, startTag.voice);
            if (specificityScore > 0) {
                list2.add(new StyleMatch(specificityScore, webvttCssStyle));
            }
        }
        Collections.sort(list2);
    }

    private static String getTagName(String str) {
        String strTrim = str.trim();
        Assertions.checkArgument(!strTrim.isEmpty());
        return Util.splitAtFirst(strTrim, "[ \\.]")[0];
    }

    private static boolean isSupportedTag(String str) {
        str.getClass();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "lang":
                return true;
            default:
                return false;
        }
    }

    public static void parseCueSettingsList(String str, WebvttCue.Builder builder) {
        Matcher matcher = CUE_SETTING_PATTERN.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            try {
                if ("line".equals(strGroup)) {
                    parseLineAttribute(strGroup2, builder);
                } else if ("align".equals(strGroup)) {
                    builder.setTextAlignment(parseTextAlignment(strGroup2));
                } else if (C5984j00.f14639a1.equals(strGroup)) {
                    parsePositionAttribute(strGroup2, builder);
                } else if (C4615jV.f14789c.equals(strGroup)) {
                    builder.setWidth(WebvttParserUtil.parsePercentage(strGroup2));
                } else {
                    Log.m17586w(TAG, "Unknown cue setting " + strGroup + ":" + strGroup2);
                }
            } catch (NumberFormatException unused) {
                Log.m17586w(TAG, "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static void parseCueText(@Nullable String str, String str2, WebvttCue.Builder builder, List<WebvttCssStyle> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    applyEntity(str2.substring(i, iIndexOf), spannableStringBuilder);
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i++;
            } else {
                int iFindEndOfTag = i + 1;
                if (iFindEndOfTag < str2.length()) {
                    boolean z = str2.charAt(iFindEndOfTag) == '/';
                    iFindEndOfTag = findEndOfTag(str2, iFindEndOfTag);
                    int i2 = iFindEndOfTag - 2;
                    boolean z2 = str2.charAt(i2) == '/';
                    int i3 = i + (z ? 2 : 1);
                    if (!z2) {
                        i2 = iFindEndOfTag - 1;
                    }
                    String strSubstring = str2.substring(i3, i2);
                    if (!strSubstring.trim().isEmpty()) {
                        String tagName = getTagName(strSubstring);
                        if (isSupportedTag(tagName)) {
                            if (z) {
                                while (!arrayDeque.isEmpty()) {
                                    StartTag startTag = (StartTag) arrayDeque.pop();
                                    applySpansForTag(str, startTag, spannableStringBuilder, list, arrayList);
                                    if (startTag.name.equals(tagName)) {
                                        break;
                                    }
                                }
                            } else if (!z2) {
                                arrayDeque.push(StartTag.buildStartTag(strSubstring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i = iFindEndOfTag;
            }
        }
        while (!arrayDeque.isEmpty()) {
            applySpansForTag(str, (StartTag) arrayDeque.pop(), spannableStringBuilder, list, arrayList);
        }
        applySpansForTag(str, StartTag.buildWholeCueVirtualTag(), spannableStringBuilder, list, arrayList);
        builder.setText(spannableStringBuilder);
    }

    private static void parseLineAttribute(String str, WebvttCue.Builder builder) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            builder.setLineAnchor(parsePositionAnchor(str.substring(iIndexOf + 1)));
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            builder.setLine(WebvttParserUtil.parsePercentage(str)).setLineType(0);
            return;
        }
        int i = Integer.parseInt(str);
        if (i < 0) {
            i--;
        }
        builder.setLine(i).setLineType(1);
    }

    private static int parsePositionAnchor(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                Log.m17586w(TAG, "Invalid anchor value: ".concat(str));
                return Integer.MIN_VALUE;
        }
    }

    private static void parsePositionAttribute(String str, WebvttCue.Builder builder) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            builder.setPositionAnchor(parsePositionAnchor(str.substring(iIndexOf + 1)));
            str = str.substring(0, iIndexOf);
        }
        builder.setPosition(WebvttParserUtil.parsePercentage(str));
    }

    private static int parseTextAlignment(String str) {
        str.getClass();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                Log.m17586w(TAG, "Invalid alignment value: ".concat(str));
                return 2;
        }
    }

    public boolean parseCue(ParsableByteArray parsableByteArray, WebvttCue.Builder builder, List<WebvttCssStyle> list) {
        String line = parsableByteArray.readLine();
        if (line == null) {
            return false;
        }
        Pattern pattern = CUE_HEADER_PATTERN;
        Matcher matcher = pattern.matcher(line);
        if (matcher.matches()) {
            return parseCue(null, matcher, parsableByteArray, builder, this.textBuilder, list);
        }
        String line2 = parsableByteArray.readLine();
        if (line2 == null) {
            return false;
        }
        Matcher matcher2 = pattern.matcher(line2);
        if (matcher2.matches()) {
            return parseCue(line.trim(), matcher2, parsableByteArray, builder, this.textBuilder, list);
        }
        return false;
    }

    private static boolean parseCue(@Nullable String str, Matcher matcher, ParsableByteArray parsableByteArray, WebvttCue.Builder builder, StringBuilder sb, List<WebvttCssStyle> list) {
        try {
            builder.setStartTime(WebvttParserUtil.parseTimestampUs(matcher.group(1))).setEndTime(WebvttParserUtil.parseTimestampUs(matcher.group(2)));
            parseCueSettingsList(matcher.group(3), builder);
            sb.setLength(0);
            while (true) {
                String line = parsableByteArray.readLine();
                if (TextUtils.isEmpty(line)) {
                    parseCueText(str, sb.toString(), builder, list);
                    return true;
                }
                if (sb.length() > 0) {
                    sb.append(IOUtils.f15646e);
                }
                sb.append(line.trim());
            }
        } catch (NumberFormatException unused) {
            Log.m17586w(TAG, "Skipping cue with bad header: " + matcher.group());
            return false;
        }
    }
}
