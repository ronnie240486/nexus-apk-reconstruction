package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.FlacFrameReader;
import com.google.android.exoplayer2.extractor.FlacMetadataReader;
import com.google.android.exoplayer2.extractor.FlacSeekTableSeekMap;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.FlacStreamMetadata;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Arrays;
import p000.C4783m8;

/* JADX INFO: loaded from: classes2.dex */
final class FlacReader extends StreamReader {
    private static final byte AUDIO_PACKET_TYPE = -1;
    private static final int FRAME_HEADER_SAMPLE_NUMBER_OFFSET = 4;
    private FlacOggSeeker flacOggSeeker;
    private FlacStreamMetadata streamMetadata;

    public class FlacOggSeeker implements OggSeeker {
        private long firstFrameOffset = -1;
        private long pendingSeekGranule = -1;

        public FlacOggSeeker() {
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        public SeekMap createSeekMap() {
            Assertions.checkState(this.firstFrameOffset != -1);
            return new FlacSeekTableSeekMap(FlacReader.this.streamMetadata, this.firstFrameOffset);
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        public long read(ExtractorInput extractorInput) throws InterruptedException, IOException {
            long j = this.pendingSeekGranule;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.pendingSeekGranule = -1L;
            return j2;
        }

        public void setFirstFrameOffset(long j) {
            this.firstFrameOffset = j;
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.OggSeeker
        public void startSeek(long j) {
            Assertions.checkNotNull(FlacReader.this.streamMetadata.seekTable);
            long[] jArr = FlacReader.this.streamMetadata.seekTable.pointSampleNumbers;
            this.pendingSeekGranule = jArr[Util.binarySearchFloor(jArr, j, true, true)];
        }
    }

    private int getFlacFrameBlockSize(ParsableByteArray parsableByteArray) {
        int i = (parsableByteArray.data[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            parsableByteArray.skipBytes(4);
            parsableByteArray.readUtf8EncodedLong();
        }
        int frameBlockSizeSamplesFromKey = FlacFrameReader.readFrameBlockSizeSamplesFromKey(parsableByteArray, i);
        parsableByteArray.setPosition(0);
        return frameBlockSizeSamplesFromKey;
    }

    private static boolean isAudioPacket(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean verifyBitstreamType(ParsableByteArray parsableByteArray) {
        return parsableByteArray.bytesLeft() >= 5 && parsableByteArray.readUnsignedByte() == 127 && parsableByteArray.readUnsignedInt() == 1179402563;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    public long preparePayload(ParsableByteArray parsableByteArray) {
        if (isAudioPacket(parsableByteArray.data)) {
            return getFlacFrameBlockSize(parsableByteArray);
        }
        return -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    public boolean readHeaders(ParsableByteArray parsableByteArray, long j, StreamReader.SetupData setupData) {
        byte[] bArr = parsableByteArray.data;
        if (this.streamMetadata == null) {
            this.streamMetadata = new FlacStreamMetadata(bArr, 17);
            setupData.format = this.streamMetadata.getFormat(Arrays.copyOfRange(bArr, 9, parsableByteArray.limit()), null);
            return true;
        }
        if ((bArr[0] & C4783m8.f15111c) == 3) {
            this.flacOggSeeker = new FlacOggSeeker();
            this.streamMetadata = this.streamMetadata.copyWithSeekTable(FlacMetadataReader.readSeekTableMetadataBlock(parsableByteArray));
            return true;
        }
        if (!isAudioPacket(bArr)) {
            return true;
        }
        FlacOggSeeker flacOggSeeker = this.flacOggSeeker;
        if (flacOggSeeker != null) {
            flacOggSeeker.setFirstFrameOffset(j);
            setupData.oggSeeker = this.flacOggSeeker;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    public void reset(boolean z) {
        super.reset(z);
        if (z) {
            this.streamMetadata = null;
            this.flacOggSeeker = null;
        }
    }
}
