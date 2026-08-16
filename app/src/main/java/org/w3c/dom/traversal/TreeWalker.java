package org.w3c.dom.traversal;

import org.w3c.dom.DOMException;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes.dex */
public interface TreeWalker {
    /* JADX INFO: renamed from: a */
    int m26483a();

    /* JADX INFO: renamed from: b */
    Node m26484b();

    /* JADX INFO: renamed from: c */
    Node m26485c();

    /* JADX INFO: renamed from: d */
    boolean m26486d();

    /* JADX INFO: renamed from: e */
    Node m26487e();

    /* JADX INFO: renamed from: f */
    Node m26488f();

    /* JADX INFO: renamed from: g */
    Node m26489g();

    NodeFilter getFilter();

    Node getRoot();

    /* JADX INFO: renamed from: h */
    Node m26490h();

    /* JADX INFO: renamed from: i */
    void m26491i(Node node) throws DOMException;

    /* JADX INFO: renamed from: j */
    Node m26492j();

    /* JADX INFO: renamed from: k */
    Node m26493k();
}
