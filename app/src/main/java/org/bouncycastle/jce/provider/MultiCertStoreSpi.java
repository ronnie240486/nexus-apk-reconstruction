package org.bouncycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CRLSelector;
import java.security.cert.CertSelector;
import java.security.cert.CertStoreException;
import java.security.cert.CertStoreParameters;
import java.security.cert.CertStoreSpi;
import java.util.Collection;
import org.bouncycastle.jce.MultiCertStoreParameters;

/* JADX INFO: loaded from: classes2.dex */
public class MultiCertStoreSpi extends CertStoreSpi {
    private MultiCertStoreParameters params;

    /* JADX WARN: Invalid debug info offset */
    public MultiCertStoreSpi(CertStoreParameters certStoreParameters) throws InvalidAlgorithmParameterException {
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
