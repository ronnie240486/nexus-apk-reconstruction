package org.w3c.dom.traversal;

import org.w3c.dom.DOMException;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes.dex */
public interface DocumentTraversal {
    /* JADX INFO: renamed from: a */
    NodeIterator m26475a(Node node, int i, NodeFilter nodeFilter, boolean z) throws DOMException;

    /* JADX INFO: renamed from: b */
    TreeWalker m26476b(Node node, int i, NodeFilter nodeFilter, boolean z) throws DOMException;
}
