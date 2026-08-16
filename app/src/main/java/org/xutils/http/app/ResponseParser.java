package org.xutils.http.app;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public interface ResponseParser<ResponseDataType> extends RequestInterceptListener {
    /* JADX INFO: renamed from: b */
    Object m27108b(Type type, Class<?> cls, ResponseDataType responsedatatype) throws Throwable;
}
