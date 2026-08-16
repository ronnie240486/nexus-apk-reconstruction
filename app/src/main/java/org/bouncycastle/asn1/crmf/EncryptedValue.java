package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class EncryptedValue extends ASN1Encodable {
    private DERBitString encSymmKey;
    private DERBitString encValue;
    private AlgorithmIdentifier intendedAlg;
    private AlgorithmIdentifier keyAlg;
    private AlgorithmIdentifier symmAlg;
    private ASN1OctetString valueHint;

    /* JADX WARN: Invalid debug info offset */
    private EncryptedValue(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public EncryptedValue(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, DERBitString dERBitString, AlgorithmIdentifier algorithmIdentifier3, ASN1OctetString aSN1OctetString, DERBitString dERBitString2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void addOptional(ASN1EncodableVector aSN1EncodableVector, int i, ASN1Encodable aSN1Encodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static EncryptedValue getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERBitString getEncSymmKey() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERBitString getEncValue() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getIntendedAlg() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getKeyAlg() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getSymmAlg() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString getValueHint() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
