package org.w3c.dom.html;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes.dex */
public interface HTMLDocument extends Document {
    /* JADX INFO: renamed from: B1 */
    HTMLCollection m26025B1();

    /* JADX INFO: renamed from: B5 */
    HTMLElement m26026B5();

    /* JADX INFO: renamed from: D7 */
    void m26027D7(String str);

    /* JADX INFO: renamed from: E1 */
    void m26028E1(String str);

    /* JADX INFO: renamed from: E3 */
    void m26029E3(HTMLElement hTMLElement);

    /* JADX INFO: renamed from: F7 */
    HTMLCollection m26030F7();

    /* JADX INFO: renamed from: G0 */
    void m26031G0(String str);

    /* JADX INFO: renamed from: H2 */
    HTMLCollection m26032H2();

    /* JADX INFO: renamed from: I7 */
    HTMLCollection m26033I7();

    /* JADX INFO: renamed from: J5 */
    NodeList m26034J5(String str);

    /* JADX INFO: renamed from: a7 */
    HTMLCollection m26035a7();

    void close();

    /* JADX INFO: renamed from: d3 */
    String m26036d3();

    @Override // org.w3c.dom.Document
    /* JADX INFO: renamed from: f1 */
    Element mo23934f1(String str);

    /* JADX INFO: renamed from: f6 */
    String m26037f6();

    String getTitle();

    void open();

    /* JADX INFO: renamed from: s6 */
    String m26038s6();

    /* JADX INFO: renamed from: u5 */
    void m26039u5(String str);

    /* JADX INFO: renamed from: z5 */
    String m26040z5();
}
