package org.bouncycastle.math.p018ec;

import java.math.BigInteger;
import org.bouncycastle.asn1.p015x9.X9IntegerConverter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ECPoint {
    private static X9IntegerConverter converter = new X9IntegerConverter();
    ECCurve curve;
    protected ECMultiplier multiplier;
    protected PreCompInfo preCompInfo;
    protected boolean withCompression;

    /* JADX INFO: renamed from: x */
    ECFieldElement f16428x;

    /* JADX INFO: renamed from: y */
    ECFieldElement f16429y;

    public static class F2m extends ECPoint {
        /* JADX WARN: Invalid debug info offset */
        public F2m(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        }

        /* JADX WARN: Invalid debug info offset */
        public F2m(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        private static void checkPoints(ECPoint eCPoint, ECPoint eCPoint2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECPoint
        public ECPoint add(ECPoint eCPoint) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public F2m addSimple(F2m f2m) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // org.bouncycastle.math.p018ec.ECPoint
        public synchronized void assertECMultiplier() {
            /*
                r1 = this;
                return
            L17:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.math.ec.ECPoint.F2m.assertECMultiplier():void");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECPoint
        public byte[] getEncoded() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECPoint
        public ECPoint negate() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECPoint
        public ECPoint subtract(ECPoint eCPoint) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public F2m subtractSimple(F2m f2m) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECPoint
        public ECPoint twice() {
            return null;
        }
    }

    /* JADX INFO: renamed from: org.bouncycastle.math.ec.ECPoint$Fp */
    public static class C5056Fp extends ECPoint {
        /* JADX WARN: Invalid debug info offset */
        public C5056Fp(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        }

        /* JADX WARN: Invalid debug info offset */
        public C5056Fp(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECPoint
        public ECPoint add(ECPoint eCPoint) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // org.bouncycastle.math.p018ec.ECPoint
        public synchronized void assertECMultiplier() {
            /*
                r1 = this;
                return
            Ld:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.math.p018ec.ECPoint.C5056Fp.assertECMultiplier():void");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECPoint
        public byte[] getEncoded() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECPoint
        public ECPoint negate() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECPoint
        public ECPoint subtract(ECPoint eCPoint) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.math.p018ec.ECPoint
        public ECPoint twice() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public ECPoint(ECCurve eCCurve, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ X9IntegerConverter access$000() {
        return null;
    }

    public abstract ECPoint add(ECPoint eCPoint);

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized void assertECMultiplier() {
        /*
            r1 = this;
            return
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.math.p018ec.ECPoint.assertECMultiplier():void");
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public ECCurve getCurve() {
        return null;
    }

    public abstract byte[] getEncoded();

    /* JADX WARN: Invalid debug info offset */
    public ECFieldElement getX() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ECFieldElement getY() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isCompressed() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isInfinity() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public ECPoint multiply(BigInteger bigInteger) {
        return null;
    }

    public abstract ECPoint negate();

    /* JADX WARN: Invalid debug info offset */
    public void setPreCompInfo(PreCompInfo preCompInfo) {
    }

    public abstract ECPoint subtract(ECPoint eCPoint);

    public abstract ECPoint twice();
}
