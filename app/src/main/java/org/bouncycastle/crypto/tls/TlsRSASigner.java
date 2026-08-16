package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes2.dex */
class TlsRSASigner implements TlsSigner {
    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsSigner
    public byte[] calculateRawSignature(SecureRandom secureRandom, AsymmetricKeyParameter asymmetricKeyParameter, byte[] bArr) throws CryptoException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsSigner
    public Signer createVerifyer(AsymmetricKeyParameter asymmetricKeyParameter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsSigner
    public boolean isValidPublicKey(AsymmetricKeyParameter asymmetricKeyParameter) {
        return false;
    }
}
