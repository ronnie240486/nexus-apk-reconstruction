package com.tencent.smtt.sdk;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class WebStorage {

    /* JADX INFO: renamed from: a */
    private static WebStorage f12934a;

    @Deprecated
    public interface QuotaUpdater {
        void updateQuota(long j);
    }

    /* JADX WARN: Invalid debug info offset */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:4:0x0003
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    /* JADX INFO: renamed from: a */
    private static synchronized com.tencent.smtt.sdk.WebStorage m18973a() {
        /*
            r0 = 0
            return r0
        Lf:
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.WebStorage.m18973a():com.tencent.smtt.sdk.WebStorage");
    }

    /* JADX WARN: Invalid debug info offset */
    public static WebStorage getInstance() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    public void deleteAllData() {
    }

    /* JADX WARN: Invalid debug info offset */
    public void deleteOrigin(String str) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void getOrigins(ValueCallback<Map> valueCallback) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void getQuotaForOrigin(String str, ValueCallback<Long> valueCallback) {
    }

    /* JADX WARN: Invalid debug info offset */
    public void getUsageForOrigin(String str, ValueCallback<Long> valueCallback) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Deprecated
    public void setQuotaForOrigin(String str, long j) {
    }
}
