package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class DHPublicKeyParameters extends DHKeyParameters {

    /* JADX INFO: renamed from: y */
    private BigInteger f16319y;

    /* JADX WARN: Invalid debug info offset */
    public DHPublicKeyParameters(BigInteger bigInteger, DHParameters dHParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.params.DHKeyParameters
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getY() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.params.DHKeyParameters
    public int hashCode() {
        return 0;
    }
}
