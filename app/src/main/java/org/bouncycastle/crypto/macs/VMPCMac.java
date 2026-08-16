package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public class VMPCMac implements Mac {

    /* JADX INFO: renamed from: P */
    private byte[] f16282P;

    /* JADX INFO: renamed from: T */
    private byte[] f16283T;

    /* JADX INFO: renamed from: g */
    private byte f16284g;

    /* JADX INFO: renamed from: n */
    private byte f16285n;

    /* JADX INFO: renamed from: s */
    private byte f16286s;
    private byte[] workingIV;
    private byte[] workingKey;

    /* JADX INFO: renamed from: x1 */
    private byte f16287x1;

    /* JADX INFO: renamed from: x2 */
    private byte f16288x2;

    /* JADX INFO: renamed from: x3 */
    private byte f16289x3;

    /* JADX INFO: renamed from: x4 */
    private byte f16290x4;

    /* JADX WARN: Invalid debug info offset */
    private void initKey(byte[] bArr, byte[] bArr2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, DataLengthException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b) throws IllegalStateException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) throws IllegalStateException, DataLengthException {
    }
}
