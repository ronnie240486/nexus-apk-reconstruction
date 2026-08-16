package org.dom4j.datatype;

import com.sun.msv.datatype.SerializationContext;
import com.sun.msv.datatype.xsd.XSDatatype;
import org.dom4j.Element;
import org.dom4j.QName;
import org.dom4j.tree.AbstractAttribute;
import org.relaxng.datatype.ValidationContext;

/* JADX INFO: loaded from: classes2.dex */
public class DatatypeAttribute extends AbstractAttribute implements SerializationContext, ValidationContext {

    /* JADX INFO: renamed from: c */
    public Element f16491c;

    /* JADX INFO: renamed from: d */
    public QName f16492d;

    /* JADX INFO: renamed from: e */
    public XSDatatype f16493e;

    /* JADX INFO: renamed from: f */
    public Object f16494f;

    /* JADX INFO: renamed from: g */
    public String f16495g;

    /* JADX WARN: Invalid debug info offset */
    public DatatypeAttribute(QName qName, XSDatatype xSDatatype) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DatatypeAttribute(QName qName, XSDatatype xSDatatype, String str) {
    }

    @Override // org.dom4j.tree.AbstractNode, org.dom4j.Node
    /* JADX INFO: renamed from: E2 */
    public boolean mo23724E2() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractAttribute, org.dom4j.Attribute
    /* JADX INFO: renamed from: L0 */
    public void mo23517L0(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractNode, org.dom4j.Node
    public Element getParent() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Attribute
    public String getValue() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h8 */
    public Object m23824h8(String str) {
        return null;
    }

    /* JADX INFO: renamed from: i8 */
    public String m23825i8() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j8 */
    public String m23826j8(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractAttribute, org.dom4j.Attribute
    /* JADX INFO: renamed from: k */
    public void mo23520k(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k8 */
    public XSDatatype m23827k8() {
        return null;
    }

    /* JADX INFO: renamed from: l8 */
    public boolean m23828l8(String str) {
        return false;
    }

    /* JADX INFO: renamed from: m8 */
    public boolean m23829m8(String str) {
        return true;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n8 */
    public String m23830n8(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Attribute
    /* JADX INFO: renamed from: o1 */
    public QName mo23521o1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o8 */
    public void m23831o8(String str) throws IllegalArgumentException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractNode, org.dom4j.Node
    /* JADX INFO: renamed from: t4 */
    public void mo23739t4(Element element) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractAttribute
    public String toString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractAttribute, org.dom4j.Attribute
    /* JADX INFO: renamed from: w */
    public Object mo23522w() {
        return null;
    }

    @Override // org.dom4j.tree.AbstractNode, org.dom4j.Node
    /* JADX INFO: renamed from: x4 */
    public boolean mo23742x4() {
        return true;
    }
}
