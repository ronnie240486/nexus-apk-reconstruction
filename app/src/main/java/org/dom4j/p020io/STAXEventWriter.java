package org.dom4j.p020io;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Iterator;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.Comment;
import javax.xml.stream.events.EndDocument;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.EntityReference;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.util.XMLEventConsumer;
import org.dom4j.Branch;
import org.dom4j.CDATA;
import org.dom4j.Document;
import org.dom4j.DocumentType;
import org.dom4j.Element;
import org.dom4j.Entity;
import org.dom4j.Namespace;
import org.dom4j.Node;
import org.dom4j.ProcessingInstruction;
import org.dom4j.Text;

/* JADX INFO: loaded from: classes2.dex */
public class STAXEventWriter {

    /* JADX INFO: renamed from: a */
    public XMLEventConsumer f16704a;

    /* JADX INFO: renamed from: b */
    public XMLEventFactory f16705b;

    /* JADX INFO: renamed from: c */
    public XMLOutputFactory f16706c;

    public class AttributeIterator implements Iterator {

        /* JADX INFO: renamed from: a */
        public Iterator f16707a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ STAXEventWriter f16708b;

        /* JADX WARN: Invalid debug info offset */
        public AttributeIterator(STAXEventWriter sTAXEventWriter, Iterator it) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Iterator
        public Object next() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Iterator
        public void remove() {
        }
    }

    public class NamespaceIterator implements Iterator {

        /* JADX INFO: renamed from: a */
        public Iterator f16709a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ STAXEventWriter f16710b;

        /* JADX WARN: Invalid debug info offset */
        public NamespaceIterator(STAXEventWriter sTAXEventWriter, Iterator it) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Iterator
        public Object next() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Iterator
        public void remove() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public STAXEventWriter() {
    }

    /* JADX WARN: Invalid debug info offset */
    public STAXEventWriter(File file) throws XMLStreamException, IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public STAXEventWriter(OutputStream outputStream) throws XMLStreamException {
    }

    /* JADX WARN: Invalid debug info offset */
    public STAXEventWriter(Writer writer) throws XMLStreamException {
    }

    /* JADX WARN: Invalid debug info offset */
    public STAXEventWriter(XMLEventConsumer xMLEventConsumer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ XMLEventFactory m24363a(STAXEventWriter sTAXEventWriter) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public void m24364A(Namespace namespace) throws XMLStreamException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public void m24365B(Node node) throws XMLStreamException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public void m24366C(ProcessingInstruction processingInstruction) throws XMLStreamException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public void m24367D(Text text) throws XMLStreamException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public Attribute m24368b(org.dom4j.Attribute attribute) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public Characters m24369c(CDATA cdata) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public Characters m24370d(Text text) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public Comment m24371e(org.dom4j.Comment comment) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: f */
    public javax.xml.stream.events.DTD m24372f(org.dom4j.DocumentType r3) {
        /*
            r2 = this;
            r0 = 0
            return r0
        L13:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.p020io.STAXEventWriter.m24372f(org.dom4j.DocumentType):javax.xml.stream.events.DTD");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public EndDocument m24373g(Document document) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public EndElement m24374h(Element element) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public final EntityReference m24375i(Entity entity) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public javax.xml.stream.events.Namespace m24376j(Namespace namespace) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public javax.xml.stream.events.ProcessingInstruction m24377k(ProcessingInstruction processingInstruction) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public QName m24378l(org.dom4j.QName qName) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public StartDocument m24379m(Document document) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public StartElement m24380n(Element element) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public XMLEventConsumer m24381o() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public XMLEventFactory m24382p() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public void m24383q(XMLEventConsumer xMLEventConsumer) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public void m24384r(XMLEventFactory xMLEventFactory) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public void m24385s(org.dom4j.Attribute attribute) throws XMLStreamException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public void m24386t(CDATA cdata) throws XMLStreamException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public void m24387u(Branch branch) throws XMLStreamException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public void m24388v(org.dom4j.Comment comment) throws XMLStreamException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public void m24389w(Document document) throws XMLStreamException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public void m24390x(DocumentType documentType) throws XMLStreamException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public void m24391y(Element element) throws XMLStreamException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public void m24392z(Entity entity) throws XMLStreamException {
    }
}
