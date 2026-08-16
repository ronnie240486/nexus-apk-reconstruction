package com.google.zxing.datamatrix.encoder;

import androidx.core.view.InputDeviceCompat;
import org.bouncycastle.crypto.tls.CipherSuite;
import p000.C5630w2;

/* JADX INFO: loaded from: classes2.dex */
final class Base256Encoder implements Encoder {
    private static char randomize255State(char c, int i) {
        int i2 = ((i * CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA) % 255) + 1 + c;
        return i2 <= 255 ? (char) i2 : (char) (i2 + InputDeviceCompat.SOURCE_ANY);
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public void encode(EncoderContext encoderContext) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (encoderContext.hasMoreCharacters()) {
            sb.append(encoderContext.getCurrentChar());
            encoderContext.pos++;
            int iLookAheadTest = HighLevelEncoder.lookAheadTest(encoderContext.getMessage(), encoderContext.pos, getEncodingMode());
            if (iLookAheadTest != getEncodingMode()) {
                encoderContext.signalEncoderChange(iLookAheadTest);
                break;
            }
        }
        int length = sb.length() - 1;
        int codewordCount = encoderContext.getCodewordCount() + length + 1;
        encoderContext.updateSymbolInfo(codewordCount);
        boolean z = encoderContext.getSymbolInfo().getDataCapacity() - codewordCount > 0;
        if (encoderContext.hasMoreCharacters() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException(C5630w2.m29215a("Message length not in valid ranges: ", length));
                }
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            }
        }
        int length2 = sb.length();
        for (int i = 0; i < length2; i++) {
            encoderContext.writeCodeword(randomize255State(sb.charAt(i), encoderContext.getCodewordCount() + 1));
        }
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public int getEncodingMode() {
        return 5;
    }
}
