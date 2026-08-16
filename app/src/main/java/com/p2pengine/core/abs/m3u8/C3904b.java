package com.p2pengine.core.abs.m3u8;

import com.p2pengine.core.utils.C4012e;
import java.io.BufferedReader;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.p2pengine.core.abs.m3u8.b */
/* JADX INFO: loaded from: classes2.dex */
public class C3904b {

    /* JADX INFO: renamed from: b */
    public static final Pattern f11565b = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: c */
    public static final Pattern f11566c = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: d */
    public static final Pattern f11567d = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: e */
    public static final Pattern f11568e = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: f */
    public static final Pattern f11569f = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: g */
    public static final Pattern f11570g = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: h */
    public static final Pattern f11571h = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: i */
    public static final Pattern f11572i = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: j */
    public static final Pattern f11573j = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* JADX INFO: renamed from: k */
    public static final Pattern f11574k = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* JADX INFO: renamed from: l */
    public static final Pattern f11575l = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* JADX INFO: renamed from: m */
    public static final Pattern f11576m = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* JADX INFO: renamed from: n */
    public static final Pattern f11577n = Pattern.compile("URI=\"(.+?)\"");

    /* JADX INFO: renamed from: o */
    public static final Pattern f11578o = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: p */
    public static final Pattern f11579p = Pattern.compile("NAME=\"(.+?)\"");

    /* JADX INFO: renamed from: q */
    public static final Pattern f11580q = Pattern.compile("VALUE=\"(.+?)\"");

    /* JADX INFO: renamed from: r */
    public static final Pattern f11581r = Pattern.compile("IMPORT=\"(.+?)\"");

    /* JADX INFO: renamed from: s */
    public static final Pattern f11582s = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* JADX INFO: renamed from: t */
    public static final Pattern f11583t = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");

    /* JADX INFO: renamed from: a */
    public final C3905c f11584a;

    /* JADX WARN: Invalid debug info offset */
    public C3904b() {
    }

    /* JADX WARN: Invalid debug info offset */
    public C3904b(C3905c c3905c) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static int m18050a(BufferedReader bufferedReader, boolean z, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static int m18051a(String str, Pattern pattern) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static C3905c m18052a(C4012e c4012e, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static C3906d m18053a(C3905c c3905c, C4012e c4012e, String str, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static String m18054a(String str, Map<String, String> map) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static String m18055a(String str, Pattern pattern, String str2, Map<String, String> map) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static String m18056a(String str, Pattern pattern, Map<String, String> map) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static boolean m18057a(BufferedReader bufferedReader) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0014
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public com.p2pengine.core.abs.m3u8.AbstractC3903a m18058a(java.lang.String r5, byte[] r6, int r7) {
        /*
            r4 = this;
            r0 = 0
            return r0
        L43:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2pengine.core.abs.m3u8.C3904b.m18058a(java.lang.String, byte[], int):com.p2pengine.core.abs.m3u8.a");
    }
}
