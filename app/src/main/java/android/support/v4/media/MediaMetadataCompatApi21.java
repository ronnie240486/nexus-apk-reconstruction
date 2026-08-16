package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.os.Parcel;
import androidx.annotation.RequiresApi;
import java.util.Set;
import p000.C0913OA;
import p000.C0979PA;
import p000.C1044QA;
import p000.C1106RA;
import p000.C1169SA;
import p000.C1234TA;
import p000.C1298UA;
import p000.C1366VA;
import p000.C1430WA;
import p000.C1493XA;
import p000.C1556YA;
import p000.C1624ZA;
import p000.C1691aB;
import p000.C2958bB;
import p000.C3021cB;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
class MediaMetadataCompatApi21 {

    public static class Builder {
        private Builder() {
        }

        public static Object build(Object obj) {
            return C1556YA.m8062a(C1430WA.m6729a(obj));
        }

        public static Object newInstance() {
            return new MediaMetadata.Builder();
        }

        public static void putBitmap(Object obj, String str, Bitmap bitmap) {
            C2958bB.m14603a(C1430WA.m6729a(obj), str, bitmap);
        }

        public static void putLong(Object obj, String str, long j) {
            C1624ZA.m8643a(C1430WA.m6729a(obj), str, j);
        }

        public static void putRating(Object obj, String str, Object obj2) {
            C1493XA.m7017a(C1430WA.m6729a(obj), str, (Rating) obj2);
        }

        public static void putString(Object obj, String str, String str2) {
            C1691aB.m8899a(C1430WA.m6729a(obj), str, str2);
        }

        public static void putText(Object obj, String str, CharSequence charSequence) {
            C3021cB.m16451a(C1430WA.m6729a(obj), str, charSequence);
        }
    }

    private MediaMetadataCompatApi21() {
    }

    public static Object createFromParcel(Parcel parcel) {
        return C1366VA.m6487a().createFromParcel(parcel);
    }

    public static Bitmap getBitmap(Object obj, String str) {
        return C1044QA.m4604a(C0913OA.m4231a(obj), str);
    }

    public static long getLong(Object obj, String str) {
        return C1234TA.m5766a(C0913OA.m4231a(obj), str);
    }

    public static Object getRating(Object obj, String str) {
        return C1106RA.m4972a(C0913OA.m4231a(obj), str);
    }

    public static CharSequence getText(Object obj, String str) {
        return C0979PA.m4378a(C0913OA.m4231a(obj), str);
    }

    public static Set<String> keySet(Object obj) {
        return C1169SA.m5463a(C0913OA.m4231a(obj));
    }

    public static void writeToParcel(Object obj, Parcel parcel, int i) {
        C1298UA.m6195a(C0913OA.m4231a(obj), parcel, i);
    }
}
