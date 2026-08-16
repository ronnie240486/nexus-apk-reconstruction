package com.google.android.exoplayer2.text.ssa;

import android.graphics.PointF;
import android.text.Layout;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.p013io.IOUtils;
import p000.C0208D5;
import p000.C1262Tc;

/* JADX INFO: loaded from: classes2.dex */
public final class SsaDecoder extends SimpleSubtitleDecoder {
    private static final float DEFAULT_MARGIN = 0.05f;
    private static final String DIALOGUE_LINE_PREFIX = "Dialogue:";
    static final String FORMAT_LINE_PREFIX = "Format:";
    private static final Pattern SSA_TIMECODE_PATTERN = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    static final String STYLE_LINE_PREFIX = "Style:";
    private static final String TAG = "SsaDecoder";

    @Nullable
    private final SsaDialogueFormat dialogueFormatFromInitializationData;
    private final boolean haveInitializationData;
    private float screenHeight;
    private float screenWidth;
    private Map<String, SsaStyle> styles;

    public SsaDecoder() {
        this(null);
    }

    private static int addCuePlacerholderByTime(long j, List<Long> list, List<List<Cue>> list2) {
        int i;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (list.get(size).longValue() == j) {
                return size;
            }
            if (list.get(size).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList(list2.get(i - 1)));
        return i;
    }

    private static float computeDefaultLineOrPosition(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static Cue createCue(String str, @Nullable SsaStyle ssaStyle, SsaStyle.Overrides overrides, float f, float f2) {
        float fComputeDefaultLineOrPosition;
        float fComputeDefaultLineOrPosition2;
        int i = overrides.alignment;
        if (i == -1) {
            i = ssaStyle != null ? ssaStyle.alignment : -1;
        }
        int positionAnchor = toPositionAnchor(i);
        int lineAnchor = toLineAnchor(i);
        PointF pointF = overrides.position;
        if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
            fComputeDefaultLineOrPosition = computeDefaultLineOrPosition(positionAnchor);
            fComputeDefaultLineOrPosition2 = computeDefaultLineOrPosition(lineAnchor);
        } else {
            float f3 = pointF.x / f;
            fComputeDefaultLineOrPosition2 = pointF.y / f2;
            fComputeDefaultLineOrPosition = f3;
        }
        return new Cue(str, toTextAlignment(i), fComputeDefaultLineOrPosition2, 0, lineAnchor, fComputeDefaultLineOrPosition, positionAnchor, -3.4028235E38f);
    }

    private void parseDialogueLine(String str, SsaDialogueFormat ssaDialogueFormat, List<List<Cue>> list, List<Long> list2) {
        int i;
        String strConcat;
        Assertions.checkArgument(str.startsWith(DIALOGUE_LINE_PREFIX));
        String[] strArrSplit = str.substring(9).split(C1262Tc.f3278g, ssaDialogueFormat.length);
        if (strArrSplit.length != ssaDialogueFormat.length) {
            strConcat = "Skipping dialogue line with fewer columns than format: ".concat(str);
        } else {
            long timecodeUs = parseTimecodeUs(strArrSplit[ssaDialogueFormat.startTimeIndex]);
            if (timecodeUs != C3219C.TIME_UNSET) {
                long timecodeUs2 = parseTimecodeUs(strArrSplit[ssaDialogueFormat.endTimeIndex]);
                if (timecodeUs2 != C3219C.TIME_UNSET) {
                    Map<String, SsaStyle> map = this.styles;
                    SsaStyle ssaStyle = (map == null || (i = ssaDialogueFormat.styleIndex) == -1) ? null : map.get(strArrSplit[i].trim());
                    String str2 = strArrSplit[ssaDialogueFormat.textIndex];
                    Cue cueCreateCue = createCue(SsaStyle.Overrides.stripStyleOverrides(str2).replaceAll("\\\\N", IOUtils.f15646e).replaceAll("\\\\n", IOUtils.f15646e), ssaStyle, SsaStyle.Overrides.parseFromDialogue(str2), this.screenWidth, this.screenHeight);
                    int iAddCuePlacerholderByTime = addCuePlacerholderByTime(timecodeUs2, list2, list);
                    for (int iAddCuePlacerholderByTime2 = addCuePlacerholderByTime(timecodeUs, list2, list); iAddCuePlacerholderByTime2 < iAddCuePlacerholderByTime; iAddCuePlacerholderByTime2++) {
                        list.get(iAddCuePlacerholderByTime2).add(cueCreateCue);
                    }
                    return;
                }
            }
            strConcat = "Skipping invalid timing: ".concat(str);
        }
        Log.m17586w(TAG, strConcat);
    }

    private void parseEventBody(ParsableByteArray parsableByteArray, List<List<Cue>> list, List<Long> list2) {
        SsaDialogueFormat ssaDialogueFormatFromFormatLine = this.haveInitializationData ? this.dialogueFormatFromInitializationData : null;
        while (true) {
            String line = parsableByteArray.readLine();
            if (line == null) {
                return;
            }
            if (line.startsWith(FORMAT_LINE_PREFIX)) {
                ssaDialogueFormatFromFormatLine = SsaDialogueFormat.fromFormatLine(line);
            } else if (line.startsWith(DIALOGUE_LINE_PREFIX)) {
                if (ssaDialogueFormatFromFormatLine == null) {
                    Log.m17586w(TAG, "Skipping dialogue line before complete format: ".concat(line));
                } else {
                    parseDialogueLine(line, ssaDialogueFormatFromFormatLine, list, list2);
                }
            }
        }
    }

    private void parseHeader(ParsableByteArray parsableByteArray) {
        while (true) {
            String line = parsableByteArray.readLine();
            if (line == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(line)) {
                parseScriptInfo(parsableByteArray);
            } else if ("[V4+ Styles]".equalsIgnoreCase(line)) {
                this.styles = parseStyles(parsableByteArray);
            } else if ("[V4 Styles]".equalsIgnoreCase(line)) {
                Log.m17584i(TAG, "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(line)) {
                return;
            }
        }
    }

    private void parseScriptInfo(ParsableByteArray parsableByteArray) {
        while (true) {
            String line = parsableByteArray.readLine();
            if (line == null) {
                return;
            }
            if (parsableByteArray.bytesLeft() != 0 && parsableByteArray.peekUnsignedByte() == 91) {
                return;
            }
            String[] strArrSplit = line.split(":");
            if (strArrSplit.length == 2) {
                String lowerInvariant = Util.toLowerInvariant(strArrSplit[0].trim());
                lowerInvariant.getClass();
                if (lowerInvariant.equals("playresx")) {
                    this.screenWidth = Float.parseFloat(strArrSplit[1].trim());
                } else if (lowerInvariant.equals("playresy")) {
                    try {
                        this.screenHeight = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static Map<String, SsaStyle> parseStyles(ParsableByteArray parsableByteArray) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SsaStyle.Format formatFromFormatLine = null;
        while (true) {
            String line = parsableByteArray.readLine();
            if (line == null || (parsableByteArray.bytesLeft() != 0 && parsableByteArray.peekUnsignedByte() == 91)) {
                break;
            }
            if (line.startsWith(FORMAT_LINE_PREFIX)) {
                formatFromFormatLine = SsaStyle.Format.fromFormatLine(line);
            } else if (line.startsWith(STYLE_LINE_PREFIX)) {
                if (formatFromFormatLine == null) {
                    Log.m17586w(TAG, "Skipping 'Style:' line before 'Format:' line: ".concat(line));
                } else {
                    SsaStyle ssaStyleFromStyleLine = SsaStyle.fromStyleLine(line, formatFromFormatLine);
                    if (ssaStyleFromStyleLine != null) {
                        linkedHashMap.put(ssaStyleFromStyleLine.name, ssaStyleFromStyleLine);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long parseTimecodeUs(String str) {
        Matcher matcher = SSA_TIMECODE_PATTERN.matcher(str.trim());
        if (!matcher.matches()) {
            return C3219C.TIME_UNSET;
        }
        return (Long.parseLong((String) Util.castNonNull(matcher.group(4))) * 10000) + (Long.parseLong((String) Util.castNonNull(matcher.group(3))) * 1000000) + (Long.parseLong((String) Util.castNonNull(matcher.group(2))) * 60000000) + (Long.parseLong((String) Util.castNonNull(matcher.group(1))) * 3600000000L);
    }

    private static int toLineAnchor(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                C0208D5.m1307a("Unknown alignment: ", i, TAG);
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    private static int toPositionAnchor(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                C0208D5.m1307a("Unknown alignment: ", i, TAG);
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    @Nullable
    private static Layout.Alignment toTextAlignment(int i) {
        switch (i) {
            case -1:
                return null;
            case 0:
            default:
                C0208D5.m1307a("Unknown alignment: ", i, TAG);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    public Subtitle decode(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr, i);
        if (!this.haveInitializationData) {
            parseHeader(parsableByteArray);
        }
        parseEventBody(parsableByteArray, arrayList, arrayList2);
        return new SsaSubtitle(arrayList, arrayList2);
    }

    public SsaDecoder(@Nullable List<byte[]> list) {
        super(TAG);
        this.screenWidth = -3.4028235E38f;
        this.screenHeight = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.haveInitializationData = false;
            this.dialogueFormatFromInitializationData = null;
            return;
        }
        this.haveInitializationData = true;
        String strFromUtf8Bytes = Util.fromUtf8Bytes(list.get(0));
        Assertions.checkArgument(strFromUtf8Bytes.startsWith(FORMAT_LINE_PREFIX));
        this.dialogueFormatFromInitializationData = (SsaDialogueFormat) Assertions.checkNotNull(SsaDialogueFormat.fromFormatLine(strFromUtf8Bytes));
        parseHeader(new ParsableByteArray(list.get(1)));
    }
}
