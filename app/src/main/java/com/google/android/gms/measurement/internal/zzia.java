package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import p000.C0428GZ;

/* JADX INFO: loaded from: classes2.dex */
@WorkerThread
final class zzia implements Runnable {
    final /* synthetic */ zzib zza;
    private final URL zzb;
    private final String zzc;
    private final zzfp zzd;

    public zzia(zzib zzibVar, String str, URL url, byte[] bArr, Map map, zzfp zzfpVar, byte[] bArr2) {
        this.zza = zzibVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzfpVar);
        this.zzb = url;
        this.zzd = zzfpVar;
        this.zzc = str;
    }

    private final void zzb(final int i, final Exception exc, final byte[] bArr, final Map map) {
        this.zza.zzt.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhz
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(i, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.gms.measurement.internal.zzia] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        ?? r4;
        ?? r5;
        Throwable th;
        int responseCode;
        IOException e;
        InputStream inputStream;
        this.zza.zzax();
        try {
            zzib zzibVar = this.zza;
            URLConnection uRLConnectionOpenConnection = this.zzb.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzibVar.zzt.zzf();
            r4 = 60000;
            r5 = 60000;
            httpURLConnection.setConnectTimeout(C0428GZ.f911c);
            zzibVar.zzt.zzf();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                responseCode = httpURLConnection.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int i = inputStream.read(bArr);
                                    if (i <= 0) {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        inputStream.close();
                                        httpURLConnection.disconnect();
                                        zzb(responseCode, null, byteArray, headerFields);
                                        return;
                                    }
                                    byteArrayOutputStream.write(bArr, 0, i);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = null;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        r5 = 0;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzb(responseCode, e, null, r5);
                    } catch (Throwable th4) {
                        th = th4;
                        r4 = 0;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzb(responseCode, null, null, r4);
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzb(responseCode, e, null, r5);
                } catch (Throwable th5) {
                    th = th5;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzb(responseCode, null, null, r4);
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                r5 = 0;
                e = e;
                responseCode = 0;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                zzb(responseCode, e, null, r5);
            } catch (Throwable th6) {
                th = th6;
                r4 = 0;
                th = th;
                responseCode = 0;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                zzb(responseCode, null, null, r4);
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            httpURLConnection = null;
            r5 = 0;
        } catch (Throwable th7) {
            th = th7;
            httpURLConnection = null;
            r4 = 0;
        }
    }

    public final /* synthetic */ void zza(int i, Exception exc, byte[] bArr, Map map) {
        zzfp zzfpVar = this.zzd;
        zzfpVar.zza.zzC(this.zzc, i, exc, bArr, map);
    }
}
