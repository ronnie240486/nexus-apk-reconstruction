package com.google.android.exoplayer2.text.cea;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.SubtitleInputBuffer;
import com.google.android.exoplayer2.text.SubtitleOutputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.crypto.tls.CipherSuite;
import p000.C0208D5;
import p000.C1002PX;
import p000.C4605jL;

/* JADX INFO: loaded from: classes2.dex */
public final class Cea708Decoder extends CeaDecoder {
    private static final int CC_VALID_FLAG = 4;
    private static final int CHARACTER_BIG_CARONS = 42;
    private static final int CHARACTER_BIG_OE = 44;
    private static final int CHARACTER_BOLD_BULLET = 53;
    private static final int CHARACTER_CLOSE_DOUBLE_QUOTE = 52;
    private static final int CHARACTER_CLOSE_SINGLE_QUOTE = 50;
    private static final int CHARACTER_DIAERESIS_Y = 63;
    private static final int CHARACTER_ELLIPSIS = 37;
    private static final int CHARACTER_FIVE_EIGHTHS = 120;
    private static final int CHARACTER_HORIZONTAL_BORDER = 125;
    private static final int CHARACTER_LOWER_LEFT_BORDER = 124;
    private static final int CHARACTER_LOWER_RIGHT_BORDER = 126;
    private static final int CHARACTER_MN = 127;
    private static final int CHARACTER_NBTSP = 33;
    private static final int CHARACTER_ONE_EIGHTH = 118;
    private static final int CHARACTER_OPEN_DOUBLE_QUOTE = 51;
    private static final int CHARACTER_OPEN_SINGLE_QUOTE = 49;
    private static final int CHARACTER_SEVEN_EIGHTHS = 121;
    private static final int CHARACTER_SM = 61;
    private static final int CHARACTER_SMALL_CARONS = 58;
    private static final int CHARACTER_SMALL_OE = 60;
    private static final int CHARACTER_SOLID_BLOCK = 48;
    private static final int CHARACTER_THREE_EIGHTHS = 119;
    private static final int CHARACTER_TM = 57;
    private static final int CHARACTER_TSP = 32;
    private static final int CHARACTER_UPPER_LEFT_BORDER = 127;
    private static final int CHARACTER_UPPER_RIGHT_BORDER = 123;
    private static final int CHARACTER_VERTICAL_BORDER = 122;
    private static final int COMMAND_BS = 8;
    private static final int COMMAND_CLW = 136;
    private static final int COMMAND_CR = 13;
    private static final int COMMAND_CW0 = 128;
    private static final int COMMAND_CW1 = 129;
    private static final int COMMAND_CW2 = 130;
    private static final int COMMAND_CW3 = 131;
    private static final int COMMAND_CW4 = 132;
    private static final int COMMAND_CW5 = 133;
    private static final int COMMAND_CW6 = 134;
    private static final int COMMAND_CW7 = 135;
    private static final int COMMAND_DF0 = 152;
    private static final int COMMAND_DF1 = 153;
    private static final int COMMAND_DF2 = 154;
    private static final int COMMAND_DF3 = 155;
    private static final int COMMAND_DF4 = 156;
    private static final int COMMAND_DF5 = 157;
    private static final int COMMAND_DF6 = 158;
    private static final int COMMAND_DF7 = 159;
    private static final int COMMAND_DLC = 142;
    private static final int COMMAND_DLW = 140;
    private static final int COMMAND_DLY = 141;
    private static final int COMMAND_DSW = 137;
    private static final int COMMAND_ETX = 3;
    private static final int COMMAND_EXT1 = 16;
    private static final int COMMAND_EXT1_END = 23;
    private static final int COMMAND_EXT1_START = 17;
    private static final int COMMAND_FF = 12;
    private static final int COMMAND_HCR = 14;
    private static final int COMMAND_HDW = 138;
    private static final int COMMAND_NUL = 0;
    private static final int COMMAND_P16_END = 31;
    private static final int COMMAND_P16_START = 24;
    private static final int COMMAND_RST = 143;
    private static final int COMMAND_SPA = 144;
    private static final int COMMAND_SPC = 145;
    private static final int COMMAND_SPL = 146;
    private static final int COMMAND_SWA = 151;
    private static final int COMMAND_TGW = 139;
    private static final int DTVCC_PACKET_DATA = 2;
    private static final int DTVCC_PACKET_START = 3;
    private static final int GROUP_C0_END = 31;
    private static final int GROUP_C1_END = 159;
    private static final int GROUP_C2_END = 31;
    private static final int GROUP_C3_END = 159;
    private static final int GROUP_G0_END = 127;
    private static final int GROUP_G1_END = 255;
    private static final int GROUP_G2_END = 127;
    private static final int GROUP_G3_END = 255;
    private static final int NUM_WINDOWS = 8;
    private static final String TAG = "Cea708Decoder";
    private final CueBuilder[] cueBuilders;
    private List<Cue> cues;
    private CueBuilder currentCueBuilder;
    private DtvCcPacket currentDtvCcPacket;
    private int currentWindow;
    private List<Cue> lastCues;
    private final int selectedServiceNumber;
    private final ParsableByteArray ccData = new ParsableByteArray();
    private final ParsableBitArray serviceBlockPacket = new ParsableBitArray();

    public static final class CueBuilder {
        private static final int BORDER_AND_EDGE_TYPE_NONE = 0;
        private static final int BORDER_AND_EDGE_TYPE_UNIFORM = 3;
        public static final int COLOR_SOLID_BLACK;
        public static final int COLOR_SOLID_WHITE = getArgbColorFromCeaColor(2, 2, 2, 0);
        public static final int COLOR_TRANSPARENT;
        private static final int DEFAULT_PRIORITY = 4;
        private static final int DIRECTION_BOTTOM_TO_TOP = 3;
        private static final int DIRECTION_LEFT_TO_RIGHT = 0;
        private static final int DIRECTION_RIGHT_TO_LEFT = 1;
        private static final int DIRECTION_TOP_TO_BOTTOM = 2;
        private static final int HORIZONTAL_SIZE = 209;
        private static final int JUSTIFICATION_CENTER = 2;
        private static final int JUSTIFICATION_FULL = 3;
        private static final int JUSTIFICATION_LEFT = 0;
        private static final int JUSTIFICATION_RIGHT = 1;
        private static final int MAXIMUM_ROW_COUNT = 15;
        private static final int PEN_FONT_STYLE_DEFAULT = 0;
        private static final int PEN_FONT_STYLE_MONOSPACED_WITHOUT_SERIFS = 3;
        private static final int PEN_FONT_STYLE_MONOSPACED_WITH_SERIFS = 1;
        private static final int PEN_FONT_STYLE_PROPORTIONALLY_SPACED_WITHOUT_SERIFS = 4;
        private static final int PEN_FONT_STYLE_PROPORTIONALLY_SPACED_WITH_SERIFS = 2;
        private static final int PEN_OFFSET_NORMAL = 1;
        private static final int PEN_SIZE_STANDARD = 1;
        private static final int[] PEN_STYLE_BACKGROUND;
        private static final int[] PEN_STYLE_EDGE_TYPE;
        private static final int[] PEN_STYLE_FONT_STYLE;
        private static final int RELATIVE_CUE_SIZE = 99;
        private static final int VERTICAL_SIZE = 74;
        private static final int[] WINDOW_STYLE_FILL;
        private static final int[] WINDOW_STYLE_JUSTIFICATION;
        private static final int[] WINDOW_STYLE_PRINT_DIRECTION;
        private static final int[] WINDOW_STYLE_SCROLL_DIRECTION;
        private static final boolean[] WINDOW_STYLE_WORD_WRAP;
        private int anchorId;
        private int backgroundColor;
        private int backgroundColorStartPosition;
        private boolean defined;
        private int foregroundColor;
        private int foregroundColorStartPosition;
        private int horizontalAnchor;
        private int italicsStartPosition;
        private int justification;
        private int penStyleId;
        private int priority;
        private boolean relativePositioning;
        private int row;
        private int rowCount;
        private boolean rowLock;
        private int underlineStartPosition;
        private int verticalAnchor;
        private boolean visible;
        private int windowFillColor;
        private int windowStyleId;
        private final List<SpannableString> rolledUpCaptions = new ArrayList();
        private final SpannableStringBuilder captionStringBuilder = new SpannableStringBuilder();

        static {
            int argbColorFromCeaColor = getArgbColorFromCeaColor(0, 0, 0, 0);
            COLOR_SOLID_BLACK = argbColorFromCeaColor;
            int argbColorFromCeaColor2 = getArgbColorFromCeaColor(0, 0, 0, 3);
            COLOR_TRANSPARENT = argbColorFromCeaColor2;
            WINDOW_STYLE_JUSTIFICATION = new int[]{0, 0, 0, 0, 0, 2, 0};
            WINDOW_STYLE_PRINT_DIRECTION = new int[]{0, 0, 0, 0, 0, 0, 2};
            WINDOW_STYLE_SCROLL_DIRECTION = new int[]{3, 3, 3, 3, 3, 3, 1};
            WINDOW_STYLE_WORD_WRAP = new boolean[]{false, false, false, true, true, true, false};
            WINDOW_STYLE_FILL = new int[]{argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor, argbColorFromCeaColor};
            PEN_STYLE_FONT_STYLE = new int[]{0, 1, 2, 3, 4, 3, 4};
            PEN_STYLE_EDGE_TYPE = new int[]{0, 0, 0, 0, 0, 3, 3};
            PEN_STYLE_BACKGROUND = new int[]{argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor, argbColorFromCeaColor2, argbColorFromCeaColor2};
        }

        public CueBuilder() {
            reset();
        }

        public static int getArgbColorFromCeaColor(int i, int i2, int i3) {
            return getArgbColorFromCeaColor(i, i2, i3, 0);
        }

        public void append(char c) {
            if (c != '\n') {
                this.captionStringBuilder.append(c);
                return;
            }
            this.rolledUpCaptions.add(buildSpannableString());
            this.captionStringBuilder.clear();
            if (this.italicsStartPosition != -1) {
                this.italicsStartPosition = 0;
            }
            if (this.underlineStartPosition != -1) {
                this.underlineStartPosition = 0;
            }
            if (this.foregroundColorStartPosition != -1) {
                this.foregroundColorStartPosition = 0;
            }
            if (this.backgroundColorStartPosition != -1) {
                this.backgroundColorStartPosition = 0;
            }
            while (true) {
                if ((!this.rowLock || this.rolledUpCaptions.size() < this.rowCount) && this.rolledUpCaptions.size() < 15) {
                    return;
                } else {
                    this.rolledUpCaptions.remove(0);
                }
            }
        }

        public void backspace() {
            int length = this.captionStringBuilder.length();
            if (length > 0) {
                this.captionStringBuilder.delete(length - 1, length);
            }
        }

        public Cea708Cue build() {
            Layout.Alignment alignment;
            float f;
            float f2;
            if (isEmpty()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i = 0; i < this.rolledUpCaptions.size(); i++) {
                spannableStringBuilder.append((CharSequence) this.rolledUpCaptions.get(i));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) buildSpannableString());
            int i2 = this.justification;
            if (i2 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i2 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.justification);
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            if (this.relativePositioning) {
                f = this.horizontalAnchor / 99.0f;
                f2 = this.verticalAnchor / 99.0f;
            } else {
                f = this.horizontalAnchor / 209.0f;
                f2 = this.verticalAnchor / 74.0f;
            }
            float f3 = (f * 0.9f) + 0.05f;
            float f4 = (f2 * 0.9f) + 0.05f;
            int i3 = this.anchorId;
            return new Cea708Cue(spannableStringBuilder, alignment2, f4, 0, i3 % 3 == 0 ? 0 : i3 % 3 == 1 ? 1 : 2, f3, i3 / 3 == 0 ? 0 : i3 / 3 == 1 ? 1 : 2, -3.4028235E38f, this.windowFillColor != COLOR_SOLID_BLACK, this.windowFillColor, this.priority);
        }

        public SpannableString buildSpannableString() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.captionStringBuilder);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.italicsStartPosition != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.italicsStartPosition, length, 33);
                }
                if (this.underlineStartPosition != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.underlineStartPosition, length, 33);
                }
                if (this.foregroundColorStartPosition != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.foregroundColor), this.foregroundColorStartPosition, length, 33);
                }
                if (this.backgroundColorStartPosition != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.backgroundColor), this.backgroundColorStartPosition, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void clear() {
            this.rolledUpCaptions.clear();
            this.captionStringBuilder.clear();
            this.italicsStartPosition = -1;
            this.underlineStartPosition = -1;
            this.foregroundColorStartPosition = -1;
            this.backgroundColorStartPosition = -1;
            this.row = 0;
        }

        public void defineWindow(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.defined = true;
            this.visible = z;
            this.rowLock = z2;
            this.priority = i;
            this.relativePositioning = z4;
            this.verticalAnchor = i2;
            this.horizontalAnchor = i3;
            this.anchorId = i6;
            int i9 = i4 + 1;
            if (this.rowCount != i9) {
                this.rowCount = i9;
                while (true) {
                    if ((!z2 || this.rolledUpCaptions.size() < this.rowCount) && this.rolledUpCaptions.size() < 15) {
                        break;
                    } else {
                        this.rolledUpCaptions.remove(0);
                    }
                }
            }
            if (i7 != 0 && this.windowStyleId != i7) {
                this.windowStyleId = i7;
                int i10 = i7 - 1;
                setWindowAttributes(WINDOW_STYLE_FILL[i10], COLOR_TRANSPARENT, WINDOW_STYLE_WORD_WRAP[i10], 0, WINDOW_STYLE_PRINT_DIRECTION[i10], WINDOW_STYLE_SCROLL_DIRECTION[i10], WINDOW_STYLE_JUSTIFICATION[i10]);
            }
            if (i8 == 0 || this.penStyleId == i8) {
                return;
            }
            this.penStyleId = i8;
            int i11 = i8 - 1;
            setPenAttributes(0, 1, 1, false, false, PEN_STYLE_EDGE_TYPE[i11], PEN_STYLE_FONT_STYLE[i11]);
            setPenColor(COLOR_SOLID_WHITE, PEN_STYLE_BACKGROUND[i11], COLOR_SOLID_BLACK);
        }

        public boolean isDefined() {
            return this.defined;
        }

        public boolean isEmpty() {
            return !isDefined() || (this.rolledUpCaptions.isEmpty() && this.captionStringBuilder.length() == 0);
        }

        public boolean isVisible() {
            return this.visible;
        }

        public void reset() {
            clear();
            this.defined = false;
            this.visible = false;
            this.priority = 4;
            this.relativePositioning = false;
            this.verticalAnchor = 0;
            this.horizontalAnchor = 0;
            this.anchorId = 0;
            this.rowCount = 15;
            this.rowLock = true;
            this.justification = 0;
            this.windowStyleId = 0;
            this.penStyleId = 0;
            int i = COLOR_SOLID_BLACK;
            this.windowFillColor = i;
            this.foregroundColor = COLOR_SOLID_WHITE;
            this.backgroundColor = i;
        }

        public void setPenAttributes(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
            if (this.italicsStartPosition != -1) {
                if (!z) {
                    this.captionStringBuilder.setSpan(new StyleSpan(2), this.italicsStartPosition, this.captionStringBuilder.length(), 33);
                    this.italicsStartPosition = -1;
                }
            } else if (z) {
                this.italicsStartPosition = this.captionStringBuilder.length();
            }
            if (this.underlineStartPosition == -1) {
                if (z2) {
                    this.underlineStartPosition = this.captionStringBuilder.length();
                }
            } else {
                if (z2) {
                    return;
                }
                this.captionStringBuilder.setSpan(new UnderlineSpan(), this.underlineStartPosition, this.captionStringBuilder.length(), 33);
                this.underlineStartPosition = -1;
            }
        }

        public void setPenColor(int i, int i2, int i3) {
            if (this.foregroundColorStartPosition != -1 && this.foregroundColor != i) {
                this.captionStringBuilder.setSpan(new ForegroundColorSpan(this.foregroundColor), this.foregroundColorStartPosition, this.captionStringBuilder.length(), 33);
            }
            if (i != COLOR_SOLID_WHITE) {
                this.foregroundColorStartPosition = this.captionStringBuilder.length();
                this.foregroundColor = i;
            }
            if (this.backgroundColorStartPosition != -1 && this.backgroundColor != i2) {
                this.captionStringBuilder.setSpan(new BackgroundColorSpan(this.backgroundColor), this.backgroundColorStartPosition, this.captionStringBuilder.length(), 33);
            }
            if (i2 != COLOR_SOLID_BLACK) {
                this.backgroundColorStartPosition = this.captionStringBuilder.length();
                this.backgroundColor = i2;
            }
        }

        public void setPenLocation(int i, int i2) {
            if (this.row != i) {
                append('\n');
            }
            this.row = i;
        }

        public void setVisibility(boolean z) {
            this.visible = z;
        }

        public void setWindowAttributes(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
            this.windowFillColor = i;
            this.justification = i6;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001b  */
        public static int getArgbColorFromCeaColor(int i, int i2, int i3, int i4) {
            int i5;
            Assertions.checkIndex(i, 0, 4);
            Assertions.checkIndex(i2, 0, 4);
            Assertions.checkIndex(i3, 0, 4);
            Assertions.checkIndex(i4, 0, 4);
            if (i4 == 0 || i4 == 1) {
                i5 = 255;
            } else if (i4 == 2) {
                i5 = 127;
            } else if (i4 != 3) {
                i5 = 255;
            } else {
                i5 = 0;
            }
            return Color.argb(i5, i > 1 ? 255 : 0, i2 > 1 ? 255 : 0, i3 > 1 ? 255 : 0);
        }
    }

    public static final class DtvCcPacket {
        int currentIndex = 0;
        public final byte[] packetData;
        public final int packetSize;
        public final int sequenceNumber;

        public DtvCcPacket(int i, int i2) {
            this.sequenceNumber = i;
            this.packetSize = i2;
            this.packetData = new byte[(i2 * 2) - 1];
        }
    }

    public Cea708Decoder(int i, @Nullable List<byte[]> list) {
        this.selectedServiceNumber = i == -1 ? 1 : i;
        this.cueBuilders = new CueBuilder[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.cueBuilders[i2] = new CueBuilder();
        }
        this.currentCueBuilder = this.cueBuilders[0];
        resetCueBuilders();
    }

    private void finalizeCurrentPacket() {
        if (this.currentDtvCcPacket == null) {
            return;
        }
        processCurrentPacket();
        this.currentDtvCcPacket = null;
    }

    private List<Cue> getDisplayCues() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.cueBuilders[i].isEmpty() && this.cueBuilders[i].isVisible()) {
                arrayList.add(this.cueBuilders[i].build());
            }
        }
        Collections.sort(arrayList);
        return Collections.unmodifiableList(arrayList);
    }

    private void handleC0Command(int i) {
        ParsableBitArray parsableBitArray;
        if (i != 0) {
            if (i == 3) {
                this.cues = getDisplayCues();
            }
            int i2 = 8;
            if (i == 8) {
                this.currentCueBuilder.backspace();
                return;
            }
            switch (i) {
                case 12:
                    resetCueBuilders();
                    break;
                case 13:
                    this.currentCueBuilder.append('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i >= 17 && i <= 23) {
                        C0208D5.m1307a("Currently unsupported COMMAND_EXT1 Command: ", i, TAG);
                        parsableBitArray = this.serviceBlockPacket;
                    } else if (i < 24 || i > 31) {
                        C0208D5.m1307a("Invalid C0 command: ", i, TAG);
                    } else {
                        C0208D5.m1307a("Currently unsupported COMMAND_P16 Command: ", i, TAG);
                        parsableBitArray = this.serviceBlockPacket;
                        i2 = 16;
                    }
                    parsableBitArray.skipBits(i2);
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void handleC1Command(int i) {
        CueBuilder cueBuilder;
        ParsableBitArray parsableBitArray;
        int i2 = 16;
        int i3 = 1;
        switch (i) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i4 = i - 128;
                if (this.currentWindow != i4) {
                    this.currentWindow = i4;
                    cueBuilder = this.cueBuilders[i4];
                    this.currentCueBuilder = cueBuilder;
                }
                break;
            case COMMAND_CLW /* 136 */:
                while (i3 <= 8) {
                    if (this.serviceBlockPacket.readBit()) {
                        this.cueBuilders[8 - i3].clear();
                    }
                    i3++;
                }
                break;
            case COMMAND_DSW /* 137 */:
                for (int i5 = 1; i5 <= 8; i5++) {
                    if (this.serviceBlockPacket.readBit()) {
                        this.cueBuilders[8 - i5].setVisibility(true);
                    }
                }
                break;
            case 138:
                while (i3 <= 8) {
                    if (this.serviceBlockPacket.readBit()) {
                        this.cueBuilders[8 - i3].setVisibility(false);
                    }
                    i3++;
                }
                break;
            case 139:
                for (int i6 = 1; i6 <= 8; i6++) {
                    if (this.serviceBlockPacket.readBit()) {
                        CueBuilder cueBuilder2 = this.cueBuilders[8 - i6];
                        cueBuilder2.setVisibility(!cueBuilder2.isVisible());
                    }
                }
                break;
            case 140:
                while (i3 <= 8) {
                    if (this.serviceBlockPacket.readBit()) {
                        this.cueBuilders[8 - i3].reset();
                    }
                    i3++;
                }
                break;
            case 141:
                this.serviceBlockPacket.skipBits(8);
                break;
            case 142:
                break;
            case 143:
                resetCueBuilders();
                break;
            case 144:
                if (this.currentCueBuilder.isDefined()) {
                    handleSetPenAttributes();
                }
                parsableBitArray = this.serviceBlockPacket;
                parsableBitArray.skipBits(i2);
                break;
            case 145:
                if (this.currentCueBuilder.isDefined()) {
                    handleSetPenColor();
                } else {
                    parsableBitArray = this.serviceBlockPacket;
                    i2 = 24;
                    parsableBitArray.skipBits(i2);
                }
                break;
            case 146:
                if (this.currentCueBuilder.isDefined()) {
                    handleSetPenLocation();
                }
                parsableBitArray = this.serviceBlockPacket;
                parsableBitArray.skipBits(i2);
                break;
            case CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA /* 147 */:
            case CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA /* 148 */:
            case CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA /* 149 */:
            case 150:
            default:
                C0208D5.m1307a("Invalid C1 command: ", i, TAG);
                break;
            case 151:
                if (this.currentCueBuilder.isDefined()) {
                    handleSetWindowAttributes();
                } else {
                    parsableBitArray = this.serviceBlockPacket;
                    i2 = 32;
                    parsableBitArray.skipBits(i2);
                }
                break;
            case 152:
            case 153:
            case 154:
            case 155:
            case COMMAND_DF4 /* 156 */:
            case COMMAND_DF5 /* 157 */:
            case COMMAND_DF6 /* 158 */:
            case 159:
                int i7 = i - 152;
                handleDefineWindow(i7);
                if (this.currentWindow != i7) {
                    this.currentWindow = i7;
                    cueBuilder = this.cueBuilders[i7];
                    this.currentCueBuilder = cueBuilder;
                }
                break;
        }
    }

    private void handleC2Command(int i) {
        ParsableBitArray parsableBitArray;
        int i2;
        if (i <= 7) {
            return;
        }
        if (i <= 15) {
            parsableBitArray = this.serviceBlockPacket;
            i2 = 8;
        } else if (i <= 23) {
            parsableBitArray = this.serviceBlockPacket;
            i2 = 16;
        } else {
            if (i > 31) {
                return;
            }
            parsableBitArray = this.serviceBlockPacket;
            i2 = 24;
        }
        parsableBitArray.skipBits(i2);
    }

    private void handleC3Command(int i) {
        ParsableBitArray parsableBitArray;
        int i2;
        if (i <= 135) {
            parsableBitArray = this.serviceBlockPacket;
            i2 = 32;
        } else {
            if (i > 143) {
                if (i <= 159) {
                    this.serviceBlockPacket.skipBits(2);
                    this.serviceBlockPacket.skipBits(this.serviceBlockPacket.readBits(6) * 8);
                    return;
                }
                return;
            }
            parsableBitArray = this.serviceBlockPacket;
            i2 = 40;
        }
        parsableBitArray.skipBits(i2);
    }

    private void handleDefineWindow(int i) {
        CueBuilder cueBuilder = this.cueBuilders[i];
        this.serviceBlockPacket.skipBits(2);
        boolean bit = this.serviceBlockPacket.readBit();
        boolean bit2 = this.serviceBlockPacket.readBit();
        boolean bit3 = this.serviceBlockPacket.readBit();
        int bits = this.serviceBlockPacket.readBits(3);
        boolean bit4 = this.serviceBlockPacket.readBit();
        int bits2 = this.serviceBlockPacket.readBits(7);
        int bits3 = this.serviceBlockPacket.readBits(8);
        int bits4 = this.serviceBlockPacket.readBits(4);
        int bits5 = this.serviceBlockPacket.readBits(4);
        this.serviceBlockPacket.skipBits(2);
        int bits6 = this.serviceBlockPacket.readBits(6);
        this.serviceBlockPacket.skipBits(2);
        cueBuilder.defineWindow(bit, bit2, bit3, bits, bit4, bits2, bits3, bits5, bits6, bits4, this.serviceBlockPacket.readBits(3), this.serviceBlockPacket.readBits(3));
    }

    private void handleG0Character(int i) {
        if (i == 127) {
            this.currentCueBuilder.append((char) 9835);
        } else {
            this.currentCueBuilder.append((char) (i & 255));
        }
    }

    private void handleG1Character(int i) {
        this.currentCueBuilder.append((char) (i & 255));
    }

    private void handleG2Character(int i) {
        CueBuilder cueBuilder;
        char c = ' ';
        if (i == 32) {
            cueBuilder = this.currentCueBuilder;
        } else if (i == 33) {
            cueBuilder = this.currentCueBuilder;
            c = C1002PX.f2516g;
        } else if (i == 37) {
            cueBuilder = this.currentCueBuilder;
            c = C1002PX.f2499F;
        } else if (i == 42) {
            cueBuilder = this.currentCueBuilder;
            c = 352;
        } else if (i == 44) {
            cueBuilder = this.currentCueBuilder;
            c = 338;
        } else if (i == 63) {
            cueBuilder = this.currentCueBuilder;
            c = 376;
        } else if (i == 57) {
            cueBuilder = this.currentCueBuilder;
            c = C1002PX.f2503J;
        } else if (i == 58) {
            cueBuilder = this.currentCueBuilder;
            c = 353;
        } else if (i == 60) {
            cueBuilder = this.currentCueBuilder;
            c = 339;
        } else if (i != CHARACTER_SM) {
            switch (i) {
                case 48:
                    cueBuilder = this.currentCueBuilder;
                    c = 9608;
                    break;
                case 49:
                    cueBuilder = this.currentCueBuilder;
                    c = C1002PX.f2532w;
                    break;
                case 50:
                    cueBuilder = this.currentCueBuilder;
                    c = C1002PX.f2533x;
                    break;
                case 51:
                    cueBuilder = this.currentCueBuilder;
                    c = C1002PX.f2535z;
                    break;
                case 52:
                    cueBuilder = this.currentCueBuilder;
                    c = C1002PX.f2494A;
                    break;
                case 53:
                    cueBuilder = this.currentCueBuilder;
                    c = C1002PX.f2498E;
                    break;
                default:
                    switch (i) {
                        case CHARACTER_ONE_EIGHTH /* 118 */:
                            cueBuilder = this.currentCueBuilder;
                            c = 8539;
                            break;
                        case 119:
                            cueBuilder = this.currentCueBuilder;
                            c = 8540;
                            break;
                        case 120:
                            cueBuilder = this.currentCueBuilder;
                            c = 8541;
                            break;
                        case 121:
                            cueBuilder = this.currentCueBuilder;
                            c = 8542;
                            break;
                        case 122:
                            cueBuilder = this.currentCueBuilder;
                            c = C4605jL.f14761k;
                            break;
                        case 123:
                            cueBuilder = this.currentCueBuilder;
                            c = 9488;
                            break;
                        case 124:
                            cueBuilder = this.currentCueBuilder;
                            c = C4605jL.f14759i;
                            break;
                        case 125:
                            cueBuilder = this.currentCueBuilder;
                            c = 9472;
                            break;
                        case 126:
                            cueBuilder = this.currentCueBuilder;
                            c = 9496;
                            break;
                        case 127:
                            cueBuilder = this.currentCueBuilder;
                            c = C4605jL.f14758h;
                            break;
                        default:
                            C0208D5.m1307a("Invalid G2 character: ", i, TAG);
                            return;
                    }
                    break;
            }
        } else {
            cueBuilder = this.currentCueBuilder;
            c = 8480;
        }
        cueBuilder.append(c);
    }

    private void handleG3Character(int i) {
        if (i == 160) {
            this.currentCueBuilder.append((char) 13252);
        } else {
            C0208D5.m1307a("Invalid G3 character: ", i, TAG);
            this.currentCueBuilder.append('_');
        }
    }

    private void handleSetPenAttributes() {
        this.currentCueBuilder.setPenAttributes(this.serviceBlockPacket.readBits(4), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBit(), this.serviceBlockPacket.readBit(), this.serviceBlockPacket.readBits(3), this.serviceBlockPacket.readBits(3));
    }

    private void handleSetPenColor() {
        int argbColorFromCeaColor = CueBuilder.getArgbColorFromCeaColor(this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2));
        int argbColorFromCeaColor2 = CueBuilder.getArgbColorFromCeaColor(this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2));
        this.serviceBlockPacket.skipBits(2);
        this.currentCueBuilder.setPenColor(argbColorFromCeaColor, argbColorFromCeaColor2, CueBuilder.getArgbColorFromCeaColor(this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2)));
    }

    private void handleSetPenLocation() {
        this.serviceBlockPacket.skipBits(4);
        int bits = this.serviceBlockPacket.readBits(4);
        this.serviceBlockPacket.skipBits(2);
        this.currentCueBuilder.setPenLocation(bits, this.serviceBlockPacket.readBits(6));
    }

    private void handleSetWindowAttributes() {
        int argbColorFromCeaColor = CueBuilder.getArgbColorFromCeaColor(this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2));
        int bits = this.serviceBlockPacket.readBits(2);
        int argbColorFromCeaColor2 = CueBuilder.getArgbColorFromCeaColor(this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2), this.serviceBlockPacket.readBits(2));
        if (this.serviceBlockPacket.readBit()) {
            bits |= 4;
        }
        boolean bit = this.serviceBlockPacket.readBit();
        int bits2 = this.serviceBlockPacket.readBits(2);
        int bits3 = this.serviceBlockPacket.readBits(2);
        int bits4 = this.serviceBlockPacket.readBits(2);
        this.serviceBlockPacket.skipBits(8);
        this.currentCueBuilder.setWindowAttributes(argbColorFromCeaColor, argbColorFromCeaColor2, bit, bits, bits2, bits3, bits4);
    }

    private void processCurrentPacket() {
        String str;
        DtvCcPacket dtvCcPacket = this.currentDtvCcPacket;
        int i = dtvCcPacket.currentIndex;
        if (i != (dtvCcPacket.packetSize * 2) - 1) {
            Log.m17586w(TAG, "DtvCcPacket ended prematurely; size is " + ((this.currentDtvCcPacket.packetSize * 2) - 1) + ", but current index is " + this.currentDtvCcPacket.currentIndex + " (sequence number " + this.currentDtvCcPacket.sequenceNumber + "); ignoring packet");
            return;
        }
        this.serviceBlockPacket.reset(dtvCcPacket.packetData, i);
        int bits = this.serviceBlockPacket.readBits(3);
        int bits2 = this.serviceBlockPacket.readBits(5);
        if (bits == 7) {
            this.serviceBlockPacket.skipBits(2);
            bits = this.serviceBlockPacket.readBits(6);
            if (bits < 7) {
                C0208D5.m1307a("Invalid extended service number: ", bits, TAG);
            }
        }
        if (bits2 == 0) {
            if (bits != 0) {
                Log.m17586w(TAG, "serviceNumber is non-zero (" + bits + ") when blockSize is 0");
                return;
            }
            return;
        }
        if (bits != this.selectedServiceNumber) {
            return;
        }
        boolean z = false;
        while (this.serviceBlockPacket.bitsLeft() > 0) {
            int bits3 = this.serviceBlockPacket.readBits(8);
            if (bits3 == 16) {
                bits3 = this.serviceBlockPacket.readBits(8);
                if (bits3 <= 31) {
                    handleC2Command(bits3);
                } else {
                    if (bits3 <= 127) {
                        handleG2Character(bits3);
                    } else if (bits3 <= 159) {
                        handleC3Command(bits3);
                    } else if (bits3 <= 255) {
                        handleG3Character(bits3);
                    } else {
                        str = "Invalid extended command: ";
                        C0208D5.m1307a(str, bits3, TAG);
                    }
                    z = true;
                }
            } else if (bits3 <= 31) {
                handleC0Command(bits3);
            } else {
                if (bits3 <= 127) {
                    handleG0Character(bits3);
                } else if (bits3 <= 159) {
                    handleC1Command(bits3);
                } else if (bits3 <= 255) {
                    handleG1Character(bits3);
                } else {
                    str = "Invalid base command: ";
                    C0208D5.m1307a(str, bits3, TAG);
                }
                z = true;
            }
        }
        if (z) {
            this.cues = getDisplayCues();
        }
    }

    private void resetCueBuilders() {
        for (int i = 0; i < 8; i++) {
            this.cueBuilders[i].reset();
        }
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public Subtitle createSubtitle() {
        List<Cue> list = this.cues;
        this.lastCues = list;
        return new CeaSubtitle(list);
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder
    public void decode(SubtitleInputBuffer subtitleInputBuffer) {
        this.ccData.reset(subtitleInputBuffer.data.array(), subtitleInputBuffer.data.limit());
        while (this.ccData.bytesLeft() >= 3) {
            int unsignedByte = this.ccData.readUnsignedByte();
            int i = unsignedByte & 3;
            boolean z = (unsignedByte & 4) == 4;
            byte unsignedByte2 = (byte) this.ccData.readUnsignedByte();
            byte unsignedByte3 = (byte) this.ccData.readUnsignedByte();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        finalizeCurrentPacket();
                        int i2 = (unsignedByte2 & 192) >> 6;
                        int i3 = unsignedByte2 & 63;
                        if (i3 == 0) {
                            i3 = 64;
                        }
                        DtvCcPacket dtvCcPacket = new DtvCcPacket(i2, i3);
                        this.currentDtvCcPacket = dtvCcPacket;
                        byte[] bArr = dtvCcPacket.packetData;
                        int i4 = dtvCcPacket.currentIndex;
                        dtvCcPacket.currentIndex = i4 + 1;
                        bArr[i4] = unsignedByte3;
                    } else {
                        Assertions.checkArgument(i == 2);
                        DtvCcPacket dtvCcPacket2 = this.currentDtvCcPacket;
                        if (dtvCcPacket2 == null) {
                            Log.m17582e(TAG, "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = dtvCcPacket2.packetData;
                            int i5 = dtvCcPacket2.currentIndex;
                            int i6 = i5 + 1;
                            dtvCcPacket2.currentIndex = i6;
                            bArr2[i5] = unsignedByte2;
                            dtvCcPacket2.currentIndex = i5 + 2;
                            bArr2[i6] = unsignedByte3;
                        }
                    }
                    DtvCcPacket dtvCcPacket3 = this.currentDtvCcPacket;
                    if (dtvCcPacket3.currentIndex == (dtvCcPacket3.packetSize * 2) - 1) {
                        finalizeCurrentPacket();
                    }
                }
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
        this.currentWindow = 0;
        this.currentCueBuilder = this.cueBuilders[0];
        resetCueBuilders();
        this.currentDtvCcPacket = null;
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
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    @Override // com.google.android.exoplayer2.text.cea.CeaDecoder, com.google.android.exoplayer2.text.SubtitleDecoder
    public /* bridge */ /* synthetic */ void setPositionUs(long j) {
        super.setPositionUs(j);
    }
}
