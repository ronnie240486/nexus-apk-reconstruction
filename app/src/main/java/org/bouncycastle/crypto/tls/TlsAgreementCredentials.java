package org.bouncycastle.crypto.tls;

import java.io.IOException;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes2.dex */
public interface TlsAgreementCredentials extends TlsCredentials {
    byte[] generateAgreement(AsymmetricKeyParameter asymmetricKeyParameter) throws IOException;
}
