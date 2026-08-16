package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class DistributionPointName extends ASN1Encodable implements ASN1Choice {
    public static final int FULL_NAME = 0;
    public static final int NAME_RELATIVE_TO_CRL_ISSUER = 1;
    DEREncodable name;
    int type;

    /* JADX WARN: Invalid debug info offset */
    public DistributionPointName(int i, ASN1Encodable aSN1Encodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DistributionPointName(int i, DEREncodable dEREncodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DistributionPointName(ASN1TaggedObject aSN1TaggedObject) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DistributionPointName(GeneralNames generalNames) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void appendObject(StringBuffer stringBuffer, String str, String str2, String str3) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static DistributionPointName getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static DistributionPointName getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Encodable getName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getType() {
        return 0;
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
