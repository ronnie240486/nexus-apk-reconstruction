package com.tencent.smtt.sdk;

import com.tencent.smtt.export.external.jscore.interfaces.IX5JsValue;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class JsValue {

    /* JADX INFO: renamed from: a */
    private final JsContext f12675a;

    /* JADX INFO: renamed from: b */
    private final IX5JsValue f12676b;

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.JsValue$a */
    public static class C4064a implements IX5JsValue.JsValueFactory {
        /* JADX WARN: Invalid debug info offset */
        private C4064a() {
        }

        /* JADX WARN: Invalid debug info offset */
        public /* synthetic */ C4064a(C40631 c40631) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsValue.JsValueFactory
        public String getJsValueClassName() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsValue.JsValueFactory
        public IX5JsValue unwrap(Object obj) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.jscore.interfaces.IX5JsValue.JsValueFactory
        public Object wrap(IX5JsValue iX5JsValue) {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public JsValue(JsContext jsContext, IX5JsValue iX5JsValue) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static IX5JsValue.JsValueFactory m18855a() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ IX5JsValue m18856a(JsValue jsValue) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    private JsValue m18857a(IX5JsValue iX5JsValue) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public JsValue call(Object... objArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public JsValue construct(Object... objArr) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public JsContext context() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isArray() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isArrayBufferOrArrayBufferView() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isBoolean() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isFunction() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isInteger() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isJavascriptInterface() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isNull() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isNumber() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isObject() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isPromise() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isString() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean isUndefined() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public void reject(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void resolve(Object obj) {
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean toBoolean() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public ByteBuffer toByteBuffer() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int toInteger() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public Object toJavascriptInterface() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Number toNumber() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public <T> T toObject(Class<T> cls) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }
}
