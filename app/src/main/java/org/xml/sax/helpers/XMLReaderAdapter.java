package org.xml.sax.helpers;

import java.io.IOException;
import java.util.Locale;
import org.xml.sax.AttributeList;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.DocumentHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.Parser;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/* JADX INFO: loaded from: classes.dex */
public class XMLReaderAdapter implements Parser, ContentHandler {

    /* JADX INFO: renamed from: a */
    public XMLReader f17898a;

    /* JADX INFO: renamed from: b */
    public DocumentHandler f17899b;

    /* JADX INFO: renamed from: c */
    public AttributesAdapter f17900c;

    public final class AttributesAdapter implements AttributeList {

        /* JADX INFO: renamed from: a */
        public Attributes f17901a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ XMLReaderAdapter f17902b;

        /* JADX WARN: Invalid debug info offset */
        public AttributesAdapter(XMLReaderAdapter xMLReaderAdapter) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xml.sax.AttributeList
        /* JADX INFO: renamed from: V */
        public String mo26496V(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xml.sax.AttributeList
        /* JADX INFO: renamed from: a */
        public String mo26497a(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xml.sax.AttributeList
        /* JADX INFO: renamed from: b */
        public String mo26498b(int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xml.sax.AttributeList
        /* JADX INFO: renamed from: c */
        public String mo26499c(int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public void m26594d(Attributes attributes) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xml.sax.AttributeList
        public int getLength() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xml.sax.AttributeList
        public String getType(int i) {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public XMLReaderAdapter() throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    public XMLReaderAdapter(XMLReader xMLReader) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.Parser
    /* JADX INFO: renamed from: a */
    public void mo26524a(ErrorHandler errorHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.Parser
    /* JADX INFO: renamed from: b */
    public void mo26525b(String str) throws SAXException, IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.Parser
    /* JADX INFO: renamed from: c */
    public void mo26526c(InputSource inputSource) throws SAXException, IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.Parser
    /* JADX INFO: renamed from: d */
    public void mo26527d(DTDHandler dTDHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void endPrefixMapping(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.Parser
    /* JADX INFO: renamed from: g */
    public void mo26528g(DocumentHandler documentHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.Parser
    /* JADX INFO: renamed from: h */
    public void mo26529h(Locale locale) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public final void m26592j(XMLReader xMLReader) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0008
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: k */
    public final void m26593k() throws org.xml.sax.SAXException {
        /*
            r3 = this;
            return
        L10:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xml.sax.helpers.XMLReaderAdapter.m26593k():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.Parser
    /* JADX INFO: renamed from: k0 */
    public void mo26530k0(EntityResolver entityResolver) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
    }

    @Override // org.xml.sax.ContentHandler
    public void skippedEntity(String str) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
    }

    @Override // org.xml.sax.ContentHandler
    public void startPrefixMapping(String str, String str2) {
    }
}
