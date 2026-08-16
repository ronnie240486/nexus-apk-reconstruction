package info.guardianproject.netcipher.proxy;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public interface StatusCallback {
    void onDisabled();

    void onEnabled(Intent intent);

    void onNotYetInstalled();

    void onStarting();

    void onStatusTimeout();

    void onStopping();
}
