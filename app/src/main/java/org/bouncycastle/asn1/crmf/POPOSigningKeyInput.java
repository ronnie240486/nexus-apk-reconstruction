package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* JADX INFO: loaded from: classes2.dex */
public class POPOSigningKeyInput extends ASN1Encodable {
    private SubjectPublicKeyInfo publicKey;
    private PKMACValue publicKeyMAC;
    private GeneralName sender;

    /* JADX WARN: Invalid debug info offset */
    private POPOSigningKeyInput(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public POPOSigningKeyInput(PKMACValue pKMACValue, SubjectPublicKeyInfo subjectPublicKeyInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public POPOSigningKeyInput(GeneralName generalName, SubjectPublicKeyInfo subjectPublicKeyInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static POPOSigningKeyInput getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public SubjectPublicKeyInfo getPublicKey() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PKMACValue getPublicKeyMAC() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralName getSender() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
