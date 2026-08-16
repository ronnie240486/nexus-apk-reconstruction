package org.bouncycastle.math.p018ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
class Tnaf {
    private static final BigInteger MINUS_ONE;
    private static final BigInteger MINUS_THREE;
    private static final BigInteger MINUS_TWO;
    public static final byte POW_2_WIDTH = 16;
    public static final byte WIDTH = 4;
    public static final ZTauElement[] alpha0;
    public static final byte[][] alpha0Tnaf;
    public static final ZTauElement[] alpha1;
    public static final byte[][] alpha1Tnaf;

    static {
        BigInteger bigInteger = ECConstants.ONE;
        BigInteger bigIntegerNegate = bigInteger.negate();
        MINUS_ONE = bigIntegerNegate;
        MINUS_TWO = ECConstants.TWO.negate();
        BigInteger bigIntegerNegate2 = ECConstants.THREE.negate();
        MINUS_THREE = bigIntegerNegate2;
        BigInteger bigInteger2 = ECConstants.ZERO;
        alpha0 = new ZTauElement[]{null, new ZTauElement(bigInteger, bigInteger2), null, new ZTauElement(bigIntegerNegate2, bigIntegerNegate), null, new ZTauElement(bigIntegerNegate, bigIntegerNegate), null, new ZTauElement(bigInteger, bigIntegerNegate), null};
        alpha0Tnaf = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, 1}};
        alpha1 = new ZTauElement[]{null, new ZTauElement(bigInteger, bigInteger2), null, new ZTauElement(bigIntegerNegate2, bigInteger), null, new ZTauElement(bigIntegerNegate, bigInteger), null, new ZTauElement(bigInteger, bigInteger), null};
        alpha1Tnaf = new byte[][]{null, new byte[]{1}, null, new byte[]{-1, 0, 1}, null, new byte[]{1, 0, 1}, null, new byte[]{-1, 0, 0, -1}};
    }

    /* JADX WARN: Invalid debug info offset */
    public static SimpleBigDecimal approximateDivisionByN(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, byte b, int i, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static BigInteger[] getLucas(byte b, int i, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static byte getMu(ECCurve.F2m f2m) {
        return (byte) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static ECPoint.F2m[] getPreComp(ECPoint.F2m f2m, byte b) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static BigInteger[] getSi(ECCurve.F2m f2m) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static BigInteger getTw(byte b, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static ECPoint.F2m multiplyFromTnaf(ECPoint.F2m f2m, byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static ECPoint.F2m multiplyRTnaf(ECPoint.F2m f2m, BigInteger bigInteger) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static ECPoint.F2m multiplyTnaf(ECPoint.F2m f2m, ZTauElement zTauElement) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static BigInteger norm(byte b, ZTauElement zTauElement) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static SimpleBigDecimal norm(byte b, SimpleBigDecimal simpleBigDecimal, SimpleBigDecimal simpleBigDecimal2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static ZTauElement partModReduction(BigInteger bigInteger, int i, byte b, BigInteger[] bigIntegerArr, byte b2, byte b3) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static ZTauElement round(SimpleBigDecimal simpleBigDecimal, SimpleBigDecimal simpleBigDecimal2, byte b) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static ECPoint.F2m tau(ECPoint.F2m f2m) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static byte[] tauAdicNaf(byte b, ZTauElement zTauElement) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static byte[] tauAdicWNaf(byte b, ZTauElement zTauElement, byte b2, BigInteger bigInteger, BigInteger bigInteger2, ZTauElement[] zTauElementArr) {
        return null;
    }
}
