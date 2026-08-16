package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ASN1TaggedObject extends ASN1Object implements ASN1TaggedObjectParser {
    boolean empty;
    boolean explicit;
    DEREncodable obj;
    int tagNo;

    /* JADX WARN: Invalid debug info offset */
    public ASN1TaggedObject(int i, DEREncodable dEREncodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1TaggedObject(boolean z, int i, DEREncodable dEREncodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static ASN1TaggedObject getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static ASN1TaggedObject getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Object
    public boolean asn1Equals(DERObject dERObject) {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.DERObject
    public abstract void encode(DEROutputStream dEROutputStream) throws IOException;

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public DERObject getLoadedObject() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObject getObject() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public DEREncodable getObjectParser(int i, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public int getTagNo() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.DERObject, org.bouncycastle.asn1.ASN1Encodable
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isEmpty() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isExplicit() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
