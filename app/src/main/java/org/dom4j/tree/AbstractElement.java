package org.dom4j.tree;

import java.io.IOException;
import java.io.Writer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.dom4j.Attribute;
import org.dom4j.CDATA;
import org.dom4j.Comment;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.Entity;
import org.dom4j.Namespace;
import org.dom4j.Node;
import org.dom4j.ProcessingInstruction;
import org.dom4j.QName;
import org.dom4j.Text;
import org.dom4j.Visitor;
import org.xml.sax.Attributes;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractElement extends AbstractBranch implements Element {

    /* JADX INFO: renamed from: d */
    public static final DocumentFactory f16823d = DocumentFactory.m23565H();

    /* JADX INFO: renamed from: e */
    public static final List f16824e;

    /* JADX INFO: renamed from: f */
    public static final Iterator f16825f;

    /* JADX INFO: renamed from: g */
    public static final boolean f16826g = false;

    /* JADX INFO: renamed from: h */
    public static final boolean f16827h = false;

    static {
        List list = Collections.EMPTY_LIST;
        f16824e = list;
        f16825f = list.iterator();
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: A0 */
    public Namespace mo23636A0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: A6 */
    public Iterator mo23637A6() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A8 */
    public List mo24701A8(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractBranch, org.dom4j.Branch
    /* JADX INFO: renamed from: B4 */
    public int mo23524B4(Node node) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B8 */
    public Attribute mo24702B8(String str, Namespace namespace) {
        return null;
    }

    /* JADX INFO: renamed from: C8 */
    public abstract List mo24703C8();

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: D1 */
    public Element mo23639D1(QName qName) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: D5 */
    public void mo23640D5(CDATA cdata) {
    }

    /* JADX INFO: renamed from: D8 */
    public abstract List mo24704D8(int i);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E6 */
    public void m24705E6(Namespace namespace) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E8 */
    public List mo23810E8() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: F4 */
    public String mo23641F4(QName qName, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: F5 */
    public Element mo23642F5(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F8 */
    public List mo23811F8(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Branch
    /* JADX INFO: renamed from: G3 */
    public List mo23525G3(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: G6 */
    public String mo23643G6(QName qName) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: G7 */
    public Element mo23644G7(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G8 */
    public Element mo24706G8(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractBranch, org.dom4j.Branch
    /* JADX INFO: renamed from: H5 */
    public Node mo23526H5(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: H6 */
    public Iterator mo23645H6(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: H7 */
    public void mo23646H7(Element element) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H8 */
    public Element mo24707H8(QName qName) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: I3 */
    public void mo23647I3(QName qName, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: I4 */
    public void mo23648I4(String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I5 */
    public Element mo23649I5(String str, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I8 */
    public Iterator m24708I8(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: J0 */
    public String mo23651J0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: J4 */
    public Node mo23652J4(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J8 */
    public Element mo24709J8(String str, Namespace namespace) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: K6 */
    public String mo23713K6() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: K7 */
    public String mo23714K7(Element element) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K8 */
    public Iterator m24710K8(String str, Namespace namespace) {
        return null;
    }

    /* JADX INFO: renamed from: L0 */
    public void mo23653L0(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: L4 */
    public void mo23654L4(Namespace namespace) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L6 */
    public Attribute mo23655L6(QName qName) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L8 */
    public List m24711L8(String str, Namespace namespace) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M8 */
    public void m24712M8(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: N6 */
    public String mo23656N6(String str, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N8 */
    public String m24713N8() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O2 */
    public Element mo23657O2(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O8 */
    public void mo23812O8(Attributes attributes, NamespaceStack namespaceStack, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractNode, org.dom4j.Node
    /* JADX INFO: renamed from: P */
    public void mo23728P(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: P0 */
    public Element mo23658P0(String str, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractBranch, org.dom4j.Branch
    /* JADX INFO: renamed from: P1 */
    public void mo23530P1(ProcessingInstruction processingInstruction) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: P4 */
    public List mo23659P4(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: P6 */
    public Element mo23660P6(String str, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: Q2 */
    public List mo23661Q2() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: Q3 */
    public Element mo23662Q3(QName qName) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: Q6 */
    public boolean mo23663Q6() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: S */
    public String mo23664S() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: S5 */
    public Namespace mo23665S5(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractBranch, org.dom4j.Branch
    /* JADX INFO: renamed from: T6 */
    public boolean mo23533T6(Comment comment) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: V7 */
    public boolean mo23666V7(CDATA cdata) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractBranch, org.dom4j.Branch
    /* JADX INFO: renamed from: W2 */
    public boolean mo23534W2(Element element) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: W3 */
    public void mo23667W3(Text text) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: W6 */
    public Element mo23668W6() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: W7 */
    public Element mo23669W7(String str, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: X3 */
    public Iterator mo23670X3() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: X5 */
    public String mo23671X5(QName qName) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: Z0 */
    public Element mo23672Z0(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: Z1 */
    public String mo23673Z1(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractBranch, org.dom4j.Branch
    /* JADX INFO: renamed from: Z3 */
    public void mo23535Z3(Node node) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: Z5 */
    public boolean mo23674Z5(Namespace namespace) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractBranch, org.dom4j.Branch
    /* JADX INFO: renamed from: a3 */
    public Iterator mo23536a3() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: a4 */
    public List mo23675a4(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a8 */
    public Attribute mo23676a8(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b0 */
    public String mo23519b0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractBranch, org.dom4j.Branch
    /* JADX INFO: renamed from: b2 */
    public boolean mo23538b2(ProcessingInstruction processingInstruction) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: b3 */
    public void mo23715b3(Visitor visitor) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: b4 */
    public boolean mo23677b4(Entity entity) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: b8 */
    public boolean mo23678b8(Attribute attribute) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: c3 */
    public Element mo23679c3(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: c7 */
    public int mo23680c7() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Branch
    /* JADX INFO: renamed from: c8 */
    public boolean mo23539c8(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: f2 */
    public String mo23681f2(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractNode, org.dom4j.Node
    /* JADX INFO: renamed from: f7 */
    public void mo23735f7(Writer writer) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractNode, org.dom4j.Node
    /* JADX INFO: renamed from: g0 */
    public String mo23682g0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractBranch, org.dom4j.Branch
    /* JADX INFO: renamed from: g3 */
    public int mo23541g3() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: g6 */
    public String mo23683g6(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractNode
    /* JADX INFO: renamed from: g8 */
    public DocumentFactory mo23814g8() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractNode, org.dom4j.Node
    public String getName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: i2 */
    public void mo23684i2(Attribute attribute) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractBranch
    /* JADX INFO: renamed from: i8 */
    public void mo24685i8(int i, Node node) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: j6 */
    public Attribute mo23685j6(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractBranch
    /* JADX INFO: renamed from: j8 */
    public void mo24686j8(Node node) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractBranch, org.dom4j.Branch
    /* JADX INFO: renamed from: k3 */
    public void mo23542k3(Comment comment) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractBranch, org.dom4j.Branch
    /* JADX INFO: renamed from: k4 */
    public void mo23543k4(Element element) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractBranch
    /* JADX INFO: renamed from: k8 */
    public void mo23845k8(Node node) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: l4 */
    public String mo23687l4(QName qName) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: l6 */
    public String mo23719l6(Element element) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractBranch
    /* JADX INFO: renamed from: l8 */
    public void mo23846l8(Node node) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: m5 */
    public Namespace mo23688m5(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m7 */
    public Element mo23689m7(QName qName, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: n4 */
    public List mo23690n4() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: o5 */
    public void mo23692o5(Entity entity) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: p3 */
    public QName mo23693p3(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: p6 */
    public boolean mo23694p6() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: p7 */
    public boolean mo23695p7() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: r0 */
    public Element mo23696r0(String str, Map map) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: r3 */
    public boolean mo23697r3(Text text) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Branch
    /* JADX INFO: renamed from: r5 */
    public List mo23544r5() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractBranch, org.dom4j.Branch
    /* JADX INFO: renamed from: s5 */
    public boolean mo23545s5(Node node) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractNode, org.dom4j.Node
    public void setName(String str) {
    }

    @Override // org.dom4j.tree.AbstractNode, org.dom4j.Node
    /* JADX INFO: renamed from: t1 */
    public short mo23721t1() {
        return (short) 1;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: t2 */
    public List mo23698t2() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: t7 */
    public Iterator mo23699t7(QName qName) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Branch
    /* JADX INFO: renamed from: u0 */
    public void mo23546u0() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractBranch, org.dom4j.Branch
    /* JADX INFO: renamed from: v3 */
    public Element mo23547v3(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: v4 */
    public List mo23700v4() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public Object mo23701w() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Branch
    /* JADX INFO: renamed from: w4 */
    public ProcessingInstruction mo23548w4(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractBranch
    /* JADX INFO: renamed from: x8 */
    public boolean mo24698x8(Node node) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y8 */
    public void m24714y8(int i, Node node) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Element
    /* JADX INFO: renamed from: z1 */
    public List mo23702z1(QName qName) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z8 */
    public void mo24715z8(Node node) {
    }
}
