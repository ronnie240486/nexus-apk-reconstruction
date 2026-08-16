package org.bouncycastle.crypto.params;

import org.dom4j.p020io.SAXEventRecorder;

/* JADX INFO: loaded from: classes2.dex */
public class DESParameters extends KeyParameter {
    public static final int DES_KEY_LENGTH = 8;
    private static byte[] DES_weak_keys = {1, 1, 1, 1, 1, 1, 1, 1, 31, 31, 31, 31, SAXEventRecorder.SAXEvent.f16648q, SAXEventRecorder.SAXEvent.f16648q, SAXEventRecorder.SAXEvent.f16648q, SAXEventRecorder.SAXEvent.f16648q, -32, -32, -32, -32, -15, -15, -15, -15, -2, -2, -2, -2, -2, -2, -2, -2, 1, -2, 1, -2, 1, -2, 1, -2, 31, -32, 31, -32, SAXEventRecorder.SAXEvent.f16648q, -15, SAXEventRecorder.SAXEvent.f16648q, -15, 1, -32, 1, -32, 1, -15, 1, -15, 31, -2, 31, -2, SAXEventRecorder.SAXEvent.f16648q, -2, SAXEventRecorder.SAXEvent.f16648q, -2, 1, 31, 1, 31, 1, SAXEventRecorder.SAXEvent.f16648q, 1, SAXEventRecorder.SAXEvent.f16648q, -32, -2, -32, -2, -15, -2, -15, -2, -2, 1, -2, 1, -2, 1, -2, 1, -32, 31, -32, 31, -15, SAXEventRecorder.SAXEvent.f16648q, -15, SAXEventRecorder.SAXEvent.f16648q, -32, 1, -32, 1, -15, 1, -15, 1, -2, 31, -2, 31, -2, SAXEventRecorder.SAXEvent.f16648q, -2, SAXEventRecorder.SAXEvent.f16648q, 31, 1, 31, 1, SAXEventRecorder.SAXEvent.f16648q, 1, SAXEventRecorder.SAXEvent.f16648q, 1, -2, -32, -2, -32, -2, -15, -2, -15};
    private static final int N_DES_WEAK_KEYS = 16;

    /* JADX WARN: Invalid debug info offset */
    public DESParameters(byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean isWeakKey(byte[] bArr, int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static void setOddParity(byte[] bArr) {
    }
}
