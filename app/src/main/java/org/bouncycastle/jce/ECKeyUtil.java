package org.bouncycastle.jce;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes2.dex */
public class ECKeyUtil {

    public static class UnexpectedException extends RuntimeException {
        private Throwable cause;

        /* JADX WARN: Invalid debug info offset */
        public UnexpectedException(Throwable th) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Throwable
        public Throwable getCause() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public static PrivateKey privateToExplicitParameters(PrivateKey privateKey, String str) throws NoSuchAlgorithmException, IllegalArgumentException, NoSuchProviderException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x0053
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public static java.security.PrivateKey privateToExplicitParameters(java.security.PrivateKey r6, java.security.Provider r7) throws java.lang.IllegalArgumentException, java.security.NoSuchAlgorithmException {
        /*
            r0 = 0
            return r0
        L51:
        L53:
        L55:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.ECKeyUtil.privateToExplicitParameters(java.security.PrivateKey, java.security.Provider):java.security.PrivateKey");
    }

    /* JADX WARN: Invalid debug info offset */
    public static PublicKey publicToExplicitParameters(PublicKey publicKey, String str) throws NoSuchAlgorithmException, IllegalArgumentException, NoSuchProviderException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x0053
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public static java.security.PublicKey publicToExplicitParameters(java.security.PublicKey r6, java.security.Provider r7) throws java.lang.IllegalArgumentException, java.security.NoSuchAlgorithmException {
        /*
            r0 = 0
            return r0
        L51:
        L53:
        L55:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.ECKeyUtil.publicToExplicitParameters(java.security.PublicKey, java.security.Provider):java.security.PublicKey");
    }
}
