package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes2.dex */
class TlsECDSASigner extends TlsDSASigner {
    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsDSASigner
    public DSA createDSAImpl() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsSigner
    public boolean isValidPublicKey(AsymmetricKeyParameter asymmetricKeyParameter) {
        return false;
    }
}
