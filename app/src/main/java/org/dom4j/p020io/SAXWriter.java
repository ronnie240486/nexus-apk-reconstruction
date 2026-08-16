package org.dom4j.p020io;

import java.util.Map;
import org.dom4j.Branch;
import org.dom4j.CDATA;
import org.dom4j.Comment;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Entity;
import org.dom4j.Namespace;
import org.dom4j.Node;
import org.dom4j.ProcessingInstruction;
import org.dom4j.tree.NamespaceStack;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.AttributesImpl;

/* JADX INFO: loaded from: classes2.dex */
public class SAXWriter implements XMLReader {

    /* JADX INFO: renamed from: j */
    public static final String[] f16690j = {SAXReader.f16671s, SAXReader.f16672t};

    /* JADX INFO: renamed from: k */
    public static final String f16691k = "http://xml.org/sax/features/namespace-prefixes";

    /* JADX INFO: renamed from: l */
    public static final String f16692l = "http://xml.org/sax/features/namespaces";

    /* JADX INFO: renamed from: a */
    public ContentHandler f16693a;

    /* JADX INFO: renamed from: b */
    public DTDHandler f16694b;

    /* JADX INFO: renamed from: c */
    public EntityResolver f16695c;

    /* JADX INFO: renamed from: d */
    public ErrorHandler f16696d;

    /* JADX INFO: renamed from: e */
    public LexicalHandler f16697e;

    /* JADX INFO: renamed from: f */
    public AttributesImpl f16698f;

    /* JADX INFO: renamed from: g */
    public Map f16699g;

    /* JADX INFO: renamed from: h */
    public Map f16700h;

    /* JADX INFO: renamed from: i */
    public boolean f16701i;

    /* JADX WARN: Invalid debug info offset */
    public SAXWriter() {
    }

    /* JADX WARN: Invalid debug info offset */
    public SAXWriter(ContentHandler contentHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SAXWriter(ContentHandler contentHandler, LexicalHandler lexicalHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SAXWriter(ContentHandler contentHandler, LexicalHandler lexicalHandler, EntityResolver entityResolver) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public void m24297A(LexicalHandler lexicalHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public void m24298B(XMLReader xMLReader) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public void m24299C() throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public void m24300D(Element element, AttributesImpl attributesImpl) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public AttributesImpl m24301E(Element element, NamespaceStack namespaceStack) throws SAXException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F */
    public void m24302F(String str) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public void m24303G(CDATA cdata) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public void m24304H(Comment comment) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public void m24305I(Document document) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public void m24306J(Element element) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public void m24307K(Element element, NamespaceStack namespaceStack) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L */
    public void m24308L(Entity entity) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public void m24309M(Node node) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N */
    public void m24310N(ProcessingInstruction processingInstruction) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O */
    public void m24311O(Element element) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public void m24312P(Branch branch, NamespaceStack namespaceStack) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q */
    public void m24313Q(Element element) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.XMLReader
    /* JADX INFO: renamed from: a */
    public void mo24314a(ErrorHandler errorHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.XMLReader
    /* JADX INFO: renamed from: b */
    public void mo24315b(String str) throws SAXNotSupportedException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.XMLReader
    /* JADX INFO: renamed from: c */
    public void mo24316c(InputSource inputSource) throws SAXException {
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
    /* JADX INFO: renamed from: e */
    public AttributesImpl m24319e(AttributesImpl attributesImpl, Namespace namespace) {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public void m24320f() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.XMLReader
    /* JADX INFO: renamed from: g */
    public Object mo24321g(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.XMLReader
    /* JADX INFO: renamed from: h */
    public DTDHandler mo24322h() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public Attributes m24323i(Element element, Attributes attributes) throws SAXException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public void m24324j(Document document) throws SAXException {
    }

    /* JADX INFO: renamed from: k */
    public void m24325k(Document document) throws SAXException {
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
    /* JADX INFO: renamed from: n */
    public void m24329n() throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.XMLReader
    /* JADX INFO: renamed from: o */
    public boolean mo24330o(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public void m24331p(Element element) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public void m24332q(NamespaceStack namespaceStack, int i) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0016
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: r */
    public void m24333r(org.dom4j.Document r6) throws org.xml.sax.SAXException {
        /*
            r5 = this;
            return
        L1c:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.p020io.SAXWriter.m24333r(org.dom4j.Document):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.XMLReader
    /* JADX INFO: renamed from: s */
    public void mo24334s(String str, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public LexicalHandler m24335t() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public boolean m24336u() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.XMLReader
    /* JADX INFO: renamed from: v */
    public ErrorHandler mo24337v() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public boolean m24338w(Namespace namespace, NamespaceStack namespaceStack) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.XMLReader
    /* JADX INFO: renamed from: y */
    public void mo24339y(ContentHandler contentHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public void m24340z(boolean z) {
    }
}
