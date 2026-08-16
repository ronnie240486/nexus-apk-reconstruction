package org.bouncycastle.asn1.smime;

import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;

/* JADX INFO: loaded from: classes2.dex */
public class SMIMECapabilities extends ASN1Encodable {
    private ASN1Sequence capabilities;
    public static final DERObjectIdentifier preferSignedData = PKCSObjectIdentifiers.preferSignedData;
    public static final DERObjectIdentifier canNotDecryptAny = PKCSObjectIdentifiers.canNotDecryptAny;
    public static final DERObjectIdentifier sMIMECapabilitesVersions = PKCSObjectIdentifiers.sMIMECapabilitiesVersions;
    public static final DERObjectIdentifier dES_CBC = new DERObjectIdentifier("1.3.14.3.2.7");
    public static final DERObjectIdentifier dES_EDE3_CBC = PKCSObjectIdentifiers.des_EDE3_CBC;
    public static final DERObjectIdentifier rC2_CBC = PKCSObjectIdentifiers.RC2_CBC;

    /* JADX WARN: Invalid debug info offset */
    public SMIMECapabilities(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static SMIMECapabilities getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Vector getCapabilities(DERObjectIdentifier dERObjectIdentifier) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
