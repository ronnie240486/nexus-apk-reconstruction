package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ASN1Sequence extends ASN1Object {
    private Vector seq;

    /* JADX INFO: renamed from: org.bouncycastle.asn1.ASN1Sequence$1 */
    public final class C49671 implements ASN1SequenceParser {
        private int index;
        private final int max;
        final /* synthetic */ ASN1Sequence this$0;
        final /* synthetic */ ASN1Sequence val$outer;

        /* JADX WARN: Invalid debug info offset */
        public C49671(ASN1Sequence aSN1Sequence, ASN1Sequence aSN1Sequence2) {
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
        @Override // org.bouncycastle.asn1.ASN1SequenceParser
        public DEREncodable readObject() throws IOException {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static org.bouncycastle.asn1.ASN1Sequence getInstance(java.lang.Object r3) {
        /*
            r0 = 0
            return r0
        L16:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.ASN1Sequence.getInstance(java.lang.Object):org.bouncycastle.asn1.ASN1Sequence");
    }

    /* JADX WARN: Invalid debug info offset */
    public static ASN1Sequence getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private DEREncodable getNext(Enumeration enumeration) {
        return null;
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
    public ASN1SequenceParser parser() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int size() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
