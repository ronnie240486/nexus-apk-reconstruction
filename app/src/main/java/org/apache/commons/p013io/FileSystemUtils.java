package org.apache.commons.p013io;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class FileSystemUtils {

    /* JADX INFO: renamed from: a */
    public static final FileSystemUtils f15606a = new FileSystemUtils();

    /* JADX INFO: renamed from: b */
    public static final int f15607b = -1;

    /* JADX INFO: renamed from: c */
    public static final int f15608c = 0;

    /* JADX INFO: renamed from: d */
    public static final int f15609d = 1;

    /* JADX INFO: renamed from: e */
    public static final int f15610e = 2;

    /* JADX INFO: renamed from: f */
    public static final int f15611f = 3;

    /* JADX INFO: renamed from: g */
    public static final int f15612g;

    /* JADX INFO: renamed from: h */
    public static final String f15613h;

    static {
        int i;
        String str = "df";
        try {
            String property = System.getProperty("os.name");
            if (property == null) {
                throw new IOException("os.name not found");
            }
            String lowerCase = property.toLowerCase(Locale.ENGLISH);
            if (lowerCase.contains("windows")) {
                i = 1;
            } else if (lowerCase.contains("linux") || lowerCase.contains("mpe/ix") || lowerCase.contains("freebsd") || lowerCase.contains("irix") || lowerCase.contains("digital unix") || lowerCase.contains("unix") || lowerCase.contains("mac os x")) {
                i = 2;
            } else {
                if (lowerCase.contains("sun os") || lowerCase.contains("sunos") || lowerCase.contains("solaris")) {
                    str = "/usr/xpg4/bin/df";
                } else if (!lowerCase.contains("hp-ux") && !lowerCase.contains("aix")) {
                    i = 0;
                }
                i = 3;
            }
            f15612g = i;
            f15613h = str;
        } catch (Exception unused) {
            i = -1;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: a */
    public static long m22880a(String str) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static long m22881b() throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static long m22882c(long j) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static long m22883d(String str) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static long m22884e(String str, long j) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public long m22885f(String str, int i, boolean z, long j) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public long m22886g(String str, boolean z, boolean z2, long j) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public long m22887h(String str, long j) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public Process m22888i(String[] strArr) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: j */
    public long m22889j(java.lang.String r8, java.lang.String r9) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 0
            return r0
        L2e:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.FileSystemUtils.m22889j(java.lang.String, java.lang.String):long");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public long m22890k(String str, String str2) throws IOException {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0008
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: l */
    public java.util.List<java.lang.String> m22891l(java.lang.String[] r11, int r12, long r13) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.FileSystemUtils.m22891l(java.lang.String[], int, long):java.util.List");
    }
}
