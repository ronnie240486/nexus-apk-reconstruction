package org.dom4j.p020io;

import org.dom4j.DocumentFactory;
import org.dom4j.ElementHandler;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes2.dex */
class SAXModifyContentHandler extends SAXContentHandler {

    /* JADX INFO: renamed from: D */
    public XMLWriter f16662D;

    /* JADX WARN: Invalid debug info offset */
    public SAXModifyContentHandler() {
    }

    /* JADX WARN: Invalid debug info offset */
    public SAXModifyContentHandler(DocumentFactory documentFactory) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SAXModifyContentHandler(DocumentFactory documentFactory, ElementHandler elementHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SAXModifyContentHandler(DocumentFactory documentFactory, ElementHandler elementHandler, ElementStack elementStack) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q */
    public final boolean m24234Q() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public XMLWriter m24235R() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public void m24236S(XMLWriter xMLWriter) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.p020io.SAXContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.p020io.SAXContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0031
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.dom4j.p020io.SAXContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(java.lang.String r3, java.lang.String r4, java.lang.String r5) throws org.xml.sax.SAXException {
        /*
            r2 = this;
            return
        L37:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.p020io.SAXModifyContentHandler.endElement(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.p020io.SAXContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endPrefixMapping(String str) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.p020io.SAXContentHandler, org.xml.sax.ext.LexicalHandler
    /* JADX INFO: renamed from: j */
    public void mo24127j() throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.p020io.SAXContentHandler, org.xml.sax.ext.LexicalHandler
    /* JADX INFO: renamed from: k */
    public void mo24194k(char[] cArr, int i, int i2) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.p020io.SAXContentHandler, org.xml.sax.ext.LexicalHandler
    /* JADX INFO: renamed from: n */
    public void mo24197n() throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.p020io.SAXContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.DTDHandler
    public void notationDecl(String str, String str2, String str3) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.p020io.SAXContentHandler, org.xml.sax.ext.LexicalHandler
    /* JADX INFO: renamed from: p */
    public void mo24128p() throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.p020io.SAXContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.p020io.SAXContentHandler, org.xml.sax.ext.LexicalHandler
    /* JADX INFO: renamed from: q */
    public void mo24199q(String str) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.p020io.SAXContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void skippedEntity(String str) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.p020io.SAXContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.p020io.SAXContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.p020io.SAXContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startPrefixMapping(String str, String str2) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.p020io.SAXContentHandler, org.xml.sax.ext.LexicalHandler
    /* JADX INFO: renamed from: u */
    public void mo24201u(String str) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.p020io.SAXContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.DTDHandler
    public void unparsedEntityDecl(String str, String str2, String str3, String str4) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.p020io.SAXContentHandler, org.xml.sax.ext.LexicalHandler
    /* JADX INFO: renamed from: w */
    public void mo24203w(String str, String str2, String str3) throws SAXException {
    }
}
