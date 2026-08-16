package org.dom4j.tree;

import java.io.IOException;
import java.io.Writer;
import java.util.Map;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.QName;
import org.dom4j.Visitor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractDocument extends AbstractBranch implements Document {

    /* JADX INFO: renamed from: d */
    public String f16822d;

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: K6 */
    public java.lang.String mo23713K6() {
        /*
            r4 = this;
            r0 = 0
            return r0
        L20:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.tree.AbstractDocument.mo23713K6():java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: K7 */
    public String mo23714K7(Element element) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractBranch, org.dom4j.Branch
    /* JADX INFO: renamed from: O3 */
    public Element mo23528O3(QName qName) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Document
    /* JADX INFO: renamed from: P0 */
    public Document mo23552P0(String str, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractBranch, org.dom4j.Branch
    /* JADX INFO: renamed from: S1 */
    public Element mo23532S1(String str, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractBranch, org.dom4j.Branch
    /* JADX INFO: renamed from: W2 */
    public boolean mo23534W2(Element element) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Document
    /* JADX INFO: renamed from: Z0 */
    public Document mo23554Z0(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: b3 */
    public void mo23715b3(Visitor visitor) {
    }

    @Override // org.dom4j.Document
    /* JADX INFO: renamed from: d7 */
    public String mo23556d7() {
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
    @Override // org.dom4j.Document
    /* JADX INFO: renamed from: i3 */
    public void mo23557i3(Element element) {
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
    @Override // org.dom4j.Document
    /* JADX INFO: renamed from: r0 */
    public Document mo23560r0(String str, Map map) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Document
    /* JADX INFO: renamed from: r7 */
    public void mo23561r7(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractNode, org.dom4j.Node
    /* JADX INFO: renamed from: t1 */
    public short mo23721t1() {
        return (short) 0;
    }

    @Override // org.dom4j.tree.AbstractNode, org.dom4j.Node
    /* JADX INFO: renamed from: t6 */
    public Node mo23740t6(Element element) {
        return this;
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

    @Override // org.dom4j.tree.AbstractNode, org.dom4j.Node
    /* JADX INFO: renamed from: w1 */
    public Document mo23741w1() {
        return this;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y8 */
    public void m24699y8(Element element) {
    }

    /* JADX INFO: renamed from: z8 */
    public abstract void mo24700z8(Element element);
}
