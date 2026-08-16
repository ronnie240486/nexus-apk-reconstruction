package org.videolan.libvlc;

import android.os.Handler;
import androidx.annotation.Nullable;
import org.videolan.libvlc.interfaces.AbstractVLCEvent;
import org.videolan.libvlc.interfaces.ILibVLC;
import org.videolan.libvlc.interfaces.IVLCObject;

/* JADX INFO: loaded from: classes.dex */
abstract class VLCObject<T extends AbstractVLCEvent> implements IVLCObject<T> {

    /* JADX INFO: renamed from: a */
    public AbstractVLCEvent.Listener<T> f17456a;

    /* JADX INFO: renamed from: b */
    public Handler f17457b;

    /* JADX INFO: renamed from: c */
    public final ILibVLC f17458c;

    /* JADX INFO: renamed from: d */
    public int f17459d;

    /* JADX INFO: renamed from: e */
    public long f17460e;

    /* JADX INFO: renamed from: org.videolan.libvlc.VLCObject$1EventRunnable, reason: invalid class name */
    public class C1EventRunnable implements Runnable {

        /* JADX INFO: renamed from: a */
        public final AbstractVLCEvent.Listener<T> f17461a;

        /* JADX INFO: renamed from: b */
        public final T f17462b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ VLCObject f17463c;

        /* JADX WARN: Invalid debug info offset */
        public C1EventRunnable(VLCObject vLCObject, AbstractVLCEvent.Listener<T> listener, T t) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public VLCObject() {
    }

    /* JADX WARN: Invalid debug info offset */
    public VLCObject(ILibVLC iLibVLC) {
    }

    /* JADX WARN: Invalid debug info offset */
    public VLCObject(IVLCObject iVLCObject) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B */
    public static void m25420B(Object obj, int i, long j, long j2, float f, @Nullable String str) {
    }

    private native void nativeDetachEvents();

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: A */
    public final synchronized void m25421A(int r2, long r3, long r5, float r7, @androidx.annotation.Nullable java.lang.String r8) {
        /*
            r1 = this;
            return
        L20:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.VLCObject.m25421A(int, long, long, float, java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public final Object m25422C() {
        return null;
    }

    /* JADX INFO: renamed from: D */
    public abstract T mo25253D(int i, long j, long j2, float f, String str);

    /* JADX INFO: renamed from: E */
    public abstract void mo25254E();

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: F */
    public synchronized void m25423F(org.videolan.libvlc.interfaces.AbstractVLCEvent.Listener<T> r2) {
        /*
            r1 = this;
            return
        L7:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.VLCObject.m25423F(org.videolan.libvlc.interfaces.AbstractVLCEvent$Listener):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: G */
    public synchronized void m25424G(org.videolan.libvlc.interfaces.AbstractVLCEvent.Listener<T> r3, android.os.Handler r4) {
        /*
            r2 = this;
            return
        La:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.VLCObject.m25424G(org.videolan.libvlc.interfaces.AbstractVLCEvent$Listener, android.os.Handler):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public synchronized void finalize() {
        /*
            r3 = this;
            return
        L34:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.VLCObject.finalize():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IVLCObject
    /* JADX INFO: renamed from: r */
    public ILibVLC mo25258r() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // org.videolan.libvlc.interfaces.IVLCObject
    public void release() {
        /*
            r2 = this;
            return
        L7:
        L23:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.VLCObject.release():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IVLCObject
    /* JADX INFO: renamed from: u */
    public final synchronized boolean mo25425u() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.interfaces.IVLCObject
    /* JADX INFO: renamed from: x */
    public synchronized boolean mo25259x() {
        return false;
    }
}
