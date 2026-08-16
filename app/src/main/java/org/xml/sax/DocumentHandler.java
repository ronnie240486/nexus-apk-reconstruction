package org.xml.sax;

/* JADX INFO: loaded from: classes.dex */
public interface DocumentHandler {
    void characters(char[] cArr, int i, int i2) throws SAXException;

    void endDocument() throws SAXException;

    /* JADX INFO: renamed from: i */
    void mo26510i(String str) throws SAXException;

    void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException;

    /* JADX INFO: renamed from: j */
    void mo26511j(String str, AttributeList attributeList) throws SAXException;

    void processingInstruction(String str, String str2) throws SAXException;

    void setDocumentLocator(Locator locator);

    void startDocument() throws SAXException;
}
