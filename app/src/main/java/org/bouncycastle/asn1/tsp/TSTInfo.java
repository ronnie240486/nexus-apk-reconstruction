package org.bouncycastle.asn1.tsp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBoolean;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.X509Extensions;

/* JADX INFO: loaded from: classes2.dex */
public class TSTInfo extends ASN1Encodable {
    Accuracy accuracy;
    X509Extensions extensions;
    DERGeneralizedTime genTime;
    MessageImprint messageImprint;
    DERInteger nonce;
    DERBoolean ordering;
    DERInteger serialNumber;
    GeneralName tsa;
    DERObjectIdentifier tsaPolicyId;
    DERInteger version;

    /* JADX WARN: Invalid debug info offset */
    public TSTInfo(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public TSTInfo(DERObjectIdentifier dERObjectIdentifier, MessageImprint messageImprint, DERInteger dERInteger, DERGeneralizedTime dERGeneralizedTime, Accuracy accuracy, DERBoolean dERBoolean, DERInteger dERInteger2, GeneralName generalName, X509Extensions x509Extensions) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0017
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static org.bouncycastle.asn1.tsp.TSTInfo getInstance(java.lang.Object r3) {
        /*
            r0 = 0
            return r0
        L2b:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.tsp.TSTInfo.getInstance(java.lang.Object):org.bouncycastle.asn1.tsp.TSTInfo");
    }

    /* JADX WARN: Invalid debug info offset */
    public Accuracy getAccuracy() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Extensions getExtensions() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERGeneralizedTime getGenTime() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public MessageImprint getMessageImprint() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getNonce() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERBoolean getOrdering() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier getPolicy() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getSerialNumber() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralName getTsa() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
