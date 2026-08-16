package com.google.zxing.oned.rss.expanded;

import com.afollestad.materialdialogs.BuildConfig;
import com.google.android.exoplayer2.extractor.p006ts.PsExtractor;
import com.google.android.exoplayer2.extractor.p006ts.TsExtractor;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.oned.OneDReader;
import com.google.zxing.oned.rss.AbstractRSSReader;
import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;
import com.google.zxing.oned.rss.RSSUtils;
import com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder;
import com.tencent.smtt.sdk.TbsListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.videolan.libvlc.util.VLCUtil;
import p000.C2935ap;

/* JADX INFO: loaded from: classes2.dex */
public final class RSSExpandedReader extends AbstractRSSReader {
    private static final int FINDER_PAT_A = 0;
    private static final int FINDER_PAT_B = 1;
    private static final int FINDER_PAT_C = 2;
    private static final int FINDER_PAT_D = 3;
    private static final int FINDER_PAT_E = 4;
    private static final int FINDER_PAT_F = 5;
    private static final int MAX_PAIRS = 11;
    private final List<ExpandedPair> pairs = new ArrayList(11);
    private final List<ExpandedRow> rows = new ArrayList();
    private final int[] startEnd = new int[2];
    private boolean startFromEven;
    private static final int[] SYMBOL_WIDEST = {7, 5, 4, 3, 1};
    private static final int[] EVEN_TOTAL_SUBSET = {4, 20, 52, 104, 204};
    private static final int[] GSUM = {0, 348, 1388, 2948, 3988};
    private static final int[][] FINDER_PATTERNS = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};
    private static final int[][] WEIGHTS = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, 7, 21, 63}, new int[]{PsExtractor.PRIVATE_STREAM_1, CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA, 13, 39, 117, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA, TbsListener.ErrorCode.DEXOPT_EXCEPTION, 205}, new int[]{193, 157, 49, CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, TbsListener.ErrorCode.DOWNLOAD_CDN_URL_IS_NULL}, new int[]{185, 133, 188, CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA, 4, 12, 36, 108}, new int[]{TbsListener.ErrorCode.DOWNLOAD_FILE_CONTENTLENGTH_NOT_MATCH, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, TbsListener.ErrorCode.DOWNLOAD_RETRYTIMES302_EXCEED, 158, 52, 156}, new int[]{46, 138, 203, 187, CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA, 206, 196, 166}, new int[]{76, 17, 51, TbsListener.ErrorCode.STARTDOWNLOAD_LOCKED_IO_FAILED, 37, 111, 122, TbsListener.ErrorCode.NO_NEED_STARTDOWNLOAD}, new int[]{43, 129, 176, TbsListener.ErrorCode.FILE_DELETED, TbsListener.ErrorCode.UNKNOWN_ERROR, 110, 119, CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA}, new int[]{16, 48, 144, 10, 30, 90, 59, TbsListener.ErrorCode.NONEEDDOWNLOAD_OTHER_PROCESS_DOWNLOADING}, new int[]{109, 116, 137, 200, TbsListener.ErrorCode.APP_SET_MIN_CORE_VER, TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW, TbsListener.ErrorCode.DOWNLOAD_THROWABLE, 164}, new int[]{70, 210, TbsListener.ErrorCode.EXCEED_DEXOPT_RETRY_NUM, 202, 184, 130, BuildConfig.f10535e, 115}, new int[]{134, 191, TbsListener.ErrorCode.NEEDDOWNLOAD_STATIC_INSTALLING, 31, 93, 68, 204, 190}, new int[]{CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA, 22, 66, 198, TsExtractor.TS_STREAM_TYPE_AC4, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, PsExtractor.AUDIO_STREAM, TbsListener.ErrorCode.STARTDOWNLOAD_NEEDDOWNLOAD_KEY_ERROR, 40}, new int[]{120, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, TbsListener.ErrorCode.UNZIP_OTHER_ERROR, 199, 175}, new int[]{103, 98, 83, 38, TbsListener.ErrorCode.DOWNLOAD_NOT_WIFI_ERROR, TbsListener.ErrorCode.DOWNLOAD_USER_CANCEL, 182, TbsListener.ErrorCode.DOWNLOAD_REDIRECT_EMPTY}, new int[]{161, 61, VLCUtil.f17717i, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};
    private static final int[][] FINDER_PATTERN_SEQUENCES = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    private void adjustOddEvenCounts(int i) throws NotFoundException {
        boolean z;
        boolean z2;
        boolean z3;
        int iSum = MathUtils.sum(getOddCounts());
        int iSum2 = MathUtils.sum(getEvenCounts());
        boolean z4 = true;
        if (iSum > 13) {
            z4 = false;
            z = true;
        } else {
            z4 = iSum < 4;
            z = false;
        }
        if (iSum2 > 13) {
            z2 = false;
            z3 = true;
        } else {
            z2 = iSum2 < 4;
            z3 = false;
        }
        int i2 = (iSum + iSum2) - i;
        boolean z5 = (iSum & 1) == 1;
        boolean z6 = (iSum2 & 1) == 0;
        if (i2 == 1) {
            if (z5) {
                if (z6) {
                    throw NotFoundException.getNotFoundInstance();
                }
                z = true;
            } else {
                if (!z6) {
                    throw NotFoundException.getNotFoundInstance();
                }
                z4 = z4;
                z3 = true;
            }
        } else if (i2 == -1) {
            if (z5) {
                if (z6) {
                    throw NotFoundException.getNotFoundInstance();
                }
            } else {
                if (!z6) {
                    throw NotFoundException.getNotFoundInstance();
                }
                z4 = z4;
                z2 = true;
            }
        } else {
            if (i2 != 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (z5) {
                if (!z6) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (iSum < iSum2) {
                    z3 = true;
                } else {
                    z2 = true;
                    z = true;
                }
            } else {
                if (z6) {
                    throw NotFoundException.getNotFoundInstance();
                }
                z4 = z4;
            }
        }
        if (z4) {
            if (z) {
                throw NotFoundException.getNotFoundInstance();
            }
            AbstractRSSReader.increment(getOddCounts(), getOddRoundingErrors());
        }
        if (z) {
            AbstractRSSReader.decrement(getOddCounts(), getOddRoundingErrors());
        }
        if (z2) {
            if (z3) {
                throw NotFoundException.getNotFoundInstance();
            }
            AbstractRSSReader.increment(getEvenCounts(), getOddRoundingErrors());
        }
        if (z3) {
            AbstractRSSReader.decrement(getEvenCounts(), getEvenRoundingErrors());
        }
    }

    private boolean checkChecksum() {
        ExpandedPair expandedPair = this.pairs.get(0);
        DataCharacter leftChar = expandedPair.getLeftChar();
        DataCharacter rightChar = expandedPair.getRightChar();
        if (rightChar == null) {
            return false;
        }
        int checksumPortion = rightChar.getChecksumPortion();
        int i = 2;
        for (int i2 = 1; i2 < this.pairs.size(); i2++) {
            ExpandedPair expandedPair2 = this.pairs.get(i2);
            int checksumPortion2 = expandedPair2.getLeftChar().getChecksumPortion() + checksumPortion;
            int i3 = i + 1;
            DataCharacter rightChar2 = expandedPair2.getRightChar();
            if (rightChar2 != null) {
                checksumPortion = rightChar2.getChecksumPortion() + checksumPortion2;
                i += 2;
            } else {
                i = i3;
                checksumPortion = checksumPortion2;
            }
        }
        return ((i + (-4)) * TbsListener.ErrorCode.EXCEED_COPY_RETRY_NUM) + (checksumPortion % TbsListener.ErrorCode.EXCEED_COPY_RETRY_NUM) == leftChar.getValue();
    }

    private List<ExpandedPair> checkRows(List<ExpandedRow> list, int i) throws NotFoundException {
        while (i < this.rows.size()) {
            ExpandedRow expandedRow = this.rows.get(i);
            this.pairs.clear();
            Iterator<ExpandedRow> it = list.iterator();
            while (it.hasNext()) {
                this.pairs.addAll(it.next().getPairs());
            }
            this.pairs.addAll(expandedRow.getPairs());
            if (isValidSequence(this.pairs)) {
                if (checkChecksum()) {
                    return this.pairs;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(list);
                arrayList.add(expandedRow);
                try {
                    return checkRows(arrayList, i + 1);
                } catch (NotFoundException unused) {
                    continue;
                }
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static Result constructResult(List<ExpandedPair> list) throws NotFoundException, FormatException {
        String information = AbstractExpandedDecoder.createDecoder(BitArrayBuilder.buildBitArray(list)).parseInformation();
        ResultPoint[] resultPoints = list.get(0).getFinderPattern().getResultPoints();
        ResultPoint[] resultPoints2 = ((ExpandedPair) C2935ap.m14540a(list, 1)).getFinderPattern().getResultPoints();
        return new Result(information, null, new ResultPoint[]{resultPoints[0], resultPoints[1], resultPoints2[0], resultPoints2[1]}, BarcodeFormat.RSS_EXPANDED);
    }

    private void findNextPair(BitArray bitArray, List<ExpandedPair> list, int i) throws NotFoundException {
        int[] decodeFinderCounters = getDecodeFinderCounters();
        decodeFinderCounters[0] = 0;
        decodeFinderCounters[1] = 0;
        decodeFinderCounters[2] = 0;
        decodeFinderCounters[3] = 0;
        int size = bitArray.getSize();
        if (i < 0) {
            i = list.isEmpty() ? 0 : ((ExpandedPair) C2935ap.m14540a(list, 1)).getFinderPattern().getStartEnd()[1];
        }
        boolean z = list.size() % 2 != 0;
        if (this.startFromEven) {
            z = !z;
        }
        boolean z2 = false;
        while (i < size) {
            z2 = !bitArray.get(i);
            if (!z2) {
                break;
            } else {
                i++;
            }
        }
        boolean z3 = z2;
        int i2 = 0;
        int i3 = i;
        while (i < size) {
            if (bitArray.get(i) ^ z3) {
                decodeFinderCounters[i2] = decodeFinderCounters[i2] + 1;
            } else {
                if (i2 == 3) {
                    if (z) {
                        reverseCounters(decodeFinderCounters);
                    }
                    if (AbstractRSSReader.isFinderPattern(decodeFinderCounters)) {
                        int[] iArr = this.startEnd;
                        iArr[0] = i3;
                        iArr[1] = i;
                        return;
                    }
                    if (z) {
                        reverseCounters(decodeFinderCounters);
                    }
                    i3 += decodeFinderCounters[0] + decodeFinderCounters[1];
                    decodeFinderCounters[0] = decodeFinderCounters[2];
                    decodeFinderCounters[1] = decodeFinderCounters[3];
                    decodeFinderCounters[2] = 0;
                    decodeFinderCounters[3] = 0;
                    i2--;
                } else {
                    i2++;
                }
                decodeFinderCounters[i2] = 1;
                z3 = !z3;
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int getNextSecondBar(BitArray bitArray, int i) {
        return bitArray.get(i) ? bitArray.getNextSet(bitArray.getNextUnset(i)) : bitArray.getNextUnset(bitArray.getNextSet(i));
    }

    private static boolean isNotA1left(FinderPattern finderPattern, boolean z, boolean z2) {
        return (finderPattern.getValue() == 0 && z && z2) ? false : true;
    }

    private static boolean isPartialRow(Iterable<ExpandedPair> iterable, Iterable<ExpandedRow> iterable2) {
        for (ExpandedRow expandedRow : iterable2) {
            for (ExpandedPair expandedPair : iterable) {
                Iterator<ExpandedPair> it = expandedRow.getPairs().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (expandedPair.equals(it.next())) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    private static boolean isValidSequence(List<ExpandedPair> list) {
        for (int[] iArr : FINDER_PATTERN_SEQUENCES) {
            if (list.size() <= iArr.length) {
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getFinderPattern().getValue() == iArr[i]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    private FinderPattern parseFoundFinderPattern(BitArray bitArray, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.startEnd[0] - 1;
            while (i5 >= 0 && !bitArray.get(i5)) {
                i5--;
            }
            int i6 = i5 + 1;
            int[] iArr = this.startEnd;
            i4 = iArr[0] - i6;
            i2 = iArr[1];
            i3 = i6;
        } else {
            int[] iArr2 = this.startEnd;
            int i7 = iArr2[0];
            int nextUnset = bitArray.getNextUnset(iArr2[1] + 1);
            i2 = nextUnset;
            i3 = i7;
            i4 = nextUnset - this.startEnd[1];
        }
        int[] decodeFinderCounters = getDecodeFinderCounters();
        System.arraycopy(decodeFinderCounters, 0, decodeFinderCounters, 1, decodeFinderCounters.length - 1);
        decodeFinderCounters[0] = i4;
        try {
            return new FinderPattern(AbstractRSSReader.parseFinderValue(decodeFinderCounters, FINDER_PATTERNS), new int[]{i3, i2}, i3, i2, i);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    private static void removePartialRows(List<ExpandedPair> list, List<ExpandedRow> list2) {
        Iterator<ExpandedRow> it = list2.iterator();
        while (it.hasNext()) {
            ExpandedRow next = it.next();
            if (next.getPairs().size() != list.size()) {
                Iterator<ExpandedPair> it2 = next.getPairs().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        it.remove();
                        break;
                    }
                    ExpandedPair next2 = it2.next();
                    Iterator<ExpandedPair> it3 = list.iterator();
                    do {
                        if (!it3.hasNext()) {
                            break;
                        }
                    } while (!next2.equals(it3.next()));
                }
            }
        }
    }

    private static void reverseCounters(int[] iArr) {
        int length = iArr.length;
        for (int i = 0; i < length / 2; i++) {
            int i2 = iArr[i];
            int i3 = (length - i) - 1;
            iArr[i] = iArr[i3];
            iArr[i3] = i2;
        }
    }

    private void storeRow(int i, boolean z) {
        boolean zIsEquivalent = false;
        int i2 = 0;
        boolean zIsEquivalent2 = false;
        while (i2 < this.rows.size()) {
            ExpandedRow expandedRow = this.rows.get(i2);
            if (expandedRow.getRowNumber() > i) {
                zIsEquivalent = expandedRow.isEquivalent(this.pairs);
                break;
            } else {
                zIsEquivalent2 = expandedRow.isEquivalent(this.pairs);
                i2++;
            }
        }
        if (zIsEquivalent || zIsEquivalent2 || isPartialRow(this.pairs, this.rows)) {
            return;
        }
        this.rows.add(i2, new ExpandedRow(this.pairs, i, z));
        removePartialRows(this.pairs, this.rows);
    }

    public DataCharacter decodeDataCharacter(BitArray bitArray, FinderPattern finderPattern, boolean z, boolean z2) throws NotFoundException {
        int[] dataCharacterCounters = getDataCharacterCounters();
        dataCharacterCounters[0] = 0;
        dataCharacterCounters[1] = 0;
        dataCharacterCounters[2] = 0;
        dataCharacterCounters[3] = 0;
        dataCharacterCounters[4] = 0;
        dataCharacterCounters[5] = 0;
        dataCharacterCounters[6] = 0;
        dataCharacterCounters[7] = 0;
        int[] startEnd = finderPattern.getStartEnd();
        if (z2) {
            OneDReader.recordPatternInReverse(bitArray, startEnd[0], dataCharacterCounters);
        } else {
            OneDReader.recordPattern(bitArray, startEnd[1], dataCharacterCounters);
            int i = 0;
            for (int length = dataCharacterCounters.length - 1; i < length; length--) {
                int i2 = dataCharacterCounters[i];
                dataCharacterCounters[i] = dataCharacterCounters[length];
                dataCharacterCounters[length] = i2;
                i++;
            }
        }
        float fSum = MathUtils.sum(dataCharacterCounters) / 17.0f;
        float f = (finderPattern.getStartEnd()[1] - finderPattern.getStartEnd()[0]) / 15.0f;
        if (Math.abs(fSum - f) / f > 0.3f) {
            throw NotFoundException.getNotFoundInstance();
        }
        int[] oddCounts = getOddCounts();
        int[] evenCounts = getEvenCounts();
        float[] oddRoundingErrors = getOddRoundingErrors();
        float[] evenRoundingErrors = getEvenRoundingErrors();
        for (int i3 = 0; i3 < dataCharacterCounters.length; i3++) {
            float f2 = (dataCharacterCounters[i3] * 1.0f) / fSum;
            int i4 = (int) (0.5f + f2);
            if (i4 <= 0) {
                if (f2 < 0.3f) {
                    throw NotFoundException.getNotFoundInstance();
                }
                i4 = 1;
            } else if (i4 > 8) {
                if (f2 > 8.7f) {
                    throw NotFoundException.getNotFoundInstance();
                }
                i4 = 8;
            }
            int i5 = i3 / 2;
            if ((i3 & 1) == 0) {
                oddCounts[i5] = i4;
                oddRoundingErrors[i5] = f2 - i4;
            } else {
                evenCounts[i5] = i4;
                evenRoundingErrors[i5] = f2 - i4;
            }
        }
        adjustOddEvenCounts(17);
        int value = (((finderPattern.getValue() * 4) + (z ? 0 : 2)) + (!z2 ? 1 : 0)) - 1;
        int i6 = 0;
        int i7 = 0;
        for (int length2 = oddCounts.length - 1; length2 >= 0; length2--) {
            if (isNotA1left(finderPattern, z, z2)) {
                i6 += oddCounts[length2] * WEIGHTS[value][length2 * 2];
            }
            i7 += oddCounts[length2];
        }
        int i8 = 0;
        for (int length3 = evenCounts.length - 1; length3 >= 0; length3--) {
            if (isNotA1left(finderPattern, z, z2)) {
                i8 += evenCounts[length3] * WEIGHTS[value][(length3 * 2) + 1];
            }
        }
        int i9 = i6 + i8;
        if ((i7 & 1) != 0 || i7 > 13 || i7 < 4) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i10 = (13 - i7) / 2;
        int i11 = SYMBOL_WIDEST[i10];
        return new DataCharacter((RSSUtils.getRSSvalue(oddCounts, i11, true) * EVEN_TOTAL_SUBSET[i10]) + RSSUtils.getRSSvalue(evenCounts, 9 - i11, false) + GSUM[i10], i9);
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        this.pairs.clear();
        this.startFromEven = false;
        try {
            return constructResult(decodeRow2pairs(i, bitArray));
        } catch (NotFoundException unused) {
            this.pairs.clear();
            this.startFromEven = true;
            return constructResult(decodeRow2pairs(i, bitArray));
        }
    }

    public List<ExpandedPair> decodeRow2pairs(int i, BitArray bitArray) throws NotFoundException {
        while (true) {
            try {
                this.pairs.add(retrieveNextPair(bitArray, this.pairs, i));
            } catch (NotFoundException e) {
                if (this.pairs.isEmpty()) {
                    throw e;
                }
                if (checkChecksum()) {
                    return this.pairs;
                }
                boolean z = !this.rows.isEmpty();
                storeRow(i, false);
                if (z) {
                    List<ExpandedPair> listCheckRows = checkRows(false);
                    if (listCheckRows != null) {
                        return listCheckRows;
                    }
                    List<ExpandedPair> listCheckRows2 = checkRows(true);
                    if (listCheckRows2 != null) {
                        return listCheckRows2;
                    }
                }
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }

    public List<ExpandedRow> getRows() {
        return this.rows;
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public void reset() {
        this.pairs.clear();
        this.rows.clear();
    }

    public ExpandedPair retrieveNextPair(BitArray bitArray, List<ExpandedPair> list, int i) throws NotFoundException {
        FinderPattern foundFinderPattern;
        DataCharacter dataCharacterDecodeDataCharacter;
        boolean z = list.size() % 2 == 0;
        if (this.startFromEven) {
            z = !z;
        }
        int nextSecondBar = -1;
        boolean z2 = true;
        do {
            findNextPair(bitArray, list, nextSecondBar);
            foundFinderPattern = parseFoundFinderPattern(bitArray, i, z);
            if (foundFinderPattern == null) {
                nextSecondBar = getNextSecondBar(bitArray, this.startEnd[0]);
            } else {
                z2 = false;
            }
        } while (z2);
        DataCharacter dataCharacterDecodeDataCharacter2 = decodeDataCharacter(bitArray, foundFinderPattern, z, true);
        if (!list.isEmpty() && ((ExpandedPair) C2935ap.m14540a(list, 1)).mustBeLast()) {
            throw NotFoundException.getNotFoundInstance();
        }
        try {
            dataCharacterDecodeDataCharacter = decodeDataCharacter(bitArray, foundFinderPattern, z, false);
        } catch (NotFoundException unused) {
            dataCharacterDecodeDataCharacter = null;
        }
        return new ExpandedPair(dataCharacterDecodeDataCharacter2, dataCharacterDecodeDataCharacter, foundFinderPattern, true);
    }

    private List<ExpandedPair> checkRows(boolean z) {
        List<ExpandedPair> listCheckRows = null;
        if (this.rows.size() > 25) {
            this.rows.clear();
            return null;
        }
        this.pairs.clear();
        if (z) {
            Collections.reverse(this.rows);
        }
        try {
            listCheckRows = checkRows(new ArrayList(), 0);
        } catch (NotFoundException unused) {
        }
        if (z) {
            Collections.reverse(this.rows);
        }
        return listCheckRows;
    }
}
