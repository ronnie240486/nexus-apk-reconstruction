package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p000.C0372Fg;

/* JADX INFO: loaded from: classes2.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new Parcelable.Creator<DownloadRequest>() { // from class: com.google.android.exoplayer2.offline.DownloadRequest.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadRequest[] newArray(int i) {
            return new DownloadRequest[i];
        }
    };
    public static final String TYPE_DASH = "dash";
    public static final String TYPE_HLS = "hls";
    public static final String TYPE_PROGRESSIVE = "progressive";
    public static final String TYPE_SS = "ss";

    @Nullable
    public final String customCacheKey;
    public final byte[] data;

    /* JADX INFO: renamed from: id */
    public final String f11098id;
    public final List<StreamKey> streamKeys;
    public final String type;
    public final Uri uri;

    public static class UnsupportedRequestException extends IOException {
    }

    public DownloadRequest(Parcel parcel) {
        this.f11098id = (String) Util.castNonNull(parcel.readString());
        this.type = (String) Util.castNonNull(parcel.readString());
        this.uri = Uri.parse((String) Util.castNonNull(parcel.readString()));
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.streamKeys = Collections.unmodifiableList(arrayList);
        this.customCacheKey = parcel.readString();
        this.data = (byte[]) Util.castNonNull(parcel.createByteArray());
    }

    public DownloadRequest copyWithId(String str) {
        return new DownloadRequest(str, this.type, this.uri, this.streamKeys, this.customCacheKey, this.data);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    public DownloadRequest copyWithMergedRequest(DownloadRequest downloadRequest) {
        ?? EmptyList;
        Assertions.checkArgument(this.f11098id.equals(downloadRequest.f11098id));
        Assertions.checkArgument(this.type.equals(downloadRequest.type));
        if (this.streamKeys.isEmpty() || downloadRequest.streamKeys.isEmpty()) {
            EmptyList = Collections.emptyList();
        } else {
            EmptyList = new ArrayList(this.streamKeys);
            for (int i = 0; i < downloadRequest.streamKeys.size(); i++) {
                StreamKey streamKey = downloadRequest.streamKeys.get(i);
                if (!EmptyList.contains(streamKey)) {
                    EmptyList.add(streamKey);
                }
            }
        }
        return new DownloadRequest(this.f11098id, this.type, downloadRequest.uri, EmptyList, downloadRequest.customCacheKey, downloadRequest.data);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.f11098id.equals(downloadRequest.f11098id) && this.type.equals(downloadRequest.type) && this.uri.equals(downloadRequest.uri) && this.streamKeys.equals(downloadRequest.streamKeys) && Util.areEqual(this.customCacheKey, downloadRequest.customCacheKey) && Arrays.equals(this.data, downloadRequest.data);
    }

    public final int hashCode() {
        int iHashCode = (this.streamKeys.hashCode() + ((this.uri.hashCode() + C0372Fg.m1897a(this.type, C0372Fg.m1897a(this.f11098id, this.type.hashCode() * 31, 31), 31)) * 31)) * 31;
        String str = this.customCacheKey;
        return Arrays.hashCode(this.data) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        return this.type + ":" + this.f11098id;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11098id);
        parcel.writeString(this.type);
        parcel.writeString(this.uri.toString());
        parcel.writeInt(this.streamKeys.size());
        for (int i2 = 0; i2 < this.streamKeys.size(); i2++) {
            parcel.writeParcelable(this.streamKeys.get(i2), 0);
        }
        parcel.writeString(this.customCacheKey);
        parcel.writeByteArray(this.data);
    }

    public DownloadRequest(String str, String str2, Uri uri, List<StreamKey> list, @Nullable String str3, @Nullable byte[] bArr) {
        if (TYPE_DASH.equals(str2) || TYPE_HLS.equals(str2) || TYPE_SS.equals(str2)) {
            Assertions.checkArgument(str3 == null, "customCacheKey must be null for type: " + str2);
        }
        this.f11098id = str;
        this.type = str2;
        this.uri = uri;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.streamKeys = Collections.unmodifiableList(arrayList);
        this.customCacheKey = str3;
        this.data = bArr != null ? Arrays.copyOf(bArr, bArr.length) : Util.EMPTY_BYTE_ARRAY;
    }
}
