package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class POPOSigningKey extends ASN1Encodable {
    private AlgorithmIdentifier algorithmIdentifier;
    private POPOSigningKeyInput poposkInput;
    private DERBitString signature;

    /* JADX WARN: Invalid debug info offset */
    private POPOSigningKey(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public POPOSigningKey(POPOSigningKeyInput pOPOSigningKeyInput, AlgorithmIdentifier algorithmIdentifier, DERBitString dERBitString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static POPOSigningKey getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static POPOSigningKey getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getAlgorithmIdentifier() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public POPOSigningKeyInput getPoposkInput() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERBitString getSignature() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
