package org.w3c.dom;

/* JADX INFO: loaded from: classes.dex */
public interface Document extends Node {
    /* JADX INFO: renamed from: F3 */
    Element mo23925F3();

    /* JADX INFO: renamed from: I1 */
    DocumentType mo23926I1();

    /* JADX INFO: renamed from: N3 */
    Comment mo23927N3(String str);

    /* JADX INFO: renamed from: Q7 */
    DocumentFragment mo23928Q7();

    /* JADX INFO: renamed from: R4 */
    Attr mo23929R4(String str, String str2) throws DOMException;

    /* JADX INFO: renamed from: U2 */
    CDATASection mo23930U2(String str) throws DOMException;

    /* JADX INFO: renamed from: U5 */
    Node mo23931U5(Node node, boolean z) throws DOMException;

    /* JADX INFO: renamed from: V4 */
    ProcessingInstruction mo23932V4(String str, String str2) throws DOMException;

    /* JADX INFO: renamed from: d6 */
    Element mo23933d6(String str) throws DOMException;

    /* JADX INFO: renamed from: f1 */
    Element mo23934f1(String str);

    /* JADX INFO: renamed from: i1 */
    NodeList mo23935i1(String str, String str2);

    /* JADX INFO: renamed from: m4 */
    EntityReference mo23936m4(String str) throws DOMException;

    /* JADX INFO: renamed from: r2 */
    Element mo23937r2(String str, String str2) throws DOMException;

    /* JADX INFO: renamed from: s2 */
    Text mo23938s2(String str);

    /* JADX INFO: renamed from: t0 */
    NodeList mo23939t0(String str);

    /* JADX INFO: renamed from: u2 */
    DOMImplementation mo23940u2();

    /* JADX INFO: renamed from: u7 */
    Attr mo23941u7(String str) throws DOMException;
}
