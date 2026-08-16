package org.bouncycastle.crypto.encodings;

import java.security.PrivilegedAction;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;

/* JADX INFO: loaded from: classes2.dex */
public class PKCS1Encoding implements AsymmetricBlockCipher {
    private static final int HEADER_LENGTH = 10;
    public static final String STRICT_LENGTH_ENABLED_PROPERTY = "org.bouncycastle.pkcs1.strict";
    private AsymmetricBlockCipher engine;
    private boolean forEncryption;
    private boolean forPrivateKey;
    private SecureRandom random;
    private boolean useStrictLength;

    /* JADX INFO: renamed from: org.bouncycastle.crypto.encodings.PKCS1Encoding$1 */
    public final class C50401 implements PrivilegedAction {
        final /* synthetic */ PKCS1Encoding this$0;

        /* JADX WARN: Invalid debug info offset */
        public C50401(PKCS1Encoding pKCS1Encoding) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.PrivilegedAction
        public Object run() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public PKCS1Encoding(AsymmetricBlockCipher asymmetricBlockCipher) {
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[] decodeBlock(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private byte[] encodeBlock(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean useStrict() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public AsymmetricBlockCipher getUnderlyingCipher() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i, int i2) throws InvalidCipherTextException {
        return null;
    }
}
