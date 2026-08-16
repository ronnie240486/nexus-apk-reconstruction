package com.tencent.smtt.sdk;

import android.util.Pair;
import com.tencent.smtt.export.external.interfaces.UrlRequest;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class UrlRequestBuilderImpl extends UrlRequest.Builder {

    /* JADX INFO: renamed from: a */
    private static final String f12909a = "UrlRequestBuilderImpl";

    /* JADX INFO: renamed from: b */
    private final String f12910b;

    /* JADX INFO: renamed from: c */
    private final UrlRequest.Callback f12911c;

    /* JADX INFO: renamed from: d */
    private final Executor f12912d;

    /* JADX INFO: renamed from: e */
    private String f12913e;

    /* JADX INFO: renamed from: f */
    private final ArrayList<Pair<String, String>> f12914f;

    /* JADX INFO: renamed from: g */
    private boolean f12915g;

    /* JADX INFO: renamed from: h */
    private int f12916h;

    /* JADX INFO: renamed from: i */
    private String f12917i;

    /* JADX INFO: renamed from: j */
    private byte[] f12918j;

    /* JADX INFO: renamed from: k */
    private String f12919k;

    /* JADX INFO: renamed from: l */
    private String f12920l;

    /* JADX WARN: Invalid debug info offset */
    public UrlRequestBuilderImpl(String str, UrlRequest.Callback callback, Executor executor) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.UrlRequest.Builder
    public /* bridge */ /* synthetic */ UrlRequest.Builder addHeader(String str, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.UrlRequest.Builder
    public UrlRequestBuilderImpl addHeader(String str, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.UrlRequest.Builder
    public UrlRequest build() throws NullPointerException {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.UrlRequest.Builder
    public /* bridge */ /* synthetic */ UrlRequest.Builder disableCache() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.UrlRequest.Builder
    public UrlRequestBuilderImpl disableCache() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.UrlRequest.Builder
    public /* bridge */ /* synthetic */ UrlRequest.Builder setDns(String str, String str2) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x000b
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // com.tencent.smtt.export.external.interfaces.UrlRequest.Builder
    public com.tencent.smtt.sdk.UrlRequestBuilderImpl setDns(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            r0 = 0
            return r0
        L38:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.UrlRequestBuilderImpl.setDns(java.lang.String, java.lang.String):com.tencent.smtt.sdk.UrlRequestBuilderImpl");
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.UrlRequest.Builder
    public UrlRequest.Builder setHttpMethod(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.UrlRequest.Builder
    public /* bridge */ /* synthetic */ UrlRequest.Builder setPriority(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.UrlRequest.Builder
    public UrlRequestBuilderImpl setPriority(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.UrlRequest.Builder
    public UrlRequest.Builder setRequestBody(String str) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.export.external.interfaces.UrlRequest.Builder
    public UrlRequest.Builder setRequestBodyBytes(byte[] bArr) {
        return null;
    }
}
