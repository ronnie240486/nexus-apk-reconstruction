package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;
import p000.C1261Tb;
import p000.C1718ac;

/* JADX INFO: loaded from: classes2.dex */
public final class zzho {

    @GuardedBy("CachingReader.class")
    private static volatile zzig zza;

    private zzho() {
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0032 A[Catch: all -> 0x001e, TryCatch #6 {all -> 0x001e, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0015, B:18:0x0032, B:73:0x0174, B:13:0x0021, B:15:0x0029, B:20:0x0039, B:22:0x003f, B:24:0x0045, B:25:0x0049, B:72:0x016f, B:74:0x0177, B:75:0x017a, B:76:0x017b, B:26:0x004d, B:27:0x0050, B:28:0x005d, B:30:0x0063, B:36:0x0079, B:38:0x007f, B:39:0x0085, B:59:0x0140, B:60:0x0143, B:68:0x0164, B:67:0x014f, B:69:0x0165, B:70:0x016a, B:71:0x016b, B:33:0x006b, B:35:0x0071), top: B:93:0x0005, inners: #2 }] */
    public static zzig zza(Context context) {
        zzig zzigVar;
        zzig zzigVarZzd;
        zzig zzigVarZzc;
        synchronized (zzho.class) {
            try {
                zzigVar = zza;
                if (zzigVar == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    if (!str.equals("eng") && !str.equals("userdebug")) {
                        zzigVarZzc = zzig.zzc();
                    } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
                        if (zzhb.zzb() && !C1718ac.m9129a(context)) {
                            context = C1261Tb.m5925a(context);
                        }
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            try {
                                File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                                zzigVarZzd = file.exists() ? zzig.zzd(file) : zzig.zzc();
                            } catch (RuntimeException e) {
                                Log.e("HermeticFileOverrides", "no data dir", e);
                            }
                            if (zzigVarZzd.zzb()) {
                                File file2 = (File) zzigVarZzd.zza();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    try {
                                        SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
                                        HashMap map = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length != 3) {
                                                Log.e("HermeticFileOverrides", "Invalid: " + line);
                                            } else {
                                                String str3 = new String(strArrSplit[0]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String strDecode2 = (String) map.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map.put(str4, strDecode2);
                                                    }
                                                }
                                                if (!simpleArrayMap.containsKey(str3)) {
                                                    simpleArrayMap.put(str3, new SimpleArrayMap());
                                                }
                                                ((SimpleArrayMap) simpleArrayMap.get(str3)).put(strDecode, strDecode2);
                                            }
                                        }
                                        Log.w("HermeticFileOverrides", "Parsed " + file2.toString() + " for Android package " + context.getPackageName());
                                        zzhh zzhhVar = new zzhh(simpleArrayMap);
                                        bufferedReader.close();
                                        zzigVarZzc = zzig.zzd(zzhhVar);
                                    } catch (Throwable th) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Throwable th2) {
                                            try {
                                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                            } catch (Exception unused) {
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2);
                                }
                            } else {
                                zzigVarZzc = zzig.zzc();
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th3;
                        }
                    } else {
                        zzigVarZzc = zzig.zzc();
                    }
                    zzigVar = zzigVarZzc;
                    zza = zzigVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return zzigVar;
    }
}
