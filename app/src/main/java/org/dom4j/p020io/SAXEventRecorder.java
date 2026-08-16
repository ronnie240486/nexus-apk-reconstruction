package org.dom4j.p020io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.List;
import java.util.Map;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.SAXException;
import org.xml.sax.ext.DeclHandler;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: loaded from: classes2.dex */
public class SAXEventRecorder extends DefaultHandler implements LexicalHandler, DeclHandler, DTDHandler, Externalizable {

    /* JADX INFO: renamed from: e */
    public static final long f16626e = 1;

    /* JADX INFO: renamed from: f */
    public static final byte f16627f = 0;

    /* JADX INFO: renamed from: g */
    public static final byte f16628g = 1;

    /* JADX INFO: renamed from: h */
    public static final byte f16629h = 2;

    /* JADX INFO: renamed from: i */
    public static final String f16630i = "xmlns";

    /* JADX INFO: renamed from: j */
    public static final String f16631j = "";

    /* JADX INFO: renamed from: c */
    public List f16632c;

    /* JADX INFO: renamed from: d */
    public Map f16633d;

    public static class SAXEvent implements Externalizable {

        /* JADX INFO: renamed from: c */
        public static final long f16634c = 1;

        /* JADX INFO: renamed from: d */
        public static final byte f16635d = 1;

        /* JADX INFO: renamed from: e */
        public static final byte f16636e = 2;

        /* JADX INFO: renamed from: f */
        public static final byte f16637f = 3;

        /* JADX INFO: renamed from: g */
        public static final byte f16638g = 4;

        /* JADX INFO: renamed from: h */
        public static final byte f16639h = 5;

        /* JADX INFO: renamed from: i */
        public static final byte f16640i = 6;

        /* JADX INFO: renamed from: j */
        public static final byte f16641j = 7;

        /* JADX INFO: renamed from: k */
        public static final byte f16642k = 8;

        /* JADX INFO: renamed from: l */
        public static final byte f16643l = 9;

        /* JADX INFO: renamed from: m */
        public static final byte f16644m = 10;

        /* JADX INFO: renamed from: n */
        public static final byte f16645n = 11;

        /* JADX INFO: renamed from: o */
        public static final byte f16646o = 12;

        /* JADX INFO: renamed from: p */
        public static final byte f16647p = 13;

        /* JADX INFO: renamed from: q */
        public static final byte f16648q = 14;

        /* JADX INFO: renamed from: r */
        public static final byte f16649r = 15;

        /* JADX INFO: renamed from: s */
        public static final byte f16650s = 16;

        /* JADX INFO: renamed from: t */
        public static final byte f16651t = 17;

        /* JADX INFO: renamed from: u */
        public static final byte f16652u = 18;

        /* JADX INFO: renamed from: v */
        public static final byte f16653v = 19;

        /* JADX INFO: renamed from: a */
        public byte f16654a;

        /* JADX INFO: renamed from: b */
        public List f16655b;

        /* JADX WARN: Invalid debug info offset */
        public SAXEvent() {
        }

        /* JADX WARN: Invalid debug info offset */
        public SAXEvent(byte b) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public void m24208a(Object obj) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public Object m24209b(int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws ClassNotFoundException, IOException {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ext.DeclHandler
    /* JADX INFO: renamed from: a */
    public void mo24188a(String str, String str2, String str3, String str4, String str5) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ext.DeclHandler
    /* JADX INFO: renamed from: b */
    public void mo24189b(String str, String str2) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ext.DeclHandler
    /* JADX INFO: renamed from: c */
    public void mo24190c(String str, String str2, String str3) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ext.DeclHandler
    /* JADX INFO: renamed from: d */
    public void mo24191d(String str, String str2) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endPrefixMapping(String str) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public void m24207g(ContentHandler contentHandler) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ext.LexicalHandler
    /* JADX INFO: renamed from: j */
    public void mo24127j() throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ext.LexicalHandler
    /* JADX INFO: renamed from: k */
    public void mo24194k(char[] cArr, int i, int i2) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ext.LexicalHandler
    /* JADX INFO: renamed from: n */
    public void mo24197n() throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ext.LexicalHandler
    /* JADX INFO: renamed from: p */
    public void mo24128p() throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ext.LexicalHandler
    /* JADX INFO: renamed from: q */
    public void mo24199q(String str) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws ClassNotFoundException, IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startPrefixMapping(String str, String str2) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ext.LexicalHandler
    /* JADX INFO: renamed from: u */
    public void mo24201u(String str) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xml.sax.ext.LexicalHandler
    /* JADX INFO: renamed from: w */
    public void mo24203w(String str, String str2, String str3) throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
    }
}
