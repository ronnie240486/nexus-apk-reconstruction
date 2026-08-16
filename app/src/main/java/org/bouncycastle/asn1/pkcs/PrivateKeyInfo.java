package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class PrivateKeyInfo extends ASN1Encodable {
    private AlgorithmIdentifier algId;
    private ASN1Set attributes;
    private DERObject privKey;

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0024
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public PrivateKeyInfo(org.bouncycastle.asn1.ASN1Sequence r3) {
        /*
            r2 = this;
            return
        L4d:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.pkcs.PrivateKeyInfo.<init>(org.bouncycastle.asn1.ASN1Sequence):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public PrivateKeyInfo(AlgorithmIdentifier algorithmIdentifier, DERObject dERObject) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PrivateKeyInfo(AlgorithmIdentifier algorithmIdentifier, DERObject dERObject, ASN1Set aSN1Set) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static PrivateKeyInfo getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static PrivateKeyInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getAlgorithmId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Set getAttributes() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObject getPrivateKey() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
