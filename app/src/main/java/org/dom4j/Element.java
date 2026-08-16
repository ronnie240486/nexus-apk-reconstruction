package org.dom4j;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface Element extends Branch {
    /* JADX INFO: renamed from: A0 */
    Namespace mo23636A0();

    /* JADX INFO: renamed from: A6 */
    Iterator mo23637A6();

    /* JADX INFO: renamed from: C6 */
    void mo23638C6(List list);

    /* JADX INFO: renamed from: D1 */
    Element mo23639D1(QName qName);

    /* JADX INFO: renamed from: D5 */
    void mo23640D5(CDATA cdata);

    /* JADX INFO: renamed from: F4 */
    String mo23641F4(QName qName, String str);

    /* JADX INFO: renamed from: F5 */
    Element mo23642F5(String str);

    /* JADX INFO: renamed from: G6 */
    String mo23643G6(QName qName);

    /* JADX INFO: renamed from: G7 */
    Element mo23644G7(String str);

    /* JADX INFO: renamed from: H6 */
    Iterator mo23645H6(String str);

    /* JADX INFO: renamed from: H7 */
    void mo23646H7(Element element);

    /* JADX INFO: renamed from: I3 */
    void mo23647I3(QName qName, String str);

    /* JADX INFO: renamed from: I4 */
    void mo23648I4(String str, String str2);

    /* JADX INFO: renamed from: I5 */
    Element mo23649I5(String str, String str2);

    /* JADX INFO: renamed from: I6 */
    String m23650I6();

    /* JADX INFO: renamed from: J0 */
    String mo23651J0();

    /* JADX INFO: renamed from: J4 */
    Node mo23652J4(int i);

    /* JADX INFO: renamed from: L0 */
    void mo23653L0(Object obj);

    /* JADX INFO: renamed from: L4 */
    void mo23654L4(Namespace namespace);

    /* JADX INFO: renamed from: L6 */
    Attribute mo23655L6(QName qName);

    /* JADX INFO: renamed from: N6 */
    String mo23656N6(String str, String str2);

    /* JADX INFO: renamed from: O2 */
    Element mo23657O2(String str);

    /* JADX INFO: renamed from: P0 */
    Element mo23658P0(String str, String str2);

    /* JADX INFO: renamed from: P4 */
    List mo23659P4(String str);

    /* JADX INFO: renamed from: P6 */
    Element mo23660P6(String str, String str2);

    /* JADX INFO: renamed from: Q2 */
    List mo23661Q2();

    /* JADX INFO: renamed from: Q3 */
    Element mo23662Q3(QName qName);

    /* JADX INFO: renamed from: Q6 */
    boolean mo23663Q6();

    /* JADX INFO: renamed from: S */
    String mo23664S();

    /* JADX INFO: renamed from: S5 */
    Namespace mo23665S5(String str);

    /* JADX INFO: renamed from: V7 */
    boolean mo23666V7(CDATA cdata);

    /* JADX INFO: renamed from: W3 */
    void mo23667W3(Text text);

    /* JADX INFO: renamed from: W6 */
    Element mo23668W6();

    /* JADX INFO: renamed from: W7 */
    Element mo23669W7(String str, String str2);

    /* JADX INFO: renamed from: X3 */
    Iterator mo23670X3();

    /* JADX INFO: renamed from: X5 */
    String mo23671X5(QName qName);

    /* JADX INFO: renamed from: Z0 */
    Element mo23672Z0(String str);

    /* JADX INFO: renamed from: Z1 */
    String mo23673Z1(String str);

    /* JADX INFO: renamed from: Z5 */
    boolean mo23674Z5(Namespace namespace);

    /* JADX INFO: renamed from: a4 */
    List mo23675a4(String str);

    /* JADX INFO: renamed from: a8 */
    Attribute mo23676a8(String str);

    /* JADX INFO: renamed from: b0 */
    String mo23519b0();

    /* JADX INFO: renamed from: b4 */
    boolean mo23677b4(Entity entity);

    /* JADX INFO: renamed from: b8 */
    boolean mo23678b8(Attribute attribute);

    /* JADX INFO: renamed from: c3 */
    Element mo23679c3(String str);

    /* JADX INFO: renamed from: c7 */
    int mo23680c7();

    /* JADX INFO: renamed from: f2 */
    String mo23681f2(String str);

    @Override // org.dom4j.Node
    /* JADX INFO: renamed from: g0 */
    String mo23682g0();

    /* JADX INFO: renamed from: g6 */
    String mo23683g6(String str);

    @Override // org.dom4j.Node
    String getText();

    /* JADX INFO: renamed from: i2 */
    void mo23684i2(Attribute attribute);

    /* JADX INFO: renamed from: j6 */
    Attribute mo23685j6(int i);

    /* JADX INFO: renamed from: k5 */
    void mo23686k5(QName qName);

    /* JADX INFO: renamed from: l4 */
    String mo23687l4(QName qName);

    /* JADX INFO: renamed from: m5 */
    Namespace mo23688m5(String str);

    /* JADX INFO: renamed from: m7 */
    Element mo23689m7(QName qName, String str);

    /* JADX INFO: renamed from: n4 */
    List mo23690n4();

    /* JADX INFO: renamed from: o1 */
    QName mo23691o1();

    /* JADX INFO: renamed from: o5 */
    void mo23692o5(Entity entity);

    /* JADX INFO: renamed from: p3 */
    QName mo23693p3(String str);

    /* JADX INFO: renamed from: p6 */
    boolean mo23694p6();

    /* JADX INFO: renamed from: p7 */
    boolean mo23695p7();

    /* JADX INFO: renamed from: r0 */
    Element mo23696r0(String str, Map map);

    /* JADX INFO: renamed from: r3 */
    boolean mo23697r3(Text text);

    /* JADX INFO: renamed from: t2 */
    List mo23698t2();

    /* JADX INFO: renamed from: t7 */
    Iterator mo23699t7(QName qName);

    /* JADX INFO: renamed from: v4 */
    List mo23700v4();

    /* JADX INFO: renamed from: w */
    Object mo23701w();

    /* JADX INFO: renamed from: z1 */
    List mo23702z1(QName qName);
}
