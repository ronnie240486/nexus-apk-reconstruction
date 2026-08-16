package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.zzo;
import com.google.android.gms.internal.common.zzx;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import p000.C1002PX;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class HttpUtils {
    private static final Pattern zza = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    private static final Pattern zzb = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
    private static final Pattern zzc = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    private HttpUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap] */
    @NonNull
    @KeepForSdk
    public static Map<String, String> parse(@NonNull URI uri, @NonNull String str) {
        ?? EmptyMap = Collections.emptyMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            EmptyMap = new HashMap();
            zzx zzxVarZzc = zzx.zzc(zzo.zzb('='));
            Iterator it = zzx.zzc(zzo.zzb(C1002PX.f2513d)).zzb().zzd(rawQuery).iterator();
            while (it.hasNext()) {
                List listZzf = zzxVarZzc.zzf((String) it.next());
                if (listZzf.isEmpty() || listZzf.size() > 2) {
                    throw new IllegalArgumentException("bad parameter");
                }
                EmptyMap.put(zza((String) listZzf.get(0), str), listZzf.size() == 2 ? zza((String) listZzf.get(1), str) : null);
            }
        }
        return EmptyMap;
    }

    private static String zza(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
