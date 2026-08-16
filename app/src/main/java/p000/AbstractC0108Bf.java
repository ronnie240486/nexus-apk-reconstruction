package p000;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* JADX INFO: renamed from: Bf */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0108Bf {
    /* JADX INFO: renamed from: a */
    public abstract DOMImplementation m614a();

    /* JADX INFO: renamed from: b */
    public abstract boolean m615b();

    /* JADX INFO: renamed from: c */
    public abstract boolean m616c();

    /* JADX INFO: renamed from: d */
    public abstract Document m617d();

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public Document m618e(File file) throws SAXException, IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public Document m619f(InputStream inputStream) throws SAXException, IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public Document m620g(InputStream inputStream, String str) throws SAXException, IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public Document m621h(String str) throws SAXException, IOException {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public abstract Document m622i(InputSource inputSource) throws SAXException, IOException;

    /* JADX INFO: renamed from: j */
    public abstract void m623j(EntityResolver entityResolver);

    /* JADX INFO: renamed from: k */
    public abstract void m624k(ErrorHandler errorHandler);
}
