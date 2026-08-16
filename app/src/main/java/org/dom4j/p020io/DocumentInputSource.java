package org.dom4j.p020io;

import java.io.IOException;
import java.io.Reader;
import org.dom4j.Document;
import org.xml.sax.InputSource;

/* JADX INFO: loaded from: classes2.dex */
class DocumentInputSource extends InputSource {

    /* JADX INFO: renamed from: f */
    public Document f16560f;

    /* JADX INFO: renamed from: org.dom4j.io.DocumentInputSource$1 */
    class C50591 extends Reader {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ IOException f16561a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ DocumentInputSource f16562b;

        /* JADX WARN: Invalid debug info offset */
        public C50591(DocumentInputSource documentInputSource, IOException iOException) throws IOException {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            return 0;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public DocumentInputSource() {
    }

    /* JADX WARN: Invalid debug info offset */
    public DocumentInputSource(Document document) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.InputSource
    /* JADX INFO: renamed from: b */
    public Reader mo24094b() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.InputSource
    /* JADX INFO: renamed from: g */
    public void mo24095g(Reader reader) throws UnsupportedOperationException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public Document m24096k() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public void m24097l(Document document) {
    }
}
