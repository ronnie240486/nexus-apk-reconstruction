package org.bouncycastle.asn1.nist;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.p015x9.X9ECParameters;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;

/* JADX INFO: loaded from: classes2.dex */
public class NISTNamedCurves {
    static final Hashtable objIds = new Hashtable();
    static final Hashtable names = new Hashtable();

    static {
        defineCurve("B-571", SECObjectIdentifiers.sect571r1);
        defineCurve("B-409", SECObjectIdentifiers.sect409r1);
        defineCurve("B-283", SECObjectIdentifiers.sect283r1);
        defineCurve("B-233", SECObjectIdentifiers.sect233r1);
        defineCurve("B-163", SECObjectIdentifiers.sect163r2);
        defineCurve("P-521", SECObjectIdentifiers.secp521r1);
        defineCurve("P-384", SECObjectIdentifiers.secp384r1);
        defineCurve("P-256", SECObjectIdentifiers.secp256r1);
        defineCurve("P-224", SECObjectIdentifiers.secp224r1);
        defineCurve("P-192", SECObjectIdentifiers.secp192r1);
    }

    /* JADX WARN: Invalid debug info offset */
    public static void defineCurve(String str, DERObjectIdentifier dERObjectIdentifier) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static X9ECParameters getByName(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static X9ECParameters getByOID(DERObjectIdentifier dERObjectIdentifier) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getName(DERObjectIdentifier dERObjectIdentifier) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static Enumeration getNames() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static DERObjectIdentifier getOID(String str) {
        return null;
    }
}
