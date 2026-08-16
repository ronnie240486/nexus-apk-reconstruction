package org.bouncycastle.asn1.smime;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;

/* JADX INFO: loaded from: classes2.dex */
public class SMIMECapability extends ASN1Encodable {
    private DERObjectIdentifier capabilityID;
    private DEREncodable parameters;
    public static final DERObjectIdentifier preferSignedData = PKCSObjectIdentifiers.preferSignedData;
    public static final DERObjectIdentifier canNotDecryptAny = PKCSObjectIdentifiers.canNotDecryptAny;
    public static final DERObjectIdentifier sMIMECapabilitiesVersions = PKCSObjectIdentifiers.sMIMECapabilitiesVersions;
    public static final DERObjectIdentifier dES_CBC = new DERObjectIdentifier("1.3.14.3.2.7");
    public static final DERObjectIdentifier dES_EDE3_CBC = PKCSObjectIdentifiers.des_EDE3_CBC;
    public static final DERObjectIdentifier rC2_CBC = PKCSObjectIdentifiers.RC2_CBC;
    public static final DERObjectIdentifier aES128_CBC = NISTObjectIdentifiers.id_aes128_CBC;
    public static final DERObjectIdentifier aES192_CBC = NISTObjectIdentifiers.id_aes192_CBC;
    public static final DERObjectIdentifier aES256_CBC = NISTObjectIdentifiers.id_aes256_CBC;

    /* JADX WARN: Invalid debug info offset */
    public SMIMECapability(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SMIMECapability(DERObjectIdentifier dERObjectIdentifier, DEREncodable dEREncodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static SMIMECapability getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier getCapabilityID() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DEREncodable getParameters() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
