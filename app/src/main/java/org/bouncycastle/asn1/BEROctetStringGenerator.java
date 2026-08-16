package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class BEROctetStringGenerator extends BERGenerator {

    public class BufferedBEROctetStream extends OutputStream {
        private byte[] _buf;
        private DEROutputStream _derOut;
        private int _off;
        final /* synthetic */ BEROctetStringGenerator this$0;

        /* JADX WARN: Invalid debug info offset */
        public BufferedBEROctetStream(BEROctetStringGenerator bEROctetStringGenerator, byte[] bArr) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public BEROctetStringGenerator(OutputStream outputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public BEROctetStringGenerator(OutputStream outputStream, int i, boolean z) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public OutputStream getOctetOutputStream() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public OutputStream getOctetOutputStream(byte[] bArr) {
        return null;
    }
}
