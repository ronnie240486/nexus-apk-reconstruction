package org.videolan.libvlc.util;

import android.annotation.TargetApi;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class VLCUtil {

    /* JADX INFO: renamed from: a */
    public static final String f17709a = "VLC/LibVLC/Util";

    /* JADX INFO: renamed from: b */
    public static String f17710b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f17711c = false;

    /* JADX INFO: renamed from: d */
    public static MachineSpecs f17712d = null;

    /* JADX INFO: renamed from: e */
    public static final int f17713e = 3;

    /* JADX INFO: renamed from: f */
    public static final int f17714f = 8;

    /* JADX INFO: renamed from: g */
    public static final int f17715g = 40;

    /* JADX INFO: renamed from: h */
    public static final int f17716h = 62;

    /* JADX INFO: renamed from: i */
    public static final int f17717i = 183;

    /* JADX INFO: renamed from: j */
    public static final int f17718j = 52;

    /* JADX INFO: renamed from: k */
    public static final int f17719k = 40;

    /* JADX INFO: renamed from: l */
    public static final int f17720l = 1879048195;

    /* JADX INFO: renamed from: m */
    public static final String[] f17721m = {"*Pre-v4", "*v4", "*v4T", "v5T", "v5TE", "v5TEJ", "v6", "v6KZ", "v6T2", "v6K", "v7", "*v6-M", "*v6S-M", "*v7E-M", "*v8"};

    /* JADX INFO: renamed from: n */
    public static final String f17722n = "'()*";

    public static class ElfData {

        /* JADX INFO: renamed from: a */
        public ByteOrder f17723a;

        /* JADX INFO: renamed from: b */
        public boolean f17724b;

        /* JADX INFO: renamed from: c */
        public int f17725c;

        /* JADX INFO: renamed from: d */
        public int f17726d;

        /* JADX INFO: renamed from: e */
        public int f17727e;

        /* JADX INFO: renamed from: f */
        public int f17728f;

        /* JADX INFO: renamed from: g */
        public int f17729g;

        /* JADX INFO: renamed from: h */
        public String f17730h;

        /* JADX INFO: renamed from: i */
        public boolean f17731i;

        /* JADX WARN: Invalid debug info offset */
        private ElfData() {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ ElfData(C51081 c51081) {
        }
    }

    public static class MachineSpecs {

        /* JADX INFO: renamed from: a */
        public boolean f17732a;

        /* JADX INFO: renamed from: b */
        public boolean f17733b;

        /* JADX INFO: renamed from: c */
        public boolean f17734c;

        /* JADX INFO: renamed from: d */
        public boolean f17735d;

        /* JADX INFO: renamed from: e */
        public boolean f17736e;

        /* JADX INFO: renamed from: f */
        public boolean f17737f;

        /* JADX INFO: renamed from: g */
        public boolean f17738g;

        /* JADX INFO: renamed from: h */
        public float f17739h;

        /* JADX INFO: renamed from: i */
        public int f17740i;

        /* JADX INFO: renamed from: j */
        public float f17741j;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public static android.net.Uri m25571a(java.lang.String r7) {
        /*
            r0 = 0
            return r0
        L39:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.util.VLCUtil.m25571a(java.lang.String):android.net.Uri");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    public static void m25572b(java.io.Closeable r0) {
        /*
            return
        L5:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.util.VLCUtil.m25572b(java.io.Closeable):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static String m25573c(@NonNull String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static String m25574d(@NonNull Uri uri) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static String[] m25575e() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(21)
    /* JADX INFO: renamed from: f */
    public static String[] m25576f() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static String m25577g() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static MachineSpecs m25578h() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static String m25579i(ByteBuffer byteBuffer) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static int m25580j(ByteBuffer byteBuffer) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x00ec
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: k */
    public static boolean m25581k(android.content.Context r22) {
        /*
            Method dump skipped, instruction units count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.util.VLCUtil.m25581k(android.content.Context):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static boolean m25582l(RandomAccessFile randomAccessFile, ElfData elfData) throws IOException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public static boolean m25583m(RandomAccessFile randomAccessFile, ElfData elfData) throws IOException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: n */
    public static org.videolan.libvlc.util.VLCUtil.ElfData m25584n(java.io.File r6) {
        /*
            r0 = 0
            return r0
        L55:
        L58:
        L5a:
        L5d:
        L64:
        L66:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.util.VLCUtil.m25584n(java.io.File):org.videolan.libvlc.util.VLCUtil$ElfData");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public static boolean m25585o(RandomAccessFile randomAccessFile, ElfData elfData) throws IOException {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(9)
    /* JADX INFO: renamed from: p */
    public static File m25586p(ApplicationInfo applicationInfo) {
        return null;
    }
}
