package com.p2pengine.core.abs.mpd.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.p2pengine.core.abs.mpd.Format;

/* JADX INFO: loaded from: classes2.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new C3920a();

    /* JADX INFO: renamed from: a */
    public final Entry[] f11710a;

    public interface Entry extends Parcelable {
        @Nullable
        byte[] getWrappedMetadataBytes();

        @Nullable
        Format getWrappedMetadataFormat();
    }

    /* JADX INFO: renamed from: com.p2pengine.core.abs.mpd.metadata.Metadata$a */
    public class C3920a implements Parcelable.Creator<Metadata> {
        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Parcelable.Creator
        public Metadata createFromParcel(Parcel parcel) {
            return null;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // android.os.Parcelable.Creator
        public Metadata[] newArray(int i) {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public Metadata(Parcel parcel) {
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
