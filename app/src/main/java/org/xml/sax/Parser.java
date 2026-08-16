package org.xml.sax;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public interface Parser {
    /* JADX INFO: renamed from: a */
    void mo26524a(ErrorHandler errorHandler);

    /* JADX INFO: renamed from: b */
    void mo26525b(String str) throws SAXException, IOException;

    /* JADX INFO: renamed from: c */
    void mo26526c(InputSource inputSource) throws SAXException, IOException;

    /* JADX INFO: renamed from: d */
    void mo26527d(DTDHandler dTDHandler);

    /* JADX INFO: renamed from: g */
    void mo26528g(DocumentHandler documentHandler);

    /* JADX INFO: renamed from: h */
    void mo26529h(Locale locale) throws SAXException;

    /* JADX INFO: renamed from: k0 */
    void mo26530k0(EntityResolver entityResolver);
}
