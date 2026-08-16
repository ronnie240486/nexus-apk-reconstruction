package org.bouncycastle.jce.provider;

import java.security.PrivilegedAction;
import java.security.Provider;
import java.util.Map;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.jce.interfaces.ConfigurableProvider;

/* JADX INFO: loaded from: classes2.dex */
public final class BouncyCastleProvider extends Provider implements ConfigurableProvider {
    private static final String ASYMMETRIC_CIPHER_PACKAGE = "org.bouncycastle.jce.provider.asymmetric.";
    public static String PROVIDER_NAME = "BC";
    private static final String SYMMETRIC_CIPHER_PACKAGE = "org.bouncycastle.jce.provider.symmetric.";

    /* JADX INFO: renamed from: info, reason: collision with root package name */
    private static String f19798info = "BouncyCastle Security Provider v1.46";
    private static final String[] SYMMETRIC_CIPHERS = {"AES", "ARC4", "Blowfish", "Camellia", "CAST5", "CAST6", "DESede", "Grainv1", "Grain128", "HC128", "HC256", "IDEA", "Noekeon", "RC5", "RC6", "Rijndael", "Salsa20", "SEED", "Serpent", "Skipjack", "TEA", "Twofish", "VMPC", "VMPCKSA3", "XTEA"};
    private static final String[] ASYMMETRIC_CIPHERS = {"EC"};

    /* JADX INFO: renamed from: org.bouncycastle.jce.provider.BouncyCastleProvider$1 */
    public final class C50431 implements PrivilegedAction {
        final /* synthetic */ BouncyCastleProvider this$0;

        /* JADX WARN: Invalid debug info offset */
        public C50431(BouncyCastleProvider bouncyCastleProvider) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.security.PrivilegedAction
        public Object run() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public static /* synthetic */ void access$000(BouncyCastleProvider bouncyCastleProvider) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void addHMACAlgorithm(String str, String str2, String str3) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void addHMACAlias(String str, DERObjectIdentifier dERObjectIdentifier) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void addMacAlgorithms() {
    }

    /* JADX WARN: Invalid debug info offset */
    private void addMappings(Map map) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void addMessageDigestAlgorithms() {
    }

    /* JADX WARN: Invalid debug info offset */
    private void addSignatureAlgorithm(String str, String str2, String str3, DERObjectIdentifier dERObjectIdentifier) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void addSignatureAlgorithms() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private void loadAlgorithms(java.lang.String r6, java.lang.String[] r7) {
        /*
            r5 = this;
            return
        L40:
        L4d:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.BouncyCastleProvider.loadAlgorithms(java.lang.String, java.lang.String[]):void");
    }

    /* JADX WARN: Invalid debug info offset */
    private void setup() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.jce.interfaces.ConfigurableProvider
    public void setParameter(String str, Object obj) {
    }
}
