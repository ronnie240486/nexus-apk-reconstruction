package com.google.zxing.datamatrix.encoder;

import com.tencent.smtt.sdk.TbsListener;

/* JADX INFO: loaded from: classes2.dex */
final class DataMatrixSymbolInfo144 extends SymbolInfo {
    public DataMatrixSymbolInfo144() {
        super(false, 1558, TbsListener.ErrorCode.STATIC_TBS_INSTALL_MAKE_TMP_FAILURE, 22, 22, 36, -1, 62);
    }

    @Override // com.google.zxing.datamatrix.encoder.SymbolInfo
    public int getDataLengthForInterleavedBlock(int i) {
        if (i <= 8) {
            return 156;
        }
        return TbsListener.ErrorCode.NO_NEED_STARTDOWNLOAD;
    }

    @Override // com.google.zxing.datamatrix.encoder.SymbolInfo
    public int getInterleavedBlockCount() {
        return 10;
    }
}
