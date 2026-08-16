package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class BERNull extends DERNull {
    public static final BERNull INSTANCE = new BERNull();

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.DERNull, org.bouncycastle.asn1.ASN1Null, org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.DERObject
    public void encode(DEROutputStream dEROutputStream) throws IOException {
    }
}
