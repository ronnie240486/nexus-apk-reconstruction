package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext;
import com.tencent.smtt.export.external.jscore.interfaces.IX5JsError;
import com.tencent.smtt.export.external.jscore.interfaces.IX5JsValue;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public final class JsContext {

    /* JADX INFO: renamed from: a */
    private final JsVirtualMachine f12667a;

    /* JADX INFO: renamed from: b */
    private final IX5JsContext f12668b;

    /* JADX INFO: renamed from: c */
    private ExceptionHandler f12669c;

    /* JADX INFO: renamed from: d */
    private String f12670d;

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.JsContext$1 */
    public class C40611 implements android.webkit.ValueCallback<IX5JsValue> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ android.webkit.ValueCallback f12671a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ JsContext f12672b;

        /* JADX WARN: Invalid debug info offset */
        public C40611(JsContext jsContext, android.webkit.ValueCallback valueCallback) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public void m18853a(IX5JsValue iX5JsValue) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.webkit.ValueCallback
        public /* synthetic */ void onReceiveValue(IX5JsValue iX5JsValue) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.JsContext$2 */
    public class C40622 implements android.webkit.ValueCallback<IX5JsError> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ JsContext f12673a;

        /* JADX WARN: Invalid debug info offset */
        public C40622(JsContext jsContext) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public void m18854a(IX5JsError iX5JsError) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.webkit.ValueCallback
        public /* synthetic */ void onReceiveValue(IX5JsError iX5JsError) {
        }
    }

    public interface ExceptionHandler {
        void handleException(JsContext jsContext, JsError jsError);
    }

    /* JADX WARN: Invalid debug info offset */
    public JsContext(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x000d
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public JsContext(com.tencent.smtt.sdk.JsVirtualMachine r2) {
        /*
            r1 = this;
            return
        L10:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.JsContext.<init>(com.tencent.smtt.sdk.JsVirtualMachine):void");
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ExceptionHandler m18852a(JsContext jsContext) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public static JsContext current() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void addJavascriptInterface(Object obj, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void destroy() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void evaluateJavascript(String str, android.webkit.ValueCallback<String> valueCallback) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void evaluateJavascript(String str, android.webkit.ValueCallback<String> valueCallback, URL url) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JsValue evaluateScript(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public JsValue evaluateScript(String str, URL url) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void evaluateScriptAsync(String str, android.webkit.ValueCallback<JsValue> valueCallback, URL url) {
    }

    /* JADX WARN: Invalid debug info offset */
    public ExceptionHandler exceptionHandler() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public byte[] getNativeBuffer(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getNativeBufferId() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String name() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void removeJavascriptInterface(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setExceptionHandler(ExceptionHandler exceptionHandler) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setName(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public int setNativeBuffer(int i, byte[] bArr) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void stealValueFromOtherCtx(String str, JsContext jsContext, String str2) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JsVirtualMachine virtualMachine() {
        return null;
    }
}
