package org.bouncycastle.asn1.isismtt.x509;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class DeclarationOfMajority extends ASN1Encodable implements ASN1Choice {
    public static final int dateOfBirth = 2;
    public static final int fullAgeAtCountry = 1;
    public static final int notYoungerThan = 0;
    private ASN1TaggedObject declaration;

    /* JADX WARN: Invalid debug info offset */
    public DeclarationOfMajority(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    private DeclarationOfMajority(ASN1TaggedObject aSN1TaggedObject) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DeclarationOfMajority(DERGeneralizedTime dERGeneralizedTime) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DeclarationOfMajority(boolean z, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static DeclarationOfMajority getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Sequence fullAgeAtCountry() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERGeneralizedTime getDateOfBirth() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getType() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int notYoungerThan() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
