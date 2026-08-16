package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes2.dex */
public class DHParameters implements CipherParameters {
    private static final int DEFAULT_MINIMUM_LENGTH = 160;

    /* JADX INFO: renamed from: g */
    private BigInteger f16312g;

    /* JADX INFO: renamed from: j */
    private BigInteger f16313j;

    /* JADX INFO: renamed from: l */
    private int f16314l;

    /* JADX INFO: renamed from: m */
    private int f16315m;

    /* JADX INFO: renamed from: p */
    private BigInteger f16316p;

    /* JADX INFO: renamed from: q */
    private BigInteger f16317q;
    private DHValidationParameters validation;

    /* JADX WARN: Invalid debug info offset */
    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, int i2, BigInteger bigInteger4, DHValidationParameters dHValidationParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, DHValidationParameters dHValidationParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    private static int getDefaultMParam(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getG() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getJ() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getL() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getM() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getP() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getQ() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DHValidationParameters getValidationParameters() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int hashCode() {
        return 0;
    }
}
