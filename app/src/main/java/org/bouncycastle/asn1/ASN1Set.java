package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ASN1Set extends ASN1Object {
    protected Vector set;

    /* JADX INFO: renamed from: org.bouncycastle.asn1.ASN1Set$1 */
    public final class C49681 implements ASN1SetParser {
        private int index;
        private final int max;
        final /* synthetic */ ASN1Set this$0;
        final /* synthetic */ ASN1Set val$outer;

        /* JADX WARN: Invalid debug info offset */
        public C49681(ASN1Set aSN1Set, ASN1Set aSN1Set2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.asn1.DEREncodable
        public DERObject getDERObject() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.asn1.InMemoryRepresentable
        public DERObject getLoadedObject() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.asn1.ASN1SetParser
        public DEREncodable readObject() throws IOException {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private byte[] getEncoded(org.bouncycastle.asn1.DEREncodable r3) {
        /*
            r2 = this;
            r0 = 0
            return r0
        L12:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.ASN1Set.getEncoded(org.bouncycastle.asn1.DEREncodable):byte[]");
    }

    /* JADX WARN: Invalid debug info offset */
    public static ASN1Set getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static ASN1Set getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private DEREncodable getNext(Enumeration enumeration) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean lessThanOrEqual(byte[] bArr, byte[] bArr2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void addObject(DEREncodable dEREncodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Object
    public boolean asn1Equals(DERObject dERObject) {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.DERObject
    public abstract void encode(DEROutputStream dEROutputStream) throws IOException;

    /* JADX WARN: Invalid debug info offset */
    public DEREncodable getObjectAt(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Enumeration getObjects() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.DERObject, org.bouncycastle.asn1.ASN1Encodable
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1SetParser parser() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int size() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void sort() {
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Encodable[] toArray() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
