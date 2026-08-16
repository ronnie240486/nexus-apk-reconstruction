package org.xutils.http;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class RequestParamsHelper {

    /* JADX INFO: renamed from: a */
    public static final ClassLoader f18156a = String.class.getClassLoader();

    /* JADX INFO: renamed from: org.xutils.http.RequestParamsHelper$1 */
    public static class C51281 implements ParseKVListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ JSONObject f18157a;

        /* JADX WARN: Invalid debug info offset */
        public C51281(JSONObject jSONObject) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xutils.http.RequestParamsHelper.ParseKVListener
        /* JADX INFO: renamed from: a */
        public void mo27086a(String str, Object obj) {
        }
    }

    public interface ParseKVListener {
        /* JADX INFO: renamed from: a */
        void mo27086a(String str, Object obj);
    }

    /* JADX WARN: Invalid debug info offset */
    private RequestParamsHelper() {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: a */
    public static Object m27087a(Object obj) throws JSONException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0046
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: b */
    public static void m27088b(java.lang.Object r7, java.lang.Class<?> r8, org.xutils.http.RequestParamsHelper.ParseKVListener r9) {
        /*
            return
        L53:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.http.RequestParamsHelper.m27088b(java.lang.Object, java.lang.Class, org.xutils.http.RequestParamsHelper$ParseKVListener):void");
    }
}
