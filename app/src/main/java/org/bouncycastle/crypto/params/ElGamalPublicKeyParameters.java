package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class ElGamalPublicKeyParameters extends ElGamalKeyParameters {

    /* JADX INFO: renamed from: y */
    private BigInteger f16334y;

    /* JADX WARN: Invalid debug info offset */
    public ElGamalPublicKeyParameters(BigInteger bigInteger, ElGamalParameters elGamalParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.params.ElGamalKeyParameters
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getY() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.params.ElGamalKeyParameters
    public int hashCode() {
        return 0;
    }
}
