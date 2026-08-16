package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class DHPrivateKeyParameters extends DHKeyParameters {

    /* JADX INFO: renamed from: x */
    private BigInteger f16318x;

    /* JADX WARN: Invalid debug info offset */
    public DHPrivateKeyParameters(BigInteger bigInteger, DHParameters dHParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.params.DHKeyParameters
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getX() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.params.DHKeyParameters
    public int hashCode() {
        return 0;
    }
}
