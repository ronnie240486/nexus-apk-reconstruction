package com.google.android.exoplayer2.extractor;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class ExtractorUtil {
    private ExtractorUtil() {
    }

    public static int peekToLength(ExtractorInput extractorInput, byte[] bArr, int i, int i2) throws InterruptedException, IOException {
        int i3 = 0;
        while (i3 < i2) {
            int iPeek = extractorInput.peek(bArr, i + i3, i2 - i3);
            if (iPeek == -1) {
                break;
            }
            i3 += iPeek;
        }
        return i3;
    }
}
