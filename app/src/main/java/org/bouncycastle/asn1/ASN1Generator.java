package org.bouncycastle.asn1;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ASN1Generator {
    protected OutputStream _out;

    /* JADX WARN: Invalid debug info offset */
    public ASN1Generator(OutputStream outputStream) {
    }

    public abstract OutputStream getRawOutputStream();
}
