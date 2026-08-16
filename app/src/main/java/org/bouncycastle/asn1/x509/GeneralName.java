package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEREncodable;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.x500.X500Name;

/* JADX INFO: loaded from: classes2.dex */
public class GeneralName extends ASN1Encodable implements ASN1Choice {
    public static final int dNSName = 2;
    public static final int directoryName = 4;
    public static final int ediPartyName = 5;
    public static final int iPAddress = 7;
    public static final int otherName = 0;
    public static final int registeredID = 8;
    public static final int rfc822Name = 1;
    public static final int uniformResourceIdentifier = 6;
    public static final int x400Address = 3;
    DEREncodable obj;
    int tag;

    /* JADX WARN: Invalid debug info offset */
    public GeneralName(int i, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralName(int i, ASN1Encodable aSN1Encodable) {
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralName(DERObject dERObject, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralName(X500Name x500Name) {
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralName(X509Name x509Name) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void copyInts(int[] iArr, byte[] bArr, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0079
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static org.bouncycastle.asn1.x509.GeneralName getInstance(java.lang.Object r3) {
        /*
            r0 = 0
            return r0
        L84:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.x509.GeneralName.getInstance(java.lang.Object):org.bouncycastle.asn1.x509.GeneralName");
    }

    /* JADX WARN: Invalid debug info offset */
    public static GeneralName getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private void parseIPv4(String str, byte[] bArr, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void parseIPv4Mask(String str, byte[] bArr, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    private int[] parseIPv6(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private int[] parseMask(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[] toGeneralNameEncoding(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public DEREncodable getName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getTagNo() {
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
