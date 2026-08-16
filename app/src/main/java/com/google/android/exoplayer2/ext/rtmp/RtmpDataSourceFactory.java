package com.google.android.exoplayer2.ext.rtmp;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.TransferListener;

/* JADX INFO: loaded from: classes2.dex */
public final class RtmpDataSourceFactory implements DataSource.Factory {

    @Nullable
    private final TransferListener listener;

    public RtmpDataSourceFactory() {
        this(null);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public RtmpDataSource createDataSource() {
        RtmpDataSource rtmpDataSource = new RtmpDataSource();
        TransferListener transferListener = this.listener;
        if (transferListener != null) {
            rtmpDataSource.addTransferListener(transferListener);
        }
        return rtmpDataSource;
    }

    public RtmpDataSourceFactory(@Nullable TransferListener transferListener) {
        this.listener = transferListener;
    }
}
