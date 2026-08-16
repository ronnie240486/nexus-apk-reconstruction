package org.bouncycastle.jce.provider;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.crypto.params.GOST3410PrivateKeyParameters;
import org.bouncycastle.jce.interfaces.GOST3410Params;
import org.bouncycastle.jce.interfaces.GOST3410PrivateKey;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.jce.spec.GOST3410ParameterSpec;
import org.bouncycastle.jce.spec.GOST3410PrivateKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public class JDKGOST3410PrivateKey implements GOST3410PrivateKey, PKCS12BagAttributeCarrier {
    private PKCS12BagAttributeCarrier attrCarrier;
    GOST3410Params gost3410Spec;

    /* JADX INFO: renamed from: x */
    BigInteger f16378x;

    /* JADX WARN: Invalid debug info offset */
    public JDKGOST3410PrivateKey() {
    }

    /* JADX WARN: Invalid debug info offset */
    public JDKGOST3410PrivateKey(PrivateKeyInfo privateKeyInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JDKGOST3410PrivateKey(GOST3410PrivateKeyParameters gOST3410PrivateKeyParameters, GOST3410ParameterSpec gOST3410ParameterSpec) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JDKGOST3410PrivateKey(GOST3410PrivateKey gOST3410PrivateKey) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JDKGOST3410PrivateKey(GOST3410PrivateKeySpec gOST3410PrivateKeySpec) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.Key
    public String getAlgorithm() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public DEREncodable getBagAttribute(DERObjectIdentifier dERObjectIdentifier) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public Enumeration getBagAttributeKeys() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.Key
    public byte[] getEncoded() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.Key
    public String getFormat() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.GOST3410Key
    public GOST3410Params getParameters() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.GOST3410PrivateKey
    public BigInteger getX() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(DERObjectIdentifier dERObjectIdentifier, DEREncodable dEREncodable) {
    }
}
