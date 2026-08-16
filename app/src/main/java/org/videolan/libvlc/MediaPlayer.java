package org.videolan.libvlc;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import org.videolan.libvlc.interfaces.AbstractVLCEvent;
import org.videolan.libvlc.interfaces.ILibVLC;
import org.videolan.libvlc.interfaces.IMedia;
import org.videolan.libvlc.interfaces.IVLCVout;
import org.videolan.libvlc.util.DisplayManager;
import org.videolan.libvlc.util.VLCVideoLayout;

/* JADX INFO: loaded from: classes.dex */
public class MediaPlayer extends VLCObject<Event> {

    /* JADX INFO: renamed from: y */
    public static final int f17371y = ScaleType.values().length;

    /* JADX INFO: renamed from: f */
    public IMedia f17372f;

    /* JADX INFO: renamed from: g */
    public RendererItem f17373g;

    /* JADX INFO: renamed from: h */
    public AssetFileDescriptor f17374h;

    /* JADX INFO: renamed from: i */
    public boolean f17375i;

    /* JADX INFO: renamed from: j */
    public boolean f17376j;

    /* JADX INFO: renamed from: k */
    public boolean f17377k;

    /* JADX INFO: renamed from: l */
    public int f17378l;

    /* JADX INFO: renamed from: m */
    public boolean f17379m;

    /* JADX INFO: renamed from: n */
    public String f17380n;

    /* JADX INFO: renamed from: o */
    public String f17381o;

    /* JADX INFO: renamed from: p */
    public boolean f17382p;

    /* JADX INFO: renamed from: q */
    public boolean f17383q;

    /* JADX INFO: renamed from: r */
    public String f17384r;

    /* JADX INFO: renamed from: s */
    public boolean f17385s;

    /* JADX INFO: renamed from: t */
    public VideoHelper f17386t;

    /* JADX INFO: renamed from: u */
    public final AWindow f17387u;

    /* JADX INFO: renamed from: v */
    public final BroadcastReceiver f17388v;

    /* JADX INFO: renamed from: w */
    public final AudioDeviceCallback f17389w;

    /* JADX INFO: renamed from: x */
    public Handler f17390x;

    /* JADX INFO: renamed from: org.videolan.libvlc.MediaPlayer$1 */
    public class C50941 implements AWindow.SurfaceCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MediaPlayer f17391a;

        /* JADX WARN: Invalid debug info offset */
        public C50941(MediaPlayer mediaPlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // org.videolan.libvlc.AWindow.SurfaceCallback
        /* JADX INFO: renamed from: a */
        public void mo25190a(org.videolan.libvlc.AWindow r3) {
            /*
                r2 = this;
                return
            L18:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.MediaPlayer.C50941.mo25190a(org.videolan.libvlc.AWindow):void");
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0003
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // org.videolan.libvlc.AWindow.SurfaceCallback
        /* JADX INFO: renamed from: b */
        public void mo25191b(org.videolan.libvlc.AWindow r4) {
            /*
                r3 = this;
                return
            L16:
            */
            throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.MediaPlayer.C50941.mo25191b(org.videolan.libvlc.AWindow):void");
        }
    }

    /* JADX INFO: renamed from: org.videolan.libvlc.MediaPlayer$2 */
    public class C50952 extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MediaPlayer f17392a;

        /* JADX WARN: Invalid debug info offset */
        public C50952(MediaPlayer mediaPlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* JADX INFO: renamed from: org.videolan.libvlc.MediaPlayer$3 */
    public class C50963 extends AudioDeviceCallback {

        /* JADX INFO: renamed from: a */
        public SparseArray<Long> f17393a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MediaPlayer f17394b;

        /* JADX WARN: Invalid debug info offset */
        public C50963(MediaPlayer mediaPlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public final void m25384a() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.AudioDeviceCallback
        @RequiresApi(23)
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.AudioDeviceCallback
        @RequiresApi(23)
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        }
    }

    /* JADX INFO: renamed from: org.videolan.libvlc.MediaPlayer$4 */
    public class RunnableC50974 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MediaPlayer f17395a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC50974(MediaPlayer mediaPlayer) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static class Chapter {

        /* JADX INFO: renamed from: a */
        public final long f17396a;

        /* JADX INFO: renamed from: b */
        public final long f17397b;

        /* JADX INFO: renamed from: c */
        public final String f17398c;

        /* JADX WARN: Invalid debug info offset */
        public Chapter(long j, long j2, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ Chapter(long j, long j2, String str, C50941 c50941) {
        }
    }

    public static class Equalizer {

        /* JADX INFO: renamed from: a */
        public long f17399a;

        /* JADX WARN: Invalid debug info offset */
        private Equalizer() {
        }

        /* JADX WARN: Invalid debug info offset */
        public Equalizer(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public static Equalizer m25385a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public static Equalizer m25386b(int i) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public static int m25387d() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public static float m25388e(int i) {
            return 0.0f;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: g */
        public static int m25389g() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: h */
        public static String m25390h(int i) {
            return null;
        }

        private native float nativeGetAmp(int i);

        private static native int nativeGetBandCount();

        private static native float nativeGetBandFrequency(int i);

        private native float nativeGetPreAmp();

        private static native int nativeGetPresetCount();

        private static native String nativeGetPresetName(int i);

        private native void nativeNew();

        private native void nativeNewFromPreset(int i);

        private native void nativeRelease();

        private native boolean nativeSetAmp(int i, float f);

        private native boolean nativeSetPreAmp(float f);

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public float m25391c(int i) {
            return 0.0f;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: f */
        public float m25392f() {
            return 0.0f;
        }

        /* JADX WARN: Invalid debug info offset */
        public void finalize() throws Throwable {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: i */
        public boolean m25393i(int i, float f) {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: j */
        public boolean m25394j(float f) {
            return false;
        }
    }

    public static class Event extends AbstractVLCEvent {

        /* JADX INFO: renamed from: f */
        public static final int f17400f = 256;

        /* JADX INFO: renamed from: g */
        public static final int f17401g = 258;

        /* JADX INFO: renamed from: h */
        public static final int f17402h = 259;

        /* JADX INFO: renamed from: i */
        public static final int f17403i = 260;

        /* JADX INFO: renamed from: j */
        public static final int f17404j = 261;

        /* JADX INFO: renamed from: k */
        public static final int f17405k = 262;

        /* JADX INFO: renamed from: l */
        public static final int f17406l = 265;

        /* JADX INFO: renamed from: m */
        public static final int f17407m = 266;

        /* JADX INFO: renamed from: n */
        public static final int f17408n = 267;

        /* JADX INFO: renamed from: o */
        public static final int f17409o = 268;

        /* JADX INFO: renamed from: p */
        public static final int f17410p = 269;

        /* JADX INFO: renamed from: q */
        public static final int f17411q = 270;

        /* JADX INFO: renamed from: r */
        public static final int f17412r = 273;

        /* JADX INFO: renamed from: s */
        public static final int f17413s = 274;

        /* JADX INFO: renamed from: t */
        public static final int f17414t = 276;

        /* JADX INFO: renamed from: u */
        public static final int f17415u = 277;

        /* JADX INFO: renamed from: v */
        public static final int f17416v = 278;

        /* JADX INFO: renamed from: w */
        public static final int f17417w = 286;

        /* JADX WARN: Invalid debug info offset */
        public Event(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        public Event(int i, float f) {
        }

        /* JADX WARN: Invalid debug info offset */
        public Event(int i, long j) {
        }

        /* JADX WARN: Invalid debug info offset */
        public Event(int i, long j, long j2) {
        }

        /* JADX WARN: Invalid debug info offset */
        public Event(int i, long j, @Nullable String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public float m25395b() {
            return 0.0f;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public int m25396c() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: d */
        public int m25397d() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public long m25398e() {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: f */
        public boolean m25399f() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: g */
        public float m25400g() {
            return 0.0f;
        }

        /* JADX WARN: Invalid debug info offset */
        @Nullable
        /* JADX INFO: renamed from: h */
        public String m25401h() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: i */
        public boolean m25402i() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: j */
        public boolean m25403j() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: k */
        public long m25404k() {
            return 0L;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: l */
        public int m25405l() {
            return 0;
        }
    }

    public interface EventListener extends AbstractVLCEvent.Listener<Event> {
    }

    public static class Navigate {

        /* JADX INFO: renamed from: a */
        public static final int f17418a = 0;

        /* JADX INFO: renamed from: b */
        public static final int f17419b = 1;

        /* JADX INFO: renamed from: c */
        public static final int f17420c = 2;

        /* JADX INFO: renamed from: d */
        public static final int f17421d = 3;

        /* JADX INFO: renamed from: e */
        public static final int f17422e = 4;
    }

    public static class Position {

        /* JADX INFO: renamed from: a */
        public static final int f17423a = -1;

        /* JADX INFO: renamed from: b */
        public static final int f17424b = 0;

        /* JADX INFO: renamed from: c */
        public static final int f17425c = 1;

        /* JADX INFO: renamed from: d */
        public static final int f17426d = 2;

        /* JADX INFO: renamed from: e */
        public static final int f17427e = 3;

        /* JADX INFO: renamed from: f */
        public static final int f17428f = 4;

        /* JADX INFO: renamed from: g */
        public static final int f17429g = 5;

        /* JADX INFO: renamed from: h */
        public static final int f17430h = 6;

        /* JADX INFO: renamed from: i */
        public static final int f17431i = 7;

        /* JADX INFO: renamed from: j */
        public static final int f17432j = 8;
    }

    public enum ScaleType {
        SURFACE_BEST_FIT,
        SURFACE_FIT_SCREEN,
        SURFACE_FILL,
        SURFACE_16_9,
        SURFACE_4_3,
        SURFACE_ORIGINAL
    }

    public static class Title {

        /* JADX INFO: renamed from: a */
        public final long f17433a;

        /* JADX INFO: renamed from: b */
        public final String f17434b;

        /* JADX INFO: renamed from: c */
        public final int f17435c;

        public static class Flags {

            /* JADX INFO: renamed from: a */
            public static final int f17436a = 1;

            /* JADX INFO: renamed from: b */
            public static final int f17437b = 2;

            /* JADX WARN: Invalid debug info offset */
            private Flags() {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public Title(long j, String str, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public boolean m25406a() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public boolean m25407b() {
            return false;
        }
    }

    public static class TrackDescription {

        /* JADX INFO: renamed from: a */
        public final int f17438a;

        /* JADX INFO: renamed from: b */
        public final String f17439b;

        /* JADX WARN: Invalid debug info offset */
        public TrackDescription(int i, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ TrackDescription(int i, String str, C50941 c50941) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public MediaPlayer(ILibVLC iLibVLC) {
    }

    /* JADX WARN: Invalid debug info offset */
    public MediaPlayer(@NonNull IMedia iMedia) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public static /* synthetic */ boolean m25312H(MediaPlayer mediaPlayer) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public static /* synthetic */ boolean m25313I(MediaPlayer mediaPlayer) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public static /* synthetic */ int m25314J(MediaPlayer mediaPlayer) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public static /* synthetic */ long m25315K(MediaPlayer mediaPlayer, int[] iArr) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m25316L(MediaPlayer mediaPlayer, long j, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S */
    public static Chapter m25317S(long j, long j2, String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T */
    public static Title m25318T(long j, String str, int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U */
    public static TrackDescription m25319U(int i, String str) {
        return null;
    }

    private native boolean nativeAddSlave(int i, String str, boolean z);

    private native String nativeGetAspectRatio();

    private native long nativeGetAudioDelay();

    private native int nativeGetAudioTrack();

    private native TrackDescription[] nativeGetAudioTracks();

    private native int nativeGetAudioTracksCount();

    private native Chapter[] nativeGetChapters(int i);

    private native float nativeGetScale();

    private native long nativeGetSpuDelay();

    private native int nativeGetSpuTrack();

    private native TrackDescription[] nativeGetSpuTracks();

    private native int nativeGetSpuTracksCount();

    private native Title[] nativeGetTitles();

    private native int nativeGetVideoTrack();

    private native TrackDescription[] nativeGetVideoTracks();

    private native int nativeGetVideoTracksCount();

    private native void nativeNewFromLibVlc(ILibVLC iLibVLC, AWindow aWindow);

    private native void nativeNewFromMedia(IMedia iMedia, AWindow aWindow);

    private native void nativePlay();

    private native boolean nativeRecord(String str);

    private native void nativeRelease();

    private native void nativeSetAspectRatio(String str);

    private native boolean nativeSetAudioDelay(long j);

    private native boolean nativeSetAudioOutput(String str);

    private native boolean nativeSetAudioOutputDevice(String str);

    private native boolean nativeSetAudioTrack(int i);

    private native boolean nativeSetEqualizer(Equalizer equalizer);

    private native void nativeSetMedia(IMedia iMedia);

    private native int nativeSetRenderer(RendererItem rendererItem);

    private native void nativeSetScale(float f);

    private native boolean nativeSetSpuDelay(long j);

    private native boolean nativeSetSpuTrack(int i);

    private native void nativeSetVideoTitleDisplay(int i, int i2);

    private native boolean nativeSetVideoTrack(int i);

    private native void nativeStop();

    private native boolean nativeUpdateViewpoint(float f, float f2, float f3, float f4, boolean z);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A0 */
    public void m25320A0(@NonNull Context context, @NonNull String str) throws IOException {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: B0 */
    public boolean m25321B0(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C0 */
    public final void m25322C0(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.VLCObject
    /* JADX INFO: renamed from: D */
    public /* bridge */ /* synthetic */ AbstractVLCEvent mo25253D(int i, long j, long j2, float f, @Nullable String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(21)
    /* JADX INFO: renamed from: D0 */
    public final void m25323D0(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.VLCObject
    /* JADX INFO: renamed from: E */
    public void mo25254E() {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(23)
    /* JADX INFO: renamed from: E0 */
    public final void m25324E0(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F0 */
    public void m25325F0(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G0 */
    public boolean m25326G0(long j) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: H0 */
    public synchronized boolean m25327H0(boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I0 */
    public synchronized boolean m25328I0(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J0 */
    public boolean m25329J0(String str) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K0 */
    public final synchronized boolean m25330K0(String str, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L0 */
    public boolean m25331L0(int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public boolean m25332M(int i, Uri uri, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M0 */
    public boolean m25333M0(Equalizer equalizer) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N */
    public boolean m25334N(int i, String str, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: N0 */
    public synchronized void m25335N0(org.videolan.libvlc.MediaPlayer.EventListener r1) {
        /*
            r0 = this;
            return
        L6:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.MediaPlayer.m25335N0(org.videolan.libvlc.MediaPlayer$EventListener):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O */
    public void m25336O(@NonNull VLCVideoLayout vLCVideoLayout, @Nullable DisplayManager displayManager, boolean z, boolean z2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0018
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: O0 */
    public void m25337O0(@androidx.annotation.Nullable org.videolan.libvlc.interfaces.IMedia r2) {
        /*
            r1 = this;
            return
        L20:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.MediaPlayer.m25337O0(org.videolan.libvlc.interfaces.IMedia):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public boolean m25338P() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P0 */
    public int m25339P0(@Nullable RendererItem rendererItem) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(23)
    /* JADX INFO: renamed from: Q */
    public final AudioDeviceCallback m25340Q() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q0 */
    public void m25341Q0(float f) {
    }

    /* JADX WARN: Invalid debug info offset */
    @TargetApi(21)
    /* JADX INFO: renamed from: R */
    public final BroadcastReceiver m25342R() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: R0 */
    public boolean m25343R0(long j) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: S0 */
    public boolean m25344S0(int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: T0 */
    public void m25345T0(@NonNull ScaleType scaleType) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: U0 */
    public void m25346U0(int i, int i2) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V */
    public void m25347V() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: V0 */
    public boolean m25348V0(int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: W */
    public synchronized boolean m25349W(int[] r6) {
        /*
            r5 = this;
            r0 = 0
            return r0
        L15:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.MediaPlayer.m25349W(int[]):boolean");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: W0 */
    public void m25350W0(boolean z) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: X */
    public String m25351X() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: X0 */
    public void m25352X0() {
        /*
            r1 = this;
            return
        L14:
        L15:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.MediaPlayer.m25352X0():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Y */
    public long m25353Y() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: Y0 */
    public final synchronized void m25354Y0(long r6, java.lang.String r8) {
        /*
            r5 = this;
            return
        L22:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.MediaPlayer.m25354Y0(long, java.lang.String):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z */
    public int m25355Z() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Z0 */
    public void m25356Z0() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a0 */
    public TrackDescription[] m25357a0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a1 */
    public boolean m25358a1(float f, float f2, float f3, float f4, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b0 */
    public int m25359b0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c0 */
    public Chapter[] m25360c0(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d0 */
    public IMedia.VideoTrack m25361d0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e0 */
    public final long m25362e0(int[] iArr) {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: f0 */
    public synchronized IMedia m25363f0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g0 */
    public float m25364g0() {
        return 0.0f;
    }

    public native int getChapter();

    public native long getLength();

    public native int getPlayerState();

    public native float getPosition();

    public native float getRate();

    public native long getTime();

    public native int getTitle();

    public native int getVolume();

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h0 */
    public long m25365h0() {
        return 0L;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i0 */
    public int m25366i0() {
        return 0;
    }

    public native boolean isPlaying();

    public native boolean isSeekable();

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j0 */
    public TrackDescription[] m25367j0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k0 */
    public int m25368k0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l0 */
    public Title[] m25369l0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    /* JADX INFO: renamed from: m0 */
    public IVLCVout m25370m0() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @NonNull
    /* JADX INFO: renamed from: n0 */
    public ScaleType m25371n0() {
        return null;
    }

    public native void navigate(int i);

    public native int nextChapter();

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o0 */
    public int m25372o0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p0 */
    public TrackDescription[] m25373p0() {
        return null;
    }

    public native void pause();

    public native int previousChapter();

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q0 */
    public int m25374q0() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.VLCObject, org.videolan.libvlc.interfaces.IVLCObject
    /* JADX INFO: renamed from: r */
    public ILibVLC mo25258r() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r0 */
    public synchronized boolean m25375r0() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s0 */
    public final boolean m25376s0() {
        return false;
    }

    public native void setChapter(int i);

    public native void setPosition(float f);

    public native void setRate(float f);

    public native long setTime(long j);

    public native void setTitle(int i);

    public native int setVolume(int i);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t0 */
    public final boolean m25377t0(int i) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x001d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: u0 */
    public synchronized org.videolan.libvlc.MediaPlayer.Event m25378u0(int r7, long r8, long r10, float r12, @androidx.annotation.Nullable java.lang.String r13) {
        /*
            r6 = this;
            r0 = 0
            return r0
        L28:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.MediaPlayer.m25378u0(int, long, long, float, java.lang.String):org.videolan.libvlc.MediaPlayer$Event");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: v0 */
    public void m25379v0() {
        /*
            r2 = this;
            return
        L12:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.MediaPlayer.m25379v0():void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w0 */
    public void m25380w0(@NonNull AssetFileDescriptor assetFileDescriptor) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.videolan.libvlc.VLCObject, org.videolan.libvlc.interfaces.IVLCObject
    /* JADX INFO: renamed from: x */
    public /* bridge */ /* synthetic */ boolean mo25259x() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x0 */
    public void m25381x0(@NonNull Uri uri) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y0 */
    public void m25382y0(@NonNull String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z0 */
    public void m25383z0(@NonNull IMedia iMedia) {
    }
}
