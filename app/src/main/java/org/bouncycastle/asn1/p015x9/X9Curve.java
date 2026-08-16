package org.bouncycastle.asn1.p015x9;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.math.p018ec.ECCurve;

/* JADX INFO: loaded from: classes2.dex */
public class X9Curve extends ASN1Encodable implements X9ObjectIdentifiers {
    private ECCurve curve;
    private DERObjectIdentifier fieldIdentifier;
    private byte[] seed;

    /* JADX WARN: Invalid debug info offset */
    public X9Curve(X9FieldID x9FieldID, ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X9Curve(ECCurve eCCurve) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X9Curve(ECCurve eCCurve, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void setFieldIdentifier() {
    }

    /* JADX WARN: Invalid debug info offset */
    public ECCurve getCurve() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getSeed() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
