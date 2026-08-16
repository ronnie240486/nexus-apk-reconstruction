package com.tencent.smtt.sdk;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ProxyController {

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.ProxyController$a */
    public static class C4066a {

        /* JADX INFO: renamed from: a */
        static final ProxyController f12692a = new C4121e();
    }

    /* JADX WARN: Invalid debug info offset */
    public static ProxyController getInstance() {
        return null;
    }

    public abstract void clearProxyOverride(Executor executor, Runnable runnable);

    public abstract void setProxyOverride(ProxyConfig proxyConfig, Executor executor, Runnable runnable);
}
