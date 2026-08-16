package org.dom4j.p020io;

import java.util.List;
import java.util.Map;
import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.tree.NamespaceStack;
import org.xml.sax.Attributes;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.ext.DeclHandler;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: loaded from: classes2.dex */
public class SAXContentHandler extends DefaultHandler implements LexicalHandler, DeclHandler, DTDHandler {

    /* JADX INFO: renamed from: A */
    public boolean f16599A;

    /* JADX INFO: renamed from: B */
    public StringBuffer f16600B;

    /* JADX INFO: renamed from: C */
    public boolean f16601C;

    /* JADX INFO: renamed from: c */
    public DocumentFactory f16602c;

    /* JADX INFO: renamed from: d */
    public Document f16603d;

    /* JADX INFO: renamed from: e */
    public ElementStack f16604e;

    /* JADX INFO: renamed from: f */
    public NamespaceStack f16605f;

    /* JADX INFO: renamed from: g */
    public ElementHandler f16606g;

    /* JADX INFO: renamed from: h */
    public Locator f16607h;

    /* JADX INFO: renamed from: i */
    public String f16608i;

    /* JADX INFO: renamed from: j */
    public boolean f16609j;

    /* JADX INFO: renamed from: k */
    public boolean f16610k;

    /* JADX INFO: renamed from: l */
    public StringBuffer f16611l;

    /* JADX INFO: renamed from: m */
    public Map f16612m;

    /* JADX INFO: renamed from: n */
    public List f16613n;

    /* JADX INFO: renamed from: o */
    public List f16614o;

    /* JADX INFO: renamed from: p */
    public List f16615p;

    /* JADX INFO: renamed from: q */
    public int f16616q;

    /* JADX INFO: renamed from: r */
    public EntityResolver f16617r;

    /* JADX INFO: renamed from: s */
    public InputSource f16618s;

    /* JADX INFO: renamed from: t */
    public Element f16619t;

    /* JADX INFO: renamed from: u */
    public boolean f16620u;

    /* JADX INFO: renamed from: v */
    public boolean f16621v;

    /* JADX INFO: renamed from: w */
    public int f16622w;

    /* JADX INFO: renamed from: x */
    public boolean f16623x;

    /* JADX INFO: renamed from: y */
    public boolean f16624y;

    /* JADX INFO: renamed from: z */
    public boolean f16625z;

    /* JADX WARN: Invalid debug info offset */
    public SAXContentHandler() {
    }

    /* JADX WARN: Invalid debug info offset */
    public SAXContentHandler(DocumentFactory documentFactory) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SAXContentHandler(DocumentFactory documentFactory, ElementHandler elementHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SAXContentHandler(DocumentFactory documentFactory, ElementHandler elementHandler, ElementStack elementStack) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public EntityResolver m24172A() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public InputSource m24173B() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public boolean m24174C(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public boolean m24175D() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public boolean m24176E() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F */
    public boolean m24177F() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public boolean m24178G() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public boolean m24179H() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public void m24180I(ElementStack elementStack) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public void m24181J(EntityResolver entityResolver) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public void m24182K(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L */
    public void m24183L(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public void m24184M(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N */
    public void m24185N(InputSource inputSource) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O */
    public void m24186O(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public void m24187P(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ext.DeclHandler
    /* JADX INFO: renamed from: a */
    public void mo24188a(String str, String str2, String str3, String str4, String str5) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ext.DeclHandler
    /* JADX INFO: renamed from: b */
    public void mo24189b(String str, String str2) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ext.DeclHandler
    /* JADX INFO: renamed from: c */
    public void mo24190c(String str, String str2, String str3) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ext.DeclHandler
    /* JADX INFO: renamed from: d */
    public void mo24191d(String str, String str2) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endPrefixMapping(String str) throws SAXException {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public void error(SAXParseException sAXParseException) throws SAXException {
        throw sAXParseException;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public void fatalError(SAXParseException sAXParseException) throws SAXException {
        throw sAXParseException;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public void m24192g(Element element, Attributes attributes) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public void m24193h(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ext.LexicalHandler
    /* JADX INFO: renamed from: j */
    public void mo24127j() throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ext.LexicalHandler
    /* JADX INFO: renamed from: k */
    public void mo24194k(char[] cArr, int i, int i2) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public void m24195l(Element element) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public void m24196m(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ext.LexicalHandler
    /* JADX INFO: renamed from: n */
    public void mo24197n() throws SAXException {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.DTDHandler
    public void notationDecl(String str, String str2, String str3) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public void m24198o() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ext.LexicalHandler
    /* JADX INFO: renamed from: p */
    public void mo24128p() throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ext.LexicalHandler
    /* JADX INFO: renamed from: q */
    public void mo24199q(String str) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public Document m24200s() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startPrefixMapping(String str, String str2) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ext.LexicalHandler
    /* JADX INFO: renamed from: u */
    public void mo24201u(String str) throws SAXException {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.DTDHandler
    public void unparsedEntityDecl(String str, String str2, String str3, String str4) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public ElementStack m24202v() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ext.LexicalHandler
    /* JADX INFO: renamed from: w */
    public void mo24203w(String str, String str2, String str3) throws SAXException {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
    public void warning(SAXParseException sAXParseException) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public Document m24204x() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public ElementStack m24205y() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: z */
    public final java.lang.String m24206z() {
        /*
            r3 = this;
            r0 = 0
            return r0
        L1b:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.p020io.SAXContentHandler.m24206z():java.lang.String");
    }
}
