package org.bouncycastle.asn1;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class DERGeneralizedTime extends ASN1Object {
    String time;

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public DERGeneralizedTime(java.lang.String r4) {
        /*
            r3 = this;
            return
        L9:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.DERGeneralizedTime.<init>(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public DERGeneralizedTime(Date date) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DERGeneralizedTime(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private java.lang.String calculateGMTOffset() {
        /*
            r6 = this;
            r0 = 0
            return r0
        L37:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.DERGeneralizedTime.calculateGMTOffset():java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    private String convert(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static DERGeneralizedTime getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static DERGeneralizedTime getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[] getOctets() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean hasFractionalSeconds() {
        return false;
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
    public Date getDate() throws ParseException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getTime() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getTimeString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.DERObject, org.bouncycastle.asn1.ASN1Encodable
    public int hashCode() {
        return 0;
    }
}
