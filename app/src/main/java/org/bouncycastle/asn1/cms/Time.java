package org.bouncycastle.asn1.cms;

import java.util.Date;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class Time extends ASN1Encodable implements ASN1Choice {
    DERObject time;

    /* JADX WARN: Invalid debug info offset */
    public Time(Date date) {
    }

    /* JADX WARN: Invalid debug info offset */
    public Time(DERObject dERObject) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static Time getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Time getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Date getDate() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getTime() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
