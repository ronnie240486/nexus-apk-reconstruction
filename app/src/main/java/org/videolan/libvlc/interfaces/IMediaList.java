package org.videolan.libvlc.interfaces;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public interface IMediaList extends IVLCObject<Event> {

    public static class Event extends AbstractVLCEvent {

        /* JADX INFO: renamed from: i */
        public static final int f17601i = 512;

        /* JADX INFO: renamed from: j */
        public static final int f17602j = 514;

        /* JADX INFO: renamed from: k */
        public static final int f17603k = 516;

        /* JADX INFO: renamed from: f */
        public final IMedia f17604f;

        /* JADX INFO: renamed from: g */
        public final boolean f17605g;

        /* JADX INFO: renamed from: h */
        public final int f17606h;

        /* JADX WARN: Invalid debug info offset */
        public Event(int i, IMedia iMedia, boolean z, int i2) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.videolan.libvlc.interfaces.AbstractVLCEvent
        /* JADX INFO: renamed from: a */
        public void mo25417a() {
        }
    }

    public interface EventListener extends AbstractVLCEvent.Listener<Event> {
    }

    /* JADX INFO: renamed from: d */
    void mo25309d(EventListener eventListener, Handler handler);

    /* JADX INFO: renamed from: e */
    IMedia mo25310e(int i);

    int getCount();

    /* JADX INFO: renamed from: l */
    boolean mo25311l();
}
