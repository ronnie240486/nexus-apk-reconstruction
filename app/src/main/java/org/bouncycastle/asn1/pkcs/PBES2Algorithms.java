package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class PBES2Algorithms extends AlgorithmIdentifier implements PKCSObjectIdentifiers {
    private KeyDerivationFunc func;
    private DERObjectIdentifier objectId;
    private EncryptionScheme scheme;

    /* JADX WARN: Invalid debug info offset */
    public PBES2Algorithms(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable, org.bouncycastle.asn1.DEREncodable
    public DERObject getDERObject() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public EncryptionScheme getEncryptionScheme() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public KeyDerivationFunc getKeyDerivationFunc() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.x509.AlgorithmIdentifier
    public DERObjectIdentifier getObjectId() {
        return null;
    }
}
