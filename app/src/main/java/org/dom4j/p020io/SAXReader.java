package org.dom4j.p020io;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;
import java.net.URL;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentFactory;
import org.dom4j.ElementHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLFilter;
import org.xml.sax.XMLReader;

/* JADX INFO: loaded from: classes2.dex */
public class SAXReader {

    /* JADX INFO: renamed from: o */
    public static final String f16667o = "http://xml.org/sax/features/string-interning";

    /* JADX INFO: renamed from: p */
    public static final String f16668p = "http://xml.org/sax/features/namespace-prefixes";

    /* JADX INFO: renamed from: q */
    public static final String f16669q = "http://xml.org/sax/features/namespaces";

    /* JADX INFO: renamed from: r */
    public static final String f16670r = "http://xml.org/sax/properties/declaration-handler";

    /* JADX INFO: renamed from: s */
    public static final String f16671s = "http://xml.org/sax/properties/lexical-handler";

    /* JADX INFO: renamed from: t */
    public static final String f16672t = "http://xml.org/sax/handlers/LexicalHandler";

    /* JADX INFO: renamed from: a */
    public DocumentFactory f16673a;

    /* JADX INFO: renamed from: b */
    public XMLReader f16674b;

    /* JADX INFO: renamed from: c */
    public boolean f16675c;

    /* JADX INFO: renamed from: d */
    public DispatchHandler f16676d;

    /* JADX INFO: renamed from: e */
    public ErrorHandler f16677e;

    /* JADX INFO: renamed from: f */
    public EntityResolver f16678f;

    /* JADX INFO: renamed from: g */
    public boolean f16679g;

    /* JADX INFO: renamed from: h */
    public boolean f16680h;

    /* JADX INFO: renamed from: i */
    public boolean f16681i;

    /* JADX INFO: renamed from: j */
    public boolean f16682j;

    /* JADX INFO: renamed from: k */
    public boolean f16683k;

    /* JADX INFO: renamed from: l */
    public boolean f16684l;

    /* JADX INFO: renamed from: m */
    public String f16685m;

    /* JADX INFO: renamed from: n */
    public XMLFilter f16686n;

    public static class SAXEntityResolver implements EntityResolver, Serializable {

        /* JADX INFO: renamed from: a */
        public String f16687a;

        /* JADX WARN: Invalid debug info offset */
        public SAXEntityResolver(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xml.sax.EntityResolver
        public InputSource resolveEntity(String str, String str2) {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public SAXReader() {
    }

    /* JADX WARN: Invalid debug info offset */
    public SAXReader(String str) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    public SAXReader(String str, boolean z) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    public SAXReader(DocumentFactory documentFactory) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SAXReader(DocumentFactory documentFactory, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SAXReader(XMLReader xMLReader) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SAXReader(XMLReader xMLReader, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    public SAXReader(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public Document m24243A(URL url) throws DocumentException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public Document m24244B(InputSource inputSource) throws DocumentException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public void m24245C(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public void m24246D() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public void m24247E(ElementHandler elementHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F */
    public void m24248F(DispatchHandler dispatchHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public void m24249G(DocumentFactory documentFactory) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public void m24250H(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public void m24251I(EntityResolver entityResolver) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public void m24252J(ErrorHandler errorHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public void m24253K(String str, boolean z) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L */
    public void m24254L(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public void m24255M(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N */
    public void m24256N(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O */
    public void m24257O(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public void m24258P(String str, Object obj) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q */
    public void m24259Q(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R */
    public void m24260R(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public void m24261S(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T */
    public void m24262T(XMLFilter xMLFilter) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U */
    public void m24263U(XMLReader xMLReader) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V */
    public void m24264V(String str) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void m24265a(String str, ElementHandler elementHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0031
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    public void m24266b(org.xml.sax.XMLReader r4, org.xml.sax.helpers.DefaultHandler r5) throws org.dom4j.DocumentException {
        /*
            r3 = this;
            return
        L42:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.p020io.SAXReader.m24266b(org.xml.sax.XMLReader, org.xml.sax.helpers.DefaultHandler):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public SAXContentHandler mo24242c(XMLReader xMLReader) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public EntityResolver m24267d(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public XMLReader m24268e() throws SAXException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public DispatchHandler m24269f() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public DocumentFactory m24270g() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public String m24271h() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public EntityResolver m24272i() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public ErrorHandler m24273j() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public XMLFilter m24274k() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public XMLReader m24275l() throws SAXException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public XMLReader m24276m(XMLReader xMLReader) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public boolean m24277n() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public boolean m24278o() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public boolean m24279p() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public boolean m24280q() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public boolean m24281r() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public boolean m24282s() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public boolean m24283t() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public Document m24284u(File file) throws DocumentException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public Document m24285v(InputStream inputStream) throws DocumentException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public Document m24286w(InputStream inputStream, String str) throws DocumentException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public Document m24287x(Reader reader) throws DocumentException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public Document m24288y(Reader reader, String str) throws DocumentException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public Document m24289z(String str) throws DocumentException {
        return null;
    }
}
