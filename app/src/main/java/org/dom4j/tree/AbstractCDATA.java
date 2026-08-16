package org.dom4j.tree;

import java.io.IOException;
import java.io.Writer;
import org.dom4j.CDATA;
import org.dom4j.Visitor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractCDATA extends AbstractCharacterData implements CDATA {
    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: K6 */
    public java.lang.String mo23713K6() {
        /*
            r1 = this;
            r0 = 0
            return r0
        L8:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.tree.AbstractCDATA.mo23713K6():java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: b3 */
    public void mo23715b3(Visitor visitor) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.tree.AbstractNode, org.dom4j.Node
    /* JADX INFO: renamed from: f7 */
    public void mo23735f7(Writer writer) throws IOException {
    }

    @Override // org.dom4j.tree.AbstractNode, org.dom4j.Node
    /* JADX INFO: renamed from: t1 */
    public short mo23721t1() {
        return (short) 4;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
