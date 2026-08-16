package org.xml.sax;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface XMLReader {
    /* JADX INFO: renamed from: a */
    void mo24314a(ErrorHandler errorHandler);

    /* JADX INFO: renamed from: b */
    void mo24315b(String str) throws SAXException, IOException;

    /* JADX INFO: renamed from: c */
    void mo24316c(InputSource inputSource) throws SAXException, IOException;

    /* JADX INFO: renamed from: d */
    void mo24317d(DTDHandler dTDHandler);

    /* JADX INFO: renamed from: d1 */
    EntityResolver mo24318d1();

    /* JADX INFO: renamed from: g */
    Object mo24321g(String str) throws SAXNotRecognizedException, SAXNotSupportedException;

    /* JADX INFO: renamed from: h */
    DTDHandler mo24322h();

    /* JADX INFO: renamed from: k0 */
    void mo24326k0(EntityResolver entityResolver);

    /* JADX INFO: renamed from: l */
    ContentHandler mo24327l();

    /* JADX INFO: renamed from: m */
    void mo24328m(String str, boolean z) throws SAXNotRecognizedException, SAXNotSupportedException;

    /* JADX INFO: renamed from: o */
    boolean mo24330o(String str) throws SAXNotRecognizedException, SAXNotSupportedException;

    /* JADX INFO: renamed from: s */
    void mo24334s(String str, Object obj) throws SAXNotRecognizedException, SAXNotSupportedException;

    /* JADX INFO: renamed from: v */
    ErrorHandler mo24337v();

    /* JADX INFO: renamed from: y */
    void mo24339y(ContentHandler contentHandler);
}
