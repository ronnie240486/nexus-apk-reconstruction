package org.apache.commons.p013io;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Collection;
import org.apache.commons.p013io.filefilter.IOFileFilter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DirectoryWalker<T> {

    /* JADX INFO: renamed from: a */
    public final FileFilter f15588a;

    /* JADX INFO: renamed from: b */
    public final int f15589b;

    public static class CancelException extends IOException {

        /* JADX INFO: renamed from: c */
        public static final long f15590c = 1347339620135041008L;

        /* JADX INFO: renamed from: a */
        public final File f15591a;

        /* JADX INFO: renamed from: b */
        public final int f15592b;

        /* JADX WARN: Invalid debug info offset */
        public CancelException(File file, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public CancelException(String str, File file, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public int m22828a() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public File m22829b() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public DirectoryWalker() {
    }

    /* JADX WARN: Invalid debug info offset */
    public DirectoryWalker(FileFilter fileFilter, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public DirectoryWalker(IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public final void m22815a(File file, int i, Collection<T> collection) throws IOException {
    }

    /* JADX INFO: renamed from: b */
    public File[] m22816b(File file, int i, File[] fileArr) throws IOException {
        return fileArr;
    }

    /* JADX INFO: renamed from: c */
    public void m22817c(File file, Collection<T> collection, CancelException cancelException) throws IOException {
        throw cancelException;
    }

    /* JADX INFO: renamed from: d */
    public boolean m22818d(File file, int i, Collection<T> collection) throws IOException {
        return true;
    }

    /* JADX INFO: renamed from: e */
    public void m22819e(File file, int i, Collection<T> collection) throws IOException {
    }

    /* JADX INFO: renamed from: f */
    public void m22820f(File file, int i, Collection<T> collection) throws IOException {
    }

    /* JADX INFO: renamed from: g */
    public void m22821g(Collection<T> collection) throws IOException {
    }

    /* JADX INFO: renamed from: h */
    public void m22822h(File file, int i, Collection<T> collection) throws IOException {
    }

    /* JADX INFO: renamed from: i */
    public boolean m22823i(File file, int i, Collection<T> collection) throws IOException {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public void m22824j(File file, int i, Collection<T> collection) throws IOException {
    }

    /* JADX INFO: renamed from: k */
    public void m22825k(File file, Collection<T> collection) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public final void m22826l(File file, int i, Collection<T> collection) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: m */
    public final void m22827m(java.io.File r2, java.util.Collection<T> r3) throws java.io.IOException {
        /*
            r1 = this;
            return
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.DirectoryWalker.m22827m(java.io.File, java.util.Collection):void");
    }
}
