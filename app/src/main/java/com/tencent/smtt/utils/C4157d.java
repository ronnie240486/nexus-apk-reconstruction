package com.tencent.smtt.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.smtt.sdk.WebView;
import dalvik.system.DexClassLoader;

/* JADX INFO: renamed from: com.tencent.smtt.utils.d */
/* JADX INFO: loaded from: classes2.dex */
public class C4157d {

    /* JADX INFO: renamed from: b */
    private static DexClassLoader f13231b;

    /* JADX INFO: renamed from: c */
    private static Looper f13232c;

    /* JADX INFO: renamed from: d */
    private static C4157d f13233d;

    /* JADX INFO: renamed from: a */
    public String f13234a;

    /* JADX INFO: renamed from: com.tencent.smtt.utils.d$1, reason: invalid class name */
    public class AnonymousClass1 implements a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ WebView f13235a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f13236b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ RelativeLayout f13237c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f13238d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ TextView f13239e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ C4157d f13240f;

        /* JADX INFO: renamed from: com.tencent.smtt.utils.d$1$1, reason: invalid class name and collision with other inner class name */
        public class RunnableC59031 implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ AnonymousClass1 f13241a;

            /* JADX WARN: Invalid debug info offset */
            public RunnableC59031(AnonymousClass1 anonymousClass1) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* JADX INFO: renamed from: com.tencent.smtt.utils.d$1$2, reason: invalid class name */
        public class AnonymousClass2 implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ int f13242a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ AnonymousClass1 f13243b;

            /* JADX WARN: Invalid debug info offset */
            public AnonymousClass2(AnonymousClass1 anonymousClass1, int i) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* JADX INFO: renamed from: com.tencent.smtt.utils.d$1$3, reason: invalid class name */
        public class AnonymousClass3 implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ AnonymousClass1 f13244a;

            /* JADX WARN: Invalid debug info offset */
            public AnonymousClass3(AnonymousClass1 anonymousClass1) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // java.lang.Runnable
            public void run() {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public AnonymousClass1(C4157d c4157d, WebView webView, Context context, RelativeLayout relativeLayout, String str, TextView textView) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.utils.C4157d.a
        /* JADX INFO: renamed from: a */
        public void mo19440a() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.utils.C4157d.a
        /* JADX INFO: renamed from: a */
        public void mo19441a(int i) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.utils.C4157d.a
        /* JADX INFO: renamed from: a */
        public void mo19442a(Throwable th) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.utils.d$2, reason: invalid class name */
    public static class AnonymousClass2 extends Thread {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f13245a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ a f13246b;

        /* JADX WARN: Invalid debug info offset */
        public AnonymousClass2(String str, a aVar) {
        }

        /* JADX WARN: Invalid debug info offset */
        /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
            jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0001
            	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
            	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
            */
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            /*
                r9 = this;
                return
            L42:
            L47:
            L55:
            L5d:
            L62:
            L65:
            L73:
            L7b:
            L80:
            L88:
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.C4157d.AnonymousClass2.run():void");
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.utils.d$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo19440a();

        /* JADX INFO: renamed from: a */
        void mo19441a(int i);

        /* JADX INFO: renamed from: a */
        void mo19442a(Throwable th);
    }

    /* JADX WARN: Invalid debug info offset */
    private C4157d(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Looper m19435a() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static C4157d m19436a(Context context) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a */
    public static void m19437a(String str, a aVar) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public void m19438a(String str, WebView webView, Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x007c
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @android.annotation.SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a */
    public void m19439a(java.lang.String r17, com.tencent.smtt.sdk.WebView r18, android.content.Context r19, android.os.Looper r20) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.C4157d.m19439a(java.lang.String, com.tencent.smtt.sdk.WebView, android.content.Context, android.os.Looper):void");
    }
}
