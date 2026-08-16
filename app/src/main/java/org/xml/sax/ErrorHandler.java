package org.xml.sax;

/* JADX INFO: loaded from: classes.dex */
public interface ErrorHandler {
    void error(SAXParseException sAXParseException) throws SAXException;

    void fatalError(SAXParseException sAXParseException) throws SAXException;

    void warning(SAXParseException sAXParseException) throws SAXException;
}
