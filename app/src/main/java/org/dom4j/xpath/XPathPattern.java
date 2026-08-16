package org.dom4j.xpath;

import org.dom4j.Node;
import org.dom4j.XPathException;
import org.dom4j.rule.Pattern;
import org.jaxen.Context;
import org.jaxen.ContextSupport;
import org.jaxen.JaxenException;
import org.jaxen.VariableContext;

/* JADX INFO: loaded from: classes2.dex */
public class XPathPattern implements Pattern {

    /* JADX INFO: renamed from: a */
    public String f16946a;

    /* JADX INFO: renamed from: b */
    public org.jaxen.pattern.Pattern f16947b;

    /* JADX INFO: renamed from: c */
    public Context f16948c;

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0010
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public XPathPattern(java.lang.String r3) {
        /*
            r2 = this;
            return
        L17:
        L19:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.xpath.XPathPattern.<init>(java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    public XPathPattern(org.jaxen.pattern.Pattern pattern) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.rule.Pattern, org.dom4j.NodeFilter
    /* JADX INFO: renamed from: a */
    public boolean mo23744a(Node node) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.rule.Pattern
    /* JADX INFO: renamed from: b */
    public double mo24561b() {
        return 0.0d;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.rule.Pattern
    /* JADX INFO: renamed from: d */
    public Pattern[] mo24562d() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.rule.Pattern
    /* JADX INFO: renamed from: e */
    public String mo24563e() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getText() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public void m24866i(VariableContext variableContext) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.rule.Pattern
    /* JADX INFO: renamed from: p */
    public short mo24564p() {
        return (short) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public ContextSupport m24867w() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public void m24868x(JaxenException jaxenException) throws XPathException {
    }
}
