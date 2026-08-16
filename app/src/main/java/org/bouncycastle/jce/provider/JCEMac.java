package org.bouncycastle.jce.provider;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.MacSpi;
import org.bouncycastle.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public class JCEMac extends MacSpi implements PBE {
    private int keySize;
    private Mac macEngine;
    private int pbeHash;
    private int pbeType;

    public static class DES extends JCEMac {
    }

    public static class DES9797Alg3 extends JCEMac {
    }

    public static class DES9797Alg3with7816d4 extends JCEMac {
    }

    public static class DESCFB8 extends JCEMac {
    }

    public static class GOST28147 extends JCEMac {
    }

    public static class MD2 extends JCEMac {
    }

    public static class MD4 extends JCEMac {
    }

    public static class MD5 extends JCEMac {
    }

    public static class OldSHA384 extends JCEMac {
    }

    public static class OldSHA512 extends JCEMac {
    }

    public static class PBEWithRIPEMD160 extends JCEMac {
    }

    public static class PBEWithSHA extends JCEMac {
    }

    public static class PBEWithTiger extends JCEMac {
    }

    public static class RC2 extends JCEMac {
    }

    public static class RC2CFB8 extends JCEMac {
    }

    public static class RIPEMD128 extends JCEMac {
    }

    public static class RIPEMD160 extends JCEMac {
    }

    public static class SHA1 extends JCEMac {
    }

    public static class SHA224 extends JCEMac {
    }

    public static class SHA256 extends JCEMac {
    }

    public static class SHA384 extends JCEMac {
    }

    public static class SHA512 extends JCEMac {
    }

    public static class Tiger extends JCEMac {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEMac(Mac mac) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JCEMac(Mac mac, int i, int i2, int i3) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.MacSpi
    public byte[] engineDoFinal() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.MacSpi
    public int engineGetMacLength() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.MacSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.MacSpi
    public void engineReset() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.MacSpi
    public void engineUpdate(byte b) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // javax.crypto.MacSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
    }
}
