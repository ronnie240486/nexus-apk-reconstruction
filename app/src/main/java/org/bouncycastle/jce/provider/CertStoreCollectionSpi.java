package org.bouncycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CRLSelector;
import java.security.cert.CertSelector;
import java.security.cert.CertStoreException;
import java.security.cert.CertStoreParameters;
import java.security.cert.CertStoreSpi;
import java.security.cert.CollectionCertStoreParameters;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public class CertStoreCollectionSpi extends CertStoreSpi {
    private CollectionCertStoreParameters params;

    /* JADX WARN: Invalid debug info offset */
    public CertStoreCollectionSpi(CertStoreParameters certStoreParameters) throws InvalidAlgorithmParameterException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.CertStoreSpi
    public Collection engineGetCRLs(CRLSelector cRLSelector) throws CertStoreException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.cert.CertStoreSpi
    public Collection engineGetCertificates(CertSelector certSelector) throws CertStoreException {
        return null;
    }
}
