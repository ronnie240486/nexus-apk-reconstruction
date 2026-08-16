package com.google.android.exoplayer2.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.google.android.exoplayer2.extractor.p006ts.PsExtractor;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.SubtitleInputBuffer;
import com.google.android.exoplayer2.text.SubtitleOutputBuffer;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.tencent.smtt.sdk.TbsListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.dom4j.p020io.SAXEventRecorder;
import p000.C4783m8;

/* JADX INFO: loaded from: classes2.dex */
public final class Cea608Decoder extends CeaDecoder {
    private static final int CC_FIELD_FLAG = 1;
    private static final byte CC_IMPLICIT_DATA_HEADER = -4;
    private static final int CC_MODE_PAINT_ON = 3;
    private static final int CC_MODE_POP_ON = 2;
    private static final int CC_MODE_ROLL_UP = 1;
    private static final int CC_MODE_UNKNOWN = 0;
    private static final int CC_TYPE_FLAG = 2;
    private static final int CC_VALID_FLAG = 4;
    private static final byte CTRL_BACKSPACE = 33;
    private static final byte CTRL_CARRIAGE_RETURN = 45;
    private static final byte CTRL_DELETE_TO_END_OF_ROW = 36;
    private static final byte CTRL_END_OF_CAPTION = 47;
    private static final byte CTRL_ERASE_DISPLAYED_MEMORY = 44;
    private static final byte CTRL_ERASE_NON_DISPLAYED_MEMORY = 46;
    private static final byte CTRL_RESUME_CAPTION_LOADING = 32;
    private static final byte CTRL_RESUME_DIRECT_CAPTIONING = 41;
    private static final byte CTRL_RESUME_TEXT_DISPLAY = 43;
    private static final byte CTRL_ROLL_UP_CAPTIONS_2_ROWS = 37;
    private static final byte CTRL_ROLL_UP_CAPTIONS_3_ROWS = 38;
    private static final byte CTRL_ROLL_UP_CAPTIONS_4_ROWS = 39;
    private static final byte CTRL_TEXT_RESTART = 42;
    private static final int DEFAULT_CAPTIONS_ROW_COUNT = 4;
    private static final int NTSC_CC_CHANNEL_1 = 0;
    private static final int NTSC_CC_CHANNEL_2 = 1;
    private static final int NTSC_CC_FIELD_1 = 0;
    private static final int NTSC_CC_FIELD_2 = 1;
    private static final int STYLE_ITALICS = 7;
    private static final int STYLE_UNCHANGED = 8;
    private static final String TAG = "Cea608Decoder";
    private int captionMode;
    private int captionRowCount;
    private List<Cue> cues;
    private boolean isCaptionValid;
    private boolean isInCaptionService;
    private List<Cue> lastCues;
    private final int packetLength;
    private byte repeatableControlCc1;
    private byte repeatableControlCc2;
    private boolean repeatableControlSet;
    private final int selectedChannel;
    private final int selectedField;
    private static final int[] ROW_INDICES = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] COLUMN_INDICES = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] STYLE_COLORS = {-1, -16711936, -16776961, -16711681, SupportMenu.CATEGORY_MASK, InputDeviceCompat.SOURCE_ANY, -65281};
    private static final int[] BASIC_CHARACTER_SET = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, TbsListener.ErrorCode.DECOUPLE_TPATCH_INSTALL_SUCCESS, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, TbsListener.ErrorCode.DISK_FULL, TbsListener.ErrorCode.FILE_DELETED, TbsListener.ErrorCode.UNKNOWN_ERROR, 108, 109, 110, 111, TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW, TbsListener.ErrorCode.DOWNLOAD_FILE_CONTENTLENGTH_NOT_MATCH, TbsListener.ErrorCode.DOWNLOAD_NOT_WIFI_ERROR, 115, 116, 117, 118, 119, 120, TbsListener.ErrorCode.THREAD_INIT_ERROR, 122, TbsListener.ErrorCode.RENAME_FAIL, 247, TbsListener.ErrorCode.DEXOPT_EXCEPTION, TbsListener.ErrorCode.TPATCH_BACKUP_NOT_VALID, 9632};
    private static final int[] SPECIAL_CHARACTER_SET = {174, 176, PsExtractor.PRIVATE_STREAM_1, 191, 8482, 162, 163, 9834, 224, 32, TbsListener.ErrorCode.INSTALL_SUCCESS_AND_RELEASE_LOCK, TbsListener.ErrorCode.DEXOAT_EXCEPTION, TbsListener.ErrorCode.DECOUPLE_INCURUPDATE_SUCCESS, TbsListener.ErrorCode.TPATCH_FAIL, 244, 251};
    private static final int[] SPECIAL_ES_FR_CHARACTER_SET = {193, 201, TbsListener.ErrorCode.EXCEED_COPY_RETRY_NUM, 218, TbsListener.ErrorCode.COPY_INSTALL_SUCCESS, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, PsExtractor.AUDIO_STREAM, 194, 199, 200, 202, 203, TbsListener.ErrorCode.DECOUPLE_INCURUPDATE_FAIL, 206, TbsListener.ErrorCode.UNZIP_OTHER_ERROR, TbsListener.ErrorCode.DECOUPLE_TPATCH_FAIL, 212, 217, 249, TbsListener.ErrorCode.RENAME_EXCEPTION, 171, 187};
    private static final int[] SPECIAL_PT_DE_CHARACTER_SET = {195, TbsListener.ErrorCode.HOST_CONTEXT_IS_NULL, 205, 204, TbsListener.ErrorCode.TPATCH_INSTALL_SUCCESS, 210, TbsListener.ErrorCode.TPATCH_ENABLE_EXCEPTION, TbsListener.ErrorCode.COPY_SRCDIR_ERROR, 245, TbsListener.ErrorCode.DOWNLOAD_RETRYTIMES302_EXCEED, TbsListener.ErrorCode.DOWNLOAD_THROWABLE, 92, 94, 95, TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY, 126, 196, TbsListener.ErrorCode.INCR_ERROR_DETAIL, TbsListener.ErrorCode.COPY_TMPDIR_ERROR, 246, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM, 165, 164, 9474, 197, TbsListener.ErrorCode.INSTALL_FROM_UNZIP, TbsListener.ErrorCode.INCR_UPDATE_ERROR, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] ODD_PARITY_BYTE_TABLE = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private final ParsableByteArray ccData = new ParsableByteArray();
    private final ArrayList<CueBuilder> cueBuilders = new ArrayList<>();
    private CueBuilder currentCueBuilder = new CueBuilder(0, 4);
    private int currentChannel = 0;

    public static class CueBuilder {
        private static final int BASE_ROW = 15;
        private static final int SCREEN_CHARWIDTH = 32;
        private int captionMode;
        private int captionRowCount;
        private int indent;
        private int row;
        private int tabOffset;
        private final List<CueStyle> cueStyles = new ArrayList();
        private final List<SpannableString> rolledUpCaptions = new ArrayList();
        private final StringBuilder captionStringBuilder = new StringBuilder();

        public static class CueStyle {
            public int start;
            public final int style;
            public final boolean underline;

            public CueStyle(int i, boolean z, int i2) {
                this.style = i;
                this.underline = z;
                this.start = i2;
            }
        }

        public CueBuilder(int i, int i2) {
            reset(i);
            setCaptionRowCount(i2);
        }

        private SpannableString buildCurrentLine() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.captionStringBuilder);
            int length = spannableStringBuilder.length();
            int i = 0;
            int i2 = -1;
            int i3 = -1;
            int i4 = 0;
            int i5 = -1;
            int i6 = -1;
            boolean z = false;
            while (i < this.cueStyles.size()) {
                CueStyle cueStyle = this.cueStyles.get(i);
                boolean z2 = cueStyle.underline;
                int i7 = cueStyle.style;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i6 = Cea608Decoder.STYLE_COLORS[i7];
                    }
                    z = z3;
                }
                int i8 = cueStyle.start;
                i++;
                if (i8 != (i < this.cueStyles.size() ? this.cueStyles.get(i).start : length)) {
                    if (i2 != -1 && !z2) {
                        setUnderlineSpan(spannableStringBuilder, i2, i8);
                        i2 = -1;
                    } else if (i2 == -1 && z2) {
                        i2 = i8;
                    }
                    if (i3 != -1 && !z) {
                        setItalicSpan(spannableStringBuilder, i3, i8);
                        i3 = -1;
                    } else if (i3 == -1 && z) {
                        i3 = i8;
                    }
                    if (i6 != i5) {
                        setColorSpan(spannableStringBuilder, i4, i8, i5);
                        i5 = i6;
                        i4 = i8;
                    }
                }
            }
            if (i2 != -1 && i2 != length) {
                setUnderlineSpan(spannableStringBuilder, i2, length);
            }
            if (i3 != -1 && i3 != length) {
                setItalicSpan(spannableStringBuilder, i3, length);
            }
            if (i4 != length) {
                setColorSpan(spannableStringBuilder, i4, length, i5);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void setColorSpan(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
            if (i3 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
        }

        private static void setItalicSpan(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
        }

        private static void setUnderlineSpan(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }

        public void append(char c) {
            this.captionStringBuilder.append(c);
        }

        public void backspace() {
            int length = this.captionStringBuilder.length();
            if (length > 0) {
                this.captionStringBuilder.delete(length - 1, length);
                for (int size = this.cueStyles.size() - 1; size >= 0; size--) {
                    CueStyle cueStyle = this.cueStyles.get(size);
                    int i = cueStyle.start;
                    if (i != length) {
                        return;
                    }
                    cueStyle.start = i - 1;
                }
            }
        }

        public Cue build(int i) {
            float f;
            int i2;
            int i3;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.rolledUpCaptions.size(); i4++) {
                spannableStringBuilder.append((CharSequence) this.rolledUpCaptions.get(i4));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) buildCurrentLine());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i5 = this.indent + this.tabOffset;
            int length = (32 - i5) - spannableStringBuilder.length();
            int i6 = i5 - length;
            if (i == Integer.MIN_VALUE) {
                i = (this.captionMode != 2 || (Math.abs(i6) >= 3 && length >= 0)) ? (this.captionMode != 2 || i6 <= 0) ? 0 : 2 : 1;
            }
            if (i != 1) {
                if (i == 2) {
                    i5 = 32 - length;
                }
                f = ((i5 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            if (this.captionMode == 1 || (i2 = this.row) > 7) {
                i2 = this.row - 17;
                i3 = 2;
            } else {
                i3 = 0;
            }
            return new Cue(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, i2, 1, i3, f, i, -3.4028235E38f);
        }

        public boolean isEmpty() {
            return this.cueStyles.isEmpty() && this.rolledUpCaptions.isEmpty() && this.captionStringBuilder.length() == 0;
        }

        public void reset(int i) {
            this.captionMode = i;
            this.cueStyles.clear();
            this.rolledUpCaptions.clear();
            this.captionStringBuilder.setLength(0);
            this.row = 15;
            this.indent = 0;
            this.tabOffset = 0;
        }

        public void rollUp() {
            this.rolledUpCaptions.add(buildCurrentLine());
            this.captionStringBuilder.setLength(0);
            this.cueStyles.clear();
            int iMin = Math.min(this.captionRowCount, this.row);
            while (this.rolledUpCaptions.size() >= iMin) {
                this.rolledUpCaptions.remove(0);
            }
        }

        public void setCaptionMode(int i) {
            this.captionMode = i;
        }

        public void setCaptionRowCount(int i) {
            this.captionRowCount = i;
        }

        public void setStyle(int i, boolean z) {
            this.cueStyles.add(new CueStyle(i, z, this.captionStringBuilder.length()));
        }
    }

    public Cea608Decoder(String str, int i) {
        this.packetLength = MimeTypes.APPLICATION_MP4CEA608.equals(str) ? 2 : 3;
        if (i == 1) {
            this.selectedChannel = 0;
            this.selectedField = 0;
        } else if (i != 2) {
            if (i == 3) {
                this.selectedChannel = 0;
            } else if (i != 4) {
                Log.m17586w(TAG, "Invalid channel. Defaulting to CC1.");
                this.selectedChannel = 0;
                this.selectedField = 0;
            } else {
                this.selectedChannel = 1;
            }
            this.selectedField = 1;
        } else {
            this.selectedChannel = 1;
            this.selectedField = 0;
        }
        setCaptionMode(0);
        resetCueBuilders();
        this.isInCaptionService = true;
    }

    private static char getBasicChar(byte b) {
        return (char) BASIC_CHARACTER_SET[(b & C4783m8.f15111c) - 32];
    }

    private static int getChannel(byte b) {
        return (b >> 3) & 1;
    }

    private List<Cue> getDisplayCues() {
        int size = this.cueBuilders.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            Cue cueBuild = this.cueBuilders.get(i).build(Integer.MIN_VALUE);
            arrayList.add(cueBuild);
            if (cueBuild != null) {
                iMin = Math.min(iMin, cueBuild.positionAnchor);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            Cue cueBuild2 = (Cue) arrayList.get(i2);
            if (cueBuild2 != null) {
                if (cueBuild2.positionAnchor != iMin) {
                    cueBuild2 = this.cueBuilders.get(i2).build(iMin);
                }
                arrayList2.add(cueBuild2);
            }
        }
        return arrayList2;
    }

    private static char getExtendedEsFrChar(byte b) {
        return (char) SPECIAL_ES_FR_CHARACTER_SET[b & 31];
    }

    private static char getExtendedPtDeChar(byte b) {
        return (char) SPECIAL_PT_DE_CHARACTER_SET[b & 31];
    }

    private static char getExtendedWestEuropeanChar(byte b, byte b2) {
        return (b & 1) == 0 ? getExtendedEsFrChar(b2) : getExtendedPtDeChar(b2);
    }

    private static char getSpecialNorthAmericanChar(byte b) {
        return (char) SPECIAL_CHARACTER_SET[b & SAXEventRecorder.SAXEvent.f16649r];
    }

    private void handleMidrowCtrl(byte b) {
        this.currentCueBuilder.append(' ');
        this.currentCueBuilder.setStyle((b >> 1) & 7, (b & 1) == 1);
    }

    private void handleMiscCode(byte b) {
        if (b == 32) {
            setCaptionMode(2);
            return;
        }
        if (b == 41) {
            setCaptionMode(3);
            return;
        }
        switch (b) {
            case 37:
                setCaptionMode(1);
                setCaptionRowCount(2);
                break;
            case 38:
                setCaptionMode(1);
                setCaptionRowCount(3);
                break;
            case 39:
                setCaptionMode(1);
                setCaptionRowCount(4);
                break;
            default:
                int i = this.captionMode;
                if (i != 0) {
                    if (b == 33) {
                        this.currentCueBuilder.backspace();
                    } else {
                        switch (b) {
                            case 44:
                                this.cues = Collections.emptyList();
                                int i2 = this.captionMode;
                                if (i2 != 1 && i2 != 3) {
                                }
                                break;
                            case 45:
                                if (i == 1 && !this.currentCueBuilder.isEmpty()) {
                                    this.currentCueBuilder.rollUp();
                                    break;
                                }
                                break;
                            case 47:
                                this.cues = getDisplayCues();
                                break;
                        }
                        resetCueBuilders();
                    }
                    break;
                }
                break;
        }
    }

    private void handlePreambleAddressCode(byte b, byte b2) {
        int i = ROW_INDICES[b & 7];
        if ((b2 & 32) != 0) {
            i++;
        }
        if (i != this.currentCueBuilder.row) {
            if (this.captionMode != 1 && !this.currentCueBuilder.isEmpty()) {
                CueBuilder cueBuilder = new CueBuilder(this.captionMode, this.captionRowCount);
                this.currentCueBuilder = cueBuilder;
                this.cueBuilders.add(cueBuilder);
            }
            this.currentCueBuilder.row = i;
        }
        boolean z = (b2 & 16) == 16;
        boolean z2 = (b2 & 1) == 1;
        int i2 = (b2 >> 1) & 7;
        this.currentCueBuilder.setStyle(z ? 8 : i2, z2);
        if (z) {
            this.currentCueBuilder.indent = COLUMN_INDICES[i2];
        }
    }

    private static boolean isCtrlCode(byte b) {
        return (b & 224) == 0;
    }

    private static boolean isExtendedWestEuropeanChar(byte b, byte b2) {
        return (b & 246) == 18 && (b2 & 224) == 32;
    }

    private static boolean isMidrowCtrlCode(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    private static boolean isMiscCode(byte b, byte b2) {
        return (b & 246) == 20 && (b2 & 240) == 32;
    }

    private static boolean isPreambleAddressCode(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    private static boolean isRepeatable(byte b) {
        return (b & 240) == 16;
    }

    private boolean isRepeatedCommand(boolean z, byte b, byte b2) {
        if (!z || !isRepeatable(b)) {
            this.repeatableControlSet = false;
        } else {
            if (this.repeatableControlSet && this.repeatableControlCc1 == b && this.repeatableControlCc2 == b2) {
                this.repeatableControlSet = false;
                return true;
            }
            this.repeatableControlSet = true;
            this.repeatableControlCc1 = b;
            this.repeatableControlCc2 = b2;
        }
        return false;
    }

    private static boolean isServiceSwitchCommand(byte b) {
        return (b & 247) == 20;
    }

    private static boolean isSpecialNorthAmericanChar(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 48;
    }

    private static boolean isTabCtrlCode(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    private static boolean isXdsControlCode(byte b) {
        return 1 <= b && b <= 15;
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    private void maybeUpdateIsInCaptionService(byte r3, byte r4) {
        /*
            r2 = this;
            boolean r0 = isXdsControlCode(r3)
            r1 = 0
            if (r0 == 0) goto La
        L7:
            r2.isInCaptionService = r1
            goto L22
        La:
            boolean r3 = isServiceSwitchCommand(r3)
            if (r3 == 0) goto L22
            r3 = 32
            if (r4 == r3) goto L1f
            r3 = 47
            if (r4 == r3) goto L1f
            switch(r4) {
                case 37: goto L1f;
                case 38: goto L1f;
                case 39: goto L1f;
                default: goto L1b;
            }
        L1b:
            switch(r4) {
                case 41: goto L1f;
                case 42: goto L7;
                case 43: goto L7;
                default: goto L1e;
            }
        L1e:
            goto L22
        L1f:
            r3 = 1
            r2.isInCaptionService = r3
        L22:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.cea.Cea608Decoder.maybeUpdateIsInCaptionService(byte, byte):void");
    }

    private void resetCueBuilders() {
        this.currentCueBuilder.reset(this.captionMode);
        this.cueBuilders.clear();
        this.cueBuilders.add(this.currentCueBuilder);
    }

    private void setCaptionMode(int i) {
        int i2 = this.captionMode;
        if (i2 == i) {
            return;
        }
        this.captionMode = i;
        if (i == 3) {
            for (int i3 = 0; i3 < this.cueBuilders.size(); i3++) {
                this.cueBuilders.get(i3).setCaptionMode(i);
            }
            return;
        }
        resetCueBuilders();
        if (i2 == 3 || i == 1 || i == 0) {
            this.cues = Collections.emptyList();
        }
    }

    private void setCaptionRowCount(int i) {
        this.captionRowCount = i;
        this.currentCueBuilder.setCaptionRowCount(i);
    }

    private boolean updateAndVerifyCurrentChannel(byte b) {
        if (isCtrlCode(b)) {
            this.currentChannel = getChannel(b);
        }
        return this.currentChannel == this.selectedChannel;
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public Subtitle createSubtitle() {
        List<Cue> list = this.cues;
        this.lastCues = list;
        return new CeaSubtitle(list);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public void decode(SubtitleInputBuffer subtitleInputBuffer) {
        boolean z;
        CueBuilder cueBuilder;
        char basicChar;
        this.ccData.reset(subtitleInputBuffer.data.array(), subtitleInputBuffer.data.limit());
        boolean z2 = false;
        while (true) {
            int iBytesLeft = this.ccData.bytesLeft();
            int i = this.packetLength;
            if (iBytesLeft < i) {
                break;
            }
            byte unsignedByte = i == 2 ? CC_IMPLICIT_DATA_HEADER : (byte) this.ccData.readUnsignedByte();
            int unsignedByte2 = this.ccData.readUnsignedByte();
            int unsignedByte3 = this.ccData.readUnsignedByte();
            if ((unsignedByte & 2) == 0 && (unsignedByte & 1) == this.selectedField) {
                byte b = (byte) (unsignedByte2 & 127);
                byte b2 = (byte) (unsignedByte3 & 127);
                if (b != 0 || b2 != 0) {
                    boolean z3 = this.isCaptionValid;
                    if ((unsignedByte & 4) == 4) {
                        boolean[] zArr = ODD_PARITY_BYTE_TABLE;
                        if (zArr[unsignedByte2] && zArr[unsignedByte3]) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    this.isCaptionValid = z;
                    if (!isRepeatedCommand(z, b, b2)) {
                        if (this.isCaptionValid) {
                            maybeUpdateIsInCaptionService(b, b2);
                            if (this.isInCaptionService && updateAndVerifyCurrentChannel(b)) {
                                if (isCtrlCode(b)) {
                                    if (isSpecialNorthAmericanChar(b, b2)) {
                                        cueBuilder = this.currentCueBuilder;
                                        basicChar = getSpecialNorthAmericanChar(b2);
                                    } else if (isExtendedWestEuropeanChar(b, b2)) {
                                        this.currentCueBuilder.backspace();
                                        cueBuilder = this.currentCueBuilder;
                                        basicChar = getExtendedWestEuropeanChar(b, b2);
                                    } else if (isMidrowCtrlCode(b, b2)) {
                                        handleMidrowCtrl(b2);
                                    } else if (isPreambleAddressCode(b, b2)) {
                                        handlePreambleAddressCode(b, b2);
                                    } else if (isTabCtrlCode(b, b2)) {
                                        this.currentCueBuilder.tabOffset = b2 - 32;
                                    } else if (isMiscCode(b, b2)) {
                                        handleMiscCode(b2);
                                    }
                                    cueBuilder.append(basicChar);
                                } else {
                                    this.currentCueBuilder.append(getBasicChar(b));
                                    if ((b2 & 224) != 0) {
                                        cueBuilder = this.currentCueBuilder;
                                        basicChar = getBasicChar(b2);
                                        cueBuilder.append(basicChar);
                                    }
                                }
                                z2 = true;
                            }
                        } else if (z3) {
                            resetCueBuilders();
                            z2 = true;
                        }
                    }
                }
            }
        }
        if (z2) {
            int i2 = this.captionMode;
            if (i2 == 1 || i2 == 3) {
                this.cues = getDisplayCues();
            }
        }
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public /* bridge */ /* synthetic */ SubtitleInputBuffer dequeueInputBuffer() throws SubtitleDecoderException {
        return super.dequeueInputBuffer();
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public /* bridge */ /* synthetic */ SubtitleOutputBuffer dequeueOutputBuffer() throws SubtitleDecoderException {
        return super.dequeueOutputBuffer();
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public void flush() {
        super.flush();
        this.cues = null;
        this.lastCues = null;
        setCaptionMode(0);
        setCaptionRowCount(4);
        resetCueBuilders();
        this.isCaptionValid = false;
        this.repeatableControlSet = false;
        this.repeatableControlCc1 = (byte) 0;
        this.repeatableControlCc2 = (byte) 0;
        this.currentChannel = 0;
        this.isInCaptionService = true;
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public String getName() {
        return TAG;
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public boolean isNewSubtitleDataAvailable() {
        return this.cues != this.lastCues;
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public /* bridge */ /* synthetic */ void queueInputBuffer(SubtitleInputBuffer subtitleInputBuffer) throws SubtitleDecoderException {
        super.queueInputBuffer(subtitleInputBuffer);
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.decoder.Decoder
    public void release() {
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.text.SubtitleDecoder
    public /* bridge */ /* synthetic */ void setPositionUs(long j) {
        super.setPositionUs(j);
    }
}
