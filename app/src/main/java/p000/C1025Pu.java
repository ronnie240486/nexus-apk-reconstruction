package p000;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: Pu */
/* JADX INFO: loaded from: classes.dex */
public final class C1025Pu implements InterfaceC0117Bo {

    /* JADX INFO: renamed from: c */
    public final Map<String, List<InterfaceC0959Ou>> f2644c;

    /* JADX INFO: renamed from: d */
    public volatile Map<String, String> f2645d;

    /* JADX INFO: renamed from: Pu$a */
    public static final class a {

        /* JADX INFO: renamed from: e */
        public static final String f2646e = "User-Agent";

        /* JADX INFO: renamed from: f */
        public static final String f2647f;

        /* JADX INFO: renamed from: g */
        public static final String f2648g = "Accept-Encoding";

        /* JADX INFO: renamed from: h */
        public static final String f2649h = "identity";

        /* JADX INFO: renamed from: i */
        public static final Map<String, List<InterfaceC0959Ou>> f2650i;

        /* JADX INFO: renamed from: a */
        public boolean f2651a;

        /* JADX INFO: renamed from: b */
        public Map<String, List<InterfaceC0959Ou>> f2652b;

        /* JADX INFO: renamed from: c */
        public boolean f2653c;

        /* JADX INFO: renamed from: d */
        public boolean f2654d;

        static {
            String property = System.getProperty("http.agent");
            f2647f = property;
            HashMap map = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                map.put(f2646e, Collections.singletonList(new b(property)));
            }
            map.put(f2648g, Collections.singletonList(new b(f2649h)));
            f2650i = Collections.unmodifiableMap(map);
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public a m4556a(String str, InterfaceC0959Ou interfaceC0959Ou) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public a m4557b(String str, String str2) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public C1025Pu m4558c() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public final Map<String, List<InterfaceC0959Ou>> m4559d() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public final void m4560e() {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: f */
        public final List<InterfaceC0959Ou> m4561f(String str) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: g */
        public a m4562g(String str, InterfaceC0959Ou interfaceC0959Ou) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: h */
        public a m4563h(String str, String str2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: Pu$b */
    public static final class b implements InterfaceC0959Ou {

        /* JADX INFO: renamed from: a */
        public final String f2655a;

        /* JADX WARN: Invalid debug info offset */
        public b(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.InterfaceC0959Ou
        /* JADX INFO: renamed from: a */
        public String mo4346a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        public boolean equals(Object obj) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        public int hashCode() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        public String toString() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public C1025Pu(Map<String, List<InterfaceC0959Ou>> map) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // p000.InterfaceC0117Bo
    /* JADX INFO: renamed from: B0 */
    public java.util.Map<java.lang.String, java.lang.String> mo717B0() {
        /*
            r1 = this;
            r0 = 0
            return r0
        L14:
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1025Pu.mo717B0():java.util.Map");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final Map<String, String> m4555a() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean equals(Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
