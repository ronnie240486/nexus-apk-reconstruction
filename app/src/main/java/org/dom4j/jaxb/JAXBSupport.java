package org.dom4j.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.dom4j.Element;

/* JADX INFO: loaded from: classes2.dex */
abstract class JAXBSupport {

    /* JADX INFO: renamed from: a */
    public String f16755a;

    /* JADX INFO: renamed from: b */
    public ClassLoader f16756b;

    /* JADX INFO: renamed from: c */
    public JAXBContext f16757c;

    /* JADX INFO: renamed from: d */
    public Marshaller f16758d;

    /* JADX INFO: renamed from: e */
    public Unmarshaller f16759e;

    /* JADX WARN: Invalid debug info offset */
    public JAXBSupport(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JAXBSupport(String str, ClassLoader classLoader) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final JAXBContext m24533a() throws JAXBException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final Marshaller m24534b() throws JAXBException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public final Unmarshaller m24535c() throws JAXBException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public Element m24536d(javax.xml.bind.Element element) throws JAXBException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public javax.xml.bind.Element m24537e(Element element) throws JAXBException {
        return null;
    }
}
