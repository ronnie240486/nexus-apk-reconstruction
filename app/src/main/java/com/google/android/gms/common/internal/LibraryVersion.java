package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import p000.C1051QH;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
@Deprecated
public class LibraryVersion {
    private static final GmsLogger zza = new GmsLogger("LibraryVersion", "");
    private static LibraryVersion zzb = new LibraryVersion();
    private ConcurrentHashMap zzc = new ConcurrentHashMap();

    @VisibleForTesting
    public LibraryVersion() {
    }

    @NonNull
    @KeepForSdk
    public static LibraryVersion getInstance() {
        return zzb;
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public String getVersion(@NonNull String str) throws Throwable {
        String str2;
        Preconditions.checkNotEmpty(str, "Please provide a valid libraryName");
        if (this.zzc.containsKey(str)) {
            return (String) this.zzc.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream = null;
        property = null;
        String property = null;
        inputStream = null;
        try {
            try {
                InputStream resourceAsStream = LibraryVersion.class.getResourceAsStream(String.format("/%s.properties", str));
                try {
                    if (resourceAsStream != null) {
                        properties.load(resourceAsStream);
                        property = properties.getProperty(C1051QH.f2696b, null);
                        zza.m17606v("LibraryVersion", str + " version is " + property);
                    } else {
                        zza.m17608w("LibraryVersion", "Failed to get app version for libraryName: " + str);
                    }
                    if (resourceAsStream != null) {
                        IOUtils.closeQuietly(resourceAsStream);
                    }
                } catch (IOException e) {
                    e = e;
                    str2 = property;
                    inputStream = resourceAsStream;
                    zza.m17603e("LibraryVersion", "Failed to get app version for libraryName: " + str, e);
                    if (inputStream != null) {
                        IOUtils.closeQuietly(inputStream);
                    }
                    property = str2;
                } catch (Throwable th) {
                    th = th;
                    inputStream = resourceAsStream;
                    if (inputStream != null) {
                        IOUtils.closeQuietly(inputStream);
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                str2 = null;
            }
            if (property == null) {
                zza.m17600d("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                property = "UNKNOWN";
            }
            this.zzc.put(str, property);
            return property;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
