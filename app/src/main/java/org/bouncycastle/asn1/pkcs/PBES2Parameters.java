package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class PBES2Parameters extends ASN1Encodable implements PKCSObjectIdentifiers {
    private KeyDerivationFunc func;
    private EncryptionScheme scheme;

    /* JADX WARN: Invalid debug info offset */
    public PBES2Parameters(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static PBES2Parameters getInstance(Object obj) {
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
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
