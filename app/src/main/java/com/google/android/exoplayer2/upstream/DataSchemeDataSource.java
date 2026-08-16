package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.net.URLDecoder;
import p000.C1262Tc;
import p000.C5312rZ;

/* JADX INFO: loaded from: classes2.dex */
public final class DataSchemeDataSource extends BaseDataSource {
    public static final String SCHEME_DATA = "data";

    @Nullable
    private byte[] data;

    @Nullable
    private DataSpec dataSpec;
    private int endPosition;
    private int readPosition;

    public DataSchemeDataSource() {
        super(false);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        if (this.data != null) {
            this.data = null;
            transferEnded();
        }
        this.dataSpec = null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        DataSpec dataSpec = this.dataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        transferInitializing(dataSpec);
        this.dataSpec = dataSpec;
        this.readPosition = (int) dataSpec.position;
        Uri uri = dataSpec.uri;
        String scheme = uri.getScheme();
        if (!"data".equals(scheme)) {
            throw new ParserException(C5312rZ.m27869a("Unsupported scheme: ", scheme));
        }
        String[] strArrSplit = Util.split(uri.getSchemeSpecificPart(), C1262Tc.f3278g);
        if (strArrSplit.length != 2) {
            throw new ParserException("Unexpected URI format: " + uri);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.data = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw new ParserException(C5312rZ.m27869a("Error while parsing Base64 encoded string: ", str), e);
            }
        } else {
            this.data = Util.getUtf8Bytes(URLDecoder.decode(str, "US-ASCII"));
        }
        long j = dataSpec.length;
        int length = j != -1 ? ((int) j) + this.readPosition : this.data.length;
        this.endPosition = length;
        if (length > this.data.length || this.readPosition > length) {
            this.data = null;
            throw new DataSourceException(0);
        }
        transferStarted(dataSpec);
        return ((long) this.endPosition) - ((long) this.readPosition);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.endPosition - this.readPosition;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        System.arraycopy(Util.castNonNull(this.data), this.readPosition, bArr, i, iMin);
        this.readPosition += iMin;
        bytesTransferred(iMin);
        return iMin;
    }
}
