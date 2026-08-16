package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERBoolean;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERUTF8String;

/* JADX INFO: loaded from: classes2.dex */
public class MetaData extends ASN1Encodable {
    private DERUTF8String fileName;
    private DERBoolean hashProtected;
    private DERIA5String mediaType;
    private Attributes otherMetaData;

    /* JADX WARN: Invalid debug info offset */
    private MetaData(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public MetaData(DERBoolean dERBoolean, DERUTF8String dERUTF8String, DERIA5String dERIA5String, Attributes attributes) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static MetaData getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERUTF8String getFileName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERIA5String getMediaType() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Attributes getOtherMetaData() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isHashProtected() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
