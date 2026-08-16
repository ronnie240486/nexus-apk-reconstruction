package org.xutils.http.app;

import javax.net.ssl.SSLSocketFactory;
import org.xutils.http.RequestParams;
import org.xutils.http.annotation.HttpRequest;

/* JADX INFO: loaded from: classes.dex */
public interface ParamsBuilder {
    /* JADX INFO: renamed from: a */
    void mo27098a(RequestParams requestParams, String[] strArr) throws Throwable;

    /* JADX INFO: renamed from: b */
    String mo27099b(RequestParams requestParams, String[] strArr);

    /* JADX INFO: renamed from: c */
    String mo27100c(RequestParams requestParams, HttpRequest httpRequest) throws Throwable;

    /* JADX INFO: renamed from: d */
    SSLSocketFactory mo27101d() throws Throwable;

    /* JADX INFO: renamed from: e */
    void mo27102e(RequestParams requestParams) throws Throwable;
}
