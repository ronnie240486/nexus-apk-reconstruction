package org.xutils;

import org.xutils.common.Callback;
import org.xutils.http.HttpMethod;
import org.xutils.http.RequestParams;

/* JADX INFO: loaded from: classes.dex */
public interface HttpManager {
    /* JADX INFO: renamed from: a */
    <T> Callback.Cancelable mo26643a(RequestParams requestParams, Callback.CommonCallback<T> commonCallback);

    /* JADX INFO: renamed from: b */
    <T> Callback.Cancelable mo26644b(HttpMethod httpMethod, RequestParams requestParams, Callback.CommonCallback<T> commonCallback);

    /* JADX INFO: renamed from: c */
    <T> T mo26645c(RequestParams requestParams, Class<T> cls) throws Throwable;

    /* JADX INFO: renamed from: d */
    <T> Callback.Cancelable mo26646d(RequestParams requestParams, Callback.CommonCallback<T> commonCallback);

    /* JADX INFO: renamed from: e */
    <T> T mo26647e(RequestParams requestParams, Class<T> cls) throws Throwable;

    /* JADX INFO: renamed from: f */
    <T> T mo26648f(HttpMethod httpMethod, RequestParams requestParams, Callback.TypedCallback<T> typedCallback) throws Throwable;

    /* JADX INFO: renamed from: g */
    <T> T mo26649g(HttpMethod httpMethod, RequestParams requestParams, Class<T> cls) throws Throwable;
}
