package org.bouncycastle.asn1.p015x9;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class X962Parameters extends ASN1Encodable implements ASN1Choice {
    private DERObject params;

    /* JADX WARN: Invalid debug info offset */
    public X962Parameters(DERObject dERObject) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X962Parameters(DERObjectIdentifier dERObjectIdentifier) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X962Parameters(X9ECParameters x9ECParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static X962Parameters getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static X962Parameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObject getParameters() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isImplicitlyCA() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isNamedCurve() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
