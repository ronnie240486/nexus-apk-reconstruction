package com.google.android.exoplayer2.extractor.wav;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.tencent.smtt.sdk.TbsListener;
import java.io.IOException;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.dom4j.p020io.SAXEventRecorder;
import org.videolan.libvlc.RendererDiscoverer;
import p000.C1579YX;
import p000.C2998bp;
import p000.C5274qy;

/* JADX INFO: loaded from: classes.dex */
public final class WavExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: K30
        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return null;
        }
    };
    private static final int TARGET_SAMPLES_PER_SECOND = 10;
    private ExtractorOutput extractorOutput;
    private OutputWriter outputWriter;
    private TrackOutput trackOutput;
    private int dataStartPosition = -1;
    private long dataEndPosition = -1;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class ImaAdPcmOutputWriter implements OutputWriter {
        private static final int[] INDEX_TABLE = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        private static final int[] STEP_TABLE = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, TbsListener.ErrorCode.UNKNOWN_ERROR, 118, 130, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, 157, 173, 190, TbsListener.ErrorCode.DEXOPT_EXCEPTION, TbsListener.ErrorCode.RENAME_SUCCESS, 253, 279, 307, 337, 371, TbsListener.ErrorCode.INFO_CAN_NOT_DISABLED_BY_CRASH, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, RendererDiscoverer.Event.f17445g, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
        private final ParsableByteArray decodedData;
        private final ExtractorOutput extractorOutput;
        private final Format format;
        private final int framesPerBlock;
        private final WavHeader header;
        private final byte[] inputData;
        private long outputFrameCount;
        private int pendingInputBytes;
        private int pendingOutputBytes;
        private long startTimeUs;
        private final int targetSampleSizeFrames;
        private final TrackOutput trackOutput;

        public ImaAdPcmOutputWriter(ExtractorOutput extractorOutput, TrackOutput trackOutput, WavHeader wavHeader) throws ParserException {
            this.extractorOutput = extractorOutput;
            this.trackOutput = trackOutput;
            this.header = wavHeader;
            int iMax = Math.max(1, wavHeader.frameRateHz / 10);
            this.targetSampleSizeFrames = iMax;
            ParsableByteArray parsableByteArray = new ParsableByteArray(wavHeader.extraData);
            parsableByteArray.readLittleEndianUnsignedShort();
            int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
            this.framesPerBlock = littleEndianUnsignedShort;
            int i = wavHeader.numChannels;
            int i2 = (((wavHeader.blockSize - (i * 4)) * 8) / (wavHeader.bitsPerSample * i)) + 1;
            if (littleEndianUnsignedShort != i2) {
                throw new ParserException(C2998bp.m14684a("Expected frames per block: ", i2, "; got: ", littleEndianUnsignedShort));
            }
            int iCeilDivide = Util.ceilDivide(iMax, littleEndianUnsignedShort);
            this.inputData = new byte[wavHeader.blockSize * iCeilDivide];
            this.decodedData = new ParsableByteArray(iCeilDivide * numOutputFramesToBytes(littleEndianUnsignedShort, i));
            this.format = Format.createAudioSampleFormat(null, MimeTypes.AUDIO_RAW, null, ((wavHeader.frameRateHz * wavHeader.blockSize) * 8) / littleEndianUnsignedShort, numOutputFramesToBytes(iMax, i), wavHeader.numChannels, wavHeader.frameRateHz, 2, null, null, 0, null);
        }

        private void decode(byte[] bArr, int i, ParsableByteArray parsableByteArray) {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = 0; i3 < this.header.numChannels; i3++) {
                    decodeBlockForChannel(bArr, i2, i3, parsableByteArray.data);
                }
            }
            parsableByteArray.reset(numOutputFramesToBytes(this.framesPerBlock * i));
        }

        private void decodeBlockForChannel(byte[] bArr, int i, int i2, byte[] bArr2) {
            WavHeader wavHeader = this.header;
            int i3 = wavHeader.blockSize;
            int i4 = wavHeader.numChannels;
            int i5 = (i2 * 4) + (i * i3);
            int i6 = (i4 * 4) + i5;
            int i7 = (i3 / i4) - 4;
            int iConstrainValue = (short) (((bArr[i5 + 1] & C1579YX.f3960d) << 8) | (bArr[i5] & C1579YX.f3960d));
            int iMin = Math.min(bArr[i5 + 2] & C1579YX.f3960d, 88);
            int i8 = STEP_TABLE[iMin];
            int i9 = ((i * this.framesPerBlock * i4) + i2) * 2;
            bArr2[i9] = (byte) (iConstrainValue & 255);
            bArr2[i9 + 1] = (byte) (iConstrainValue >> 8);
            for (int i10 = 0; i10 < i7 * 2; i10++) {
                byte b = bArr[((i10 / 8) * i4 * 4) + i6 + ((i10 / 2) % 4)];
                int i11 = i10 % 2 == 0 ? b & SAXEventRecorder.SAXEvent.f16649r : (b & C1579YX.f3960d) >> 4;
                int i12 = ((((i11 & 7) * 2) + 1) * i8) >> 3;
                if ((i11 & 8) != 0) {
                    i12 = -i12;
                }
                iConstrainValue = Util.constrainValue(iConstrainValue + i12, -32768, 32767);
                i9 += i4 * 2;
                bArr2[i9] = (byte) (iConstrainValue & 255);
                bArr2[i9 + 1] = (byte) (iConstrainValue >> 8);
                int i13 = iMin + INDEX_TABLE[i11];
                int[] iArr = STEP_TABLE;
                iMin = Util.constrainValue(i13, 0, iArr.length - 1);
                i8 = iArr[iMin];
            }
        }

        private int numOutputBytesToFrames(int i) {
            return i / (this.header.numChannels * 2);
        }

        private int numOutputFramesToBytes(int i) {
            return numOutputFramesToBytes(i, this.header.numChannels);
        }

        private void writeSampleMetadata(int i) {
            long jScaleLargeTimestamp = this.startTimeUs + Util.scaleLargeTimestamp(this.outputFrameCount, 1000000L, this.header.frameRateHz);
            int iNumOutputFramesToBytes = numOutputFramesToBytes(i);
            this.trackOutput.sampleMetadata(jScaleLargeTimestamp, 1, iNumOutputFramesToBytes, this.pendingOutputBytes - iNumOutputFramesToBytes, null);
            this.outputFrameCount += (long) i;
            this.pendingOutputBytes -= iNumOutputFramesToBytes;
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public void init(int i, long j) {
            this.extractorOutput.seekMap(new WavSeekMap(this.header, this.framesPerBlock, i, j));
            this.trackOutput.format(this.format);
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public void reset(long j) {
            this.pendingInputBytes = 0;
            this.startTimeUs = j;
            this.pendingOutputBytes = 0;
            this.outputFrameCount = 0L;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0039 A[LOOP:0: B:6:0x001f->B:12:0x0039, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:23:0x003f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:25:0x001c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0021  */
        /* JADX WARN: Code duplicated, block: B:9:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0036 -> B:4:0x001c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public boolean sampleData(com.google.android.exoplayer2.extractor.ExtractorInput r7, long r8) throws java.io.IOException, java.lang.InterruptedException {
            /*
                r6 = this;
                int r0 = r6.targetSampleSizeFrames
                int r1 = r6.pendingOutputBytes
                int r1 = r6.numOutputBytesToFrames(r1)
                int r0 = r0 - r1
                int r1 = r6.framesPerBlock
                int r0 = com.google.android.exoplayer2.util.Util.ceilDivide(r0, r1)
                com.google.android.exoplayer2.extractor.wav.WavHeader r1 = r6.header
                int r1 = r1.blockSize
                int r0 = r0 * r1
                r1 = 0
                r3 = 1
                int r4 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r4 != 0) goto L1e
            L1c:
                r1 = 1
                goto L1f
            L1e:
                r1 = 0
            L1f:
                if (r1 != 0) goto L3f
                int r2 = r6.pendingInputBytes
                if (r2 >= r0) goto L3f
                int r2 = r0 - r2
                long r4 = (long) r2
                long r4 = java.lang.Math.min(r4, r8)
                int r2 = (int) r4
                byte[] r4 = r6.inputData
                int r5 = r6.pendingInputBytes
                int r2 = r7.read(r4, r5, r2)
                r4 = -1
                if (r2 != r4) goto L39
                goto L1c
            L39:
                int r4 = r6.pendingInputBytes
                int r4 = r4 + r2
                r6.pendingInputBytes = r4
                goto L1f
            L3f:
                int r7 = r6.pendingInputBytes
                com.google.android.exoplayer2.extractor.wav.WavHeader r8 = r6.header
                int r8 = r8.blockSize
                int r7 = r7 / r8
                if (r7 <= 0) goto L77
                byte[] r8 = r6.inputData
                com.google.android.exoplayer2.util.ParsableByteArray r9 = r6.decodedData
                r6.decode(r8, r7, r9)
                int r8 = r6.pendingInputBytes
                com.google.android.exoplayer2.extractor.wav.WavHeader r9 = r6.header
                int r9 = r9.blockSize
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.pendingInputBytes = r8
                com.google.android.exoplayer2.util.ParsableByteArray r7 = r6.decodedData
                int r7 = r7.limit()
                com.google.android.exoplayer2.extractor.TrackOutput r8 = r6.trackOutput
                com.google.android.exoplayer2.util.ParsableByteArray r9 = r6.decodedData
                r8.sampleData(r9, r7)
                int r8 = r6.pendingOutputBytes
                int r8 = r8 + r7
                r6.pendingOutputBytes = r8
                int r7 = r6.numOutputBytesToFrames(r8)
                int r8 = r6.targetSampleSizeFrames
                if (r7 < r8) goto L77
                r6.writeSampleMetadata(r8)
            L77:
                if (r1 == 0) goto L84
                int r7 = r6.pendingOutputBytes
                int r7 = r6.numOutputBytesToFrames(r7)
                if (r7 <= 0) goto L84
                r6.writeSampleMetadata(r7)
            L84:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.wav.WavExtractor.ImaAdPcmOutputWriter.sampleData(com.google.android.exoplayer2.extractor.ExtractorInput, long):boolean");
        }

        private static int numOutputFramesToBytes(int i, int i2) {
            return i * 2 * i2;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface OutputWriter {
        void init(int i, long j) throws ParserException;

        void reset(long j);

        boolean sampleData(ExtractorInput extractorInput, long j) throws InterruptedException, IOException;
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class PassthroughOutputWriter implements OutputWriter {
        private final ExtractorOutput extractorOutput;
        private final Format format;
        private final WavHeader header;
        private long outputFrameCount;
        private int pendingOutputBytes;
        private long startTimeUs;
        private final int targetSampleSizeBytes;
        private final TrackOutput trackOutput;

        public PassthroughOutputWriter(ExtractorOutput extractorOutput, TrackOutput trackOutput, WavHeader wavHeader, String str, int i) throws ParserException {
            this.extractorOutput = extractorOutput;
            this.trackOutput = trackOutput;
            this.header = wavHeader;
            int i2 = (wavHeader.numChannels * wavHeader.bitsPerSample) / 8;
            if (wavHeader.blockSize != i2) {
                StringBuilder sbM27771a = C5274qy.m27771a("Expected block size: ", i2, "; got: ");
                sbM27771a.append(wavHeader.blockSize);
                throw new ParserException(sbM27771a.toString());
            }
            int iMax = Math.max(i2, (wavHeader.frameRateHz * i2) / 10);
            this.targetSampleSizeBytes = iMax;
            int i3 = wavHeader.frameRateHz;
            this.format = Format.createAudioSampleFormat(null, str, null, i2 * i3 * 8, iMax, wavHeader.numChannels, i3, i, null, null, 0, null);
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public void init(int i, long j) {
            this.extractorOutput.seekMap(new WavSeekMap(this.header, 1, i, j));
            this.trackOutput.format(this.format);
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public void reset(long j) {
            this.startTimeUs = j;
            this.pendingOutputBytes = 0;
            this.outputFrameCount = 0L;
        }

        @Override // com.google.android.exoplayer2.extractor.wav.WavExtractor.OutputWriter
        public boolean sampleData(ExtractorInput extractorInput, long j) throws InterruptedException, IOException {
            int i;
            int i2;
            long j2 = j;
            while (j2 > 0 && (i = this.pendingOutputBytes) < (i2 = this.targetSampleSizeBytes)) {
                int iSampleData = this.trackOutput.sampleData(extractorInput, (int) Math.min(i2 - i, j2), true);
                if (iSampleData == -1) {
                    j2 = 0;
                } else {
                    this.pendingOutputBytes += iSampleData;
                    j2 -= (long) iSampleData;
                }
            }
            WavHeader wavHeader = this.header;
            int i3 = wavHeader.blockSize;
            int i4 = this.pendingOutputBytes / i3;
            if (i4 > 0) {
                long jScaleLargeTimestamp = this.startTimeUs + Util.scaleLargeTimestamp(this.outputFrameCount, 1000000L, wavHeader.frameRateHz);
                int i5 = i4 * i3;
                int i6 = this.pendingOutputBytes - i5;
                this.trackOutput.sampleMetadata(jScaleLargeTimestamp, 1, i5, i6, null);
                this.outputFrameCount += (long) i4;
                this.pendingOutputBytes = i6;
            }
            return j2 <= 0;
        }
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    private void assertInitialized() {
        Assertions.checkStateNotNull(this.trackOutput);
        Util.castNonNull(this.extractorOutput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new WavExtractor()};
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        this.trackOutput = extractorOutput.track(0, 1);
        extractorOutput.endTracks();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws InterruptedException, IOException {
        OutputWriter passthroughOutputWriter;
        assertInitialized();
        if (this.outputWriter == null) {
            WavHeader wavHeaderPeek = WavHeaderReader.peek(extractorInput);
            if (wavHeaderPeek == null) {
                throw new ParserException("Unsupported or unrecognized wav header.");
            }
            int i = wavHeaderPeek.formatType;
            if (i == 17) {
                passthroughOutputWriter = new ImaAdPcmOutputWriter(this.extractorOutput, this.trackOutput, wavHeaderPeek);
            } else if (i == 6) {
                passthroughOutputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, wavHeaderPeek, MimeTypes.AUDIO_ALAW, -1);
            } else if (i == 7) {
                passthroughOutputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, wavHeaderPeek, MimeTypes.AUDIO_MLAW, -1);
            } else {
                int pcmEncodingForType = WavUtil.getPcmEncodingForType(i, wavHeaderPeek.bitsPerSample);
                if (pcmEncodingForType == 0) {
                    throw new ParserException("Unsupported WAV format type: " + wavHeaderPeek.formatType);
                }
                passthroughOutputWriter = new PassthroughOutputWriter(this.extractorOutput, this.trackOutput, wavHeaderPeek, MimeTypes.AUDIO_RAW, pcmEncodingForType);
            }
            this.outputWriter = passthroughOutputWriter;
        }
        if (this.dataStartPosition == -1) {
            Pair<Long, Long> pairSkipToData = WavHeaderReader.skipToData(extractorInput);
            this.dataStartPosition = ((Long) pairSkipToData.first).intValue();
            long jLongValue = ((Long) pairSkipToData.second).longValue();
            this.dataEndPosition = jLongValue;
            this.outputWriter.init(this.dataStartPosition, jLongValue);
        } else if (extractorInput.getPosition() == 0) {
            extractorInput.skipFully(this.dataStartPosition);
        }
        Assertions.checkState(this.dataEndPosition != -1);
        return this.outputWriter.sampleData(extractorInput, this.dataEndPosition - extractorInput.getPosition()) ? -1 : 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j, long j2) {
        OutputWriter outputWriter = this.outputWriter;
        if (outputWriter != null) {
            outputWriter.reset(j2);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws InterruptedException, IOException {
        return WavHeaderReader.peek(extractorInput) != null;
    }
}
