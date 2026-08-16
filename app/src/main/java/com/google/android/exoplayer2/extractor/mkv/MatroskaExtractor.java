package com.google.android.exoplayer2.extractor.mkv;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.LongArray;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.AvcConfig;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.video.HevcConfig;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.dom4j.p020io.SAXEventRecorder;
import org.videolan.libvlc.MediaPlayer;
import p000.C0060Av;
import p000.C1579YX;
import p000.C4783m8;
import p000.C5577vD;
import p000.C5630w2;

/* JADX INFO: loaded from: classes2.dex */
public class MatroskaExtractor implements Extractor {
    private static final int BLOCK_ADDITIONAL_ID_VP9_ITU_T_35 = 4;
    private static final int BLOCK_STATE_DATA = 2;
    private static final int BLOCK_STATE_HEADER = 1;
    private static final int BLOCK_STATE_START = 0;
    private static final String CODEC_ID_AAC = "A_AAC";
    private static final String CODEC_ID_AC3 = "A_AC3";
    private static final String CODEC_ID_ACM = "A_MS/ACM";
    private static final String CODEC_ID_ASS = "S_TEXT/ASS";
    private static final String CODEC_ID_AV1 = "V_AV1";
    private static final String CODEC_ID_DTS = "A_DTS";
    private static final String CODEC_ID_DTS_EXPRESS = "A_DTS/EXPRESS";
    private static final String CODEC_ID_DTS_LOSSLESS = "A_DTS/LOSSLESS";
    private static final String CODEC_ID_DVBSUB = "S_DVBSUB";
    private static final String CODEC_ID_E_AC3 = "A_EAC3";
    private static final String CODEC_ID_FLAC = "A_FLAC";
    private static final String CODEC_ID_FOURCC = "V_MS/VFW/FOURCC";
    private static final String CODEC_ID_H264 = "V_MPEG4/ISO/AVC";
    private static final String CODEC_ID_H265 = "V_MPEGH/ISO/HEVC";
    private static final String CODEC_ID_MP2 = "A_MPEG/L2";
    private static final String CODEC_ID_MP3 = "A_MPEG/L3";
    private static final String CODEC_ID_MPEG2 = "V_MPEG2";
    private static final String CODEC_ID_MPEG4_AP = "V_MPEG4/ISO/AP";
    private static final String CODEC_ID_MPEG4_ASP = "V_MPEG4/ISO/ASP";
    private static final String CODEC_ID_MPEG4_SP = "V_MPEG4/ISO/SP";
    private static final String CODEC_ID_OPUS = "A_OPUS";
    private static final String CODEC_ID_PCM_INT_LIT = "A_PCM/INT/LIT";
    private static final String CODEC_ID_PGS = "S_HDMV/PGS";
    private static final String CODEC_ID_SUBRIP = "S_TEXT/UTF8";
    private static final String CODEC_ID_THEORA = "V_THEORA";
    private static final String CODEC_ID_TRUEHD = "A_TRUEHD";
    private static final String CODEC_ID_VOBSUB = "S_VOBSUB";
    private static final String CODEC_ID_VORBIS = "A_VORBIS";
    private static final String CODEC_ID_VP8 = "V_VP8";
    private static final String CODEC_ID_VP9 = "V_VP9";
    private static final String DOC_TYPE_MATROSKA = "matroska";
    private static final String DOC_TYPE_WEBM = "webm";
    private static final int ENCRYPTION_IV_SIZE = 8;
    public static final int FLAG_DISABLE_SEEK_FOR_CUES = 1;
    private static final int FOURCC_COMPRESSION_DIVX = 1482049860;
    private static final int FOURCC_COMPRESSION_H263 = 859189832;
    private static final int FOURCC_COMPRESSION_VC1 = 826496599;
    private static final int ID_AUDIO = 225;
    private static final int ID_AUDIO_BIT_DEPTH = 25188;
    private static final int ID_BLOCK = 161;
    private static final int ID_BLOCK_ADDITIONAL = 165;
    private static final int ID_BLOCK_ADDITIONS = 30113;
    private static final int ID_BLOCK_ADD_ID = 238;
    private static final int ID_BLOCK_DURATION = 155;
    private static final int ID_BLOCK_GROUP = 160;
    private static final int ID_BLOCK_MORE = 166;
    private static final int ID_CHANNELS = 159;
    private static final int ID_CLUSTER = 524531317;
    private static final int ID_CODEC_DELAY = 22186;
    private static final int ID_CODEC_ID = 134;
    private static final int ID_CODEC_PRIVATE = 25506;
    private static final int ID_COLOUR = 21936;
    private static final int ID_COLOUR_PRIMARIES = 21947;
    private static final int ID_COLOUR_RANGE = 21945;
    private static final int ID_COLOUR_TRANSFER = 21946;
    private static final int ID_CONTENT_COMPRESSION = 20532;
    private static final int ID_CONTENT_COMPRESSION_ALGORITHM = 16980;
    private static final int ID_CONTENT_COMPRESSION_SETTINGS = 16981;
    private static final int ID_CONTENT_ENCODING = 25152;
    private static final int ID_CONTENT_ENCODINGS = 28032;
    private static final int ID_CONTENT_ENCODING_ORDER = 20529;
    private static final int ID_CONTENT_ENCODING_SCOPE = 20530;
    private static final int ID_CONTENT_ENCRYPTION = 20533;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS = 18407;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE = 18408;
    private static final int ID_CONTENT_ENCRYPTION_ALGORITHM = 18401;
    private static final int ID_CONTENT_ENCRYPTION_KEY_ID = 18402;
    private static final int ID_CUES = 475249515;
    private static final int ID_CUE_CLUSTER_POSITION = 241;
    private static final int ID_CUE_POINT = 187;
    private static final int ID_CUE_TIME = 179;
    private static final int ID_CUE_TRACK_POSITIONS = 183;
    private static final int ID_DEFAULT_DURATION = 2352003;
    private static final int ID_DISPLAY_HEIGHT = 21690;
    private static final int ID_DISPLAY_UNIT = 21682;
    private static final int ID_DISPLAY_WIDTH = 21680;
    private static final int ID_DOC_TYPE = 17026;
    private static final int ID_DOC_TYPE_READ_VERSION = 17029;
    private static final int ID_DURATION = 17545;
    private static final int ID_EBML = 440786851;
    private static final int ID_EBML_READ_VERSION = 17143;
    private static final int ID_FLAG_DEFAULT = 136;
    private static final int ID_FLAG_FORCED = 21930;
    private static final int ID_INFO = 357149030;
    private static final int ID_LANGUAGE = 2274716;
    private static final int ID_LUMNINANCE_MAX = 21977;
    private static final int ID_LUMNINANCE_MIN = 21978;
    private static final int ID_MASTERING_METADATA = 21968;
    private static final int ID_MAX_BLOCK_ADDITION_ID = 21998;
    private static final int ID_MAX_CLL = 21948;
    private static final int ID_MAX_FALL = 21949;
    private static final int ID_NAME = 21358;
    private static final int ID_PIXEL_HEIGHT = 186;
    private static final int ID_PIXEL_WIDTH = 176;
    private static final int ID_PRIMARY_B_CHROMATICITY_X = 21973;
    private static final int ID_PRIMARY_B_CHROMATICITY_Y = 21974;
    private static final int ID_PRIMARY_G_CHROMATICITY_X = 21971;
    private static final int ID_PRIMARY_G_CHROMATICITY_Y = 21972;
    private static final int ID_PRIMARY_R_CHROMATICITY_X = 21969;
    private static final int ID_PRIMARY_R_CHROMATICITY_Y = 21970;
    private static final int ID_PROJECTION = 30320;
    private static final int ID_PROJECTION_POSE_PITCH = 30324;
    private static final int ID_PROJECTION_POSE_ROLL = 30325;
    private static final int ID_PROJECTION_POSE_YAW = 30323;
    private static final int ID_PROJECTION_PRIVATE = 30322;
    private static final int ID_PROJECTION_TYPE = 30321;
    private static final int ID_REFERENCE_BLOCK = 251;
    private static final int ID_SAMPLING_FREQUENCY = 181;
    private static final int ID_SEEK = 19899;
    private static final int ID_SEEK_HEAD = 290298740;
    private static final int ID_SEEK_ID = 21419;
    private static final int ID_SEEK_POSITION = 21420;
    private static final int ID_SEEK_PRE_ROLL = 22203;
    private static final int ID_SEGMENT = 408125543;
    private static final int ID_SEGMENT_INFO = 357149030;
    private static final int ID_SIMPLE_BLOCK = 163;
    private static final int ID_STEREO_MODE = 21432;
    private static final int ID_TIMECODE_SCALE = 2807729;
    private static final int ID_TIME_CODE = 231;
    private static final int ID_TRACKS = 374648427;
    private static final int ID_TRACK_ENTRY = 174;
    private static final int ID_TRACK_NUMBER = 215;
    private static final int ID_TRACK_TYPE = 131;
    private static final int ID_VIDEO = 224;
    private static final int ID_WHITE_POINT_CHROMATICITY_X = 21975;
    private static final int ID_WHITE_POINT_CHROMATICITY_Y = 21976;
    private static final int LACING_EBML = 3;
    private static final int LACING_FIXED_SIZE = 2;
    private static final int LACING_NONE = 0;
    private static final int LACING_XIPH = 1;
    private static final int OPUS_MAX_INPUT_SIZE = 5760;
    private static final int SSA_PREFIX_END_TIMECODE_OFFSET = 21;
    private static final String SSA_TIMECODE_FORMAT = "%01d:%02d:%02d:%02d";
    private static final long SSA_TIMECODE_LAST_VALUE_SCALING_FACTOR = 10000;
    private static final int SUBRIP_PREFIX_END_TIMECODE_OFFSET = 19;
    private static final String SUBRIP_TIMECODE_FORMAT = "%02d:%02d:%02d,%03d";
    private static final long SUBRIP_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000;
    private static final String TAG = "MatroskaExtractor";
    private static final int TRACK_TYPE_AUDIO = 2;
    private static final int UNSET_ENTRY_ID = -1;
    private static final int VORBIS_MAX_INPUT_SIZE = 8192;
    private static final int WAVE_FORMAT_EXTENSIBLE = 65534;
    private static final int WAVE_FORMAT_PCM = 1;
    private static final int WAVE_FORMAT_SIZE = 18;
    private final ParsableByteArray blockAdditionalData;
    private int blockAdditionalId;
    private long blockDurationUs;
    private int blockFlags;
    private boolean blockHasReferenceBlock;
    private int blockSampleCount;
    private int blockSampleIndex;
    private int[] blockSampleSizes;
    private int blockState;
    private long blockTimeUs;
    private int blockTrackNumber;
    private int blockTrackNumberLength;
    private long clusterTimecodeUs;
    private LongArray cueClusterPositions;
    private LongArray cueTimesUs;
    private long cuesContentPosition;
    private Track currentTrack;
    private long durationTimecode;
    private long durationUs;
    private final ParsableByteArray encryptionInitializationVector;
    private final ParsableByteArray encryptionSubsampleData;
    private ByteBuffer encryptionSubsampleDataBuffer;
    private ExtractorOutput extractorOutput;
    private boolean haveOutputSample;
    private final ParsableByteArray nalLength;
    private final ParsableByteArray nalStartCode;
    private final EbmlReader reader;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private boolean sampleEncodingHandled;
    private boolean sampleInitializationVectorRead;
    private int samplePartitionCount;
    private boolean samplePartitionCountRead;
    private byte sampleSignalByte;
    private boolean sampleSignalByteRead;
    private final ParsableByteArray sampleStrippedBytes;
    private final ParsableByteArray scratch;
    private int seekEntryId;
    private final ParsableByteArray seekEntryIdBytes;
    private long seekEntryPosition;
    private boolean seekForCues;
    private final boolean seekForCuesEnabled;
    private long seekPositionAfterBuildingCues;
    private boolean seenClusterPositionForCurrentCuePoint;
    private long segmentContentPosition;
    private long segmentContentSize;
    private boolean sentSeekMap;
    private final ParsableByteArray subtitleSample;
    private long timecodeScale;
    private final SparseArray<Track> tracks;
    private final VarintReader varintReader;
    private final ParsableByteArray vorbisNumPageSamples;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: jy
        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return null;
        }
    };
    private static final byte[] SUBRIP_PREFIX = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] SSA_DIALOGUE_FORMAT = Util.getUtf8Bytes("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] SSA_PREFIX = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final UUID WAVE_SUBFORMAT_PCM = new UUID(72057594037932032L, -9223371306706625679L);

    /* JADX INFO: loaded from: classes.dex */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public final class InnerEbmlProcessor implements EbmlProcessor {
        private InnerEbmlProcessor() {
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void binaryElement(int i, int i2, ExtractorInput extractorInput) throws InterruptedException, IOException {
            MatroskaExtractor.this.binaryElement(i, i2, extractorInput);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void endMasterElement(int i) throws ParserException {
            MatroskaExtractor.this.endMasterElement(i);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void floatElement(int i, double d) throws ParserException {
            MatroskaExtractor.this.floatElement(i, d);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public int getElementType(int i) {
            return MatroskaExtractor.this.getElementType(i);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void integerElement(int i, long j) throws ParserException {
            MatroskaExtractor.this.integerElement(i, j);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public boolean isLevel1Element(int i) {
            return MatroskaExtractor.this.isLevel1Element(i);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void startMasterElement(int i, long j, long j2) throws ParserException {
            MatroskaExtractor.this.startMasterElement(i, j, j2);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void stringElement(int i, String str) throws ParserException {
            MatroskaExtractor.this.stringElement(i, str);
        }
    }

    public static final class Track {
        private static final int DEFAULT_MAX_CLL = 1000;
        private static final int DEFAULT_MAX_FALL = 200;
        private static final int DISPLAY_UNIT_PIXELS = 0;
        private static final int MAX_CHROMATICITY = 50000;
        public int audioBitDepth;
        public int channelCount;
        public long codecDelayNs;
        public String codecId;
        public byte[] codecPrivate;
        public int colorRange;
        public int colorSpace;
        public int colorTransfer;
        public TrackOutput.CryptoData cryptoData;
        public int defaultSampleDurationNs;
        public int displayHeight;
        public int displayUnit;
        public int displayWidth;
        public DrmInitData drmInitData;
        public boolean flagDefault;
        public boolean flagForced;
        public boolean hasColorInfo;
        public boolean hasContentEncryption;
        public int height;
        private String language;
        public int maxBlockAdditionId;
        public int maxContentLuminance;
        public int maxFrameAverageLuminance;
        public float maxMasteringLuminance;
        public float minMasteringLuminance;
        public int nalUnitLengthFieldLength;
        public String name;
        public int number;
        public TrackOutput output;
        public float primaryBChromaticityX;
        public float primaryBChromaticityY;
        public float primaryGChromaticityX;
        public float primaryGChromaticityY;
        public float primaryRChromaticityX;
        public float primaryRChromaticityY;
        public byte[] projectionData;
        public float projectionPosePitch;
        public float projectionPoseRoll;
        public float projectionPoseYaw;
        public int projectionType;
        public int sampleRate;
        public byte[] sampleStrippedBytes;
        public long seekPreRollNs;
        public int stereoMode;

        @Nullable
        public TrueHdSampleRechunker trueHdSampleRechunker;
        public int type;
        public float whitePointChromaticityX;
        public float whitePointChromaticityY;
        public int width;

        private Track() {
            this.width = -1;
            this.height = -1;
            this.displayWidth = -1;
            this.displayHeight = -1;
            this.displayUnit = 0;
            this.projectionType = -1;
            this.projectionPoseYaw = 0.0f;
            this.projectionPosePitch = 0.0f;
            this.projectionPoseRoll = 0.0f;
            this.projectionData = null;
            this.stereoMode = -1;
            this.hasColorInfo = false;
            this.colorSpace = -1;
            this.colorTransfer = -1;
            this.colorRange = -1;
            this.maxContentLuminance = 1000;
            this.maxFrameAverageLuminance = 200;
            this.primaryRChromaticityX = -1.0f;
            this.primaryRChromaticityY = -1.0f;
            this.primaryGChromaticityX = -1.0f;
            this.primaryGChromaticityY = -1.0f;
            this.primaryBChromaticityX = -1.0f;
            this.primaryBChromaticityY = -1.0f;
            this.whitePointChromaticityX = -1.0f;
            this.whitePointChromaticityY = -1.0f;
            this.maxMasteringLuminance = -1.0f;
            this.minMasteringLuminance = -1.0f;
            this.channelCount = 1;
            this.audioBitDepth = -1;
            this.sampleRate = 8000;
            this.codecDelayNs = 0L;
            this.seekPreRollNs = 0L;
            this.flagDefault = true;
            this.language = "eng";
        }

        @Nullable
        private byte[] getHdrStaticInfo() {
            if (this.primaryRChromaticityX == -1.0f || this.primaryRChromaticityY == -1.0f || this.primaryGChromaticityX == -1.0f || this.primaryGChromaticityY == -1.0f || this.primaryBChromaticityX == -1.0f || this.primaryBChromaticityY == -1.0f || this.whitePointChromaticityX == -1.0f || this.whitePointChromaticityY == -1.0f || this.maxMasteringLuminance == -1.0f || this.minMasteringLuminance == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.primaryRChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryRChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryGChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryGChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryBChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryBChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.whitePointChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.whitePointChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.maxMasteringLuminance + 0.5f));
            byteBufferOrder.putShort((short) (this.minMasteringLuminance + 0.5f));
            byteBufferOrder.putShort((short) this.maxContentLuminance);
            byteBufferOrder.putShort((short) this.maxFrameAverageLuminance);
            return bArr;
        }

        private static Pair<String, List<byte[]>> parseFourCcPrivate(ParsableByteArray parsableByteArray) throws ParserException {
            try {
                parsableByteArray.skipBytes(16);
                long littleEndianUnsignedInt = parsableByteArray.readLittleEndianUnsignedInt();
                if (littleEndianUnsignedInt == 1482049860) {
                    return new Pair<>(MimeTypes.VIDEO_DIVX, null);
                }
                if (littleEndianUnsignedInt == 859189832) {
                    return new Pair<>(MimeTypes.VIDEO_H263, null);
                }
                if (littleEndianUnsignedInt != 826496599) {
                    Log.m17586w(MatroskaExtractor.TAG, "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>(MimeTypes.VIDEO_UNKNOWN, null);
                }
                byte[] bArr = parsableByteArray.data;
                for (int position = parsableByteArray.getPosition() + 20; position < bArr.length - 4; position++) {
                    if (bArr[position] == 0 && bArr[position + 1] == 0 && bArr[position + 2] == 1 && bArr[position + 3] == 15) {
                        return new Pair<>(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(bArr, position, bArr.length)));
                    }
                }
                throw new ParserException("Failed to find FourCC VC1 initialization data");
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing FourCC private data");
            }
        }

        private static boolean parseMsAcmCodecPrivate(ParsableByteArray parsableByteArray) throws ParserException {
            try {
                int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
                if (littleEndianUnsignedShort == 1) {
                    return true;
                }
                if (littleEndianUnsignedShort != 65534) {
                    return false;
                }
                parsableByteArray.setPosition(24);
                return parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getMostSignificantBits() && parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getLeastSignificantBits();
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing MS/ACM codec private");
            }
        }

        private static List<byte[]> parseVorbisCodecPrivate(byte[] bArr) throws ParserException {
            int i;
            int i2;
            try {
                if (bArr[0] != 2) {
                    throw new ParserException("Error parsing vorbis codec private");
                }
                int i3 = 1;
                int i4 = 0;
                while (true) {
                    i = bArr[i3];
                    if (i != -1) {
                        break;
                    }
                    i4 += 255;
                    i3++;
                }
                int i5 = i3 + 1;
                int i6 = i4 + i;
                int i7 = 0;
                while (true) {
                    i2 = bArr[i5];
                    if (i2 != -1) {
                        break;
                    }
                    i7 += 255;
                    i5++;
                }
                int i8 = i5 + 1;
                int i9 = i7 + i2;
                if (bArr[i8] != 1) {
                    throw new ParserException("Error parsing vorbis codec private");
                }
                byte[] bArr2 = new byte[i6];
                System.arraycopy(bArr, i8, bArr2, 0, i6);
                int i10 = i8 + i6;
                if (bArr[i10] != 3) {
                    throw new ParserException("Error parsing vorbis codec private");
                }
                int i11 = i10 + i9;
                if (bArr[i11] != 5) {
                    throw new ParserException("Error parsing vorbis codec private");
                }
                byte[] bArr3 = new byte[bArr.length - i11];
                System.arraycopy(bArr, i11, bArr3, 0, bArr.length - i11);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing vorbis codec private");
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:143:0x024e A[PHI: r1
          0x024e: PHI (r1v21 int) = (r1v7 int), (r1v26 int) binds: [B:165:0x02fd, B:139:0x0236] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:175:0x0320  */
        /* JADX WARN: Code duplicated, block: B:176:0x0322  */
        /* JADX WARN: Code duplicated, block: B:179:0x032a  */
        /* JADX WARN: Code duplicated, block: B:180:0x0350  */
        /* JADX WARN: Code duplicated, block: B:182:0x0356  */
        /* JADX WARN: Code duplicated, block: B:184:0x035a  */
        /* JADX WARN: Code duplicated, block: B:186:0x035f  */
        /* JADX WARN: Code duplicated, block: B:189:0x0367  */
        /* JADX WARN: Code duplicated, block: B:191:0x036c  */
        /* JADX WARN: Code duplicated, block: B:194:0x0371  */
        /* JADX WARN: Code duplicated, block: B:197:0x0383  */
        /* JADX WARN: Code duplicated, block: B:200:0x038b  */
        /* JADX WARN: Code duplicated, block: B:201:0x039d  */
        /* JADX WARN: Code duplicated, block: B:204:0x03af  */
        /* JADX WARN: Code duplicated, block: B:205:0x03b1  */
        /* JADX WARN: Code duplicated, block: B:207:0x03bb  */
        /* JADX WARN: Code duplicated, block: B:208:0x03be  */
        /* JADX WARN: Code duplicated, block: B:210:0x03c8  */
        /* JADX WARN: Code duplicated, block: B:211:0x03cb  */
        /* JADX WARN: Code duplicated, block: B:213:0x03d5  */
        /* JADX WARN: Code duplicated, block: B:216:0x03db  */
        /* JADX WARN: Code duplicated, block: B:235:0x0429  */
        /* JADX WARN: Code duplicated, block: B:237:0x0454  */
        /* JADX WARN: Code duplicated, block: B:239:0x045a  */
        /* JADX WARN: Code duplicated, block: B:241:0x0469  */
        /* JADX WARN: Code duplicated, block: B:243:0x046f  */
        /* JADX WARN: Code duplicated, block: B:244:0x04a3  */
        /* JADX WARN: Code duplicated, block: B:246:0x04a9  */
        /* JADX WARN: Code duplicated, block: B:4:0x002a  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public void initializeOutput(ExtractorOutput extractorOutput, int i) throws ParserException {
            byte b;
            String string;
            int pcmEncoding;
            StringBuilder sb;
            int i2;
            int i3;
            List list;
            List<byte[]> list2;
            List<byte[]> list3;
            int i4;
            int i5;
            Format formatCreateImageSampleFormat;
            int i6;
            int i7;
            float f;
            ColorInfo colorInfo;
            int i8;
            int i9;
            int i10;
            int i11;
            String str = this.codecId;
            str.getClass();
            int i12 = 1;
            String str2 = MimeTypes.AUDIO_RAW;
            switch (str.hashCode()) {
                case -2095576542:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_MPEG4_AP)) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case -2095575984:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_MPEG4_SP)) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case -1985379776:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_ACM)) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case -1784763192:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_TRUEHD)) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case -1730367663:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_VORBIS)) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case -1482641358:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_MP2)) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case -1482641357:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_MP3)) {
                        b = -1;
                    } else {
                        b = 6;
                    }
                    break;
                case -1373388978:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_FOURCC)) {
                        b = -1;
                    } else {
                        b = 7;
                    }
                    break;
                case -933872740:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_DVBSUB)) {
                        b = -1;
                    } else {
                        b = 8;
                    }
                    break;
                case -538363189:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_MPEG4_ASP)) {
                        b = -1;
                    } else {
                        b = 9;
                    }
                    break;
                case -538363109:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_H264)) {
                        b = -1;
                    } else {
                        b = 10;
                    }
                    break;
                case -425012669:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_VOBSUB)) {
                        b = -1;
                    } else {
                        b = SAXEventRecorder.SAXEvent.f16645n;
                    }
                    break;
                case -356037306:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_DTS_LOSSLESS)) {
                        b = -1;
                    } else {
                        b = SAXEventRecorder.SAXEvent.f16646o;
                    }
                    break;
                case 62923557:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_AAC)) {
                        b = -1;
                    } else {
                        b = 13;
                    }
                    break;
                case 62923603:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_AC3)) {
                        b = -1;
                    } else {
                        b = SAXEventRecorder.SAXEvent.f16648q;
                    }
                    break;
                case 62927045:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_DTS)) {
                        b = -1;
                    } else {
                        b = SAXEventRecorder.SAXEvent.f16649r;
                    }
                    break;
                case 82318131:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_AV1)) {
                        b = -1;
                    } else {
                        b = 16;
                    }
                    break;
                case 82338133:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_VP8)) {
                        b = -1;
                    } else {
                        b = SAXEventRecorder.SAXEvent.f16651t;
                    }
                    break;
                case 82338134:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_VP9)) {
                        b = -1;
                    } else {
                        b = SAXEventRecorder.SAXEvent.f16652u;
                    }
                    break;
                case 99146302:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_PGS)) {
                        b = -1;
                    } else {
                        b = SAXEventRecorder.SAXEvent.f16653v;
                    }
                    break;
                case 444813526:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_THEORA)) {
                        b = -1;
                    } else {
                        b = 20;
                    }
                    break;
                case 542569478:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_DTS_EXPRESS)) {
                        b = -1;
                    } else {
                        b = 21;
                    }
                    break;
                case 725957860:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_PCM_INT_LIT)) {
                        b = -1;
                    } else {
                        b = 22;
                    }
                    break;
                case 738597099:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_ASS)) {
                        b = -1;
                    } else {
                        b = 23;
                    }
                    break;
                case 855502857:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_H265)) {
                        b = -1;
                    } else {
                        b = 24;
                    }
                    break;
                case 1422270023:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_SUBRIP)) {
                        b = -1;
                    } else {
                        b = 25;
                    }
                    break;
                case 1809237540:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_MPEG2)) {
                        b = -1;
                    } else {
                        b = 26;
                    }
                    break;
                case 1950749482:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_E_AC3)) {
                        b = -1;
                    } else {
                        b = 27;
                    }
                    break;
                case 1950789798:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_FLAC)) {
                        b = -1;
                    } else {
                        b = 28;
                    }
                    break;
                case 1951062397:
                    if (!str.equals(MatroskaExtractor.CODEC_ID_OPUS)) {
                        b = -1;
                    } else {
                        b = 29;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 9:
                    byte[] bArr = this.codecPrivate;
                    List<byte[]> listSingletonList = bArr == null ? null : Collections.singletonList(bArr);
                    str2 = MimeTypes.VIDEO_MP4V;
                    list3 = listSingletonList;
                    i2 = -1;
                    list2 = list3;
                    i3 = -1;
                    list = list2;
                    boolean z = this.flagDefault;
                    if (this.flagForced) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    i5 = (z ? 1 : 0) | i4;
                    if (!MimeTypes.isAudio(str2)) {
                        formatCreateImageSampleFormat = Format.createAudioSampleFormat(Integer.toString(i), str2, null, -1, i3, this.channelCount, this.sampleRate, i2, list, this.drmInitData, i5, this.language);
                    } else if (MimeTypes.isVideo(str2)) {
                        if (this.displayUnit == 0) {
                            i10 = this.displayWidth;
                            i6 = -1;
                            if (i10 == -1) {
                                i10 = this.width;
                            }
                            this.displayWidth = i10;
                            i11 = this.displayHeight;
                            if (i11 == -1) {
                                i11 = this.height;
                            }
                            this.displayHeight = i11;
                        } else {
                            i6 = -1;
                        }
                        i7 = this.displayWidth;
                        if (i7 != i6 || (i9 = this.displayHeight) == i6) {
                            f = -1.0f;
                        } else {
                            f = (this.height * i7) / (this.width * i9);
                        }
                        if (this.hasColorInfo) {
                            colorInfo = new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo());
                        } else {
                            colorInfo = null;
                        }
                        if ("htc_video_rotA-000".equals(this.name)) {
                            i6 = 0;
                        } else if ("htc_video_rotA-090".equals(this.name)) {
                            i6 = 90;
                        } else if ("htc_video_rotA-180".equals(this.name)) {
                            i6 = 180;
                        } else if ("htc_video_rotA-270".equals(this.name)) {
                            i6 = MediaPlayer.Event.f17411q;
                        }
                        if (this.projectionType == 0 || Float.compare(this.projectionPoseYaw, 0.0f) != 0 || Float.compare(this.projectionPosePitch, 0.0f) != 0) {
                            i8 = i6;
                        } else if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                            i8 = 0;
                        } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                            i8 = 90;
                        } else if (Float.compare(this.projectionPosePitch, -180.0f) == 0 || Float.compare(this.projectionPosePitch, 180.0f) == 0) {
                            i8 = 180;
                        } else if (Float.compare(this.projectionPosePitch, -90.0f) == 0) {
                            i8 = MediaPlayer.Event.f17411q;
                        } else {
                            i8 = i6;
                        }
                        formatCreateImageSampleFormat = Format.createVideoSampleFormat(Integer.toString(i), str2, null, -1, i3, this.width, this.height, -1.0f, list, i8, f, this.projectionData, this.stereoMode, colorInfo, this.drmInitData);
                        i12 = 2;
                    } else {
                        if ("application/x-subrip".equals(str2)) {
                            formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, i5, this.language, this.drmInitData);
                        } else if (MimeTypes.TEXT_SSA.equals(str2)) {
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(MatroskaExtractor.SSA_DIALOGUE_FORMAT);
                            arrayList.add(this.codecPrivate);
                            formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, null, -1, i5, this.language, -1, this.drmInitData, Long.MAX_VALUE, arrayList);
                        } else {
                            if (MimeTypes.APPLICATION_VOBSUB.equals(str2) && !MimeTypes.APPLICATION_PGS.equals(str2) && !MimeTypes.APPLICATION_DVBSUBS.equals(str2)) {
                                throw new ParserException("Unexpected MIME type.");
                            }
                            formatCreateImageSampleFormat = Format.createImageSampleFormat(Integer.toString(i), str2, null, -1, i5, list, this.language, this.drmInitData);
                        }
                        i12 = 3;
                    }
                    TrackOutput trackOutputTrack = extractorOutput.track(this.number, i12);
                    this.output = trackOutputTrack;
                    trackOutputTrack.format(formatCreateImageSampleFormat);
                    return;
                case 2:
                    if (parseMsAcmCodecPrivate(new ParsableByteArray(this.codecPrivate))) {
                        pcmEncoding = Util.getPcmEncoding(this.audioBitDepth);
                        if (pcmEncoding == 0) {
                            sb = new StringBuilder("Unsupported PCM bit depth: ");
                            sb.append(this.audioBitDepth);
                            sb.append(". Setting mimeType to audio/x-unknown");
                            string = sb.toString();
                        } else {
                            i2 = pcmEncoding;
                            list2 = null;
                        }
                        i3 = -1;
                        list = list2;
                        boolean z2 = this.flagDefault;
                        if (this.flagForced) {
                            i4 = 2;
                        } else {
                            i4 = 0;
                        }
                        i5 = (z2 ? 1 : 0) | i4;
                        if (!MimeTypes.isAudio(str2)) {
                            if (MimeTypes.isVideo(str2)) {
                                if (this.displayUnit == 0) {
                                    i10 = this.displayWidth;
                                    i6 = -1;
                                    if (i10 == -1) {
                                        i10 = this.width;
                                    }
                                    this.displayWidth = i10;
                                    i11 = this.displayHeight;
                                    if (i11 == -1) {
                                        i11 = this.height;
                                    }
                                    this.displayHeight = i11;
                                } else {
                                    i6 = -1;
                                }
                                i7 = this.displayWidth;
                                if (i7 != i6) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (this.hasColorInfo) {
                                    colorInfo = new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo());
                                } else {
                                    colorInfo = null;
                                }
                                if ("htc_video_rotA-000".equals(this.name)) {
                                    i6 = 0;
                                } else if ("htc_video_rotA-090".equals(this.name)) {
                                    i6 = 90;
                                } else if ("htc_video_rotA-180".equals(this.name)) {
                                    i6 = 180;
                                } else if ("htc_video_rotA-270".equals(this.name)) {
                                    i6 = MediaPlayer.Event.f17411q;
                                }
                                if (this.projectionType == 0) {
                                    i8 = i6;
                                } else {
                                    i8 = i6;
                                }
                                formatCreateImageSampleFormat = Format.createVideoSampleFormat(Integer.toString(i), str2, null, -1, i3, this.width, this.height, -1.0f, list, i8, f, this.projectionData, this.stereoMode, colorInfo, this.drmInitData);
                                i12 = 2;
                            } else {
                                if ("application/x-subrip".equals(str2)) {
                                    formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, i5, this.language, this.drmInitData);
                                } else if (MimeTypes.TEXT_SSA.equals(str2)) {
                                    ArrayList arrayList2 = new ArrayList(2);
                                    arrayList2.add(MatroskaExtractor.SSA_DIALOGUE_FORMAT);
                                    arrayList2.add(this.codecPrivate);
                                    formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, null, -1, i5, this.language, -1, this.drmInitData, Long.MAX_VALUE, arrayList2);
                                } else {
                                    if (MimeTypes.APPLICATION_VOBSUB.equals(str2)) {
                                    }
                                    formatCreateImageSampleFormat = Format.createImageSampleFormat(Integer.toString(i), str2, null, -1, i5, list, this.language, this.drmInitData);
                                }
                                i12 = 3;
                            }
                            break;
                        } else {
                            formatCreateImageSampleFormat = Format.createAudioSampleFormat(Integer.toString(i), str2, null, -1, i3, this.channelCount, this.sampleRate, i2, list, this.drmInitData, i5, this.language);
                        }
                        TrackOutput trackOutputTrack2 = extractorOutput.track(this.number, i12);
                        this.output = trackOutputTrack2;
                        trackOutputTrack2.format(formatCreateImageSampleFormat);
                        return;
                    }
                    string = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown";
                    Log.m17586w(MatroskaExtractor.TAG, string);
                    str2 = MimeTypes.AUDIO_UNKNOWN;
                    list3 = null;
                    i2 = -1;
                    list2 = list3;
                    i3 = -1;
                    list = list2;
                    boolean z3 = this.flagDefault;
                    if (this.flagForced) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    i5 = (z3 ? 1 : 0) | i4;
                    if (!MimeTypes.isAudio(str2)) {
                        if (MimeTypes.isVideo(str2)) {
                            if (this.displayUnit == 0) {
                                i10 = this.displayWidth;
                                i6 = -1;
                                if (i10 == -1) {
                                    i10 = this.width;
                                }
                                this.displayWidth = i10;
                                i11 = this.displayHeight;
                                if (i11 == -1) {
                                    i11 = this.height;
                                }
                                this.displayHeight = i11;
                            } else {
                                i6 = -1;
                            }
                            i7 = this.displayWidth;
                            if (i7 != i6) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                                colorInfo = new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.name)) {
                                i6 = 0;
                            } else if ("htc_video_rotA-090".equals(this.name)) {
                                i6 = 90;
                            } else if ("htc_video_rotA-180".equals(this.name)) {
                                i6 = 180;
                            } else if ("htc_video_rotA-270".equals(this.name)) {
                                i6 = MediaPlayer.Event.f17411q;
                            }
                            if (this.projectionType == 0) {
                                i8 = i6;
                            } else {
                                i8 = i6;
                            }
                            formatCreateImageSampleFormat = Format.createVideoSampleFormat(Integer.toString(i), str2, null, -1, i3, this.width, this.height, -1.0f, list, i8, f, this.projectionData, this.stereoMode, colorInfo, this.drmInitData);
                            i12 = 2;
                        } else {
                            if ("application/x-subrip".equals(str2)) {
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, i5, this.language, this.drmInitData);
                            } else if (MimeTypes.TEXT_SSA.equals(str2)) {
                                ArrayList arrayList3 = new ArrayList(2);
                                arrayList3.add(MatroskaExtractor.SSA_DIALOGUE_FORMAT);
                                arrayList3.add(this.codecPrivate);
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, null, -1, i5, this.language, -1, this.drmInitData, Long.MAX_VALUE, arrayList3);
                            } else {
                                if (MimeTypes.APPLICATION_VOBSUB.equals(str2)) {
                                }
                                formatCreateImageSampleFormat = Format.createImageSampleFormat(Integer.toString(i), str2, null, -1, i5, list, this.language, this.drmInitData);
                            }
                            i12 = 3;
                        }
                        break;
                    } else {
                        formatCreateImageSampleFormat = Format.createAudioSampleFormat(Integer.toString(i), str2, null, -1, i3, this.channelCount, this.sampleRate, i2, list, this.drmInitData, i5, this.language);
                    }
                    TrackOutput trackOutputTrack3 = extractorOutput.track(this.number, i12);
                    this.output = trackOutputTrack3;
                    trackOutputTrack3.format(formatCreateImageSampleFormat);
                    return;
                case 3:
                    this.trueHdSampleRechunker = new TrueHdSampleRechunker();
                    str2 = MimeTypes.AUDIO_TRUEHD;
                    list3 = null;
                    i2 = -1;
                    list2 = list3;
                    i3 = -1;
                    list = list2;
                    boolean z4 = this.flagDefault;
                    if (this.flagForced) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    i5 = (z4 ? 1 : 0) | i4;
                    if (!MimeTypes.isAudio(str2)) {
                        if (MimeTypes.isVideo(str2)) {
                            if (this.displayUnit == 0) {
                                i10 = this.displayWidth;
                                i6 = -1;
                                if (i10 == -1) {
                                    i10 = this.width;
                                }
                                this.displayWidth = i10;
                                i11 = this.displayHeight;
                                if (i11 == -1) {
                                    i11 = this.height;
                                }
                                this.displayHeight = i11;
                            } else {
                                i6 = -1;
                            }
                            i7 = this.displayWidth;
                            if (i7 != i6) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                                colorInfo = new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.name)) {
                                i6 = 0;
                            } else if ("htc_video_rotA-090".equals(this.name)) {
                                i6 = 90;
                            } else if ("htc_video_rotA-180".equals(this.name)) {
                                i6 = 180;
                            } else if ("htc_video_rotA-270".equals(this.name)) {
                                i6 = MediaPlayer.Event.f17411q;
                            }
                            if (this.projectionType == 0) {
                                i8 = i6;
                            } else {
                                i8 = i6;
                            }
                            formatCreateImageSampleFormat = Format.createVideoSampleFormat(Integer.toString(i), str2, null, -1, i3, this.width, this.height, -1.0f, list, i8, f, this.projectionData, this.stereoMode, colorInfo, this.drmInitData);
                            i12 = 2;
                        } else {
                            if ("application/x-subrip".equals(str2)) {
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, i5, this.language, this.drmInitData);
                            } else if (MimeTypes.TEXT_SSA.equals(str2)) {
                                ArrayList arrayList4 = new ArrayList(2);
                                arrayList4.add(MatroskaExtractor.SSA_DIALOGUE_FORMAT);
                                arrayList4.add(this.codecPrivate);
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, null, -1, i5, this.language, -1, this.drmInitData, Long.MAX_VALUE, arrayList4);
                            } else {
                                if (MimeTypes.APPLICATION_VOBSUB.equals(str2)) {
                                }
                                formatCreateImageSampleFormat = Format.createImageSampleFormat(Integer.toString(i), str2, null, -1, i5, list, this.language, this.drmInitData);
                            }
                            i12 = 3;
                        }
                        break;
                    } else {
                        formatCreateImageSampleFormat = Format.createAudioSampleFormat(Integer.toString(i), str2, null, -1, i3, this.channelCount, this.sampleRate, i2, list, this.drmInitData, i5, this.language);
                    }
                    TrackOutput trackOutputTrack4 = extractorOutput.track(this.number, i12);
                    this.output = trackOutputTrack4;
                    trackOutputTrack4.format(formatCreateImageSampleFormat);
                    return;
                case 4:
                    List<byte[]> vorbisCodecPrivate = parseVorbisCodecPrivate(this.codecPrivate);
                    str2 = MimeTypes.AUDIO_VORBIS;
                    i2 = -1;
                    i3 = 8192;
                    list = vorbisCodecPrivate;
                    boolean z5 = this.flagDefault;
                    if (this.flagForced) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    i5 = (z5 ? 1 : 0) | i4;
                    if (!MimeTypes.isAudio(str2)) {
                        if (MimeTypes.isVideo(str2)) {
                            if (this.displayUnit == 0) {
                                i10 = this.displayWidth;
                                i6 = -1;
                                if (i10 == -1) {
                                    i10 = this.width;
                                }
                                this.displayWidth = i10;
                                i11 = this.displayHeight;
                                if (i11 == -1) {
                                    i11 = this.height;
                                }
                                this.displayHeight = i11;
                            } else {
                                i6 = -1;
                            }
                            i7 = this.displayWidth;
                            if (i7 != i6) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                                colorInfo = new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.name)) {
                                i6 = 0;
                            } else if ("htc_video_rotA-090".equals(this.name)) {
                                i6 = 90;
                            } else if ("htc_video_rotA-180".equals(this.name)) {
                                i6 = 180;
                            } else if ("htc_video_rotA-270".equals(this.name)) {
                                i6 = MediaPlayer.Event.f17411q;
                            }
                            if (this.projectionType == 0) {
                                i8 = i6;
                            } else {
                                i8 = i6;
                            }
                            formatCreateImageSampleFormat = Format.createVideoSampleFormat(Integer.toString(i), str2, null, -1, i3, this.width, this.height, -1.0f, list, i8, f, this.projectionData, this.stereoMode, colorInfo, this.drmInitData);
                            i12 = 2;
                        } else {
                            if ("application/x-subrip".equals(str2)) {
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, i5, this.language, this.drmInitData);
                            } else if (MimeTypes.TEXT_SSA.equals(str2)) {
                                ArrayList arrayList5 = new ArrayList(2);
                                arrayList5.add(MatroskaExtractor.SSA_DIALOGUE_FORMAT);
                                arrayList5.add(this.codecPrivate);
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, null, -1, i5, this.language, -1, this.drmInitData, Long.MAX_VALUE, arrayList5);
                            } else {
                                if (MimeTypes.APPLICATION_VOBSUB.equals(str2)) {
                                }
                                formatCreateImageSampleFormat = Format.createImageSampleFormat(Integer.toString(i), str2, null, -1, i5, list, this.language, this.drmInitData);
                            }
                            i12 = 3;
                        }
                        break;
                    } else {
                        formatCreateImageSampleFormat = Format.createAudioSampleFormat(Integer.toString(i), str2, null, -1, i3, this.channelCount, this.sampleRate, i2, list, this.drmInitData, i5, this.language);
                    }
                    TrackOutput trackOutputTrack5 = extractorOutput.track(this.number, i12);
                    this.output = trackOutputTrack5;
                    trackOutputTrack5.format(formatCreateImageSampleFormat);
                    return;
                case 5:
                    str2 = MimeTypes.AUDIO_MPEG_L2;
                    list = null;
                    i2 = -1;
                    i3 = 4096;
                    boolean z6 = this.flagDefault;
                    if (this.flagForced) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    i5 = (z6 ? 1 : 0) | i4;
                    if (!MimeTypes.isAudio(str2)) {
                        if (MimeTypes.isVideo(str2)) {
                            if (this.displayUnit == 0) {
                                i10 = this.displayWidth;
                                i6 = -1;
                                if (i10 == -1) {
                                    i10 = this.width;
                                }
                                this.displayWidth = i10;
                                i11 = this.displayHeight;
                                if (i11 == -1) {
                                    i11 = this.height;
                                }
                                this.displayHeight = i11;
                            } else {
                                i6 = -1;
                            }
                            i7 = this.displayWidth;
                            if (i7 != i6) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                                colorInfo = new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.name)) {
                                i6 = 0;
                            } else if ("htc_video_rotA-090".equals(this.name)) {
                                i6 = 90;
                            } else if ("htc_video_rotA-180".equals(this.name)) {
                                i6 = 180;
                            } else if ("htc_video_rotA-270".equals(this.name)) {
                                i6 = MediaPlayer.Event.f17411q;
                            }
                            if (this.projectionType == 0) {
                                i8 = i6;
                            } else {
                                i8 = i6;
                            }
                            formatCreateImageSampleFormat = Format.createVideoSampleFormat(Integer.toString(i), str2, null, -1, i3, this.width, this.height, -1.0f, list, i8, f, this.projectionData, this.stereoMode, colorInfo, this.drmInitData);
                            i12 = 2;
                        } else {
                            if ("application/x-subrip".equals(str2)) {
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, i5, this.language, this.drmInitData);
                            } else if (MimeTypes.TEXT_SSA.equals(str2)) {
                                ArrayList arrayList6 = new ArrayList(2);
                                arrayList6.add(MatroskaExtractor.SSA_DIALOGUE_FORMAT);
                                arrayList6.add(this.codecPrivate);
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, null, -1, i5, this.language, -1, this.drmInitData, Long.MAX_VALUE, arrayList6);
                            } else {
                                if (MimeTypes.APPLICATION_VOBSUB.equals(str2)) {
                                }
                                formatCreateImageSampleFormat = Format.createImageSampleFormat(Integer.toString(i), str2, null, -1, i5, list, this.language, this.drmInitData);
                            }
                            i12 = 3;
                        }
                        break;
                    } else {
                        formatCreateImageSampleFormat = Format.createAudioSampleFormat(Integer.toString(i), str2, null, -1, i3, this.channelCount, this.sampleRate, i2, list, this.drmInitData, i5, this.language);
                    }
                    TrackOutput trackOutputTrack6 = extractorOutput.track(this.number, i12);
                    this.output = trackOutputTrack6;
                    trackOutputTrack6.format(formatCreateImageSampleFormat);
                    return;
                case 6:
                    str2 = MimeTypes.AUDIO_MPEG;
                    list = null;
                    i2 = -1;
                    i3 = 4096;
                    boolean z7 = this.flagDefault;
                    if (this.flagForced) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    i5 = (z7 ? 1 : 0) | i4;
                    if (!MimeTypes.isAudio(str2)) {
                        if (MimeTypes.isVideo(str2)) {
                            if (this.displayUnit == 0) {
                                i10 = this.displayWidth;
                                i6 = -1;
                                if (i10 == -1) {
                                    i10 = this.width;
                                }
                                this.displayWidth = i10;
                                i11 = this.displayHeight;
                                if (i11 == -1) {
                                    i11 = this.height;
                                }
                                this.displayHeight = i11;
                            } else {
                                i6 = -1;
                            }
                            i7 = this.displayWidth;
                            if (i7 != i6) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                                colorInfo = new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.name)) {
                                i6 = 0;
                            } else if ("htc_video_rotA-090".equals(this.name)) {
                                i6 = 90;
                            } else if ("htc_video_rotA-180".equals(this.name)) {
                                i6 = 180;
                            } else if ("htc_video_rotA-270".equals(this.name)) {
                                i6 = MediaPlayer.Event.f17411q;
                            }
                            if (this.projectionType == 0) {
                                i8 = i6;
                            } else {
                                i8 = i6;
                            }
                            formatCreateImageSampleFormat = Format.createVideoSampleFormat(Integer.toString(i), str2, null, -1, i3, this.width, this.height, -1.0f, list, i8, f, this.projectionData, this.stereoMode, colorInfo, this.drmInitData);
                            i12 = 2;
                        } else {
                            if ("application/x-subrip".equals(str2)) {
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, i5, this.language, this.drmInitData);
                            } else if (MimeTypes.TEXT_SSA.equals(str2)) {
                                ArrayList arrayList7 = new ArrayList(2);
                                arrayList7.add(MatroskaExtractor.SSA_DIALOGUE_FORMAT);
                                arrayList7.add(this.codecPrivate);
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, null, -1, i5, this.language, -1, this.drmInitData, Long.MAX_VALUE, arrayList7);
                            } else {
                                if (MimeTypes.APPLICATION_VOBSUB.equals(str2)) {
                                }
                                formatCreateImageSampleFormat = Format.createImageSampleFormat(Integer.toString(i), str2, null, -1, i5, list, this.language, this.drmInitData);
                            }
                            i12 = 3;
                        }
                        break;
                    } else {
                        formatCreateImageSampleFormat = Format.createAudioSampleFormat(Integer.toString(i), str2, null, -1, i3, this.channelCount, this.sampleRate, i2, list, this.drmInitData, i5, this.language);
                    }
                    TrackOutput trackOutputTrack7 = extractorOutput.track(this.number, i12);
                    this.output = trackOutputTrack7;
                    trackOutputTrack7.format(formatCreateImageSampleFormat);
                    return;
                case 7:
                    Pair<String, List<byte[]>> fourCcPrivate = parseFourCcPrivate(new ParsableByteArray(this.codecPrivate));
                    str2 = (String) fourCcPrivate.first;
                    list3 = (List) fourCcPrivate.second;
                    i2 = -1;
                    list2 = list3;
                    i3 = -1;
                    list = list2;
                    boolean z8 = this.flagDefault;
                    if (this.flagForced) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    i5 = (z8 ? 1 : 0) | i4;
                    if (!MimeTypes.isAudio(str2)) {
                        if (MimeTypes.isVideo(str2)) {
                            if (this.displayUnit == 0) {
                                i10 = this.displayWidth;
                                i6 = -1;
                                if (i10 == -1) {
                                    i10 = this.width;
                                }
                                this.displayWidth = i10;
                                i11 = this.displayHeight;
                                if (i11 == -1) {
                                    i11 = this.height;
                                }
                                this.displayHeight = i11;
                            } else {
                                i6 = -1;
                            }
                            i7 = this.displayWidth;
                            if (i7 != i6) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                                colorInfo = new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.name)) {
                                i6 = 0;
                            } else if ("htc_video_rotA-090".equals(this.name)) {
                                i6 = 90;
                            } else if ("htc_video_rotA-180".equals(this.name)) {
                                i6 = 180;
                            } else if ("htc_video_rotA-270".equals(this.name)) {
                                i6 = MediaPlayer.Event.f17411q;
                            }
                            if (this.projectionType == 0) {
                                i8 = i6;
                            } else {
                                i8 = i6;
                            }
                            formatCreateImageSampleFormat = Format.createVideoSampleFormat(Integer.toString(i), str2, null, -1, i3, this.width, this.height, -1.0f, list, i8, f, this.projectionData, this.stereoMode, colorInfo, this.drmInitData);
                            i12 = 2;
                        } else {
                            if ("application/x-subrip".equals(str2)) {
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, i5, this.language, this.drmInitData);
                            } else if (MimeTypes.TEXT_SSA.equals(str2)) {
                                ArrayList arrayList8 = new ArrayList(2);
                                arrayList8.add(MatroskaExtractor.SSA_DIALOGUE_FORMAT);
                                arrayList8.add(this.codecPrivate);
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, null, -1, i5, this.language, -1, this.drmInitData, Long.MAX_VALUE, arrayList8);
                            } else {
                                if (MimeTypes.APPLICATION_VOBSUB.equals(str2)) {
                                }
                                formatCreateImageSampleFormat = Format.createImageSampleFormat(Integer.toString(i), str2, null, -1, i5, list, this.language, this.drmInitData);
                            }
                            i12 = 3;
                        }
                        break;
                    } else {
                        formatCreateImageSampleFormat = Format.createAudioSampleFormat(Integer.toString(i), str2, null, -1, i3, this.channelCount, this.sampleRate, i2, list, this.drmInitData, i5, this.language);
                    }
                    TrackOutput trackOutputTrack8 = extractorOutput.track(this.number, i12);
                    this.output = trackOutputTrack8;
                    trackOutputTrack8.format(formatCreateImageSampleFormat);
                    return;
                case 8:
                    byte[] bArr2 = this.codecPrivate;
                    List<byte[]> listSingletonList2 = Collections.singletonList(new byte[]{bArr2[0], bArr2[1], bArr2[2], bArr2[3]});
                    str2 = MimeTypes.APPLICATION_DVBSUBS;
                    list3 = listSingletonList2;
                    i2 = -1;
                    list2 = list3;
                    i3 = -1;
                    list = list2;
                    boolean z9 = this.flagDefault;
                    if (this.flagForced) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    i5 = (z9 ? 1 : 0) | i4;
                    if (!MimeTypes.isAudio(str2)) {
                        if (MimeTypes.isVideo(str2)) {
                            if (this.displayUnit == 0) {
                                i10 = this.displayWidth;
                                i6 = -1;
                                if (i10 == -1) {
                                    i10 = this.width;
                                }
                                this.displayWidth = i10;
                                i11 = this.displayHeight;
                                if (i11 == -1) {
                                    i11 = this.height;
                                }
                                this.displayHeight = i11;
                            } else {
                                i6 = -1;
                            }
                            i7 = this.displayWidth;
                            if (i7 != i6) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                                colorInfo = new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.name)) {
                                i6 = 0;
                            } else if ("htc_video_rotA-090".equals(this.name)) {
                                i6 = 90;
                            } else if ("htc_video_rotA-180".equals(this.name)) {
                                i6 = 180;
                            } else if ("htc_video_rotA-270".equals(this.name)) {
                                i6 = MediaPlayer.Event.f17411q;
                            }
                            if (this.projectionType == 0) {
                                i8 = i6;
                            } else {
                                i8 = i6;
                            }
                            formatCreateImageSampleFormat = Format.createVideoSampleFormat(Integer.toString(i), str2, null, -1, i3, this.width, this.height, -1.0f, list, i8, f, this.projectionData, this.stereoMode, colorInfo, this.drmInitData);
                            i12 = 2;
                        } else {
                            if ("application/x-subrip".equals(str2)) {
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, i5, this.language, this.drmInitData);
                            } else if (MimeTypes.TEXT_SSA.equals(str2)) {
                                ArrayList arrayList9 = new ArrayList(2);
                                arrayList9.add(MatroskaExtractor.SSA_DIALOGUE_FORMAT);
                                arrayList9.add(this.codecPrivate);
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, null, -1, i5, this.language, -1, this.drmInitData, Long.MAX_VALUE, arrayList9);
                            } else {
                                if (MimeTypes.APPLICATION_VOBSUB.equals(str2)) {
                                }
                                formatCreateImageSampleFormat = Format.createImageSampleFormat(Integer.toString(i), str2, null, -1, i5, list, this.language, this.drmInitData);
                            }
                            i12 = 3;
                        }
                        break;
                    } else {
                        formatCreateImageSampleFormat = Format.createAudioSampleFormat(Integer.toString(i), str2, null, -1, i3, this.channelCount, this.sampleRate, i2, list, this.drmInitData, i5, this.language);
                    }
                    TrackOutput trackOutputTrack9 = extractorOutput.track(this.number, i12);
                    this.output = trackOutputTrack9;
                    trackOutputTrack9.format(formatCreateImageSampleFormat);
                    return;
                case 10:
                    AvcConfig avcConfig = AvcConfig.parse(new ParsableByteArray(this.codecPrivate));
                    List<byte[]> list4 = avcConfig.initializationData;
                    this.nalUnitLengthFieldLength = avcConfig.nalUnitLengthFieldLength;
                    str2 = MimeTypes.VIDEO_H264;
                    list3 = list4;
                    i2 = -1;
                    list2 = list3;
                    i3 = -1;
                    list = list2;
                    boolean z10 = this.flagDefault;
                    if (this.flagForced) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    i5 = (z10 ? 1 : 0) | i4;
                    if (!MimeTypes.isAudio(str2)) {
                        if (MimeTypes.isVideo(str2)) {
                            if (this.displayUnit == 0) {
                                i10 = this.displayWidth;
                                i6 = -1;
                                if (i10 == -1) {
                                    i10 = this.width;
                                }
                                this.displayWidth = i10;
                                i11 = this.displayHeight;
                                if (i11 == -1) {
                                    i11 = this.height;
                                }
                                this.displayHeight = i11;
                            } else {
                                i6 = -1;
                            }
                            i7 = this.displayWidth;
                            if (i7 != i6) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                                colorInfo = new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.name)) {
                                i6 = 0;
                            } else if ("htc_video_rotA-090".equals(this.name)) {
                                i6 = 90;
                            } else if ("htc_video_rotA-180".equals(this.name)) {
                                i6 = 180;
                            } else if ("htc_video_rotA-270".equals(this.name)) {
                                i6 = MediaPlayer.Event.f17411q;
                            }
                            if (this.projectionType == 0) {
                                i8 = i6;
                            } else {
                                i8 = i6;
                            }
                            formatCreateImageSampleFormat = Format.createVideoSampleFormat(Integer.toString(i), str2, null, -1, i3, this.width, this.height, -1.0f, list, i8, f, this.projectionData, this.stereoMode, colorInfo, this.drmInitData);
                            i12 = 2;
                        } else {
                            if ("application/x-subrip".equals(str2)) {
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, i5, this.language, this.drmInitData);
                            } else if (MimeTypes.TEXT_SSA.equals(str2)) {
                                ArrayList arrayList10 = new ArrayList(2);
                                arrayList10.add(MatroskaExtractor.SSA_DIALOGUE_FORMAT);
                                arrayList10.add(this.codecPrivate);
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, null, -1, i5, this.language, -1, this.drmInitData, Long.MAX_VALUE, arrayList10);
                            } else {
                                if (MimeTypes.APPLICATION_VOBSUB.equals(str2)) {
                                }
                                formatCreateImageSampleFormat = Format.createImageSampleFormat(Integer.toString(i), str2, null, -1, i5, list, this.language, this.drmInitData);
                            }
                            i12 = 3;
                        }
                        break;
                    } else {
                        formatCreateImageSampleFormat = Format.createAudioSampleFormat(Integer.toString(i), str2, null, -1, i3, this.channelCount, this.sampleRate, i2, list, this.drmInitData, i5, this.language);
                    }
                    TrackOutput trackOutputTrack10 = extractorOutput.track(this.number, i12);
                    this.output = trackOutputTrack10;
                    trackOutputTrack10.format(formatCreateImageSampleFormat);
                    return;
                case 11:
                    List<byte[]> listSingletonList3 = Collections.singletonList(this.codecPrivate);
                    str2 = MimeTypes.APPLICATION_VOBSUB;
                    list3 = listSingletonList3;
                    i2 = -1;
                    list2 = list3;
                    i3 = -1;
                    list = list2;
                    boolean z11 = this.flagDefault;
                    if (this.flagForced) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    i5 = (z11 ? 1 : 0) | i4;
                    if (!MimeTypes.isAudio(str2)) {
                        if (MimeTypes.isVideo(str2)) {
                            if (this.displayUnit == 0) {
                                i10 = this.displayWidth;
                                i6 = -1;
                                if (i10 == -1) {
                                    i10 = this.width;
                                }
                                this.displayWidth = i10;
                                i11 = this.displayHeight;
                                if (i11 == -1) {
                                    i11 = this.height;
                                }
                                this.displayHeight = i11;
                            } else {
                                i6 = -1;
                            }
                            i7 = this.displayWidth;
                            if (i7 != i6) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                                colorInfo = new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.name)) {
                                i6 = 0;
                            } else if ("htc_video_rotA-090".equals(this.name)) {
                                i6 = 90;
                            } else if ("htc_video_rotA-180".equals(this.name)) {
                                i6 = 180;
                            } else if ("htc_video_rotA-270".equals(this.name)) {
                                i6 = MediaPlayer.Event.f17411q;
                            }
                            if (this.projectionType == 0) {
                                i8 = i6;
                            } else {
                                i8 = i6;
                            }
                            formatCreateImageSampleFormat = Format.createVideoSampleFormat(Integer.toString(i), str2, null, -1, i3, this.width, this.height, -1.0f, list, i8, f, this.projectionData, this.stereoMode, colorInfo, this.drmInitData);
                            i12 = 2;
                        } else {
                            if ("application/x-subrip".equals(str2)) {
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, i5, this.language, this.drmInitData);
                            } else if (MimeTypes.TEXT_SSA.equals(str2)) {
                                ArrayList arrayList11 = new ArrayList(2);
                                arrayList11.add(MatroskaExtractor.SSA_DIALOGUE_FORMAT);
                                arrayList11.add(this.codecPrivate);
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, null, -1, i5, this.language, -1, this.drmInitData, Long.MAX_VALUE, arrayList11);
                            } else {
                                if (MimeTypes.APPLICATION_VOBSUB.equals(str2)) {
                                }
                                formatCreateImageSampleFormat = Format.createImageSampleFormat(Integer.toString(i), str2, null, -1, i5, list, this.language, this.drmInitData);
                            }
                            i12 = 3;
                        }
                        break;
                    } else {
                        formatCreateImageSampleFormat = Format.createAudioSampleFormat(Integer.toString(i), str2, null, -1, i3, this.channelCount, this.sampleRate, i2, list, this.drmInitData, i5, this.language);
                    }
                    TrackOutput trackOutputTrack11 = extractorOutput.track(this.number, i12);
                    this.output = trackOutputTrack11;
                    trackOutputTrack11.format(formatCreateImageSampleFormat);
                    return;
                case 12:
                    str2 = MimeTypes.AUDIO_DTS_HD;
                    list3 = null;
                    i2 = -1;
                    list2 = list3;
                    i3 = -1;
                    list = list2;
                    boolean z12 = this.flagDefault;
                    if (this.flagForced) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    i5 = (z12 ? 1 : 0) | i4;
                    if (!MimeTypes.isAudio(str2)) {
                        if (MimeTypes.isVideo(str2)) {
                            if (this.displayUnit == 0) {
                                i10 = this.displayWidth;
                                i6 = -1;
                                if (i10 == -1) {
                                    i10 = this.width;
                                }
                                this.displayWidth = i10;
                                i11 = this.displayHeight;
                                if (i11 == -1) {
                                    i11 = this.height;
                                }
                                this.displayHeight = i11;
                            } else {
                                i6 = -1;
                            }
                            i7 = this.displayWidth;
                            if (i7 != i6) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                                colorInfo = new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.name)) {
                                i6 = 0;
                            } else if ("htc_video_rotA-090".equals(this.name)) {
                                i6 = 90;
                            } else if ("htc_video_rotA-180".equals(this.name)) {
                                i6 = 180;
                            } else if ("htc_video_rotA-270".equals(this.name)) {
                                i6 = MediaPlayer.Event.f17411q;
                            }
                            if (this.projectionType == 0) {
                                i8 = i6;
                            } else {
                                i8 = i6;
                            }
                            formatCreateImageSampleFormat = Format.createVideoSampleFormat(Integer.toString(i), str2, null, -1, i3, this.width, this.height, -1.0f, list, i8, f, this.projectionData, this.stereoMode, colorInfo, this.drmInitData);
                            i12 = 2;
                        } else {
                            if ("application/x-subrip".equals(str2)) {
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, i5, this.language, this.drmInitData);
                            } else if (MimeTypes.TEXT_SSA.equals(str2)) {
                                ArrayList arrayList12 = new ArrayList(2);
                                arrayList12.add(MatroskaExtractor.SSA_DIALOGUE_FORMAT);
                                arrayList12.add(this.codecPrivate);
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, null, -1, i5, this.language, -1, this.drmInitData, Long.MAX_VALUE, arrayList12);
                            } else {
                                if (MimeTypes.APPLICATION_VOBSUB.equals(str2)) {
                                }
                                formatCreateImageSampleFormat = Format.createImageSampleFormat(Integer.toString(i), str2, null, -1, i5, list, this.language, this.drmInitData);
                            }
                            i12 = 3;
                        }
                        break;
                    } else {
                        formatCreateImageSampleFormat = Format.createAudioSampleFormat(Integer.toString(i), str2, null, -1, i3, this.channelCount, this.sampleRate, i2, list, this.drmInitData, i5, this.language);
                    }
                    TrackOutput trackOutputTrack12 = extractorOutput.track(this.number, i12);
                    this.output = trackOutputTrack12;
                    trackOutputTrack12.format(formatCreateImageSampleFormat);
                    return;
                case 13:
                    List<byte[]> listSingletonList4 = Collections.singletonList(this.codecPrivate);
                    str2 = MimeTypes.AUDIO_AAC;
                    list3 = listSingletonList4;
                    i2 = -1;
                    list2 = list3;
                    i3 = -1;
                    list = list2;
                    boolean z13 = this.flagDefault;
                    if (this.flagForced) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    i5 = (z13 ? 1 : 0) | i4;
                    if (!MimeTypes.isAudio(str2)) {
                        if (MimeTypes.isVideo(str2)) {
                            if (this.displayUnit == 0) {
                                i10 = this.displayWidth;
                                i6 = -1;
                                if (i10 == -1) {
                                    i10 = this.width;
                                }
                                this.displayWidth = i10;
                                i11 = this.displayHeight;
                                if (i11 == -1) {
                                    i11 = this.height;
                                }
                                this.displayHeight = i11;
                            } else {
                                i6 = -1;
                            }
                            i7 = this.displayWidth;
                            if (i7 != i6) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                                colorInfo = new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.name)) {
                                i6 = 0;
                            } else if ("htc_video_rotA-090".equals(this.name)) {
                                i6 = 90;
                            } else if ("htc_video_rotA-180".equals(this.name)) {
                                i6 = 180;
                            } else if ("htc_video_rotA-270".equals(this.name)) {
                                i6 = MediaPlayer.Event.f17411q;
                            }
                            if (this.projectionType == 0) {
                                i8 = i6;
                            } else {
                                i8 = i6;
                            }
                            formatCreateImageSampleFormat = Format.createVideoSampleFormat(Integer.toString(i), str2, null, -1, i3, this.width, this.height, -1.0f, list, i8, f, this.projectionData, this.stereoMode, colorInfo, this.drmInitData);
                            i12 = 2;
                        } else {
                            if ("application/x-subrip".equals(str2)) {
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, i5, this.language, this.drmInitData);
                            } else if (MimeTypes.TEXT_SSA.equals(str2)) {
                                ArrayList arrayList13 = new ArrayList(2);
                                arrayList13.add(MatroskaExtractor.SSA_DIALOGUE_FORMAT);
                                arrayList13.add(this.codecPrivate);
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, null, -1, i5, this.language, -1, this.drmInitData, Long.MAX_VALUE, arrayList13);
                            } else {
                                if (MimeTypes.APPLICATION_VOBSUB.equals(str2)) {
                                }
                                formatCreateImageSampleFormat = Format.createImageSampleFormat(Integer.toString(i), str2, null, -1, i5, list, this.language, this.drmInitData);
                            }
                            i12 = 3;
                        }
                        break;
                    } else {
                        formatCreateImageSampleFormat = Format.createAudioSampleFormat(Integer.toString(i), str2, null, -1, i3, this.channelCount, this.sampleRate, i2, list, this.drmInitData, i5, this.language);
                    }
                    TrackOutput trackOutputTrack13 = extractorOutput.track(this.number, i12);
                    this.output = trackOutputTrack13;
                    trackOutputTrack13.format(formatCreateImageSampleFormat);
                    return;
                case 14:
                    str2 = MimeTypes.AUDIO_AC3;
                    list3 = null;
                    i2 = -1;
                    list2 = list3;
                    i3 = -1;
                    list = list2;
                    boolean z14 = this.flagDefault;
                    if (this.flagForced) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    i5 = (z14 ? 1 : 0) | i4;
                    if (!MimeTypes.isAudio(str2)) {
                        if (MimeTypes.isVideo(str2)) {
                            if (this.displayUnit == 0) {
                                i10 = this.displayWidth;
                                i6 = -1;
                                if (i10 == -1) {
                                    i10 = this.width;
                                }
                                this.displayWidth = i10;
                                i11 = this.displayHeight;
                                if (i11 == -1) {
                                    i11 = this.height;
                                }
                                this.displayHeight = i11;
                            } else {
                                i6 = -1;
                            }
                            i7 = this.displayWidth;
                            if (i7 != i6) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                                colorInfo = new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.name)) {
                                i6 = 0;
                            } else if ("htc_video_rotA-090".equals(this.name)) {
                                i6 = 90;
                            } else if ("htc_video_rotA-180".equals(this.name)) {
                                i6 = 180;
                            } else if ("htc_video_rotA-270".equals(this.name)) {
                                i6 = MediaPlayer.Event.f17411q;
                            }
                            if (this.projectionType == 0) {
                                i8 = i6;
                            } else {
                                i8 = i6;
                            }
                            formatCreateImageSampleFormat = Format.createVideoSampleFormat(Integer.toString(i), str2, null, -1, i3, this.width, this.height, -1.0f, list, i8, f, this.projectionData, this.stereoMode, colorInfo, this.drmInitData);
                            i12 = 2;
                        } else {
                            if ("application/x-subrip".equals(str2)) {
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, i5, this.language, this.drmInitData);
                            } else if (MimeTypes.TEXT_SSA.equals(str2)) {
                                ArrayList arrayList14 = new ArrayList(2);
                                arrayList14.add(MatroskaExtractor.SSA_DIALOGUE_FORMAT);
                                arrayList14.add(this.codecPrivate);
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, null, -1, i5, this.language, -1, this.drmInitData, Long.MAX_VALUE, arrayList14);
                            } else {
                                if (MimeTypes.APPLICATION_VOBSUB.equals(str2)) {
                                }
                                formatCreateImageSampleFormat = Format.createImageSampleFormat(Integer.toString(i), str2, null, -1, i5, list, this.language, this.drmInitData);
                            }
                            i12 = 3;
                        }
                        break;
                    } else {
                        formatCreateImageSampleFormat = Format.createAudioSampleFormat(Integer.toString(i), str2, null, -1, i3, this.channelCount, this.sampleRate, i2, list, this.drmInitData, i5, this.language);
                    }
                    TrackOutput trackOutputTrack14 = extractorOutput.track(this.number, i12);
                    this.output = trackOutputTrack14;
                    trackOutputTrack14.format(formatCreateImageSampleFormat);
                    return;
                case 15:
                case 21:
                    str2 = MimeTypes.AUDIO_DTS;
                    list3 = null;
                    i2 = -1;
                    list2 = list3;
                    i3 = -1;
                    list = list2;
                    boolean z15 = this.flagDefault;
                    if (this.flagForced) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    i5 = (z15 ? 1 : 0) | i4;
                    if (!MimeTypes.isAudio(str2)) {
                        if (MimeTypes.isVideo(str2)) {
                            if (this.displayUnit == 0) {
                                i10 = this.displayWidth;
                                i6 = -1;
                                if (i10 == -1) {
                                    i10 = this.width;
                                }
                                this.displayWidth = i10;
                                i11 = this.displayHeight;
                                if (i11 == -1) {
                                    i11 = this.height;
                                }
                                this.displayHeight = i11;
                            } else {
                                i6 = -1;
                            }
                            i7 = this.displayWidth;
                            if (i7 != i6) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                                colorInfo = new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.name)) {
                                i6 = 0;
                            } else if ("htc_video_rotA-090".equals(this.name)) {
                                i6 = 90;
                            } else if ("htc_video_rotA-180".equals(this.name)) {
                                i6 = 180;
                            } else if ("htc_video_rotA-270".equals(this.name)) {
                                i6 = MediaPlayer.Event.f17411q;
                            }
                            if (this.projectionType == 0) {
                                i8 = i6;
                            } else {
                                i8 = i6;
                            }
                            formatCreateImageSampleFormat = Format.createVideoSampleFormat(Integer.toString(i), str2, null, -1, i3, this.width, this.height, -1.0f, list, i8, f, this.projectionData, this.stereoMode, colorInfo, this.drmInitData);
                            i12 = 2;
                        } else {
                            if ("application/x-subrip".equals(str2)) {
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, i5, this.language, this.drmInitData);
                            } else if (MimeTypes.TEXT_SSA.equals(str2)) {
                                ArrayList arrayList15 = new ArrayList(2);
                                arrayList15.add(MatroskaExtractor.SSA_DIALOGUE_FORMAT);
                                arrayList15.add(this.codecPrivate);
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, null, -1, i5, this.language, -1, this.drmInitData, Long.MAX_VALUE, arrayList15);
                            } else {
                                if (MimeTypes.APPLICATION_VOBSUB.equals(str2)) {
                                }
                                formatCreateImageSampleFormat = Format.createImageSampleFormat(Integer.toString(i), str2, null, -1, i5, list, this.language, this.drmInitData);
                            }
                            i12 = 3;
                        }
                        break;
                    } else {
                        formatCreateImageSampleFormat = Format.createAudioSampleFormat(Integer.toString(i), str2, null, -1, i3, this.channelCount, this.sampleRate, i2, list, this.drmInitData, i5, this.language);
                    }
                    TrackOutput trackOutputTrack15 = extractorOutput.track(this.number, i12);
                    this.output = trackOutputTrack15;
                    trackOutputTrack15.format(formatCreateImageSampleFormat);
                    return;
                case 16:
                    str2 = MimeTypes.VIDEO_AV1;
                    list3 = null;
                    i2 = -1;
                    list2 = list3;
                    i3 = -1;
                    list = list2;
                    boolean z16 = this.flagDefault;
                    if (this.flagForced) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    i5 = (z16 ? 1 : 0) | i4;
                    if (!MimeTypes.isAudio(str2)) {
                        if (MimeTypes.isVideo(str2)) {
                            if (this.displayUnit == 0) {
                                i10 = this.displayWidth;
                                i6 = -1;
                                if (i10 == -1) {
                                    i10 = this.width;
                                }
                                this.displayWidth = i10;
                                i11 = this.displayHeight;
                                if (i11 == -1) {
                                    i11 = this.height;
                                }
                                this.displayHeight = i11;
                            } else {
                                i6 = -1;
                            }
                            i7 = this.displayWidth;
                            if (i7 != i6) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                                colorInfo = new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.name)) {
                                i6 = 0;
                            } else if ("htc_video_rotA-090".equals(this.name)) {
                                i6 = 90;
                            } else if ("htc_video_rotA-180".equals(this.name)) {
                                i6 = 180;
                            } else if ("htc_video_rotA-270".equals(this.name)) {
                                i6 = MediaPlayer.Event.f17411q;
                            }
                            if (this.projectionType == 0) {
                                i8 = i6;
                            } else {
                                i8 = i6;
                            }
                            formatCreateImageSampleFormat = Format.createVideoSampleFormat(Integer.toString(i), str2, null, -1, i3, this.width, this.height, -1.0f, list, i8, f, this.projectionData, this.stereoMode, colorInfo, this.drmInitData);
                            i12 = 2;
                        } else {
                            if ("application/x-subrip".equals(str2)) {
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, i5, this.language, this.drmInitData);
                            } else if (MimeTypes.TEXT_SSA.equals(str2)) {
                                ArrayList arrayList16 = new ArrayList(2);
                                arrayList16.add(MatroskaExtractor.SSA_DIALOGUE_FORMAT);
                                arrayList16.add(this.codecPrivate);
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, null, -1, i5, this.language, -1, this.drmInitData, Long.MAX_VALUE, arrayList16);
                            } else {
                                if (MimeTypes.APPLICATION_VOBSUB.equals(str2)) {
                                }
                                formatCreateImageSampleFormat = Format.createImageSampleFormat(Integer.toString(i), str2, null, -1, i5, list, this.language, this.drmInitData);
                            }
                            i12 = 3;
                        }
                        break;
                    } else {
                        formatCreateImageSampleFormat = Format.createAudioSampleFormat(Integer.toString(i), str2, null, -1, i3, this.channelCount, this.sampleRate, i2, list, this.drmInitData, i5, this.language);
                    }
                    TrackOutput trackOutputTrack16 = extractorOutput.track(this.number, i12);
                    this.output = trackOutputTrack16;
                    trackOutputTrack16.format(formatCreateImageSampleFormat);
                    return;
                case 17:
                    str2 = MimeTypes.VIDEO_VP8;
                    list3 = null;
                    i2 = -1;
                    list2 = list3;
                    i3 = -1;
                    list = list2;
                    boolean z17 = this.flagDefault;
                    if (this.flagForced) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    i5 = (z17 ? 1 : 0) | i4;
                    if (!MimeTypes.isAudio(str2)) {
                        if (MimeTypes.isVideo(str2)) {
                            if (this.displayUnit == 0) {
                                i10 = this.displayWidth;
                                i6 = -1;
                                if (i10 == -1) {
                                    i10 = this.width;
                                }
                                this.displayWidth = i10;
                                i11 = this.displayHeight;
                                if (i11 == -1) {
                                    i11 = this.height;
                                }
                                this.displayHeight = i11;
                            } else {
                                i6 = -1;
                            }
                            i7 = this.displayWidth;
                            if (i7 != i6) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                                colorInfo = new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.name)) {
                                i6 = 0;
                            } else if ("htc_video_rotA-090".equals(this.name)) {
                                i6 = 90;
                            } else if ("htc_video_rotA-180".equals(this.name)) {
                                i6 = 180;
                            } else if ("htc_video_rotA-270".equals(this.name)) {
                                i6 = MediaPlayer.Event.f17411q;
                            }
                            if (this.projectionType == 0) {
                                i8 = i6;
                            } else {
                                i8 = i6;
                            }
                            formatCreateImageSampleFormat = Format.createVideoSampleFormat(Integer.toString(i), str2, null, -1, i3, this.width, this.height, -1.0f, list, i8, f, this.projectionData, this.stereoMode, colorInfo, this.drmInitData);
                            i12 = 2;
                        } else {
                            if ("application/x-subrip".equals(str2)) {
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, i5, this.language, this.drmInitData);
                            } else if (MimeTypes.TEXT_SSA.equals(str2)) {
                                ArrayList arrayList17 = new ArrayList(2);
                                arrayList17.add(MatroskaExtractor.SSA_DIALOGUE_FORMAT);
                                arrayList17.add(this.codecPrivate);
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, null, -1, i5, this.language, -1, this.drmInitData, Long.MAX_VALUE, arrayList17);
                            } else {
                                if (MimeTypes.APPLICATION_VOBSUB.equals(str2)) {
                                }
                                formatCreateImageSampleFormat = Format.createImageSampleFormat(Integer.toString(i), str2, null, -1, i5, list, this.language, this.drmInitData);
                            }
                            i12 = 3;
                        }
                        break;
                    } else {
                        formatCreateImageSampleFormat = Format.createAudioSampleFormat(Integer.toString(i), str2, null, -1, i3, this.channelCount, this.sampleRate, i2, list, this.drmInitData, i5, this.language);
                    }
                    TrackOutput trackOutputTrack17 = extractorOutput.track(this.number, i12);
                    this.output = trackOutputTrack17;
                    trackOutputTrack17.format(formatCreateImageSampleFormat);
                    return;
                case 18:
                    str2 = MimeTypes.VIDEO_VP9;
                    list3 = null;
                    i2 = -1;
                    list2 = list3;
                    i3 = -1;
                    list = list2;
                    boolean z18 = this.flagDefault;
                    if (this.flagForced) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    i5 = (z18 ? 1 : 0) | i4;
                    if (!MimeTypes.isAudio(str2)) {
                        if (MimeTypes.isVideo(str2)) {
                            if (this.displayUnit == 0) {
                                i10 = this.displayWidth;
                                i6 = -1;
                                if (i10 == -1) {
                                    i10 = this.width;
                                }
                                this.displayWidth = i10;
                                i11 = this.displayHeight;
                                if (i11 == -1) {
                                    i11 = this.height;
                                }
                                this.displayHeight = i11;
                            } else {
                                i6 = -1;
                            }
                            i7 = this.displayWidth;
                            if (i7 != i6) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                                colorInfo = new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.name)) {
                                i6 = 0;
                            } else if ("htc_video_rotA-090".equals(this.name)) {
                                i6 = 90;
                            } else if ("htc_video_rotA-180".equals(this.name)) {
                                i6 = 180;
                            } else if ("htc_video_rotA-270".equals(this.name)) {
                                i6 = MediaPlayer.Event.f17411q;
                            }
                            if (this.projectionType == 0) {
                                i8 = i6;
                            } else {
                                i8 = i6;
                            }
                            formatCreateImageSampleFormat = Format.createVideoSampleFormat(Integer.toString(i), str2, null, -1, i3, this.width, this.height, -1.0f, list, i8, f, this.projectionData, this.stereoMode, colorInfo, this.drmInitData);
                            i12 = 2;
                        } else {
                            if ("application/x-subrip".equals(str2)) {
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, i5, this.language, this.drmInitData);
                            } else if (MimeTypes.TEXT_SSA.equals(str2)) {
                                ArrayList arrayList18 = new ArrayList(2);
                                arrayList18.add(MatroskaExtractor.SSA_DIALOGUE_FORMAT);
                                arrayList18.add(this.codecPrivate);
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, null, -1, i5, this.language, -1, this.drmInitData, Long.MAX_VALUE, arrayList18);
                            } else {
                                if (MimeTypes.APPLICATION_VOBSUB.equals(str2)) {
                                }
                                formatCreateImageSampleFormat = Format.createImageSampleFormat(Integer.toString(i), str2, null, -1, i5, list, this.language, this.drmInitData);
                            }
                            i12 = 3;
                        }
                        break;
                    } else {
                        formatCreateImageSampleFormat = Format.createAudioSampleFormat(Integer.toString(i), str2, null, -1, i3, this.channelCount, this.sampleRate, i2, list, this.drmInitData, i5, this.language);
                    }
                    TrackOutput trackOutputTrack18 = extractorOutput.track(this.number, i12);
                    this.output = trackOutputTrack18;
                    trackOutputTrack18.format(formatCreateImageSampleFormat);
                    return;
                case 19:
                    str2 = MimeTypes.APPLICATION_PGS;
                    list3 = null;
                    i2 = -1;
                    list2 = list3;
                    i3 = -1;
                    list = list2;
                    boolean z19 = this.flagDefault;
                    if (this.flagForced) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    i5 = (z19 ? 1 : 0) | i4;
                    if (!MimeTypes.isAudio(str2)) {
                        if (MimeTypes.isVideo(str2)) {
                            if (this.displayUnit == 0) {
                                i10 = this.displayWidth;
                                i6 = -1;
                                if (i10 == -1) {
                                    i10 = this.width;
                                }
                                this.displayWidth = i10;
                                i11 = this.displayHeight;
                                if (i11 == -1) {
                                    i11 = this.height;
                                }
                                this.displayHeight = i11;
                            } else {
                                i6 = -1;
                            }
                            i7 = this.displayWidth;
                            if (i7 != i6) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                                colorInfo = new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.name)) {
                                i6 = 0;
                            } else if ("htc_video_rotA-090".equals(this.name)) {
                                i6 = 90;
                            } else if ("htc_video_rotA-180".equals(this.name)) {
                                i6 = 180;
                            } else if ("htc_video_rotA-270".equals(this.name)) {
                                i6 = MediaPlayer.Event.f17411q;
                            }
                            if (this.projectionType == 0) {
                                i8 = i6;
                            } else {
                                i8 = i6;
                            }
                            formatCreateImageSampleFormat = Format.createVideoSampleFormat(Integer.toString(i), str2, null, -1, i3, this.width, this.height, -1.0f, list, i8, f, this.projectionData, this.stereoMode, colorInfo, this.drmInitData);
                            i12 = 2;
                        } else {
                            if ("application/x-subrip".equals(str2)) {
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, i5, this.language, this.drmInitData);
                            } else if (MimeTypes.TEXT_SSA.equals(str2)) {
                                ArrayList arrayList19 = new ArrayList(2);
                                arrayList19.add(MatroskaExtractor.SSA_DIALOGUE_FORMAT);
                                arrayList19.add(this.codecPrivate);
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, null, -1, i5, this.language, -1, this.drmInitData, Long.MAX_VALUE, arrayList19);
                            } else {
                                if (MimeTypes.APPLICATION_VOBSUB.equals(str2)) {
                                }
                                formatCreateImageSampleFormat = Format.createImageSampleFormat(Integer.toString(i), str2, null, -1, i5, list, this.language, this.drmInitData);
                            }
                            i12 = 3;
                        }
                        break;
                    } else {
                        formatCreateImageSampleFormat = Format.createAudioSampleFormat(Integer.toString(i), str2, null, -1, i3, this.channelCount, this.sampleRate, i2, list, this.drmInitData, i5, this.language);
                    }
                    TrackOutput trackOutputTrack19 = extractorOutput.track(this.number, i12);
                    this.output = trackOutputTrack19;
                    trackOutputTrack19.format(formatCreateImageSampleFormat);
                    return;
                case 20:
                    str2 = MimeTypes.VIDEO_UNKNOWN;
                    list3 = null;
                    i2 = -1;
                    list2 = list3;
                    i3 = -1;
                    list = list2;
                    boolean z110 = this.flagDefault;
                    if (this.flagForced) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    i5 = (z110 ? 1 : 0) | i4;
                    if (!MimeTypes.isAudio(str2)) {
                        if (MimeTypes.isVideo(str2)) {
                            if (this.displayUnit == 0) {
                                i10 = this.displayWidth;
                                i6 = -1;
                                if (i10 == -1) {
                                    i10 = this.width;
                                }
                                this.displayWidth = i10;
                                i11 = this.displayHeight;
                                if (i11 == -1) {
                                    i11 = this.height;
                                }
                                this.displayHeight = i11;
                            } else {
                                i6 = -1;
                            }
                            i7 = this.displayWidth;
                            if (i7 != i6) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                                colorInfo = new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.name)) {
                                i6 = 0;
                            } else if ("htc_video_rotA-090".equals(this.name)) {
                                i6 = 90;
                            } else if ("htc_video_rotA-180".equals(this.name)) {
                                i6 = 180;
                            } else if ("htc_video_rotA-270".equals(this.name)) {
                                i6 = MediaPlayer.Event.f17411q;
                            }
                            if (this.projectionType == 0) {
                                i8 = i6;
                            } else {
                                i8 = i6;
                            }
                            formatCreateImageSampleFormat = Format.createVideoSampleFormat(Integer.toString(i), str2, null, -1, i3, this.width, this.height, -1.0f, list, i8, f, this.projectionData, this.stereoMode, colorInfo, this.drmInitData);
                            i12 = 2;
                        } else {
                            if ("application/x-subrip".equals(str2)) {
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, i5, this.language, this.drmInitData);
                            } else if (MimeTypes.TEXT_SSA.equals(str2)) {
                                ArrayList arrayList110 = new ArrayList(2);
                                arrayList110.add(MatroskaExtractor.SSA_DIALOGUE_FORMAT);
                                arrayList110.add(this.codecPrivate);
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, null, -1, i5, this.language, -1, this.drmInitData, Long.MAX_VALUE, arrayList110);
                            } else {
                                if (MimeTypes.APPLICATION_VOBSUB.equals(str2)) {
                                }
                                formatCreateImageSampleFormat = Format.createImageSampleFormat(Integer.toString(i), str2, null, -1, i5, list, this.language, this.drmInitData);
                            }
                            i12 = 3;
                        }
                        break;
                    } else {
                        formatCreateImageSampleFormat = Format.createAudioSampleFormat(Integer.toString(i), str2, null, -1, i3, this.channelCount, this.sampleRate, i2, list, this.drmInitData, i5, this.language);
                    }
                    TrackOutput trackOutputTrack110 = extractorOutput.track(this.number, i12);
                    this.output = trackOutputTrack110;
                    trackOutputTrack110.format(formatCreateImageSampleFormat);
                    return;
                case 22:
                    pcmEncoding = Util.getPcmEncoding(this.audioBitDepth);
                    if (pcmEncoding == 0) {
                        sb = new StringBuilder("Unsupported PCM bit depth: ");
                        sb.append(this.audioBitDepth);
                        sb.append(". Setting mimeType to audio/x-unknown");
                        string = sb.toString();
                        Log.m17586w(MatroskaExtractor.TAG, string);
                        str2 = MimeTypes.AUDIO_UNKNOWN;
                        list3 = null;
                        i2 = -1;
                        list2 = list3;
                    } else {
                        i2 = pcmEncoding;
                        list2 = null;
                    }
                    i3 = -1;
                    list = list2;
                    boolean z111 = this.flagDefault;
                    if (this.flagForced) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    i5 = (z111 ? 1 : 0) | i4;
                    if (!MimeTypes.isAudio(str2)) {
                        if (MimeTypes.isVideo(str2)) {
                            if (this.displayUnit == 0) {
                                i10 = this.displayWidth;
                                i6 = -1;
                                if (i10 == -1) {
                                    i10 = this.width;
                                }
                                this.displayWidth = i10;
                                i11 = this.displayHeight;
                                if (i11 == -1) {
                                    i11 = this.height;
                                }
                                this.displayHeight = i11;
                            } else {
                                i6 = -1;
                            }
                            i7 = this.displayWidth;
                            if (i7 != i6) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                                colorInfo = new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.name)) {
                                i6 = 0;
                            } else if ("htc_video_rotA-090".equals(this.name)) {
                                i6 = 90;
                            } else if ("htc_video_rotA-180".equals(this.name)) {
                                i6 = 180;
                            } else if ("htc_video_rotA-270".equals(this.name)) {
                                i6 = MediaPlayer.Event.f17411q;
                            }
                            if (this.projectionType == 0) {
                                i8 = i6;
                            } else {
                                i8 = i6;
                            }
                            formatCreateImageSampleFormat = Format.createVideoSampleFormat(Integer.toString(i), str2, null, -1, i3, this.width, this.height, -1.0f, list, i8, f, this.projectionData, this.stereoMode, colorInfo, this.drmInitData);
                            i12 = 2;
                        } else {
                            if ("application/x-subrip".equals(str2)) {
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, i5, this.language, this.drmInitData);
                            } else if (MimeTypes.TEXT_SSA.equals(str2)) {
                                ArrayList arrayList111 = new ArrayList(2);
                                arrayList111.add(MatroskaExtractor.SSA_DIALOGUE_FORMAT);
                                arrayList111.add(this.codecPrivate);
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, null, -1, i5, this.language, -1, this.drmInitData, Long.MAX_VALUE, arrayList111);
                            } else {
                                if (MimeTypes.APPLICATION_VOBSUB.equals(str2)) {
                                }
                                formatCreateImageSampleFormat = Format.createImageSampleFormat(Integer.toString(i), str2, null, -1, i5, list, this.language, this.drmInitData);
                            }
                            i12 = 3;
                        }
                        break;
                    } else {
                        formatCreateImageSampleFormat = Format.createAudioSampleFormat(Integer.toString(i), str2, null, -1, i3, this.channelCount, this.sampleRate, i2, list, this.drmInitData, i5, this.language);
                    }
                    TrackOutput trackOutputTrack111 = extractorOutput.track(this.number, i12);
                    this.output = trackOutputTrack111;
                    trackOutputTrack111.format(formatCreateImageSampleFormat);
                    return;
                case 23:
                    str2 = MimeTypes.TEXT_SSA;
                    list3 = null;
                    i2 = -1;
                    list2 = list3;
                    i3 = -1;
                    list = list2;
                    boolean z112 = this.flagDefault;
                    if (this.flagForced) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    i5 = (z112 ? 1 : 0) | i4;
                    if (!MimeTypes.isAudio(str2)) {
                        if (MimeTypes.isVideo(str2)) {
                            if (this.displayUnit == 0) {
                                i10 = this.displayWidth;
                                i6 = -1;
                                if (i10 == -1) {
                                    i10 = this.width;
                                }
                                this.displayWidth = i10;
                                i11 = this.displayHeight;
                                if (i11 == -1) {
                                    i11 = this.height;
                                }
                                this.displayHeight = i11;
                            } else {
                                i6 = -1;
                            }
                            i7 = this.displayWidth;
                            if (i7 != i6) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                                colorInfo = new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.name)) {
                                i6 = 0;
                            } else if ("htc_video_rotA-090".equals(this.name)) {
                                i6 = 90;
                            } else if ("htc_video_rotA-180".equals(this.name)) {
                                i6 = 180;
                            } else if ("htc_video_rotA-270".equals(this.name)) {
                                i6 = MediaPlayer.Event.f17411q;
                            }
                            if (this.projectionType == 0) {
                                i8 = i6;
                            } else {
                                i8 = i6;
                            }
                            formatCreateImageSampleFormat = Format.createVideoSampleFormat(Integer.toString(i), str2, null, -1, i3, this.width, this.height, -1.0f, list, i8, f, this.projectionData, this.stereoMode, colorInfo, this.drmInitData);
                            i12 = 2;
                        } else {
                            if ("application/x-subrip".equals(str2)) {
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, i5, this.language, this.drmInitData);
                            } else if (MimeTypes.TEXT_SSA.equals(str2)) {
                                ArrayList arrayList112 = new ArrayList(2);
                                arrayList112.add(MatroskaExtractor.SSA_DIALOGUE_FORMAT);
                                arrayList112.add(this.codecPrivate);
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, null, -1, i5, this.language, -1, this.drmInitData, Long.MAX_VALUE, arrayList112);
                            } else {
                                if (MimeTypes.APPLICATION_VOBSUB.equals(str2)) {
                                }
                                formatCreateImageSampleFormat = Format.createImageSampleFormat(Integer.toString(i), str2, null, -1, i5, list, this.language, this.drmInitData);
                            }
                            i12 = 3;
                        }
                        break;
                    } else {
                        formatCreateImageSampleFormat = Format.createAudioSampleFormat(Integer.toString(i), str2, null, -1, i3, this.channelCount, this.sampleRate, i2, list, this.drmInitData, i5, this.language);
                    }
                    TrackOutput trackOutputTrack112 = extractorOutput.track(this.number, i12);
                    this.output = trackOutputTrack112;
                    trackOutputTrack112.format(formatCreateImageSampleFormat);
                    return;
                case 24:
                    HevcConfig hevcConfig = HevcConfig.parse(new ParsableByteArray(this.codecPrivate));
                    List<byte[]> list5 = hevcConfig.initializationData;
                    this.nalUnitLengthFieldLength = hevcConfig.nalUnitLengthFieldLength;
                    str2 = MimeTypes.VIDEO_H265;
                    list3 = list5;
                    i2 = -1;
                    list2 = list3;
                    i3 = -1;
                    list = list2;
                    boolean z113 = this.flagDefault;
                    if (this.flagForced) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    i5 = (z113 ? 1 : 0) | i4;
                    if (!MimeTypes.isAudio(str2)) {
                        if (MimeTypes.isVideo(str2)) {
                            if (this.displayUnit == 0) {
                                i10 = this.displayWidth;
                                i6 = -1;
                                if (i10 == -1) {
                                    i10 = this.width;
                                }
                                this.displayWidth = i10;
                                i11 = this.displayHeight;
                                if (i11 == -1) {
                                    i11 = this.height;
                                }
                                this.displayHeight = i11;
                            } else {
                                i6 = -1;
                            }
                            i7 = this.displayWidth;
                            if (i7 != i6) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                                colorInfo = new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.name)) {
                                i6 = 0;
                            } else if ("htc_video_rotA-090".equals(this.name)) {
                                i6 = 90;
                            } else if ("htc_video_rotA-180".equals(this.name)) {
                                i6 = 180;
                            } else if ("htc_video_rotA-270".equals(this.name)) {
                                i6 = MediaPlayer.Event.f17411q;
                            }
                            if (this.projectionType == 0) {
                                i8 = i6;
                            } else {
                                i8 = i6;
                            }
                            formatCreateImageSampleFormat = Format.createVideoSampleFormat(Integer.toString(i), str2, null, -1, i3, this.width, this.height, -1.0f, list, i8, f, this.projectionData, this.stereoMode, colorInfo, this.drmInitData);
                            i12 = 2;
                        } else {
                            if ("application/x-subrip".equals(str2)) {
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, i5, this.language, this.drmInitData);
                            } else if (MimeTypes.TEXT_SSA.equals(str2)) {
                                ArrayList arrayList113 = new ArrayList(2);
                                arrayList113.add(MatroskaExtractor.SSA_DIALOGUE_FORMAT);
                                arrayList113.add(this.codecPrivate);
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, null, -1, i5, this.language, -1, this.drmInitData, Long.MAX_VALUE, arrayList113);
                            } else {
                                if (MimeTypes.APPLICATION_VOBSUB.equals(str2)) {
                                }
                                formatCreateImageSampleFormat = Format.createImageSampleFormat(Integer.toString(i), str2, null, -1, i5, list, this.language, this.drmInitData);
                            }
                            i12 = 3;
                        }
                        break;
                    } else {
                        formatCreateImageSampleFormat = Format.createAudioSampleFormat(Integer.toString(i), str2, null, -1, i3, this.channelCount, this.sampleRate, i2, list, this.drmInitData, i5, this.language);
                    }
                    TrackOutput trackOutputTrack113 = extractorOutput.track(this.number, i12);
                    this.output = trackOutputTrack113;
                    trackOutputTrack113.format(formatCreateImageSampleFormat);
                    return;
                case 25:
                    str2 = "application/x-subrip";
                    list3 = null;
                    i2 = -1;
                    list2 = list3;
                    i3 = -1;
                    list = list2;
                    boolean z114 = this.flagDefault;
                    if (this.flagForced) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    i5 = (z114 ? 1 : 0) | i4;
                    if (!MimeTypes.isAudio(str2)) {
                        if (MimeTypes.isVideo(str2)) {
                            if (this.displayUnit == 0) {
                                i10 = this.displayWidth;
                                i6 = -1;
                                if (i10 == -1) {
                                    i10 = this.width;
                                }
                                this.displayWidth = i10;
                                i11 = this.displayHeight;
                                if (i11 == -1) {
                                    i11 = this.height;
                                }
                                this.displayHeight = i11;
                            } else {
                                i6 = -1;
                            }
                            i7 = this.displayWidth;
                            if (i7 != i6) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                                colorInfo = new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.name)) {
                                i6 = 0;
                            } else if ("htc_video_rotA-090".equals(this.name)) {
                                i6 = 90;
                            } else if ("htc_video_rotA-180".equals(this.name)) {
                                i6 = 180;
                            } else if ("htc_video_rotA-270".equals(this.name)) {
                                i6 = MediaPlayer.Event.f17411q;
                            }
                            if (this.projectionType == 0) {
                                i8 = i6;
                            } else {
                                i8 = i6;
                            }
                            formatCreateImageSampleFormat = Format.createVideoSampleFormat(Integer.toString(i), str2, null, -1, i3, this.width, this.height, -1.0f, list, i8, f, this.projectionData, this.stereoMode, colorInfo, this.drmInitData);
                            i12 = 2;
                        } else {
                            if ("application/x-subrip".equals(str2)) {
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, i5, this.language, this.drmInitData);
                            } else if (MimeTypes.TEXT_SSA.equals(str2)) {
                                ArrayList arrayList114 = new ArrayList(2);
                                arrayList114.add(MatroskaExtractor.SSA_DIALOGUE_FORMAT);
                                arrayList114.add(this.codecPrivate);
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, null, -1, i5, this.language, -1, this.drmInitData, Long.MAX_VALUE, arrayList114);
                            } else {
                                if (MimeTypes.APPLICATION_VOBSUB.equals(str2)) {
                                }
                                formatCreateImageSampleFormat = Format.createImageSampleFormat(Integer.toString(i), str2, null, -1, i5, list, this.language, this.drmInitData);
                            }
                            i12 = 3;
                        }
                        break;
                    } else {
                        formatCreateImageSampleFormat = Format.createAudioSampleFormat(Integer.toString(i), str2, null, -1, i3, this.channelCount, this.sampleRate, i2, list, this.drmInitData, i5, this.language);
                    }
                    TrackOutput trackOutputTrack114 = extractorOutput.track(this.number, i12);
                    this.output = trackOutputTrack114;
                    trackOutputTrack114.format(formatCreateImageSampleFormat);
                    return;
                case 26:
                    str2 = MimeTypes.VIDEO_MPEG2;
                    list3 = null;
                    i2 = -1;
                    list2 = list3;
                    i3 = -1;
                    list = list2;
                    boolean z115 = this.flagDefault;
                    if (this.flagForced) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    i5 = (z115 ? 1 : 0) | i4;
                    if (!MimeTypes.isAudio(str2)) {
                        if (MimeTypes.isVideo(str2)) {
                            if (this.displayUnit == 0) {
                                i10 = this.displayWidth;
                                i6 = -1;
                                if (i10 == -1) {
                                    i10 = this.width;
                                }
                                this.displayWidth = i10;
                                i11 = this.displayHeight;
                                if (i11 == -1) {
                                    i11 = this.height;
                                }
                                this.displayHeight = i11;
                            } else {
                                i6 = -1;
                            }
                            i7 = this.displayWidth;
                            if (i7 != i6) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                                colorInfo = new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.name)) {
                                i6 = 0;
                            } else if ("htc_video_rotA-090".equals(this.name)) {
                                i6 = 90;
                            } else if ("htc_video_rotA-180".equals(this.name)) {
                                i6 = 180;
                            } else if ("htc_video_rotA-270".equals(this.name)) {
                                i6 = MediaPlayer.Event.f17411q;
                            }
                            if (this.projectionType == 0) {
                                i8 = i6;
                            } else {
                                i8 = i6;
                            }
                            formatCreateImageSampleFormat = Format.createVideoSampleFormat(Integer.toString(i), str2, null, -1, i3, this.width, this.height, -1.0f, list, i8, f, this.projectionData, this.stereoMode, colorInfo, this.drmInitData);
                            i12 = 2;
                        } else {
                            if ("application/x-subrip".equals(str2)) {
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, i5, this.language, this.drmInitData);
                            } else if (MimeTypes.TEXT_SSA.equals(str2)) {
                                ArrayList arrayList115 = new ArrayList(2);
                                arrayList115.add(MatroskaExtractor.SSA_DIALOGUE_FORMAT);
                                arrayList115.add(this.codecPrivate);
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, null, -1, i5, this.language, -1, this.drmInitData, Long.MAX_VALUE, arrayList115);
                            } else {
                                if (MimeTypes.APPLICATION_VOBSUB.equals(str2)) {
                                }
                                formatCreateImageSampleFormat = Format.createImageSampleFormat(Integer.toString(i), str2, null, -1, i5, list, this.language, this.drmInitData);
                            }
                            i12 = 3;
                        }
                        break;
                    } else {
                        formatCreateImageSampleFormat = Format.createAudioSampleFormat(Integer.toString(i), str2, null, -1, i3, this.channelCount, this.sampleRate, i2, list, this.drmInitData, i5, this.language);
                    }
                    TrackOutput trackOutputTrack115 = extractorOutput.track(this.number, i12);
                    this.output = trackOutputTrack115;
                    trackOutputTrack115.format(formatCreateImageSampleFormat);
                    return;
                case 27:
                    str2 = MimeTypes.AUDIO_E_AC3;
                    list3 = null;
                    i2 = -1;
                    list2 = list3;
                    i3 = -1;
                    list = list2;
                    boolean z116 = this.flagDefault;
                    if (this.flagForced) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    i5 = (z116 ? 1 : 0) | i4;
                    if (!MimeTypes.isAudio(str2)) {
                        if (MimeTypes.isVideo(str2)) {
                            if (this.displayUnit == 0) {
                                i10 = this.displayWidth;
                                i6 = -1;
                                if (i10 == -1) {
                                    i10 = this.width;
                                }
                                this.displayWidth = i10;
                                i11 = this.displayHeight;
                                if (i11 == -1) {
                                    i11 = this.height;
                                }
                                this.displayHeight = i11;
                            } else {
                                i6 = -1;
                            }
                            i7 = this.displayWidth;
                            if (i7 != i6) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                                colorInfo = new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.name)) {
                                i6 = 0;
                            } else if ("htc_video_rotA-090".equals(this.name)) {
                                i6 = 90;
                            } else if ("htc_video_rotA-180".equals(this.name)) {
                                i6 = 180;
                            } else if ("htc_video_rotA-270".equals(this.name)) {
                                i6 = MediaPlayer.Event.f17411q;
                            }
                            if (this.projectionType == 0) {
                                i8 = i6;
                            } else {
                                i8 = i6;
                            }
                            formatCreateImageSampleFormat = Format.createVideoSampleFormat(Integer.toString(i), str2, null, -1, i3, this.width, this.height, -1.0f, list, i8, f, this.projectionData, this.stereoMode, colorInfo, this.drmInitData);
                            i12 = 2;
                        } else {
                            if ("application/x-subrip".equals(str2)) {
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, i5, this.language, this.drmInitData);
                            } else if (MimeTypes.TEXT_SSA.equals(str2)) {
                                ArrayList arrayList116 = new ArrayList(2);
                                arrayList116.add(MatroskaExtractor.SSA_DIALOGUE_FORMAT);
                                arrayList116.add(this.codecPrivate);
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, null, -1, i5, this.language, -1, this.drmInitData, Long.MAX_VALUE, arrayList116);
                            } else {
                                if (MimeTypes.APPLICATION_VOBSUB.equals(str2)) {
                                }
                                formatCreateImageSampleFormat = Format.createImageSampleFormat(Integer.toString(i), str2, null, -1, i5, list, this.language, this.drmInitData);
                            }
                            i12 = 3;
                        }
                        break;
                    } else {
                        formatCreateImageSampleFormat = Format.createAudioSampleFormat(Integer.toString(i), str2, null, -1, i3, this.channelCount, this.sampleRate, i2, list, this.drmInitData, i5, this.language);
                    }
                    TrackOutput trackOutputTrack116 = extractorOutput.track(this.number, i12);
                    this.output = trackOutputTrack116;
                    trackOutputTrack116.format(formatCreateImageSampleFormat);
                    return;
                case 28:
                    List<byte[]> listSingletonList5 = Collections.singletonList(this.codecPrivate);
                    str2 = MimeTypes.AUDIO_FLAC;
                    list3 = listSingletonList5;
                    i2 = -1;
                    list2 = list3;
                    i3 = -1;
                    list = list2;
                    boolean z117 = this.flagDefault;
                    if (this.flagForced) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    i5 = (z117 ? 1 : 0) | i4;
                    if (!MimeTypes.isAudio(str2)) {
                        if (MimeTypes.isVideo(str2)) {
                            if (this.displayUnit == 0) {
                                i10 = this.displayWidth;
                                i6 = -1;
                                if (i10 == -1) {
                                    i10 = this.width;
                                }
                                this.displayWidth = i10;
                                i11 = this.displayHeight;
                                if (i11 == -1) {
                                    i11 = this.height;
                                }
                                this.displayHeight = i11;
                            } else {
                                i6 = -1;
                            }
                            i7 = this.displayWidth;
                            if (i7 != i6) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                                colorInfo = new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.name)) {
                                i6 = 0;
                            } else if ("htc_video_rotA-090".equals(this.name)) {
                                i6 = 90;
                            } else if ("htc_video_rotA-180".equals(this.name)) {
                                i6 = 180;
                            } else if ("htc_video_rotA-270".equals(this.name)) {
                                i6 = MediaPlayer.Event.f17411q;
                            }
                            if (this.projectionType == 0) {
                                i8 = i6;
                            } else {
                                i8 = i6;
                            }
                            formatCreateImageSampleFormat = Format.createVideoSampleFormat(Integer.toString(i), str2, null, -1, i3, this.width, this.height, -1.0f, list, i8, f, this.projectionData, this.stereoMode, colorInfo, this.drmInitData);
                            i12 = 2;
                        } else {
                            if ("application/x-subrip".equals(str2)) {
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, i5, this.language, this.drmInitData);
                            } else if (MimeTypes.TEXT_SSA.equals(str2)) {
                                ArrayList arrayList117 = new ArrayList(2);
                                arrayList117.add(MatroskaExtractor.SSA_DIALOGUE_FORMAT);
                                arrayList117.add(this.codecPrivate);
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, null, -1, i5, this.language, -1, this.drmInitData, Long.MAX_VALUE, arrayList117);
                            } else {
                                if (MimeTypes.APPLICATION_VOBSUB.equals(str2)) {
                                }
                                formatCreateImageSampleFormat = Format.createImageSampleFormat(Integer.toString(i), str2, null, -1, i5, list, this.language, this.drmInitData);
                            }
                            i12 = 3;
                        }
                        break;
                    } else {
                        formatCreateImageSampleFormat = Format.createAudioSampleFormat(Integer.toString(i), str2, null, -1, i3, this.channelCount, this.sampleRate, i2, list, this.drmInitData, i5, this.language);
                    }
                    TrackOutput trackOutputTrack117 = extractorOutput.track(this.number, i12);
                    this.output = trackOutputTrack117;
                    trackOutputTrack117.format(formatCreateImageSampleFormat);
                    return;
                case 29:
                    ArrayList arrayList20 = new ArrayList(3);
                    arrayList20.add(this.codecPrivate);
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    arrayList20.add(byteBufferAllocate.order(byteOrder).putLong(this.codecDelayNs).array());
                    arrayList20.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.seekPreRollNs).array());
                    str2 = MimeTypes.AUDIO_OPUS;
                    i2 = -1;
                    i3 = MatroskaExtractor.OPUS_MAX_INPUT_SIZE;
                    list = arrayList20;
                    boolean z118 = this.flagDefault;
                    if (this.flagForced) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    i5 = (z118 ? 1 : 0) | i4;
                    if (!MimeTypes.isAudio(str2)) {
                        if (MimeTypes.isVideo(str2)) {
                            if (this.displayUnit == 0) {
                                i10 = this.displayWidth;
                                i6 = -1;
                                if (i10 == -1) {
                                    i10 = this.width;
                                }
                                this.displayWidth = i10;
                                i11 = this.displayHeight;
                                if (i11 == -1) {
                                    i11 = this.height;
                                }
                                this.displayHeight = i11;
                            } else {
                                i6 = -1;
                            }
                            i7 = this.displayWidth;
                            if (i7 != i6) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.hasColorInfo) {
                                colorInfo = new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.name)) {
                                i6 = 0;
                            } else if ("htc_video_rotA-090".equals(this.name)) {
                                i6 = 90;
                            } else if ("htc_video_rotA-180".equals(this.name)) {
                                i6 = 180;
                            } else if ("htc_video_rotA-270".equals(this.name)) {
                                i6 = MediaPlayer.Event.f17411q;
                            }
                            if (this.projectionType == 0) {
                                i8 = i6;
                            } else {
                                i8 = i6;
                            }
                            formatCreateImageSampleFormat = Format.createVideoSampleFormat(Integer.toString(i), str2, null, -1, i3, this.width, this.height, -1.0f, list, i8, f, this.projectionData, this.stereoMode, colorInfo, this.drmInitData);
                            i12 = 2;
                        } else {
                            if ("application/x-subrip".equals(str2)) {
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, i5, this.language, this.drmInitData);
                            } else if (MimeTypes.TEXT_SSA.equals(str2)) {
                                ArrayList arrayList118 = new ArrayList(2);
                                arrayList118.add(MatroskaExtractor.SSA_DIALOGUE_FORMAT);
                                arrayList118.add(this.codecPrivate);
                                formatCreateImageSampleFormat = Format.createTextSampleFormat(Integer.toString(i), str2, null, -1, i5, this.language, -1, this.drmInitData, Long.MAX_VALUE, arrayList118);
                            } else {
                                if (MimeTypes.APPLICATION_VOBSUB.equals(str2)) {
                                }
                                formatCreateImageSampleFormat = Format.createImageSampleFormat(Integer.toString(i), str2, null, -1, i5, list, this.language, this.drmInitData);
                            }
                            i12 = 3;
                        }
                        break;
                    } else {
                        formatCreateImageSampleFormat = Format.createAudioSampleFormat(Integer.toString(i), str2, null, -1, i3, this.channelCount, this.sampleRate, i2, list, this.drmInitData, i5, this.language);
                    }
                    TrackOutput trackOutputTrack118 = extractorOutput.track(this.number, i12);
                    this.output = trackOutputTrack118;
                    trackOutputTrack118.format(formatCreateImageSampleFormat);
                    return;
                default:
                    throw new ParserException("Unrecognized codec identifier.");
            }
        }

        public void outputPendingSampleMetadata() {
            TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.outputPendingSampleMetadata(this);
            }
        }

        public void reset() {
            TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.reset();
            }
        }
    }

    public static final class TrueHdSampleRechunker {
        private int chunkFlags;
        private int chunkOffset;
        private int chunkSampleCount;
        private int chunkSize;
        private long chunkTimeUs;
        private boolean foundSyncframe;
        private final byte[] syncframePrefix = new byte[10];

        public void outputPendingSampleMetadata(Track track) {
            if (this.chunkSampleCount > 0) {
                track.output.sampleMetadata(this.chunkTimeUs, this.chunkFlags, this.chunkSize, this.chunkOffset, track.cryptoData);
                this.chunkSampleCount = 0;
            }
        }

        public void reset() {
            this.foundSyncframe = false;
            this.chunkSampleCount = 0;
        }

        public void sampleMetadata(Track track, long j, int i, int i2, int i3) {
            if (this.foundSyncframe) {
                int i4 = this.chunkSampleCount;
                int i5 = i4 + 1;
                this.chunkSampleCount = i5;
                if (i4 == 0) {
                    this.chunkTimeUs = j;
                    this.chunkFlags = i;
                    this.chunkSize = 0;
                }
                this.chunkSize += i2;
                this.chunkOffset = i3;
                if (i5 >= 16) {
                    outputPendingSampleMetadata(track);
                }
            }
        }

        public void startSample(ExtractorInput extractorInput) throws InterruptedException, IOException {
            if (this.foundSyncframe) {
                return;
            }
            extractorInput.peekFully(this.syncframePrefix, 0, 10);
            extractorInput.resetPeekPosition();
            if (Ac3Util.parseTrueHdSyncframeAudioSampleCount(this.syncframePrefix) == 0) {
                return;
            }
            this.foundSyncframe = true;
        }
    }

    public MatroskaExtractor() {
        this(0);
    }

    private SeekMap buildSeekMap() {
        LongArray longArray;
        LongArray longArray2;
        int i;
        if (this.segmentContentPosition == -1 || this.durationUs == C3219C.TIME_UNSET || (longArray = this.cueTimesUs) == null || longArray.size() == 0 || (longArray2 = this.cueClusterPositions) == null || longArray2.size() != this.cueTimesUs.size()) {
            this.cueTimesUs = null;
            this.cueClusterPositions = null;
            return new SeekMap.Unseekable(this.durationUs);
        }
        int size = this.cueTimesUs.size();
        int[] iArrCopyOf = new int[size];
        long[] jArrCopyOf = new long[size];
        long[] jArrCopyOf2 = new long[size];
        long[] jArrCopyOf3 = new long[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            jArrCopyOf3[i3] = this.cueTimesUs.get(i3);
            jArrCopyOf[i3] = this.cueClusterPositions.get(i3) + this.segmentContentPosition;
        }
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            int i4 = i2 + 1;
            iArrCopyOf[i2] = (int) (jArrCopyOf[i4] - jArrCopyOf[i2]);
            jArrCopyOf2[i2] = jArrCopyOf3[i4] - jArrCopyOf3[i2];
            i2 = i4;
        }
        iArrCopyOf[i] = (int) ((this.segmentContentPosition + this.segmentContentSize) - jArrCopyOf[i]);
        long j = this.durationUs - jArrCopyOf3[i];
        jArrCopyOf2[i] = j;
        if (j <= 0) {
            Log.m17586w(TAG, "Discarding last cue point with unexpected duration: " + j);
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i);
        }
        this.cueTimesUs = null;
        this.cueClusterPositions = null;
        return new ChunkIndex(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    private void commitSampleToOutput(Track track, long j, int i, int i2, int i3) {
        String str;
        TrueHdSampleRechunker trueHdSampleRechunker = track.trueHdSampleRechunker;
        if (trueHdSampleRechunker != null) {
            trueHdSampleRechunker.sampleMetadata(track, j, i, i2, i3);
        } else {
            if (CODEC_ID_SUBRIP.equals(track.codecId) || CODEC_ID_ASS.equals(track.codecId)) {
                if (this.blockSampleCount > 1) {
                    str = "Skipping subtitle sample in laced block.";
                } else {
                    long j2 = this.blockDurationUs;
                    if (j2 == C3219C.TIME_UNSET) {
                        str = "Skipping subtitle sample with no duration.";
                    } else {
                        setSubtitleEndTime(track.codecId, j2, this.subtitleSample.data);
                        TrackOutput trackOutput = track.output;
                        ParsableByteArray parsableByteArray = this.subtitleSample;
                        trackOutput.sampleData(parsableByteArray, parsableByteArray.limit());
                        i2 += this.subtitleSample.limit();
                    }
                }
                Log.m17586w(TAG, str);
            }
            if ((268435456 & i) != 0) {
                if (this.blockSampleCount > 1) {
                    i &= -268435457;
                } else {
                    int iLimit = this.blockAdditionalData.limit();
                    track.output.sampleData(this.blockAdditionalData, iLimit);
                    i2 += iLimit;
                }
            }
            track.output.sampleMetadata(j, i, i2, i3, track.cryptoData);
        }
        this.haveOutputSample = true;
    }

    private static int[] ensureArrayCapacity(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return iArr.length >= i ? iArr : new int[Math.max(iArr.length * 2, i)];
    }

    private int finishWriteSampleData() {
        int i = this.sampleBytesWritten;
        resetWriteSampleData();
        return i;
    }

    private static byte[] formatSubtitleTimecode(long j, String str, long j2) {
        Assertions.checkArgument(j != C3219C.TIME_UNSET);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) (i * 3600)) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) (i2 * 60)) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return Util.getUtf8Bytes(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))));
    }

    private static boolean isCodecSupported(String str) {
        return CODEC_ID_VP8.equals(str) || CODEC_ID_VP9.equals(str) || CODEC_ID_AV1.equals(str) || CODEC_ID_MPEG2.equals(str) || CODEC_ID_MPEG4_SP.equals(str) || CODEC_ID_MPEG4_ASP.equals(str) || CODEC_ID_MPEG4_AP.equals(str) || CODEC_ID_H264.equals(str) || CODEC_ID_H265.equals(str) || CODEC_ID_FOURCC.equals(str) || CODEC_ID_THEORA.equals(str) || CODEC_ID_OPUS.equals(str) || CODEC_ID_VORBIS.equals(str) || CODEC_ID_AAC.equals(str) || CODEC_ID_MP2.equals(str) || CODEC_ID_MP3.equals(str) || CODEC_ID_AC3.equals(str) || CODEC_ID_E_AC3.equals(str) || CODEC_ID_TRUEHD.equals(str) || CODEC_ID_DTS.equals(str) || CODEC_ID_DTS_EXPRESS.equals(str) || CODEC_ID_DTS_LOSSLESS.equals(str) || CODEC_ID_FLAC.equals(str) || CODEC_ID_ACM.equals(str) || CODEC_ID_PCM_INT_LIT.equals(str) || CODEC_ID_SUBRIP.equals(str) || CODEC_ID_ASS.equals(str) || CODEC_ID_VOBSUB.equals(str) || CODEC_ID_PGS.equals(str) || CODEC_ID_DVBSUB.equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new MatroskaExtractor()};
    }

    private boolean maybeSeekForCues(PositionHolder positionHolder, long j) {
        if (this.seekForCues) {
            this.seekPositionAfterBuildingCues = j;
            positionHolder.position = this.cuesContentPosition;
            this.seekForCues = false;
            return true;
        }
        if (this.sentSeekMap) {
            long j2 = this.seekPositionAfterBuildingCues;
            if (j2 != -1) {
                positionHolder.position = j2;
                this.seekPositionAfterBuildingCues = -1L;
                return true;
            }
        }
        return false;
    }

    private void readScratch(ExtractorInput extractorInput, int i) throws InterruptedException, IOException {
        if (this.scratch.limit() >= i) {
            return;
        }
        if (this.scratch.capacity() < i) {
            ParsableByteArray parsableByteArray = this.scratch;
            byte[] bArr = parsableByteArray.data;
            parsableByteArray.reset(Arrays.copyOf(bArr, Math.max(bArr.length * 2, i)), this.scratch.limit());
        }
        ParsableByteArray parsableByteArray2 = this.scratch;
        extractorInput.readFully(parsableByteArray2.data, parsableByteArray2.limit(), i - this.scratch.limit());
        this.scratch.setLimit(i);
    }

    private void resetWriteSampleData() {
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        this.sampleEncodingHandled = false;
        this.sampleSignalByteRead = false;
        this.samplePartitionCountRead = false;
        this.samplePartitionCount = 0;
        this.sampleSignalByte = (byte) 0;
        this.sampleInitializationVectorRead = false;
        this.sampleStrippedBytes.reset();
    }

    private long scaleTimecodeToUs(long j) throws ParserException {
        long j2 = this.timecodeScale;
        if (j2 != C3219C.TIME_UNSET) {
            return Util.scaleLargeTimestamp(j, j2, 1000L);
        }
        throw new ParserException("Can't scale timecode prior to timecodeScale being set.");
    }

    private static void setSubtitleEndTime(String str, long j, byte[] bArr) {
        byte[] subtitleTimecode;
        int i;
        str.getClass();
        if (str.equals(CODEC_ID_ASS)) {
            subtitleTimecode = formatSubtitleTimecode(j, SSA_TIMECODE_FORMAT, SSA_TIMECODE_LAST_VALUE_SCALING_FACTOR);
            i = 21;
        } else {
            if (!str.equals(CODEC_ID_SUBRIP)) {
                throw new IllegalArgumentException();
            }
            subtitleTimecode = formatSubtitleTimecode(j, SUBRIP_TIMECODE_FORMAT, 1000L);
            i = 19;
        }
        System.arraycopy(subtitleTimecode, 0, bArr, i, subtitleTimecode.length);
    }

    private int writeSampleData(ExtractorInput extractorInput, Track track, int i) throws InterruptedException, IOException {
        int i2;
        if (CODEC_ID_SUBRIP.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SUBRIP_PREFIX, i);
        } else {
            if (!CODEC_ID_ASS.equals(track.codecId)) {
                TrackOutput trackOutput = track.output;
                if (!this.sampleEncodingHandled) {
                    if (track.hasContentEncryption) {
                        this.blockFlags &= -1073741825;
                        if (!this.sampleSignalByteRead) {
                            extractorInput.readFully(this.scratch.data, 0, 1);
                            this.sampleBytesRead++;
                            byte b = this.scratch.data[0];
                            if ((b & C4783m8.f15110b) == 128) {
                                throw new ParserException("Extension bit is set in signal byte");
                            }
                            this.sampleSignalByte = b;
                            this.sampleSignalByteRead = true;
                        }
                        byte b2 = this.sampleSignalByte;
                        if ((b2 & 1) == 1) {
                            boolean z = (b2 & 2) == 2;
                            this.blockFlags |= 1073741824;
                            if (!this.sampleInitializationVectorRead) {
                                extractorInput.readFully(this.encryptionInitializationVector.data, 0, 8);
                                this.sampleBytesRead += 8;
                                this.sampleInitializationVectorRead = true;
                                ParsableByteArray parsableByteArray = this.scratch;
                                parsableByteArray.data[0] = (byte) ((z ? 128 : 0) | 8);
                                parsableByteArray.setPosition(0);
                                trackOutput.sampleData(this.scratch, 1);
                                this.sampleBytesWritten++;
                                this.encryptionInitializationVector.setPosition(0);
                                trackOutput.sampleData(this.encryptionInitializationVector, 8);
                                this.sampleBytesWritten += 8;
                            }
                            if (z) {
                                if (!this.samplePartitionCountRead) {
                                    extractorInput.readFully(this.scratch.data, 0, 1);
                                    this.sampleBytesRead++;
                                    this.scratch.setPosition(0);
                                    this.samplePartitionCount = this.scratch.readUnsignedByte();
                                    this.samplePartitionCountRead = true;
                                }
                                int i3 = this.samplePartitionCount * 4;
                                this.scratch.reset(i3);
                                extractorInput.readFully(this.scratch.data, 0, i3);
                                this.sampleBytesRead += i3;
                                short s2 = (short) ((this.samplePartitionCount / 2) + 1);
                                int i4 = (s2 * 6) + 2;
                                ByteBuffer byteBuffer = this.encryptionSubsampleDataBuffer;
                                if (byteBuffer == null || byteBuffer.capacity() < i4) {
                                    this.encryptionSubsampleDataBuffer = ByteBuffer.allocate(i4);
                                }
                                this.encryptionSubsampleDataBuffer.position(0);
                                this.encryptionSubsampleDataBuffer.putShort(s2);
                                int i5 = 0;
                                int i6 = 0;
                                while (true) {
                                    i2 = this.samplePartitionCount;
                                    if (i5 >= i2) {
                                        break;
                                    }
                                    int unsignedIntToInt = this.scratch.readUnsignedIntToInt();
                                    if (i5 % 2 == 0) {
                                        this.encryptionSubsampleDataBuffer.putShort((short) (unsignedIntToInt - i6));
                                    } else {
                                        this.encryptionSubsampleDataBuffer.putInt(unsignedIntToInt - i6);
                                    }
                                    i5++;
                                    i6 = unsignedIntToInt;
                                }
                                int i7 = (i - this.sampleBytesRead) - i6;
                                int i8 = i2 % 2;
                                ByteBuffer byteBuffer2 = this.encryptionSubsampleDataBuffer;
                                if (i8 == 1) {
                                    byteBuffer2.putInt(i7);
                                } else {
                                    byteBuffer2.putShort((short) i7);
                                    this.encryptionSubsampleDataBuffer.putInt(0);
                                }
                                this.encryptionSubsampleData.reset(this.encryptionSubsampleDataBuffer.array(), i4);
                                trackOutput.sampleData(this.encryptionSubsampleData, i4);
                                this.sampleBytesWritten += i4;
                            }
                        }
                    } else {
                        byte[] bArr = track.sampleStrippedBytes;
                        if (bArr != null) {
                            this.sampleStrippedBytes.reset(bArr, bArr.length);
                        }
                    }
                    if (track.maxBlockAdditionId > 0) {
                        this.blockFlags |= 268435456;
                        this.blockAdditionalData.reset();
                        this.scratch.reset(4);
                        ParsableByteArray parsableByteArray2 = this.scratch;
                        byte[] bArr2 = parsableByteArray2.data;
                        bArr2[0] = (byte) ((i >> 24) & 255);
                        bArr2[1] = (byte) ((i >> 16) & 255);
                        bArr2[2] = (byte) ((i >> 8) & 255);
                        bArr2[3] = (byte) (i & 255);
                        trackOutput.sampleData(parsableByteArray2, 4);
                        this.sampleBytesWritten += 4;
                    }
                    this.sampleEncodingHandled = true;
                }
                int iLimit = this.sampleStrippedBytes.limit() + i;
                if (!CODEC_ID_H264.equals(track.codecId) && !CODEC_ID_H265.equals(track.codecId)) {
                    if (track.trueHdSampleRechunker != null) {
                        Assertions.checkState(this.sampleStrippedBytes.limit() == 0);
                        track.trueHdSampleRechunker.startSample(extractorInput);
                    }
                    while (true) {
                        int i9 = this.sampleBytesRead;
                        if (i9 >= iLimit) {
                            break;
                        }
                        int iWriteToOutput = writeToOutput(extractorInput, trackOutput, iLimit - i9);
                        this.sampleBytesRead += iWriteToOutput;
                        this.sampleBytesWritten += iWriteToOutput;
                    }
                } else {
                    byte[] bArr3 = this.nalLength.data;
                    bArr3[0] = 0;
                    bArr3[1] = 0;
                    bArr3[2] = 0;
                    int i10 = track.nalUnitLengthFieldLength;
                    int i11 = 4 - i10;
                    while (this.sampleBytesRead < iLimit) {
                        int i12 = this.sampleCurrentNalBytesRemaining;
                        if (i12 == 0) {
                            writeToTarget(extractorInput, bArr3, i11, i10);
                            this.sampleBytesRead += i10;
                            this.nalLength.setPosition(0);
                            this.sampleCurrentNalBytesRemaining = this.nalLength.readUnsignedIntToInt();
                            this.nalStartCode.setPosition(0);
                            trackOutput.sampleData(this.nalStartCode, 4);
                            this.sampleBytesWritten += 4;
                        } else {
                            int iWriteToOutput2 = writeToOutput(extractorInput, trackOutput, i12);
                            this.sampleBytesRead += iWriteToOutput2;
                            this.sampleBytesWritten += iWriteToOutput2;
                            this.sampleCurrentNalBytesRemaining -= iWriteToOutput2;
                        }
                    }
                }
                if (CODEC_ID_VORBIS.equals(track.codecId)) {
                    this.vorbisNumPageSamples.setPosition(0);
                    trackOutput.sampleData(this.vorbisNumPageSamples, 4);
                    this.sampleBytesWritten += 4;
                }
                return finishWriteSampleData();
            }
            writeSubtitleSampleData(extractorInput, SSA_PREFIX, i);
        }
        return finishWriteSampleData();
    }

    private void writeSubtitleSampleData(ExtractorInput extractorInput, byte[] bArr, int i) throws InterruptedException, IOException {
        int length = bArr.length + i;
        if (this.subtitleSample.capacity() < length) {
            this.subtitleSample.data = Arrays.copyOf(bArr, length + i);
        } else {
            System.arraycopy(bArr, 0, this.subtitleSample.data, 0, bArr.length);
        }
        extractorInput.readFully(this.subtitleSample.data, bArr.length, i);
        this.subtitleSample.reset(length);
    }

    private int writeToOutput(ExtractorInput extractorInput, TrackOutput trackOutput, int i) throws InterruptedException, IOException {
        int iBytesLeft = this.sampleStrippedBytes.bytesLeft();
        if (iBytesLeft <= 0) {
            return trackOutput.sampleData(extractorInput, i, false);
        }
        int iMin = Math.min(i, iBytesLeft);
        trackOutput.sampleData(this.sampleStrippedBytes, iMin);
        return iMin;
    }

    private void writeToTarget(ExtractorInput extractorInput, byte[] bArr, int i, int i2) throws InterruptedException, IOException {
        int iMin = Math.min(i2, this.sampleStrippedBytes.bytesLeft());
        extractorInput.readFully(bArr, i + iMin, i2 - iMin);
        if (iMin > 0) {
            this.sampleStrippedBytes.readBytes(bArr, i, iMin);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0244  */
    /* JADX WARN: Code duplicated, block: B:101:0x0247  */
    /* JADX WARN: Code duplicated, block: B:88:0x022e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0230  */
    /* JADX WARN: Code duplicated, block: B:98:0x0241  */
    @CallSuper
    public void binaryElement(int i, int i2, ExtractorInput extractorInput) throws InterruptedException, IOException {
        char c;
        long j;
        int i3;
        int i4;
        int i5;
        byte b;
        boolean z;
        int i6;
        int i7;
        int i8 = 0;
        int i9 = 1;
        if (i != ID_BLOCK && i != ID_SIMPLE_BLOCK) {
            if (i == ID_BLOCK_ADDITIONAL) {
                if (this.blockState != 2) {
                    return;
                }
                handleBlockAdditionalData(this.tracks.get(this.blockTrackNumber), this.blockAdditionalId, extractorInput, i2);
                return;
            }
            if (i == ID_CONTENT_COMPRESSION_SETTINGS) {
                byte[] bArr = new byte[i2];
                this.currentTrack.sampleStrippedBytes = bArr;
                extractorInput.readFully(bArr, 0, i2);
                return;
            }
            if (i == ID_CONTENT_ENCRYPTION_KEY_ID) {
                byte[] bArr2 = new byte[i2];
                extractorInput.readFully(bArr2, 0, i2);
                this.currentTrack.cryptoData = new TrackOutput.CryptoData(1, bArr2, 0, 0);
                return;
            }
            if (i == ID_SEEK_ID) {
                Arrays.fill(this.seekEntryIdBytes.data, (byte) 0);
                extractorInput.readFully(this.seekEntryIdBytes.data, 4 - i2, i2);
                this.seekEntryIdBytes.setPosition(0);
                this.seekEntryId = (int) this.seekEntryIdBytes.readUnsignedInt();
                return;
            }
            if (i == ID_CODEC_PRIVATE) {
                byte[] bArr3 = new byte[i2];
                this.currentTrack.codecPrivate = bArr3;
                extractorInput.readFully(bArr3, 0, i2);
                return;
            } else {
                if (i != ID_PROJECTION_PRIVATE) {
                    throw new ParserException(C5630w2.m29215a("Unexpected id: ", i));
                }
                byte[] bArr4 = new byte[i2];
                this.currentTrack.projectionData = bArr4;
                extractorInput.readFully(bArr4, 0, i2);
                return;
            }
        }
        if (this.blockState == 0) {
            this.blockTrackNumber = (int) this.varintReader.readUnsignedVarint(extractorInput, false, true, 8);
            this.blockTrackNumberLength = this.varintReader.getLastLength();
            this.blockDurationUs = C3219C.TIME_UNSET;
            this.blockState = 1;
            this.scratch.reset();
        }
        Track track = this.tracks.get(this.blockTrackNumber);
        if (track == null) {
            extractorInput.skipFully(i2 - this.blockTrackNumberLength);
            this.blockState = 0;
            return;
        }
        if (this.blockState == 1) {
            readScratch(extractorInput, 3);
            int i10 = (this.scratch.data[2] & 6) >> 1;
            byte b2 = C1579YX.f3960d;
            if (i10 == 0) {
                this.blockSampleCount = 1;
                int[] iArrEnsureArrayCapacity = ensureArrayCapacity(this.blockSampleSizes, 1);
                this.blockSampleSizes = iArrEnsureArrayCapacity;
                iArrEnsureArrayCapacity[0] = (i2 - this.blockTrackNumberLength) - 3;
            } else {
                int i11 = 4;
                readScratch(extractorInput, 4);
                int i12 = (this.scratch.data[3] & C1579YX.f3960d) + 1;
                this.blockSampleCount = i12;
                int[] iArrEnsureArrayCapacity2 = ensureArrayCapacity(this.blockSampleSizes, i12);
                this.blockSampleSizes = iArrEnsureArrayCapacity2;
                if (i10 == 2) {
                    int i13 = (i2 - this.blockTrackNumberLength) - 4;
                    int i14 = this.blockSampleCount;
                    Arrays.fill(iArrEnsureArrayCapacity2, 0, i14, i13 / i14);
                } else {
                    if (i10 == 1) {
                        int i15 = 0;
                        int i16 = 0;
                        while (true) {
                            i3 = this.blockSampleCount;
                            if (i15 >= i3 - 1) {
                                break;
                            }
                            this.blockSampleSizes[i15] = 0;
                            while (true) {
                                i4 = i11 + 1;
                                readScratch(extractorInput, i4);
                                int i17 = this.scratch.data[i11] & C1579YX.f3960d;
                                int[] iArr = this.blockSampleSizes;
                                i5 = iArr[i15] + i17;
                                iArr[i15] = i5;
                                if (i17 != 255) {
                                    break;
                                } else {
                                    i11 = i4;
                                }
                            }
                            i16 += i5;
                            i15++;
                            i11 = i4;
                        }
                        this.blockSampleSizes[i3 - 1] = ((i2 - this.blockTrackNumberLength) - i11) - i16;
                    } else {
                        if (i10 != 3) {
                            throw new ParserException(C5630w2.m29215a("Unexpected lacing value: ", i10));
                        }
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            int i20 = this.blockSampleCount;
                            if (i18 >= i20 - 1) {
                                c = 1;
                                this.blockSampleSizes[i20 - 1] = ((i2 - this.blockTrackNumberLength) - i11) - i19;
                                break;
                            }
                            this.blockSampleSizes[i18] = i8;
                            int i21 = i11 + 1;
                            readScratch(extractorInput, i21);
                            if (this.scratch.data[i11] == 0) {
                                throw new ParserException("No valid varint length mask found");
                            }
                            int i22 = 0;
                            while (true) {
                                if (i22 >= 8) {
                                    j = 0;
                                    break;
                                }
                                int i23 = i9 << (7 - i22);
                                if ((this.scratch.data[i11] & i23) != 0) {
                                    i21 += i22;
                                    readScratch(extractorInput, i21);
                                    j = this.scratch.data[i11] & b2 & (i23 ^ (-1));
                                    int i24 = i11 + 1;
                                    while (i24 < i21) {
                                        j = (j << 8) | ((long) (this.scratch.data[i24] & b2));
                                        i24++;
                                        b2 = C1579YX.f3960d;
                                    }
                                    if (i18 <= 0) {
                                        break;
                                    }
                                    j -= (1 << ((i22 * 7) + 6)) - 1;
                                    break;
                                }
                                i22++;
                                i9 = 1;
                                b2 = C1579YX.f3960d;
                            }
                            i11 = i21;
                            if (j < -2147483648L || j > 2147483647L) {
                                throw new ParserException("EBML lacing sample size out of range.");
                            }
                            int i25 = (int) j;
                            int[] iArr2 = this.blockSampleSizes;
                            if (i18 != 0) {
                                i25 += iArr2[i18 - 1];
                            }
                            iArr2[i18] = i25;
                            i19 += i25;
                            i18++;
                            i8 = 0;
                            i9 = 1;
                            b2 = C1579YX.f3960d;
                        }
                    }
                    byte[] bArr5 = this.scratch.data;
                    this.blockTimeUs = this.clusterTimecodeUs + scaleTimecodeToUs((bArr5[c] & C1579YX.f3960d) | (bArr5[0] << 8));
                    b = this.scratch.data[2];
                    if ((b & 8) == 8) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (track.type != 2 || (i == ID_SIMPLE_BLOCK && (b & C4783m8.f15110b) == 128)) {
                        i6 = 1;
                    } else {
                        i6 = 0;
                    }
                    if (z) {
                        i7 = Integer.MIN_VALUE;
                    } else {
                        i7 = 0;
                    }
                    this.blockFlags = i6 | i7;
                    this.blockState = 2;
                    this.blockSampleIndex = 0;
                }
            }
            c = 1;
            byte[] bArr6 = this.scratch.data;
            this.blockTimeUs = this.clusterTimecodeUs + scaleTimecodeToUs((bArr6[c] & C1579YX.f3960d) | (bArr6[0] << 8));
            b = this.scratch.data[2];
            if ((b & 8) == 8) {
                z = true;
            } else {
                z = false;
            }
            if (track.type != 2) {
                i6 = 1;
            } else {
                i6 = 1;
            }
            if (z) {
                i7 = Integer.MIN_VALUE;
            } else {
                i7 = 0;
            }
            this.blockFlags = i6 | i7;
            this.blockState = 2;
            this.blockSampleIndex = 0;
        }
        if (i == ID_SIMPLE_BLOCK) {
            while (true) {
                int i26 = this.blockSampleIndex;
                if (i26 >= this.blockSampleCount) {
                    this.blockState = 0;
                    return;
                }
                commitSampleToOutput(track, ((long) ((this.blockSampleIndex * track.defaultSampleDurationNs) / 1000)) + this.blockTimeUs, this.blockFlags, writeSampleData(extractorInput, track, this.blockSampleSizes[i26]), 0);
                this.blockSampleIndex++;
            }
        } else {
            while (true) {
                int i27 = this.blockSampleIndex;
                if (i27 >= this.blockSampleCount) {
                    return;
                }
                int[] iArr3 = this.blockSampleSizes;
                iArr3[i27] = writeSampleData(extractorInput, track, iArr3[i27]);
                this.blockSampleIndex++;
            }
        }
    }

    @CallSuper
    public void endMasterElement(int i) throws ParserException {
        if (i == ID_BLOCK_GROUP) {
            if (this.blockState != 2) {
                return;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.blockSampleCount; i3++) {
                i2 += this.blockSampleSizes[i3];
            }
            Track track = this.tracks.get(this.blockTrackNumber);
            for (int i4 = 0; i4 < this.blockSampleCount; i4++) {
                long j = ((long) ((track.defaultSampleDurationNs * i4) / 1000)) + this.blockTimeUs;
                int i5 = this.blockFlags;
                if (i4 == 0 && !this.blockHasReferenceBlock) {
                    i5 |= 1;
                }
                int i6 = this.blockSampleSizes[i4];
                i2 -= i6;
                commitSampleToOutput(track, j, i5, i6, i2);
            }
            this.blockState = 0;
            return;
        }
        if (i == ID_TRACK_ENTRY) {
            if (isCodecSupported(this.currentTrack.codecId)) {
                Track track2 = this.currentTrack;
                track2.initializeOutput(this.extractorOutput, track2.number);
                SparseArray<Track> sparseArray = this.tracks;
                Track track3 = this.currentTrack;
                sparseArray.put(track3.number, track3);
            }
            this.currentTrack = null;
            return;
        }
        if (i == ID_SEEK) {
            int i7 = this.seekEntryId;
            if (i7 != -1) {
                long j2 = this.seekEntryPosition;
                if (j2 != -1) {
                    if (i7 == ID_CUES) {
                        this.cuesContentPosition = j2;
                        return;
                    }
                    return;
                }
            }
            throw new ParserException("Mandatory element SeekID or SeekPosition not found");
        }
        if (i == ID_CONTENT_ENCODING) {
            Track track4 = this.currentTrack;
            if (track4.hasContentEncryption) {
                if (track4.cryptoData == null) {
                    throw new ParserException("Encrypted Track found but ContentEncKeyID was not found");
                }
                track4.drmInitData = new DrmInitData(new DrmInitData.SchemeData(C3219C.UUID_NIL, MimeTypes.VIDEO_WEBM, this.currentTrack.cryptoData.encryptionKey));
                return;
            }
            return;
        }
        if (i == ID_CONTENT_ENCODINGS) {
            Track track5 = this.currentTrack;
            if (track5.hasContentEncryption && track5.sampleStrippedBytes != null) {
                throw new ParserException("Combining encryption and compression is not supported");
            }
            return;
        }
        if (i == 357149030) {
            if (this.timecodeScale == C3219C.TIME_UNSET) {
                this.timecodeScale = 1000000L;
            }
            long j3 = this.durationTimecode;
            if (j3 != C3219C.TIME_UNSET) {
                this.durationUs = scaleTimecodeToUs(j3);
                return;
            }
            return;
        }
        if (i == ID_TRACKS) {
            if (this.tracks.size() == 0) {
                throw new ParserException("No valid tracks were found");
            }
            this.extractorOutput.endTracks();
        } else if (i == ID_CUES && !this.sentSeekMap) {
            this.extractorOutput.seekMap(buildSeekMap());
            this.sentSeekMap = true;
        }
    }

    @CallSuper
    public void floatElement(int i, double d) throws ParserException {
        if (i == ID_SAMPLING_FREQUENCY) {
            this.currentTrack.sampleRate = (int) d;
        }
        if (i == ID_DURATION) {
            this.durationTimecode = (long) d;
            return;
        }
        switch (i) {
            case ID_PRIMARY_R_CHROMATICITY_X /* 21969 */:
                this.currentTrack.primaryRChromaticityX = (float) d;
                break;
            case ID_PRIMARY_R_CHROMATICITY_Y /* 21970 */:
                this.currentTrack.primaryRChromaticityY = (float) d;
                break;
            case ID_PRIMARY_G_CHROMATICITY_X /* 21971 */:
                this.currentTrack.primaryGChromaticityX = (float) d;
                break;
            case ID_PRIMARY_G_CHROMATICITY_Y /* 21972 */:
                this.currentTrack.primaryGChromaticityY = (float) d;
                break;
            case ID_PRIMARY_B_CHROMATICITY_X /* 21973 */:
                this.currentTrack.primaryBChromaticityX = (float) d;
                break;
            case ID_PRIMARY_B_CHROMATICITY_Y /* 21974 */:
                this.currentTrack.primaryBChromaticityY = (float) d;
                break;
            case ID_WHITE_POINT_CHROMATICITY_X /* 21975 */:
                this.currentTrack.whitePointChromaticityX = (float) d;
                break;
            case ID_WHITE_POINT_CHROMATICITY_Y /* 21976 */:
                this.currentTrack.whitePointChromaticityY = (float) d;
                break;
            case ID_LUMNINANCE_MAX /* 21977 */:
                this.currentTrack.maxMasteringLuminance = (float) d;
                break;
            case ID_LUMNINANCE_MIN /* 21978 */:
                this.currentTrack.minMasteringLuminance = (float) d;
                break;
            default:
                switch (i) {
                    case ID_PROJECTION_POSE_YAW /* 30323 */:
                        this.currentTrack.projectionPoseYaw = (float) d;
                        break;
                    case ID_PROJECTION_POSE_PITCH /* 30324 */:
                        this.currentTrack.projectionPosePitch = (float) d;
                        break;
                    case ID_PROJECTION_POSE_ROLL /* 30325 */:
                        this.currentTrack.projectionPoseRoll = (float) d;
                        break;
                }
                break;
        }
    }

    @CallSuper
    public int getElementType(int i) {
        switch (i) {
            case 131:
            case ID_FLAG_DEFAULT /* 136 */:
            case 155:
            case ID_CHANNELS /* 159 */:
            case ID_PIXEL_WIDTH /* 176 */:
            case 179:
            case ID_PIXEL_HEIGHT /* 186 */:
            case 215:
            case 231:
            case 238:
            case 241:
            case ID_REFERENCE_BLOCK /* 251 */:
            case ID_CONTENT_COMPRESSION_ALGORITHM /* 16980 */:
            case ID_DOC_TYPE_READ_VERSION /* 17029 */:
            case ID_EBML_READ_VERSION /* 17143 */:
            case ID_CONTENT_ENCRYPTION_ALGORITHM /* 18401 */:
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /* 18408 */:
            case ID_CONTENT_ENCODING_ORDER /* 20529 */:
            case ID_CONTENT_ENCODING_SCOPE /* 20530 */:
            case ID_SEEK_POSITION /* 21420 */:
            case ID_STEREO_MODE /* 21432 */:
            case ID_DISPLAY_WIDTH /* 21680 */:
            case ID_DISPLAY_UNIT /* 21682 */:
            case ID_DISPLAY_HEIGHT /* 21690 */:
            case ID_FLAG_FORCED /* 21930 */:
            case ID_COLOUR_RANGE /* 21945 */:
            case ID_COLOUR_TRANSFER /* 21946 */:
            case ID_COLOUR_PRIMARIES /* 21947 */:
            case ID_MAX_CLL /* 21948 */:
            case ID_MAX_FALL /* 21949 */:
            case ID_MAX_BLOCK_ADDITION_ID /* 21998 */:
            case ID_CODEC_DELAY /* 22186 */:
            case ID_SEEK_PRE_ROLL /* 22203 */:
            case ID_AUDIO_BIT_DEPTH /* 25188 */:
            case ID_PROJECTION_TYPE /* 30321 */:
            case ID_DEFAULT_DURATION /* 2352003 */:
            case ID_TIMECODE_SCALE /* 2807729 */:
                return 2;
            case 134:
            case 17026:
            case ID_NAME /* 21358 */:
            case ID_LANGUAGE /* 2274716 */:
                return 3;
            case ID_BLOCK_GROUP /* 160 */:
            case ID_BLOCK_MORE /* 166 */:
            case ID_TRACK_ENTRY /* 174 */:
            case 183:
            case ID_CUE_POINT /* 187 */:
            case 224:
            case 225:
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS /* 18407 */:
            case ID_SEEK /* 19899 */:
            case ID_CONTENT_COMPRESSION /* 20532 */:
            case ID_CONTENT_ENCRYPTION /* 20533 */:
            case ID_COLOUR /* 21936 */:
            case ID_MASTERING_METADATA /* 21968 */:
            case ID_CONTENT_ENCODING /* 25152 */:
            case ID_CONTENT_ENCODINGS /* 28032 */:
            case ID_BLOCK_ADDITIONS /* 30113 */:
            case ID_PROJECTION /* 30320 */:
            case ID_SEEK_HEAD /* 290298740 */:
            case 357149030:
            case ID_TRACKS /* 374648427 */:
            case ID_SEGMENT /* 408125543 */:
            case ID_EBML /* 440786851 */:
            case ID_CUES /* 475249515 */:
            case ID_CLUSTER /* 524531317 */:
                return 1;
            case ID_BLOCK /* 161 */:
            case ID_SIMPLE_BLOCK /* 163 */:
            case ID_BLOCK_ADDITIONAL /* 165 */:
            case ID_CONTENT_COMPRESSION_SETTINGS /* 16981 */:
            case ID_CONTENT_ENCRYPTION_KEY_ID /* 18402 */:
            case ID_SEEK_ID /* 21419 */:
            case ID_CODEC_PRIVATE /* 25506 */:
            case ID_PROJECTION_PRIVATE /* 30322 */:
                return 4;
            case ID_SAMPLING_FREQUENCY /* 181 */:
            case ID_DURATION /* 17545 */:
            case ID_PRIMARY_R_CHROMATICITY_X /* 21969 */:
            case ID_PRIMARY_R_CHROMATICITY_Y /* 21970 */:
            case ID_PRIMARY_G_CHROMATICITY_X /* 21971 */:
            case ID_PRIMARY_G_CHROMATICITY_Y /* 21972 */:
            case ID_PRIMARY_B_CHROMATICITY_X /* 21973 */:
            case ID_PRIMARY_B_CHROMATICITY_Y /* 21974 */:
            case ID_WHITE_POINT_CHROMATICITY_X /* 21975 */:
            case ID_WHITE_POINT_CHROMATICITY_Y /* 21976 */:
            case ID_LUMNINANCE_MAX /* 21977 */:
            case ID_LUMNINANCE_MIN /* 21978 */:
            case ID_PROJECTION_POSE_YAW /* 30323 */:
            case ID_PROJECTION_POSE_PITCH /* 30324 */:
            case ID_PROJECTION_POSE_ROLL /* 30325 */:
                return 5;
            default:
                return 0;
        }
    }

    public void handleBlockAdditionalData(Track track, int i, ExtractorInput extractorInput, int i2) throws InterruptedException, IOException {
        if (i != 4 || !CODEC_ID_VP9.equals(track.codecId)) {
            extractorInput.skipFully(i2);
        } else {
            this.blockAdditionalData.reset(i2);
            extractorInput.readFully(this.blockAdditionalData.data, 0, i2);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    @CallSuper
    public void integerElement(int i, long j) throws ParserException {
        if (i == ID_CONTENT_ENCODING_ORDER) {
            if (j != 0) {
                throw new ParserException(C5577vD.m28793a("ContentEncodingOrder ", j, " not supported"));
            }
            return;
        }
        if (i == ID_CONTENT_ENCODING_SCOPE) {
            if (j != 1) {
                throw new ParserException(C5577vD.m28793a("ContentEncodingScope ", j, " not supported"));
            }
            return;
        }
        switch (i) {
            case 131:
                this.currentTrack.type = (int) j;
                return;
            case ID_FLAG_DEFAULT /* 136 */:
                this.currentTrack.flagDefault = j == 1;
                return;
            case 155:
                this.blockDurationUs = scaleTimecodeToUs(j);
                return;
            case ID_CHANNELS /* 159 */:
                this.currentTrack.channelCount = (int) j;
                return;
            case ID_PIXEL_WIDTH /* 176 */:
                this.currentTrack.width = (int) j;
                return;
            case 179:
                this.cueTimesUs.add(scaleTimecodeToUs(j));
                return;
            case ID_PIXEL_HEIGHT /* 186 */:
                this.currentTrack.height = (int) j;
                return;
            case 215:
                this.currentTrack.number = (int) j;
                return;
            case 231:
                this.clusterTimecodeUs = scaleTimecodeToUs(j);
                return;
            case 238:
                this.blockAdditionalId = (int) j;
                return;
            case 241:
                if (this.seenClusterPositionForCurrentCuePoint) {
                    return;
                }
                this.cueClusterPositions.add(j);
                this.seenClusterPositionForCurrentCuePoint = true;
                return;
            case ID_REFERENCE_BLOCK /* 251 */:
                this.blockHasReferenceBlock = true;
                return;
            case ID_CONTENT_COMPRESSION_ALGORITHM /* 16980 */:
                if (j != 3) {
                    throw new ParserException(C5577vD.m28793a("ContentCompAlgo ", j, " not supported"));
                }
                return;
            case ID_DOC_TYPE_READ_VERSION /* 17029 */:
                if (j < 1 || j > 2) {
                    throw new ParserException(C5577vD.m28793a("DocTypeReadVersion ", j, " not supported"));
                }
                return;
            case ID_EBML_READ_VERSION /* 17143 */:
                if (j != 1) {
                    throw new ParserException(C5577vD.m28793a("EBMLReadVersion ", j, " not supported"));
                }
                return;
            case ID_CONTENT_ENCRYPTION_ALGORITHM /* 18401 */:
                if (j != 5) {
                    throw new ParserException(C5577vD.m28793a("ContentEncAlgo ", j, " not supported"));
                }
                return;
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /* 18408 */:
                if (j != 1) {
                    throw new ParserException(C5577vD.m28793a("AESSettingsCipherMode ", j, " not supported"));
                }
                return;
            case ID_SEEK_POSITION /* 21420 */:
                this.seekEntryPosition = j + this.segmentContentPosition;
                return;
            case ID_STEREO_MODE /* 21432 */:
                int i2 = (int) j;
                if (i2 == 0) {
                    this.currentTrack.stereoMode = 0;
                    return;
                }
                if (i2 == 1) {
                    this.currentTrack.stereoMode = 2;
                    return;
                } else if (i2 == 3) {
                    this.currentTrack.stereoMode = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.currentTrack.stereoMode = 3;
                    return;
                }
            case ID_DISPLAY_WIDTH /* 21680 */:
                this.currentTrack.displayWidth = (int) j;
                return;
            case ID_DISPLAY_UNIT /* 21682 */:
                this.currentTrack.displayUnit = (int) j;
                return;
            case ID_DISPLAY_HEIGHT /* 21690 */:
                this.currentTrack.displayHeight = (int) j;
                return;
            case ID_FLAG_FORCED /* 21930 */:
                this.currentTrack.flagForced = j == 1;
                return;
            case ID_MAX_BLOCK_ADDITION_ID /* 21998 */:
                this.currentTrack.maxBlockAdditionId = (int) j;
                return;
            case ID_CODEC_DELAY /* 22186 */:
                this.currentTrack.codecDelayNs = j;
                return;
            case ID_SEEK_PRE_ROLL /* 22203 */:
                this.currentTrack.seekPreRollNs = j;
                return;
            case ID_AUDIO_BIT_DEPTH /* 25188 */:
                this.currentTrack.audioBitDepth = (int) j;
                return;
            case ID_PROJECTION_TYPE /* 30321 */:
                int i3 = (int) j;
                if (i3 == 0) {
                    this.currentTrack.projectionType = 0;
                    return;
                }
                if (i3 == 1) {
                    this.currentTrack.projectionType = 1;
                    return;
                } else if (i3 == 2) {
                    this.currentTrack.projectionType = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.currentTrack.projectionType = 3;
                    return;
                }
            case ID_DEFAULT_DURATION /* 2352003 */:
                this.currentTrack.defaultSampleDurationNs = (int) j;
                return;
            case ID_TIMECODE_SCALE /* 2807729 */:
                this.timecodeScale = j;
                return;
            default:
                switch (i) {
                    case ID_COLOUR_RANGE /* 21945 */:
                        int i4 = (int) j;
                        if (i4 == 1) {
                            this.currentTrack.colorRange = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.currentTrack.colorRange = 1;
                            return;
                        }
                    case ID_COLOUR_TRANSFER /* 21946 */:
                        int i5 = (int) j;
                        if (i5 != 1) {
                            if (i5 == 16) {
                                this.currentTrack.colorTransfer = 6;
                                return;
                            } else if (i5 == 18) {
                                this.currentTrack.colorTransfer = 7;
                                return;
                            } else if (i5 != 6 && i5 != 7) {
                                return;
                            }
                        }
                        this.currentTrack.colorTransfer = 3;
                        return;
                    case ID_COLOUR_PRIMARIES /* 21947 */:
                        Track track = this.currentTrack;
                        track.hasColorInfo = true;
                        int i6 = (int) j;
                        if (i6 == 1) {
                            track.colorSpace = 1;
                            return;
                        }
                        if (i6 == 9) {
                            track.colorSpace = 6;
                            return;
                        } else {
                            if (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) {
                                track.colorSpace = 2;
                                return;
                            }
                            return;
                        }
                    case ID_MAX_CLL /* 21948 */:
                        this.currentTrack.maxContentLuminance = (int) j;
                        return;
                    case ID_MAX_FALL /* 21949 */:
                        this.currentTrack.maxFrameAverageLuminance = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    @CallSuper
    public boolean isLevel1Element(int i) {
        return i == 357149030 || i == ID_CLUSTER || i == ID_CUES || i == ID_TRACKS;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws InterruptedException, IOException {
        this.haveOutputSample = false;
        boolean z = true;
        while (z && !this.haveOutputSample) {
            z = this.reader.read(extractorInput);
            if (z && maybeSeekForCues(positionHolder, extractorInput.getPosition())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.tracks.size(); i++) {
            this.tracks.valueAt(i).outputPendingSampleMetadata();
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    @CallSuper
    public void seek(long j, long j2) {
        this.clusterTimecodeUs = C3219C.TIME_UNSET;
        this.blockState = 0;
        this.reader.reset();
        this.varintReader.reset();
        resetWriteSampleData();
        for (int i = 0; i < this.tracks.size(); i++) {
            this.tracks.valueAt(i).reset();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) throws InterruptedException, IOException {
        return new Sniffer().sniff(extractorInput);
    }

    @CallSuper
    public void startMasterElement(int i, long j, long j2) throws ParserException {
        if (i == ID_BLOCK_GROUP) {
            this.blockHasReferenceBlock = false;
            return;
        }
        if (i == ID_TRACK_ENTRY) {
            this.currentTrack = new Track();
            return;
        }
        if (i == ID_CUE_POINT) {
            this.seenClusterPositionForCurrentCuePoint = false;
            return;
        }
        if (i == ID_SEEK) {
            this.seekEntryId = -1;
            this.seekEntryPosition = -1L;
            return;
        }
        if (i == ID_CONTENT_ENCRYPTION) {
            this.currentTrack.hasContentEncryption = true;
            return;
        }
        if (i == ID_MASTERING_METADATA) {
            this.currentTrack.hasColorInfo = true;
            return;
        }
        if (i == ID_SEGMENT) {
            long j3 = this.segmentContentPosition;
            if (j3 != -1 && j3 != j) {
                throw new ParserException("Multiple Segment elements not supported");
            }
            this.segmentContentPosition = j;
            this.segmentContentSize = j2;
            return;
        }
        if (i == ID_CUES) {
            this.cueTimesUs = new LongArray();
            this.cueClusterPositions = new LongArray();
        } else if (i == ID_CLUSTER && !this.sentSeekMap) {
            if (this.seekForCuesEnabled && this.cuesContentPosition != -1) {
                this.seekForCues = true;
            } else {
                this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs));
                this.sentSeekMap = true;
            }
        }
    }

    @CallSuper
    public void stringElement(int i, String str) throws ParserException {
        if (i == 134) {
            this.currentTrack.codecId = str;
            return;
        }
        if (i == 17026) {
            if (!DOC_TYPE_WEBM.equals(str) && !DOC_TYPE_MATROSKA.equals(str)) {
                throw new ParserException(C0060Av.m278a("DocType ", str, " not supported"));
            }
        } else if (i == ID_NAME) {
            this.currentTrack.name = str;
        } else {
            if (i != ID_LANGUAGE) {
                return;
            }
            this.currentTrack.language = str;
        }
    }

    public MatroskaExtractor(int i) {
        this(new DefaultEbmlReader(), i);
    }

    public MatroskaExtractor(EbmlReader ebmlReader, int i) {
        this.segmentContentPosition = -1L;
        this.timecodeScale = C3219C.TIME_UNSET;
        this.durationTimecode = C3219C.TIME_UNSET;
        this.durationUs = C3219C.TIME_UNSET;
        this.cuesContentPosition = -1L;
        this.seekPositionAfterBuildingCues = -1L;
        this.clusterTimecodeUs = C3219C.TIME_UNSET;
        this.reader = ebmlReader;
        ebmlReader.init(new InnerEbmlProcessor());
        this.seekForCuesEnabled = (i & 1) == 0;
        this.varintReader = new VarintReader();
        this.tracks = new SparseArray<>();
        this.scratch = new ParsableByteArray(4);
        this.vorbisNumPageSamples = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
        this.seekEntryIdBytes = new ParsableByteArray(4);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
        this.sampleStrippedBytes = new ParsableByteArray();
        this.subtitleSample = new ParsableByteArray();
        this.encryptionInitializationVector = new ParsableByteArray(8);
        this.encryptionSubsampleData = new ParsableByteArray();
        this.blockAdditionalData = new ParsableByteArray();
    }
}
