package org.bouncycastle.openssl;

import java.io.IOException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.SecureRandom;
import org.bouncycastle.util.p019io.pem.PemGenerationException;
import org.bouncycastle.util.p019io.pem.PemObject;
import org.bouncycastle.util.p019io.pem.PemObjectGenerator;

/* JADX INFO: loaded from: classes2.dex */
public class MiscPEMGenerator implements PemObjectGenerator {
    private String algorithm;
    private Object obj;
    private char[] password;
    private Provider provider;
    private SecureRandom random;

    /* JADX WARN: Invalid debug info offset */
    public MiscPEMGenerator(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    public MiscPEMGenerator(Object obj, String str, char[] cArr, SecureRandom secureRandom, String str2) throws NoSuchProviderException {
    }

    /* JADX WARN: Invalid debug info offset */
    public MiscPEMGenerator(Object obj, String str, char[] cArr, SecureRandom secureRandom, Provider provider) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0018
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private org.bouncycastle.util.p019io.pem.PemObject createPemObject(java.lang.Object r5) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.openssl.MiscPEMGenerator.createPemObject(java.lang.Object):org.bouncycastle.util.io.pem.PemObject");
    }

    /* JADX WARN: Invalid debug info offset */
    private PemObject createPemObject(Object obj, String str, char[] cArr, SecureRandom secureRandom) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private String getHexEncoded(byte[] bArr) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.util.p019io.pem.PemObjectGenerator
    public PemObject generate() throws PemGenerationException {
        return null;
    }
}
