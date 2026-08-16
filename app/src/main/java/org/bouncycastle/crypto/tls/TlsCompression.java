package org.bouncycastle.crypto.tls;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public interface TlsCompression {
    OutputStream compress(OutputStream outputStream);

    OutputStream decompress(OutputStream outputStream);
}
