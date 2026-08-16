package org.bouncycastle.jce.provider;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import org.bouncycastle.crypto.Wrapper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WrapCipherSpi extends CipherSpi implements PBE {
    private Class[] availableSpecs;
    protected AlgorithmParameters engineParams;

    /* JADX INFO: renamed from: iv */
    private byte[] f16383iv;
    private int ivSize;
    protected int pbeHash;
    protected int pbeIvSize;
    protected int pbeKeySize;
    protected int pbeType;
    protected Wrapper wrapEngine;

    public static class RC2Wrap extends WrapCipherSpi {
    }

    /* JADX WARN: Invalid debug info offset */
    public WrapCipherSpi() {
    }

    /* JADX WARN: Invalid debug info offset */
    public WrapCipherSpi(Wrapper wrapper) {
    }

    /* JADX WARN: Invalid debug info offset */
    public WrapCipherSpi(Wrapper wrapper, int i) {
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws BadPaddingException, IllegalBlockSizeException {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        return -1;
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // javax.crypto.CipherSpi
    public void engineInit(int r5, java.security.Key r6, java.security.AlgorithmParameters r7, java.security.SecureRandom r8) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        /*
            r4 = this;
            return
        L10:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.WrapCipherSpi.engineInit(int, java.security.Key, java.security.AlgorithmParameters, java.security.SecureRandom):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // javax.crypto.CipherSpi
    public void engineInit(int r2, java.security.Key r3, java.security.SecureRandom r4) throws java.security.InvalidKeyException {
        /*
            r1 = this;
            return
        L5:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.WrapCipherSpi.engineInit(int, java.security.Key, java.security.SecureRandom):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // javax.crypto.CipherSpi
    public java.security.Key engineUnwrap(byte[] r5, java.lang.String r6, int r7) throws java.security.InvalidKeyException {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.WrapCipherSpi.engineUnwrap(byte[], java.lang.String, int):java.security.Key");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // javax.crypto.CipherSpi
    public byte[] engineWrap(java.security.Key r4) throws javax.crypto.IllegalBlockSizeException, java.security.InvalidKeyException {
        /*
            r3 = this;
            r0 = 0
            return r0
        L11:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.WrapCipherSpi.engineWrap(java.security.Key):byte[]");
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws BadPaddingException, IllegalBlockSizeException {
        return null;
    }
}
