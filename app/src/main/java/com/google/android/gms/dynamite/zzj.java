package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class zzj implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int iZza = iVersions.zza(context, str);
        selectionResult.localVersion = iZza;
        int i = 0;
        int iZzb = iZza != 0 ? iVersions.zzb(context, str, false) : iVersions.zzb(context, str, true);
        selectionResult.remoteVersion = iZzb;
        int i2 = selectionResult.localVersion;
        if (i2 == 0) {
            if (iZzb == 0) {
                selectionResult.selection = 0;
            }
            return selectionResult;
        }
        i = i2;
        if (i >= iZzb) {
            selectionResult.selection = -1;
        } else {
            selectionResult.selection = 1;
        }
        return selectionResult;
    }
}
