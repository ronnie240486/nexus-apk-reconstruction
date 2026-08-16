package org.bouncycastle.jce.provider;

import java.math.BigInteger;
import org.bouncycastle.crypto.params.GOST3410PublicKeyParameters;
import org.bouncycastle.jce.interfaces.GOST3410Params;
import org.bouncycastle.jce.interfaces.GOST3410PublicKey;
import org.bouncycastle.jce.spec.GOST3410ParameterSpec;
import org.bouncycastle.jce.spec.GOST3410PublicKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public class JDKGOST3410PublicKey implements GOST3410PublicKey {
    private GOST3410Params gost3410Spec;

    /* JADX INFO: renamed from: y */
    private BigInteger f16379y;

    /* JADX WARN: Invalid debug info offset */
    public JDKGOST3410PublicKey(BigInteger bigInteger, GOST3410ParameterSpec gOST3410ParameterSpec) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0012
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public JDKGOST3410PublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo r6) {
        /*
            r5 = this;
            return
        L3c:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JDKGOST3410PublicKey.<init>(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public JDKGOST3410PublicKey(GOST3410PublicKeyParameters gOST3410PublicKeyParameters, GOST3410ParameterSpec gOST3410ParameterSpec) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JDKGOST3410PublicKey(GOST3410PublicKey gOST3410PublicKey) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JDKGOST3410PublicKey(GOST3410PublicKeySpec gOST3410PublicKeySpec) {
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.Key
    public String getAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.Key
    public byte[] getEncoded() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.Key
    public String getFormat() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.GOST3410Key
    public GOST3410Params getParameters() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.GOST3410PublicKey
    public BigInteger getY() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
