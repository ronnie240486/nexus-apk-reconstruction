package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;
import p000.C1313UP;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class DynamiteModule {

    @KeepForSdk
    public static final int LOCAL = -1;

    @KeepForSdk
    public static final int NONE = 0;

    @KeepForSdk
    public static final int NO_SELECTION = 0;

    @KeepForSdk
    public static final int REMOTE = 1;

    @Nullable
    @GuardedBy("DynamiteModule.class")
    private static Boolean zzb = null;

    @Nullable
    @GuardedBy("DynamiteModule.class")
    private static String zzc = null;

    @GuardedBy("DynamiteModule.class")
    private static boolean zzd = false;

    @GuardedBy("DynamiteModule.class")
    private static int zze = -1;

    @Nullable
    @GuardedBy("DynamiteModule.class")
    private static Boolean zzf;

    @Nullable
    @GuardedBy("DynamiteModule.class")
    private static zzq zzk;

    @Nullable
    @GuardedBy("DynamiteModule.class")
    private static zzr zzl;
    private final Context zzj;
    private static final ThreadLocal zzg = new ThreadLocal();
    private static final ThreadLocal zzh = new zzd();
    private static final VersionPolicy.IVersions zzi = new zze();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE = new zzf();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_LOCAL = new zzg();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();

    @NonNull
    @KeepForSdk
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();

    @NonNull
    public static final VersionPolicy zza = new zzl();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {

        @Nullable
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    @KeepForSdk
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, zzp zzpVar) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th, zzp zzpVar) {
            super(str, th);
        }
    }

    public interface VersionPolicy {

        @KeepForSdk
        public interface IVersions {
            int zza(@NonNull Context context, @NonNull String str);

            int zzb(@NonNull Context context, @NonNull String str, boolean z) throws LoadingException;
        }

        @KeepForSdk
        public static class SelectionResult {

            @KeepForSdk
            public int localVersion = 0;

            @KeepForSdk
            public int remoteVersion = 0;

            @KeepForSdk
            public int selection = 0;
        }

        @NonNull
        @KeepForSdk
        SelectionResult selectModule(@NonNull Context context, @NonNull String str, @NonNull IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    @KeepForSdk
    public static int getLocalVersion(@NonNull Context context, @NonNull String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + C1313UP.f3457j);
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    @KeepForSdk
    public static int getRemoteVersion(@NonNull Context context, @NonNull String str) {
        return zza(context, str, false);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ec A[Catch: all -> 0x0116, LoadingException -> 0x0119, RemoteException -> 0x011c, TRY_ENTER, TryCatch #7 {RemoteException -> 0x011c, LoadingException -> 0x0119, all -> 0x0116, blocks: (B:30:0x00aa, B:36:0x00b6, B:38:0x00bd, B:39:0x00d8, B:43:0x00de, B:45:0x00e6, B:47:0x00ea, B:48:0x00f7, B:55:0x0102, B:63:0x0132, B:65:0x013a, B:66:0x0141, B:67:0x0149, B:62:0x011f, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:73:0x0156, B:74:0x015e, B:77:0x0161, B:78:0x0162, B:80:0x0181, B:82:0x0188, B:84:0x0190, B:90:0x01c9, B:92:0x01cf, B:102:0x01ec, B:103:0x01f4, B:85:0x019f, B:86:0x01a7, B:88:0x01aa, B:89:0x01ba, B:104:0x01f5, B:105:0x01fd, B:106:0x01fe, B:107:0x0206, B:113:0x0213), top: B:157:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:104:0x01f5 A[Catch: all -> 0x0116, LoadingException -> 0x0119, RemoteException -> 0x011c, TryCatch #7 {RemoteException -> 0x011c, LoadingException -> 0x0119, all -> 0x0116, blocks: (B:30:0x00aa, B:36:0x00b6, B:38:0x00bd, B:39:0x00d8, B:43:0x00de, B:45:0x00e6, B:47:0x00ea, B:48:0x00f7, B:55:0x0102, B:63:0x0132, B:65:0x013a, B:66:0x0141, B:67:0x0149, B:62:0x011f, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:73:0x0156, B:74:0x015e, B:77:0x0161, B:78:0x0162, B:80:0x0181, B:82:0x0188, B:84:0x0190, B:90:0x01c9, B:92:0x01cf, B:102:0x01ec, B:103:0x01f4, B:85:0x019f, B:86:0x01a7, B:88:0x01aa, B:89:0x01ba, B:104:0x01f5, B:105:0x01fd, B:106:0x01fe, B:107:0x0206, B:113:0x0213), top: B:157:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01fe A[Catch: all -> 0x0116, LoadingException -> 0x0119, RemoteException -> 0x011c, TryCatch #7 {RemoteException -> 0x011c, LoadingException -> 0x0119, all -> 0x0116, blocks: (B:30:0x00aa, B:36:0x00b6, B:38:0x00bd, B:39:0x00d8, B:43:0x00de, B:45:0x00e6, B:47:0x00ea, B:48:0x00f7, B:55:0x0102, B:63:0x0132, B:65:0x013a, B:66:0x0141, B:67:0x0149, B:62:0x011f, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:73:0x0156, B:74:0x015e, B:77:0x0161, B:78:0x0162, B:80:0x0181, B:82:0x0188, B:84:0x0190, B:90:0x01c9, B:92:0x01cf, B:102:0x01ec, B:103:0x01f4, B:85:0x019f, B:86:0x01a7, B:88:0x01aa, B:89:0x01ba, B:104:0x01f5, B:105:0x01fd, B:106:0x01fe, B:107:0x0206, B:113:0x0213), top: B:157:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0209 A[Catch: all -> 0x0207, TRY_ENTER, TryCatch #2 {, blocks: (B:31:0x00ab, B:33:0x00b1, B:34:0x00b3, B:110:0x0209, B:111:0x0211), top: B:150:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0284 A[Catch: all -> 0x007e, TryCatch #6 {all -> 0x007e, blocks: (B:3:0x002f, B:7:0x0078, B:14:0x0084, B:17:0x008a, B:28:0x00a6, B:114:0x0214, B:115:0x021f, B:118:0x0222, B:119:0x0223, B:120:0x022b, B:137:0x0284, B:138:0x0298, B:121:0x022c, B:123:0x024a, B:125:0x025b, B:135:0x027b, B:136:0x0283, B:139:0x0299, B:140:0x02c6), top: B:154:0x002f, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x008a A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #6 {all -> 0x007e, blocks: (B:3:0x002f, B:7:0x0078, B:14:0x0084, B:17:0x008a, B:28:0x00a6, B:114:0x0214, B:115:0x021f, B:118:0x0222, B:119:0x0223, B:120:0x022b, B:137:0x0284, B:138:0x0298, B:121:0x022c, B:123:0x024a, B:125:0x025b, B:135:0x027b, B:136:0x0283, B:139:0x0299, B:140:0x02c6), top: B:154:0x002f, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0092  */
    /* JADX WARN: Code duplicated, block: B:21:0x0096  */
    /* JADX WARN: Code duplicated, block: B:24:0x009d  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b1 A[Catch: all -> 0x0207, TryCatch #2 {, blocks: (B:31:0x00ab, B:33:0x00b1, B:34:0x00b3, B:110:0x0209, B:111:0x0211), top: B:150:0x00ab }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b6 A[Catch: all -> 0x0116, LoadingException -> 0x0119, RemoteException -> 0x011c, TRY_ENTER, TryCatch #7 {RemoteException -> 0x011c, LoadingException -> 0x0119, all -> 0x0116, blocks: (B:30:0x00aa, B:36:0x00b6, B:38:0x00bd, B:39:0x00d8, B:43:0x00de, B:45:0x00e6, B:47:0x00ea, B:48:0x00f7, B:55:0x0102, B:63:0x0132, B:65:0x013a, B:66:0x0141, B:67:0x0149, B:62:0x011f, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:73:0x0156, B:74:0x015e, B:77:0x0161, B:78:0x0162, B:80:0x0181, B:82:0x0188, B:84:0x0190, B:90:0x01c9, B:92:0x01cf, B:102:0x01ec, B:103:0x01f4, B:85:0x019f, B:86:0x01a7, B:88:0x01aa, B:89:0x01ba, B:104:0x01f5, B:105:0x01fd, B:106:0x01fe, B:107:0x0206, B:113:0x0213), top: B:157:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00bd A[Catch: all -> 0x0116, LoadingException -> 0x0119, RemoteException -> 0x011c, TryCatch #7 {RemoteException -> 0x011c, LoadingException -> 0x0119, all -> 0x0116, blocks: (B:30:0x00aa, B:36:0x00b6, B:38:0x00bd, B:39:0x00d8, B:43:0x00de, B:45:0x00e6, B:47:0x00ea, B:48:0x00f7, B:55:0x0102, B:63:0x0132, B:65:0x013a, B:66:0x0141, B:67:0x0149, B:62:0x011f, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:73:0x0156, B:74:0x015e, B:77:0x0161, B:78:0x0162, B:80:0x0181, B:82:0x0188, B:84:0x0190, B:90:0x01c9, B:92:0x01cf, B:102:0x01ec, B:103:0x01f4, B:85:0x019f, B:86:0x01a7, B:88:0x01aa, B:89:0x01ba, B:104:0x01f5, B:105:0x01fd, B:106:0x01fe, B:107:0x0206, B:113:0x0213), top: B:157:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00de A[Catch: all -> 0x0116, LoadingException -> 0x0119, RemoteException -> 0x011c, TRY_ENTER, TryCatch #7 {RemoteException -> 0x011c, LoadingException -> 0x0119, all -> 0x0116, blocks: (B:30:0x00aa, B:36:0x00b6, B:38:0x00bd, B:39:0x00d8, B:43:0x00de, B:45:0x00e6, B:47:0x00ea, B:48:0x00f7, B:55:0x0102, B:63:0x0132, B:65:0x013a, B:66:0x0141, B:67:0x0149, B:62:0x011f, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:73:0x0156, B:74:0x015e, B:77:0x0161, B:78:0x0162, B:80:0x0181, B:82:0x0188, B:84:0x0190, B:90:0x01c9, B:92:0x01cf, B:102:0x01ec, B:103:0x01f4, B:85:0x019f, B:86:0x01a7, B:88:0x01aa, B:89:0x01ba, B:104:0x01f5, B:105:0x01fd, B:106:0x01fe, B:107:0x0206, B:113:0x0213), top: B:157:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0156 A[Catch: all -> 0x0116, LoadingException -> 0x0119, RemoteException -> 0x011c, TryCatch #7 {RemoteException -> 0x011c, LoadingException -> 0x0119, all -> 0x0116, blocks: (B:30:0x00aa, B:36:0x00b6, B:38:0x00bd, B:39:0x00d8, B:43:0x00de, B:45:0x00e6, B:47:0x00ea, B:48:0x00f7, B:55:0x0102, B:63:0x0132, B:65:0x013a, B:66:0x0141, B:67:0x0149, B:62:0x011f, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:73:0x0156, B:74:0x015e, B:77:0x0161, B:78:0x0162, B:80:0x0181, B:82:0x0188, B:84:0x0190, B:90:0x01c9, B:92:0x01cf, B:102:0x01ec, B:103:0x01f4, B:85:0x019f, B:86:0x01a7, B:88:0x01aa, B:89:0x01ba, B:104:0x01f5, B:105:0x01fd, B:106:0x01fe, B:107:0x0206, B:113:0x0213), top: B:157:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0162 A[Catch: all -> 0x0116, LoadingException -> 0x0119, RemoteException -> 0x011c, TryCatch #7 {RemoteException -> 0x011c, LoadingException -> 0x0119, all -> 0x0116, blocks: (B:30:0x00aa, B:36:0x00b6, B:38:0x00bd, B:39:0x00d8, B:43:0x00de, B:45:0x00e6, B:47:0x00ea, B:48:0x00f7, B:55:0x0102, B:63:0x0132, B:65:0x013a, B:66:0x0141, B:67:0x0149, B:62:0x011f, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:73:0x0156, B:74:0x015e, B:77:0x0161, B:78:0x0162, B:80:0x0181, B:82:0x0188, B:84:0x0190, B:90:0x01c9, B:92:0x01cf, B:102:0x01ec, B:103:0x01f4, B:85:0x019f, B:86:0x01a7, B:88:0x01aa, B:89:0x01ba, B:104:0x01f5, B:105:0x01fd, B:106:0x01fe, B:107:0x0206, B:113:0x0213), top: B:157:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0181 A[Catch: all -> 0x0116, LoadingException -> 0x0119, RemoteException -> 0x011c, TryCatch #7 {RemoteException -> 0x011c, LoadingException -> 0x0119, all -> 0x0116, blocks: (B:30:0x00aa, B:36:0x00b6, B:38:0x00bd, B:39:0x00d8, B:43:0x00de, B:45:0x00e6, B:47:0x00ea, B:48:0x00f7, B:55:0x0102, B:63:0x0132, B:65:0x013a, B:66:0x0141, B:67:0x0149, B:62:0x011f, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:73:0x0156, B:74:0x015e, B:77:0x0161, B:78:0x0162, B:80:0x0181, B:82:0x0188, B:84:0x0190, B:90:0x01c9, B:92:0x01cf, B:102:0x01ec, B:103:0x01f4, B:85:0x019f, B:86:0x01a7, B:88:0x01aa, B:89:0x01ba, B:104:0x01f5, B:105:0x01fd, B:106:0x01fe, B:107:0x0206, B:113:0x0213), top: B:157:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0188 A[Catch: all -> 0x0116, LoadingException -> 0x0119, RemoteException -> 0x011c, TryCatch #7 {RemoteException -> 0x011c, LoadingException -> 0x0119, all -> 0x0116, blocks: (B:30:0x00aa, B:36:0x00b6, B:38:0x00bd, B:39:0x00d8, B:43:0x00de, B:45:0x00e6, B:47:0x00ea, B:48:0x00f7, B:55:0x0102, B:63:0x0132, B:65:0x013a, B:66:0x0141, B:67:0x0149, B:62:0x011f, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:73:0x0156, B:74:0x015e, B:77:0x0161, B:78:0x0162, B:80:0x0181, B:82:0x0188, B:84:0x0190, B:90:0x01c9, B:92:0x01cf, B:102:0x01ec, B:103:0x01f4, B:85:0x019f, B:86:0x01a7, B:88:0x01aa, B:89:0x01ba, B:104:0x01f5, B:105:0x01fd, B:106:0x01fe, B:107:0x0206, B:113:0x0213), top: B:157:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0190 A[Catch: all -> 0x0116, LoadingException -> 0x0119, RemoteException -> 0x011c, TryCatch #7 {RemoteException -> 0x011c, LoadingException -> 0x0119, all -> 0x0116, blocks: (B:30:0x00aa, B:36:0x00b6, B:38:0x00bd, B:39:0x00d8, B:43:0x00de, B:45:0x00e6, B:47:0x00ea, B:48:0x00f7, B:55:0x0102, B:63:0x0132, B:65:0x013a, B:66:0x0141, B:67:0x0149, B:62:0x011f, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:73:0x0156, B:74:0x015e, B:77:0x0161, B:78:0x0162, B:80:0x0181, B:82:0x0188, B:84:0x0190, B:90:0x01c9, B:92:0x01cf, B:102:0x01ec, B:103:0x01f4, B:85:0x019f, B:86:0x01a7, B:88:0x01aa, B:89:0x01ba, B:104:0x01f5, B:105:0x01fd, B:106:0x01fe, B:107:0x0206, B:113:0x0213), top: B:157:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:85:0x019f A[Catch: all -> 0x0116, LoadingException -> 0x0119, RemoteException -> 0x011c, TryCatch #7 {RemoteException -> 0x011c, LoadingException -> 0x0119, all -> 0x0116, blocks: (B:30:0x00aa, B:36:0x00b6, B:38:0x00bd, B:39:0x00d8, B:43:0x00de, B:45:0x00e6, B:47:0x00ea, B:48:0x00f7, B:55:0x0102, B:63:0x0132, B:65:0x013a, B:66:0x0141, B:67:0x0149, B:62:0x011f, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:73:0x0156, B:74:0x015e, B:77:0x0161, B:78:0x0162, B:80:0x0181, B:82:0x0188, B:84:0x0190, B:90:0x01c9, B:92:0x01cf, B:102:0x01ec, B:103:0x01f4, B:85:0x019f, B:86:0x01a7, B:88:0x01aa, B:89:0x01ba, B:104:0x01f5, B:105:0x01fd, B:106:0x01fe, B:107:0x0206, B:113:0x0213), top: B:157:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x01aa A[Catch: all -> 0x0116, LoadingException -> 0x0119, RemoteException -> 0x011c, TryCatch #7 {RemoteException -> 0x011c, LoadingException -> 0x0119, all -> 0x0116, blocks: (B:30:0x00aa, B:36:0x00b6, B:38:0x00bd, B:39:0x00d8, B:43:0x00de, B:45:0x00e6, B:47:0x00ea, B:48:0x00f7, B:55:0x0102, B:63:0x0132, B:65:0x013a, B:66:0x0141, B:67:0x0149, B:62:0x011f, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:73:0x0156, B:74:0x015e, B:77:0x0161, B:78:0x0162, B:80:0x0181, B:82:0x0188, B:84:0x0190, B:90:0x01c9, B:92:0x01cf, B:102:0x01ec, B:103:0x01f4, B:85:0x019f, B:86:0x01a7, B:88:0x01aa, B:89:0x01ba, B:104:0x01f5, B:105:0x01fd, B:106:0x01fe, B:107:0x0206, B:113:0x0213), top: B:157:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ba A[Catch: all -> 0x0116, LoadingException -> 0x0119, RemoteException -> 0x011c, TryCatch #7 {RemoteException -> 0x011c, LoadingException -> 0x0119, all -> 0x0116, blocks: (B:30:0x00aa, B:36:0x00b6, B:38:0x00bd, B:39:0x00d8, B:43:0x00de, B:45:0x00e6, B:47:0x00ea, B:48:0x00f7, B:55:0x0102, B:63:0x0132, B:65:0x013a, B:66:0x0141, B:67:0x0149, B:62:0x011f, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:73:0x0156, B:74:0x015e, B:77:0x0161, B:78:0x0162, B:80:0x0181, B:82:0x0188, B:84:0x0190, B:90:0x01c9, B:92:0x01cf, B:102:0x01ec, B:103:0x01f4, B:85:0x019f, B:86:0x01a7, B:88:0x01aa, B:89:0x01ba, B:104:0x01f5, B:105:0x01fd, B:106:0x01fe, B:107:0x0206, B:113:0x0213), top: B:157:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01cf A[Catch: all -> 0x0116, LoadingException -> 0x0119, RemoteException -> 0x011c, TRY_LEAVE, TryCatch #7 {RemoteException -> 0x011c, LoadingException -> 0x0119, all -> 0x0116, blocks: (B:30:0x00aa, B:36:0x00b6, B:38:0x00bd, B:39:0x00d8, B:43:0x00de, B:45:0x00e6, B:47:0x00ea, B:48:0x00f7, B:55:0x0102, B:63:0x0132, B:65:0x013a, B:66:0x0141, B:67:0x0149, B:62:0x011f, B:70:0x014c, B:71:0x014d, B:72:0x0155, B:73:0x0156, B:74:0x015e, B:77:0x0161, B:78:0x0162, B:80:0x0181, B:82:0x0188, B:84:0x0190, B:90:0x01c9, B:92:0x01cf, B:102:0x01ec, B:103:0x01f4, B:85:0x019f, B:86:0x01a7, B:88:0x01aa, B:89:0x01ba, B:104:0x01f5, B:105:0x01fd, B:106:0x01fe, B:107:0x0206, B:113:0x0213), top: B:157:0x00aa }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01da  */
    /* JADX WARN: Code duplicated, block: B:96:0x01de  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e5  */
    /* JADX WARN: Instruction removed from duplicated block: B:137:0x0284, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x00bd, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:78:0x0162, please report this as an issue */
    @NonNull
    @KeepForSdk
    public static DynamiteModule load(@NonNull Context context, @NonNull VersionPolicy versionPolicy, @NonNull String str) throws LoadingException {
        int i;
        Boolean bool;
        zzq zzqVarZzg;
        int iZze;
        IObjectWrapper iObjectWrapperZzh;
        Object objUnwrap;
        DynamiteModule dynamiteModule;
        zzn zznVar;
        Cursor cursor;
        zzr zzrVar;
        zzn zznVar2;
        boolean z;
        IObjectWrapper iObjectWrapperZze;
        Cursor cursor2;
        ThreadLocal threadLocal = zzg;
        zzn zznVar3 = (zzn) threadLocal.get();
        zzn zznVar4 = new zzn(null);
        threadLocal.set(zznVar4);
        ThreadLocal threadLocal2 = zzh;
        Long l = (Long) threadLocal2.get();
        long jLongValue = l.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            VersionPolicy.SelectionResult selectionResultSelectModule = versionPolicy.selectModule(context, str, zzi);
            Log.i("DynamiteModule", "Considering local module " + str + ":" + selectionResultSelectModule.localVersion + " and remote module " + str + ":" + selectionResultSelectModule.remoteVersion);
            int i2 = selectionResultSelectModule.selection;
            if (i2 != 0) {
                if (i2 != -1) {
                    if (i2 == 1 || selectionResultSelectModule.remoteVersion != 0) {
                        if (i2 == -1) {
                            DynamiteModule dynamiteModuleZzc = zzc(context, str);
                            if (jLongValue == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(l);
                            }
                            cursor2 = zznVar4.zza;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(zznVar3);
                            return dynamiteModuleZzc;
                        }
                        if (i2 == 1) {
                            throw new LoadingException("VersionPolicy returned invalid code:" + i2, null);
                        }
                        try {
                            i = selectionResultSelectModule.remoteVersion;
                            try {
                                synchronized (DynamiteModule.class) {
                                    if (zzf(context)) {
                                        throw new LoadingException("Remote loading disabled", null);
                                    }
                                    bool = zzb;
                                }
                                if (bool != null) {
                                    throw new LoadingException("Failed to determine which loading route to use.", null);
                                }
                                if (bool.booleanValue()) {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i);
                                    synchronized (DynamiteModule.class) {
                                        zzrVar = zzl;
                                    }
                                    if (zzrVar != null) {
                                        throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                    }
                                    zznVar2 = (zzn) threadLocal.get();
                                    if (zznVar2 != null || zznVar2.zza == null) {
                                        throw new LoadingException("No result cursor", null);
                                    }
                                    Context applicationContext = context.getApplicationContext();
                                    Cursor cursor3 = zznVar2.zza;
                                    ObjectWrapper.wrap(null);
                                    synchronized (DynamiteModule.class) {
                                        z = zze >= 2;
                                    }
                                    if (z) {
                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                        iObjectWrapperZze = zzrVar.zzf(ObjectWrapper.wrap(applicationContext), str, i, ObjectWrapper.wrap(cursor3));
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                        iObjectWrapperZze = zzrVar.zze(ObjectWrapper.wrap(applicationContext), str, i, ObjectWrapper.wrap(cursor3));
                                    }
                                    Context context2 = (Context) ObjectWrapper.unwrap(iObjectWrapperZze);
                                    if (context2 == null) {
                                        throw new LoadingException("Failed to get module context", null);
                                    }
                                    dynamiteModule = new DynamiteModule(context2);
                                } else {
                                    Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i);
                                    zzqVarZzg = zzg(context);
                                    if (zzqVarZzg != null) {
                                        throw new LoadingException("Failed to create IDynamiteLoader.", null);
                                    }
                                    iZze = zzqVarZzg.zze();
                                    if (iZze >= 3) {
                                        zznVar = (zzn) threadLocal.get();
                                        if (zznVar != null) {
                                            throw new LoadingException("No cached result cursor holder", null);
                                        }
                                        iObjectWrapperZzh = zzqVarZzg.zzi(ObjectWrapper.wrap(context), str, i, ObjectWrapper.wrap(zznVar.zza));
                                    } else if (iZze == 2) {
                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                        iObjectWrapperZzh = zzqVarZzg.zzj(ObjectWrapper.wrap(context), str, i);
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                        iObjectWrapperZzh = zzqVarZzg.zzh(ObjectWrapper.wrap(context), str, i);
                                    }
                                    objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzh);
                                    if (objUnwrap != null) {
                                        throw new LoadingException("Failed to load remote module.", null);
                                    }
                                    dynamiteModule = new DynamiteModule((Context) objUnwrap);
                                }
                                if (jLongValue == 0) {
                                    threadLocal2.remove();
                                } else {
                                    threadLocal2.set(l);
                                }
                                cursor = zznVar4.zza;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                threadLocal.set(zznVar3);
                                return dynamiteModule;
                            } catch (RemoteException e) {
                                throw new LoadingException("Failed to load remote module.", e, null);
                            } catch (LoadingException e2) {
                                throw e2;
                            } catch (Throwable th) {
                                CrashUtils.addDynamiteErrorToDropBox(context, th);
                                throw new LoadingException("Failed to load remote module.", th, null);
                            }
                        } catch (LoadingException e3) {
                            Log.w("DynamiteModule", "Failed to load remote module: " + e3.getMessage());
                            int i3 = selectionResultSelectModule.localVersion;
                            if (i3 == 0 || versionPolicy.selectModule(context, str, new zzo(i3, 0)).selection != -1) {
                                throw new LoadingException("Remote load failed. No local fallback found.", e3, null);
                            }
                            DynamiteModule dynamiteModuleZzc2 = zzc(context, str);
                            if (jLongValue == 0) {
                                zzh.remove();
                            } else {
                                zzh.set(l);
                            }
                            Cursor cursor4 = zznVar4.zza;
                            if (cursor4 != null) {
                                cursor4.close();
                            }
                            zzg.set(zznVar3);
                            return dynamiteModuleZzc2;
                        }
                    }
                } else if (selectionResultSelectModule.localVersion != 0) {
                    i2 = -1;
                    if (i2 == 1) {
                    }
                    if (i2 == -1) {
                        DynamiteModule dynamiteModuleZzc3 = zzc(context, str);
                        if (jLongValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(l);
                        }
                        cursor2 = zznVar4.zza;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(zznVar3);
                        return dynamiteModuleZzc3;
                    }
                    if (i2 == 1) {
                        throw new LoadingException("VersionPolicy returned invalid code:" + i2, null);
                    }
                    i = selectionResultSelectModule.remoteVersion;
                    synchronized (DynamiteModule.class) {
                        if (zzf(context)) {
                            throw new LoadingException("Remote loading disabled", null);
                        }
                        bool = zzb;
                        if (bool != null) {
                            throw new LoadingException("Failed to determine which loading route to use.", null);
                        }
                        if (bool.booleanValue()) {
                            Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i);
                            synchronized (DynamiteModule.class) {
                                zzrVar = zzl;
                                if (zzrVar != null) {
                                    throw new LoadingException("DynamiteLoaderV2 was not cached.", null);
                                }
                                zznVar2 = (zzn) threadLocal.get();
                                if (zznVar2 != null) {
                                }
                                throw new LoadingException("No result cursor", null);
                            }
                        }
                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i);
                        zzqVarZzg = zzg(context);
                        if (zzqVarZzg != null) {
                            throw new LoadingException("Failed to create IDynamiteLoader.", null);
                        }
                        iZze = zzqVarZzg.zze();
                        if (iZze >= 3) {
                            zznVar = (zzn) threadLocal.get();
                            if (zznVar != null) {
                                throw new LoadingException("No cached result cursor holder", null);
                            }
                            iObjectWrapperZzh = zzqVarZzg.zzi(ObjectWrapper.wrap(context), str, i, ObjectWrapper.wrap(zznVar.zza));
                        } else if (iZze == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            iObjectWrapperZzh = zzqVarZzg.zzj(ObjectWrapper.wrap(context), str, i);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            iObjectWrapperZzh = zzqVarZzg.zzh(ObjectWrapper.wrap(context), str, i);
                        }
                        objUnwrap = ObjectWrapper.unwrap(iObjectWrapperZzh);
                        if (objUnwrap != null) {
                            throw new LoadingException("Failed to load remote module.", null);
                        }
                        dynamiteModule = new DynamiteModule((Context) objUnwrap);
                        if (jLongValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(l);
                        }
                        cursor = zznVar4.zza;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(zznVar3);
                        return dynamiteModule;
                    }
                }
            }
            throw new LoadingException("No acceptable module " + str + " found. Local version is " + selectionResultSelectModule.localVersion + " and remote version is " + selectionResultSelectModule.remoteVersion + ".", null);
        } catch (Throwable th2) {
            if (jLongValue == 0) {
                zzh.remove();
            } else {
                zzh.set(l);
            }
            Cursor cursor5 = zznVar4.zza;
            if (cursor5 != null) {
                cursor5.close();
            }
            zzg.set(zznVar3);
            throw th2;
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:137:0x01c0 */
    /* JADX WARN: Code duplicated, block: B:105:0x0173 A[Catch: all -> 0x00e7, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00e7, blocks: (B:3:0x0002, B:64:0x00dc, B:66:0x00e2, B:73:0x0106, B:101:0x0165, B:105:0x0173, B:123:0x01c5, B:124:0x01c8, B:118:0x01bd, B:71:0x00eb, B:126:0x01ca, B:4:0x0003, B:7:0x0009, B:8:0x0025, B:62:0x00d9, B:21:0x0049, B:45:0x009e, B:48:0x00a1, B:55:0x00b7, B:63:0x00db, B:61:0x00bd), top: B:136:0x0002, inners: #5, #11 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00ab A[Catch: all -> 0x0036, TryCatch #9 {, blocks: (B:9:0x0026, B:11:0x0032, B:52:0x00b4, B:16:0x003b, B:18:0x0042, B:20:0x0048, B:25:0x004e, B:27:0x0052, B:31:0x005c, B:33:0x0064, B:36:0x006b, B:43:0x0095, B:44:0x009d, B:39:0x0072, B:41:0x0078, B:42:0x0087, B:47:0x00a0, B:50:0x00a3, B:51:0x00ab, B:17:0x003e), top: B:141:0x0026, inners: #10 }] */
    public static int zza(@NonNull Context context, @NonNull String str, boolean z) {
        Throwable th;
        RemoteException e;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = zzb;
                Cursor cursor2 = null;
                int iZzf = 0;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                            if (classLoader == ClassLoader.getSystemClassLoader()) {
                                bool = Boolean.FALSE;
                            } else if (classLoader != null) {
                                try {
                                    zzd(classLoader);
                                } catch (LoadingException unused) {
                                }
                                bool = Boolean.TRUE;
                            } else {
                                if (!zzf(context)) {
                                    return 0;
                                }
                                if (zzd) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                } else {
                                    Boolean bool2 = Boolean.TRUE;
                                    if (bool2.equals(null)) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    } else {
                                        try {
                                            int iZzb = zzb(context, str, z, true);
                                            String str2 = zzc;
                                            if (str2 != null && !str2.isEmpty()) {
                                                ClassLoader classLoaderZza = zzb.zza();
                                                if (classLoaderZza == null) {
                                                    if (Build.VERSION.SDK_INT >= 29) {
                                                        String str3 = zzc;
                                                        Preconditions.checkNotNull(str3);
                                                        classLoaderZza = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                    } else {
                                                        String str4 = zzc;
                                                        Preconditions.checkNotNull(str4);
                                                        classLoaderZza = new zzc(str4, ClassLoader.getSystemClassLoader());
                                                    }
                                                }
                                                zzd(classLoaderZza);
                                                declaredField.set(null, classLoaderZza);
                                                zzb = bool2;
                                                return iZzb;
                                            }
                                            return iZzb;
                                        } catch (LoadingException unused2) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        }
                                    }
                                }
                                bool = Boolean.FALSE;
                            }
                            zzb = bool;
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e2.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return zzb(context, str, z, false);
                    } catch (LoadingException e3) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e3.getMessage());
                        return 0;
                    }
                }
                zzq zzqVarZzg = zzg(context);
                try {
                    if (zzqVarZzg != null) {
                        try {
                            int iZze = zzqVarZzg.zze();
                            if (iZze >= 3) {
                                zzn zznVar = (zzn) zzg.get();
                                if (zznVar == null || (cursor = zznVar.zza) == null) {
                                    Cursor cursor3 = (Cursor) ObjectWrapper.unwrap(zzqVarZzg.zzk(ObjectWrapper.wrap(context), str, z, ((Long) zzh.get()).longValue()));
                                    if (cursor3 != null) {
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                int i = cursor3.getInt(0);
                                                cursor2 = (i <= 0 || !zze(cursor3)) ? cursor3 : null;
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                iZzf = i;
                                            } else {
                                                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                            }
                                        } catch (RemoteException e4) {
                                            e = e4;
                                            cursor2 = cursor3;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e.getMessage());
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                    }
                                } else {
                                    iZzf = cursor.getInt(0);
                                }
                            } else if (iZze == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                iZzf = zzqVarZzg.zzg(ObjectWrapper.wrap(context), str, z);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                iZzf = zzqVarZzg.zzf(ObjectWrapper.wrap(context), str, z);
                            }
                        } catch (RemoteException e5) {
                            e = e5;
                        }
                    }
                    return iZzf;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            CrashUtils.addDynamiteErrorToDropBox(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00cd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    private static int zzb(Context context, String str, boolean z, boolean z2) throws Throwable {
        Throwable th;
        Exception e;
        ?? r0 = 0;
        ?? r1 = 0;
        ?? r2 = 0;
        ?? r3 = 0;
        try {
            try {
                boolean z3 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) zzh.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z4 = false;
                            int i = cursorQuery.getInt(0);
                            if (i > 0) {
                                synchronized (DynamiteModule.class) {
                                    try {
                                        zzc = cursorQuery.getString(2);
                                        int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            zze = cursorQuery.getInt(columnIndex);
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            if (cursorQuery.getInt(columnIndex2) == 0) {
                                                z3 = false;
                                            }
                                            zzd = z3;
                                            z4 = z3;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                if (zze(cursorQuery)) {
                                    cursorQuery = null;
                                }
                            }
                            if (z2 && z4) {
                                throw new LoadingException("forcing fallback to container DynamiteLoader impl", r2 == true ? 1 : 0);
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return i;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        if (e instanceof LoadingException) {
                            throw e;
                        }
                        throw new LoadingException("V2 version check failed", e, r1 == true ? 1 : 0);
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new LoadingException("Failed to connect to dynamite module ContentResolver.", r3 == true ? 1 : 0);
            } catch (Throwable th3) {
                th = th3;
                r0 = context;
                if (r0 != 0) {
                    r0.close();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
        } catch (Throwable th4) {
            th = th4;
            if (r0 != 0) {
                r0.close();
            }
            throw th;
        }
    }

    private static DynamiteModule zzc(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
        return new DynamiteModule(context.getApplicationContext());
    }

    @GuardedBy("DynamiteModule.class")
    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzr zzrVar;
        zzp zzpVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder == null) {
                zzrVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzrVar = iInterfaceQueryLocalInterface instanceof zzr ? (zzr) iInterfaceQueryLocalInterface : new zzr(iBinder);
            }
            zzl = zzrVar;
        } catch (ClassNotFoundException e) {
            e = e;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        } catch (InstantiationException e3) {
            e = e3;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        } catch (NoSuchMethodException e4) {
            e = e4;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        } catch (InvocationTargetException e5) {
            e = e5;
            throw new LoadingException("Failed to instantiate dynamite loader", e, zzpVar);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzn zznVar = (zzn) zzg.get();
        if (zznVar == null || zznVar.zza != null) {
            return false;
        }
        zznVar.zza = cursor;
        return true;
    }

    @GuardedBy("DynamiteModule.class")
    private static boolean zzf(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(zzf)) {
            return true;
        }
        boolean z = false;
        if (zzf == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            zzf = Boolean.valueOf(z);
            if (z && providerInfoResolveContentProvider != null && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                zzd = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    @Nullable
    private static zzq zzg(Context context) {
        zzq zzqVar;
        synchronized (DynamiteModule.class) {
            zzq zzqVar2 = zzk;
            if (zzqVar2 != null) {
                return zzqVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzqVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzqVar = iInterfaceQueryLocalInterface instanceof zzq ? (zzq) iInterfaceQueryLocalInterface : new zzq(iBinder);
                }
                if (zzqVar != null) {
                    zzk = zzqVar;
                    return zzqVar;
                }
            } catch (Exception e) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e.getMessage());
            }
            return null;
        }
    }

    @NonNull
    @KeepForSdk
    public Context getModuleContext() {
        return this.zzj;
    }

    @NonNull
    @KeepForSdk
    public IBinder instantiate(@NonNull String str) throws LoadingException {
        try {
            return (IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e, null);
        }
    }
}
