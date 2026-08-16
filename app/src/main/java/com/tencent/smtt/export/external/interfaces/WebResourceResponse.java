package com.tencent.smtt.export.external.interfaces;

import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class WebResourceResponse {
    private String mEncoding;
    private InputStream mInputStream;
    private String mMimeType;
    private String mReasonPhrase;
    private Map<String, String> mResponseHeaders;
    private int mStatusCode;

    /* JADX WARN: Invalid debug info offset */
    public WebResourceResponse() {
    }

    /* JADX WARN: Invalid debug info offset */
    public WebResourceResponse(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    public WebResourceResponse(String str, String str2, InputStream inputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    public InputStream getData() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getEncoding() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getMimeType() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public String getReasonPhrase() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public Map<String, String> getResponseHeaders() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public int getStatusCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public void setData(InputStream inputStream) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setEncoding(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setMimeType(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setResponseHeaders(Map<String, String> map) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void setStatusCodeAndReasonPhrase(int i, String str) {
    }
}
