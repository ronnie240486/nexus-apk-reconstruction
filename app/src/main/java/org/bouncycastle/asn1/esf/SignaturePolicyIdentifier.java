package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class SignaturePolicyIdentifier extends ASN1Encodable {
    private boolean isSignaturePolicyImplied;
    private SignaturePolicyId signaturePolicyId;

    /* JADX WARN: Invalid debug info offset */
    public SignaturePolicyIdentifier() {
    }

    /* JADX WARN: Invalid debug info offset */
    public SignaturePolicyIdentifier(SignaturePolicyId signaturePolicyId) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static SignaturePolicyIdentifier getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public SignaturePolicyId getSignaturePolicyId() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isSignaturePolicyImplied() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
