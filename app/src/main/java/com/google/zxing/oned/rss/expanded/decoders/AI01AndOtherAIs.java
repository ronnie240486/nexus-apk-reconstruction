package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;
import p000.C0305Ec;

/* JADX INFO: loaded from: classes2.dex */
final class AI01AndOtherAIs extends AI01decoder {
    private static final int HEADER_SIZE = 4;

    public AI01AndOtherAIs(BitArray bitArray) {
        super(bitArray);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder
    public String parseInformation() throws NotFoundException, FormatException {
        StringBuilder sbM1657a = C0305Ec.m1657a("(01)");
        int length = sbM1657a.length();
        sbM1657a.append(getGeneralDecoder().extractNumericValueFromBitArray(4, 4));
        encodeCompressedGtinWithoutAI(sbM1657a, 8, length);
        return getGeneralDecoder().decodeAllCodes(sbM1657a, 48);
    }
}
