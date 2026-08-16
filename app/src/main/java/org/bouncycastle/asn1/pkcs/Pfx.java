package org.bouncycastle.asn1.pkcs;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class Pfx extends ASN1Encodable implements PKCSObjectIdentifiers {
    private ContentInfo contentInfo;
    private MacData macData;

    /* JADX WARN: Invalid debug info offset */
    public Pfx(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Pfx(ContentInfo contentInfo, MacData macData) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ContentInfo getAuthSafe() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public MacData getMacData() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
