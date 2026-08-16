package org.bouncycastle.asn1.x509;

import java.io.IOException;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;

/* JADX INFO: loaded from: classes2.dex */
public abstract class X509NameEntryConverter {
    /* JADX WARN: Invalid debug info offset */
    public boolean canBePrintable(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public DERObject convertHexEncoded(String str, int i) throws IOException {
        return null;
    }

    public abstract DERObject getConvertedValue(DERObjectIdentifier dERObjectIdentifier, String str);
}
