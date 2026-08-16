package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import p000.C2998bp;
import p000.C5954f00;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzje implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzje zzb = new zzjb(zzkn.zzd);
    private static final zzjd zzd;
    private int zzc = 0;

    static {
        int i = zziq.zza;
        zzd = new zzjd(null);
        zza = new zziw();
    }

    public static int zzj(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(C5954f00.m20225a("Beginning index: ", i, " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(C2998bp.m14684a("Beginning index larger than ending index: ", i, ", ", i2));
        }
        throw new IndexOutOfBoundsException(C2998bp.m14684a("End index: ", i2, " >= ", i3));
    }

    public static zzje zzl(byte[] bArr, int i, int i2) {
        zzj(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzjb(bArr2);
    }

    public static zzje zzm(String str) {
        return new zzjb(str.getBytes(zzkn.zzb));
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZze = this.zzc;
        if (iZze == 0) {
            int iZzd = zzd();
            iZze = zze(iZzd, 0, iZzd);
            if (iZze == 0) {
                iZze = 1;
            }
            this.zzc = iZze;
        }
        return iZze;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zziv(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? zzmm.zza(this) : zzmm.zza(zzf(0, 47)).concat("..."));
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract int zze(int i, int i2, int i3);

    public abstract zzje zzf(int i, int i2);

    public abstract String zzg(Charset charset);

    public abstract void zzh(zziu zziuVar) throws IOException;

    public abstract boolean zzi();

    public final int zzk() {
        return this.zzc;
    }

    public final String zzn(Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }
}
