package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzle implements zzly {
    private static final zzlk zza = new zzlc();
    private final zzlk zzb;

    public zzle() {
        zzlk zzlkVar;
        zzka zzkaVarZza = zzka.zza();
        try {
            zzlkVar = (zzlk) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            zzlkVar = zza;
        }
        zzld zzldVar = new zzld(zzkaVarZza, zzlkVar);
        zzkn.zzf(zzldVar, "messageInfoFactory");
        this.zzb = zzldVar;
    }

    private static boolean zzb(zzlj zzljVar) {
        return zzljVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzly
    public final zzlx zza(Class cls) {
        zzlr zzlrVarZza;
        zzla zzlaVarZzc;
        zzmo zzmoVarZzA;
        zzjs zzjsVarZza;
        zzlh zzlhVarZza;
        zzmo zzmoVarZzz;
        zzjs zzjsVarZza2;
        zzlz.zzG(cls);
        zzlj zzljVarZzb = this.zzb.zzb(cls);
        if (zzljVarZzb.zzb()) {
            if (zzkf.class.isAssignableFrom(cls)) {
                zzmoVarZzz = zzlz.zzB();
                zzjsVarZza2 = zzju.zzb();
            } else {
                zzmoVarZzz = zzlz.zzz();
                zzjsVarZza2 = zzju.zza();
            }
            return zzlq.zzc(zzmoVarZzz, zzjsVarZza2, zzljVarZzb.zza());
        }
        if (zzkf.class.isAssignableFrom(cls)) {
            boolean zZzb = zzb(zzljVarZzb);
            zzlrVarZza = zzls.zzb();
            zzlaVarZzc = zzla.zzd();
            zzmoVarZzA = zzlz.zzB();
            zzjsVarZza = zZzb ? zzju.zzb() : null;
            zzlhVarZza = zzli.zzb();
        } else {
            boolean zZzb2 = zzb(zzljVarZzb);
            zzlrVarZza = zzls.zza();
            zzlaVarZzc = zzla.zzc();
            if (zZzb2) {
                zzmoVarZzA = zzlz.zzz();
                zzjsVarZza = zzju.zza();
            } else {
                zzmoVarZzA = zzlz.zzA();
                zzjsVarZza = null;
            }
            zzlhVarZza = zzli.zza();
        }
        return zzlp.zzl(cls, zzljVarZzb, zzlrVarZza, zzlaVarZzc, zzmoVarZzA, zzjsVarZza, zzlhVarZza);
    }
}
