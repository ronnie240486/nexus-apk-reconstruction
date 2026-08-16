package com.google.android.exoplayer2.extractor.p006ts;

import android.util.SparseArray;
import androidx.core.view.InputDeviceCompat;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.IOException;
import p000.C1579YX;

/* JADX INFO: loaded from: classes2.dex */
public final class PsExtractor implements Extractor {
    public static final int AUDIO_STREAM = 192;
    public static final int AUDIO_STREAM_MASK = 224;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: PL
        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return null;
        }
    };
    private static final long MAX_SEARCH_LENGTH = 1048576;
    private static final long MAX_SEARCH_LENGTH_AFTER_AUDIO_AND_VIDEO_FOUND = 8192;
    private static final int MAX_STREAM_ID_PLUS_ONE = 256;
    static final int MPEG_PROGRAM_END_CODE = 441;
    static final int PACKET_START_CODE_PREFIX = 1;
    static final int PACK_START_CODE = 442;
    public static final int PRIVATE_STREAM_1 = 189;
    static final int SYSTEM_HEADER_START_CODE = 443;
    public static final int VIDEO_STREAM = 224;
    public static final int VIDEO_STREAM_MASK = 240;
    private final PsDurationReader durationReader;
    private boolean foundAllTracks;
    private boolean foundAudioTrack;
    private boolean foundVideoTrack;
    private boolean hasOutputSeekMap;
    private long lastTrackPosition;
    private ExtractorOutput output;
    private PsBinarySearchSeeker psBinarySearchSeeker;
    private final ParsableByteArray psPacketBuffer;
    private final SparseArray<PesReader> psPayloadReaders;
    private final TimestampAdjuster timestampAdjuster;

    public static final class PesReader {
        private static final int PES_SCRATCH_SIZE = 64;
        private boolean dtsFlag;
        private int extendedHeaderLength;
        private final ElementaryStreamReader pesPayloadReader;
        private final ParsableBitArray pesScratch = new ParsableBitArray(new byte[64]);
        private boolean ptsFlag;
        private boolean seenFirstDts;
        private long timeUs;
        private final TimestampAdjuster timestampAdjuster;

        public PesReader(ElementaryStreamReader elementaryStreamReader, TimestampAdjuster timestampAdjuster) {
            this.pesPayloadReader = elementaryStreamReader;
            this.timestampAdjuster = timestampAdjuster;
        }

        private void parseHeader() {
            this.pesScratch.skipBits(8);
            this.ptsFlag = this.pesScratch.readBit();
            this.dtsFlag = this.pesScratch.readBit();
            this.pesScratch.skipBits(6);
            this.extendedHeaderLength = this.pesScratch.readBits(8);
        }

        private void parseHeaderExtension() {
            this.timeUs = 0L;
            if (this.ptsFlag) {
                this.pesScratch.skipBits(4);
                long bits = ((long) this.pesScratch.readBits(3)) << 30;
                this.pesScratch.skipBits(1);
                long bits2 = bits | ((long) (this.pesScratch.readBits(15) << 15));
                this.pesScratch.skipBits(1);
                long bits3 = bits2 | ((long) this.pesScratch.readBits(15));
                this.pesScratch.skipBits(1);
                if (!this.seenFirstDts && this.dtsFlag) {
                    this.pesScratch.skipBits(4);
                    long bits4 = ((long) this.pesScratch.readBits(3)) << 30;
                    this.pesScratch.skipBits(1);
                    long bits5 = bits4 | ((long) (this.pesScratch.readBits(15) << 15));
                    this.pesScratch.skipBits(1);
                    long bits6 = bits5 | ((long) this.pesScratch.readBits(15));
                    this.pesScratch.skipBits(1);
                    this.timestampAdjuster.adjustTsTimestamp(bits6);
                    this.seenFirstDts = true;
                }
                this.timeUs = this.timestampAdjuster.adjustTsTimestamp(bits3);
            }
        }

        public void consume(ParsableByteArray parsableByteArray) throws ParserException {
            parsableByteArray.readBytes(this.pesScratch.data, 0, 3);
            this.pesScratch.setPosition(0);
            parseHeader();
            parsableByteArray.readBytes(this.pesScratch.data, 0, this.extendedHeaderLength);
            this.pesScratch.setPosition(0);
            parseHeaderExtension();
            this.pesPayloadReader.packetStarted(this.timeUs, 4);
            this.pesPayloadReader.consume(parsableByteArray);
            this.pesPayloadReader.packetFinished();
        }

        public void seek() {
            this.seenFirstDts = false;
            this.pesPayloadReader.seek();
        }
    }

    public PsExtractor() {
        this(new TimestampAdjuster(0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new PsExtractor()};
    }

    private void maybeOutputSeekMap(long j) {
        ExtractorOutput extractorOutput;
        SeekMap unseekable;
        if (this.hasOutputSeekMap) {
            return;
        }
        this.hasOutputSeekMap = true;
        if (this.durationReader.getDurationUs() != C3219C.TIME_UNSET) {
            PsBinarySearchSeeker psBinarySearchSeeker = new PsBinarySearchSeeker(this.durationReader.getScrTimestampAdjuster(), this.durationReader.getDurationUs(), j);
            this.psBinarySearchSeeker = psBinarySearchSeeker;
            extractorOutput = this.output;
            unseekable = psBinarySearchSeeker.getSeekMap();
        } else {
            extractorOutput = this.output;
            unseekable = new SeekMap.Unseekable(this.durationReader.getDurationUs());
        }
        extractorOutput.seekMap(unseekable);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.output = extractorOutput;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00ea  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws InterruptedException, IOException {
        ElementaryStreamReader h262Reader;
        int unsignedShort;
        long length = extractorInput.getLength();
        if (length != -1 && !this.durationReader.isDurationReadFinished()) {
            return this.durationReader.readDuration(extractorInput, positionHolder);
        }
        maybeOutputSeekMap(length);
        PsBinarySearchSeeker psBinarySearchSeeker = this.psBinarySearchSeeker;
        if (psBinarySearchSeeker != null && psBinarySearchSeeker.isSeeking()) {
            return this.psBinarySearchSeeker.handlePendingSeek(extractorInput, positionHolder);
        }
        extractorInput.resetPeekPosition();
        long peekPosition = length != -1 ? length - extractorInput.getPeekPosition() : -1L;
        if ((peekPosition != -1 && peekPosition < 4) || !extractorInput.peekFully(this.psPacketBuffer.data, 0, 4, true)) {
            return -1;
        }
        this.psPacketBuffer.setPosition(0);
        int i = this.psPacketBuffer.readInt();
        if (i == MPEG_PROGRAM_END_CODE) {
            return -1;
        }
        if (i == PACK_START_CODE) {
            extractorInput.peekFully(this.psPacketBuffer.data, 0, 10);
            this.psPacketBuffer.setPosition(9);
            unsignedShort = (this.psPacketBuffer.readUnsignedByte() & 7) + 14;
        } else {
            if (i != SYSTEM_HEADER_START_CODE) {
                if (((i & InputDeviceCompat.SOURCE_ANY) >> 8) != 1) {
                    extractorInput.skipFully(1);
                    return 0;
                }
                int i2 = i & 255;
                PesReader pesReader = this.psPayloadReaders.get(i2);
                if (!this.foundAllTracks) {
                    if (pesReader == null) {
                        if (i2 == 189) {
                            h262Reader = new Ac3Reader();
                        } else {
                            if ((i & 224) == 192) {
                                h262Reader = new MpegAudioReader();
                            } else if ((i & 240) == 224) {
                                h262Reader = new H262Reader();
                                this.foundVideoTrack = true;
                                this.lastTrackPosition = extractorInput.getPosition();
                            } else {
                                h262Reader = null;
                            }
                            if (h262Reader != null) {
                                h262Reader.createTracks(this.output, new TsPayloadReader.TrackIdGenerator(i2, 256));
                                pesReader = new PesReader(h262Reader, this.timestampAdjuster);
                                this.psPayloadReaders.put(i2, pesReader);
                            }
                        }
                        this.foundAudioTrack = true;
                        this.lastTrackPosition = extractorInput.getPosition();
                        if (h262Reader != null) {
                            h262Reader.createTracks(this.output, new TsPayloadReader.TrackIdGenerator(i2, 256));
                            pesReader = new PesReader(h262Reader, this.timestampAdjuster);
                            this.psPayloadReaders.put(i2, pesReader);
                        }
                    }
                    if (extractorInput.getPosition() > ((this.foundAudioTrack && this.foundVideoTrack) ? this.lastTrackPosition + 8192 : 1048576L)) {
                        this.foundAllTracks = true;
                        this.output.endTracks();
                    }
                }
                extractorInput.peekFully(this.psPacketBuffer.data, 0, 2);
                this.psPacketBuffer.setPosition(0);
                int unsignedShort2 = this.psPacketBuffer.readUnsignedShort() + 6;
                if (pesReader == null) {
                    extractorInput.skipFully(unsignedShort2);
                } else {
                    this.psPacketBuffer.reset(unsignedShort2);
                    extractorInput.readFully(this.psPacketBuffer.data, 0, unsignedShort2);
                    this.psPacketBuffer.setPosition(6);
                    pesReader.consume(this.psPacketBuffer);
                    ParsableByteArray parsableByteArray = this.psPacketBuffer;
                    parsableByteArray.setLimit(parsableByteArray.capacity());
                }
                return 0;
            }
            extractorInput.peekFully(this.psPacketBuffer.data, 0, 2);
            this.psPacketBuffer.setPosition(0);
            unsignedShort = this.psPacketBuffer.readUnsignedShort() + 6;
        }
        extractorInput.skipFully(unsignedShort);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j, long j2) {
        if (this.timestampAdjuster.getTimestampOffsetUs() == C3219C.TIME_UNSET || (this.timestampAdjuster.getFirstSampleTimestampUs() != 0 && this.timestampAdjuster.getFirstSampleTimestampUs() != j2)) {
            this.timestampAdjuster.reset();
            this.timestampAdjuster.setFirstSampleTimestampUs(j2);
        }
        PsBinarySearchSeeker psBinarySearchSeeker = this.psBinarySearchSeeker;
        if (psBinarySearchSeeker != null) {
            psBinarySearchSeeker.setSeekTargetUs(j2);
        }
        for (int i = 0; i < this.psPayloadReaders.size(); i++) {
            this.psPayloadReaders.valueAt(i).seek();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws InterruptedException, IOException {
        byte[] bArr = new byte[14];
        extractorInput.peekFully(bArr, 0, 14);
        if (PACK_START_CODE != (((bArr[0] & C1579YX.f3960d) << 24) | ((bArr[1] & C1579YX.f3960d) << 16) | ((bArr[2] & C1579YX.f3960d) << 8) | (bArr[3] & C1579YX.f3960d)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        extractorInput.advancePeekPosition(bArr[13] & 7);
        extractorInput.peekFully(bArr, 0, 3);
        return 1 == ((((bArr[0] & C1579YX.f3960d) << 16) | ((bArr[1] & C1579YX.f3960d) << 8)) | (bArr[2] & C1579YX.f3960d));
    }

    public PsExtractor(TimestampAdjuster timestampAdjuster) {
        this.timestampAdjuster = timestampAdjuster;
        this.psPacketBuffer = new ParsableByteArray(4096);
        this.psPayloadReaders = new SparseArray<>();
        this.durationReader = new PsDurationReader();
    }
}
