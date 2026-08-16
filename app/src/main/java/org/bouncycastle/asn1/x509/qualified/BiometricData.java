package org.bouncycastle.asn1.x509.qualified;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public class BiometricData extends ASN1Encodable {
    ASN1OctetString biometricDataHash;
    AlgorithmIdentifier hashAlgorithm;
    DERIA5String sourceDataUri;
    TypeOfBiometricData typeOfBiometricData;

    /* JADX WARN: Invalid debug info offset */
    public BiometricData(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public BiometricData(TypeOfBiometricData typeOfBiometricData, AlgorithmIdentifier algorithmIdentifier, ASN1OctetString aSN1OctetString) {
    }

    /* JADX WARN: Invalid debug info offset */
    public BiometricData(TypeOfBiometricData typeOfBiometricData, AlgorithmIdentifier algorithmIdentifier, ASN1OctetString aSN1OctetString, DERIA5String dERIA5String) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static BiometricData getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString getBiometricDataHash() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public AlgorithmIdentifier getHashAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERIA5String getSourceDataUri() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public TypeOfBiometricData getTypeOfBiometricData() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
