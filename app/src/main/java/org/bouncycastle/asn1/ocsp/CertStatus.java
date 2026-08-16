package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class CertStatus extends ASN1Encodable implements ASN1Choice {
    private int tagNo;
    private DEREncodable value;

    /* JADX WARN: Invalid debug info offset */
    public CertStatus() {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertStatus(int i, DEREncodable dEREncodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertStatus(ASN1TaggedObject aSN1TaggedObject) {
    }

    /* JADX WARN: Invalid debug info offset */
    public CertStatus(RevokedInfo revokedInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static CertStatus getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static CertStatus getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DEREncodable getStatus() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getTagNo() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
