package org.bouncycastle.asn1.x509;

import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERObject;

/* JADX INFO: loaded from: classes2.dex */
public class IetfAttrSyntax extends ASN1Encodable {
    public static final int VALUE_OCTETS = 1;
    public static final int VALUE_OID = 2;
    public static final int VALUE_UTF8 = 3;
    GeneralNames policyAuthority;
    int valueChoice;
    Vector values;

    /* JADX WARN: Invalid debug info offset */
    public IetfAttrSyntax(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public GeneralNames getPolicyAuthority() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getValueType() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public Object[] getValues() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public DERObject toASN1Object() {
        return null;
    }
}
