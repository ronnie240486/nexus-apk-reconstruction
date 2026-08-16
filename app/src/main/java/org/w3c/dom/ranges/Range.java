package org.w3c.dom.ranges;

import org.w3c.dom.DOMException;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes.dex */
public interface Range {

    /* JADX INFO: renamed from: a */
    public static final short f17815a = 0;

    /* JADX INFO: renamed from: b */
    public static final short f17816b = 1;

    /* JADX INFO: renamed from: c */
    public static final short f17817c = 2;

    /* JADX INFO: renamed from: d */
    public static final short f17818d = 3;

    /* JADX INFO: renamed from: R */
    void m26437R() throws DOMException;

    /* JADX INFO: renamed from: a */
    void m26438a(Node node) throws RangeException, DOMException;

    /* JADX INFO: renamed from: b */
    DocumentFragment m26439b() throws DOMException;

    /* JADX INFO: renamed from: c */
    int m26440c() throws DOMException;

    /* JADX INFO: renamed from: d */
    void m26441d(Node node) throws RangeException, DOMException;

    /* JADX INFO: renamed from: e */
    void m26442e(Node node) throws RangeException, DOMException;

    /* JADX INFO: renamed from: f */
    DocumentFragment m26443f() throws DOMException;

    /* JADX INFO: renamed from: g */
    Range m26444g() throws DOMException;

    /* JADX INFO: renamed from: h */
    Node m26445h() throws DOMException;

    /* JADX INFO: renamed from: i */
    void m26446i() throws DOMException;

    /* JADX INFO: renamed from: j */
    void m26447j(Node node, int i) throws RangeException, DOMException;

    /* JADX INFO: renamed from: k */
    int m26448k() throws DOMException;

    /* JADX INFO: renamed from: l */
    void m26449l(boolean z) throws DOMException;

    /* JADX INFO: renamed from: m */
    void m26450m(Node node) throws RangeException, DOMException;

    /* JADX INFO: renamed from: n */
    boolean m26451n() throws DOMException;

    /* JADX INFO: renamed from: o */
    short m26452o(short s2, Range range) throws DOMException;

    /* JADX INFO: renamed from: p */
    Node m26453p() throws DOMException;

    /* JADX INFO: renamed from: q */
    void m26454q(Node node) throws RangeException, DOMException;

    /* JADX INFO: renamed from: r */
    void m26455r(Node node) throws RangeException, DOMException;

    /* JADX INFO: renamed from: s */
    void m26456s(Node node) throws RangeException, DOMException;

    /* JADX INFO: renamed from: t */
    void m26457t(Node node, int i) throws RangeException, DOMException;

    String toString() throws DOMException;

    /* JADX INFO: renamed from: u */
    Node m26458u() throws DOMException;

    /* JADX INFO: renamed from: v */
    void m26459v(Node node) throws RangeException, DOMException;
}
