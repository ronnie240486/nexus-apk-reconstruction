package org.dom4j.dom;

import java.util.List;
import org.dom4j.Branch;
import org.dom4j.CharacterData;
import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

/* JADX INFO: loaded from: classes2.dex */
public class DOMNodeHelper {

    /* JADX INFO: renamed from: a */
    public static final NodeList f16533a = new EmptyNodeList();

    /* JADX INFO: renamed from: org.dom4j.dom.DOMNodeHelper$1 */
    class C50581 implements NodeList {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f16534a;

        /* JADX WARN: Invalid debug info offset */
        public C50581(List list) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.w3c.dom.NodeList
        /* JADX INFO: renamed from: a */
        public Node mo24024a(int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.w3c.dom.NodeList
        public int getLength() {
            return 0;
        }
    }

    public static class EmptyNodeList implements NodeList {
        @Override // org.w3c.dom.NodeList
        /* JADX INFO: renamed from: a */
        public Node mo24024a(int i) {
            return null;
        }

        @Override // org.w3c.dom.NodeList
        public int getLength() {
            return 0;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public static Node m23982A(org.dom4j.Node node) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public static boolean m23983B(org.dom4j.Node node) {
        return false;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m23984C(org.dom4j.Node node) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: D */
    public static Node m23985D(org.dom4j.Node node, Node node2, Node node3) throws DOMException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public static void m23986E(CharacterData characterData, int i, String str) throws DOMException {
    }

    /* JADX INFO: renamed from: F */
    public static boolean m23987F(org.dom4j.Node node, String str, String str2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public static void m23988G(org.dom4j.Node node) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public static void m23989H() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public static Node m23990I(org.dom4j.Node node, Node node2) throws DOMException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public static Node m23991J(org.dom4j.Node node, Node node2, Node node3) throws DOMException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public static void m23992K(CharacterData characterData, int i, int i2, String str) throws DOMException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L */
    public static void m23993L(CharacterData characterData, String str) throws DOMException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public static void m23994M(org.dom4j.Node node, String str) throws DOMException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N */
    public static void m23995N(org.dom4j.Node node, String str) throws DOMException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O */
    public static String m23996O(CharacterData characterData, int i, int i2) throws DOMException {
        return null;
    }

    /* JADX INFO: renamed from: P */
    public static boolean m23997P(org.dom4j.Node node, String str, String str2) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static Node m23998a(org.dom4j.Node node, Node node2) throws DOMException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static void m23999b(CharacterData characterData, String str) throws DOMException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static void m24000c(List list, Branch branch, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static void m24001d(List list, Branch branch, String str, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static Attr m24002e(org.dom4j.Node node) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static Document m24003f(org.dom4j.Document document) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static DocumentType m24004g(org.dom4j.DocumentType documentType) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static Element m24005h(org.dom4j.Node node) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static Node m24006i(org.dom4j.Node node) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static Text m24007j(CharacterData characterData) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static Node m24008k(org.dom4j.Node node, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static NodeList m24009l(List list) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public static void m24010m(CharacterData characterData, int i, int i2) throws DOMException {
    }

    /* JADX INFO: renamed from: n */
    public static NamedNodeMap m24011n(org.dom4j.Node node) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public static NodeList m24012o(org.dom4j.Node node) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public static String m24013p(CharacterData characterData) throws DOMException {
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static Node m24014q(org.dom4j.Node node) {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static Node m24015r(org.dom4j.Node node) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public static int m24016s(CharacterData characterData) {
        return 0;
    }

    /* JADX INFO: renamed from: t */
    public static String m24017t(org.dom4j.Node node) {
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static String m24018u(org.dom4j.Node node) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public static Node m24019v(org.dom4j.Node node) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public static String m24020w(org.dom4j.Node node) throws DOMException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public static Document m24021x(org.dom4j.Node node) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public static Node m24022y(org.dom4j.Node node) {
        return null;
    }

    /* JADX INFO: renamed from: z */
    public static String m24023z(org.dom4j.Node node) {
        return null;
    }
}
