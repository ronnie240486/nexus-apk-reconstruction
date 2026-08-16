package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.IOException;
import java.util.Map;
import p000.C4949od;

/* JADX INFO: loaded from: classes2.dex */
public final class DummyDataSource implements DataSource {
    public static final DummyDataSource INSTANCE = new DummyDataSource();
    public static final DataSource.Factory FACTORY = new DataSource.Factory() { // from class: Qg
        /* JADX WARN: Invalid debug info offset */
        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public final DataSource createDataSource() {
            return null;
        }
    };

    private DummyDataSource() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ DummyDataSource m17576a() {
        return new DummyDataSource();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener transferListener) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public /* synthetic */ Map getResponseHeaders() {
        return C4949od.m22759a(this);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        throw new IOException("Dummy source");
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
