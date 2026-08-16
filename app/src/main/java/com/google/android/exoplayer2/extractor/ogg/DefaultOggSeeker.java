package com.google.android.exoplayer2.extractor.ogg;

import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class DefaultOggSeeker implements OggSeeker {
    private static final int DEFAULT_OFFSET = 30000;
    private static final int MATCH_BYTE_RANGE = 100000;
    private static final int MATCH_RANGE = 72000;
    private static final int STATE_IDLE = 4;
    private static final int STATE_READ_LAST_PAGE = 1;
    private static final int STATE_SEEK = 2;
    private static final int STATE_SEEK_TO_END = 0;
    private static final int STATE_SKIP = 3;
    private long end;
    private long endGranule;
    private final OggPageHeader pageHeader = new OggPageHeader();
    private final long payloadEndPosition;
    private final long payloadStartPosition;
    private long positionBeforeSeekToEnd;
    private long start;
    private long startGranule;
    private int state;
    private final StreamReader streamReader;
    private long targetGranule;
    private long totalGranules;

    public final class OggSeekMap implements SeekMap {
        private OggSeekMap() {
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
            return DefaultOggSeeker.this.streamReader.convertGranuleToTime(DefaultOggSeeker.this.totalGranules);
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j) {
            long jConvertTimeToGranule = DefaultOggSeeker.this.streamReader.convertTimeToGranule(j);
            return new SeekMap.SeekPoints(new SeekPoint(j, Util.constrainValue(((((DefaultOggSeeker.this.payloadEndPosition - DefaultOggSeeker.this.payloadStartPosition) * jConvertTimeToGranule) / DefaultOggSeeker.this.totalGranules) + DefaultOggSeeker.this.payloadStartPosition) - 30000, DefaultOggSeeker.this.payloadStartPosition, DefaultOggSeeker.this.payloadEndPosition - 1)));
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }
    }

    public DefaultOggSeeker(StreamReader streamReader, long j, long j2, long j3, long j4, boolean z) {
        Assertions.checkArgument(j >= 0 && j2 > j);
        this.streamReader = streamReader;
        this.payloadStartPosition = j;
        this.payloadEndPosition = j2;
        if (j3 != j2 - j && !z) {
            this.state = 0;
        } else {
            this.totalGranules = j4;
            this.state = 4;
        }
    }

    private long getNextSeekPosition(ExtractorInput extractorInput) throws InterruptedException, IOException {
        if (this.start == this.end) {
            return -1L;
        }
        long position = extractorInput.getPosition();
        if (!skipToNextPage(extractorInput, this.end)) {
            long j = this.start;
            if (j != position) {
                return j;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.pageHeader.populate(extractorInput, false);
        extractorInput.resetPeekPosition();
        long j2 = this.targetGranule;
        OggPageHeader oggPageHeader = this.pageHeader;
        long j3 = oggPageHeader.granulePosition;
        long j4 = j2 - j3;
        int i = oggPageHeader.headerSize + oggPageHeader.bodySize;
        if (0 <= j4 && j4 < 72000) {
            return -1L;
        }
        if (j4 < 0) {
            this.end = position;
            this.endGranule = j3;
        } else {
            this.start = extractorInput.getPosition() + ((long) i);
            this.startGranule = this.pageHeader.granulePosition;
        }
        long j5 = this.end;
        long j6 = this.start;
        if (j5 - j6 < 100000) {
            this.end = j6;
            return j6;
        }
        long position2 = extractorInput.getPosition() - (((long) i) * (j4 <= 0 ? 2L : 1L));
        long j7 = this.end;
        long j8 = this.start;
        return Util.constrainValue((((j7 - j8) * j4) / (this.endGranule - this.startGranule)) + position2, j8, j7 - 1);
    }

    private void skipToPageOfTargetGranule(ExtractorInput extractorInput) throws InterruptedException, IOException {
        OggPageHeader oggPageHeader = this.pageHeader;
        while (true) {
            oggPageHeader.populate(extractorInput, false);
            OggPageHeader oggPageHeader2 = this.pageHeader;
            if (oggPageHeader2.granulePosition > this.targetGranule) {
                extractorInput.resetPeekPosition();
                return;
            }
            extractorInput.skipFully(oggPageHeader2.headerSize + oggPageHeader2.bodySize);
            this.start = extractorInput.getPosition();
            oggPageHeader = this.pageHeader;
            this.startGranule = oggPageHeader.granulePosition;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
    public long read(ExtractorInput extractorInput) throws InterruptedException, IOException {
        int i = this.state;
        if (i == 0) {
            long position = extractorInput.getPosition();
            this.positionBeforeSeekToEnd = position;
            this.state = 1;
            long j = this.payloadEndPosition - 65307;
            if (j > position) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long nextSeekPosition = getNextSeekPosition(extractorInput);
                if (nextSeekPosition != -1) {
                    return nextSeekPosition;
                }
                this.state = 3;
            } else if (i != 3) {
                if (i == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            skipToPageOfTargetGranule(extractorInput);
            this.state = 4;
            return -(this.startGranule + 2);
        }
        this.totalGranules = readGranuleOfLastPage(extractorInput);
        this.state = 4;
        return this.positionBeforeSeekToEnd;
    }

    @VisibleForTesting
    public long readGranuleOfLastPage(ExtractorInput extractorInput) throws InterruptedException, IOException {
        skipToNextPage(extractorInput);
        this.pageHeader.reset();
        while ((this.pageHeader.type & 4) != 4 && extractorInput.getPosition() < this.payloadEndPosition) {
            this.pageHeader.populate(extractorInput, false);
            OggPageHeader oggPageHeader = this.pageHeader;
            extractorInput.skipFully(oggPageHeader.headerSize + oggPageHeader.bodySize);
        }
        return this.pageHeader.granulePosition;
    }

    @VisibleForTesting
    public void skipToNextPage(ExtractorInput extractorInput) throws InterruptedException, IOException {
        if (!skipToNextPage(extractorInput, this.payloadEndPosition)) {
            throw new EOFException();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
    public void startSeek(long j) {
        this.targetGranule = Util.constrainValue(j, 0L, this.totalGranules - 1);
        this.state = 2;
        this.start = this.payloadStartPosition;
        this.end = this.payloadEndPosition;
        this.startGranule = 0L;
        this.endGranule = this.totalGranules;
    }

    private boolean skipToNextPage(ExtractorInput extractorInput, long j) throws InterruptedException, IOException {
        int i;
        long jMin = Math.min(j + 3, this.payloadEndPosition);
        int position = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            int i2 = 0;
            if (extractorInput.getPosition() + ((long) position) > jMin && (position = (int) (jMin - extractorInput.getPosition())) < 4) {
                return false;
            }
            extractorInput.peekFully(bArr, 0, position, false);
            while (true) {
                i = position - 3;
                if (i2 < i) {
                    if (bArr[i2] == 79 && bArr[i2 + 1] == 103 && bArr[i2 + 2] == 103 && bArr[i2 + 3] == 83) {
                        extractorInput.skipFully(i2);
                        return true;
                    }
                    i2++;
                }
            }
            extractorInput.skipFully(i);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
    public OggSeekMap createSeekMap() {
        if (this.totalGranules != 0) {
            return new OggSeekMap();
        }
        return null;
    }
}
