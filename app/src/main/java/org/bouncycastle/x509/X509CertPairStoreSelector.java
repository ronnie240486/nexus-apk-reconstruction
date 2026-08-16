package org.bouncycastle.x509;

import org.bouncycastle.util.Selector;

/* JADX INFO: loaded from: classes2.dex */
public class X509CertPairStoreSelector implements Selector {
    private X509CertificatePair certPair;
    private X509CertStoreSelector forwardSelector;
    private X509CertStoreSelector reverseSelector;

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.util.Selector
    public Object clone() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509CertificatePair getCertPair() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509CertStoreSelector getForwardSelector() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509CertStoreSelector getReverseSelector() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.util.Selector
    public boolean match(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setCertPair(X509CertificatePair x509CertificatePair) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setForwardSelector(X509CertStoreSelector x509CertStoreSelector) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setReverseSelector(X509CertStoreSelector x509CertStoreSelector) {
    }
}
