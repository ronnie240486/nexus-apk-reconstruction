package androidx.media;

import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;
import p000.C0453Gy;
import p000.C0580Iy;
import p000.C0643Jy;
import p000.C0708Ky;
import p000.C0709Kz;
import p000.C0773Ly;
import p000.C0836My;
import p000.C0899Ny;
import p000.C0963Oy;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
class MediaBrowserServiceCompatApi21 {

    public static class BrowserRoot {
        final Bundle mExtras;
        final String mRootId;

        public BrowserRoot(String str, Bundle bundle) {
            this.mRootId = str;
            this.mExtras = bundle;
        }
    }

    public static class MediaBrowserServiceAdaptor extends MediaBrowserService {
        final ServiceCompatProxy mServiceProxy;

        public MediaBrowserServiceAdaptor(Context context, ServiceCompatProxy serviceCompatProxy) {
            attachBaseContext(context);
            this.mServiceProxy = serviceCompatProxy;
        }

        @Override // android.service.media.MediaBrowserService
        public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            BrowserRoot browserRootOnGetRoot = this.mServiceProxy.onGetRoot(str, i, bundle == null ? null : new Bundle(bundle));
            if (browserRootOnGetRoot == null) {
                return null;
            }
            return new MediaBrowserService.BrowserRoot(browserRootOnGetRoot.mRootId, browserRootOnGetRoot.mExtras);
        }

        @Override // android.service.media.MediaBrowserService
        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
            this.mServiceProxy.onLoadChildren(str, new ResultWrapper<>(result));
        }
    }

    public static class ResultWrapper<T> {
        MediaBrowserService.Result mResultObj;

        public ResultWrapper(MediaBrowserService.Result result) {
            this.mResultObj = result;
        }

        public void detach() {
            C0963Oy.m4349a(this.mResultObj);
        }

        public List<MediaBrowser.MediaItem> parcelListToItemList(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add(C0899Ny.m4070a().createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void sendResult(T t) {
            if (t instanceof List) {
                C0836My.m3903a(this.mResultObj, parcelListToItemList((List) t));
                return;
            }
            if (!(t instanceof Parcel)) {
                C0836My.m3903a(this.mResultObj, null);
                return;
            }
            Parcel parcel = (Parcel) t;
            parcel.setDataPosition(0);
            C0836My.m3903a(this.mResultObj, C0899Ny.m4070a().createFromParcel(parcel));
            parcel.recycle();
        }
    }

    public interface ServiceCompatProxy {
        BrowserRoot onGetRoot(String str, int i, Bundle bundle);

        void onLoadChildren(String str, ResultWrapper<List<Parcel>> resultWrapper);
    }

    private MediaBrowserServiceCompatApi21() {
    }

    public static Object createService(Context context, ServiceCompatProxy serviceCompatProxy) {
        return new MediaBrowserServiceAdaptor(context, serviceCompatProxy);
    }

    public static void notifyChildrenChanged(Object obj, String str) {
        C0773Ly.m3635a(C0453Gy.m2226a(obj), str);
    }

    public static IBinder onBind(Object obj, Intent intent) {
        return C0708Ky.m3346a(C0453Gy.m2226a(obj), intent);
    }

    public static void onCreate(Object obj) {
        C0580Iy.m2886a(C0453Gy.m2226a(obj));
    }

    public static void setSessionToken(Object obj, Object obj2) {
        C0643Jy.m3048a(C0453Gy.m2226a(obj), C0709Kz.m3347a(obj2));
    }
}
