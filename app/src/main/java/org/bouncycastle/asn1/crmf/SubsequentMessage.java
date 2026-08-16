package org.bouncycastle.asn1.crmf;

import org.bouncycastle.asn1.DERInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SubsequentMessage extends DERInteger {
    public static final SubsequentMessage encrCert = new SubsequentMessage(0);
    public static final SubsequentMessage challengeResp = new SubsequentMessage(1);

    /* JADX WARN: Invalid debug info offset */
    private SubsequentMessage(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static SubsequentMessage valueOf(int i) {
        return null;
    }
}
