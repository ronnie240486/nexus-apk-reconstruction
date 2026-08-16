package com.google.android.exoplayer2.ext.rtmp;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.upstream.BaseDataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import net.butterflytv.rtmp_client.RtmpClient;

/* JADX INFO: loaded from: classes2.dex */
public final class RtmpDataSource extends BaseDataSource {

    @Nullable
    private RtmpClient rtmpClient;

    @Nullable
    private Uri uri;

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.rtmp");
    }

    public RtmpDataSource() {
        super(true);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        if (this.uri != null) {
            this.uri = null;
            transferEnded();
        }
        RtmpClient rtmpClient = this.rtmpClient;
        if (rtmpClient != null) {
            rtmpClient.close();
            this.rtmpClient = null;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        return this.uri;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws RtmpClient.RtmpIOException {
        transferInitializing(dataSpec);
        RtmpClient rtmpClient = new RtmpClient();
        this.rtmpClient = rtmpClient;
        rtmpClient.open(dataSpec.uri.toString(), false);
        this.uri = dataSpec.uri;
        transferStarted(dataSpec);
        return -1L;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = ((RtmpClient) Util.castNonNull(this.rtmpClient)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        bytesTransferred(i3);
        return i3;
    }
}
