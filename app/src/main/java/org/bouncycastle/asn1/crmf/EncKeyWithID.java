package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERUTF8String;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.GeneralName;

/* JADX INFO: loaded from: classes2.dex */
public class EncKeyWithID extends ASN1Encodable {
    private final ASN1Encodable identifier;
    private final PrivateKeyInfo privKeyInfo;

    /* JADX WARN: Invalid debug info offset */
    private EncKeyWithID(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public EncKeyWithID(PrivateKeyInfo privateKeyInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public EncKeyWithID(PrivateKeyInfo privateKeyInfo, DERUTF8String dERUTF8String) {
    }

    /* JADX WARN: Invalid debug info offset */
    public EncKeyWithID(PrivateKeyInfo privateKeyInfo, GeneralName generalName) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static EncKeyWithID getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Encodable getIdentifier() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PrivateKeyInfo getPrivateKey() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean hasIdentifier() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isIdentifierUTF8String() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
