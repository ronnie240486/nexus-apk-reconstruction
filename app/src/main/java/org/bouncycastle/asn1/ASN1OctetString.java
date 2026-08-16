package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ASN1OctetString extends ASN1Object implements ASN1OctetStringParser {
    byte[] string;

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public ASN1OctetString(org.bouncycastle.asn1.DEREncodable r4) {
        /*
            r3 = this;
            return
        L10:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.ASN1OctetString.<init>(org.bouncycastle.asn1.DEREncodable):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1OctetString(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static ASN1OctetString getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static ASN1OctetString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
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
    @Override // org.bouncycastle.asn1.ASN1OctetStringParser
    public InputStream getOctetStream() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getOctets() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.DERObject, org.bouncycastle.asn1.ASN1Encodable
    public int hashCode() {
        return 0;
    }

    public ASN1OctetStringParser parser() {
        return this;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
