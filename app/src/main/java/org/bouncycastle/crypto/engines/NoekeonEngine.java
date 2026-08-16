package org.bouncycastle.crypto.engines;

import com.tencent.smtt.sdk.TbsListener;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes2.dex */
public class NoekeonEngine implements BlockCipher {
    private static final int genericSize = 16;
    private static final int[] nullVector = {0, 0, 0, 0};
    private static final int[] roundConstants = {128, 27, 54, 108, TbsListener.ErrorCode.INCR_UPDATE_ERROR, 171, 77, TbsListener.ErrorCode.STARTDOWNLOAD_NEEDDOWNLOAD_KEY_ERROR, 47, 94, 188, 99, 198, TbsListener.ErrorCode.NEEDDOWNLOAD_STATIC_INSTALLING, 53, TbsListener.ErrorCode.FILE_DELETED, 212};
    private boolean _forEncryption;
    private boolean _initialised;
    private int[] decryptKeys;
    private int[] state;
    private int[] subKeys;

    /* JADX WARN: Invalid debug info offset */
    private int bytesToIntBig(byte[] bArr, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int decryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int encryptBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private void gamma(int[] iArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void intToBytesBig(int i, byte[] bArr, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void pi1(int[] iArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void pi2(int[] iArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private int rotl(int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private void setKey(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void theta(int[] iArr, int[] iArr2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        return 0;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
