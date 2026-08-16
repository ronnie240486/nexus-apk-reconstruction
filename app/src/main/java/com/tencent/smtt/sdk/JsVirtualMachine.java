package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Looper;
import com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext;
import com.tencent.smtt.export.external.jscore.interfaces.IX5JsError;
import com.tencent.smtt.export.external.jscore.interfaces.IX5JsValue;
import com.tencent.smtt.export.external.jscore.interfaces.IX5JsVirtualMachine;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class JsVirtualMachine {

    /* JADX INFO: renamed from: a */
    private final Context f12677a;

    /* JADX INFO: renamed from: b */
    private final IX5JsVirtualMachine f12678b;

    /* JADX INFO: renamed from: c */
    private final HashSet<WeakReference<C4065a>> f12679c;

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.JsVirtualMachine$a */
    public static class C4065a implements IX5JsContext {

        /* JADX INFO: renamed from: a */
        private WebView f12680a;

        /* JADX INFO: renamed from: com.tencent.smtt.sdk.JsVirtualMachine$a$1, reason: invalid class name */
        public class AnonymousClass1 implements ValueCallback<String> {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ android.webkit.ValueCallback f12681a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C4065a f12682b;

            /* JADX WARN: Invalid debug info offset */
            public AnonymousClass1(C4065a c4065a, android.webkit.ValueCallback valueCallback) {
            }

            /* JADX WARN: Invalid debug info offset */
            /* JADX INFO: renamed from: a */
            public void m18861a(String str) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // com.tencent.smtt.sdk.ValueCallback, android.webkit.ValueCallback
            public /* synthetic */ void onReceiveValue(Object obj) {
            }
        }

        /* JADX INFO: renamed from: com.tencent.smtt.sdk.JsVirtualMachine$a$2, reason: invalid class name */
        public class AnonymousClass2 implements ValueCallback<String> {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ android.webkit.ValueCallback f12683a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C4065a f12684b;

            /* JADX WARN: Invalid debug info offset */
            public AnonymousClass2(C4065a c4065a, android.webkit.ValueCallback valueCallback) {
            }

            /* JADX WARN: Invalid debug info offset */
            /* JADX INFO: renamed from: a */
            public void m18862a(String str) {
            }

            /* JADX WARN: Invalid debug info offset */
            @Override // com.tencent.smtt.sdk.ValueCallback, android.webkit.ValueCallback
            public /* synthetic */ void onReceiveValue(Object obj) {
            }
        }

        /* JADX WARN: Invalid debug info offset */
        public C4065a(Context context) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: a */
        public void m18859a() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext
        public void addJavascriptInterface(Object obj, String str) {
        }

        /* JADX WARN: Invalid debug info offset */
        /* JADX INFO: renamed from: b */
        public void m18860b() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext
        public void destroy() {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext
        public void evaluateJavascript(String str, android.webkit.ValueCallback<String> valueCallback, URL url) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext
        public IX5JsValue evaluateScript(String str, URL url) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext
        public void evaluateScriptAsync(String str, android.webkit.ValueCallback<IX5JsValue> valueCallback, URL url) {
        }

        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext
        public byte[] getNativeBuffer(int i) {
            return null;
        }

        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext
        public int getNativeBufferId() {
            return -1;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext
        public void removeJavascriptInterface(String str) {
        }

        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext
        public void setExceptionHandler(android.webkit.ValueCallback<IX5JsError> valueCallback) {
        }

        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext
        public void setName(String str) {
        }

        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext
        public int setNativeBuffer(int i, byte[] bArr) {
            return -1;
        }

        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext
        public void setPerContextData(Object obj) {
        }

        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsContext
        public void stealValueFromOtherCtx(String str, IX5JsContext iX5JsContext, String str2) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public JsVirtualMachine(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    public JsVirtualMachine(Context context, Looper looper) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public IX5JsContext m18858a() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void destroy() {
    }

    /* JADX WARN: Invalid debug info offset */
    public Looper getLooper() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isFallback() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void onPause() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void onResume() {
    }
}
