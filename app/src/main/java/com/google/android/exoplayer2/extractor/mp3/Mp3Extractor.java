package com.google.android.exoplayer2.extractor.mp3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.extractor.Id3Peeker;
import com.google.android.exoplayer2.extractor.MpegAudioHeader;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.bouncycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes2.dex */
public final class Mp3Extractor implements Extractor {
    public static final int FLAG_DISABLE_ID3_METADATA = 2;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
    private static final int MAX_SNIFF_BYTES = 16384;
    private static final int MAX_SYNC_BYTES = 131072;
    private static final int MPEG_AUDIO_HEADER_MASK = -128000;
    private static final int SCRATCH_LENGTH = 10;
    private static final int SEEK_HEADER_INFO = 1231971951;
    private static final int SEEK_HEADER_UNSET = 0;
    private static final int SEEK_HEADER_VBRI = 1447187017;
    private static final int SEEK_HEADER_XING = 1483304551;
    private long basisTimeUs;
    private boolean disableSeeking;
    private ExtractorOutput extractorOutput;
    private long firstSamplePosition;
    private final int flags;
    private final long forcedFirstSampleTimestampUs;
    private final GaplessInfoHolder gaplessInfoHolder;
    private final Id3Peeker id3Peeker;
    private Metadata metadata;
    private int sampleBytesRemaining;
    private long samplesRead;
    private final ParsableByteArray scratch;

    @Nullable
    private Seeker seeker;
    private final MpegAudioHeader synchronizedHeader;
    private int synchronizedHeaderData;
    private TrackOutput trackOutput;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: XC
        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return null;
        }
    };
    private static final Id3Decoder.FramePredicate REQUIRED_ID3_FRAME_PREDICATE = new Id3Decoder.FramePredicate() { // from class: YC
        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate
        public final boolean evaluate(int i, int i2, int i3, int i4, int i5) {
            return false;
        }
    };

    /* JADX INFO: loaded from: classes.dex */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public Mp3Extractor() {
        this(0);
    }

    private Seeker getConstantBitrateSeeker(ExtractorInput extractorInput) throws InterruptedException, IOException {
        extractorInput.peekFully(this.scratch.data, 0, 4);
        this.scratch.setPosition(0);
        MpegAudioHeader.populateHeader(this.scratch.readInt(), this.synchronizedHeader);
        return new ConstantBitrateSeeker(extractorInput.getLength(), extractorInput.getPosition(), this.synchronizedHeader);
    }

    private static int getSeekFrameHeader(ParsableByteArray parsableByteArray, int i) {
        if (parsableByteArray.limit() >= i + 4) {
            parsableByteArray.setPosition(i);
            int i2 = parsableByteArray.readInt();
            if (i2 == SEEK_HEADER_XING || i2 == SEEK_HEADER_INFO) {
                return i2;
            }
        }
        if (parsableByteArray.limit() < 40) {
            return 0;
        }
        parsableByteArray.setPosition(36);
        if (parsableByteArray.readInt() == SEEK_HEADER_VBRI) {
            return SEEK_HEADER_VBRI;
        }
        return 0;
    }

    private static boolean headersMatch(int i, long j) {
        return ((long) (i & MPEG_AUDIO_HEADER_MASK)) == (j & (-128000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new Mp3Extractor()};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$static$1(int i, int i2, int i3, int i4, int i5) {
        return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
    }

    @Nullable
    private static MlltSeeker maybeHandleSeekMetadata(Metadata metadata, long j) {
        if (metadata == null) {
            return null;
        }
        int length = metadata.length();
        for (int i = 0; i < length; i++) {
            Metadata.Entry entry = metadata.get(i);
            if (entry instanceof MlltFrame) {
                return MlltSeeker.create(j, (MlltFrame) entry);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0026  */
    private Seeker maybeReadSeekFrame(ExtractorInput extractorInput) throws InterruptedException, IOException {
        int i;
        ParsableByteArray parsableByteArray = new ParsableByteArray(this.synchronizedHeader.frameSize);
        extractorInput.peekFully(parsableByteArray.data, 0, this.synchronizedHeader.frameSize);
        MpegAudioHeader mpegAudioHeader = this.synchronizedHeader;
        int i2 = mpegAudioHeader.version & 1;
        int i3 = mpegAudioHeader.channels;
        if (i2 != 0) {
            if (i3 != 1) {
                i = 36;
            } else {
                i = 21;
            }
        } else if (i3 != 1) {
            i = 21;
        } else {
            i = 13;
        }
        int seekFrameHeader = getSeekFrameHeader(parsableByteArray, i);
        if (seekFrameHeader != SEEK_HEADER_XING && seekFrameHeader != SEEK_HEADER_INFO) {
            if (seekFrameHeader != SEEK_HEADER_VBRI) {
                extractorInput.resetPeekPosition();
                return null;
            }
            VbriSeeker vbriSeekerCreate = VbriSeeker.create(extractorInput.getLength(), extractorInput.getPosition(), this.synchronizedHeader, parsableByteArray);
            extractorInput.skipFully(this.synchronizedHeader.frameSize);
            return vbriSeekerCreate;
        }
        XingSeeker xingSeekerCreate = XingSeeker.create(extractorInput.getLength(), extractorInput.getPosition(), this.synchronizedHeader, parsableByteArray);
        if (xingSeekerCreate != null && !this.gaplessInfoHolder.hasGaplessInfo()) {
            extractorInput.resetPeekPosition();
            extractorInput.advancePeekPosition(i + CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA);
            extractorInput.peekFully(this.scratch.data, 0, 3);
            this.scratch.setPosition(0);
            this.gaplessInfoHolder.setFromXingHeaderValue(this.scratch.readUnsignedInt24());
        }
        extractorInput.skipFully(this.synchronizedHeader.frameSize);
        return (xingSeekerCreate == null || xingSeekerCreate.isSeekable() || seekFrameHeader != SEEK_HEADER_INFO) ? xingSeekerCreate : getConstantBitrateSeeker(extractorInput);
    }

    private boolean peekEndOfStreamOrHeader(ExtractorInput extractorInput) throws InterruptedException, IOException {
        Seeker seeker = this.seeker;
        if (seeker != null) {
            long dataEndPosition = seeker.getDataEndPosition();
            if (dataEndPosition != -1 && extractorInput.getPeekPosition() > dataEndPosition - 4) {
                return true;
            }
        }
        try {
            return !extractorInput.peekFully(this.scratch.data, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private int readSample(ExtractorInput extractorInput) throws InterruptedException, IOException {
        if (this.sampleBytesRemaining == 0) {
            extractorInput.resetPeekPosition();
            if (peekEndOfStreamOrHeader(extractorInput)) {
                return -1;
            }
            this.scratch.setPosition(0);
            int i = this.scratch.readInt();
            if (!headersMatch(i, this.synchronizedHeaderData) || MpegAudioHeader.getFrameSize(i) == -1) {
                extractorInput.skipFully(1);
                this.synchronizedHeaderData = 0;
                return 0;
            }
            MpegAudioHeader.populateHeader(i, this.synchronizedHeader);
            if (this.basisTimeUs == C3219C.TIME_UNSET) {
                this.basisTimeUs = this.seeker.getTimeUs(extractorInput.getPosition());
                if (this.forcedFirstSampleTimestampUs != C3219C.TIME_UNSET) {
                    this.basisTimeUs = (this.forcedFirstSampleTimestampUs - this.seeker.getTimeUs(0L)) + this.basisTimeUs;
                }
            }
            this.sampleBytesRemaining = this.synchronizedHeader.frameSize;
        }
        int iSampleData = this.trackOutput.sampleData(extractorInput, this.sampleBytesRemaining, true);
        if (iSampleData == -1) {
            return -1;
        }
        int i2 = this.sampleBytesRemaining - iSampleData;
        this.sampleBytesRemaining = i2;
        if (i2 > 0) {
            return 0;
        }
        long j = this.basisTimeUs;
        long j2 = this.samplesRead * 1000000;
        MpegAudioHeader mpegAudioHeader = this.synchronizedHeader;
        this.trackOutput.sampleMetadata((j2 / ((long) mpegAudioHeader.sampleRate)) + j, 1, mpegAudioHeader.frameSize, 0, null);
        this.samplesRead += (long) this.synchronizedHeader.samplesPerFrame;
        this.sampleBytesRemaining = 0;
        return 0;
    }

    private boolean synchronize(ExtractorInput extractorInput, boolean z) throws InterruptedException, IOException {
        int i;
        int peekPosition;
        int frameSize;
        int i2 = z ? 16384 : 131072;
        extractorInput.resetPeekPosition();
        if (extractorInput.getPosition() == 0) {
            Metadata metadataPeekId3Data = this.id3Peeker.peekId3Data(extractorInput, (this.flags & 2) == 0 ? null : REQUIRED_ID3_FRAME_PREDICATE);
            this.metadata = metadataPeekId3Data;
            if (metadataPeekId3Data != null) {
                this.gaplessInfoHolder.setFromMetadata(metadataPeekId3Data);
            }
            peekPosition = (int) extractorInput.getPeekPosition();
            if (!z) {
                extractorInput.skipFully(peekPosition);
            }
            i = 0;
        } else {
            i = 0;
            peekPosition = 0;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (peekEndOfStreamOrHeader(extractorInput)) {
                if (i3 > 0) {
                    break;
                }
                throw new EOFException();
            }
            this.scratch.setPosition(0);
            int i5 = this.scratch.readInt();
            if ((i == 0 || headersMatch(i5, i)) && (frameSize = MpegAudioHeader.getFrameSize(i5)) != -1) {
                i3++;
                if (i3 != 1) {
                    if (i3 == 4) {
                        break;
                    }
                } else {
                    MpegAudioHeader.populateHeader(i5, this.synchronizedHeader);
                    i = i5;
                }
                extractorInput.advancePeekPosition(frameSize - 4);
            } else {
                int i6 = i4 + 1;
                if (i4 == i2) {
                    if (z) {
                        return false;
                    }
                    throw new ParserException("Searched too many bytes.");
                }
                if (z) {
                    extractorInput.resetPeekPosition();
                    extractorInput.advancePeekPosition(peekPosition + i6);
                } else {
                    extractorInput.skipFully(1);
                }
                i4 = i6;
                i = 0;
                i3 = 0;
            }
        }
        if (z) {
            extractorInput.skipFully(peekPosition + i4);
        } else {
            extractorInput.resetPeekPosition();
        }
        this.synchronizedHeaderData = i;
        return true;
    }

    public void disableSeeking() {
        this.disableSeeking = true;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        this.trackOutput = extractorOutput.track(0, 1);
        this.extractorOutput.endTracks();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws InterruptedException, IOException {
        Seeker constantBitrateSeeker;
        Metadata metadata;
        if (this.synchronizedHeaderData == 0) {
            try {
                synchronize(extractorInput, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.seeker == null) {
            Seeker seekerMaybeReadSeekFrame = maybeReadSeekFrame(extractorInput);
            MlltSeeker mlltSeekerMaybeHandleSeekMetadata = maybeHandleSeekMetadata(this.metadata, extractorInput.getPosition());
            if (this.disableSeeking) {
                constantBitrateSeeker = new Seeker.UnseekableSeeker();
            } else {
                if (mlltSeekerMaybeHandleSeekMetadata != null) {
                    this.seeker = mlltSeekerMaybeHandleSeekMetadata;
                } else if (seekerMaybeReadSeekFrame != null) {
                    this.seeker = seekerMaybeReadSeekFrame;
                }
                Seeker seeker = this.seeker;
                if (seeker == null || (!seeker.isSeekable() && (this.flags & 1) != 0)) {
                    constantBitrateSeeker = getConstantBitrateSeeker(extractorInput);
                }
                this.extractorOutput.seekMap(this.seeker);
                TrackOutput trackOutput = this.trackOutput;
                MpegAudioHeader mpegAudioHeader = this.synchronizedHeader;
                String str = mpegAudioHeader.mimeType;
                int i = mpegAudioHeader.channels;
                int i2 = mpegAudioHeader.sampleRate;
                GaplessInfoHolder gaplessInfoHolder = this.gaplessInfoHolder;
                int i3 = gaplessInfoHolder.encoderDelay;
                int i4 = gaplessInfoHolder.encoderPadding;
                if ((this.flags & 2) != 0) {
                    metadata = null;
                } else {
                    metadata = this.metadata;
                }
                trackOutput.format(Format.createAudioSampleFormat(null, str, null, -1, 4096, i, i2, -1, i3, i4, null, null, 0, null, metadata));
                this.firstSamplePosition = extractorInput.getPosition();
            }
            this.seeker = constantBitrateSeeker;
            this.extractorOutput.seekMap(this.seeker);
            TrackOutput trackOutput2 = this.trackOutput;
            MpegAudioHeader mpegAudioHeader2 = this.synchronizedHeader;
            String str2 = mpegAudioHeader2.mimeType;
            int i5 = mpegAudioHeader2.channels;
            int i6 = mpegAudioHeader2.sampleRate;
            GaplessInfoHolder gaplessInfoHolder2 = this.gaplessInfoHolder;
            int i7 = gaplessInfoHolder2.encoderDelay;
            int i8 = gaplessInfoHolder2.encoderPadding;
            if ((this.flags & 2) != 0) {
                metadata = null;
            } else {
                metadata = this.metadata;
            }
            trackOutput2.format(Format.createAudioSampleFormat(null, str2, null, -1, 4096, i5, i6, -1, i7, i8, null, null, 0, null, metadata));
            this.firstSamplePosition = extractorInput.getPosition();
        } else if (this.firstSamplePosition != 0) {
            long position = extractorInput.getPosition();
            long j = this.firstSamplePosition;
            if (position < j) {
                extractorInput.skipFully((int) (j - position));
            }
        }
        return readSample(extractorInput);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j, long j2) {
        this.synchronizedHeaderData = 0;
        this.basisTimeUs = C3219C.TIME_UNSET;
        this.samplesRead = 0L;
        this.sampleBytesRemaining = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws InterruptedException, IOException {
        return synchronize(extractorInput, true);
    }

    public Mp3Extractor(int i) {
        this(i, C3219C.TIME_UNSET);
    }

    public Mp3Extractor(int i, long j) {
        this.flags = i;
        this.forcedFirstSampleTimestampUs = j;
        this.scratch = new ParsableByteArray(10);
        this.synchronizedHeader = new MpegAudioHeader();
        this.gaplessInfoHolder = new GaplessInfoHolder();
        this.basisTimeUs = C3219C.TIME_UNSET;
        this.id3Peeker = new Id3Peeker();
    }
}
