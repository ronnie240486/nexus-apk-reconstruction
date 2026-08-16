package org.httpd.protocols.http.request;

/* JADX INFO: loaded from: classes2.dex */
public enum Method {
    GET,
    PUT,
    POST,
    DELETE,
    HEAD,
    OPTIONS,
    TRACE,
    CONNECT,
    PATCH,
    PROPFIND,
    PROPPATCH,
    MKCOL,
    MOVE,
    COPY,
    LOCK,
    UNLOCK,
    NOTIFY,
    SUBSCRIBE;

    public static Method lookup(String str) {
        if (str == null) {
            return null;
        }
        try {
            return valueOf(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
