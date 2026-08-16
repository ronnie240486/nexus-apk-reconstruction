package com.tencent.smtt.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.util.zip.ZipEntry;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"NewApi"})
public class FileUtil {

    /* JADX INFO: renamed from: a */
    public static String f13195a = null;

    /* JADX INFO: renamed from: b */
    public static final InterfaceC4149a f13196b = new InterfaceC4149a() { // from class: com.tencent.smtt.utils.FileUtil.2
        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.utils.FileUtil.InterfaceC4149a
        /* JADX INFO: renamed from: a */
        public boolean mo19376a(File file, File file2) {
            return false;
        }
    };

    /* JADX INFO: renamed from: c */
    private static final int f13197c = 4;

    /* JADX INFO: renamed from: d */
    private static RandomAccessFile f13198d = null;

    /* JADX INFO: renamed from: e */
    private static boolean f13199e = true;

    /* JADX INFO: renamed from: com.tencent.smtt.utils.FileUtil$1 */
    public static class C41471 implements InterfaceC4150b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f13200a;

        /* JADX WARN: Invalid debug info offset */
        public C41471(String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.utils.FileUtil.InterfaceC4150b
        /* JADX INFO: renamed from: a */
        public boolean mo19375a(InputStream inputStream, ZipEntry zipEntry, String str) throws Exception {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.utils.FileUtil$a */
    public interface InterfaceC4149a {
        /* JADX INFO: renamed from: a */
        boolean mo19376a(File file, File file2);
    }

    /* JADX INFO: renamed from: com.tencent.smtt.utils.FileUtil$b */
    public interface InterfaceC4150b {
        /* JADX INFO: renamed from: a */
        boolean mo19375a(InputStream inputStream, ZipEntry zipEntry, String str) throws Exception;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static long m19340a(InputStream inputStream, OutputStream outputStream) throws IOException, OutOfMemoryError {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x002e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public static java.io.File m19341a(android.content.Context r3, java.lang.String r4) {
        /*
            r0 = 0
            return r0
        L32:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.FileUtil.m19341a(android.content.Context, java.lang.String):java.io.File");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0028
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public static java.io.File m19342a(android.content.Context r1, boolean r2, java.lang.String r3) {
        /*
            r0 = 0
            return r0
        L2c:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.FileUtil.m19342a(android.content.Context, boolean, java.lang.String):java.io.File");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static String m19343a(Context context, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static String m19344a(Context context, String str, int i, boolean z) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0004
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public static java.nio.channels.FileLock m19345a(android.content.Context r1, java.io.FileOutputStream r2) {
        /*
            r0 = 0
            return r0
        L13:
        L15:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.FileUtil.m19345a(android.content.Context, java.io.FileOutputStream):java.nio.channels.FileLock");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public static synchronized void m19346a(android.content.Context r3, java.nio.channels.FileLock r4) {
        /*
            return
        L29:
        L2b:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.FileUtil.m19346a(android.content.Context, java.nio.channels.FileLock):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public static void m19347a(java.io.Closeable r0) {
        /*
            return
        L7:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.FileUtil.m19347a(java.io.Closeable):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static void m19348a(File file, boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static void m19349a(File file, boolean z, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static void m19350a(File file, boolean z, boolean z2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public static void m19351a(java.nio.channels.FileLock r1, java.io.FileOutputStream r2) {
        /*
            return
        L12:
        L1c:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.FileUtil.m19351a(java.nio.channels.FileLock, java.io.FileOutputStream):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static void m19352a(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static boolean m19353a(Context context) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static boolean m19354a(File file) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static boolean m19355a(File file, File file2) throws Exception {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static boolean m19356a(File file, File file2, FileFilter fileFilter) throws Exception {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static boolean m19357a(File file, File file2, FileFilter fileFilter, InterfaceC4149a interfaceC4149a) throws Exception {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m19358a(InputStream inputStream, ZipEntry zipEntry, String str, String str2) throws Exception {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x002f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    private static boolean m19359a(java.lang.String r4, long r5, long r7, long r9) throws java.lang.Exception {
        /*
            r0 = 0
            return r0
        L48:
        L80:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.FileUtil.m19359a(java.lang.String, long, long, long):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: a */
    public static boolean m19360a(String str, String str2) throws Exception {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    private static boolean m19361a(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, com.tencent.smtt.utils.FileUtil.InterfaceC4150b r15) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.FileUtil.m19361a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.tencent.smtt.utils.FileUtil$b):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    private static boolean m19362a(String str, String str2, String str3, String str4, String str5) throws Exception {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0006
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    public static java.io.FileOutputStream m19363b(android.content.Context r0, boolean r1, java.lang.String r2) {
        /*
            r0 = 0
            return r0
        Lc:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.FileUtil.m19363b(android.content.Context, boolean, java.lang.String):java.io.FileOutputStream");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0015
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    private static java.lang.String m19364b(android.content.Context r2, java.lang.String r3) {
        /*
            r0 = 0
            return r0
        L1e:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.FileUtil.m19364b(android.content.Context, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static void m19365b(File file) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static boolean m19366b(Context context) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0011
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    private static boolean m19367b(java.io.File r12, java.io.File r13, java.io.FileFilter r14, com.tencent.smtt.utils.FileUtil.InterfaceC4149a r15) throws java.lang.Exception {
        /*
            r0 = 0
            return r0
        L2f:
        L7c:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.FileUtil.m19367b(java.io.File, java.io.File, java.io.FileFilter, com.tencent.smtt.utils.FileUtil$a):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @android.annotation.SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: b */
    private static boolean m19368b(java.io.InputStream r9, java.util.zip.ZipEntry r10, java.lang.String r11, java.lang.String r12) throws java.lang.Exception {
        /*
            r0 = 0
            return r0
        L30:
        L33:
        L7d:
        L7f:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.FileUtil.m19368b(java.io.InputStream, java.util.zip.ZipEntry, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static String m19369c(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static boolean m19370c(File file) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static int copy(InputStream inputStream, OutputStream outputStream) throws IOException, OutOfMemoryError {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static FileOutputStream m19371d(File file) throws IOException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001e
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: d */
    public static java.nio.channels.FileLock m19372d(android.content.Context r10) {
        /*
            r0 = 0
            return r0
        L3c:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.FileUtil.m19372d(android.content.Context):java.nio.channels.FileLock");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0019
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: e */
    public static java.nio.channels.FileLock m19373e(android.content.Context r9) {
        /*
            r0 = 0
            return r0
        L37:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.FileUtil.m19373e(android.content.Context):java.nio.channels.FileLock");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0028
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: f */
    private static java.nio.channels.FileLock m19374f(android.content.Context r13) {
        /*
            r0 = 0
            return r0
        L2c:
        L4d:
        L58:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.FileUtil.m19374f(android.content.Context):java.nio.channels.FileLock");
    }
}
