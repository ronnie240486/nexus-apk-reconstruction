package org.dom4j.p020io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import org.dom4j.DocumentException;
import org.dom4j.Entity;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes2.dex */
public class HTMLWriter extends XMLWriter {

    /* JADX INFO: renamed from: H */
    public static String f16569H = System.getProperty("line.separator");

    /* JADX INFO: renamed from: I */
    public static final HashSet f16570I;

    /* JADX INFO: renamed from: J */
    public static final OutputFormat f16571J;

    /* JADX INFO: renamed from: B */
    public Stack f16572B;

    /* JADX INFO: renamed from: C */
    public String f16573C;

    /* JADX INFO: renamed from: D */
    public int f16574D;

    /* JADX INFO: renamed from: E */
    public int f16575E;

    /* JADX INFO: renamed from: F */
    public HashSet f16576F;

    /* JADX INFO: renamed from: G */
    public HashSet f16577G;

    public class FormatState {

        /* JADX INFO: renamed from: a */
        public boolean f16578a;

        /* JADX INFO: renamed from: b */
        public boolean f16579b;

        /* JADX INFO: renamed from: c */
        public String f16580c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ HTMLWriter f16581d;

        /* JADX WARN: Invalid debug info offset */
        public FormatState(HTMLWriter hTMLWriter, boolean z, boolean z2, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public String m24133a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public boolean m24134b() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public boolean m24135c() {
            return false;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        f16570I = hashSet;
        hashSet.add("PRE");
        hashSet.add("SCRIPT");
        hashSet.add("STYLE");
        hashSet.add("TEXTAREA");
        OutputFormat outputFormat = new OutputFormat(OutputFormat.f16582n, true);
        f16571J = outputFormat;
        outputFormat.m24147H(true);
        outputFormat.m24146G(true);
    }

    /* JADX WARN: Invalid debug info offset */
    public HTMLWriter() throws UnsupportedEncodingException {
    }

    /* JADX WARN: Invalid debug info offset */
    public HTMLWriter(OutputStream outputStream) throws UnsupportedEncodingException {
    }

    /* JADX WARN: Invalid debug info offset */
    public HTMLWriter(OutputStream outputStream, OutputFormat outputFormat) throws UnsupportedEncodingException {
    }

    /* JADX WARN: Invalid debug info offset */
    public HTMLWriter(Writer writer) {
    }

    /* JADX WARN: Invalid debug info offset */
    public HTMLWriter(Writer writer, OutputFormat outputFormat) {
    }

    /* JADX WARN: Invalid debug info offset */
    public HTMLWriter(OutputFormat outputFormat) throws UnsupportedEncodingException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public static String m24111W0(String str) throws DocumentException, IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X0 */
    public static String m24112X0(String str, boolean z, boolean z2, boolean z3, boolean z4) throws DocumentException, IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y0 */
    public static String m24113Y0(String str) throws DocumentException, IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.p020io.XMLWriter
    /* JADX INFO: renamed from: B0 */
    public void mo24114B0(String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.p020io.XMLWriter
    /* JADX INFO: renamed from: C0 */
    public void mo24115C0(Entity entity) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.p020io.XMLWriter
    /* JADX INFO: renamed from: N0 */
    public void mo24116N0(String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O0 */
    public Set m24117O0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public Set m24118P0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public final HashSet m24119Q0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public boolean m24120R0(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public final String m24121S0(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public final void m24122T0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public void m24123U0(Set set) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public boolean m24124V0(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    public void m24125Z0(Set set) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public void m24126a1(Set set) {
    }

    @Override // org.dom4j.p020io.XMLWriter, org.xml.sax.ext.LexicalHandler
    /* JADX INFO: renamed from: j */
    public void mo24127j() throws SAXException {
    }

    @Override // org.dom4j.p020io.XMLWriter, org.xml.sax.ext.LexicalHandler
    /* JADX INFO: renamed from: p */
    public void mo24128p() throws SAXException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.p020io.XMLWriter
    /* JADX INFO: renamed from: s0 */
    public void mo24129s0(String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.p020io.XMLWriter
    /* JADX INFO: renamed from: t0 */
    public void mo24130t0(String str) throws IOException {
    }

    @Override // org.dom4j.p020io.XMLWriter
    /* JADX INFO: renamed from: w0 */
    public void mo24131w0() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0049
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.dom4j.p020io.XMLWriter
    /* JADX INFO: renamed from: z0 */
    public void mo24132z0(org.dom4j.Element r8) throws java.io.IOException {
        /*
            r7 = this;
            return
        L68:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.dom4j.p020io.HTMLWriter.mo24132z0(org.dom4j.Element):void");
    }
}
