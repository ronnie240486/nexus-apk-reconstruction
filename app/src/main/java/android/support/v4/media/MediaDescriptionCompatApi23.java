package android.support.v4.media;

import android.net.Uri;
import androidx.annotation.RequiresApi;
import p000.C0077BA;
import p000.C0658KA;
import p000.C0724LA;
import p000.C5287rA;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
class MediaDescriptionCompatApi23 {

    public static class Builder {
        private Builder() {
        }

        public static void setMediaUri(Object obj, Uri uri) {
            C0724LA.m3428a(C0077BA.m469a(obj), uri);
        }
    }

    private MediaDescriptionCompatApi23() {
    }

    public static Uri getMediaUri(Object obj) {
        return C0658KA.m3121a(C5287rA.m27799a(obj));
    }
}
