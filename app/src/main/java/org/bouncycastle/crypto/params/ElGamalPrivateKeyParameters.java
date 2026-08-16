package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class ElGamalPrivateKeyParameters extends ElGamalKeyParameters {

    /* JADX INFO: renamed from: x */
    private BigInteger f16333x;

    /* JADX WARN: Invalid debug info offset */
    public ElGamalPrivateKeyParameters(BigInteger bigInteger, ElGamalParameters elGamalParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.params.ElGamalKeyParameters
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getX() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.params.ElGamalKeyParameters
    public int hashCode() {
        return 0;
    }
}
