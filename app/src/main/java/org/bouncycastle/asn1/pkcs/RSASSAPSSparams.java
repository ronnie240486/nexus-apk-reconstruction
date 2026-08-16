package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class RSASSAPSSparams extends ASN1Encodable {
    public static final AlgorithmIdentifier DEFAULT_HASH_ALGORITHM;
    public static final AlgorithmIdentifier DEFAULT_MASK_GEN_FUNCTION;
    public static final DERInteger DEFAULT_SALT_LENGTH;
    public static final DERInteger DEFAULT_TRAILER_FIELD;
    private AlgorithmIdentifier hashAlgorithm;
    private AlgorithmIdentifier maskGenAlgorithm;
    private DERInteger saltLength;
    private DERInteger trailerField;

    static {
        AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1, new DERNull());
        DEFAULT_HASH_ALGORITHM = algorithmIdentifier;
        DEFAULT_MASK_GEN_FUNCTION = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, algorithmIdentifier);
        DEFAULT_SALT_LENGTH = new DERInteger(20);
        DEFAULT_TRAILER_FIELD = new DERInteger(1);
    }

    /* JADX WARN: Invalid debug info offset */
    public RSASSAPSSparams() {
    }

    /* JADX WARN: Invalid debug info offset */
    public RSASSAPSSparams(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public RSASSAPSSparams(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, DERInteger dERInteger, DERInteger dERInteger2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static RSASSAPSSparams getInstance(Object obj) {
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
    public DERInteger getSaltLength() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getTrailerField() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
