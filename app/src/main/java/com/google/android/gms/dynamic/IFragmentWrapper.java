package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: loaded from: classes2.dex */
public interface IFragmentWrapper extends IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements IFragmentWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        @NonNull
        public static IFragmentWrapper asInterface(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            return iInterfaceQueryLocalInterface instanceof IFragmentWrapper ? (IFragmentWrapper) iInterfaceQueryLocalInterface : new zza(iBinder);
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean zza(int i, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i2) throws RemoteException {
            IInterface iInterfaceZzg;
            int iZzb;
            boolean zZzs;
            switch (i) {
                case 2:
                    iInterfaceZzg = zzg();
                    parcel2.writeNoException();
                    zzc.zzf(parcel2, iInterfaceZzg);
                    return true;
                case 3:
                    Bundle bundleZzd = zzd();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, bundleZzd);
                    return true;
                case 4:
                    iZzb = zzb();
                    parcel2.writeNoException();
                    parcel2.writeInt(iZzb);
                    return true;
                case 5:
                    iInterfaceZzg = zze();
                    parcel2.writeNoException();
                    zzc.zzf(parcel2, iInterfaceZzg);
                    return true;
                case 6:
                    iInterfaceZzg = zzh();
                    parcel2.writeNoException();
                    zzc.zzf(parcel2, iInterfaceZzg);
                    return true;
                case 7:
                    zZzs = zzs();
                    parcel2.writeNoException();
                    zzc.zzc(parcel2, zZzs);
                    return true;
                case 8:
                    String strZzj = zzj();
                    parcel2.writeNoException();
                    parcel2.writeString(strZzj);
                    return true;
                case 9:
                    iInterfaceZzg = zzf();
                    parcel2.writeNoException();
                    zzc.zzf(parcel2, iInterfaceZzg);
                    return true;
                case 10:
                    iZzb = zzc();
                    parcel2.writeNoException();
                    parcel2.writeInt(iZzb);
                    return true;
                case 11:
                    zZzs = zzt();
                    parcel2.writeNoException();
                    zzc.zzc(parcel2, zZzs);
                    return true;
                case 12:
                    iInterfaceZzg = zzi();
                    parcel2.writeNoException();
                    zzc.zzf(parcel2, iInterfaceZzg);
                    return true;
                case 13:
                    zZzs = zzu();
                    parcel2.writeNoException();
                    zzc.zzc(parcel2, zZzs);
                    return true;
                case 14:
                    zZzs = zzv();
                    parcel2.writeNoException();
                    zzc.zzc(parcel2, zZzs);
                    return true;
                case 15:
                    zZzs = zzw();
                    parcel2.writeNoException();
                    zzc.zzc(parcel2, zZzs);
                    return true;
                case 16:
                    zZzs = zzx();
                    parcel2.writeNoException();
                    zzc.zzc(parcel2, zZzs);
                    return true;
                case 17:
                    zZzs = zzy();
                    parcel2.writeNoException();
                    zzc.zzc(parcel2, zZzs);
                    return true;
                case 18:
                    zZzs = zzz();
                    parcel2.writeNoException();
                    zzc.zzc(parcel2, zZzs);
                    return true;
                case 19:
                    zZzs = zzA();
                    parcel2.writeNoException();
                    zzc.zzc(parcel2, zZzs);
                    return true;
                case 20:
                    IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzc.zzb(parcel);
                    zzk(iObjectWrapperAsInterface);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean zZzg = zzc.zzg(parcel);
                    zzc.zzb(parcel);
                    zzl(zZzg);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean zZzg2 = zzc.zzg(parcel);
                    zzc.zzb(parcel);
                    zzm(zZzg2);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    boolean zZzg3 = zzc.zzg(parcel);
                    zzc.zzb(parcel);
                    zzn(zZzg3);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    boolean zZzg4 = zzc.zzg(parcel);
                    zzc.zzb(parcel);
                    zzo(zZzg4);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    Intent intent = (Intent) zzc.zza(parcel, Intent.CREATOR);
                    zzc.zzb(parcel);
                    zzp(intent);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    Intent intent2 = (Intent) zzc.zza(parcel, Intent.CREATOR);
                    int i3 = parcel.readInt();
                    zzc.zzb(parcel);
                    zzq(intent2, i3);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzc.zzb(parcel);
                    zzr(iObjectWrapperAsInterface2);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean zzA() throws RemoteException;

    int zzb() throws RemoteException;

    int zzc() throws RemoteException;

    @Nullable
    Bundle zzd() throws RemoteException;

    @Nullable
    IFragmentWrapper zze() throws RemoteException;

    @Nullable
    IFragmentWrapper zzf() throws RemoteException;

    @NonNull
    IObjectWrapper zzg() throws RemoteException;

    @NonNull
    IObjectWrapper zzh() throws RemoteException;

    @NonNull
    IObjectWrapper zzi() throws RemoteException;

    @Nullable
    String zzj() throws RemoteException;

    void zzk(@NonNull IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzl(boolean z) throws RemoteException;

    void zzm(boolean z) throws RemoteException;

    void zzn(boolean z) throws RemoteException;

    void zzo(boolean z) throws RemoteException;

    void zzp(@NonNull Intent intent) throws RemoteException;

    void zzq(@NonNull Intent intent, int i) throws RemoteException;

    void zzr(@NonNull IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzs() throws RemoteException;

    boolean zzt() throws RemoteException;

    boolean zzu() throws RemoteException;

    boolean zzv() throws RemoteException;

    boolean zzw() throws RemoteException;

    boolean zzx() throws RemoteException;

    boolean zzy() throws RemoteException;

    boolean zzz() throws RemoteException;
}
