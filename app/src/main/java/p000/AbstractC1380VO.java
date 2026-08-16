package p000;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.xml.sax.HandlerBase;
import org.xml.sax.InputSource;
import org.xml.sax.Parser;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: renamed from: VO */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1380VO {
    /* JADX INFO: renamed from: a */
    public abstract Parser m6523a() throws SAXException;

    /* JADX INFO: renamed from: b */
    public abstract Object m6524b(String str) throws SAXNotRecognizedException, SAXNotSupportedException;

    /* JADX INFO: renamed from: c */
    public abstract XMLReader m6525c() throws SAXException;

    /* JADX INFO: renamed from: d */
    public abstract boolean m6526d();

    /* JADX INFO: renamed from: e */
    public abstract boolean m6527e();

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public void m6528f(File file, HandlerBase handlerBase) throws SAXException, IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public void m6529g(File file, DefaultHandler defaultHandler) throws SAXException, IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public void m6530h(InputStream inputStream, HandlerBase handlerBase) throws SAXException, IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public void m6531i(InputStream inputStream, HandlerBase handlerBase, String str) throws SAXException, IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public void m6532j(InputStream inputStream, DefaultHandler defaultHandler) throws SAXException, IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public void m6533k(InputStream inputStream, DefaultHandler defaultHandler, String str) throws SAXException, IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public void m6534l(String str, HandlerBase handlerBase) throws SAXException, IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public void m6535m(String str, DefaultHandler defaultHandler) throws SAXException, IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public void m6536n(InputSource inputSource, HandlerBase handlerBase) throws SAXException, IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public void m6537o(InputSource inputSource, DefaultHandler defaultHandler) throws SAXException, IOException {
    }

    /* JADX INFO: renamed from: p */
    public abstract void m6538p(String str, Object obj) throws SAXNotRecognizedException, SAXNotSupportedException;
}
