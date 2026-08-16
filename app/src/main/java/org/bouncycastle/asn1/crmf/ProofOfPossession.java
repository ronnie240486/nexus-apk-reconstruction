package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class ProofOfPossession extends ASN1Encodable implements ASN1Choice {
    public static final int TYPE_KEY_AGREEMENT = 3;
    public static final int TYPE_KEY_ENCIPHERMENT = 2;
    public static final int TYPE_RA_VERIFIED = 0;
    public static final int TYPE_SIGNING_KEY = 1;
    private ASN1Encodable obj;
    private int tagNo;

    /* JADX WARN: Invalid debug info offset */
    public ProofOfPossession() {
    }

    /* JADX WARN: Invalid debug info offset */
    public ProofOfPossession(int i, POPOPrivKey pOPOPrivKey) {
    }

    /* JADX WARN: Invalid debug info offset */
    private ProofOfPossession(ASN1TaggedObject aSN1TaggedObject) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ProofOfPossession(POPOSigningKey pOPOSigningKey) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static ProofOfPossession getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Encodable getObject() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getType() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
