package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.Enumeration;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPrivateKeySpec;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;

/* JADX INFO: loaded from: classes2.dex */
public class JCEDHPrivateKey implements DHPrivateKey, PKCS12BagAttributeCarrier {
    static final long serialVersionUID = 311058815616901812L;
    private PKCS12BagAttributeCarrier attrCarrier;
    private DHParameterSpec dhSpec;

    /* JADX INFO: renamed from: info, reason: collision with root package name */
    private PrivateKeyInfo f19799info;

    /* JADX INFO: renamed from: x */
    BigInteger f16366x;

    /* JADX WARN: Invalid debug info offset */
    public JCEDHPrivateKey() {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEDHPrivateKey(DHPrivateKey dHPrivateKey) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEDHPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEDHPrivateKey(PrivateKeyInfo privateKeyInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEDHPrivateKey(DHPrivateKeyParameters dHPrivateKeyParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    /* JADX WARN: Invalid debug info offset */
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
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
    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.interfaces.DHPrivateKey
    public BigInteger getX() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(DERObjectIdentifier dERObjectIdentifier, DEREncodable dEREncodable) {
    }
}
