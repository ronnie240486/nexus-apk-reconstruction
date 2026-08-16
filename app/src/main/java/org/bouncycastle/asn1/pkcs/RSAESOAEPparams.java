package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class RSAESOAEPparams extends ASN1Encodable {
    public static final AlgorithmIdentifier DEFAULT_HASH_ALGORITHM;
    public static final AlgorithmIdentifier DEFAULT_MASK_GEN_FUNCTION;
    public static final AlgorithmIdentifier DEFAULT_P_SOURCE_ALGORITHM;
    private AlgorithmIdentifier hashAlgorithm;
    private AlgorithmIdentifier maskGenAlgorithm;
    private AlgorithmIdentifier pSourceAlgorithm;

    static {
        AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1, new DERNull());
        DEFAULT_HASH_ALGORITHM = algorithmIdentifier;
        DEFAULT_MASK_GEN_FUNCTION = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, algorithmIdentifier);
        DEFAULT_P_SOURCE_ALGORITHM = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_pSpecified, new DEROctetString(new byte[0]));
    }

    /* JADX WARN: Invalid debug info offset */
    public RSAESOAEPparams() {
    }

    /* JADX WARN: Invalid debug info offset */
    public RSAESOAEPparams(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RSAESOAEPparams(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, AlgorithmIdentifier algorithmIdentifier3) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static RSAESOAEPparams getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getHashAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getMaskGenAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getPSourceAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
