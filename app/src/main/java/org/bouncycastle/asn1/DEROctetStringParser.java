package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class DEROctetStringParser implements ASN1OctetStringParser {
    private DefiniteLengthInputStream stream;

    /* JADX WARN: Invalid debug info offset */
    public DEROctetStringParser(DefiniteLengthInputStream definiteLengthInputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.DEREncodable
    public DERObject getDERObject() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public DERObject getLoadedObject() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1OctetStringParser
    public InputStream getOctetStream() {
        return null;
    }
}
