package com.tencent.smtt.sdk;

import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.tencent.smtt.export.external.interfaces.ServiceWorkerWebSettings;

/* JADX INFO: renamed from: com.tencent.smtt.sdk.j */
/* JADX INFO: loaded from: classes2.dex */
public class C4126j extends ServiceWorkerController {

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.j$1, reason: invalid class name */
    public class AnonymousClass1 extends ServiceWorkerWebSettings {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ android.webkit.ServiceWorkerWebSettings f13057a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C4126j f13058b;

        /* JADX WARN: Invalid debug info offset */
        public AnonymousClass1(C4126j c4126j, android.webkit.ServiceWorkerWebSettings serviceWorkerWebSettings) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.ServiceWorkerWebSettings
        public boolean getAllowContentAccess() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.ServiceWorkerWebSettings
        public boolean getAllowFileAccess() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.ServiceWorkerWebSettings
        public boolean getBlockNetworkLoads() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.ServiceWorkerWebSettings
        public int getCacheMode() {
            return 0;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.ServiceWorkerWebSettings
        public void setAllowContentAccess(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.ServiceWorkerWebSettings
        public void setAllowFileAccess(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.ServiceWorkerWebSettings
        public void setBlockNetworkLoads(boolean z) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.export.external.interfaces.ServiceWorkerWebSettings
        public void setCacheMode(int i) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.j$2, reason: invalid class name */
    public class AnonymousClass2 extends ServiceWorkerClient {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ com.tencent.smtt.export.external.interfaces.ServiceWorkerClient f13059a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C4126j f13060b;

        /* JADX WARN: Invalid debug info offset */
        public AnonymousClass2(C4126j c4126j, com.tencent.smtt.export.external.interfaces.ServiceWorkerClient serviceWorkerClient) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.webkit.ServiceWorkerClient
        public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.sdk.ServiceWorkerController
    public ServiceWorkerWebSettings getServiceWorkerWebSettings() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // com.tencent.smtt.sdk.ServiceWorkerController
    public void setServiceWorkerClient(com.tencent.smtt.export.external.interfaces.ServiceWorkerClient serviceWorkerClient) {
    }
}
