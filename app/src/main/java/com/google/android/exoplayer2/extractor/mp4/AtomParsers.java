package com.google.android.exoplayer2.extractor.mp4;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.audio.Ac4Util;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.AvcConfig;
import com.google.android.exoplayer2.video.DolbyVisionConfig;
import com.google.android.exoplayer2.video.HevcConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.videolan.libvlc.MediaPlayer;
import p000.C0208D5;

/* JADX INFO: loaded from: classes2.dex */
final class AtomParsers {
    private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 4;
    private static final String TAG = "AtomParsers";
    private static final int TYPE_clcp = 1668047728;
    private static final int TYPE_mdta = 1835299937;
    private static final int TYPE_meta = 1835365473;
    private static final int TYPE_sbtl = 1935832172;
    private static final int TYPE_soun = 1936684398;
    private static final int TYPE_subt = 1937072756;
    private static final int TYPE_text = 1952807028;
    private static final int TYPE_vide = 1986618469;
    private static final byte[] opusMagic = Util.getUtf8Bytes("OpusHead");

    public static final class ChunkIterator {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z) {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            Assertions.checkState(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.index = -1;
        }

        public boolean moveNext() {
            int i = this.index + 1;
            this.index = i;
            if (i == this.length) {
                return false;
            }
            this.offset = this.chunkOffsetsAreLongs ? this.chunkOffsets.readUnsignedLongToLong() : this.chunkOffsets.readUnsignedInt();
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i2 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i2;
                this.nextSamplesPerChunkChangeIndex = i2 > 0 ? this.stsc.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    public interface SampleSizeBox {
        int getSampleCount();

        boolean isFixedSampleSize();

        int readNextSampleSize();
    }

    public static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i];
        }
    }

    public static final class StszSampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        public StszSampleSizeBox(Atom.LeafAtom leafAtom) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fixedSampleSize = parsableByteArray.readUnsignedIntToInt();
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public boolean isFixedSampleSize() {
            return this.fixedSampleSize != 0;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fixedSampleSize;
            return i == 0 ? this.data.readUnsignedIntToInt() : i;
        }
    }

    public static final class Stz2SampleSizeBox implements SampleSizeBox {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        public Stz2SampleSizeBox(Atom.LeafAtom leafAtom) {
            ParsableByteArray parsableByteArray = leafAtom.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fieldSize = parsableByteArray.readUnsignedIntToInt() & 255;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public boolean isFixedSampleSize() {
            return false;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AtomParsers.SampleSizeBox
        public int readNextSampleSize() {
            int i = this.fieldSize;
            if (i == 8) {
                return this.data.readUnsignedByte();
            }
            if (i == 16) {
                return this.data.readUnsignedShort();
            }
            int i2 = this.sampleIndex;
            this.sampleIndex = i2 + 1;
            if (i2 % 2 != 0) {
                return this.currentByte & 15;
            }
            int unsignedByte = this.data.readUnsignedByte();
            this.currentByte = unsignedByte;
            return (unsignedByte & 240) >> 4;
        }
    }

    public static final class TkhdData {
        private final long duration;

        /* JADX INFO: renamed from: id */
        private final int f11074id;
        private final int rotationDegrees;

        public TkhdData(int i, long j, int i2) {
            this.f11074id = i;
            this.duration = j;
            this.rotationDegrees = i2;
        }
    }

    private AtomParsers() {
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[Util.constrainValue(4, 0, length)] && jArr[Util.constrainValue(jArr.length - 4, 0, length)] < j3 && j3 <= j;
    }

    private static int findEsdsPosition(ParsableByteArray parsableByteArray, int i, int i2) {
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int i3 = parsableByteArray.readInt();
            Assertions.checkArgument(i3 > 0, "childAtomSize should be positive");
            if (parsableByteArray.readInt() == 1702061171) {
                return position;
            }
            position += i3;
        }
        return -1;
    }

    private static int getTrackTypeForHdlr(int i) {
        if (i == TYPE_soun) {
            return 1;
        }
        if (i == TYPE_vide) {
            return 2;
        }
        if (i == TYPE_text || i == TYPE_sbtl || i == TYPE_subt || i == TYPE_clcp) {
            return 3;
        }
        return i == 1835365473 ? 4 : -1;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0276  */
    /* JADX WARN: Code duplicated, block: B:122:0x0279  */
    /* JADX WARN: Code duplicated, block: B:124:0x0280  */
    /* JADX WARN: Code duplicated, block: B:126:0x0296  */
    /* JADX WARN: Code duplicated, block: B:142:0x02ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0139  */
    /* JADX WARN: Code duplicated, block: B:87:0x0142  */
    /* JADX WARN: Code duplicated, block: B:88:0x0144  */
    /* JADX WARN: Code duplicated, block: B:94:0x015a  */
    private static void parseAudioSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, String str, boolean z, DrmInitData drmInitData, StsdData stsdData, int i5) throws ParserException {
        int unsignedShort;
        int iRound;
        int unsignedIntToInt;
        String str2;
        int i6;
        String str3;
        int iIntValue;
        int iIntValue2;
        int i7;
        byte[] bArr;
        int i8;
        boolean z2;
        int i9;
        int i10;
        int i11;
        DrmInitData drmInitData2;
        int iFindEsdsPosition;
        String str4;
        Format ac4AnnexEFormat;
        int i12 = i2;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        parsableByteArray.setPosition(i12 + 16);
        if (z) {
            unsignedShort = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
        } else {
            parsableByteArray.skipBytes(8);
            unsignedShort = 0;
        }
        if (unsignedShort == 0 || unsignedShort == 1) {
            int unsignedShort2 = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
            int unsignedFixedPoint1616 = parsableByteArray.readUnsignedFixedPoint1616();
            if (unsignedShort == 1) {
                parsableByteArray.skipBytes(16);
            }
            iRound = unsignedFixedPoint1616;
            unsignedIntToInt = unsignedShort2;
        } else {
            if (unsignedShort != 2) {
                return;
            }
            parsableByteArray.skipBytes(16);
            iRound = (int) Math.round(parsableByteArray.readDouble());
            unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            parsableByteArray.skipBytes(20);
        }
        int position = parsableByteArray.getPosition();
        int iIntValue3 = i;
        if (iIntValue3 == 1701733217) {
            Pair<Integer, TrackEncryptionBox> sampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i12, i3);
            if (sampleEntryEncryptionData != null) {
                iIntValue3 = ((Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((TrackEncryptionBox) sampleEntryEncryptionData.second).schemeType);
                stsdData.trackEncryptionBoxes[i5] = (TrackEncryptionBox) sampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        DrmInitData drmInitData3 = drmInitDataCopyWithSchemeType;
        if (iIntValue3 == 1633889587) {
            str2 = MimeTypes.AUDIO_AC3;
        } else if (iIntValue3 == 1700998451) {
            str2 = MimeTypes.AUDIO_E_AC3;
        } else if (iIntValue3 == 1633889588) {
            str2 = MimeTypes.AUDIO_AC4;
        } else if (iIntValue3 == 1685353315) {
            str2 = MimeTypes.AUDIO_DTS;
        } else if (iIntValue3 == 1685353320 || iIntValue3 == 1685353324) {
            str2 = MimeTypes.AUDIO_DTS_HD;
        } else if (iIntValue3 == 1685353317) {
            str2 = MimeTypes.AUDIO_DTS_EXPRESS;
        } else if (iIntValue3 == 1935764850) {
            str2 = MimeTypes.AUDIO_AMR_NB;
        } else {
            if (iIntValue3 != 1935767394) {
                if (iIntValue3 == 1819304813 || iIntValue3 == 1936684916) {
                    str2 = MimeTypes.AUDIO_RAW;
                    i6 = 2;
                } else if (iIntValue3 == 1953984371) {
                    str2 = MimeTypes.AUDIO_RAW;
                    i6 = 268435456;
                } else if (iIntValue3 == 778924083) {
                    str2 = MimeTypes.AUDIO_MPEG;
                } else if (iIntValue3 == 1634492771) {
                    str2 = MimeTypes.AUDIO_ALAC;
                } else if (iIntValue3 == 1634492791) {
                    str2 = MimeTypes.AUDIO_ALAW;
                } else if (iIntValue3 == 1970037111) {
                    str2 = MimeTypes.AUDIO_MLAW;
                } else if (iIntValue3 == 1332770163) {
                    str2 = MimeTypes.AUDIO_OPUS;
                } else {
                    str2 = iIntValue3 == 1716281667 ? MimeTypes.AUDIO_FLAC : null;
                }
                str3 = str2;
                iIntValue = unsignedIntToInt;
                iIntValue2 = iRound;
                i7 = position;
                bArr = null;
                while (i7 - i12 < i3) {
                    parsableByteArray.setPosition(i7);
                    i8 = parsableByteArray.readInt();
                    if (i8 > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Assertions.checkArgument(z2, "childAtomSize should be positive");
                    i9 = parsableByteArray.readInt();
                    if (i9 != 1702061171 || (z && i9 == 2002876005)) {
                        i10 = i8;
                        i11 = i7;
                        drmInitData2 = drmInitData3;
                        if (i9 == 1702061171) {
                            iFindEsdsPosition = i11;
                        } else {
                            iFindEsdsPosition = findEsdsPosition(parsableByteArray, i11, i10);
                        }
                        if (iFindEsdsPosition != -1) {
                            Pair<String, byte[]> esdsFromParent = parseEsdsFromParent(parsableByteArray, iFindEsdsPosition);
                            str4 = (String) esdsFromParent.first;
                            bArr = (byte[]) esdsFromParent.second;
                            if (MimeTypes.AUDIO_AAC.equals(str4)) {
                                Pair<Integer, Integer> aacAudioSpecificConfig = CodecSpecificDataUtil.parseAacAudioSpecificConfig(bArr);
                                iIntValue2 = ((Integer) aacAudioSpecificConfig.first).intValue();
                                iIntValue = ((Integer) aacAudioSpecificConfig.second).intValue();
                            }
                            str3 = str4;
                        }
                    } else {
                        if (i9 == 1684103987) {
                            parsableByteArray.setPosition(i7 + 8);
                            ac4AnnexEFormat = Ac3Util.parseAc3AnnexFFormat(parsableByteArray, Integer.toString(i4), str, drmInitData3);
                        } else if (i9 == 1684366131) {
                            parsableByteArray.setPosition(i7 + 8);
                            ac4AnnexEFormat = Ac3Util.parseEAc3AnnexFFormat(parsableByteArray, Integer.toString(i4), str, drmInitData3);
                        } else if (i9 == 1684103988) {
                            parsableByteArray.setPosition(i7 + 8);
                            ac4AnnexEFormat = Ac4Util.parseAc4AnnexEFormat(parsableByteArray, Integer.toString(i4), str, drmInitData3);
                        } else if (i9 == 1684305011) {
                            drmInitData2 = drmInitData3;
                            stsdData.format = Format.createAudioSampleFormat(Integer.toString(i4), str3, null, -1, -1, iIntValue, iIntValue2, null, drmInitData2, 0, str);
                            i10 = i8;
                            i11 = i7;
                        } else {
                            int i13 = i7;
                            drmInitData2 = drmInitData3;
                            if (i9 == 1682927731) {
                                i10 = i8;
                                int i14 = i10 - 8;
                                byte[] bArr2 = opusMagic;
                                byte[] bArr3 = new byte[bArr2.length + i14];
                                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                                i11 = i13;
                                parsableByteArray.setPosition(i11 + 8);
                                parsableByteArray.readBytes(bArr3, bArr2.length, i14);
                                bArr = bArr3;
                            } else {
                                i10 = i8;
                                i11 = i13;
                                if (i9 == 1684425825) {
                                    byte[] bArr4 = new byte[i10 - 8];
                                    bArr4[0] = 102;
                                    bArr4[1] = 76;
                                    bArr4[2] = 97;
                                    bArr4[3] = 67;
                                    parsableByteArray.setPosition(i11 + 12);
                                    parsableByteArray.readBytes(bArr4, 4, i10 - 12);
                                    bArr = bArr4;
                                } else if (i9 == 1634492771) {
                                    int i15 = i10 - 12;
                                    byte[] bArr5 = new byte[i15];
                                    parsableByteArray.setPosition(i11 + 12);
                                    parsableByteArray.readBytes(bArr5, 0, i15);
                                    Pair<Integer, Integer> alacAudioSpecificConfig = CodecSpecificDataUtil.parseAlacAudioSpecificConfig(bArr5);
                                    iIntValue2 = ((Integer) alacAudioSpecificConfig.first).intValue();
                                    iIntValue = ((Integer) alacAudioSpecificConfig.second).intValue();
                                    bArr = bArr5;
                                }
                            }
                        }
                        stsdData.format = ac4AnnexEFormat;
                        i10 = i8;
                        i11 = i7;
                        drmInitData2 = drmInitData3;
                    }
                    i7 = i11 + i10;
                    i12 = i2;
                    drmInitData3 = drmInitData2;
                }
                DrmInitData drmInitData4 = drmInitData3;
                if (stsdData.format == null || str3 == null) {
                }
                stsdData.format = Format.createAudioSampleFormat(Integer.toString(i4), str3, null, -1, -1, iIntValue, iIntValue2, i6, bArr == null ? null : Collections.singletonList(bArr), drmInitData4, 0, str);
                return;
            }
            str2 = MimeTypes.AUDIO_AMR_WB;
        }
        i6 = -1;
        str3 = str2;
        iIntValue = unsignedIntToInt;
        iIntValue2 = iRound;
        i7 = position;
        bArr = null;
        while (i7 - i12 < i3) {
            parsableByteArray.setPosition(i7);
            i8 = parsableByteArray.readInt();
            if (i8 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            Assertions.checkArgument(z2, "childAtomSize should be positive");
            i9 = parsableByteArray.readInt();
            if (i9 != 1702061171) {
                i10 = i8;
                i11 = i7;
                drmInitData2 = drmInitData3;
                if (i9 == 1702061171) {
                    iFindEsdsPosition = i11;
                } else {
                    iFindEsdsPosition = findEsdsPosition(parsableByteArray, i11, i10);
                }
                if (iFindEsdsPosition != -1) {
                    Pair<String, byte[]> esdsFromParent2 = parseEsdsFromParent(parsableByteArray, iFindEsdsPosition);
                    str4 = (String) esdsFromParent2.first;
                    bArr = (byte[]) esdsFromParent2.second;
                    if (MimeTypes.AUDIO_AAC.equals(str4)) {
                        Pair<Integer, Integer> aacAudioSpecificConfig2 = CodecSpecificDataUtil.parseAacAudioSpecificConfig(bArr);
                        iIntValue2 = ((Integer) aacAudioSpecificConfig2.first).intValue();
                        iIntValue = ((Integer) aacAudioSpecificConfig2.second).intValue();
                    }
                    str3 = str4;
                }
            } else {
                i10 = i8;
                i11 = i7;
                drmInitData2 = drmInitData3;
                if (i9 == 1702061171) {
                    iFindEsdsPosition = i11;
                } else {
                    iFindEsdsPosition = findEsdsPosition(parsableByteArray, i11, i10);
                }
                if (iFindEsdsPosition != -1) {
                    Pair<String, byte[]> esdsFromParent3 = parseEsdsFromParent(parsableByteArray, iFindEsdsPosition);
                    str4 = (String) esdsFromParent3.first;
                    bArr = (byte[]) esdsFromParent3.second;
                    if (MimeTypes.AUDIO_AAC.equals(str4)) {
                        Pair<Integer, Integer> aacAudioSpecificConfig3 = CodecSpecificDataUtil.parseAacAudioSpecificConfig(bArr);
                        iIntValue2 = ((Integer) aacAudioSpecificConfig3.first).intValue();
                        iIntValue = ((Integer) aacAudioSpecificConfig3.second).intValue();
                    }
                    str3 = str4;
                }
            }
            i7 = i11 + i10;
            i12 = i2;
            drmInitData3 = drmInitData2;
        }
        DrmInitData drmInitData5 = drmInitData3;
        if (stsdData.format == null) {
        }
    }

    public static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i, int i2) {
        int i3 = i + 8;
        String string = null;
        Integer numValueOf = null;
        int i4 = -1;
        int i5 = 0;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int i6 = parsableByteArray.readInt();
            int i7 = parsableByteArray.readInt();
            if (i7 == 1718775137) {
                numValueOf = Integer.valueOf(parsableByteArray.readInt());
            } else if (i7 == 1935894637) {
                parsableByteArray.skipBytes(4);
                string = parsableByteArray.readString(4);
            } else if (i7 == 1935894633) {
                i4 = i3;
                i5 = i6;
            }
            i3 += i6;
        }
        if (!C3219C.CENC_TYPE_cenc.equals(string) && !C3219C.CENC_TYPE_cbc1.equals(string) && !C3219C.CENC_TYPE_cens.equals(string) && !C3219C.CENC_TYPE_cbcs.equals(string)) {
            return null;
        }
        Assertions.checkArgument(numValueOf != null, "frma atom is mandatory");
        Assertions.checkArgument(i4 != -1, "schi atom is mandatory");
        TrackEncryptionBox schiFromParent = parseSchiFromParent(parsableByteArray, i4, i5, string);
        Assertions.checkArgument(schiFromParent != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, schiFromParent);
    }

    private static Pair<long[], long[]> parseEdts(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType;
        if (containerAtom == null || (leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_elst)) == null) {
            return Pair.create(null, null);
        }
        ParsableByteArray parsableByteArray = leafAtomOfType.data;
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[unsignedIntToInt];
        long[] jArr2 = new long[unsignedIntToInt];
        for (int i = 0; i < unsignedIntToInt; i++) {
            jArr[i] = fullAtomVersion == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            jArr2[i] = fullAtomVersion == 1 ? parsableByteArray.readLong() : parsableByteArray.readInt();
            if (parsableByteArray.readShort() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            parsableByteArray.skipBytes(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair<String, byte[]> parseEsdsFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 12);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if ((unsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((unsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedShort());
        }
        if ((unsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if (MimeTypes.AUDIO_MPEG.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS_HD.equals(mimeTypeFromMp4ObjectType)) {
            return Pair.create(mimeTypeFromMp4ObjectType, null);
        }
        parsableByteArray.skipBytes(12);
        parsableByteArray.skipBytes(1);
        int expandableClassSize = parseExpandableClassSize(parsableByteArray);
        byte[] bArr = new byte[expandableClassSize];
        parsableByteArray.readBytes(bArr, 0, expandableClassSize);
        return Pair.create(mimeTypeFromMp4ObjectType, bArr);
    }

    private static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i = unsignedByte & 127;
        while ((unsignedByte & 128) == 128) {
            unsignedByte = parsableByteArray.readUnsignedByte();
            i = (i << 7) | (unsignedByte & 127);
        }
        return i;
    }

    private static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        return parsableByteArray.readInt();
    }

    @Nullable
    private static Metadata parseIlst(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i) {
            Metadata.Entry ilstElement = MetadataUtil.parseIlstElement(parsableByteArray);
            if (ilstElement != null) {
                arrayList.add(ilstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static Pair<Long, String> parseMdhd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 8 : 16);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 4 : 8);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        return Pair.create(Long.valueOf(unsignedInt), "" + ((char) (((unsignedShort >> 10) & 31) + 96)) + ((char) (((unsignedShort >> 5) & 31) + 96)) + ((char) ((unsignedShort & 31) + 96)));
    }

    @Nullable
    public static Metadata parseMdtaFromMeta(Atom.ContainerAtom containerAtom) {
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_hdlr);
        Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(Atom.TYPE_keys);
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(Atom.TYPE_ilst);
        if (leafAtomOfType == null || leafAtomOfType2 == null || leafAtomOfType3 == null || parseHdlr(leafAtomOfType.data) != TYPE_mdta) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType2.data;
        parsableByteArray.setPosition(12);
        int i = parsableByteArray.readInt();
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            strArr[i2] = parsableByteArray.readString(i3 - 8);
        }
        ParsableByteArray parsableByteArray2 = leafAtomOfType3.data;
        parsableByteArray2.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray2.bytesLeft() > 8) {
            int position = parsableByteArray2.getPosition();
            int i4 = parsableByteArray2.readInt();
            int i5 = parsableByteArray2.readInt() - 1;
            if (i5 < 0 || i5 >= i) {
                C0208D5.m1307a("Skipped metadata with unknown key index: ", i5, TAG);
            } else {
                MdtaMetadataEntry mdtaMetadataEntryFromIlst = MetadataUtil.parseMdtaMetadataEntryFromIlst(parsableByteArray2, position + i4, strArr[i5]);
                if (mdtaMetadataEntryFromIlst != null) {
                    arrayList.add(mdtaMetadataEntryFromIlst);
                }
            }
            parsableByteArray2.setPosition(position + i4);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static long parseMvhd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        parsableByteArray.skipBytes(Atom.parseFullAtomVersion(parsableByteArray.readInt()) != 0 ? 16 : 8);
        return parsableByteArray.readUnsignedInt();
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.setPosition(i + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            parsableByteArray.setPosition(i3);
            int i4 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1886547818) {
                return Arrays.copyOfRange(parsableByteArray.data, i3, i4 + i3);
            }
            i3 += i4;
        }
        return null;
    }

    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i, int i2) {
        Pair<Integer, TrackEncryptionBox> commonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i < i2) {
            parsableByteArray.setPosition(position);
            int i3 = parsableByteArray.readInt();
            Assertions.checkArgument(i3 > 0, "childAtomSize should be positive");
            if (parsableByteArray.readInt() == 1936289382 && (commonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, i3)) != null) {
                return commonEncryptionSinfFromParent;
            }
            position += i3;
        }
        return null;
    }

    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            parsableByteArray.setPosition(i5);
            int i6 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1952804451) {
                int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (fullAtomVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    i3 = unsignedByte & 15;
                    i4 = (unsignedByte & 240) >> 4;
                }
                boolean z = parsableByteArray.readUnsignedByte() == 1;
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z && unsignedByte2 == 0) {
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[unsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, unsignedByte3);
                }
                return new TrackEncryptionBox(z, str, unsignedByte2, bArr2, i4, i3, bArr);
            }
            i5 += i6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0333  */
    public static TrackSampleTable parseStbl(Track track, Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder) throws ParserException {
        SampleSizeBox stz2SampleSizeBox;
        boolean z;
        int unsignedIntToInt;
        int unsignedIntToInt2;
        Track track2;
        long j;
        int i;
        int[] iArr;
        long[] jArr;
        int i2;
        int[] iArr2;
        long[] jArr2;
        int i3;
        int[] iArr3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        int i8;
        int i9;
        int i10;
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_stsz);
        if (leafAtomOfType != null) {
            stz2SampleSizeBox = new StszSampleSizeBox(leafAtomOfType);
        } else {
            Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(Atom.TYPE_stz2);
            if (leafAtomOfType2 == null) {
                throw new ParserException("Track has no sample table size information");
            }
            stz2SampleSizeBox = new Stz2SampleSizeBox(leafAtomOfType2);
        }
        int sampleCount = stz2SampleSizeBox.getSampleCount();
        if (sampleCount == 0) {
            return new TrackSampleTable(track, new long[0], new int[0], 0, new long[0], new int[0], C3219C.TIME_UNSET);
        }
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(Atom.TYPE_stco);
        if (leafAtomOfType3 == null) {
            leafAtomOfType3 = containerAtom.getLeafAtomOfType(Atom.TYPE_co64);
            z = true;
        } else {
            z = false;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType3.data;
        ParsableByteArray parsableByteArray2 = containerAtom.getLeafAtomOfType(Atom.TYPE_stsc).data;
        ParsableByteArray parsableByteArray3 = containerAtom.getLeafAtomOfType(Atom.TYPE_stts).data;
        Atom.LeafAtom leafAtomOfType4 = containerAtom.getLeafAtomOfType(Atom.TYPE_stss);
        ParsableByteArray parsableByteArray4 = null;
        ParsableByteArray parsableByteArray5 = leafAtomOfType4 != null ? leafAtomOfType4.data : null;
        Atom.LeafAtom leafAtomOfType5 = containerAtom.getLeafAtomOfType(Atom.TYPE_ctts);
        ParsableByteArray parsableByteArray6 = leafAtomOfType5 != null ? leafAtomOfType5.data : null;
        ChunkIterator chunkIterator = new ChunkIterator(parsableByteArray2, parsableByteArray, z);
        parsableByteArray3.setPosition(12);
        int unsignedIntToInt3 = parsableByteArray3.readUnsignedIntToInt() - 1;
        int unsignedIntToInt4 = parsableByteArray3.readUnsignedIntToInt();
        int unsignedIntToInt5 = parsableByteArray3.readUnsignedIntToInt();
        if (parsableByteArray6 != null) {
            parsableByteArray6.setPosition(12);
            unsignedIntToInt = parsableByteArray6.readUnsignedIntToInt();
        } else {
            unsignedIntToInt = 0;
        }
        int unsignedIntToInt6 = -1;
        if (parsableByteArray5 != null) {
            parsableByteArray5.setPosition(12);
            unsignedIntToInt2 = parsableByteArray5.readUnsignedIntToInt();
            if (unsignedIntToInt2 > 0) {
                unsignedIntToInt6 = parsableByteArray5.readUnsignedIntToInt() - 1;
                parsableByteArray4 = parsableByteArray5;
            }
        } else {
            parsableByteArray4 = parsableByteArray5;
            unsignedIntToInt2 = 0;
        }
        if (stz2SampleSizeBox.isFixedSampleSize() && MimeTypes.AUDIO_RAW.equals(track.format.sampleMimeType) && unsignedIntToInt3 == 0 && unsignedIntToInt == 0 && unsignedIntToInt2 == 0) {
            track2 = track;
            int i11 = chunkIterator.length;
            long[] jArr3 = new long[i11];
            int[] iArr4 = new int[i11];
            while (chunkIterator.moveNext()) {
                int i12 = chunkIterator.index;
                jArr3[i12] = chunkIterator.offset;
                iArr4[i12] = chunkIterator.numSamples;
            }
            Format format = track2.format;
            FixedSampleSizeRechunker.Results resultsRechunk = FixedSampleSizeRechunker.rechunk(Util.getPcmFrameSize(format.pcmEncoding, format.channelCount), jArr3, iArr4, unsignedIntToInt5);
            long[] jArr4 = resultsRechunk.offsets;
            int[] iArr5 = resultsRechunk.sizes;
            int i13 = resultsRechunk.maximumSize;
            long[] jArr5 = resultsRechunk.timestamps;
            int[] iArr6 = resultsRechunk.flags;
            j = resultsRechunk.duration;
            i = sampleCount;
            iArr = iArr6;
            jArr = jArr5;
            i2 = i13;
            iArr2 = iArr5;
            jArr2 = jArr4;
        } else {
            long[] jArrCopyOf = new long[sampleCount];
            int[] iArrCopyOf = new int[sampleCount];
            long[] jArrCopyOf2 = new long[sampleCount];
            int[] iArrCopyOf2 = new int[sampleCount];
            int unsignedIntToInt7 = unsignedIntToInt6;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int unsignedIntToInt8 = 0;
            long j2 = 0;
            long j3 = 0;
            int i18 = unsignedIntToInt;
            int i19 = unsignedIntToInt5;
            int i20 = unsignedIntToInt4;
            while (true) {
                if (i14 >= sampleCount) {
                    i6 = i20;
                    i7 = i17;
                    break;
                }
                long j4 = j3;
                int i21 = i17;
                boolean zMoveNext = true;
                while (i21 == 0) {
                    zMoveNext = chunkIterator.moveNext();
                    if (!zMoveNext) {
                        break;
                    }
                    int i22 = i20;
                    long j5 = chunkIterator.offset;
                    i21 = chunkIterator.numSamples;
                    j4 = j5;
                    i20 = i22;
                    i19 = i19;
                    sampleCount = sampleCount;
                }
                int i23 = sampleCount;
                i6 = i20;
                int i24 = i19;
                if (!zMoveNext) {
                    Log.m17586w(TAG, "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i14);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i14);
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i14);
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i14);
                    sampleCount = i14;
                    i7 = i21;
                    break;
                }
                if (parsableByteArray6 != null) {
                    while (unsignedIntToInt8 == 0 && i18 > 0) {
                        unsignedIntToInt8 = parsableByteArray6.readUnsignedIntToInt();
                        i16 = parsableByteArray6.readInt();
                        i18--;
                    }
                    unsignedIntToInt8--;
                }
                int i25 = i16;
                jArrCopyOf[i14] = j4;
                int nextSampleSize = stz2SampleSizeBox.readNextSampleSize();
                iArrCopyOf[i14] = nextSampleSize;
                if (nextSampleSize > i15) {
                    i15 = nextSampleSize;
                }
                jArrCopyOf2[i14] = j2 + ((long) i25);
                iArrCopyOf2[i14] = parsableByteArray4 == null ? 1 : 0;
                if (i14 == unsignedIntToInt7) {
                    iArrCopyOf2[i14] = 1;
                    unsignedIntToInt2--;
                    if (unsignedIntToInt2 > 0) {
                        unsignedIntToInt7 = parsableByteArray4.readUnsignedIntToInt() - 1;
                    }
                }
                int i26 = unsignedIntToInt7;
                j2 += (long) i24;
                int unsignedIntToInt9 = i6 - 1;
                if (unsignedIntToInt9 != 0 || unsignedIntToInt3 <= 0) {
                    i9 = i24;
                    i10 = unsignedIntToInt3;
                } else {
                    unsignedIntToInt9 = parsableByteArray3.readUnsignedIntToInt();
                    i9 = parsableByteArray3.readInt();
                    i10 = unsignedIntToInt3 - 1;
                }
                int i27 = unsignedIntToInt9;
                long j6 = j4 + ((long) iArrCopyOf[i14]);
                i17 = i21 - 1;
                i14++;
                j3 = j6;
                unsignedIntToInt7 = i26;
                i19 = i9;
                sampleCount = i23;
                i16 = i25;
                int i28 = i10;
                i20 = i27;
                unsignedIntToInt3 = i28;
            }
            long j7 = j2 + ((long) i16);
            while (true) {
                if (i18 <= 0) {
                    z3 = true;
                    break;
                }
                if (parsableByteArray6.readUnsignedIntToInt() != 0) {
                    z3 = false;
                    break;
                }
                parsableByteArray6.readInt();
                i18--;
            }
            if (unsignedIntToInt2 == 0 && i6 == 0 && i7 == 0 && unsignedIntToInt3 == 0) {
                i8 = unsignedIntToInt8;
                if (i8 == 0 && z3) {
                    track2 = track;
                }
                i = sampleCount;
                jArr2 = jArrCopyOf;
                jArr = jArrCopyOf2;
                iArr = iArrCopyOf2;
                i2 = i15;
                iArr2 = iArrCopyOf;
                j = j7;
            } else {
                i8 = unsignedIntToInt8;
            }
            StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
            track2 = track;
            sb.append(track2.f11075id);
            sb.append(": remainingSynchronizationSamples ");
            sb.append(unsignedIntToInt2);
            sb.append(", remainingSamplesAtTimestampDelta ");
            sb.append(i6);
            sb.append(", remainingSamplesInChunk ");
            sb.append(i7);
            sb.append(", remainingTimestampDeltaChanges ");
            sb.append(unsignedIntToInt3);
            sb.append(", remainingSamplesAtTimestampOffset ");
            sb.append(i8);
            sb.append(!z3 ? ", ctts invalid" : "");
            Log.m17586w(TAG, sb.toString());
            i = sampleCount;
            jArr2 = jArrCopyOf;
            jArr = jArrCopyOf2;
            iArr = iArrCopyOf2;
            i2 = i15;
            iArr2 = iArrCopyOf;
            j = j7;
        }
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(j, 1000000L, track2.timescale);
        long[] jArr6 = track2.editListDurations;
        if (jArr6 == null) {
            Util.scaleLargeTimestampsInPlace(jArr, 1000000L, track2.timescale);
            return new TrackSampleTable(track, jArr2, iArr2, i2, jArr, iArr, jScaleLargeTimestamp);
        }
        if (jArr6.length == 1 && track2.type == 1 && jArr.length >= 2) {
            long j8 = track2.editListMediaTimes[0];
            long jScaleLargeTimestamp2 = Util.scaleLargeTimestamp(jArr6[0], track2.timescale, track2.movieTimescale) + j8;
            if (canApplyEditWithGaplessInfo(jArr, j, j8, jScaleLargeTimestamp2)) {
                long j9 = j - jScaleLargeTimestamp2;
                long jScaleLargeTimestamp3 = Util.scaleLargeTimestamp(j8 - jArr[0], track2.format.sampleRate, track2.timescale);
                i3 = i;
                long jScaleLargeTimestamp4 = Util.scaleLargeTimestamp(j9, track2.format.sampleRate, track2.timescale);
                if ((jScaleLargeTimestamp3 != 0 || jScaleLargeTimestamp4 != 0) && jScaleLargeTimestamp3 <= 2147483647L && jScaleLargeTimestamp4 <= 2147483647L) {
                    gaplessInfoHolder.encoderDelay = (int) jScaleLargeTimestamp3;
                    gaplessInfoHolder.encoderPadding = (int) jScaleLargeTimestamp4;
                    Util.scaleLargeTimestampsInPlace(jArr, 1000000L, track2.timescale);
                    return new TrackSampleTable(track, jArr2, iArr2, i2, jArr, iArr, Util.scaleLargeTimestamp(track2.editListDurations[0], 1000000L, track2.movieTimescale));
                }
            } else {
                i3 = i;
            }
        } else {
            i3 = i;
        }
        long[] jArr7 = track2.editListDurations;
        if (jArr7.length == 1 && jArr7[0] == 0) {
            long j10 = track2.editListMediaTimes[0];
            for (int i29 = 0; i29 < jArr.length; i29++) {
                jArr[i29] = Util.scaleLargeTimestamp(jArr[i29] - j10, 1000000L, track2.timescale);
            }
            return new TrackSampleTable(track, jArr2, iArr2, i2, jArr, iArr, Util.scaleLargeTimestamp(j - j10, 1000000L, track2.timescale));
        }
        boolean z4 = track2.type == 1;
        int[] iArr7 = new int[jArr7.length];
        int[] iArr8 = new int[jArr7.length];
        boolean z5 = false;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        while (true) {
            long[] jArr8 = track2.editListDurations;
            if (i31 >= jArr8.length) {
                break;
            }
            int[] iArr9 = iArr2;
            int i33 = i2;
            long j11 = track2.editListMediaTimes[i31];
            if (j11 != -1) {
                boolean z6 = z5;
                int i34 = i30;
                long jScaleLargeTimestamp5 = Util.scaleLargeTimestamp(jArr8[i31], track2.timescale, track2.movieTimescale);
                iArr7[i31] = Util.binarySearchFloor(jArr, j11, true, true);
                iArr8[i31] = Util.binarySearchCeil(jArr, j11 + jScaleLargeTimestamp5, z4, false);
                while (true) {
                    i4 = iArr7[i31];
                    i5 = iArr8[i31];
                    if (i4 >= i5 || (iArr[i4] & 1) != 0) {
                        break;
                    }
                    iArr7[i31] = i4 + 1;
                }
                i30 = (i5 - i4) + i34;
                z2 = z6 | (i32 != i4);
                i32 = i5;
            } else {
                z2 = z5;
            }
            i31++;
            z5 = z2;
            i3 = i3;
            i2 = i33;
            iArr2 = iArr9;
        }
        int[] iArr10 = iArr2;
        int i35 = i2;
        boolean z7 = z5;
        int i36 = 0;
        boolean z8 = z7 | (i30 != i3);
        long[] jArr9 = z8 ? new long[i30] : jArr2;
        int[] iArr11 = z8 ? new int[i30] : iArr10;
        if (z8) {
            i35 = 0;
        }
        int[] iArr12 = z8 ? new int[i30] : iArr;
        long[] jArr10 = new long[i30];
        int i37 = 0;
        long j12 = 0;
        while (i36 < track2.editListDurations.length) {
            long j13 = track2.editListMediaTimes[i36];
            int i38 = iArr7[i36];
            int[] iArr13 = iArr7;
            int i39 = iArr8[i36];
            int[] iArr14 = iArr8;
            if (z8) {
                int i40 = i39 - i38;
                System.arraycopy(jArr2, i38, jArr9, i37, i40);
                iArr3 = iArr10;
                System.arraycopy(iArr3, i38, iArr11, i37, i40);
                System.arraycopy(iArr, i38, iArr12, i37, i40);
            } else {
                iArr3 = iArr10;
            }
            int i41 = i35;
            while (i38 < i39) {
                int[] iArr15 = iArr;
                int i42 = i39;
                long j14 = j12;
                int[] iArr16 = iArr3;
                long[] jArr11 = jArr9;
                jArr10[i37] = Util.scaleLargeTimestamp(j12, 1000000L, track2.movieTimescale) + Util.scaleLargeTimestamp(Math.max(0L, jArr[i38] - j13), 1000000L, track2.timescale);
                if (z8 && iArr11[i37] > i41) {
                    i41 = iArr16[i38];
                }
                i37++;
                i38++;
                iArr = iArr15;
                i39 = i42;
                iArr3 = iArr16;
                j12 = j14;
                jArr9 = jArr11;
            }
            j12 += track2.editListDurations[i36];
            i36++;
            iArr = iArr;
            i35 = i41;
            iArr10 = iArr3;
            iArr7 = iArr13;
            iArr8 = iArr14;
            jArr2 = jArr2;
            jArr9 = jArr9;
        }
        return new TrackSampleTable(track, jArr9, iArr11, i35, jArr10, iArr12, Util.scaleLargeTimestamp(j12, 1000000L, track2.movieTimescale));
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, int i, int i2, String str, DrmInitData drmInitData, boolean z) throws ParserException {
        parsableByteArray.setPosition(12);
        int i3 = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            int position = parsableByteArray.getPosition();
            int i5 = parsableByteArray.readInt();
            Assertions.checkArgument(i5 > 0, "childAtomSize should be positive");
            int i6 = parsableByteArray.readInt();
            if (i6 == 1635148593 || i6 == 1635148595 || i6 == 1701733238 || i6 == 1836070006 || i6 == 1752589105 || i6 == 1751479857 || i6 == 1932670515 || i6 == 1987063864 || i6 == 1987063865 || i6 == 1635135537 || i6 == 1685479798 || i6 == 1685479729 || i6 == 1685481573 || i6 == 1685481521) {
                parseVideoSampleEntry(parsableByteArray, i6, position, i5, i, i2, drmInitData, stsdData, i4);
            } else if (i6 == 1836069985 || i6 == 1701733217 || i6 == 1633889587 || i6 == 1700998451 || i6 == 1633889588 || i6 == 1685353315 || i6 == 1685353317 || i6 == 1685353320 || i6 == 1685353324 || i6 == 1935764850 || i6 == 1935767394 || i6 == 1819304813 || i6 == 1936684916 || i6 == 1953984371 || i6 == 778924083 || i6 == 1634492771 || i6 == 1634492791 || i6 == 1970037111 || i6 == 1332770163 || i6 == 1716281667) {
                parseAudioSampleEntry(parsableByteArray, i6, position, i5, i, str, z, drmInitData, stsdData, i4);
            } else if (i6 == 1414810956 || i6 == 1954034535 || i6 == 2004251764 || i6 == 1937010800 || i6 == 1664495672) {
                parseTextSampleEntry(parsableByteArray, i6, position, i5, i, str, stsdData);
            } else if (i6 == 1667329389) {
                stsdData.format = Format.createSampleFormat(Integer.toString(i), MimeTypes.APPLICATION_CAMERA_MOTION, null, -1, null);
            }
            parsableByteArray.setPosition(position + i5);
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, String str, StsdData stsdData) throws ParserException {
        parsableByteArray.setPosition(i2 + 16);
        String str2 = MimeTypes.APPLICATION_TTML;
        List listSingletonList = null;
        long j = Long.MAX_VALUE;
        if (i != 1414810956) {
            if (i == 1954034535) {
                int i5 = i3 - 16;
                byte[] bArr = new byte[i5];
                parsableByteArray.readBytes(bArr, 0, i5);
                listSingletonList = Collections.singletonList(bArr);
                str2 = MimeTypes.APPLICATION_TX3G;
            } else if (i == 2004251764) {
                str2 = MimeTypes.APPLICATION_MP4VTT;
            } else if (i == 1937010800) {
                j = 0;
            } else {
                if (i != 1664495672) {
                    throw new IllegalStateException();
                }
                stsdData.requiredSampleTransformation = 1;
                str2 = MimeTypes.APPLICATION_MP4CEA608;
            }
        }
        stsdData.format = Format.createTextSampleFormat(Integer.toString(i4), str2, null, -1, 0, str, -1, null, j, listSingletonList);
    }

    private static TkhdData parseTkhd(ParsableByteArray parsableByteArray) {
        long j;
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 8 : 16);
        int i = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        int i2 = fullAtomVersion == 0 ? 4 : 8;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            j = C3219C.TIME_UNSET;
            if (i4 >= i2) {
                parsableByteArray.skipBytes(i2);
                break;
            }
            if (parsableByteArray.data[position + i4] != -1) {
                long unsignedInt = fullAtomVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                if (unsignedInt == 0) {
                    break;
                }
                j = unsignedInt;
                break;
            }
            i4++;
        }
        parsableByteArray.skipBytes(16);
        int i5 = parsableByteArray.readInt();
        int i6 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int i7 = parsableByteArray.readInt();
        int i8 = parsableByteArray.readInt();
        if (i5 == 0 && i6 == 65536 && i7 == -65536 && i8 == 0) {
            i3 = 90;
        } else if (i5 == 0 && i6 == -65536 && i7 == 65536 && i8 == 0) {
            i3 = MediaPlayer.Event.f17411q;
        } else if (i5 == -65536 && i6 == 0 && i7 == 0 && i8 == -65536) {
            i3 = 180;
        }
        return new TkhdData(i, j, i3);
    }

    public static Track parseTrak(Atom.ContainerAtom containerAtom, Atom.LeafAtom leafAtom, long j, DrmInitData drmInitData, boolean z, boolean z2) throws ParserException {
        long[] jArr;
        long[] jArr2;
        Atom.ContainerAtom containerAtomOfType = containerAtom.getContainerAtomOfType(Atom.TYPE_mdia);
        int trackTypeForHdlr = getTrackTypeForHdlr(parseHdlr(containerAtomOfType.getLeafAtomOfType(Atom.TYPE_hdlr).data));
        if (trackTypeForHdlr == -1) {
            return null;
        }
        TkhdData tkhd = parseTkhd(containerAtom.getLeafAtomOfType(Atom.TYPE_tkhd).data);
        long jScaleLargeTimestamp = C3219C.TIME_UNSET;
        long j2 = j == C3219C.TIME_UNSET ? tkhd.duration : j;
        long mvhd = parseMvhd(leafAtom.data);
        if (j2 != C3219C.TIME_UNSET) {
            jScaleLargeTimestamp = Util.scaleLargeTimestamp(j2, 1000000L, mvhd);
        }
        long j3 = jScaleLargeTimestamp;
        Atom.ContainerAtom containerAtomOfType2 = containerAtomOfType.getContainerAtomOfType(Atom.TYPE_minf).getContainerAtomOfType(Atom.TYPE_stbl);
        Pair<Long, String> mdhd = parseMdhd(containerAtomOfType.getLeafAtomOfType(Atom.TYPE_mdhd).data);
        StsdData stsd = parseStsd(containerAtomOfType2.getLeafAtomOfType(Atom.TYPE_stsd).data, tkhd.f11074id, tkhd.rotationDegrees, (String) mdhd.second, drmInitData, z2);
        if (z) {
            jArr = null;
            jArr2 = null;
        } else {
            Pair<long[], long[]> edts = parseEdts(containerAtom.getContainerAtomOfType(Atom.TYPE_edts));
            long[] jArr3 = (long[]) edts.first;
            jArr2 = (long[]) edts.second;
            jArr = jArr3;
        }
        if (stsd.format == null) {
            return null;
        }
        return new Track(tkhd.f11074id, trackTypeForHdlr, ((Long) mdhd.first).longValue(), mvhd, j3, stsd.format, stsd.requiredSampleTransformation, stsd.trackEncryptionBoxes, stsd.nalUnitLengthFieldLength, jArr, jArr2);
    }

    @Nullable
    public static Metadata parseUdta(Atom.LeafAtom leafAtom, boolean z) {
        if (z) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtom.data;
        parsableByteArray.setPosition(8);
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int i = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1835365473) {
                parsableByteArray.setPosition(position);
                return parseUdtaMeta(parsableByteArray, position + i);
            }
            parsableByteArray.setPosition(position + i);
        }
        return null;
    }

    @Nullable
    private static Metadata parseUdtaMeta(ParsableByteArray parsableByteArray, int i) {
        parsableByteArray.skipBytes(12);
        while (parsableByteArray.getPosition() < i) {
            int position = parsableByteArray.getPosition();
            int i2 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1768715124) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + i2);
            }
            parsableByteArray.setPosition(position + i2);
        }
        return null;
    }

    private static void parseVideoSampleEntry(ParsableByteArray parsableByteArray, int i, int i2, int i3, int i4, int i5, DrmInitData drmInitData, StsdData stsdData, int i6) throws ParserException {
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        parsableByteArray.setPosition(i2 + 16);
        parsableByteArray.skipBytes(16);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        String str = null;
        int iIntValue = i;
        if (iIntValue == 1701733238) {
            Pair<Integer, TrackEncryptionBox> sampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i2, i3);
            if (sampleEntryEncryptionData != null) {
                iIntValue = ((Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((TrackEncryptionBox) sampleEntryEncryptionData.second).schemeType);
                stsdData.trackEncryptionBoxes[i6] = (TrackEncryptionBox) sampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        DrmInitData drmInitData2 = drmInitDataCopyWithSchemeType;
        String str2 = null;
        List<byte[]> listSingletonList = null;
        byte[] projFromParent = null;
        boolean z = false;
        float paspFromParent = 1.0f;
        int i7 = -1;
        while (position - i2 < i3) {
            parsableByteArray.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            int i8 = parsableByteArray.readInt();
            if (i8 == 0 && parsableByteArray.getPosition() - i2 == i3) {
                break;
            }
            Assertions.checkArgument(i8 > 0, "childAtomSize should be positive");
            int i9 = parsableByteArray.readInt();
            if (i9 == 1635148611) {
                Assertions.checkState(str == null);
                parsableByteArray.setPosition(position2 + 8);
                AvcConfig avcConfig = AvcConfig.parse(parsableByteArray);
                listSingletonList = avcConfig.initializationData;
                stsdData.nalUnitLengthFieldLength = avcConfig.nalUnitLengthFieldLength;
                if (!z) {
                    paspFromParent = avcConfig.pixelWidthAspectRatio;
                }
                str = MimeTypes.VIDEO_H264;
            } else if (i9 == 1752589123) {
                Assertions.checkState(str == null);
                parsableByteArray.setPosition(position2 + 8);
                HevcConfig hevcConfig = HevcConfig.parse(parsableByteArray);
                listSingletonList = hevcConfig.initializationData;
                stsdData.nalUnitLengthFieldLength = hevcConfig.nalUnitLengthFieldLength;
                str = MimeTypes.VIDEO_H265;
            } else if (i9 == 1685480259 || i9 == 1685485123) {
                DolbyVisionConfig dolbyVisionConfig = DolbyVisionConfig.parse(parsableByteArray);
                if (dolbyVisionConfig != null) {
                    str2 = dolbyVisionConfig.codecs;
                    str = MimeTypes.VIDEO_DOLBY_VISION;
                }
            } else if (i9 == 1987076931) {
                Assertions.checkState(str == null);
                str = iIntValue == 1987063864 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
            } else if (i9 == 1635135811) {
                Assertions.checkState(str == null);
                str = MimeTypes.VIDEO_AV1;
            } else if (i9 == 1681012275) {
                Assertions.checkState(str == null);
                str = MimeTypes.VIDEO_H263;
            } else if (i9 == 1702061171) {
                Assertions.checkState(str == null);
                Pair<String, byte[]> esdsFromParent = parseEsdsFromParent(parsableByteArray, position2);
                str = (String) esdsFromParent.first;
                listSingletonList = Collections.singletonList(esdsFromParent.second);
            } else if (i9 == 1885434736) {
                paspFromParent = parsePaspFromParent(parsableByteArray, position2);
                z = true;
            } else if (i9 == 1937126244) {
                projFromParent = parseProjFromParent(parsableByteArray, position2, i8);
            } else if (i9 == 1936995172) {
                int unsignedByte = parsableByteArray.readUnsignedByte();
                parsableByteArray.skipBytes(3);
                if (unsignedByte == 0) {
                    int unsignedByte2 = parsableByteArray.readUnsignedByte();
                    if (unsignedByte2 == 0) {
                        i7 = 0;
                    } else if (unsignedByte2 == 1) {
                        i7 = 1;
                    } else if (unsignedByte2 == 2) {
                        i7 = 2;
                    } else if (unsignedByte2 == 3) {
                        i7 = 3;
                    }
                }
            }
            position += i8;
        }
        if (str == null) {
            return;
        }
        stsdData.format = Format.createVideoSampleFormat(Integer.toString(i4), str, str2, -1, -1, unsignedShort, unsignedShort2, -1.0f, listSingletonList, i5, paspFromParent, projFromParent, i7, null, drmInitData2);
    }
}
