package org.bouncycastle.util.p019io.pem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PemObject implements PemObjectGenerator {
    private static final List EMPTY_LIST = Collections.unmodifiableList(new ArrayList());
    private byte[] content;
    private List headers;
    private String type;

    /* JADX WARN: Invalid debug info offset */
    public PemObject(String str, List list, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PemObject(String str, byte[] bArr) {
    }

    @Override // org.bouncycastle.util.p019io.pem.PemObjectGenerator
    public PemObject generate() throws PemGenerationException {
        return this;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getContent() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public List getHeaders() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getType() {
        return null;
    }
}
