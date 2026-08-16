package org.videolan.libvlc.util;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.MainThread;
import java.util.ArrayList;
import org.videolan.libvlc.MediaDiscoverer;
import org.videolan.libvlc.interfaces.AbstractVLCEvent;
import org.videolan.libvlc.interfaces.ILibVLC;
import org.videolan.libvlc.interfaces.IMedia;
import org.videolan.libvlc.interfaces.IMediaFactory;
import org.videolan.libvlc.interfaces.IMediaList;

/* JADX INFO: loaded from: classes.dex */
public class MediaBrowser {

    /* JADX INFO: renamed from: m */
    public static final String f17690m = "MediaBrowser";

    /* JADX INFO: renamed from: n */
    public static final String f17691n = ":ignore-filetypes=";

    /* JADX INFO: renamed from: a */
    public final ILibVLC f17692a;

    /* JADX INFO: renamed from: b */
    public final ArrayList<MediaDiscoverer> f17693b;

    /* JADX INFO: renamed from: c */
    public final ArrayList<IMedia> f17694c;

    /* JADX INFO: renamed from: d */
    public IMediaList f17695d;

    /* JADX INFO: renamed from: e */
    public IMedia f17696e;

    /* JADX INFO: renamed from: f */
    public EventListener f17697f;

    /* JADX INFO: renamed from: g */
    public Handler f17698g;

    /* JADX INFO: renamed from: h */
    public boolean f17699h;

    /* JADX INFO: renamed from: i */
    public IMediaFactory f17700i;

    /* JADX INFO: renamed from: j */
    public String f17701j;

    /* JADX INFO: renamed from: k */
    public final IMediaList.EventListener f17702k;

    /* JADX INFO: renamed from: l */
    public final IMediaList.EventListener f17703l;

    /* JADX INFO: renamed from: org.videolan.libvlc.util.MediaBrowser$1 */
    public class C51061 implements IMediaList.EventListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MediaBrowser f17704a;

        /* JADX WARN: Invalid debug info offset */
        public C51061(MediaBrowser mediaBrowser) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.videolan.libvlc.interfaces.AbstractVLCEvent.Listener
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ void mo14054a(AbstractVLCEvent abstractVLCEvent) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m25566b(IMediaList.Event event) {
        }
    }

    /* JADX INFO: renamed from: org.videolan.libvlc.util.MediaBrowser$2 */
    public class C51072 implements IMediaList.EventListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MediaBrowser f17705a;

        /* JADX WARN: Invalid debug info offset */
        public C51072(MediaBrowser mediaBrowser) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.videolan.libvlc.interfaces.AbstractVLCEvent.Listener
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ void mo14054a(AbstractVLCEvent abstractVLCEvent) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m25567b(IMediaList.Event event) {
        }
    }

    public interface EventListener {
        /* JADX INFO: renamed from: a */
        void m25568a(int i, IMedia iMedia);

        /* JADX INFO: renamed from: b */
        void m25569b();

        /* JADX INFO: renamed from: c */
        void m25570c(int i, IMedia iMedia);
    }

    public static class Flag {

        /* JADX INFO: renamed from: a */
        public static final int f17706a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f17707b = 2;

        /* JADX INFO: renamed from: c */
        public static final int f17708c = 4;
    }

    /* JADX WARN: Invalid debug info offset */
    public MediaBrowser(ILibVLC iLibVLC, EventListener eventListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    public MediaBrowser(ILibVLC iLibVLC, EventListener eventListener, Handler handler) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ EventListener m25552a(MediaBrowser mediaBrowser) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ArrayList m25553b(MediaBrowser mediaBrowser) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @MainThread
    /* JADX INFO: renamed from: c */
    public void m25554c(Uri uri, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @MainThread
    /* JADX INFO: renamed from: d */
    public void m25555d(String str, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @MainThread
    /* JADX INFO: renamed from: e */
    public void m25556e(IMedia iMedia, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    @MainThread
    /* JADX INFO: renamed from: f */
    public void m25557f(EventListener eventListener) {
    }

    /* JADX WARN: Invalid debug info offset */
    @MainThread
    /* JADX INFO: renamed from: g */
    public void m25558g() {
    }

    /* JADX WARN: Invalid debug info offset */
    @MainThread
    /* JADX INFO: renamed from: h */
    public void m25559h(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @MainThread
    /* JADX INFO: renamed from: i */
    public IMedia m25560i(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @MainThread
    /* JADX INFO: renamed from: j */
    public int m25561j() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @MainThread
    /* JADX INFO: renamed from: k */
    public void m25562k() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public final void m25563l() {
    }

    /* JADX WARN: Invalid debug info offset */
    @MainThread
    /* JADX INFO: renamed from: m */
    public void m25564m(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public final void m25565n(String str) {
    }
}
