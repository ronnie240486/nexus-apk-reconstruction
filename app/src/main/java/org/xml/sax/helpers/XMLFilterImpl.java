package org.xml.sax.helpers;

import java.io.IOException;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLFilter;
import org.xml.sax.XMLReader;

/* JADX INFO: loaded from: classes.dex */
public class XMLFilterImpl implements XMLFilter, EntityResolver, DTDHandler, ContentHandler, ErrorHandler {

    /* JADX INFO: renamed from: a */
    public XMLReader f17892a;

    /* JADX INFO: renamed from: b */
    public Locator f17893b;

    /* JADX INFO: renamed from: c */
    public EntityResolver f17894c;

    /* JADX INFO: renamed from: d */
    public DTDHandler f17895d;

    /* JADX INFO: renamed from: e */
    public ContentHandler f17896e;

    /* JADX INFO: renamed from: f */
    public ErrorHandler f17897f;

    /* JADX WARN: Invalid debug info offset */
    public XMLFilterImpl() {
    }

    /* JADX WARN: Invalid debug info offset */
    public XMLFilterImpl(XMLReader xMLReader) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.XMLReader
    /* JADX INFO: renamed from: a */
    public void mo24314a(ErrorHandler errorHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.XMLReader
    /* JADX INFO: renamed from: b */
    public void mo24315b(String str) throws SAXException, IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.XMLReader
    /* JADX INFO: renamed from: c */
    public void mo24316c(InputSource inputSource) throws SAXException, IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void characters(char[] cArr, int i, int i2) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.XMLReader
    /* JADX INFO: renamed from: d */
    public void mo24317d(DTDHandler dTDHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.XMLReader
    /* JADX INFO: renamed from: d1 */
    public EntityResolver mo24318d1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void endDocument() throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void endElement(String str, String str2, String str3) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void endPrefixMapping(String str) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ErrorHandler
    public void error(SAXParseException sAXParseException) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ErrorHandler
    public void fatalError(SAXParseException sAXParseException) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.XMLReader
    /* JADX INFO: renamed from: g */
    public Object mo24321g(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.XMLFilter
    public XMLReader getParent() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.XMLReader
    /* JADX INFO: renamed from: h */
    public DTDHandler mo24322h() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.XMLReader
    /* JADX INFO: renamed from: k0 */
    public void mo24326k0(EntityResolver entityResolver) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.XMLReader
    /* JADX INFO: renamed from: l */
    public ContentHandler mo24327l() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.XMLReader
    /* JADX INFO: renamed from: m */
    public void mo24328m(String str, boolean z) throws SAXNotRecognizedException, SAXNotSupportedException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void notationDecl(String str, String str2, String str3) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.XMLReader
    /* JADX INFO: renamed from: o */
    public boolean mo24330o(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void processingInstruction(String str, String str2) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.EntityResolver
    public InputSource resolveEntity(String str, String str2) throws SAXException, IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.XMLReader
    /* JADX INFO: renamed from: s */
    public void mo24334s(String str, Object obj) throws SAXNotRecognizedException, SAXNotSupportedException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setDocumentLocator(Locator locator) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ContentHandler
    public void skippedEntity(String str) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void startDocument() throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void startPrefixMapping(String str, String str2) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    public void unparsedEntityDecl(String str, String str2, String str3, String str4) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.XMLReader
    /* JADX INFO: renamed from: v */
    public ErrorHandler mo24337v() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ErrorHandler
    public void warning(SAXParseException sAXParseException) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.XMLFilter
    /* JADX INFO: renamed from: x */
    public void mo26537x(XMLReader xMLReader) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.XMLReader
    /* JADX INFO: renamed from: y */
    public void mo24339y(ContentHandler contentHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public final void m26591z() {
    }
}
