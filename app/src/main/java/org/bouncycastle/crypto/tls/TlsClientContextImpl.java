package org.bouncycastle.crypto.tls;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
class TlsClientContextImpl implements TlsClientContext {
    private SecureRandom secureRandom;
    private SecurityParameters securityParameters;
    private Object userObject;

    /* JADX WARN: Invalid debug info offset */
    public TlsClientContextImpl(SecureRandom secureRandom, SecurityParameters securityParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsClientContext
    public SecureRandom getSecureRandom() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsClientContext
    public SecurityParameters getSecurityParameters() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsClientContext
    public Object getUserObject() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.tls.TlsClientContext
    public void setUserObject(Object obj) {
    }
}
