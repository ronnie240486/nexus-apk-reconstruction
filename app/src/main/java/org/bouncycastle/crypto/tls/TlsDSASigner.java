package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes2.dex */
abstract class TlsDSASigner implements TlsSigner {
    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsSigner
    public byte[] calculateRawSignature(SecureRandom secureRandom, AsymmetricKeyParameter asymmetricKeyParameter, byte[] bArr) throws CryptoException {
        return null;
    }

    public abstract DSA createDSAImpl();

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsSigner
    public Signer createVerifyer(AsymmetricKeyParameter asymmetricKeyParameter) {
        return null;
    }
}
