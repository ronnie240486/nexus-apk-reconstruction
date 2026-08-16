package com.tencent.smtt.export.external.interfaces;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class UrlResponseInfo {

    public static abstract class HeaderBlock {
        public abstract List<Map.Entry<String, String>> getAsList();

        public abstract Map<String, List<String>> getAsMap();
    }

    public abstract Map<String, List<String>> getAllHeaders();

    public abstract List<Map.Entry<String, String>> getAllHeadersAsList();

    public abstract int getHttpStatusCode();

    public abstract String getHttpStatusText();

    public abstract String getNegotiatedProtocol();

    public abstract String getProxyServer();

    public abstract long getReceivedByteCount();

    /* JADX WARN: Invalid debug info offset */
    public Map<String, List<String>> getRequestHeaders() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getServerIP() {
        return null;
    }

    public abstract String getUrl();

    public abstract List<String> getUrlChain();

    public abstract boolean wasCached();
}
