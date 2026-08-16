package org.w3c.dom.css;

import org.w3c.dom.DOMException;

/* JADX INFO: loaded from: classes.dex */
public interface CSSStyleDeclaration {
    /* JADX INFO: renamed from: a */
    String m25859a(int i);

    /* JADX INFO: renamed from: b */
    String m25860b(String str) throws DOMException;

    /* JADX INFO: renamed from: c */
    String m25861c();

    /* JADX INFO: renamed from: d */
    void m25862d(String str) throws DOMException;

    /* JADX INFO: renamed from: e */
    String m25863e(String str);

    /* JADX INFO: renamed from: f */
    String m25864f(String str);

    /* JADX INFO: renamed from: g */
    void m25865g(String str, String str2, String str3) throws DOMException;

    int getLength();

    /* JADX INFO: renamed from: h */
    CSSValue m25866h(String str);

    /* JADX INFO: renamed from: i */
    CSSRule m25867i();
}
