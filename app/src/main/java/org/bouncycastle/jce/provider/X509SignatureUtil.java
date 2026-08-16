package org.bouncycastle.jce.provider;

import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
class X509SignatureUtil {
    private static final ASN1Null derNull = new DERNull();

    /* JADX WARN: Invalid debug info offset */
    private static String getDigestAlgName(DERObjectIdentifier dERObjectIdentifier) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getSignatureName(AlgorithmIdentifier algorithmIdentifier) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0016
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static void setSignatureParameters(java.security.Signature r2, org.bouncycastle.asn1.DEREncodable r3) throws java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        /*
            return
        L37:
        L50:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.X509SignatureUtil.setSignatureParameters(java.security.Signature, org.bouncycastle.asn1.DEREncodable):void");
    }
}
