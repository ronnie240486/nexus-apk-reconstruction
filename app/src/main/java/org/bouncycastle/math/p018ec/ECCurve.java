package org.bouncycastle.math.p018ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ECCurve {

    /* JADX INFO: renamed from: a */
    ECFieldElement f16409a;

    /* JADX INFO: renamed from: b */
    ECFieldElement f16410b;

    public static class F2m extends ECCurve {

        /* JADX INFO: renamed from: h */
        private BigInteger f16411h;
        private ECPoint.F2m infinity;

        /* JADX INFO: renamed from: k1 */
        private int f16412k1;

        /* JADX INFO: renamed from: k2 */
        private int f16413k2;

        /* JADX INFO: renamed from: k3 */
        private int f16414k3;

        /* JADX INFO: renamed from: m */
        private int f16415m;

        /* JADX INFO: renamed from: mu */
        private byte f16416mu;

        /* JADX INFO: renamed from: n */
        private BigInteger f16417n;

        /* JADX INFO: renamed from: si */
        private BigInteger[] f16418si;

        /* JADX WARN: Invalid debug info offset */
        public F2m(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2) {
        }

        /* JADX WARN: Invalid debug info offset */
        public F2m(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        }

        /* JADX WARN: Invalid debug info offset */
        public F2m(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2) {
        }

        /* JADX WARN: Invalid debug info offset */
        public F2m(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        }

        /* JADX WARN: Invalid debug info offset */
        private ECPoint decompressPoint(byte[] bArr, int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        private ECFieldElement solveQuadradicEquation(ECFieldElement eCFieldElement) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECCurve
        public ECPoint createPoint(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECCurve
        public ECPoint decodePoint(byte[] bArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public boolean equals(Object obj) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECCurve
        public ECFieldElement fromBigInteger(BigInteger bigInteger) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECCurve
        public int getFieldSize() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public BigInteger getH() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECCurve
        public ECPoint getInfinity() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public int getK1() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public int getK2() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public int getK3() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public int getM() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public synchronized byte getMu() {
            return (byte) 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public BigInteger getN() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public synchronized BigInteger[] getSi() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public int hashCode() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public boolean isKoblitz() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        public boolean isTrinomial() {
            return false;
        }
    }

    /* JADX INFO: renamed from: org.bouncycastle.math.ec.ECCurve$Fp */
    public static class C5054Fp extends ECCurve {
        ECPoint.C5056Fp infinity;

        /* JADX INFO: renamed from: q */
        BigInteger f16419q;

        /* JADX WARN: Invalid debug info offset */
        public C5054Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECCurve
        public ECPoint createPoint(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECCurve
        public ECPoint decodePoint(byte[] bArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public boolean equals(Object obj) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECCurve
        public ECFieldElement fromBigInteger(BigInteger bigInteger) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECCurve
        public int getFieldSize() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECCurve
        public ECPoint getInfinity() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public BigInteger getQ() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public int hashCode() {
            return 0;
        }
    }

    public abstract ECPoint createPoint(BigInteger bigInteger, BigInteger bigInteger2, boolean z);

    public abstract ECPoint decodePoint(byte[] bArr);

    public abstract ECFieldElement fromBigInteger(BigInteger bigInteger);

    /* JADX WARN: Invalid debug info offset */
    public ECFieldElement getA() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ECFieldElement getB() {
        return null;
    }

    public abstract int getFieldSize();

    public abstract ECPoint getInfinity();
}
