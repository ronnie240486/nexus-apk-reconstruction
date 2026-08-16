package org.bouncycastle.jce.provider.asymmetric.p017ec;

import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import org.bouncycastle.crypto.DSA;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.jce.provider.DSABase;
import org.bouncycastle.jce.provider.DSAEncoder;

/* JADX INFO: loaded from: classes2.dex */
public class Signature extends DSABase {

    public static class CVCDSAEncoder implements DSAEncoder {
        /* JADX WARN: Invalid debug info offset */
        private CVCDSAEncoder() {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ CVCDSAEncoder(C50531 c50531) {
        }

        /* JADX WARN: Invalid debug info offset */
        private byte[] makeUnsigned(BigInteger bigInteger) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.DSAEncoder
        public BigInteger[] decode(byte[] bArr) throws IOException {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.DSAEncoder
        public byte[] encode(BigInteger bigInteger, BigInteger bigInteger2) throws IOException {
            return null;
        }
    }

    public static class StdDSAEncoder implements DSAEncoder {
        /* JADX WARN: Invalid debug info offset */
        private StdDSAEncoder() {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ StdDSAEncoder(C50531 c50531) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.DSAEncoder
        public BigInteger[] decode(byte[] bArr) throws IOException {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.DSAEncoder
        public byte[] encode(BigInteger bigInteger, BigInteger bigInteger2) throws IOException {
            return null;
        }
    }

    public static class ecCVCDSA extends Signature {
    }

    public static class ecCVCDSA224 extends Signature {
    }

    public static class ecCVCDSA256 extends Signature {
    }

    public static class ecDSA extends Signature {
    }

    public static class ecDSA224 extends Signature {
    }

    public static class ecDSA256 extends Signature {
    }

    public static class ecDSA384 extends Signature {
    }

    public static class ecDSA512 extends Signature {
    }

    public static class ecDSARipeMD160 extends Signature {
    }

    public static class ecDSAnone extends Signature {
    }

    public static class ecNR extends Signature {
    }

    public static class ecNR224 extends Signature {
    }

    public static class ecNR256 extends Signature {
    }

    public static class ecNR384 extends Signature {
    }

    public static class ecNR512 extends Signature {
    }

    /* JADX WARN: Invalid debug info offset */
    public Signature(Digest digest, DSA dsa, DSAEncoder dSAEncoder) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // java.security.SignatureSpi
    public void engineInitVerify(java.security.PublicKey r3) throws java.security.InvalidKeyException {
        /*
            r2 = this;
            return
        L2d:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.asymmetric.p017ec.Signature.engineInitVerify(java.security.PublicKey):void");
    }
}
