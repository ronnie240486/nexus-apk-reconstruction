package org.bouncycastle.asn1.x500;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x500.style.BCStyle;

/* JADX INFO: loaded from: classes2.dex */
public class X500Name extends ASN1Encodable implements ASN1Choice {
    private static X500NameStyle defaultStyle = BCStyle.INSTANCE;
    private int hashCodeValue;
    private boolean isHashCodeCalculated;
    private RDN[] rdns;
    private X500NameStyle style;

    /* JADX WARN: Invalid debug info offset */
    public X500Name(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    private X500Name(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X500Name(X500NameStyle x500NameStyle, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    private X500Name(X500NameStyle x500NameStyle, ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X500Name(X500NameStyle x500NameStyle, X500Name x500Name) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X500Name(X500NameStyle x500NameStyle, RDN[] rdnArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public X500Name(RDN[] rdnArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static X500NameStyle getDefaultStyle() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static X500Name getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static X500Name getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setDefaultStyle(X500NameStyle x500NameStyle) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0020
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 0
            return r0
        L36:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.x500.X500Name.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    public RDN[] getRDNs() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public RDN[] getRDNs(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
