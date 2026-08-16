package org.bouncycastle.jce;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.p015x9.X9ObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.CertificationRequest;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.X509Name;
import p000.C5236qM;

/* JADX INFO: loaded from: classes2.dex */
public class PKCS10CertificationRequest extends CertificationRequest {
    private static Hashtable algorithms = new Hashtable();
    private static Hashtable params = new Hashtable();
    private static Hashtable keyAlgorithms = new Hashtable();
    private static Hashtable oids = new Hashtable();
    private static Set noParams = new HashSet();

    static {
        algorithms.put("MD2WITHRSAENCRYPTION", new DERObjectIdentifier("1.2.840.113549.1.1.2"));
        algorithms.put("MD2WITHRSA", new DERObjectIdentifier("1.2.840.113549.1.1.2"));
        algorithms.put("MD5WITHRSAENCRYPTION", new DERObjectIdentifier("1.2.840.113549.1.1.4"));
        algorithms.put("MD5WITHRSA", new DERObjectIdentifier("1.2.840.113549.1.1.4"));
        algorithms.put("RSAWITHMD5", new DERObjectIdentifier("1.2.840.113549.1.1.4"));
        algorithms.put("SHA1WITHRSAENCRYPTION", new DERObjectIdentifier("1.2.840.113549.1.1.5"));
        algorithms.put("SHA1WITHRSA", new DERObjectIdentifier("1.2.840.113549.1.1.5"));
        Hashtable hashtable = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.sha224WithRSAEncryption;
        hashtable.put("SHA224WITHRSAENCRYPTION", aSN1ObjectIdentifier);
        algorithms.put("SHA224WITHRSA", aSN1ObjectIdentifier);
        Hashtable hashtable2 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.sha256WithRSAEncryption;
        hashtable2.put("SHA256WITHRSAENCRYPTION", aSN1ObjectIdentifier2);
        algorithms.put("SHA256WITHRSA", aSN1ObjectIdentifier2);
        Hashtable hashtable3 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = PKCSObjectIdentifiers.sha384WithRSAEncryption;
        hashtable3.put("SHA384WITHRSAENCRYPTION", aSN1ObjectIdentifier3);
        algorithms.put("SHA384WITHRSA", aSN1ObjectIdentifier3);
        Hashtable hashtable4 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = PKCSObjectIdentifiers.sha512WithRSAEncryption;
        hashtable4.put("SHA512WITHRSAENCRYPTION", aSN1ObjectIdentifier4);
        algorithms.put("SHA512WITHRSA", aSN1ObjectIdentifier4);
        Hashtable hashtable5 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = PKCSObjectIdentifiers.id_RSASSA_PSS;
        hashtable5.put("SHA1WITHRSAANDMGF1", aSN1ObjectIdentifier5);
        algorithms.put("SHA224WITHRSAANDMGF1", aSN1ObjectIdentifier5);
        algorithms.put("SHA256WITHRSAANDMGF1", aSN1ObjectIdentifier5);
        algorithms.put("SHA384WITHRSAANDMGF1", aSN1ObjectIdentifier5);
        algorithms.put("SHA512WITHRSAANDMGF1", aSN1ObjectIdentifier5);
        algorithms.put("RSAWITHSHA1", new DERObjectIdentifier("1.2.840.113549.1.1.5"));
        Hashtable hashtable6 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128;
        hashtable6.put("RIPEMD128WITHRSAENCRYPTION", aSN1ObjectIdentifier6);
        algorithms.put("RIPEMD128WITHRSA", aSN1ObjectIdentifier6);
        Hashtable hashtable7 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160;
        hashtable7.put("RIPEMD160WITHRSAENCRYPTION", aSN1ObjectIdentifier7);
        algorithms.put("RIPEMD160WITHRSA", aSN1ObjectIdentifier7);
        Hashtable hashtable8 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256;
        hashtable8.put("RIPEMD256WITHRSAENCRYPTION", aSN1ObjectIdentifier8);
        algorithms.put("RIPEMD256WITHRSA", aSN1ObjectIdentifier8);
        algorithms.put("SHA1WITHDSA", new DERObjectIdentifier("1.2.840.10040.4.3"));
        algorithms.put("DSAWITHSHA1", new DERObjectIdentifier("1.2.840.10040.4.3"));
        Hashtable hashtable9 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = NISTObjectIdentifiers.dsa_with_sha224;
        hashtable9.put("SHA224WITHDSA", aSN1ObjectIdentifier9);
        Hashtable hashtable10 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = NISTObjectIdentifiers.dsa_with_sha256;
        hashtable10.put("SHA256WITHDSA", aSN1ObjectIdentifier10);
        algorithms.put("SHA384WITHDSA", NISTObjectIdentifiers.dsa_with_sha384);
        algorithms.put("SHA512WITHDSA", NISTObjectIdentifiers.dsa_with_sha512);
        Hashtable hashtable11 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = X9ObjectIdentifiers.ecdsa_with_SHA1;
        hashtable11.put("SHA1WITHECDSA", aSN1ObjectIdentifier11);
        Hashtable hashtable12 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = X9ObjectIdentifiers.ecdsa_with_SHA224;
        hashtable12.put("SHA224WITHECDSA", aSN1ObjectIdentifier12);
        Hashtable hashtable13 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = X9ObjectIdentifiers.ecdsa_with_SHA256;
        hashtable13.put("SHA256WITHECDSA", aSN1ObjectIdentifier13);
        Hashtable hashtable14 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = X9ObjectIdentifiers.ecdsa_with_SHA384;
        hashtable14.put("SHA384WITHECDSA", aSN1ObjectIdentifier14);
        Hashtable hashtable15 = algorithms;
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = X9ObjectIdentifiers.ecdsa_with_SHA512;
        hashtable15.put("SHA512WITHECDSA", aSN1ObjectIdentifier15);
        algorithms.put("ECDSAWITHSHA1", aSN1ObjectIdentifier11);
        Hashtable hashtable16 = algorithms;
        DERObjectIdentifier dERObjectIdentifier = CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94;
        hashtable16.put("GOST3411WITHGOST3410", dERObjectIdentifier);
        algorithms.put("GOST3410WITHGOST3411", dERObjectIdentifier);
        Hashtable hashtable17 = algorithms;
        DERObjectIdentifier dERObjectIdentifier2 = CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001;
        hashtable17.put("GOST3411WITHECGOST3410", dERObjectIdentifier2);
        algorithms.put("GOST3411WITHECGOST3410-2001", dERObjectIdentifier2);
        algorithms.put("GOST3411WITHGOST3410-2001", dERObjectIdentifier2);
        oids.put(new DERObjectIdentifier("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        oids.put(aSN1ObjectIdentifier, "SHA224WITHRSA");
        oids.put(aSN1ObjectIdentifier2, "SHA256WITHRSA");
        oids.put(aSN1ObjectIdentifier3, "SHA384WITHRSA");
        oids.put(aSN1ObjectIdentifier4, "SHA512WITHRSA");
        oids.put(dERObjectIdentifier, "GOST3411WITHGOST3410");
        oids.put(dERObjectIdentifier2, "GOST3411WITHECGOST3410");
        oids.put(new DERObjectIdentifier("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        oids.put(new DERObjectIdentifier("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        oids.put(new DERObjectIdentifier("1.2.840.10040.4.3"), "SHA1WITHDSA");
        oids.put(aSN1ObjectIdentifier11, "SHA1WITHECDSA");
        oids.put(aSN1ObjectIdentifier12, "SHA224WITHECDSA");
        oids.put(aSN1ObjectIdentifier13, "SHA256WITHECDSA");
        oids.put(aSN1ObjectIdentifier14, "SHA384WITHECDSA");
        oids.put(aSN1ObjectIdentifier15, "SHA512WITHECDSA");
        oids.put(OIWObjectIdentifiers.sha1WithRSA, "SHA1WITHRSA");
        oids.put(OIWObjectIdentifiers.dsaWithSHA1, "SHA1WITHDSA");
        oids.put(aSN1ObjectIdentifier9, "SHA224WITHDSA");
        oids.put(aSN1ObjectIdentifier10, "SHA256WITHDSA");
        keyAlgorithms.put(PKCSObjectIdentifiers.rsaEncryption, C5236qM.f18515e);
        keyAlgorithms.put(X9ObjectIdentifiers.id_dsa, "DSA");
        noParams.add(aSN1ObjectIdentifier11);
        noParams.add(aSN1ObjectIdentifier12);
        noParams.add(aSN1ObjectIdentifier13);
        noParams.add(aSN1ObjectIdentifier14);
        noParams.add(aSN1ObjectIdentifier15);
        noParams.add(X9ObjectIdentifiers.id_dsa_with_sha1);
        noParams.add(aSN1ObjectIdentifier9);
        noParams.add(aSN1ObjectIdentifier10);
        noParams.add(dERObjectIdentifier);
        noParams.add(dERObjectIdentifier2);
        params.put("SHA1WITHRSAANDMGF1", creatPSSParams(new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1, new DERNull()), 20));
        params.put("SHA224WITHRSAANDMGF1", creatPSSParams(new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha224, new DERNull()), 28));
        params.put("SHA256WITHRSAANDMGF1", creatPSSParams(new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256, new DERNull()), 32));
        params.put("SHA384WITHRSAANDMGF1", creatPSSParams(new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha384, new DERNull()), 48));
        params.put("SHA512WITHRSAANDMGF1", creatPSSParams(new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512, new DERNull()), 64));
    }

    /* JADX WARN: Invalid debug info offset */
    public PKCS10CertificationRequest(String str, X500Principal x500Principal, PublicKey publicKey, ASN1Set aSN1Set, PrivateKey privateKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException {
    }

    /* JADX WARN: Invalid debug info offset */
    public PKCS10CertificationRequest(String str, X500Principal x500Principal, PublicKey publicKey, ASN1Set aSN1Set, PrivateKey privateKey, String str2) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException {
    }

    /* JADX WARN: Invalid debug info offset */
    public PKCS10CertificationRequest(String str, X509Name x509Name, PublicKey publicKey, ASN1Set aSN1Set, PrivateKey privateKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0011
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public PKCS10CertificationRequest(java.lang.String r5, org.bouncycastle.asn1.x509.X509Name r6, java.security.PublicKey r7, org.bouncycastle.asn1.ASN1Set r8, java.security.PrivateKey r9, java.lang.String r10) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException, java.security.SignatureException {
        /*
            r4 = this;
            return
        L17:
        L8e:
        La3:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.PKCS10CertificationRequest.<init>(java.lang.String, org.bouncycastle.asn1.x509.X509Name, java.security.PublicKey, org.bouncycastle.asn1.ASN1Set, java.security.PrivateKey, java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public PKCS10CertificationRequest(ASN1Sequence aSN1Sequence) {
    }

    /* JADX WARN: Invalid debug info offset */
    public PKCS10CertificationRequest(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private static X509Name convertName(X500Principal x500Principal) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static RSASSAPSSparams creatPSSParams(AlgorithmIdentifier algorithmIdentifier, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private static String getDigestAlgName(DERObjectIdentifier dERObjectIdentifier) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static String getSignatureName(AlgorithmIdentifier algorithmIdentifier) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0016
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    private void setSignatureParameters(java.security.Signature r3, org.bouncycastle.asn1.DEREncodable r4) throws java.security.NoSuchAlgorithmException, java.security.SignatureException, java.security.InvalidKeyException {
        /*
            r2 = this;
            return
        L37:
        L50:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.PKCS10CertificationRequest.setSignatureParameters(java.security.Signature, org.bouncycastle.asn1.DEREncodable):void");
    }

    /* JADX WARN: Invalid debug info offset */
    private static ASN1Sequence toDERSequence(byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.asn1.ASN1Encodable
    public byte[] getEncoded() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public PublicKey getPublicKey() throws NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001a
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public java.security.PublicKey getPublicKey(java.lang.String r6) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException {
        /*
            r5 = this;
            r0 = 0
            return r0
        L2b:
        L6b:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.PKCS10CertificationRequest.getPublicKey(java.lang.String):java.security.PublicKey");
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean verify() throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean verify(String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public boolean verify(java.security.PublicKey r4, java.lang.String r5) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidKeyException, java.security.SignatureException {
        /*
            r3 = this;
            r0 = 0
            return r0
        Ld:
        L63:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.PKCS10CertificationRequest.verify(java.security.PublicKey, java.lang.String):boolean");
    }
}
