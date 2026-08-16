package com.tencent.smtt.utils;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.UnknownFormatConversionException;

/* JADX INFO: renamed from: com.tencent.smtt.utils.e */
/* JADX INFO: loaded from: classes2.dex */
public class C4158e implements Closeable {

    /* JADX INFO: renamed from: a */
    static final char[] f13247a = {127, 'E', 'L', 'F', 0};

    /* JADX INFO: renamed from: b */
    final char[] f13248b;

    /* JADX INFO: renamed from: c */
    boolean f13249c;

    /* JADX INFO: renamed from: d */
    j[] f13250d;

    /* JADX INFO: renamed from: e */
    l[] f13251e;

    /* JADX INFO: renamed from: f */
    byte[] f13252f;

    /* JADX INFO: renamed from: g */
    private final C4156c f13253g;

    /* JADX INFO: renamed from: h */
    private final a f13254h;

    /* JADX INFO: renamed from: i */
    private final k[] f13255i;

    /* JADX INFO: renamed from: j */
    private byte[] f13256j;

    /* JADX INFO: renamed from: com.tencent.smtt.utils.e$a */
    public static abstract class a {

        /* JADX INFO: renamed from: a */
        short f13257a;

        /* JADX INFO: renamed from: b */
        short f13258b;

        /* JADX INFO: renamed from: c */
        int f13259c;

        /* JADX INFO: renamed from: d */
        int f13260d;

        /* JADX INFO: renamed from: e */
        short f13261e;

        /* JADX INFO: renamed from: f */
        short f13262f;

        /* JADX INFO: renamed from: g */
        short f13263g;

        /* JADX INFO: renamed from: h */
        short f13264h;

        /* JADX INFO: renamed from: i */
        short f13265i;

        /* JADX INFO: renamed from: j */
        short f13266j;

        /* JADX INFO: renamed from: a */
        public abstract long mo19454a();

        /* JADX INFO: renamed from: b */
        public abstract long mo19455b();
    }

    /* JADX INFO: renamed from: com.tencent.smtt.utils.e$b */
    public static class b extends a {

        /* JADX INFO: renamed from: k */
        int f13267k;

        /* JADX INFO: renamed from: l */
        int f13268l;

        /* JADX INFO: renamed from: m */
        int f13269m;

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.utils.C4158e.a
        /* JADX INFO: renamed from: a */
        public long mo19454a() {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.utils.C4158e.a
        /* JADX INFO: renamed from: b */
        public long mo19455b() {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.utils.e$c */
    public static class c extends j {

        /* JADX INFO: renamed from: a */
        int f13270a;

        /* JADX INFO: renamed from: b */
        int f13271b;

        /* JADX INFO: renamed from: c */
        int f13272c;

        /* JADX INFO: renamed from: d */
        int f13273d;

        /* JADX INFO: renamed from: e */
        int f13274e;

        /* JADX INFO: renamed from: f */
        int f13275f;
    }

    /* JADX INFO: renamed from: com.tencent.smtt.utils.e$d */
    public static class d extends k {

        /* JADX INFO: renamed from: a */
        int f13276a;

        /* JADX INFO: renamed from: b */
        int f13277b;

        /* JADX INFO: renamed from: c */
        int f13278c;

        /* JADX INFO: renamed from: d */
        int f13279d;

        /* JADX INFO: renamed from: e */
        int f13280e;

        /* JADX INFO: renamed from: f */
        int f13281f;

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.utils.C4158e.k
        /* JADX INFO: renamed from: a */
        public int mo19456a() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.utils.C4158e.k
        /* JADX INFO: renamed from: b */
        public long mo19457b() {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.utils.e$e */
    public static class e extends l {

        /* JADX INFO: renamed from: a */
        int f13282a;

        /* JADX INFO: renamed from: b */
        int f13283b;
    }

    /* JADX INFO: renamed from: com.tencent.smtt.utils.e$f */
    public static class f extends a {

        /* JADX INFO: renamed from: k */
        long f13284k;

        /* JADX INFO: renamed from: l */
        long f13285l;

        /* JADX INFO: renamed from: m */
        long f13286m;

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.utils.C4158e.a
        /* JADX INFO: renamed from: a */
        public long mo19454a() {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.utils.C4158e.a
        /* JADX INFO: renamed from: b */
        public long mo19455b() {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.utils.e$g */
    public static class g extends j {

        /* JADX INFO: renamed from: a */
        long f13287a;

        /* JADX INFO: renamed from: b */
        long f13288b;

        /* JADX INFO: renamed from: c */
        long f13289c;

        /* JADX INFO: renamed from: d */
        long f13290d;

        /* JADX INFO: renamed from: e */
        long f13291e;

        /* JADX INFO: renamed from: f */
        long f13292f;
    }

    /* JADX INFO: renamed from: com.tencent.smtt.utils.e$h */
    public static class h extends k {

        /* JADX INFO: renamed from: a */
        long f13293a;

        /* JADX INFO: renamed from: b */
        long f13294b;

        /* JADX INFO: renamed from: c */
        long f13295c;

        /* JADX INFO: renamed from: d */
        long f13296d;

        /* JADX INFO: renamed from: e */
        long f13297e;

        /* JADX INFO: renamed from: f */
        long f13298f;

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.utils.C4158e.k
        /* JADX INFO: renamed from: a */
        public int mo19456a() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.utils.C4158e.k
        /* JADX INFO: renamed from: b */
        public long mo19457b() {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.utils.e$i */
    public static class i extends l {

        /* JADX INFO: renamed from: a */
        long f13299a;

        /* JADX INFO: renamed from: b */
        long f13300b;
    }

    /* JADX INFO: renamed from: com.tencent.smtt.utils.e$j */
    public static abstract class j {

        /* JADX INFO: renamed from: g */
        int f13301g;

        /* JADX INFO: renamed from: h */
        int f13302h;
    }

    /* JADX INFO: renamed from: com.tencent.smtt.utils.e$k */
    public static abstract class k {

        /* JADX INFO: renamed from: g */
        int f13303g;

        /* JADX INFO: renamed from: h */
        int f13304h;

        /* JADX INFO: renamed from: i */
        int f13305i;

        /* JADX INFO: renamed from: j */
        int f13306j;

        /* JADX INFO: renamed from: a */
        public abstract int mo19456a();

        /* JADX INFO: renamed from: b */
        public abstract long mo19457b();
    }

    /* JADX INFO: renamed from: com.tencent.smtt.utils.e$l */
    public static abstract class l {

        /* JADX INFO: renamed from: c */
        int f13307c;

        /* JADX INFO: renamed from: d */
        char f13308d;

        /* JADX INFO: renamed from: e */
        char f13309e;

        /* JADX INFO: renamed from: f */
        short f13310f;
    }

    /* JADX WARN: Invalid debug info offset */
    public C4158e(File file) throws UnknownFormatConversionException, IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static boolean m19443a(File file) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    public static boolean m19444b(java.io.File r3) {
        /*
            r0 = 0
            return r0
        L14:
        L16:
        L18:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.C4158e.m19444b(java.io.File):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    private void m19445f() throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    private static boolean m19446g() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final k m19447a(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final String m19448a(int i2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final boolean m19449a() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final char m19450b() {
        return (char) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public final char m19451c() {
        return (char) 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public final boolean m19452d() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public final boolean m19453e() {
        return false;
    }
}
