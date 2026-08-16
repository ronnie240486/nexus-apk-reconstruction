package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultDataSource implements DataSource {
    private static final String SCHEME_ASSET = "asset";
    private static final String SCHEME_CONTENT = "content";
    private static final String SCHEME_RAW = "rawresource";
    private static final String SCHEME_RTMP = "rtmp";
    private static final String SCHEME_UDP = "udp";
    private static final String TAG = "DefaultDataSource";

    @Nullable
    private DataSource assetDataSource;
    private final DataSource baseDataSource;

    @Nullable
    private DataSource contentDataSource;
    private final Context context;

    @Nullable
    private DataSource dataSchemeDataSource;

    @Nullable
    private DataSource dataSource;

    @Nullable
    private DataSource fileDataSource;

    @Nullable
    private DataSource rawResourceDataSource;

    @Nullable
    private DataSource rtmpDataSource;
    private final List<TransferListener> transferListeners;

    @Nullable
    private DataSource udpDataSource;

    public DefaultDataSource(Context context, DataSource dataSource) {
        this.context = context.getApplicationContext();
        this.baseDataSource = (DataSource) Assertions.checkNotNull(dataSource);
        this.transferListeners = new ArrayList();
    }

    private void addListenersToDataSource(DataSource dataSource) {
        for (int i = 0; i < this.transferListeners.size(); i++) {
            dataSource.addTransferListener(this.transferListeners.get(i));
        }
    }

    private DataSource getAssetDataSource() {
        if (this.assetDataSource == null) {
            AssetDataSource assetDataSource = new AssetDataSource(this.context);
            this.assetDataSource = assetDataSource;
            addListenersToDataSource(assetDataSource);
        }
        return this.assetDataSource;
    }

    private DataSource getContentDataSource() {
        if (this.contentDataSource == null) {
            ContentDataSource contentDataSource = new ContentDataSource(this.context);
            this.contentDataSource = contentDataSource;
            addListenersToDataSource(contentDataSource);
        }
        return this.contentDataSource;
    }

    private DataSource getDataSchemeDataSource() {
        if (this.dataSchemeDataSource == null) {
            DataSchemeDataSource dataSchemeDataSource = new DataSchemeDataSource();
            this.dataSchemeDataSource = dataSchemeDataSource;
            addListenersToDataSource(dataSchemeDataSource);
        }
        return this.dataSchemeDataSource;
    }

    private DataSource getFileDataSource() {
        if (this.fileDataSource == null) {
            FileDataSource fileDataSource = new FileDataSource();
            this.fileDataSource = fileDataSource;
            addListenersToDataSource(fileDataSource);
        }
        return this.fileDataSource;
    }

    private DataSource getRawResourceDataSource() {
        if (this.rawResourceDataSource == null) {
            RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.context);
            this.rawResourceDataSource = rawResourceDataSource;
            addListenersToDataSource(rawResourceDataSource);
        }
        return this.rawResourceDataSource;
    }

    private DataSource getRtmpDataSource() {
        if (this.rtmpDataSource == null) {
            try {
                DataSource dataSource = (DataSource) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                this.rtmpDataSource = dataSource;
                addListenersToDataSource(dataSource);
            } catch (ClassNotFoundException unused) {
                Log.m17586w(TAG, "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.rtmpDataSource == null) {
                this.rtmpDataSource = this.baseDataSource;
            }
        }
        return this.rtmpDataSource;
    }

    private DataSource getUdpDataSource() {
        if (this.udpDataSource == null) {
            UdpDataSource udpDataSource = new UdpDataSource();
            this.udpDataSource = udpDataSource;
            addListenersToDataSource(udpDataSource);
        }
        return this.udpDataSource;
    }

    private void maybeAddListenerToDataSource(@Nullable DataSource dataSource, TransferListener transferListener) {
        if (dataSource != null) {
            dataSource.addTransferListener(transferListener);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener transferListener) {
        this.baseDataSource.addTransferListener(transferListener);
        this.transferListeners.add(transferListener);
        maybeAddListenerToDataSource(this.fileDataSource, transferListener);
        maybeAddListenerToDataSource(this.assetDataSource, transferListener);
        maybeAddListenerToDataSource(this.contentDataSource, transferListener);
        maybeAddListenerToDataSource(this.rtmpDataSource, transferListener);
        maybeAddListenerToDataSource(this.udpDataSource, transferListener);
        maybeAddListenerToDataSource(this.dataSchemeDataSource, transferListener);
        maybeAddListenerToDataSource(this.rawResourceDataSource, transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        DataSource dataSource = this.dataSource;
        if (dataSource != null) {
            try {
                dataSource.close();
            } finally {
                this.dataSource = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        DataSource dataSource = this.dataSource;
        return dataSource == null ? Collections.emptyMap() : dataSource.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        DataSource dataSource = this.dataSource;
        if (dataSource == null) {
            return null;
        }
        return dataSource.getUri();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        DataSource rawResourceDataSource;
        Assertions.checkState(this.dataSource == null);
        String scheme = dataSpec.uri.getScheme();
        if (Util.isLocalFileUri(dataSpec.uri)) {
            String path = dataSpec.uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                rawResourceDataSource = getFileDataSource();
            } else {
                rawResourceDataSource = getAssetDataSource();
            }
        } else if (SCHEME_ASSET.equals(scheme)) {
            rawResourceDataSource = getAssetDataSource();
        } else if ("content".equals(scheme)) {
            rawResourceDataSource = getContentDataSource();
        } else if (SCHEME_RTMP.equals(scheme)) {
            rawResourceDataSource = getRtmpDataSource();
        } else if (SCHEME_UDP.equals(scheme)) {
            rawResourceDataSource = getUdpDataSource();
        } else if ("data".equals(scheme)) {
            rawResourceDataSource = getDataSchemeDataSource();
        } else {
            rawResourceDataSource = "rawresource".equals(scheme) ? getRawResourceDataSource() : this.baseDataSource;
        }
        this.dataSource = rawResourceDataSource;
        return this.dataSource.open(dataSpec);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return ((DataSource) Assertions.checkNotNull(this.dataSource)).read(bArr, i, i2);
    }

    public DefaultDataSource(Context context, String str, int i, int i2, boolean z) {
        this(context, new DefaultHttpDataSource(str, i, i2, z, null));
    }

    public DefaultDataSource(Context context, String str, boolean z) {
        this(context, str, 8000, 8000, z);
    }
}
