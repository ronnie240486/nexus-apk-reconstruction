package org.bouncycastle.jce.provider;

import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.OAEPParameterSpec;
import org.bouncycastle.crypto.AsymmetricBlockCipher;

/* JADX INFO: loaded from: classes2.dex */
public class JCERSACipher extends WrapCipherSpi {
    private ByteArrayOutputStream bOut;
    private AsymmetricBlockCipher cipher;
    private AlgorithmParameters engineParams;
    private AlgorithmParameterSpec paramSpec;
    private boolean privateKeyOnly;
    private boolean publicKeyOnly;

    public static class ISO9796d1Padding extends JCERSACipher {
    }

    public static class NoPadding extends JCERSACipher {
    }

    public static class OAEPPadding extends JCERSACipher {
    }

    public static class PKCS1v1_5Padding extends JCERSACipher {
    }

    public static class PKCS1v1_5Padding_PrivateOnly extends JCERSACipher {
    }

    public static class PKCS1v1_5Padding_PublicOnly extends JCERSACipher {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public JCERSACipher(javax.crypto.spec.OAEPParameterSpec r2) {
        /*
            r1 = this;
            return
        L13:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JCERSACipher.<init>(javax.crypto.spec.OAEPParameterSpec):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public JCERSACipher(AsymmetricBlockCipher asymmetricBlockCipher) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCERSACipher(boolean z, boolean z2, AsymmetricBlockCipher asymmetricBlockCipher) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void initFromSpec(OAEPParameterSpec oAEPParameterSpec) throws NoSuchPaddingException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0034
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public int engineDoFinal(byte[] r2, int r3, int r4, byte[] r5, int r6) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        /*
            r1 = this;
            r0 = 0
            return r0
        L55:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JCERSACipher.engineDoFinal(byte[], int, int, byte[], int):int");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0034
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] r2, int r3, int r4) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        /*
            r1 = this;
            r0 = 0
            return r0
        L48:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JCERSACipher.engineDoFinal(byte[], int, int):byte[]");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return 0;
    }

    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0008
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public java.security.AlgorithmParameters engineGetParameters() {
        /*
            r2 = this;
            r0 = 0
            return r0
        L18:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JCERSACipher.engineGetParameters():java.security.AlgorithmParameters");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public void engineInit(int r2, java.security.Key r3, java.security.AlgorithmParameters r4, java.security.SecureRandom r5) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        /*
            r1 = this;
            return
        L9:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JCERSACipher.engineInit(int, java.security.Key, java.security.AlgorithmParameters, java.security.SecureRandom):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public void engineInit(int r2, java.security.Key r3, java.security.SecureRandom r4) throws java.security.InvalidKeyException {
        /*
            r1 = this;
            return
        L5:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JCERSACipher.engineInit(int, java.security.Key, java.security.SecureRandom):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        return null;
    }
}
