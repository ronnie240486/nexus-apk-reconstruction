package org.videolan.libvlc.util;

import android.net.Uri;
import androidx.annotation.MainThread;
import org.videolan.libvlc.MediaPlayer;
import org.videolan.libvlc.interfaces.AbstractVLCEvent;
import org.videolan.libvlc.interfaces.ILibVLC;

/* JADX INFO: loaded from: classes.dex */
public class Dumper {

    /* JADX INFO: renamed from: a */
    public final ILibVLC f17672a;

    /* JADX INFO: renamed from: b */
    public final MediaPlayer f17673b;

    /* JADX INFO: renamed from: c */
    public final Listener f17674c;

    /* JADX INFO: renamed from: org.videolan.libvlc.util.Dumper$1 */
    public class C51051 implements MediaPlayer.EventListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Dumper f17675a;

        /* JADX WARN: Invalid debug info offset */
        public C51051(Dumper dumper) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.videolan.libvlc.interfaces.AbstractVLCEvent.Listener
        /* JADX INFO: renamed from: a */
        public /* bridge */ /* synthetic */ void mo14054a(AbstractVLCEvent abstractVLCEvent) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m25545b(MediaPlayer.Event event) {
        }
    }

    public interface Listener {
        /* JADX INFO: renamed from: a */
        void m25546a(boolean z);

        /* JADX INFO: renamed from: b */
        void m25547b(float f);
    }

    /* JADX WARN: Invalid debug info offset */
    @MainThread
    public Dumper(Uri uri, String str, Listener listener) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Listener m25542a(Dumper dumper) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @MainThread
    /* JADX INFO: renamed from: b */
    public void m25543b() {
    }

    /* JADX WARN: Invalid debug info offset */
    @MainThread
    /* JADX INFO: renamed from: c */
    public void m25544c() {
    }
}
