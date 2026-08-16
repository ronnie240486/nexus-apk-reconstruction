package org.dom4j.jaxb;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.ElementHandler;
import org.dom4j.ElementPath;
import org.dom4j.p020io.SAXReader;
import org.xml.sax.InputSource;

/* JADX INFO: loaded from: classes2.dex */
public class JAXBReader extends JAXBSupport {

    /* JADX INFO: renamed from: f */
    public SAXReader f16749f;

    /* JADX INFO: renamed from: g */
    public boolean f16750g;

    public class PruningElementHandler implements ElementHandler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ JAXBReader f16751a;

        /* JADX WARN: Invalid debug info offset */
        public PruningElementHandler(JAXBReader jAXBReader) {
        }

        @Override // org.dom4j.ElementHandler
        /* JADX INFO: renamed from: a */
        public void mo23703a(ElementPath elementPath) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.dom4j.ElementHandler
        /* JADX INFO: renamed from: b */
        public void mo23704b(ElementPath elementPath) {
        }
    }

    public class UnmarshalElementHandler implements ElementHandler {

        /* JADX INFO: renamed from: a */
        public JAXBReader f16752a;

        /* JADX INFO: renamed from: b */
        public JAXBObjectHandler f16753b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ JAXBReader f16754c;

        /* JADX WARN: Invalid debug info offset */
        public UnmarshalElementHandler(JAXBReader jAXBReader, JAXBReader jAXBReader2, JAXBObjectHandler jAXBObjectHandler) {
        }

        @Override // org.dom4j.ElementHandler
        /* JADX INFO: renamed from: a */
        public void mo23703a(ElementPath elementPath) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.dom4j.ElementHandler
        /* JADX INFO: renamed from: b */
        public void mo23704b(ElementPath elementPath) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public JAXBReader(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JAXBReader(String str, ClassLoader classLoader) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public void m24516f(String str, ElementHandler elementHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public void m24517g(String str, JAXBObjectHandler jAXBObjectHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public final SAXReader m24518h() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public boolean m24519i() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public Document m24520j(File file) throws DocumentException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x0015
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    /* JADX INFO: renamed from: k */
    public org.dom4j.Document m24521k(java.io.File r3, java.nio.charset.Charset r4) throws org.dom4j.DocumentException {
        /*
            r2 = this;
            r0 = 0
            return r0
        L13:
        L15:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.jaxb.JAXBReader.m24521k(java.io.File, java.nio.charset.Charset):org.dom4j.Document");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public Document m24522l(InputStream inputStream) throws DocumentException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public Document m24523m(InputStream inputStream, String str) throws DocumentException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public Document m24524n(Reader reader) throws DocumentException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public Document m24525o(Reader reader, String str) throws DocumentException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public Document m24526p(String str) throws DocumentException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public Document m24527q(URL url) throws DocumentException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public Document m24528r(InputSource inputSource) throws DocumentException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public void m24529s(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public void m24530t(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public void m24531u() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public void m24532v(boolean z) {
    }
}
