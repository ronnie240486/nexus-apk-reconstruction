package org.dom4j;

import java.util.List;
import java.util.Map;
import org.jaxen.FunctionContext;
import org.jaxen.NamespaceContext;
import org.jaxen.VariableContext;

/* JADX INFO: loaded from: classes2.dex */
public interface XPath extends NodeFilter {
    @Override // org.dom4j.NodeFilter
    /* JADX INFO: renamed from: a */
    boolean mo23744a(Node node);

    /* JADX INFO: renamed from: c */
    FunctionContext mo23777c();

    Object evaluate(Object obj);

    /* JADX INFO: renamed from: f */
    Number mo23778f(Object obj);

    /* JADX INFO: renamed from: g */
    List mo23779g(Object obj, XPath xPath);

    String getText();

    /* JADX INFO: renamed from: h */
    List mo23780h(Object obj, XPath xPath, boolean z);

    /* JADX INFO: renamed from: i */
    void mo23781i(VariableContext variableContext);

    /* JADX INFO: renamed from: j */
    List mo23782j(Object obj);

    /* JADX INFO: renamed from: k */
    Node mo23783k(Object obj);

    /* JADX INFO: renamed from: l */
    String mo23784l(Object obj);

    /* JADX INFO: renamed from: m */
    Object mo23785m(Object obj);

    /* JADX INFO: renamed from: n */
    void mo23786n(Map map);

    /* JADX INFO: renamed from: o */
    void mo23787o(List list, boolean z);

    /* JADX INFO: renamed from: q */
    void mo23788q(FunctionContext functionContext);

    /* JADX INFO: renamed from: r */
    void mo23789r(NamespaceContext namespaceContext);

    /* JADX INFO: renamed from: s */
    VariableContext mo23790s();

    /* JADX INFO: renamed from: t */
    boolean mo23791t(Object obj);

    /* JADX INFO: renamed from: u */
    NamespaceContext mo23792u();

    /* JADX INFO: renamed from: v */
    void mo23793v(List list);
}
