package org.dom4j.util;

import org.dom4j.Element;
import org.dom4j.QName;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXParseException;

/* JADX INFO: loaded from: classes2.dex */
public class XMLErrorHandler implements ErrorHandler {

    /* JADX INFO: renamed from: e */
    public static final QName f16933e = QName.m23753b("error");

    /* JADX INFO: renamed from: f */
    public static final QName f16934f = QName.m23753b("fatalError");

    /* JADX INFO: renamed from: g */
    public static final QName f16935g = QName.m23753b("warning");

    /* JADX INFO: renamed from: a */
    public Element f16936a;

    /* JADX INFO: renamed from: b */
    public QName f16937b;

    /* JADX INFO: renamed from: c */
    public QName f16938c;

    /* JADX INFO: renamed from: d */
    public QName f16939d;

    /* JADX WARN: Invalid debug info offset */
    public XMLErrorHandler() {
    }

    /* JADX WARN: Invalid debug info offset */
    public XMLErrorHandler(Element element) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void m24849a(Element element, SAXParseException sAXParseException) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public QName m24850b() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public Element m24851c() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public QName m24852d() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public QName m24853e() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ErrorHandler
    public void error(SAXParseException sAXParseException) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public void m24854f(QName qName) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ErrorHandler
    public void fatalError(SAXParseException sAXParseException) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public void m24855g(Element element) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public void m24856h(QName qName) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public void m24857i(QName qName) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ErrorHandler
    public void warning(SAXParseException sAXParseException) {
    }
}
