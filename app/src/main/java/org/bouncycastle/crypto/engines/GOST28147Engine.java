package org.bouncycastle.crypto.engines;

import java.util.Hashtable;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.dom4j.p020io.SAXEventRecorder;

/* JADX INFO: loaded from: classes2.dex */
public class GOST28147Engine implements BlockCipher {
    protected static final int BLOCK_SIZE = 8;

    /* JADX INFO: renamed from: S */
    private byte[] f16232S;
    private boolean forEncryption;
    private int[] workingKey;
    private static byte[] Sbox_Default = {4, 10, 9, 2, 13, 8, 0, SAXEventRecorder.SAXEvent.f16648q, 6, SAXEventRecorder.SAXEvent.f16645n, 1, SAXEventRecorder.SAXEvent.f16646o, 7, SAXEventRecorder.SAXEvent.f16649r, 5, 3, SAXEventRecorder.SAXEvent.f16648q, SAXEventRecorder.SAXEvent.f16645n, 4, SAXEventRecorder.SAXEvent.f16646o, 6, 13, SAXEventRecorder.SAXEvent.f16649r, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, 13, 10, 3, 4, 2, SAXEventRecorder.SAXEvent.f16648q, SAXEventRecorder.SAXEvent.f16649r, SAXEventRecorder.SAXEvent.f16646o, 7, 6, 0, 9, SAXEventRecorder.SAXEvent.f16645n, 7, 13, 10, 1, 0, 8, 9, SAXEventRecorder.SAXEvent.f16649r, SAXEventRecorder.SAXEvent.f16648q, 4, 6, SAXEventRecorder.SAXEvent.f16646o, SAXEventRecorder.SAXEvent.f16645n, 2, 5, 3, 6, SAXEventRecorder.SAXEvent.f16646o, 7, 1, 5, SAXEventRecorder.SAXEvent.f16649r, 13, 8, 4, 10, 9, SAXEventRecorder.SAXEvent.f16648q, 0, 3, SAXEventRecorder.SAXEvent.f16645n, 2, 4, SAXEventRecorder.SAXEvent.f16645n, 10, 0, 7, 2, 1, 13, 3, 6, 8, 5, 9, SAXEventRecorder.SAXEvent.f16646o, SAXEventRecorder.SAXEvent.f16649r, SAXEventRecorder.SAXEvent.f16648q, 13, SAXEventRecorder.SAXEvent.f16645n, 4, 1, 3, SAXEventRecorder.SAXEvent.f16649r, 5, 9, 0, 10, SAXEventRecorder.SAXEvent.f16648q, 7, 6, 8, 2, SAXEventRecorder.SAXEvent.f16646o, 1, SAXEventRecorder.SAXEvent.f16649r, 13, 0, 5, 7, 10, 4, 9, 2, 3, SAXEventRecorder.SAXEvent.f16648q, 6, SAXEventRecorder.SAXEvent.f16645n, 8, SAXEventRecorder.SAXEvent.f16646o};
    private static byte[] ESbox_Test = {4, 2, SAXEventRecorder.SAXEvent.f16649r, 5, 9, 1, 0, 8, SAXEventRecorder.SAXEvent.f16648q, 3, SAXEventRecorder.SAXEvent.f16645n, SAXEventRecorder.SAXEvent.f16646o, 13, 7, 10, 6, SAXEventRecorder.SAXEvent.f16646o, 9, SAXEventRecorder.SAXEvent.f16649r, SAXEventRecorder.SAXEvent.f16648q, 8, 1, 3, 10, 2, 7, 4, 13, 6, 0, SAXEventRecorder.SAXEvent.f16645n, 5, 13, 8, SAXEventRecorder.SAXEvent.f16648q, SAXEventRecorder.SAXEvent.f16646o, 7, 3, 9, 10, 1, 5, 2, 4, 6, SAXEventRecorder.SAXEvent.f16649r, 0, SAXEventRecorder.SAXEvent.f16645n, SAXEventRecorder.SAXEvent.f16648q, 9, SAXEventRecorder.SAXEvent.f16645n, 2, 5, SAXEventRecorder.SAXEvent.f16649r, 7, 1, 0, 13, SAXEventRecorder.SAXEvent.f16646o, 6, 10, 4, 3, 8, 3, SAXEventRecorder.SAXEvent.f16648q, 5, 9, 6, 8, 0, 13, 10, SAXEventRecorder.SAXEvent.f16645n, 7, SAXEventRecorder.SAXEvent.f16646o, 2, 1, SAXEventRecorder.SAXEvent.f16649r, 4, 8, SAXEventRecorder.SAXEvent.f16649r, 6, SAXEventRecorder.SAXEvent.f16645n, 1, 9, SAXEventRecorder.SAXEvent.f16646o, 5, 13, 3, 7, 10, 0, SAXEventRecorder.SAXEvent.f16648q, 2, 4, 9, SAXEventRecorder.SAXEvent.f16645n, SAXEventRecorder.SAXEvent.f16646o, 0, 3, 6, 7, 5, 4, 8, SAXEventRecorder.SAXEvent.f16648q, SAXEventRecorder.SAXEvent.f16649r, 1, 10, 2, 13, SAXEventRecorder.SAXEvent.f16646o, 6, 5, 2, SAXEventRecorder.SAXEvent.f16645n, 0, 9, 13, 3, SAXEventRecorder.SAXEvent.f16648q, 7, 10, SAXEventRecorder.SAXEvent.f16649r, 4, 1, 8};
    private static byte[] ESbox_A = {9, 6, 3, 2, 8, SAXEventRecorder.SAXEvent.f16645n, 1, 7, 10, 4, SAXEventRecorder.SAXEvent.f16648q, SAXEventRecorder.SAXEvent.f16649r, SAXEventRecorder.SAXEvent.f16646o, 0, 13, 5, 3, 7, SAXEventRecorder.SAXEvent.f16648q, 9, 8, 10, SAXEventRecorder.SAXEvent.f16649r, 0, 5, 2, 6, SAXEventRecorder.SAXEvent.f16646o, SAXEventRecorder.SAXEvent.f16645n, 4, 13, 1, SAXEventRecorder.SAXEvent.f16648q, 4, 6, 2, SAXEventRecorder.SAXEvent.f16645n, 3, 13, 8, SAXEventRecorder.SAXEvent.f16646o, SAXEventRecorder.SAXEvent.f16649r, 5, 10, 0, 7, 1, 9, SAXEventRecorder.SAXEvent.f16648q, 7, 10, SAXEventRecorder.SAXEvent.f16646o, 13, 1, 3, 9, 0, 2, SAXEventRecorder.SAXEvent.f16645n, 4, SAXEventRecorder.SAXEvent.f16649r, 8, 5, 6, SAXEventRecorder.SAXEvent.f16645n, 5, 1, 9, 8, 13, SAXEventRecorder.SAXEvent.f16649r, 0, SAXEventRecorder.SAXEvent.f16648q, 4, 2, 3, SAXEventRecorder.SAXEvent.f16646o, 7, 10, 6, 3, 10, 13, SAXEventRecorder.SAXEvent.f16646o, 1, 2, 0, SAXEventRecorder.SAXEvent.f16645n, 7, 5, 9, 4, 8, SAXEventRecorder.SAXEvent.f16649r, SAXEventRecorder.SAXEvent.f16648q, 6, 1, 13, 2, 9, 7, 10, 6, 0, 8, SAXEventRecorder.SAXEvent.f16646o, 4, 5, SAXEventRecorder.SAXEvent.f16649r, 3, SAXEventRecorder.SAXEvent.f16645n, SAXEventRecorder.SAXEvent.f16648q, SAXEventRecorder.SAXEvent.f16645n, 10, SAXEventRecorder.SAXEvent.f16649r, 5, 0, SAXEventRecorder.SAXEvent.f16646o, SAXEventRecorder.SAXEvent.f16648q, 8, 6, 2, 3, 9, 1, 7, 13, 4};
    private static byte[] ESbox_B = {8, 4, SAXEventRecorder.SAXEvent.f16645n, 1, 3, 5, 0, 9, 2, SAXEventRecorder.SAXEvent.f16648q, 10, SAXEventRecorder.SAXEvent.f16646o, 13, 6, 7, SAXEventRecorder.SAXEvent.f16649r, 0, 1, 2, 10, 4, 13, 5, SAXEventRecorder.SAXEvent.f16646o, 9, 7, 3, SAXEventRecorder.SAXEvent.f16649r, SAXEventRecorder.SAXEvent.f16645n, 8, 6, SAXEventRecorder.SAXEvent.f16648q, SAXEventRecorder.SAXEvent.f16648q, SAXEventRecorder.SAXEvent.f16646o, 0, 10, 9, 2, 13, SAXEventRecorder.SAXEvent.f16645n, 7, 5, 8, SAXEventRecorder.SAXEvent.f16649r, 3, 6, 1, 4, 7, 5, 0, 13, SAXEventRecorder.SAXEvent.f16645n, 6, 1, 2, 3, 10, SAXEventRecorder.SAXEvent.f16646o, SAXEventRecorder.SAXEvent.f16649r, 4, SAXEventRecorder.SAXEvent.f16648q, 9, 8, 2, 7, SAXEventRecorder.SAXEvent.f16646o, SAXEventRecorder.SAXEvent.f16649r, 9, 5, 10, SAXEventRecorder.SAXEvent.f16645n, 1, 4, 0, 13, 6, 8, SAXEventRecorder.SAXEvent.f16648q, 3, 8, 3, 2, 6, 4, 13, SAXEventRecorder.SAXEvent.f16648q, SAXEventRecorder.SAXEvent.f16645n, SAXEventRecorder.SAXEvent.f16646o, 1, 7, SAXEventRecorder.SAXEvent.f16649r, 10, 0, 9, 5, 5, 2, 10, SAXEventRecorder.SAXEvent.f16645n, 9, 1, SAXEventRecorder.SAXEvent.f16646o, 3, 7, 4, 13, 0, 6, SAXEventRecorder.SAXEvent.f16649r, 8, SAXEventRecorder.SAXEvent.f16648q, 0, 4, SAXEventRecorder.SAXEvent.f16645n, SAXEventRecorder.SAXEvent.f16648q, 8, 3, 7, 1, 10, 2, 9, 6, SAXEventRecorder.SAXEvent.f16649r, 13, 5, SAXEventRecorder.SAXEvent.f16646o};
    private static byte[] ESbox_C = {1, SAXEventRecorder.SAXEvent.f16645n, SAXEventRecorder.SAXEvent.f16646o, 2, 9, 13, 0, SAXEventRecorder.SAXEvent.f16649r, 4, 5, 8, SAXEventRecorder.SAXEvent.f16648q, 10, 7, 6, 3, 0, 1, 7, 13, SAXEventRecorder.SAXEvent.f16645n, 4, 5, 2, 8, SAXEventRecorder.SAXEvent.f16648q, SAXEventRecorder.SAXEvent.f16649r, SAXEventRecorder.SAXEvent.f16646o, 9, 10, 6, 3, 8, 2, 5, 0, 4, 9, SAXEventRecorder.SAXEvent.f16649r, 10, 3, 7, SAXEventRecorder.SAXEvent.f16646o, 13, 6, SAXEventRecorder.SAXEvent.f16648q, 1, SAXEventRecorder.SAXEvent.f16645n, 3, 6, 0, 1, 5, 13, 10, 8, SAXEventRecorder.SAXEvent.f16645n, 2, 9, 7, SAXEventRecorder.SAXEvent.f16648q, SAXEventRecorder.SAXEvent.f16649r, SAXEventRecorder.SAXEvent.f16646o, 4, 8, 13, SAXEventRecorder.SAXEvent.f16645n, 0, 4, 5, 1, 2, 9, 3, SAXEventRecorder.SAXEvent.f16646o, SAXEventRecorder.SAXEvent.f16648q, 6, SAXEventRecorder.SAXEvent.f16649r, 10, 7, SAXEventRecorder.SAXEvent.f16646o, 9, SAXEventRecorder.SAXEvent.f16645n, 1, 8, SAXEventRecorder.SAXEvent.f16648q, 2, 4, 7, 3, 6, 5, 10, 0, SAXEventRecorder.SAXEvent.f16649r, 13, 10, 9, 6, 8, 13, SAXEventRecorder.SAXEvent.f16648q, 2, 0, SAXEventRecorder.SAXEvent.f16649r, 3, 5, SAXEventRecorder.SAXEvent.f16645n, 4, 1, SAXEventRecorder.SAXEvent.f16646o, 7, 7, 4, 0, 5, 10, 2, SAXEventRecorder.SAXEvent.f16649r, SAXEventRecorder.SAXEvent.f16648q, SAXEventRecorder.SAXEvent.f16646o, 6, 1, SAXEventRecorder.SAXEvent.f16645n, 13, 9, 3, 8};
    private static byte[] ESbox_D = {SAXEventRecorder.SAXEvent.f16649r, SAXEventRecorder.SAXEvent.f16646o, 2, 10, 6, 4, 5, 0, 7, 9, SAXEventRecorder.SAXEvent.f16648q, 13, 1, SAXEventRecorder.SAXEvent.f16645n, 8, 3, SAXEventRecorder.SAXEvent.f16645n, 6, 3, 4, SAXEventRecorder.SAXEvent.f16646o, SAXEventRecorder.SAXEvent.f16649r, SAXEventRecorder.SAXEvent.f16648q, 2, 7, 13, 8, 0, 5, 10, 9, 1, 1, SAXEventRecorder.SAXEvent.f16646o, SAXEventRecorder.SAXEvent.f16645n, 0, SAXEventRecorder.SAXEvent.f16649r, SAXEventRecorder.SAXEvent.f16648q, 6, 5, 10, 13, 4, 8, 9, 3, 7, 2, 1, 5, SAXEventRecorder.SAXEvent.f16648q, SAXEventRecorder.SAXEvent.f16646o, 10, 7, 0, 13, 6, 2, SAXEventRecorder.SAXEvent.f16645n, 4, 9, 3, SAXEventRecorder.SAXEvent.f16649r, 8, 0, SAXEventRecorder.SAXEvent.f16646o, 8, 9, 13, 2, 10, SAXEventRecorder.SAXEvent.f16645n, 7, 3, 6, 5, 4, SAXEventRecorder.SAXEvent.f16648q, SAXEventRecorder.SAXEvent.f16649r, 1, 8, 0, SAXEventRecorder.SAXEvent.f16649r, 3, 2, 5, SAXEventRecorder.SAXEvent.f16648q, SAXEventRecorder.SAXEvent.f16645n, 1, 10, 4, 7, SAXEventRecorder.SAXEvent.f16646o, 9, 13, 6, 3, 0, 6, SAXEventRecorder.SAXEvent.f16649r, 1, SAXEventRecorder.SAXEvent.f16648q, 9, 2, 13, 8, SAXEventRecorder.SAXEvent.f16646o, 4, SAXEventRecorder.SAXEvent.f16645n, 10, 5, 7, 1, 10, 6, 8, SAXEventRecorder.SAXEvent.f16649r, SAXEventRecorder.SAXEvent.f16645n, 0, 4, SAXEventRecorder.SAXEvent.f16646o, 3, 5, 9, 7, 13, 2, SAXEventRecorder.SAXEvent.f16648q};
    private static byte[] DSbox_Test = {4, 10, 9, 2, 13, 8, 0, SAXEventRecorder.SAXEvent.f16648q, 6, SAXEventRecorder.SAXEvent.f16645n, 1, SAXEventRecorder.SAXEvent.f16646o, 7, SAXEventRecorder.SAXEvent.f16649r, 5, 3, SAXEventRecorder.SAXEvent.f16648q, SAXEventRecorder.SAXEvent.f16645n, 4, SAXEventRecorder.SAXEvent.f16646o, 6, 13, SAXEventRecorder.SAXEvent.f16649r, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, 13, 10, 3, 4, 2, SAXEventRecorder.SAXEvent.f16648q, SAXEventRecorder.SAXEvent.f16649r, SAXEventRecorder.SAXEvent.f16646o, 7, 6, 0, 9, SAXEventRecorder.SAXEvent.f16645n, 7, 13, 10, 1, 0, 8, 9, SAXEventRecorder.SAXEvent.f16649r, SAXEventRecorder.SAXEvent.f16648q, 4, 6, SAXEventRecorder.SAXEvent.f16646o, SAXEventRecorder.SAXEvent.f16645n, 2, 5, 3, 6, SAXEventRecorder.SAXEvent.f16646o, 7, 1, 5, SAXEventRecorder.SAXEvent.f16649r, 13, 8, 4, 10, 9, SAXEventRecorder.SAXEvent.f16648q, 0, 3, SAXEventRecorder.SAXEvent.f16645n, 2, 4, SAXEventRecorder.SAXEvent.f16645n, 10, 0, 7, 2, 1, 13, 3, 6, 8, 5, 9, SAXEventRecorder.SAXEvent.f16646o, SAXEventRecorder.SAXEvent.f16649r, SAXEventRecorder.SAXEvent.f16648q, 13, SAXEventRecorder.SAXEvent.f16645n, 4, 1, 3, SAXEventRecorder.SAXEvent.f16649r, 5, 9, 0, 10, SAXEventRecorder.SAXEvent.f16648q, 7, 6, 8, 2, SAXEventRecorder.SAXEvent.f16646o, 1, SAXEventRecorder.SAXEvent.f16649r, 13, 0, 5, 7, 10, 4, 9, 2, 3, SAXEventRecorder.SAXEvent.f16648q, 6, SAXEventRecorder.SAXEvent.f16645n, 8, SAXEventRecorder.SAXEvent.f16646o};
    private static byte[] DSbox_A = {10, 4, 5, 6, 8, 1, 3, 7, 13, SAXEventRecorder.SAXEvent.f16646o, SAXEventRecorder.SAXEvent.f16648q, 0, 9, 2, SAXEventRecorder.SAXEvent.f16645n, SAXEventRecorder.SAXEvent.f16649r, 5, SAXEventRecorder.SAXEvent.f16649r, 4, 0, 2, 13, SAXEventRecorder.SAXEvent.f16645n, 9, 1, 7, 6, 3, SAXEventRecorder.SAXEvent.f16646o, SAXEventRecorder.SAXEvent.f16648q, 10, 8, 7, SAXEventRecorder.SAXEvent.f16649r, SAXEventRecorder.SAXEvent.f16646o, SAXEventRecorder.SAXEvent.f16648q, 9, 4, 1, 0, 3, SAXEventRecorder.SAXEvent.f16645n, 5, 2, 6, 10, 8, 13, 4, 10, 7, SAXEventRecorder.SAXEvent.f16646o, 0, SAXEventRecorder.SAXEvent.f16649r, 2, 8, SAXEventRecorder.SAXEvent.f16648q, 1, 6, 5, 13, SAXEventRecorder.SAXEvent.f16645n, 9, 3, 7, 6, 4, SAXEventRecorder.SAXEvent.f16645n, 9, SAXEventRecorder.SAXEvent.f16646o, 2, 10, 1, 8, 0, SAXEventRecorder.SAXEvent.f16648q, SAXEventRecorder.SAXEvent.f16649r, 13, 3, 5, 7, 6, 2, 4, 13, 9, SAXEventRecorder.SAXEvent.f16649r, 0, 10, 1, 5, SAXEventRecorder.SAXEvent.f16645n, 8, SAXEventRecorder.SAXEvent.f16648q, SAXEventRecorder.SAXEvent.f16646o, 3, 13, SAXEventRecorder.SAXEvent.f16648q, 4, 1, 7, 0, 5, 10, 3, SAXEventRecorder.SAXEvent.f16646o, 8, SAXEventRecorder.SAXEvent.f16649r, 6, 2, 9, SAXEventRecorder.SAXEvent.f16645n, 1, 3, 10, 9, 5, SAXEventRecorder.SAXEvent.f16645n, 4, SAXEventRecorder.SAXEvent.f16649r, 8, 6, 7, SAXEventRecorder.SAXEvent.f16648q, 13, 0, 2, SAXEventRecorder.SAXEvent.f16646o};
    private static Hashtable sBoxes = new Hashtable();

    static {
        addSBox("Default", Sbox_Default);
        addSBox("E-TEST", ESbox_Test);
        addSBox("E-A", ESbox_A);
        addSBox("E-B", ESbox_B);
        addSBox("E-C", ESbox_C);
        addSBox("E-D", ESbox_D);
        addSBox("D-TEST", DSbox_Test);
        addSBox("D-A", DSbox_A);
    }

    /* JADX WARN: Invalid debug info offset */
    private void GOST28147Func(int[] iArr, byte[] bArr, int i, byte[] bArr2, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    private int GOST28147_mainStep(int i, int i2) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private static void addSBox(String str, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    private int bytesToint(byte[] bArr, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    private int[] generateWorkingKey(boolean z, byte[] bArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static byte[] getSBox(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    private void intTobytes(int i, byte[] bArr, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        return 0;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
