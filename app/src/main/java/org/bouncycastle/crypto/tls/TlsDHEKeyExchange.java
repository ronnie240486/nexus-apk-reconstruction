package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.Signer;

/* JADX INFO: loaded from: classes2.dex */
class TlsDHEKeyExchange extends TlsDHKeyExchange {
    /* JADX WARN: Invalid debug info offset */
    public TlsDHEKeyExchange(TlsClientContext tlsClientContext, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Signer initSigner(TlsSigner tlsSigner, SecurityParameters securityParameters) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsDHKeyExchange, org.bouncycastle.crypto.tls.TlsKeyExchange
    public void processServerKeyExchange(InputStream inputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsDHKeyExchange, org.bouncycastle.crypto.tls.TlsKeyExchange
    public void skipServerKeyExchange() throws IOException {
    }
}
