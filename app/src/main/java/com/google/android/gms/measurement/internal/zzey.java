package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.MainThread;
import p000.C4391g4;
import p000.e70;

/* JADX INFO: loaded from: classes2.dex */
public final class zzey implements ServiceConnection {
    final /* synthetic */ zzez zza;
    private final String zzb;

    public zzey(zzez zzezVar, String str) {
        this.zza = zzezVar;
        this.zzb = str;
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            C4391g4.m20722a(this.zza.zza, "Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.zzbr zzbrVarZzb = com.google.android.gms.internal.measurement.zzbq.zzb(iBinder);
            if (zzbrVarZzb == null) {
                this.zza.zza.zzay().zzk().zza("Install Referrer Service implementation was not found");
            } else {
                this.zza.zza.zzay().zzj().zza("Install Referrer Service connected");
                this.zza.zza.zzaz().zzp(new zzex(this, zzbrVarZzb, this));
            }
        } catch (RuntimeException e) {
            this.zza.zza.zzay().zzk().zzb("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        e70.m20045a(this.zza.zza, "Install Referrer Service disconnected");
    }
}
