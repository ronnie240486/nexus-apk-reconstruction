package org.bouncycastle.asn1.ess;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.IssuerSerial;

/* JADX INFO: loaded from: classes2.dex */
public class ESSCertIDv2 extends ASN1Encodable {
    private static final AlgorithmIdentifier DEFAULT_ALG_ID = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
    private byte[] certHash;
    private AlgorithmIdentifier hashAlgorithm;
    private IssuerSerial issuerSerial;

    /* JADX WARN: Invalid debug info offset */
    public ESSCertIDv2(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ESSCertIDv2(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ESSCertIDv2(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, IssuerSerial issuerSerial) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static ESSCertIDv2 getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getCertHash() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getHashAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public IssuerSerial getIssuerSerial() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
