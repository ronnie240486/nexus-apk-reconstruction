package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import p000.C1607Yz;
import p000.C4855nA;
import p000.C4920oA;
import p000.C5161pA;
import p000.C5224qA;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
class MediaControllerCompatApi24 {

    public static class TransportControls {
        private TransportControls() {
        }

        public static void prepare(Object obj) {
            C4855nA.m22311a(C1607Yz.m8260a(obj));
        }

        public static void prepareFromMediaId(Object obj, String str, Bundle bundle) {
            C4920oA.m22608a(C1607Yz.m8260a(obj), str, bundle);
        }

        public static void prepareFromSearch(Object obj, String str, Bundle bundle) {
            C5224qA.m27625a(C1607Yz.m8260a(obj), str, bundle);
        }

        public static void prepareFromUri(Object obj, Uri uri, Bundle bundle) {
            C5161pA.m27411a(C1607Yz.m8260a(obj), uri, bundle);
        }
    }

    private MediaControllerCompatApi24() {
    }
}
