package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import androidx.annotation.RequiresApi;
import p000.C0013AA;
import p000.C0077BA;
import p000.C0149CA;
import p000.C0213DA;
import p000.C0277EA;
import p000.C0340FA;
import p000.C0403GA;
import p000.C0467HA;
import p000.C0530IA;
import p000.C0593JA;
import p000.C5287rA;
import p000.C5358sA;
import p000.C5421tA;
import p000.C5503uA;
import p000.C5574vA;
import p000.C5638wA;
import p000.C5705xA;
import p000.C5770yA;
import p000.C5840zA;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
class MediaDescriptionCompatApi21 {

    public static class Builder {
        private Builder() {
        }

        public static Object build(Object obj) {
            return C0149CA.m925a(C0077BA.m469a(obj));
        }

        public static Object newInstance() {
            return new MediaDescription.Builder();
        }

        public static void setDescription(Object obj, CharSequence charSequence) {
            C0530IA.m2506a(C0077BA.m469a(obj), charSequence);
        }

        public static void setExtras(Object obj, Bundle bundle) {
            C0277EA.m1539a(C0077BA.m469a(obj), bundle);
        }

        public static void setIconBitmap(Object obj, Bitmap bitmap) {
            C0403GA.m2002a(C0077BA.m469a(obj), bitmap);
        }

        public static void setIconUri(Object obj, Uri uri) {
            C0213DA.m1322a(C0077BA.m469a(obj), uri);
        }

        public static void setMediaId(Object obj, String str) {
            C0467HA.m2269a(C0077BA.m469a(obj), str);
        }

        public static void setSubtitle(Object obj, CharSequence charSequence) {
            C0340FA.m1789a(C0077BA.m469a(obj), charSequence);
        }

        public static void setTitle(Object obj, CharSequence charSequence) {
            C0593JA.m2916a(C0077BA.m469a(obj), charSequence);
        }
    }

    private MediaDescriptionCompatApi21() {
    }

    public static Object fromParcel(Parcel parcel) {
        return C5840zA.m29956a().createFromParcel(parcel);
    }

    public static CharSequence getDescription(Object obj) {
        return C5770yA.m29770a(C5287rA.m27799a(obj));
    }

    public static Bundle getExtras(Object obj) {
        return C5574vA.m28790a(C5287rA.m27799a(obj));
    }

    public static Bitmap getIconBitmap(Object obj) {
        return C5638wA.m29223a(C5287rA.m27799a(obj));
    }

    public static Uri getIconUri(Object obj) {
        return C5358sA.m28125a(C5287rA.m27799a(obj));
    }

    public static String getMediaId(Object obj) {
        return C0013AA.m101a(C5287rA.m27799a(obj));
    }

    public static CharSequence getSubtitle(Object obj) {
        return C5503uA.m28588a(C5287rA.m27799a(obj));
    }

    public static CharSequence getTitle(Object obj) {
        return C5421tA.m28369a(C5287rA.m27799a(obj));
    }

    public static void writeToParcel(Object obj, Parcel parcel, int i) {
        C5705xA.m29451a(C5287rA.m27799a(obj), parcel, i);
    }
}
