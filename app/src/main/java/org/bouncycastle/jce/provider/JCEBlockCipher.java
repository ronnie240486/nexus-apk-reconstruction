package org.bouncycastle.jce.provider;

import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.crypto.paddings.BlockCipherPadding;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes2.dex */
public class JCEBlockCipher extends WrapCipherSpi implements PBE {
    private Class[] availableSpecs;
    private BlockCipher baseEngine;
    private GenericBlockCipher cipher;
    private int ivLength;
    private ParametersWithIV ivParam;
    private String modeName;
    private boolean padded;
    private String pbeAlgorithm;
    private PBEParameterSpec pbeSpec;

    public static class AEADGenericBlockCipher implements GenericBlockCipher {
        private AEADBlockCipher cipher;

        /* JADX WARN: Invalid debug info offset */
        public AEADGenericBlockCipher(AEADBlockCipher aEADBlockCipher) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JCEBlockCipher.GenericBlockCipher
        public int doFinal(byte[] bArr, int i) throws InvalidCipherTextException, IllegalStateException {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JCEBlockCipher.GenericBlockCipher
        public String getAlgorithmName() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JCEBlockCipher.GenericBlockCipher
        public int getOutputSize(int i) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JCEBlockCipher.GenericBlockCipher
        public BlockCipher getUnderlyingCipher() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JCEBlockCipher.GenericBlockCipher
        public int getUpdateOutputSize(int i) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JCEBlockCipher.GenericBlockCipher
        public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JCEBlockCipher.GenericBlockCipher
        public int processByte(byte b, byte[] bArr, int i) throws DataLengthException {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JCEBlockCipher.GenericBlockCipher
        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
            return 0;
        }

        @Override // org.bouncycastle.jce.provider.JCEBlockCipher.GenericBlockCipher
        public boolean wrapOnNoPadding() {
            return false;
        }
    }

    public static class BufferedGenericBlockCipher implements GenericBlockCipher {
        private BufferedBlockCipher cipher;

        /* JADX WARN: Invalid debug info offset */
        public BufferedGenericBlockCipher(BlockCipher blockCipher) {
        }

        /* JADX WARN: Invalid debug info offset */
        public BufferedGenericBlockCipher(BlockCipher blockCipher, BlockCipherPadding blockCipherPadding) {
        }

        /* JADX WARN: Invalid debug info offset */
        public BufferedGenericBlockCipher(BufferedBlockCipher bufferedBlockCipher) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JCEBlockCipher.GenericBlockCipher
        public int doFinal(byte[] bArr, int i) throws InvalidCipherTextException, IllegalStateException {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JCEBlockCipher.GenericBlockCipher
        public String getAlgorithmName() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JCEBlockCipher.GenericBlockCipher
        public int getOutputSize(int i) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JCEBlockCipher.GenericBlockCipher
        public BlockCipher getUnderlyingCipher() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JCEBlockCipher.GenericBlockCipher
        public int getUpdateOutputSize(int i) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JCEBlockCipher.GenericBlockCipher
        public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JCEBlockCipher.GenericBlockCipher
        public int processByte(byte b, byte[] bArr, int i) throws DataLengthException {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JCEBlockCipher.GenericBlockCipher
        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.bouncycastle.jce.provider.JCEBlockCipher.GenericBlockCipher
        public boolean wrapOnNoPadding() {
            return false;
        }
    }

    public static class DES extends JCEBlockCipher {
    }

    public static class DESCBC extends JCEBlockCipher {
    }

    public static class GOST28147 extends JCEBlockCipher {
    }

    public static class GOST28147cbc extends JCEBlockCipher {
    }

    public interface GenericBlockCipher {
        int doFinal(byte[] bArr, int i) throws InvalidCipherTextException, IllegalStateException;

        String getAlgorithmName();

        int getOutputSize(int i);

        BlockCipher getUnderlyingCipher();

        int getUpdateOutputSize(int i);

        void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException;

        int processByte(byte b, byte[] bArr, int i) throws DataLengthException;

        int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException;

        boolean wrapOnNoPadding();
    }

    public static class PBEWithAESCBC extends JCEBlockCipher {
    }

    public static class PBEWithMD5AndDES extends JCEBlockCipher {
    }

    public static class PBEWithMD5AndRC2 extends JCEBlockCipher {
    }

    public static class PBEWithSHA1AndDES extends JCEBlockCipher {
    }

    public static class PBEWithSHA1AndRC2 extends JCEBlockCipher {
    }

    public static class PBEWithSHAAnd128BitRC2 extends JCEBlockCipher {
    }

    public static class PBEWithSHAAnd40BitRC2 extends JCEBlockCipher {
    }

    public static class PBEWithSHAAndDES2Key extends JCEBlockCipher {
    }

    public static class PBEWithSHAAndDES3Key extends JCEBlockCipher {
    }

    public static class PBEWithSHAAndTwofish extends JCEBlockCipher {
    }

    public static class RC2 extends JCEBlockCipher {
    }

    public static class RC2CBC extends JCEBlockCipher {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEBlockCipher(BlockCipher blockCipher) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEBlockCipher(BlockCipher blockCipher, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEBlockCipher(BufferedBlockCipher bufferedBlockCipher, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    private boolean isAEADModeName(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public int engineDoFinal(byte[] r7, int r8, int r9, byte[] r10, int r11) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        /*
            r6 = this;
            r0 = 0
            return r0
        L18:
        L1a:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JCEBlockCipher.engineDoFinal(byte[], int, int, byte[], int):int");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0016
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] r10, int r11, int r12) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        /*
            r9 = this;
            r0 = 0
            return r0
        L26:
        L28:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JCEBlockCipher.engineDoFinal(byte[], int, int):byte[]");
    }

    /* JADX WARN: Invalid debug info offset */
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
            r3 = this;
            r0 = 0
            return r0
        L18:
        L4b:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JCEBlockCipher.engineGetParameters():java.security.AlgorithmParameters");
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
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JCEBlockCipher.engineInit(int, java.security.Key, java.security.AlgorithmParameters, java.security.SecureRandom):void");
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
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JCEBlockCipher.engineInit(int, java.security.Key, java.security.SecureRandom):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0246
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public void engineInit(int r5, java.security.Key r6, java.security.spec.AlgorithmParameterSpec r7, java.security.SecureRandom r8) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        /*
            Method dump skipped, instruction units count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JCEBlockCipher.engineInit(int, java.security.Key, java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom):void");
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
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.provider.WrapCipherSpi, javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        return null;
    }
}
