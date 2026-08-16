package org.bouncycastle.asn1.mozilla;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

/* JADX INFO: loaded from: classes2.dex */
public class PublicKeyAndChallenge extends ASN1Encodable {
    private DERIA5String challenge;
    private ASN1Sequence pkacSeq;
    private SubjectPublicKeyInfo spki;

    /* JADX WARN: Invalid debug info offset */
    public PublicKeyAndChallenge(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static PublicKeyAndChallenge getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERIA5String getChallenge() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public SubjectPublicKeyInfo getSubjectPublicKeyInfo() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
