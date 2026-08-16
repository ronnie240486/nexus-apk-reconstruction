package org.bouncycastle.asn1.x509.qualified;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class TypeOfBiometricData extends ASN1Encodable implements ASN1Choice {
    public static final int HANDWRITTEN_SIGNATURE = 1;
    public static final int PICTURE = 0;
    DEREncodable obj;

    /* JADX WARN: Invalid debug info offset */
    public TypeOfBiometricData(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public TypeOfBiometricData(DERObjectIdentifier dERObjectIdentifier) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static TypeOfBiometricData getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier getBiometricDataOid() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getPredefinedBiometricType() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isPredefined() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
