package org.dom4j.p020io;

import java.io.InputStream;
import java.io.Reader;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EntityReference;
import javax.xml.stream.events.StartElement;
import org.dom4j.Attribute;
import org.dom4j.CharacterData;
import org.dom4j.Comment;
import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.Entity;
import org.dom4j.Namespace;
import org.dom4j.Node;
import org.dom4j.ProcessingInstruction;
import org.dom4j.QName;

/* JADX INFO: loaded from: classes2.dex */
public class STAXEventReader {

    /* JADX INFO: renamed from: a */
    public DocumentFactory f16702a;

    /* JADX INFO: renamed from: b */
    public XMLInputFactory f16703b;

    /* JADX WARN: Invalid debug info offset */
    public STAXEventReader() {
    }

    /* JADX WARN: Invalid debug info offset */
    public STAXEventReader(DocumentFactory documentFactory) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public Attribute m24341a(Element element, javax.xml.stream.events.Attribute attribute) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public CharacterData m24342b(Characters characters) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public Comment m24343c(javax.xml.stream.events.Comment comment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public Element m24344d(StartElement startElement) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public Entity m24345e(EntityReference entityReference) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public Namespace m24346f(javax.xml.stream.events.Namespace namespace) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public ProcessingInstruction m24347g(javax.xml.stream.events.ProcessingInstruction processingInstruction) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public QName m24348h(javax.xml.namespace.QName qName) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public Attribute m24349i(XMLEventReader xMLEventReader) throws XMLStreamException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public CharacterData m24350j(XMLEventReader xMLEventReader) throws XMLStreamException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public Comment m24351k(XMLEventReader xMLEventReader) throws XMLStreamException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public Document m24352l(InputStream inputStream) throws XMLStreamException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: m */
    public org.dom4j.Document m24353m(java.io.InputStream r2, java.lang.String r3) throws javax.xml.stream.XMLStreamException {
        /*
            r1 = this;
            r0 = 0
            return r0
        Le:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.p020io.STAXEventReader.m24353m(java.io.InputStream, java.lang.String):org.dom4j.Document");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public Document m24354n(Reader reader) throws XMLStreamException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: o */
    public org.dom4j.Document m24355o(java.io.Reader r2, java.lang.String r3) throws javax.xml.stream.XMLStreamException {
        /*
            r1 = this;
            r0 = 0
            return r0
        Le:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.p020io.STAXEventReader.m24355o(java.io.Reader, java.lang.String):org.dom4j.Document");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public Document m24356p(XMLEventReader xMLEventReader) throws XMLStreamException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public Element m24357q(XMLEventReader xMLEventReader) throws XMLStreamException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public Entity m24358r(XMLEventReader xMLEventReader) throws XMLStreamException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public Namespace m24359s(XMLEventReader xMLEventReader) throws XMLStreamException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public Node m24360t(XMLEventReader xMLEventReader) throws XMLStreamException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public ProcessingInstruction m24361u(XMLEventReader xMLEventReader) throws XMLStreamException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public void m24362v(DocumentFactory documentFactory) {
    }
}
