package org.dom4j.p020io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Map;
import org.dom4j.Attribute;
import org.dom4j.CDATA;
import org.dom4j.Comment;
import org.dom4j.Document;
import org.dom4j.DocumentType;
import org.dom4j.Element;
import org.dom4j.Entity;
import org.dom4j.Namespace;
import org.dom4j.Node;
import org.dom4j.ProcessingInstruction;
import org.dom4j.Text;
import org.dom4j.tree.NamespaceStack;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.XMLFilterImpl;

/* JADX INFO: loaded from: classes2.dex */
public class XMLWriter extends XMLFilterImpl implements LexicalHandler {

    /* JADX INFO: renamed from: y */
    public static final String f16713y = " ";

    /* JADX INFO: renamed from: g */
    public boolean f16715g;

    /* JADX INFO: renamed from: h */
    public int f16716h;

    /* JADX INFO: renamed from: i */
    public boolean f16717i;

    /* JADX INFO: renamed from: j */
    public boolean f16718j;

    /* JADX INFO: renamed from: k */
    public Writer f16719k;

    /* JADX INFO: renamed from: l */
    public NamespaceStack f16720l;

    /* JADX INFO: renamed from: m */
    public OutputFormat f16721m;

    /* JADX INFO: renamed from: n */
    public boolean f16722n;

    /* JADX INFO: renamed from: o */
    public int f16723o;

    /* JADX INFO: renamed from: p */
    public StringBuffer f16724p;

    /* JADX INFO: renamed from: q */
    public boolean f16725q;

    /* JADX INFO: renamed from: r */
    public char f16726r;

    /* JADX INFO: renamed from: s */
    public boolean f16727s;

    /* JADX INFO: renamed from: t */
    public LexicalHandler f16728t;

    /* JADX INFO: renamed from: u */
    public boolean f16729u;

    /* JADX INFO: renamed from: v */
    public boolean f16730v;

    /* JADX INFO: renamed from: w */
    public Map f16731w;

    /* JADX INFO: renamed from: x */
    public int f16732x;

    /* JADX INFO: renamed from: z */
    public static final String[] f16714z = {SAXReader.f16671s, SAXReader.f16672t};

    /* JADX INFO: renamed from: A */
    public static final OutputFormat f16712A = new OutputFormat();

    /* JADX WARN: Invalid debug info offset */
    public XMLWriter() {
    }

    /* JADX WARN: Invalid debug info offset */
    public XMLWriter(OutputStream outputStream) throws UnsupportedEncodingException {
    }

    /* JADX WARN: Invalid debug info offset */
    public XMLWriter(OutputStream outputStream, OutputFormat outputFormat) throws UnsupportedEncodingException {
    }

    /* JADX WARN: Invalid debug info offset */
    public XMLWriter(Writer writer) {
    }

    /* JADX WARN: Invalid debug info offset */
    public XMLWriter(Writer writer, OutputFormat outputFormat) {
    }

    /* JADX WARN: Invalid debug info offset */
    public XMLWriter(OutputFormat outputFormat) throws UnsupportedEncodingException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public void m24395A() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A0 */
    public void m24396A0(Element element) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public Writer m24397B(OutputStream outputStream, String str) throws UnsupportedEncodingException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B0 */
    public void mo24114B0(String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public int m24398C() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C0 */
    public void mo24115C0(Entity entity) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public String m24399D(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D0 */
    public void m24400D0(String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public String m24401E(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E0 */
    public void m24402E0(String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F */
    public void m24403F() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F0 */
    public void m24404F0(String str, String str2) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public LexicalHandler m24405G() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G0 */
    public void m24406G0(Namespace namespace) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public int m24407H() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H0 */
    public void m24408H0() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public OutputFormat m24409I() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I0 */
    public void m24410I0(Node node) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public void m24411J(IOException iOException) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J0 */
    public void m24412J0(Node node) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public void m24413K() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K0 */
    public void m24414K0(Element element) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: L */
    public void m24415L() {
        /*
            r4 = this;
            return
        L12:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.p020io.XMLWriter.m24415L():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L0 */
    public void m24416L0() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public final boolean m24417M(Element element) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M0 */
    public void m24418M0(ProcessingInstruction processingInstruction) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N */
    public boolean m24419N() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N0 */
    public void mo24116N0(String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O */
    public boolean m24420O() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public boolean m24421P(Namespace namespace) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q */
    public void m24422Q() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public boolean m24423R() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public void m24424S(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T */
    public void m24425T(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U */
    public void m24426U(LexicalHandler lexicalHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V */
    public void m24427V(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W */
    public void m24428W(OutputStream outputStream) throws UnsupportedEncodingException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X */
    public void m24429X(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y */
    public void m24430Y(Writer writer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z */
    public boolean m24431Z(char c) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a0 */
    public void m24432a0(Object obj) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b0 */
    public void m24433b0(String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.XMLReader
    /* JADX INFO: renamed from: c */
    public void mo24316c(InputSource inputSource) throws SAXException, IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c0 */
    public void m24434c0(Attribute attribute) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void characters(char[] r7, int r8, int r9) throws org.xml.sax.SAXException {
        /*
            r6 = this;
            return
        L16:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.p020io.XMLWriter.characters(char[], int, int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d0 */
    public void m24435d0(CDATA cdata) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e0 */
    public void m24436e0(Comment comment) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void endDocument() throws org.xml.sax.SAXException {
        /*
            r1 = this;
            return
        La:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.p020io.XMLWriter.endDocument():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void endElement(java.lang.String r3, java.lang.String r4, java.lang.String r5) throws org.xml.sax.SAXException {
        /*
            r2 = this;
            return
        L14:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.p020io.XMLWriter.endElement(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void endPrefixMapping(String str) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f0 */
    public void m24437f0(Document document) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.XMLReader
    /* JADX INFO: renamed from: g */
    public Object mo24321g(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g0 */
    public void m24438g0(DocumentType documentType) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h0 */
    public void m24439h0(Element element) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i0 */
    public void m24440i0(Entity entity) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public void mo24127j() throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j0 */
    public void m24441j0(Namespace namespace) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.xml.sax.ext.LexicalHandler
    /* JADX INFO: renamed from: k */
    public void mo24194k(char[] r2, int r3, int r4) throws org.xml.sax.SAXException {
        /*
            r1 = this;
            return
        L14:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.p020io.XMLWriter.mo24194k(char[], int, int):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l0 */
    public void m24442l0(Node node) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m0 */
    public void m24443m0(ProcessingInstruction processingInstruction) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ext.LexicalHandler
    /* JADX INFO: renamed from: n */
    public void mo24197n() throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n0 */
    public void m24444n0(Text text) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.DTDHandler
    public void notationDecl(String str, String str2, String str3) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o0 */
    public void m24445o0(Attribute attribute) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public void mo24128p() throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p0 */
    public void m24446p0(Attributes attributes, int i) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ext.LexicalHandler
    /* JADX INFO: renamed from: q */
    public void mo24199q(String str) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q0 */
    public void m24447q0(Element element) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r0 */
    public void m24448r0(Attributes attributes) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.XMLReader
    /* JADX INFO: renamed from: s */
    public void mo24334s(String str, Object obj) throws SAXNotRecognizedException, SAXNotSupportedException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s0 */
    public void mo24129s0(String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void startElement(java.lang.String r4, java.lang.String r5, java.lang.String r6, org.xml.sax.Attributes r7) throws org.xml.sax.SAXException {
        /*
            r3 = this;
            return
        L30:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.p020io.XMLWriter.startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.ContentHandler
    public void startPrefixMapping(String str, String str2) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t0 */
    public void mo24130t0(String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ext.LexicalHandler
    /* JADX INFO: renamed from: u */
    public void mo24201u(String str) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u0 */
    public void m24449u0(Element element) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.XMLFilterImpl, org.xml.sax.DTDHandler
    public void unparsedEntityDecl(String str, String str2, String str3, String str4) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v0 */
    public void m24450v0(String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.xml.sax.ext.LexicalHandler
    /* JADX INFO: renamed from: w */
    public void mo24203w(java.lang.String r2, java.lang.String r3, java.lang.String r4) throws org.xml.sax.SAXException {
        /*
            r1 = this;
            return
        L7:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.p020io.XMLWriter.mo24203w(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w0 */
    public void mo24131w0() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x0 */
    public void m24451x0(String str, String str2, String str3) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y0 */
    public void m24452y0(DocumentType documentType) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z0 */
    public void mo24132z0(Element element) throws IOException {
    }
}
