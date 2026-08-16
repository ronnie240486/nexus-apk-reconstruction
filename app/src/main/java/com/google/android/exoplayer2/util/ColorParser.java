package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p000.C4772lz;

/* JADX INFO: loaded from: classes2.dex */
public final class ColorParser {
    private static final Map<String, Integer> COLOR_MAP;
    private static final String RGB = "rgb";
    private static final String RGBA = "rgba";
    private static final Pattern RGB_PATTERN = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern RGBA_PATTERN_INT_ALPHA = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    private static final Pattern RGBA_PATTERN_FLOAT_ALPHA = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    static {
        HashMap map = new HashMap();
        COLOR_MAP = map;
        C4772lz.m22021a(-984833, map, "aliceblue", -332841, "antiquewhite");
        map.put("aqua", -16711681);
        map.put("aquamarine", -8388652);
        C4772lz.m22021a(-983041, map, "azure", -657956, "beige");
        C4772lz.m22021a(-6972, map, "bisque", -16777216, "black");
        C4772lz.m22021a(-5171, map, "blanchedalmond", -16776961, "blue");
        C4772lz.m22021a(-7722014, map, "blueviolet", -5952982, "brown");
        C4772lz.m22021a(-2180985, map, "burlywood", -10510688, "cadetblue");
        C4772lz.m22021a(-8388864, map, "chartreuse", -2987746, "chocolate");
        C4772lz.m22021a(-32944, map, "coral", -10185235, "cornflowerblue");
        C4772lz.m22021a(-1828, map, "cornsilk", -2354116, "crimson");
        map.put("cyan", -16711681);
        map.put("darkblue", -16777077);
        C4772lz.m22021a(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        map.put("darkgray", -5658199);
        map.put("darkgreen", -16751616);
        map.put("darkgrey", -5658199);
        map.put("darkkhaki", -4343957);
        C4772lz.m22021a(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        C4772lz.m22021a(-29696, map, "darkorange", -6737204, "darkorchid");
        C4772lz.m22021a(-7667712, map, "darkred", -1468806, "darksalmon");
        C4772lz.m22021a(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        map.put("darkturquoise", -16724271);
        map.put("darkviolet", -7077677);
        C4772lz.m22021a(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        map.put("dodgerblue", -14774017);
        map.put("firebrick", -5103070);
        C4772lz.m22021a(-1296, map, "floralwhite", -14513374, "forestgreen");
        map.put("fuchsia", -65281);
        map.put("gainsboro", -2302756);
        C4772lz.m22021a(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        C4772lz.m22021a(-16744448, map, "green", -5374161, "greenyellow");
        map.put("grey", -8355712);
        map.put("honeydew", -983056);
        C4772lz.m22021a(-38476, map, "hotpink", -3318692, "indianred");
        C4772lz.m22021a(-11861886, map, "indigo", -16, "ivory");
        C4772lz.m22021a(-989556, map, "khaki", -1644806, "lavender");
        C4772lz.m22021a(-3851, map, "lavenderblush", -8586240, "lawngreen");
        C4772lz.m22021a(-1331, map, "lemonchiffon", -5383962, "lightblue");
        C4772lz.m22021a(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        C4772lz.m22021a(-18751, map, "lightpink", -24454, "lightsalmon");
        C4772lz.m22021a(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        map.put("lightsteelblue", -5192482);
        map.put("lightyellow", -32);
        C4772lz.m22021a(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        C4772lz.m22021a(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        C4772lz.m22021a(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        C4772lz.m22021a(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        C4772lz.m22021a(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        C4772lz.m22021a(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        C4772lz.m22021a(-15132304, map, "midnightblue", -655366, "mintcream");
        C4772lz.m22021a(-6943, map, "mistyrose", -6987, "moccasin");
        C4772lz.m22021a(-8531, map, "navajowhite", -16777088, "navy");
        C4772lz.m22021a(-133658, map, "oldlace", -8355840, "olive");
        C4772lz.m22021a(-9728477, map, "olivedrab", -23296, "orange");
        C4772lz.m22021a(-47872, map, "orangered", -2461482, "orchid");
        C4772lz.m22021a(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        C4772lz.m22021a(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        C4772lz.m22021a(-4139, map, "papayawhip", -9543, "peachpuff");
        C4772lz.m22021a(-3308225, map, "peru", -16181, "pink");
        C4772lz.m22021a(-2252579, map, "plum", -5185306, "powderblue");
        C4772lz.m22021a(-8388480, map, "purple", -10079335, "rebeccapurple");
        C4772lz.m22021a(SupportMenu.CATEGORY_MASK, map, "red", -4419697, "rosybrown");
        C4772lz.m22021a(-12490271, map, "royalblue", -7650029, "saddlebrown");
        C4772lz.m22021a(-360334, map, "salmon", -744352, "sandybrown");
        C4772lz.m22021a(-13726889, map, "seagreen", -2578, "seashell");
        C4772lz.m22021a(-6270419, map, "sienna", -4144960, "silver");
        C4772lz.m22021a(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        map.put("snow", -1286);
        map.put("springgreen", -16711809);
        C4772lz.m22021a(-12156236, map, "steelblue", -2968436, "tan");
        C4772lz.m22021a(-16744320, map, "teal", -2572328, "thistle");
        C4772lz.m22021a(-40121, map, "tomato", 0, "transparent");
        C4772lz.m22021a(-12525360, map, "turquoise", -1146130, "violet");
        C4772lz.m22021a(-663885, map, "wheat", -1, "white");
        C4772lz.m22021a(-657931, map, "whitesmoke", InputDeviceCompat.SOURCE_ANY, "yellow");
        map.put("yellowgreen", -6632142);
    }

    private ColorParser() {
    }

    private static int argb(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    private static int parseColorInternal(String str, boolean z) {
        Assertions.checkArgument(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i;
            }
            if (strReplace.length() == 9) {
                return ((i & 255) << 24) | (i >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (strReplace.startsWith(RGBA)) {
            Matcher matcher = (z ? RGBA_PATTERN_FLOAT_ALPHA : RGBA_PATTERN_INT_ALPHA).matcher(strReplace);
            if (matcher.matches()) {
                return argb(z ? (int) (Float.parseFloat(matcher.group(4)) * 255.0f) : Integer.parseInt(matcher.group(4), 10), Integer.parseInt(matcher.group(1), 10), Integer.parseInt(matcher.group(2), 10), Integer.parseInt(matcher.group(3), 10));
            }
        } else if (strReplace.startsWith(RGB)) {
            Matcher matcher2 = RGB_PATTERN.matcher(strReplace);
            if (matcher2.matches()) {
                return rgb(Integer.parseInt(matcher2.group(1), 10), Integer.parseInt(matcher2.group(2), 10), Integer.parseInt(matcher2.group(3), 10));
            }
        } else {
            Integer num = COLOR_MAP.get(Util.toLowerInvariant(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    public static int parseCssColor(String str) {
        return parseColorInternal(str, true);
    }

    public static int parseTtmlColor(String str) {
        return parseColorInternal(str, false);
    }

    private static int rgb(int i, int i2, int i3) {
        return argb(255, i, i2, i3);
    }
}
