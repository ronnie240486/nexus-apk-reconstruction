package org.dom4j.jaxb;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;
import java.util.HashMap;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.p020io.ElementModifier;
import org.dom4j.p020io.OutputFormat;
import org.dom4j.p020io.SAXModifier;
import org.dom4j.p020io.XMLWriter;
import org.xml.sax.InputSource;

/* JADX INFO: loaded from: classes2.dex */
public class JAXBModifier extends JAXBSupport {

    /* JADX INFO: renamed from: f */
    public SAXModifier f16741f;

    /* JADX INFO: renamed from: g */
    public XMLWriter f16742g;

    /* JADX INFO: renamed from: h */
    public boolean f16743h;

    /* JADX INFO: renamed from: i */
    public OutputFormat f16744i;

    /* JADX INFO: renamed from: j */
    public HashMap f16745j;

    public class JAXBElementModifier implements ElementModifier {

        /* JADX INFO: renamed from: a */
        public JAXBModifier f16746a;

        /* JADX INFO: renamed from: b */
        public JAXBObjectModifier f16747b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ JAXBModifier f16748c;

        /* JADX WARN: Invalid debug info offset */
        public JAXBElementModifier(JAXBModifier jAXBModifier, JAXBModifier jAXBModifier2, JAXBObjectModifier jAXBObjectModifier) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.dom4j.p020io.ElementModifier
        /* JADX INFO: renamed from: a */
        public Element mo24101a(Element element) throws Exception {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public JAXBModifier(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JAXBModifier(String str, ClassLoader classLoader) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JAXBModifier(String str, ClassLoader classLoader, OutputFormat outputFormat) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JAXBModifier(String str, OutputFormat outputFormat) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public void m24493f(String str, JAXBObjectModifier jAXBObjectModifier) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public final XMLWriter m24494g() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public final SAXModifier m24495h() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public final XMLWriter m24496i() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public final SAXModifier m24497j() throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public boolean m24498k() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public Document m24499l(File file) throws DocumentException, IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x0015
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    /* JADX INFO: renamed from: m */
    public org.dom4j.Document m24500m(java.io.File r3, java.nio.charset.Charset r4) throws org.dom4j.DocumentException, java.io.IOException {
        /*
            r2 = this;
            r0 = 0
            return r0
        L13:
        L15:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.jaxb.JAXBModifier.m24500m(java.io.File, java.nio.charset.Charset):org.dom4j.Document");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public Document m24501n(InputStream inputStream) throws DocumentException, IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public Document m24502o(InputStream inputStream, String str) throws DocumentException, IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public Document m24503p(Reader reader) throws DocumentException, IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public Document m24504q(Reader reader, String str) throws DocumentException, IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public Document m24505r(String str) throws DocumentException, IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public Document m24506s(URL url) throws DocumentException, IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public Document m24507t(InputSource inputSource) throws DocumentException, IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public void m24508u(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public void m24509v() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public void m24510w(File file) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public void m24511x(OutputStream outputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public void m24512y(Writer writer) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public void m24513z(boolean z) {
    }
}
