package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.SubjectKeyIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class OriginatorIdentifierOrKey extends ASN1Encodable implements ASN1Choice {

    /* JADX INFO: renamed from: id */
    private DEREncodable f15977id;

    /* JADX WARN: Invalid debug info offset */
    public OriginatorIdentifierOrKey(ASN1OctetString aSN1OctetString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public OriginatorIdentifierOrKey(DERObject dERObject) {
    }

    /* JADX WARN: Invalid debug info offset */
    public OriginatorIdentifierOrKey(IssuerAndSerialNumber issuerAndSerialNumber) {
    }

    /* JADX WARN: Invalid debug info offset */
    public OriginatorIdentifierOrKey(OriginatorPublicKey originatorPublicKey) {
    }

    /* JADX WARN: Invalid debug info offset */
    public OriginatorIdentifierOrKey(SubjectKeyIdentifier subjectKeyIdentifier) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static OriginatorIdentifierOrKey getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static OriginatorIdentifierOrKey getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DEREncodable getId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public IssuerAndSerialNumber getIssuerAndSerialNumber() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public OriginatorPublicKey getOriginatorKey() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public SubjectKeyIdentifier getSubjectKeyIdentifier() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
