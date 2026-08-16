package org.xutils.http.loader;

import org.xutils.cache.DiskCacheEntity;
import org.xutils.http.ProgressHandler;
import org.xutils.http.RequestParams;
import org.xutils.http.request.UriRequest;

/* JADX INFO: loaded from: classes.dex */
public abstract class Loader<T> {

    /* JADX INFO: renamed from: a */
    public ProgressHandler f18217a;

    /* JADX INFO: renamed from: a */
    public abstract T mo27130a(UriRequest uriRequest) throws Throwable;

    /* JADX INFO: renamed from: b */
    public abstract T mo27131b(DiskCacheEntity diskCacheEntity) throws Throwable;

    /* JADX INFO: renamed from: c */
    public abstract Loader<T> mo27132c();

    /* JADX INFO: renamed from: d */
    public abstract void mo27133d(UriRequest uriRequest);

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: e */
    public void m27154e(UriRequest uriRequest, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: f */
    public final void m27155f(UriRequest uriRequest, String str, byte[] bArr) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: g */
    public void m27156g(UriRequest uriRequest, String str) {
    }

    /* JADX INFO: renamed from: h */
    public void mo27140h(RequestParams requestParams) {
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: i */
    public void m27157i(ProgressHandler progressHandler) {
    }
}
