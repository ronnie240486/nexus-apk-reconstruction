package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
final class zzko implements zzla {
    final /* synthetic */ zzkt zza;

    public zzko(zzkt zzktVar) {
        this.zza = zzktVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzla
    public final void zza(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.zza.zzaz().zzp(new zzkn(this, str, "_err", bundle));
            return;
        }
        zzkt zzktVar = this.zza;
        if (zzktVar.zzn != null) {
            zzktVar.zzn.zzay().zzd().zzb("AppId not known when logging event", "_err");
        }
    }
}
