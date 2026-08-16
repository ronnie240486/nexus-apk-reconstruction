package org.w3c.dom.traversal;

import org.w3c.dom.DOMException;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes.dex */
public interface NodeIterator {
    /* JADX INFO: renamed from: R */
    void m26478R();

    /* JADX INFO: renamed from: a */
    int m26479a();

    /* JADX INFO: renamed from: b */
    Node m26480b() throws DOMException;

    /* JADX INFO: renamed from: c */
    Node m26481c() throws DOMException;

    /* JADX INFO: renamed from: d */
    boolean m26482d();

    NodeFilter getFilter();

    Node getRoot();
}
