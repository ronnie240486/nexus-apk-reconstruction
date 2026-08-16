package com.google.android.exoplayer2.metadata.scte35;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import p000.C0726LC;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SpliceCommand implements Metadata.Entry {
    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return C0726LC.m3430a(this);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ Format getWrappedMetadataFormat() {
        return C0726LC.m3431b(this);
    }

    public String toString() {
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }
}
