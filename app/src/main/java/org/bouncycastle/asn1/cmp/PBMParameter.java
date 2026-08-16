package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class PBMParameter extends ASN1Encodable {
    private DERInteger iterationCount;
    private AlgorithmIdentifier mac;
    private AlgorithmIdentifier owf;
    private ASN1OctetString salt;

    /* JADX WARN: Invalid debug info offset */
    public PBMParameter(ASN1OctetString aSN1OctetString, AlgorithmIdentifier algorithmIdentifier, DERInteger dERInteger, AlgorithmIdentifier algorithmIdentifier2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private PBMParameter(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PBMParameter(byte[] bArr, AlgorithmIdentifier algorithmIdentifier, int i, AlgorithmIdentifier algorithmIdentifier2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static PBMParameter getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getIterationCount() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getMac() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getOwf() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString getSalt() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
