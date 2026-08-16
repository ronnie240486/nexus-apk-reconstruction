package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class Sniffer {
    private static final int[] COMPATIBLE_BRANDS = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, Atom.TYPE_avc1, Atom.TYPE_hvc1, Atom.TYPE_hev1, Atom.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    private static final int SEARCH_LENGTH = 4096;

    private Sniffer() {
    }

    private static boolean isCompatibleBrand(int i) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        for (int i2 : COMPATIBLE_BRANDS) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean sniffFragmented(ExtractorInput extractorInput) throws InterruptedException, IOException {
        return sniffInternal(extractorInput, true);
    }

    private static boolean sniffInternal(ExtractorInput extractorInput, boolean z) throws InterruptedException, IOException {
        boolean z2;
        boolean z3;
        int i;
        long length = extractorInput.getLength();
        long j = 4096;
        long j2 = -1;
        if (length != -1 && length <= 4096) {
            j = length;
        }
        int i2 = (int) j;
        ParsableByteArray parsableByteArray = new ParsableByteArray(64);
        boolean z4 = false;
        int i3 = 0;
        boolean z5 = false;
        while (true) {
            if (i3 < i2) {
                parsableByteArray.reset(8);
                if (extractorInput.peekFully(parsableByteArray.data, z4 ? 1 : 0, 8, true)) {
                    long unsignedInt = parsableByteArray.readUnsignedInt();
                    int i4 = parsableByteArray.readInt();
                    if (unsignedInt == 1) {
                        extractorInput.peekFully(parsableByteArray.data, 8, 8);
                        parsableByteArray.setLimit(16);
                        unsignedInt = parsableByteArray.readLong();
                        i = 16;
                    } else {
                        if (unsignedInt == 0) {
                            long length2 = extractorInput.getLength();
                            if (length2 != j2) {
                                unsignedInt = ((long) 8) + (length2 - extractorInput.getPeekPosition());
                            }
                        }
                        i = 8;
                    }
                    long j3 = i;
                    if (unsignedInt < j3) {
                        return z4;
                    }
                    i3 += i;
                    if (i4 == 1836019574) {
                        i2 += (int) unsignedInt;
                        if (length != j2 && i2 > length) {
                            i2 = (int) length;
                        }
                    } else {
                        if (i4 == 1836019558 || i4 == 1836475768) {
                            z2 = true;
                            z3 = true;
                            if (z5 || z != z3) {
                                return false;
                            }
                            return z2;
                        }
                        if ((((long) i3) + unsignedInt) - j3 < i2) {
                            int i5 = (int) (unsignedInt - j3);
                            i3 += i5;
                            if (i4 == 1718909296) {
                                if (i5 < 8) {
                                    return false;
                                }
                                parsableByteArray.reset(i5);
                                extractorInput.peekFully(parsableByteArray.data, 0, i5);
                                int i6 = i5 / 4;
                                for (int i7 = 0; i7 < i6; i7++) {
                                    if (i7 != 1) {
                                        if (isCompatibleBrand(parsableByteArray.readInt())) {
                                            z5 = true;
                                            break;
                                        }
                                    } else {
                                        parsableByteArray.skipBytes(4);
                                    }
                                }
                                if (!z5) {
                                    return false;
                                }
                            } else if (i5 != 0) {
                                extractorInput.advancePeekPosition(i5);
                            }
                            j2 = -1;
                            z4 = false;
                        }
                    }
                }
            }
            z2 = true;
            z3 = false;
            if (z5) {
            }
            return false;
        }
    }

    public static boolean sniffUnfragmented(ExtractorInput extractorInput) throws InterruptedException, IOException {
        return sniffInternal(extractorInput, false);
    }
}
