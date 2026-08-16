package android.media.ViviTV.service;

import android.app.Service;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import androidx.annotation.Nullable;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class ExtraService extends Service {

    /* JADX INFO: renamed from: c */
    public static final String f9600c = "+UVnBvJL0EB5KwKNoFD5WXMr3KoGyttaye0kKsOtk7A=";

    /* JADX INFO: renamed from: d */
    public static final String f9601d = "Y2S6l8nW/wLesAzluBwUtXMr3KoGyttaye0kKsOtk7A=";

    /* JADX INFO: renamed from: e */
    public static final String f9602e = "9w8W2icu2+Ea4OmK6opBkw==";

    /* JADX INFO: renamed from: f */
    public static final String f9603f = "foiZ8OHMncd5oA6vg/uRbQ==";

    /* JADX INFO: renamed from: g */
    public static final String f9604g = "2";

    /* JADX INFO: renamed from: h */
    public static final String f9605h = "lEi4yHMeVMUc7HUZBshcxw==";

    /* JADX INFO: renamed from: i */
    public static final String f9606i = "+nK8CHkELXFrmhRgeQQKWQ==";

    /* JADX INFO: renamed from: j */
    public static String f9607j = "";

    /* JADX INFO: renamed from: k */
    public static String f9608k = "";

    /* JADX INFO: renamed from: l */
    public static String f9609l = "";

    /* JADX INFO: renamed from: m */
    public static String f9610m = "";

    /* JADX INFO: renamed from: n */
    public static String f9611n = "2";

    /* JADX INFO: renamed from: o */
    public static String f9612o = "";

    /* JADX INFO: renamed from: p */
    public static String f9613p = "";

    /* JADX INFO: renamed from: a */
    public ExecutorService f9614a;

    /* JADX INFO: renamed from: b */
    public List<AsyncTask<Void, Integer, Boolean>> f9615b;

    /* JADX INFO: renamed from: android.media.ViviTV.service.ExtraService$a */
    public class AsyncTaskC2314a extends AsyncTask<Void, Integer, Boolean> {

        /* JADX INFO: renamed from: a */
        public String f9616a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ExtraService f9617b;

        /* JADX WARN: Invalid debug info offset */
        public AsyncTaskC2314a(ExtraService extraService, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public Boolean m14093a(Void... voidArr) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Boolean doInBackground(Void[] voidArr) {
            return null;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.service.ExtraService$b */
    public class C2315b extends Thread {

        /* JADX INFO: renamed from: a */
        public String f9618a;

        /* JADX INFO: renamed from: b */
        public InputStream f9619b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ExtraService f9620c;

        /* JADX WARN: Invalid debug info offset */
        public C2315b(ExtraService extraService, String str, InputStream inputStream) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0011
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            /*
                r4 = this;
                return
            L29:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.service.ExtraService.C2315b.run():void");
        }
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: d */
    public static final void m14088d(android.content.Context r2) {
        /*
            return
        L14:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.service.ExtraService.m14088d(android.content.Context):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0009
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    public java.lang.String m14089a(java.lang.String r3) {
        /*
            r2 = this;
            r0 = 0
            return r0
        L12:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.service.ExtraService.m14089a(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public final void m14090b() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public final void m14091c() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public final void m14092e() {
    }

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

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }
}
