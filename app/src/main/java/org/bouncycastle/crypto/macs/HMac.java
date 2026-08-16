package org.bouncycastle.crypto.macs;

import java.util.Hashtable;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Mac;
import p000.C4572io;

/* JADX INFO: loaded from: classes2.dex */
public class HMac implements Mac {
    private static final byte IPAD = 54;
    private static final byte OPAD = 92;
    private static Hashtable blockLengths;
    private int blockLength;
    private Digest digest;
    private int digestSize;
    private byte[] inputPad;
    private byte[] outputPad;

    static {
        Hashtable hashtable = new Hashtable();
        blockLengths = hashtable;
        C4572io.m21440a(32, hashtable, "GOST3411");
        C4572io.m21440a(16, blockLengths, "MD2");
        C4572io.m21440a(64, blockLengths, "MD4");
        C4572io.m21440a(64, blockLengths, "MD5");
        C4572io.m21440a(64, blockLengths, "RIPEMD128");
        C4572io.m21440a(64, blockLengths, "RIPEMD160");
        C4572io.m21440a(64, blockLengths, "SHA-1");
        C4572io.m21440a(64, blockLengths, "SHA-224");
        C4572io.m21440a(64, blockLengths, "SHA-256");
        C4572io.m21440a(128, blockLengths, "SHA-384");
        C4572io.m21440a(128, blockLengths, "SHA-512");
        C4572io.m21440a(64, blockLengths, "Tiger");
        C4572io.m21440a(64, blockLengths, "Whirlpool");
    }

    /* JADX WARN: Invalid debug info offset */
    public HMac(Digest digest) {
    }

    /* JADX WARN: Invalid debug info offset */
    private HMac(Digest digest, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    private static int getByteLength(Digest digest) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public Digest getUnderlyingDigest() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) {
    }
}
