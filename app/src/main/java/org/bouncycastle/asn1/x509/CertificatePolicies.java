package org.bouncycastle.asn1.x509;

import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class CertificatePolicies extends ASN1Encodable {
    static final DERObjectIdentifier anyPolicy = new DERObjectIdentifier("2.5.29.32.0");
    Vector policies;

    /* JADX WARN: Invalid debug info offset */
    public CertificatePolicies(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertificatePolicies(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertificatePolicies(DERObjectIdentifier dERObjectIdentifier) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static CertificatePolicies getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static CertificatePolicies getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void addPolicy(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public String getPolicy(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
