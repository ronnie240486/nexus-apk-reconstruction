package org.xutils.http.loader;

import java.lang.reflect.Type;
import org.xutils.cache.DiskCacheEntity;
import org.xutils.http.RequestParams;
import org.xutils.http.app.ResponseParser;
import org.xutils.http.request.UriRequest;

/* JADX INFO: loaded from: classes.dex */
class ObjectLoader extends Loader<Object> {

    /* JADX INFO: renamed from: b */
    public final Type f18219b;

    /* JADX INFO: renamed from: c */
    public final Class<?> f18220c;

    /* JADX INFO: renamed from: d */
    public final ResponseParser f18221d;

    /* JADX INFO: renamed from: e */
    public final Loader<?> f18222e;

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:3:0x0067
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public ObjectLoader(java.lang.reflect.Type r6) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xutils.http.loader.ObjectLoader.<init>(java.lang.reflect.Type):void");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.loader.Loader
    /* JADX INFO: renamed from: a */
    public Object mo27130a(UriRequest uriRequest) throws Throwable {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.loader.Loader
    /* JADX INFO: renamed from: b */
    public Object mo27131b(DiskCacheEntity diskCacheEntity) throws Throwable {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.loader.Loader
    /* JADX INFO: renamed from: c */
    public Loader<Object> mo27132c() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.loader.Loader
    /* JADX INFO: renamed from: d */
    public void mo27133d(UriRequest uriRequest) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.xutils.http.loader.Loader
    /* JADX INFO: renamed from: h */
    public void mo27140h(RequestParams requestParams) {
    }
}
