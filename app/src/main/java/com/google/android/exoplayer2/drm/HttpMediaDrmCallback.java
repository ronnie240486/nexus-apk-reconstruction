package com.google.android.exoplayer2.drm;

import android.annotation.TargetApi;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C3219C;
import com.google.android.exoplayer2.upstream.DataSourceInputStream;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(18)
public final class HttpMediaDrmCallback implements MediaDrmCallback {
    private static final int MAX_MANUAL_REDIRECTS = 5;
    private final HttpDataSource.Factory dataSourceFactory;
    private final String defaultLicenseUrl;
    private final boolean forceDefaultLicenseUrl;
    private final Map<String, String> keyRequestProperties;

    public HttpMediaDrmCallback(String str, HttpDataSource.Factory factory) {
        this(str, false, factory);
    }

    private static byte[] executePost(HttpDataSource.Factory factory, String str, @Nullable byte[] bArr, @Nullable Map<String, String> map) throws IOException {
        int i;
        boolean z;
        HttpDataSource httpDataSourceCreateDataSource = factory.createDataSource();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpDataSourceCreateDataSource.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        String str2 = str;
        int i2 = 0;
        while (true) {
            DataSourceInputStream dataSourceInputStream = new DataSourceInputStream(httpDataSourceCreateDataSource, new DataSpec(Uri.parse(str2), 2, bArr, 0L, 0L, -1L, null, 1));
            try {
                byte[] byteArray = Util.toByteArray(dataSourceInputStream);
                Util.closeQuietly(dataSourceInputStream);
                return byteArray;
            } catch (HttpDataSource.InvalidResponseCodeException e) {
                try {
                    if (e.responseCode == 307 || e.responseCode == 308) {
                        i = i2 + 1;
                        if (i2 < 5) {
                            z = true;
                        } else {
                            i2 = i;
                            i = i2;
                            z = false;
                        }
                    } else {
                        i = i2;
                        z = false;
                    }
                    String redirectUrl = z ? getRedirectUrl(e) : null;
                    if (redirectUrl == null) {
                        throw e;
                    }
                    Util.closeQuietly(dataSourceInputStream);
                    String str3 = redirectUrl;
                    i2 = i;
                    str2 = str3;
                } catch (Throwable th) {
                    Util.closeQuietly(dataSourceInputStream);
                    throw th;
                }
            }
        }
    }

    @Nullable
    private static String getRedirectUrl(HttpDataSource.InvalidResponseCodeException invalidResponseCodeException) {
        List<String> list;
        Map<String, List<String>> map = invalidResponseCodeException.headerFields;
        if (map == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public void clearAllKeyRequestProperties() {
        synchronized (this.keyRequestProperties) {
            this.keyRequestProperties.clear();
        }
    }

    public void clearKeyRequestProperty(String str) {
        Assertions.checkNotNull(str);
        synchronized (this.keyRequestProperties) {
            this.keyRequestProperties.remove(str);
        }
    }

    @Override // com.google.android.exoplayer2.drm.MediaDrmCallback
    public byte[] executeKeyRequest(UUID uuid, ExoMediaDrm.KeyRequest keyRequest) throws Exception {
        String str;
        String licenseServerUrl = keyRequest.getLicenseServerUrl();
        if (this.forceDefaultLicenseUrl || TextUtils.isEmpty(licenseServerUrl)) {
            licenseServerUrl = this.defaultLicenseUrl;
        }
        HashMap map = new HashMap();
        UUID uuid2 = C3219C.PLAYREADY_UUID;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = C3219C.CLEARKEY_UUID.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.keyRequestProperties) {
            map.putAll(this.keyRequestProperties);
        }
        return executePost(this.dataSourceFactory, licenseServerUrl, keyRequest.getData(), map);
    }

    @Override // com.google.android.exoplayer2.drm.MediaDrmCallback
    public byte[] executeProvisionRequest(UUID uuid, ExoMediaDrm.ProvisionRequest provisionRequest) throws IOException {
        return executePost(this.dataSourceFactory, provisionRequest.getDefaultUrl() + "&signedRequest=" + Util.fromUtf8Bytes(provisionRequest.getData()), null, null);
    }

    public void setKeyRequestProperty(String str, String str2) {
        Assertions.checkNotNull(str);
        Assertions.checkNotNull(str2);
        synchronized (this.keyRequestProperties) {
            this.keyRequestProperties.put(str, str2);
        }
    }

    public HttpMediaDrmCallback(String str, boolean z, HttpDataSource.Factory factory) {
        this.dataSourceFactory = factory;
        this.defaultLicenseUrl = str;
        this.forceDefaultLicenseUrl = z;
        this.keyRequestProperties = new HashMap();
    }
}
