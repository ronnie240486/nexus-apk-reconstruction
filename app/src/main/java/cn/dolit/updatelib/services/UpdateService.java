package cn.dolit.updatelib.services;

import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.view.View;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import org.xutils.common.Callback;
import p000.C4197d3;
import p000.C4262e3;
import p000.InterfaceC5812yq;

/* JADX INFO: loaded from: classes.dex */
public class UpdateService extends Service {

    /* JADX INFO: renamed from: o */
    public static final String f10477o = "UpdateService";

    /* JADX INFO: renamed from: p */
    public static final int f10478p = 587941256;

    /* JADX INFO: renamed from: q */
    public static final String f10479q = "updateUrl";

    /* JADX INFO: renamed from: r */
    public static final String f10480r = "updateArgumentCheck";

    /* JADX INFO: renamed from: s */
    public static final String f10481s = "updateArgumentDownload";

    /* JADX INFO: renamed from: t */
    public static final String f10482t = "needShowTip";

    /* JADX INFO: renamed from: v */
    public static final String f10484v = "new.apk";

    /* JADX INFO: renamed from: w */
    public static final String f10485w = "locale_language";

    /* JADX INFO: renamed from: x */
    public static final String f10486x = "locale_country";

    /* JADX INFO: renamed from: y */
    public static InterfaceC5812yq f10487y;

    /* JADX INFO: renamed from: a */
    public HashMap<String, String> f10489a;

    /* JADX INFO: renamed from: b */
    public HashMap<String, String> f10490b;

    /* JADX INFO: renamed from: c */
    public boolean f10491c;

    /* JADX INFO: renamed from: d */
    public String f10492d;

    /* JADX INFO: renamed from: e */
    public PendingIntent f10493e;

    /* JADX INFO: renamed from: f */
    public NotificationManager f10494f;

    /* JADX INFO: renamed from: g */
    public C4262e3 f10495g;

    /* JADX INFO: renamed from: h */
    public Handler f10496h;

    /* JADX INFO: renamed from: i */
    public ExecutorService f10497i;

    /* JADX INFO: renamed from: j */
    public boolean f10498j;

    /* JADX INFO: renamed from: k */
    public boolean f10499k;

    /* JADX INFO: renamed from: l */
    public BinderC3091o f10500l;

    /* JADX INFO: renamed from: m */
    public BroadcastReceiver f10501m;

    /* JADX INFO: renamed from: n */
    public C4197d3.b f10502n;

    /* JADX INFO: renamed from: u */
    public static final String f10483u = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: z */
    public static Locale f10488z = null;

    /* JADX INFO: renamed from: cn.dolit.updatelib.services.UpdateService$a */
    public class C3077a implements Callback.ProgressCallback<File> {

        /* JADX INFO: renamed from: a */
        public long f10503a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UpdateService f10504b;

        /* JADX WARN: Invalid debug info offset */
        public C3077a(UpdateService updateService) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xutils.common.Callback.CommonCallback
        /* JADX INFO: renamed from: a */
        public void mo16802a(Callback.CancelledException cancelledException) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xutils.common.Callback.ProgressCallback
        /* JADX INFO: renamed from: e */
        public void mo16803e() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xutils.common.Callback.CommonCallback
        /* JADX INFO: renamed from: f */
        public void mo16804f(Throwable th, boolean z) {
        }

        @Override // org.xutils.common.Callback.ProgressCallback
        /* JADX INFO: renamed from: h */
        public void mo16805h() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xutils.common.Callback.ProgressCallback
        /* JADX INFO: renamed from: j */
        public void mo16806j(long j, long j2, boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: n */
        public void m16807n(File file) {
        }

        @Override // org.xutils.common.Callback.CommonCallback
        public void onFinished() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xutils.common.Callback.CommonCallback
        public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        }
    }

    /* JADX INFO: renamed from: cn.dolit.updatelib.services.UpdateService$b */
    public class RunnableC3078b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UpdateService f10505a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC3078b(UpdateService updateService) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: cn.dolit.updatelib.services.UpdateService$c */
    public class C3079c implements C4197d3.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UpdateService f10506a;

        /* JADX INFO: renamed from: cn.dolit.updatelib.services.UpdateService$c$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C3079c f10507a;

            /* JADX WARN: Invalid debug info offset */
            public a(C3079c c3079c) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* JADX INFO: renamed from: cn.dolit.updatelib.services.UpdateService$c$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f10508a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C3079c f10509b;

            /* JADX WARN: Invalid debug info offset */
            public b(C3079c c3079c, int i) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* JADX INFO: renamed from: cn.dolit.updatelib.services.UpdateService$c$c */
        public class c implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C3079c f10510a;

            /* JADX WARN: Invalid debug info offset */
            public c(C3079c c3079c) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public C3079c(UpdateService updateService) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C4197d3.b
        /* JADX INFO: renamed from: a */
        public void mo16808a(File file) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C4197d3.b
        /* JADX INFO: renamed from: b */
        public void mo16809b() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C4197d3.b
        /* JADX INFO: renamed from: c */
        public void mo16810c() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C4197d3.b
        /* JADX INFO: renamed from: d */
        public void mo16811d(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // p000.C4197d3.b
        /* JADX INFO: renamed from: e */
        public boolean mo16812e() {
            return false;
        }
    }

    /* JADX INFO: renamed from: cn.dolit.updatelib.services.UpdateService$d */
    public class AsyncTaskC3080d extends AsyncTask<Void, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ File f10511a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UpdateService f10512b;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC3080d(UpdateService updateService, File file) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Boolean m16813a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0021
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: b */
        public void m16814b(java.lang.Boolean r3) {
            /*
                r2 = this;
                return
            L2c:
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.dolit.updatelib.services.UpdateService.AsyncTaskC3080d.m16814b(java.lang.Boolean):void");
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Boolean doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public void onCancelled() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        }
    }

    /* JADX INFO: renamed from: cn.dolit.updatelib.services.UpdateService$e */
    public class RunnableC3081e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ File f10513a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UpdateService f10514b;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC3081e(UpdateService updateService, File file) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: cn.dolit.updatelib.services.UpdateService$f */
    public class ThreadFactoryC3082f implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UpdateService f10515a;

        /* JADX WARN: Invalid debug info offset */
        public ThreadFactoryC3082f(UpdateService updateService) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return null;
        }
    }

    /* JADX INFO: renamed from: cn.dolit.updatelib.services.UpdateService$g */
    public class RunnableC3083g implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f10516a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UpdateService f10517b;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC3083g(UpdateService updateService, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: cn.dolit.updatelib.services.UpdateService$h */
    public class RunnableC3084h implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f10518a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UpdateService f10519b;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC3084h(UpdateService updateService, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.lang.Runnable
        public void run() {
            /*
                r6 = this;
                return
            L28:
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.dolit.updatelib.services.UpdateService.RunnableC3084h.run():void");
        }
    }

    /* JADX INFO: renamed from: cn.dolit.updatelib.services.UpdateService$i */
    public class C3085i extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UpdateService f10520a;

        /* JADX WARN: Invalid debug info offset */
        public C3085i(UpdateService updateService) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
        }
    }

    /* JADX INFO: renamed from: cn.dolit.updatelib.services.UpdateService$j */
    public class RunnableC3086j implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UpdateService f10521a;

        /* JADX WARN: Invalid debug info offset */
        public RunnableC3086j(UpdateService updateService) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* JADX INFO: renamed from: cn.dolit.updatelib.services.UpdateService$k */
    public class DialogInterfaceOnDismissListenerC3087k implements DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UpdateService f10522a;

        /* JADX WARN: Invalid debug info offset */
        public DialogInterfaceOnDismissListenerC3087k(UpdateService updateService) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    /* JADX INFO: renamed from: cn.dolit.updatelib.services.UpdateService$l */
    public class ViewOnClickListenerC3088l implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AlertDialog f10523a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f10524b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ UpdateService f10525c;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC3088l(UpdateService updateService, AlertDialog alertDialog, boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: cn.dolit.updatelib.services.UpdateService$m */
    public class ViewOnClickListenerC3089m implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AlertDialog f10526a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UpdateService f10527b;

        /* JADX WARN: Invalid debug info offset */
        public ViewOnClickListenerC3089m(UpdateService updateService, AlertDialog alertDialog) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: renamed from: cn.dolit.updatelib.services.UpdateService$n */
    public class AsyncTaskC3090n extends AsyncTask<Void, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ File f10528a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ UpdateService f10529b;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC3090n(UpdateService updateService, File file) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0013
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: a */
        public java.lang.Boolean m16815a(java.lang.Void... r2) {
            /*
                r1 = this;
                r0 = 0
                return r0
            L2a:
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.dolit.updatelib.services.UpdateService.AsyncTaskC3090n.m16815a(java.lang.Void[]):java.lang.Boolean");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m16816b(Boolean bool) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Boolean doInBackground(Void[] voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        }
    }

    /* JADX INFO: renamed from: cn.dolit.updatelib.services.UpdateService$o */
    public class BinderC3091o extends Binder {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UpdateService f10530a;

        /* JADX WARN: Invalid debug info offset */
        public BinderC3091o(UpdateService updateService) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public void m16817a() {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m16818b() {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public C4262e3 m16819c() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: A */
    public static void m16758A(Context context, String str, HashMap<String, String> map, HashMap<String, String> map2, InterfaceC5812yq interfaceC5812yq) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x002f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: B */
    public static void m16759B(android.content.Context r1, java.lang.String r2, java.util.HashMap<java.lang.String, java.lang.String> r3, java.util.HashMap<java.lang.String, java.lang.String> r4, boolean r5, p000.InterfaceC5812yq r6, java.util.Locale r7) {
        /*
            return
        L32:
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.dolit.updatelib.services.UpdateService.m16759B(android.content.Context, java.lang.String, java.util.HashMap, java.util.HashMap, boolean, yq, java.util.Locale):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0005
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public static void m16760a(android.content.Context r2) {
        /*
            return
        L21:
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.dolit.updatelib.services.UpdateService.m16760a(android.content.Context):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ HashMap m16761b(UpdateService updateService) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC5812yq m16762c() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m16763d(UpdateService updateService) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m16764e(UpdateService updateService) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ C4197d3.b m16765f(UpdateService updateService) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m16766g(UpdateService updateService, File file) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m16767h(UpdateService updateService, Throwable th) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m16768i(UpdateService updateService, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m16769j(UpdateService updateService, int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Handler m16770k(UpdateService updateService) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m16771l(UpdateService updateService, File file) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m16772m(UpdateService updateService, File file) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m16773n(UpdateService updateService, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m16774o(UpdateService updateService, File file) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m16775p(UpdateService updateService) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m16776q(UpdateService updateService) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ boolean m16777r(UpdateService updateService, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ C4262e3 m16778s(UpdateService updateService) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: t */
    public static /* synthetic */ C4262e3 m16779t(UpdateService updateService, C4262e3 c4262e3) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m16780u(UpdateService updateService, C4262e3 c4262e3) throws Exception {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: v */
    public static /* synthetic */ String m16781v(UpdateService updateService) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: w */
    public static /* synthetic */ boolean m16782w(UpdateService updateService) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: x */
    public static /* synthetic */ boolean m16783x(UpdateService updateService, boolean z) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: y */
    public static /* synthetic */ NotificationManager m16784y(UpdateService updateService) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m16785z(UpdateService updateService) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: C */
    public final void m16786C(C4262e3 c4262e3) throws Exception {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: D */
    public final void m16787D(java.io.File r2) {
        /*
            r1 = this;
            return
        Ld:
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.dolit.updatelib.services.UpdateService.m16787D(java.io.File):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: E */
    public final void m16788E() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: F */
    public final void m16789F() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: G */
    public final void m16790G(File file) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: H */
    public final void m16791H(Throwable th) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: I */
    public final void m16792I(File file) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: J */
    public final void m16793J() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: K */
    public final void m16794K(File file) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: L */
    public final void m16795L() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: M */
    public final void m16796M(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: N */
    public final void m16797N() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: O */
    public final void m16798O(int i) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: P */
    public final void m16799P(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: Q */
    public final void m16800Q() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    /* JADX INFO: renamed from: R */
    public final void m16801R() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Service
    public void onCreate() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Service
    public void onDestroy() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return 0;
    }
}
