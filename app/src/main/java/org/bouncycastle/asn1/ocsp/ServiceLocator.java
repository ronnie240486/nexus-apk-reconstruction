package org.bouncycastle.asn1.ocsp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x500.X500Name;

/* JADX INFO: loaded from: classes2.dex */
public class ServiceLocator extends ASN1Encodable {
    X500Name issuer;
    DERObject locator;

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
