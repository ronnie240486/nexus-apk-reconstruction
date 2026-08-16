package org.bouncycastle.math.p018ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ECFieldElement implements ECConstants {

    public static class F2m extends ECFieldElement {
        public static final int GNB = 1;
        public static final int PPB = 3;
        public static final int TPB = 2;

        /* JADX INFO: renamed from: k1 */
        private int f16420k1;

        /* JADX INFO: renamed from: k2 */
        private int f16421k2;

        /* JADX INFO: renamed from: k3 */
        private int f16422k3;

        /* JADX INFO: renamed from: m */
        private int f16423m;
        private int representation;

        /* JADX INFO: renamed from: t */
        private int f16424t;

        /* JADX INFO: renamed from: x */
        private IntArray f16425x;

        /* JADX WARN: Invalid debug info offset */
        public F2m(int i, int i2, int i3, int i4, BigInteger bigInteger) {
        }

        /* JADX WARN: Invalid debug info offset */
        private F2m(int i, int i2, int i3, int i4, IntArray intArray) {
        }

        /* JADX WARN: Invalid debug info offset */
        public F2m(int i, int i2, BigInteger bigInteger) {
        }

        /* JADX WARN: Invalid debug info offset */
        public static void checkFieldElements(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECFieldElement
        public ECFieldElement add(ECFieldElement eCFieldElement) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECFieldElement
        public ECFieldElement divide(ECFieldElement eCFieldElement) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public boolean equals(Object obj) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECFieldElement
        public String getFieldName() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECFieldElement
        public int getFieldSize() {
            return 0;
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
        public int getRepresentation() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public int hashCode() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECFieldElement
        public ECFieldElement invert() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECFieldElement
        public ECFieldElement multiply(ECFieldElement eCFieldElement) {
            return null;
        }

        @Override // org.bouncycastle.math.p018ec.ECFieldElement
        public ECFieldElement negate() {
            return this;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECFieldElement
        public ECFieldElement sqrt() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECFieldElement
        public ECFieldElement square() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECFieldElement
        public ECFieldElement subtract(ECFieldElement eCFieldElement) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECFieldElement
        public BigInteger toBigInteger() {
            return null;
        }
    }

    /* JADX INFO: renamed from: org.bouncycastle.math.ec.ECFieldElement$Fp */
    public static class C5055Fp extends ECFieldElement {

        /* JADX INFO: renamed from: q */
        BigInteger f16426q;

        /* JADX INFO: renamed from: x */
        BigInteger f16427x;

        /* JADX WARN: Invalid debug info offset */
        public C5055Fp(BigInteger bigInteger, BigInteger bigInteger2) {
        }

        /* JADX WARN: Invalid debug info offset */
        private static BigInteger[] lucasSequence(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECFieldElement
        public ECFieldElement add(ECFieldElement eCFieldElement) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECFieldElement
        public ECFieldElement divide(ECFieldElement eCFieldElement) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public boolean equals(Object obj) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECFieldElement
        public String getFieldName() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECFieldElement
        public int getFieldSize() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public BigInteger getQ() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public int hashCode() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECFieldElement
        public ECFieldElement invert() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECFieldElement
        public ECFieldElement multiply(ECFieldElement eCFieldElement) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECFieldElement
        public ECFieldElement negate() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECFieldElement
        public ECFieldElement sqrt() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECFieldElement
        public ECFieldElement square() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECFieldElement
        public ECFieldElement subtract(ECFieldElement eCFieldElement) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECFieldElement
        public BigInteger toBigInteger() {
            return null;
        }
    }

    public abstract ECFieldElement add(ECFieldElement eCFieldElement);

    public abstract ECFieldElement divide(ECFieldElement eCFieldElement);

    public abstract String getFieldName();

    public abstract int getFieldSize();

    public abstract ECFieldElement invert();

    public abstract ECFieldElement multiply(ECFieldElement eCFieldElement);

    public abstract ECFieldElement negate();

    public abstract ECFieldElement sqrt();

    public abstract ECFieldElement square();

    public abstract ECFieldElement subtract(ECFieldElement eCFieldElement);

    public abstract BigInteger toBigInteger();

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
