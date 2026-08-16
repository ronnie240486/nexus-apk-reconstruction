package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public class BERTaggedObjectParser implements ASN1TaggedObjectParser {
    private boolean _constructed;
    private ASN1StreamParser _parser;
    private int _tagNumber;

    /* JADX WARN: Invalid debug info offset */
    public BERTaggedObjectParser(int i, int i2, InputStream inputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    public BERTaggedObjectParser(boolean z, int i, ASN1StreamParser aSN1StreamParser) {
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
    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public DEREncodable getObjectParser(int i, boolean z) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1TaggedObjectParser
    public int getTagNo() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isConstructed() {
        return false;
    }
}
