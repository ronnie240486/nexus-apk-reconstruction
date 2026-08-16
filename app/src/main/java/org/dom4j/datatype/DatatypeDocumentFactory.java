package org.dom4j.datatype;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.Namespace;
import org.dom4j.QName;
import org.dom4j.p020io.SAXReader;

/* JADX INFO: loaded from: classes2.dex */
public class DatatypeDocumentFactory extends DocumentFactory {

    /* JADX INFO: renamed from: h */
    public static final boolean f16496h = false;

    /* JADX INFO: renamed from: i */
    public static transient DatatypeDocumentFactory f16497i = new DatatypeDocumentFactory();

    /* JADX INFO: renamed from: j */
    public static final Namespace f16498j;

    /* JADX INFO: renamed from: k */
    public static final QName f16499k;

    /* JADX INFO: renamed from: l */
    public static final QName f16500l;

    /* JADX INFO: renamed from: e */
    public SchemaParser f16501e;

    /* JADX INFO: renamed from: f */
    public SAXReader f16502f;

    /* JADX INFO: renamed from: g */
    public boolean f16503g;

    static {
        Namespace namespaceM23711j8 = Namespace.m23711j8("xsi", "http://www.w3.org/2001/XMLSchema-instance");
        f16498j = namespaceM23711j8;
        f16499k = QName.m23756e("schemaLocation", namespaceM23711j8);
        f16500l = QName.m23756e("noNamespaceSchemaLocation", namespaceM23711j8);
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public static DocumentFactory m23832H() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O */
    public DatatypeElementFactory m23833O(QName qName) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public void m23834P(Document document) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: Q */
    public void m23835Q(org.dom4j.Document r5, java.lang.String r6) {
        /*
            r4 = this;
            return
        L17:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.datatype.DatatypeDocumentFactory.m23835Q(org.dom4j.Document, java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: R */
    public void m23836R(org.dom4j.Document r4, java.lang.String r5, org.dom4j.Namespace r6) {
        /*
            r3 = this;
            return
        L17:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.datatype.DatatypeDocumentFactory.m23836R(org.dom4j.Document, java.lang.String, org.dom4j.Namespace):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public void m23837S(Document document, Namespace namespace) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.DocumentFactory
    /* JADX INFO: renamed from: g */
    public Attribute mo23579g(Element element, QName qName, String str) {
        return null;
    }
}
