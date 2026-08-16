package org.bouncycastle.crypto.tls;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public interface TlsCipher {
    byte[] decodeCiphertext(short s2, byte[] bArr, int i, int i2) throws IOException;

    byte[] encodePlaintext(short s2, byte[] bArr, int i, int i2) throws IOException;
}
