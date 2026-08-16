package org.bouncycastle.util.p019io.pem;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes2.dex */
public class PemWriter extends BufferedWriter {
    private static final int LINE_LENGTH = 64;
    private char[] buf;
    private final int nlLength;

    /* JADX WARN: Invalid debug info offset */
    public PemWriter(Writer writer) {
    }

    /* JADX WARN: Invalid debug info offset */
    private void writeEncoded(byte[] bArr) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    private void writePostEncapsulationBoundary(String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    private void writePreEncapsulationBoundary(String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public int getOutputSize(PemObject pemObject) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void writeObject(PemObjectGenerator pemObjectGenerator) throws IOException {
    }
}
