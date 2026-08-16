package org.bouncycastle.jce;

import java.security.cert.CertStoreParameters;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public class MultiCertStoreParameters implements CertStoreParameters {
    private Collection certStores;
    private boolean searchAllStores;

    /* JADX WARN: Invalid debug info offset */
    public MultiCertStoreParameters(Collection collection) {
    }

    /* JADX WARN: Invalid debug info offset */
    public MultiCertStoreParameters(Collection collection, boolean z) {
    }

    @Override // java.security.cert.CertStoreParameters
    public Object clone() {
        return this;
    }

    /* JADX WARN: Invalid debug info offset */
    public Collection getCertStores() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean getSearchAllStores() {
        return false;
    }
}
