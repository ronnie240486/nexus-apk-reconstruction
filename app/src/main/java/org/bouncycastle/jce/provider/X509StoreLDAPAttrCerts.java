package org.bouncycastle.jce.provider;

import java.util.Collection;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.StoreException;
import org.bouncycastle.x509.X509StoreParameters;
import org.bouncycastle.x509.X509StoreSpi;
import org.bouncycastle.x509.util.LDAPStoreHelper;

/* JADX INFO: loaded from: classes2.dex */
public class X509StoreLDAPAttrCerts extends X509StoreSpi {
    private LDAPStoreHelper helper;

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.x509.X509StoreSpi
    public Collection engineGetMatches(Selector selector) throws StoreException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.x509.X509StoreSpi
    public void engineInit(X509StoreParameters x509StoreParameters) {
    }
}
