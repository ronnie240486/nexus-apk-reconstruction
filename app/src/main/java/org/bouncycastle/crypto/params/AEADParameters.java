package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes2.dex */
public class AEADParameters implements CipherParameters {
    private byte[] associatedText;
    private KeyParameter key;
    private int macSize;
    private byte[] nonce;

    /* JADX WARN: Invalid debug info offset */
    public AEADParameters(KeyParameter keyParameter, int i, byte[] bArr, byte[] bArr2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getAssociatedText() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public KeyParameter getKey() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getMacSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getNonce() {
        return null;
    }
}
