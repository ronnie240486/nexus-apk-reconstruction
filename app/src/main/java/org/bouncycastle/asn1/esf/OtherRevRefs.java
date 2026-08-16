package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class OtherRevRefs extends ASN1Encodable {
    private ASN1ObjectIdentifier otherRevRefType;
    private ASN1Object otherRevRefs;

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x001d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private OtherRevRefs(org.bouncycastle.asn1.ASN1Sequence r4) {
        /*
            r3 = this;
            return
        L30:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.esf.OtherRevRefs.<init>(org.bouncycastle.asn1.ASN1Sequence):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public static OtherRevRefs getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1ObjectIdentifier getOtherRevRefType() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public ASN1Object getOtherRevRefs() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
