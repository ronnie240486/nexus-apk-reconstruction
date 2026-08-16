package org.videolan.libvlc.interfaces;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractVLCEvent {

    /* JADX INFO: renamed from: a */
    public final int f17484a;

    /* JADX INFO: renamed from: b */
    public final long f17485b;

    /* JADX INFO: renamed from: c */
    public final long f17486c;

    /* JADX INFO: renamed from: d */
    public final float f17487d;

    /* JADX INFO: renamed from: e */
    public final String f17488e;

    public interface Listener<T extends AbstractVLCEvent> {
        /* JADX INFO: renamed from: a */
        void mo14054a(T t);
    }

    /* JADX WARN: Invalid debug info offset */
    public AbstractVLCEvent(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AbstractVLCEvent(int i, float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AbstractVLCEvent(int i, long j) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AbstractVLCEvent(int i, long j, long j2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public AbstractVLCEvent(int i, long j, @Nullable String str) {
    }

    /* JADX INFO: renamed from: a */
    public void mo25417a() {
    }
}
