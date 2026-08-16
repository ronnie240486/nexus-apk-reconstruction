package com.google.android.gms.internal.measurement;

import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.videolan.libvlc.util.VLCUtil;
import p000.f70;
import p000.g70;
import sun.misc.Unsafe;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes2.dex */
final class zzlp<T> implements zzlx<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmy.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlm zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzla zzm;
    private final zzmo zzn;
    private final zzjs zzo;
    private final zzlr zzp;
    private final zzlh zzq;

    private zzlp(int[] iArr, Object[] objArr, int i, int i2, zzlm zzlmVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzlr zzlrVar, zzla zzlaVar, zzmo zzmoVar, zzjs zzjsVar, zzlh zzlhVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = z;
        boolean z3 = false;
        if (zzjsVar != null && zzjsVar.zzc(zzlmVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzp = zzlrVar;
        this.zzm = zzlaVar;
        this.zzn = zzmoVar;
        this.zzo = zzjsVar;
        this.zzg = zzlmVar;
        this.zzq = zzlhVar;
    }

    private static int zzA(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzB(int i) {
        return this.zzc[i + 1];
    }

    private static long zzC(Object obj, long j) {
        return ((Long) zzmy.zzf(obj, j)).longValue();
    }

    private final zzkj zzD(int i) {
        int i2 = i / 3;
        return (zzkj) this.zzd[i2 + i2 + 1];
    }

    private final zzlx zzE(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzlx zzlxVar = (zzlx) this.zzd[i3];
        if (zzlxVar != null) {
            return zzlxVar;
        }
        zzlx zzlxVarZzb = zzlu.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzlxVarZzb;
        return zzlxVarZzb;
    }

    private final Object zzF(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final Object zzG(Object obj, int i) {
        zzlx zzlxVarZzE = zzE(i);
        long jZzB = zzB(i) & 1048575;
        if (!zzT(obj, i)) {
            return zzlxVarZzE.zze();
        }
        Object object = zzb.getObject(obj, jZzB);
        if (zzW(object)) {
            return object;
        }
        Object objZze = zzlxVarZzE.zze();
        if (object != null) {
            zzlxVarZzE.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzH(Object obj, int i, int i2) {
        zzlx zzlxVarZzE = zzE(i2);
        if (!zzX(obj, i, i2)) {
            return zzlxVarZzE.zze();
        }
        Object object = zzb.getObject(obj, zzB(i2) & 1048575);
        if (zzW(object)) {
            return object;
        }
        Object objZze = zzlxVarZzE.zze();
        if (object != null) {
            zzlxVarZzE.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzI(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void zzJ(Object obj) {
        if (!zzW(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzK(Object obj, Object obj2, int i) {
        if (zzT(obj2, i)) {
            long jZzB = zzB(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(obj2, jZzB);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzlx zzlxVarZzE = zzE(i);
            if (!zzT(obj, i)) {
                if (zzW(object)) {
                    Object objZze = zzlxVarZzE.zze();
                    zzlxVarZzE.zzg(objZze, object);
                    unsafe.putObject(obj, jZzB, objZze);
                } else {
                    unsafe.putObject(obj, jZzB, object);
                }
                zzM(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jZzB);
            if (!zzW(object2)) {
                Object objZze2 = zzlxVarZzE.zze();
                zzlxVarZzE.zzg(objZze2, object2);
                unsafe.putObject(obj, jZzB, objZze2);
                object2 = objZze2;
            }
            zzlxVarZzE.zzg(object2, object);
        }
    }

    private final void zzL(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzX(obj2, i2, i)) {
            long jZzB = zzB(i) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(obj2, jZzB);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzlx zzlxVarZzE = zzE(i);
            if (!zzX(obj, i2, i)) {
                if (zzW(object)) {
                    Object objZze = zzlxVarZzE.zze();
                    zzlxVarZzE.zzg(objZze, object);
                    unsafe.putObject(obj, jZzB, objZze);
                } else {
                    unsafe.putObject(obj, jZzB, object);
                }
                zzN(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jZzB);
            if (!zzW(object2)) {
                Object objZze2 = zzlxVarZzE.zze();
                zzlxVarZzE.zzg(objZze2, object2);
                unsafe.putObject(obj, jZzB, objZze2);
                object2 = objZze2;
            }
            zzlxVarZzE.zzg(object2, object);
        }
    }

    private final void zzM(Object obj, int i) {
        int iZzy = zzy(i);
        long j = 1048575 & iZzy;
        if (j == 1048575) {
            return;
        }
        zzmy.zzq(obj, j, (1 << (iZzy >>> 20)) | zzmy.zzc(obj, j));
    }

    private final void zzN(Object obj, int i, int i2) {
        zzmy.zzq(obj, zzy(i2) & 1048575, i);
    }

    private final void zzO(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzB(i) & 1048575, obj2);
        zzM(obj, i);
    }

    private final void zzP(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzB(i2) & 1048575, obj2);
        zzN(obj, i, i2);
    }

    private final void zzQ(Object obj, zzng zzngVar) throws IOException {
        int i;
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < length) {
            int iZzB = zzB(i3);
            int[] iArr = this.zzc;
            int i6 = iArr[i3];
            int iZzA = zzA(iZzB);
            if (iZzA <= 17) {
                int i7 = iArr[i3 + 2];
                int i8 = i7 & i2;
                if (i8 != i5) {
                    i4 = unsafe.getInt(obj, i8);
                    i5 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = iZzB & i2;
            switch (iZzA) {
                case 0:
                    if ((i4 & i) != 0) {
                        zzngVar.zzf(i6, zzmy.zza(obj, j));
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if ((i4 & i) != 0) {
                        zzngVar.zzo(i6, zzmy.zzb(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if ((i4 & i) != 0) {
                        zzngVar.zzt(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if ((i4 & i) != 0) {
                        zzngVar.zzJ(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if ((i4 & i) != 0) {
                        zzngVar.zzr(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if ((i4 & i) != 0) {
                        zzngVar.zzm(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if ((i4 & i) != 0) {
                        zzngVar.zzk(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if ((i4 & i) != 0) {
                        zzngVar.zzb(i6, zzmy.zzw(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if ((i4 & i) != 0) {
                        zzZ(i6, unsafe.getObject(obj, j), zzngVar);
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if ((i4 & i) != 0) {
                        zzngVar.zzv(i6, unsafe.getObject(obj, j), zzE(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if ((i4 & i) != 0) {
                        zzngVar.zzd(i6, (zzje) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if ((i4 & i) != 0) {
                        zzngVar.zzH(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if ((i4 & i) != 0) {
                        zzngVar.zzi(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if ((i4 & i) != 0) {
                        zzngVar.zzw(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if ((i4 & i) != 0) {
                        zzngVar.zzy(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if ((i4 & i) != 0) {
                        zzngVar.zzA(i6, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if ((i4 & i) != 0) {
                        zzngVar.zzC(i6, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if ((i4 & i) != 0) {
                        zzngVar.zzq(i6, unsafe.getObject(obj, j), zzE(i3));
                    } else {
                        continue;
                    }
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    zzlz.zzJ(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    zzlz.zzN(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    zzlz.zzQ(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    zzlz.zzY(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    zzlz.zzP(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    zzlz.zzM(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    zzlz.zzL(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    zzlz.zzH(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, false);
                    continue;
                    i3 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    zzlz.zzW(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar);
                    break;
                case 27:
                    zzlz.zzR(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, zzE(i3));
                    break;
                case 28:
                    zzlz.zzI(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar);
                    break;
                case 29:
                    zzlz.zzX(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 30:
                    zzlz.zzK(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 31:
                    zzlz.zzS(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 32:
                    zzlz.zzT(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 33:
                    zzlz.zzU(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 34:
                    zzlz.zzV(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, false);
                    break;
                case 35:
                    zzlz.zzJ(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 36:
                    zzlz.zzN(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 37:
                    zzlz.zzQ(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 38:
                    zzlz.zzY(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 39:
                    zzlz.zzP(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 40:
                    zzlz.zzM(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 41:
                    zzlz.zzL(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 42:
                    zzlz.zzH(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 43:
                    zzlz.zzX(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 44:
                    zzlz.zzK(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 45:
                    zzlz.zzS(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 46:
                    zzlz.zzT(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 47:
                    zzlz.zzU(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 48:
                    zzlz.zzV(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, true);
                    break;
                case 49:
                    zzlz.zzO(this.zzc[i3], (List) unsafe.getObject(obj, j), zzngVar, zzE(i3));
                    break;
                case 50:
                    zzR(zzngVar, i6, unsafe.getObject(obj, j), i3);
                    break;
                case 51:
                    if (zzX(obj, i6, i3)) {
                        zzngVar.zzf(i6, zzn(obj, j));
                    }
                    break;
                case 52:
                    if (zzX(obj, i6, i3)) {
                        zzngVar.zzo(i6, zzo(obj, j));
                    }
                    break;
                case 53:
                    if (zzX(obj, i6, i3)) {
                        zzngVar.zzt(i6, zzC(obj, j));
                    }
                    break;
                case 54:
                    if (zzX(obj, i6, i3)) {
                        zzngVar.zzJ(i6, zzC(obj, j));
                    }
                    break;
                case CipherSuite.TLS_DH_RSA_WITH_AES_256_CBC_SHA /* 55 */:
                    if (zzX(obj, i6, i3)) {
                        zzngVar.zzr(i6, zzr(obj, j));
                    }
                    break;
                case 56:
                    if (zzX(obj, i6, i3)) {
                        zzngVar.zzm(i6, zzC(obj, j));
                    }
                    break;
                case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CBC_SHA /* 57 */:
                    if (zzX(obj, i6, i3)) {
                        zzngVar.zzk(i6, zzr(obj, j));
                    }
                    break;
                case CipherSuite.TLS_DH_anon_WITH_AES_256_CBC_SHA /* 58 */:
                    if (zzX(obj, i6, i3)) {
                        zzngVar.zzb(i6, zzY(obj, j));
                    }
                    break;
                case 59:
                    if (zzX(obj, i6, i3)) {
                        zzZ(i6, unsafe.getObject(obj, j), zzngVar);
                    }
                    break;
                case 60:
                    if (zzX(obj, i6, i3)) {
                        zzngVar.zzv(i6, unsafe.getObject(obj, j), zzE(i3));
                    }
                    break;
                case 61:
                    if (zzX(obj, i6, i3)) {
                        zzngVar.zzd(i6, (zzje) unsafe.getObject(obj, j));
                    }
                    break;
                case VLCUtil.f17716h /* 62 */:
                    if (zzX(obj, i6, i3)) {
                        zzngVar.zzH(i6, zzr(obj, j));
                    }
                    break;
                case 63:
                    if (zzX(obj, i6, i3)) {
                        zzngVar.zzi(i6, zzr(obj, j));
                    }
                    break;
                case 64:
                    if (zzX(obj, i6, i3)) {
                        zzngVar.zzw(i6, zzr(obj, j));
                    }
                    break;
                case DefaultScrollHandle.f11004h /* 65 */:
                    if (zzX(obj, i6, i3)) {
                        zzngVar.zzy(i6, zzC(obj, j));
                    }
                    break;
                case IjkMediaMeta.FF_PROFILE_H264_BASELINE /* 66 */:
                    if (zzX(obj, i6, i3)) {
                        zzngVar.zzA(i6, zzr(obj, j));
                    }
                    break;
                case 67:
                    if (zzX(obj, i6, i3)) {
                        zzngVar.zzC(i6, zzC(obj, j));
                    }
                    break;
                case 68:
                    if (zzX(obj, i6, i3)) {
                        zzngVar.zzq(i6, unsafe.getObject(obj, j), zzE(i3));
                    }
                    break;
            }
            i3 += 3;
            i2 = 1048575;
        }
        zzmo zzmoVar = this.zzn;
        zzmoVar.zzi(zzmoVar.zzd(obj), zzngVar);
    }

    private final void zzR(zzng zzngVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzS(Object obj, Object obj2, int i) {
        return zzT(obj, i) == zzT(obj2, i);
    }

    private final boolean zzT(Object obj, int i) {
        int iZzy = zzy(i);
        long j = iZzy & 1048575;
        if (j != 1048575) {
            return (zzmy.zzc(obj, j) & (1 << (iZzy >>> 20))) != 0;
        }
        int iZzB = zzB(i);
        long j2 = iZzB & 1048575;
        switch (zzA(iZzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzmy.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmy.zzb(obj, j2)) != 0;
            case 2:
                return zzmy.zzd(obj, j2) != 0;
            case 3:
                return zzmy.zzd(obj, j2) != 0;
            case 4:
                return zzmy.zzc(obj, j2) != 0;
            case 5:
                return zzmy.zzd(obj, j2) != 0;
            case 6:
                return zzmy.zzc(obj, j2) != 0;
            case 7:
                return zzmy.zzw(obj, j2);
            case 8:
                Object objZzf = zzmy.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzje) {
                    return !zzje.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzmy.zzf(obj, j2) != null;
            case 10:
                return !zzje.zzb.equals(zzmy.zzf(obj, j2));
            case 11:
                return zzmy.zzc(obj, j2) != 0;
            case 12:
                return zzmy.zzc(obj, j2) != 0;
            case 13:
                return zzmy.zzc(obj, j2) != 0;
            case 14:
                return zzmy.zzd(obj, j2) != 0;
            case 15:
                return zzmy.zzc(obj, j2) != 0;
            case 16:
                return zzmy.zzd(obj, j2) != 0;
            case 17:
                return zzmy.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzU(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzT(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzV(Object obj, int i, zzlx zzlxVar) {
        return zzlxVar.zzk(zzmy.zzf(obj, i & 1048575));
    }

    private static boolean zzW(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzkf) {
            return ((zzkf) obj).zzbO();
        }
        return true;
    }

    private final boolean zzX(Object obj, int i, int i2) {
        return zzmy.zzc(obj, (long) (zzy(i2) & 1048575)) == i;
    }

    private static boolean zzY(Object obj, long j) {
        return ((Boolean) zzmy.zzf(obj, j)).booleanValue();
    }

    private static final void zzZ(int i, Object obj, zzng zzngVar) throws IOException {
        if (obj instanceof String) {
            zzngVar.zzF(i, (String) obj);
        } else {
            zzngVar.zzd(i, (zzje) obj);
        }
    }

    public static zzmp zzd(Object obj) {
        zzkf zzkfVar = (zzkf) obj;
        zzmp zzmpVar = zzkfVar.zzc;
        if (zzmpVar != zzmp.zzc()) {
            return zzmpVar;
        }
        zzmp zzmpVarZzf = zzmp.zzf();
        zzkfVar.zzc = zzmpVarZzf;
        return zzmpVarZzf;
    }

    public static zzlp zzl(Class cls, zzlj zzljVar, zzlr zzlrVar, zzla zzlaVar, zzmo zzmoVar, zzjs zzjsVar, zzlh zzlhVar) {
        if (zzljVar instanceof zzlw) {
            return zzm((zzlw) zzljVar, zzlrVar, zzlaVar, zzmoVar, zzjsVar, zzlhVar);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x025e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0264  */
    /* JADX WARN: Code duplicated, block: B:128:0x027a  */
    /* JADX WARN: Code duplicated, block: B:130:0x027e  */
    /* JADX WARN: Code duplicated, block: B:164:0x0332  */
    /* JADX WARN: Code duplicated, block: B:180:0x0380  */
    /* JADX WARN: Code duplicated, block: B:183:0x0388  */
    public static zzlp zzm(zzlw zzlwVar, zzlr zzlrVar, zzla zzlaVar, zzmo zzmoVar, zzjs zzjsVar, zzlh zzlhVar) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char cCharAt;
        int i7;
        char cCharAt2;
        int i8;
        char cCharAt3;
        int i9;
        char cCharAt4;
        int i10;
        char cCharAt5;
        int i11;
        char cCharAt6;
        int i12;
        char cCharAt7;
        int i13;
        char cCharAt8;
        int i14;
        int i15;
        int i16;
        int[] iArr2;
        int i17;
        int i18;
        int i19;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        Object[] objArr;
        int i20;
        int i21;
        Field fieldZzI;
        char cCharAt9;
        int i22;
        int i23;
        int i24;
        int i25;
        Object obj;
        Field fieldZzI2;
        int i26;
        Object obj2;
        Field fieldZzI3;
        int i27;
        char cCharAt10;
        int i28;
        char cCharAt11;
        int i29;
        char cCharAt12;
        int i30;
        char cCharAt13;
        boolean z = zzlwVar.zzc() == 2;
        String strZzd = zzlwVar.zzd();
        int length = strZzd.length();
        char c = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i31 = 1;
            while (true) {
                i = i31 + 1;
                if (strZzd.charAt(i31) < 55296) {
                    break;
                }
                i31 = i;
            }
        } else {
            i = 1;
        }
        int i32 = i + 1;
        int iCharAt4 = strZzd.charAt(i);
        if (iCharAt4 >= 55296) {
            int i33 = iCharAt4 & 8191;
            int i34 = 13;
            while (true) {
                i30 = i32 + 1;
                cCharAt13 = strZzd.charAt(i32);
                if (cCharAt13 < 55296) {
                    break;
                }
                i33 |= (cCharAt13 & 8191) << i34;
                i34 += 13;
                i32 = i30;
            }
            iCharAt4 = i33 | (cCharAt13 << i34);
            i32 = i30;
        }
        if (iCharAt4 == 0) {
            iArr = zza;
            i3 = 0;
            iCharAt = 0;
            i5 = 0;
            iCharAt2 = 0;
            i4 = 0;
            iCharAt3 = 0;
            i2 = 0;
        } else {
            int i35 = i32 + 1;
            int iCharAt5 = strZzd.charAt(i32);
            if (iCharAt5 >= 55296) {
                int i36 = iCharAt5 & 8191;
                int i37 = 13;
                while (true) {
                    i13 = i35 + 1;
                    cCharAt8 = strZzd.charAt(i35);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i36 |= (cCharAt8 & 8191) << i37;
                    i37 += 13;
                    i35 = i13;
                }
                iCharAt5 = i36 | (cCharAt8 << i37);
                i35 = i13;
            }
            int i38 = i35 + 1;
            int iCharAt6 = strZzd.charAt(i35);
            if (iCharAt6 >= 55296) {
                int i39 = iCharAt6 & 8191;
                int i40 = 13;
                while (true) {
                    i12 = i38 + 1;
                    cCharAt7 = strZzd.charAt(i38);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt7 & 8191) << i40;
                    i40 += 13;
                    i38 = i12;
                }
                iCharAt6 = i39 | (cCharAt7 << i40);
                i38 = i12;
            }
            int i41 = i38 + 1;
            iCharAt = strZzd.charAt(i38);
            if (iCharAt >= 55296) {
                int i42 = iCharAt & 8191;
                int i43 = 13;
                while (true) {
                    i11 = i41 + 1;
                    cCharAt6 = strZzd.charAt(i41);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt6 & 8191) << i43;
                    i43 += 13;
                    i41 = i11;
                }
                iCharAt = i42 | (cCharAt6 << i43);
                i41 = i11;
            }
            int i44 = i41 + 1;
            int iCharAt7 = strZzd.charAt(i41);
            if (iCharAt7 >= 55296) {
                int i45 = iCharAt7 & 8191;
                int i46 = 13;
                while (true) {
                    i10 = i44 + 1;
                    cCharAt5 = strZzd.charAt(i44);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt5 & 8191) << i46;
                    i46 += 13;
                    i44 = i10;
                }
                iCharAt7 = i45 | (cCharAt5 << i46);
                i44 = i10;
            }
            int i47 = i44 + 1;
            iCharAt2 = strZzd.charAt(i44);
            if (iCharAt2 >= 55296) {
                int i48 = iCharAt2 & 8191;
                int i49 = 13;
                while (true) {
                    i9 = i47 + 1;
                    cCharAt4 = strZzd.charAt(i47);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt4 & 8191) << i49;
                    i49 += 13;
                    i47 = i9;
                }
                iCharAt2 = i48 | (cCharAt4 << i49);
                i47 = i9;
            }
            int i50 = i47 + 1;
            int iCharAt8 = strZzd.charAt(i47);
            if (iCharAt8 >= 55296) {
                int i51 = iCharAt8 & 8191;
                int i52 = 13;
                while (true) {
                    i8 = i50 + 1;
                    cCharAt3 = strZzd.charAt(i50);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt3 & 8191) << i52;
                    i52 += 13;
                    i50 = i8;
                }
                iCharAt8 = i51 | (cCharAt3 << i52);
                i50 = i8;
            }
            int i53 = i50 + 1;
            int iCharAt9 = strZzd.charAt(i50);
            if (iCharAt9 >= 55296) {
                int i54 = iCharAt9 & 8191;
                int i55 = 13;
                while (true) {
                    i7 = i53 + 1;
                    cCharAt2 = strZzd.charAt(i53);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt2 & 8191) << i55;
                    i55 += 13;
                    i53 = i7;
                }
                iCharAt9 = i54 | (cCharAt2 << i55);
                i53 = i7;
            }
            int i56 = i53 + 1;
            iCharAt3 = strZzd.charAt(i53);
            if (iCharAt3 >= 55296) {
                int i57 = iCharAt3 & 8191;
                int i58 = 13;
                while (true) {
                    i6 = i56 + 1;
                    cCharAt = strZzd.charAt(i56);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i57 |= (cCharAt & 8191) << i58;
                    i58 += 13;
                    i56 = i6;
                }
                iCharAt3 = i57 | (cCharAt << i58);
                i56 = i6;
            }
            iArr = new int[iCharAt3 + iCharAt8 + iCharAt9];
            i2 = iCharAt5 + iCharAt5 + iCharAt6;
            i3 = iCharAt5;
            i32 = i56;
            int i59 = iCharAt8;
            i4 = iCharAt7;
            i5 = i59;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzlwVar.zze();
        Class<?> cls = zzlwVar.zza().getClass();
        int[] iArr3 = new int[iCharAt2 * 3];
        Object[] objArr2 = new Object[iCharAt2 + iCharAt2];
        int i60 = iCharAt3 + i5;
        int i61 = iCharAt3;
        int i62 = i60;
        int i63 = 0;
        int i64 = 0;
        while (i32 < length) {
            int i65 = i32 + 1;
            int iCharAt10 = strZzd.charAt(i32);
            if (iCharAt10 >= c) {
                int i66 = iCharAt10 & 8191;
                int i67 = i65;
                int i68 = 13;
                while (true) {
                    i29 = i67 + 1;
                    cCharAt12 = strZzd.charAt(i67);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i66 |= (cCharAt12 & 8191) << i68;
                    i68 += 13;
                    i67 = i29;
                }
                iCharAt10 = i66 | (cCharAt12 << i68);
                i14 = i29;
            } else {
                i14 = i65;
            }
            int i69 = i14 + 1;
            int iCharAt11 = strZzd.charAt(i14);
            if (iCharAt11 >= c) {
                int i70 = iCharAt11 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i28 = i71 + 1;
                    cCharAt11 = strZzd.charAt(i71);
                    i15 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i70 |= (cCharAt11 & 8191) << i72;
                    i72 += 13;
                    i71 = i28;
                    length = i15;
                }
                iCharAt11 = i70 | (cCharAt11 << i72);
                i16 = i28;
            } else {
                i15 = length;
                i16 = i69;
            }
            int i73 = iCharAt11 & 255;
            int i74 = iCharAt3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i64] = i63;
                i64++;
            }
            if (i73 >= 51) {
                int i75 = i16 + 1;
                int iCharAt12 = strZzd.charAt(i16);
                if (iCharAt12 >= 55296) {
                    int i76 = iCharAt12 & 8191;
                    int i77 = i75;
                    int i78 = 13;
                    while (true) {
                        i27 = i77 + 1;
                        cCharAt10 = strZzd.charAt(i77);
                        i18 = i4;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i76 |= (cCharAt10 & 8191) << i78;
                        i78 += 13;
                        i77 = i27;
                        i4 = i18;
                    }
                    iCharAt12 = i76 | (cCharAt10 << i78);
                    i23 = i27;
                } else {
                    i18 = i4;
                    i23 = i75;
                }
                int i79 = i73 - 51;
                int i80 = i23;
                if (i79 == 9 || i79 == 17) {
                    int i81 = i63 / 3;
                    i24 = i2 + 1;
                    objArr2[i81 + i81 + 1] = objArrZze[i2];
                } else {
                    if (i79 == 12 && !z) {
                        int i82 = i63 / 3;
                        i24 = i2 + 1;
                        objArr2[i82 + i82 + 1] = objArrZze[i2];
                    }
                    i25 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i25];
                    if (obj instanceof Field) {
                        fieldZzI2 = (Field) obj;
                    } else {
                        fieldZzI2 = zzI(cls, (String) obj);
                        objArrZze[i25] = fieldZzI2;
                    }
                    iArr2 = iArr3;
                    i17 = iCharAt;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzI2);
                    i26 = i25 + 1;
                    obj2 = objArrZze[i26];
                    if (obj2 instanceof Field) {
                        fieldZzI3 = (Field) obj2;
                    } else {
                        fieldZzI3 = zzI(cls, (String) obj2);
                        objArrZze[i26] = fieldZzI3;
                    }
                    objArr = objArr2;
                    i19 = i2;
                    i20 = i80;
                    i3 = i3;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzI3);
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i21 = 0;
                }
                i2 = i24;
                i25 = iCharAt12 + iCharAt12;
                obj = objArrZze[i25];
                if (obj instanceof Field) {
                    fieldZzI2 = (Field) obj;
                } else {
                    fieldZzI2 = zzI(cls, (String) obj);
                    objArrZze[i25] = fieldZzI2;
                }
                iArr2 = iArr3;
                i17 = iCharAt;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzI2);
                i26 = i25 + 1;
                obj2 = objArrZze[i26];
                if (obj2 instanceof Field) {
                    fieldZzI3 = (Field) obj2;
                } else {
                    fieldZzI3 = zzI(cls, (String) obj2);
                    objArrZze[i26] = fieldZzI3;
                }
                objArr = objArr2;
                i19 = i2;
                i20 = i80;
                i3 = i3;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzI3);
                iObjectFieldOffset = iObjectFieldOffset4;
                i21 = 0;
            } else {
                iArr2 = iArr3;
                i17 = iCharAt;
                i18 = i4;
                int i83 = i2 + 1;
                Field fieldZzI4 = zzI(cls, (String) objArrZze[i2]);
                if (i73 == 9 || i73 == 17) {
                    int i84 = i63 / 3;
                    objArr2[i84 + i84 + 1] = fieldZzI4.getType();
                } else {
                    if (i73 == 27 || i73 == 49) {
                        int i85 = i63 / 3;
                        i22 = i2 + 2;
                        objArr2[i85 + i85 + 1] = objArrZze[i83];
                    } else if (i73 == 12 || i73 == 30 || i73 == 44) {
                        if (!z) {
                            int i86 = i63 / 3;
                            i22 = i2 + 2;
                            objArr2[i86 + i86 + 1] = objArrZze[i83];
                        }
                    } else if (i73 == 50) {
                        int i87 = i61 + 1;
                        iArr[i61] = i63;
                        int i88 = i63 / 3;
                        int i89 = i88 + i88;
                        int i90 = i2 + 2;
                        objArr2[i89] = objArrZze[i83];
                        if ((iCharAt11 & 2048) != 0) {
                            i83 = i2 + 3;
                            objArr2[i89 + 1] = objArrZze[i90];
                            i61 = i87;
                        } else {
                            i61 = i87;
                            i19 = i90;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzI4);
                        iObjectFieldOffset2 = 1048575;
                        objArr = objArr2;
                        if ((iCharAt11 & 4096) == 4096 || i73 > 17) {
                            i20 = i16;
                            i21 = 0;
                        } else {
                            int i91 = i16 + 1;
                            int iCharAt13 = strZzd.charAt(i16);
                            if (iCharAt13 >= 55296) {
                                int i92 = iCharAt13 & 8191;
                                int i93 = 13;
                                while (true) {
                                    i20 = i91 + 1;
                                    cCharAt9 = strZzd.charAt(i91);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i92 |= (cCharAt9 & 8191) << i93;
                                    i93 += 13;
                                    i91 = i20;
                                }
                                iCharAt13 = i92 | (cCharAt9 << i93);
                            } else {
                                i20 = i91;
                            }
                            int i94 = (iCharAt13 / 32) + i3 + i3;
                            Object obj3 = objArrZze[i94];
                            if (obj3 instanceof Field) {
                                fieldZzI = (Field) obj3;
                            } else {
                                fieldZzI = zzI(cls, (String) obj3);
                                objArrZze[i94] = fieldZzI;
                            }
                            i21 = iCharAt13 % 32;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzI);
                        }
                        if (i73 >= 18 && i73 <= 49) {
                            iArr[i62] = iObjectFieldOffset;
                            i62++;
                        }
                    }
                    i19 = i22;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzI4);
                    iObjectFieldOffset2 = 1048575;
                    objArr = objArr2;
                    if ((iCharAt11 & 4096) == 4096) {
                        i20 = i16;
                        i21 = 0;
                    } else {
                        i20 = i16;
                        i21 = 0;
                    }
                    if (i73 >= 18) {
                        iArr[i62] = iObjectFieldOffset;
                        i62++;
                    }
                }
                i19 = i83;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzI4);
                iObjectFieldOffset2 = 1048575;
                objArr = objArr2;
                if ((iCharAt11 & 4096) == 4096) {
                    i20 = i16;
                    i21 = 0;
                } else {
                    i20 = i16;
                    i21 = 0;
                }
                if (i73 >= 18) {
                    iArr[i62] = iObjectFieldOffset;
                    i62++;
                }
            }
            int i95 = i63 + 1;
            iArr2[i63] = iCharAt10;
            int i96 = i63 + 2;
            iArr2[i95] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i73 << 20) | iObjectFieldOffset;
            i63 += 3;
            iArr2[i96] = (i21 << 20) | iObjectFieldOffset2;
            i3 = i3;
            i2 = i19;
            iCharAt = i17;
            iCharAt3 = i74;
            i32 = i20;
            length = i15;
            objArr2 = objArr;
            iArr3 = iArr2;
            i4 = i18;
            c = 55296;
        }
        return new zzlp(iArr3, objArr2, iCharAt, i4, zzlwVar.zza(), z, false, iArr, iCharAt3, i60, zzlrVar, zzlaVar, zzmoVar, zzjsVar, zzlhVar, null);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzmy.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzmy.zzf(obj, j)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:150:0x035f  */
    /* JADX WARN: Code duplicated, block: B:153:0x036c  */
    /* JADX WARN: Code duplicated, block: B:156:0x0379  */
    /* JADX WARN: Code duplicated, block: B:188:0x0408  */
    /* JADX WARN: Code duplicated, block: B:28:0x0096  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:81:0x019b A[PHI: r3
      0x019b: PHI (r3v127 int) = 
      (r3v90 int)
      (r3v93 int)
      (r3v96 int)
      (r3v99 int)
      (r3v102 int)
      (r3v105 int)
      (r3v108 int)
      (r3v111 int)
      (r3v114 int)
      (r3v117 int)
      (r3v120 int)
      (r3v123 int)
      (r3v126 int)
      (r3v130 int)
     binds: [B:119:0x024e, B:116:0x0240, B:113:0x0232, B:110:0x0224, B:107:0x0217, B:104:0x020a, B:101:0x01fd, B:98:0x01f0, B:95:0x01e3, B:92:0x01d6, B:89:0x01c9, B:86:0x01bc, B:83:0x01af, B:80:0x0199] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ae, code lost:
    
        if (zzX(r17, r11, r5) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b0, code lost:
    
        r3 = zzr(r17, r3);
        r4 = com.google.android.gms.internal.measurement.zzjm.zzA(r11 << 3);
        r3 = com.google.android.gms.internal.measurement.zzjm.zzv(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0140, code lost:
    
        if (zzX(r17, r11, r5) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0148, code lost:
    
        if (zzX(r17, r11, r5) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014a, code lost:
    
        r3 = com.google.android.gms.internal.measurement.zzjm.zzB(zzC(r17, r3)) + com.google.android.gms.internal.measurement.zzjm.zzA(r11 << 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015f, code lost:
    
        if (zzX(r17, r11, r5) != false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzp(Object obj) {
        int i;
        int iZzB;
        Object object;
        int iZzA;
        int iZzy;
        int iZzo;
        int i2;
        int iZzA2;
        int iZzu;
        int iZzi;
        int iZzB2;
        Object object2;
        int iZzr;
        int iZzA3;
        Unsafe unsafe = zzb;
        int i3 = 1048575;
        int i4 = 0;
        int iM20280a = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < this.zzc.length) {
            int iZzB3 = zzB(i4);
            int[] iArr = this.zzc;
            int i7 = iArr[i4];
            int iZzA4 = zzA(iZzB3);
            if (iZzA4 <= 17) {
                int i8 = iArr[i4 + 2];
                int i9 = i8 & i3;
                i = 1 << (i8 >>> 20);
                if (i9 != i6) {
                    i5 = unsafe.getInt(obj, i9);
                    i6 = i9;
                }
            } else {
                i = 0;
            }
            long j = iZzB3 & i3;
            switch (iZzA4) {
                case 0:
                    if ((i5 & i) != 0) {
                        iM20280a = f70.m20280a(i7 << 3, 8, iM20280a);
                    }
                    break;
                case 1:
                    if ((i5 & i) != 0) {
                        iM20280a = f70.m20280a(i7 << 3, 4, iM20280a);
                    }
                    break;
                case 2:
                    if ((i5 & i) != 0) {
                        iZzB = zzjm.zzB(unsafe.getLong(obj, j)) + zzjm.zzA(i7 << 3);
                        iM20280a += iZzB;
                    }
                    break;
                case 3:
                    if ((i5 & i) != 0) {
                        iZzB = zzjm.zzB(unsafe.getLong(obj, j)) + zzjm.zzA(i7 << 3);
                        iM20280a += iZzB;
                    }
                    break;
                case 4:
                    if ((i5 & i) != 0) {
                        int i10 = unsafe.getInt(obj, j);
                        iZzA = zzjm.zzA(i7 << 3);
                        iZzy = zzjm.zzv(i10);
                        iZzB = iZzy + iZzA;
                        iM20280a += iZzB;
                    }
                    break;
                case 5:
                    if ((i5 & i) != 0) {
                        iM20280a = f70.m20280a(i7 << 3, 8, iM20280a);
                    }
                    break;
                case 6:
                    if ((i5 & i) != 0) {
                        iM20280a = f70.m20280a(i7 << 3, 4, iM20280a);
                    }
                    break;
                case 7:
                    if ((i5 & i) != 0) {
                        iM20280a = f70.m20280a(i7 << 3, 1, iM20280a);
                    }
                    break;
                case 8:
                    if ((i5 & i) != 0) {
                        object = unsafe.getObject(obj, j);
                        if (!(object instanceof zzje)) {
                            iZzA = zzjm.zzA(i7 << 3);
                            iZzy = zzjm.zzy((String) object);
                            iZzB = iZzy + iZzA;
                            iM20280a += iZzB;
                        } else {
                            int iZzA5 = zzjm.zzA(i7 << 3);
                            int iZzd = ((zzje) object).zzd();
                            iM20280a = g70.m20730a(iZzd, iZzd, iZzA5, iM20280a);
                        }
                    }
                    break;
                case 9:
                    if ((i5 & i) != 0) {
                        iZzo = zzlz.zzo(i7, unsafe.getObject(obj, j), zzE(i4));
                        iM20280a += iZzo;
                    }
                    break;
                case 10:
                    if ((i5 & i) != 0) {
                        object = unsafe.getObject(obj, j);
                        int iZzA6 = zzjm.zzA(i7 << 3);
                        int iZzd2 = ((zzje) object).zzd();
                        iM20280a = g70.m20730a(iZzd2, iZzd2, iZzA6, iM20280a);
                    }
                    break;
                case 11:
                    if ((i5 & i) != 0) {
                        i2 = unsafe.getInt(obj, j);
                        iZzA2 = zzjm.zzA(i7 << 3);
                        iM20280a = f70.m20280a(i2, iZzA2, iM20280a);
                    }
                    break;
                case 12:
                    if ((i5 & i) != 0) {
                        int i11 = unsafe.getInt(obj, j);
                        iZzA = zzjm.zzA(i7 << 3);
                        iZzy = zzjm.zzv(i11);
                        iZzB = iZzy + iZzA;
                        iM20280a += iZzB;
                    }
                    break;
                case 13:
                    if ((i5 & i) != 0) {
                        iM20280a = f70.m20280a(i7 << 3, 4, iM20280a);
                    }
                    break;
                case 14:
                    if ((i5 & i) != 0) {
                        iM20280a = f70.m20280a(i7 << 3, 8, iM20280a);
                    }
                    break;
                case 15:
                    if ((i5 & i) != 0) {
                        int i12 = unsafe.getInt(obj, j);
                        iZzA2 = zzjm.zzA(i7 << 3);
                        i2 = (i12 >> 31) ^ (i12 + i12);
                        iM20280a = f70.m20280a(i2, iZzA2, iM20280a);
                    }
                    break;
                case 16:
                    if ((i & i5) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzB = zzjm.zzB((j2 >> 63) ^ (j2 + j2)) + zzjm.zzA(i7 << 3);
                        iM20280a += iZzB;
                    }
                    break;
                case 17:
                    if ((i5 & i) != 0) {
                        iZzB = zzjm.zzu(i7, (zzlm) unsafe.getObject(obj, j), zzE(i4));
                        iM20280a += iZzB;
                    }
                    break;
                case 18:
                case 23:
                    iZzo = zzlz.zzh(i7, (List) unsafe.getObject(obj, j), false);
                    iM20280a += iZzo;
                    break;
                case 19:
                case 24:
                    iZzo = zzlz.zzf(i7, (List) unsafe.getObject(obj, j), false);
                    iM20280a += iZzo;
                    break;
                case 20:
                    iZzo = zzlz.zzm(i7, (List) unsafe.getObject(obj, j), false);
                    iM20280a += iZzo;
                    break;
                case 21:
                    iZzo = zzlz.zzx(i7, (List) unsafe.getObject(obj, j), false);
                    iM20280a += iZzo;
                    break;
                case 22:
                    iZzo = zzlz.zzk(i7, (List) unsafe.getObject(obj, j), false);
                    iM20280a += iZzo;
                    break;
                case 25:
                    iZzo = zzlz.zza(i7, (List) unsafe.getObject(obj, j), false);
                    iM20280a += iZzo;
                    break;
                case 26:
                    iZzu = zzlz.zzu(i7, (List) unsafe.getObject(obj, j));
                    iM20280a += iZzu;
                    break;
                case 27:
                    iZzu = zzlz.zzp(i7, (List) unsafe.getObject(obj, j), zzE(i4));
                    iM20280a += iZzu;
                    break;
                case 28:
                    iZzu = zzlz.zzc(i7, (List) unsafe.getObject(obj, j));
                    iM20280a += iZzu;
                    break;
                case 29:
                    iZzu = zzlz.zzv(i7, (List) unsafe.getObject(obj, j), false);
                    iM20280a += iZzu;
                    break;
                case 30:
                    iZzu = zzlz.zzd(i7, (List) unsafe.getObject(obj, j), false);
                    iM20280a += iZzu;
                    break;
                case 31:
                    iZzu = zzlz.zzf(i7, (List) unsafe.getObject(obj, j), false);
                    iM20280a += iZzu;
                    break;
                case 32:
                    iZzu = zzlz.zzh(i7, (List) unsafe.getObject(obj, j), false);
                    iM20280a += iZzu;
                    break;
                case 33:
                    iZzu = zzlz.zzq(i7, (List) unsafe.getObject(obj, j), false);
                    iM20280a += iZzu;
                    break;
                case 34:
                    iZzu = zzlz.zzs(i7, (List) unsafe.getObject(obj, j), false);
                    iM20280a += iZzu;
                    break;
                case 35:
                    iZzi = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iM20280a = g70.m20730a(iZzi, zzjm.zzz(i7), iZzi, iM20280a);
                    }
                    break;
                case 36:
                    iZzi = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iM20280a = g70.m20730a(iZzi, zzjm.zzz(i7), iZzi, iM20280a);
                    }
                    break;
                case 37:
                    iZzi = zzlz.zzn((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iM20280a = g70.m20730a(iZzi, zzjm.zzz(i7), iZzi, iM20280a);
                    }
                    break;
                case 38:
                    iZzi = zzlz.zzy((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iM20280a = g70.m20730a(iZzi, zzjm.zzz(i7), iZzi, iM20280a);
                    }
                    break;
                case 39:
                    iZzi = zzlz.zzl((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iM20280a = g70.m20730a(iZzi, zzjm.zzz(i7), iZzi, iM20280a);
                    }
                    break;
                case 40:
                    iZzi = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iM20280a = g70.m20730a(iZzi, zzjm.zzz(i7), iZzi, iM20280a);
                    }
                    break;
                case 41:
                    iZzi = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iM20280a = g70.m20730a(iZzi, zzjm.zzz(i7), iZzi, iM20280a);
                    }
                    break;
                case 42:
                    iZzi = zzlz.zzb((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iM20280a = g70.m20730a(iZzi, zzjm.zzz(i7), iZzi, iM20280a);
                    }
                    break;
                case 43:
                    iZzi = zzlz.zzw((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iM20280a = g70.m20730a(iZzi, zzjm.zzz(i7), iZzi, iM20280a);
                    }
                    break;
                case 44:
                    iZzi = zzlz.zze((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iM20280a = g70.m20730a(iZzi, zzjm.zzz(i7), iZzi, iM20280a);
                    }
                    break;
                case 45:
                    iZzi = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iM20280a = g70.m20730a(iZzi, zzjm.zzz(i7), iZzi, iM20280a);
                    }
                    break;
                case 46:
                    iZzi = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iM20280a = g70.m20730a(iZzi, zzjm.zzz(i7), iZzi, iM20280a);
                    }
                    break;
                case 47:
                    iZzi = zzlz.zzr((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iM20280a = g70.m20730a(iZzi, zzjm.zzz(i7), iZzi, iM20280a);
                    }
                    break;
                case 48:
                    iZzi = zzlz.zzt((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iM20280a = g70.m20730a(iZzi, zzjm.zzz(i7), iZzi, iM20280a);
                    }
                    break;
                case 49:
                    iZzu = zzlz.zzj(i7, (List) unsafe.getObject(obj, j), zzE(i4));
                    iM20280a += iZzu;
                    break;
                case 50:
                    zzlh.zza(i7, unsafe.getObject(obj, j), zzF(i4));
                    break;
                case 51:
                    if (zzX(obj, i7, i4)) {
                        iM20280a = f70.m20280a(i7 << 3, 8, iM20280a);
                    }
                    break;
                case 52:
                    if (zzX(obj, i7, i4)) {
                        iM20280a = f70.m20280a(i7 << 3, 4, iM20280a);
                    }
                    break;
                case 53:
                    break;
                case 54:
                    break;
                case CipherSuite.TLS_DH_RSA_WITH_AES_256_CBC_SHA /* 55 */:
                    break;
                case 56:
                    if (zzX(obj, i7, i4)) {
                        iM20280a = f70.m20280a(i7 << 3, 8, iM20280a);
                    }
                    break;
                case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CBC_SHA /* 57 */:
                    if (zzX(obj, i7, i4)) {
                        iM20280a = f70.m20280a(i7 << 3, 4, iM20280a);
                    }
                    break;
                case CipherSuite.TLS_DH_anon_WITH_AES_256_CBC_SHA /* 58 */:
                    if (zzX(obj, i7, i4)) {
                        iM20280a = f70.m20280a(i7 << 3, 1, iM20280a);
                    }
                    break;
                case 59:
                    if (zzX(obj, i7, i4)) {
                        object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzje) {
                            int iZzA7 = zzjm.zzA(i7 << 3);
                            int iZzd3 = ((zzje) object2).zzd();
                            iM20280a = g70.m20730a(iZzd3, iZzd3, iZzA7, iM20280a);
                        } else {
                            int iZzA8 = zzjm.zzA(i7 << 3);
                            int iZzy2 = zzjm.zzy((String) object2);
                            iZzB2 = iZzy2 + iZzA8;
                            iM20280a += iZzB2;
                        }
                    }
                    break;
                case 60:
                    if (zzX(obj, i7, i4)) {
                        iZzu = zzlz.zzo(i7, unsafe.getObject(obj, j), zzE(i4));
                        iM20280a += iZzu;
                    }
                    break;
                case 61:
                    if (zzX(obj, i7, i4)) {
                        object2 = unsafe.getObject(obj, j);
                        int iZzA9 = zzjm.zzA(i7 << 3);
                        int iZzd4 = ((zzje) object2).zzd();
                        iM20280a = g70.m20730a(iZzd4, iZzd4, iZzA9, iM20280a);
                    }
                    break;
                case VLCUtil.f17716h /* 62 */:
                    if (zzX(obj, i7, i4)) {
                        iZzr = zzr(obj, j);
                        iZzA3 = zzjm.zzA(i7 << 3);
                        iM20280a = f70.m20280a(iZzr, iZzA3, iM20280a);
                    }
                    break;
                case 63:
                    break;
                case 64:
                    if (zzX(obj, i7, i4)) {
                        iM20280a = f70.m20280a(i7 << 3, 4, iM20280a);
                    }
                    break;
                case DefaultScrollHandle.f11004h /* 65 */:
                    if (zzX(obj, i7, i4)) {
                        iM20280a = f70.m20280a(i7 << 3, 8, iM20280a);
                    }
                    break;
                case IjkMediaMeta.FF_PROFILE_H264_BASELINE /* 66 */:
                    if (zzX(obj, i7, i4)) {
                        int iZzr2 = zzr(obj, j);
                        iZzA3 = zzjm.zzA(i7 << 3);
                        iZzr = (iZzr2 >> 31) ^ (iZzr2 + iZzr2);
                        iM20280a = f70.m20280a(iZzr, iZzA3, iM20280a);
                    }
                    break;
                case 67:
                    if (zzX(obj, i7, i4)) {
                        long jZzC = zzC(obj, j);
                        iZzB2 = zzjm.zzB((jZzC >> 63) ^ (jZzC + jZzC)) + zzjm.zzA(i7 << 3);
                        iM20280a += iZzB2;
                    }
                    break;
                case 68:
                    if (zzX(obj, i7, i4)) {
                        iZzB2 = zzjm.zzu(i7, (zzlm) unsafe.getObject(obj, j), zzE(i4));
                        iM20280a += iZzB2;
                    }
                    break;
                default:
                    break;
            }
            i4 += 3;
            i3 = 1048575;
        }
        zzmo zzmoVar = this.zzn;
        int iZza = iM20280a + zzmoVar.zza(zzmoVar.zzd(obj));
        if (!this.zzh) {
            return iZza;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:155:0x033f  */
    /* JADX WARN: Code duplicated, block: B:184:0x0396  */
    /* JADX WARN: Code duplicated, block: B:28:0x008e  */
    /* JADX WARN: Code duplicated, block: B:31:0x009c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d5 A[PHI: r4
      0x00d5: PHI (r4v141 java.lang.Object) = (r4v16 java.lang.Object), (r4v136 java.lang.Object), (r4v144 java.lang.Object) binds: [B:168:0x036d, B:52:0x0108, B:43:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:54:0x010b A[PHI: r4
      0x010b: PHI (r4v132 java.lang.Object) = (r4v16 java.lang.Object), (r4v136 java.lang.Object) binds: [B:168:0x036d, B:52:0x0108] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x011e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0144  */
    /* JADX WARN: Code duplicated, block: B:85:0x0194 A[PHI: r4
      0x0194: PHI (r4v113 int) = 
      (r4v76 int)
      (r4v79 int)
      (r4v82 int)
      (r4v85 int)
      (r4v88 int)
      (r4v91 int)
      (r4v94 int)
      (r4v97 int)
      (r4v100 int)
      (r4v103 int)
      (r4v106 int)
      (r4v109 int)
      (r4v112 int)
      (r4v116 int)
     binds: [B:123:0x0247, B:120:0x0239, B:117:0x022b, B:114:0x021d, B:111:0x0210, B:108:0x0203, B:105:0x01f6, B:102:0x01e9, B:99:0x01dc, B:96:0x01cf, B:93:0x01c2, B:90:0x01b5, B:87:0x01a8, B:84:0x0192] A[DONT_GENERATE, DONT_INLINE]] */
    private final int zzq(Object obj) {
        long jZzd;
        Object objZzf;
        int iZzc;
        int iZzc2;
        int iZzc3;
        int iZzA;
        int iZzA2;
        int iZzu;
        int iZzm;
        int iZzi;
        int iZzB;
        int iZzA3;
        int iZzy;
        Unsafe unsafe = zzb;
        int iM20730a = 0;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzB2 = zzB(i);
            int iZzA4 = zzA(iZzB2);
            int i2 = this.zzc[i];
            long j = iZzB2 & 1048575;
            if (iZzA4 >= zzjx.zzJ.zza() && iZzA4 <= zzjx.zzW.zza()) {
                int i3 = this.zzc[i + 2];
            }
            switch (iZzA4) {
                case 0:
                    if (zzT(obj, i)) {
                        iM20730a = f70.m20280a(i2 << 3, 8, iM20730a);
                    }
                    break;
                case 1:
                    if (zzT(obj, i)) {
                        iM20730a = f70.m20280a(i2 << 3, 4, iM20730a);
                    }
                    break;
                case 2:
                    if (zzT(obj, i)) {
                        jZzd = zzmy.zzd(obj, j);
                        iZzA2 = zzjm.zzA(i2 << 3);
                        iZzB = zzjm.zzB(jZzd);
                        iZzu = iZzB + iZzA2;
                        iM20730a += iZzu;
                    }
                    break;
                case 3:
                    if (zzT(obj, i)) {
                        jZzd = zzmy.zzd(obj, j);
                        iZzA2 = zzjm.zzA(i2 << 3);
                        iZzB = zzjm.zzB(jZzd);
                        iZzu = iZzB + iZzA2;
                        iM20730a += iZzu;
                    }
                    break;
                case 4:
                    if (zzT(obj, i)) {
                        iZzc2 = zzmy.zzc(obj, j);
                        iZzA3 = zzjm.zzA(i2 << 3);
                        iZzy = zzjm.zzv(iZzc2);
                        iZzu = iZzy + iZzA3;
                        iM20730a += iZzu;
                    }
                    break;
                case 5:
                    if (zzT(obj, i)) {
                        iM20730a = f70.m20280a(i2 << 3, 8, iM20730a);
                    }
                    break;
                case 6:
                    if (zzT(obj, i)) {
                        iM20730a = f70.m20280a(i2 << 3, 4, iM20730a);
                    }
                    break;
                case 7:
                    if (zzT(obj, i)) {
                        iM20730a = f70.m20280a(i2 << 3, 1, iM20730a);
                    }
                    break;
                case 8:
                    if (zzT(obj, i)) {
                        objZzf = zzmy.zzf(obj, j);
                        if (objZzf instanceof zzje) {
                            int iZzA5 = zzjm.zzA(i2 << 3);
                            int iZzd = ((zzje) objZzf).zzd();
                            iM20730a = g70.m20730a(iZzd, iZzd, iZzA5, iM20730a);
                        } else {
                            iZzA3 = zzjm.zzA(i2 << 3);
                            iZzy = zzjm.zzy((String) objZzf);
                            iZzu = iZzy + iZzA3;
                            iM20730a += iZzu;
                        }
                    }
                    break;
                case 9:
                    if (zzT(obj, i)) {
                        iZzm = zzlz.zzo(i2, zzmy.zzf(obj, j), zzE(i));
                        iM20730a += iZzm;
                    }
                    break;
                case 10:
                    if (zzT(obj, i)) {
                        objZzf = zzmy.zzf(obj, j);
                        int iZzA6 = zzjm.zzA(i2 << 3);
                        int iZzd2 = ((zzje) objZzf).zzd();
                        iM20730a = g70.m20730a(iZzd2, iZzd2, iZzA6, iM20730a);
                    }
                    break;
                case 11:
                    if (zzT(obj, i)) {
                        iZzc = zzmy.zzc(obj, j);
                        iZzA = zzjm.zzA(i2 << 3);
                        iM20730a = f70.m20280a(iZzc, iZzA, iM20730a);
                    }
                    break;
                case 12:
                    if (zzT(obj, i)) {
                        iZzc2 = zzmy.zzc(obj, j);
                        iZzA3 = zzjm.zzA(i2 << 3);
                        iZzy = zzjm.zzv(iZzc2);
                        iZzu = iZzy + iZzA3;
                        iM20730a += iZzu;
                    }
                    break;
                case 13:
                    if (zzT(obj, i)) {
                        iM20730a = f70.m20280a(i2 << 3, 4, iM20730a);
                    }
                    break;
                case 14:
                    if (zzT(obj, i)) {
                        iM20730a = f70.m20280a(i2 << 3, 8, iM20730a);
                    }
                    break;
                case 15:
                    if (zzT(obj, i)) {
                        iZzc3 = zzmy.zzc(obj, j);
                        iZzA = zzjm.zzA(i2 << 3);
                        iZzc = (iZzc3 >> 31) ^ (iZzc3 + iZzc3);
                        iM20730a = f70.m20280a(iZzc, iZzA, iM20730a);
                    }
                    break;
                case 16:
                    if (zzT(obj, i)) {
                        long jZzd2 = zzmy.zzd(obj, j);
                        iZzA2 = zzjm.zzA(i2 << 3);
                        jZzd = (jZzd2 >> 63) ^ (jZzd2 + jZzd2);
                        iZzB = zzjm.zzB(jZzd);
                        iZzu = iZzB + iZzA2;
                        iM20730a += iZzu;
                    }
                    break;
                case 17:
                    if (zzT(obj, i)) {
                        iZzu = zzjm.zzu(i2, (zzlm) zzmy.zzf(obj, j), zzE(i));
                        iM20730a += iZzu;
                    }
                    break;
                case 18:
                case 23:
                case 32:
                    iZzm = zzlz.zzh(i2, (List) zzmy.zzf(obj, j), false);
                    iM20730a += iZzm;
                    break;
                case 19:
                case 24:
                case 31:
                    iZzm = zzlz.zzf(i2, (List) zzmy.zzf(obj, j), false);
                    iM20730a += iZzm;
                    break;
                case 20:
                    iZzm = zzlz.zzm(i2, (List) zzmy.zzf(obj, j), false);
                    iM20730a += iZzm;
                    break;
                case 21:
                    iZzm = zzlz.zzx(i2, (List) zzmy.zzf(obj, j), false);
                    iM20730a += iZzm;
                    break;
                case 22:
                    iZzm = zzlz.zzk(i2, (List) zzmy.zzf(obj, j), false);
                    iM20730a += iZzm;
                    break;
                case 25:
                    iZzm = zzlz.zza(i2, (List) zzmy.zzf(obj, j), false);
                    iM20730a += iZzm;
                    break;
                case 26:
                    iZzm = zzlz.zzu(i2, (List) zzmy.zzf(obj, j));
                    iM20730a += iZzm;
                    break;
                case 27:
                    iZzm = zzlz.zzp(i2, (List) zzmy.zzf(obj, j), zzE(i));
                    iM20730a += iZzm;
                    break;
                case 28:
                    iZzm = zzlz.zzc(i2, (List) zzmy.zzf(obj, j));
                    iM20730a += iZzm;
                    break;
                case 29:
                    iZzm = zzlz.zzv(i2, (List) zzmy.zzf(obj, j), false);
                    iM20730a += iZzm;
                    break;
                case 30:
                    iZzm = zzlz.zzd(i2, (List) zzmy.zzf(obj, j), false);
                    iM20730a += iZzm;
                    break;
                case 33:
                    iZzm = zzlz.zzq(i2, (List) zzmy.zzf(obj, j), false);
                    iM20730a += iZzm;
                    break;
                case 34:
                    iZzm = zzlz.zzs(i2, (List) zzmy.zzf(obj, j), false);
                    iM20730a += iZzm;
                    break;
                case 35:
                    iZzi = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iM20730a = g70.m20730a(iZzi, zzjm.zzz(i2), iZzi, iM20730a);
                    }
                    break;
                case 36:
                    iZzi = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iM20730a = g70.m20730a(iZzi, zzjm.zzz(i2), iZzi, iM20730a);
                    }
                    break;
                case 37:
                    iZzi = zzlz.zzn((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iM20730a = g70.m20730a(iZzi, zzjm.zzz(i2), iZzi, iM20730a);
                    }
                    break;
                case 38:
                    iZzi = zzlz.zzy((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iM20730a = g70.m20730a(iZzi, zzjm.zzz(i2), iZzi, iM20730a);
                    }
                    break;
                case 39:
                    iZzi = zzlz.zzl((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iM20730a = g70.m20730a(iZzi, zzjm.zzz(i2), iZzi, iM20730a);
                    }
                    break;
                case 40:
                    iZzi = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iM20730a = g70.m20730a(iZzi, zzjm.zzz(i2), iZzi, iM20730a);
                    }
                    break;
                case 41:
                    iZzi = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iM20730a = g70.m20730a(iZzi, zzjm.zzz(i2), iZzi, iM20730a);
                    }
                    break;
                case 42:
                    iZzi = zzlz.zzb((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iM20730a = g70.m20730a(iZzi, zzjm.zzz(i2), iZzi, iM20730a);
                    }
                    break;
                case 43:
                    iZzi = zzlz.zzw((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iM20730a = g70.m20730a(iZzi, zzjm.zzz(i2), iZzi, iM20730a);
                    }
                    break;
                case 44:
                    iZzi = zzlz.zze((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iM20730a = g70.m20730a(iZzi, zzjm.zzz(i2), iZzi, iM20730a);
                    }
                    break;
                case 45:
                    iZzi = zzlz.zzg((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iM20730a = g70.m20730a(iZzi, zzjm.zzz(i2), iZzi, iM20730a);
                    }
                    break;
                case 46:
                    iZzi = zzlz.zzi((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iM20730a = g70.m20730a(iZzi, zzjm.zzz(i2), iZzi, iM20730a);
                    }
                    break;
                case 47:
                    iZzi = zzlz.zzr((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iM20730a = g70.m20730a(iZzi, zzjm.zzz(i2), iZzi, iM20730a);
                    }
                    break;
                case 48:
                    iZzi = zzlz.zzt((List) unsafe.getObject(obj, j));
                    if (iZzi > 0) {
                        iM20730a = g70.m20730a(iZzi, zzjm.zzz(i2), iZzi, iM20730a);
                    }
                    break;
                case 49:
                    iZzm = zzlz.zzj(i2, (List) zzmy.zzf(obj, j), zzE(i));
                    iM20730a += iZzm;
                    break;
                case 50:
                    zzlh.zza(i2, zzmy.zzf(obj, j), zzF(i));
                    break;
                case 51:
                    if (zzX(obj, i2, i)) {
                        iM20730a = f70.m20280a(i2 << 3, 8, iM20730a);
                    }
                    break;
                case 52:
                    if (zzX(obj, i2, i)) {
                        iM20730a = f70.m20280a(i2 << 3, 4, iM20730a);
                    }
                    break;
                case 53:
                    if (zzX(obj, i2, i)) {
                        jZzd = zzC(obj, j);
                        iZzA2 = zzjm.zzA(i2 << 3);
                        iZzB = zzjm.zzB(jZzd);
                        iZzu = iZzB + iZzA2;
                        iM20730a += iZzu;
                    }
                    break;
                case 54:
                    if (zzX(obj, i2, i)) {
                        jZzd = zzC(obj, j);
                        iZzA2 = zzjm.zzA(i2 << 3);
                        iZzB = zzjm.zzB(jZzd);
                        iZzu = iZzB + iZzA2;
                        iM20730a += iZzu;
                    }
                    break;
                case CipherSuite.TLS_DH_RSA_WITH_AES_256_CBC_SHA /* 55 */:
                    if (zzX(obj, i2, i)) {
                        iZzc2 = zzr(obj, j);
                        iZzA3 = zzjm.zzA(i2 << 3);
                        iZzy = zzjm.zzv(iZzc2);
                        iZzu = iZzy + iZzA3;
                        iM20730a += iZzu;
                    }
                    break;
                case 56:
                    if (zzX(obj, i2, i)) {
                        iM20730a = f70.m20280a(i2 << 3, 8, iM20730a);
                    }
                    break;
                case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CBC_SHA /* 57 */:
                    if (zzX(obj, i2, i)) {
                        iM20730a = f70.m20280a(i2 << 3, 4, iM20730a);
                    }
                    break;
                case CipherSuite.TLS_DH_anon_WITH_AES_256_CBC_SHA /* 58 */:
                    if (zzX(obj, i2, i)) {
                        iM20730a = f70.m20280a(i2 << 3, 1, iM20730a);
                    }
                    break;
                case 59:
                    if (zzX(obj, i2, i)) {
                        objZzf = zzmy.zzf(obj, j);
                        if (objZzf instanceof zzje) {
                            int iZzA7 = zzjm.zzA(i2 << 3);
                            int iZzd3 = ((zzje) objZzf).zzd();
                            iM20730a = g70.m20730a(iZzd3, iZzd3, iZzA7, iM20730a);
                        } else {
                            iZzA3 = zzjm.zzA(i2 << 3);
                            iZzy = zzjm.zzy((String) objZzf);
                            iZzu = iZzy + iZzA3;
                            iM20730a += iZzu;
                        }
                    }
                    break;
                case 60:
                    if (zzX(obj, i2, i)) {
                        iZzm = zzlz.zzo(i2, zzmy.zzf(obj, j), zzE(i));
                        iM20730a += iZzm;
                    }
                    break;
                case 61:
                    if (zzX(obj, i2, i)) {
                        objZzf = zzmy.zzf(obj, j);
                        int iZzA8 = zzjm.zzA(i2 << 3);
                        int iZzd4 = ((zzje) objZzf).zzd();
                        iM20730a = g70.m20730a(iZzd4, iZzd4, iZzA8, iM20730a);
                    }
                    break;
                case VLCUtil.f17716h /* 62 */:
                    if (zzX(obj, i2, i)) {
                        iZzc = zzr(obj, j);
                        iZzA = zzjm.zzA(i2 << 3);
                        iM20730a = f70.m20280a(iZzc, iZzA, iM20730a);
                    }
                    break;
                case 63:
                    if (zzX(obj, i2, i)) {
                        iZzc2 = zzr(obj, j);
                        iZzA3 = zzjm.zzA(i2 << 3);
                        iZzy = zzjm.zzv(iZzc2);
                        iZzu = iZzy + iZzA3;
                        iM20730a += iZzu;
                    }
                    break;
                case 64:
                    if (zzX(obj, i2, i)) {
                        iM20730a = f70.m20280a(i2 << 3, 4, iM20730a);
                    }
                    break;
                case DefaultScrollHandle.f11004h /* 65 */:
                    if (zzX(obj, i2, i)) {
                        iM20730a = f70.m20280a(i2 << 3, 8, iM20730a);
                    }
                    break;
                case IjkMediaMeta.FF_PROFILE_H264_BASELINE /* 66 */:
                    if (zzX(obj, i2, i)) {
                        iZzc3 = zzr(obj, j);
                        iZzA = zzjm.zzA(i2 << 3);
                        iZzc = (iZzc3 >> 31) ^ (iZzc3 + iZzc3);
                        iM20730a = f70.m20280a(iZzc, iZzA, iM20730a);
                    }
                    break;
                case 67:
                    if (zzX(obj, i2, i)) {
                        long jZzC = zzC(obj, j);
                        iZzA2 = zzjm.zzA(i2 << 3);
                        iZzB = zzjm.zzB((jZzC >> 63) ^ (jZzC + jZzC));
                        iZzu = iZzB + iZzA2;
                        iM20730a += iZzu;
                    }
                    break;
                case 68:
                    if (zzX(obj, i2, i)) {
                        iZzu = zzjm.zzu(i2, (zzlm) zzmy.zzf(obj, j), zzE(i));
                        iM20730a += iZzu;
                    }
                    break;
            }
        }
        zzmo zzmoVar = this.zzn;
        return iM20730a + zzmoVar.zza(zzmoVar.zzd(obj));
    }

    private static int zzr(Object obj, long j) {
        return ((Integer) zzmy.zzf(obj, j)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzir zzirVar) throws IOException {
        Unsafe unsafe = zzb;
        Object objZzF = zzF(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzlg) object).zze()) {
            zzlg zzlgVarZzb = zzlg.zza().zzb();
            zzlh.zzb(zzlgVarZzb, object);
            unsafe.putObject(obj, j, zzlgVarZzb);
        }
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzir zzirVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzis.zzp(bArr, i))));
                unsafe.putInt(obj, j2, i4);
                return i + 8;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzis.zzb(bArr, i))));
                unsafe.putInt(obj, j2, i4);
                return i + 4;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int iZzm = zzis.zzm(bArr, i, zzirVar);
                unsafe.putObject(obj, j, Long.valueOf(zzirVar.zzb));
                unsafe.putInt(obj, j2, i4);
                return iZzm;
            case CipherSuite.TLS_DH_RSA_WITH_AES_256_CBC_SHA /* 55 */:
            case VLCUtil.f17716h /* 62 */:
                if (i5 != 0) {
                    return i;
                }
                int iZzj = zzis.zzj(bArr, i, zzirVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzirVar.zza));
                unsafe.putInt(obj, j2, i4);
                return iZzj;
            case 56:
            case DefaultScrollHandle.f11004h /* 65 */:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(zzis.zzp(bArr, i)));
                unsafe.putInt(obj, j2, i4);
                return i + 8;
            case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CBC_SHA /* 57 */:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(zzis.zzb(bArr, i)));
                unsafe.putInt(obj, j2, i4);
                return i + 4;
            case CipherSuite.TLS_DH_anon_WITH_AES_256_CBC_SHA /* 58 */:
                if (i5 != 0) {
                    return i;
                }
                int iZzm2 = zzis.zzm(bArr, i, zzirVar);
                unsafe.putObject(obj, j, Boolean.valueOf(zzirVar.zzb != 0));
                unsafe.putInt(obj, j2, i4);
                return iZzm2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iZzj2 = zzis.zzj(bArr, i, zzirVar);
                int i9 = zzirVar.zza;
                if (i9 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !zznd.zzf(bArr, iZzj2, iZzj2 + i9)) {
                        throw zzkp.zzc();
                    }
                    unsafe.putObject(obj, j, new String(bArr, iZzj2, i9, zzkn.zzb));
                    iZzj2 += i9;
                }
                unsafe.putInt(obj, j2, i4);
                return iZzj2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                Object objZzH = zzH(obj, i4, i8);
                int iZzo = zzis.zzo(objZzH, zzE(i8), bArr, i, i2, zzirVar);
                zzP(obj, i4, i8, objZzH);
                return iZzo;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int iZza = zzis.zza(bArr, i, zzirVar);
                unsafe.putObject(obj, j, zzirVar.zzc);
                unsafe.putInt(obj, j2, i4);
                return iZza;
            case 63:
                if (i5 != 0) {
                    return i;
                }
                int iZzj3 = zzis.zzj(bArr, i, zzirVar);
                int i10 = zzirVar.zza;
                zzkj zzkjVarZzD = zzD(i8);
                if (zzkjVarZzD == null || zzkjVarZzD.zza(i10)) {
                    unsafe.putObject(obj, j, Integer.valueOf(i10));
                    unsafe.putInt(obj, j2, i4);
                } else {
                    zzd(obj).zzj(i3, Long.valueOf(i10));
                }
                return iZzj3;
            case IjkMediaMeta.FF_PROFILE_H264_BASELINE /* 66 */:
                if (i5 != 0) {
                    return i;
                }
                int iZzj4 = zzis.zzj(bArr, i, zzirVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzji.zzb(zzirVar.zza)));
                unsafe.putInt(obj, j2, i4);
                return iZzj4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int iZzm3 = zzis.zzm(bArr, i, zzirVar);
                unsafe.putObject(obj, j, Long.valueOf(zzji.zzc(zzirVar.zzb)));
                unsafe.putInt(obj, j2, i4);
                return iZzm3;
            case 68:
                if (i5 != 3) {
                    return i;
                }
                Object objZzH2 = zzH(obj, i4, i8);
                int iZzn = zzis.zzn(objZzH2, zzE(i8), bArr, i, i2, (i3 & (-8)) | 4, zzirVar);
                zzP(obj, i4, i8, objZzH2);
                return iZzn;
            default:
                return i;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x029d A[PHI: r0 r19 r26 r27 r28
      0x029d: PHI (r0v21 int) = (r0v16 int), (r0v19 int), (r0v23 int) binds: [B:114:0x0302, B:110:0x02e4, B:100:0x029b] A[DONT_GENERATE, DONT_INLINE]
      0x029d: PHI (r19v4 int) = (r19v2 int), (r19v2 int), (r19v5 int) binds: [B:114:0x0302, B:110:0x02e4, B:100:0x029b] A[DONT_GENERATE, DONT_INLINE]
      0x029d: PHI (r26v2 int) = (r26v0 int), (r26v0 int), (r26v3 int) binds: [B:114:0x0302, B:110:0x02e4, B:100:0x029b] A[DONT_GENERATE, DONT_INLINE]
      0x029d: PHI (r27v3 int) = (r27v1 int), (r27v1 int), (r27v4 int) binds: [B:114:0x0302, B:110:0x02e4, B:100:0x029b] A[DONT_GENERATE, DONT_INLINE]
      0x029d: PHI (r28v6 sun.misc.Unsafe) = (r28v4 sun.misc.Unsafe), (r28v4 sun.misc.Unsafe), (r28v7 sun.misc.Unsafe) binds: [B:114:0x0302, B:110:0x02e4, B:100:0x029b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:103:0x02b3 A[PHI: r0 r19 r26 r27 r28
      0x02b3: PHI (r0v20 int) = (r0v16 int), (r0v19 int), (r0v23 int) binds: [B:114:0x0302, B:110:0x02e4, B:100:0x029b] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r19v3 int) = (r19v2 int), (r19v2 int), (r19v5 int) binds: [B:114:0x0302, B:110:0x02e4, B:100:0x029b] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r26v1 int) = (r26v0 int), (r26v0 int), (r26v3 int) binds: [B:114:0x0302, B:110:0x02e4, B:100:0x029b] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r27v2 int) = (r27v1 int), (r27v1 int), (r27v4 int) binds: [B:114:0x0302, B:110:0x02e4, B:100:0x029b] A[DONT_GENERATE, DONT_INLINE]
      0x02b3: PHI (r28v5 sun.misc.Unsafe) = (r28v4 sun.misc.Unsafe), (r28v4 sun.misc.Unsafe), (r28v7 sun.misc.Unsafe) binds: [B:114:0x0302, B:110:0x02e4, B:100:0x029b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x0088. Please report as an issue. */
    private final int zzu(Object obj, byte[] bArr, int i, int i2, zzir zzirVar) throws IOException {
        int i3;
        int iZzk;
        int i4;
        int i5;
        Unsafe unsafe;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iZza;
        int iZzm;
        this = this;
        obj = obj;
        bArr = bArr;
        i2 = i2;
        zzirVar = zzirVar;
        zzJ(obj);
        Unsafe unsafe2 = zzb;
        int i13 = 1048575;
        int i14 = -1;
        int iZzi = i;
        int i15 = -1;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1048575;
        while (iZzi < i2) {
            int i19 = iZzi + 1;
            byte b = bArr[iZzi];
            if (b < 0) {
                iZzk = zzis.zzk(b, bArr, i19, zzirVar);
                i3 = zzirVar.zza;
            } else {
                i3 = b;
                iZzk = i19;
            }
            int i20 = i3 >>> 3;
            int i21 = i3 & 7;
            int iZzx = i20 > i15 ? this.zzx(i20, i16 / 3) : this.zzw(i20);
            if (iZzx == i14) {
                i4 = iZzk;
                i5 = i20;
                unsafe = unsafe2;
                i6 = 0;
            } else {
                int[] iArr = this.zzc;
                int i22 = iArr[iZzx + 1];
                int iZzA = zzA(i22);
                long j = i22 & i13;
                if (iZzA <= 17) {
                    int i23 = iArr[iZzx + 2];
                    int i24 = 1 << (i23 >>> 20);
                    int i25 = 1048575;
                    int i26 = i23 & 1048575;
                    if (i26 != i18) {
                        if (i18 != 1048575) {
                            unsafe2.putInt(obj, i18, i17);
                            i25 = 1048575;
                        }
                        if (i26 != i25) {
                            i17 = unsafe2.getInt(obj, i26);
                        }
                        i18 = i26;
                    }
                    switch (iZzA) {
                        case 0:
                            i5 = i20;
                            i7 = iZzx;
                            i11 = iZzk;
                            i12 = i17;
                            if (i21 == 1) {
                                zzmy.zzo(obj, j, Double.longBitsToDouble(zzis.zzp(bArr, i11)));
                                iZzi = i11 + 8;
                                i17 = i12 | i24;
                                i16 = i7;
                                i15 = i5;
                                i14 = -1;
                                i13 = 1048575;
                            }
                            i17 = i12;
                            unsafe = unsafe2;
                            i6 = i7;
                            i4 = i11;
                            break;
                        case 1:
                            i5 = i20;
                            zzirVar = zzirVar;
                            i7 = iZzx;
                            i11 = iZzk;
                            i12 = i17;
                            if (i21 == 5) {
                                zzmy.zzp(obj, j, Float.intBitsToFloat(zzis.zzb(bArr, i11)));
                                iZzi = i11 + 4;
                                i17 = i12 | i24;
                                i16 = i7;
                                i15 = i5;
                                i14 = -1;
                                i13 = 1048575;
                            }
                            i17 = i12;
                            unsafe = unsafe2;
                            i6 = i7;
                            i4 = i11;
                            break;
                        case 2:
                        case 3:
                            i5 = i20;
                            zzirVar = zzirVar;
                            i7 = iZzx;
                            i11 = iZzk;
                            i12 = i17;
                            if (i21 != 0) {
                                i17 = i12;
                                unsafe = unsafe2;
                                i6 = i7;
                                i4 = i11;
                            } else {
                                iZzm = zzis.zzm(bArr, i11, zzirVar);
                                unsafe2.putLong(obj, j, zzirVar.zzb);
                                i17 = i12 | i24;
                                i16 = i7;
                                iZzi = iZzm;
                                i15 = i5;
                                i14 = -1;
                                i13 = 1048575;
                                i2 = i2;
                            }
                            break;
                        case 4:
                        case 11:
                            i5 = i20;
                            zzirVar = zzirVar;
                            i7 = iZzx;
                            i11 = iZzk;
                            i12 = i17;
                            if (i21 == 0) {
                                iZzi = zzis.zzj(bArr, i11, zzirVar);
                                unsafe2.putInt(obj, j, zzirVar.zza);
                                i17 = i12 | i24;
                                i16 = i7;
                                i15 = i5;
                                i14 = -1;
                                i13 = 1048575;
                            }
                            i17 = i12;
                            unsafe = unsafe2;
                            i6 = i7;
                            i4 = i11;
                            break;
                        case 5:
                        case 14:
                            i5 = i20;
                            i7 = iZzx;
                            i12 = i17;
                            if (i21 == 1) {
                                i11 = iZzk;
                                unsafe2.putLong(obj, j, zzis.zzp(bArr, iZzk));
                                iZzi = i11 + 8;
                                i17 = i12 | i24;
                                i16 = i7;
                                i15 = i5;
                                i14 = -1;
                                i13 = 1048575;
                            }
                            i11 = iZzk;
                            i17 = i12;
                            unsafe = unsafe2;
                            i6 = i7;
                            i4 = i11;
                            break;
                        case 6:
                        case 13:
                            i5 = i20;
                            zzirVar = zzirVar;
                            i7 = iZzx;
                            i12 = i17;
                            if (i21 == 5) {
                                unsafe2.putInt(obj, j, zzis.zzb(bArr, iZzk));
                                iZzi = iZzk + 4;
                                i17 = i12 | i24;
                                i16 = i7;
                                i15 = i5;
                                i14 = -1;
                                i13 = 1048575;
                            }
                            i11 = iZzk;
                            i17 = i12;
                            unsafe = unsafe2;
                            i6 = i7;
                            i4 = i11;
                            break;
                        case 7:
                            i5 = i20;
                            zzirVar = zzirVar;
                            i7 = iZzx;
                            i12 = i17;
                            if (i21 == 0) {
                                int iZzm2 = zzis.zzm(bArr, iZzk, zzirVar);
                                zzmy.zzm(obj, j, zzirVar.zzb != 0);
                                i17 = i12 | i24;
                                iZzi = iZzm2;
                                i16 = i7;
                                i15 = i5;
                                i14 = -1;
                                i13 = 1048575;
                            }
                            i11 = iZzk;
                            i17 = i12;
                            unsafe = unsafe2;
                            i6 = i7;
                            i4 = i11;
                            break;
                        case 8:
                            i5 = i20;
                            zzirVar = zzirVar;
                            i7 = iZzx;
                            i12 = i17;
                            if (i21 == 2) {
                                iZzi = (536870912 & i22) == 0 ? zzis.zzg(bArr, iZzk, zzirVar) : zzis.zzh(bArr, iZzk, zzirVar);
                                unsafe2.putObject(obj, j, zzirVar.zzc);
                                i17 = i12 | i24;
                                i16 = i7;
                                i15 = i5;
                                i14 = -1;
                                i13 = 1048575;
                            }
                            i11 = iZzk;
                            i17 = i12;
                            unsafe = unsafe2;
                            i6 = i7;
                            i4 = i11;
                            break;
                        case 9:
                            i5 = i20;
                            zzirVar = zzirVar;
                            i7 = iZzx;
                            if (i21 == 2) {
                                Object objZzG = this.zzG(obj, i7);
                                iZzi = zzis.zzo(objZzG, this.zzE(i7), bArr, iZzk, i2, zzirVar);
                                this.zzO(obj, i7, objZzG);
                                i17 |= i24;
                                i16 = i7;
                                i15 = i5;
                                i14 = -1;
                                i13 = 1048575;
                            }
                            i11 = iZzk;
                            i12 = i17;
                            i17 = i12;
                            unsafe = unsafe2;
                            i6 = i7;
                            i4 = i11;
                            break;
                        case 10:
                            i5 = i20;
                            zzirVar = zzirVar;
                            i7 = iZzx;
                            if (i21 == 2) {
                                iZza = zzis.zza(bArr, iZzk, zzirVar);
                                unsafe2.putObject(obj, j, zzirVar.zzc);
                                i17 |= i24;
                                iZzi = iZza;
                                i16 = i7;
                                i15 = i5;
                                i14 = -1;
                                i13 = 1048575;
                            }
                            i11 = iZzk;
                            i12 = i17;
                            i17 = i12;
                            unsafe = unsafe2;
                            i6 = i7;
                            i4 = i11;
                            break;
                        case 12:
                            i5 = i20;
                            zzirVar = zzirVar;
                            i7 = iZzx;
                            if (i21 == 0) {
                                iZza = zzis.zzj(bArr, iZzk, zzirVar);
                                unsafe2.putInt(obj, j, zzirVar.zza);
                                i17 |= i24;
                                iZzi = iZza;
                                i16 = i7;
                                i15 = i5;
                                i14 = -1;
                                i13 = 1048575;
                            }
                            i11 = iZzk;
                            i12 = i17;
                            i17 = i12;
                            unsafe = unsafe2;
                            i6 = i7;
                            i4 = i11;
                            break;
                        case 15:
                            i5 = i20;
                            zzirVar = zzirVar;
                            i7 = iZzx;
                            if (i21 == 0) {
                                iZzi = zzis.zzj(bArr, iZzk, zzirVar);
                                unsafe2.putInt(obj, j, zzji.zzb(zzirVar.zza));
                                i17 |= i24;
                                i16 = i7;
                                i15 = i5;
                                i14 = -1;
                                i13 = 1048575;
                            }
                            i11 = iZzk;
                            i12 = i17;
                            i17 = i12;
                            unsafe = unsafe2;
                            i6 = i7;
                            i4 = i11;
                            break;
                        case 16:
                            if (i21 != 0) {
                                i5 = i20;
                                i7 = iZzx;
                                i11 = iZzk;
                                i12 = i17;
                                i17 = i12;
                                unsafe = unsafe2;
                                i6 = i7;
                                i4 = i11;
                            } else {
                                zzirVar = zzirVar;
                                iZzm = zzis.zzm(bArr, iZzk, zzirVar);
                                i7 = iZzx;
                                i5 = i20;
                                unsafe2.putLong(obj, j, zzji.zzc(zzirVar.zzb));
                                i17 |= i24;
                                i16 = i7;
                                iZzi = iZzm;
                                i15 = i5;
                                i14 = -1;
                                i13 = 1048575;
                                i2 = i2;
                            }
                            break;
                        default:
                            i5 = i20;
                            i7 = iZzx;
                            i11 = iZzk;
                            i12 = i17;
                            i17 = i12;
                            unsafe = unsafe2;
                            i6 = i7;
                            i4 = i11;
                            break;
                    }
                } else {
                    i5 = i20;
                    int i27 = i17;
                    zzirVar = zzirVar;
                    i7 = iZzx;
                    if (iZzA != 27) {
                        if (iZzA <= 49) {
                            int i28 = iZzk;
                            i9 = i18;
                            i10 = i27;
                            unsafe = unsafe2;
                            i6 = i7;
                            iZzi = zzv(obj, bArr, iZzk, i2, i3, i5, i21, i7, i22, iZzA, j, zzirVar);
                            if (iZzi != i28) {
                                i16 = i6;
                                i15 = i5;
                                i18 = i9;
                                i17 = i10;
                            } else {
                                i4 = iZzi;
                                i18 = i9;
                                i17 = i10;
                            }
                            unsafe2 = unsafe;
                        } else {
                            i8 = iZzk;
                            i9 = i18;
                            i10 = i27;
                            unsafe = unsafe2;
                            i6 = i7;
                            if (iZzA == 50) {
                                if (i21 == 2) {
                                    iZzi = zzs(obj, bArr, i8, i2, i6, j, zzirVar);
                                    if (iZzi != i8) {
                                        i16 = i6;
                                        i15 = i5;
                                        i18 = i9;
                                        i17 = i10;
                                    } else {
                                        i4 = iZzi;
                                    }
                                    unsafe2 = unsafe;
                                }
                                i18 = i9;
                                i17 = i10;
                            } else {
                                iZzi = zzt(obj, bArr, i8, i2, i3, i5, i21, i22, iZzA, j, i6, zzirVar);
                                if (iZzi != i8) {
                                    i16 = i6;
                                    i15 = i5;
                                    i18 = i9;
                                    i17 = i10;
                                } else {
                                    i4 = iZzi;
                                    i18 = i9;
                                    i17 = i10;
                                }
                                unsafe2 = unsafe;
                            }
                        }
                        i14 = -1;
                        i13 = 1048575;
                    } else if (i21 == 2) {
                        zzkm zzkmVarZzd = (zzkm) unsafe2.getObject(obj, j);
                        if (!zzkmVarZzd.zzc()) {
                            int size = zzkmVarZzd.size();
                            zzkmVarZzd = zzkmVarZzd.zzd(size == 0 ? 10 : size + size);
                            unsafe2.putObject(obj, j, zzkmVarZzd);
                        }
                        iZzi = zzis.zze(this.zzE(i7), i3, bArr, iZzk, i2, zzkmVarZzd, zzirVar);
                        i17 = i27;
                        i16 = i7;
                        i15 = i5;
                        i14 = -1;
                        i13 = 1048575;
                    } else {
                        i8 = iZzk;
                        i9 = i18;
                        i10 = i27;
                        unsafe = unsafe2;
                        i6 = i7;
                    }
                    i4 = i8;
                    i18 = i9;
                    i17 = i10;
                }
            }
            iZzi = zzis.zzi(i3, bArr, i4, i2, zzd(obj), zzirVar);
            i16 = i6;
            i15 = i5;
            unsafe2 = unsafe;
            i14 = -1;
            i13 = 1048575;
        }
        int i29 = i17;
        Unsafe unsafe3 = unsafe2;
        if (i18 != 1048575) {
            unsafe3.putInt(obj, i18, i29);
        }
        if (iZzi == i2) {
            return iZzi;
        }
        throw zzkp.zze();
    }

    /* JADX WARN: Code duplicated, block: B:153:0x026d A[LOOP:9: B:154:0x026e->B:153:0x026d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:156:0x0273  */
    /* JADX WARN: Code duplicated, block: B:159:0x027c  */
    /* JADX WARN: Code duplicated, block: B:286:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x01c7 -> B:94:0x01a6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:123:0x020e -> B:113:0x01e5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:160:0x0284 -> B:152:0x026b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x015d -> B:63:0x0138). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final int zzv(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.measurement.zzir r29) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlp.zzv(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.zzir):int");
    }

    private final int zzw(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, 0);
    }

    private final int zzx(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, i2);
    }

    private final int zzy(int i) {
        return this.zzc[i + 2];
    }

    private final int zzz(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0083  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f0 A[PHI: r3
      0x00f0: PHI (r3v8 java.lang.Object) = (r3v5 java.lang.Object), (r3v9 java.lang.Object) binds: [B:74:0x010c, B:68:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    @Override // com.google.android.gms.internal.measurement.zzlx
    public final int zzb(Object obj) {
        int i;
        double dZza;
        float fZzb;
        boolean zZzw;
        Object objZzf;
        int i2;
        int iZzc;
        long jZzd;
        int iFloatToIntBits;
        int length = this.zzc.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iZzB = zzB(i4);
            int i5 = this.zzc[i4];
            long j = 1048575 & iZzB;
            int iHashCode = 37;
            switch (zzA(iZzB)) {
                case 0:
                    i = i3 * 53;
                    dZza = zzmy.zza(obj, j);
                    jZzd = Double.doubleToLongBits(dZza);
                    iFloatToIntBits = zzkn.zzc(jZzd);
                    i3 = iFloatToIntBits + i;
                    break;
                case 1:
                    i = i3 * 53;
                    fZzb = zzmy.zzb(obj, j);
                    iFloatToIntBits = Float.floatToIntBits(fZzb);
                    i3 = iFloatToIntBits + i;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i = i3 * 53;
                    jZzd = zzmy.zzd(obj, j);
                    iFloatToIntBits = zzkn.zzc(jZzd);
                    i3 = iFloatToIntBits + i;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i2 = i3 * 53;
                    iZzc = zzmy.zzc(obj, j);
                    i3 = i2 + iZzc;
                    break;
                case 7:
                    i = i3 * 53;
                    zZzw = zzmy.zzw(obj, j);
                    iFloatToIntBits = zzkn.zza(zZzw);
                    i3 = iFloatToIntBits + i;
                    break;
                case 8:
                    i = i3 * 53;
                    iFloatToIntBits = ((String) zzmy.zzf(obj, j)).hashCode();
                    i3 = iFloatToIntBits + i;
                    break;
                case 9:
                    objZzf = zzmy.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    i = i3 * 53;
                    iFloatToIntBits = zzmy.zzf(obj, j).hashCode();
                    i3 = iFloatToIntBits + i;
                    break;
                case 17:
                    objZzf = zzmy.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 51:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        dZza = zzn(obj, j);
                        jZzd = Double.doubleToLongBits(dZza);
                        iFloatToIntBits = zzkn.zzc(jZzd);
                        i3 = iFloatToIntBits + i;
                    }
                    break;
                case 52:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        fZzb = zzo(obj, j);
                        iFloatToIntBits = Float.floatToIntBits(fZzb);
                        i3 = iFloatToIntBits + i;
                    }
                    break;
                case 53:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        jZzd = zzC(obj, j);
                        iFloatToIntBits = zzkn.zzc(jZzd);
                        i3 = iFloatToIntBits + i;
                    }
                    break;
                case 54:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        jZzd = zzC(obj, j);
                        iFloatToIntBits = zzkn.zzc(jZzd);
                        i3 = iFloatToIntBits + i;
                    }
                    break;
                case CipherSuite.TLS_DH_RSA_WITH_AES_256_CBC_SHA /* 55 */:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iZzc = zzr(obj, j);
                        i3 = i2 + iZzc;
                    }
                    break;
                case 56:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        jZzd = zzC(obj, j);
                        iFloatToIntBits = zzkn.zzc(jZzd);
                        i3 = iFloatToIntBits + i;
                    }
                    break;
                case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CBC_SHA /* 57 */:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iZzc = zzr(obj, j);
                        i3 = i2 + iZzc;
                    }
                    break;
                case CipherSuite.TLS_DH_anon_WITH_AES_256_CBC_SHA /* 58 */:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        zZzw = zzY(obj, j);
                        iFloatToIntBits = zzkn.zza(zZzw);
                        i3 = iFloatToIntBits + i;
                    }
                    break;
                case 59:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = ((String) zzmy.zzf(obj, j)).hashCode();
                        i3 = iFloatToIntBits + i;
                    }
                    break;
                case 60:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzmy.zzf(obj, j).hashCode();
                        i3 = iFloatToIntBits + i;
                    }
                    break;
                case 61:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzmy.zzf(obj, j).hashCode();
                        i3 = iFloatToIntBits + i;
                    }
                    break;
                case VLCUtil.f17716h /* 62 */:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iZzc = zzr(obj, j);
                        i3 = i2 + iZzc;
                    }
                    break;
                case 63:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iZzc = zzr(obj, j);
                        i3 = i2 + iZzc;
                    }
                    break;
                case 64:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iZzc = zzr(obj, j);
                        i3 = i2 + iZzc;
                    }
                    break;
                case DefaultScrollHandle.f11004h /* 65 */:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        jZzd = zzC(obj, j);
                        iFloatToIntBits = zzkn.zzc(jZzd);
                        i3 = iFloatToIntBits + i;
                    }
                    break;
                case IjkMediaMeta.FF_PROFILE_H264_BASELINE /* 66 */:
                    if (zzX(obj, i5, i4)) {
                        i2 = i3 * 53;
                        iZzc = zzr(obj, j);
                        i3 = i2 + iZzc;
                    }
                    break;
                case 67:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        jZzd = zzC(obj, j);
                        iFloatToIntBits = zzkn.zzc(jZzd);
                        i3 = iFloatToIntBits + i;
                    }
                    break;
                case 68:
                    if (zzX(obj, i5, i4)) {
                        i = i3 * 53;
                        iFloatToIntBits = zzmy.zzf(obj, j).hashCode();
                        i3 = iFloatToIntBits + i;
                    }
                    break;
            }
        }
        int iHashCode2 = this.zzn.zzd(obj).hashCode() + (i3 * 53);
        if (!this.zzh) {
            return iHashCode2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    public final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzir zzirVar) throws IOException {
        Unsafe unsafe;
        Object obj2;
        zzlp<T> zzlpVar;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        zzir zzirVar2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j;
        int iZzb;
        int i15;
        zzlp<T> zzlpVar2 = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        i2 = i2;
        int i16 = i3;
        zzir zzirVar3 = zzirVar;
        zzJ(obj);
        Unsafe unsafe2 = zzb;
        int iZzi = i;
        int i17 = 0;
        int i18 = -1;
        int i19 = 0;
        int i20 = 0;
        int i21 = 1048575;
        while (true) {
            if (iZzi < i2) {
                int i22 = iZzi + 1;
                byte b = bArr2[iZzi];
                if (b < 0) {
                    int iZzk = zzis.zzk(b, bArr2, i22, zzirVar3);
                    i4 = zzirVar3.zza;
                    i22 = iZzk;
                } else {
                    i4 = b;
                }
                int i23 = i4 >>> 3;
                int i24 = i4 & 7;
                int iZzx = i23 > i18 ? zzlpVar2.zzx(i23, i19 / 3) : zzlpVar2.zzw(i23);
                if (iZzx == -1) {
                    i5 = i23;
                    i6 = i22;
                    i7 = i4;
                    i8 = i20;
                    unsafe = unsafe2;
                    i3 = i16;
                    i9 = 0;
                } else {
                    int[] iArr = zzlpVar2.zzc;
                    int i25 = iArr[iZzx + 1];
                    int iZzA = zzA(i25);
                    int i26 = i22;
                    long j2 = i25 & 1048575;
                    int i27 = i4;
                    if (iZzA <= 17) {
                        int i28 = iArr[iZzx + 2];
                        int i29 = 1 << (i28 >>> 20);
                        int i30 = i28 & 1048575;
                        if (i30 != i21) {
                            if (i21 != 1048575) {
                                unsafe2.putInt(obj3, i21, i20);
                            }
                            i21 = i30;
                            i8 = unsafe2.getInt(obj3, i30);
                        } else {
                            i8 = i20;
                            i21 = i21;
                        }
                        switch (iZzA) {
                            case 0:
                                i10 = i23;
                                i11 = iZzx;
                                i12 = i26;
                                bArr2 = bArr;
                                if (i24 == 1) {
                                    zzmy.zzo(obj3, j2, Double.longBitsToDouble(zzis.zzp(bArr2, i12)));
                                    iZzi = i12 + 8;
                                    i20 = i8 | i29;
                                    i18 = i10;
                                    i19 = i11;
                                    i17 = i27;
                                    i16 = i3;
                                } else {
                                    i6 = i12;
                                    unsafe = unsafe2;
                                    i5 = i10;
                                    i9 = i11;
                                    i7 = i27;
                                    i21 = i21;
                                }
                                break;
                            case 1:
                                i10 = i23;
                                i11 = iZzx;
                                i12 = i26;
                                bArr2 = bArr;
                                if (i24 == 5) {
                                    zzmy.zzp(obj3, j2, Float.intBitsToFloat(zzis.zzb(bArr2, i12)));
                                    iZzi = i12 + 4;
                                    i20 = i8 | i29;
                                    i18 = i10;
                                    i19 = i11;
                                    i17 = i27;
                                    i16 = i3;
                                } else {
                                    i6 = i12;
                                    unsafe = unsafe2;
                                    i5 = i10;
                                    i9 = i11;
                                    i7 = i27;
                                    i21 = i21;
                                }
                                break;
                            case 2:
                            case 3:
                                i10 = i23;
                                i11 = iZzx;
                                i12 = i26;
                                bArr2 = bArr;
                                if (i24 == 0) {
                                    int iZzm = zzis.zzm(bArr2, i12, zzirVar3);
                                    unsafe2.putLong(obj, j2, zzirVar3.zzb);
                                    i20 = i8 | i29;
                                    iZzi = iZzm;
                                    i18 = i10;
                                    i19 = i11;
                                    i17 = i27;
                                    i16 = i3;
                                } else {
                                    i6 = i12;
                                    unsafe = unsafe2;
                                    i5 = i10;
                                    i9 = i11;
                                    i7 = i27;
                                    i21 = i21;
                                }
                                break;
                            case 4:
                            case 11:
                                i10 = i23;
                                i11 = iZzx;
                                i12 = i26;
                                bArr2 = bArr;
                                if (i24 == 0) {
                                    iZzi = zzis.zzj(bArr2, i12, zzirVar3);
                                    unsafe2.putInt(obj3, j2, zzirVar3.zza);
                                    i20 = i8 | i29;
                                    i18 = i10;
                                    i19 = i11;
                                    i17 = i27;
                                    i16 = i3;
                                } else {
                                    i6 = i12;
                                    unsafe = unsafe2;
                                    i5 = i10;
                                    i9 = i11;
                                    i7 = i27;
                                    i21 = i21;
                                }
                                break;
                            case 5:
                            case 14:
                                i10 = i23;
                                i11 = iZzx;
                                i12 = i26;
                                i13 = i27;
                                bArr2 = bArr;
                                if (i24 == 1) {
                                    i27 = i13;
                                    unsafe2.putLong(obj, j2, zzis.zzp(bArr2, i12));
                                    iZzi = i12 + 8;
                                    i20 = i8 | i29;
                                    i18 = i10;
                                    i19 = i11;
                                    i17 = i27;
                                    i16 = i3;
                                } else {
                                    i27 = i13;
                                    i6 = i12;
                                    unsafe = unsafe2;
                                    i5 = i10;
                                    i9 = i11;
                                    i7 = i27;
                                    i21 = i21;
                                }
                                break;
                            case 6:
                            case 13:
                                i10 = i23;
                                i11 = iZzx;
                                i12 = i26;
                                i13 = i27;
                                bArr2 = bArr;
                                if (i24 == 5) {
                                    unsafe2.putInt(obj3, j2, zzis.zzb(bArr2, i12));
                                    iZzi = i12 + 4;
                                    i18 = i10;
                                    i19 = i11;
                                    i21 = i21;
                                    i2 = i2;
                                    i16 = i3;
                                    int i31 = i13;
                                    i20 = i8 | i29;
                                    i17 = i31;
                                } else {
                                    i27 = i13;
                                    i6 = i12;
                                    unsafe = unsafe2;
                                    i5 = i10;
                                    i9 = i11;
                                    i7 = i27;
                                    i21 = i21;
                                }
                                break;
                            case 7:
                                i10 = i23;
                                i11 = iZzx;
                                i12 = i26;
                                i13 = i27;
                                bArr2 = bArr;
                                if (i24 == 0) {
                                    iZzi = zzis.zzm(bArr2, i12, zzirVar3);
                                    zzmy.zzm(obj3, j2, zzirVar3.zzb != 0);
                                    i18 = i10;
                                    i19 = i11;
                                    i21 = i21;
                                    i2 = i2;
                                    i16 = i3;
                                    int i32 = i13;
                                    i20 = i8 | i29;
                                    i17 = i32;
                                } else {
                                    i27 = i13;
                                    i6 = i12;
                                    unsafe = unsafe2;
                                    i5 = i10;
                                    i9 = i11;
                                    i7 = i27;
                                    i21 = i21;
                                }
                                break;
                            case 8:
                                i10 = i23;
                                i11 = iZzx;
                                i12 = i26;
                                i13 = i27;
                                bArr2 = bArr;
                                if (i24 == 2) {
                                    iZzi = (536870912 & i25) == 0 ? zzis.zzg(bArr2, i12, zzirVar3) : zzis.zzh(bArr2, i12, zzirVar3);
                                    unsafe2.putObject(obj3, j2, zzirVar3.zzc);
                                    i18 = i10;
                                    i19 = i11;
                                    i21 = i21;
                                    i2 = i2;
                                    i16 = i3;
                                    int i33 = i13;
                                    i20 = i8 | i29;
                                    i17 = i33;
                                } else {
                                    i27 = i13;
                                    i6 = i12;
                                    unsafe = unsafe2;
                                    i5 = i10;
                                    i9 = i11;
                                    i7 = i27;
                                    i21 = i21;
                                }
                                break;
                            case 9:
                                bArr2 = bArr;
                                i10 = i23;
                                i11 = iZzx;
                                i12 = i26;
                                i14 = i27;
                                if (i24 == 2) {
                                    Object objZzG = zzlpVar2.zzG(obj3, i11);
                                    iZzi = zzis.zzo(objZzG, zzlpVar2.zzE(i11), bArr, i12, i2, zzirVar);
                                    zzlpVar2.zzO(obj3, i11, objZzG);
                                    i20 = i8 | i29;
                                    i17 = i14;
                                    i18 = i10;
                                    i19 = i11;
                                    i16 = i3;
                                } else {
                                    i27 = i14;
                                    i6 = i12;
                                    unsafe = unsafe2;
                                    i5 = i10;
                                    i9 = i11;
                                    i7 = i27;
                                    i21 = i21;
                                }
                                break;
                            case 10:
                                i10 = i23;
                                i11 = iZzx;
                                i12 = i26;
                                i14 = i27;
                                bArr2 = bArr;
                                if (i24 == 2) {
                                    iZzi = zzis.zza(bArr2, i12, zzirVar3);
                                    unsafe2.putObject(obj3, j2, zzirVar3.zzc);
                                    i20 = i8 | i29;
                                    i17 = i14;
                                    i18 = i10;
                                    i19 = i11;
                                    i16 = i3;
                                } else {
                                    i27 = i14;
                                    i6 = i12;
                                    unsafe = unsafe2;
                                    i5 = i10;
                                    i9 = i11;
                                    i7 = i27;
                                    i21 = i21;
                                }
                                break;
                            case 12:
                                i10 = i23;
                                j = j2;
                                i11 = iZzx;
                                i12 = i26;
                                i14 = i27;
                                bArr2 = bArr;
                                if (i24 == 0) {
                                    iZzi = zzis.zzj(bArr2, i12, zzirVar3);
                                    iZzb = zzirVar3.zza;
                                    zzkj zzkjVarZzD = zzlpVar2.zzD(i11);
                                    if (zzkjVarZzD == null || zzkjVarZzD.zza(iZzb)) {
                                        unsafe2.putInt(obj3, j, iZzb);
                                        i20 = i8 | i29;
                                        i17 = i14;
                                        i18 = i10;
                                        i19 = i11;
                                    } else {
                                        zzd(obj).zzj(i14, Long.valueOf(iZzb));
                                        i17 = i14;
                                        i18 = i10;
                                        i19 = i11;
                                        i20 = i8;
                                    }
                                    i16 = i3;
                                } else {
                                    i27 = i14;
                                    i6 = i12;
                                    unsafe = unsafe2;
                                    i5 = i10;
                                    i9 = i11;
                                    i7 = i27;
                                    i21 = i21;
                                }
                                break;
                            case 15:
                                i10 = i23;
                                j = j2;
                                i11 = iZzx;
                                i12 = i26;
                                i14 = i27;
                                bArr2 = bArr;
                                if (i24 == 0) {
                                    iZzi = zzis.zzj(bArr2, i12, zzirVar3);
                                    iZzb = zzji.zzb(zzirVar3.zza);
                                    unsafe2.putInt(obj3, j, iZzb);
                                    i20 = i8 | i29;
                                    i17 = i14;
                                    i18 = i10;
                                    i19 = i11;
                                    i16 = i3;
                                } else {
                                    i27 = i14;
                                    i6 = i12;
                                    unsafe = unsafe2;
                                    i5 = i10;
                                    i9 = i11;
                                    i7 = i27;
                                    i21 = i21;
                                }
                                break;
                            case 16:
                                i10 = i23;
                                i12 = i26;
                                i14 = i27;
                                if (i24 == 0) {
                                    bArr2 = bArr;
                                    int iZzm2 = zzis.zzm(bArr2, i12, zzirVar3);
                                    i11 = iZzx;
                                    unsafe2.putLong(obj, j2, zzji.zzc(zzirVar3.zzb));
                                    i20 = i8 | i29;
                                    iZzi = iZzm2;
                                    i17 = i14;
                                    i18 = i10;
                                    i19 = i11;
                                    i16 = i3;
                                } else {
                                    i11 = iZzx;
                                    i27 = i14;
                                    i6 = i12;
                                    unsafe = unsafe2;
                                    i5 = i10;
                                    i9 = i11;
                                    i7 = i27;
                                    i21 = i21;
                                }
                                break;
                            default:
                                if (i24 == 3) {
                                    Object objZzG2 = zzlpVar2.zzG(obj3, iZzx);
                                    iZzi = zzis.zzn(objZzG2, zzlpVar2.zzE(iZzx), bArr, i26, i2, (i23 << 3) | 4, zzirVar);
                                    zzlpVar2.zzO(obj3, iZzx, objZzG2);
                                    i20 = i8 | i29;
                                    i19 = iZzx;
                                    i18 = i23;
                                    i17 = i27;
                                    bArr2 = bArr;
                                    i16 = i3;
                                } else {
                                    i10 = i23;
                                    i12 = i26;
                                    i11 = iZzx;
                                    i6 = i12;
                                    unsafe = unsafe2;
                                    i5 = i10;
                                    i9 = i11;
                                    i7 = i27;
                                    i21 = i21;
                                }
                                break;
                        }
                    } else {
                        bArr2 = bArr;
                        if (iZzA != 27) {
                            i8 = i20;
                            i21 = i21;
                            if (iZzA <= 49) {
                                i5 = i23;
                                unsafe = unsafe2;
                                i9 = iZzx;
                                iZzi = zzv(obj, bArr, i26, i2, i27, i5, i24, iZzx, i25, iZzA, j2, zzirVar);
                                if (iZzi != i26) {
                                    zzlpVar2 = this;
                                    obj3 = obj;
                                    bArr2 = bArr;
                                    i18 = i5;
                                    i2 = i2;
                                    i16 = i3;
                                    zzirVar3 = zzirVar;
                                    i19 = i9;
                                    i17 = i27;
                                    i20 = i8;
                                    i21 = i21;
                                    unsafe2 = unsafe;
                                } else {
                                    i6 = iZzi;
                                    i7 = i27;
                                    i21 = i21;
                                }
                            } else {
                                i15 = i26;
                                i5 = i23;
                                unsafe = unsafe2;
                                i9 = iZzx;
                                if (iZzA != 50) {
                                    iZzi = zzt(obj, bArr, i15, i2, i27, i5, i24, i25, iZzA, j2, i9, zzirVar);
                                    if (iZzi != i15) {
                                        zzlpVar2 = this;
                                        obj3 = obj;
                                        bArr2 = bArr;
                                        i18 = i5;
                                        i2 = i2;
                                        i16 = i3;
                                        zzirVar3 = zzirVar;
                                        i19 = i9;
                                        i17 = i27;
                                        i20 = i8;
                                        i21 = i21;
                                        unsafe2 = unsafe;
                                    } else {
                                        i6 = iZzi;
                                        i7 = i27;
                                        i21 = i21;
                                    }
                                } else if (i24 == 2) {
                                    iZzi = zzs(obj, bArr, i15, i2, i9, j2, zzirVar);
                                    if (iZzi != i15) {
                                        zzlpVar2 = this;
                                        obj3 = obj;
                                        bArr2 = bArr;
                                        i18 = i5;
                                        i2 = i2;
                                        i16 = i3;
                                        zzirVar3 = zzirVar;
                                        i19 = i9;
                                        i17 = i27;
                                        i20 = i8;
                                        i21 = i21;
                                        unsafe2 = unsafe;
                                    } else {
                                        i6 = iZzi;
                                        i7 = i27;
                                        i21 = i21;
                                    }
                                } else {
                                    i6 = i15;
                                    i7 = i27;
                                    i21 = i21;
                                }
                            }
                        } else if (i24 == 2) {
                            zzkm zzkmVarZzd = (zzkm) unsafe2.getObject(obj3, j2);
                            if (!zzkmVarZzd.zzc()) {
                                int size = zzkmVarZzd.size();
                                zzkmVarZzd = zzkmVarZzd.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj3, j2, zzkmVarZzd);
                            }
                            i17 = i27;
                            iZzi = zzis.zze(zzlpVar2.zzE(iZzx), i17, bArr, i26, i2, zzkmVarZzd, zzirVar);
                            i16 = i3;
                            i18 = i23;
                            i19 = iZzx;
                            i20 = i20;
                            i21 = i21;
                            i2 = i2;
                        } else {
                            i8 = i20;
                            i21 = i21;
                            i5 = i23;
                            i15 = i26;
                            unsafe = unsafe2;
                            i9 = iZzx;
                            i6 = i15;
                            i7 = i27;
                            i21 = i21;
                        }
                    }
                }
                if (i7 != i3 || i3 == 0) {
                    if (this.zzh) {
                        zzirVar2 = zzirVar;
                        zzjr zzjrVar = zzirVar2.zzd;
                        if (zzjrVar != zzjr.zza) {
                            i5 = i5;
                            if (zzjrVar.zzb(this.zzg, i5) != null) {
                                throw null;
                            }
                            iZzi = zzis.zzi(i7, bArr, i6, i2, zzd(obj), zzirVar);
                            obj = obj;
                        }
                        i2 = i2;
                        i17 = i7;
                        zzlpVar2 = this;
                        zzirVar3 = zzirVar2;
                        i18 = i5;
                        obj3 = obj;
                        i19 = i9;
                        i20 = i8;
                        unsafe2 = unsafe;
                        bArr2 = bArr;
                        i16 = i3;
                    } else {
                        zzirVar2 = zzirVar;
                    }
                    iZzi = zzis.zzi(i7, bArr, i6, i2, zzd(obj), zzirVar);
                    i2 = i2;
                    i17 = i7;
                    zzlpVar2 = this;
                    zzirVar3 = zzirVar2;
                    i18 = i5;
                    obj3 = obj;
                    i19 = i9;
                    i20 = i8;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i16 = i3;
                } else {
                    zzlpVar = this;
                    obj2 = obj;
                    iZzi = i6;
                    i17 = i7;
                    i20 = i8;
                }
            } else {
                unsafe = unsafe2;
                i3 = i16;
                obj2 = obj3;
                zzlpVar = zzlpVar2;
            }
        }
        if (i21 != 1048575) {
            unsafe.putInt(obj2, i21, i20);
        }
        for (int i34 = zzlpVar.zzk; i34 < zzlpVar.zzl; i34++) {
            int i35 = zzlpVar.zzj[i34];
            int i36 = zzlpVar.zzc[i35];
            Object objZzf = zzmy.zzf(obj2, zzlpVar.zzB(i35) & 1048575);
            if (objZzf != null && zzlpVar.zzD(i35) != null) {
                throw null;
            }
        }
        if (i3 == 0) {
            if (iZzi != i2) {
                throw zzkp.zze();
            }
        } else if (iZzi > i2 || i17 != i3) {
            throw zzkp.zze();
        }
        return iZzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final Object zze() {
        return ((zzkf) this.zzg).zzbA();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzlx
    public final void zzf(Object obj) {
        if (zzW(obj)) {
            if (obj instanceof zzkf) {
                zzkf zzkfVar = (zzkf) obj;
                zzkfVar.zzbM(Integer.MAX_VALUE);
                zzkfVar.zzb = 0;
                zzkfVar.zzbK();
            }
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int iZzB = zzB(i);
                long j = 1048575 & iZzB;
                int iZzA = zzA(iZzB);
                if (iZzA != 9) {
                    switch (iZzA) {
                        case 17:
                            if (zzT(obj, i)) {
                                zzE(i).zzf(zzb.getObject(obj, j));
                            }
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.zzm.zza(obj, j);
                            break;
                        case 50:
                            Unsafe unsafe = zzb;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((zzlg) object).zzc();
                                unsafe.putObject(obj, j, object);
                            }
                            break;
                    }
                } else if (zzT(obj, i)) {
                    zzE(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzn.zzg(obj);
            if (this.zzh) {
                this.zzo.zzb(obj);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0095  */
    @Override // com.google.android.gms.internal.measurement.zzlx
    public final void zzg(Object obj, Object obj2) {
        zzJ(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzB = zzB(i);
            long j = 1048575 & iZzB;
            int i2 = this.zzc[i];
            switch (zzA(iZzB)) {
                case 0:
                    if (zzT(obj2, i)) {
                        zzmy.zzo(obj, j, zzmy.zza(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 1:
                    if (zzT(obj2, i)) {
                        zzmy.zzp(obj, j, zzmy.zzb(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 2:
                    if (zzT(obj2, i)) {
                        zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 3:
                    if (zzT(obj2, i)) {
                        zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 4:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 5:
                    if (zzT(obj2, i)) {
                        zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 6:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 7:
                    if (zzT(obj2, i)) {
                        zzmy.zzm(obj, j, zzmy.zzw(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 8:
                    if (zzT(obj2, i)) {
                        zzmy.zzs(obj, j, zzmy.zzf(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 9:
                case 17:
                    zzK(obj, obj2, i);
                    break;
                case 10:
                    if (zzT(obj2, i)) {
                        zzmy.zzs(obj, j, zzmy.zzf(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 11:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 12:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 13:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 14:
                    if (zzT(obj2, i)) {
                        zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 15:
                    if (zzT(obj2, i)) {
                        zzmy.zzq(obj, j, zzmy.zzc(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 16:
                    if (zzT(obj2, i)) {
                        zzmy.zzr(obj, j, zzmy.zzd(obj2, j));
                        zzM(obj, i);
                    }
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzm.zzb(obj, obj2, j);
                    break;
                case 50:
                    zzlz.zzaa(this.zzq, obj, obj2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case CipherSuite.TLS_DH_RSA_WITH_AES_256_CBC_SHA /* 55 */:
                case 56:
                case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CBC_SHA /* 57 */:
                case CipherSuite.TLS_DH_anon_WITH_AES_256_CBC_SHA /* 58 */:
                case 59:
                    if (zzX(obj2, i2, i)) {
                        zzmy.zzs(obj, j, zzmy.zzf(obj2, j));
                        zzN(obj, i2, i);
                    }
                    break;
                case 60:
                case 68:
                    zzL(obj, obj2, i);
                    break;
                case 61:
                case VLCUtil.f17716h /* 62 */:
                case 63:
                case 64:
                case DefaultScrollHandle.f11004h /* 65 */:
                case IjkMediaMeta.FF_PROFILE_H264_BASELINE /* 66 */:
                case 67:
                    if (zzX(obj2, i2, i)) {
                        zzmy.zzs(obj, j, zzmy.zzf(obj2, j));
                        zzN(obj, i2, i);
                    }
                    break;
            }
        }
        zzlz.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzlz.zzE(this.zzo, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzir zzirVar) throws IOException {
        if (this.zzi) {
            zzu(obj, bArr, i, i2, zzirVar);
        } else {
            zzc(obj, bArr, i, i2, 0, zzirVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cd  */
    @Override // com.google.android.gms.internal.measurement.zzlx
    public final void zzi(Object obj, zzng zzngVar) throws IOException {
        double dZza;
        float fZzb;
        long jZzd;
        long jZzd2;
        int iZzc;
        long jZzd3;
        int iZzc2;
        boolean zZzw;
        int iZzc3;
        int iZzc4;
        int iZzc5;
        long jZzd4;
        int iZzc6;
        long jZzd5;
        if (!this.zzi) {
            zzQ(obj, zzngVar);
            return;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzB = zzB(i);
            int i2 = this.zzc[i];
            switch (zzA(iZzB)) {
                case 0:
                    if (zzT(obj, i)) {
                        dZza = zzmy.zza(obj, iZzB & 1048575);
                        zzngVar.zzf(i2, dZza);
                    }
                    break;
                case 1:
                    if (zzT(obj, i)) {
                        fZzb = zzmy.zzb(obj, iZzB & 1048575);
                        zzngVar.zzo(i2, fZzb);
                    }
                    break;
                case 2:
                    if (zzT(obj, i)) {
                        jZzd = zzmy.zzd(obj, iZzB & 1048575);
                        zzngVar.zzt(i2, jZzd);
                    }
                    break;
                case 3:
                    if (zzT(obj, i)) {
                        jZzd2 = zzmy.zzd(obj, iZzB & 1048575);
                        zzngVar.zzJ(i2, jZzd2);
                    }
                    break;
                case 4:
                    if (zzT(obj, i)) {
                        iZzc = zzmy.zzc(obj, iZzB & 1048575);
                        zzngVar.zzr(i2, iZzc);
                    }
                    break;
                case 5:
                    if (zzT(obj, i)) {
                        jZzd3 = zzmy.zzd(obj, iZzB & 1048575);
                        zzngVar.zzm(i2, jZzd3);
                    }
                    break;
                case 6:
                    if (zzT(obj, i)) {
                        iZzc2 = zzmy.zzc(obj, iZzB & 1048575);
                        zzngVar.zzk(i2, iZzc2);
                    }
                    break;
                case 7:
                    if (zzT(obj, i)) {
                        zZzw = zzmy.zzw(obj, iZzB & 1048575);
                        zzngVar.zzb(i2, zZzw);
                    }
                    break;
                case 8:
                    if (zzT(obj, i)) {
                        zzZ(i2, zzmy.zzf(obj, iZzB & 1048575), zzngVar);
                    }
                    break;
                case 9:
                    if (zzT(obj, i)) {
                        zzngVar.zzv(i2, zzmy.zzf(obj, iZzB & 1048575), zzE(i));
                    }
                    break;
                case 10:
                    if (zzT(obj, i)) {
                        zzngVar.zzd(i2, (zzje) zzmy.zzf(obj, iZzB & 1048575));
                    }
                    break;
                case 11:
                    if (zzT(obj, i)) {
                        iZzc3 = zzmy.zzc(obj, iZzB & 1048575);
                        zzngVar.zzH(i2, iZzc3);
                    }
                    break;
                case 12:
                    if (zzT(obj, i)) {
                        iZzc4 = zzmy.zzc(obj, iZzB & 1048575);
                        zzngVar.zzi(i2, iZzc4);
                    }
                    break;
                case 13:
                    if (zzT(obj, i)) {
                        iZzc5 = zzmy.zzc(obj, iZzB & 1048575);
                        zzngVar.zzw(i2, iZzc5);
                    }
                    break;
                case 14:
                    if (zzT(obj, i)) {
                        jZzd4 = zzmy.zzd(obj, iZzB & 1048575);
                        zzngVar.zzy(i2, jZzd4);
                    }
                    break;
                case 15:
                    if (zzT(obj, i)) {
                        iZzc6 = zzmy.zzc(obj, iZzB & 1048575);
                        zzngVar.zzA(i2, iZzc6);
                    }
                    break;
                case 16:
                    if (zzT(obj, i)) {
                        jZzd5 = zzmy.zzd(obj, iZzB & 1048575);
                        zzngVar.zzC(i2, jZzd5);
                    }
                    break;
                case 17:
                    if (zzT(obj, i)) {
                        zzngVar.zzq(i2, zzmy.zzf(obj, iZzB & 1048575), zzE(i));
                    }
                    break;
                case 18:
                    zzlz.zzJ(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 19:
                    zzlz.zzN(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 20:
                    zzlz.zzQ(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 21:
                    zzlz.zzY(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 22:
                    zzlz.zzP(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 23:
                    zzlz.zzM(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 24:
                    zzlz.zzL(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 25:
                    zzlz.zzH(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 26:
                    zzlz.zzW(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar);
                    break;
                case 27:
                    zzlz.zzR(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, zzE(i));
                    break;
                case 28:
                    zzlz.zzI(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar);
                    break;
                case 29:
                    zzlz.zzX(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 30:
                    zzlz.zzK(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 31:
                    zzlz.zzS(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 32:
                    zzlz.zzT(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 33:
                    zzlz.zzU(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 34:
                    zzlz.zzV(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, false);
                    break;
                case 35:
                    zzlz.zzJ(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 36:
                    zzlz.zzN(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 37:
                    zzlz.zzQ(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 38:
                    zzlz.zzY(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 39:
                    zzlz.zzP(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 40:
                    zzlz.zzM(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 41:
                    zzlz.zzL(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 42:
                    zzlz.zzH(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 43:
                    zzlz.zzX(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 44:
                    zzlz.zzK(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 45:
                    zzlz.zzS(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 46:
                    zzlz.zzT(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 47:
                    zzlz.zzU(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 48:
                    zzlz.zzV(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, true);
                    break;
                case 49:
                    zzlz.zzO(i2, (List) zzmy.zzf(obj, iZzB & 1048575), zzngVar, zzE(i));
                    break;
                case 50:
                    zzR(zzngVar, i2, zzmy.zzf(obj, iZzB & 1048575), i);
                    break;
                case 51:
                    if (zzX(obj, i2, i)) {
                        dZza = zzn(obj, iZzB & 1048575);
                        zzngVar.zzf(i2, dZza);
                    }
                    break;
                case 52:
                    if (zzX(obj, i2, i)) {
                        fZzb = zzo(obj, iZzB & 1048575);
                        zzngVar.zzo(i2, fZzb);
                    }
                    break;
                case 53:
                    if (zzX(obj, i2, i)) {
                        jZzd = zzC(obj, iZzB & 1048575);
                        zzngVar.zzt(i2, jZzd);
                    }
                    break;
                case 54:
                    if (zzX(obj, i2, i)) {
                        jZzd2 = zzC(obj, iZzB & 1048575);
                        zzngVar.zzJ(i2, jZzd2);
                    }
                    break;
                case CipherSuite.TLS_DH_RSA_WITH_AES_256_CBC_SHA /* 55 */:
                    if (zzX(obj, i2, i)) {
                        iZzc = zzr(obj, iZzB & 1048575);
                        zzngVar.zzr(i2, iZzc);
                    }
                    break;
                case 56:
                    if (zzX(obj, i2, i)) {
                        jZzd3 = zzC(obj, iZzB & 1048575);
                        zzngVar.zzm(i2, jZzd3);
                    }
                    break;
                case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CBC_SHA /* 57 */:
                    if (zzX(obj, i2, i)) {
                        iZzc2 = zzr(obj, iZzB & 1048575);
                        zzngVar.zzk(i2, iZzc2);
                    }
                    break;
                case CipherSuite.TLS_DH_anon_WITH_AES_256_CBC_SHA /* 58 */:
                    if (zzX(obj, i2, i)) {
                        zZzw = zzY(obj, iZzB & 1048575);
                        zzngVar.zzb(i2, zZzw);
                    }
                    break;
                case 59:
                    if (zzX(obj, i2, i)) {
                        zzZ(i2, zzmy.zzf(obj, iZzB & 1048575), zzngVar);
                    }
                    break;
                case 60:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzv(i2, zzmy.zzf(obj, iZzB & 1048575), zzE(i));
                    }
                    break;
                case 61:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzd(i2, (zzje) zzmy.zzf(obj, iZzB & 1048575));
                    }
                    break;
                case VLCUtil.f17716h /* 62 */:
                    if (zzX(obj, i2, i)) {
                        iZzc3 = zzr(obj, iZzB & 1048575);
                        zzngVar.zzH(i2, iZzc3);
                    }
                    break;
                case 63:
                    if (zzX(obj, i2, i)) {
                        iZzc4 = zzr(obj, iZzB & 1048575);
                        zzngVar.zzi(i2, iZzc4);
                    }
                    break;
                case 64:
                    if (zzX(obj, i2, i)) {
                        iZzc5 = zzr(obj, iZzB & 1048575);
                        zzngVar.zzw(i2, iZzc5);
                    }
                    break;
                case DefaultScrollHandle.f11004h /* 65 */:
                    if (zzX(obj, i2, i)) {
                        jZzd4 = zzC(obj, iZzB & 1048575);
                        zzngVar.zzy(i2, jZzd4);
                    }
                    break;
                case IjkMediaMeta.FF_PROFILE_H264_BASELINE /* 66 */:
                    if (zzX(obj, i2, i)) {
                        iZzc6 = zzr(obj, iZzB & 1048575);
                        zzngVar.zzA(i2, iZzc6);
                    }
                    break;
                case 67:
                    if (zzX(obj, i2, i)) {
                        jZzd5 = zzC(obj, iZzB & 1048575);
                        zzngVar.zzC(i2, jZzd5);
                    }
                    break;
                case 68:
                    if (zzX(obj, i2, i)) {
                        zzngVar.zzq(i2, zzmy.zzf(obj, iZzB & 1048575), zzE(i));
                    }
                    break;
            }
        }
        zzmo zzmoVar = this.zzn;
        zzmoVar.zzi(zzmoVar.zzd(obj), zzngVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlx
    public final boolean zzj(Object obj, Object obj2) {
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzB = zzB(i);
            long j = iZzB & 1048575;
            switch (zzA(iZzB)) {
                case 0:
                    if (!zzS(obj, obj2, i) || Double.doubleToLongBits(zzmy.zza(obj, j)) != Double.doubleToLongBits(zzmy.zza(obj2, j))) {
                        return false;
                    }
                    break;
                    break;
                case 1:
                    if (!zzS(obj, obj2, i) || Float.floatToIntBits(zzmy.zzb(obj, j)) != Float.floatToIntBits(zzmy.zzb(obj2, j))) {
                        return false;
                    }
                    break;
                    break;
                case 2:
                    if (!zzS(obj, obj2, i) || zzmy.zzd(obj, j) != zzmy.zzd(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 3:
                    if (!zzS(obj, obj2, i) || zzmy.zzd(obj, j) != zzmy.zzd(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!zzS(obj, obj2, i) || zzmy.zzc(obj, j) != zzmy.zzc(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!zzS(obj, obj2, i) || zzmy.zzd(obj, j) != zzmy.zzd(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 6:
                    if (!zzS(obj, obj2, i) || zzmy.zzc(obj, j) != zzmy.zzc(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 7:
                    if (!zzS(obj, obj2, i) || zzmy.zzw(obj, j) != zzmy.zzw(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!zzS(obj, obj2, i) || !zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
                        return false;
                    }
                    break;
                    break;
                case 9:
                    if (!zzS(obj, obj2, i) || !zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
                        return false;
                    }
                    break;
                    break;
                case 10:
                    if (!zzS(obj, obj2, i) || !zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
                        return false;
                    }
                    break;
                    break;
                case 11:
                    if (!zzS(obj, obj2, i) || zzmy.zzc(obj, j) != zzmy.zzc(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 12:
                    if (!zzS(obj, obj2, i) || zzmy.zzc(obj, j) != zzmy.zzc(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 13:
                    if (!zzS(obj, obj2, i) || zzmy.zzc(obj, j) != zzmy.zzc(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 14:
                    if (!zzS(obj, obj2, i) || zzmy.zzd(obj, j) != zzmy.zzd(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 15:
                    if (!zzS(obj, obj2, i) || zzmy.zzc(obj, j) != zzmy.zzc(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 16:
                    if (!zzS(obj, obj2, i) || zzmy.zzd(obj, j) != zzmy.zzd(obj2, j)) {
                        return false;
                    }
                    break;
                    break;
                case 17:
                    if (!zzS(obj, obj2, i) || !zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
                        return false;
                    }
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    if (!zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
                        return false;
                    }
                    break;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case CipherSuite.TLS_DH_RSA_WITH_AES_256_CBC_SHA /* 55 */:
                case 56:
                case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CBC_SHA /* 57 */:
                case CipherSuite.TLS_DH_anon_WITH_AES_256_CBC_SHA /* 58 */:
                case 59:
                case 60:
                case 61:
                case VLCUtil.f17716h /* 62 */:
                case 63:
                case 64:
                case DefaultScrollHandle.f11004h /* 65 */:
                case IjkMediaMeta.FF_PROFILE_H264_BASELINE /* 66 */:
                case 67:
                case 68:
                    long jZzy = zzy(i) & 1048575;
                    if (zzmy.zzc(obj, jZzy) != zzmy.zzc(obj2, jZzy) || !zzlz.zzZ(zzmy.zzf(obj, j), zzmy.zzf(obj2, j))) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        if (!this.zzn.zzd(obj).equals(this.zzn.zzd(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00af  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5 A[LOOP:1: B:45:0x00b4->B:50:0x00c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00e3 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzlx
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        List list;
        zzlx zzlxVarZzE;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.zzk) {
            int i7 = this.zzj[i6];
            int i8 = this.zzc[i7];
            int iZzB = zzB(i7);
            int i9 = this.zzc[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = zzb.getInt(obj, i10);
                }
                i2 = i5;
                i = i10;
            } else {
                i = i4;
                i2 = i5;
            }
            if ((268435456 & iZzB) != 0 && !zzU(obj, i7, i, i2, i11)) {
                return false;
            }
            int iZzA = zzA(iZzB);
            if (iZzA == 9 || iZzA == 17) {
                if (zzU(obj, i7, i, i2, i11) && !zzV(obj, iZzB, zzE(i7))) {
                    return false;
                }
            } else if (iZzA == 27) {
                list = (List) zzmy.zzf(obj, iZzB & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzlxVarZzE = zzE(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!zzlxVarZzE.zzk(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (iZzA == 60 || iZzA == 68) {
                if (zzX(obj, i8, i7) && !zzV(obj, iZzB, zzE(i7))) {
                    return false;
                }
            } else if (iZzA == 49) {
                list = (List) zzmy.zzf(obj, iZzB & 1048575);
                if (list.isEmpty()) {
                    zzlxVarZzE = zzE(i7);
                    while (i3 < list.size()) {
                        if (!zzlxVarZzE.zzk(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzA == 50 && !((zzlg) zzmy.zzf(obj, iZzB & 1048575)).isEmpty()) {
                throw null;
            }
            i6++;
            i4 = i;
            i5 = i2;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        throw null;
    }
}
