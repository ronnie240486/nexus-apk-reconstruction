package org.dom4j.dom;

import java.util.Map;
import org.dom4j.Attribute;
import org.dom4j.CDATA;
import org.dom4j.Comment;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.Entity;
import org.dom4j.Namespace;
import org.dom4j.ProcessingInstruction;
import org.dom4j.QName;
import org.dom4j.Text;
import org.dom4j.util.SimpleSingleton;
import org.dom4j.util.SingletonStrategy;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;

/* JADX INFO: loaded from: classes2.dex */
public class DOMDocumentFactory extends DocumentFactory implements DOMImplementation {

    /* JADX INFO: renamed from: e */
    public static SingletonStrategy f16530e;

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Class f16531f;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    static {
        Class cls;
        try {
            cls = Class.forName(System.getProperty("org.dom4j.dom.DOMDocumentFactory.singleton.strategy", "org.dom4j.util.SimpleSingleton"));
        } catch (Exception unused) {
            cls = SimpleSingleton.class;
        }
        try {
            SingletonStrategy singletonStrategy = (SingletonStrategy) cls.newInstance();
            f16530e = singletonStrategy;
            Class clsM23943e = f16531f;
            if (clsM23943e == null) {
                clsM23943e = m23943e("org.dom4j.dom.DOMDocumentFactory");
                f16531f = clsM23943e;
            }
            singletonStrategy.mo24820a(clsM23943e.getName());
        } catch (Exception unused2) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public static DocumentFactory m23942H() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Class m23943e(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.DocumentFactory
    /* JADX INFO: renamed from: C */
    public Text mo23567C(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O */
    public DOMDocumentType m23944O(DocumentType documentType) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public Element m23945P(QName qName, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q */
    public Entity m23946Q(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.w3c.dom.DOMImplementation
    /* JADX INFO: renamed from: a */
    public Document mo23947a(String str, String str2, DocumentType documentType) throws DOMException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.w3c.dom.DOMImplementation
    /* JADX INFO: renamed from: c */
    public boolean mo23948c(String str, String str2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.w3c.dom.DOMImplementation
    /* JADX INFO: renamed from: d */
    public DocumentType mo23949d(String str, String str2, String str3) throws DOMException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.DocumentFactory
    /* JADX INFO: renamed from: g */
    public Attribute mo23579g(Element element, QName qName, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.DocumentFactory
    /* JADX INFO: renamed from: h */
    public CDATA mo23580h(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.DocumentFactory
    /* JADX INFO: renamed from: i */
    public Comment mo23581i(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.DocumentFactory
    /* JADX INFO: renamed from: j */
    public org.dom4j.DocumentType mo23582j(String str, String str2, String str3) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.DocumentFactory
    /* JADX INFO: renamed from: k */
    public org.dom4j.Document mo23583k() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.DocumentFactory
    /* JADX INFO: renamed from: p */
    public Element mo23588p(QName qName) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.DocumentFactory
    /* JADX INFO: renamed from: q */
    public Entity mo23589q(String str, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.DocumentFactory
    /* JADX INFO: renamed from: r */
    public Namespace mo23590r(String str, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.DocumentFactory
    /* JADX INFO: renamed from: t */
    public ProcessingInstruction mo23592t(String str, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.DocumentFactory
    /* JADX INFO: renamed from: u */
    public ProcessingInstruction mo23593u(String str, Map map) {
        return null;
    }
}
