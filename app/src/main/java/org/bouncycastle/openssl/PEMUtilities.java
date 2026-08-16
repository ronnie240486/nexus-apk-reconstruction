package org.bouncycastle.openssl;

import com.google.android.exoplayer2.extractor.p006ts.PsExtractor;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.SecretKey;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;

/* JADX INFO: loaded from: classes2.dex */
final class PEMUtilities {
    private static final Map KEYSIZES;
    private static final Set PKCS5_SCHEME_1;
    private static final Set PKCS5_SCHEME_2;

    static {
        HashMap map = new HashMap();
        KEYSIZES = map;
        HashSet hashSet = new HashSet();
        PKCS5_SCHEME_1 = hashSet;
        HashSet hashSet2 = new HashSet();
        PKCS5_SCHEME_2 = hashSet2;
        hashSet.add(PKCSObjectIdentifiers.pbeWithMD2AndDES_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithMD2AndRC2_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithMD5AndDES_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithMD5AndRC2_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithSHA1AndDES_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithSHA1AndRC2_CBC);
        hashSet2.add(PKCSObjectIdentifiers.id_PBES2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.des_EDE3_CBC;
        hashSet2.add(aSN1ObjectIdentifier);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes128_CBC;
        hashSet2.add(aSN1ObjectIdentifier2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_aes192_CBC;
        hashSet2.add(aSN1ObjectIdentifier3);
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_aes256_CBC;
        hashSet2.add(aSN1ObjectIdentifier4);
        map.put(aSN1ObjectIdentifier.getId(), new Integer(PsExtractor.AUDIO_STREAM));
        map.put(aSN1ObjectIdentifier2.getId(), new Integer(128));
        map.put(aSN1ObjectIdentifier3.getId(), new Integer(PsExtractor.AUDIO_STREAM));
        map.put(aSN1ObjectIdentifier4.getId(), new Integer(256));
    }

    /* JADX WARN: Invalid debug info offset */
    public static byte[] crypt(boolean z, String str, byte[] bArr, char[] cArr, String str2, byte[] bArr2) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x00fe
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public static byte[] crypt(boolean r8, java.security.Provider r9, byte[] r10, char[] r11, java.lang.String r12, byte[] r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.openssl.PEMUtilities.crypt(boolean, java.security.Provider, byte[], char[], java.lang.String, byte[]):byte[]");
    }

    /* JADX WARN: Invalid debug info offset */
    public static SecretKey generateSecretKeyForPKCS5Scheme2(String str, char[] cArr, byte[] bArr, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static SecretKey getKey(char[] cArr, String str, int i, byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static SecretKey getKey(char[] cArr, String str, int i, byte[] bArr, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static int getKeySize(String str) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isPKCS12(DERObjectIdentifier dERObjectIdentifier) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isPKCS5Scheme1(DERObjectIdentifier dERObjectIdentifier) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isPKCS5Scheme2(DERObjectIdentifier dERObjectIdentifier) {
        return false;
    }
}
