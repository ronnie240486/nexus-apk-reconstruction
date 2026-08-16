package org.xml.sax.helpers;

import java.io.IOException;
import org.xml.sax.AttributeList;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.DocumentHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.Locator;
import org.xml.sax.Parser;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;

/* JADX INFO: loaded from: classes.dex */
public class ParserAdapter implements XMLReader, DocumentHandler {

    /* JADX INFO: renamed from: n */
    public static final String f17874n = "http://xml.org/sax/features/";

    /* JADX INFO: renamed from: o */
    public static final String f17875o = "http://xml.org/sax/features/namespaces";

    /* JADX INFO: renamed from: p */
    public static final String f17876p = "http://xml.org/sax/features/namespace-prefixes";

    /* JADX INFO: renamed from: a */
    public NamespaceSupport f17877a;

    /* JADX INFO: renamed from: b */
    public AttributeListAdapter f17878b;

    /* JADX INFO: renamed from: c */
    public boolean f17879c;

    /* JADX INFO: renamed from: d */
    public String[] f17880d;

    /* JADX INFO: renamed from: e */
    public Parser f17881e;

    /* JADX INFO: renamed from: f */
    public AttributesImpl f17882f;

    /* JADX INFO: renamed from: g */
    public boolean f17883g;

    /* JADX INFO: renamed from: h */
    public boolean f17884h;

    /* JADX INFO: renamed from: i */
    public Locator f17885i;

    /* JADX INFO: renamed from: j */
    public EntityResolver f17886j;

    /* JADX INFO: renamed from: k */
    public DTDHandler f17887k;

    /* JADX INFO: renamed from: l */
    public ContentHandler f17888l;

    /* JADX INFO: renamed from: m */
    public ErrorHandler f17889m;

    public final class AttributeListAdapter implements Attributes {

        /* JADX INFO: renamed from: a */
        public AttributeList f17890a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ParserAdapter f17891b;

        /* JADX WARN: Invalid debug info offset */
        public AttributeListAdapter(ParserAdapter parserAdapter) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xml.sax.Attributes
        /* JADX INFO: renamed from: V */
        public String mo26500V(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xml.sax.Attributes
        /* JADX INFO: renamed from: a */
        public String mo26501a(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xml.sax.Attributes
        /* JADX INFO: renamed from: b */
        public String mo26502b(int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xml.sax.Attributes
        /* JADX INFO: renamed from: c */
        public String mo26503c(int i) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        /* JADX INFO: renamed from: d */
        public String mo26504d(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        /* JADX INFO: renamed from: e */
        public String mo26505e(String str, String str2) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xml.sax.Attributes
        /* JADX INFO: renamed from: f */
        public String mo26506f(int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xml.sax.Attributes
        /* JADX INFO: renamed from: g */
        public String mo26507g(int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xml.sax.Attributes
        public int getLength() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xml.sax.Attributes
        public String getType(int i) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        /* JADX INFO: renamed from: h */
        public int mo26508h(String str, String str2) {
            return -1;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xml.sax.Attributes
        /* JADX INFO: renamed from: i */
        public int mo26509i(String str) {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: j */
        public void m26588j(AttributeList attributeList) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0025
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public ParserAdapter() throws org.xml.sax.SAXException {
        /*
            r5 = this;
            return
        L2d:
        L2f:
        L31:
        L33:
        L3b:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xml.sax.helpers.ParserAdapter.<init>():void");
    }

    /* JADX WARN: Invalid debug info offset */
    public ParserAdapter(Parser parser) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ AttributesImpl m26581e(ParserAdapter parserAdapter) {
        return null;
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
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.xml.sax.XMLReader
    /* JADX INFO: renamed from: c */
    public void mo24316c(org.xml.sax.InputSource r3) throws java.io.IOException, org.xml.sax.SAXException {
        /*
            r2 = this;
            return
        L13:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xml.sax.helpers.ParserAdapter.mo24316c(org.xml.sax.InputSource):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.DocumentHandler
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
    @Override // org.xml.sax.DocumentHandler
    public void endDocument() throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public final void m26582f(String str, String str2) throws SAXNotSupportedException {
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
    @Override // org.xml.sax.DocumentHandler
    /* JADX INFO: renamed from: i */
    public void mo26510i(String str) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.DocumentHandler
    public void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x00b4
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.xml.sax.DocumentHandler
    /* JADX INFO: renamed from: j */
    public void mo26511j(java.lang.String r25, org.xml.sax.AttributeList r26) throws org.xml.sax.SAXException {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xml.sax.helpers.ParserAdapter.mo26511j(java.lang.String, org.xml.sax.AttributeList):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public final SAXParseException m26583k(String str) {
        return null;
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
    public final String[] m26584n(String str, boolean z, boolean z2) throws SAXException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.XMLReader
    /* JADX INFO: renamed from: o */
    public boolean mo24330o(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public void m26585p(String str) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.DocumentHandler
    public void processingInstruction(String str, String str2) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public final void m26586q(Parser parser) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public final void m26587r() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.XMLReader
    /* JADX INFO: renamed from: s */
    public void mo24334s(String str, Object obj) throws SAXNotRecognizedException, SAXNotSupportedException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.DocumentHandler
    public void setDocumentLocator(Locator locator) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.DocumentHandler
    public void startDocument() throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.XMLReader
    /* JADX INFO: renamed from: v */
    public ErrorHandler mo24337v() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.XMLReader
    /* JADX INFO: renamed from: y */
    public void mo24339y(ContentHandler contentHandler) {
    }
}
