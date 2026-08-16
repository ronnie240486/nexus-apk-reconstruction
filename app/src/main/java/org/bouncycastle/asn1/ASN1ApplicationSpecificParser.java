package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface ASN1ApplicationSpecificParser extends DEREncodable, InMemoryRepresentable {
    DEREncodable readObject() throws IOException;
}
