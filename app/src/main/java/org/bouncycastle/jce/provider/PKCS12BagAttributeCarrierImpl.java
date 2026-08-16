package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;

/* JADX INFO: loaded from: classes2.dex */
class PKCS12BagAttributeCarrierImpl implements PKCS12BagAttributeCarrier {
    private Hashtable pkcs12Attributes;
    private Vector pkcs12Ordering;

    /* JADX WARN: Invalid debug info offset */
    public PKCS12BagAttributeCarrierImpl() {
    }

    /* JADX WARN: Invalid debug info offset */
    public PKCS12BagAttributeCarrierImpl(Hashtable hashtable, Vector vector) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Hashtable getAttributes() {
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
    public Vector getOrdering() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier
    public void setBagAttribute(DERObjectIdentifier dERObjectIdentifier, DEREncodable dEREncodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public int size() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    }
}
