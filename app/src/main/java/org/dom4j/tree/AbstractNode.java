package org.dom4j.tree;

import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.NodeFilter;
import org.dom4j.XPath;
import org.dom4j.rule.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractNode implements Node, Cloneable, Serializable {

    /* JADX INFO: renamed from: a */
    public static final String[] f16828a = {"Node", "Element", "Attribute", "Text", "CDATA", "Entity", "Entity", "ProcessingInstruction", "Comment", "Document", "DocumentType", "DocumentFragment", "Notation", "Namespace", "Unknown"};

    /* JADX INFO: renamed from: b */
    public static final DocumentFactory f16829b = DocumentFactory.m23565H();

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: A5 */
    public List mo23722A5(String str, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: B7 */
    public List mo23723B7(String str) {
        return null;
    }

    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: E2 */
    public boolean mo23724E2() {
        return true;
    }

    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: L5 */
    public boolean mo23725L5() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: M7 */
    public String mo23726M7(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: O6 */
    public Node mo23727O6(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: P */
    public void mo23728P(String str) {
    }

    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: P2 */
    public void mo23729P2(Document document) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: R */
    public Node mo23730R() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: S6 */
    public Object mo23731S6(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: T3 */
    public String mo23732T3() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: V1 */
    public List mo23733V1(String str, String str2, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: b7 */
    public XPath mo23734b7(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.dom4j.Node
    public java.lang.Object clone() {
        /*
            r4 = this;
            r0 = 0
            return r0
        L15:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.tree.AbstractNode.clone():java.lang.Object");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d8 */
    public Pattern m24716d8(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e8 */
    public NodeFilter m24717e8(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: f7 */
    public void mo23735f7(Writer writer) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f8 */
    public Node mo23716f8(Element element) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: g0 */
    public String mo23682g0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: g1 */
    public String mo23736g1() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g8 */
    public DocumentFactory mo23814g8() {
        return null;
    }

    @Override // org.dom4j.Node
    public String getName() {
        return null;
    }

    @Override // org.dom4j.Node
    public Element getParent() {
        return null;
    }

    @Override // org.dom4j.Node
    public String getText() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: m1 */
    public boolean mo23737m1(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: p5 */
    public String mo23738p5() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Node
    public void setName(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: t1 */
    public short mo23721t1() {
        return (short) 0;
    }

    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: t4 */
    public void mo23739t4(Element element) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: t6 */
    public Node mo23740t6(Element element) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: w1 */
    public Document mo23741w1() {
        return null;
    }

    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: x4 */
    public boolean mo23742x4() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: y4 */
    public Number mo23743y4(String str) {
        return null;
    }
}
