package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class AttCertIssuer extends ASN1Encodable implements ASN1Choice {
    DERObject choiceObj;
    ASN1Encodable obj;

    /* JADX WARN: Invalid debug info offset */
    public AttCertIssuer(GeneralNames generalNames) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AttCertIssuer(V2Form v2Form) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static AttCertIssuer getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static AttCertIssuer getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Encodable getIssuer() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
