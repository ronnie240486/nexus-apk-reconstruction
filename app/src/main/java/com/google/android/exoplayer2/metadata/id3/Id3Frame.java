package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import p000.C0726LC;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Id3Frame implements Metadata.Entry {

    /* JADX INFO: renamed from: id */
    public final String f11092id;

    public Id3Frame(String str) {
        this.f11092id = str;
    }

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
        return this.f11092id;
    }
}
