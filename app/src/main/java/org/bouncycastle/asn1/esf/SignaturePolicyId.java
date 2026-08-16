package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class SignaturePolicyId extends ASN1Encodable {
    private OtherHashAlgAndValue sigPolicyHash;
    private DERObjectIdentifier sigPolicyId;
    private SigPolicyQualifiers sigPolicyQualifiers;

    /* JADX WARN: Invalid debug info offset */
    public SignaturePolicyId(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SignaturePolicyId(DERObjectIdentifier dERObjectIdentifier, OtherHashAlgAndValue otherHashAlgAndValue) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SignaturePolicyId(DERObjectIdentifier dERObjectIdentifier, OtherHashAlgAndValue otherHashAlgAndValue, SigPolicyQualifiers sigPolicyQualifiers) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static SignaturePolicyId getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public OtherHashAlgAndValue getSigPolicyHash() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1ObjectIdentifier getSigPolicyId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public SigPolicyQualifiers getSigPolicyQualifiers() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
