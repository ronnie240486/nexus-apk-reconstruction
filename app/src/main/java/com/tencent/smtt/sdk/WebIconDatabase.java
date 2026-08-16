package com.tencent.smtt.sdk;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import com.tencent.smtt.export.external.interfaces.IconListener;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class WebIconDatabase {

    /* JADX INFO: renamed from: a */
    private static WebIconDatabase f12925a;

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.WebIconDatabase$1 */
    public class C41031 implements IconListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC4105a f12926a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ WebIconDatabase f12927b;

        /* JADX WARN: Invalid debug info offset */
        public C41031(WebIconDatabase webIconDatabase, InterfaceC4105a interfaceC4105a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.IconListener
        public void onReceivedIcon(String str, Bitmap bitmap) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.WebIconDatabase$2 */
    public class C41042 implements android.webkit.WebIconDatabase.IconListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC4105a f12928a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ WebIconDatabase f12929b;

        /* JADX WARN: Invalid debug info offset */
        public C41042(WebIconDatabase webIconDatabase, InterfaceC4105a interfaceC4105a) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.webkit.WebIconDatabase.IconListener
        public void onReceivedIcon(String str, Bitmap bitmap) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.WebIconDatabase$a */
    @Deprecated
    public interface InterfaceC4105a {
        /* JADX INFO: renamed from: a */
        void m18972a(String str, Bitmap bitmap);
    }

    /* JADX WARN: Invalid debug info offset */
    private WebIconDatabase() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    private static synchronized com.tencent.smtt.sdk.WebIconDatabase m18971a() {
        /*
            r0 = 0
            return r0
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebIconDatabase.m18971a():com.tencent.smtt.sdk.WebIconDatabase");
    }

    /* JADX WARN: Invalid debug info offset */
    public static WebIconDatabase getInstance() {
        return null;
    }

    public void bulkRequestIconForPageUrl(ContentResolver contentResolver, String str, InterfaceC4105a interfaceC4105a) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void close() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void open(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void releaseIconForPageUrl(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void removeAllIcons() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void requestIconForPageUrl(String str, InterfaceC4105a interfaceC4105a) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void retainIconForPageUrl(String str) {
    }
}
