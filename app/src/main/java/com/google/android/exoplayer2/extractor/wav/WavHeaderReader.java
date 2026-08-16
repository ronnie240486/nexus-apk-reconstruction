package com.google.android.exoplayer2.extractor.wav;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import p000.C5925b10;

/* JADX INFO: loaded from: classes2.dex */
final class WavHeaderReader {
    private static final String TAG = "WavHeaderReader";

    public static final class ChunkHeader {
        public static final int SIZE_IN_BYTES = 8;

        /* JADX INFO: renamed from: id */
        public final int f11076id;
        public final long size;

        private ChunkHeader(int i, long j) {
            this.f11076id = i;
            this.size = j;
        }

        public static ChunkHeader peek(ExtractorInput extractorInput, ParsableByteArray parsableByteArray) throws InterruptedException, IOException {
            extractorInput.peekFully(parsableByteArray.data, 0, 8);
            parsableByteArray.setPosition(0);
            return new ChunkHeader(parsableByteArray.readInt(), parsableByteArray.readLittleEndianUnsignedInt());
        }
    }

    private WavHeaderReader() {
    }

    @Nullable
    public static WavHeader peek(ExtractorInput extractorInput) throws InterruptedException, IOException {
        ChunkHeader chunkHeaderPeek;
        byte[] bArr;
        Assertions.checkNotNull(extractorInput);
        ParsableByteArray parsableByteArray = new ParsableByteArray(16);
        if (ChunkHeader.peek(extractorInput, parsableByteArray).f11076id != 1380533830) {
            return null;
        }
        extractorInput.peekFully(parsableByteArray.data, 0, 4);
        parsableByteArray.setPosition(0);
        int i = parsableByteArray.readInt();
        if (i != 1463899717) {
            Log.m17582e(TAG, "Unsupported RIFF format: " + i);
            return null;
        }
        while (true) {
            chunkHeaderPeek = ChunkHeader.peek(extractorInput, parsableByteArray);
            if (chunkHeaderPeek.f11076id == 1718449184) {
                break;
            }
            extractorInput.advancePeekPosition((int) chunkHeaderPeek.size);
        }
        Assertions.checkState(chunkHeaderPeek.size >= 16);
        extractorInput.peekFully(parsableByteArray.data, 0, 16);
        parsableByteArray.setPosition(0);
        int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort2 = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedIntToInt = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedIntToInt2 = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedShort3 = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort4 = parsableByteArray.readLittleEndianUnsignedShort();
        int i2 = ((int) chunkHeaderPeek.size) - 16;
        if (i2 > 0) {
            byte[] bArr2 = new byte[i2];
            extractorInput.peekFully(bArr2, 0, i2);
            bArr = bArr2;
        } else {
            bArr = Util.EMPTY_BYTE_ARRAY;
        }
        return new WavHeader(littleEndianUnsignedShort, littleEndianUnsignedShort2, littleEndianUnsignedIntToInt, littleEndianUnsignedIntToInt2, littleEndianUnsignedShort3, littleEndianUnsignedShort4, bArr);
    }

    public static Pair<Long, Long> skipToData(ExtractorInput extractorInput) throws InterruptedException, IOException {
        Assertions.checkNotNull(extractorInput);
        extractorInput.resetPeekPosition();
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        while (true) {
            ChunkHeader chunkHeaderPeek = ChunkHeader.peek(extractorInput, parsableByteArray);
            int i = chunkHeaderPeek.f11076id;
            if (i == 1684108385) {
                extractorInput.skipFully(8);
                long position = extractorInput.getPosition();
                long j = chunkHeaderPeek.size + position;
                long length = extractorInput.getLength();
                if (length != -1 && j > length) {
                    StringBuilder sbM14582a = C5925b10.m14582a("Data exceeds input length: ", j, ", ");
                    sbM14582a.append(length);
                    Log.m17586w(TAG, sbM14582a.toString());
                    j = length;
                }
                return Pair.create(Long.valueOf(position), Long.valueOf(j));
            }
            if (i != 1380533830 && i != 1718449184) {
                Log.m17586w(TAG, "Ignoring unknown WAV chunk: " + chunkHeaderPeek.f11076id);
            }
            long j2 = chunkHeaderPeek.size + 8;
            if (chunkHeaderPeek.f11076id == 1380533830) {
                j2 = 12;
            }
            if (j2 > 2147483647L) {
                throw new ParserException("Chunk is too large (~2GB+) to skip; id: " + chunkHeaderPeek.f11076id);
            }
            extractorInput.skipFully((int) j2);
        }
    }
}
