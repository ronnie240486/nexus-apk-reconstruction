package org.bouncycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes2.dex */
public class JCEStreamCipher extends WrapCipherSpi implements PBE {
    private Class[] availableSpecs;
    private StreamCipher cipher;
    private int ivLength;
    private ParametersWithIV ivParam;
    private String pbeAlgorithm;
    private PBEParameterSpec pbeSpec;

    public static class Blowfish_CFB8 extends JCEStreamCipher {
    }

    public static class Blowfish_OFB8 extends JCEStreamCipher {
    }

    public static class DES_CFB8 extends JCEStreamCipher {
    }

    public static class DES_OFB8 extends JCEStreamCipher {
    }

    public static class DESede_CFB8 extends JCEStreamCipher {
    }

    public static class DESede_OFB8 extends JCEStreamCipher {
    }

    public static class PBEWithSHAAnd128BitRC4 extends JCEStreamCipher {
    }

    public static class PBEWithSHAAnd40BitRC4 extends JCEStreamCipher {
    }

    public static class Skipjack_CFB8 extends JCEStreamCipher {
    }

    public static class Skipjack_OFB8 extends JCEStreamCipher {
    }

    public static class Twofish_CFB8 extends JCEStreamCipher {
    }

    public static class Twofish_OFB8 extends JCEStreamCipher {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEStreamCipher(BlockCipher blockCipher, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEStreamCipher(StreamCipher streamCipher, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        return null;
    }

    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        return 0;
    }

    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        return i;
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
        L16:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JCEStreamCipher.engineGetParameters():java.security.AlgorithmParameters");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public void engineInit(int r5, java.security.Key r6, java.security.AlgorithmParameters r7, java.security.SecureRandom r8) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        /*
            r4 = this;
            return
        L10:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JCEStreamCipher.engineInit(int, java.security.Key, java.security.AlgorithmParameters, java.security.SecureRandom):void");
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
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JCEStreamCipher.engineInit(int, java.security.Key, java.security.SecureRandom):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public void engineSetMode(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        return null;
    }
}
