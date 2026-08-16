package org.bouncycastle.jce.provider;

import java.io.OutputStream;
import java.security.KeyStore;

/* JADX INFO: loaded from: classes2.dex */
public class JDKPKCS12StoreParameter implements KeyStore.LoadStoreParameter {
    private OutputStream outputStream;
    private KeyStore.ProtectionParameter protectionParameter;
    private boolean useDEREncoding;

    /* JADX WARN: Invalid debug info offset */
    public OutputStream getOutputStream() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.security.KeyStore.LoadStoreParameter
    public KeyStore.ProtectionParameter getProtectionParameter() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isUseDEREncoding() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setOutputStream(OutputStream outputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setPassword(char[] cArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setProtectionParameter(KeyStore.ProtectionParameter protectionParameter) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setUseDEREncoding(boolean z) {
    }
}
