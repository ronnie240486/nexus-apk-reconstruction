package org.bouncycastle.asn1.isismtt.x509;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x500.DirectoryString;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.IssuerSerial;

/* JADX INFO: loaded from: classes2.dex */
public class ProcurationSyntax extends ASN1Encodable {
    private IssuerSerial certRef;
    private String country;
    private GeneralName thirdPerson;
    private DirectoryString typeOfSubstitution;

    /* JADX WARN: Invalid debug info offset */
    public ProcurationSyntax(String str, DirectoryString directoryString, GeneralName generalName) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ProcurationSyntax(String str, DirectoryString directoryString, IssuerSerial issuerSerial) {
    }

    /* JADX WARN: Invalid debug info offset */
    private ProcurationSyntax(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static ProcurationSyntax getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public IssuerSerial getCertRef() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getCountry() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralName getThirdPerson() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DirectoryString getTypeOfSubstitution() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
