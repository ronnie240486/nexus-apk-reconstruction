package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class FileDataSourceFactory implements DataSource.Factory {
    private final FileDataSource.Factory wrappedFactory;

    public FileDataSourceFactory() {
        this(null);
    }

    public FileDataSourceFactory(@Nullable TransferListener transferListener) {
        this.wrappedFactory = new FileDataSource.Factory().setListener(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
    public FileDataSource createDataSource() {
        return this.wrappedFactory.createDataSource();
    }
}
