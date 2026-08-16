package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.export.external.interfaces.IX5CoreServiceWorkerController;
import com.tencent.smtt.export.external.interfaces.ServiceWorkerClient;
import com.tencent.smtt.export.external.interfaces.ServiceWorkerWebSettings;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ServiceWorkerController {

    /* JADX INFO: renamed from: com.tencent.smtt.sdk.ServiceWorkerController$1 */
    public static class C40731 extends ServiceWorkerController {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ IX5CoreServiceWorkerController f12746a;

        /* JADX WARN: Invalid debug info offset */
        public C40731(IX5CoreServiceWorkerController iX5CoreServiceWorkerController) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.ServiceWorkerController
        public ServiceWorkerWebSettings getServiceWorkerWebSettings() {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // com.tencent.smtt.sdk.ServiceWorkerController
        public void setServiceWorkerClient(ServiceWorkerClient serviceWorkerClient) {
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public static ServiceWorkerController getInstance(Context context) {
        return null;
    }

    public abstract ServiceWorkerWebSettings getServiceWorkerWebSettings();

    public abstract void setServiceWorkerClient(ServiceWorkerClient serviceWorkerClient);
}
