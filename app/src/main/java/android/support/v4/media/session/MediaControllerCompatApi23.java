package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import p000.C1607Yz;
import p000.C4785mA;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
class MediaControllerCompatApi23 {

    public static class TransportControls {
        private TransportControls() {
        }

        public static void playFromUri(Object obj, Uri uri, Bundle bundle) {
            C4785mA.m22061a(C1607Yz.m8260a(obj), uri, bundle);
        }
    }

    private MediaControllerCompatApi23() {
    }
}
