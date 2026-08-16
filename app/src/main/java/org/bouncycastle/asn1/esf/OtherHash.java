package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class OtherHash extends ASN1Encodable implements ASN1Choice {
    private OtherHashAlgAndValue otherHash;
    private ASN1OctetString sha1Hash;

    /* JADX WARN: Invalid debug info offset */
    private OtherHash(ASN1OctetString aSN1OctetString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public OtherHash(OtherHashAlgAndValue otherHashAlgAndValue) {
    }

    /* JADX WARN: Invalid debug info offset */
    public OtherHash(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static OtherHash getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getHashAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getHashValue() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
