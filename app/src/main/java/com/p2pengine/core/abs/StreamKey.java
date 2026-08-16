package com.p2pengine.core.abs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new C3900a();

    /* JADX INFO: renamed from: a */
    public final int f11558a;

    /* JADX INFO: renamed from: b */
    public final int f11559b;

    /* JADX INFO: renamed from: c */
    public final int f11560c;

    /* JADX INFO: renamed from: com.p2pengine.core.abs.StreamKey$a */
    public class C3900a implements Parcelable.Creator<StreamKey> {
        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Parcelable.Creator
        public StreamKey createFromParcel(Parcel parcel) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Parcelable.Creator
        public StreamKey[] newArray(int i) {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public StreamKey(int i, int i2, int i3) {
    }

    /* JADX WARN: Invalid debug info offset */
    public StreamKey(Parcel parcel) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // java.lang.Comparable
    public int compareTo(StreamKey streamKey) {
        return 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public boolean equals(@Nullable Object obj) {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    public int hashCode() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    public String toString() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
