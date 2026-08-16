package org.bouncycastle.jce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.jce.interfaces.GOST3410Params;

/* JADX INFO: loaded from: classes2.dex */
public class GOST3410ParameterSpec implements AlgorithmParameterSpec, GOST3410Params {
    private String digestParamSetOID;
    private String encryptionParamSetOID;
    private String keyParamSetOID;
    private GOST3410PublicKeyParameterSetSpec keyParameters;

    /* JADX WARN: Invalid debug info offset */
    public GOST3410ParameterSpec(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public GOST3410ParameterSpec(String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public GOST3410ParameterSpec(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            return
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.spec.GOST3410ParameterSpec.<init>(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public GOST3410ParameterSpec(GOST3410PublicKeyParameterSetSpec gOST3410PublicKeyParameterSetSpec) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static GOST3410ParameterSpec fromPublicKeyAlg(GOST3410PublicKeyAlgParameters gOST3410PublicKeyAlgParameters) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.GOST3410Params
    public String getDigestParamSetOID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.GOST3410Params
    public String getEncryptionParamSetOID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.GOST3410Params
    public String getPublicKeyParamSetOID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.GOST3410Params
    public GOST3410PublicKeyParameterSetSpec getPublicKeyParameters() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int hashCode() {
        return 0;
    }
}
