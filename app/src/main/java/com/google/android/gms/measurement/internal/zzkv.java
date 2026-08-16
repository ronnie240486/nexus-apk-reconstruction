package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzll;
import com.google.android.gms.internal.measurement.zzpd;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.apache.commons.p013io.IOUtils;
import org.dom4j.p020io.OutputFormat;
import org.slf4j.impl.AndroidLoggerFactory;
import p000.C0305Ec;
import p000.C4327f4;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes2.dex */
public final class zzkv extends zzkh {
    public zzkv(zzkt zzktVar) {
        super(zzktVar);
    }

    @WorkerThread
    public static final boolean zzA(zzaw zzawVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzawVar);
        Preconditions.checkNotNull(zzqVar);
        return (TextUtils.isEmpty(zzqVar.zzb) && TextUtils.isEmpty(zzqVar.zzq)) ? false : true;
    }

    public static final com.google.android.gms.internal.measurement.zzfx zzB(com.google.android.gms.internal.measurement.zzft zzftVar, String str) {
        for (com.google.android.gms.internal.measurement.zzfx zzfxVar : zzftVar.zzi()) {
            if (zzfxVar.zzg().equals(str)) {
                return zzfxVar;
            }
        }
        return null;
    }

    public static final Object zzC(com.google.android.gms.internal.measurement.zzft zzftVar, String str) {
        com.google.android.gms.internal.measurement.zzfx zzfxVarZzB = zzB(zzftVar, str);
        if (zzfxVarZzB == null) {
            return null;
        }
        if (zzfxVarZzB.zzy()) {
            return zzfxVarZzB.zzh();
        }
        if (zzfxVarZzB.zzw()) {
            return Long.valueOf(zzfxVarZzB.zzd());
        }
        if (zzfxVarZzB.zzu()) {
            return Double.valueOf(zzfxVarZzB.zza());
        }
        if (zzfxVarZzB.zzc() <= 0) {
            return null;
        }
        List<com.google.android.gms.internal.measurement.zzfx> listZzi = zzfxVarZzB.zzi();
        ArrayList arrayList = new ArrayList();
        for (com.google.android.gms.internal.measurement.zzfx zzfxVar : listZzi) {
            if (zzfxVar != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.zzfx zzfxVar2 : zzfxVar.zzi()) {
                    if (zzfxVar2.zzy()) {
                        bundle.putString(zzfxVar2.zzg(), zzfxVar2.zzh());
                    } else if (zzfxVar2.zzw()) {
                        bundle.putLong(zzfxVar2.zzg(), zzfxVar2.zzd());
                    } else if (zzfxVar2.zzu()) {
                        bundle.putDouble(zzfxVar2.zzg(), zzfxVar2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private final void zzD(StringBuilder sb, int i, List list) {
        if (list == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzfx zzfxVar = (com.google.android.gms.internal.measurement.zzfx) it.next();
            if (zzfxVar != null) {
                zzF(sb, i2);
                sb.append("param {\n");
                zzI(sb, i2, "name", zzfxVar.zzx() ? this.zzt.zzj().zze(zzfxVar.zzg()) : null);
                zzI(sb, i2, "string_value", zzfxVar.zzy() ? zzfxVar.zzh() : null);
                zzI(sb, i2, "int_value", zzfxVar.zzw() ? Long.valueOf(zzfxVar.zzd()) : null);
                zzI(sb, i2, "double_value", zzfxVar.zzu() ? Double.valueOf(zzfxVar.zza()) : null);
                if (zzfxVar.zzc() > 0) {
                    zzD(sb, i2, zzfxVar.zzi());
                }
                zzF(sb, i2);
                sb.append("}\n");
            }
        }
    }

    private final void zzE(StringBuilder sb, int i, com.google.android.gms.internal.measurement.zzem zzemVar) {
        String str;
        if (zzemVar == null) {
            return;
        }
        zzF(sb, i);
        sb.append("filter {\n");
        if (zzemVar.zzh()) {
            zzI(sb, i, "complement", Boolean.valueOf(zzemVar.zzg()));
        }
        if (zzemVar.zzj()) {
            zzI(sb, i, "param_name", this.zzt.zzj().zze(zzemVar.zze()));
        }
        if (zzemVar.zzk()) {
            int i2 = i + 1;
            com.google.android.gms.internal.measurement.zzey zzeyVarZzd = zzemVar.zzd();
            if (zzeyVarZzd != null) {
                zzF(sb, i2);
                sb.append("string_filter {\n");
                if (zzeyVarZzd.zzi()) {
                    switch (zzeyVarZzd.zzj()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    zzI(sb, i2, "match_type", str);
                }
                if (zzeyVarZzd.zzh()) {
                    zzI(sb, i2, "expression", zzeyVarZzd.zzd());
                }
                if (zzeyVarZzd.zzg()) {
                    zzI(sb, i2, "case_sensitive", Boolean.valueOf(zzeyVarZzd.zzf()));
                }
                if (zzeyVarZzd.zza() > 0) {
                    zzF(sb, i + 2);
                    sb.append("expression_list {\n");
                    for (String str2 : zzeyVarZzd.zze()) {
                        zzF(sb, i + 3);
                        sb.append(str2);
                        sb.append(IOUtils.f15646e);
                    }
                    sb.append("}\n");
                }
                zzF(sb, i2);
                sb.append("}\n");
            }
        }
        if (zzemVar.zzi()) {
            zzJ(sb, i + 1, "number_filter", zzemVar.zzc());
        }
        zzF(sb, i);
        sb.append("}\n");
    }

    private static final void zzF(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(OutputFormat.f16582n);
        }
    }

    private static final String zzG(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    private static final void zzH(StringBuilder sb, int i, String str, com.google.android.gms.internal.measurement.zzgi zzgiVar) {
        if (zzgiVar == null) {
            return;
        }
        zzF(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (zzgiVar.zzb() != 0) {
            zzF(sb, 4);
            sb.append("results: ");
            int i2 = 0;
            for (Long l : zzgiVar.zzk()) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i2 = i3;
            }
            sb.append('\n');
        }
        if (zzgiVar.zzd() != 0) {
            zzF(sb, 4);
            sb.append("status: ");
            int i4 = 0;
            for (Long l2 : zzgiVar.zzn()) {
                int i5 = i4 + 1;
                if (i4 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i4 = i5;
            }
            sb.append('\n');
        }
        if (zzgiVar.zza() != 0) {
            zzF(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i6 = 0;
            for (com.google.android.gms.internal.measurement.zzfr zzfrVar : zzgiVar.zzj()) {
                int i7 = i6 + 1;
                if (i6 != 0) {
                    sb.append(", ");
                }
                sb.append(zzfrVar.zzh() ? Integer.valueOf(zzfrVar.zza()) : null);
                sb.append(":");
                sb.append(zzfrVar.zzg() ? Long.valueOf(zzfrVar.zzb()) : null);
                i6 = i7;
            }
            sb.append("}\n");
        }
        if (zzgiVar.zzc() != 0) {
            zzF(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i8 = 0;
            for (com.google.android.gms.internal.measurement.zzgk zzgkVar : zzgiVar.zzm()) {
                int i9 = i8 + 1;
                if (i8 != 0) {
                    sb.append(", ");
                }
                sb.append(zzgkVar.zzi() ? Integer.valueOf(zzgkVar.zzb()) : null);
                sb.append(": [");
                Iterator it = zzgkVar.zzf().iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i11 = i10 + 1;
                    if (i10 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i10 = i11;
                }
                sb.append("]");
                i8 = i9;
            }
            sb.append("}\n");
        }
        zzF(sb, 3);
        sb.append("}\n");
    }

    private static final void zzI(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        zzF(sb, i + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    private static final void zzJ(StringBuilder sb, int i, String str, com.google.android.gms.internal.measurement.zzer zzerVar) {
        String str2;
        if (zzerVar == null) {
            return;
        }
        zzF(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (zzerVar.zzg()) {
            int iZzm = zzerVar.zzm();
            if (iZzm == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iZzm == 2) {
                str2 = "LESS_THAN";
            } else if (iZzm != 3) {
                str2 = iZzm != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            zzI(sb, i, "comparison_type", str2);
        }
        if (zzerVar.zzi()) {
            zzI(sb, i, "match_as_float", Boolean.valueOf(zzerVar.zzf()));
        }
        if (zzerVar.zzh()) {
            zzI(sb, i, "comparison_value", zzerVar.zzc());
        }
        if (zzerVar.zzk()) {
            zzI(sb, i, "min_comparison_value", zzerVar.zze());
        }
        if (zzerVar.zzj()) {
            zzI(sb, i, "max_comparison_value", zzerVar.zzd());
        }
        zzF(sb, i);
        sb.append("}\n");
    }

    public static int zza(com.google.android.gms.internal.measurement.zzgc zzgcVar, String str) {
        for (int i = 0; i < zzgcVar.zzb(); i++) {
            if (str.equals(zzgcVar.zzao(i).zzf())) {
                return i;
            }
        }
        return -1;
    }

    public static zzll zzl(zzll zzllVar, byte[] bArr) throws com.google.android.gms.internal.measurement.zzkp {
        com.google.android.gms.internal.measurement.zzjr zzjrVarZza = com.google.android.gms.internal.measurement.zzjr.zza();
        return zzjrVarZza != null ? zzllVar.zzay(bArr, zzjrVarZza) : zzllVar.zzax(bArr);
    }

    public static List zzr(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static boolean zzv(List list, int i) {
        if (i < list.size() * 64) {
            return ((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static boolean zzx(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static final void zzz(com.google.android.gms.internal.measurement.zzfs zzfsVar, String str, Object obj) {
        List listZzp = zzfsVar.zzp();
        int i = 0;
        while (true) {
            if (i >= listZzp.size()) {
                i = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.zzfx) listZzp.get(i)).zzg())) {
                break;
            } else {
                i++;
            }
        }
        com.google.android.gms.internal.measurement.zzfw zzfwVarZze = com.google.android.gms.internal.measurement.zzfx.zze();
        zzfwVarZze.zzj(str);
        if (obj instanceof Long) {
            zzfwVarZze.zzi(((Long) obj).longValue());
        }
        if (i >= 0) {
            zzfsVar.zzj(i, zzfwVarZze);
        } else {
            zzfsVar.zze(zzfwVarZze);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzkh
    public final boolean zzb() {
        return false;
    }

    @WorkerThread
    public final long zzd(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        this.zzt.zzv().zzg();
        MessageDigest messageDigestZzF = zzlb.zzF();
        if (messageDigestZzF != null) {
            return zzlb.zzp(messageDigestZzF.digest(bArr));
        }
        C4327f4.m20229a(this.zzt, "Failed to get MD5");
        return 0L;
    }

    public final Bundle zzf(Map map, boolean z) {
        String string;
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                string = null;
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                string = obj.toString();
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(zzf((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
            bundle.putString(str, string);
        }
        return bundle;
    }

    public final Parcelable zzh(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (SafeParcelReader.ParseException unused) {
            this.zzt.zzay().zzd().zza("Failed to load parcelable from buffer");
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    public final zzaw zzi(com.google.android.gms.internal.measurement.zzaa zzaaVar) {
        Object obj;
        Bundle bundleZzf = zzf(zzaaVar.zze(), true);
        String string = (!bundleZzf.containsKey("_o") || (obj = bundleZzf.get("_o")) == null) ? "app" : obj.toString();
        String strZzb = zzgo.zzb(zzaaVar.zzd());
        if (strZzb == null) {
            strZzb = zzaaVar.zzd();
        }
        return new zzaw(strZzb, new zzau(bundleZzf), string, zzaaVar.zza());
    }

    public final com.google.android.gms.internal.measurement.zzft zzj(zzar zzarVar) {
        com.google.android.gms.internal.measurement.zzfs zzfsVarZze = com.google.android.gms.internal.measurement.zzft.zze();
        zzfsVarZze.zzl(zzarVar.zze);
        zzat zzatVar = new zzat(zzarVar.zzf);
        while (zzatVar.hasNext()) {
            String next = zzatVar.next();
            com.google.android.gms.internal.measurement.zzfw zzfwVarZze = com.google.android.gms.internal.measurement.zzfx.zze();
            zzfwVarZze.zzj(next);
            Object objZzf = zzarVar.zzf.zzf(next);
            Preconditions.checkNotNull(objZzf);
            zzt(zzfwVarZze, objZzf);
            zzfsVarZze.zze(zzfwVarZze);
        }
        return (com.google.android.gms.internal.measurement.zzft) zzfsVarZze.zzaC();
    }

    public final String zzm(com.google.android.gms.internal.measurement.zzgb zzgbVar) {
        if (zzgbVar == null) {
            return "";
        }
        StringBuilder sbM1657a = C0305Ec.m1657a("\nbatch {\n");
        for (com.google.android.gms.internal.measurement.zzgd zzgdVar : zzgbVar.zzd()) {
            if (zzgdVar != null) {
                zzF(sbM1657a, 1);
                sbM1657a.append("bundle {\n");
                if (zzgdVar.zzbj()) {
                    zzI(sbM1657a, 1, "protocol_version", Integer.valueOf(zzgdVar.zzd()));
                }
                zzpd.zzc();
                if (this.zzt.zzf().zzs(null, zzdu.zzal) && this.zzt.zzf().zzs(zzgdVar.zzx(), zzdu.zzan) && zzgdVar.zzbm()) {
                    zzI(sbM1657a, 1, "session_stitching_token", zzgdVar.zzK());
                }
                zzI(sbM1657a, 1, "platform", zzgdVar.zzI());
                if (zzgdVar.zzbf()) {
                    zzI(sbM1657a, 1, "gmp_version", Long.valueOf(zzgdVar.zzm()));
                }
                if (zzgdVar.zzbq()) {
                    zzI(sbM1657a, 1, "uploading_gmp_version", Long.valueOf(zzgdVar.zzr()));
                }
                if (zzgdVar.zzbd()) {
                    zzI(sbM1657a, 1, "dynamite_version", Long.valueOf(zzgdVar.zzj()));
                }
                if (zzgdVar.zzba()) {
                    zzI(sbM1657a, 1, "config_version", Long.valueOf(zzgdVar.zzh()));
                }
                zzI(sbM1657a, 1, "gmp_app_id", zzgdVar.zzF());
                zzI(sbM1657a, 1, "admob_app_id", zzgdVar.zzw());
                zzI(sbM1657a, 1, "app_id", zzgdVar.zzx());
                zzI(sbM1657a, 1, "app_version", zzgdVar.zzA());
                if (zzgdVar.zzaY()) {
                    zzI(sbM1657a, 1, "app_version_major", Integer.valueOf(zzgdVar.zza()));
                }
                zzI(sbM1657a, 1, "firebase_instance_id", zzgdVar.zzE());
                if (zzgdVar.zzbc()) {
                    zzI(sbM1657a, 1, "dev_cert_hash", Long.valueOf(zzgdVar.zzi()));
                }
                zzI(sbM1657a, 1, "app_store", zzgdVar.zzz());
                if (zzgdVar.zzbp()) {
                    zzI(sbM1657a, 1, "upload_timestamp_millis", Long.valueOf(zzgdVar.zzq()));
                }
                if (zzgdVar.zzbn()) {
                    zzI(sbM1657a, 1, "start_timestamp_millis", Long.valueOf(zzgdVar.zzp()));
                }
                if (zzgdVar.zzbe()) {
                    zzI(sbM1657a, 1, "end_timestamp_millis", Long.valueOf(zzgdVar.zzk()));
                }
                if (zzgdVar.zzbi()) {
                    zzI(sbM1657a, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzgdVar.zzo()));
                }
                if (zzgdVar.zzbh()) {
                    zzI(sbM1657a, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzgdVar.zzn()));
                }
                zzI(sbM1657a, 1, "app_instance_id", zzgdVar.zzy());
                zzI(sbM1657a, 1, "resettable_device_id", zzgdVar.zzJ());
                zzI(sbM1657a, 1, "ds_id", zzgdVar.zzD());
                if (zzgdVar.zzbg()) {
                    zzI(sbM1657a, 1, "limited_ad_tracking", Boolean.valueOf(zzgdVar.zzaW()));
                }
                zzI(sbM1657a, 1, "os_version", zzgdVar.zzH());
                zzI(sbM1657a, 1, "device_model", zzgdVar.zzC());
                zzI(sbM1657a, 1, "user_default_language", zzgdVar.zzL());
                if (zzgdVar.zzbo()) {
                    zzI(sbM1657a, 1, "time_zone_offset_minutes", Integer.valueOf(zzgdVar.zzf()));
                }
                if (zzgdVar.zzaZ()) {
                    zzI(sbM1657a, 1, "bundle_sequential_index", Integer.valueOf(zzgdVar.zzb()));
                }
                if (zzgdVar.zzbl()) {
                    zzI(sbM1657a, 1, "service_upload", Boolean.valueOf(zzgdVar.zzaX()));
                }
                zzI(sbM1657a, 1, "health_monitor", zzgdVar.zzG());
                if (zzgdVar.zzbk()) {
                    zzI(sbM1657a, 1, IjkMediaPlayer.OnNativeInvokeListener.ARG_RETRY_COUNTER, Integer.valueOf(zzgdVar.zze()));
                }
                if (zzgdVar.zzbb()) {
                    zzI(sbM1657a, 1, "consent_signals", zzgdVar.zzB());
                }
                List<com.google.android.gms.internal.measurement.zzgm> listZzO = zzgdVar.zzO();
                if (listZzO != null) {
                    for (com.google.android.gms.internal.measurement.zzgm zzgmVar : listZzO) {
                        if (zzgmVar != null) {
                            zzF(sbM1657a, 2);
                            sbM1657a.append("user_property {\n");
                            zzI(sbM1657a, 2, "set_timestamp_millis", zzgmVar.zzs() ? Long.valueOf(zzgmVar.zzc()) : null);
                            zzI(sbM1657a, 2, "name", this.zzt.zzj().zzf(zzgmVar.zzf()));
                            zzI(sbM1657a, 2, "string_value", zzgmVar.zzg());
                            zzI(sbM1657a, 2, "int_value", zzgmVar.zzr() ? Long.valueOf(zzgmVar.zzb()) : null);
                            zzI(sbM1657a, 2, "double_value", zzgmVar.zzq() ? Double.valueOf(zzgmVar.zza()) : null);
                            zzF(sbM1657a, 2);
                            sbM1657a.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzfp> listZzM = zzgdVar.zzM();
                if (listZzM != null) {
                    for (com.google.android.gms.internal.measurement.zzfp zzfpVar : listZzM) {
                        if (zzfpVar != null) {
                            zzF(sbM1657a, 2);
                            sbM1657a.append("audience_membership {\n");
                            if (zzfpVar.zzk()) {
                                zzI(sbM1657a, 2, "audience_id", Integer.valueOf(zzfpVar.zza()));
                            }
                            if (zzfpVar.zzm()) {
                                zzI(sbM1657a, 2, "new_audience", Boolean.valueOf(zzfpVar.zzj()));
                            }
                            zzH(sbM1657a, 2, "current_data", zzfpVar.zzd());
                            if (zzfpVar.zzn()) {
                                zzH(sbM1657a, 2, "previous_data", zzfpVar.zze());
                            }
                            zzF(sbM1657a, 2);
                            sbM1657a.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzft> listZzN = zzgdVar.zzN();
                if (listZzN != null) {
                    for (com.google.android.gms.internal.measurement.zzft zzftVar : listZzN) {
                        if (zzftVar != null) {
                            zzF(sbM1657a, 2);
                            sbM1657a.append("event {\n");
                            zzI(sbM1657a, 2, "name", this.zzt.zzj().zzd(zzftVar.zzh()));
                            if (zzftVar.zzu()) {
                                zzI(sbM1657a, 2, "timestamp_millis", Long.valueOf(zzftVar.zzd()));
                            }
                            if (zzftVar.zzt()) {
                                zzI(sbM1657a, 2, "previous_timestamp_millis", Long.valueOf(zzftVar.zzc()));
                            }
                            if (zzftVar.zzs()) {
                                zzI(sbM1657a, 2, "count", Integer.valueOf(zzftVar.zza()));
                            }
                            if (zzftVar.zzb() != 0) {
                                zzD(sbM1657a, 2, zzftVar.zzi());
                            }
                            zzF(sbM1657a, 2);
                            sbM1657a.append("}\n");
                        }
                    }
                }
                zzF(sbM1657a, 1);
                sbM1657a.append("}\n");
            }
        }
        sbM1657a.append("}\n");
        return sbM1657a.toString();
    }

    public final String zzo(com.google.android.gms.internal.measurement.zzek zzekVar) {
        if (zzekVar == null) {
            return AndroidLoggerFactory.f17234b;
        }
        StringBuilder sbM1657a = C0305Ec.m1657a("\nevent_filter {\n");
        if (zzekVar.zzp()) {
            zzI(sbM1657a, 0, "filter_id", Integer.valueOf(zzekVar.zzb()));
        }
        zzI(sbM1657a, 0, "event_name", this.zzt.zzj().zzd(zzekVar.zzg()));
        String strZzG = zzG(zzekVar.zzk(), zzekVar.zzm(), zzekVar.zzn());
        if (!strZzG.isEmpty()) {
            zzI(sbM1657a, 0, "filter_type", strZzG);
        }
        if (zzekVar.zzo()) {
            zzJ(sbM1657a, 1, "event_count_filter", zzekVar.zzf());
        }
        if (zzekVar.zza() > 0) {
            sbM1657a.append("  filters {\n");
            Iterator it = zzekVar.zzh().iterator();
            while (it.hasNext()) {
                zzE(sbM1657a, 2, (com.google.android.gms.internal.measurement.zzem) it.next());
            }
        }
        zzF(sbM1657a, 1);
        sbM1657a.append("}\n}\n");
        return sbM1657a.toString();
    }

    public final String zzp(com.google.android.gms.internal.measurement.zzet zzetVar) {
        if (zzetVar == null) {
            return AndroidLoggerFactory.f17234b;
        }
        StringBuilder sbM1657a = C0305Ec.m1657a("\nproperty_filter {\n");
        if (zzetVar.zzj()) {
            zzI(sbM1657a, 0, "filter_id", Integer.valueOf(zzetVar.zza()));
        }
        zzI(sbM1657a, 0, "property_name", this.zzt.zzj().zzf(zzetVar.zze()));
        String strZzG = zzG(zzetVar.zzg(), zzetVar.zzh(), zzetVar.zzi());
        if (!strZzG.isEmpty()) {
            zzI(sbM1657a, 0, "filter_type", strZzG);
        }
        zzE(sbM1657a, 1, zzetVar.zzb());
        sbM1657a.append("}\n");
        return sbM1657a.toString();
    }

    public final List zzq(List list, List list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.zzt.zzay().zzk().zzb("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    this.zzt.zzay().zzk().zzc("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & ((1 << (num.intValue() % 64)) ^ (-1))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public final Map zzs(Bundle bundle, boolean z) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(zzs((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(zzs((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(zzs((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public final void zzt(com.google.android.gms.internal.measurement.zzfw zzfwVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzfwVar.zzg();
        zzfwVar.zze();
        zzfwVar.zzd();
        zzfwVar.zzf();
        if (obj instanceof String) {
            zzfwVar.zzk((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzfwVar.zzi(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            zzfwVar.zzh(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            this.zzt.zzay().zzd().zzb("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.zzfw zzfwVarZze = com.google.android.gms.internal.measurement.zzfx.zze();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.zzfw zzfwVarZze2 = com.google.android.gms.internal.measurement.zzfx.zze();
                    zzfwVarZze2.zzj(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        zzfwVarZze2.zzi(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        zzfwVarZze2.zzk((String) obj2);
                    } else if (obj2 instanceof Double) {
                        zzfwVarZze2.zzh(((Double) obj2).doubleValue());
                    }
                    zzfwVarZze.zzc(zzfwVarZze2);
                }
                if (zzfwVarZze.zza() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.zzfx) zzfwVarZze.zzaC());
                }
            }
        }
        zzfwVar.zzb(arrayList);
    }

    public final void zzu(com.google.android.gms.internal.measurement.zzgl zzglVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzglVar.zzc();
        zzglVar.zzb();
        zzglVar.zza();
        if (obj instanceof String) {
            zzglVar.zzh((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzglVar.zze(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzglVar.zzd(((Double) obj).doubleValue());
        } else {
            this.zzt.zzay().zzd().zzb("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final boolean zzw(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(this.zzt.zzav().currentTimeMillis() - j) > j2;
    }

    public final byte[] zzy(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.zzt.zzay().zzd().zzb("Failed to gzip content", e);
            throw e;
        }
    }
}
