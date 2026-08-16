package org.xutils.http;

import java.lang.reflect.Type;
import org.xutils.HttpManager;
import org.xutils.common.Callback;

/* JADX INFO: loaded from: classes.dex */
public final class HttpManagerImpl implements HttpManager {

    /* JADX INFO: renamed from: a */
    public static final Object f18091a = new Object();

    /* JADX INFO: renamed from: b */
    public static volatile HttpManagerImpl f18092b;

    public class DefaultSyncCallback<T> implements Callback.TypedCallback<T> {

        /* JADX INFO: renamed from: a */
        public final Class<T> f18093a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HttpManagerImpl f18094b;

        /* JADX WARN: Invalid debug info offset */
        public DefaultSyncCallback(HttpManagerImpl httpManagerImpl, Class<T> cls) {
        }

        @Override // org.xutils.common.Callback.CommonCallback
        /* JADX INFO: renamed from: a */
        public void mo16802a(Callback.CancelledException cancelledException) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // org.xutils.common.Callback.TypedCallback
        /* JADX INFO: renamed from: b */
        public Type mo26731b() {
            return null;
        }

        @Override // org.xutils.common.Callback.CommonCallback
        /* JADX INFO: renamed from: f */
        public void mo16804f(Throwable th, boolean z) {
        }

        @Override // org.xutils.common.Callback.CommonCallback
        public void onFinished() {
        }

        @Override // org.xutils.common.Callback.CommonCallback
        public void onSuccess(T t) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    private HttpManagerImpl() {
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0007
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: h */
    public static void m27021h() {
        /*
            return
        L13:
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.http.HttpManagerImpl.m27021h():void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.HttpManager
    /* JADX INFO: renamed from: a */
    public <T> Callback.Cancelable mo26643a(RequestParams requestParams, Callback.CommonCallback<T> commonCallback) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.HttpManager
    /* JADX INFO: renamed from: b */
    public <T> Callback.Cancelable mo26644b(HttpMethod httpMethod, RequestParams requestParams, Callback.CommonCallback<T> commonCallback) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.HttpManager
    /* JADX INFO: renamed from: c */
    public <T> T mo26645c(RequestParams requestParams, Class<T> cls) throws Throwable {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.HttpManager
    /* JADX INFO: renamed from: d */
    public <T> Callback.Cancelable mo26646d(RequestParams requestParams, Callback.CommonCallback<T> commonCallback) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.HttpManager
    /* JADX INFO: renamed from: e */
    public <T> T mo26647e(RequestParams requestParams, Class<T> cls) throws Throwable {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.HttpManager
    /* JADX INFO: renamed from: f */
    public <T> T mo26648f(HttpMethod httpMethod, RequestParams requestParams, Callback.TypedCallback<T> typedCallback) throws Throwable {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.HttpManager
    /* JADX INFO: renamed from: g */
    public <T> T mo26649g(HttpMethod httpMethod, RequestParams requestParams, Class<T> cls) throws Throwable {
        return null;
    }
}
