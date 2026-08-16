package com.google.android.exoplayer2.text.subrip;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.LongArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class SubripDecoder extends SimpleSubtitleDecoder {
    private static final String ALIGN_BOTTOM_LEFT = "{\\an1}";
    private static final String ALIGN_BOTTOM_MID = "{\\an2}";
    private static final String ALIGN_BOTTOM_RIGHT = "{\\an3}";
    private static final String ALIGN_MID_LEFT = "{\\an4}";
    private static final String ALIGN_MID_MID = "{\\an5}";
    private static final String ALIGN_MID_RIGHT = "{\\an6}";
    private static final String ALIGN_TOP_LEFT = "{\\an7}";
    private static final String ALIGN_TOP_MID = "{\\an8}";
    private static final String ALIGN_TOP_RIGHT = "{\\an9}";
    private static final float END_FRACTION = 0.92f;
    private static final float MID_FRACTION = 0.5f;
    private static final float START_FRACTION = 0.08f;
    private static final String SUBRIP_ALIGNMENT_TAG = "\\{\\\\an[1-9]\\}";
    private static final String SUBRIP_TIMECODE = "(?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?";
    private static final String TAG = "SubripDecoder";
    private final ArrayList<String> tags;
    private final StringBuilder textBuilder;
    private static final Pattern SUBRIP_TIMING_LINE = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final Pattern SUBRIP_TAG_PATTERN = Pattern.compile("\\{\\\\.*?\\}");

    public SubripDecoder() {
        super(TAG);
        this.textBuilder = new StringBuilder();
        this.tags = new ArrayList<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x0077  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    private Cue buildCue(Spanned spanned, @Nullable String str) {
        byte b;
        int i;
        byte b2;
        int i2;
        if (str == null) {
            return new Cue(spanned);
        }
        switch (str) {
            case "{\an1}":
                b = 0;
                break;
            case "{\an2}":
                b = 6;
                break;
            case "{\an3}":
                b = 3;
                break;
            case "{\an4}":
                b = 1;
                break;
            case "{\an5}":
                b = 7;
                break;
            case "{\an6}":
                b = 4;
                break;
            case "{\an7}":
                b = 2;
                break;
            case "{\an8}":
                b = 8;
                break;
            case "{\an9}":
                b = 5;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0 || b == 1 || b == 2) {
            i = 0;
        } else {
            i = (b == 3 || b == 4 || b == 5) ? 2 : 1;
        }
        switch (str) {
            case "{\an1}":
                b2 = 0;
                break;
            case "{\an2}":
                b2 = 1;
                break;
            case "{\an3}":
                b2 = 2;
                break;
            case "{\an4}":
                b2 = 6;
                break;
            case "{\an5}":
                b2 = 7;
                break;
            case "{\an6}":
                b2 = 8;
                break;
            case "{\an7}":
                b2 = 3;
                break;
            case "{\an8}":
                b2 = 4;
                break;
            case "{\an9}":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0 || b2 == 1 || b2 == 2) {
            i2 = 2;
        } else {
            i2 = (b2 == 3 || b2 == 4 || b2 == 5) ? 0 : 1;
        }
        return new Cue(spanned, null, getFractionalPositionForAnchorType(i2), 0, i2, getFractionalPositionForAnchorType(i), i, -3.4028235E38f);
    }

    public static float getFractionalPositionForAnchorType(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return END_FRACTION;
        }
        throw new IllegalArgumentException();
    }

    private static long parseTimecode(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = (Long.parseLong(matcher.group(i + 3)) * 1000) + (Long.parseLong(matcher.group(i + 2)) * 60000) + (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L);
        String strGroup2 = matcher.group(i + 4);
        if (strGroup2 != null) {
            j += Long.parseLong(strGroup2);
        }
        return j * 1000;
    }

    private String processLine(String str, ArrayList<String> arrayList) {
        String strTrim = str.trim();
        StringBuilder sb = new StringBuilder(strTrim);
        Matcher matcher = SUBRIP_TAG_PATTERN.matcher(strTrim);
        int i = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i;
            int length = strGroup.length();
            sb.replace(iStart, iStart + length, "");
            i += length;
        }
        return sb.toString();
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public Subtitle decode(byte[] bArr, int i, boolean z) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        LongArray longArray = new LongArray();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i);
        while (true) {
            String line = parsableByteArray.readLine();
            if (line == null) {
                break;
            }
            if (line.length() != 0) {
                try {
                    Integer.parseInt(line);
                    line = parsableByteArray.readLine();
                    if (line == null) {
                        Log.m17586w(TAG, "Unexpected end");
                        break;
                    }
                    Matcher matcher = SUBRIP_TIMING_LINE.matcher(line);
                    if (matcher.matches()) {
                        longArray.add(parseTimecode(matcher, 1));
                        longArray.add(parseTimecode(matcher, 6));
                        int i2 = 0;
                        this.textBuilder.setLength(0);
                        this.tags.clear();
                        while (true) {
                            String line2 = parsableByteArray.readLine();
                            if (TextUtils.isEmpty(line2)) {
                                break;
                            }
                            if (this.textBuilder.length() > 0) {
                                this.textBuilder.append("<br>");
                            }
                            this.textBuilder.append(processLine(line2, this.tags));
                        }
                        Spanned spannedFromHtml = Html.fromHtml(this.textBuilder.toString());
                        while (true) {
                            if (i2 >= this.tags.size()) {
                                str2 = null;
                                break;
                            }
                            str2 = this.tags.get(i2);
                            if (str2.matches(SUBRIP_ALIGNMENT_TAG)) {
                                break;
                            }
                            i2++;
                        }
                        arrayList.add(buildCue(spannedFromHtml, str2));
                        arrayList.add(Cue.EMPTY);
                    } else {
                        str = "Skipping invalid timing: ";
                        Log.m17586w(TAG, str.concat(line));
                    }
                } catch (NumberFormatException unused) {
                    str = "Skipping invalid index: ";
                }
            }
        }
        Cue[] cueArr = new Cue[arrayList.size()];
        arrayList.toArray(cueArr);
        return new SubripSubtitle(cueArr, longArray.toArray());
    }
}
