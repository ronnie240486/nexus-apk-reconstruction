package com.google.android.exoplayer2.extractor.p006ts;

import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import p000.C0208D5;

/* JADX INFO: loaded from: classes2.dex */
public final class PesReader implements TsPayloadReader {
    private static final int HEADER_SIZE = 9;
    private static final int MAX_HEADER_EXTENSION_SIZE = 10;
    private static final int PES_SCRATCH_SIZE = 10;
    private static final int STATE_FINDING_HEADER = 0;
    private static final int STATE_READING_BODY = 3;
    private static final int STATE_READING_HEADER = 1;
    private static final int STATE_READING_HEADER_EXTENSION = 2;
    private static final String TAG = "PesReader";
    private int bytesRead;
    private boolean dataAlignmentIndicator;
    private boolean dtsFlag;
    private int extendedHeaderLength;
    private int payloadSize;
    private boolean ptsFlag;
    private final ElementaryStreamReader reader;
    private boolean seenFirstDts;
    private long timeUs;
    private TimestampAdjuster timestampAdjuster;
    private final ParsableBitArray pesScratch = new ParsableBitArray(new byte[10]);
    private int state = 0;

    public PesReader(ElementaryStreamReader elementaryStreamReader) {
        this.reader = elementaryStreamReader;
    }

    private boolean continueRead(ParsableByteArray parsableByteArray, byte[] bArr, int i) {
        int iMin = Math.min(parsableByteArray.bytesLeft(), i - this.bytesRead);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            parsableByteArray.skipBytes(iMin);
        } else {
            parsableByteArray.readBytes(bArr, this.bytesRead, iMin);
        }
        int i2 = this.bytesRead + iMin;
        this.bytesRead = i2;
        return i2 == i;
    }

    private boolean parseHeader() {
        this.pesScratch.setPosition(0);
        int bits = this.pesScratch.readBits(24);
        if (bits != 1) {
            C0208D5.m1307a("Unexpected start code prefix: ", bits, TAG);
            this.payloadSize = -1;
            return false;
        }
        this.pesScratch.skipBits(8);
        int bits2 = this.pesScratch.readBits(16);
        this.pesScratch.skipBits(5);
        this.dataAlignmentIndicator = this.pesScratch.readBit();
        this.pesScratch.skipBits(2);
        this.ptsFlag = this.pesScratch.readBit();
        this.dtsFlag = this.pesScratch.readBit();
        this.pesScratch.skipBits(6);
        int bits3 = this.pesScratch.readBits(8);
        this.extendedHeaderLength = bits3;
        if (bits2 == 0) {
            this.payloadSize = -1;
        } else {
            this.payloadSize = (bits2 - 3) - bits3;
        }
        return true;
    }

    private void parseHeaderExtension() {
        this.pesScratch.setPosition(0);
        this.timeUs = C3219C.TIME_UNSET;
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

    private void setState(int i) {
        this.state = i;
        this.bytesRead = 0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:54:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x004e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x004c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x003f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x003f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x003f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x003f A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0072 -> B:35:0x0074). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // com.google.android.exoplayer2.extractor.p006ts.TsPayloadReader
    public final void consume(com.google.android.exoplayer2.util.ParsableByteArray r8, int r9) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p006ts.PesReader.consume(com.google.android.exoplayer2.util.ParsableByteArray, int):void");
    }

    @Override // com.google.android.exoplayer2.extractor.p006ts.TsPayloadReader
    public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.timestampAdjuster = timestampAdjuster;
        this.reader.createTracks(extractorOutput, trackIdGenerator);
    }

    @Override // com.google.android.exoplayer2.extractor.p006ts.TsPayloadReader
    public final void seek() {
        this.state = 0;
        this.bytesRead = 0;
        this.seenFirstDts = false;
        this.reader.seek();
    }
}
