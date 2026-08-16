package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class DERExternal extends ASN1Object {
    private ASN1Object dataValueDescriptor;
    private DERObjectIdentifier directReference;
    private int encoding;
    private DERObject externalContent;
    private DERInteger indirectReference;

    /* JADX WARN: Invalid debug info offset */
    public DERExternal(ASN1EncodableVector aSN1EncodableVector) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DERExternal(DERObjectIdentifier dERObjectIdentifier, DERInteger dERInteger, ASN1Object aSN1Object, int i, DERObject dERObject) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DERExternal(DERObjectIdentifier dERObjectIdentifier, DERInteger dERInteger, ASN1Object aSN1Object, DERTaggedObject dERTaggedObject) {
    }

    /* JADX WARN: Invalid debug info offset */
    private DERObject getObjFromVector(ASN1EncodableVector aSN1EncodableVector, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private void setDataValueDescriptor(ASN1Object aSN1Object) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void setDirectReference(DERObjectIdentifier dERObjectIdentifier) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void setEncoding(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void setExternalContent(DERObject dERObject) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void setIndirectReference(DERInteger dERInteger) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Object
    public boolean asn1Equals(DERObject dERObject) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.DERObject
    public void encode(DEROutputStream dEROutputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Object getDataValueDescriptor() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObjectIdentifier getDirectReference() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getEncoding() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObject getExternalContent() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERInteger getIndirectReference() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.DERObject, org.bouncycastle.asn1.ASN1Encodable
    public int hashCode() {
        return 0;
    }
}
