package org.bouncycastle.asn1.icao;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERPrintableString;

/* JADX INFO: loaded from: classes2.dex */
public class LDSVersionInfo extends ASN1Encodable {
    private DERPrintableString ldsVersion;
    private DERPrintableString unicodeVersion;

    /* JADX WARN: Invalid debug info offset */
    public LDSVersionInfo(String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private LDSVersionInfo(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static LDSVersionInfo getInstance(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getLdsVersion() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getUnicodeVersion() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
