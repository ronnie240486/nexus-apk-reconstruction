package org.dom4j;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface Node extends Cloneable {

    /* JADX INFO: renamed from: g0 */
    public static final short f16451g0 = 0;

    /* JADX INFO: renamed from: h0 */
    public static final short f16452h0 = 1;

    /* JADX INFO: renamed from: i0 */
    public static final short f16453i0 = 2;

    /* JADX INFO: renamed from: j0 */
    public static final short f16454j0 = 3;

    /* JADX INFO: renamed from: k0 */
    public static final short f16455k0 = 4;

    /* JADX INFO: renamed from: l0 */
    public static final short f16456l0 = 5;

    /* JADX INFO: renamed from: m0 */
    public static final short f16457m0 = 7;

    /* JADX INFO: renamed from: n0 */
    public static final short f16458n0 = 8;

    /* JADX INFO: renamed from: o0 */
    public static final short f16459o0 = 9;

    /* JADX INFO: renamed from: p0 */
    public static final short f16460p0 = 10;

    /* JADX INFO: renamed from: q0 */
    public static final short f16461q0 = 13;

    /* JADX INFO: renamed from: r0 */
    public static final short f16462r0 = 14;

    /* JADX INFO: renamed from: s0 */
    public static final short f16463s0 = 14;

    /* JADX INFO: renamed from: A5 */
    List mo23722A5(String str, String str2);

    /* JADX INFO: renamed from: B7 */
    List mo23723B7(String str);

    /* JADX INFO: renamed from: E2 */
    boolean mo23724E2();

    /* JADX INFO: renamed from: K6 */
    String mo23713K6();

    /* JADX INFO: renamed from: K7 */
    String mo23714K7(Element element);

    /* JADX INFO: renamed from: L5 */
    boolean mo23725L5();

    /* JADX INFO: renamed from: M7 */
    String mo23726M7(String str);

    /* JADX INFO: renamed from: O6 */
    Node mo23727O6(String str);

    /* JADX INFO: renamed from: P */
    void mo23728P(String str);

    /* JADX INFO: renamed from: P2 */
    void mo23729P2(Document document);

    /* JADX INFO: renamed from: R */
    Node mo23730R();

    /* JADX INFO: renamed from: S6 */
    Object mo23731S6(String str);

    /* JADX INFO: renamed from: T3 */
    String mo23732T3();

    /* JADX INFO: renamed from: V1 */
    List mo23733V1(String str, String str2, boolean z);

    /* JADX INFO: renamed from: b3 */
    void mo23715b3(Visitor visitor);

    /* JADX INFO: renamed from: b7 */
    XPath mo23734b7(String str) throws InvalidXPathException;

    Object clone();

    /* JADX INFO: renamed from: f7 */
    void mo23735f7(Writer writer) throws IOException;

    /* JADX INFO: renamed from: g0 */
    String mo23682g0();

    /* JADX INFO: renamed from: g1 */
    String mo23736g1();

    String getName();

    Element getParent();

    String getText();

    /* JADX INFO: renamed from: l6 */
    String mo23719l6(Element element);

    /* JADX INFO: renamed from: m1 */
    boolean mo23737m1(String str);

    /* JADX INFO: renamed from: p5 */
    String mo23738p5();

    void setName(String str);

    /* JADX INFO: renamed from: t1 */
    short mo23721t1();

    /* JADX INFO: renamed from: t4 */
    void mo23739t4(Element element);

    /* JADX INFO: renamed from: t6 */
    Node mo23740t6(Element element);

    /* JADX INFO: renamed from: w1 */
    Document mo23741w1();

    /* JADX INFO: renamed from: x4 */
    boolean mo23742x4();

    /* JADX INFO: renamed from: y4 */
    Number mo23743y4(String str);
}
