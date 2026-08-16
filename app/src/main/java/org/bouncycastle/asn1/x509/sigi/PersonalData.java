package org.bouncycastle.asn1.x509.sigi;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERGeneralizedTime;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x500.DirectoryString;

/* JADX INFO: loaded from: classes2.dex */
public class PersonalData extends ASN1Encodable {
    private DERGeneralizedTime dateOfBirth;
    private String gender;
    private BigInteger nameDistinguisher;
    private NameOrPseudonym nameOrPseudonym;
    private DirectoryString placeOfBirth;
    private DirectoryString postalAddress;

    /* JADX WARN: Invalid debug info offset */
    private PersonalData(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PersonalData(NameOrPseudonym nameOrPseudonym, BigInteger bigInteger, DERGeneralizedTime dERGeneralizedTime, DirectoryString directoryString, String str, DirectoryString directoryString2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static PersonalData getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERGeneralizedTime getDateOfBirth() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getGender() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public BigInteger getNameDistinguisher() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public NameOrPseudonym getNameOrPseudonym() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DirectoryString getPlaceOfBirth() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DirectoryString getPostalAddress() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
