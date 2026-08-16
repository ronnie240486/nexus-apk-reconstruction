package com.tencent.smtt.sdk;

import android.content.Context;
import android.os.Looper;
import com.tencent.smtt.export.external.jscore.interfaces.IX5JsVirtualMachine;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class X5JsCore {

    /* JADX INFO: renamed from: a */
    private static EnumC4116a f13006a;

    /* JADX INFO: renamed from: b */
    private static EnumC4116a f13007b;

    /* JADX INFO: renamed from: c */
    private static EnumC4116a f13008c;

    /* JADX INFO: renamed from: d */
    private final Context f13009d;

    /* JADX INFO: renamed from: e */
    private Object f13010e;

    /* JADX INFO: renamed from: f */
    private WebView f13011f;

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.X5JsCore$a */
    public enum EnumC4116a {
        UNINITIALIZED,
        UNAVAILABLE,
        AVAILABLE
    }

    static {
        EnumC4116a enumC4116a = EnumC4116a.UNINITIALIZED;
        f13006a = enumC4116a;
        f13007b = enumC4116a;
        f13008c = enumC4116a;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public X5JsCore(Context context) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static IX5JsVirtualMachine m19031a(Context context, Looper looper) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static Object m19032a() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0002
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    private static java.lang.Object m19033a(java.lang.String r3, java.lang.Class<?>[] r4, java.lang.Object... r5) {
        /*
            r0 = 0
            return r0
        L1d:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.X5JsCore.m19033a(java.lang.String, java.lang.Class[], java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean canUseX5JsCore(Context context) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean canUseX5JsCoreNewAPI(Context context) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public static boolean canX5JsCoreUseNativeBuffer(Context context) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void addJavascriptInterface(Object obj, String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void destroy() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public ByteBuffer getNativeBuffer(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public int getNativeBufferId() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void pause() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void pauseTimers() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void removeJavascriptInterface(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void resume() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void resumeTimers() {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void setNativeBuffer(int i, ByteBuffer byteBuffer) {
    }
}
