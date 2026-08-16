package android.media.ViviTV.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.core.content.FileProvider;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class Utils {

    /* JADX INFO: renamed from: a */
    public static final String f9654a = "com.blankj.utilcode.util.PermissionUtils$PermissionActivity";

    /* JADX INFO: renamed from: b */
    public static final C2317a f9655b = new C2317a();

    /* JADX INFO: renamed from: c */
    @SuppressLint({"StaticFieldLeak"})
    public static Application f9656c;

    public static final class FileProvider4UtilCode extends FileProvider {
        /* JADX WARN: Invalid debug info offset */
        @Override // androidx.core.content.FileProvider, android.content.ContentProvider
        public boolean onCreate() {
            return false;
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.utils.Utils$a */
    public static class C2317a implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a */
        public final LinkedList<Activity> f9657a;

        /* JADX INFO: renamed from: b */
        public final Map<Object, InterfaceC2319c> f9658b;

        /* JADX INFO: renamed from: c */
        public final Map<Activity, Set<InterfaceC2318b>> f9659c;

        /* JADX INFO: renamed from: d */
        public int f9660d;

        /* JADX INFO: renamed from: e */
        public int f9661e;

        /* JADX INFO: renamed from: f */
        public boolean f9662f;

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0024
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        /* JADX INFO: renamed from: d */
        public static void m14119d(android.app.Activity r6) {
            /*
                return
            L58:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.utils.Utils.C2317a.m14119d(android.app.Activity):void");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public void m14120a(Activity activity, InterfaceC2318b interfaceC2318b) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m14121b(Object obj, InterfaceC2319c interfaceC2319c) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: c */
        public final void m14122c(Activity activity) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: e */
        public Activity m14123e() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:5:0x005b
            	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:143)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
            */
        /* JADX INFO: renamed from: f */
        public final android.app.Activity m14124f() {
            /*
                r6 = this;
                r0 = 0
                return r0
            L59:
            L5b:
            L5d:
            L5f:
            L61:
            */
            throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.utils.Utils.C2317a.m14124f():android.app.Activity");
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: g */
        public final void m14125g(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: h */
        public void m14126h(Activity activity) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: i */
        public void m14127i(Object obj) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: j */
        public final void m14128j(Activity activity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX INFO: renamed from: android.media.ViviTV.utils.Utils$b */
    public interface InterfaceC2318b {
        void onActivityDestroyed(Activity activity);
    }

    /* JADX INFO: renamed from: android.media.ViviTV.utils.Utils$c */
    public interface InterfaceC2319c {
        /* JADX INFO: renamed from: a */
        void m14129a();

        /* JADX INFO: renamed from: b */
        void m14130b();
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static String m14110a(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: b */
    public static C2317a m14111b() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: c */
    public static LinkedList<Activity> m14112c() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: d */
    public static Application m14113d() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: e */
    public static android.app.Application m14114e() {
        /*
            r0 = 0
            return r0
        L22:
        L24:
        L26:
        L28:
        */
        throw new UnsupportedOperationException("Method not decompiled: android.media.ViviTV.utils.Utils.m14114e():android.app.Application");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public static Context m14115f() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public static void m14116g(Application application) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: h */
    public static void m14117h(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public static boolean m14118i() {
        return false;
    }
}
