package org.dom4j;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import org.dom4j.tree.QNameCache;
import org.dom4j.util.SimpleSingleton;
import org.dom4j.util.SingletonStrategy;

/* JADX INFO: loaded from: classes2.dex */
public class QName implements Serializable {

    /* JADX INFO: renamed from: f */
    public static SingletonStrategy f16464f;

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Class f16465g;

    /* JADX INFO: renamed from: a */
    public String f16466a;

    /* JADX INFO: renamed from: b */
    public String f16467b;

    /* JADX INFO: renamed from: c */
    public transient Namespace f16468c;

    /* JADX INFO: renamed from: d */
    public int f16469d;

    /* JADX INFO: renamed from: e */
    public DocumentFactory f16470e;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    static {
        Class cls;
        try {
            cls = Class.forName(System.getProperty("org.dom4j.QName.singleton.strategy", "org.dom4j.util.SimpleSingleton"));
        } catch (Exception unused) {
            cls = SimpleSingleton.class;
        }
        try {
            SingletonStrategy singletonStrategy = (SingletonStrategy) cls.newInstance();
            f16464f = singletonStrategy;
            Class clsM23752a = f16465g;
            if (clsM23752a == null) {
                clsM23752a = m23752a("org.dom4j.tree.QNameCache");
                f16465g = clsM23752a;
            }
            singletonStrategy.mo24820a(clsM23752a.getName());
        } catch (Exception unused2) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public QName(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public QName(String str, Namespace namespace) {
    }

    /* JADX WARN: Invalid debug info offset */
    public QName(String str, Namespace namespace, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Class m23752a(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static QName m23753b(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static QName m23754c(String str, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static QName m23755d(String str, String str2, String str3) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static QName m23756e(String str, Namespace namespace) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static QName m23757f(String str, Namespace namespace, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static QNameCache m23758g() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getName() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public DocumentFactory m23759h() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public Namespace m23760i() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public String m23761j() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public String m23762k() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public String m23763l() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public final void m23764m(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public void m23765n(DocumentFactory documentFactory) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public final void m23766o(ObjectOutputStream objectOutputStream) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
