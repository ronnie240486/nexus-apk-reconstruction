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
import org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.bouncycastle.jce.interfaces.ElGamalPrivateKey;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.jce.spec.ElGamalParameterSpec;
import org.bouncycastle.jce.spec.ElGamalPrivateKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public class JCEElGamalPrivateKey implements ElGamalPrivateKey, DHPrivateKey, PKCS12BagAttributeCarrier {
    static final long serialVersionUID = 4819350091141529678L;
    private PKCS12BagAttributeCarrierImpl attrCarrier;
    ElGamalParameterSpec elSpec;

    /* JADX INFO: renamed from: x */
    BigInteger f16370x;

    /* JADX WARN: Invalid debug info offset */
    public JCEElGamalPrivateKey() {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEElGamalPrivateKey(DHPrivateKey dHPrivateKey) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEElGamalPrivateKey(DHPrivateKeySpec dHPrivateKeySpec) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEElGamalPrivateKey(PrivateKeyInfo privateKeyInfo) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEElGamalPrivateKey(ElGamalPrivateKeyParameters elGamalPrivateKeyParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEElGamalPrivateKey(ElGamalPrivateKey elGamalPrivateKey) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEElGamalPrivateKey(ElGamalPrivateKeySpec elGamalPrivateKeySpec) {
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
    @Override // org.bouncycastle.jce.interfaces.ElGamalKey
    public ElGamalParameterSpec getParameters() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.interfaces.DHKey
    public DHParameterSpec getParams() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.ElGamalPrivateKey, javax.crypto.interfaces.DHPrivateKey
    public BigInteger getX() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(DERObjectIdentifier dERObjectIdentifier, DEREncodable dEREncodable) {
    }
}
