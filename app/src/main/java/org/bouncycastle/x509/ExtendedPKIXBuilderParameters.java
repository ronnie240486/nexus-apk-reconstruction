package org.bouncycastle.x509;

import java.security.InvalidAlgorithmParameterException;
import java.security.cert.PKIXParameters;
import java.util.Set;
import org.bouncycastle.util.Selector;

/* JADX INFO: loaded from: classes2.dex */
public class ExtendedPKIXBuilderParameters extends ExtendedPKIXParameters {
    private Set excludedCerts;
    private int maxPathLength;

    /* JADX WARN: Invalid debug info offset */
    public ExtendedPKIXBuilderParameters(Set set, Selector selector) throws InvalidAlgorithmParameterException {
    }

    /* JADX WARN: Invalid debug info offset */
    public static ExtendedPKIXParameters getInstance(PKIXParameters pKIXParameters) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.x509.ExtendedPKIXParameters, java.security.cert.PKIXParameters, java.security.cert.CertPathParameters
    public Object clone() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Set getExcludedCerts() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getMaxPathLength() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setExcludedCerts(Set set) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setMaxPathLength(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.x509.ExtendedPKIXParameters
    public void setParams(PKIXParameters pKIXParameters) {
    }
}
