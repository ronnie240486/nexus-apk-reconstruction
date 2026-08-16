package org.bouncycastle.asn1.x509.sigi;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x500.DirectoryString;

/* JADX INFO: loaded from: classes2.dex */
public class NameOrPseudonym extends ASN1Encodable implements ASN1Choice {
    private ASN1Sequence givenName;
    private DirectoryString pseudonym;
    private DirectoryString surname;

    /* JADX WARN: Invalid debug info offset */
    public NameOrPseudonym(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    private NameOrPseudonym(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public NameOrPseudonym(DirectoryString directoryString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public NameOrPseudonym(DirectoryString directoryString, ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static NameOrPseudonym getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DirectoryString[] getGivenName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DirectoryString getPseudonym() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DirectoryString getSurname() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
