package org.apache.commons.p013io;

import java.io.File;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class FileCleaningTracker {

    /* JADX INFO: renamed from: a */
    public ReferenceQueue<Object> f15594a;

    /* JADX INFO: renamed from: b */
    public final Collection<Tracker> f15595b;

    /* JADX INFO: renamed from: c */
    public final List<String> f15596c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f15597d;

    /* JADX INFO: renamed from: e */
    public Thread f15598e;

    public final class Reaper extends Thread {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ FileCleaningTracker f15599a;

        /* JADX WARN: Invalid debug info offset */
        public Reaper(FileCleaningTracker fileCleaningTracker) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0012
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            /*
                r3 = this;
                return
            L33:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.FileCleaningTracker.Reaper.run():void");
        }
    }

    public static final class Tracker extends PhantomReference<Object> {

        /* JADX INFO: renamed from: a */
        public final String f15600a;

        /* JADX INFO: renamed from: b */
        public final FileDeleteStrategy f15601b;

        /* JADX WARN: Invalid debug info offset */
        public Tracker(String str, FileDeleteStrategy fileDeleteStrategy, Object obj, ReferenceQueue<? super Object> referenceQueue) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public boolean m22875a() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public String m22876b() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public final synchronized void m22867a(java.lang.String r4, java.lang.Object r5, org.apache.commons.p013io.FileDeleteStrategy r6) {
        /*
            r3 = this;
            return
        L14:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.FileCleaningTracker.m22867a(java.lang.String, java.lang.Object, org.apache.commons.io.FileDeleteStrategy):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    public synchronized void m22868b() {
        /*
            r2 = this;
            return
        L10:
        L13:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p013io.FileCleaningTracker.m22868b():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public List<String> m22869c() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public int m22870d() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public void m22871e(File file, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public void m22872f(File file, Object obj, FileDeleteStrategy fileDeleteStrategy) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public void m22873g(String str, Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public void m22874h(String str, Object obj, FileDeleteStrategy fileDeleteStrategy) {
    }
}
