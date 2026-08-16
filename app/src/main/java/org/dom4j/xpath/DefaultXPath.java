package org.dom4j.xpath;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import org.dom4j.InvalidXPathException;
import org.dom4j.Node;
import org.dom4j.NodeFilter;
import org.dom4j.XPath;
import org.dom4j.XPathException;
import org.jaxen.FunctionContext;
import org.jaxen.JaxenException;
import org.jaxen.NamespaceContext;
import org.jaxen.VariableContext;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultXPath implements XPath, NodeFilter, Serializable {

    /* JADX INFO: renamed from: a */
    public String f16941a;

    /* JADX INFO: renamed from: b */
    public org.jaxen.XPath f16942b;

    /* JADX INFO: renamed from: c */
    public NamespaceContext f16943c;

    /* JADX INFO: renamed from: org.dom4j.xpath.DefaultXPath$1 */
    class C50641 implements Comparator {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Map f16944a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ DefaultXPath f16945b;

        /* JADX WARN: Invalid debug info offset */
        public C50641(DefaultXPath defaultXPath, Map map) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return 0;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public DefaultXPath(String str) throws InvalidXPathException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x0008
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    /* JADX INFO: renamed from: y */
    public static org.jaxen.XPath m24860y(java.lang.String r2) {
        /*
            r0 = 0
            return r0
        L6:
        L8:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.xpath.DefaultXPath.m24860y(java.lang.String):org.jaxen.XPath");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public void m24861A(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public void m24862B(List list, Map map) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.XPath, org.dom4j.NodeFilter
    /* JADX INFO: renamed from: a */
    public boolean mo23744a(Node node) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.XPath
    /* JADX INFO: renamed from: c */
    public FunctionContext mo23777c() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.XPath
    public Object evaluate(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.XPath
    /* JADX INFO: renamed from: f */
    public Number mo23778f(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.XPath
    /* JADX INFO: renamed from: g */
    public List mo23779g(Object obj, XPath xPath) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.XPath
    public String getText() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.XPath
    /* JADX INFO: renamed from: h */
    public List mo23780h(Object obj, XPath xPath, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.XPath
    /* JADX INFO: renamed from: i */
    public void mo23781i(VariableContext variableContext) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.XPath
    /* JADX INFO: renamed from: j */
    public List mo23782j(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.dom4j.XPath
    /* JADX INFO: renamed from: k */
    public org.dom4j.Node mo23783k(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 0
            return r0
        L13:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.xpath.DefaultXPath.mo23783k(java.lang.Object):org.dom4j.Node");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.XPath
    /* JADX INFO: renamed from: l */
    public String mo23784l(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.XPath
    /* JADX INFO: renamed from: m */
    public Object mo23785m(Object obj) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.XPath
    /* JADX INFO: renamed from: n */
    public void mo23786n(Map map) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.XPath
    /* JADX INFO: renamed from: o */
    public void mo23787o(List list, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.XPath
    /* JADX INFO: renamed from: q */
    public void mo23788q(FunctionContext functionContext) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.XPath
    /* JADX INFO: renamed from: r */
    public void mo23789r(NamespaceContext namespaceContext) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.XPath
    /* JADX INFO: renamed from: s */
    public VariableContext mo23790s() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.XPath
    /* JADX INFO: renamed from: t */
    public boolean mo23791t(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.XPath
    /* JADX INFO: renamed from: u */
    public NamespaceContext mo23792u() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.XPath
    /* JADX INFO: renamed from: v */
    public void mo23793v(List list) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public Object m24863w(Node node) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public void m24864x(JaxenException jaxenException) throws XPathException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public void m24865z(List list, Map map) {
    }
}
