package org.bouncycastle.asn1.tsp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBoolean;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.x509.X509Extensions;

/* JADX INFO: loaded from: classes2.dex */
public class TimeStampReq extends ASN1Encodable {
    DERBoolean certReq;
    X509Extensions extensions;
    MessageImprint messageImprint;
    DERInteger nonce;
    DERObjectIdentifier tsaPolicy;
    DERInteger version;

    /* JADX WARN: Invalid debug info offset */
    public TimeStampReq(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public TimeStampReq(MessageImprint messageImprint, DERObjectIdentifier dERObjectIdentifier, DERInteger dERInteger, DERBoolean dERBoolean, X509Extensions x509Extensions) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static TimeStampReq getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERBoolean getCertReq() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public X509Extensions getExtensions() {
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
    public DERObjectIdentifier getReqPolicy() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getVersion() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
