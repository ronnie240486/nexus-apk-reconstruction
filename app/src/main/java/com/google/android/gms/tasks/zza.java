package com.google.android.gms.tasks;

/* JADX INFO: loaded from: classes2.dex */
final class zza implements OnSuccessListener<Void> {
    final /* synthetic */ OnTokenCanceledListener zza;

    public zza(zzb zzbVar, OnTokenCanceledListener onTokenCanceledListener) {
        this.zza = onTokenCanceledListener;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* bridge */ /* synthetic */ void onSuccess(Void r1) {
        this.zza.onCanceled();
    }
}
