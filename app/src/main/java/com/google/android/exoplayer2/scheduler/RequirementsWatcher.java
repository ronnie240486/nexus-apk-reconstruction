package com.google.android.exoplayer2.scheduler;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import p000.C1311UN;
import p000.C1506XN;
import p000.C1569YN;
import p000.C1637ZN;

/* JADX INFO: loaded from: classes2.dex */
public final class RequirementsWatcher {
    private final Context context;
    private final Handler handler = new Handler(Util.getLooper());
    private final Listener listener;

    @Nullable
    private NetworkCallback networkCallback;
    private int notMetRequirements;

    @Nullable
    private DeviceStatusChangeReceiver receiver;
    private final Requirements requirements;

    public class DeviceStatusChangeReceiver extends BroadcastReceiver {
        private DeviceStatusChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            RequirementsWatcher.this.checkRequirements();
        }
    }

    public interface Listener {
        void onRequirementsStateChanged(RequirementsWatcher requirementsWatcher, int i);
    }

    @RequiresApi(24)
    public final class NetworkCallback extends ConnectivityManager.NetworkCallback {
        private boolean networkValidated;
        private boolean receivedCapabilitiesChange;

        private NetworkCallback() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$postCheckRequirements$0() {
            if (RequirementsWatcher.this.networkCallback != null) {
                RequirementsWatcher.this.checkRequirements();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$postRecheckNotMetNetworkRequirements$1() {
            if (RequirementsWatcher.this.networkCallback != null) {
                RequirementsWatcher.this.recheckNotMetNetworkRequirements();
            }
        }

        private void postCheckRequirements() {
            RequirementsWatcher.this.handler.post(new Runnable() { // from class: com.google.android.exoplayer2.scheduler.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11105a.lambda$postCheckRequirements$0();
                }
            });
        }

        private void postRecheckNotMetNetworkRequirements() {
            RequirementsWatcher.this.handler.post(new Runnable() { // from class: com.google.android.exoplayer2.scheduler.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11106a.lambda$postRecheckNotMetNetworkRequirements$1();
                }
            });
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            postCheckRequirements();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean z) {
            if (z) {
                return;
            }
            postRecheckNotMetNetworkRequirements();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean zM6261a = C1311UN.m6261a(networkCapabilities, 16);
            if (this.receivedCapabilitiesChange && this.networkValidated == zM6261a) {
                if (zM6261a) {
                    postRecheckNotMetNetworkRequirements();
                }
            } else {
                this.receivedCapabilitiesChange = true;
                this.networkValidated = zM6261a;
                postCheckRequirements();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            postCheckRequirements();
        }
    }

    public RequirementsWatcher(Context context, Listener listener, Requirements requirements) {
        this.context = context.getApplicationContext();
        this.listener = listener;
        this.requirements = requirements;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkRequirements() {
        int notMetRequirements = this.requirements.getNotMetRequirements(this.context);
        if (this.notMetRequirements != notMetRequirements) {
            this.notMetRequirements = notMetRequirements;
            this.listener.onRequirementsStateChanged(this, notMetRequirements);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void recheckNotMetNetworkRequirements() {
        if ((this.notMetRequirements & 3) == 0) {
            return;
        }
        checkRequirements();
    }

    @TargetApi(24)
    private void registerNetworkCallbackV24() {
        ConnectivityManager connectivityManager = (ConnectivityManager) Assertions.checkNotNull((ConnectivityManager) this.context.getSystemService("connectivity"));
        NetworkCallback networkCallback = new NetworkCallback();
        this.networkCallback = networkCallback;
        C1637ZN.m8678a(connectivityManager, networkCallback);
    }

    @TargetApi(24)
    private void unregisterNetworkCallbackV24() {
        C1569YN.m8123a((ConnectivityManager) this.context.getSystemService("connectivity"), C1506XN.m7067a(Assertions.checkNotNull(this.networkCallback)));
        this.networkCallback = null;
    }

    public Requirements getRequirements() {
        return this.requirements;
    }

    public int start() {
        String str;
        this.notMetRequirements = this.requirements.getNotMetRequirements(this.context);
        IntentFilter intentFilter = new IntentFilter();
        if (this.requirements.isNetworkRequired()) {
            if (Util.SDK_INT >= 24) {
                registerNetworkCallbackV24();
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.requirements.isChargingRequired()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.requirements.isIdleRequired()) {
            if (Util.SDK_INT >= 23) {
                str = "android.os.action.DEVICE_IDLE_MODE_CHANGED";
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                str = "android.intent.action.SCREEN_OFF";
            }
            intentFilter.addAction(str);
        }
        DeviceStatusChangeReceiver deviceStatusChangeReceiver = new DeviceStatusChangeReceiver();
        this.receiver = deviceStatusChangeReceiver;
        this.context.registerReceiver(deviceStatusChangeReceiver, intentFilter, null, this.handler);
        return this.notMetRequirements;
    }

    public void stop() {
        this.context.unregisterReceiver((BroadcastReceiver) Assertions.checkNotNull(this.receiver));
        this.receiver = null;
        if (Util.SDK_INT < 24 || this.networkCallback == null) {
            return;
        }
        unregisterNetworkCallbackV24();
    }
}
