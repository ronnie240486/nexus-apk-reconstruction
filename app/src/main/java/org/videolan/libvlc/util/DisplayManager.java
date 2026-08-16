package org.videolan.libvlc.util;

import android.app.Activity;
import android.app.Presentation;
import android.content.Context;
import android.content.DialogInterface;
import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import org.videolan.libvlc.RendererItem;

/* JADX INFO: loaded from: classes.dex */
public class DisplayManager {

    /* JADX INFO: renamed from: l */
    public static final String f17651l = "VLC/DisplayManager";

    /* JADX INFO: renamed from: a */
    public Activity f17652a;

    /* JADX INFO: renamed from: b */
    public LiveData<RendererItem> f17653b;

    /* JADX INFO: renamed from: c */
    public RendererItem f17654c;

    /* JADX INFO: renamed from: d */
    public boolean f17655d;

    /* JADX INFO: renamed from: e */
    public MediaRouter f17656e;

    /* JADX INFO: renamed from: f */
    public MediaRouter.SimpleCallback f17657f;

    /* JADX INFO: renamed from: g */
    public SecondaryDisplay f17658g;

    /* JADX INFO: renamed from: h */
    public DisplayType f17659h;

    /* JADX INFO: renamed from: i */
    public int f17660i;

    /* JADX INFO: renamed from: j */
    public Observer<RendererItem> f17661j;

    /* JADX INFO: renamed from: k */
    public DialogInterface.OnDismissListener f17662k;

    /* JADX INFO: renamed from: org.videolan.libvlc.util.DisplayManager$1 */
    public class C51011 implements Observer<RendererItem> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DisplayManager f17663a;

        /* JADX WARN: Invalid debug info offset */
        public C51011(DisplayManager displayManager) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public void m25538a(RendererItem rendererItem) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.lifecycle.Observer
        public /* bridge */ /* synthetic */ void onChanged(RendererItem rendererItem) {
        }
    }

    /* JADX INFO: renamed from: org.videolan.libvlc.util.DisplayManager$2 */
    public class DialogInterfaceOnDismissListenerC51022 implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DisplayManager f17664a;

        /* JADX WARN: Invalid debug info offset */
        public DialogInterfaceOnDismissListenerC51022(DisplayManager displayManager) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    /* JADX INFO: renamed from: org.videolan.libvlc.util.DisplayManager$3 */
    public class RunnableC51033 implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DisplayManager f17665a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC51033(DisplayManager displayManager) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: org.videolan.libvlc.util.DisplayManager$4 */
    public class C51044 extends MediaRouter.SimpleCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ DisplayManager f17666a;

        /* JADX WARN: Invalid debug info offset */
        public C51044(DisplayManager displayManager) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.media.MediaRouter.Callback
        public void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        }
    }

    public enum DisplayType {
        PRIMARY,
        PRESENTATION,
        RENDERER
    }

    public class SecondaryDisplay extends Presentation {

        /* JADX INFO: renamed from: e */
        public static final String f17667e = "VLC/SecondaryDisplay";

        /* JADX INFO: renamed from: a */
        public FrameLayout f17668a;

        /* JADX INFO: renamed from: b */
        public SurfaceView f17669b;

        /* JADX INFO: renamed from: c */
        public SurfaceView f17670c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ DisplayManager f17671d;

        /* JADX WARN: Invalid debug info offset */
        public SecondaryDisplay(DisplayManager displayManager, Context context, Display display) {
        }

        /* JADX WARN: Invalid debug info offset */
        public SecondaryDisplay(DisplayManager displayManager, Context context, Display display, int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public SurfaceView m25539a() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public FrameLayout m25540b() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public SurfaceView m25541c() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public DisplayManager(@NonNull Activity activity, @Nullable LiveData<RendererItem> liveData, boolean z, boolean z2, boolean z3) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ RendererItem m25517a(DisplayManager displayManager) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ RendererItem m25518b(DisplayManager displayManager, RendererItem rendererItem) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m25519c(DisplayManager displayManager) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ SecondaryDisplay m25520d(DisplayManager displayManager) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ SecondaryDisplay m25521e(DisplayManager displayManager, SecondaryDisplay secondaryDisplay) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m25522f(DisplayManager displayManager) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m25523g(DisplayManager displayManager, int i) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Activity m25524h(DisplayManager displayManager) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m25525i(DisplayManager displayManager) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0021
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: j */
    public final org.videolan.libvlc.util.DisplayManager.SecondaryDisplay m25526j() {
        /*
            r4 = this;
            r0 = 0
            return r0
        L2b:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.videolan.libvlc.util.DisplayManager.m25526j():org.videolan.libvlc.util.DisplayManager$SecondaryDisplay");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public final DisplayType m25527k() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: l */
    public DisplayType m25528l() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Nullable
    /* JADX INFO: renamed from: m */
    public SecondaryDisplay m25529m() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public boolean m25530n() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public boolean m25531o() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public boolean m25532p() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public void m25533q() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public void m25534r() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public final void m25535s() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public boolean m25536t() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public final void m25537u() {
    }
}
