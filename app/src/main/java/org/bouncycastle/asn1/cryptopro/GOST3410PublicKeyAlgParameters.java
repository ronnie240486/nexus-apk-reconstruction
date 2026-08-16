package org.bouncycastle.asn1.cryptopro;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class GOST3410PublicKeyAlgParameters extends ASN1Encodable {
    private DERObjectIdentifier digestParamSet;
    private DERObjectIdentifier encryptionParamSet;
    private DERObjectIdentifier publicKeyParamSet;

    /* JADX WARN: Invalid debug info offset */
    public GOST3410PublicKeyAlgParameters(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public GOST3410PublicKeyAlgParameters(DERObjectIdentifier dERObjectIdentifier, DERObjectIdentifier dERObjectIdentifier2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public GOST3410PublicKeyAlgParameters(DERObjectIdentifier dERObjectIdentifier, DERObjectIdentifier dERObjectIdentifier2, DERObjectIdentifier dERObjectIdentifier3) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static GOST3410PublicKeyAlgParameters getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static GOST3410PublicKeyAlgParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier getDigestParamSet() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier getEncryptionParamSet() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier getPublicKeyParamSet() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
