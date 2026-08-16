package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;

/* JADX INFO: loaded from: classes2.dex */
public class JCERSAPrivateKey implements RSAPrivateKey, PKCS12BagAttributeCarrier {
    private static BigInteger ZERO = BigInteger.valueOf(0);
    static final long serialVersionUID = 5110188922551353628L;
    private PKCS12BagAttributeCarrierImpl attrCarrier;
    protected BigInteger modulus;
    protected BigInteger privateExponent;

    /* JADX WARN: Invalid debug info offset */
    public JCERSAPrivateKey() {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCERSAPrivateKey(RSAPrivateKey rSAPrivateKey) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCERSAPrivateKey(RSAPrivateKeySpec rSAPrivateKeySpec) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCERSAPrivateKey(RSAKeyParameters rSAKeyParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    /* JADX WARN: Invalid debug info offset */
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean equals(Object obj) {
        return false;
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
    @Override // java.security.interfaces.RSAKey
    public BigInteger getModulus() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.interfaces.RSAPrivateKey
    public BigInteger getPrivateExponent() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(DERObjectIdentifier dERObjectIdentifier, DEREncodable dEREncodable) {
    }
}
