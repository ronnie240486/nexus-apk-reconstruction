package org.bouncycastle.jce.provider;

import java.util.Collection;
import org.bouncycastle.util.CollectionStore;
import org.bouncycastle.util.Selector;
import org.bouncycastle.x509.X509StoreParameters;
import org.bouncycastle.x509.X509StoreSpi;

/* JADX INFO: loaded from: classes2.dex */
public class X509StoreCRLCollection extends X509StoreSpi {
    private CollectionStore _store;

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.x509.X509StoreSpi
    public Collection engineGetMatches(Selector selector) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.x509.X509StoreSpi
    public void engineInit(X509StoreParameters x509StoreParameters) {
    }
}
