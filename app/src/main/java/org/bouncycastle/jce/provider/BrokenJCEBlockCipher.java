package org.bouncycastle.jce.provider;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.NoSuchPaddingException;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes2.dex */
public class BrokenJCEBlockCipher implements BrokenPBE {
    private Class[] availableSpecs;
    private BufferedBlockCipher cipher;
    private AlgorithmParameters engineParams;
    private int ivLength;
    private ParametersWithIV ivParam;
    private int pbeHash;
    private int pbeIvSize;
    private int pbeKeySize;
    private int pbeType;

    public static class BrokePBEWithMD5AndDES extends BrokenJCEBlockCipher {
    }

    public static class BrokePBEWithSHA1AndDES extends BrokenJCEBlockCipher {
    }

    public static class BrokePBEWithSHAAndDES2Key extends BrokenJCEBlockCipher {
    }

    public static class BrokePBEWithSHAAndDES3Key extends BrokenJCEBlockCipher {
    }

    public static class OldPBEWithSHAAndDES3Key extends BrokenJCEBlockCipher {
    }

    public static class OldPBEWithSHAAndTwofish extends BrokenJCEBlockCipher {
    }

    /* JADX WARN: Invalid debug info offset */
    public BrokenJCEBlockCipher(BlockCipher blockCipher) {
    }

    /* JADX WARN: Invalid debug info offset */
    public BrokenJCEBlockCipher(BlockCipher blockCipher, int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public int engineDoFinal(byte[] r7, int r8, int r9, byte[] r10, int r11) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        /*
            r6 = this;
            r0 = 0
            return r0
        L18:
        L1a:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.BrokenJCEBlockCipher.engineDoFinal(byte[], int, int, byte[], int):int");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0016
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public byte[] engineDoFinal(byte[] r9, int r10, int r11) throws javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        /*
            r8 = this;
            r0 = 0
            return r0
        L23:
        L25:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.BrokenJCEBlockCipher.engineDoFinal(byte[], int, int):byte[]");
    }

    /* JADX WARN: Invalid debug info offset */
    public int engineGetBlockSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] engineGetIV() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int engineGetKeySize(Key key) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public int engineGetOutputSize(int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0023
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public java.security.AlgorithmParameters engineGetParameters() {
        /*
            r3 = this;
            r0 = 0
            return r0
        L35:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.BrokenJCEBlockCipher.engineGetParameters():java.security.AlgorithmParameters");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public void engineInit(int r5, java.security.Key r6, java.security.AlgorithmParameters r7, java.security.SecureRandom r8) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        /*
            r4 = this;
            return
        L10:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.BrokenJCEBlockCipher.engineInit(int, java.security.Key, java.security.AlgorithmParameters, java.security.SecureRandom):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public void engineInit(int r2, java.security.Key r3, java.security.SecureRandom r4) throws java.security.InvalidKeyException {
        /*
            r1 = this;
            return
        L5:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.BrokenJCEBlockCipher.engineInit(int, java.security.Key, java.security.SecureRandom):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void engineSetMode(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void engineSetPadding(String str) throws NoSuchPaddingException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public java.security.Key engineUnwrap(byte[] r4, java.lang.String r5, int r6) throws java.security.InvalidKeyException {
        /*
            r3 = this;
            r0 = 0
            return r0
        L24:
        L26:
        L28:
        L83:
        L85:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.BrokenJCEBlockCipher.engineUnwrap(byte[], java.lang.String, int):java.security.Key");
    }

    /* JADX WARN: Invalid debug info offset */
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public byte[] engineWrap(java.security.Key r3) throws javax.crypto.IllegalBlockSizeException, java.security.InvalidKeyException {
        /*
            r2 = this;
            r0 = 0
            return r0
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.BrokenJCEBlockCipher.engineWrap(java.security.Key):byte[]");
    }
}
