package com.google.android.exoplayer2.audio;

import android.media.ViviTV.viewholders.BaseHomeRecyclerViewHolder;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.tencent.smtt.sdk.TbsListener;
import java.nio.ByteBuffer;
import p000.C1579YX;

/* JADX INFO: loaded from: classes2.dex */
public final class Ac4Util {
    public static final int AC40_SYNCWORD = 44096;
    public static final int AC41_SYNCWORD = 44097;
    private static final int CHANNEL_COUNT_2 = 2;
    public static final int HEADER_SIZE_FOR_PARSER = 16;
    private static final int[] SAMPLE_COUNT = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, BaseHomeRecyclerViewHolder.f9761h, TbsListener.ErrorCode.INFO_CODE_BASE, TbsListener.ErrorCode.INFO_CODE_BASE, 2048};
    public static final int SAMPLE_HEADER_SIZE = 7;

    public static final class SyncFrameInfo {
        public final int bitstreamVersion;
        public final int channelCount;
        public final int frameSize;
        public final int sampleCount;
        public final int sampleRate;

        private SyncFrameInfo(int i, int i2, int i3, int i4, int i5) {
            this.bitstreamVersion = i;
            this.channelCount = i2;
            this.sampleRate = i3;
            this.frameSize = i4;
            this.sampleCount = i5;
        }
    }

    private Ac4Util() {
    }

    public static void getAc4SampleHeader(int i, ParsableByteArray parsableByteArray) {
        parsableByteArray.reset(7);
        byte[] bArr = parsableByteArray.data;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    public static Format parseAc4AnnexEFormat(ParsableByteArray parsableByteArray, String str, String str2, @Nullable DrmInitData drmInitData) {
        parsableByteArray.skipBytes(1);
        return Format.createAudioSampleFormat(str, MimeTypes.AUDIO_AC4, null, -1, -1, 2, ((parsableByteArray.readUnsignedByte() & 32) >> 5) == 1 ? 48000 : 44100, null, drmInitData, 0, str2);
    }

    public static int parseAc4SyncframeAudioSampleCount(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return parseAc4SyncframeInfo(new ParsableBitArray(bArr)).sampleCount;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0094  */
    public static SyncFrameInfo parseAc4SyncframeInfo(ParsableBitArray parsableBitArray) {
        int i;
        int i2;
        int bits = parsableBitArray.readBits(16);
        int bits2 = parsableBitArray.readBits(16);
        if (bits2 == 65535) {
            bits2 = parsableBitArray.readBits(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = bits2 + i;
        if (bits == 44097) {
            i3 += 2;
        }
        int i4 = i3;
        int bits3 = parsableBitArray.readBits(2);
        if (bits3 == 3) {
            bits3 += readVariableBits(parsableBitArray, 2);
        }
        int i5 = bits3;
        int bits4 = parsableBitArray.readBits(10);
        if (parsableBitArray.readBit() && parsableBitArray.readBits(3) > 0) {
            parsableBitArray.skipBits(2);
        }
        int i6 = parsableBitArray.readBit() ? 48000 : 44100;
        int bits5 = parsableBitArray.readBits(4);
        if (i6 == 44100 && bits5 == 13) {
            i2 = SAMPLE_COUNT[bits5];
        } else if (i6 == 48000) {
            int[] iArr = SAMPLE_COUNT;
            if (bits5 < iArr.length) {
                int i7 = iArr[bits5];
                int i8 = bits4 % 5;
                if (i8 == 1) {
                    if (bits5 != 3 || bits5 == 8) {
                        i7++;
                    }
                } else if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 == 4 && (bits5 == 3 || bits5 == 8 || bits5 == 11)) {
                            i7++;
                        }
                    } else if (bits5 != 3) {
                        i7++;
                    } else {
                        i7++;
                    }
                } else if (bits5 == 8 || bits5 == 11) {
                    i7++;
                }
                i2 = i7;
            } else {
                i2 = 0;
            }
        } else {
            i2 = 0;
        }
        return new SyncFrameInfo(i5, 2, i6, i4, i2);
    }

    public static int parseAc4SyncframeSize(byte[] bArr, int i) {
        int i2 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i3 = ((bArr[2] & C1579YX.f3960d) << 8) | (bArr[3] & C1579YX.f3960d);
        if (i3 == 65535) {
            i3 = ((bArr[4] & C1579YX.f3960d) << 16) | ((bArr[5] & C1579YX.f3960d) << 8) | (bArr[6] & C1579YX.f3960d);
        } else {
            i2 = 4;
        }
        if (i == 44097) {
            i2 += 2;
        }
        return i3 + i2;
    }

    private static int readVariableBits(ParsableBitArray parsableBitArray, int i) {
        int i2 = 0;
        while (true) {
            int bits = parsableBitArray.readBits(i) + i2;
            if (!parsableBitArray.readBit()) {
                return bits;
            }
            i2 = (bits + 1) << i;
        }
    }
}
